package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import com.alibaba.cobar.manager.util.ListSortUtil;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_sortClusterByNameTest_7_Test {
  @Test
  public void sortClusterByNameTest() throws Exception {
    // Arrange
    ArrayList<ClusterDO> arrayList = new ArrayList<ClusterDO>();
    arrayList.add(new ClusterDO());

    // Act
    ListSortUtil.sortClusterByName(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
