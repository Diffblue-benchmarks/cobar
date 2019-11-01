package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ReloadConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReloadConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99950ca4defa0de09a1() {

    // Act, creating object to test constructor
    final ReloadConfig actual = new ReloadConfig();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void executeInputNullOutputNoClassDefFoundError999f4d4fca40edb55a6() {
//
//    // Arrange
//    final ManagerConnection arg0 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    ReloadConfig.execute(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
