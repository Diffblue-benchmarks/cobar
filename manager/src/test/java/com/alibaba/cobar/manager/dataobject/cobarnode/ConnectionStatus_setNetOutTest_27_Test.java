package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ConnectionStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConnectionStatus_setNetOutTest_27_Test {
  @Test
  public void setNetOutTest() throws Exception {
    // Arrange
    ConnectionStatus connectionStatus = new ConnectionStatus();
    long netOut = 1L;

    // Act
    connectionStatus.setNetOut(netOut);

    // Assert
    String toStringResult = connectionStatus.toString();
    String processor = connectionStatus.getProcessor();
    int attempsCount = connectionStatus.getAttempsCount();
    int port = connectionStatus.getPort();
    long netIn = connectionStatus.getNetIn();
    long id = connectionStatus.getId();
    int local_port = connectionStatus.getLocal_port();
    String host = connectionStatus.getHost();
    int recvBuffer = connectionStatus.getRecvBuffer();
    String schema = connectionStatus.getSchema();
    long sampleTimeStamp = connectionStatus.getSampleTimeStamp();
    String charset = connectionStatus.getCharset();
    long netOut1 = connectionStatus.getNetOut();
    int sendQueue = connectionStatus.getSendQueue();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0L, connectionStatus.getAliveTime());
    Assert.assertEquals(0, sendQueue);
    Assert.assertEquals(1L, netOut1);
    Assert.assertEquals(null, charset);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, schema);
    Assert.assertEquals(0, recvBuffer);
    Assert.assertEquals(null, host);
    Assert.assertEquals(0, local_port);
    Assert.assertEquals(0L, id);
    Assert.assertEquals(0L, netIn);
    Assert.assertEquals(0, port);
    Assert.assertEquals(0, attempsCount);
    Assert.assertEquals(null, processor);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
