package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.CobarAdapterDAO;
import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AdapterDelegate_getCobarNodeAccesserTest_5_Test {
  @Test
  public void getCobarNodeAccesserTest() throws Exception {
    // Arrange
    AdapterDelegate adapterDelegate = new AdapterDelegate();
    String ip = "aaaaa";
    int port = 1;
    String user = "aaaaa";
    String password = "aaaaa";

    // Act and Assert
    thrown.expect(RuntimeException.class);
    adapterDelegate.getCobarNodeAccesser(ip, port, user, password);
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
