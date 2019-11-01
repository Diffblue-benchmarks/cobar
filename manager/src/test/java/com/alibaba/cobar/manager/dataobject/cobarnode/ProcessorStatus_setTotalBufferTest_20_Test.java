package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ProcessorStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessorStatus_setTotalBufferTest_20_Test {
  @Test
  public void setTotalBufferTest() throws Exception {
    // Arrange
    ProcessorStatus processorStatus = new ProcessorStatus();
    long totalBuffer = 1L;

    // Act
    processorStatus.setTotalBuffer(totalBuffer);

    // Assert
    long requestCount = processorStatus.getRequestCount();
    long totalBuffer1 = processorStatus.getTotalBuffer();
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
    Assert.assertEquals(1L, totalBuffer1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
