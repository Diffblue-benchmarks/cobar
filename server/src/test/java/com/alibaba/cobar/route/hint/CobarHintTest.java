package com.alibaba.cobar.route.hint;

import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.route.hint.CobarHint;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLSyntaxErrorException;
import java.util.List;



public class CobarHintTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addDataNodeInputNotNullNotNullOutputVoid999144a9e725c2e3bd5() {

    // Arrange
    final CobarHint thisObj = new CobarHint();
    final Integer arg0 = new Integer(0);
    final Integer arg1 = new Integer(0);

    // Act
    thisObj.addDataNode(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDataNodes());
    Assert.assertEquals(1, thisObj.getDataNodes().size());
    Assert.assertNotNull(thisObj.getDataNodes().get(0));
    Assert.assertNotNull(((Pair) thisObj.getDataNodes().get(0)).getKey());
    Assert.assertNotNull(((Pair) thisObj.getDataNodes().get(0)).getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998e9b9887a8394650() {

    // Act, creating object to test constructor
    final CobarHint actual = new CobarHint();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDataNodes());
    Assert.assertEquals(0, actual.getCurrentIndex());
    Assert.assertNull(actual.getOutputSql());
    Assert.assertNull(actual.getPartitionOperand());
    Assert.assertEquals(-1, actual.getReplica());
    Assert.assertNull(actual.getTable());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCurrentIndexOutputZero9996fee29bc21a6891b() {

    // Arrange
    final CobarHint thisObj = new CobarHint();

    // Act
    final int actual = thisObj.getCurrentIndex();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataNodesOutputVoid999a0e317e03a10c875() {

    // Arrange
    final CobarHint thisObj = new CobarHint();

    // Act
    final List<Pair<Integer, Integer>> actual = thisObj.getDataNodes();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputSqlOutputVoid999b42b2c45e9312f09() {

    // Arrange
    final CobarHint thisObj = new CobarHint();

    // Act
    final String actual = thisObj.getOutputSql();

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getPartitionOperandOutputVoid999db66a89481bd7c02() {
//
//    // Arrange
//    final CobarHint thisObj = new CobarHint();
//
//    // Act
//    final Pair<String[], Object[]> actual = thisObj.getPartitionOperand();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getReplicaOutputNegative999ea996af4d045dda9() {

    // Arrange
    final CobarHint thisObj = new CobarHint();

    // Act
    final int actual = thisObj.getReplica();

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputVoid999de17ca2d47abdc6c() {

    // Arrange
    final CobarHint thisObj = new CobarHint();

    // Act
    final String actual = thisObj.getTable();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void increaseCurrentIndexOutputNotNull999bd6300d0e4461e4a() {

    // Arrange
    final CobarHint thisObj = new CobarHint();

    // Act
    final CobarHint actual = thisObj.increaseCurrentIndex();

    // Assert side effects
    Assert.assertEquals(1, thisObj.getCurrentIndex());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDataNodes());
    Assert.assertEquals(1, actual.getCurrentIndex());
    Assert.assertNull(actual.getOutputSql());
    Assert.assertNull(actual.getPartitionOperand());
    Assert.assertEquals(-1, actual.getReplica());
    Assert.assertNull(actual.getTable());

  }

  // Test written by Diffblue Cover
  @Test
  public void parserCobarHintInputNotNullZeroOutputStringIndexOutOfBoundsException9990d8f267c13d08aae() throws SQLSyntaxErrorException {

    // Arrange
    final String arg0 = "/*!cobar:";
    final int arg1 = 0;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    CobarHint.parserCobarHint(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCurrentIndexInputZeroOutputVoid9990bf1aa42bad9cbe2() {

    // Arrange
    final CobarHint thisObj = new CobarHint();
    final int arg0 = 0;

    // Act
    thisObj.setCurrentIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setReplicaInputZeroOutputVoid999fcae305c4b9ba551() {

    // Arrange
    final CobarHint thisObj = new CobarHint();
    final int arg0 = 0;

    // Act
    thisObj.setReplica(arg0);

    // Assert side effects
    Assert.assertEquals(0, thisObj.getReplica());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableInputNotNullOutputVoid9998ea0a140aa09f3db() {

    // Arrange
    final CobarHint thisObj = new CobarHint();
    final String arg0 = "/*!cobar:";

    // Act
    thisObj.setTable(arg0);

    // Assert side effects
    Assert.assertEquals("/*!COBAR:", thisObj.getTable());

  }
}
