package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowIndex.Type;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowIndex;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ShowIndexTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9990004deb3bbbb9b83() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowIndex thisObj = new ShowIndex(ShowIndex.Type.INDEX, identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputIndexNotNullNotNullOutputNotNull9998d21fc7fa04cd8e5() {

    // Arrange
    final ShowIndex.Type arg0 = ShowIndex.Type.INDEX;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final Identifier arg2 = identifier;

    // Act, creating object to test constructor
    final ShowIndex actual = new ShowIndex(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAK", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getTable().getIdText());
    Assert.assertEquals(ShowIndex.Type.INDEX, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputIndexNotNullOutputNotNull99922558c510e82ff08() {

    // Arrange
    final ShowIndex.Type arg0 = ShowIndex.Type.INDEX;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");

    // Act, creating object to test constructor
    final ShowIndex actual = new ShowIndex(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAK", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getTable().getIdText());
    Assert.assertEquals(ShowIndex.Type.INDEX, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull999a61c1791a1a1c325() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowIndex thisObj = new ShowIndex(ShowIndex.Type.INDEX, identifier);

    // Act
    final Identifier actual = thisObj.getTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AKAAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("akaaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputIndex9999e28672701606667() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowIndex thisObj = new ShowIndex(ShowIndex.Type.INDEX, identifier);

    // Act
    final ShowIndex.Type actual = thisObj.getType();

    // Assert result
    Assert.assertEquals(ShowIndex.Type.INDEX, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999e09144f1b3620a61() {

    // Act
    final ShowIndex.Type[] actual = ShowIndex.Type.values();

    // Assert result
    Assert.assertArrayEquals(new ShowIndex.Type[]{ ShowIndex.Type.INDEX, ShowIndex.Type.INDEXES, ShowIndex.Type.KEYS }, actual);

  }
}
