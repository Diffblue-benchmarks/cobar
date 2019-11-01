package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.RollbackConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RollbackConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f4dd7fa00f4860a2() {

    // Act, creating object to test constructor
    final RollbackConfig actual = new RollbackConfig();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void executeInputNullOutputNoClassDefFoundError9995b32c5d4e7761964() {
//
//    // Arrange
//    final ManagerConnection arg0 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    RollbackConfig.execute(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
