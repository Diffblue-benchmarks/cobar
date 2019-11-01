package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ProcessorStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessorStatus_setBc_countTest_16_Test {
  @Test
  public void setBc_countTest() throws Exception {
    // Arrange
    ProcessorStatus processorStatus = new ProcessorStatus();
    long bc_count = 1L;

    // Act
    processorStatus.setBc_count(bc_count);

    // Assert
    long requestCount = processorStatus.getRequestCount();
    long totalBuffer = processorStatus.getTotalBuffer();
    String toStringResult = processorStatus.toString();
    long bc_count1 = processorStatus.getBc_count();
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
    Assert.assertEquals(1L, bc_count1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0L, totalBuffer);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
