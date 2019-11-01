package com.alibaba.cobar.parser.ast.stmt.ddl;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralString;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition.ColumnFormat;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition.SpecialIndex;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition;
import com.alibaba.cobar.parser.ast.fragment.ddl.TableOptions;
import com.alibaba.cobar.parser.ast.fragment.ddl.datatype.DataType.DataTypeName;
import com.alibaba.cobar.parser.ast.fragment.ddl.datatype.DataType;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexColumnName;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexDefinition.IndexType;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexDefinition;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexOption;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddColumn;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddColumns;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddFullTextIndex;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddIndex;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddPrimaryKey;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddSpatialIndex;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddUniqueKey;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AlterColumnDefaultVal;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AlterSpecification;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.ChangeColumn;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.DropColumn;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.DropIndex;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.DropPrimaryKey;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.ModifyColumn;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import com.alibaba.cobar.parser.visitor.MySQLOutputASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



public class DDLAlterTableStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9998ebec4faf4ec37cf() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final AddColumn thisObj = new AddColumn(identifier, columnDefinition);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999d4d2fc771488429b() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, arg0, arg0, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg1 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final Identifier arg2 = identifier;

    // Act, creating object to test constructor
    final AddColumn actual = new AddColumn(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColumnDefine());
    Assert.assertNotNull(actual.getColumnDefine().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getColumnDefine().getDataType());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(actual.getColumnDefine().getDefaultVal(), ((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(actual.getColumnDefine().getDefaultVal(), actual.getColumnDefine().getDataType().getLength());
    Assert.assertTrue(actual.getColumnDefine().getDataType().isZerofill());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getColumnDefine().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnDefine().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnDefine().getDataType().getCollation().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColumnDefine().getDataType().getCollation().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getDataType().getCollation().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getColumnDefine().getDataType().getCollectionVals().size());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getDecimals(), actual.getColumnDefine().getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getColumnDefine().getDataType().isBinary());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getCollation(), actual.getColumnDefine().getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getColumnDefine().getDataType().getTypeName());
    Assert.assertTrue(actual.getColumnDefine().getDataType().isUnsigned());
    Assert.assertNotNull(actual.getColumnDefine().getComment());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getComment().getIntroducer());
    Assert.assertTrue(actual.getColumnDefine().getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColumnDefine().getColumnFormat());
    Assert.assertTrue(actual.getColumnDefine().isNotNull());
    Assert.assertTrue(actual.getColumnDefine().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getColumnDefine().getSpecialIndex());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getCollation().getParent(), actual.getAfterColumn());
    Assert.assertFalse(actual.isFirst());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getCollation(), actual.getColumnName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999834d2bfbdcca50b3() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, arg0, arg0, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg1 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act, creating object to test constructor
    final AddColumn actual = new AddColumn(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColumnDefine());
    Assert.assertNotNull(actual.getColumnDefine().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getColumnDefine().getDataType());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(actual.getColumnDefine().getDefaultVal(), ((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumnDefine().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColumnDefine().getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(actual.getColumnDefine().getDefaultVal(), actual.getColumnDefine().getDataType().getLength());
    Assert.assertTrue(actual.getColumnDefine().getDataType().isZerofill());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getColumnDefine().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnDefine().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnDefine().getDataType().getCollation().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColumnDefine().getDataType().getCollation().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getDataType().getCollation().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getColumnDefine().getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getColumnDefine().getDataType().getCollectionVals().size());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getDecimals(), actual.getColumnDefine().getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getColumnDefine().getDataType().isBinary());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getCollation(), actual.getColumnDefine().getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getColumnDefine().getDataType().getTypeName());
    Assert.assertTrue(actual.getColumnDefine().getDataType().isUnsigned());
    Assert.assertNotNull(actual.getColumnDefine().getComment());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getComment().getIntroducer());
    Assert.assertTrue(actual.getColumnDefine().getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getColumnDefine().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColumnDefine().getColumnFormat());
    Assert.assertTrue(actual.getColumnDefine().isNotNull());
    Assert.assertTrue(actual.getColumnDefine().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getColumnDefine().getSpecialIndex());
    Assert.assertNull(actual.getAfterColumn());
    Assert.assertFalse(actual.isFirst());
    Assert.assertEquals(actual.getColumnDefine().getDataType().getCollation(), actual.getColumnName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAfterColumnOutputVoid999bc8af58da07b0ff1() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final AddColumn thisObj = new AddColumn(identifier, columnDefinition);

    // Act
    final Identifier actual = thisObj.getAfterColumn();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnDefineOutputNotNull9996bd0d5d1720e0844() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final AddColumn thisObj = new AddColumn(identifier, columnDefinition);

    // Act
    final ColumnDefinition actual = thisObj.getColumnDefine();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getRightOprand());
    Assert.assertNotNull(actual.getDataType());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getDecimals());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getLength());
    Assert.assertTrue(actual.getDataType().isZerofill());
    Assert.assertNotNull(actual.getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNull(actual.getDataType().getCollation().getParent());
    Assert.assertEquals("aaaaa", actual.getDataType().getCollation().getIdText());
    final ArrayList<Expression> arrayList1 = new ArrayList<Expression>();
    arrayList1.add(null);
    Assert.assertEquals(arrayList1, actual.getDataType().getCollectionVals());
    Assert.assertTrue(actual.getDataType().isBinary());
    Assert.assertNotNull(actual.getDataType().getCharSet());
    Assert.assertEquals("AAAAA", actual.getDataType().getCharSet().getIdTextUpUnescape());
    Assert.assertEquals(actual.getDataType().getCollation(), actual.getDataType().getCharSet().getParent());
    Assert.assertEquals("aaaaa", actual.getDataType().getCharSet().getIdText());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getDataType().getTypeName());
    Assert.assertTrue(actual.getDataType().isUnsigned());
    Assert.assertNotNull(actual.getComment());
    Assert.assertEquals("aaaaa", actual.getComment().getIntroducer());
    Assert.assertTrue(actual.getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColumnFormat());
    Assert.assertTrue(actual.isNotNull());
    Assert.assertTrue(actual.isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getSpecialIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnNameOutputNotNull99918427214b8fbaabf() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final AddColumn thisObj = new AddColumn(identifier, columnDefinition);

    // Act
    final Identifier actual = thisObj.getColumnName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void isFirstOutputFalse999b1b9cd790c7b0718() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final AddColumn thisObj = new AddColumn(identifier, columnDefinition);

    // Act
    final boolean actual = thisObj.isFirst();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999755d55d9fcaf8bf2() {

    // Arrange
    final AddColumns thisObj = new AddColumns();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addColumnInputNotNullNotNullOutputNotNull999ac9404bc575d06ff() {

    // Arrange
    final AddColumns thisObj = new AddColumns();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "akaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, identifier1, arg0, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg1 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final AddColumns actual = thisObj.addColumn(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColumns());
    Assert.assertEquals(1, thisObj.getColumns().size());
    Assert.assertNotNull(thisObj.getColumns().get(0));
    Assert.assertNotNull(((Pair) thisObj.getColumns().get(0)).getKey());
    Assert.assertEquals("AKAAA", ((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("akaaa", ((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) thisObj.getColumns().get(0)).getValue());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getRightOprand());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDefaultVal(), ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getLength());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().isZerofill());
    Assert.assertEquals(((Pair) thisObj.getColumns().get(0)).getKey(), ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getCollation());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getCollectionVals());
    Assert.assertEquals(1, ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getCollectionVals().size());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getDecimals(), ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getCollectionVals().get(0));
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().isBinary());
    Assert.assertEquals(((Identifier) ((Pair) thisObj.getColumns().get(0)).getKey()).getParent().getParent(), ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().getTypeName());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getDataType().isUnsigned());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getComment());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getComment().getIntroducer());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getComment().isNchars());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getColumnFormat());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).isNotNull());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, ((ColumnDefinition) ((Pair) thisObj.getColumns().get(0)).getValue()).getSpecialIndex());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColumns());
    Assert.assertEquals(1, actual.getColumns().size());
    Assert.assertNotNull(actual.getColumns().get(0));
    Assert.assertNotNull(((Pair) actual.getColumns().get(0)).getKey());
    Assert.assertEquals("AKAAA", ((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("akaaa", ((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) actual.getColumns().get(0)).getValue());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getRightOprand());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDefaultVal(), ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getLength());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().isZerofill());
    Assert.assertEquals(((Pair) actual.getColumns().get(0)).getKey(), ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getCollation());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getCollectionVals());
    Assert.assertEquals(1, ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getCollectionVals().size());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getDecimals(), ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getCollectionVals().get(0));
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().isBinary());
    Assert.assertEquals(((Identifier) ((Pair) actual.getColumns().get(0)).getKey()).getParent().getParent(), ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().getTypeName());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getDataType().isUnsigned());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getComment());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getComment().getIntroducer());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getComment().isNchars());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getColumnFormat());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).isNotNull());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, ((ColumnDefinition) ((Pair) actual.getColumns().get(0)).getValue()).getSpecialIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999432f11e0f5ce2edd() {

    // Act, creating object to test constructor
    final AddColumns actual = new AddColumns();

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList, actual.getColumns());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnsOutput09991137c12ee9ca0c68() {

    // Arrange
    final AddColumns thisObj = new AddColumns();

    // Act
    final List<Pair<Identifier, ColumnDefinition>> actual = thisObj.getColumns();

    // Assert result
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList, actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acceptInputNotNullOutputUnsupportedOperationException99990e1e23c4c194a13() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddFullTextIndex thisObj = new AddFullTextIndex(identifier, indexDefinition);
//    final StringBuilder stringBuilder = new StringBuilder();
//    final MySQLOutputASTVisitor arg0 = new MySQLOutputASTVisitor(stringBuilder);
//
//    // Act
//    thrown.expect(UnsupportedOperationException.class);
//    thisObj.accept(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull999d14d9c1d95a55e58() {
//
//    // Arrange
//    final Identifier identifier1 = new Identifier(null, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aaaaa");
//    final Identifier arg0 = new Identifier(identifier, "aaaaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//
//    // Act, creating object to test constructor
//    final AddFullTextIndex actual = new AddFullTextIndex(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getIndexDef());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexDef().getIndexType());
//    Assert.assertNotNull(actual.getIndexDef().getColumns());
//    Assert.assertEquals(1, actual.getIndexDef().getColumns().size());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0));
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getIndexDef().getColumns().get(0).isAsc());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(actual.getIndexDef().getOptions());
//    Assert.assertEquals(1, actual.getIndexDef().getOptions().size());
//    Assert.assertNotNull(actual.getIndexDef().getOptions().get(0));
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getComment());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getParserName());
//    Assert.assertNotNull(actual.getIndexName());
//    Assert.assertEquals("AAAAA", actual.getIndexName().getIdTextUpUnescape());
//    Assert.assertEquals(actual.getIndexDef().getColumns().get(0).getColumnName(), actual.getIndexName().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexName().getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexDefOutputNotNull99964893957a62fa7d8() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddFullTextIndex thisObj = new AddFullTextIndex(identifier, indexDefinition);
//
//    // Act
//    final IndexDefinition actual = thisObj.getIndexDef();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexType());
//    Assert.assertNotNull(actual.getColumns());
//    Assert.assertEquals(1, actual.getColumns().size());
//    Assert.assertNotNull(actual.getColumns().get(0));
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getColumns().get(0).isAsc());
//    Assert.assertNull(actual.getColumns().get(0).getLength());
//    Assert.assertNotNull(actual.getOptions());
//    Assert.assertEquals(1, actual.getOptions().size());
//    Assert.assertNotNull(actual.getOptions().get(0));
//    Assert.assertNull(actual.getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getOptions().get(0).getComment());
//    Assert.assertNull(actual.getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getOptions().get(0).getParserName());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexNameOutputNotNull99952328c14e3478804() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddFullTextIndex thisObj = new AddFullTextIndex(identifier, indexDefinition);
//
//    // Act
//    final Identifier actual = thisObj.getIndexName();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent().getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getParent().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
//    Assert.assertEquals("aakaa", actual.getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acceptInputNotNullOutputUnsupportedOperationException99915ed63ff680d602d() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddIndex thisObj = new AddIndex(identifier, indexDefinition);
//    final StringBuilder stringBuilder = new StringBuilder();
//    final MySQLOutputASTVisitor arg0 = new MySQLOutputASTVisitor(stringBuilder);
//
//    // Act
//    thrown.expect(UnsupportedOperationException.class);
//    thisObj.accept(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull999463cdef00407117e() {
//
//    // Arrange
//    final Identifier identifier1 = new Identifier(null, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aaaaa");
//    final Identifier arg0 = new Identifier(identifier, "aaaaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//
//    // Act, creating object to test constructor
//    final AddIndex actual = new AddIndex(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getIndexDef());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexDef().getIndexType());
//    Assert.assertNotNull(actual.getIndexDef().getColumns());
//    Assert.assertEquals(1, actual.getIndexDef().getColumns().size());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0));
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getIndexDef().getColumns().get(0).isAsc());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(actual.getIndexDef().getOptions());
//    Assert.assertEquals(1, actual.getIndexDef().getOptions().size());
//    Assert.assertNotNull(actual.getIndexDef().getOptions().get(0));
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getComment());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getParserName());
//    Assert.assertNotNull(actual.getIndexName());
//    Assert.assertEquals("AAAAA", actual.getIndexName().getIdTextUpUnescape());
//    Assert.assertEquals(actual.getIndexDef().getColumns().get(0).getColumnName(), actual.getIndexName().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexName().getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexDefOutputNotNull999d9917b1c7a781f56() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddIndex thisObj = new AddIndex(identifier, indexDefinition);
//
//    // Act
//    final IndexDefinition actual = thisObj.getIndexDef();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexType());
//    Assert.assertNotNull(actual.getColumns());
//    Assert.assertEquals(1, actual.getColumns().size());
//    Assert.assertNotNull(actual.getColumns().get(0));
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getColumns().get(0).isAsc());
//    Assert.assertNull(actual.getColumns().get(0).getLength());
//    Assert.assertNotNull(actual.getOptions());
//    Assert.assertEquals(1, actual.getOptions().size());
//    Assert.assertNotNull(actual.getOptions().get(0));
//    Assert.assertNull(actual.getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getOptions().get(0).getComment());
//    Assert.assertNull(actual.getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getOptions().get(0).getParserName());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexNameOutputNotNull999891007b6be1938b0() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddIndex thisObj = new AddIndex(identifier, indexDefinition);
//
//    // Act
//    final Identifier actual = thisObj.getIndexName();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent().getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getParent().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
//    Assert.assertEquals("aakaa", actual.getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acceptInputNotNullOutputUnsupportedOperationException999b9cd4df5db1d36d8() {
//
//    // Arrange
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(null, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddPrimaryKey thisObj = new AddPrimaryKey(indexDefinition);
//    final StringBuilder stringBuilder = new StringBuilder();
//    final MySQLOutputASTVisitor arg0 = new MySQLOutputASTVisitor(stringBuilder);
//
//    // Act
//    thrown.expect(UnsupportedOperationException.class);
//    thisObj.accept(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999c1a101a0f01a92a1() {

    // Arrange
    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
    final Identifier identifier = new Identifier(null, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
    arrayList.add(indexColumnName);
    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final IndexOption indexOption = new IndexOption(arithmeticAddExpression1);
    arrayList1.add(indexOption);
    final IndexDefinition arg0 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);

    // Act, creating object to test constructor
    final AddPrimaryKey actual = new AddPrimaryKey(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getIndexDef());
    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexDef().getIndexType());
    Assert.assertNotNull(actual.getIndexDef().getColumns());
    Assert.assertEquals(1, actual.getIndexDef().getColumns().size());
    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0));
    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName());
    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getIdTextUpUnescape());
    Assert.assertNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent());
    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getIdText());
    Assert.assertTrue(actual.getIndexDef().getColumns().get(0).isAsc());
    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getLength());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getRightOprand());
    Assert.assertNotNull(actual.getIndexDef().getOptions());
    Assert.assertEquals(1, actual.getIndexDef().getOptions().size());
    Assert.assertNotNull(actual.getIndexDef().getOptions().get(0));
    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getIndexType());
    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getComment());
    Assert.assertNotNull(actual.getIndexDef().getOptions().get(0).getKeyBlockSize());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getIndexDef().getOptions().get(0).getKeyBlockSize()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getIndexDef().getOptions().get(0).getKeyBlockSize()).getPrecedence());
    Assert.assertEquals(actual.getIndexDef().getColumns().get(0).getLength(), ((ArithmeticAddExpression) actual.getIndexDef().getOptions().get(0).getKeyBlockSize()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getOptions().get(0).getKeyBlockSize()).getRightOprand());
    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getParserName());

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexDefOutputNotNull99996b43f9253f3604b() {
//
//    // Arrange
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(null, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddPrimaryKey thisObj = new AddPrimaryKey(indexDefinition);
//
//    // Act
//    final IndexDefinition actual = thisObj.getIndexDef();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexType());
//    Assert.assertNotNull(actual.getColumns());
//    Assert.assertEquals(1, actual.getColumns().size());
//    Assert.assertNotNull(actual.getColumns().get(0));
//    Assert.assertNull(actual.getColumns().get(0).getColumnName());
//    Assert.assertTrue(actual.getColumns().get(0).isAsc());
//    Assert.assertNull(actual.getColumns().get(0).getLength());
//    Assert.assertNotNull(actual.getOptions());
//    Assert.assertEquals(1, actual.getOptions().size());
//    Assert.assertNotNull(actual.getOptions().get(0));
//    Assert.assertNull(actual.getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getOptions().get(0).getComment());
//    Assert.assertNull(actual.getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getOptions().get(0).getParserName());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acceptInputNotNullOutputUnsupportedOperationException9999ea7b5390e71e019() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddSpatialIndex thisObj = new AddSpatialIndex(identifier, indexDefinition);
//    final StringBuilder stringBuilder = new StringBuilder();
//    final MySQLOutputASTVisitor arg0 = new MySQLOutputASTVisitor(stringBuilder);
//
//    // Act
//    thrown.expect(UnsupportedOperationException.class);
//    thisObj.accept(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull999b082ea2a061ff652() {
//
//    // Arrange
//    final Identifier identifier1 = new Identifier(null, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aaaaa");
//    final Identifier arg0 = new Identifier(identifier, "aaaaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//
//    // Act, creating object to test constructor
//    final AddSpatialIndex actual = new AddSpatialIndex(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getIndexDef());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexDef().getIndexType());
//    Assert.assertNotNull(actual.getIndexDef().getColumns());
//    Assert.assertEquals(1, actual.getIndexDef().getColumns().size());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0));
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getIndexDef().getColumns().get(0).isAsc());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(actual.getIndexDef().getOptions());
//    Assert.assertEquals(1, actual.getIndexDef().getOptions().size());
//    Assert.assertNotNull(actual.getIndexDef().getOptions().get(0));
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getComment());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getParserName());
//    Assert.assertNotNull(actual.getIndexName());
//    Assert.assertEquals("AAAAA", actual.getIndexName().getIdTextUpUnescape());
//    Assert.assertEquals(actual.getIndexDef().getColumns().get(0).getColumnName(), actual.getIndexName().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexName().getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexDefOutputNotNull9998a899626728f5de2() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddSpatialIndex thisObj = new AddSpatialIndex(identifier, indexDefinition);
//
//    // Act
//    final IndexDefinition actual = thisObj.getIndexDef();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexType());
//    Assert.assertNotNull(actual.getColumns());
//    Assert.assertEquals(1, actual.getColumns().size());
//    Assert.assertNotNull(actual.getColumns().get(0));
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getColumns().get(0).isAsc());
//    Assert.assertNull(actual.getColumns().get(0).getLength());
//    Assert.assertNotNull(actual.getOptions());
//    Assert.assertEquals(1, actual.getOptions().size());
//    Assert.assertNotNull(actual.getOptions().get(0));
//    Assert.assertNull(actual.getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getOptions().get(0).getComment());
//    Assert.assertNull(actual.getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getOptions().get(0).getParserName());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexNameOutputNotNull999a40e814040b562e0() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddSpatialIndex thisObj = new AddSpatialIndex(identifier, indexDefinition);
//
//    // Act
//    final Identifier actual = thisObj.getIndexName();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent().getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getParent().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
//    Assert.assertEquals("aakaa", actual.getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acceptInputNotNullOutputUnsupportedOperationException9991d4ac7b6ddb47f91() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddUniqueKey thisObj = new AddUniqueKey(identifier, indexDefinition);
//    final StringBuilder stringBuilder = new StringBuilder();
//    final MySQLOutputASTVisitor arg0 = new MySQLOutputASTVisitor(stringBuilder);
//
//    // Act
//    thrown.expect(UnsupportedOperationException.class);
//    thisObj.accept(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull999a82a45db7b94cf4b() {
//
//    // Arrange
//    final Identifier identifier1 = new Identifier(null, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aaaaa");
//    final Identifier arg0 = new Identifier(identifier, "aaaaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//
//    // Act, creating object to test constructor
//    final AddUniqueKey actual = new AddUniqueKey(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getIndexDef());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexDef().getIndexType());
//    Assert.assertNotNull(actual.getIndexDef().getColumns());
//    Assert.assertEquals(1, actual.getIndexDef().getColumns().size());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0));
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getIndexDef().getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getIndexDef().getColumns().get(0).isAsc());
//    Assert.assertNotNull(actual.getIndexDef().getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) actual.getIndexDef().getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(actual.getIndexDef().getOptions());
//    Assert.assertEquals(1, actual.getIndexDef().getOptions().size());
//    Assert.assertNotNull(actual.getIndexDef().getOptions().get(0));
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getComment());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getIndexDef().getOptions().get(0).getParserName());
//    Assert.assertNotNull(actual.getIndexName());
//    Assert.assertEquals("AAAAA", actual.getIndexName().getIdTextUpUnescape());
//    Assert.assertEquals(actual.getIndexDef().getColumns().get(0).getColumnName(), actual.getIndexName().getParent());
//    Assert.assertEquals("aaaaa", actual.getIndexName().getIdText());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexDefOutputNotNull99932dafd35b3276561() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddUniqueKey thisObj = new AddUniqueKey(identifier, indexDefinition);
//
//    // Act
//    final IndexDefinition actual = thisObj.getIndexDef();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexType());
//    Assert.assertNotNull(actual.getColumns());
//    Assert.assertEquals(1, actual.getColumns().size());
//    Assert.assertNotNull(actual.getColumns().get(0));
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getColumns().get(0).getColumnName().getParent());
//    Assert.assertEquals("AAAAA", actual.getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getColumns().get(0).getColumnName().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getColumns().get(0).getColumnName().getIdText());
//    Assert.assertTrue(actual.getColumns().get(0).isAsc());
//    Assert.assertNull(actual.getColumns().get(0).getLength());
//    Assert.assertNotNull(actual.getOptions());
//    Assert.assertEquals(1, actual.getOptions().size());
//    Assert.assertNotNull(actual.getOptions().get(0));
//    Assert.assertNull(actual.getOptions().get(0).getIndexType());
//    Assert.assertNull(actual.getOptions().get(0).getComment());
//    Assert.assertNull(actual.getOptions().get(0).getKeyBlockSize());
//    Assert.assertNull(actual.getOptions().get(0).getParserName());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getIndexNameOutputNotNull9992feea1adc7b02db7() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, null, true);
//    arrayList.add(indexColumnName);
//    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>();
//    final IndexOption indexOption = new IndexOption(null);
//    arrayList1.add(indexOption);
//    final IndexDefinition indexDefinition = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);
//    final AddUniqueKey thisObj = new AddUniqueKey(identifier, indexDefinition);
//
//    // Act
//    final Identifier actual = thisObj.getIndexName();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getParent().getParent());
//    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getParent().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
//    Assert.assertEquals("aakaa", actual.getIdText());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99998949b9c0f5571e0() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final AlterColumnDefaultVal thisObj = new AlterColumnDefaultVal(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999920270ae4f920db1() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final AlterColumnDefaultVal actual = new AlterColumnDefaultVal(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColumnName());
    Assert.assertEquals("AAAAA", actual.getColumnName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnName().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColumnName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColumnName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnName().getIdText());
    Assert.assertNotNull(actual.getDefaultValue());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDefaultValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDefaultValue()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultValue()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getDefaultValue()).getRightOprand());
    Assert.assertFalse(actual.isDropDefault());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999920edba24a8395c7() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final AlterColumnDefaultVal actual = new AlterColumnDefaultVal(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColumnName());
    Assert.assertEquals("AAAAA", actual.getColumnName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnName().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumnName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getColumnName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColumnName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColumnName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColumnName().getIdText());
    Assert.assertNull(actual.getDefaultValue());
    Assert.assertTrue(actual.isDropDefault());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnNameOutputNotNull999c029e09fdde43dd7() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final AlterColumnDefaultVal thisObj = new AlterColumnDefaultVal(identifier);

    // Act
    final Identifier actual = thisObj.getColumnName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDefaultValueOutputVoid999e718c0b2846dac66() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final AlterColumnDefaultVal thisObj = new AlterColumnDefaultVal(identifier);

    // Act
    final Expression actual = thisObj.getDefaultValue();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isDropDefaultOutputTrue9992fe7b47a60a73f8f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final AlterColumnDefaultVal thisObj = new AlterColumnDefaultVal(identifier);

    // Act
    final boolean actual = thisObj.isDropDefault();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9996ec4e29ba74ff297() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier2, identifier, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final ChangeColumn thisObj = new ChangeColumn(identifier, identifier1, columnDefinition);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullNotNullOutputNotNull999ef1068764cbff7b0() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final Identifier arg1 = identifier;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, arg0, identifier, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg2 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final Identifier arg3 = identifier1;

    // Act, creating object to test constructor
    final ChangeColumn actual = new ChangeColumn(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColDef());
    Assert.assertNotNull(actual.getColDef().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getColDef().getDataType());
    Assert.assertNotNull(actual.getColDef().getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), actual.getColDef().getDataType().getLength());
    Assert.assertTrue(actual.getColDef().getDataType().isZerofill());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColDef().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getColDef().getDataType().getCollectionVals().size());
    Assert.assertEquals(actual.getColDef().getDataType().getDecimals(), actual.getColDef().getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getColDef().getDataType().isBinary());
    Assert.assertNotNull(actual.getColDef().getDataType().getCharSet());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCharSet().getIdTextUpUnescape());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getColDef().getDataType().getCharSet().getParent());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCharSet().getIdText());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getColDef().getDataType().getTypeName());
    Assert.assertTrue(actual.getColDef().getDataType().isUnsigned());
    Assert.assertNotNull(actual.getColDef().getComment());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getIntroducer());
    Assert.assertTrue(actual.getColDef().getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColDef().getColumnFormat());
    Assert.assertTrue(actual.getColDef().isNotNull());
    Assert.assertTrue(actual.getColDef().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getColDef().getSpecialIndex());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation().getParent(), actual.getAfterColumn());
    Assert.assertFalse(actual.isFirst());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getNewName());
    Assert.assertEquals(actual.getColDef().getDataType().getCharSet(), actual.getOldName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull9993ab1e6930d64431c() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final Identifier arg1 = identifier;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, arg0, identifier, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg2 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act, creating object to test constructor
    final ChangeColumn actual = new ChangeColumn(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColDef());
    Assert.assertNotNull(actual.getColDef().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getColDef().getDataType());
    Assert.assertNotNull(actual.getColDef().getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), actual.getColDef().getDataType().getLength());
    Assert.assertTrue(actual.getColDef().getDataType().isZerofill());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColDef().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getColDef().getDataType().getCollectionVals().size());
    Assert.assertEquals(actual.getColDef().getDataType().getDecimals(), actual.getColDef().getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getColDef().getDataType().isBinary());
    Assert.assertNotNull(actual.getColDef().getDataType().getCharSet());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCharSet().getIdTextUpUnescape());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getColDef().getDataType().getCharSet().getParent());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCharSet().getIdText());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getColDef().getDataType().getTypeName());
    Assert.assertTrue(actual.getColDef().getDataType().isUnsigned());
    Assert.assertNotNull(actual.getColDef().getComment());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getIntroducer());
    Assert.assertTrue(actual.getColDef().getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColDef().getColumnFormat());
    Assert.assertTrue(actual.getColDef().isNotNull());
    Assert.assertTrue(actual.getColDef().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getColDef().getSpecialIndex());
    Assert.assertNull(actual.getAfterColumn());
    Assert.assertFalse(actual.isFirst());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getNewName());
    Assert.assertEquals(actual.getColDef().getDataType().getCharSet(), actual.getOldName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAfterColumnOutputVoid99918eb655c9748be70() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier2, identifier, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final ChangeColumn thisObj = new ChangeColumn(identifier, identifier1, columnDefinition);

    // Act
    final Identifier actual = thisObj.getAfterColumn();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getColDefOutputNotNull99964cd0be6d7a5f9db() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier2, identifier, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final ChangeColumn thisObj = new ChangeColumn(identifier, identifier1, columnDefinition);

    // Act
    final ColumnDefinition actual = thisObj.getColDef();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getRightOprand());
    Assert.assertNotNull(actual.getDataType());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getDecimals());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getLength());
    Assert.assertTrue(actual.getDataType().isZerofill());
    Assert.assertNotNull(actual.getDataType().getCollation());
    Assert.assertEquals("AAKAA", actual.getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", actual.getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getDataType().getCollation().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getDataType().getCollation().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getDataType().getCollation().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getDataType().getCollation().getIdText());
    final ArrayList<Expression> arrayList1 = new ArrayList<Expression>();
    arrayList1.add(null);
    Assert.assertEquals(arrayList1, actual.getDataType().getCollectionVals());
    Assert.assertTrue(actual.getDataType().isBinary());
    Assert.assertEquals(actual.getDataType().getCollation().getParent().getParent(), actual.getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getDataType().getTypeName());
    Assert.assertTrue(actual.getDataType().isUnsigned());
    Assert.assertNotNull(actual.getComment());
    Assert.assertEquals("aaaaa", actual.getComment().getIntroducer());
    Assert.assertTrue(actual.getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColumnFormat());
    Assert.assertTrue(actual.isNotNull());
    Assert.assertTrue(actual.isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getSpecialIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getNewNameOutputNotNull9998d0a8f0e3add0e03() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier2, identifier, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final ChangeColumn thisObj = new ChangeColumn(identifier, identifier1, columnDefinition);

    // Act
    final Identifier actual = thisObj.getNewName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAAAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOldNameOutputNotNull99987fcbb84c10ec806() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier2, identifier, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final ChangeColumn thisObj = new ChangeColumn(identifier, identifier1, columnDefinition);

    // Act
    final Identifier actual = thisObj.getOldName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void isFirstOutputFalse999263cf39e9173682a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier2, identifier, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final ChangeColumn thisObj = new ChangeColumn(identifier, identifier1, columnDefinition);

    // Act
    final boolean actual = thisObj.isFirst();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999c6e8f679ef76e059() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addAlterSpecificationInputNotNullOutputNotNull99974013738c5f1672c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier1, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "akaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final AddColumn arg0 = new AddColumn(identifier2, columnDefinition);

    // Act
    final DDLAlterTableStatement actual = thisObj.addAlterSpecification(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAlters());
    Assert.assertEquals(1, thisObj.getAlters().size());
    Assert.assertNotNull(thisObj.getAlters().get(0));
    Assert.assertNotNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine());
    Assert.assertNotNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertNotNull(((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).getRightOprand());
    Assert.assertNotNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType());
    Assert.assertEquals(((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand(), ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getDecimals());
    Assert.assertEquals(((ArithmeticAddExpression) ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand(), ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getLength());
    Assert.assertTrue(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().isZerofill());
    Assert.assertNotNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation());
    Assert.assertEquals("AAAAA", ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("aaaaa", ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getIdText());
    final ArrayList<Expression> arrayList1 = new ArrayList<Expression>();
    arrayList1.add(null);
    Assert.assertEquals(arrayList1, ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollectionVals());
    Assert.assertTrue(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().isBinary());
    Assert.assertEquals(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation(), ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getTypeName());
    Assert.assertTrue(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().isUnsigned());
    Assert.assertNotNull(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getComment());
    Assert.assertEquals("aaaaa", ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getComment().getIntroducer());
    Assert.assertTrue(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getComment().isNchars());
    Assert.assertEquals("akaaa", ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getColumnFormat());
    Assert.assertTrue(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().isNotNull());
    Assert.assertTrue(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, ((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getSpecialIndex());
    Assert.assertNull(((AddColumn) thisObj.getAlters().get(0)).getAfterColumn());
    Assert.assertFalse(((AddColumn) thisObj.getAlters().get(0)).isFirst());
    Assert.assertEquals(((AddColumn) thisObj.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent(), ((AddColumn) thisObj.getAlters().get(0)).getColumnName());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isEnableKeys());
    Assert.assertNull(actual.getRenameTo());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertFalse(actual.isDiscardTableSpace());
    Assert.assertNotNull(actual.getAlters());
    Assert.assertEquals(1, actual.getAlters().size());
    Assert.assertNotNull(actual.getAlters().get(0));
    Assert.assertNotNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine());
    Assert.assertNotNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertNotNull(((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getRightOprand()).getRightOprand());
    Assert.assertNotNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType());
    Assert.assertEquals(((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand(), ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getDecimals());
    Assert.assertEquals(((ArithmeticAddExpression) ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDefaultVal()).getLeftOprand(), ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getLength());
    Assert.assertTrue(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().isZerofill());
    Assert.assertNotNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation());
    Assert.assertEquals("AAAAA", ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("aaaaa", ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getIdText());
    final ArrayList<Expression> arrayList2 = new ArrayList<Expression>();
    arrayList2.add(null);
    Assert.assertEquals(arrayList2, ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollectionVals());
    Assert.assertTrue(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().isBinary());
    Assert.assertEquals(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation(), ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getTypeName());
    Assert.assertTrue(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().isUnsigned());
    Assert.assertNotNull(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getComment());
    Assert.assertEquals("aaaaa", ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getComment().getIntroducer());
    Assert.assertTrue(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getComment().isNchars());
    Assert.assertEquals("akaaa", ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getColumnFormat());
    Assert.assertTrue(((AddColumn) actual.getAlters().get(0)).getColumnDefine().isNotNull());
    Assert.assertTrue(((AddColumn) actual.getAlters().get(0)).getColumnDefine().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, ((AddColumn) actual.getAlters().get(0)).getColumnDefine().getSpecialIndex());
    Assert.assertNull(((AddColumn) actual.getAlters().get(0)).getAfterColumn());
    Assert.assertFalse(((AddColumn) actual.getAlters().get(0)).isFirst());
    Assert.assertEquals(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation().getParent(), ((AddColumn) actual.getAlters().get(0)).getColumnName());
    Assert.assertNull(actual.getTableOptions());
    Assert.assertNull(actual.getConvertCharset());
    Assert.assertFalse(actual.isDisableKeys());
    Assert.assertFalse(actual.isImportTableSpace());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AKAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertEquals(((AddColumn) actual.getAlters().get(0)).getColumnDefine().getDataType().getCollation(), actual.getTable().getParent());
    Assert.assertEquals("akaaa", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullOutputNotNull9992797baae5c9fee7d() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");

    // Act, creating object to test constructor
    final DDLAlterTableStatement actual = new DDLAlterTableStatement(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isEnableKeys());
    Assert.assertNull(actual.getRenameTo());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertFalse(actual.isDiscardTableSpace());
    final ArrayList<DDLAlterTableStatement.AlterSpecification> arrayList = new ArrayList<DDLAlterTableStatement.AlterSpecification>();
    Assert.assertEquals(arrayList, actual.getAlters());
    Assert.assertNull(actual.getTableOptions());
    Assert.assertNull(actual.getConvertCharset());
    Assert.assertFalse(actual.isDisableKeys());
    Assert.assertFalse(actual.isImportTableSpace());
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

  }

  // Test written by Diffblue Cover
  @Test
  public void getAltersOutput0999c0d8f1c197812b73() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final List<DDLAlterTableStatement.AlterSpecification> actual = thisObj.getAlters();

    // Assert result
    final ArrayList<DDLAlterTableStatement.AlterSpecification> arrayList = new ArrayList<DDLAlterTableStatement.AlterSpecification>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getConvertCharsetOutputVoid99941915fb0fd0401fe() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final Pair<Identifier, Identifier> actual = thisObj.getConvertCharset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRenameToOutputVoid999d5209016bf548e44() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final Identifier actual = thisObj.getRenameTo();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOptionsOutputVoid999b6c77dd76683128f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final TableOptions actual = thisObj.getTableOptions();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull99901cb1b09321ce1d4() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

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
  public void isDisableKeysOutputFalse999c3fd1cefd972ee93() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final boolean actual = thisObj.isDisableKeys();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDiscardTableSpaceOutputFalse999b9a4dce54e366782() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final boolean actual = thisObj.isDiscardTableSpace();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isEnableKeysOutputFalse9990c7dce6b58672f79() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final boolean actual = thisObj.isEnableKeys();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isIgnoreOutputTrue999c075b095de484fe1() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final boolean actual = thisObj.isIgnore();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isImportTableSpaceOutputFalse99968ec55f6f5b9248a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);

    // Act
    final boolean actual = thisObj.isImportTableSpace();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setConvertCharsetInputNotNullOutputVoid999dfb9b146bbd9b02a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final Pair<Identifier, Identifier> arg0 = new Pair<Identifier, Identifier>(identifier2, identifier);

    // Act
    thisObj.setConvertCharset(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getConvertCharset());
    Assert.assertNotNull(thisObj.getConvertCharset().getKey());
    Assert.assertEquals("AAAAA", thisObj.getConvertCharset().getKey().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getConvertCharset().getKey().getParent());
    Assert.assertEquals("aaaaa", thisObj.getConvertCharset().getKey().getIdText());
    Assert.assertNotNull(thisObj.getConvertCharset().getValue());
    Assert.assertEquals("AKAAA", thisObj.getConvertCharset().getValue().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getConvertCharset().getValue().getParent());
    Assert.assertEquals("AAAAA", thisObj.getConvertCharset().getValue().getParent().getIdTextUpUnescape());
    Assert.assertEquals(thisObj.getConvertCharset().getKey(), thisObj.getConvertCharset().getValue().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getConvertCharset().getValue().getParent().getIdText());
    Assert.assertEquals("akaaa", thisObj.getConvertCharset().getValue().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDisableKeysInputTrueOutputVoid999ed1e4ef58b6fcd3f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final boolean arg0 = true;

    // Act
    thisObj.setDisableKeys(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDisableKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDiscardTableSpaceInputTrueOutputVoid999cc8316cee1c23261() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final boolean arg0 = true;

    // Act
    thisObj.setDiscardTableSpace(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDiscardTableSpace());

  }

  // Test written by Diffblue Cover
  @Test
  public void setEnableKeysInputTrueOutputVoid999918c03d329e58b30() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final boolean arg0 = true;

    // Act
    thisObj.setEnableKeys(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isEnableKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void setImportTableSpaceInputTrueOutputVoid9991bc5f96f302e99e0() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final boolean arg0 = true;

    // Act
    thisObj.setImportTableSpace(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isImportTableSpace());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRenameToInputNotNullOutputVoid9994c48a1e90fb9b497() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final Identifier arg0 = identifier1;

    // Act
    thisObj.setRenameTo(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getRenameTo());
    Assert.assertEquals("AAAAA", thisObj.getRenameTo().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getRenameTo().getParent());
    Assert.assertEquals("AAAAA", thisObj.getRenameTo().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getRenameTo().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getRenameTo().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getRenameTo().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableOptionsInputNotNullOutputVoid999845fcfb26bc7709a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final DDLAlterTableStatement thisObj = new DDLAlterTableStatement(true, identifier);
    final TableOptions arg0 = new TableOptions();

    // Act
    thisObj.setTableOptions(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTableOptions());
    Assert.assertNull(thisObj.getTableOptions().getPackKeys());
    Assert.assertNull(thisObj.getTableOptions().getMaxRows());
    Assert.assertNull(thisObj.getTableOptions().getCharSet());
    Assert.assertNull(thisObj.getTableOptions().getEngine());
    Assert.assertNull(thisObj.getTableOptions().getDelayKeyWrite());
    Assert.assertNull(thisObj.getTableOptions().getConnection());
    Assert.assertNull(thisObj.getTableOptions().getAvgRowLength());
    Assert.assertNull(thisObj.getTableOptions().getCheckSum());
    Assert.assertNull(thisObj.getTableOptions().getKeyBlockSize());
    Assert.assertNull(thisObj.getTableOptions().getMinRows());
    Assert.assertNull(thisObj.getTableOptions().getDataDir());
    Assert.assertNull(thisObj.getTableOptions().getCollation());
    Assert.assertNull(thisObj.getTableOptions().getComment());
    Assert.assertNull(thisObj.getTableOptions().getInsertMethod());
    Assert.assertNull(thisObj.getTableOptions().getPassword());
    Assert.assertNull(thisObj.getTableOptions().getRowFormat());
    Assert.assertNull(thisObj.getTableOptions().getIndexDir());
    Assert.assertNull(thisObj.getTableOptions().getAutoIncrement());
    Assert.assertNull(thisObj.getTableOptions().getUnion());

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9995ffcd1a6432dca9c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLAlterTableStatement.DropColumn thisObj = new DDLAlterTableStatement.DropColumn(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99953ed5fe9756c2d84() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final DDLAlterTableStatement.DropColumn actual = new DDLAlterTableStatement.DropColumn(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getColName());
    Assert.assertEquals("AAAAA", actual.getColName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColName().getParent());
    Assert.assertEquals("AAAAA", actual.getColName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getColName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColName().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColNameOutputNotNull999b2611f7ab046cf5f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLAlterTableStatement.DropColumn thisObj = new DDLAlterTableStatement.DropColumn(identifier);

    // Act
    final Identifier actual = thisObj.getColName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d58dc9fd51068e61() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLAlterTableStatement.DropIndex thisObj = new DDLAlterTableStatement.DropIndex(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9997c42a429185fd507() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final DDLAlterTableStatement.DropIndex actual = new DDLAlterTableStatement.DropIndex(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getIndexName());
    Assert.assertEquals("AAAAA", actual.getIndexName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getIndexName().getParent());
    Assert.assertEquals("AAAAA", actual.getIndexName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getIndexName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getIndexName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getIndexName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getIndexName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getIndexName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getIndexName().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexNameOutputNotNull9998ba53b054c3f768d() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLAlterTableStatement.DropIndex thisObj = new DDLAlterTableStatement.DropIndex(identifier);

    // Act
    final Identifier actual = thisObj.getIndexName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999afb569602ebafb8b() {

    // Arrange
    final DDLAlterTableStatement.DropPrimaryKey thisObj = new DDLAlterTableStatement.DropPrimaryKey();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e8b4aa300042e118() {

    // Act, creating object to test constructor
    final DDLAlterTableStatement.DropPrimaryKey actual = new DDLAlterTableStatement.DropPrimaryKey();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9995f41a3a508119eb5() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.ModifyColumn thisObj = new DDLAlterTableStatement.ModifyColumn(identifier, columnDefinition);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull9998cccb9a743963fe2() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, arg0, arg0, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg1 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final Identifier arg2 = identifier;

    // Act, creating object to test constructor
    final DDLAlterTableStatement.ModifyColumn actual = new DDLAlterTableStatement.ModifyColumn(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getAfterColumn());
    Assert.assertEquals("AAAAA", actual.getAfterColumn().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getAfterColumn().getParent());
    Assert.assertEquals("AAAAA", actual.getAfterColumn().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getAfterColumn().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getAfterColumn().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getAfterColumn().getIdText());
    Assert.assertFalse(actual.isFirst());
    Assert.assertNotNull(actual.getColDef());
    Assert.assertNotNull(actual.getColDef().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getColDef().getDataType());
    Assert.assertNotNull(actual.getColDef().getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), actual.getColDef().getDataType().getLength());
    Assert.assertTrue(actual.getColDef().getDataType().isZerofill());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertEquals(actual.getAfterColumn(), actual.getColDef().getDataType().getCollation().getParent());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getColDef().getDataType().getCollectionVals().size());
    Assert.assertEquals(actual.getColDef().getDataType().getDecimals(), actual.getColDef().getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getColDef().getDataType().isBinary());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getColDef().getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getColDef().getDataType().getTypeName());
    Assert.assertTrue(actual.getColDef().getDataType().isUnsigned());
    Assert.assertNotNull(actual.getColDef().getComment());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getIntroducer());
    Assert.assertTrue(actual.getColDef().getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColDef().getColumnFormat());
    Assert.assertTrue(actual.getColDef().isNotNull());
    Assert.assertTrue(actual.getColDef().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getColDef().getSpecialIndex());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getColName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9996e04c8b6387dcf96() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, arg0, arg0, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg1 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act, creating object to test constructor
    final DDLAlterTableStatement.ModifyColumn actual = new DDLAlterTableStatement.ModifyColumn(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAfterColumn());
    Assert.assertFalse(actual.isFirst());
    Assert.assertNotNull(actual.getColDef());
    Assert.assertNotNull(actual.getColDef().getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getRightOprand());
    Assert.assertNotNull(actual.getColDef().getDataType());
    Assert.assertNotNull(actual.getColDef().getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColDef().getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColDef().getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(actual.getColDef().getDefaultVal(), actual.getColDef().getDataType().getLength());
    Assert.assertTrue(actual.getColDef().getDataType().isZerofill());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation().getParent());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollation().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getColDef().getDataType().getCollation().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColDef().getDataType().getCollation().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getColDef().getDataType().getCollation().getIdText());
    Assert.assertNotNull(actual.getColDef().getDataType().getCollectionVals());
    Assert.assertEquals(1, actual.getColDef().getDataType().getCollectionVals().size());
    Assert.assertEquals(actual.getColDef().getDataType().getDecimals(), actual.getColDef().getDataType().getCollectionVals().get(0));
    Assert.assertTrue(actual.getColDef().getDataType().isBinary());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getColDef().getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getColDef().getDataType().getTypeName());
    Assert.assertTrue(actual.getColDef().getDataType().isUnsigned());
    Assert.assertNotNull(actual.getColDef().getComment());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getIntroducer());
    Assert.assertTrue(actual.getColDef().getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getColDef().getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColDef().getColumnFormat());
    Assert.assertTrue(actual.getColDef().isNotNull());
    Assert.assertTrue(actual.getColDef().isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getColDef().getSpecialIndex());
    Assert.assertEquals(actual.getColDef().getDataType().getCollation(), actual.getColName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAfterColumnOutputVoid999b92dc43d67f06407() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.ModifyColumn thisObj = new DDLAlterTableStatement.ModifyColumn(identifier, columnDefinition);

    // Act
    final Identifier actual = thisObj.getAfterColumn();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getColDefOutputNotNull999628f7a3453e77665() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.ModifyColumn thisObj = new DDLAlterTableStatement.ModifyColumn(identifier, columnDefinition);

    // Act
    final ColumnDefinition actual = thisObj.getColDef();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getDefaultVal()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand()).getRightOprand());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getDefaultVal()).getRightOprand()).getRightOprand());
    Assert.assertNotNull(actual.getDataType());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getDecimals());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getDefaultVal()).getLeftOprand(), actual.getDataType().getLength());
    Assert.assertTrue(actual.getDataType().isZerofill());
    Assert.assertNotNull(actual.getDataType().getCollation());
    Assert.assertEquals("AAAAA", actual.getDataType().getCollation().getIdTextUpUnescape());
    Assert.assertNull(actual.getDataType().getCollation().getParent());
    Assert.assertEquals("aaaaa", actual.getDataType().getCollation().getIdText());
    final ArrayList<Expression> arrayList1 = new ArrayList<Expression>();
    arrayList1.add(null);
    Assert.assertEquals(arrayList1, actual.getDataType().getCollectionVals());
    Assert.assertTrue(actual.getDataType().isBinary());
    Assert.assertNotNull(actual.getDataType().getCharSet());
    Assert.assertEquals("AAAAA", actual.getDataType().getCharSet().getIdTextUpUnescape());
    Assert.assertEquals(actual.getDataType().getCollation(), actual.getDataType().getCharSet().getParent());
    Assert.assertEquals("aaaaa", actual.getDataType().getCharSet().getIdText());
    Assert.assertEquals(DataType.DataTypeName.BIT, actual.getDataType().getTypeName());
    Assert.assertTrue(actual.getDataType().isUnsigned());
    Assert.assertNotNull(actual.getComment());
    Assert.assertEquals("aaaaa", actual.getComment().getIntroducer());
    Assert.assertTrue(actual.getComment().isNchars());
    Assert.assertEquals("aaaaa", actual.getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, actual.getColumnFormat());
    Assert.assertTrue(actual.isNotNull());
    Assert.assertTrue(actual.isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, actual.getSpecialIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColNameOutputNotNull99952a8f692d40f8903() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.ModifyColumn thisObj = new DDLAlterTableStatement.ModifyColumn(identifier, columnDefinition);

    // Act
    final Identifier actual = thisObj.getColName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void isFirstOutputFalse999dce47ac8eb380782() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.ModifyColumn thisObj = new DDLAlterTableStatement.ModifyColumn(identifier, columnDefinition);

    // Act
    final boolean actual = thisObj.isFirst();

    // Assert result
    Assert.assertFalse(actual);

  }
}
