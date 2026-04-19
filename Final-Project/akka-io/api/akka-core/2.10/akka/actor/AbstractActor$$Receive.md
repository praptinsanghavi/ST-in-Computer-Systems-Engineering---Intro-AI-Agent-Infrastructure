---
description: Akka 2.10.17 - akka.actor.AbstractActor.Receive
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActor$$Receive.html
title: Akka 2.10.17 - akka.actor.AbstractActor.Receive
---

# Akka 2.10.17 - akka.actor.AbstractActor.Receive

> **Summary:** Akka 2.10.17 - akka.actor.AbstractActor.Receive

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/AbstractActor$.html "Permalink")  object [AbstractActor](AbstractActor$.html "Java API: compatible with lambda expressions")Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Definition Classes[actor](index.html)
- [ActorContext](AbstractActor$$ActorContext.html "The actor context - the view of the actor cell from the actor.")
- Receive
c[akka](../index.html).[actor](index.html).[AbstractActor](AbstractActor$.html)

# Receive[**](../../akka/actor/AbstractActor$$Receive.html "Permalink")

### 

#### final  class Receive extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Defines which messages the Actor can handle, along with the implementation of
how the messages should be processed. You can build such behavior with the
[akka.japi.pf.ReceiveBuilder](../japi/pf/ReceiveBuilder.html) but it can be implemented in other ways than
using the `ReceiveBuilder` since it in the end is just a wrapper around a
Scala `PartialFunction`. In Java, you can implement `PartialFunction` by
extending `AbstractPartialFunction`.

Source[AbstractActor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/AbstractActor.scala#L30)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Receive
2. AnyRef
3. Any
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

1. [**](../../akka/actor/AbstractActor$$Receive.html#<init>(onMessage:PartialFunction[Any,scala.runtime.BoxedUnit]):akka.actor.AbstractActor.Receive "Permalink")  new Receive(onMessage: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)])
### Value Members

1. [**](../../akka/actor/AbstractActor$$Receive.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/AbstractActor$$Receive.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/AbstractActor$$Receive.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Receive toany2stringadd\[Receive] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/AbstractActor$$Receive.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Receive, B)ImplicitThis member is added by an implicit conversion from Receive toArrowAssoc\[Receive] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/AbstractActor$$Receive.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/AbstractActor$$Receive.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/AbstractActor$$Receive.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/AbstractActor$$Receive.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Receive) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceiveImplicitThis member is added by an implicit conversion from Receive toEnsuring\[Receive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/AbstractActor$$Receive.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Receive) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceiveImplicitThis member is added by an implicit conversion from Receive toEnsuring\[Receive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/AbstractActor$$Receive.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceiveImplicitThis member is added by an implicit conversion from Receive toEnsuring\[Receive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/AbstractActor$$Receive.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceiveImplicitThis member is added by an implicit conversion from Receive toEnsuring\[Receive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/AbstractActor$$Receive.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/AbstractActor$$Receive.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/AbstractActor$$Receive.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/AbstractActor$$Receive.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/AbstractActor$$Receive.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/AbstractActor$$Receive.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/AbstractActor$$Receive.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/AbstractActor$$Receive.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/AbstractActor$$Receive.html#onMessage:PartialFunction[Any,scala.runtime.BoxedUnit] "Permalink")  val onMessage: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]
21. [**](../../akka/actor/AbstractActor$$Receive.html#orElse(other:akka.actor.AbstractActor.Receive):akka.actor.AbstractActor.Receive "Permalink")  def orElse(other: Receive): ReceiveComposes this `Receive` with a fallback which gets applied
where this partial function is not defined.
22. [**](../../akka/actor/AbstractActor$$Receive.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/actor/AbstractActor$$Receive.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/actor/AbstractActor$$Receive.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/actor/AbstractActor$$Receive.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/actor/AbstractActor$$Receive.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/AbstractActor$$Receive.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/AbstractActor$$Receive.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Receive toStringFormat\[Receive] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/AbstractActor$$Receive.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Receive, B)ImplicitThis member is added by an implicit conversion from Receive toArrowAssoc\[Receive] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReceive to any2stringadd\[Receive]

### Inherited by implicit conversion StringFormat fromReceive to StringFormat\[Receive]

### Inherited by implicit conversion Ensuring fromReceive to Ensuring\[Receive]

### Inherited by implicit conversion ArrowAssoc fromReceive to ArrowAssoc\[Receive]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$Receive.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$Receive.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$Receive.html)*