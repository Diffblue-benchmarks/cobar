package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowSQL;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowSQLTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dad5abd867b5484a() {

    // Act, creating object to test constructor
    final ShowSQL actual = new ShowSQL();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullPositiveOutputNullPointerException999af7e2722279575d4() {

    // Arrange
    final ManagerConnection arg0 = null;
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    ShowSQL.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
