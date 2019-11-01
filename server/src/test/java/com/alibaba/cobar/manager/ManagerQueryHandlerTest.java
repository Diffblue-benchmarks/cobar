package com.alibaba.cobar.manager;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.ManagerQueryHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerQueryHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull9991440b76d89917591() {

    // Arrange
    final ManagerConnection arg0 = null;

    // Act, creating object to test constructor
    final ManagerQueryHandler actual = new ManagerQueryHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void queryInputNotNullOutputNullPointerException999a9c034e9115bd0ca() {

    // Arrange
    final ManagerQueryHandler thisObj = new ManagerQueryHandler(null);
    final String arg0 = "Unsupported statement";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.query(arg0);

    // The method is not expected to return due to exception thrown

  }
}
