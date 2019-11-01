package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDO_toStringTest_3_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    PropertyDO propertyDO = new PropertyDO();

    // Act
    String actual = propertyDO.toString();

    // Assert
    Assert.assertEquals("", actual);
    Assert.assertEquals("", propertyDO.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
