package com.alibaba.cobar;

import com.alibaba.cobar.CobarCluster;
import com.alibaba.cobar.config.model.ClusterConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarClusterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException999f4abaec3872ecf48() {

    // Arrange
    final ClusterConfig arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new CobarCluster(arg0);

    // The method is not expected to return due to exception thrown

  }
}
