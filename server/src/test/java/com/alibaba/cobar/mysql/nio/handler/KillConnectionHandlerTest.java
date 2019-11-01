package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.manager.ManagerConnectionFactory;
import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.KillConnectionHandler;
import com.alibaba.cobar.net.NIOAcceptor;
import com.alibaba.cobar.server.session.NonBlockingSession;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;



public class KillConnectionHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException999953391054ab206c1() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final MySQLConnection arg0 = mySQLConnection;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException999af6b2b6f8360607e() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullNotNullNullOutputNotNull999381fc715b34c7cce() throws IOException {
//
//    // Arrange
//    final MySQLConnection arg0 = new MySQLConnection(null);
//    final NonBlockingSession arg1 = new NonBlockingSession(null);
//    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
//    final NIOAcceptor arg2 = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
//    final AtomicInteger arg3 = null;
//
//    // Act, creating object to test constructor
//    final KillConnectionHandler actual = new KillConnectionHandler(arg0, arg1, arg2, arg3);
//
//    // Assert side effects
//    Assert.assertNotNull(arg2);
//    Assert.assertEquals(0L, ((NIOAcceptor) arg2).getAcceptCount());
//    Assert.assertEquals(0, ((NIOAcceptor) arg2).getPort());
//    Assert.assertEquals(5, ((NIOAcceptor) arg2).getPriority());
//    Assert.assertNull(Reflector.getInstanceField(arg2, "inheritableThreadLocals"));
//    Assert.assertNotNull(((NIOAcceptor) arg2).getThreadGroup());
//    Assert.assertEquals(3, Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", ((NIOAcceptor) arg2).getThreadGroup().getName());
//    Assert.assertEquals(10, ((NIOAcceptor) arg2).getThreadGroup().getMaxPriority());
//    Assert.assertFalse(((NIOAcceptor) arg2).getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"));
//    Assert.assertEquals(4, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(12L, ((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "threads"))[3]);
//    Assert.assertFalse(((NIOAcceptor) arg2).getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "ngroups"));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(3, Reflector.getInstanceField(((NIOAcceptor) arg2).getThreadGroup(), "nthreads"));
//    Assert.assertNull(Reflector.getInstanceField(arg2, "parkBlocker"));
//    Assert.assertEquals("KILL ", ((NIOAcceptor) arg2).getName());
//    Assert.assertFalse(((NIOAcceptor) arg2).isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(arg2, "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(arg2, "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(arg2, "threadLocalRandomSeed"));
//    Assert.assertEquals(14L, ((NIOAcceptor) arg2).getId());
//    Assert.assertNull(Reflector.getInstanceField(arg2, "threadLocals"));
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void errorResponseInput24NotNullOutputNullPointerException999db6460b4722935cb() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.errorResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NullOutputVoid9990a4eb7be6913d093() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ArrayList<byte[]> arg1 = new ArrayList<byte[]>();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    arg1.add(myByteArray);
    final byte[] arg2 = arg0;
    final MySQLConnection arg3 = null;

    // Act
    thisObj.fieldEofResponse(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void okResponseInput24NotNullOutputNullPointerException999c51052d5c28f98a0() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.okResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException999db4babf4c76b69e3() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputVoid99946123c883eab1af1() throws IOException {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final ManagerConnectionFactory managerConnectionFactory = new ManagerConnectionFactory();
    final NIOAcceptor nIOAcceptor = new NIOAcceptor("KILL ", 0, managerConnectionFactory);
    final AtomicInteger atomicInteger = new AtomicInteger();
    final KillConnectionHandler thisObj = new KillConnectionHandler(mySQLConnection, nonBlockingSession, nIOAcceptor, atomicInteger);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.rowResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
