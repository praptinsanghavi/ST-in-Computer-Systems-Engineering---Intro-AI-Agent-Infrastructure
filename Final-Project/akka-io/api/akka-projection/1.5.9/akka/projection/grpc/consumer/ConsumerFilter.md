---
description: Akka Projection 1.5.9 - akka.projection.grpc.consumer.ConsumerFilter
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter.html
title: Akka Projection 1.5.9 - akka.projection.grpc.consumer.ConsumerFilter
---

# Akka Projection 1.5.9 - akka.projection.grpc.consumer.ConsumerFilter

> **Summary:** Akka Projection 1.5.9 - akka.projection.grpc.consumer.ConsumerFilter

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](index.html)Definition Classes[grpc](../index.html)
- [**](../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[consumer](index.html)
- [**](../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[consumer](index.html)
- ConsumerFilter
- [EventProducerPushDestinationSettings](EventProducerPushDestinationSettings.html)
- [GrpcQuerySettings](GrpcQuerySettings.html)
- [GrpcReadJournalProvider](GrpcReadJournalProvider.html "Note that GrpcReadJournal should be created with the GrpcReadJournal apply / create factory method and not from configuration via GrpcReadJournalProvider when using Protobuf serialization.")
[c](ConsumerFilter$.html "See companion object")[akka](../../../index.html).[projection](../../index.html).[grpc](../index.html).[consumer](index.html)

# [ConsumerFilter](ConsumerFilter$.html "See companion object")[**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html "Permalink")

### Companion [object ConsumerFilter](ConsumerFilter$.html "See companion object")

#### final  class ConsumerFilter extends [Extension](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Extension.html#akka.actor.typed.Extension)

Source[ConsumerFilter.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/ConsumerFilter.scala#L729)Linear Supertypes[Extension](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Extension.html#akka.actor.typed.Extension), [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerFilter
2. Extension
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#<init>(system:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.consumer.ConsumerFilter "Permalink")  new ConsumerFilter(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_])
### Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#ref:akka.actor.typed.ActorRef[akka.projection.grpc.consumer.ConsumerFilter.Command] "Permalink")  val ref: [ActorRef](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorRef.html#akka.actor.typed.ActorRef)\[[Command](ConsumerFilter$$Command.html)]
15. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/grpc/consumer/ConsumerFilter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Extension](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Extension.html#akka.actor.typed.Extension)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter$$Command.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/EventProducerPushDestinationSettings$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/GrpcQuerySettings$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/GrpcReadJournalProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Extension.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter.html)*