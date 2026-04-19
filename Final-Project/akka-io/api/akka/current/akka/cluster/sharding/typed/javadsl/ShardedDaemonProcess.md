---
description: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:48:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess
---

# Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.of.")
- [EntityFactory](EntityFactory.html)
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- ShardedDaemonProcess
- [StartEntity](StartEntity$.html)
[c](ShardedDaemonProcess$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[javadsl](index.html)

# [ShardedDaemonProcess](ShardedDaemonProcess$.html "See companion object")[**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html "Permalink")

### Companion [object ShardedDaemonProcess](ShardedDaemonProcess$.html "See companion object")

#### abstract  class ShardedDaemonProcess extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

This extension runs a pre set number of actors in a cluster.

The typical use case is when you have a task that can be divided in a number of workers, each doing a
sharded part of the work, for example consuming the read side events from Akka Persistence through
tagged events where each tag decides which consumer that should consume the event.

Each named set needs to be started on all the nodes of the cluster on start up.

The processes are spread out across the cluster, when the cluster topology changes the processes may be stopped
and started anew on a new node to rebalance them.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[ShardedDaemonProcess.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.scala#L41)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardedDaemonProcess
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
### Instance Constructors

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#<init>():akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess "Permalink")  new ShardedDaemonProcess()
### Abstract Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#init[T](messageClass:Class[T],name:String,numberOfInstances:Int,behaviorFactory:java.util.function.IntFunction[akka.actor.typed.Behavior[T]],settings:akka.cluster.sharding.typed.ShardedDaemonProcessSettings,stopMessage:java.util.Optional[T],shardAllocationStrategy:java.util.Optional[akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy]):Unit "Permalink") abstract  def init\[T](messageClass: Class\[T], name: String, numberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Behavior](../../../../actor/typed/Behavior.html)\[T]], settings: [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html), stopMessage: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], shardAllocationStrategy: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ShardAllocationStrategy](../../ShardCoordinator$$ShardAllocationStrategy.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

behaviorFactoryGiven a unique id of `0` until `numberOfInstance` create the behavior for that actor.

stopMessageif defined sent to the actors when they need to stop because of a rebalance across the nodes of the cluster,
 rescale or cluster shutdown.

shardAllocationStrategyif defined used by entities to control the shard allocation
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#init[T](messageClass:Class[T],name:String,numberOfInstances:Int,behaviorFactory:java.util.function.IntFunction[akka.actor.typed.Behavior[T]],settings:akka.cluster.sharding.typed.ShardedDaemonProcessSettings,stopMessage:java.util.Optional[T]):Unit "Permalink") abstract  def init\[T](messageClass: Class\[T], name: String, numberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Behavior](../../../../actor/typed/Behavior.html)\[T]], settings: [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html), stopMessage: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

behaviorFactoryGiven a unique id of `0` until `numberOfInstance` create the behavior for that actor.

stopMessageif defined sent to the actors when they need to stop because of a rebalance across the nodes of the cluster
 or cluster shutdown.
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#init[T](messageClass:Class[T],name:String,numberOfInstances:Int,behaviorFactory:java.util.function.IntFunction[akka.actor.typed.Behavior[T]],stopMessage:T):Unit "Permalink") abstract  def init\[T](messageClass: Class\[T], name: String, numberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Behavior](../../../../actor/typed/Behavior.html)\[T]], stopMessage: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a specific number of actors that is then kept alive in the cluster.

Start a specific number of actors that is then kept alive in the cluster.

behaviorFactoryGiven a unique id of `0` until `numberOfInstance` create the behavior for that actor.

stopMessagesent to the actors when they need to stop because of a rebalance across the nodes of the cluster
 or cluster shutdown.
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#init[T](messageClass:Class[T],name:String,numberOfInstances:Int,behaviorFactory:java.util.function.IntFunction[akka.actor.typed.Behavior[T]]):Unit "Permalink") abstract  def init\[T](messageClass: Class\[T], name: String, numberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Behavior](../../../../actor/typed/Behavior.html)\[T]]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a specific number of actors that is then kept alive in the cluster.

Start a specific number of actors that is then kept alive in the cluster.

behaviorFactoryGiven a unique id of `0` until `numberOfInstance` create the behavior for that actor.
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#initWithContext[T](messageClass:Class[T],name:String,numberOfInstances:Int,behaviorFactory:java.util.function.Function[akka.cluster.sharding.typed.ShardedDaemonProcessContext,akka.actor.typed.Behavior[T]],settings:akka.cluster.sharding.typed.ShardedDaemonProcessSettings,stopMessage:java.util.Optional[T],shardAllocationStrategy:java.util.Optional[akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy]):akka.actor.typed.ActorRef[akka.cluster.sharding.typed.ShardedDaemonProcessCommand] "Permalink") abstract  def initWithContext\[T](messageClass: Class\[T], name: String, numberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html), [Behavior](../../../../actor/typed/Behavior.html)\[T]], settings: [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html), stopMessage: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], shardAllocationStrategy: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ShardAllocationStrategy](../../ShardCoordinator$$ShardAllocationStrategy.html)]): [ActorRef](../../../../actor/typed/ActorRef.html)\[[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html)]Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

behaviorFactoryGiven a unique sharded daemon process context containing the total number of workers and the id
 the specific worker being started, create the behavior for that actor.

stopMessageIf defined: sent to the actors when they need to stop because of a rebalance across the nodes of the cluster,
 rescale or cluster shutdown.

shardAllocationStrategyIf defined: used by entities to control the shard allocation

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#initWithContext[T](messageClass:Class[T],name:String,initialNumberOfInstances:Int,behaviorFactory:java.util.function.Function[akka.cluster.sharding.typed.ShardedDaemonProcessContext,akka.actor.typed.Behavior[T]],settings:akka.cluster.sharding.typed.ShardedDaemonProcessSettings,stopMessage:java.util.Optional[T]):akka.actor.typed.ActorRef[akka.cluster.sharding.typed.ShardedDaemonProcessCommand] "Permalink") abstract  def initWithContext\[T](messageClass: Class\[T], name: String, initialNumberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html), [Behavior](../../../../actor/typed/Behavior.html)\[T]], settings: [ShardedDaemonProcessSettings](../ShardedDaemonProcessSettings.html), stopMessage: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]): [ActorRef](../../../../actor/typed/ActorRef.html)\[[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html)]Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
The number of processing actors can be rescaled by interacting with the returned actor.

behaviorFactoryGiven a unique id of `0` until `numberOfInstance` and total number of processes, create the behavior for that actor.

stopMessageSent to the actors when they need to stop because of a rebalance across the nodes of the cluster
 or cluster shutdown.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
7. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#initWithContext[T](messageClass:Class[T],name:String,initialNumberOfInstances:Int,behaviorFactory:java.util.function.Function[akka.cluster.sharding.typed.ShardedDaemonProcessContext,akka.actor.typed.Behavior[T]]):akka.actor.typed.ActorRef[akka.cluster.sharding.typed.ShardedDaemonProcessCommand] "Permalink") abstract  def initWithContext\[T](messageClass: Class\[T], name: String, initialNumberOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), behaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html), [Behavior](../../../../actor/typed/Behavior.html)\[T]]): [ActorRef](../../../../actor/typed/ActorRef.html)\[[ShardedDaemonProcessCommand](../ShardedDaemonProcessCommand.html)]Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.

Start a specific number of actors, each with a unique numeric id in the set, that is then kept alive in the cluster.
The number of processing actors can be rescaled by interacting with the returned actor.

behaviorFactoryGiven a unique id of `0` until `numberOfInstance` and total number of processes, create the behavior for that actor.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
### Concrete Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toany2stringadd\[ShardedDaemonProcess] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardedDaemonProcess, B)ImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toArrowAssoc\[ShardedDaemonProcess] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardedDaemonProcess) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardedDaemonProcessImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toEnsuring\[ShardedDaemonProcess] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardedDaemonProcess) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardedDaemonProcessImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toEnsuring\[ShardedDaemonProcess] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardedDaemonProcessImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toEnsuring\[ShardedDaemonProcess] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardedDaemonProcessImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toEnsuring\[ShardedDaemonProcess] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toStringFormat\[ShardedDaemonProcess] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardedDaemonProcess, B)ImplicitThis member is added by an implicit conversion from ShardedDaemonProcess toArrowAssoc\[ShardedDaemonProcess] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardedDaemonProcess to any2stringadd\[ShardedDaemonProcess]

### Inherited by implicit conversion StringFormat fromShardedDaemonProcess to StringFormat\[ShardedDaemonProcess]

### Inherited by implicit conversion Ensuring fromShardedDaemonProcess to Ensuring\[ShardedDaemonProcess]

### Inherited by implicit conversion ArrowAssoc fromShardedDaemonProcess to ArrowAssoc\[ShardedDaemonProcess]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/StartEntity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html)*