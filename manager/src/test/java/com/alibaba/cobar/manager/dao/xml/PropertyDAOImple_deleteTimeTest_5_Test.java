package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDAOImple_deleteTimeTest_5_Test {
  @Test
  public void deleteTimeTest() throws Exception {
    // Arrange
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();
    int time = 1;

    // Act
    boolean actual = propertyDAOImple.deleteTime(time);

    // Assert
    Assert.assertFalse(actual);
    PropertyDO property = propertyDAOImple.getProperty();
    String toStringResult = propertyDAOImple.toString();
    List<Integer> stopTimes = property.getStopTimes();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", property.toString());
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals(0, stopTimes.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
