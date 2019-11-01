package com.alibaba.cobar.net;

import com.alibaba.cobar.heartbeat.CobarDetector;
import com.alibaba.cobar.net.BackendConnection;
import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.net.NIOProcessor;
import com.alibaba.cobar.net.buffer.BufferPool;
import com.alibaba.cobar.statistic.CommandCount;
import com.alibaba.cobar.util.NameableExecutor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadFactory;



public class NIOProcessorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addBackendInputNotNullOutputVoid9997d05b1a2d2f366a6() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
    final CobarDetector arg0 = new CobarDetector(null);

    // Act
    thisObj.addBackend(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addFrontendInputNullOutputNullPointerException999d8dc6cddd9c475b0() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
    final FrontendConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addFrontend(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addNetInBytesInputPositiveOutputVoid999862d8915352b84db() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
    final long arg0 = 1L;

    // Act
    thisObj.addNetInBytes(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getNetInBytes());

  }

  // Test written by Diffblue Cover
  @Test
  public void addNetOutBytesInputPositiveOutputVoid9990477a3a03a48d9be() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
    final long arg0 = 1L;

    // Act
    thisObj.addNetOutBytes(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getNetOutBytes());

  }

  // Test written by Diffblue Cover
  @Test
  public void checkOutputVoid999f9a84381b697a202() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    thisObj.check();

    // The method returns void, testing that no exception is thrown

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullPositivePositivePositivePositivePositiveOutputNotNull9995cce7fc41009dd5b() throws IOException {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final int arg1 = 4096;
//    final int arg2 = 4096;
//    final int arg3 = 4096;
//    final int arg4 = 4096;
//    final int arg5 = 4096;
//
//    // Act, creating object to test constructor
//    final NIOProcessor actual = new NIOProcessor(arg0, arg1, arg2, arg3, arg4, arg5);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getHandler());
//    Assert.assertEquals("aaaaa-H", actual.getHandler().getName());
//    Assert.assertNotNull(actual.getHandler().getRejectedExecutionHandler());
//    Assert.assertEquals(4096, actual.getHandler().getMaximumPoolSize());
//    Assert.assertEquals(4096, actual.getHandler().getCorePoolSize());
//    Assert.assertNotNull(actual.getHandler().getThreadFactory());
//    Assert.assertNotNull(actual.getHandler().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getHandler().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getHandler().getQueue(), "size"));
//    Assert.assertNotNull(actual.getCommitter());
//    Assert.assertEquals("aaaaa-C", actual.getCommitter().getName());
//    Assert.assertEquals(actual.getHandler().getRejectedExecutionHandler(), actual.getCommitter().getRejectedExecutionHandler());
//    Assert.assertEquals(4096, actual.getCommitter().getMaximumPoolSize());
//    Assert.assertEquals(4096, actual.getCommitter().getCorePoolSize());
//    Assert.assertNotNull(actual.getCommitter().getThreadFactory());
//    Assert.assertNotNull(actual.getCommitter().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getCommitter().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getCommitter().getQueue(), "size"));
//    Assert.assertEquals("aaaaa", actual.getName());
//    Assert.assertNotNull(actual.getExecutor());
//    Assert.assertEquals("aaaaa-E", actual.getExecutor().getName());
//    Assert.assertEquals(actual.getHandler().getRejectedExecutionHandler(), actual.getExecutor().getRejectedExecutionHandler());
//    Assert.assertEquals(4096, actual.getExecutor().getMaximumPoolSize());
//    Assert.assertEquals(4096, actual.getExecutor().getCorePoolSize());
//    Assert.assertNotNull(actual.getExecutor().getThreadFactory());
//    Assert.assertNotNull(actual.getExecutor().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getExecutor().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getExecutor().getQueue(), "size"));
//    Assert.assertNotNull(actual.getBackends());
//    Assert.assertNotNull(actual.getFrontends());
//    Assert.assertNotNull(actual.getBufferPool());
//    Assert.assertEquals(1, actual.getBufferPool().size());
//    Assert.assertEquals(0, actual.getBufferPool().getNewCount());
//    Assert.assertEquals(0L, actual.getNetInBytes());
//    Assert.assertNotNull(actual.getCommands());
//    Assert.assertEquals(0L, actual.getNetOutBytes());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullPositivePositivePositiveOutputNotNull999cd55e5df393ee903() throws IOException {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final int arg1 = 4096;
//    final int arg2 = 4096;
//    final int arg3 = 4096;
//
//    // Act, creating object to test constructor
//    final NIOProcessor actual = new NIOProcessor(arg0, arg1, arg2, arg3);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getHandler());
//    Assert.assertEquals("aaaaa-H", actual.getHandler().getName());
//    Assert.assertNotNull(actual.getHandler().getRejectedExecutionHandler());
//    Assert.assertEquals(4096, actual.getHandler().getMaximumPoolSize());
//    Assert.assertEquals(4096, actual.getHandler().getCorePoolSize());
//    Assert.assertNotNull(actual.getHandler().getThreadFactory());
//    Assert.assertNotNull(actual.getHandler().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getHandler().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getHandler().getQueue(), "size"));
//    Assert.assertNotNull(actual.getCommitter());
//    Assert.assertEquals("aaaaa-C", actual.getCommitter().getName());
//    Assert.assertEquals(actual.getHandler().getRejectedExecutionHandler(), actual.getCommitter().getRejectedExecutionHandler());
//    Assert.assertEquals(4096, actual.getCommitter().getMaximumPoolSize());
//    Assert.assertEquals(4096, actual.getCommitter().getCorePoolSize());
//    Assert.assertNotNull(actual.getCommitter().getThreadFactory());
//    Assert.assertNotNull(actual.getCommitter().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getCommitter().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getCommitter().getQueue(), "size"));
//    Assert.assertEquals("aaaaa", actual.getName());
//    Assert.assertNotNull(actual.getExecutor());
//    Assert.assertEquals("aaaaa-E", actual.getExecutor().getName());
//    Assert.assertEquals(actual.getHandler().getRejectedExecutionHandler(), actual.getExecutor().getRejectedExecutionHandler());
//    Assert.assertEquals(4096, actual.getExecutor().getMaximumPoolSize());
//    Assert.assertEquals(4096, actual.getExecutor().getCorePoolSize());
//    Assert.assertNotNull(actual.getExecutor().getThreadFactory());
//    Assert.assertNotNull(actual.getExecutor().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getExecutor().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getExecutor().getQueue(), "size"));
//    Assert.assertNotNull(actual.getBackends());
//    Assert.assertNotNull(actual.getFrontends());
//    Assert.assertNotNull(actual.getBufferPool());
//    Assert.assertEquals(4096, actual.getBufferPool().size());
//    Assert.assertEquals(0, actual.getBufferPool().getNewCount());
//    Assert.assertEquals(0L, actual.getNetInBytes());
//    Assert.assertNotNull(actual.getCommands());
//    Assert.assertEquals(0L, actual.getNetOutBytes());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999725be24c42c80350() throws IOException {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//
//    // Act, creating object to test constructor
//    final NIOProcessor actual = new NIOProcessor(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getHandler());
//    Assert.assertEquals("aaaaa-H", actual.getHandler().getName());
//    Assert.assertNotNull(actual.getHandler().getRejectedExecutionHandler());
//    Assert.assertEquals(8, actual.getHandler().getMaximumPoolSize());
//    Assert.assertEquals(8, actual.getHandler().getCorePoolSize());
//    Assert.assertNotNull(actual.getHandler().getThreadFactory());
//    Assert.assertNotNull(actual.getHandler().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getHandler().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getHandler().getQueue(), "size"));
//    Assert.assertNotNull(actual.getCommitter());
//    Assert.assertEquals("aaaaa-C", actual.getCommitter().getName());
//    Assert.assertEquals(actual.getHandler().getRejectedExecutionHandler(), actual.getCommitter().getRejectedExecutionHandler());
//    Assert.assertEquals(8, actual.getCommitter().getMaximumPoolSize());
//    Assert.assertEquals(8, actual.getCommitter().getCorePoolSize());
//    Assert.assertNotNull(actual.getCommitter().getThreadFactory());
//    Assert.assertNotNull(actual.getCommitter().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getCommitter().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getCommitter().getQueue(), "size"));
//    Assert.assertEquals("aaaaa", actual.getName());
//    Assert.assertNotNull(actual.getExecutor());
//    Assert.assertEquals("aaaaa-E", actual.getExecutor().getName());
//    Assert.assertEquals(actual.getHandler().getRejectedExecutionHandler(), actual.getExecutor().getRejectedExecutionHandler());
//    Assert.assertEquals(8, actual.getExecutor().getMaximumPoolSize());
//    Assert.assertEquals(8, actual.getExecutor().getCorePoolSize());
//    Assert.assertNotNull(actual.getExecutor().getThreadFactory());
//    Assert.assertNotNull(actual.getExecutor().getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getExecutor().getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getExecutor().getQueue(), "size"));
//    Assert.assertNotNull(actual.getBackends());
//    Assert.assertNotNull(actual.getFrontends());
//    Assert.assertNotNull(actual.getBufferPool());
//    Assert.assertEquals(4096, actual.getBufferPool().size());
//    Assert.assertEquals(0, actual.getBufferPool().getNewCount());
//    Assert.assertEquals(0L, actual.getNetInBytes());
//    Assert.assertNotNull(actual.getCommands());
//    Assert.assertEquals(0L, actual.getNetOutBytes());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getBackendsOutputNotNull9995dd3ded3fec319ad() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final ConcurrentMap<Long, BackendConnection> actual = thisObj.getBackends();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBufferPoolOutputNotNull99976e0eb1d91259fb5() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final BufferPool actual = thisObj.getBufferPool();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(4096, actual.size());
    Assert.assertEquals(0, actual.getNewCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCommandsOutputNotNull9991fb1aaf5d62a5544() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final CommandCount actual = thisObj.getCommands();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getCommitterOutputNotNull9997d82b13ddc7f3352() throws IOException {
//
//    // Arrange
//    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
//
//    // Act
//    final NameableExecutor actual = thisObj.getCommitter();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("aaaaa-C", actual.getName());
//    Assert.assertNotNull(actual.getRejectedExecutionHandler());
//    Assert.assertEquals(8, actual.getMaximumPoolSize());
//    Assert.assertEquals(8, actual.getCorePoolSize());
//    Assert.assertNotNull(actual.getThreadFactory());
//    Assert.assertNotNull(actual.getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getQueue(), "size"));
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getExecutorOutputNotNull999c3e5ba73acab7009() throws IOException {
//
//    // Arrange
//    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
//
//    // Act
//    final NameableExecutor actual = thisObj.getExecutor();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("aaaaa-E", actual.getName());
//    Assert.assertNotNull(actual.getRejectedExecutionHandler());
//    Assert.assertEquals(8, actual.getMaximumPoolSize());
//    Assert.assertEquals(8, actual.getCorePoolSize());
//    Assert.assertNotNull(actual.getThreadFactory());
//    Assert.assertNotNull(actual.getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getQueue(), "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getFrontendsOutputNotNull999708adc2e38d8b4d9() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final ConcurrentMap<Long, FrontendConnection> actual = thisObj.getFrontends();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getHandlerOutputNotNull9993a585b06efbf8666() throws IOException {
//
//    // Arrange
//    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
//
//    // Act
//    final NameableExecutor actual = thisObj.getHandler();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("aaaaa-H", actual.getName());
//    Assert.assertNotNull(actual.getRejectedExecutionHandler());
//    Assert.assertEquals(8, actual.getMaximumPoolSize());
//    Assert.assertEquals(8, actual.getCorePoolSize());
//    Assert.assertNotNull(actual.getThreadFactory());
//    Assert.assertNotNull(actual.getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getQueue(), "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull99988b036413dcfe8b7() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNetInBytesOutputZero999f3349d5646c990aa() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final long actual = thisObj.getNetInBytes();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNetOutBytesOutputZero999732b03124bd0efbb() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final long actual = thisObj.getNetOutBytes();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getReactCountOutputZero99919ea5ecba9b0aeee() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final long actual = thisObj.getReactCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRegisterQueueSizeOutputZero999d3d9aba3b0c4d356() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final int actual = thisObj.getRegisterQueueSize();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriteQueueSizeOutputZero999cf3eb158784d15ea() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    final int actual = thisObj.getWriteQueueSize();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void postRegisterInputNotNullOutputVoid999768e7d76607c2608() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
    final CobarDetector arg0 = new CobarDetector(null);

    // Act
    thisObj.postRegister(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void postWriteInputNotNullOutputVoid9998a1f2669d7e75c15() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");
    final CobarDetector arg0 = new CobarDetector(null);

    // Act
    thisObj.postWrite(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startupOutputVoid99983cf6070c8b5def1() throws IOException {

    // Arrange
    final NIOProcessor thisObj = new NIOProcessor("aaaaa");

    // Act
    thisObj.startup();

    // The method returns void, testing that no exception is thrown

  }
}
