---
description: Akka 2.6.21 - akka.cluster.client.ClusterReceptionistSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterReceptionistSettings.html
title: Akka 2.6.21 - akka.cluster.client.ClusterReceptionistSettings
---

# Akka 2.6.21 - akka.cluster.client.ClusterReceptionistSettings

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterReceptionistSettings

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
- ClusterReceptionistSettings
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
[c](ClusterReceptionistSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[client](index.html)

# [ClusterReceptionistSettings](ClusterReceptionistSettings$.html "See companion object")[**](../../../akka/cluster/client/ClusterReceptionistSettings.html "Permalink")

### Companion [object ClusterReceptionistSettings](ClusterReceptionistSettings$.html "See companion object")

#### final  class ClusterReceptionistSettings extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L708)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterReceptionistSettings
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

1. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#<init>(role:Option[String],numberOfContacts:Int,responseTunnelReceiveTimeout:scala.concurrent.duration.FiniteDuration,heartbeatInterval:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,failureDetectionInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterReceptionistSettings "Permalink")  new ClusterReceptionistSettings(role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String], numberOfContacts: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), responseTunnelReceiveTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), failureDetectionInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))
2. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#<init>(role:Option[String],numberOfContacts:Int,responseTunnelReceiveTimeout:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterReceptionistSettings "Permalink")  new ClusterReceptionistSettings(role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String], numberOfContacts: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), responseTunnelReceiveTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))roleStart the receptionist on members tagged with this role.
 All members are used if undefined.

numberOfContactsThe receptionist will send this number of contact points to the client

responseTunnelReceiveTimeoutThe actor that tunnel response messages to the
 client will be stopped after this time of inactivity.
### Value Members

1. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toany2stringadd\[ClusterReceptionistSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterReceptionistSettings, B)ImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toArrowAssoc\[ClusterReceptionistSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration "Permalink")  def acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
7. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
9. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterReceptionistSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterReceptionistSettingsImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toEnsuring\[ClusterReceptionistSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterReceptionistSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterReceptionistSettingsImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toEnsuring\[ClusterReceptionistSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterReceptionistSettingsImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toEnsuring\[ClusterReceptionistSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterReceptionistSettingsImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toEnsuring\[ClusterReceptionistSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#failureDetectionInterval:scala.concurrent.duration.FiniteDuration "Permalink")  def failureDetectionInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
17. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
18. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#heartbeatInterval:scala.concurrent.duration.FiniteDuration "Permalink")  def heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
19. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
22. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
23. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#numberOfContacts:Int "Permalink")  val numberOfContacts: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
24. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#responseTunnelReceiveTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val responseTunnelReceiveTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
25. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String]
26. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#withHeartbeat(heartbeatInterval:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,failureDetectionInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterReceptionistSettings "Permalink")  def withHeartbeat(heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), failureDetectionInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterReceptionistSettings
32. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#withNumberOfContacts(numberOfContacts:Int):akka.cluster.client.ClusterReceptionistSettings "Permalink")  def withNumberOfContacts(numberOfContacts: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): ClusterReceptionistSettings
33. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#withResponseTunnelReceiveTimeout(responseTunnelReceiveTimeout:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterReceptionistSettings "Permalink")  def withResponseTunnelReceiveTimeout(responseTunnelReceiveTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterReceptionistSettings
34. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#withRole(role:Option[String]):akka.cluster.client.ClusterReceptionistSettings "Permalink")  def withRole(role: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[String]): ClusterReceptionistSettings
35. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#withRole(role:String):akka.cluster.client.ClusterReceptionistSettings "Permalink")  def withRole(role: String): ClusterReceptionistSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toStringFormat\[ClusterReceptionistSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterReceptionistSettings, B)ImplicitThis member is added by an implicit conversion from ClusterReceptionistSettings toArrowAssoc\[ClusterReceptionistSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterReceptionistSettings to any2stringadd\[ClusterReceptionistSettings]

### Inherited by implicit conversion StringFormat fromClusterReceptionistSettings to StringFormat\[ClusterReceptionistSettings]

### Inherited by implicit conversion Ensuring fromClusterReceptionistSettings to Ensuring\[ClusterReceptionistSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterReceptionistSettings to ArrowAssoc\[ClusterReceptionistSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/NoSerializationVerificationNeeded.html
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
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html)*