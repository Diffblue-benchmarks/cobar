package com.alibaba.cobar.parser.ast.fragment.ddl;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralString;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition.ColumnFormat;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition.SpecialIndex;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition;
import com.alibaba.cobar.parser.ast.fragment.ddl.datatype.DataType.DataTypeName;
import com.alibaba.cobar.parser.ast.fragment.ddl.datatype.DataType;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ColumnDefinitionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9999a1e4d83a3f53e14() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullTrueNotNullTruePrimaryNotNullDynamicOutputNotNull9997e44c9d81ae16590() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final Identifier identifier2 = new Identifier(identifier, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType arg0 = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);
    final boolean arg1 = true;
    final Expression arg2 = arithmeticAddExpression;
    final boolean arg3 = true;
    final ColumnDefinition.SpecialIndex arg4 = ColumnDefinition.SpecialIndex.PRIMARY;
    final LiteralString arg5 = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition.ColumnFormat arg6 = ColumnDefinition.ColumnFormat.DYNAMIC;

    // Act, creating object to test constructor
    final ColumnDefinition actual = new ColumnDefinition(arg0, arg1, arg2, arg3, arg4, arg5, arg6);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getDataType());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getDecimals());
    Assert.assertEquals(actual.getDefaultVal(), actual.getDataType().getLength());
    Assert.assertTrue(actual.getDataType().isZerofill());
    Assert.assertNotNull(actual.getDataType().getCollation());
    Assert.assertEquals("DATA TYPE IS NULL", actual.getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDataType().getCollation().getParent());
    Assert.assertEquals("DATA TYPE IS NULL", actual.getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("DATA TYPE IS NULL", actual.getDataType().getCollation().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getDataType().getCollation().getParent().getParent().getParent());
    Assert.assertEquals("data type is null", actual.getDataType().getCollation().getParent().getParent().getIdText());
    Assert.assertEquals("data type is null", actual.getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("data type is null", actual.getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getDataType().getCollectionVals().size());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand(), actual.getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getDataType().isBinary());
    Assert.assertEquals(actual.getDataType().getCollation().getParent(), actual.getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getDataType().getTypeName());
    Assert.assertTrue(actual.getDataType().isUnsigned());
    Assert.assertNotNull(actual.getComment());
    Assert.assertEquals("data type is null", actual.getComment().getIntroducer());
    Assert.assertTrue(actual.getComment().isNchars());
    Assert.assertEquals("data type is null", actual.getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.DYNAMIC, actual.getColumnFormat());
    Assert.assertTrue(actual.isNotNull());
    Assert.assertTrue(actual.isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getSpecialIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnFormatOutputFixed9998e1c95d5b7481a2e() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final ColumnDefinition.ColumnFormat actual = thisObj.getColumnFormat();

    // Assert result
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCommentOutputNotNull9992a1f8b982b9081c1() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final LiteralString actual = thisObj.getComment();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("data type is null", actual.getIntroducer());
    Assert.assertTrue(actual.isNchars());
    Assert.assertEquals("data type is null", actual.getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataTypeOutputNotNull9992c83db3aaf0cac09() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final DataType actual = thisObj.getDataType();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDecimals()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) actual.getDecimals()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand(), actual.getLength());
    Assert.assertTrue(actual.isZerofill());
    Assert.assertNotNull(actual.getCollation());
    Assert.assertEquals("DATA TYPE IS NULL", actual.getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getCollation().getParent());
    Assert.assertEquals("DATA TYPE IS NULL", actual.getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getCollation().getParent().getParent());
    Assert.assertEquals("data type is null", actual.getCollation().getParent().getIdText());
    Assert.assertEquals("data type is null", actual.getCollation().getIdText());
    Assert.assertNotNull(actual.getCollectionVals());
    Assert.assertEquals(1, actual.getCollectionVals().size());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand(), actual.getCollectionVals().get(0));
    Assert.assertTrue(actual.isBinary());
    Assert.assertNull(actual.getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getTypeName());
    Assert.assertTrue(actual.isUnsigned());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDefaultValOutputNotNull9998e1401a247f1157e() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final Expression actual = thisObj.getDefaultVal();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((ArithmeticAddExpression) actual).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getSpecialIndexOutputPrimary999009ce7177dab78a3() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final ColumnDefinition.SpecialIndex actual = thisObj.getSpecialIndex();

    // Assert result
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAutoIncrementOutputTrue999023d40e80760b55a() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final boolean actual = thisObj.isAutoIncrement();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNotNullOutputTrue99968a3d60495b5f13f() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "data type is null");
    final Identifier identifier = new Identifier(identifier1, "data type is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, null, identifier, arrayList);
    final LiteralString literalString = new LiteralString("data type is null", "data type is null", true);
    final ColumnDefinition thisObj = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final boolean actual = thisObj.isNotNull();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputDefault99931d1cefc80b6bd43() {

    // Arrange
    final String arg0 = "DEFAULT";

    // Act
    final ColumnDefinition.ColumnFormat actual = ColumnDefinition.ColumnFormat.valueOf(arg0);

    // Assert result
    Assert.assertEquals(ColumnDefinition.ColumnFormat.DEFAULT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput399971b90ef1476c3e4b() {

    // Act
    final ColumnDefinition.ColumnFormat[] actual = ColumnDefinition.ColumnFormat.values();

    // Assert result
    Assert.assertArrayEquals(new ColumnDefinition.ColumnFormat[]{ ColumnDefinition.ColumnFormat.FIXED, ColumnDefinition.ColumnFormat.DYNAMIC, ColumnDefinition.ColumnFormat.DEFAULT }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputPrimary9998f73877f5279eab5() {

    // Arrange
    final String arg0 = "PRIMARY";

    // Act
    final ColumnDefinition.SpecialIndex actual = ColumnDefinition.SpecialIndex.valueOf(arg0);

    // Assert result
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999e85948ec036adbfd() {

    // Act
    final ColumnDefinition.SpecialIndex[] actual = ColumnDefinition.SpecialIndex.values();

    // Assert result
    Assert.assertArrayEquals(new ColumnDefinition.SpecialIndex[]{ ColumnDefinition.SpecialIndex.PRIMARY, ColumnDefinition.SpecialIndex.UNIQUE }, actual);

  }
}
