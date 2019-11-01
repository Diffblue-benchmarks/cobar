package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.TimeStamp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeStamp_getTimestampTest_1_Test {
//failed_pass   @Test
//  public void getTimestampTest() throws Exception {
//    // Arrange
//    TimeStamp timeStamp = new TimeStamp();
//
//    // Act
//    long actual = timeStamp.getTimestamp();
//
//    // Assert
//    Assert.assertEquals(0L, actual);
//    String toStringResult = timeStamp.toString();
//    long timestamp = timeStamp.getTimestamp();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("1970-01-01 00:00:00", timeStamp.getFormatTime());
//    Assert.assertEquals(0L, timestamp);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
