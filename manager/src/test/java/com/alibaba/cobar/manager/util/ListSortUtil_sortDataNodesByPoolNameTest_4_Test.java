package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataNodesStatus;
import com.alibaba.cobar.manager.util.ListSortUtil;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_sortDataNodesByPoolNameTest_4_Test {
  @Test
  public void sortDataNodesByPoolNameTest() throws Exception {
    // Arrange
    ArrayList<DataNodesStatus> arrayList = new ArrayList<DataNodesStatus>();
    arrayList.add(new DataNodesStatus());

    // Act
    ListSortUtil.sortDataNodesByPoolName(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
