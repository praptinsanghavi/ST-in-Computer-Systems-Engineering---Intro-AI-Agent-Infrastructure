---
description: Akka 2.10.17 - akka.actor.typed.internal.ActorFlightRecorder
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/ActorFlightRecorder$.html
title: Akka 2.10.17 - akka.actor.typed.internal.ActorFlightRecorder
---

# Akka 2.10.17 - akka.actor.typed.internal.ActorFlightRecorder

> **Summary:** Akka 2.10.17 - akka.actor.typed.internal.ActorFlightRecorder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/internal/adapter/index.html "Permalink")  package [adapter](adapter/index.html)Definition Classes[internal](index.html)
- [**](../../../../akka/actor/typed/internal/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[internal](index.html)
- [**](../../../../akka/actor/typed/internal/receptionist/index.html "Permalink")  package [receptionist](receptionist/index.html)Definition Classes[internal](index.html)
- ActorFlightRecorder
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[internal](index.html)

# ActorFlightRecorder[**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html "Permalink")

### 

#### object ActorFlightRecorder

INTERNAL API

Annotations@[InternalApi](../../../annotation/InternalApi.html)() Source[ActorFlightRecorder.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/internal/ActorFlightRecorder.scala#L35)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorFlightRecorder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerChangedProducer(producerId:String):Unit "Permalink")  def consumerChangedProducer(producerId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerCreated(path:akka.actor.ActorPath):Unit "Permalink")  def consumerCreated(path: [ActorPath](../../ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
8. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerDuplicate(producerId:String,expectedSeqNr:Long,seqNr:Long):Unit "Permalink")  def consumerDuplicate(producerId: String, expectedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
9. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerMissing(producerId:String,expectedSeqNr:Long,seqNr:Long):Unit "Permalink")  def consumerMissing(producerId: String, expectedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
10. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerReceived(producerId:String,seqNr:Long):Unit "Permalink")  def consumerReceived(producerId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
11. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerReceivedPreviousInProgress(producerId:String,seqNr:Long,stashed:Int):Unit "Permalink")  def consumerReceivedPreviousInProgress(producerId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), stashed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
12. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerReceivedResend(seqNr:Long):Unit "Permalink")  def consumerReceivedResend(seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
13. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerSentRequest(producerId:String,requestedSeqNr:Long):Unit "Permalink")  def consumerSentRequest(producerId: String, requestedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
14. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerStarted(path:akka.actor.ActorPath):Unit "Permalink")  def consumerStarted(path: [ActorPath](../../ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
15. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#consumerStashFull(producerId:String,seqNr:Long):Unit "Permalink")  def consumerStashFull(producerId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
16. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerCreated(producerId:String,path:akka.actor.ActorPath):Unit "Permalink")  def producerCreated(producerId: String, path: [ActorPath](../../ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
25. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerReceived(producerId:String,currentSeqNr:Long):Unit "Permalink")  def producerReceived(producerId: String, currentSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
26. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerReceivedRequest(producerId:String,requestedSeqNr:Long,confirmedSeqNr:Long):Unit "Permalink")  def producerReceivedRequest(producerId: String, requestedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), confirmedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
27. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerReceivedResend(producerId:String,fromSeqNr:Long):Unit "Permalink")  def producerReceivedResend(producerId: String, fromSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
28. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerRequestNext(producerId:String,currentSeqNr:Long,confirmedSeqNr:Long):Unit "Permalink")  def producerRequestNext(producerId: String, currentSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), confirmedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
29. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerResentFirst(producerId:String,firstSeqNr:Long):Unit "Permalink")  def producerResentFirst(producerId: String, firstSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
30. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerResentFirstUnconfirmed(producerId:String,seqNr:Long):Unit "Permalink")  def producerResentFirstUnconfirmed(producerId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
31. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerResentUnconfirmed(producerId:String,fromSeqNr:Long,toSeqNr:Long):Unit "Permalink")  def producerResentUnconfirmed(producerId: String, fromSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
32. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerSent(producerId:String,seqNr:Long):Unit "Permalink")  def producerSent(producerId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
33. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerStarted(producerId:String,path:akka.actor.ActorPath):Unit "Permalink")  def producerStarted(producerId: String, path: [ActorPath](../../ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
34. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#producerWaitingForRequest(producerId:String,currentSeqNr:Long):Unit "Permalink")  def producerWaitingForRequest(producerId: String, currentSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
35. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/internal/ActorFlightRecorder$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/adapter/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/ActorFlightRecorder$.html)*