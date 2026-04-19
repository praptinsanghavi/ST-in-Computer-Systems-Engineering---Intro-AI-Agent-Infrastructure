---
description: Akka 2.10.17 - akka.dispatch.BoundedMailbox.MessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/BoundedMailbox$$MessageQueue.html
title: Akka 2.10.17 - akka.dispatch.BoundedMailbox.MessageQueue
---

# Akka 2.10.17 - akka.dispatch.BoundedMailbox.MessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.BoundedMailbox.MessageQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/BoundedMailbox$.html "Permalink")  object [BoundedMailbox](BoundedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[dispatch](index.html)
- MessageQueue
c[akka](../index.html).[dispatch](index.html).[BoundedMailbox](BoundedMailbox$.html)

# MessageQueue[**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html "Permalink")

### 

#### class MessageQueue extends [LinkedBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingQueue.html#java.util.concurrent.LinkedBlockingQueue)\[[Envelope](Envelope.html)] with [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L716)Linear Supertypes[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html), [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html), [QueueBasedMessageQueue](QueueBasedMessageQueue.html), [MultipleConsumerSemantics](MultipleConsumerSemantics.html), [dispatch.MessageQueue](MessageQueue.html), [LinkedBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingQueue.html#java.util.concurrent.LinkedBlockingQueue)\[[Envelope](Envelope.html)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[[Envelope](Envelope.html)], [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[Envelope](Envelope.html)], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[[Envelope](Envelope.html)], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Envelope](Envelope.html)], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Envelope](Envelope.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageQueue
2. BoundedQueueBasedMessageQueue
3. BoundedMessageQueueSemantics
4. QueueBasedMessageQueue
5. MultipleConsumerSemantics
6. MessageQueue
7. LinkedBlockingQueue
8. Serializable
9. BlockingQueue
10. AbstractQueue
11. Queue
12. AbstractCollection
13. Collection
14. Iterable
15. AnyRef
16. Any
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

1. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#<init>(capacity:Int,pushTimeOut:scala.concurrent.duration.FiniteDuration):akka.dispatch.BoundedMailbox.MessageQueue "Permalink")  new MessageQueue(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))
### Value Members

1. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toany2stringadd\[MessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → AbstractCollection → Collection
8. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink")  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [dispatch.MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
10. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingQueue → AbstractQueue → AbstractCollection → Collection
11. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → BlockingQueue → AbstractCollection → Collection
13. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
14. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition Classes[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
15. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#drainTo(x$1:java.util.Collection[_>:E],x$2:Int):Int "Permalink")  def drainTo(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingQueue → BlockingQueue
16. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#drainTo(x$1:java.util.Collection[_>:E]):Int "Permalink")  def drainTo(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingQueue → BlockingQueue
17. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#element():E "Permalink")  def element(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
18. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition Classes[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
19. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
25. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#forEach(x$1:java.util.function.Consumer[_>:E]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingQueue → Iterable
26. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
28. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
30. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[[Envelope](Envelope.html)]Definition ClassesLinkedBlockingQueue → AbstractCollection → Collection → Iterable
32. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
36. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#offer(x$1:E):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → BlockingQueue → Queue
37. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#offer(x$1:E,x$2:Long,x$3:java.util.concurrent.TimeUnit):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html), arg1: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg2: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
39. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#peek():E "Permalink")  def peek(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingQueue → Queue
40. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#poll():E "Permalink")  def poll(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingQueue → Queue
41. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#poll(x$1:Long,x$2:java.util.concurrent.TimeUnit):E "Permalink")  def poll(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Envelope](Envelope.html)Definition ClassesLinkedBlockingQueue → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#pushTimeOut:scala.concurrent.duration.FiniteDuration "Permalink") final  val pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition ClassesMessageQueue → [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html)
43. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#put(x$1:E):Unit "Permalink")  def put(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingQueue → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#queue:java.util.concurrent.BlockingQueue[akka.dispatch.Envelope] "Permalink") final  def queue: [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[[Envelope](Envelope.html)]Definition ClassesMessageQueue → [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html) → [QueueBasedMessageQueue](QueueBasedMessageQueue.html)
45. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#remainingCapacity():Int "Permalink")  def remainingCapacity(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingQueue → BlockingQueue
46. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → BlockingQueue → AbstractCollection → Collection
47. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#remove():E "Permalink")  def remove(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
48. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → AbstractCollection → Collection
49. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → Collection
50. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingQueue → AbstractCollection → Collection
51. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingQueue → AbstractCollection → Collection
52. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[[Envelope](Envelope.html)]Definition ClassesLinkedBlockingQueue → Collection → Iterable
53. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
54. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
55. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#take():E "Permalink")  def take(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingQueue → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
56. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesLinkedBlockingQueue → AbstractCollection → Collection
57. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesLinkedBlockingQueue → AbstractCollection → Collection
58. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
59. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesLinkedBlockingQueue → AbstractCollection → AnyRef → Any
60. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
61. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
62. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toStringFormat\[MessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/BoundedMailbox$$MessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html)

### Inherited from [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html)

### Inherited from [QueueBasedMessageQueue](QueueBasedMessageQueue.html)

### Inherited from [MultipleConsumerSemantics](MultipleConsumerSemantics.html)

### Inherited from [dispatch.MessageQueue](MessageQueue.html)

### Inherited from [LinkedBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingQueue.html#java.util.concurrent.LinkedBlockingQueue)\[[Envelope](Envelope.html)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[[Envelope](Envelope.html)]

### Inherited from [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[Envelope](Envelope.html)]

### Inherited from [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)]

### Inherited from [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[[Envelope](Envelope.html)]

### Inherited from [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Envelope](Envelope.html)]

### Inherited from [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Envelope](Envelope.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMessageQueue to any2stringadd\[MessageQueue]

### Inherited by implicit conversion StringFormat fromMessageQueue to StringFormat\[MessageQueue]

### Inherited by implicit conversion Ensuring fromMessageQueue to Ensuring\[MessageQueue]

### Inherited by implicit conversion ArrowAssoc fromMessageQueue to ArrowAssoc\[MessageQueue]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox$$MessageQueue.html](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox$$MessageQueue.html)*