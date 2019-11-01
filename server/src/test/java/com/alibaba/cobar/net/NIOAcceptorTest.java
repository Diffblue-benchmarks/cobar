package com.alibaba.cobar.net;

import com.alibaba.cobar.manager.ManagerConnectionFactory;
import com.alibaba.cobar.net.NIOAcceptor;
import com.alibaba.cobar.net.NIOProcessor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class NIOAcceptorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullZeroNotNullOutputNotNull999996ebaf0ed7f5762() throws IOException {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final int arg1 = 0;
//    final ManagerConnectionFactory arg2 = new ManagerConnectionFactory();
//
//    // Act, creating object to test constructor
//    final NIOAcceptor actual = new NIOAcceptor(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0L, actual.getAcceptCount());
//    Assert.assertEquals(0, actual.getPort());
//    Assert.assertEquals(5, actual.getPriority());
//    Assert.assertNull(Reflector.getInstanceField(actual, "inheritableThreadLocals"));
//    Assert.assertNotNull(actual.getThreadGroup());
//    Assert.assertEquals(5, Reflector.getInstanceField(actual.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", actual.getThreadGroup().getName());
//    Assert.assertEquals(10, actual.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(actual.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(actual.getThreadGroup(), "threads"));
//    Assert.assertEquals(4, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3]);
//    Assert.assertFalse(actual.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(actual.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(3, Reflector.getInstanceField(actual.getThreadGroup(), "nthreads"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "parkBlocker"));
//    Assert.assertEquals("aaaaa", actual.getName());
//    Assert.assertFalse(actual.isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(actual, "threadLocalRandomSeed"));
//    Assert.assertEquals(16L, actual.getId());
//    Assert.assertNull(Reflector.getInstanceField(actual, "threadLocals"));
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getAcceptCountOutputZero999a5df490a12e50929() throws IOException {
//
//    // Arrange
//    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
//    final NIOAcceptor thisObj = new NIOAcceptor("aaaaa", 0, managerConnectionFactory);
//
//    // Act
//    final long actual = thisObj.getAcceptCount();
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getThreadGroup());
//    Assert.assertEquals(11, Reflector.getInstanceField(thisObj.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", thisObj.getThreadGroup().getName());
//    Assert.assertEquals(10, thisObj.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(thisObj.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"));
//    Assert.assertEquals(8, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"));
//    Assert.assertEquals("-R-R", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSeed"));
//    Assert.assertEquals(17L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "parkBlocker"));
//    Assert.assertEquals("-R-W", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocalRandomSeed"));
//    Assert.assertEquals(18L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5], "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-2", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5], "threadLocalRandomSeed"));
//    Assert.assertEquals(23L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5], "threadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[6]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[7]);
//    Assert.assertFalse(thisObj.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(thisObj.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(6, Reflector.getInstanceField(thisObj.getThreadGroup(), "nthreads"));
//
//    // Assert result
//    Assert.assertEquals(0L, actual);
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getPortOutputZero999e258257a536cee8e() throws IOException {
//
//    // Arrange
//    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
//    final NIOAcceptor thisObj = new NIOAcceptor("aaaaa", 0, managerConnectionFactory);
//
//    // Act
//    final int actual = thisObj.getPort();
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getThreadGroup());
//    Assert.assertEquals(4, Reflector.getInstanceField(thisObj.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", thisObj.getThreadGroup().getName());
//    Assert.assertEquals(10, thisObj.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(thisObj.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"));
//    Assert.assertEquals(4, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3]);
//    Assert.assertFalse(thisObj.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(thisObj.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(3, Reflector.getInstanceField(thisObj.getThreadGroup(), "nthreads"));
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setProcessorsInput3OutputVoid9992a5159ba601e26e1() throws IOException {
//
//    // Arrange
//    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
//    final NIOAcceptor thisObj = new NIOAcceptor("aaaaa", 0, managerConnectionFactory);
//    final NIOProcessor nIOProcessor = new NIOProcessor("aaaaa");
//    final NIOProcessor[] arg0 = { nIOProcessor, null, nIOProcessor };
//
//    // Act
//    thisObj.setProcessors(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getThreadGroup());
//    Assert.assertEquals(9, Reflector.getInstanceField(thisObj.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", thisObj.getThreadGroup().getName());
//    Assert.assertEquals(10, thisObj.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(thisObj.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"));
//    Assert.assertEquals(8, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"));
//    Assert.assertEquals("-R-R", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSeed"));
//    Assert.assertEquals(17L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "parkBlocker"));
//    Assert.assertEquals("-R-W", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocalRandomSeed"));
//    Assert.assertEquals(18L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4], "threadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[6]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[7]);
//    Assert.assertFalse(thisObj.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(thisObj.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(5, Reflector.getInstanceField(thisObj.getThreadGroup(), "nthreads"));
//
//  }
}
