package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxParams;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class AjaxParams_appendToStringBuilderTest_9_Test {
//failed_compile   @Test
//  public void appendToStringBuilderTest() throws Exception {
//    // Arrange
//    AjaxParams ajaxParams = Whitebox.newInstance(AjaxParams.class);
//    ToStringBuilder toStringBuilder = new ToStringBuilder("aaaaa");
//
//    // Act
//    ajaxParams.appendToStringBuilder(toStringBuilder);
//
//    // Assert
//    String toStringResult = toStringBuilder.toString();
//    Object object = toStringBuilder.getObject();
//    StringBuffer stringBuffer = toStringBuilder.getStringBuffer();
//    Assert.assertNotNull(toStringResult);
//    char[] value = stringBuffer.getValue();
//    int capacityResult = stringBuffer.capacity();
//    String toStringResult1 = stringBuffer.toString();
//    Assert.assertTrue(object instanceof String);
//    Assert.assertEquals("aaaaa", object);
//    Assert.assertEquals(512, value.length);
//    Assert.assertEquals('j', value[0]);
//    Assert.assertEquals('a', value[1]);
//    Assert.assertEquals('\u0000', value[510]);
//    Assert.assertEquals('\u0000', value[511]);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(512, capacityResult);
//    Assert.assertEquals(27, stringBuffer.length());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
