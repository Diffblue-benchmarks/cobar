package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseRollback;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseRollbackTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998236ad2d526c33bc() {

    // Act, creating object to test constructor
    final ManagerParseRollback actual = new ManagerParseRollback();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative999d1893b478eb10db0() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseRollback.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void rollback2CCheckInputNotNullPositiveOutputNegative999200f6ccad0bb5cd3() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseRollback.rollback2CCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void rollback2CheckInputNotNullPositiveOutputNegative99905c861d68fa30830() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseRollback.rollback2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void rollback2RCheckInputNotNullPositiveOutputNegative999689b0d74dd4408ac() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseRollback.rollback2RCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void rollback2UCheckInputNotNullPositiveOutputNegative999472005b27a375208() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseRollback.rollback2UCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
