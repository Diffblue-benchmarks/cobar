package com.alibaba.cobar.parser.ast.expression.primary.function.datetime;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.Timestamp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class TimestampTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputNotNull999dfaaf7490f4a7c13() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Timestamp thisObj = new Timestamp(arrayList);
    final List<Expression> arg0 = arrayList;

    // Act
    final FunctionExpression actual = thisObj.constructFunction(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(((Timestamp) actual).getArguments());
    Assert.assertEquals(1, ((Timestamp) actual).getArguments().size());
    Assert.assertNotNull(((Timestamp) actual).getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getLeftOprand(), ((ArithmeticAddExpression) ((Timestamp) actual).getArguments().get(0)).getRightOprand());
    Assert.assertEquals("TIMESTAMP", ((Timestamp) actual).getFunctionName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99960bee481df06a4dd() {

    // Arrange
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final Timestamp actual = new Timestamp(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getArguments());
    Assert.assertEquals(1, actual.getArguments().size());
    Assert.assertNotNull(actual.getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getArguments().get(0)).getRightOprand());
    Assert.assertEquals("TIMESTAMP", actual.getFunctionName());

  }
}
