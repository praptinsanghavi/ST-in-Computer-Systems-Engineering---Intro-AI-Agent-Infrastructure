---
description: Akka 2.10.17 - akka.testkit.SocketUtil
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:46:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/SocketUtil$.html
title: Akka 2.10.17 - akka.testkit.SocketUtil
---

# Akka 2.10.17 - akka.testkit.SocketUtil

> **Summary:** Akka 2.10.17 - akka.testkit.SocketUtil

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[testkit](index.html)
- [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [CallingThreadDispatcher](CallingThreadDispatcher.html "Dispatcher which runs invocations on the current thread only.")
- [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html)
- [CallingThreadMailbox](CallingThreadMailbox.html)
- [CustomEventFilter](CustomEventFilter.html "Custom event filter when the others do not fit the bill.")
- [DeadLettersFilter](DeadLettersFilter.html "Filter which matches DeadLetter events, if the wrapped message conforms to the given type.")
- [DebugFilter](DebugFilter.html "Filter which matches Debug events, if they satisfy the given criteria:")
- [DefaultTimeout](DefaultTimeout.html)
- [ErrorFilter](ErrorFilter.html "Filter which matches Error events, if they satisfy the given criteria:")
- [EventFilter](EventFilter.html "Facilities for selectively filtering out expected events from logging so that you can keep your test run’s console output clean and do not miss real error messages.")
- [ExplicitlyTriggeredScheduler](ExplicitlyTriggeredScheduler.html "For testing: scheduler that does not look at the clock, but must be progressed manually by calling timePasses.")
- [ImplicitSender](ImplicitSender.html)
- [InfoFilter](InfoFilter.html "Filter which matches Info events, if they satisfy the given criteria:")
- [JavaSerializable](JavaSerializable.html "Marker trait for test messages that will use Java serialization via akka.testkit.TestJavaSerializer")
- SocketUtil
- [TestActor](TestActor.html)
- [TestActorRef](TestActorRef.html "This special ActorRef is exclusively for use during unit testing in a single-threaded environment.")
- [TestActors](TestActors$.html "A collection of common actor patterns used in tests.")
- [TestBarrier](TestBarrier.html)
- [TestBarrierTimeoutException](TestBarrierTimeoutException.html)
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestEvent](TestEvent.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventListener to install a filter, and UnMute to uninstall it.")
- [TestEventListener](TestEventListener.html "EventListener for running tests, which allows selectively filtering out expected messages.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestFSMRef](TestFSMRef.html "This is a specialized form of the TestActorRef with support for querying and setting the state of a FSM.")
- [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.")
- [TestKit](TestKit.html "Test kit for testing actors.")
- [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.")
- [TestKitExtension](TestKitExtension$.html)
- [TestKitSettings](TestKitSettings.html)
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
o[akka](../index.html).[testkit](index.html)

# SocketUtil[**](../../akka/testkit/SocketUtil$.html "Permalink")

### 

#### object SocketUtil

Utilities to get free socket address.

Source[SocketUtil.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/SocketUtil.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SocketUtil
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/testkit/SocketUtil$$Protocol.html "Permalink") sealed  trait [Protocol](SocketUtil$$Protocol.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../akka/testkit/SocketUtil$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/SocketUtil$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/SocketUtil$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/testkit/SocketUtil$.html#RANDOM_LOOPBACK_ADDRESS:String "Permalink")  val RANDOM\_LOOPBACK\_ADDRESS: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
5. [**](../../akka/testkit/SocketUtil$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/testkit/SocketUtil$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/testkit/SocketUtil$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/testkit/SocketUtil$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/testkit/SocketUtil$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/testkit/SocketUtil$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/testkit/SocketUtil$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/testkit/SocketUtil$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/testkit/SocketUtil$.html#notBoundServerAddress():java.net.InetSocketAddress "Permalink")  def notBoundServerAddress(): [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)
14. [**](../../akka/testkit/SocketUtil$.html#notBoundServerAddress(address:String):java.net.InetSocketAddress "Permalink")  def notBoundServerAddress(address: String): [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)
15. [**](../../akka/testkit/SocketUtil$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/testkit/SocketUtil$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/testkit/SocketUtil$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/testkit/SocketUtil$.html#temporaryLocalPort(protocol:akka.testkit.SocketUtil.Protocol):Int "Permalink")  def temporaryLocalPort(protocol: [Protocol](SocketUtil$$Protocol.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Find a free local post on 'localhost' that is available on the given protocol
If both UDP and TCP need to be free specify `Both`
19. [**](../../akka/testkit/SocketUtil$.html#temporaryLocalPort(udp:Boolean):Int "Permalink")  def temporaryLocalPort(udp: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)returnsA port on 'localhost' that is currently available
20. [**](../../akka/testkit/SocketUtil$.html#temporaryServerAddress(address:String,udp:Boolean):java.net.InetSocketAddress "Permalink")  def temporaryServerAddress(address: String \= [RANDOM\_LOOPBACK\_ADDRESS](#RANDOM_LOOPBACK_ADDRESS:String), udp: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)addresshost address. If not set, a loopback IP from the 127\.20\.0\.0/16 range is picked

udpif true, select a port that is free for running a UDP server. Otherwise TCP.

returnsan address (host\+port) that is currently available to bind on
21. [**](../../akka/testkit/SocketUtil$.html#temporaryServerAddresses(numberOfAddresses:Int,hostname:String,udp:Boolean):IndexedSeq[java.net.InetSocketAddress] "Permalink")  def temporaryServerAddresses(numberOfAddresses: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), hostname: String \= [RANDOM\_LOOPBACK\_ADDRESS](#RANDOM_LOOPBACK_ADDRESS:String), udp: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]
22. [**](../../akka/testkit/SocketUtil$.html#temporaryServerHostnameAndPort(interface:String):(String,Int) "Permalink")  def temporaryServerHostnameAndPort(interface: String \= [RANDOM\_LOOPBACK\_ADDRESS](#RANDOM_LOOPBACK_ADDRESS:String)): (String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
23. [**](../../akka/testkit/SocketUtil$.html#temporaryUdpIpv6Port(iface:java.net.NetworkInterface):Int "Permalink")  def temporaryUdpIpv6Port(iface: [NetworkInterface](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/NetworkInterface.html#java.net.NetworkInterface)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../akka/testkit/SocketUtil$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/testkit/SocketUtil$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/testkit/SocketUtil$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/testkit/SocketUtil$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/testkit/SocketUtil$$Both$.html "Permalink")  case object [Both](SocketUtil$$Both$.html) extends [Protocol](SocketUtil$$Protocol.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
29. [**](../../akka/testkit/SocketUtil$$Tcp$.html "Permalink")  case object [Tcp](SocketUtil$$Tcp$.html) extends [Protocol](SocketUtil$$Protocol.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
30. [**](../../akka/testkit/SocketUtil$$Udp$.html "Permalink")  case object [Udp](SocketUtil$$Udp$.html) extends [Protocol](SocketUtil$$Protocol.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../akka/testkit/SocketUtil$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka/current/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka/current/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka/current/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka/current/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka/current/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka/current/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$$Both$.html
- https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$$Protocol.html
- https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$$Tcp$.html
- https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$$Udp$.html
- https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestException.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka/current/akka/testkit/WarningFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$.html](https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$.html)*