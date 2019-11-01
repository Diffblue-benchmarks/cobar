package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.SysVarPrimary;
import com.alibaba.cobar.parser.ast.expression.primary.VariableExpression;
import com.alibaba.cobar.parser.ast.fragment.VariableScope;
import com.alibaba.cobar.parser.ast.stmt.dal.DALSetStatement;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class DALSetStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999f2057b202c762b00() {

    // Arrange
    final ArrayList<Pair<VariableExpression, Expression>> arrayList = new ArrayList<Pair<VariableExpression, Expression>>();
    final SysVarPrimary sysVarPrimary = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<VariableExpression, Expression> pair = new Pair<VariableExpression, Expression>(sysVarPrimary, arithmeticAddExpression);
    arrayList.add(pair);
    final DALSetStatement thisObj = new DALSetStatement(arrayList);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99925e8eaa5d0c4158d() {

    // Arrange
    final ArrayList<Pair<VariableExpression, Expression>> arg0 = new ArrayList<Pair<VariableExpression, Expression>>();
    final SysVarPrimary sysVarPrimary = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final Pair<VariableExpression, Expression> pair = new Pair<VariableExpression, Expression>(sysVarPrimary, arithmeticAddExpression);
    arg0.add(pair);

    // Act, creating object to test constructor
    final DALSetStatement actual = new DALSetStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getAssignmentList());
    Assert.assertEquals(1, actual.getAssignmentList().size());
    Assert.assertNotNull(actual.getAssignmentList().get(0));
    Assert.assertNotNull(((Pair) actual.getAssignmentList().get(0)).getKey());
    Assert.assertEquals("aaaaa", ((SysVarPrimary) ((Pair) actual.getAssignmentList().get(0)).getKey()).getVarText());
    Assert.assertEquals(VariableScope.SESSION, ((SysVarPrimary) ((Pair) actual.getAssignmentList().get(0)).getKey()).getScope());
    Assert.assertEquals("aaaaa", ((SysVarPrimary) ((Pair) actual.getAssignmentList().get(0)).getKey()).getVarTextUp());
    Assert.assertNotNull(((Pair) actual.getAssignmentList().get(0)).getValue());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getLeftOprand(), ((ArithmeticAddExpression) ((Pair) actual.getAssignmentList().get(0)).getValue()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAssignmentListOutput1999695398f8c2bb0265() {

    // Arrange
    final ArrayList<Pair<VariableExpression, Expression>> arrayList = new ArrayList<Pair<VariableExpression, Expression>>();
    final SysVarPrimary sysVarPrimary = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<VariableExpression, Expression> pair = new Pair<VariableExpression, Expression>(sysVarPrimary, arithmeticAddExpression);
    arrayList.add(pair);
    final DALSetStatement thisObj = new DALSetStatement(arrayList);

    // Act
    final List<Pair<VariableExpression, Expression>> actual = thisObj.getAssignmentList();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertNotNull(((Pair) actual.get(0)).getKey());
    Assert.assertEquals("aaaaa", ((SysVarPrimary) ((Pair) actual.get(0)).getKey()).getVarText());
    Assert.assertEquals(VariableScope.SESSION, ((SysVarPrimary) ((Pair) actual.get(0)).getKey()).getScope());
    Assert.assertEquals("aaaaa", ((SysVarPrimary) ((Pair) actual.get(0)).getKey()).getVarTextUp());
    Assert.assertNotNull(((Pair) actual.get(0)).getValue());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.get(0)).getValue()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.get(0)).getValue()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.get(0)).getValue()).getRightOprand());

  }
}
