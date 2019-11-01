package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReferences;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;



public class TableReferencesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999773a76ec5a681b27() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences thisObj = new TableReferences(arrayList);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999970691808d82f8d0() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arg0 = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arg0.add(dual);

    // Act, creating object to test constructor
    final TableReferences actual = new TableReferences(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getTableReferenceList());
    Assert.assertEquals(1, actual.getTableReferenceList().size());
    Assert.assertNotNull(actual.getTableReferenceList().get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void ensureListTypeInputNotNullOutput19997e9ba63fbabc4e07() {

    // Arrange
    final ArrayList<TableReference> arg0 = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arg0.add(dual);

    // Act
    final List<TableReference> actual = TableReferences.ensureListType(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputZero9996ec13e3a25ff8e0c() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences thisObj = new TableReferences(arrayList);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableReferenceListOutput199962cfacc4b496cdad() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences thisObj = new TableReferences(arrayList);

    // Act
    final List<TableReference> actual = thisObj.getTableReferenceList();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputTrue99949ca44183a4ee0de() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences thisObj = new TableReferences(arrayList);

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid9998f79a0e050f568ab() throws SQLSyntaxErrorException {

    // Arrange
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences thisObj = new TableReferences(arrayList);

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
