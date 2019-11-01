package com.alibaba.cobar.parser.ast.stmt.ddl;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropTableStatement.Mode;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropTableStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class DDLDropTableStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9994fc86b5ca0d6dba0() {

    // Arrange
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement thisObj = new DDLDropTableStatement(arrayList, true, true);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullTrueTrueUndefOutputNotNull999aaedafcba2666d2e() {

    // Arrange
    final ArrayList<Identifier> arg0 = new ArrayList<Identifier>();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    arg0.add(identifier);
    final boolean arg1 = true;
    final boolean arg2 = true;
    final DDLDropTableStatement.Mode arg3 = DDLDropTableStatement.Mode.UNDEF;

    // Act, creating object to test constructor
    final DDLDropTableStatement actual = new DDLDropTableStatement(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isIfExists());
    Assert.assertEquals(DDLDropTableStatement.Mode.UNDEF, actual.getMode());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("AAKAA", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("AAAAA", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isTemp());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullTrueTrueOutputNotNull999d851537cd89c3434() {

    // Arrange
    final ArrayList<Identifier> arg0 = new ArrayList<Identifier>();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    arg0.add(identifier);
    final boolean arg1 = true;
    final boolean arg2 = true;

    // Act, creating object to test constructor
    final DDLDropTableStatement actual = new DDLDropTableStatement(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isIfExists());
    Assert.assertEquals(DDLDropTableStatement.Mode.UNDEF, actual.getMode());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("AAKAA", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("AAAAA", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isTemp());

  }

  // Test written by Diffblue Cover
  @Test
  public void getModeOutputUndef9997b975a717b98ef2e() {

    // Arrange
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement thisObj = new DDLDropTableStatement(arrayList, true, true);

    // Act
    final DDLDropTableStatement.Mode actual = thisObj.getMode();

    // Assert result
    Assert.assertEquals(DDLDropTableStatement.Mode.UNDEF, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableNamesOutput19994b9b3f8631198525() {

    // Arrange
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement thisObj = new DDLDropTableStatement(arrayList, true, true);

    // Act
    final List<Identifier> actual = thisObj.getTableNames();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals("AAAAA", actual.get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.get(0).getParent());
    Assert.assertEquals("AAAAA", actual.get(0).getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.get(0).getParent().getParent());
    Assert.assertEquals("aaaaa", actual.get(0).getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.get(0).getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void isIfExistsOutputTrue9995a7395d7b526149f() {

    // Arrange
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement thisObj = new DDLDropTableStatement(arrayList, true, true);

    // Act
    final boolean actual = thisObj.isIfExists();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isTempOutputTrue99916681eae25fb0862() {

    // Arrange
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement thisObj = new DDLDropTableStatement(arrayList, true, true);

    // Act
    final boolean actual = thisObj.isTemp();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputCascade999747afe529493f1b3() {

    // Arrange
    final String arg0 = "CASCADE";

    // Act
    final DDLDropTableStatement.Mode actual = DDLDropTableStatement.Mode.valueOf(arg0);

    // Assert result
    Assert.assertEquals(DDLDropTableStatement.Mode.CASCADE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999de30ed3e65bf4568() {

    // Act
    final DDLDropTableStatement.Mode[] actual = DDLDropTableStatement.Mode.values();

    // Assert result
    Assert.assertArrayEquals(new DDLDropTableStatement.Mode[]{ DDLDropTableStatement.Mode.UNDEF, DDLDropTableStatement.Mode.RESTRICT, DDLDropTableStatement.Mode.CASCADE }, actual);

  }
}
