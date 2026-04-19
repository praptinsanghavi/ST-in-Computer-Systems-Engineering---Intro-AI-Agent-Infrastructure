---
description: Akka 2.6.21 - akka.cluster.client.ClusterReceptionist
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:13:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterReceptionist$.html
title: Akka 2.6.21 - akka.cluster.client.ClusterReceptionist
---

# Akka 2.6.21 - akka.cluster.client.ClusterReceptionist

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterReceptionist

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
- [ClusterClientReceptionist](ClusterClientReceptionist.html "Extension that starts ClusterReceptionist and accompanying akka.cluster.pubsub.DistributedPubSubMediator with settings defined in config section akka.cluster.client.receptionist.")
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
[o](ClusterReceptionist.html "See companion class")[akka](../../index.html).[cluster](../index.html).[client](index.html)

# [ClusterReceptionist](ClusterReceptionist.html "See companion class")[**](../../../akka/cluster/client/ClusterReceptionist$.html "Permalink")

### Companion [class ClusterReceptionist](ClusterReceptionist.html "See companion class")

#### object ClusterReceptionist

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L870)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterReceptionist
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/client/ClusterReceptionist$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterReceptionist$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterReceptionist$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/client/ClusterReceptionist$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/client/ClusterReceptionist$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
6. [**](../../../akka/cluster/client/ClusterReceptionist$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/client/ClusterReceptionist$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/client/ClusterReceptionist$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
9. [**](../../../akka/cluster/client/ClusterReceptionist$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
10. [**](../../../akka/cluster/client/ClusterReceptionist$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/client/ClusterReceptionist$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/cluster/client/ClusterReceptionist$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
13. [**](../../../akka/cluster/client/ClusterReceptionist$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/cluster/client/ClusterReceptionist$.html#props(pubSubMediator:akka.actor.ActorRef,settings:akka.cluster.client.ClusterReceptionistSettings):akka.actor.Props "Permalink")  def props(pubSubMediator: [ActorRef](../../actor/ActorRef.html), settings: [ClusterReceptionistSettings](ClusterReceptionistSettings.html)): [Props](../../actor/Props.html)Scala API: Factory method for `ClusterReceptionist` [akka.actor.Props](../../actor/Props.html).
15. [**](../../../akka/cluster/client/ClusterReceptionist$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/cluster/client/ClusterReceptionist$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/cluster/client/ClusterReceptionist$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/client/ClusterReceptionist$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/client/ClusterReceptionist$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterReceptionist$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Props.html
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
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist$.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist$.html)*