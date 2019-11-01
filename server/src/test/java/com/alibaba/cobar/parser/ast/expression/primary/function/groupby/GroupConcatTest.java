package com.alibaba.cobar.parser.ast.expression.primary.function.groupby;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.GroupConcat;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class GroupConcatTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9994e634a7ac9e63add() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputUnsupportedOperationException9996beb866b2b61dbf5() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    arg0.add(arithmeticAddExpression2);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.constructFunction(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullTrueNotNullNotNullOutputNotNull99912a001607e9eb510() {

    // Arrange
    final boolean arg0 = true;
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);
    final Expression arg2 = arithmeticAddExpression1;
    final boolean arg3 = true;
    final List<Expression> arg4 = arg1;
    final String arg5 = ",";

    // Act, creating object to test constructor
    final GroupConcat actual = new GroupConcat(arg0, arg1, arg2, arg3, arg4, arg5);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isDistinct());
    Assert.assertNotNull(actual.getAppendedColumnNames());
    Assert.assertEquals(1, actual.getAppendedColumnNames().size());
    Assert.assertNotNull(actual.getAppendedColumnNames().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getRightOprand());
    Assert.assertTrue(actual.isDesc());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getAppendedColumnNames().get(0)).getLeftOprand(), actual.getOrderBy());
    Assert.assertEquals(",", actual.getSeparator());
    Assert.assertEquals(actual.getAppendedColumnNames(), actual.getArguments());
    Assert.assertEquals("GROUP_CONCAT", actual.getFunctionName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAppendedColumnNamesOutput19999dc88ef5f27f8df9() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");

    // Act
    final List<Expression> actual = thisObj.getAppendedColumnNames();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.get(0)).getLeftOprand(), ((ArithmeticAddExpression) actual.get(0)).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderByOutputNotNull9990a6ab0130ecd5f3a() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");

    // Act
    final Expression actual = thisObj.getOrderBy();

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
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getSeparatorOutputNotNull9991d96e4b03ba67550() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");

    // Act
    final String actual = thisObj.getSeparator();

    // Assert result
    Assert.assertEquals("GROUP_CONCAT", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDescOutputTrue99966206df29390255e() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");

    // Act
    final boolean actual = thisObj.isDesc();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDistinctOutputTrue9993c6840298b7fc8a0() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat thisObj = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "GROUP_CONCAT");

    // Act
    final boolean actual = thisObj.isDistinct();

    // Assert result
    Assert.assertTrue(actual);

  }
}
