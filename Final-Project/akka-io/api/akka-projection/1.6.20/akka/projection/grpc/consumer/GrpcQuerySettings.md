---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcQuerySettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcQuerySettings
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcQuerySettings

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcQuerySettings

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](index.html)Definition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[consumer](index.html)
- [**](../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[consumer](index.html)
- [ConsumerFilter](ConsumerFilter.html)
- [EventProducerPushDestinationSettings](EventProducerPushDestinationSettings.html)
- GrpcQuerySettings
- [GrpcReadJournalProvider](GrpcReadJournalProvider.html "Note that GrpcReadJournal should be created with the GrpcReadJournal apply / create factory method and not from configuration via GrpcReadJournalProvider when using Protobuf serialization.")
[c](GrpcQuerySettings$.html "See companion object")[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html).[consumer](index.html)

# [GrpcQuerySettings](GrpcQuerySettings$.html "See companion object")[**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html "Permalink")

### Companion [object GrpcQuerySettings](GrpcQuerySettings$.html "See companion object")

#### final  class GrpcQuerySettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[GrpcQuerySettings.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/GrpcQuerySettings.scala#L93)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcQuerySettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#additionalRequestMetadata:Option[akka.grpc.scaladsl.Metadata] "Permalink")  val additionalRequestMetadata: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metadata](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//scaladsl/Metadata.html#akka.grpc.scaladsl.Metadata)]
5. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#fromReplica:Option[akka.persistence.typed.ReplicaId] "Permalink")  val fromReplica: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ReplicaId](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html#akka.persistence.typed.ReplicaId)]
10. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#initialConsumerFilter:Seq[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria] "Permalink")  val initialConsumerFilter: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[FilterCriteria](ConsumerFilter$$FilterCriteria.html)]
13. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
17. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#streamId:String "Permalink")  val streamId: String
18. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#withAdditionalRequestMetadata(metadata:akka.grpc.scaladsl.Metadata):akka.projection.grpc.consumer.GrpcQuerySettings "Permalink")  def withAdditionalRequestMetadata(metadata: [Metadata](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//scaladsl/Metadata.html#akka.grpc.scaladsl.Metadata)): GrpcQuerySettingsAdditional request metadata, for authentication/authorization of the request on the remote side.
24. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#withInitialConsumerFilter(initialConsumerFilter:java.util.List[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria]):akka.projection.grpc.consumer.GrpcQuerySettings "Permalink")  def withInitialConsumerFilter(initialConsumerFilter: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[FilterCriteria](ConsumerFilter$$FilterCriteria.html)]): GrpcQuerySettingsJava API: Set the initial consumer filter to use for events.

Java API: Set the initial consumer filter to use for events. Should only be used for static, up front consumer filters.
Combining this with updating consumer filters directly means that the filters may be reset to these filters on GrpcReadJournal creation.
25. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#withInitialConsumerFilter(initialConsumerFilter:Seq[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria]):akka.projection.grpc.consumer.GrpcQuerySettings "Permalink")  def withInitialConsumerFilter(initialConsumerFilter: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[FilterCriteria](ConsumerFilter$$FilterCriteria.html)]): GrpcQuerySettingsScala API: Set the initial consumer filter to use for events.

Scala API: Set the initial consumer filter to use for events. Should only be used for static, up front consumer filters.
Combining this with updating consumer filters directly means that the filters may be reset to these filters on GrpcReadJournal creation.
### Deprecated Value Members

1. [**](../../../../akka/projection/grpc/consumer/GrpcQuerySettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//scaladsl/Metadata.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$FilterCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html)*