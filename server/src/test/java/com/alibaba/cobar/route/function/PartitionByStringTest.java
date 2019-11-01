package com.alibaba.cobar.route.function;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.route.function.PartitionByString;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class PartitionByStringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputIndexOutOfBoundsException99938f7c068eefe2856() {

    // Arrange
    final PartitionByString thisObj = new PartitionByString(" must have 1 argument but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 1 argument but is ", " must have 1 argument but is ");

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.calculate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputNotNull99947d3173a271e8ff1() {

    // Arrange
    final PartitionByString thisObj = new PartitionByString(" must have 1 argument but is ");
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);

    // Act
    final FunctionExpression actual = thisObj.constructFunction(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((PartitionByString) actual).length);
    Assert.assertNull(((PartitionByString) actual).count);
    Assert.assertNull(((PartitionByString) actual).partitionUtil);
    Assert.assertNotNull(((PartitionByString) actual).getArguments());
    Assert.assertEquals(1, ((PartitionByString) actual).getArguments().size());
    Assert.assertNotNull(((PartitionByString) actual).getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((PartitionByString) actual).getArguments().get(0)).getRightOprand());
    Assert.assertEquals(" must have 1 argument but is ", ((PartitionByString) actual).getFunctionName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99971fc9371fcfd481d() {

    // Arrange
    final String arg0 = " must have 1 argument but is ";
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final PartitionByString actual = new PartitionByString(arg0, arg1);

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
//  public void constructorInputNotNullOutputNotNull999c07d589710f67596() {
//
//    // Arrange
//    final String arg0 = " must have 1 argument but is ";
//
//    // Act, creating object to test constructor
//    final PartitionByString actual = new PartitionByString(arg0);
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
  public void evaluationInternalInputNotNullOutputIndexOutOfBoundsException999cf381ed4fe2e367c() {

    // Arrange
    final PartitionByString thisObj = new PartitionByString(" must have 1 argument but is ");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(" must have 1 argument but is ", " must have 1 argument but is ");

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.evaluationInternal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initializeOutputRuntimeException99943cbdf084ed3fbfa() {

    // Arrange
    final PartitionByString thisObj = new PartitionByString(" must have 1 argument but is ");

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.initialize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHashLengthInputZeroOutputVoid9994e97d19ad0437f73() {

    // Arrange
    final PartitionByString thisObj = new PartitionByString(" must have 1 argument but is ");
    final int arg0 = 0;

    // Act
    thisObj.setHashLength(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHashSliceInputNotNullOutputNumberFormatException999f70de32efcd3172c() {

    // Arrange
    final PartitionByString thisObj = new PartitionByString(" must have 1 argument but is ");
    final String arg0 = " must have 1 argument but is ";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.setHashSlice(arg0);

    // The method is not expected to return due to exception thrown

  }
}
