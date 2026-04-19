---
description: Akka 2.6.21 - akka.cluster.client.ClusterClientReceptionist
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterClientReceptionist.html
title: Akka 2.6.21 - akka.cluster.client.ClusterClientReceptionist
---

# Akka 2.6.21 - akka.cluster.client.ClusterClientReceptionist

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterClientReceptionist

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/client/index.html "Permalink")  package [client](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/client/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[client](index.html)
- [ClusterClient](ClusterClient.html "This actor is intended to be used on an external node that is not member of the cluster.")
- [ClusterClientInteraction](ClusterClientInteraction.html "Declares a super type for all events emitted by the ClusterReceptionist.")
- [ClusterClientMessage](ClusterClientMessage.html "Marker trait for remote messages with special serializer.")
- ClusterClientReceptionist
- [ClusterClientSettings](ClusterClientSettings.html)
- [ClusterClientUnreachable](ClusterClientUnreachable.html "Emitted to the Akka event stream when a cluster client was previously connected but then not seen for some time.")
- [ClusterClientUp](ClusterClientUp.html "Emitted to the Akka event stream when a cluster client has interacted with a receptionist.")
- [ClusterClients](ClusterClients.html "The reply to GetClusterClients.")
- [ClusterReceptionist](ClusterReceptionist.html "ClusterClient connects to this actor to retrieve.")
- [ClusterReceptionistSettings](ClusterReceptionistSettings.html)
- [ContactPointAdded](ContactPointAdded.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")
- [ContactPointChange](ContactPointChange.html "Declares a super type for all events emitted by the ClusterClient in relation to contact points being added or removed.")
- [ContactPointRemoved](ContactPointRemoved.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")
- [ContactPoints](ContactPoints.html "The reply to GetContactPoints.")
- [GetClusterClients](GetClusterClients.html)
- [GetContactPoints](GetContactPoints.html)
- [SubscribeClusterClients](SubscribeClusterClients.html)
- [SubscribeContactPoints](SubscribeContactPoints.html)
- [UnsubscribeClusterClients](UnsubscribeClusterClients.html)
- [UnsubscribeContactPoints](UnsubscribeContactPoints.html)
[c](ClusterClientReceptionist$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[client](index.html)

# [ClusterClientReceptionist](ClusterClientReceptionist$.html "See companion object")[**](../../../akka/cluster/client/ClusterClientReceptionist.html "Permalink")

### Companion [object ClusterClientReceptionist](ClusterClientReceptionist$.html "See companion object")

#### final  class ClusterClientReceptionist extends [Extension](../../actor/Extension.html)

Extension that starts [ClusterReceptionist](ClusterReceptionist.html) and accompanying [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html)
with settings defined in config section `akka.cluster.client.receptionist`.
The [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html) is started by the [akka.cluster.pubsub.DistributedPubSub](../pubsub/DistributedPubSub.html) extension.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L578)Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterClientReceptionist
2. Extension
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

1. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.client.ClusterClientReceptionist "Permalink")  new ClusterClientReceptionist(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterClientReceptionist.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toany2stringadd\[ClusterClientReceptionist] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterClientReceptionist, B)ImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toArrowAssoc\[ClusterClientReceptionist] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterClientReceptionist) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterClientReceptionistImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toEnsuring\[ClusterClientReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterClientReceptionist) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterClientReceptionistImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toEnsuring\[ClusterClientReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterClientReceptionistImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toEnsuring\[ClusterClientReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterClientReceptionistImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toEnsuring\[ClusterClientReceptionist] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
16. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#isTerminated:Boolean "Permalink")  def isTerminated: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Returns true if this member is not tagged with the role configured for the
receptionist.
18. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
21. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#registerService(actor:akka.actor.ActorRef):Unit "Permalink")  def registerService(actor: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Register an actor that should be reachable for the clients.

Register an actor that should be reachable for the clients.
The clients can send messages to this actor with `Send` or `SendToAll` using
the path elements of the `ActorRef`, e.g. `"/user/myservice"`.
22. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#registerSubscriber(topic:String,actor:akka.actor.ActorRef):Unit "Permalink")  def registerSubscriber(topic: String, actor: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Register an actor that should be reachable for the clients to a named topic.

Register an actor that should be reachable for the clients to a named topic.
Several actors can be registered to the same topic name, and all will receive
published messages.
The client can publish messages to this topic with `Publish`.
23. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#underlying:akka.actor.ActorRef "Permalink")  def underlying: [ActorRef](../../actor/ActorRef.html)Returns the underlying receptionist actor, particularly so that its
events can be observed via subscribe/unsubscribe.
26. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#unregisterService(actor:akka.actor.ActorRef):Unit "Permalink")  def unregisterService(actor: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)A registered actor will be automatically unregistered when terminated,
but it can also be explicitly unregistered before termination.
27. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#unregisterSubscriber(topic:String,actor:akka.actor.ActorRef):Unit "Permalink")  def unregisterSubscriber(topic: String, actor: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)A registered subscriber will be automatically unregistered when terminated,
but it can also be explicitly unregistered before termination.
28. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toStringFormat\[ClusterClientReceptionist] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/client/ClusterClientReceptionist.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterClientReceptionist, B)ImplicitThis member is added by an implicit conversion from ClusterClientReceptionist toArrowAssoc\[ClusterClientReceptionist] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterClientReceptionist to any2stringadd\[ClusterClientReceptionist]

### Inherited by implicit conversion StringFormat fromClusterClientReceptionist to StringFormat\[ClusterClientReceptionist]

### Inherited by implicit conversion Ensuring fromClusterClientReceptionist to Ensuring\[ClusterClientReceptionist]

### Inherited by implicit conversion ArrowAssoc fromClusterClientReceptionist to ArrowAssoc\[ClusterClientReceptionist]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientInteraction.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientUnreachable.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientUp.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointAdded.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointChange.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointRemoved.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html)*