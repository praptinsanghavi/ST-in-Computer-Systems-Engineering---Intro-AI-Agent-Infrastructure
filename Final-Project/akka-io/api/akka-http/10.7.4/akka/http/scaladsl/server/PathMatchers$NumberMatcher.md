---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.NumberMatcher
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:09:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$NumberMatcher.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.NumberMatcher
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.NumberMatcher

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers.NumberMatcher

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
- NumberMatcher
- [PathEnd](PathMatchers$PathEnd$.html "A PathMatcher that matches the very end of the requests URI path.")
- [Remaining](PathMatchers$Remaining$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path as an (encoded!) String.")
- [RemainingPath](PathMatchers$RemainingPath$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path.")
- [Segment](PathMatchers$Segment$.html "A PathMatcher that matches if the unmatched path starts with a path segment.")
- [Slash](PathMatchers$Slash$.html "A PathMatcher that matches a single slash character ('/').")
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[PathMatchers](PathMatchers.html)

# NumberMatcher[**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html "Permalink")

### 

#### abstract  class NumberMatcher\[T] extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L450)Linear Supertypes[PathMatcher](PathMatcher.html)\[(T)], ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[(T)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[HexIntNumber](PathMatchers$HexIntNumber$.html), [HexLongNumber](PathMatchers$HexLongNumber$.html), [IntNumber](PathMatchers$IntNumber$.html), [LongNumber](PathMatchers$LongNumber$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NumberMatcher
2. PathMatcher
3. Function1
4. AnyRef
5. Any
Implicitly  
1. by EnhancedPathMatcher
2. by PathMatcher1Ops
3. by EnhancedPathMatcher
4. by PathMatcher1Ops
5. by any2stringadd
6. by StringFormat
7. by Ensuring
8. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#<init>(max:T,base:T)(implicitx:Integral[T]):PathMatchers.this.NumberMatcher[T] "Permalink")  new NumberMatcher(max: T, base: T)(implicit x: Integral\[T])
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#fromChar(c:Char):T "Permalink") abstract  def fromChar(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): T
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toany2stringadd\[NumberMatcher\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NumberMatcher\[T], B)ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toArrowAssoc\[NumberMatcher\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#/[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def /\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(T), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Definition Classes[PathMatcher](PathMatcher.html)
6. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#/:akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def /: [PathMatcher](PathMatcher.html)\[(T)]Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Definition Classes[PathMatcher](PathMatcher.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Matching](PathMatcher$$Matching.html)\[(T)]) \=\> A): ([Path](../model/Uri$$Path.html)) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
9. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def append\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(T), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Definition Classes[PathMatcher](PathMatcher.html)
10. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#apply(path:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.server.PathMatcher.Matching[(T,)] "Permalink")  def apply(path: [Path](../model/Uri$$Path.html)): [Matching](PathMatcher$$Matching.html)\[(T)]Definition ClassesNumberMatcher → Function1
11. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Path](../model/Uri$$Path.html)): (A) \=\> [Matching](PathMatcher$$Matching.html)\[(T)]Definition ClassesFunction1Annotations@unspecialized()
14. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NumberMatcher\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NumberMatcher\[T]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toEnsuring\[NumberMatcher\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NumberMatcher\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NumberMatcher\[T]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toEnsuring\[NumberMatcher\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NumberMatcher\[T]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toEnsuring\[NumberMatcher\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NumberMatcher\[T]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toEnsuring\[NumberMatcher\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#ev:akka.http.scaladsl.server.util.Tuple[L] "Permalink") implicit  val ev: [Tuple](util/Tuple.html)\[(T)]Definition Classes[PathMatcher](PathMatcher.html)
21. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#fromDecimalChar(c:Char):T "Permalink")  def fromDecimalChar(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): T
22. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#fromHexChar(c:Char):T "Permalink")  def fromHexChar(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): T
23. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#maxDivBase:T "Permalink")  val maxDivBase: T
27. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#minusOne:T "Permalink")  val minusOne: T
28. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def or\[R \>: (T)](other: [PathMatcher](PathMatcher.html)\[\_ \<: R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
32. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#repeat(min:Int,max:Int,separator:akka.http.scaladsl.server.PathMatcher0)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(min: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), separator: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit]) \= [PathMatchers.Neutral](PathMatchers$.html))(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), List]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]Turns this `PathMatcher` into one that matches a number of times (with the given separator)
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
33. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#repeat(count:Int,separator:akka.http.scaladsl.server.PathMatcher0)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), separator: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit]))(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), List]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]Same as `repeat(min = count, max = count, separator = separator)`.

Same as `repeat(min = count, max = count, separator = separator)`.

Definition Classes[PathMatcher](PathMatcher.html)
34. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#repeat(count:Int)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), List]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]Same as `repeat(min = count, max = count)`.

Same as `repeat(min = count, max = count)`.

Definition Classes[PathMatcher](PathMatcher.html)
35. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def slash\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(T), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Definition Classes[PathMatcher](PathMatcher.html)
36. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#slash:akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def slash: [PathMatcher](PathMatcher.html)\[(T)]Definition Classes[PathMatcher](PathMatcher.html)
37. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#tflatMap[R](f:L=>Option[R])(implicitevidence$5:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def tflatMap\[R](f: ((T)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
39. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#tmap[R](f:L=>R)(implicitevidence$4:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def tmap\[R](f: ((T)) \=\> R)(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
40. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
41. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#transform[R](f:akka.http.scaladsl.server.PathMatcher.Matching[L]=>akka.http.scaladsl.server.PathMatcher.Matching[R])(implicitevidence$3:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def transform\[R](f: ([Matching](PathMatcher$$Matching.html)\[(T)]) \=\> [Matching](PathMatcher$$Matching.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Definition Classes[PathMatcher](PathMatcher.html)
42. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#unary_!:akka.http.scaladsl.server.PathMatcher0 "Permalink")  def unary\_!: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Operator alternative to [PathMatchers.not](PathMatchers$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0)

Operator alternative to [PathMatchers.not](PathMatchers$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0)

Definition Classes[PathMatcher](PathMatcher.html)
43. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
45. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#|[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def \|\[R \>: (T)](other: [PathMatcher](PathMatcher.html)\[\_ \<: R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [PathMatcher](PathMatcher.html)\[R]Alias for [or](#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R]).

Alias for [or](#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R]).

Definition Classes[PathMatcher](PathMatcher.html)
47. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#~[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def \~\[R](other: [PathMatcher](PathMatcher.html)\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[(T), R]): [PathMatcher](PathMatcher.html)\[[Out](util/TupleOps$$Join.html#Out)]Alias for [append](#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Alias for [append](#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).

Definition Classes[PathMatcher](PathMatcher.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#?(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def ?(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[(T)] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: EnhancedPathMatcher[(T)]).?(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
2. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#?(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def ?(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[(T)] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: EnhancedPathMatcher[(T)]).?(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
3. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#flatMap[R](f:T=>Option[R]):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def flatMap\[R](f: (T) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R]): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: PathMatcher1Ops[T]).flatMap(f)
```
Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
4. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#flatMap[R](f:T=>Option[R]):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def flatMap\[R](f: (T) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R]): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: PathMatcher1Ops[T]).flatMap(f)
```
Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
5. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#map[R](f:T=>R):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def map\[R](f: (T) \=\> R): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: PathMatcher1Ops[T]).map(f)
```
Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
6. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#map[R](f:T=>R):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def map\[R](f: (T) \=\> R): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: PathMatcher1Ops[T]).map(f)
```
Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#optional(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def optional(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[(T)] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: EnhancedPathMatcher[(T)]).optional(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
8. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#optional(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def optional(implicit lift: [Lift](PathMatcher$$Lift.html)\[(T), [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): [PathMatcher](PathMatcher.html)\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[(T)] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(numberMatcher: EnhancedPathMatcher[(T)]).optional(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toStringFormat\[NumberMatcher\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NumberMatcher\[T], B)ImplicitThis member is added by an implicit conversion from NumberMatcher\[T] toArrowAssoc\[NumberMatcher\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [PathMatcher](PathMatcher.html)\[(T)]

### Inherited from ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[(T)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion EnhancedPathMatcher fromNumberMatcher\[T] to [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[(T)]

### Inherited by implicit conversion PathMatcher1Ops fromNumberMatcher\[T] to [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T]

### Inherited by implicit conversion EnhancedPathMatcher fromNumberMatcher\[T] to [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[(T)]

### Inherited by implicit conversion PathMatcher1Ops fromNumberMatcher\[T] to [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T]

### Inherited by implicit conversion any2stringadd fromNumberMatcher\[T] to any2stringadd\[NumberMatcher\[T]]

### Inherited by implicit conversion StringFormat fromNumberMatcher\[T] to StringFormat\[NumberMatcher\[T]]

### Inherited by implicit conversion Ensuring fromNumberMatcher\[T] to Ensuring\[NumberMatcher\[T]]

### Inherited by implicit conversion ArrowAssoc fromNumberMatcher\[T] to ArrowAssoc\[NumberMatcher\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$EnhancedPathMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matching.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$PathMatcher1Ops.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$NumberMatcher.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$NumberMatcher.html)*