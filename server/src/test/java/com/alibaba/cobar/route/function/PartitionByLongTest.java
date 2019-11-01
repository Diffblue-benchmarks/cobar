package com.alibaba.cobar.route.function;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.route.function.PartitionByLong;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class PartitionByLongTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputIndexOutOfBoundsException999de333ac26ba85e0b() {

    // Arrange
    final PartitionByLong thisObj = new PartitionByLong(" must have 1 argument but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 1 argument but is ", " must have 1 argument but is ");

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.calculate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputNotNull999fb9bbeceb923c4bd() {

    // Arrange
    final PartitionByLong thisObj = new PartitionByLong(" must have 1 argument but is ");
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);

    // Act
    final FunctionExpression actual = thisObj.constructFunction(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((PartitionByLong) actual).length);
    Assert.assertNull(((PartitionByLong) actual).count);
    Assert.assertNull(((PartitionByLong) actual).partitionUtil);
    Assert.assertNotNull(((PartitionByLong) actual).getArguments());
    Assert.assertEquals(1, ((PartitionByLong) actual).getArguments().size());
    Assert.assertNotNull(((PartitionByLong) actual).getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((PartitionByLong) actual).getArguments().get(0)).getRightOprand());
    Assert.assertEquals(" must have 1 argument but is ", ((PartitionByLong) actual).getFunctionName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9996afa6bc60c9fb54e() {

    // Arrange
    final String arg0 = " must have 1 argument but is ";
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final PartitionByLong actual = new PartitionByLong(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.length);
    Assert.assertNull(actual.count);
    Assert.assertNull(actual.partitionUtil);
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
    Assert.assertEquals(" must have 1 argument but is ", actual.getFunctionName());

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999f53d8e88951575c1() {
//
//    // Arrange
//    final String arg0 = " must have 1 argument but is ";
//
//    // Act, creating object to test constructor
//    final PartitionByLong actual = new PartitionByLong(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.length);
//    Assert.assertNull(actual.count);
//    Assert.assertNull(actual.partitionUtil);
//    Assert.assertNotNull(actual.getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getArguments(), "size"));
//    Assert.assertEquals(" must have 1 argument but is ", actual.getFunctionName());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputIndexOutOfBoundsException999f4607b88521c7c18() {

    // Arrange
    final PartitionByLong thisObj = new PartitionByLong(" must have 1 argument but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 1 argument but is ", " must have 1 argument but is ");

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.evaluationInternal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initializeOutputRuntimeException999a9eeda95812db40c() {

    // Arrange
    final PartitionByLong thisObj = new PartitionByLong(" must have 1 argument but is ");

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.initialize();

    // The method is not expected to return due to exception thrown

  }
}
