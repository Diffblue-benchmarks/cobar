package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PropertyDAOImple_afterPropertiesSetTest_2_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    propertyDAOImple.afterPropertiesSet();
    PropertyDO property = propertyDAOImple.getProperty();
    String toStringResult = propertyDAOImple.toString();
    List<Integer> stopTimes = property.getStopTimes();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", property.toString());
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals(0, stopTimes.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
