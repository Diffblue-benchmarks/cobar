package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDAOImple_getPropertyTest_4_Test {
  @Test
  public void getPropertyTest() throws Exception {
    // Arrange
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();

    // Act
    PropertyDO actual = propertyDAOImple.getProperty();

    // Assert
    List<Integer> stopTimes = actual.getStopTimes();
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals("", actual.toString());
    Assert.assertEquals(0, stopTimes.size());
    PropertyDO property = propertyDAOImple.getProperty();
    Assert.assertSame(actual, property);
    Assert.assertNotNull(propertyDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
