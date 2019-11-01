package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PropertyDAOImple_addTimeTest_6_Test {
  @Test
  public void addTimeTest() throws Exception {
    // Arrange
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();
    int time = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    propertyDAOImple.addTime(time);
    PropertyDO property = propertyDAOImple.getProperty();
    String toStringResult = propertyDAOImple.toString();
    List<Integer> stopTimes = property.getStopTimes();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("1", property.toString());
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals(1, stopTimes.size());
    Assert.assertEquals(Integer.valueOf(1), stopTimes.get(0));
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
