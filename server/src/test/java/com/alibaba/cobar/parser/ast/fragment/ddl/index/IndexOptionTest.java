package com.alibaba.cobar.parser.ast.fragment.ddl.index;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralString;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexOption.IndexType;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexOption;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IndexOptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99998fa849c759979a0() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption thisObj = new IndexOption(arithmeticAddExpression);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9995c647e6bba2aa148() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final IndexOption actual = new IndexOption(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getIndexType());
    Assert.assertNull(actual.getComment());
    Assert.assertNull(actual.getKeyBlockSize());
    Assert.assertNotNull(actual.getParserName());
    Assert.assertEquals("AAAAA", actual.getParserName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParserName().getParent());
    Assert.assertEquals("AAAAA", actual.getParserName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParserName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParserName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParserName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParserName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParserName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParserName().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999fb6571c359157340() {

    // Arrange
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act, creating object to test constructor
    final IndexOption actual = new IndexOption(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getIndexType());
    Assert.assertNotNull(actual.getComment());
    Assert.assertEquals("aaaaa", actual.getComment().getIntroducer());
    Assert.assertTrue(actual.getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getComment().getString());
    Assert.assertNull(actual.getKeyBlockSize());
    Assert.assertNull(actual.getParserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputBtreeOutputNotNull9998c692cb69f334694() {

    // Arrange
    final IndexOption.IndexType arg0 = IndexOption.IndexType.BTREE;

    // Act, creating object to test constructor
    final IndexOption actual = new IndexOption(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(IndexOption.IndexType.BTREE, actual.getIndexType());
    Assert.assertNull(actual.getComment());
    Assert.assertNull(actual.getKeyBlockSize());
    Assert.assertNull(actual.getParserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999bfc0da63c47be255() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final IndexOption actual = new IndexOption(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getIndexType());
    Assert.assertNull(actual.getComment());
    Assert.assertNotNull(actual.getKeyBlockSize());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getKeyBlockSize()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getKeyBlockSize()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getKeyBlockSize()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getKeyBlockSize()).getRightOprand());
    Assert.assertNull(actual.getParserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCommentOutputVoid99920c02e3735f446dd() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption thisObj = new IndexOption(arithmeticAddExpression);

    // Act
    final LiteralString actual = thisObj.getComment();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexTypeOutputVoid999e684b7a072d60d55() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption thisObj = new IndexOption(arithmeticAddExpression);

    // Act
    final IndexOption.IndexType actual = thisObj.getIndexType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getKeyBlockSizeOutputNotNull999d383cc3a4e60b79d() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption thisObj = new IndexOption(arithmeticAddExpression);

    // Act
    final Expression actual = thisObj.getKeyBlockSize();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((ArithmeticAddExpression) actual).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getParserNameOutputVoid999e8f28c833c03e168() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption thisObj = new IndexOption(arithmeticAddExpression);

    // Act
    final Identifier actual = thisObj.getParserName();

    // The method returns void, testing that no exception is thrown

  }
}
