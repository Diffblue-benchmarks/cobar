package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ConnectionStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConnectionStatus_setRecvBufferTest_14_Test {
  @Test
  public void setRecvBufferTest() throws Exception {
    // Arrange
    ConnectionStatus connectionStatus = new ConnectionStatus();
    int recvBuffer = 1;

    // Act
    connectionStatus.setRecvBuffer(recvBuffer);

    // Assert
    int channel = connectionStatus.getChannel();
    String toStringResult = connectionStatus.toString();
    String processor = connectionStatus.getProcessor();
    int attempsCount = connectionStatus.getAttempsCount();
    int port = connectionStatus.getPort();
    long netIn = connectionStatus.getNetIn();
    long id = connectionStatus.getId();
    int local_port = connectionStatus.getLocal_port();
    String host = connectionStatus.getHost();
    int recvBuffer1 = connectionStatus.getRecvBuffer();
    String schema = connectionStatus.getSchema();
    long sampleTimeStamp = connectionStatus.getSampleTimeStamp();
    String charset = connectionStatus.getCharset();
    long netOut = connectionStatus.getNetOut();
    int sendQueue = connectionStatus.getSendQueue();
    Assert.assertEquals(0, channel);
    Assert.assertEquals(0L, connectionStatus.getAliveTime());
    Assert.assertEquals(0, sendQueue);
    Assert.assertEquals(0L, netOut);
    Assert.assertEquals(null, charset);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, schema);
    Assert.assertEquals(1, recvBuffer1);
    Assert.assertEquals(null, host);
    Assert.assertEquals(0, local_port);
    Assert.assertEquals(0L, id);
    Assert.assertEquals(0L, netIn);
    Assert.assertEquals(0, port);
    Assert.assertEquals(0, attempsCount);
    Assert.assertEquals(null, processor);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
