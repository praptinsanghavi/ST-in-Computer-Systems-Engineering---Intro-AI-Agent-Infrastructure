---
description: Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubSettings.html
title: Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubSettings
---

# Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubSettings

> **Summary:** Akka 2.6.21 - akka.cluster.pubsub.DistributedPubSubSettings

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[pubsub](index.html)
- [DistributedPubSub](DistributedPubSub.html "Extension that starts a DistributedPubSubMediator actor with settings defined in config section akka.cluster.pub-sub.")
- [DistributedPubSubMediator](DistributedPubSubMediator.html "This actor manages a registry of actor references and replicates the entries to peer actors among all cluster nodes or a group of nodes tagged with a specific role.")
- [DistributedPubSubMessage](DistributedPubSubMessage.html "Marker trait for remote messages with special serializer.")
- DistributedPubSubSettings
[c](DistributedPubSubSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html)

# [DistributedPubSubSettings](DistributedPubSubSettings$.html "See companion object")[**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html "Permalink")

### Companion [object DistributedPubSubSettings](DistributedPubSubSettings$.html "See companion object")

#### final  class DistributedPubSubSettings extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Source[DistributedPubSubMediator.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L93)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedPubSubSettings
2. NoSerializationVerificationNeeded
3. AnyRef
4. Any
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

1. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#<init>(role:Option[String],routingLogic:akka.routing.RoutingLogic,gossipInterval:scala.concurrent.duration.FiniteDuration,removedTimeToLive:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,sendToDeadLettersWhenNoSubscribers:Boolean):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  new DistributedPubSubSettings(role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String], routingLogic: [RoutingLogic](../../routing/RoutingLogic.html), gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), removedTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), sendToDeadLettersWhenNoSubscribers: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean))roleStart the mediator on members tagged with this role.
 All members are used if undefined.

routingLogicThe routing logic to use for `Send`.

gossipIntervalHow often the DistributedPubSubMediator should send out gossip information

removedTimeToLiveRemoved entries are pruned after this duration

maxDeltaElementsMaximum number of elements to transfer in one message when synchronizing
 the registries. Next chunk will be transferred in next round of gossip.

sendToDeadLettersWhenNoSubscribersWhen a message is published to a topic with no subscribers send it to the dead letters.
2. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#<init>(role:Option[String],routingLogic:akka.routing.RoutingLogic,gossipInterval:scala.concurrent.duration.FiniteDuration,removedTimeToLive:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  new DistributedPubSubSettings(role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String], routingLogic: [RoutingLogic](../../routing/RoutingLogic.html), gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), removedTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int))Annotations@deprecated Deprecated*(Since version 2\.5\.5\)* Use the other constructor instead.
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toany2stringadd\[DistributedPubSubSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DistributedPubSubSettings, B)ImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toArrowAssoc\[DistributedPubSubSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DistributedPubSubSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): DistributedPubSubSettingsImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toEnsuring\[DistributedPubSubSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DistributedPubSubSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DistributedPubSubSettingsImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toEnsuring\[DistributedPubSubSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): DistributedPubSubSettingsImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toEnsuring\[DistributedPubSubSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DistributedPubSubSettingsImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toEnsuring\[DistributedPubSubSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#gossipInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
17. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#maxDeltaElements:Int "Permalink")  val maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
19. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
21. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
22. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#removedTimeToLive:scala.concurrent.duration.FiniteDuration "Permalink")  val removedTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
23. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String]
24. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#routingLogic:akka.routing.RoutingLogic "Permalink")  val routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)
25. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#sendToDeadLettersWhenNoSubscribers:Boolean "Permalink")  val sendToDeadLettersWhenNoSubscribers: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
26. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withGossipInterval(gossipInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withGossipInterval(gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): DistributedPubSubSettings
32. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withMaxDeltaElements(maxDeltaElements:Int):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withMaxDeltaElements(maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): DistributedPubSubSettings
33. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withRemovedTimeToLive(removedTimeToLive:scala.concurrent.duration.FiniteDuration):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withRemovedTimeToLive(removedTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): DistributedPubSubSettings
34. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withRole(role:Option[String]):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withRole(role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String]): DistributedPubSubSettings
35. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withRole(role:String):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withRole(role: String): DistributedPubSubSettings
36. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withRoutingLogic(routingLogic:akka.routing.RoutingLogic):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withRoutingLogic(routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)): DistributedPubSubSettings
37. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#withSendToDeadLettersWhenNoSubscribers(sendToDeadLetterWhenNoSubscribers:Boolean):akka.cluster.pubsub.DistributedPubSubSettings "Permalink")  def withSendToDeadLettersWhenNoSubscribers(sendToDeadLetterWhenNoSubscribers: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DistributedPubSubSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toStringFormat\[DistributedPubSubSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DistributedPubSubSettings, B)ImplicitThis member is added by an implicit conversion from DistributedPubSubSettings toArrowAssoc\[DistributedPubSubSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDistributedPubSubSettings to any2stringadd\[DistributedPubSubSettings]

### Inherited by implicit conversion StringFormat fromDistributedPubSubSettings to StringFormat\[DistributedPubSubSettings]

### Inherited by implicit conversion Ensuring fromDistributedPubSubSettings to Ensuring\[DistributedPubSubSettings]

### Inherited by implicit conversion ArrowAssoc fromDistributedPubSubSettings to ArrowAssoc\[DistributedPubSubSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubSettings.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubSettings.html)*