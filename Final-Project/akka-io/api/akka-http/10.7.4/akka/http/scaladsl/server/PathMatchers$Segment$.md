---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.Segment
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:11:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$Segment$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.Segment
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.Segment

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.Segment

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/PathMatchers.html "Permalink")  trait [PathMatchers](PathMatchers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[server](index.html)
- [HexIntNumber](PathMatchers$HexIntNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Int value.")
- [HexLongNumber](PathMatchers$HexLongNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Long value.")
- [IntNumber](PathMatchers$IntNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Int value.")
- [LongNumber](PathMatchers$LongNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Long value.")
- [NumberMatcher](PathMatchers$NumberMatcher.html)
- [PathEnd](PathMatchers$PathEnd$.html "A PathMatcher that matches the very end of the requests URI path.")
- [Remaining](PathMatchers$Remaining$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path as an (encoded!) String.")
- [RemainingPath](PathMatchers$RemainingPath$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path.")
- Segment
- [Slash](PathMatchers$Slash$.html "A PathMatcher that matches a single slash character ('/').")
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[PathMatchers](PathMatchers.html)

# Segment[**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html "Permalink")

### 

#### object Segment extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]

A PathMatcher that matches if the unmatched path starts with a path segment.
If so the path segment is extracted as a String.

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L522)Linear Supertypes[PathMatcher](PathMatcher.html)\[(String)], ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[(String)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Segment
2. PathMatcher
3. Function1
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#/[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def /\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(String), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Definition Classes[PathMatcher](PathMatcher.html)
4. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#/:akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def /: [PathMatcher](PathMatcher.html)\[(String)]Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Definition Classes[PathMatcher](PathMatcher.html)
5. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Matching](PathMatcher$$Matching.html)\[(String)]) \=\> A): ([Path](../model/Uri$$Path.html)) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
7. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def append\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(String), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Definition Classes[PathMatcher](PathMatcher.html)
8. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#apply(path:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.server.PathMatcher.Matching[(String,)] "Permalink")  def apply(path: [Path](../model/Uri$$Path.html)): [Matching](PathMatcher$$Matching.html)\[(String)]Definition ClassesSegment → Function1
9. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Path](../model/Uri$$Path.html)): (A) \=\> [Matching](PathMatcher$$Matching.html)\[(String)]Definition ClassesFunction1Annotations@unspecialized()
12. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#ev:akka.http.scaladsl.server.util.Tuple[L] "Permalink") implicit  val ev: [Tuple](util/Tuple.html)\[(String)]Definition Classes[PathMatcher](PathMatcher.html)
15. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def or\[R \>: (String)](other: [PathMatcher](PathMatcher.html)\[\_ \<: R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
22. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#repeat(min:Int,max:Int,separator:akka.http.scaladsl.server.PathMatcher0)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(min: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), separator: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit]) \= [PathMatchers.Neutral](PathMatchers$.html))(implicit lift: [Lift](PathMatcher$$Lift.html)\[(String), List]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]Turns this `PathMatcher` into one that matches a number of times (with the given separator)
and potentially extracts a `List` of the underlying matcher's extractions.

Turns this `PathMatcher` into one that matches a number of times (with the given separator)
and potentially extracts a `List` of the underlying matcher's extractions.
If less than `min` applications of the underlying matcher have succeeded the produced matcher fails,
otherwise it matches up to the given `max` number of applications.
Note that it won't fail even if more than `max` applications could succeed!
The "surplus" path elements will simply be left unmatched.

The result type depends on the type of the underlying matcher:

  | If a \`matcher\` is of type | then \`matcher.repeat(...)\` is of type || \`PathMatcher0\` | \`PathMatcher0\` |
| \`PathMatcher1\[T]\` | \`PathMatcher1\[List\[T]\` |
| \`PathMatcher\[L :Tuple]\` | \`PathMatcher\[List\[L]]\` |

Definition Classes[PathMatcher](PathMatcher.html)
23. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#repeat(count:Int,separator:akka.http.scaladsl.server.PathMatcher0)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), separator: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit]))(implicit lift: [Lift](PathMatcher$$Lift.html)\[(String), List]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]Same as `repeat(min = count, max = count, separator = separator)`.

Same as `repeat(min = count, max = count, separator = separator)`.

Definition Classes[PathMatcher](PathMatcher.html)
24. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#repeat(count:Int)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit lift: [Lift](PathMatcher$$Lift.html)\[(String), List]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]Same as `repeat(min = count, max = count)`.

Same as `repeat(min = count, max = count)`.

Definition Classes[PathMatcher](PathMatcher.html)
25. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def slash\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(String), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Definition Classes[PathMatcher](PathMatcher.html)
26. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#slash:akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def slash: [PathMatcher](PathMatcher.html)\[(String)]Definition Classes[PathMatcher](PathMatcher.html)
27. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#tflatMap[R](f:L=>Option[R])(implicitevidence$5:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def tflatMap\[R](f: ((String)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
29. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#tmap[R](f:L=>R)(implicitevidence$4:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def tmap\[R](f: ((String)) \=\> R)(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
30. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
31. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#transform[R](f:akka.http.scaladsl.server.PathMatcher.Matching[L]=>akka.http.scaladsl.server.PathMatcher.Matching[R])(implicitevidence$3:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def transform\[R](f: ([Matching](PathMatcher$$Matching.html)\[(String)]) \=\> [Matching](PathMatcher$$Matching.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
32. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#unary_!:akka.http.scaladsl.server.PathMatcher0 "Permalink")  def unary\_!: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Operator alternative to [PathMatchers.not](PathMatchers$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0)

Operator alternative to [PathMatchers.not](PathMatchers$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0)

Definition Classes[PathMatcher](PathMatcher.html)
33. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#|[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def \|\[R \>: (String)](other: [PathMatcher](PathMatcher.html)\[\_ \<: R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Alias for [or](#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R]).

Alias for [or](#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R]).

Definition Classes[PathMatcher](PathMatcher.html)
37. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#~[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def \~\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(String), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Alias for [append](#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Alias for [append](#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Definition Classes[PathMatcher](PathMatcher.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PathMatcher](PathMatcher.html)\[(String)]

### Inherited from ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[(String)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matching.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$IntNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$LongNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$NumberMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$PathEnd$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Remaining$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$RemainingPath$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Segment$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Slash$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Segment$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Segment$.html)*