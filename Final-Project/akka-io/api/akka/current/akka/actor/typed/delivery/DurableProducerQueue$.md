---
description: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:51:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue
---

# Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[delivery](index.html)
- [ConsumerController](ConsumerController$.html "ConsumerController and ProducerController or WorkPullingProducerController are used together.")
- DurableProducerQueue
- [ProducerController](ProducerController$.html "Point-to-point reliable delivery between a single producer actor sending messages and a single consumer actor receiving the messages.")
- [WorkPullingProducerController](WorkPullingProducerController$.html "Work pulling is a pattern where several worker actors pull tasks in their own pace from a shared work manager instead of that the manager pushes work to the workers blindly without knowing their individual capacity and current availability.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html)

# DurableProducerQueue[**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html "Permalink")

### 

#### object DurableProducerQueue

Actor message protocol for storing and confirming reliable delivery of messages. A [akka.actor.typed.Behavior](../Behavior.html)
implementation of this protocol can optionally be used with [ProducerController](ProducerController$.html) when messages shall survive
a crash of the producer side.

An implementation of this exists in `akka.persistence.typed.delivery.EventSourcedProducerQueue`.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[DurableProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/DurableProducerQueue.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableProducerQueue
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html "Permalink")  trait [Command](DurableProducerQueue$$Command.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#ConfirmationQualifier=String "Permalink")  type ConfirmationQualifier \= [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$LoadState.html "Permalink") final  case class [LoadState](DurableProducerQueue$$LoadState.html "Request that is used at startup to retrieve the unconfirmed messages and current sequence number.")\[A](replyTo: [ActorRef](../ActorRef.html)\[[State](DurableProducerQueue$$State.html)\[A]]) extends [Command](DurableProducerQueue$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRequest that is used at startup to retrieve the unconfirmed messages and current sequence number.
4. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent.html "Permalink") final  class [MessageSent](DurableProducerQueue$$MessageSent.html "The fact (event) that a message has been sent.")\[A] extends EventThe fact (event) that a message has been sent.
5. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#SeqNr=Long "Permalink")  type SeqNr \= [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
6. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html "Permalink") final  case class [State](DurableProducerQueue$$State.html)\[A](currentSeqNr: [SeqNr](#SeqNr=Long), highestConfirmedSeqNr: [SeqNr](#SeqNr=Long), confirmedSeqNr: Map\[[ConfirmationQualifier](#ConfirmationQualifier=String), ([SeqNr](#SeqNr=Long), [TimestampMillis](#TimestampMillis=Long))], unconfirmed: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[MessageSent](DurableProducerQueue$$MessageSent.html)\[A]]) extends DeliverySerializable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html "Permalink") final  case class [StoreMessageConfirmed](DurableProducerQueue$$StoreMessageConfirmed.html "Store the fact that a message has been confirmed to be delivered and processed.")\[A](seqNr: [SeqNr](#SeqNr=Long), confirmationQualifier: [ConfirmationQualifier](#ConfirmationQualifier=String), timestampMillis: [TimestampMillis](#TimestampMillis=Long)) extends [Command](DurableProducerQueue$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStore the fact that a message has been confirmed to be delivered and processed.

Store the fact that a message has been confirmed to be delivered and processed.

This command may be retied and the implementation should be idempotent, i.e. deduplicate
already processed sequence numbers.
8. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSent.html "Permalink") final  case class [StoreMessageSent](DurableProducerQueue$$StoreMessageSent.html "Store the fact that a message is to be sent.")\[A](sent: [MessageSent](DurableProducerQueue$$MessageSent.html)\[A], replyTo: [ActorRef](../ActorRef.html)\[[StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html)]) extends [Command](DurableProducerQueue$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStore the fact that a message is to be sent.

Store the fact that a message is to be sent. Replies with [StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html) when
the message has been successfully been stored.

This command may be retied and the implementation should be idempotent, i.e. deduplicate
already processed sequence numbers.
9. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSentAck.html "Permalink") final  case class [StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html)(storedSeqNr: [SeqNr](#SeqNr=Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
10. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#TimestampMillis=Long "Permalink")  type TimestampMillis \= [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
### Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#NoQualifier:akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier "Permalink")  val NoQualifier: [ConfirmationQualifier](#ConfirmationQualifier=String)
5. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html "Permalink")  object [MessageSent](DurableProducerQueue$$MessageSent$.html)
21. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State$.html "Permalink")  object [State](DurableProducerQueue$$State$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$LoadState.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$State$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$State.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSent.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSentAck.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html)*