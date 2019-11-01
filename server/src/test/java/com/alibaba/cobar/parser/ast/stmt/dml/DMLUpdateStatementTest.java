package com.alibaba.cobar.parser.ast.stmt.dml;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.bit.BitShiftExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.ast.fragment.OrderBy;
import com.alibaba.cobar.parser.ast.fragment.SortOrder;
import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReferences;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLUpdateStatement;
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



public class DMLUpdateStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9999930bd847f5e3176() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueNotNullNotNullNotNullNotNullNotNullOutputNotNull999aa5f166a90a032fc() throws SQLSyntaxErrorException {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences arg2 = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arg3 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier1 = new Identifier(null, "argument tableRefs is null for update stmt");
    final Identifier identifier = new Identifier(identifier1, "argument tableRefs is null for update stmt");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, arithmeticAddExpression);
    arg3.add(pair);
    final ArithmeticAddExpression arg4 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final OrderBy arg5 = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final Limit arg6 = new Limit(paramMarker, paramMarker);

    // Act, creating object to test constructor
    final DMLUpdateStatement actual = new DMLUpdateStatement(arg0, arg1, arg2, arg3, arg4, arg5, arg6);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getOrderBy());
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual.getOrderBy().getOrderByList());
    Assert.assertNotNull(actual.getValues());
    Assert.assertEquals(1, actual.getValues().size());
    Assert.assertNotNull(actual.getValues().get(0));
    Assert.assertNotNull(((Pair) actual.getValues().get(0)).getKey());
    Assert.assertEquals("ARGUMENT TABLEREFS IS NULL FOR UPDATE STMT", ((Identifier) ((Pair) actual.getValues().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getValues().get(0)).getKey()).getParent());
    Assert.assertEquals("ARGUMENT TABLEREFS IS NULL FOR UPDATE STMT", ((Identifier) ((Pair) actual.getValues().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.getValues().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("argument tableRefs is null for update stmt", ((Identifier) ((Pair) actual.getValues().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("argument tableRefs is null for update stmt", ((Identifier) ((Pair) actual.getValues().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) actual.getValues().get(0)).getValue());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand(), ((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getRightOprand());
    Assert.assertNotNull(actual.getTableRefs());
    Assert.assertNotNull(actual.getTableRefs().getTableReferenceList());
    Assert.assertEquals(1, actual.getTableRefs().getTableReferenceList().size());
    Assert.assertNotNull(actual.getTableRefs().getTableReferenceList().get(0));
    Assert.assertTrue(actual.isLowPriority());
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNotNull(actual.getWhere());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getWhere()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getWhere()).getPrecedence());
    Assert.assertEquals(((Pair) actual.getValues().get(0)).getValue(), ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((Pair) actual.getValues().get(0)).getValue()).getLeftOprand(), ((ArithmeticAddExpression) actual.getWhere()).getRightOprand());
    Assert.assertNotNull(actual.getLimit());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOutputNotNull9992146a6bada88e3c6() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final Limit actual = thisObj.getLimit();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderByOutputNotNull999e3be0ecc92e60969() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final OrderBy actual = thisObj.getOrderBy();

    // Assert result
    Assert.assertNotNull(actual);
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual.getOrderByList());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableRefsOutputNotNull9993beaf085d6b5e6b2() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final TableReferences actual = thisObj.getTableRefs();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getTableReferenceList());
    Assert.assertEquals(1, actual.getTableReferenceList().size());
    Assert.assertNotNull(actual.getTableReferenceList().get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void getValuesOutput1999a18397c1fd6f741d() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final List<Pair<Identifier, Expression>> actual = thisObj.getValues();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertNotNull(((Pair) actual.get(0)).getKey());
    Assert.assertEquals("ARGUMENT TABLEREFS IS NULL FOR UPDATE STMT", ((Identifier) ((Pair) actual.get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.get(0)).getKey()).getParent());
    Assert.assertEquals("argument tableRefs is null for update stmt", ((Identifier) ((Pair) actual.get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) actual.get(0)).getValue());
    Assert.assertTrue(((BitShiftExpression) ((Pair) actual.get(0)).getValue()).isRightShift());
    Assert.assertTrue(((BitShiftExpression) ((Pair) actual.get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(11, ((BitShiftExpression) ((Pair) actual.get(0)).getValue()).getPrecedence());
    Assert.assertNull(((BitShiftExpression) ((Pair) actual.get(0)).getValue()).getLeftOprand());
    Assert.assertNull(((BitShiftExpression) ((Pair) actual.get(0)).getValue()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhereOutputNotNull999e85a8c3627185684() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final Expression actual = thisObj.getWhere();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((BitShiftExpression) actual).isRightShift());
    Assert.assertTrue(((BitShiftExpression) actual).isLeftCombine());
    Assert.assertEquals(11, ((BitShiftExpression) actual).getPrecedence());
    Assert.assertNull(((BitShiftExpression) actual).getLeftOprand());
    Assert.assertNull(((BitShiftExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void isIgnoreOutputTrue999b8e0211847e27c36() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final boolean actual = thisObj.isIgnore();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isLowPriorityOutputTrue999a841820b8621857f() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "argument tableRefs is null for update stmt");
    final BitShiftExpression bitShiftExpression = new BitShiftExpression(true, null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, bitShiftExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(655361);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement thisObj = new DMLUpdateStatement(true, true, tableReferences, arrayList1, bitShiftExpression, orderBy, limit);

    // Act
    final boolean actual = thisObj.isLowPriority();

    // Assert result
    Assert.assertTrue(actual);

  }
}
