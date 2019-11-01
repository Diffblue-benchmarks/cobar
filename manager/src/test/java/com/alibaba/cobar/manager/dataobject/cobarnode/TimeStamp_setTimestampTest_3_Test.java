package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.TimeStamp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeStamp_setTimestampTest_3_Test {
//failed_pass   @Test
//  public void setTimestampTest() throws Exception {
//    // Arrange
//    TimeStamp timeStamp = new TimeStamp();
//    long timestamp = 1L;
//
//    // Act
//    timeStamp.setTimestamp(timestamp);
//
//    // Assert
//    String toStringResult = timeStamp.toString();
//    long timestamp1 = timeStamp.getTimestamp();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("1970-01-01 00:00:00", timeStamp.getFormatTime());
//    Assert.assertEquals(1L, timestamp1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
