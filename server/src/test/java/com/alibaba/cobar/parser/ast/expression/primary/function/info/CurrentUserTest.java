package com.alibaba.cobar.parser.ast.expression.primary.function.info;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.info.CurrentUser;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class CurrentUserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructFunctionInputNotNullOutputNotNull999324b95f245bf327d() {
//
//    // Arrange
//    final CurrentUser thisObj = new CurrentUser();
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
//    Assert.assertNotNull(((CurrentUser) actual).getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(((CurrentUser) actual).getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(((CurrentUser) actual).getArguments(), "size"));
//    Assert.assertEquals("CURRENT_USER", ((CurrentUser) actual).getFunctionName());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9991ab00843e3654102() {
//
//    // Act, creating object to test constructor
//    final CurrentUser actual = new CurrentUser();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getArguments(), "size"));
//    Assert.assertEquals("CURRENT_USER", actual.getFunctionName());
//
//  }
}
