package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.SystemConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SystemConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99939db9064ea19cb19() {

    // Act, creating object to test constructor
    final SystemConfig actual = new SystemConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(10000L, actual.getClusterHeartbeatTimeout());
    Assert.assertEquals(3, actual.getTxIsolation());
    Assert.assertEquals(8, actual.getProcessorExecutor());
    Assert.assertEquals(50148, actual.getParserCommentVersion());
    Assert.assertEquals(28800000L, actual.getIdleTimeout());
    Assert.assertEquals(60000L, actual.getDataNodeIdleCheckPeriod());
    Assert.assertEquals(10000L, actual.getDataNodeHeartbeatPeriod());
    Assert.assertEquals("_HEARTBEAT_USER_", actual.getClusterHeartbeatUser());
    Assert.assertEquals(8, actual.getProcessorCommitter());
    Assert.assertEquals("_HEARTBEAT_PASS_", actual.getClusterHeartbeatPass());
    Assert.assertEquals(8, actual.getInitExecutor());
    Assert.assertEquals(5000L, actual.getClusterHeartbeatPeriod());
    Assert.assertEquals(15000L, actual.getProcessorCheckPeriod());
    Assert.assertEquals(8, actual.getManagerExecutor());
    Assert.assertEquals(10, actual.getClusterHeartbeatRetry());
    Assert.assertEquals(10, actual.getSqlRecordCount());
    Assert.assertEquals(8, actual.getProcessorHandler());
    Assert.assertEquals(8, actual.getProcessors());
    Assert.assertEquals(9066, actual.getManagerPort());
    Assert.assertEquals("UTF-8", actual.getCharset());
    Assert.assertEquals(8066, actual.getServerPort());
    Assert.assertEquals(8, actual.getTimerExecutor());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharsetOutputNotNull9998926cd44ab034781() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final String actual = thisObj.getCharset();

    // Assert result
    Assert.assertEquals("UTF-8", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClusterHeartbeatPassOutputNotNull999bf3166a4fa25aa02() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final String actual = thisObj.getClusterHeartbeatPass();

    // Assert result
    Assert.assertEquals("_HEARTBEAT_PASS_", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClusterHeartbeatPeriodOutputPositive999b974e381679f01a9() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final long actual = thisObj.getClusterHeartbeatPeriod();

    // Assert result
    Assert.assertEquals(5000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClusterHeartbeatRetryOutputPositive9991aaf4477597b975b() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getClusterHeartbeatRetry();

    // Assert result
    Assert.assertEquals(10, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClusterHeartbeatTimeoutOutputPositive999ad19de2bb7f816ce() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final long actual = thisObj.getClusterHeartbeatTimeout();

    // Assert result
    Assert.assertEquals(10000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClusterHeartbeatUserOutputNotNull999b29a44f82ef01442() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final String actual = thisObj.getClusterHeartbeatUser();

    // Assert result
    Assert.assertEquals("_HEARTBEAT_USER_", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataNodeHeartbeatPeriodOutputPositive9997d1003a4326a44a4() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final long actual = thisObj.getDataNodeHeartbeatPeriod();

    // Assert result
    Assert.assertEquals(10000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataNodeIdleCheckPeriodOutputPositive9998931ed85b0df0809() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final long actual = thisObj.getDataNodeIdleCheckPeriod();

    // Assert result
    Assert.assertEquals(60000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdleTimeoutOutputPositive99928f20a7fbd0d5f21() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final long actual = thisObj.getIdleTimeout();

    // Assert result
    Assert.assertEquals(28800000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInitExecutorOutputPositive999c79c5abe73b97c85() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getInitExecutor();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getManagerExecutorOutputPositive999404aa00e5d7b5ac3() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getManagerExecutor();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getManagerPortOutputPositive9995d5bd54edf3d4b66() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getManagerPort();

    // Assert result
    Assert.assertEquals(9066, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getParserCommentVersionOutputPositive99970c2da0a117e9deb() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getParserCommentVersion();

    // Assert result
    Assert.assertEquals(50148, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProcessorCheckPeriodOutputPositive9991b6375a6800d365f() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final long actual = thisObj.getProcessorCheckPeriod();

    // Assert result
    Assert.assertEquals(15000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProcessorCommitterOutputPositive9997677b396416d5be2() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getProcessorCommitter();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProcessorExecutorOutputPositive99903c2ea8a9f0f1640() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getProcessorExecutor();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProcessorHandlerOutputPositive999b9248e6150b672dd() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getProcessorHandler();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getProcessorsOutputPositive9991e1ca33162f051c9() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getProcessors();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getServerPortOutputPositive9996dd12e872535bed5() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getServerPort();

    // Assert result
    Assert.assertEquals(8066, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSqlRecordCountOutputPositive99913db1873979adcae() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getSqlRecordCount();

    // Assert result
    Assert.assertEquals(10, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimerExecutorOutputPositive9995ef2ce183d181dae() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getTimerExecutor();

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTxIsolationOutputPositive999ba0e838ef2b002cd() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();

    // Act
    final int actual = thisObj.getTxIsolation();

    // Assert result
    Assert.assertEquals(3, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharsetInputNotNullOutputVoid99902bc768a4fd8b6b7() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final String arg0 = "UTF-8";

    // Act
    thisObj.setCharset(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClusterHeartbeatPassInputNotNullOutputVoid999f86d2da8e94643ef() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final String arg0 = "UTF-8";

    // Act
    thisObj.setClusterHeartbeatPass(arg0);

    // Assert side effects
    Assert.assertEquals("UTF-8", thisObj.getClusterHeartbeatPass());

  }

  // Test written by Diffblue Cover
  @Test
  public void setClusterHeartbeatPeriodInputPositiveOutputVoid999327ec651baefcd72() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final long arg0 = 5000L;

    // Act
    thisObj.setClusterHeartbeatPeriod(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClusterHeartbeatRetryInputPositiveOutputVoid9991b119e3a3bd32720() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setClusterHeartbeatRetry(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getClusterHeartbeatRetry());

  }

  // Test written by Diffblue Cover
  @Test
  public void setClusterHeartbeatTimeoutInputPositiveOutputVoid999563b435abbed3259() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final long arg0 = 5000L;

    // Act
    thisObj.setClusterHeartbeatTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(5000L, thisObj.getClusterHeartbeatTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setClusterHeartbeatUserInputNotNullOutputVoid99986aaaa87c7c7a70a() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final String arg0 = "UTF-8";

    // Act
    thisObj.setClusterHeartbeatUser(arg0);

    // Assert side effects
    Assert.assertEquals("UTF-8", thisObj.getClusterHeartbeatUser());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataNodeHeartbeatPeriodInputPositiveOutputVoid99908d1f51e58cf1a5d() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final long arg0 = 5000L;

    // Act
    thisObj.setDataNodeHeartbeatPeriod(arg0);

    // Assert side effects
    Assert.assertEquals(5000L, thisObj.getDataNodeHeartbeatPeriod());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataNodeIdleCheckPeriodInputPositiveOutputVoid999cc3f364b739f615f() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final long arg0 = 5000L;

    // Act
    thisObj.setDataNodeIdleCheckPeriod(arg0);

    // Assert side effects
    Assert.assertEquals(5000L, thisObj.getDataNodeIdleCheckPeriod());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIdleTimeoutInputPositiveOutputVoid999433c7dd65808b6b7() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final long arg0 = 5000L;

    // Act
    thisObj.setIdleTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(5000L, thisObj.getIdleTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setInitExecutorInputPositiveOutputVoid999ad996c421d637391() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setInitExecutor(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getInitExecutor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setManagerExecutorInputPositiveOutputVoid999255f315283705052() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setManagerExecutor(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getManagerExecutor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setManagerPortInputPositiveOutputVoid999d411d9ca619d1c08() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setManagerPort(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getManagerPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void setParserCommentVersionInputPositiveOutputVoid9991cf7033e91a08d63() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setParserCommentVersion(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getParserCommentVersion());

  }

  // Test written by Diffblue Cover
  @Test
  public void setProcessorCheckPeriodInputPositiveOutputVoid999b96c5a986ba2c87f() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final long arg0 = 5000L;

    // Act
    thisObj.setProcessorCheckPeriod(arg0);

    // Assert side effects
    Assert.assertEquals(5000L, thisObj.getProcessorCheckPeriod());

  }

  // Test written by Diffblue Cover
  @Test
  public void setProcessorCommitterInputPositiveOutputVoid99914cebf3d9c1e24b1() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setProcessorCommitter(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getProcessorCommitter());

  }

  // Test written by Diffblue Cover
  @Test
  public void setProcessorExecutorInputPositiveOutputVoid9994eebabadd9eb4de7() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setProcessorExecutor(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getProcessorExecutor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setProcessorHandlerInputPositiveOutputVoid999e962083bcd2e6e63() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setProcessorHandler(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getProcessorHandler());

  }

  // Test written by Diffblue Cover
  @Test
  public void setProcessorsInputPositiveOutputVoid999b4e7045b10f3b835() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setProcessors(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getProcessors());

  }

  // Test written by Diffblue Cover
  @Test
  public void setServerPortInputPositiveOutputVoid999635660e3d9be8b04() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setServerPort(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getServerPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSqlRecordCountInputPositiveOutputVoid9993b784e48da91ade5() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setSqlRecordCount(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getSqlRecordCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimerExecutorInputPositiveOutputVoid9998dfa6b69e59a314c() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setTimerExecutor(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getTimerExecutor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTxIsolationInputPositiveOutputVoid999104f570e8a67d310() {

    // Arrange
    final SystemConfig thisObj = new SystemConfig();
    final int arg0 = 3;

    // Act
    thisObj.setTxIsolation(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
