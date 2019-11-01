package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDAOImple_setPropertyTest_3_Test {
  @Test
  public void setPropertyTest() throws Exception {
    // Arrange
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();
    PropertyDO propertyDO = new PropertyDO();

    // Act
    propertyDAOImple.setProperty(propertyDO);

    // Assert
    List<Integer> stopTimes = propertyDO.getStopTimes();
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals("", propertyDO.toString());
    Assert.assertEquals(0, stopTimes.size());
    PropertyDO property = propertyDAOImple.getProperty();
    Assert.assertSame(propertyDO, property);
    Assert.assertNotNull(propertyDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
