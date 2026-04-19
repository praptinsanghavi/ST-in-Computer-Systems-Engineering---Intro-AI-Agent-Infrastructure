---
description: Akka 2.10.17 - akka.actor.typed.RecipientRef.RecipientRefOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/RecipientRef$$RecipientRefOps.html
title: Akka 2.10.17 - akka.actor.typed.RecipientRef.RecipientRefOps
---

# Akka 2.10.17 - akka.actor.typed.RecipientRef.RecipientRefOps

> **Summary:** Akka 2.10.17 - akka.actor.typed.RecipientRef.RecipientRefOps

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/RecipientRef$.html "Permalink")  object [RecipientRef](RecipientRef$.html)Definition Classes[typed](index.html)
- RecipientRefOps
c[akka](../../index.html).[actor](../index.html).[typed](index.html).[RecipientRef](RecipientRef$.html)

# RecipientRefOps[**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html "Permalink")

### 

#### implicit final  class RecipientRefOps\[\-T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[ActorRef.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/ActorRef.scala#L127)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecipientRefOps
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

1. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#<init>(ref:akka.actor.typed.RecipientRef[T]):akka.actor.typed.RecipientRef.RecipientRefOps[T] "Permalink")  new RecipientRefOps(ref: [RecipientRef](RecipientRef.html)\[T])
### Value Members

1. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#!(msg:T):Unit "Permalink")  def !(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.
2. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
3. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
4. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toany2stringadd\[RecipientRefOps\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RecipientRefOps\[T], B)ImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toArrowAssoc\[RecipientRefOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
7. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RecipientRefOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecipientRefOps\[T]ImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toEnsuring\[RecipientRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RecipientRefOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecipientRefOps\[T]ImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toEnsuring\[RecipientRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecipientRefOps\[T]ImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toEnsuring\[RecipientRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecipientRefOps\[T]ImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toEnsuring\[RecipientRefOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](RecipientRef.html)\[T]
15. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toStringFormat\[RecipientRefOps\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../akka/actor/typed/RecipientRef$$RecipientRefOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RecipientRefOps\[T], B)ImplicitThis member is added by an implicit conversion from RecipientRefOps\[T] toArrowAssoc\[RecipientRefOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRecipientRefOps\[T] to any2stringadd\[RecipientRefOps\[T]]

### Inherited by implicit conversion StringFormat fromRecipientRefOps\[T] to StringFormat\[RecipientRefOps\[T]]

### Inherited by implicit conversion Ensuring fromRecipientRefOps\[T] to Ensuring\[RecipientRefOps\[T]]

### Inherited by implicit conversion ArrowAssoc fromRecipientRefOps\[T] to ArrowAssoc\[RecipientRefOps\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef$$RecipientRefOps.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef$$RecipientRefOps.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef$$RecipientRefOps.html)*