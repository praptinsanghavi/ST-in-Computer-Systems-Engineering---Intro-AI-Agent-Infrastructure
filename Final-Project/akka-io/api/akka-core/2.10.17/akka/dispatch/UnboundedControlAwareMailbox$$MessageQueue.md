---
description: Akka 2.10.17 - akka.dispatch.UnboundedControlAwareMailbox.MessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:07:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html
title: Akka 2.10.17 - akka.dispatch.UnboundedControlAwareMailbox.MessageQueue
---

# Akka 2.10.17 - akka.dispatch.UnboundedControlAwareMailbox.MessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.UnboundedControlAwareMailbox.MessageQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/UnboundedControlAwareMailbox$.html "Permalink")  object [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[dispatch](index.html)
- MessageQueue
c[akka](../index.html).[dispatch](index.html).[UnboundedControlAwareMailbox](UnboundedControlAwareMailbox$.html)

# MessageQueue[**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html "Permalink")

### 

#### class MessageQueue extends [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html) with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L918)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html), [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html), [QueueBasedMessageQueue](QueueBasedMessageQueue.html), [MultipleConsumerSemantics](MultipleConsumerSemantics.html), [dispatch.MessageQueue](MessageQueue.html), [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageQueue
2. Serializable
3. UnboundedControlAwareMessageQueueSemantics
4. ControlAwareMessageQueueSemantics
5. QueueBasedMessageQueue
6. MultipleConsumerSemantics
7. MessageQueue
8. UnboundedMessageQueueSemantics
9. AnyRef
10. Any
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

1. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#<init>():akka.dispatch.UnboundedControlAwareMailbox.MessageQueue "Permalink")  new MessageQueue()
### Value Members

1. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toany2stringadd\[MessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink")  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [dispatch.MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
8. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#controlQueue:java.util.Queue[akka.dispatch.Envelope] "Permalink")  val controlQueue: [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)]Definition ClassesMessageQueue → [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html)
10. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition Classes[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html) → [MessageQueue](MessageQueue.html)
11. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition Classes[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html) → [MessageQueue](MessageQueue.html)
12. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition Classes[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html) → [QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
20. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition Classes[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html) → [QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
26. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#queue:java.util.Queue[akka.dispatch.Envelope] "Permalink")  val queue: [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)]Definition ClassesMessageQueue → [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html) → [QueueBasedMessageQueue](QueueBasedMessageQueue.html)
27. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toStringFormat\[MessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html)

### Inherited from [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html)

### Inherited from [QueueBasedMessageQueue](QueueBasedMessageQueue.html)

### Inherited from [MultipleConsumerSemantics](MultipleConsumerSemantics.html)

### Inherited from [dispatch.MessageQueue](MessageQueue.html)

### Inherited from [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMessageQueue to any2stringadd\[MessageQueue]

### Inherited by implicit conversion StringFormat fromMessageQueue to StringFormat\[MessageQueue]

### Inherited by implicit conversion Ensuring fromMessageQueue to Ensuring\[MessageQueue]

### Inherited by implicit conversion ArrowAssoc fromMessageQueue to ArrowAssoc\[MessageQueue]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedControlAwareMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedControlAwareMailbox$$MessageQueue.html)*