package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.dao.delegate.CobarAdapter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AdapterDelegate_getCobarNodeAdapterInternalTest_8_Test {
  @Test
  public void getCobarNodeAdapterInternalTest() throws Exception {
    // Arrange
    AdapterDelegate adapterDelegate = new AdapterDelegate();
    String ip = "aaaaa";
    int port = 1;
    String user = "aaaaa";
    String password = "aaaaa";

    // Act and Assert
    thrown.expect(RuntimeException.class);
    adapterDelegate.getCobarNodeAdapterInternal(ip, port, user, password);
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
