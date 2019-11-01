package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDO_getStopTimesTest_2_Test {
  @Test
  public void getStopTimesTest() throws Exception {
    // Arrange
    PropertyDO propertyDO = new PropertyDO();

    // Act
    List<Integer> actual = propertyDO.getStopTimes();

    // Assert
    Assert.assertTrue(actual instanceof ArrayList);
    Assert.assertEquals(0, actual.size());
    List<Integer> stopTimes = propertyDO.getStopTimes();
    Assert.assertSame(actual, stopTimes);
    Assert.assertEquals("", propertyDO.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
