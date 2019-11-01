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
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLCreateTableStatement.SelectOption;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLCreateTableStatement;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLSelectStatement;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



public class DDLCreateTableStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99907f8e84de235a210() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addCheckInputNotNullOutputNotNull999827f033f26d250da() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    final DDLCreateTableStatement actual = thisObj.addCheck(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getChecks());
    Assert.assertEquals(1, thisObj.getChecks().size());
    Assert.assertNotNull(thisObj.getChecks().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getChecks().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) thisObj.getChecks().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getChecks().get(0)).getRightOprand());

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual.getKeys());
    Assert.assertTrue(actual.isIfNotExists());
    Assert.assertNull(actual.getSelect());
    Assert.assertNull(actual.getPrimaryKey());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList1, actual.getSpatialKeys());
    Assert.assertNotNull(actual.getChecks());
    Assert.assertEquals(1, actual.getChecks().size());
    Assert.assertNotNull(actual.getChecks().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getChecks().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getChecks().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getChecks().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getChecks().get(0)).getRightOprand());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList2 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList2, actual.getFullTextKeys());
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList3 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList3, actual.getColDefs());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
    Assert.assertNull(actual.getTableOptions());
    Assert.assertTrue(actual.isTemporary());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList4 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList4, actual.getUniqueKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void addColumnDefinitionInputNotNullNotNullOutputNotNull999b5ce6dfa00020792() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
    final Identifier arg0 = identifier1;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg1 = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    final DDLCreateTableStatement actual = thisObj.addColumnDefinition(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColDefs());
    Assert.assertEquals(1, thisObj.getColDefs().size());
    Assert.assertNotNull(thisObj.getColDefs().get(0));
    Assert.assertNotNull(((Pair) thisObj.getColDefs().get(0)).getKey());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) thisObj.getColDefs().get(0)).getValue());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal()).getRightOprand());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDefaultVal(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals(), ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getLength());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().isZerofill());
    Assert.assertEquals(((Identifier) ((Pair) thisObj.getColDefs().get(0)).getKey()).getParent(), ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getCollation());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getCollectionVals());
    Assert.assertEquals(1, ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getCollectionVals().size());
    Assert.assertEquals(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getDecimals(), ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getCollectionVals().get(0));
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().isBinary());
    Assert.assertEquals(((Pair) thisObj.getColDefs().get(0)).getKey(), ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().getTypeName());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getDataType().isUnsigned());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getComment());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getComment().getIntroducer());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getComment().isNchars());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getColumnFormat());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).isNotNull());
    Assert.assertTrue(((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, ((ColumnDefinition) ((Pair) thisObj.getColDefs().get(0)).getValue()).getSpecialIndex());

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList1, actual.getKeys());
    Assert.assertTrue(actual.isIfNotExists());
    Assert.assertNull(actual.getSelect());
    Assert.assertNull(actual.getPrimaryKey());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList2 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList2, actual.getSpatialKeys());
    final ArrayList<Expression> arrayList3 = new ArrayList<Expression>();
    Assert.assertEquals(arrayList3, actual.getChecks());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList4 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList4, actual.getFullTextKeys());
    Assert.assertNotNull(actual.getColDefs());
    Assert.assertEquals(1, actual.getColDefs().size());
    Assert.assertNotNull(actual.getColDefs().get(0));
    Assert.assertNotNull(((Pair) actual.getColDefs().get(0)).getKey());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) actual.getColDefs().get(0)).getValue());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal()).getRightOprand());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals());
    Assert.assertTrue(((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals()).getPrecedence());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals()).getLeftOprand());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDefaultVal(), ((ArithmeticAddExpression) ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals()).getRightOprand());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals(), ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getLength());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().isZerofill());
    Assert.assertEquals(((Identifier) ((Pair) actual.getColDefs().get(0)).getKey()).getParent(), ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getCollation());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getCollectionVals());
    Assert.assertEquals(1, ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getCollectionVals().size());
    Assert.assertEquals(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getDecimals(), ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getCollectionVals().get(0));
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().isBinary());
    Assert.assertEquals(((Pair) actual.getColDefs().get(0)).getKey(), ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getCharSet());
    Assert.assertEquals(DataType.DataTypeName.BIT, ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().getTypeName());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getDataType().isUnsigned());
    Assert.assertNotNull(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getComment());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getComment().getIntroducer());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getComment().isNchars());
    Assert.assertEquals("aaaaa", ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getComment().getString());
    Assert.assertEquals(ColumnDefinition.ColumnFormat.FIXED, ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getColumnFormat());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).isNotNull());
    Assert.assertTrue(((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).isAutoIncrement());
    Assert.assertEquals(ColumnDefinition.SpecialIndex.PRIMARY, ((ColumnDefinition) ((Pair) actual.getColDefs().get(0)).getValue()).getSpecialIndex());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertEquals(((Pair) actual.getColDefs().get(0)).getKey(), actual.getTable().getParent());
    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
    Assert.assertNull(actual.getTableOptions());
    Assert.assertTrue(actual.isTemporary());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList5, actual.getUniqueKeys());

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void addFullTextIndexInputNotNullNotNullOutputNotNull999a44e911bb1a15275() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "kaaaa");
//    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
//    final Identifier arg0 = identifier1;
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier2, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);
//
//    // Act
//    final DDLCreateTableStatement actual = thisObj.addFullTextIndex(arg0, arg1);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getFullTextKeys());
//    Assert.assertEquals(1, thisObj.getFullTextKeys().size());
//    Assert.assertNotNull(thisObj.getFullTextKeys().get(0));
//    Assert.assertNotNull(((Pair) thisObj.getFullTextKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) thisObj.getFullTextKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) thisObj.getFullTextKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getFullTextKeys().get(0)).getValue()).getOptions(), "size"));
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList1, actual.getKeys());
//    Assert.assertTrue(actual.isIfNotExists());
//    Assert.assertNull(actual.getSelect());
//    Assert.assertNull(actual.getPrimaryKey());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList2 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList2, actual.getSpatialKeys());
//    final ArrayList<Expression> arrayList3 = new ArrayList<Expression>();
//    Assert.assertEquals(arrayList3, actual.getChecks());
//    Assert.assertNotNull(actual.getFullTextKeys());
//    Assert.assertEquals(1, actual.getFullTextKeys().size());
//    Assert.assertNotNull(actual.getFullTextKeys().get(0));
//    Assert.assertNotNull(((Pair) actual.getFullTextKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) actual.getFullTextKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) actual.getFullTextKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getFullTextKeys().get(0)).getValue()).getOptions(), "size"));
//    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList4 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
//    Assert.assertEquals(arrayList4, actual.getColDefs());
//    Assert.assertNotNull(actual.getTable());
//    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
//    Assert.assertEquals(((Pair) actual.getFullTextKeys().get(0)).getKey(), actual.getTable().getParent());
//    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
//    Assert.assertNull(actual.getTableOptions());
//    Assert.assertTrue(actual.isTemporary());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList5, actual.getUniqueKeys());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void addIndexInputNotNullNotNullOutputNotNull9991de52ac41615502c() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "kaaaa");
//    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
//    final Identifier arg0 = identifier1;
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier2, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);
//
//    // Act
//    final DDLCreateTableStatement actual = thisObj.addIndex(arg0, arg1);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getKeys());
//    Assert.assertEquals(1, thisObj.getKeys().size());
//    Assert.assertNotNull(thisObj.getKeys().get(0));
//    Assert.assertNotNull(((Pair) thisObj.getKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) thisObj.getKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) thisObj.getKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getKeys().get(0)).getValue()).getOptions(), "size"));
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getKeys());
//    Assert.assertEquals(1, actual.getKeys().size());
//    Assert.assertNotNull(actual.getKeys().get(0));
//    Assert.assertNotNull(((Pair) actual.getKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) actual.getKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) actual.getKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getKeys().get(0)).getValue()).getOptions(), "size"));
//    Assert.assertTrue(actual.isIfNotExists());
//    Assert.assertNull(actual.getSelect());
//    Assert.assertNull(actual.getPrimaryKey());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList1, actual.getSpatialKeys());
//    final ArrayList<Expression> arrayList2 = new ArrayList<Expression>();
//    Assert.assertEquals(arrayList2, actual.getChecks());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList3 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList3, actual.getFullTextKeys());
//    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList4 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
//    Assert.assertEquals(arrayList4, actual.getColDefs());
//    Assert.assertNotNull(actual.getTable());
//    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
//    Assert.assertEquals(((Pair) actual.getKeys().get(0)).getKey(), actual.getTable().getParent());
//    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
//    Assert.assertNull(actual.getTableOptions());
//    Assert.assertTrue(actual.isTemporary());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList5, actual.getUniqueKeys());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void addSpatialIndexInputNotNullNotNullOutputNotNull9991cdb03e8c145be2b() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "kaaaa");
//    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
//    final Identifier arg0 = identifier1;
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier2, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);
//
//    // Act
//    final DDLCreateTableStatement actual = thisObj.addSpatialIndex(arg0, arg1);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getSpatialKeys());
//    Assert.assertEquals(1, thisObj.getSpatialKeys().size());
//    Assert.assertNotNull(thisObj.getSpatialKeys().get(0));
//    Assert.assertNotNull(((Pair) thisObj.getSpatialKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) thisObj.getSpatialKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) thisObj.getSpatialKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getSpatialKeys().get(0)).getValue()).getOptions(), "size"));
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList1, actual.getKeys());
//    Assert.assertTrue(actual.isIfNotExists());
//    Assert.assertNull(actual.getSelect());
//    Assert.assertNull(actual.getPrimaryKey());
//    Assert.assertNotNull(actual.getSpatialKeys());
//    Assert.assertEquals(1, actual.getSpatialKeys().size());
//    Assert.assertNotNull(actual.getSpatialKeys().get(0));
//    Assert.assertNotNull(((Pair) actual.getSpatialKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) actual.getSpatialKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) actual.getSpatialKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getSpatialKeys().get(0)).getValue()).getOptions(), "size"));
//    final ArrayList<Expression> arrayList2 = new ArrayList<Expression>();
//    Assert.assertEquals(arrayList2, actual.getChecks());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList3 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList3, actual.getFullTextKeys());
//    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList4 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
//    Assert.assertEquals(arrayList4, actual.getColDefs());
//    Assert.assertNotNull(actual.getTable());
//    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
//    Assert.assertEquals(((Pair) actual.getSpatialKeys().get(0)).getKey(), actual.getTable().getParent());
//    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
//    Assert.assertNull(actual.getTableOptions());
//    Assert.assertTrue(actual.isTemporary());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList5, actual.getUniqueKeys());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void addUniqueIndexInputNotNullNotNullOutputNotNull99901c690f269090355() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "kaaaa");
//    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
//    final Identifier arg0 = identifier1;
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier2, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final IndexDefinition arg1 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);
//
//    // Act
//    final DDLCreateTableStatement actual = thisObj.addUniqueIndex(arg0, arg1);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getUniqueKeys());
//    Assert.assertEquals(1, thisObj.getUniqueKeys().size());
//    Assert.assertNotNull(thisObj.getUniqueKeys().get(0));
//    Assert.assertNotNull(((Pair) thisObj.getUniqueKeys().get(0)).getKey());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getIdTextUpUnescape());
//    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getParent());
//    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getParent().getIdTextUpUnescape());
//    Assert.assertNull(((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getParent().getParent());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getParent().getIdText());
//    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getIdText());
//    Assert.assertNotNull(((Pair) thisObj.getUniqueKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(((Identifier) ((Pair) thisObj.getUniqueKeys().get(0)).getKey()).getParent(), ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) thisObj.getUniqueKeys().get(0)).getValue()).getOptions(), "size"));
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList1, actual.getKeys());
//    Assert.assertTrue(actual.isIfNotExists());
//    Assert.assertNull(actual.getSelect());
//    Assert.assertNull(actual.getPrimaryKey());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList2 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList2, actual.getSpatialKeys());
//    final ArrayList<Expression> arrayList3 = new ArrayList<Expression>();
//    Assert.assertEquals(arrayList3, actual.getChecks());
//    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList4 = new ArrayList<Pair<Identifier, IndexDefinition>>();
//    Assert.assertEquals(arrayList4, actual.getFullTextKeys());
//    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList5 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
//    Assert.assertEquals(arrayList5, actual.getColDefs());
//    Assert.assertNotNull(actual.getTable());
//    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getTable().getParent());
//    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getTable().getParent().getParent());
//    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
//    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
//    Assert.assertNull(actual.getTableOptions());
//    Assert.assertTrue(actual.isTemporary());
//    Assert.assertNotNull(actual.getUniqueKeys());
//    Assert.assertEquals(1, actual.getUniqueKeys().size());
//    Assert.assertNotNull(actual.getUniqueKeys().get(0));
//    Assert.assertEquals(actual.getTable().getParent(), ((Pair) actual.getUniqueKeys().get(0)).getKey());
//    Assert.assertNotNull(((Pair) actual.getUniqueKeys().get(0)).getValue());
//    Assert.assertEquals(IndexDefinition.IndexType.BTREE, ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getIndexType());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns());
//    Assert.assertEquals(1, ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().size());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0));
//    Assert.assertEquals(actual.getTable().getParent().getParent(), ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getColumnName());
//    Assert.assertTrue(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).isAsc());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength());
//    Assert.assertTrue(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).isLeftCombine());
//    Assert.assertEquals(12, ((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).getPrecedence());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).getLeftOprand());
//    Assert.assertNull(((ArithmeticAddExpression) ((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getColumns().get(0).getLength()).getRightOprand());
//    Assert.assertNotNull(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getOptions());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getOptions(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((IndexDefinition) ((Pair) actual.getUniqueKeys().get(0)).getValue()).getOptions(), "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueNotNullOutputNotNull999fff9cd46a9439d00() {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg2 = new Identifier(identifier, "aaaka");

    // Act, creating object to test constructor
    final DDLCreateTableStatement actual = new DDLCreateTableStatement(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual.getKeys());
    Assert.assertTrue(actual.isIfNotExists());
    Assert.assertNull(actual.getSelect());
    Assert.assertNull(actual.getPrimaryKey());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList1, actual.getSpatialKeys());
    final ArrayList<Expression> arrayList2 = new ArrayList<Expression>();
    Assert.assertEquals(arrayList2, actual.getChecks());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList3 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList3, actual.getFullTextKeys());
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList4 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList4, actual.getColDefs());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAKA", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaka", actual.getTable().getIdText());
    Assert.assertNull(actual.getTableOptions());
    Assert.assertTrue(actual.isTemporary());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList5, actual.getUniqueKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void getChecksOutput09998597db9543b8b6e0() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final List<Expression> actual = thisObj.getChecks();

    // Assert result
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getColDefsOutput09994d2a9aa5f7314e5a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final List<Pair<Identifier, ColumnDefinition>> actual = thisObj.getColDefs();

    // Assert result
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFullTextKeysOutput099993f39e049110385b() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final List<Pair<Identifier, IndexDefinition>> actual = thisObj.getFullTextKeys();

    // Assert result
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getKeysOutput09995e63eac130c78432() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final List<Pair<Identifier, IndexDefinition>> actual = thisObj.getKeys();

    // Assert result
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrimaryKeyOutputVoid9990c5ea1248941743c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final IndexDefinition actual = thisObj.getPrimaryKey();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSelectOutputVoid9993288eb23c0ad69fe() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final Pair<DDLCreateTableStatement.SelectOption, DMLSelectStatement> actual = thisObj.getSelect();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSpatialKeysOutput0999f29ecfd7aa4a3f7c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final List<Pair<Identifier, IndexDefinition>> actual = thisObj.getSpatialKeys();

    // Assert result
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOptionsOutputVoid999765271d5391948d6() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final TableOptions actual = thisObj.getTableOptions();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull99997e6cce217a26f43() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final Identifier actual = thisObj.getTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("KAAAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("kaaaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getUniqueKeysOutput0999ff0bdbec9f683c10() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final List<Pair<Identifier, IndexDefinition>> actual = thisObj.getUniqueKeys();

    // Assert result
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isIfNotExistsOutputTrue9999f966c5bf6b92206() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final boolean actual = thisObj.isIfNotExists();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isTemporaryOutputTrue999a9f45c6006400142() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);

    // Act
    final boolean actual = thisObj.isTemporary();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setPrimaryKeyInputNotNullOutputNotNull9994dac48f0107a642b() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final IndexColumnName indexColumnName = new IndexColumnName(identifier1, arithmeticAddExpression, true);
    arrayList.add(indexColumnName);
    final ArrayList<IndexOption> arrayList1 = new ArrayList<IndexOption>(1);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final IndexOption indexOption = new IndexOption(arithmeticAddExpression1);
    arrayList1.add(indexOption);
    final IndexDefinition arg0 = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, arrayList1);

    // Act
    final DDLCreateTableStatement actual = thisObj.setPrimaryKey(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPrimaryKey());
    Assert.assertEquals(IndexDefinition.IndexType.BTREE, thisObj.getPrimaryKey().getIndexType());
    Assert.assertNotNull(thisObj.getPrimaryKey().getColumns());
    Assert.assertEquals(1, thisObj.getPrimaryKey().getColumns().size());
    Assert.assertNotNull(thisObj.getPrimaryKey().getColumns().get(0));
    Assert.assertNotNull(thisObj.getPrimaryKey().getColumns().get(0).getColumnName());
    Assert.assertEquals("AAAAA", thisObj.getPrimaryKey().getColumns().get(0).getColumnName().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getPrimaryKey().getColumns().get(0).getColumnName().getParent());
    Assert.assertEquals("AAAAA", thisObj.getPrimaryKey().getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getPrimaryKey().getColumns().get(0).getColumnName().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getPrimaryKey().getColumns().get(0).getColumnName().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getPrimaryKey().getColumns().get(0).getColumnName().getIdText());
    Assert.assertTrue(thisObj.getPrimaryKey().getColumns().get(0).isAsc());
    Assert.assertNotNull(thisObj.getPrimaryKey().getColumns().get(0).getLength());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getPrimaryKey().getColumns().get(0).getLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getPrimaryKey().getColumns().get(0).getLength()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getPrimaryKey().getColumns().get(0).getLength()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getPrimaryKey().getColumns().get(0).getLength()).getRightOprand());
    Assert.assertNotNull(thisObj.getPrimaryKey().getOptions());
    Assert.assertEquals(1, thisObj.getPrimaryKey().getOptions().size());
    Assert.assertNotNull(thisObj.getPrimaryKey().getOptions().get(0));
    Assert.assertNull(thisObj.getPrimaryKey().getOptions().get(0).getIndexType());
    Assert.assertNull(thisObj.getPrimaryKey().getOptions().get(0).getComment());
    Assert.assertNotNull(thisObj.getPrimaryKey().getOptions().get(0).getKeyBlockSize());
    Assert.assertTrue(((ArithmeticAddExpression) thisObj.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) thisObj.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).getPrecedence());
    Assert.assertEquals(thisObj.getPrimaryKey().getColumns().get(0).getLength(), ((ArithmeticAddExpression) thisObj.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) thisObj.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).getRightOprand());
    Assert.assertNull(thisObj.getPrimaryKey().getOptions().get(0).getParserName());

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList2 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList2, actual.getKeys());
    Assert.assertTrue(actual.isIfNotExists());
    Assert.assertNull(actual.getSelect());
    Assert.assertNotNull(actual.getPrimaryKey());
    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getPrimaryKey().getIndexType());
    Assert.assertNotNull(actual.getPrimaryKey().getColumns());
    Assert.assertEquals(1, actual.getPrimaryKey().getColumns().size());
    Assert.assertNotNull(actual.getPrimaryKey().getColumns().get(0));
    Assert.assertNotNull(actual.getPrimaryKey().getColumns().get(0).getColumnName());
    Assert.assertEquals("AAAAA", actual.getPrimaryKey().getColumns().get(0).getColumnName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getPrimaryKey().getColumns().get(0).getColumnName().getParent());
    Assert.assertEquals("AAAAA", actual.getPrimaryKey().getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getPrimaryKey().getColumns().get(0).getColumnName().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getPrimaryKey().getColumns().get(0).getColumnName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getPrimaryKey().getColumns().get(0).getColumnName().getIdText());
    Assert.assertTrue(actual.getPrimaryKey().getColumns().get(0).isAsc());
    Assert.assertNotNull(actual.getPrimaryKey().getColumns().get(0).getLength());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getPrimaryKey().getColumns().get(0).getLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getPrimaryKey().getColumns().get(0).getLength()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual.getPrimaryKey().getColumns().get(0).getLength()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getPrimaryKey().getColumns().get(0).getLength()).getRightOprand());
    Assert.assertNotNull(actual.getPrimaryKey().getOptions());
    Assert.assertEquals(1, actual.getPrimaryKey().getOptions().size());
    Assert.assertNotNull(actual.getPrimaryKey().getOptions().get(0));
    Assert.assertNull(actual.getPrimaryKey().getOptions().get(0).getIndexType());
    Assert.assertNull(actual.getPrimaryKey().getOptions().get(0).getComment());
    Assert.assertNotNull(actual.getPrimaryKey().getOptions().get(0).getKeyBlockSize());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).getPrecedence());
    Assert.assertEquals(actual.getPrimaryKey().getColumns().get(0).getLength(), ((ArithmeticAddExpression) actual.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getPrimaryKey().getOptions().get(0).getKeyBlockSize()).getRightOprand());
    Assert.assertNull(actual.getPrimaryKey().getOptions().get(0).getParserName());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList3 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList3, actual.getSpatialKeys());
    final ArrayList<Expression> arrayList4 = new ArrayList<Expression>();
    Assert.assertEquals(arrayList4, actual.getChecks());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList5, actual.getFullTextKeys());
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList6 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList6, actual.getColDefs());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertEquals(actual.getPrimaryKey().getColumns().get(0).getColumnName(), actual.getTable().getParent());
    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
    Assert.assertNull(actual.getTableOptions());
    Assert.assertTrue(actual.isTemporary());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList7 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList7, actual.getUniqueKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableOptionsInputNotNullOutputNotNull999476f2bafdeff9d6e() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "kaaaa");
    final DDLCreateTableStatement thisObj = new DDLCreateTableStatement(true, true, identifier);
    final TableOptions arg0 = new TableOptions();

    // Act
    final DDLCreateTableStatement actual = thisObj.setTableOptions(arg0);

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

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, actual.getKeys());
    Assert.assertTrue(actual.isIfNotExists());
    Assert.assertNull(actual.getSelect());
    Assert.assertNull(actual.getPrimaryKey());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList1, actual.getSpatialKeys());
    final ArrayList<Expression> arrayList2 = new ArrayList<Expression>();
    Assert.assertEquals(arrayList2, actual.getChecks());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList3 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList3, actual.getFullTextKeys());
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList4 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList4, actual.getColDefs());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("KAAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("kaaaa", actual.getTable().getIdText());
    Assert.assertNotNull(actual.getTableOptions());
    Assert.assertNull(actual.getTableOptions().getPackKeys());
    Assert.assertNull(actual.getTableOptions().getMaxRows());
    Assert.assertNull(actual.getTableOptions().getCharSet());
    Assert.assertNull(actual.getTableOptions().getEngine());
    Assert.assertNull(actual.getTableOptions().getDelayKeyWrite());
    Assert.assertNull(actual.getTableOptions().getConnection());
    Assert.assertNull(actual.getTableOptions().getAvgRowLength());
    Assert.assertNull(actual.getTableOptions().getCheckSum());
    Assert.assertNull(actual.getTableOptions().getKeyBlockSize());
    Assert.assertNull(actual.getTableOptions().getMinRows());
    Assert.assertNull(actual.getTableOptions().getDataDir());
    Assert.assertNull(actual.getTableOptions().getCollation());
    Assert.assertNull(actual.getTableOptions().getComment());
    Assert.assertNull(actual.getTableOptions().getInsertMethod());
    Assert.assertNull(actual.getTableOptions().getPassword());
    Assert.assertNull(actual.getTableOptions().getRowFormat());
    Assert.assertNull(actual.getTableOptions().getIndexDir());
    Assert.assertNull(actual.getTableOptions().getAutoIncrement());
    Assert.assertNull(actual.getTableOptions().getUnion());
    Assert.assertTrue(actual.isTemporary());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList5, actual.getUniqueKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIgnored999acc06bbb075f8a49() {

    // Arrange
    final String arg0 = "IGNORED";

    // Act
    final DDLCreateTableStatement.SelectOption actual = DDLCreateTableStatement.SelectOption.valueOf(arg0);

    // Assert result
    Assert.assertEquals(DDLCreateTableStatement.SelectOption.IGNORED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999d71e94bb9df4fe90() {

    // Act
    final DDLCreateTableStatement.SelectOption[] actual = DDLCreateTableStatement.SelectOption.values();

    // Assert result
    Assert.assertArrayEquals(new DDLCreateTableStatement.SelectOption[]{ DDLCreateTableStatement.SelectOption.IGNORED, DDLCreateTableStatement.SelectOption.REPLACE }, actual);

  }
}
