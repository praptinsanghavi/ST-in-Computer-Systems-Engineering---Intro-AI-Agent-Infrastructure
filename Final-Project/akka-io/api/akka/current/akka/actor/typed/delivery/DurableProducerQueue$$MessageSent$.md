---
description: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.MessageSent
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:46:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.MessageSent
---

# Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.MessageSent

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.MessageSent

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html "Permalink")  object [DurableProducerQueue](DurableProducerQueue$.html "Actor message protocol for storing and confirming reliable delivery of messages.")Actor message protocol for storing and confirming reliable delivery of messages.

Actor message protocol for storing and confirming reliable delivery of messages. A [akka.actor.typed.Behavior](../Behavior.html)
implementation of this protocol can optionally be used with [ProducerController](ProducerController$.html) when messages shall survive
a crash of the producer side.

An implementation of this exists in `akka.persistence.typed.delivery.EventSourcedProducerQueue`.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [Command](DurableProducerQueue$$Command.html)
- [LoadState](DurableProducerQueue$$LoadState.html "Request that is used at startup to retrieve the unconfirmed messages and current sequence number.")
- [MessageSent](DurableProducerQueue$$MessageSent.html "The fact (event) that a message has been sent.")
- [State](DurableProducerQueue$$State.html)
- [StoreMessageConfirmed](DurableProducerQueue$$StoreMessageConfirmed.html "Store the fact that a message has been confirmed to be delivered and processed.")
- [StoreMessageSent](DurableProducerQueue$$StoreMessageSent.html "Store the fact that a message is to be sent.")
- [StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html)
[o](DurableProducerQueue$$MessageSent.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[DurableProducerQueue](DurableProducerQueue$.html)

# [MessageSent](DurableProducerQueue$$MessageSent.html "See companion class")[**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html "Permalink")

### Companion [class MessageSent](DurableProducerQueue$$MessageSent.html "See companion class")

#### object MessageSent

Source[DurableProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/DurableProducerQueue.scala#L179)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageSent
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#MessageOrChunk=Any "Permalink")  type MessageOrChunk \= [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)SequencedMessage.message can be `A` or `ChunkedMessage`.
### Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#apply[A](seqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr,message:A,ack:Boolean,confirmationQualifier:akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier,timestampMillis:akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis):akka.actor.typed.delivery.DurableProducerQueue.MessageSent[A] "Permalink")  def apply\[A](seqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), message: A, ack: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), confirmationQualifier: [ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), timestampMillis: [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long)): [MessageSent](DurableProducerQueue$$MessageSent.html)\[A]
5. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#unapply(sent:akka.actor.typed.delivery.DurableProducerQueue.MessageSent[_]):Option[(akka.actor.typed.delivery.DurableProducerQueue.SeqNr,akka.actor.typed.delivery.DurableProducerQueue.MessageSent.MessageOrChunk,Boolean,akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier,akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis)] "Permalink")  def unapply(sent: [MessageSent](DurableProducerQueue$$MessageSent.html)\[\_]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([SeqNr](DurableProducerQueue$.html#SeqNr=Long), [MessageOrChunk](#MessageOrChunk=Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), [ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long))]
18. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
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
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html)*