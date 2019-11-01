package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDO_PropertyDOTest_1_Test {
  @Test
  public void PropertyDOTest() throws Exception {
    // Arrange and Act
    PropertyDO propertyDO = new PropertyDO();

    // Assert
    List<Integer> stopTimes = propertyDO.getStopTimes();
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals("", propertyDO.toString());
    Assert.assertEquals(0, stopTimes.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
