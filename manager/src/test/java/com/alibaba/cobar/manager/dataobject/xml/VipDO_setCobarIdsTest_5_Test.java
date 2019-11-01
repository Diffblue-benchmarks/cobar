package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_setCobarIdsTest_5_Test {
  @Test
  public void setCobarIdsTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();
    long[] longArray = new long[]{1L, 1L, 1L, 1L, 1L, 1L, 655361L, 1L};

    // Act
    vipDO.setCobarIds(longArray);

    // Assert
    Assert.assertEquals(8, longArray.length);
    Assert.assertArrayEquals(new long[]{1L, 1L, 1L, 1L, 1L, 1L, 655361L, 1L}, longArray);
    String sid = vipDO.getSid();
    long id = vipDO.getId();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema = vipDO.getSchema();
    Assert.assertEquals(null, sid);
    Assert.assertEquals(null, vipDO.getWeights());
    Assert.assertEquals(null, schema);
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(longArray, cobarIds);
    Assert.assertEquals(0L, id);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
