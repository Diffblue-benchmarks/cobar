package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ClearSlow;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ClearSlowTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990d9a556f1bb0fe2f() {

    // Act, creating object to test constructor
    final ClearSlow actual = new ClearSlow();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void dataNodeInputNullNotNullOutputNoClassDefFoundError99967b10eefb837d1e7() {
//
//    // Arrange
//    final ManagerConnection arg0 = null;
//    final String arg1 = "Invalid DataNode:";
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    ClearSlow.dataNode(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void schemaInputNullNotNullOutputNoClassDefFoundError999b1e7fa84a7448fe9() {
//
//    // Arrange
//    final ManagerConnection arg0 = null;
//    final String arg1 = "Invalid DataNode:";
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    ClearSlow.schema(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
