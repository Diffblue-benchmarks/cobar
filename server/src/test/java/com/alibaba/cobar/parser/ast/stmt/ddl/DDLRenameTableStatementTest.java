package com.alibaba.cobar.parser.ast.stmt.ddl;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLRenameTableStatement;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class DDLRenameTableStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9991d7f79a8022f2d1a() {

    // Arrange
    final DDLRenameTableStatement thisObj = new DDLRenameTableStatement();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addRenamePairInputNotNullNotNullOutputNotNull999ec864cc586c0f993() {

    // Arrange
    final DDLRenameTableStatement thisObj = new DDLRenameTableStatement();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "akaaa");
    final Identifier arg1 = identifier;

    // Act
    final DDLRenameTableStatement actual = thisObj.addRenamePair(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(thisObj.getList());
    Assert.assertEquals(1, thisObj.getList().size());
    Assert.assertNotNull(thisObj.getList().get(0));
    Assert.assertNotNull(((Pair) thisObj.getList().get(0)).getKey());
    Assert.assertEquals("AKAAA", ((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("akaaa", ((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getIdText());
    Assert.assertEquals(((Identifier) ((Pair) thisObj.getList().get(0)).getKey()).getParent(), ((Pair) thisObj.getList().get(0)).getValue());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getList());
    Assert.assertEquals(1, actual.getList().size());
    Assert.assertNotNull(actual.getList().get(0));
    Assert.assertNotNull(((Pair) actual.getList().get(0)).getKey());
    Assert.assertEquals("AKAAA", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("akaaa", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getIdText());
    Assert.assertEquals(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent(), ((Pair) actual.getList().get(0)).getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996969daf97f1a29b5() {

    // Act, creating object to test constructor
    final DDLRenameTableStatement actual = new DDLRenameTableStatement();

    // Assert result
    Assert.assertNotNull(actual);
    final LinkedList<Pair<Identifier, Identifier>> linkedList = new LinkedList<Pair<Identifier, Identifier>>();
    Assert.assertEquals(linkedList, actual.getList());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9999d631cd896c6ae20() {

    // Arrange
    final ArrayList<Pair<Identifier, Identifier>> arg0 = new ArrayList<Pair<Identifier, Identifier>>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier identifier2 = new Identifier(identifier1, "aaaaa");
    final Pair<Identifier, Identifier> pair = new Pair<Identifier, Identifier>(identifier, identifier2);
    arg0.add(pair);

    // Act, creating object to test constructor
    final DDLRenameTableStatement actual = new DDLRenameTableStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getList());
    Assert.assertEquals(1, actual.getList().size());
    Assert.assertNotNull(actual.getList().get(0));
    Assert.assertNotNull(((Pair) actual.getList().get(0)).getKey());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNotNull(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent().getIdText());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getList().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) actual.getList().get(0)).getValue());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getList().get(0)).getValue()).getIdTextUpUnescape());
    Assert.assertEquals(((Identifier) ((Pair) actual.getList().get(0)).getKey()).getParent(), ((Identifier) ((Pair) actual.getList().get(0)).getValue()).getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getList().get(0)).getValue()).getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getListOutput09993bcd567db4c785a2() {

    // Arrange
    final DDLRenameTableStatement thisObj = new DDLRenameTableStatement();

    // Act
    final List<Pair<Identifier, Identifier>> actual = thisObj.getList();

    // Assert result
    final LinkedList<Pair<Identifier, Identifier>> linkedList = new LinkedList<Pair<Identifier, Identifier>>();
    Assert.assertEquals(linkedList, actual);

  }
}
