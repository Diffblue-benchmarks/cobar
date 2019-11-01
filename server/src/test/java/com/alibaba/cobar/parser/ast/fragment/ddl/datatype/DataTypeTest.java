package com.alibaba.cobar.parser.ast.fragment.ddl.datatype;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
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
import java.util.List;



public class DataTypeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9992517ef1a322249bc() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputBitTrueTrueTrueNotNullNotNullNotNullNotNullNotNullOutputNotNull999a71f79a6a4f5fee7() {

    // Arrange
    final DataType.DataTypeName arg0 = DataType.DataTypeName.BIT;
    final boolean arg1 = true;
    final boolean arg2 = true;
    final boolean arg3 = true;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg4 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final Expression arg5 = arithmeticAddExpression;
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier arg6 = new Identifier(identifier, "typeName is null");
    final Identifier arg7 = identifier;
    final ArrayList<Expression> arg8 = new ArrayList<Expression>();
    arg8.add(arithmeticAddExpression1);

    // Act, creating object to test constructor
    final DataType actual = new DataType(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDecimals()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand(), ((ArithmeticAddExpression) actual.getDecimals()).getRightOprand());
    Assert.assertNotNull(actual.getLength());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getLength()).getPrecedence());
    Assert.assertEquals(actual.getDecimals(), ((ArithmeticAddExpression) actual.getLength()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getLength()).getRightOprand());
    Assert.assertTrue(actual.isZerofill());
    Assert.assertNotNull(actual.getCollation());
    Assert.assertEquals("TYPENAME IS NULL", actual.getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getCollation().getParent());
    Assert.assertEquals("TYPENAME IS NULL", actual.getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getCollation().getParent().getParent());
    Assert.assertEquals("typeName is null", actual.getCollation().getParent().getIdText());
    Assert.assertEquals("typeName is null", actual.getCollation().getIdText());
    Assert.assertNotNull(actual.getCollectionVals());
    Assert.assertEquals(1, actual.getCollectionVals().size());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDecimals()).getLeftOprand(), actual.getCollectionVals().get(0));
    Assert.assertTrue(actual.isBinary());
    Assert.assertNotNull(actual.getCharSet());
    Assert.assertEquals("TYPENAME IS NULL", actual.getCharSet().getIdTextUpUnescape());
    Assert.assertEquals(actual.getCollation(), actual.getCharSet().getParent());
    Assert.assertEquals("typeName is null", actual.getCharSet().getIdText());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getTypeName());
    Assert.assertTrue(actual.isUnsigned());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharSetOutputNotNull9996bcd97705bf7673f() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final Identifier actual = thisObj.getCharSet();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("TYPENAME IS NULL", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("TYPENAME IS NULL", actual.getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent());
    Assert.assertEquals("typeName is null", actual.getParent().getIdText());
    Assert.assertEquals("typeName is null", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCollationOutputNotNull9997a165a666150864c() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final Identifier actual = thisObj.getCollation();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("TYPENAME IS NULL", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("TYPENAME IS NULL", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("TYPENAME IS NULL", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("typeName is null", actual.getParent().getParent().getIdText());
    Assert.assertEquals("typeName is null", actual.getParent().getIdText());
    Assert.assertEquals("typeName is null", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCollectionValsOutput1999559d31115adc677b() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final List<Expression> actual = thisObj.getCollectionVals();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.get(0)).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual.get(0)).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.get(0)).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDecimalsOutputNotNull999d33552df9b392f63() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final Expression actual = thisObj.getDecimals();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((ArithmeticAddExpression) actual).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual).getLeftOprand(), ((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLengthOutputNotNull99980a7fda927db2194() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final Expression actual = thisObj.getLength();

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
  public void getTypeNameOutputBit999af41e903e8b25d52() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final DataType.DataTypeName actual = thisObj.getTypeName();

    // Assert result
    Assert.assertEquals(DataType.DataTypeName.BIT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isBinaryOutputTrue999a579a5db9c06346a() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final boolean actual = thisObj.isBinary();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isUnsignedOutputTrue999bed01b2431ba13ec() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final boolean actual = thisObj.isUnsigned();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isZerofillOutputTrue999b7758b3940f4d01d() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier1 = new Identifier(null, "typeName is null");
    final Identifier identifier = new Identifier(identifier1, "typeName is null");
    final Identifier identifier2 = new Identifier(identifier, "typeName is null");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType thisObj = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier2, arrayList);

    // Act
    final boolean actual = thisObj.isZerofill();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputBigint999d7d706f9a8c6084d() {

    // Arrange
    final String arg0 = "BIGINT";

    // Act
    final DataType.DataTypeName actual = DataType.DataTypeName.valueOf(arg0);

    // Assert result
    Assert.assertEquals(DataType.DataTypeName.BIGINT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput29999c8cdea66bea796aa() {

    // Act
    final DataType.DataTypeName[] actual = DataType.DataTypeName.values();

    // Assert result
    Assert.assertArrayEquals(new DataType.DataTypeName[]{ DataType.DataTypeName.BIT, DataType.DataTypeName.TINYINT, DataType.DataTypeName.SMALLINT, DataType.DataTypeName.MEDIUMINT, DataType.DataTypeName.INT, DataType.DataTypeName.BIGINT, DataType.DataTypeName.REAL, DataType.DataTypeName.DOUBLE, DataType.DataTypeName.FLOAT, DataType.DataTypeName.DECIMAL, DataType.DataTypeName.DATE, DataType.DataTypeName.TIME, DataType.DataTypeName.TIMESTAMP, DataType.DataTypeName.DATETIME, DataType.DataTypeName.YEAR, DataType.DataTypeName.CHAR, DataType.DataTypeName.VARCHAR, DataType.DataTypeName.BINARY, DataType.DataTypeName.VARBINARY, DataType.DataTypeName.TINYBLOB, DataType.DataTypeName.BLOB, DataType.DataTypeName.MEDIUMBLOB, DataType.DataTypeName.LONGBLOB, DataType.DataTypeName.TINYTEXT, DataType.DataTypeName.TEXT, DataType.DataTypeName.MEDIUMTEXT, DataType.DataTypeName.LONGTEXT, DataType.DataTypeName.ENUM, DataType.DataTypeName.SET }, actual);

  }
}
