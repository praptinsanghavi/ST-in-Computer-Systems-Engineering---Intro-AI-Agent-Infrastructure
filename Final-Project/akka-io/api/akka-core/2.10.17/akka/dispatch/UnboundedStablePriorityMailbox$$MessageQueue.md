---
description: Akka 2.10.17 - akka.dispatch.UnboundedStablePriorityMailbox.MessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:07:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html
title: Akka 2.10.17 - akka.dispatch.UnboundedStablePriorityMailbox.MessageQueue
---

# Akka 2.10.17 - akka.dispatch.UnboundedStablePriorityMailbox.MessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.UnboundedStablePriorityMailbox.MessageQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/UnboundedStablePriorityMailbox$.html "Permalink")  object [UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox$.html)Definition Classes[dispatch](index.html)
- MessageQueue
c[akka](../index.html).[dispatch](index.html).[UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox$.html)

# MessageQueue[**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html "Permalink")

### 

#### class MessageQueue extends [StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html)\[[Envelope](Envelope.html)] with [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L784)Linear Supertypes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html), [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html), [QueueBasedMessageQueue](QueueBasedMessageQueue.html), [MultipleConsumerSemantics](MultipleConsumerSemantics.html), [dispatch.MessageQueue](MessageQueue.html), [StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html)\[[Envelope](Envelope.html)], [PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html)\[[Envelope](Envelope.html)], [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[Envelope](Envelope.html)], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[[Envelope](Envelope.html)], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Envelope](Envelope.html)], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Envelope](Envelope.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageQueue
2. UnboundedQueueBasedMessageQueue
3. UnboundedMessageQueueSemantics
4. QueueBasedMessageQueue
5. MultipleConsumerSemantics
6. MessageQueue
7. StablePriorityBlockingQueue
8. PriorityQueueStabilizer
9. AbstractQueue
10. Queue
11. AbstractCollection
12. Collection
13. Iterable
14. AnyRef
15. Any
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

1. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#<init>(initialCapacity:Int,cmp:java.util.Comparator[akka.dispatch.Envelope]):akka.dispatch.UnboundedStablePriorityMailbox.MessageQueue "Permalink")  new MessageQueue(initialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[Envelope](Envelope.html)])
### Value Members

1. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toany2stringadd\[MessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → AbstractCollection → Collection
8. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#backingQueue:java.util.concurrent.PriorityBlockingQueue[akka.util.PriorityQueueStabilizer.WrappedElement[E]] "Permalink")  val backingQueue: [PriorityBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html#java.util.concurrent.PriorityBlockingQueue)\[[WrappedElement](../util/PriorityQueueStabilizer$$WrappedElement.html)\[[Envelope](Envelope.html)]]Definition Classes[StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html) → [PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html)
10. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink")  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [dispatch.MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
11. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAbstractQueue → AbstractCollection → Collection
12. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
14. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
15. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition Classes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
16. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#element():E "Permalink")  def element(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
17. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition Classes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
18. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#forEach(x$1:java.util.function.Consumer[_>:T]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterable
25. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
27. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
29. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[[Envelope](Envelope.html)]Definition Classes[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html) → AbstractCollection → Collection → Iterable
31. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
35. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#offer(e:E):Boolean "Permalink")  def offer(e: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html) → Queue
36. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
37. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#peek():E "Permalink")  def peek(): [Envelope](Envelope.html)Definition Classes[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html) → Queue
38. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#poll():E "Permalink")  def poll(): [Envelope](Envelope.html)Definition Classes[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html) → Queue
39. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#queue:java.util.Queue[akka.dispatch.Envelope] "Permalink") final  def queue: [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)]Definition ClassesMessageQueue → [QueueBasedMessageQueue](QueueBasedMessageQueue.html)
40. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#remove():E "Permalink")  def remove(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
41. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
42. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
43. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCollection
44. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
45. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#seqNum:java.util.concurrent.atomic.AtomicLong "Permalink")  val seqNum: [AtomicLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicLong.html#java.util.concurrent.atomic.AtomicLong)Definition Classes[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html)
46. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html) → AbstractCollection → Collection
47. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[[Envelope](Envelope.html)]Definition ClassesCollection → Iterable
48. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
49. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
50. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesAbstractCollection → Collection
51. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAbstractCollection → Collection
52. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
53. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAbstractCollection → AnyRef → Any
54. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
55. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
56. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toStringFormat\[MessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)

### Inherited from [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)

### Inherited from [QueueBasedMessageQueue](QueueBasedMessageQueue.html)

### Inherited from [MultipleConsumerSemantics](MultipleConsumerSemantics.html)

### Inherited from [dispatch.MessageQueue](MessageQueue.html)

### Inherited from [StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html)\[[Envelope](Envelope.html)]

### Inherited from [PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html)\[[Envelope](Envelope.html)]

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

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedStablePriorityMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/PriorityQueueStabilizer$$WrappedElement.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html)*