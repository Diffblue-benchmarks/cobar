package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.cobarnode.ConnectionStatus;
import com.alibaba.cobar.manager.util.ListSortUtil;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_sortConnectionsTest_2_Test {
  @Test
  public void sortConnectionsTest() throws Exception {
    // Arrange
    ArrayList<ConnectionStatus> arrayList = new ArrayList<ConnectionStatus>();
    arrayList.add(new ConnectionStatus());

    // Act
    ListSortUtil.sortConnections(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
