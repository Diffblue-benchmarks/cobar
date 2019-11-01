package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ProcessorStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessorStatus_setFreeBufferTest_15_Test {
  @Test
  public void setFreeBufferTest() throws Exception {
    // Arrange
    ProcessorStatus processorStatus = new ProcessorStatus();
    long freeBuffer = 1L;

    // Act
    processorStatus.setFreeBuffer(freeBuffer);

    // Assert
    long requestCount = processorStatus.getRequestCount();
    long totalBuffer = processorStatus.getTotalBuffer();
    String toStringResult = processorStatus.toString();
    long bc_count = processorStatus.getBc_count();
    String processorId = processorStatus.getProcessorId();
    long sampleTimeStamp = processorStatus.getSampleTimeStamp();
    long freeBuffer1 = processorStatus.getFreeBuffer();
    int connections = processorStatus.getConnections();
    long netOut = processorStatus.getNetOut();
    Assert.assertEquals(0L, requestCount);
    Assert.assertEquals(0L, processorStatus.getNetIn());
    Assert.assertEquals(0L, netOut);
    Assert.assertEquals(0, connections);
    Assert.assertEquals(1L, freeBuffer1);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, processorId);
    Assert.assertEquals(0L, bc_count);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0L, totalBuffer);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
