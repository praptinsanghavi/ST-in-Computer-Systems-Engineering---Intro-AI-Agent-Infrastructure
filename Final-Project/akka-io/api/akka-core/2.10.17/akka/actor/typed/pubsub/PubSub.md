---
description: Akka 2.10.17 - akka.actor.typed.pubsub.PubSub
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:51:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/PubSub.html
title: Akka 2.10.17 - akka.actor.typed.pubsub.PubSub
---

# Akka 2.10.17 - akka.actor.typed.pubsub.PubSub

> **Summary:** Akka 2.10.17 - akka.actor.typed.pubsub.PubSub

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[typed](../index.html)
- PubSub
- [Topic](Topic$.html "A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.")
[c](PubSub$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[pubsub](index.html)

# [PubSub](PubSub$.html "See companion object")[**](../../../../akka/actor/typed/pubsub/PubSub.html "Permalink")

### Companion [object PubSub](PubSub$.html "See companion object")

#### final  class PubSub extends [Extension](../Extension.html)

Source[PubSub.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/pubsub/PubSub.scala#L51)Linear Supertypes[Extension](../Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PubSub
2. Extension
3. AnyRef
4. Any
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

1. [**](../../../../akka/actor/typed/pubsub/PubSub.html#<init>(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.pubsub.PubSub "Permalink")  new PubSub(system: [ActorSystem](../ActorSystem.html)\[\_])
### Value Members

1. [**](../../../../akka/actor/typed/pubsub/PubSub.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/pubsub/PubSub.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/pubsub/PubSub.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PubSub toany2stringadd\[PubSub] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/pubsub/PubSub.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PubSub, B)ImplicitThis member is added by an implicit conversion from PubSub toArrowAssoc\[PubSub] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/pubsub/PubSub.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/pubsub/PubSub.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/pubsub/PubSub.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/pubsub/PubSub.html#currentTopics:Set[String] "Permalink")  def currentTopics: Set\[String]Scala API: return the current set of running topics
9. [**](../../../../akka/actor/typed/pubsub/PubSub.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PubSub) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PubSubImplicitThis member is added by an implicit conversion from PubSub toEnsuring\[PubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/pubsub/PubSub.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PubSub) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PubSubImplicitThis member is added by an implicit conversion from PubSub toEnsuring\[PubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/pubsub/PubSub.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PubSubImplicitThis member is added by an implicit conversion from PubSub toEnsuring\[PubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/pubsub/PubSub.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PubSubImplicitThis member is added by an implicit conversion from PubSub toEnsuring\[PubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/pubsub/PubSub.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/pubsub/PubSub.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/actor/typed/pubsub/PubSub.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/pubsub/PubSub.html#getCurrentTopics():java.util.Set[String] "Permalink")  def getCurrentTopics(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: return the current set of running topics
17. [**](../../../../akka/actor/typed/pubsub/PubSub.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/pubsub/PubSub.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/actor/typed/pubsub/PubSub.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/actor/typed/pubsub/PubSub.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/pubsub/PubSub.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/actor/typed/pubsub/PubSub.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/actor/typed/pubsub/PubSub.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/actor/typed/pubsub/PubSub.html#topic[T](messageClass:Class[T],name:String,ttl:java.time.Duration):akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def topic\[T](messageClass: Class\[T], name: String, ttl: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [ActorRef](../ActorRef.html)\[[Command](Topic$$Command.html)\[T]]Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.

Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.

Note that [Topic](Topic$.html) actors manually started will not be part of this registry.

Tthe type of messages the topic accepts for publishing and subscribing

ttlIf the topic is idle this long, shut the actor down. All calls to `topic` for the same topic name should
 use the same ttl.
25. [**](../../../../akka/actor/typed/pubsub/PubSub.html#topic[T](messageClass:Class[T],name:String):akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def topic\[T](messageClass: Class\[T], name: String): [ActorRef](../ActorRef.html)\[[Command](Topic$$Command.html)\[T]]Java API: Spawn an actor with the given topic name or share an existing one if it is already running.

Java API: Spawn an actor with the given topic name or share an existing one if it is already running.

Note that [Topic](Topic$.html) actors manually started will not be part of this registry.

messageClassthe type of messages the topic accepts for publishing and subscribing
26. [**](../../../../akka/actor/typed/pubsub/PubSub.html#topic[T](name:String,ttl:scala.concurrent.duration.FiniteDuration)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def topic\[T](name: String, ttl: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [ActorRef](../ActorRef.html)\[[Command](Topic$$Command.html)\[T]]Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.

Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.

Note that [Topic](Topic$.html) actors manually started will not be part of this registry.

Tthe type of messages the topic accepts for publishing and subscribing

ttlIf the topic is idle this long, shut the actor down. All calls to `topic` for the same topic name should
 use the same ttl.
27. [**](../../../../akka/actor/typed/pubsub/PubSub.html#topic[T](name:String)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def topic\[T](name: String)(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [ActorRef](../ActorRef.html)\[[Command](Topic$$Command.html)\[T]]Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.

Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.

Note that [Topic](Topic$.html) actors manually started will not be part of this registry.

Tthe type of messages the topic accepts for publishing and subscribing
28. [**](../../../../akka/actor/typed/pubsub/PubSub.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/actor/typed/pubsub/PubSub.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/actor/typed/pubsub/PubSub.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/pubsub/PubSub.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/pubsub/PubSub.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PubSub toStringFormat\[PubSub] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/pubsub/PubSub.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PubSub, B)ImplicitThis member is added by an implicit conversion from PubSub toArrowAssoc\[PubSub] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPubSub to any2stringadd\[PubSub]

### Inherited by implicit conversion StringFormat fromPubSub to StringFormat\[PubSub]

### Inherited by implicit conversion Ensuring fromPubSub to Ensuring\[PubSub]

### Inherited by implicit conversion ArrowAssoc fromPubSub to ArrowAssoc\[PubSub]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/Topic$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html)*