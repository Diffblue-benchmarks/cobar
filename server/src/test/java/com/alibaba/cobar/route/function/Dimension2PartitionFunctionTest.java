package com.alibaba.cobar.route.function;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.route.function.Dimension2PartitionFunction;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class Dimension2PartitionFunctionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputIllegalArgumentException99982d7f297937219ed() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 2 arguments but is ", " must have 2 arguments but is ");

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.calculate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputIllegalArgumentException9997d577ff39d1ebec0() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.constructFunction(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99961e69a8115287f61() {

    // Arrange
    final String arg0 = " must have 2 arguments but is ";
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final Dimension2PartitionFunction actual = new Dimension2PartitionFunction(arg0, arg1);

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
    Assert.assertEquals(" must have 2 arguments but is ", actual.getFunctionName());

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9992079afabf8a31452() {
//
//    // Arrange
//    final String arg0 = " must have 2 arguments but is ";
//
//    // Act, creating object to test constructor
//    final Dimension2PartitionFunction actual = new Dimension2PartitionFunction(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getArguments(), "size"));
//    Assert.assertEquals(" must have 2 arguments but is ", actual.getFunctionName());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputIllegalArgumentException999ec10e6c347c47380() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 2 arguments but is ", " must have 2 arguments but is ");

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.evaluationInternal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputRuntimeException999dedd649295d1c049() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.init();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initializeOutputRuntimeException999f399dd6afe7cb4f0() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.initialize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHashLengthXInputZeroOutputVoid999714f99b2d7a24fb5() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final int arg0 = 0;

    // Act
    thisObj.setHashLengthX(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHashLengthYInputZeroOutputVoid999510ca5a1750d11f5() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final int arg0 = 0;

    // Act
    thisObj.setHashLengthY(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHashSliceXInputNotNullOutputNumberFormatException999b5161faea211b77e() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setHashSliceX(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHashSliceYInputNotNullOutputNumberFormatException99950fa808701a3e6b1() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setHashSliceY(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setKeyTypeXInputNotNullOutputIllegalArgumentException999b7fc9c60085950e2() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setKeyTypeX(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setKeyTypeYInputNotNullOutputIllegalArgumentException9992d7f2283ec725038() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setKeyTypeY(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPartitionCountXInputNotNullOutputNumberFormatException999241f1c250eb730ca() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setPartitionCountX(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPartitionCountYInputNotNullOutputNumberFormatException99921ab2ba6b3449149() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setPartitionCountY(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPartitionLengthXInputNotNullOutputNumberFormatException99992e8fb75588112e2() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setPartitionLengthX(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPartitionLengthYInputNotNullOutputNumberFormatException999565ca2e5d9885048() {

    // Arrange
    final Dimension2PartitionFunction thisObj = new Dimension2PartitionFunction(" must have 2 arguments but is ");
    final String arg0 = " must have 2 arguments but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setPartitionLengthY(arg0);

    // The method is not expected to return due to exception thrown

  }
}
