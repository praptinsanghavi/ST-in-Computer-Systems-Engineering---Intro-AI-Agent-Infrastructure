---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/TupleOps.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](index.html)Definition Classes[server](../index.html)
- [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")
- [BinaryPolyFunc](BinaryPolyFunc.html "Allows the definition of binary poly-functions (e.g.")
- [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")
- [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")
- [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")
- TupleOps
- [Tupler](Tupler.html "Provides a way to convert a value into an Tuple.")
[c](TupleOps$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html)

# [TupleOps](TupleOps$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/util/TupleOps.html "Permalink")

### Companion [object TupleOps](TupleOps$.html "See companion object")

#### final  class TupleOps\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[TupleOps.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/TupleOps.scala#L7)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TupleOps
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

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#<init>(tuple:T):akka.http.scaladsl.server.util.TupleOps[T] "Permalink")  new TupleOps(tuple: T)
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TupleOps\[T] toany2stringadd\[TupleOps\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TupleOps\[T], B)ImplicitThis member is added by an implicit conversion from TupleOps\[T] toArrowAssoc\[TupleOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#append[S](value:S)(implicitao:akka.http.scaladsl.server.util.TupleOps.AppendOne[T,S]):ao.Out "Permalink")  def append\[S](value: S)(implicit ao: [AppendOne](TupleOps$$AppendOne.html)\[T, S]): [Out](TupleOps$$AppendOne.html#Out)Appends the given value to the tuple producing a tuple of arity n \+ 1\.
7. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TupleOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TupleOps\[T]ImplicitThis member is added by an implicit conversion from TupleOps\[T] toEnsuring\[TupleOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TupleOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TupleOps\[T]ImplicitThis member is added by an implicit conversion from TupleOps\[T] toEnsuring\[TupleOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TupleOps\[T]ImplicitThis member is added by an implicit conversion from TupleOps\[T] toEnsuring\[TupleOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TupleOps\[T]ImplicitThis member is added by an implicit conversion from TupleOps\[T] toEnsuring\[TupleOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#foldLeft[In](zero:In)(op:akka.http.scaladsl.server.util.BinaryPolyFunc)(implicitfold:akka.http.scaladsl.server.util.TupleOps.FoldLeft[In,T,op.type]):fold.Out "Permalink")  def foldLeft\[In](zero: In)(op: [BinaryPolyFunc](BinaryPolyFunc.html))(implicit fold: [FoldLeft](TupleOps$$FoldLeft.html)\[In, T, op.type]): [Out](TupleOps$$FoldLeft.html#Out)Left\-Folds over the tuple using the given binary poly\-function.
13. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
14. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#join[S](suffixTuple:S)(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[T,S]):join.Out "Permalink")  def join\[S](suffixTuple: S)(implicit join: [Join](TupleOps$$Join.html)\[T, S]): [Out](TupleOps$$Join.html#Out)Appends the given tuple to the underlying tuple producing a tuple of arity n \+ m.
16. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
17. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#tuple:T "Permalink")  val tuple: T
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TupleOps\[T] toStringFormat\[TupleOps\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TupleOps\[T], B)ImplicitThis member is added by an implicit conversion from TupleOps\[T] toArrowAssoc\[TupleOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTupleOps\[T] to any2stringadd\[TupleOps\[T]]

### Inherited by implicit conversion StringFormat fromTupleOps\[T] to StringFormat\[TupleOps\[T]]

### Inherited by implicit conversion Ensuring fromTupleOps\[T] to Ensuring\[TupleOps\[T]]

### Inherited by implicit conversion ArrowAssoc fromTupleOps\[T] to ArrowAssoc\[TupleOps\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$AppendOne.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$FoldLeft.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html)*