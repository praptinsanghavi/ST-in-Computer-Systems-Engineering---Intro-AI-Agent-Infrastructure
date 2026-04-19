---
description: Akka 2.6.21 - akka.cluster.client.ClusterClientSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterClientSettings.html
title: Akka 2.6.21 - akka.cluster.client.ClusterClientSettings
---

# Akka 2.6.21 - akka.cluster.client.ClusterClientSettings

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterClientSettings

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
- ClusterClientSettings
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
[c](ClusterClientSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[client](index.html)

# [ClusterClientSettings](ClusterClientSettings$.html "See companion object")[**](../../../akka/cluster/client/ClusterClientSettings.html "Permalink")

### Companion [object ClusterClientSettings](ClusterClientSettings$.html "See companion object")

#### final  class ClusterClientSettings extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L122)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterClientSettings
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

1. [**](../../../akka/cluster/client/ClusterClientSettings.html#<init>(initialContacts:Set[akka.actor.ActorPath],establishingGetContactsInterval:scala.concurrent.duration.FiniteDuration,refreshContactsInterval:scala.concurrent.duration.FiniteDuration,heartbeatInterval:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,bufferSize:Int):akka.cluster.client.ClusterClientSettings "Permalink")  new ClusterClientSettings(initialContacts: Set\[[ActorPath](../../actor/ActorPath.html)], establishingGetContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), refreshContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), bufferSize: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int))For binary/source compatibility
2. [**](../../../akka/cluster/client/ClusterClientSettings.html#<init>(initialContacts:Set[akka.actor.ActorPath],establishingGetContactsInterval:scala.concurrent.duration.FiniteDuration,refreshContactsInterval:scala.concurrent.duration.FiniteDuration,heartbeatInterval:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,bufferSize:Int,reconnectTimeout:Option[scala.concurrent.duration.FiniteDuration]):akka.cluster.client.ClusterClientSettings "Permalink")  new ClusterClientSettings(initialContacts: Set\[[ActorPath](../../actor/ActorPath.html)], establishingGetContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), refreshContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), bufferSize: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int), reconnectTimeout: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])initialContactsActor paths of the `ClusterReceptionist` actors on
 the servers (cluster nodes) that the client will try to contact initially.
 It is mandatory to specify at least one initial contact. The path of the
 default receptionist is
 "akka://system@hostname:port/system/receptionist"

establishingGetContactsIntervalInterval at which the client retries
 to establish contact with one of ClusterReceptionist on the servers (cluster nodes)

refreshContactsIntervalInterval at which the client will ask the
 `ClusterReceptionist` for new contact points to be used for next reconnect.

heartbeatIntervalHow often failure detection heartbeat messages for detection
 of failed connections should be sent.

acceptableHeartbeatPauseNumber of potentially lost/delayed heartbeats that will
 be accepted before considering it to be an anomaly. The ClusterClient is using the
 [akka.remote.DeadlineFailureDetector](../../remote/DeadlineFailureDetector.html), which will trigger if there are no heartbeats
 within the duration `heartbeatInterval + acceptableHeartbeatPause`.

bufferSizeIf connection to the receptionist is not established the client
 will buffer this number of messages and deliver them the connection is established.
 When the buffer is full old messages will be dropped when new messages are sent via the
 client. Use 0 to disable buffering, i.e. messages will be dropped immediately if the
 location of the receptionist is unavailable.

reconnectTimeoutIf the connection to the receptionist is lost and cannot
 be re\-established within this duration the cluster client will be stopped. This makes it possible
 to watch it from another actor and possibly acquire a new list of initialContacts from some
 external service registry
### Value Members

1. [**](../../../akka/cluster/client/ClusterClientSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterClientSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterClientSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterClientSettings toany2stringadd\[ClusterClientSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/client/ClusterClientSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterClientSettings, B)ImplicitThis member is added by an implicit conversion from ClusterClientSettings toArrowAssoc\[ClusterClientSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/client/ClusterClientSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/client/ClusterClientSettings.html#acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration "Permalink")  val acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
7. [**](../../../akka/cluster/client/ClusterClientSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/client/ClusterClientSettings.html#bufferSize:Int "Permalink")  val bufferSize: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
9. [**](../../../akka/cluster/client/ClusterClientSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
10. [**](../../../akka/cluster/client/ClusterClientSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterClientSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterClientSettingsImplicitThis member is added by an implicit conversion from ClusterClientSettings toEnsuring\[ClusterClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/client/ClusterClientSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterClientSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterClientSettingsImplicitThis member is added by an implicit conversion from ClusterClientSettings toEnsuring\[ClusterClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/client/ClusterClientSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ClusterClientSettingsImplicitThis member is added by an implicit conversion from ClusterClientSettings toEnsuring\[ClusterClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/client/ClusterClientSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ClusterClientSettingsImplicitThis member is added by an implicit conversion from ClusterClientSettings toEnsuring\[ClusterClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/client/ClusterClientSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/client/ClusterClientSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/client/ClusterClientSettings.html#establishingGetContactsInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val establishingGetContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
17. [**](../../../akka/cluster/client/ClusterClientSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
18. [**](../../../akka/cluster/client/ClusterClientSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../../akka/cluster/client/ClusterClientSettings.html#heartbeatInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
20. [**](../../../akka/cluster/client/ClusterClientSettings.html#initialContacts:Set[akka.actor.ActorPath] "Permalink")  val initialContacts: Set\[[ActorPath](../../actor/ActorPath.html)]
21. [**](../../../akka/cluster/client/ClusterClientSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../akka/cluster/client/ClusterClientSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/cluster/client/ClusterClientSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
24. [**](../../../akka/cluster/client/ClusterClientSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
25. [**](../../../akka/cluster/client/ClusterClientSettings.html#reconnectTimeout:Option[scala.concurrent.duration.FiniteDuration] "Permalink")  val reconnectTimeout: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
26. [**](../../../akka/cluster/client/ClusterClientSettings.html#refreshContactsInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val refreshContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
27. [**](../../../akka/cluster/client/ClusterClientSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/cluster/client/ClusterClientSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../akka/cluster/client/ClusterClientSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/cluster/client/ClusterClientSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/cluster/client/ClusterClientSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../akka/cluster/client/ClusterClientSettings.html#withBufferSize(bufferSize:Int):akka.cluster.client.ClusterClientSettings "Permalink")  def withBufferSize(bufferSize: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): ClusterClientSettings
33. [**](../../../akka/cluster/client/ClusterClientSettings.html#withEstablishingGetContactsInterval(establishingGetContactsInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterClientSettings "Permalink")  def withEstablishingGetContactsInterval(establishingGetContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterClientSettings
34. [**](../../../akka/cluster/client/ClusterClientSettings.html#withHeartbeat(heartbeatInterval:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterClientSettings "Permalink")  def withHeartbeat(heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterClientSettings
35. [**](../../../akka/cluster/client/ClusterClientSettings.html#withInitialContacts(initialContacts:java.util.Set[akka.actor.ActorPath]):akka.cluster.client.ClusterClientSettings "Permalink")  def withInitialContacts(initialContacts: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorPath](../../actor/ActorPath.html)]): ClusterClientSettingsJava API
36. [**](../../../akka/cluster/client/ClusterClientSettings.html#withInitialContacts(initialContacts:Set[akka.actor.ActorPath]):akka.cluster.client.ClusterClientSettings "Permalink")  def withInitialContacts(initialContacts: Set\[[ActorPath](../../actor/ActorPath.html)]): ClusterClientSettingsScala API
37. [**](../../../akka/cluster/client/ClusterClientSettings.html#withReconnectTimeout(reconnectTimeout:Option[scala.concurrent.duration.FiniteDuration]):akka.cluster.client.ClusterClientSettings "Permalink")  def withReconnectTimeout(reconnectTimeout: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]): ClusterClientSettings
38. [**](../../../akka/cluster/client/ClusterClientSettings.html#withRefreshContactsInterval(refreshContactsInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.client.ClusterClientSettings "Permalink")  def withRefreshContactsInterval(refreshContactsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterClientSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterClientSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/client/ClusterClientSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterClientSettings toStringFormat\[ClusterClientSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/client/ClusterClientSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterClientSettings, B)ImplicitThis member is added by an implicit conversion from ClusterClientSettings toArrowAssoc\[ClusterClientSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterClientSettings to any2stringadd\[ClusterClientSettings]

### Inherited by implicit conversion StringFormat fromClusterClientSettings to StringFormat\[ClusterClientSettings]

### Inherited by implicit conversion Ensuring fromClusterClientSettings to Ensuring\[ClusterClientSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterClientSettings to ArrowAssoc\[ClusterClientSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPath.html
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
- https://doc.akka.io/api/akka-core/2.6/akka/remote/DeadlineFailureDetector.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html)*