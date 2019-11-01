package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowConnectionSQL;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowConnectionSQLTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99981c95e43c770a1ec() {

    // Act, creating object to test constructor
    final ShowConnectionSQL actual = new ShowConnectionSQL();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullOutputNullPointerException999ca99d102f74f1230() {

    // Arrange
    final ManagerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ShowConnectionSQL.execute(arg0);

    // The method is not expected to return due to exception thrown

  }
}
