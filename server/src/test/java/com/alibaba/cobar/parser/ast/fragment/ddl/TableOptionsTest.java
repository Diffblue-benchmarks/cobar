package com.alibaba.cobar.parser.ast.fragment.ddl;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralString;
import com.alibaba.cobar.parser.ast.fragment.ddl.TableOptions.InsertMethod;
import com.alibaba.cobar.parser.ast.fragment.ddl.TableOptions.PackKeys;
import com.alibaba.cobar.parser.ast.fragment.ddl.TableOptions.RowFormat;
import com.alibaba.cobar.parser.ast.fragment.ddl.TableOptions;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



public class TableOptionsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputFirst999887635bb79bc5467() {

    // Arrange
    final String arg0 = "FIRST";

    // Act
    final InsertMethod actual = InsertMethod.valueOf(arg0);

    // Assert result
    Assert.assertEquals(InsertMethod.FIRST, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999560d8daa340171f8() {

    // Act
    final InsertMethod[] actual = InsertMethod.values();

    // Assert result
    Assert.assertArrayEquals(new InsertMethod[]{ InsertMethod.NO, InsertMethod.FIRST, InsertMethod.LAST }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputDefault999d7ca9c84c05f8400() {

    // Arrange
    final String arg0 = "DEFAULT";

    // Act
    final PackKeys actual = PackKeys.valueOf(arg0);

    // Assert result
    Assert.assertEquals(PackKeys.DEFAULT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999cfd74426aa44cc48() {

    // Act
    final PackKeys[] actual = PackKeys.values();

    // Assert result
    Assert.assertArrayEquals(new PackKeys[]{ PackKeys.FALSE, PackKeys.TRUE, PackKeys.DEFAULT }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputCompact999819bc426f057bed0() {

    // Arrange
    final String arg0 = "COMPACT";

    // Act
    final RowFormat actual = RowFormat.valueOf(arg0);

    // Assert result
    Assert.assertEquals(RowFormat.COMPACT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput6999ccc58c265cf3c568() {

    // Act
    final RowFormat[] actual = RowFormat.values();

    // Assert result
    Assert.assertArrayEquals(new RowFormat[]{ RowFormat.DEFAULT, RowFormat.DYNAMIC, RowFormat.FIXED, RowFormat.COMPRESSED, RowFormat.REDUNDANT, RowFormat.COMPACT }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999aca546b033b33dfb() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fd99710e0ba17f7d() {

    // Act, creating object to test constructor
    final TableOptions actual = new TableOptions();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPackKeys());
    Assert.assertNull(actual.getMaxRows());
    Assert.assertNull(actual.getCharSet());
    Assert.assertNull(actual.getEngine());
    Assert.assertNull(actual.getDelayKeyWrite());
    Assert.assertNull(actual.getConnection());
    Assert.assertNull(actual.getAvgRowLength());
    Assert.assertNull(actual.getCheckSum());
    Assert.assertNull(actual.getKeyBlockSize());
    Assert.assertNull(actual.getMinRows());
    Assert.assertNull(actual.getDataDir());
    Assert.assertNull(actual.getCollation());
    Assert.assertNull(actual.getComment());
    Assert.assertNull(actual.getInsertMethod());
    Assert.assertNull(actual.getPassword());
    Assert.assertNull(actual.getRowFormat());
    Assert.assertNull(actual.getIndexDir());
    Assert.assertNull(actual.getAutoIncrement());
    Assert.assertNull(actual.getUnion());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoIncrementOutputVoid999b9c8815e552eb8a4() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Expression actual = thisObj.getAutoIncrement();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAvgRowLengthOutputVoid999b66dd2085ac5ddc9() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Expression actual = thisObj.getAvgRowLength();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharSetOutputVoid999b2f0abeb6b195dcd() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Identifier actual = thisObj.getCharSet();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCheckSumOutputVoid9993f2032c8537f3159() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Boolean actual = thisObj.getCheckSum();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCollationOutputVoid9995e2ddabc9a53a8d4() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Identifier actual = thisObj.getCollation();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCommentOutputVoid999fa3e69c527701244() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final LiteralString actual = thisObj.getComment();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionOutputVoid999f566d65dd70871ec() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final LiteralString actual = thisObj.getConnection();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataDirOutputVoid9990b02d4e32a8a3391() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final LiteralString actual = thisObj.getDataDir();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDelayKeyWriteOutputVoid999dac89738a2fdb9ef() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Boolean actual = thisObj.getDelayKeyWrite();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getEngineOutputVoid99961eb8bd5f5de30d4() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Identifier actual = thisObj.getEngine();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexDirOutputVoid9999bdbe51ba00d8fde() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final LiteralString actual = thisObj.getIndexDir();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getInsertMethodOutputVoid999d0e1a02fb2a8b8f4() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final InsertMethod actual = thisObj.getInsertMethod();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getKeyBlockSizeOutputVoid999e062f9715bcdbec8() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Expression actual = thisObj.getKeyBlockSize();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxRowsOutputVoid999f07bf6df0dbc10b1() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Expression actual = thisObj.getMaxRows();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMinRowsOutputVoid99920076aaca77a230d() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final Expression actual = thisObj.getMinRows();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPackKeysOutputVoid9995611211f86a6fa81() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final PackKeys actual = thisObj.getPackKeys();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid999f5da2bd02aabdb6c() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final LiteralString actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowFormatOutputVoid9996a264f07f75d7758() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final RowFormat actual = thisObj.getRowFormat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnionOutputVoid9993d547c8ea78fc63b() {

    // Arrange
    final TableOptions thisObj = new TableOptions();

    // Act
    final List<Identifier> actual = thisObj.getUnion();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoIncrementInputNotNullOutputVoid999ac59f55b22dfbff9() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    thisObj.setAutoIncrement(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAutoIncrement());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getAutoIncrement()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAutoIncrement()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getAutoIncrement()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void setAvgRowLengthInputNotNullOutputVoid9993a59be4343f21a4e() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    thisObj.setAvgRowLength(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAvgRowLength());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getAvgRowLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getAvgRowLength()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getAvgRowLength()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharSetInputNotNullOutputVoid9991b5d241c6507f0d2() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "akaaa");

    // Act
    thisObj.setCharSet(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCharSet());
    Assert.assertEquals("AKAAA", thisObj.getCharSet().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getCharSet().getParent());
    Assert.assertEquals("AAAAA", thisObj.getCharSet().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getCharSet().getParent().getParent());
    Assert.assertEquals("AAAAA", thisObj.getCharSet().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getCharSet().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getCharSet().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getCharSet().getParent().getIdText());
    Assert.assertEquals("akaaa", thisObj.getCharSet().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCheckSumInputNotNullOutputVoid9997d2d1e4b046e7b1a() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setCheckSum(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCheckSum());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCollationInputNotNullOutputVoid999bb3226a645abfb0d() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "akaaa");

    // Act
    thisObj.setCollation(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCollation());
    Assert.assertEquals("AKAAA", thisObj.getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getCollation().getParent());
    Assert.assertEquals("AAAAA", thisObj.getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getCollation().getParent().getParent());
    Assert.assertEquals("AAAAA", thisObj.getCollation().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getCollation().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getCollation().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getCollation().getParent().getIdText());
    Assert.assertEquals("akaaa", thisObj.getCollation().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCommentInputNotNullOutputVoid99968d6f8e5cc0dff29() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.setComment(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getComment());
    Assert.assertEquals("aaaaa", thisObj.getComment().getIntroducer());
    Assert.assertTrue(thisObj.getComment().isNchars());
    Assert.assertEquals("aaaaa", thisObj.getComment().getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void setConnectionInputNotNullOutputVoid999362b2613a53a0eee() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.setConnection(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getConnection());
    Assert.assertEquals("aaaaa", thisObj.getConnection().getIntroducer());
    Assert.assertTrue(thisObj.getConnection().isNchars());
    Assert.assertEquals("aaaaa", thisObj.getConnection().getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataDirInputNotNullOutputVoid999fcbe59380af23574() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.setDataDir(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDataDir());
    Assert.assertEquals("aaaaa", thisObj.getDataDir().getIntroducer());
    Assert.assertTrue(thisObj.getDataDir().isNchars());
    Assert.assertEquals("aaaaa", thisObj.getDataDir().getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDelayKeyWriteInputNotNullOutputVoid999c954702b817422eb() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setDelayKeyWrite(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDelayKeyWrite());

  }

  // Test written by Diffblue Cover
  @Test
  public void setEngineInputNotNullOutputVoid9992f913841c73c905d() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "akaaa");

    // Act
    thisObj.setEngine(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getEngine());
    Assert.assertEquals("AKAAA", thisObj.getEngine().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getEngine().getParent());
    Assert.assertEquals("AAAAA", thisObj.getEngine().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getEngine().getParent().getParent());
    Assert.assertEquals("AAAAA", thisObj.getEngine().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getEngine().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getEngine().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getEngine().getParent().getIdText());
    Assert.assertEquals("akaaa", thisObj.getEngine().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIndexDirInputNotNullOutputVoid9995d2fa178cb3075eb() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.setIndexDir(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getIndexDir());
    Assert.assertEquals("aaaaa", thisObj.getIndexDir().getIntroducer());
    Assert.assertTrue(thisObj.getIndexDir().isNchars());
    Assert.assertEquals("aaaaa", thisObj.getIndexDir().getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void setInsertMethodInputNoOutputVoid999cb149b5421b6df0f() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final InsertMethod arg0 = InsertMethod.NO;

    // Act
    thisObj.setInsertMethod(arg0);

    // Assert side effects
    Assert.assertEquals(InsertMethod.NO, thisObj.getInsertMethod());

  }

  // Test written by Diffblue Cover
  @Test
  public void setKeyBlockSizeInputNotNullOutputVoid999ed91bce857f50eec() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    thisObj.setKeyBlockSize(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getKeyBlockSize());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getKeyBlockSize()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getKeyBlockSize()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxRowsInputNotNullOutputVoid9999e547b262fb115fc() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    thisObj.setMaxRows(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getMaxRows());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getMaxRows()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getMaxRows()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMaxRows()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getMaxRows()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMinRowsInputNotNullOutputVoid9991be5826828768cc7() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    thisObj.setMinRows(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getMinRows());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getMinRows()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getMinRows()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getMinRows()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getMinRows()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPackKeysInputFalseOutputVoid99950d5b0442e3ba6df() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final PackKeys arg0 = PackKeys.FALSE;

    // Act
    thisObj.setPackKeys(arg0);

    // Assert side effects
    Assert.assertEquals(PackKeys.FALSE, thisObj.getPackKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid999b318275b9ace3fb6() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPassword());
    Assert.assertEquals("aaaaa", thisObj.getPassword().getIntroducer());
    Assert.assertTrue(thisObj.getPassword().isNchars());
    Assert.assertEquals("aaaaa", thisObj.getPassword().getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRowFormatInputDefaultOutputVoid99997c9102d445e9940() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final RowFormat arg0 = RowFormat.DEFAULT;

    // Act
    thisObj.setRowFormat(arg0);

    // Assert side effects
    Assert.assertEquals(RowFormat.DEFAULT, thisObj.getRowFormat());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUnionInputNotNullOutputVoid9997ec618f684af0f9f() {

    // Arrange
    final TableOptions thisObj = new TableOptions();
    final ArrayList<Identifier> arg0 = new ArrayList<Identifier>();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arg0.add(identifier);

    // Act
    thisObj.setUnion(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getUnion());
    Assert.assertEquals(1, thisObj.getUnion().size());
    Assert.assertNotNull(thisObj.getUnion().get(0));
    Assert.assertEquals("AAAAA", thisObj.getUnion().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getUnion().get(0).getParent());
    Assert.assertEquals("AAAAA", thisObj.getUnion().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getUnion().get(0).getParent().getParent());
    Assert.assertEquals("AAAAA", thisObj.getUnion().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getUnion().get(0).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getUnion().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getUnion().get(0).getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getUnion().get(0).getIdText());

  }
}
