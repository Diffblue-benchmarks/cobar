package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDO_setStopTimesTest_4_Test {
  @Test
  public void setStopTimesTest() throws Exception {
    // Arrange
    PropertyDO propertyDO = new PropertyDO();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(new Integer(1));

    // Act
    propertyDO.setStopTimes(arrayList);

    // Assert
    List<Integer> stopTimes = propertyDO.getStopTimes();
    Assert.assertSame(arrayList, stopTimes);
    Assert.assertEquals("1", propertyDO.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
