---
description: Akka 2.10.17 - akka.actor.typed.ActorRef.ActorRefOps
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:51:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRef$$ActorRefOps.html
title: Akka 2.10.17 - akka.actor.typed.ActorRef.ActorRefOps
---

# Akka 2.10.17 - akka.actor.typed.ActorRef.ActorRefOps

> **Summary:** Akka 2.10.17 - akka.actor.typed.ActorRef.ActorRefOps

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/ActorRef$.html "Permalink")  object [ActorRef](ActorRef$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[typed](index.html)
- ActorRefOps
c[akka](../../index.html).[actor](../index.html).[typed](index.html).[ActorRef](ActorRef$.html)

# ActorRefOps[**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html "Permalink")

### 

#### implicit final  class ActorRefOps\[\-T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[ActorRef.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/ActorRef.scala#L61)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorRefOps
2. AnyVal
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

1. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#<init>(ref:akka.actor.typed.ActorRef[T]):akka.actor.typed.ActorRef.ActorRefOps[T] "Permalink")  new ActorRefOps(ref: [ActorRef](ActorRef.html)\[T])
### Value Members

1. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#!(msg:T):Unit "Permalink")  def !(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.
2. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
3. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
4. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toany2stringadd\[ActorRefOps\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorRefOps\[T], B)ImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toArrowAssoc\[ActorRefOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
7. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorRefOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorRefOps\[T]ImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toEnsuring\[ActorRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorRefOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorRefOps\[T]ImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toEnsuring\[ActorRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorRefOps\[T]ImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toEnsuring\[ActorRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorRefOps\[T]ImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toEnsuring\[ActorRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#ref:akka.actor.typed.ActorRef[T] "Permalink")  val ref: [ActorRef](ActorRef.html)\[T]
15. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toStringFormat\[ActorRefOps\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../akka/actor/typed/ActorRef$$ActorRefOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorRefOps\[T], B)ImplicitThis member is added by an implicit conversion from ActorRefOps\[T] toArrowAssoc\[ActorRefOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorRefOps\[T] to any2stringadd\[ActorRefOps\[T]]

### Inherited by implicit conversion StringFormat fromActorRefOps\[T] to StringFormat\[ActorRefOps\[T]]

### Inherited by implicit conversion Ensuring fromActorRefOps\[T] to Ensuring\[ActorRefOps\[T]]

### Inherited by implicit conversion ArrowAssoc fromActorRefOps\[T] to ArrowAssoc\[ActorRefOps\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef$$ActorRefOps.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef$$ActorRefOps.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef$$ActorRefOps.html)*