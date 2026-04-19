---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Unmatched
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$Unmatched$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Unmatched
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Unmatched

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Unmatched

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
- [Matched](PathMatcher$$Matched.html)
- [Matching](PathMatcher$$Matching.html)
- [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
- Unmatched
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[PathMatcher](PathMatcher$.html)

# Unmatched[**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html "Permalink")

### 

#### case object Unmatched extends [Matching](PathMatcher$$Matching.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L136)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Matching](PathMatcher$$Matching.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unmatched
2. Serializable
3. Product
4. Equals
5. Matching
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#andThen[R](f:(akka.http.scaladsl.model.Uri.Path,Nothing)=>akka.http.scaladsl.server.PathMatcher.Matching[R])(implicitevidence$16:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher.Unmatched.type "Permalink")  def andThen\[R](f: ([Path](../model/Uri$$Path.html), [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)) \=\> [Matching](PathMatcher$$Matching.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): UnmatchedDefinition ClassesUnmatched → [Matching](PathMatcher$$Matching.html)
5. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#flatMap[R](f:Nothing=>Option[R])(implicitevidence$15:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher.Unmatched.type "Permalink")  def flatMap\[R](f: ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): UnmatchedDefinition ClassesUnmatched → [Matching](PathMatcher$$Matching.html)
10. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#map[R](f:Nothing=>R)(implicitevidence$14:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher.Unmatched.type "Permalink")  def map\[R](f: ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)) \=\> R)(implicit arg0: [Tuple](util/Tuple.html)\[R]): UnmatchedDefinition ClassesUnmatched → [Matching](PathMatcher$$Matching.html)
13. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#orElse[R](other:=>akka.http.scaladsl.server.PathMatcher.Matching[R]):akka.http.scaladsl.server.PathMatcher.Matching[R] "Permalink")  def orElse\[R](other: \=\> [Matching](PathMatcher$$Matching.html)\[R]): [Matching](PathMatcher$$Matching.html)\[R]Definition ClassesUnmatched → [Matching](PathMatcher$$Matching.html)
17. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
18. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Matching](PathMatcher$$Matching.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Unmatched$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Unmatched$.html)*