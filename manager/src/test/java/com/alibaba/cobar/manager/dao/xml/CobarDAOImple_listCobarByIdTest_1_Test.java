package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDAOImple_listCobarByIdTest_1_Test {
  @Test
  public void listCobarByIdTest() throws Exception {
    // Arrange
    CobarDAOImple cobarDAOImple = new CobarDAOImple();
    long[] longArray = new long[]{1L, 1L, 1L, 1L, 1L, 1L, 655361L, 1L};

    // Act
    List<CobarDO> actual = cobarDAOImple.listCobarById(longArray);

    // Assert
    Assert.assertTrue(actual instanceof java.util.LinkedList);
    Assert.assertEquals(0, actual.size());
    Assert.assertEquals(8, longArray.length);
    Assert.assertArrayEquals(new long[]{1L, 1L, 1L, 1L, 1L, 1L, 655361L, 1L}, longArray);
    Assert.assertNotNull(cobarDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
