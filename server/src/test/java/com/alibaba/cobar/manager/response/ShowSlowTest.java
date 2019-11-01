package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowSlow;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowSlowTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99943c7333c544f41a8() {

    // Act, creating object to test constructor
    final ShowSlow actual = new ShowSlow();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void dataNodeInputNullNotNullOutputNullPointerException999a004b74075e397c6() {

    // Arrange
    final ManagerConnection arg0 = null;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    ShowSlow.dataNode(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void schemaInputNullNotNullOutputNullPointerException999c79ab7d7a77d3a27() {

    // Arrange
    final ManagerConnection arg0 = null;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    ShowSlow.schema(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
