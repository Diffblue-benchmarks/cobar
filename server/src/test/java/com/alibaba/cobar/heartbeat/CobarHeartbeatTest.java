package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.CobarNode;
import com.alibaba.cobar.config.model.CobarNodeConfig;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CobarHeartbeatTest
{
    @Test public void stop1()
    {
        CobarNodeConfig config = new CobarNodeConfig("name", "host", 8080, 10);
        CobarNode node = new CobarNode(config);
        CobarHeartbeat heartbeat = new CobarHeartbeat(node);
        heartbeat.heartbeat();

        // act
        heartbeat.start();
        heartbeat.stop();

        // assert
        Assert.assertEquals(true, heartbeat.isStop());
        Assert.assertEquals(0, heartbeat.getErrorCount());
        Assert.assertEquals(-1, heartbeat.getStatus());
        Assert.assertNull(heartbeat.getDetector());
        Assert.assertEquals(-1, heartbeat.getTimeout());
    }

    @Test public void heartbeat()
    {
    }
}