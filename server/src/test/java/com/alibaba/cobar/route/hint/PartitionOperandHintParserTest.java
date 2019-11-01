package com.alibaba.cobar.route.hint;

import com.alibaba.cobar.route.hint.CobarHint;
import com.alibaba.cobar.route.hint.PartitionOperandHintParser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLSyntaxErrorException;



public class PartitionOperandHintParserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998c2243ff11dcc436() {

    // Act, creating object to test constructor
    final PartitionOperandHintParser actual = new PartitionOperandHintParser();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void processInputNotNullNotNullNotNullOutputStringIndexOutOfBoundsException999c8c0d36a100ec3fc() throws SQLSyntaxErrorException {

    // Arrange
    final PartitionOperandHintParser thisObj = new PartitionOperandHintParser();
    final CobarHint arg0 = new CobarHint();
    final String arg1 = ")";
    final String arg2 = ")";
    try {

      // Act
      thrown.expect(StringIndexOutOfBoundsException.class);
      thisObj.process(arg0, arg1, arg2);
    } catch (StringIndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(arg0);
      Assert.assertNull(arg0.getDataNodes());
      Assert.assertEquals(1, arg0.getCurrentIndex());
      Assert.assertNull(arg0.getOutputSql());
      Assert.assertNull(arg0.getPartitionOperand());
      Assert.assertEquals(-1, arg0.getReplica());
      Assert.assertNull(arg0.getTable());
      throw ex;
    }

  }
}
