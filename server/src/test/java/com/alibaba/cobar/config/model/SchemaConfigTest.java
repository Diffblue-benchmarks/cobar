package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.SchemaConfig;
import com.alibaba.cobar.config.model.TableConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class SchemaConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullTrueNotNullOutputNullPointerException99989400e52c10426b9() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final boolean arg3 = true;
    final HashMap<String, TableConfig> arg4 = new HashMap<String, TableConfig>();
    arg4.put("aaaaa", null);

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new SchemaConfig(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAllDataNodesOutput19998064208d7ab5aea9() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final Set<String> actual = thisObj.getAllDataNodes();

    // Assert result
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("aaaaa");
    Assert.assertEquals(hashSet, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataNodeOutputNotNull99934726e347327b414() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final String actual = thisObj.getDataNode();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getGroupOutputNotNull99955e872bf8554f340() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final String actual = thisObj.getGroup();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaDataNodesOutput1999549fc9e8e7ad7b57() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final String[] actual = thisObj.getMetaDataNodes();

    // Assert result
    Assert.assertArrayEquals(new String[]{ "aaaaa" }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull9994c8dd2bd4eb4e253() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRandomDataNodeOutputNotNull9990c1571fbb44221c7() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final String actual = thisObj.getRandomDataNode();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTablesOutput1999d49bc28399a07cce() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final Map<String, TableConfig> actual = thisObj.getTables();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get("aaaka"));
    Assert.assertEquals("AAAAA", actual.get("aaaka").getName());
    Assert.assertTrue(actual.get("aaaka").isRuleRequired());
    Assert.assertArrayEquals(new String[]{ "aaaaa" }, actual.get("aaaka").getDataNodes());
    Assert.assertNull(actual.get("aaaka").getRule());

  }

  // Test written by Diffblue Cover
  @Test
  public void isKeepSqlSchemaOutputTrue999901a5dd4a3fa98a2() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final boolean actual = thisObj.isKeepSqlSchema();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNoShardingOutputFalse999ed393c15102316b3() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaka", tableConfig);
    final SchemaConfig thisObj = new SchemaConfig("aaaaa", "aaaaa", "aaaaa", true, hashMap);

    // Act
    final boolean actual = thisObj.isNoSharding();

    // Assert result
    Assert.assertFalse(actual);

  }
}
