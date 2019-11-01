package com.alibaba.cobar.parser.ast.stmt.dml;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.ast.fragment.OrderBy;
import com.alibaba.cobar.parser.ast.fragment.SortOrder;
import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReferences;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLDeleteStatement;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class DMLDeleteStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999bc234a05bf470317() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueTrueNotNullNotNullNotNullNotNullOutputNotNull99994a5a1c8e9394364() throws SQLSyntaxErrorException {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final boolean arg2 = true;
    final Identifier identifier1 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final Identifier arg3 = new Identifier(identifier, "argument 'tableNameList' is empty");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arg4 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression);
    final OrderBy arg5 = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit arg6 = new Limit(paramMarker, paramMarker1);

    // Act, creating object to test constructor
    final DMLDeleteStatement actual = new DMLDeleteStatement(arg0, arg1, arg2, arg3, arg4, arg5, arg6);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getOrderBy());
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual.getOrderBy().getOrderByList());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isQuick());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNotNull(actual.getLimit());
    Assert.assertTrue(actual.isLowPriority());
    Assert.assertNull(actual.getTableRefs());
    Assert.assertNotNull(actual.getWhereCondition());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getWhereCondition()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getWhereCondition()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand(), ((ArithmeticAddExpression) actual.getWhereCondition()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueTrueNotNullNotNullOutputNotNull999cffec7ca4fec82fb() throws SQLSyntaxErrorException {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final boolean arg2 = true;
    final Identifier identifier1 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final Identifier arg3 = new Identifier(identifier, "argument 'tableNameList' is empty");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arg4 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression);

    // Act, creating object to test constructor
    final DMLDeleteStatement actual = new DMLDeleteStatement(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOrderBy());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isQuick());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNull(actual.getLimit());
    Assert.assertTrue(actual.isLowPriority());
    Assert.assertNull(actual.getTableRefs());
    Assert.assertNotNull(actual.getWhereCondition());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getWhereCondition()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getWhereCondition()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand(), ((ArithmeticAddExpression) actual.getWhereCondition()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueTrueNotNullOutputNotNull999f7ad51a5587335a2() throws SQLSyntaxErrorException {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final boolean arg2 = true;
    final Identifier identifier1 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final Identifier arg3 = new Identifier(identifier, "argument 'tableNameList' is empty");

    // Act, creating object to test constructor
    final DMLDeleteStatement actual = new DMLDeleteStatement(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOrderBy());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isQuick());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNull(actual.getLimit());
    Assert.assertTrue(actual.isLowPriority());
    Assert.assertNull(actual.getTableRefs());
    Assert.assertNull(actual.getWhereCondition());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueTrueNotNullNotNullNotNullOutputNotNull99955498cc9a8e132a0() throws SQLSyntaxErrorException {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final boolean arg2 = true;
    final ArrayList<Identifier> arg3 = new ArrayList<Identifier>();
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    arg3.add(identifier);
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>(1);
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences arg4 = new TableReferences(arrayList);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg5 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final DMLDeleteStatement actual = new DMLDeleteStatement(arg0, arg1, arg2, arg3, arg4, arg5);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOrderBy());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isQuick());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNull(actual.getLimit());
    Assert.assertTrue(actual.isLowPriority());
    Assert.assertNotNull(actual.getTableRefs());
    Assert.assertNotNull(actual.getTableRefs().getTableReferenceList());
    Assert.assertEquals(1, actual.getTableRefs().getTableReferenceList().size());
    Assert.assertNotNull(actual.getTableRefs().getTableReferenceList().get(0));
    Assert.assertNotNull(actual.getWhereCondition());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getWhereCondition()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getWhereCondition()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhereCondition()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getWhereCondition()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueTrueNotNullNotNullOutputNotNull9995c535a1aca885e7a() throws SQLSyntaxErrorException {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final boolean arg2 = true;
    final ArrayList<Identifier> arg3 = new ArrayList<Identifier>();
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    arg3.add(identifier);
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>(1);
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences arg4 = new TableReferences(arrayList);

    // Act, creating object to test constructor
    final DMLDeleteStatement actual = new DMLDeleteStatement(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOrderBy());
    Assert.assertNotNull(actual.getTableNames());
    Assert.assertEquals(1, actual.getTableNames().size());
    Assert.assertNotNull(actual.getTableNames().get(0));
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTableNames().get(0).getParent().getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.getTableNames().get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTableNames().get(0).getParent().getParent().getParent());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.getTableNames().get(0).getIdText());
    Assert.assertTrue(actual.isQuick());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNull(actual.getLimit());
    Assert.assertTrue(actual.isLowPriority());
    Assert.assertNotNull(actual.getTableRefs());
    Assert.assertNotNull(actual.getTableRefs().getTableReferenceList());
    Assert.assertEquals(1, actual.getTableRefs().getTableReferenceList().size());
    Assert.assertNotNull(actual.getTableRefs().getTableReferenceList().get(0));
    Assert.assertNull(actual.getWhereCondition());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOutputVoid999d4e1e7f41578513a() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final Limit actual = thisObj.getLimit();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderByOutputVoid999eafbcf9a7518186f() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final OrderBy actual = thisObj.getOrderBy();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableNamesOutput1999dc9f33e170b04cab() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final List<Identifier> actual = thisObj.getTableNames();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.get(0).getIdTextUpUnescape());
    Assert.assertNotNull(actual.get(0).getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.get(0).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.get(0).getParent().getParent());
    Assert.assertEquals("ARGUMENT 'TABLENAMELIST' IS EMPTY", actual.get(0).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.get(0).getParent().getParent().getParent());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.get(0).getParent().getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.get(0).getParent().getIdText());
    Assert.assertEquals("argument 'tableNameList' is empty", actual.get(0).getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableRefsOutputVoid99960b75496d2f00ead() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final TableReferences actual = thisObj.getTableRefs();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhereConditionOutputVoid9992af669cec0a4e62b() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final Expression actual = thisObj.getWhereCondition();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isIgnoreOutputTrue9994a5e060a84306819() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final boolean actual = thisObj.isIgnore();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isLowPriorityOutputTrue999df7e7975d50e65e3() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final boolean actual = thisObj.isLowPriority();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isQuickOutputTrue999126b62b703960454() throws SQLSyntaxErrorException {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "argument 'tableNameList' is empty");
    final Identifier identifier1 = new Identifier(identifier2, "argument 'tableNameList' is empty");
    final Identifier identifier = new Identifier(identifier1, "argument 'tableNameList' is empty");
    final DMLDeleteStatement thisObj = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    final boolean actual = thisObj.isQuick();

    // Assert result
    Assert.assertTrue(actual);

  }
}
