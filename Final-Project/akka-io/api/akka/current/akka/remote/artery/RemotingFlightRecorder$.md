---
description: Akka 2.10.17 - akka.remote.artery.RemotingFlightRecorder
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/RemotingFlightRecorder$.html
title: Akka 2.10.17 - akka.remote.artery.RemotingFlightRecorder
---

# Akka 2.10.17 - akka.remote.artery.RemotingFlightRecorder

> **Summary:** Akka 2.10.17 - akka.remote.artery.RemotingFlightRecorder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](aeron/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](compress/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](tcp/index.html)Definition Classes[artery](index.html)
- [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html)
- [QuarantinedEvent](QuarantinedEvent.html)
- [RemoteInstrument](RemoteInstrument.html "INTERNAL API")
- RemotingFlightRecorder
- [TestManagementCommands](TestManagementCommands$.html)
- [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html)
o[akka](../../index.html).[remote](../index.html).[artery](index.html)

# RemotingFlightRecorder[**](../../../akka/remote/artery/RemotingFlightRecorder$.html "Permalink")

### 

#### object RemotingFlightRecorder

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)() Source[RemotingFlightRecorder.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/RemotingFlightRecorder.scala#L57)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemotingFlightRecorder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkDelegateToTaskRunner(countBeforeDelegate:Long):Unit "Permalink")  def aeronSinkDelegateToTaskRunner(countBeforeDelegate: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
5. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkEnvelopeGrabbed(lastMessageSize:Int):Unit "Permalink")  def aeronSinkEnvelopeGrabbed(lastMessageSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
6. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkEnvelopeOffered(lastMessageSize:Int):Unit "Permalink")  def aeronSinkEnvelopeOffered(lastMessageSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkGaveUpEnvelope(cause:String):Unit "Permalink")  def aeronSinkGaveUpEnvelope(cause: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
8. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkPublicationClosed(channel:String,streamId:Int):Unit "Permalink")  def aeronSinkPublicationClosed(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
9. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkPublicationClosedUnexpectedly(channel:String,streamId:Int):Unit "Permalink")  def aeronSinkPublicationClosedUnexpectedly(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
10. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkReturnFromTaskRunner(nanosSinceTaskStartTime:Long):Unit "Permalink")  def aeronSinkReturnFromTaskRunner(nanosSinceTaskStartTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
11. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkStarted(channel:String,streamId:Int):Unit "Permalink")  def aeronSinkStarted(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
12. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkStopped(channel:String,streamId:Int):Unit "Permalink")  def aeronSinkStopped(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
13. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSinkTaskRunnerRemoved(channel:String,streamId:Int):Unit "Permalink")  def aeronSinkTaskRunnerRemoved(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
14. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSourceDelegateToTaskRunner(countBeforeDelegate:Long):Unit "Permalink")  def aeronSourceDelegateToTaskRunner(countBeforeDelegate: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
15. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSourceReceived(size:Int):Unit "Permalink")  def aeronSourceReceived(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
16. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSourceReturnFromTaskRunner(nanosSinceTaskStartTime:Long):Unit "Permalink")  def aeronSourceReturnFromTaskRunner(nanosSinceTaskStartTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
17. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSourceStarted(channel:String,streamId:Int):Unit "Permalink")  def aeronSourceStarted(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
18. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#aeronSourceStopped(channel:String,streamId:Int):Unit "Permalink")  def aeronSourceStopped(channel: String, streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
19. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
20. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#compressionActorRefAdvertisement(uid:Long):Unit "Permalink")  def compressionActorRefAdvertisement(uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
22. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#compressionClassManifestAdvertisement(uid:Long):Unit "Permalink")  def compressionClassManifestAdvertisement(uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
23. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
25. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#tcpInboundBound(bindHost:String,address:java.net.InetSocketAddress):Unit "Permalink")  def tcpInboundBound(bindHost: String, address: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
33. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#tcpInboundConnected(remoteAddress:java.net.InetSocketAddress):Unit "Permalink")  def tcpInboundConnected(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
34. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#tcpInboundReceived(size:Int):Unit "Permalink")  def tcpInboundReceived(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
35. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#tcpInboundUnbound(localAddress:akka.remote.UniqueAddress):Unit "Permalink")  def tcpInboundUnbound(localAddress: [UniqueAddress](../UniqueAddress.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
36. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#tcpOutboundConnected(remoteAddress:akka.actor.Address,streamName:String):Unit "Permalink")  def tcpOutboundConnected(remoteAddress: [Address](../../actor/Address.html), streamName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
37. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#tcpOutboundSent(size:Int):Unit "Permalink")  def tcpOutboundSent(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
38. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportAeronErrorLogStarted():Unit "Permalink")  def transportAeronErrorLogStarted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
40. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportAeronErrorLogTaskStopped():Unit "Permalink")  def transportAeronErrorLogTaskStopped(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
41. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportKillSwitchPulled():Unit "Permalink")  def transportKillSwitchPulled(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
42. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportMaterializerStarted():Unit "Permalink")  def transportMaterializerStarted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
43. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportMediaDriverStarted(directoryName:String):Unit "Permalink")  def transportMediaDriverStarted(directoryName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
44. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportMediaFileDeleted():Unit "Permalink")  def transportMediaFileDeleted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
45. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportQuarantined(remoteAddress:akka.actor.Address,uid:Long):Unit "Permalink")  def transportQuarantined(remoteAddress: [Address](../../actor/Address.html), uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
46. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportRemoveQuarantined(remoteAddress:akka.actor.Address):Unit "Permalink")  def transportRemoveQuarantined(remoteAddress: [Address](../../actor/Address.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
47. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportRestartInbound(remoteAddress:akka.remote.UniqueAddress,streamName:String):Unit "Permalink")  def transportRestartInbound(remoteAddress: [UniqueAddress](../UniqueAddress.html), streamName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
48. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportRestartOutbound(remoteAddress:akka.actor.Address,streamName:String):Unit "Permalink")  def transportRestartOutbound(remoteAddress: [Address](../../actor/Address.html), streamName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
49. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportSendQueueOverflow(queueIndex:Int):Unit "Permalink")  def transportSendQueueOverflow(queueIndex: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
50. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportStarted():Unit "Permalink")  def transportStarted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
51. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportStartupFinished():Unit "Permalink")  def transportStartupFinished(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
52. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportStopIdleOutbound(remoteAddress:akka.actor.Address,queueIndex:Int):Unit "Permalink")  def transportStopIdleOutbound(remoteAddress: [Address](../../actor/Address.html), queueIndex: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
53. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportStopped():Unit "Permalink")  def transportStopped(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
54. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportTaskRunnerStarted():Unit "Permalink")  def transportTaskRunnerStarted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
55. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#transportUniqueAddressSet(uniqueAddress:akka.remote.UniqueAddress):Unit "Permalink")  def transportUniqueAddressSet(uniqueAddress: [UniqueAddress](../UniqueAddress.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
56. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
58. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/QuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/aeron/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/compress/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/jfr/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/RemotingFlightRecorder$.html](https://doc.akka.io/api/akka/current/akka/remote/artery/RemotingFlightRecorder$.html)*