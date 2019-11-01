package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.ClusterConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import javax.imageio.metadata.IIOMetadataNode;



public class ClusterConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullZeroOutputNullPointerException999ced519d8f48508a2() {

    // Arrange
    final IIOMetadataNode arg0 = new IIOMetadataNode();
    final int arg1 = 0;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new ClusterConfig(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
