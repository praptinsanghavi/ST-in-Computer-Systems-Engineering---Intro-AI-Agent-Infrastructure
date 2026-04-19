---
description: Akka 2.10.17 - akka.actor.typed.eventstream.EventStream
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:51:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/eventstream/EventStream$.html
title: Akka 2.10.17 - akka.actor.typed.eventstream.EventStream
---

# Akka 2.10.17 - akka.actor.typed.eventstream.EventStream

> **Summary:** Akka 2.10.17 - akka.actor.typed.eventstream.EventStream

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](index.html)Definition Classes[typed](../index.html)
- EventStream
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[eventstream](index.html)

# EventStream[**](../../../../akka/actor/typed/eventstream/EventStream$.html "Permalink")

### 

#### object EventStream

Source[EventStream.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/eventstream/EventStream.scala#L13)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventStream
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/eventstream/EventStream$$Command.html "Permalink") sealed  trait [Command](EventStream$$Command.html "The set of commands accepted by the akka.actor.typed.ActorSystem.eventStream.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The set of commands accepted by the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).

The set of commands accepted by the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).

Not for user Extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/actor/typed/eventstream/EventStream$$Publish.html "Permalink") final  case class [Publish](EventStream$$Publish.html "Publish an event of type E by sending this command to the akka.actor.typed.ActorSystem.eventStream.")\[E](event: E) extends [Command](EventStream$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializablePublish an event of type E by sending this command to
the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).
3. [**](../../../../akka/actor/typed/eventstream/EventStream$$Subscribe.html "Permalink") final  case class [Subscribe](EventStream$$Subscribe.html "Subscribe a typed actor to listen for types and subtypes of E by sending this command to the akka.actor.typed.ActorSystem.eventStream.")\[E](subscriber: [ActorRef](../ActorRef.html)\[E])(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]) extends [Command](EventStream$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSubscribe a typed actor to listen for types and subtypes of E
by sending this command to the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).

Subscribe a typed actor to listen for types and subtypes of E
by sending this command to the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).
The same actor can create multiple subscriptions for different types.

#### Simple example

```
sealed trait A
case object A1 extends A
//listen for all As
def subscribe(actorSystem: ActorSystem[_], actorRef: ActorRef[A]) =
  actorSystem.eventStream ! EventStream.Subscribe(actorRef)
//listen for A1s only
def subscribe(actorSystem: ActorSystem[_], actorRef: ActorRef[A]) =
  actorSystem.eventStream ! EventStream.Subscribe[A1](actorRef)
```
4. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html "Permalink") final  case class [Unsubscribe](EventStream$$Unsubscribe.html "Unsubscribe all subscriptions created by this actor from the event stream by sending this command to the akka.actor.typed.ActorSystem.eventStream.")\[E](subscriber: [ActorRef](../ActorRef.html)\[E]) extends [Command](EventStream$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnsubscribe all subscriptions created by this actor from the event stream
by sending this command to the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).
### Value Members

1. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/eventstream/EventStream$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/eventstream/EventStream$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$$Publish.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$$Subscribe.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$$Unsubscribe.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$.html)*