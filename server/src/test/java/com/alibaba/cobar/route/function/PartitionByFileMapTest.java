package com.alibaba.cobar.route.function;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.route.function.PartitionByFileMap;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class PartitionByFileMapTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputIndexOutOfBoundsException9998f9b4fe7bd00c3a6() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 1 arguments but is ", " must have 1 arguments but is ");

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.calculate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputNotNull99993f7b65ff38599be() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);

    // Act
    final FunctionExpression actual = thisObj.constructFunction(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(((PartitionByFileMap) actual).getArguments());
    Assert.assertEquals(1, ((PartitionByFileMap) actual).getArguments().size());
    Assert.assertNotNull(((PartitionByFileMap) actual).getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((PartitionByFileMap) actual).getArguments().get(0)).getRightOprand());
    Assert.assertEquals(" must have 1 arguments but is ", ((PartitionByFileMap) actual).getFunctionName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99921f0d9575838ff5f() {

    // Arrange
    final String arg0 = " must have 1 arguments but is ";
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final PartitionByFileMap actual = new PartitionByFileMap(arg0, arg1);

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
    Assert.assertEquals(" must have 1 arguments but is ", actual.getFunctionName());

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999b57b05866206e357() {
//
//    // Arrange
//    final String arg0 = " must have 1 arguments but is ";
//
//    // Act, creating object to test constructor
//    final PartitionByFileMap actual = new PartitionByFileMap(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getArguments(), "size"));
//    Assert.assertEquals(" must have 1 arguments but is ", actual.getFunctionName());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputIndexOutOfBoundsException999a9076b92b90059c9() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 1 arguments but is ", " must have 1 arguments but is ");

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.evaluationInternal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputRuntimeException999f74b3aa62e47e801() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.init();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initializeOutputRuntimeException99995ef696db926ede9() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.initialize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDefaultNodeInputNotNullOutputVoid999b5af6a4e3a6cc57a() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");
    final Integer arg0 = new Integer(0);

    // Act
    thisObj.setDefaultNode(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileMapPathInputNotNullOutputVoid9997147eac675a426be() {

    // Arrange
    final PartitionByFileMap thisObj = new PartitionByFileMap(" must have 1 arguments but is ");
    final String arg0 = " must have 1 arguments but is ";

    // Act
    thisObj.setFileMapPath(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
