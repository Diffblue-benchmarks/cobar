package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowBackend;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowBackendTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99938ccdc8c44ae7288() {

    // Act, creating object to test constructor
    final ShowBackend actual = new ShowBackend();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullOutputNullPointerException99999774dd6d22a4cc7() {

    // Arrange
    final ManagerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ShowBackend.execute(arg0);

    // The method is not expected to return due to exception thrown

  }
}
