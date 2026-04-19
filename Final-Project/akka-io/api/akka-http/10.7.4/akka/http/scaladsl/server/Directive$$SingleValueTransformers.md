---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.SingleValueTransformers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.SingleValueTransformers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.SingleValueTransformers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.SingleValueTransformers

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/Directive$.html "Permalink")  object [Directive](Directive$.html)Definition Classes[server](index.html)
- [Directive0Support](Directive$$Directive0Support.html "Adds helper functions to Directive0")
- SingleValueTransformers
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[Directive](Directive$.html)

# SingleValueTransformers[**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html "Permalink")

### 

#### implicit final  class SingleValueTransformers\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

"Standard" transformers for [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)]).
Easier to use than `tmap`, `tflatMap`, etc. defined on [Directive](Directive.html) itself,
because they provide transparent conversion from Tuple1.

Source[Directive.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/Directive.scala#L183)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SingleValueTransformers
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

1. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#<init>(underlying:akka.http.scaladsl.server.Directive1[T]):akka.http.scaladsl.server.Directive.SingleValueTransformers[T] "Permalink")  new SingleValueTransformers(underlying: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T])
### Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toany2stringadd\[SingleValueTransformers\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SingleValueTransformers\[T], B)ImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toArrowAssoc\[SingleValueTransformers\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#collect[R](pf:PartialFunction[T,R],rejections:akka.http.scaladsl.server.Rejection*)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def collect\[R](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, R], rejections: [Rejection](Rejection.html)\*)(implicit tupler: [Tupler](util/Tupler.html)\[R]): [Directive](Directive.html)\[[Out](util/Tupler.html#Out)]
8. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SingleValueTransformers\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SingleValueTransformers\[T]ImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toEnsuring\[SingleValueTransformers\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SingleValueTransformers\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SingleValueTransformers\[T]ImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toEnsuring\[SingleValueTransformers\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SingleValueTransformers\[T]ImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toEnsuring\[SingleValueTransformers\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SingleValueTransformers\[T]ImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toEnsuring\[SingleValueTransformers\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#filter(predicate:T=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive1[T] "Permalink")  def filter(predicate: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]
13. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#flatMap[R](f:T=>akka.http.scaladsl.server.Directive[R])(implicitevidence$5:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def flatMap\[R](f: (T) \=\> [Directive](Directive.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [Directive](Directive.html)\[R]
14. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
15. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#map[R](f:T=>R)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def map\[R](f: (T) \=\> R)(implicit tupler: [Tupler](util/Tupler.html)\[R]): [Directive](Directive.html)\[[Out](util/Tupler.html#Out)]
17. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#require(predicate:T=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive0 "Permalink")  def require(predicate: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])
18. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#underlying:akka.http.scaladsl.server.Directive1[T] "Permalink")  val underlying: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toStringFormat\[SingleValueTransformers\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SingleValueTransformers\[T], B)ImplicitThis member is added by an implicit conversion from SingleValueTransformers\[T] toArrowAssoc\[SingleValueTransformers\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSingleValueTransformers\[T] to any2stringadd\[SingleValueTransformers\[T]]

### Inherited by implicit conversion StringFormat fromSingleValueTransformers\[T] to StringFormat\[SingleValueTransformers\[T]]

### Inherited by implicit conversion Ensuring fromSingleValueTransformers\[T] to Ensuring\[SingleValueTransformers\[T]]

### Inherited by implicit conversion ArrowAssoc fromSingleValueTransformers\[T] to ArrowAssoc\[SingleValueTransformers\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$Directive0Support.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html)*