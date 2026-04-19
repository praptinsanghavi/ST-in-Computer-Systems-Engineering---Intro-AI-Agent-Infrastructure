---
description: Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/MultiNodeSpec$.html
title: Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec
---

# Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec

> **Summary:** Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- [Direction](Direction.html)
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.")
- [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.")
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- [SetThrottle](SetThrottle.html)
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
[o](MultiNodeSpec.html "See companion class")[akka](../../index.html).[remote](../index.html).[testkit](index.html)

# [MultiNodeSpec](MultiNodeSpec.html "See companion class")[**](../../../akka/remote/testkit/MultiNodeSpec$.html "Permalink")

### Companion [class MultiNodeSpec](MultiNodeSpec.html "See companion class")

#### object MultiNodeSpec

Source[MultiNodeSpec.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testkit/MultiNodeSpec.scala#L131)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MultiNodeSpec
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/MultiNodeSpec$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#configureNextPortIfFixed(config:com.typesafe.config.Config):com.typesafe.config.Config "Permalink")  def configureNextPortIfFixed(config: Config): Config
7. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#maxNodes:Int "Permalink")  val maxNodes: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of nodes node taking part in this test.

Number of nodes node taking part in this test.

```
-Dmultinode.max-nodes=4
```
13. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#selfIndex:Integer "Permalink")  val selfIndex: [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)Index of this node in the roles sequence.

Index of this node in the roles sequence. The TestConductor
is started in “controller” mode on selfIndex 0, i.e. there you can inject
failures and shutdown other nodes etc.

```
-Dmultinode.index=0
```
17. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#selfName:String "Permalink")  val selfName: StringName (or IP address; must be resolvable using InetAddress.getByName)
of the host this node is running on.

Name (or IP address; must be resolvable using InetAddress.getByName)
of the host this node is running on.

```
-Dmultinode.host=host.example.com
```
InetAddress.getLocalHost.getHostAddress is used if empty or "localhost"
is defined as system property "multinode.host".
18. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#selfPort:Int "Permalink")  val selfPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Port number of this node.

Port number of this node.

This is defined in function of property `multinode.protocol`.
If set to 'udp', udpPort will be used. If unset or any other value, it will default to tcpPort.
19. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#serverName:String "Permalink")  val serverName: StringName (or IP address; must be resolvable using InetAddress.getByName)
of the host that the server node is running on.

Name (or IP address; must be resolvable using InetAddress.getByName)
of the host that the server node is running on.

```
-Dmultinode.server-host=server.example.com
```
20. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#serverPort:Int "Permalink")  val serverPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Port number of the node that's running the server system.

Port number of the node that's running the server system. Defaults to 4711\.

```
-Dmultinode.server-port=4711
```
21. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#tcpPort:Int "Permalink")  val tcpPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)TCP Port number to be used when running tests on TCP.

TCP Port number to be used when running tests on TCP. 0 means a random port.

```
-Dmultinode.port=0
```
23. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#udpPort:Option[Int] "Permalink")  val udpPort: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]UDP Port number to be used when running tests on UDP.

UDP Port number to be used when running tests on UDP. 0 means a random port.

```
-Dmultinode.udp.port=0
```
25. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$.html](https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$.html)*