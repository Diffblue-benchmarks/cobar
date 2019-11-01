package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.primary.PlaceHolder;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class PlaceHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99941528f8caddba44d() {

    // Arrange
    final PlaceHolder thisObj = new PlaceHolder("aaaaa", "aaaaa");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999f5320884cac21675() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final PlaceHolder actual = new PlaceHolder(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getName());
    Assert.assertEquals("aaaaa", actual.getNameUp());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNotNull99978d3b4593c6bd0cc() {

    // Arrange
    final PlaceHolder thisObj = new PlaceHolder("aaaaa", "aaaaa");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "akaaa");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // Assert result
    Assert.assertEquals("akaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull9996d50abdccc98ca87() {

    // Arrange
    final PlaceHolder thisObj = new PlaceHolder("aaaaa", "aaaaa");

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameUpOutputNotNull99992503344f8fcd943() {

    // Arrange
    final PlaceHolder thisObj = new PlaceHolder("aaaaa", "aaaaa");

    // Act
    final String actual = thisObj.getNameUp();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
