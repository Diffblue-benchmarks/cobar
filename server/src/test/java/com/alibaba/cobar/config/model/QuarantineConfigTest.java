package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.QuarantineConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class QuarantineConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e6af7b2d7387ea9e() {

    // Act, creating object to test constructor
    final QuarantineConfig actual = new QuarantineConfig();

    // Assert result
    Assert.assertNotNull(actual);
    final HashMap<String, Set<String>> hashMap = new HashMap<String, Set<String>>();
    Assert.assertEquals(hashMap, actual.getHosts());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHostsOutput09999c7f1bf07d9058ae() {

    // Arrange
    final QuarantineConfig thisObj = new QuarantineConfig();

    // Act
    final Map<String, Set<String>> actual = thisObj.getHosts();

    // Assert result
    final HashMap<String, Set<String>> hashMap = new HashMap<String, Set<String>>();
    Assert.assertEquals(hashMap, actual);

  }
}
