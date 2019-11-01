package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseShow;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseShowTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e49a4a871a0db185() {

    // Act, creating object to test constructor
    final ManagerParseShow actual = new ManagerParseShow();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhereParameterInputNotNullOutputNotNull9994cbc1ead69bd9480() {

    // Arrange
    final String arg0 = " ";

    // Act
    final String actual = ManagerParseShow.getWhereParameter(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSqlIdInputNotNullZeroOutputFalse9992156931bd91c2fa3() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final boolean actual = ManagerParseShow.isSqlId(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isWhereInputNotNullZeroOutputFalse999ca85cb406c46f523() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final boolean actual = ManagerParseShow.isWhere(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullZeroOutputNegative999c213818b7018cc23() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2BCheckInputNotNullZeroOutputNegative999591abb3f552ab731() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2BCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2CCheckInputNotNullZeroOutputNegative999207f98ea6a434d77() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2CCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2CheckInputNotNullZeroOutputNegative9999da8d75160a7ba7d() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2CoCheckInputNotNullZeroOutputNegative999b4ddc74ce0e01cec() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2CoCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2ComCheckInputNotNullZeroOutputNegative9990b2969ddad664893() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2ComCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2ConCheckInputNotNullZeroOutputNegative999d899f6710e428a18() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2ConCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2ConnectonSQLInputNotNullZeroOutputNegative9997e4164d9172fd836() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2ConnectonSQL(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DCheckInputNotNullZeroOutputNegative9991b3bda39f24c299d() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataBCheckInputNotNullZeroOutputNegative999bc8713a99c8dc1fa() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataBCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataNCheckInputNotNullZeroOutputNegative999ef991ef7a2fe013a() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataNCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataNWhereCheckInputNotNullZeroOutputNegative999918f9ec1361193cd() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataNWhereCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataNWhereSchemaCheckInputNotNullZeroOutputNegative9999c53ce455e97cf6f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataNWhereSchemaCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataSCheckInputNotNullZeroOutputNegative999dd429e640658e70e() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataSCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataSWhereCheckInputNotNullZeroOutputNegative99963ca1b64e36cb895() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataSWhereCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2DataSWhereDatanodeCheckInputNotNullZeroOutputNegative999c3f6b6c41fca99d3() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2DataSWhereDatanodeCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2HCheckInputNotNullZeroOutputNegative999ee01a730734546b5() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2HCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2HeCheckInputNotNullZeroOutputNegative9992d6d4fd325849939() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2HeCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2HeaCheckInputNotNullZeroOutputNegative999b26ae8e80e0b723e() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2HeaCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2HelCheckInputNotNullZeroOutputNegative99905368a9f2abd2c00() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2HelCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2PCheckInputNotNullZeroOutputNegative99929685019d89c7730() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2PCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2PaCheckInputNotNullZeroOutputNegative999288f0fe7d2e5b924() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2PaCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2PrCheckInputNotNullZeroOutputNegative9999acff6175179dabc() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2PrCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2RCheckInputNotNullZeroOutputNegative999f150ff5b967dff96() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2RCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SCheckInputNotNullZeroOutputNegative99920182b0060af540a() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SeCheckInputNotNullZeroOutputNegative9990c2f9cf23ead47e4() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SeCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SlCheckInputNotNullZeroOutputNegative999166de97696a907a7() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SlCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SlowWhereCheckInputNotNullZeroOutputNegative999616b592a3ed0263f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SlowWhereCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SlowWhereDCheckInputNotNullZeroOutputNegative9993e6a10ab0b46a921() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SlowWhereDCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SlowWhereSCheckInputNotNullZeroOutputNegative9990e695a36a6d17822() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SlowWhereSCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqCheckInputNotNullZeroOutputNegative9996bac284c3724239f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqlBlankCheckInputNotNullZeroOutputNegative9997c5095d4d59b3355() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqlBlankCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqlCheckInputNotNullZeroOutputNegative99975d68baea20c68c7() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqlCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqlDCheckInputNotNullZeroOutputNegative9996b961cd7052dc1dd() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqlDCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqlDotCheckInputNotNullZeroOutputNegative99963ffc348d29bd9a7() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqlDotCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqlECheckInputNotNullZeroOutputNegative9996c853029f4ad061f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqlECheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2SqlSCheckInputNotNullZeroOutputNegative999dbbb32cda037313d() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2SqlSCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2TCheckInputNotNullZeroOutputNegative999b46366e70b3987cd() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2TCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2ThCheckInputNotNullZeroOutputNegative999da51e97ac86efeed() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2ThCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2TiCheckInputNotNullZeroOutputNegative99982e5d89e18e366fa() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2TiCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2TimeCCheckInputNotNullZeroOutputNegative9997441850d4408512f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2TimeCCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2TimeSCheckInputNotNullZeroOutputNegative9992d1e27b96c3bbc9f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2TimeSCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void show2VCheckInputNotNullZeroOutputNegative9995e81a54f39ff3c2a() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.show2VCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void showCCheckInputNotNullZeroOutputNegative9998a36ef81db3419af() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.showCCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void showVCheckInputNotNullZeroOutputNegative9998804039ccec985f0() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 0;

    // Act
    final int actual = ManagerParseShow.showVCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
