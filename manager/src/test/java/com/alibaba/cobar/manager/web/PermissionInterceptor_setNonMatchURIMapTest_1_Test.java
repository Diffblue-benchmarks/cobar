package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.PermissionInterceptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionInterceptor_setNonMatchURIMapTest_1_Test {
  @Test
  public void setNonMatchURIMapTest() throws Exception {
    // Arrange
    PermissionInterceptor permissionInterceptor = new PermissionInterceptor();
    HashMap<String, Set<String>> hashMap = new HashMap<String, Set<String>>();
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("aaaaa");
    hashMap.put("aaaaa", hashSet);

    // Act
    permissionInterceptor.setNonMatchURIMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Set<String> getResult = hashMap.get("aaaaa");
    Assert.assertSame(hashSet, getResult);
    Assert.assertTrue(getResult instanceof HashSet);
    Assert.assertSame(hashSet, getResult);
    Assert.assertNotNull(permissionInterceptor.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
