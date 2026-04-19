---
description: Akka 2.10.17 - akka.routing.MurmurHash
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:45:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/MurmurHash$.html
title: Akka 2.10.17 - akka.routing.MurmurHash
---

# Akka 2.10.17 - akka.routing.MurmurHash

> **Summary:** Akka 2.10.17 - akka.routing.MurmurHash

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[akka](../index.html)
- [ActorRefRoutee](ActorRefRoutee.html "Routee that sends the messages to an akka.actor.ActorRef.")
- [ActorSelectionRoutee](ActorSelectionRoutee.html "Routee that sends the messages to an akka.actor.ActorSelection.")
- [AddRoutee](AddRoutee.html "Add a routee by sending this message to the router.")
- [AdjustPoolSize](AdjustPoolSize.html "Increase or decrease the number of routees in a Pool.")
- [BalancingPool](BalancingPool.html "A router pool that will try to redistribute work from busy routees to idle routees.")
- [Broadcast](Broadcast.html "Used to broadcast a message to all routees in a router; only the contained message will be forwarded, i.e.")
- [BroadcastGroup](BroadcastGroup.html "A router group that broadcasts a message to all its routees.")
- [BroadcastPool](BroadcastPool.html "A router pool that broadcasts a message to all its routees.")
- [BroadcastRoutingLogic](BroadcastRoutingLogic.html "Broadcasts a message to all its routees.")
- [ConsistentHash](ConsistentHash.html "Consistent Hashing node ring implementation.")
- [ConsistentHashingGroup](ConsistentHashingGroup.html "A router group that uses consistent hashing to select a routee based on the sent message.")
- [ConsistentHashingPool](ConsistentHashingPool.html "A router pool that uses consistent hashing to select a routee based on the sent message.")
- [ConsistentHashingRouter](ConsistentHashingRouter$.html)
- [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "Uses consistent hashing to select a routee based on the sent message.")
- [CustomRouterConfig](CustomRouterConfig.html "If a custom router implementation is not a Group nor a Pool it may extend this base class.")
- [Deafen](Deafen.html)
- [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "This resizer resizes the pool to an optimal size that provides the most message throughput.")
- [DefaultResizer](DefaultResizer.html "Implementation of Resizer that adjust the Pool based on specified thresholds.")
- [FromConfig](FromConfig.html "Java API: Wraps a akka.actor.Props to mark the actor as externally configurable to be used with a router.")
- [GetRoutees](GetRoutees.html "Sending this message to a router will make it send back its currently used routees.")
- [Group](Group.html "RouterConfig for router actor with routee actors that are created external to the router and the router sends messages to the specified path using actor selection, without watching for termination.")
- [GroupBase](GroupBase.html "Java API: Base class for custom router Group")
- [Listen](Listen.html)
- [ListenerMessage](ListenerMessage.html)
- [Listeners](Listeners.html "Listeners is a generic trait to implement listening capability on an Actor.")
- MurmurHash
- [NoRoutee](NoRoutee$.html "Routee that doesn't send the message to any routee.")
- [NoRouter](NoRouter.html "Routing configuration that indicates no routing; this is also the default value which hence overrides the merge strategy in order to accept values from lower-precedence sources.")
- [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html)
- [Pool](Pool.html "RouterConfig for router actor that creates routees as child actors and removes them from the router if they terminate.")
- [PoolBase](PoolBase.html "Java API: Base class for custom router Pool")
- [RandomGroup](RandomGroup.html "A router group that randomly selects one of the target routees to send a message to.")
- [RandomPool](RandomPool.html "A router pool that randomly selects one of the target routees to send a message to.")
- [RandomRoutingLogic](RandomRoutingLogic.html "Randomly selects one of the target routees to send a message to")
- [RemoveRoutee](RemoveRoutee.html "Remove a specific routee by sending this message to the router.")
- [Resizer](Resizer.html "Pool routers with dynamically resizable number of routees are implemented by providing a Resizer implementation in the akka.routing.Pool configuration.")
- [ResizerInitializationException](ResizerInitializationException.html)
- [RoundRobinGroup](RoundRobinGroup.html "A router group that uses round-robin to select a routee.")
- [RoundRobinPool](RoundRobinPool.html "A router pool that uses round-robin to select a routee.")
- [RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "Uses round-robin to select a routee.")
- [Routee](Routee.html "Abstraction of a destination for messages routed via a Router.")
- [Routees](Routees.html "Message used to carry information about what routees the router is currently using.")
- [Router](Router.html "For each message that is sent through the router via the #route method the RoutingLogic decides to which Routee to send the message.")
- [RouterConfig](RouterConfig.html "This trait represents a router factory: it produces the actual router actor and creates the routing table (a function which determines the recipients for each message which is to be dispatched).")
- [RouterEnvelope](RouterEnvelope.html "Only the contained message will be forwarded to the destination, i.e.")
- [RoutingLogic](RoutingLogic.html "The interface of the routing logic that is used in a Router to select destination routed messages.")
- [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "A router group that broadcasts the message to all routees, and replies with the first response.")
- [ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "A router pool that broadcasts the message to all routees, and replies with the first response.")
- [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "Broadcasts the message to all routees, and replies with the first response.")
- [SeveralRoutees](SeveralRoutees.html "Routee that sends each message to all routees.")
- [SmallestMailboxPool](SmallestMailboxPool.html "A router pool that tries to send to the non-suspended routee with fewest messages in mailbox.")
- [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "Tries to send to the non-suspended routee with fewest messages in mailbox.")
- [TailChoppingGroup](TailChoppingGroup.html "A router group with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")
- [TailChoppingPool](TailChoppingPool.html "A router pool with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")
- [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "As each message is sent to the router, the routees are randomly ordered.")
- [WithListeners](WithListeners.html)
o[akka](../index.html).[routing](index.html)

# MurmurHash[**](../../akka/routing/MurmurHash$.html "Permalink")

### 

#### object MurmurHash

An object designed to generate well\-distributed non\-cryptographic
 hashes. It is designed to hash a collection of integers; along with
 the integers to hash, it generates two magic streams of integers to
 increase the distribution of repetitive input sequences. Thus,
 three methods need to be called at each step (to start and to
 incorporate a new integer) to update the values. Only one method
 needs to be called to finalize the hash.

Source[MurmurHash.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/MurmurHash.scala#L35)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MurmurHash
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/routing/MurmurHash$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/MurmurHash$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/MurmurHash$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/routing/MurmurHash$.html#arrayHash[T](a:Array[T]):Int "Permalink")  def arrayHash\[T](a: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Compute a high\-quality hash of an array
5. [**](../../akka/routing/MurmurHash$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/routing/MurmurHash$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/routing/MurmurHash$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/routing/MurmurHash$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/routing/MurmurHash$.html#extendHash(hash:Int,value:Int,magicA:Int,magicB:Int):Int "Permalink")  def extendHash(hash: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), magicA: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), magicB: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Incorporates a new value into an existing hash.

Incorporates a new value into an existing hash.

hashthe prior hash value

valuethe new value to incorporate

magicAa magic integer from the stream

magicBa magic integer from a different stream

returnsthe updated hash value
10. [**](../../akka/routing/MurmurHash$.html#finalizeHash(hash:Int):Int "Permalink")  def finalizeHash(hash: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Once all hashes have been incorporated, this performs a final mixing
11. [**](../../akka/routing/MurmurHash$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/routing/MurmurHash$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/routing/MurmurHash$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/routing/MurmurHash$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/routing/MurmurHash$.html#nextMagicA(magicA:Int):Int "Permalink")  def nextMagicA(magicA: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Given a magic integer from the first stream, compute the next
16. [**](../../akka/routing/MurmurHash$.html#nextMagicB(magicB:Int):Int "Permalink")  def nextMagicB(magicB: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Given a magic integer from the second stream, compute the next
17. [**](../../akka/routing/MurmurHash$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/routing/MurmurHash$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/routing/MurmurHash$.html#startHash(seed:Int):Int "Permalink")  def startHash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Begin a new hash with a seed value.
20. [**](../../akka/routing/MurmurHash$.html#startMagicA:Int "Permalink")  def startMagicA: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The initial magic integers in the first stream.
21. [**](../../akka/routing/MurmurHash$.html#startMagicB:Int "Permalink")  def startMagicB: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The initial magic integer in the second stream.
22. [**](../../akka/routing/MurmurHash$.html#stringHash(s:String):Int "Permalink")  def stringHash(s: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Compute a high\-quality hash of a string
23. [**](../../akka/routing/MurmurHash$.html#symmetricHash[T](xs:IterableOnce[T],seed:Int):Int "Permalink")  def symmetricHash\[T](xs: IterableOnce\[T], seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Compute a hash that is symmetric in its arguments\-\-that is,
 where the order of appearance of elements does not matter.

Compute a hash that is symmetric in its arguments\-\-that is,
 where the order of appearance of elements does not matter.
 This is useful for hashing sets, for example.

Annotations@nowarn()
24. [**](../../akka/routing/MurmurHash$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/routing/MurmurHash$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/routing/MurmurHash$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/routing/MurmurHash$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/routing/MurmurHash$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/routing/MurmurHash$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/AddRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/api/akka/current/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka/current/akka/routing/Broadcast.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastPool.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastRoutingLogic$.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHash$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHash.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/Deafen.html
- https://doc.akka.io/api/akka/current/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka/current/akka/routing/DefaultResizer$.html
- https://doc.akka.io/api/akka/current/akka/routing/DefaultResizer.html
- https://doc.akka.io/api/akka/current/akka/routing/FromConfig$.html
- https://doc.akka.io/api/akka/current/akka/routing/FromConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/GetRoutees$.html
- https://doc.akka.io/api/akka/current/akka/routing/GetRoutees.html
- https://doc.akka.io/api/akka/current/akka/routing/Group.html
- https://doc.akka.io/api/akka/current/akka/routing/GroupBase.html
- https://doc.akka.io/api/akka/current/akka/routing/Listen.html
- https://doc.akka.io/api/akka/current/akka/routing/ListenerMessage.html
- https://doc.akka.io/api/akka/current/akka/routing/Listeners.html
- https://doc.akka.io/api/akka/current/akka/routing/MurmurHash$.html
- https://doc.akka.io/api/akka/current/akka/routing/NoRoutee$.html
- https://doc.akka.io/api/akka/current/akka/routing/NoRouter$.html
- https://doc.akka.io/api/akka/current/akka/routing/NoRouter.html
- https://doc.akka.io/api/akka/current/akka/routing/OptimalSizeExploringResizer$.html
- https://doc.akka.io/api/akka/current/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool$.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool.html
- https://doc.akka.io/api/akka/current/akka/routing/PoolBase.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomPool.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomRoutingLogic$.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/routing/RemoveRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/Resizer$.html
- https://doc.akka.io/api/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/api/akka/current/akka/routing/ResizerInitializationException.html
- https://doc.akka.io/api/akka/current/akka/routing/RoundRobinGroup.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/routing/MurmurHash$.html](https://doc.akka.io/api/akka/current/akka/routing/MurmurHash$.html)*