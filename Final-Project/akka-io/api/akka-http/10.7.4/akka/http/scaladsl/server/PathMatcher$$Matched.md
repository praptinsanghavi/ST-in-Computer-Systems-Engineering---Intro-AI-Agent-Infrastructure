---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Matched
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$Matched.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Matched
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Matched

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Matched

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/PathMatcher$.html "Permalink")  object [PathMatcher](PathMatcher$.html) extends [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)Definition Classes[server](index.html)
- [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
- [Lift](PathMatcher$$Lift.html)
- [LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html)
- Matched
- [Matching](PathMatcher$$Matching.html)
- [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
- [Unmatched](PathMatcher$$Unmatched$.html)
[c](PathMatcher$$Matched$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[PathMatcher](PathMatcher$.html)

# [Matched](PathMatcher$$Matched$.html "See companion object")[**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html "Permalink")

### Companion [object Matched](PathMatcher$$Matched$.html "See companion object")

#### case class Matched\[L](pathRest: [Path](../model/Uri$$Path.html), extractions: L)(implicit evidence$10: [Tuple](util/Tuple.html)\[L]) extends [Matching](PathMatcher$$Matching.html)\[L] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L126)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Matching](PathMatcher$$Matching.html)\[L], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Matched
2. Serializable
3. Product
4. Equals
5. Matching
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

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#<init>(pathRest:akka.http.scaladsl.model.Uri.Path,extractions:L)(implicitevidence$10:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher.Matched[L] "Permalink")  new Matched(pathRest: [Path](../model/Uri$$Path.html), extractions: L)(implicit arg0: [Tuple](util/Tuple.html)\[L])
### Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Matched\[L] toany2stringadd\[Matched\[L]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Matched\[L], B)ImplicitThis member is added by an implicit conversion from Matched\[L] toArrowAssoc\[Matched\[L]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#andThen[R](f:(akka.http.scaladsl.model.Uri.Path,L)=>akka.http.scaladsl.server.PathMatcher.Matching[R])(implicitevidence$13:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher.Matching[R] "Permalink")  def andThen\[R](f: ([Path](../model/Uri$$Path.html), L) \=\> [Matching](PathMatcher$$Matching.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [Matching](PathMatcher$$Matching.html)\[R]Definition ClassesMatched → [Matching](PathMatcher$$Matching.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Matched\[L]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Matched\[L]ImplicitThis member is added by an implicit conversion from Matched\[L] toEnsuring\[Matched\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Matched\[L]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Matched\[L]ImplicitThis member is added by an implicit conversion from Matched\[L] toEnsuring\[Matched\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Matched\[L]ImplicitThis member is added by an implicit conversion from Matched\[L] toEnsuring\[Matched\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Matched\[L]ImplicitThis member is added by an implicit conversion from Matched\[L] toEnsuring\[Matched\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#extractions:L "Permalink")  val extractions: L
15. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#flatMap[R](f:L=>Option[R])(implicitevidence$12:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher.Matching[R] "Permalink")  def flatMap\[R](f: (L) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [Matching](PathMatcher$$Matching.html)\[R]Definition ClassesMatched → [Matching](PathMatcher$$Matching.html)
16. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#map[R](f:L=>R)(implicitevidence$11:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher.Matched[R] "Permalink")  def map\[R](f: (L) \=\> R)(implicit arg0: [Tuple](util/Tuple.html)\[R]): Matched\[R]Definition ClassesMatched → [Matching](PathMatcher$$Matching.html)
19. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#orElse[R>:L](other:=>akka.http.scaladsl.server.PathMatcher.Matching[R]):akka.http.scaladsl.server.PathMatcher.Matched[L] "Permalink")  def orElse\[R \>: L](other: \=\> [Matching](PathMatcher$$Matching.html)\[R]): Matched\[L]Definition ClassesMatched → [Matching](PathMatcher$$Matching.html)
23. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#pathRest:akka.http.scaladsl.model.Uri.Path "Permalink")  val pathRest: [Path](../model/Uri$$Path.html)
24. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Matched\[L] toStringFormat\[Matched\[L]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Matched\[L], B)ImplicitThis member is added by an implicit conversion from Matched\[L] toArrowAssoc\[Matched\[L]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Matching](PathMatcher$$Matching.html)\[L]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMatched\[L] to any2stringadd\[Matched\[L]]

### Inherited by implicit conversion StringFormat fromMatched\[L] to StringFormat\[Matched\[L]]

### Inherited by implicit conversion Ensuring fromMatched\[L] to Ensuring\[Matched\[L]]

### Inherited by implicit conversion ArrowAssoc fromMatched\[L] to ArrowAssoc\[Matched\[L]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$EnhancedPathMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$LowLevelLiftImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matching.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$PathMatcher1Ops.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Unmatched$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched.html)*