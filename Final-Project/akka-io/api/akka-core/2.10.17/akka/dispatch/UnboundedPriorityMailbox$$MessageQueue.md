---
description: Akka 2.10.17 - akka.dispatch.UnboundedPriorityMailbox.MessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:07:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html
title: Akka 2.10.17 - akka.dispatch.UnboundedPriorityMailbox.MessageQueue
---

# Akka 2.10.17 - akka.dispatch.UnboundedPriorityMailbox.MessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.UnboundedPriorityMailbox.MessageQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/UnboundedPriorityMailbox$.html "Permalink")  object [UnboundedPriorityMailbox](UnboundedPriorityMailbox$.html)Definition Classes[dispatch](index.html)
- MessageQueue
c[akka](../index.html).[dispatch](index.html).[UnboundedPriorityMailbox](UnboundedPriorityMailbox$.html)

# MessageQueue[**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html "Permalink")

### 

#### class MessageQueue extends [PriorityBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html#java.util.concurrent.PriorityBlockingQueue)\[[Envelope](Envelope.html)] with [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L736)Linear Supertypes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html), [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html), [QueueBasedMessageQueue](QueueBasedMessageQueue.html), [MultipleConsumerSemantics](MultipleConsumerSemantics.html), [dispatch.MessageQueue](MessageQueue.html), [PriorityBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html#java.util.concurrent.PriorityBlockingQueue)\[[Envelope](Envelope.html)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[[Envelope](Envelope.html)], [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[Envelope](Envelope.html)], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[[Envelope](Envelope.html)], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Envelope](Envelope.html)], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Envelope](Envelope.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageQueue
2. UnboundedQueueBasedMessageQueue
3. UnboundedMessageQueueSemantics
4. QueueBasedMessageQueue
5. MultipleConsumerSemantics
6. MessageQueue
7. PriorityBlockingQueue
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

1. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#<init>(initialCapacity:Int,cmp:java.util.Comparator[akka.dispatch.Envelope]):akka.dispatch.UnboundedPriorityMailbox.MessageQueue "Permalink")  new MessageQueue(initialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[Envelope](Envelope.html)])
### Type Members

1. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#ItrextendsIterator[E] "Permalink") final  class Itr extends [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[E]Attributesprivate\[concurrent] Definition ClassesPriorityBlockingQueue
2. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#PBQSpliteratorextendsSpliterator[E] "Permalink") final  class PBQSpliterator extends [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[E]Attributesprivate\[concurrent] Definition ClassesPriorityBlockingQueue
### Value Members

1. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toany2stringadd\[MessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → BlockingQueue → AbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → AbstractCollection → Collection
8. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink")  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [dispatch.MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
10. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesPriorityBlockingQueue → AbstractQueue → AbstractCollection → Collection
11. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#comparator():java.util.Comparator[_>:E] "Permalink")  def comparator(): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesPriorityBlockingQueue
13. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → BlockingQueue → AbstractCollection → Collection
14. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
15. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition Classes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
16. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#drainTo(x$1:java.util.Collection[_>:E],x$2:Int):Int "Permalink")  def drainTo(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPriorityBlockingQueue → BlockingQueue
17. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#drainTo(x$1:java.util.Collection[_>:E]):Int "Permalink")  def drainTo(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPriorityBlockingQueue → BlockingQueue
18. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#element():E "Permalink")  def element(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
19. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition Classes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
20. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
26. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#forEach(x$1:java.util.function.Consumer[_>:E]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesPriorityBlockingQueue → Iterable
27. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
29. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
31. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
32. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[[Envelope](Envelope.html)]Definition ClassesPriorityBlockingQueue → AbstractCollection → Collection → Iterable
33. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
37. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#offer(x$1:E,x$2:Long,x$3:java.util.concurrent.TimeUnit):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html), arg1: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg2: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → BlockingQueue
38. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#offer(x$1:E):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → BlockingQueue → Queue
39. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
40. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#peek():E "Permalink")  def peek(): [Envelope](Envelope.html)Definition ClassesPriorityBlockingQueue → Queue
41. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#poll(x$1:Long,x$2:java.util.concurrent.TimeUnit):E "Permalink")  def poll(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Envelope](Envelope.html)Definition ClassesPriorityBlockingQueue → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#poll():E "Permalink")  def poll(): [Envelope](Envelope.html)Definition ClassesPriorityBlockingQueue → Queue
43. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#put(x$1:E):Unit "Permalink")  def put(arg0: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesPriorityBlockingQueue → BlockingQueue
44. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#queue:java.util.Queue[akka.dispatch.Envelope] "Permalink") final  def queue: [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)]Definition ClassesMessageQueue → [QueueBasedMessageQueue](QueueBasedMessageQueue.html)
45. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#remainingCapacity():Int "Permalink")  def remainingCapacity(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPriorityBlockingQueue → BlockingQueue
46. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → BlockingQueue → AbstractCollection → Collection
47. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#remove():E "Permalink")  def remove(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
48. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → AbstractCollection → Collection
49. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → Collection
50. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityBlockingQueue → AbstractCollection → Collection
51. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPriorityBlockingQueue → AbstractCollection → Collection
52. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[[Envelope](Envelope.html)]Definition ClassesPriorityBlockingQueue → Collection → Iterable
53. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
54. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
55. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#take():E "Permalink")  def take(): [Envelope](Envelope.html)Definition ClassesPriorityBlockingQueue → BlockingQueueAnnotations@throws(classOf\[java.lang.InterruptedException])
56. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesPriorityBlockingQueue → AbstractCollection → Collection
57. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesPriorityBlockingQueue → AbstractCollection → Collection
58. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
59. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesPriorityBlockingQueue → AbstractCollection → AnyRef → Any
60. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
61. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
62. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toStringFormat\[MessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)

### Inherited from [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)

### Inherited from [QueueBasedMessageQueue](QueueBasedMessageQueue.html)

### Inherited from [MultipleConsumerSemantics](MultipleConsumerSemantics.html)

### Inherited from [dispatch.MessageQueue](MessageQueue.html)

### Inherited from [PriorityBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html#java.util.concurrent.PriorityBlockingQueue)\[[Envelope](Envelope.html)]

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

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox$$MessageQueue.html)*