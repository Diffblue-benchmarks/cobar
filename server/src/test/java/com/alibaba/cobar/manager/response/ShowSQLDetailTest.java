package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowSQLDetail;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowSQLDetailTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dbe9426827550e8a() {

    // Act, creating object to test constructor
    final ShowSQLDetail actual = new ShowSQLDetail();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullPositiveOutputNullPointerException999616b19c4894a7e0a() {

    // Arrange
    final ManagerConnection arg0 = null;
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    ShowSQLDetail.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
