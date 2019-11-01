package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.ListSortUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_sortDataNodesMapByPoolNameTest_5_Test {
  @Test
  public void sortDataNodesMapByPoolNameTest() throws Exception {
    // Arrange
    ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
    HashMap<String, Object> hashMap = new HashMap<String, Object>();
    hashMap.put("aaaaa", "aaaaa");
    arrayList.add(hashMap);

    // Act
    ListSortUtil.sortDataNodesMapByPoolName(arrayList);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
