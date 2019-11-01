package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class VipDO_idsStringTest_4_Test {
  @Test
  public void idsStringTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    vipDO.idsString();
    String sid = vipDO.getSid();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema = vipDO.getSchema();
    Assert.assertEquals(null, sid);
    Assert.assertEquals(null, vipDO.getWeights());
    Assert.assertEquals(null, schema);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarIds);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
