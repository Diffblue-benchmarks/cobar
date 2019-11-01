package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.SQLEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SQLEquals_appendToTest_4_Test {
//failed_compile   @Test
//  public void appendToTest() throws Exception {
//    // Arrange
//    SQLEquals sQLEquals = new SQLEquals("aaaaa");
//    StringBuffer stringBuffer = new StringBuffer();
//
//    // Act
//    sQLEquals.appendTo(stringBuffer);
//
//    // Assert
//    char[] value = stringBuffer.getValue();
//    int capacityResult = stringBuffer.capacity();
//    String toStringResult = stringBuffer.toString();
//    Assert.assertEquals(34, value.length);
//    Assert.assertEquals('S', value[0]);
//    Assert.assertEquals('Q', value[1]);
//    Assert.assertEquals('L', value[2]);
//    Assert.assertEquals('\u0000', value[31]);
//    Assert.assertEquals('\u0000', value[32]);
//    Assert.assertEquals('\u0000', value[33]);
//    Assert.assertEquals(18, stringBuffer.length());
//    Assert.assertEquals("SQLEquals(\"aaaaa\")", toStringResult);
//    Assert.assertEquals(34, capacityResult);
//    String toStringResult1 = sQLEquals.toString();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(0, sQLEquals.getLength());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
