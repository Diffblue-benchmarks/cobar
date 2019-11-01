package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IdentifierTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9994aeb1510c479b545() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull9996fa0f1103c6f50a1() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier arg0 = new Identifier(identifier, "ID:");
    final String arg1 = "ID:";
    final String arg2 = "ID:";

    // Act, creating object to test constructor
    final Identifier actual = new Identifier(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("ID:", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("ID:", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getParent().getParent().getIdText());
    Assert.assertEquals("ID:", actual.getParent().getParent().getIdText());
    Assert.assertEquals("ID:", actual.getParent().getIdText());
    Assert.assertEquals("ID:", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9994b687728c2c24af7() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier arg0 = new Identifier(identifier, "ID:");
    final String arg1 = "ID:";

    // Act, creating object to test constructor
    final Identifier actual = new Identifier(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("ID:", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("ID:", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getParent().getParent().getIdText());
    Assert.assertEquals("ID:", actual.getParent().getParent().getIdText());
    Assert.assertEquals("ID:", actual.getParent().getIdText());
    Assert.assertEquals("ID:", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999324139563d8fff78() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");
    final Object arg0 = "ID:";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdTextOutputNotNull999a6a64ce073fc4948() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");

    // Act
    final String actual = thisObj.getIdText();

    // Assert result
    Assert.assertEquals("ID:", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdTextUpUnescapeOutputNotNull9992824d9a1c8ff9679() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");

    // Act
    final String actual = thisObj.getIdTextUpUnescape();

    // Assert result
    Assert.assertEquals("ID:", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLevelUnescapeUpNameInputZeroOutputNotNull99977a9e04c8391a16c() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");
    final int arg0 = 0;

    // Act
    final String actual = thisObj.getLevelUnescapeUpName(arg0);

    // Assert result
    Assert.assertEquals("ID:", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getParentOutputNotNull99951cf79dd0a629095() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");

    // Act
    final Identifier actual = thisObj.getParent();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("ID:", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("ID:", actual.getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent());
    Assert.assertEquals("ID:", actual.getParent().getIdText());
    Assert.assertEquals("ID:", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999bf0e39d5a53347a5() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(105372469, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setParentInputNotNullOutputVoid99954f3b134baf660a6() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");
    final Identifier arg0 = identifier;

    // Act
    thisObj.setParent(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull9996587aec25a5ca6c6() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("ID:ID:ID:ID:.ID:.ID:", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void trimParentInputZeroNotNullOutputPositive999e42223edba600e5f() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "ID:");
    final Identifier identifier = new Identifier(identifier1, "ID:");
    final Identifier thisObj = new Identifier(identifier, "ID:");
    final int arg0 = 0;
    final String arg1 = "ID:";

    // Act
    final int actual = thisObj.trimParent(arg0, arg1);

    // Assert side effects
    Assert.assertNull(thisObj.getParent());

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void unescapeNameInputNotNullTrueOutputNotNull9995ee53da6aa0eb33e() {

    // Arrange
    final String arg0 = "ID:";
    final boolean arg1 = true;

    // Act
    final String actual = Identifier.unescapeName(arg0, arg1);

    // Assert result
    Assert.assertEquals("ID:", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void unescapeNameInputNotNullOutputNotNull9997732b0c45469b8ff() {

    // Arrange
    final String arg0 = "ID:";

    // Act
    final String actual = Identifier.unescapeName(arg0);

    // Assert result
    Assert.assertEquals("ID:", actual);

  }
}
