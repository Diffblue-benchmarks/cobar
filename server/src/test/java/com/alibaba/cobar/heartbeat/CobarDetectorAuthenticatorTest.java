package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.net.NIOProcessor;
import com.alibaba.cobar.net.mysql.HandshakePacket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.channels.SocketChannel;

public class CobarDetectorAuthenticatorTest
{
    @Test public void testHandle() throws Exception
    {
        CobarDetector detector = new CobarDetector(SocketChannel.open());
        NIOProcessor processor = new NIOProcessor("processor name");
        detector.setProcessor(processor);

        CobarDetectorAuthenticator authenticator = new CobarDetectorAuthenticator(detector);
        byte[] data = new byte[16];
        data[13] = 123; // server charset index

        // act
        authenticator.handle(data);

        Assert.assertEquals(0, processor.getNetInBytes());
        Assert.assertEquals(0, processor.getNetOutBytes());
    }
}
