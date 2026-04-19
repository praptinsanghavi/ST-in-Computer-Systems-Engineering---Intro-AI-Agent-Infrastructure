---
description: Akka 2.10.17 - akka.remote.testconductor.Conductor
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/Conductor.html
title: Akka 2.10.17 - akka.remote.testconductor.Conductor
---

# Akka 2.10.17 - akka.remote.testconductor.Conductor

> **Summary:** Akka 2.10.17 - akka.remote.testconductor.Conductor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](index.html)Definition Classes[remote](../index.html)
- Conductor
- [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.")
- [RoleName](RoleName.html)
- [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:")
- [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.")
- [TestConductorProtocol](TestConductorProtocol.html)
t[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# Conductor[**](../../../akka/remote/testconductor/Conductor.html "Permalink")

### 

#### trait Conductor extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

The conductor is the one orchestrating the test: it governs the
akka.remote.testconductor.Controller’s port to which all
[akka.remote.testconductor.Player](Player.html)s connect, it issues commands to their
`akka.remote.testconductor.NetworkFailureInjector` and provides support
for barriers using the akka.remote.testconductor.BarrierCoordinator.
All of this is bundled inside the [akka.remote.testconductor.TestConductorExt](TestConductorExt.html)
extension.

Self Type[TestConductorExt](TestConductorExt.html)Source[Conductor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/Conductor.scala#L51)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[TestConductorExt](TestConductorExt.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Conductor
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/testconductor/Conductor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/Conductor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/Conductor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Conductor toany2stringadd\[Conductor] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testconductor/Conductor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Conductor, B)ImplicitThis member is added by an implicit conversion from Conductor toArrowAssoc\[Conductor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testconductor/Conductor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testconductor/Conductor.html#abort(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def abort(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the remote support to TCP\_RESET the connection to the given remote
peer.

Tell the remote support to TCP\_RESET the connection to the given remote
peer. It works regardless of whether the recipient was initiator or
responder.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded
7. [**](../../../akka/remote/testconductor/Conductor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/remote/testconductor/Conductor.html#blackhole(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName,direction:akka.remote.testkit.Direction):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def blackhole(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html), direction: [Direction](../testkit/Direction.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Switch the Netty pipeline of the remote support into blackhole mode for
sending and/or receiving: it will just drop all messages right before
submitting them to the Socket or right after receiving them from the
Socket.

Switch the Netty pipeline of the remote support into blackhole mode for
sending and/or receiving: it will just drop all messages right before
submitting them to the Socket or right after receiving them from the
Socket.

###### Note

To use this feature you must activate the failure injector and throttler
transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded

directioncan be either `Direction.Send`, `Direction.Receive` or `Direction.Both`

Annotations@nowarn()
9. [**](../../../akka/remote/testconductor/Conductor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/remote/testconductor/Conductor.html#disconnect(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def disconnect(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the remote support to shutdown the connection to the given remote
peer.

Tell the remote support to shutdown the connection to the given remote
peer. It works regardless of whether the recipient was initiator or
responder.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded
11. [**](../../../akka/remote/testconductor/Conductor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Conductor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConductorImplicitThis member is added by an implicit conversion from Conductor toEnsuring\[Conductor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/testconductor/Conductor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Conductor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConductorImplicitThis member is added by an implicit conversion from Conductor toEnsuring\[Conductor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/testconductor/Conductor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConductorImplicitThis member is added by an implicit conversion from Conductor toEnsuring\[Conductor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/remote/testconductor/Conductor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConductorImplicitThis member is added by an implicit conversion from Conductor toEnsuring\[Conductor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/remote/testconductor/Conductor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/remote/testconductor/Conductor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../akka/remote/testconductor/Conductor.html#exit(node:akka.remote.testconductor.RoleName,exitValue:Int):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def exit(node: [RoleName](RoleName.html), exitValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the remote node to shut itself down using System.exit with the given
exitValue.

Tell the remote node to shut itself down using System.exit with the given
exitValue. The node will also be removed, so that the remaining nodes may still
pass subsequent barriers.

nodeis the symbolic name of the node which is to be affected

exitValueis the return code which shall be given to System.exit
18. [**](../../../akka/remote/testconductor/Conductor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testconductor/Conductor.html#getNodes:scala.concurrent.Future[Iterable[akka.remote.testconductor.RoleName]] "Permalink")  def getNodes: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Iterable\[[RoleName](RoleName.html)]]Obtain the list of remote host names currently registered.
20. [**](../../../akka/remote/testconductor/Conductor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/remote/testconductor/Conductor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../akka/remote/testconductor/Conductor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/remote/testconductor/Conductor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/remote/testconductor/Conductor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/remote/testconductor/Conductor.html#passThrough(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName,direction:akka.remote.testkit.Direction):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def passThrough(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html), direction: [Direction](../testkit/Direction.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Switch the Netty pipeline of the remote support into pass through mode for
sending and/or receiving.

Switch the Netty pipeline of the remote support into pass through mode for
sending and/or receiving.

###### Note

To use this feature you must activate the failure injector and throttler
transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded

directioncan be either `Direction.Send`, `Direction.Receive` or `Direction.Both`

Annotations@nowarn()
26. [**](../../../akka/remote/testconductor/Conductor.html#removeNode(node:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def removeNode(node: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Remove a remote host from the list, so that the remaining nodes may still
pass subsequent barriers.

Remove a remote host from the list, so that the remaining nodes may still
pass subsequent barriers. This must be done before the client connection
breaks down in order to affect an “orderly” removal (i.e. without failing
present and future barriers).

nodeis the symbolic name of the node which is to be removed
27. [**](../../../akka/remote/testconductor/Conductor.html#shutdown(node:akka.remote.testconductor.RoleName,abort:Boolean):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def shutdown(node: [RoleName](RoleName.html), abort: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the actor system at the remote node to shut itself down without
awaiting termination of remote\-deployed children.

Tell the actor system at the remote node to shut itself down without
awaiting termination of remote\-deployed children. The node will also be
removed, so that the remaining nodes may still pass subsequent barriers.

nodeis the symbolic name of the node which is to be affected
28. [**](../../../akka/remote/testconductor/Conductor.html#shutdown(node:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def shutdown(node: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the actor system at the remote node to shut itself down.

Tell the actor system at the remote node to shut itself down. The node will also be
removed, so that the remaining nodes may still pass subsequent barriers.

nodeis the symbolic name of the node which is to be affected
29. [**](../../../akka/remote/testconductor/Conductor.html#sockAddr:scala.concurrent.Future[java.net.InetSocketAddress] "Permalink")  def sockAddr: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]Obtain the port to which the controller’s socket is actually bound.

Obtain the port to which the controller’s socket is actually bound. This
will deviate from the configuration in `akka.testconductor.port` in case
that was given as zero.
30. [**](../../../akka/remote/testconductor/Conductor.html#startController(participants:Int,name:akka.remote.testconductor.RoleName,controllerPort:java.net.InetSocketAddress):scala.concurrent.Future[java.net.InetSocketAddress] "Permalink")  def startController(participants: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), name: [RoleName](RoleName.html), controllerPort: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]Start the akka.remote.testconductor.Controller, which in turn will
bind to a TCP port as specified in the `akka.testconductor.port` config
property, where 0 denotes automatic allocation.

Start the akka.remote.testconductor.Controller, which in turn will
bind to a TCP port as specified in the `akka.testconductor.port` config
property, where 0 denotes automatic allocation. Since the latter is
actually preferred, a `Future[Int]` is returned which will be completed
with the port number actually chosen, so that this can then be communicated
to the players for their proper start\-up.

This method also invokes [akka.remote.testconductor.Player](Player.html).startClient,
since it is expected that the conductor participates in barriers for
overall coordination. The returned Future will only be completed once the
client’s start\-up finishes, which in fact waits for all other players to
connect.

participantsgives the number of participants which shall connect
before any of their startClient() operations complete.
31. [**](../../../akka/remote/testconductor/Conductor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/remote/testconductor/Conductor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../akka/remote/testconductor/Conductor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/remote/testconductor/Conductor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/remote/testconductor/Conductor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/Conductor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testconductor/Conductor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Conductor toStringFormat\[Conductor] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testconductor/Conductor.html#throttle(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName,direction:akka.remote.testkit.Direction,rateMBit:Double):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def throttle(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html), direction: [Direction](../testkit/Direction.html), rateMBit: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Make the remoting pipeline on the node throttle data sent to or received
from the given remote peer.

Make the remoting pipeline on the node throttle data sent to or received
from the given remote peer. Throttling works by delaying packet submission
within the netty pipeline until the packet would have been completely sent
according to the given rate, the previous packet completion and the current
packet length. In case of large packets they are split up if the calculated
send pause would exceed `akka.testconductor.packet-split-threshold`
(roughly). All of this uses the system’s scheduler, which is not
terribly precise and will execute tasks later than they are schedule (even
on average), but that is countered by using the actual execution time for
determining how much to send, leading to the correct output rate, but with
increased latency.

###### Note

To use this feature you must activate the failure injector and throttler
transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be throttled

directioncan be either `Direction.Send`, `Direction.Receive` or `Direction.Both`

rateMBitis the maximum data rate in MBit

Annotations@deprecated Deprecated*(Since version 2\.8\.0\)* Throttle is not implemented, use blackhole and passThrough.
4. [**](../../../akka/remote/testconductor/Conductor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Conductor, B)ImplicitThis member is added by an implicit conversion from Conductor toArrowAssoc\[Conductor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConductor to any2stringadd\[Conductor]

### Inherited by implicit conversion StringFormat fromConductor to StringFormat\[Conductor]

### Inherited by implicit conversion Ensuring fromConductor to Ensuring\[Conductor]

### Inherited by implicit conversion ArrowAssoc fromConductor to ArrowAssoc\[Conductor]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testconductor/Conductor.html](https://doc.akka.io/api/akka/current/akka/remote/testconductor/Conductor.html)*