package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.CobarNode;
import com.alibaba.cobar.config.model.CobarNodeConfig;
import com.alibaba.cobar.net.NIOHandler;
import com.alibaba.cobar.net.NIOProcessor;
import com.alibaba.cobar.net.mysql.HandshakePacket;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class CobarDetectorTest
{
    @Test public void testAuthenticate() throws Exception
    {
        CobarDetector detector = new CobarDetector(SocketChannel.open());
        NIOProcessor processor = new NIOProcessor("processor name");
        detector.setProcessor(processor);

        // act
        detector.authenticate();

        Assert.assertNull(detector.getHandshake());
        Assert.assertFalse(detector.isAuthenticated());
    }

    @Test public void testHartbeat() throws Exception
    {
        CobarDetector detector = new CobarDetector(SocketChannel.open());
        NIOProcessor processor = new NIOProcessor("processor name");
        detector.setProcessor(processor);
        detector.setAuthenticated(true);

        CobarNodeConfig config = new CobarNodeConfig("name", "host", 8080, 10);
        CobarNode node = new CobarNode(config);
        CobarHeartbeat heartbeat = new CobarHeartbeat(node);
        detector.setHeartbeat(heartbeat);

        // act
        detector.heartbeat();

        Assert.assertNull(detector.getHandshake());
        Assert.assertTrue(detector.isAuthenticated());
    }
}
