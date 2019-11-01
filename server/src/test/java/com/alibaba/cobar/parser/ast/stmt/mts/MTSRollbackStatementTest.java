package com.alibaba.cobar.parser.ast.stmt.mts;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSRollbackStatement.CompleteType;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSRollbackStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MTSRollbackStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputChain9998899941ea8914420() {

    // Arrange
    final String arg0 = "CHAIN";

    // Act
    final CompleteType actual = CompleteType.valueOf(arg0);

    // Assert result
    Assert.assertEquals(CompleteType.CHAIN, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput599920200044d6802825() {

    // Act
    final CompleteType[] actual = CompleteType.values();

    // Assert result
    Assert.assertArrayEquals(new CompleteType[]{ CompleteType.UN_DEF, CompleteType.CHAIN, CompleteType.NO_CHAIN, CompleteType.RELEASE, CompleteType.NO_RELEASE }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9998b35e2983c86c1a1() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "complete type is null!");
    final Identifier identifier1 = new Identifier(identifier2, "complete type is null!");
    final Identifier identifier = new Identifier(identifier1, "complete type is null!");
    final MTSRollbackStatement thisObj = new MTSRollbackStatement(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999de0eb38539dbb5db() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "complete type is null!");
    final Identifier identifier = new Identifier(identifier1, "complete type is null!");
    final Identifier arg0 = new Identifier(identifier, "complete type is null!");

    // Act, creating object to test constructor
    final MTSRollbackStatement actual = new MTSRollbackStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCompleteType());
    Assert.assertNotNull(actual.getSavepoint());
    Assert.assertEquals("COMPLETE TYPE IS NULL!", actual.getSavepoint().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSavepoint().getParent());
    Assert.assertEquals("COMPLETE TYPE IS NULL!", actual.getSavepoint().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSavepoint().getParent().getParent());
    Assert.assertEquals("COMPLETE TYPE IS NULL!", actual.getSavepoint().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSavepoint().getParent().getParent().getParent());
    Assert.assertEquals("complete type is null!", actual.getSavepoint().getParent().getParent().getIdText());
    Assert.assertEquals("complete type is null!", actual.getSavepoint().getParent().getIdText());
    Assert.assertEquals("complete type is null!", actual.getSavepoint().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputUn_defOutputNotNull999af9ad7386de50eea() {

    // Arrange
    final CompleteType arg0 = CompleteType.UN_DEF;

    // Act, creating object to test constructor
    final MTSRollbackStatement actual = new MTSRollbackStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(CompleteType.UN_DEF, actual.getCompleteType());
    Assert.assertNull(actual.getSavepoint());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCompleteTypeOutputVoid999a1ae454302c54c07() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "complete type is null!");
    final Identifier identifier1 = new Identifier(identifier2, "complete type is null!");
    final Identifier identifier = new Identifier(identifier1, "complete type is null!");
    final MTSRollbackStatement thisObj = new MTSRollbackStatement(identifier);

    // Act
    final CompleteType actual = thisObj.getCompleteType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSavepointOutputNotNull9994240b8119f5f8caa() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "complete type is null!");
    final Identifier identifier1 = new Identifier(identifier2, "complete type is null!");
    final Identifier identifier = new Identifier(identifier1, "complete type is null!");
    final MTSRollbackStatement thisObj = new MTSRollbackStatement(identifier);

    // Act
    final Identifier actual = thisObj.getSavepoint();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("COMPLETE TYPE IS NULL!", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("COMPLETE TYPE IS NULL!", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("COMPLETE TYPE IS NULL!", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("complete type is null!", actual.getParent().getParent().getIdText());
    Assert.assertEquals("complete type is null!", actual.getParent().getIdText());
    Assert.assertEquals("complete type is null!", actual.getIdText());

  }
}
