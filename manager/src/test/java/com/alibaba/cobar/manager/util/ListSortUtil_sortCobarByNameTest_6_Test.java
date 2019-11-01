package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import com.alibaba.cobar.manager.util.ListSortUtil;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_sortCobarByNameTest_6_Test {
  @Test
  public void sortCobarByNameTest() throws Exception {
    // Arrange
    ArrayList<CobarDO> arrayList = new ArrayList<CobarDO>();
    arrayList.add(new CobarDO());

    // Act
    ListSortUtil.sortCobarByName(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
