package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralBitField;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LiteralBitFieldTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9999213f674bcaba951() {

    // Arrange
    final LiteralBitField thisObj = new LiteralBitField("bit text is null", "bit text is null");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99934d00653ff0cc599() {

    // Arrange
    final String arg0 = "bit text is null";
    final String arg1 = "bit text is null";

    // Act, creating object to test constructor
    final LiteralBitField actual = new LiteralBitField(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("bit text is null", actual.getIntroducer());
    Assert.assertEquals("bit text is null", actual.getText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntroducerOutputNotNull9997ac4fc5a59f4ef6a() {

    // Arrange
    final LiteralBitField thisObj = new LiteralBitField("bit text is null", "bit text is null");

    // Act
    final String actual = thisObj.getIntroducer();

    // Assert result
    Assert.assertEquals("bit text is null", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTextOutputNotNull999b733a2b1173eccd4() {

    // Arrange
    final LiteralBitField thisObj = new LiteralBitField("bit text is null", "bit text is null");

    // Act
    final String actual = thisObj.getText();

    // Assert result
    Assert.assertEquals("bit text is null", actual);

  }
}
