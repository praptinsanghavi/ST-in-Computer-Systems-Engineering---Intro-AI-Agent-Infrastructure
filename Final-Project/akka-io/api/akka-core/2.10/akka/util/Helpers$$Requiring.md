---
description: Akka 2.10.17 - akka.util.Helpers.Requiring
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:19:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/Helpers$$Requiring.html
title: Akka 2.10.17 - akka.util.Helpers.Requiring
---

# Akka 2.10.17 - akka.util.Helpers.Requiring

> **Summary:** Akka 2.10.17 - akka.util.Helpers.Requiring

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/Helpers$.html "Permalink")  object [Helpers](Helpers$.html)Definition Classes[util](index.html)
- Requiring
c[akka](../index.html).[util](index.html).[Helpers](Helpers$.html)

# Requiring[**](../../akka/util/Helpers$$Requiring.html "Permalink")

### 

#### implicit final  class Requiring\[A] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Implicit class providing `requiring` methods. This class is based on
`Predef.ensuring` in the Scala standard library. The difference is that
this class's methods throw `IllegalArgumentException`s rather than
`AssertionError`s.

An example adapted from `Predef`'s documentation:

```
import akka.util.Helpers.Requiring

def addNaturals(nats: List[Int]): Int = {
  require(nats forall (_ >= 0), "List contains negative numbers")
  nats.foldLeft(0)(_ + _)
} requiring(_ >= 0)
```
Annotations@inline() Source[Helpers.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/Helpers.scala#L125)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Requiring
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

1. [**](../../akka/util/Helpers$$Requiring.html#<init>(value:A):akka.util.Helpers.Requiring[A] "Permalink")  new Requiring(value: A)valueThe value to check.
### Value Members

1. [**](../../akka/util/Helpers$$Requiring.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../akka/util/Helpers$$Requiring.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../akka/util/Helpers$$Requiring.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Requiring\[A] toany2stringadd\[Requiring\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/Helpers$$Requiring.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Requiring\[A], B)ImplicitThis member is added by an implicit conversion from Requiring\[A] toArrowAssoc\[Requiring\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/Helpers$$Requiring.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../akka/util/Helpers$$Requiring.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/Helpers$$Requiring.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Requiring\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Requiring\[A]ImplicitThis member is added by an implicit conversion from Requiring\[A] toEnsuring\[Requiring\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
8. [**](../../akka/util/Helpers$$Requiring.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Requiring\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Requiring\[A]ImplicitThis member is added by an implicit conversion from Requiring\[A] toEnsuring\[Requiring\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/util/Helpers$$Requiring.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Requiring\[A]ImplicitThis member is added by an implicit conversion from Requiring\[A] toEnsuring\[Requiring\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/Helpers$$Requiring.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Requiring\[A]ImplicitThis member is added by an implicit conversion from Requiring\[A] toEnsuring\[Requiring\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/Helpers$$Requiring.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
12. [**](../../akka/util/Helpers$$Requiring.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/util/Helpers$$Requiring.html#requiring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def requiring(cond: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ACheck that a condition is true for the `value`.

Check that a condition is true for the `value`. If true, return `value`,
otherwise throw an `IllegalArgumentException` with the given message.

condThe function used to check the `value`.

msgThe message to report if the condition isn't met.

Annotations@inline()
14. [**](../../akka/util/Helpers$$Requiring.html#requiring(cond:Boolean,msg:=>Any):A "Permalink")  def requiring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ACheck that a condition is true.

Check that a condition is true. If true, return `value`, otherwise throw
an `IllegalArgumentException` with the given message.

condThe condition to check.

msgThe message to report if the condition isn't met.

Annotations@inline()
15. [**](../../akka/util/Helpers$$Requiring.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
16. [**](../../akka/util/Helpers$$Requiring.html#value:A "Permalink")  val value: A
### Deprecated Value Members

1. [**](../../akka/util/Helpers$$Requiring.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Requiring\[A] toStringFormat\[Requiring\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../akka/util/Helpers$$Requiring.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Requiring\[A], B)ImplicitThis member is added by an implicit conversion from Requiring\[A] toArrowAssoc\[Requiring\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRequiring\[A] to any2stringadd\[Requiring\[A]]

### Inherited by implicit conversion StringFormat fromRequiring\[A] to StringFormat\[Requiring\[A]]

### Inherited by implicit conversion Ensuring fromRequiring\[A] to Ensuring\[Requiring\[A]]

### Inherited by implicit conversion ArrowAssoc fromRequiring\[A] to ArrowAssoc\[Requiring\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Helpers$$Requiring.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Helpers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/util/Helpers$$Requiring.html](https://doc.akka.io/api/akka-core/2.10/akka/util/Helpers$$Requiring.html)*