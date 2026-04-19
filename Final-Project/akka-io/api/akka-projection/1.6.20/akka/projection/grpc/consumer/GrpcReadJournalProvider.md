---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcReadJournalProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:47:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcReadJournalProvider
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcReadJournalProvider

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.GrpcReadJournalProvider

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
- [GrpcQuerySettings](GrpcQuerySettings.html)
- GrpcReadJournalProvider
c[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html).[consumer](index.html)

# GrpcReadJournalProvider[**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html "Permalink")

### 

#### final  class GrpcReadJournalProvider extends [ReadJournalProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/ReadJournalProvider.html#akka.persistence.query.ReadJournalProvider)

Note that `GrpcReadJournal` `should be created with the` GrpcReadJournal `apply` / `create` factory method
and not from configuration via `GrpcReadJournalProvider` when using Protobuf serialization.

Source[GrpcReadJournalProvider.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/GrpcReadJournalProvider.scala#L16)Linear Supertypes[ReadJournalProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/ReadJournalProvider.html#akka.persistence.query.ReadJournalProvider), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcReadJournalProvider
2. ReadJournalProvider
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config,cfgPath:String):akka.projection.grpc.consumer.GrpcReadJournalProvider "Permalink")  new GrpcReadJournalProvider(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem), config: Config, cfgPath: String)
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#javadslReadJournal():akka.projection.grpc.consumer.javadsl.GrpcReadJournal "Permalink")  def javadslReadJournal(): [GrpcReadJournal](javadsl/GrpcReadJournal.html)Definition ClassesGrpcReadJournalProvider → ReadJournalProvider
12. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#scaladslReadJournal():akka.projection.grpc.consumer.scaladsl.GrpcReadJournal "Permalink")  def scaladslReadJournal(): [GrpcReadJournal](scaladsl/GrpcReadJournal.html)Definition ClassesGrpcReadJournalProvider → ReadJournalProvider
16. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/grpc/consumer/GrpcReadJournalProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ReadJournalProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/ReadJournalProvider.html#akka.persistence.query.ReadJournalProvider)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcReadJournalProvider.html)*