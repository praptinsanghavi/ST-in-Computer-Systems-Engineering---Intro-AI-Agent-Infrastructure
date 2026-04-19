---
description: Akka 2.10.17 - akka.actor.typed.eventstream.EventStream.Unsubscribe
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:46:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/eventstream/EventStream$$Unsubscribe.html
title: Akka 2.10.17 - akka.actor.typed.eventstream.EventStream.Unsubscribe
---

# Akka 2.10.17 - akka.actor.typed.eventstream.EventStream.Unsubscribe

> **Summary:** Akka 2.10.17 - akka.actor.typed.eventstream.EventStream.Unsubscribe

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/eventstream/EventStream$.html "Permalink")  object [EventStream](EventStream$.html)Definition Classes[eventstream](index.html)
- [Command](EventStream$$Command.html "The set of commands accepted by the akka.actor.typed.ActorSystem.eventStream.")
- [Publish](EventStream$$Publish.html "Publish an event of type E by sending this command to the akka.actor.typed.ActorSystem.eventStream.")
- [Subscribe](EventStream$$Subscribe.html "Subscribe a typed actor to listen for types and subtypes of E by sending this command to the akka.actor.typed.ActorSystem.eventStream.")
- Unsubscribe
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[eventstream](index.html).[EventStream](EventStream$.html)

# Unsubscribe[**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html "Permalink")

### 

#### final  case class Unsubscribe\[E](subscriber: [ActorRef](../ActorRef.html)\[E]) extends [Command](EventStream$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Unsubscribe all subscriptions created by this actor from the event stream
by sending this command to the [akka.actor.typed.ActorSystem.eventStream](../ActorSystem.html#eventStream:akka.actor.typed.ActorRef[akka.actor.typed.eventstream.EventStream.Command]).

Source[EventStream.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/eventstream/EventStream.scala#L66)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](EventStream$$Command.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unsubscribe
2. Serializable
3. Product
4. Equals
5. Command
6. AnyRef
7. Any
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

1. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#<init>(subscriber:akka.actor.typed.ActorRef[E]):akka.actor.typed.eventstream.EventStream.Unsubscribe[E] "Permalink")  new Unsubscribe(subscriber: [ActorRef](../ActorRef.html)\[E])
### Value Members

1. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toany2stringadd\[Unsubscribe\[E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Unsubscribe\[E], B)ImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toArrowAssoc\[Unsubscribe\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Unsubscribe\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Unsubscribe\[E]ImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toEnsuring\[Unsubscribe\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Unsubscribe\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Unsubscribe\[E]ImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toEnsuring\[Unsubscribe\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Unsubscribe\[E]ImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toEnsuring\[Unsubscribe\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Unsubscribe\[E]ImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toEnsuring\[Unsubscribe\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#subscriber:akka.actor.typed.ActorRef[E] "Permalink")  val subscriber: [ActorRef](../ActorRef.html)\[E]
20. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toStringFormat\[Unsubscribe\[E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/eventstream/EventStream$$Unsubscribe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Unsubscribe\[E], B)ImplicitThis member is added by an implicit conversion from Unsubscribe\[E] toArrowAssoc\[Unsubscribe\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](EventStream$$Command.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnsubscribe\[E] to any2stringadd\[Unsubscribe\[E]]

### Inherited by implicit conversion StringFormat fromUnsubscribe\[E] to StringFormat\[Unsubscribe\[E]]

### Inherited by implicit conversion Ensuring fromUnsubscribe\[E] to Ensuring\[Unsubscribe\[E]]

### Inherited by implicit conversion ArrowAssoc fromUnsubscribe\[E] to ArrowAssoc\[Unsubscribe\[E]]

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
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$$Unsubscribe.html](https://doc.akka.io/api/akka/current/akka/actor/typed/eventstream/EventStream$$Unsubscribe.html)*