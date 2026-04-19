---
description: Akka 2.10.17 - akka.dispatch.UnboundedMailbox.MessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:38:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/UnboundedMailbox$$MessageQueue.html
title: Akka 2.10.17 - akka.dispatch.UnboundedMailbox.MessageQueue
---

# Akka 2.10.17 - akka.dispatch.UnboundedMailbox.MessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.UnboundedMailbox.MessageQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/UnboundedMailbox$.html "Permalink")  object [UnboundedMailbox](UnboundedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[dispatch](index.html)
- MessageQueue
c[akka](../index.html).[dispatch](index.html).[UnboundedMailbox](UnboundedMailbox$.html)

# MessageQueue[**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html "Permalink")

### 

#### class MessageQueue extends [ConcurrentLinkedQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html#java.util.concurrent.ConcurrentLinkedQueue)\[[Envelope](Envelope.html)] with [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L657)Linear Supertypes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html), [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html), [QueueBasedMessageQueue](QueueBasedMessageQueue.html), [MultipleConsumerSemantics](MultipleConsumerSemantics.html), [dispatch.MessageQueue](MessageQueue.html), [ConcurrentLinkedQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html#java.util.concurrent.ConcurrentLinkedQueue)\[[Envelope](Envelope.html)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[Envelope](Envelope.html)], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[[Envelope](Envelope.html)], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Envelope](Envelope.html)], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Envelope](Envelope.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageQueue
2. UnboundedQueueBasedMessageQueue
3. UnboundedMessageQueueSemantics
4. QueueBasedMessageQueue
5. MultipleConsumerSemantics
6. MessageQueue
7. ConcurrentLinkedQueue
8. Serializable
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

1. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#<init>():akka.dispatch.UnboundedMailbox.MessageQueue "Permalink")  new MessageQueue()
### Type Members

1. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#CLQSpliteratorextendsSpliterator[E] "Permalink") final  class CLQSpliterator extends [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[E]Attributesprivate\[concurrent] Definition ClassesConcurrentLinkedQueue
### Value Members

1. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toany2stringadd\[MessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractQueue → AbstractCollection → Collection
8. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink")  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [dispatch.MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
10. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesConcurrentLinkedQueue → AbstractQueue → AbstractCollection → Collection
11. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
13. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
14. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition Classes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
15. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#element():E "Permalink")  def element(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
16. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition Classes[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
17. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageQueueImplicitThis member is added by an implicit conversion from MessageQueue toEnsuring\[MessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#forEach(x$1:java.util.function.Consumer[_>:E]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesConcurrentLinkedQueue → Iterable
24. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
26. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
28. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[[Envelope](Envelope.html)]Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection → Iterable
30. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition Classes[QueueBasedMessageQueue](QueueBasedMessageQueue.html) → [MessageQueue](MessageQueue.html)
34. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#offer(x$1:E):Boolean "Permalink")  def offer(arg0: [Envelope](Envelope.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → Queue
35. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
36. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#peek():E "Permalink")  def peek(): [Envelope](Envelope.html)Definition ClassesConcurrentLinkedQueue → Queue
37. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#poll():E "Permalink")  def poll(): [Envelope](Envelope.html)Definition ClassesConcurrentLinkedQueue → Queue
38. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#queue:java.util.Queue[akka.dispatch.Envelope] "Permalink") final  def queue: [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[[Envelope](Envelope.html)]Definition ClassesMessageQueue → [QueueBasedMessageQueue](QueueBasedMessageQueue.html)
39. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
40. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#remove():E "Permalink")  def remove(): [Envelope](Envelope.html)Definition ClassesAbstractQueue → Queue
41. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
42. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: [Envelope](Envelope.html) \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → Collection
43. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
44. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
45. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[[Envelope](Envelope.html)]Definition ClassesConcurrentLinkedQueue → Collection → Iterable
46. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[[Envelope](Envelope.html)]Definition ClassesCollection
47. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
48. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
49. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesConcurrentLinkedQueue → AbstractCollection → Collection
50. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
51. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesConcurrentLinkedQueue → AbstractCollection → AnyRef → Any
52. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
54. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageQueue toStringFormat\[MessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/UnboundedMailbox$$MessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageQueue, B)ImplicitThis member is added by an implicit conversion from MessageQueue toArrowAssoc\[MessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)

### Inherited from [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)

### Inherited from [QueueBasedMessageQueue](QueueBasedMessageQueue.html)

### Inherited from [MultipleConsumerSemantics](MultipleConsumerSemantics.html)

### Inherited from [dispatch.MessageQueue](MessageQueue.html)

### Inherited from [ConcurrentLinkedQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html#java.util.concurrent.ConcurrentLinkedQueue)\[[Envelope](Envelope.html)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
- https://doc.akka.io/api/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/UnboundedMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/UnboundedMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/UnboundedMailbox$$MessageQueue.html](https://doc.akka.io/api/akka/current/akka/dispatch/UnboundedMailbox$$MessageQueue.html)*