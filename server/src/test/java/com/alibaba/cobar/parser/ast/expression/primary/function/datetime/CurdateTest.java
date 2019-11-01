package com.alibaba.cobar.parser.ast.expression.primary.function.datetime;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.Curdate;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class CurdateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructFunctionInputNotNullOutputNotNull99908bb53053a5f86ab() {
//
//    // Arrange
//    final Curdate thisObj = new Curdate();
//    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
//    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
//    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
//    arg0.add(arithmeticAddExpression);
//
//    // Act
//    final FunctionExpression actual = thisObj.constructFunction(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(((Curdate) actual).getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((Curdate) actual).getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Curdate) actual).getArguments(), "size"));
//    Assert.assertEquals("CURDATE", ((Curdate) actual).getFunctionName());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9991632614f33ca888d() {
//
//    // Act, creating object to test constructor
//    final Curdate actual = new Curdate();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getArguments(), "size"));
//    Assert.assertEquals("CURDATE", actual.getFunctionName());
//
//  }
}
