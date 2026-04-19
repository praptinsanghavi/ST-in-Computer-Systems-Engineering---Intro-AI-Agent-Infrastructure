---
description: Akka 2.10.17 - akka.remote.testconductor.TestConductorExt
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/TestConductorExt.html
title: Akka 2.10.17 - akka.remote.testconductor.TestConductorExt
---

# Akka 2.10.17 - akka.remote.testconductor.TestConductorExt

> **Summary:** Akka 2.10.17 - akka.remote.testconductor.TestConductorExt

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](index.html)Definition Classes[remote](../index.html)
- [Conductor](Conductor.html "The conductor is the one orchestrating the test: it governs the akka.remote.testconductor.Controller’s port to which all akka.remote.testconductor.Players connect, it issues commands to their akka.remote.testconductor.NetworkFailureInjector and provides support for barriers using the akka.remote.testconductor.BarrierCoordinator.")
- [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.")
- [RoleName](RoleName.html)
- [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:")
- TestConductorExt
- [TestConductorProtocol](TestConductorProtocol.html)
c[akka](../../index.html).[remote](../index.html).[testconductor](index.html)

# TestConductorExt[**](../../../akka/remote/testconductor/TestConductorExt.html "Permalink")

### 

#### class TestConductorExt extends [Extension](../../actor/Extension.html) with [Conductor](Conductor.html) with [Player](Player.html)

This binds together the [akka.remote.testconductor.Conductor](Conductor.html) and
[akka.remote.testconductor.Player](Player.html) roles inside an Akka
[akka.actor.Extension](../../actor/Extension.html). Please follow the aforementioned links for
more information.

###### Note

This extension requires the `akka.actor.provider`
to be a akka.remote.RemoteActorRefProvider.

To use `blackhole`, `passThrough`, and `throttle` you must activate the
failure injector and throttler transport adapters by specifying `testTransport(on = true)`
in your MultiNodeConfig.

Source[Extension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/Extension.scala#L56)Linear Supertypes[Player](Player.html), [Conductor](Conductor.html), [Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestConductorExt
2. Player
3. Conductor
4. Extension
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/remote/testconductor/TestConductorExt.html#<init>(system:akka.actor.ExtendedActorSystem):akka.remote.testconductor.TestConductorExt "Permalink")  new TestConductorExt(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/remote/testconductor/TestConductorExt.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/TestConductorExt.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/TestConductorExt.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestConductorExt toany2stringadd\[TestConductorExt] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testconductor/TestConductorExt.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestConductorExt, B)ImplicitThis member is added by an implicit conversion from TestConductorExt toArrowAssoc\[TestConductorExt] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testconductor/TestConductorExt.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testconductor/TestConductorExt.html#abort(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def abort(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the remote support to TCP\_RESET the connection to the given remote
peer.

Tell the remote support to TCP\_RESET the connection to the given remote
peer. It works regardless of whether the recipient was initiator or
responder.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded

Definition Classes[Conductor](Conductor.html)
7. [**](../../../akka/remote/testconductor/TestConductorExt.html#address:akka.actor.Address "Permalink")  val address: [Address](../../actor/Address.html)Transport address of this Netty\-like remote transport.
8. [**](../../../akka/remote/testconductor/TestConductorExt.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/remote/testconductor/TestConductorExt.html#blackhole(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName,direction:akka.remote.testkit.Direction):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def blackhole(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html), direction: [Direction](../testkit/Direction.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Switch the Netty pipeline of the remote support into blackhole mode for
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

Definition Classes[Conductor](Conductor.html)Annotations@nowarn()
10. [**](../../../akka/remote/testconductor/TestConductorExt.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/remote/testconductor/TestConductorExt.html#disconnect(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def disconnect(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the remote support to shutdown the connection to the given remote
peer.

Tell the remote support to shutdown the connection to the given remote
peer. It works regardless of whether the recipient was initiator or
responder.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded

Definition Classes[Conductor](Conductor.html)
12. [**](../../../akka/remote/testconductor/TestConductorExt.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestConductorExt) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestConductorExtImplicitThis member is added by an implicit conversion from TestConductorExt toEnsuring\[TestConductorExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/testconductor/TestConductorExt.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestConductorExt) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestConductorExtImplicitThis member is added by an implicit conversion from TestConductorExt toEnsuring\[TestConductorExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/remote/testconductor/TestConductorExt.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestConductorExtImplicitThis member is added by an implicit conversion from TestConductorExt toEnsuring\[TestConductorExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/remote/testconductor/TestConductorExt.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestConductorExtImplicitThis member is added by an implicit conversion from TestConductorExt toEnsuring\[TestConductorExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/remote/testconductor/TestConductorExt.html#enter(timeout:akka.util.Timeout,name:Seq[String]):Unit "Permalink")  def enter(timeout: [Timeout](../../util/Timeout.html), name: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Enter the named barriers, one after the other, in the order given.

Enter the named barriers, one after the other, in the order given. Will
throw an exception in case of timeouts or other errors.

Definition Classes[Player](Player.html)
17. [**](../../../akka/remote/testconductor/TestConductorExt.html#enter(name:String*):Unit "Permalink")  def enter(name: String\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Enter the named barriers, one after the other, in the order given.

Enter the named barriers, one after the other, in the order given. Will
throw an exception in case of timeouts or other errors.

Definition Classes[Player](Player.html)
18. [**](../../../akka/remote/testconductor/TestConductorExt.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/remote/testconductor/TestConductorExt.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/remote/testconductor/TestConductorExt.html#exit(node:akka.remote.testconductor.RoleName,exitValue:Int):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def exit(node: [RoleName](RoleName.html), exitValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the remote node to shut itself down using System.exit with the given
exitValue.

Tell the remote node to shut itself down using System.exit with the given
exitValue. The node will also be removed, so that the remaining nodes may still
pass subsequent barriers.

nodeis the symbolic name of the node which is to be affected

exitValueis the return code which shall be given to System.exit

Definition Classes[Conductor](Conductor.html)
21. [**](../../../akka/remote/testconductor/TestConductorExt.html#getAddressFor(name:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.actor.Address] "Permalink")  def getAddressFor(name: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Address](../../actor/Address.html)]Query remote transport address of named node.

Query remote transport address of named node.

Definition Classes[Player](Player.html)
22. [**](../../../akka/remote/testconductor/TestConductorExt.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/remote/testconductor/TestConductorExt.html#getNodes:scala.concurrent.Future[Iterable[akka.remote.testconductor.RoleName]] "Permalink")  def getNodes: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Iterable\[[RoleName](RoleName.html)]]Obtain the list of remote host names currently registered.

Obtain the list of remote host names currently registered.

Definition Classes[Conductor](Conductor.html)
24. [**](../../../akka/remote/testconductor/TestConductorExt.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/remote/testconductor/TestConductorExt.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../akka/remote/testconductor/TestConductorExt.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/remote/testconductor/TestConductorExt.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/remote/testconductor/TestConductorExt.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/remote/testconductor/TestConductorExt.html#passThrough(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName,direction:akka.remote.testkit.Direction):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def passThrough(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html), direction: [Direction](../testkit/Direction.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Switch the Netty pipeline of the remote support into pass through mode for
sending and/or receiving.

Switch the Netty pipeline of the remote support into pass through mode for
sending and/or receiving.

###### Note

To use this feature you must activate the failure injector and throttler
transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.

nodeis the symbolic name of the node which is to be affected

targetis the symbolic name of the other node to which connectivity shall be impeded

directioncan be either `Direction.Send`, `Direction.Receive` or `Direction.Both`

Definition Classes[Conductor](Conductor.html)Annotations@nowarn()
30. [**](../../../akka/remote/testconductor/TestConductorExt.html#removeNode(node:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def removeNode(node: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Remove a remote host from the list, so that the remaining nodes may still
pass subsequent barriers.

Remove a remote host from the list, so that the remaining nodes may still
pass subsequent barriers. This must be done before the client connection
breaks down in order to affect an “orderly” removal (i.e. without failing
present and future barriers).

nodeis the symbolic name of the node which is to be removed

Definition Classes[Conductor](Conductor.html)
31. [**](../../../akka/remote/testconductor/TestConductorExt.html#shutdown(node:akka.remote.testconductor.RoleName,abort:Boolean):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def shutdown(node: [RoleName](RoleName.html), abort: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the actor system at the remote node to shut itself down without
awaiting termination of remote\-deployed children.

Tell the actor system at the remote node to shut itself down without
awaiting termination of remote\-deployed children. The node will also be
removed, so that the remaining nodes may still pass subsequent barriers.

nodeis the symbolic name of the node which is to be affected

Definition Classes[Conductor](Conductor.html)
32. [**](../../../akka/remote/testconductor/TestConductorExt.html#shutdown(node:akka.remote.testconductor.RoleName):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def shutdown(node: [RoleName](RoleName.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Tell the actor system at the remote node to shut itself down.

Tell the actor system at the remote node to shut itself down. The node will also be
removed, so that the remaining nodes may still pass subsequent barriers.

nodeis the symbolic name of the node which is to be affected

Definition Classes[Conductor](Conductor.html)
33. [**](../../../akka/remote/testconductor/TestConductorExt.html#sockAddr:scala.concurrent.Future[java.net.InetSocketAddress] "Permalink")  def sockAddr: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]Obtain the port to which the controller’s socket is actually bound.

Obtain the port to which the controller’s socket is actually bound. This
will deviate from the configuration in `akka.testconductor.port` in case
that was given as zero.

Definition Classes[Conductor](Conductor.html)
34. [**](../../../akka/remote/testconductor/TestConductorExt.html#startClient(name:akka.remote.testconductor.RoleName,controllerAddr:java.net.InetSocketAddress):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def startClient(name: [RoleName](RoleName.html), controllerAddr: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Connect to the conductor on the given port (the host is taken from setting
`akka.testconductor.host`).

Connect to the conductor on the given port (the host is taken from setting
`akka.testconductor.host`). The connection is made asynchronously, but you
should await completion of the returned Future because that implies that
all expected participants of this test have successfully connected (i.e.
this is a first barrier in itself). The number of expected participants is
set in [akka.remote.testconductor.Conductor](Conductor.html)`.startController()`.

Definition Classes[Player](Player.html)
35. [**](../../../akka/remote/testconductor/TestConductorExt.html#startController(participants:Int,name:akka.remote.testconductor.RoleName,controllerPort:java.net.InetSocketAddress):scala.concurrent.Future[java.net.InetSocketAddress] "Permalink")  def startController(participants: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), name: [RoleName](RoleName.html), controllerPort: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]Start the akka.remote.testconductor.Controller, which in turn will
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

Definition Classes[Conductor](Conductor.html)
36. [**](../../../akka/remote/testconductor/TestConductorExt.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../akka/remote/testconductor/TestConductorExt.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)
38. [**](../../../akka/remote/testconductor/TestConductorExt.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../akka/remote/testconductor/TestConductorExt.html#transport:akka.remote.RemoteTransport "Permalink")  val transport: RemoteTransportRemote transport used by the actor ref provider.
40. [**](../../../akka/remote/testconductor/TestConductorExt.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../akka/remote/testconductor/TestConductorExt.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../akka/remote/testconductor/TestConductorExt.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html "Permalink")  object [Settings](TestConductorExt$Settings$.html)
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/TestConductorExt.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testconductor/TestConductorExt.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestConductorExt toStringFormat\[TestConductorExt] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testconductor/TestConductorExt.html#throttle(node:akka.remote.testconductor.RoleName,target:akka.remote.testconductor.RoleName,direction:akka.remote.testkit.Direction,rateMBit:Double):scala.concurrent.Future[akka.remote.testconductor.Done] "Permalink")  def throttle(node: [RoleName](RoleName.html), target: [RoleName](RoleName.html), direction: [Direction](../testkit/Direction.html), rateMBit: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Done]Make the remoting pipeline on the node throttle data sent to or received
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

Definition Classes[Conductor](Conductor.html)Annotations@deprecated Deprecated*(Since version 2\.8\.0\)* Throttle is not implemented, use blackhole and passThrough.
4. [**](../../../akka/remote/testconductor/TestConductorExt.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestConductorExt, B)ImplicitThis member is added by an implicit conversion from TestConductorExt toArrowAssoc\[TestConductorExt] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Player](Player.html)

### Inherited from [Conductor](Conductor.html)

### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestConductorExt to any2stringadd\[TestConductorExt]

### Inherited by implicit conversion StringFormat fromTestConductorExt to StringFormat\[TestConductorExt]

### Inherited by implicit conversion Ensuring fromTestConductorExt to Ensuring\[TestConductorExt]

### Inherited by implicit conversion ArrowAssoc fromTestConductorExt to ArrowAssoc\[TestConductorExt]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt$Settings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html)*