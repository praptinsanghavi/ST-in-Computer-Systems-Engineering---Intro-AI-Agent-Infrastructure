---
description: Akka 2.10.17 - akka.dispatch.BoundedDequeBasedMailbox.MessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:38:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html
title: Akka 2.10.17 - akka.dispatch.BoundedDequeBasedMailbox.MessageQueue
---

# Akka 2.10.17 - akka.dispatch.BoundedDequeBasedMailbox.MessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.BoundedDequeBasedMailbox.MessageQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/BoundedDequeBasedMailbox$.html "Permalink")  object [BoundedDequeBasedMailbox](BoundedDequeBasedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[dispatch](index.html)
- MessageQueue
c[akka](../index.html).[dispatch](index.html).[BoundedDequeBasedMailbox](BoundedDequeBasedMailbox$.html)

# MessageQueue[**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html "Permalink")

### 

#### class MessageQueue extends [LinkedBlockingDeque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingDeque.html#java.util.concurrent.LinkedBlockingDeque)\[[Envelope](Envelope.html)] with [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L858)Linear Supertypes[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html), [BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html), [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html), [DequeBasedMessageQueue](DequeBasedMessageQueue.html), [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html), [QueueBasedMessageQueue](QueueBasedMessageQueue.html), [MultipleConsumerSemantics](MultipleConsumerSemantics.html), [dispatch.MessageQueue](MessageQueue.html), [LinkedBlockingDeque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingDeque.html#java.util.concurrent.LinkedBlockingDeque)\[[Envelope](Envelope.html)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [BlockingDeque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingDeque.html#java.util.concurrent.BlockingDeque)\[[Envelope](Envelope.html)], [Deque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html#java.util.Deque)\[[Envelope](Envelope.html)], [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[[Envelope](Envelope.html)], [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[Envelope](Envelope.html)], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[[Envelope](Envelope.html)], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Envelope](Envelope.html)], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Envelope](Envelope.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageQueue
2. BoundedDequeBasedMessageQueue
3. BoundedDequeBasedMessageQueueSemantics
4. BoundedMessageQueueSemantics
5. DequeBasedMessageQueue
6. DequeBasedMessageQueueSemantics
7. QueueBasedMessageQueue
8. MultipleConsumerSemantics
9. MessageQueue
10. LinkedBlockingDeque
11. Serializable
12. BlockingDeque
13. Deque
14. BlockingQueue
15. AbstractQueue
16. Queue
17. AbstractCollection
18. Collection
19. Iterable
20. AnyRef
21. Any
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

1. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#<init>(capacity:Int,pushTimeOut:scala.concurrent.duration.FiniteDuration):akka.dispatch.BoundedDequeBasedMailbox.MessageQueue "Permalink")  new MessageQueue(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))
### Value Members

1. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toany2stringadd\[MessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → BlockingQueue → AbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → Deque → AbstractQueue → AbstractCollection → Collection
8. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#addFirst(x$1:E):Unit "Permalink")  def addFirst(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
9. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#addLast(x$1:E):Unit "Permalink")  def addLast(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
10. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink")  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [dispatch.MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
12. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → AbstractQueue → AbstractCollection → Collection
13. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → BlockingQueue → AbstractCollection → Collection
15. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
16. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition Classes[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
17. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#descendingIterator():java.util.Iterator[E] "Permalink")  def descendingIterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[[Envelope](Envelope.html)]Definition ClassesLinkedBlockingDeque → Deque
18. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#drainTo(x$1:java.util.Collection[_>:E],x$2:Int):Int "Permalink")  def drainTo(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingDeque → BlockingQueue
19. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#drainTo(x$1:java.util.Collection[_>:E]):Int "Permalink")  def drainTo(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingDeque → BlockingQueue
20. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#element():E "Permalink")  def element(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → AbstractQueue → Queue
21. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition Classes[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
22. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#enqueueFirst(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueueFirst(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html) → [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html)
23. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
27. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
29. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#forEach(x$1:java.util.function.Consumer[_>:E]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → Iterable
30. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#getFirst():E "Permalink")  def getFirst(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
32. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#getLast():E "Permalink")  def getLast(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
33. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
34. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
36. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
37. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[[Envelope](Envelope.html)]Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → AbstractCollection → Collection → Iterable
38. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
39. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
41. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
42. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#offer(x$1:E,x$2:Long,x$3:java.util.concurrent.TimeUnit):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html), arg1: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg2: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#offer(x$1:E):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → BlockingQueue → Queue
44. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#offerFirst(x$1:E,x$2:Long,x$3:java.util.concurrent.TimeUnit):Boolean "Permalink")  def offerFirst(arg0: [Envelope](Envelope.html), arg1: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg2: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#offerFirst(x$1:E):Boolean "Permalink")  def offerFirst(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
46. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#offerLast(x$1:E,x$2:Long,x$3:java.util.concurrent.TimeUnit):Boolean "Permalink")  def offerLast(arg0: [Envelope](Envelope.html), arg1: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg2: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
47. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#offerLast(x$1:E):Boolean "Permalink")  def offerLast(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
48. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
49. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#peek():E "Permalink")  def peek(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → Queue
50. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#peekFirst():E "Permalink")  def peekFirst(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
51. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#peekLast():E "Permalink")  def peekLast(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
52. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#poll(x$1:Long,x$2:java.util.concurrent.TimeUnit):E "Permalink")  def poll(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDeque → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#poll():E "Permalink")  def poll(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → Queue
54. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#pollFirst(x$1:Long,x$2:java.util.concurrent.TimeUnit):E "Permalink")  def pollFirst(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
55. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#pollFirst():E "Permalink")  def pollFirst(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
56. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#pollLast(x$1:Long,x$2:java.util.concurrent.TimeUnit):E "Permalink")  def pollLast(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#pollLast():E "Permalink")  def pollLast(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
58. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#pop():E "Permalink")  def pop(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
59. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#push(x$1:E):Unit "Permalink")  def push(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
60. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#pushTimeOut:scala.concurrent.duration.FiniteDuration "Permalink")  val pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition ClassesMessageQueue → [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html) → [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html)
61. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#put(x$1:E):Unit "Permalink")  def put(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → BlockingDeque → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
62. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#putFirst(x$1:E):Unit "Permalink")  def putFirst(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
63. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#putLast(x$1:E):Unit "Permalink")  def putLast(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
64. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#queue:akka.dispatch.BoundedDequeBasedMailbox.MessageQueue "Permalink") final  val queue: MessageQueueDefinition ClassesMessageQueue → [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html) → [DequeBasedMessageQueue](DequeBasedMessageQueue.html) → [QueueBasedMessageQueue](QueueBasedMessageQueue.html)
65. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#remainingCapacity():Int "Permalink")  def remainingCapacity(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingDeque → BlockingQueue
66. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → BlockingQueue → AbstractCollection → Collection
67. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#remove():E "Permalink")  def remove(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → AbstractQueue → Queue
68. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → AbstractCollection → Collection
69. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#removeFirst():E "Permalink")  def removeFirst(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
70. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#removeFirstOccurrence(x$1:Object):Boolean "Permalink")  def removeFirstOccurrence(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
71. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → Collection
72. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#removeLast():E "Permalink")  def removeLast(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → Deque
73. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#removeLastOccurrence(x$1:Object):Boolean "Permalink")  def removeLastOccurrence(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque
74. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinkedBlockingDeque → AbstractCollection → Collection
75. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinkedBlockingDeque → BlockingDeque → Deque → AbstractCollection → Collection
76. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[[Envelope](Envelope.html)]Definition ClassesLinkedBlockingDeque → Collection → Iterable
77. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
78. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
79. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#take():E "Permalink")  def take(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDeque → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
80. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#takeFirst():E "Permalink")  def takeFirst(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
81. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#takeLast():E "Permalink")  def takeLast(): [Envelope](Envelope.html)Definition ClassesLinkedBlockingDeque → BlockingDequeAnnotations@throws(classOf\[java.lang.InterruptedException])
82. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesLinkedBlockingDeque → AbstractCollection → Collection
83. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesLinkedBlockingDeque → AbstractCollection → Collection
84. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
85. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesLinkedBlockingDeque → AbstractCollection → AnyRef → Any
86. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
87. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
88. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toStringFormat\[MessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html)

### Inherited from [BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html)

### Inherited from [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html)

### Inherited from [DequeBasedMessageQueue](DequeBasedMessageQueue.html)

### Inherited from [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html)

### Inherited from [QueueBasedMessageQueue](QueueBasedMessageQueue.html)

### Inherited from [MultipleConsumerSemantics](MultipleConsumerSemantics.html)

### Inherited from [dispatch.MessageQueue](MessageQueue.html)

### Inherited from [LinkedBlockingDeque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingDeque.html#java.util.concurrent.LinkedBlockingDeque)\[[Envelope](Envelope.html)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [BlockingDeque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingDeque.html#java.util.concurrent.BlockingDeque)\[[Envelope](Envelope.html)]

### Inherited from [Deque](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html#java.util.Deque)\[[Envelope](Envelope.html)]

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

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html](https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html)*