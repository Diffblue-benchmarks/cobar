package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ProcessorStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessorStatus_getProcessorIdTest_18_Test {
  @Test
  public void getProcessorIdTest() throws Exception {
    // Arrange
    ProcessorStatus processorStatus = new ProcessorStatus();

    // Act
    String actual = processorStatus.getProcessorId();

    // Assert
    Assert.assertEquals(null, actual);
    long requestCount = processorStatus.getRequestCount();
    long totalBuffer = processorStatus.getTotalBuffer();
    String toStringResult = processorStatus.toString();
    long bc_count = processorStatus.getBc_count();
    String processorId = processorStatus.getProcessorId();
    long sampleTimeStamp = processorStatus.getSampleTimeStamp();
    long freeBuffer = processorStatus.getFreeBuffer();
    int connections = processorStatus.getConnections();
    long netOut = processorStatus.getNetOut();
    Assert.assertEquals(0L, requestCount);
    Assert.assertEquals(0L, processorStatus.getNetIn());
    Assert.assertEquals(0L, netOut);
    Assert.assertEquals(0, connections);
    Assert.assertEquals(0L, freeBuffer);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, processorId);
    Assert.assertEquals(0L, bc_count);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0L, totalBuffer);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
