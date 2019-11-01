package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.ConfigUtil;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.ParserConfigurationException;



public class ConfigUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999dc359551c19f4cb() {

    // Act, creating object to test constructor
    final ConfigUtil actual = new ConfigUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void filterInputNotNullNotNullOutputNotNull99923e8534a44a1d06d() {

    // Arrange
    final String arg0 = " elements length  over one!";
    final Properties arg1 = new Properties();
    arg1.put(" elements length  over one!", " elements length  over one!");

    // Act
    final String actual = ConfigUtil.filter(arg0, arg1);

    // Assert result
    Assert.assertEquals(" elements length  over one!", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void filterInputNotNullOutputNotNull999e7b6292ed0a78e4e() {

    // Arrange
    final String arg0 = " elements length  over one!";

    // Act
    final String actual = ConfigUtil.filter(arg0);

    // Assert result
    Assert.assertEquals(" elements length  over one!", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDocumentInputNotNullNotNullOutputSAXParseException999abe38990cfe54cbd() throws IOException, ParserConfigurationException, SAXException {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final byte[] myByteArray1 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray1);
    try {

      // Act
      thrown.expect(SAXParseException.class);
      ConfigUtil.getDocument(arg0, arg1);
    } catch (SAXParseException ex) {

      // Assert side effects
      Assert.assertNotNull(arg1);
      Assert.assertEquals(24, Reflector.getInstanceField(arg1, "count"));
      Assert.assertEquals(0, Reflector.getInstanceField(arg1, "mark"));
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg1, "buf")));
      Assert.assertEquals(24, Reflector.getInstanceField(arg1, "pos"));
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void loadAttributesInputNotNullOutput0999c289ac438175c26a() {

    // Arrange
    final IIOMetadataNode arg0 = new IIOMetadataNode();

    // Act
    final Map<String, Object> actual = ConfigUtil.loadAttributes(arg0);

    // Assert result
    final HashMap<String, Object> hashMap = new HashMap<String, Object>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void loadBeanInputNotNullNotNullOutputNullPointerException999d1dbc6d393f71615() {

    // Arrange
    final IIOMetadataNode arg0 = new IIOMetadataNode();
    final String arg1 = " elements length  over one!";

    // Act
    thrown.expect(NullPointerException.class);
    ConfigUtil.loadBean(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void loadBeanInputNotNullOutputNullPointerException999bf6f64936219ed7e() {

    // Arrange
    final IIOMetadataNode arg0 = new IIOMetadataNode();

    // Act
    thrown.expect(NullPointerException.class);
    ConfigUtil.loadBean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void loadElementInputNotNullNotNullOutputNullPointerException9998934f0dc7cf23ced() {

    // Arrange
    final IIOMetadataNode arg0 = new IIOMetadataNode();
    final String arg1 = " elements length  over one!";

    // Act
    thrown.expect(NullPointerException.class);
    ConfigUtil.loadElement(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void loadElementsInputNotNullOutput0999af39a1bc94e6f4cf() {

    // Arrange
    final IIOMetadataNode arg0 = new IIOMetadataNode();

    // Act
    final Map<String, Object> actual = ConfigUtil.loadElements(arg0);

    // Assert result
    final HashMap<String, Object> hashMap = new HashMap<String, Object>();
    Assert.assertEquals(hashMap, actual);

  }
}
