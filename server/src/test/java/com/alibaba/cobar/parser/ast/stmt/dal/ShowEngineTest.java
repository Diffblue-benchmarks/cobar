package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.stmt.dal.ShowEngine.Type;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowEngine;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowEngineTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9990ded6ff97b5a9c01() {

    // Arrange
    final ShowEngine thisObj = new ShowEngine(ShowEngine.Type.INNODB_STATUS);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputInnodb_statusOutputNotNull999326fc6a5c1ca37ff() {

    // Arrange
    final ShowEngine.Type arg0 = ShowEngine.Type.INNODB_STATUS;

    // Act, creating object to test constructor
    final ShowEngine actual = new ShowEngine(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(ShowEngine.Type.INNODB_STATUS, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputInnodb_status999197d6c3ae36e4769() {

    // Arrange
    final ShowEngine thisObj = new ShowEngine(ShowEngine.Type.INNODB_STATUS);

    // Act
    final ShowEngine.Type actual = thisObj.getType();

    // Assert result
    Assert.assertEquals(ShowEngine.Type.INNODB_STATUS, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputInnodb_mutex999b3b84587e33db325() {

    // Arrange
    final String arg0 = "INNODB_MUTEX";

    // Act
    final ShowEngine.Type actual = ShowEngine.Type.valueOf(arg0);

    // Assert result
    Assert.assertEquals(ShowEngine.Type.INNODB_MUTEX, actual);

  }
}
