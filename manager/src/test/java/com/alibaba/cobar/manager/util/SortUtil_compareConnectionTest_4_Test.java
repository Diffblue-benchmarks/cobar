package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.cobarnode.ConnectionStatus;
import com.alibaba.cobar.manager.util.SortUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SortUtil_compareConnectionTest_4_Test {
  @Test
  public void compareConnectionTest() throws Exception {
    // Arrange
    SortUtil<Object> sortUtil = new SortUtil<Object>();
    ConnectionStatus connectionStatus = new ConnectionStatus();
    ConnectionStatus connectionStatus1 = new ConnectionStatus();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sortUtil.compareConnection(connectionStatus, connectionStatus1);
    int channel = connectionStatus.getChannel();
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
    long netOut = connectionStatus.getNetOut();
    int sendQueue = connectionStatus.getSendQueue();
    Assert.assertEquals(0, channel);
    Assert.assertEquals(0L, connectionStatus.getAliveTime());
    Assert.assertEquals(0, sendQueue);
    Assert.assertEquals(0L, netOut);
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
    Assert.assertNotNull(toStringResult);
    int channel1 = connectionStatus1.getChannel();
    String toStringResult1 = connectionStatus1.toString();
    String processor1 = connectionStatus1.getProcessor();
    int attempsCount1 = connectionStatus1.getAttempsCount();
    int port1 = connectionStatus1.getPort();
    long netIn1 = connectionStatus1.getNetIn();
    long id1 = connectionStatus1.getId();
    int local_port1 = connectionStatus1.getLocal_port();
    String host1 = connectionStatus1.getHost();
    int recvBuffer1 = connectionStatus1.getRecvBuffer();
    String schema1 = connectionStatus1.getSchema();
    long sampleTimeStamp1 = connectionStatus1.getSampleTimeStamp();
    String charset1 = connectionStatus1.getCharset();
    long netOut1 = connectionStatus1.getNetOut();
    int sendQueue1 = connectionStatus1.getSendQueue();
    Assert.assertEquals(0, channel1);
    Assert.assertEquals(0L, connectionStatus1.getAliveTime());
    Assert.assertEquals(0, sendQueue1);
    Assert.assertEquals(0L, netOut1);
    Assert.assertEquals(null, charset1);
    Assert.assertEquals(0L, sampleTimeStamp1);
    Assert.assertEquals(null, schema1);
    Assert.assertEquals(0, recvBuffer1);
    Assert.assertEquals(null, host1);
    Assert.assertEquals(0, local_port1);
    Assert.assertEquals(0L, id1);
    Assert.assertEquals(0L, netIn1);
    Assert.assertEquals(0, port1);
    Assert.assertEquals(0, attempsCount1);
    Assert.assertEquals(null, processor1);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(sortUtil.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
