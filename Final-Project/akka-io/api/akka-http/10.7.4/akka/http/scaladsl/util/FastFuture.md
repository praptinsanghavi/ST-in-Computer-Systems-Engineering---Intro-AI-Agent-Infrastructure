---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.util.FastFuture
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/FastFuture.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.util.FastFuture
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.util.FastFuture

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.util.FastFuture

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](index.html)Definition Classes[scaladsl](../index.html)
- FastFuture
[c](FastFuture$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[util](index.html)

# [FastFuture](FastFuture$.html "See companion object")[**](../../../../akka/http/scaladsl/util/FastFuture.html "Permalink")

### Companion [object FastFuture](FastFuture$.html "See companion object")

#### final  class FastFuture\[A] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Provides alternative implementations of the basic transformation operations defined on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html),
which try to avoid scheduling to an [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) if possible, i.e. if the given future
value is already present.

Source[FastFuture.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala-2.13+/akka/http/scaladsl/util/FastFuture.scala#L18)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FastFuture
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

1. [**](../../../../akka/http/scaladsl/util/FastFuture.html#<init>(future:scala.concurrent.Future[A]):akka.http.scaladsl.util.FastFuture[A] "Permalink")  new FastFuture(future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[A])
### Value Members

1. [**](../../../../akka/http/scaladsl/util/FastFuture.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/http/scaladsl/util/FastFuture.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/http/scaladsl/util/FastFuture.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FastFuture\[A] toany2stringadd\[FastFuture\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/util/FastFuture.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FastFuture\[A], B)ImplicitThis member is added by an implicit conversion from FastFuture\[A] toArrowAssoc\[FastFuture\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/util/FastFuture.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/util/FastFuture.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/util/FastFuture.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FastFuture\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FastFuture\[A]ImplicitThis member is added by an implicit conversion from FastFuture\[A] toEnsuring\[FastFuture\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
8. [**](../../../../akka/http/scaladsl/util/FastFuture.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FastFuture\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FastFuture\[A]ImplicitThis member is added by an implicit conversion from FastFuture\[A] toEnsuring\[FastFuture\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/util/FastFuture.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FastFuture\[A]ImplicitThis member is added by an implicit conversion from FastFuture\[A] toEnsuring\[FastFuture\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/util/FastFuture.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FastFuture\[A]ImplicitThis member is added by an implicit conversion from FastFuture\[A] toEnsuring\[FastFuture\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/util/FastFuture.html#filter(pred:A=>Boolean)(implicitexecutor:scala.concurrent.ExecutionContext):scala.concurrent.Future[A] "Permalink")  def filter(pred: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[A]
12. [**](../../../../akka/http/scaladsl/util/FastFuture.html#flatMap[B](f:A=>scala.concurrent.Future[B])(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[B] "Permalink")  def flatMap\[B](f: (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
13. [**](../../../../akka/http/scaladsl/util/FastFuture.html#foreach(f:A=>Unit)(implicitec:scala.concurrent.ExecutionContext):Unit "Permalink")  def foreach(f: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
14. [**](../../../../akka/http/scaladsl/util/FastFuture.html#future:scala.concurrent.Future[A] "Permalink")  val future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[A]
15. [**](../../../../akka/http/scaladsl/util/FastFuture.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
16. [**](../../../../akka/http/scaladsl/util/FastFuture.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/util/FastFuture.html#map[B](f:A=>B)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[B] "Permalink")  def map\[B](f: (A) \=\> B)(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
18. [**](../../../../akka/http/scaladsl/util/FastFuture.html#recover[B>:A](pf:PartialFunction[Throwable,B])(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[B] "Permalink")  def recover\[B \>: A](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, B])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
19. [**](../../../../akka/http/scaladsl/util/FastFuture.html#recoverWith[B>:A](pf:PartialFunction[Throwable,scala.concurrent.Future[B]])(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[B] "Permalink")  def recoverWith\[B \>: A](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
20. [**](../../../../akka/http/scaladsl/util/FastFuture.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/util/FastFuture.html#transformWith[B](s:A=>scala.concurrent.Future[B],f:Throwable=>scala.concurrent.Future[B])(implicitexecutor:scala.concurrent.ExecutionContext):scala.concurrent.Future[B] "Permalink")  def transformWith\[B](s: (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B], f: (Throwable) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B])(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
22. [**](../../../../akka/http/scaladsl/util/FastFuture.html#transformWith[B](f:scala.util.Try[A]=>scala.concurrent.Future[B])(implicitexecutor:scala.concurrent.ExecutionContext):scala.concurrent.Future[B] "Permalink")  def transformWith\[B](f: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[A]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B])(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/util/FastFuture.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FastFuture\[A] toStringFormat\[FastFuture\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/http/scaladsl/util/FastFuture.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FastFuture\[A], B)ImplicitThis member is added by an implicit conversion from FastFuture\[A] toArrowAssoc\[FastFuture\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFastFuture\[A] to any2stringadd\[FastFuture\[A]]

### Inherited by implicit conversion StringFormat fromFastFuture\[A] to StringFormat\[FastFuture\[A]]

### Inherited by implicit conversion Ensuring fromFastFuture\[A] to Ensuring\[FastFuture\[A]]

### Inherited by implicit conversion ArrowAssoc fromFastFuture\[A] to ArrowAssoc\[FastFuture\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/FastFuture$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/FastFuture.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/FastFuture.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/FastFuture.html)*