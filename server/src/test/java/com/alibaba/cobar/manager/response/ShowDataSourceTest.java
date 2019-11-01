package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowDataSource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowDataSourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f712ec7eaa64b18e() {

    // Act, creating object to test constructor
    final ShowDataSource actual = new ShowDataSource();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullNotNullOutputNullPointerException999cfdc7dd58c8b61fd() {

    // Arrange
    final ManagerConnection arg0 = null;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    ShowDataSource.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
