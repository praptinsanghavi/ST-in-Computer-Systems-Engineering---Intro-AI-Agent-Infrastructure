---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Query
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:05:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Query.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Query
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Query

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Query

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- [Authority](Uri$$Authority.html)
- [Empty](Uri$$Empty$.html)
- [Host](Uri$$Host.html)
- [IPv4Host](Uri$$IPv4Host.html)
- [IPv6Host](Uri$$IPv6Host.html)
- [NamedHost](Uri$$NamedHost.html)
- [NonEmptyHost](Uri$$NonEmptyHost.html)
- [ParsingMode](Uri$$ParsingMode.html)
- [Path](Uri$$Path.html)
- Query
[c](Uri$$Query$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html)

# [Query](Uri$$Query$.html "See companion object")[**](../../../../akka/http/scaladsl/model/Uri$$Query.html "Permalink")

### Companion [object Query](Uri$$Query$.html "See companion object")

#### sealed abstract  class Query extends [QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html)

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L649)Linear Supertypes[QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html), [StrictOptimizedLinearSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedLinearSeqOps.html#scala.collection.StrictOptimizedLinearSeqOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), Query], [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedSeqOps.html#scala.collection.StrictOptimizedSeqOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), Query], [StrictOptimizedIterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedIterableOps.html#scala.collection.StrictOptimizedIterableOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), Query], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(String, String)], [LinearSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeqOps.html#scala.collection.immutable.LinearSeqOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(String, String)]], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/LinearSeq.html#scala.collection.LinearSeq)\[(String, String)], [LinearSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/LinearSeqOps.html#scala.collection.LinearSeqOps)\[(String, String), \[X][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[X], Query], [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, String)], [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SeqOps.html#scala.collection.immutable.SeqOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(String, String)]], [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[(String, String)], [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/SeqOps.html#scala.collection.SeqOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], Query], [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), (String, String)], ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> (String, String), [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[(String, String)], [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[(String, String)], [IterableFactoryDefaults](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableFactoryDefaults.html#scala.collection.IterableFactoryDefaults)\[(String, String), \[x][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[x]], [IterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOps.html#scala.collection.IterableOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], Query], [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], Query], [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[(String, String)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Cons](Uri$$Query$$Cons.html), [Empty](Uri$$Query$$Empty$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Query
2. QuerySeqOptimized
3. StrictOptimizedLinearSeqOps
4. StrictOptimizedSeqOps
5. StrictOptimizedIterableOps
6. LinearSeq
7. LinearSeqOps
8. LinearSeq
9. LinearSeqOps
10. Seq
11. SeqOps
12. Seq
13. Equals
14. SeqOps
15. PartialFunction
16. Function1
17. Iterable
18. Iterable
19. IterableFactoryDefaults
20. IterableOps
21. IterableOnceOps
22. IterableOnce
23. AnyRef
24. Any
Implicitly  
1. by iterableOnceExtensionMethods
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#key:String "Permalink") abstract  def key: String
2. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#value:String "Permalink") abstract  def value: String
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Query toany2stringadd\[Query] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#++[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def \+\+\[B \>: (String, String)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesIterableOpsAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#++:[B>:A](prefix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def \+\+:\[B \>: (String, String)](prefix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOps → IterableOpsAnnotations@inline()
6. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#+:(kvp:(String,String)):akka.http.scaladsl.model.Uri.Query.Cons "Permalink")  def \+:(kvp: (String, String)): [Cons](Uri$$Query$$Cons.html)
7. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#+:[B>:A](elem:B):CC[B] "Permalink") final  def \+:\[B \>: (String, String)](elem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOpsAnnotations@inline()
8. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Query, B)ImplicitThis member is added by an implicit conversion from Query toArrowAssoc\[Query] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
9. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#:+[B>:A](elem:B):CC[B] "Permalink") final  def :\+\[B \>: (String, String)](elem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOpsAnnotations@inline()
10. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#:++[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def :\+\+\[B \>: (String, String)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOpsAnnotations@inline()
11. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#addString(b:StringBuilder):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder)): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
13. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#addString(b:StringBuilder,sep:String):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), sep: String): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
14. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#addString(b:StringBuilder,start:String,sep:String,end:String):b.type "Permalink")  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), start: String, sep: String, end: String): b.typeDefinition ClassesIterableOnceOps
15. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(String, String), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), C]Definition ClassesPartialFunction
16. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ((String, String)) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), C]Definition ClassesPartialFunction → Function1
17. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#appended[B>:A](elem:B):CC[B] "Permalink")  def appended\[B \>: (String, String)](elem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
18. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#appendedAll[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink")  def appendedAll\[B \>: (String, String)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
19. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#apply(n:Int):A "Permalink")  def apply(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): (String, String)Definition ClassesLinearSeqOps → SeqOpsAnnotations@throws(scala.this.throws.\<init\>$default$1\[IndexOutOfBoundsException])
20. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), B1 \>: (String, String)](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
21. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeq → Equals
23. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#className:String "Permalink")  def className: StringAttributesprotected\[this] Definition ClassesIterable
24. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#coll:Iterable.this.type "Permalink") final  def coll: Query.this.typeAttributesprotected Definition ClassesIterable → IterableOps
26. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#collect[B](pf:PartialFunction[A,B]):CC[B] "Permalink")  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(String, String), B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
27. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#collectFirst[B](pf:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(String, String), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
28. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#combinations(n:Int):Iterator[C] "Permalink")  def combinations(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesSeqOps
29. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, (String, String)]Definition ClassesPartialFunction
30. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): (A) \=\> (String, String)Definition ClassesFunction1Annotations@unspecialized()
31. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#concat[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def concat\[B \>: (String, String)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOps → IterableOpsAnnotations@inline()
32. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#contains[A1>:A](elem:A1):Boolean "Permalink")  def contains\[A1 \>: (String, String)](elem: A1): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinearSeqOps → SeqOps
33. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#containsSlice[B>:A](that:scala.collection.Seq[B]):Boolean "Permalink")  def containsSlice\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
34. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#copyToArray[B>:A](dest:Array[B],start:Int,n:Int):Int "Permalink")  def copyToArray\[B \>: (String, String)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
35. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#copyToArray[B>:A](dest:Array[B],start:Int):Int "Permalink")  def copyToArray\[B \>: (String, String)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
36. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#copyToArray[B>:A](dest:Array[B]):Int "Permalink")  def copyToArray\[B \>: (String, String)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
37. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#corresponds[B](that:scala.collection.Seq[B])(p:(A,B)=>Boolean):Boolean "Permalink")  def corresponds\[B](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B])(p: ((String, String), B) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
38. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#corresponds[B](that:scala.collection.IterableOnce[B])(p:(A,B)=>Boolean):Boolean "Permalink")  def corresponds\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B])(p: ((String, String), B) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
39. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#count(p:A=>Boolean):Int "Permalink")  def count(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
40. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#diff[B>:A](that:scala.collection.Seq[B]):C "Permalink")  def diff\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): QueryDefinition ClassesStrictOptimizedSeqOps → SeqOps
41. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#distinct:C "Permalink")  def distinct: QueryDefinition ClassesSeqOps
42. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#distinctBy[B](f:A=>B):C "Permalink")  def distinctBy\[B](f: ((String, String)) \=\> B): QueryDefinition ClassesStrictOptimizedSeqOps → SeqOps
43. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#drop(n:Int):C "Permalink")  def drop(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): QueryDefinition ClassesStrictOptimizedLinearSeqOps → IterableOps → IterableOnceOps
44. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#dropRight(n:Int):C "Permalink")  def dropRight(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): QueryDefinition ClassesStrictOptimizedIterableOps → IterableOps
45. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#dropWhile(p:A=>Boolean):C "Permalink")  def dropWhile(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryDefinition ClassesStrictOptimizedLinearSeqOps → IterableOps → IterableOnceOps
46. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), (String, String)]Definition ClassesPartialFunction
47. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#empty:akka.http.scaladsl.model.Uri.Query "Permalink")  def empty: QueryDefinition Classes[QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html) → IterableFactoryDefaults → IterableOps
48. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#endsWith[B>:A](that:Iterable[B]):Boolean "Permalink")  def endsWith\[B \>: (String, String)](that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
49. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Query) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): QueryImplicitThis member is added by an implicit conversion from Query toEnsuring\[Query] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
50. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Query) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryImplicitThis member is added by an implicit conversion from Query toEnsuring\[Query] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
51. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): QueryImplicitThis member is added by an implicit conversion from Query toEnsuring\[Query] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
52. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryImplicitThis member is added by an implicit conversion from Query toEnsuring\[Query] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
53. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
54. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeq → Equals → AnyRef → Any
55. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#exists(p:A=>Boolean):Boolean "Permalink")  def exists(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinearSeqOps → IterableOnceOps
56. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#filter(pred:A=>Boolean):C "Permalink")  def filter(pred: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryDefinition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
57. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#filterImpl(pred:A=>Boolean,isFlipped:Boolean):C "Permalink")  def filterImpl(pred: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), isFlipped: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryAttributesprotected\[[collection](https://www.scala-lang.org/api/2.13.17/scala/collection/index.html#scala.collection)] Definition ClassesStrictOptimizedIterableOps
58. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#filterNot(pred:A=>Boolean):C "Permalink")  def filterNot(pred: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryDefinition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
59. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesLinearSeqOps → IterableOnceOps
60. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#findLast(p:A=>Boolean):Option[A] "Permalink")  def findLast(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesLinearSeqOps → SeqOps
61. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):CC[B] "Permalink")  def flatMap\[B](f: ((String, String)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
62. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#flatten[B](implicittoIterableOnce:A=>scala.collection.IterableOnce[B]):CC[B] "Permalink")  def flatten\[B](implicit toIterableOnce: ((String, String)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
63. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: (String, String)](z: A1)(op: (A1, A1) \=\> A1): A1Definition ClassesIterableOnceOps
64. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#foldLeft[B](z:B)(op:(B,A)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, (String, String)) \=\> B): BDefinition ClassesLinearSeqOps → IterableOnceOps
65. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ((String, String), B) \=\> B): BDefinition ClassesIterableOnceOps
66. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#forall(p:A=>Boolean):Boolean "Permalink")  def forall(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinearSeqOps → IterableOnceOps
67. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#foreach[U](f:A=>U):Unit "Permalink")  def foreach\[U](f: ((String, String)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLinearSeqOps → IterableOnceOps
68. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#fromSpecific(coll:IterableOnce[(String,String)]):akka.http.scaladsl.model.Uri.Query "Permalink")  def fromSpecific(coll: IterableOnce\[(String, String)]): QueryAttributesprotected Definition Classes[QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html) → IterableFactoryDefaults → IterableOps
69. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#get(key:String):Option[String] "Permalink")  def get(key: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
70. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#getAll(key:String):List[String] "Permalink")  def getAll(key: String): List\[String]
71. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
72. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#getOrElse(key:String,default:=>String):String "Permalink")  def getOrElse(key: String, default: \=\> String): String
73. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#groupBy[K](f:A=>K):scala.collection.immutable.Map[K,C] "Permalink")  def groupBy\[K](f: ((String, String)) \=\> K): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, Query]Definition ClassesIterableOps
74. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#groupMap[K,B](key:A=>K)(f:A=>B):scala.collection.immutable.Map[K,CC[B]] "Permalink")  def groupMap\[K, B](key: ((String, String)) \=\> K)(f: ((String, String)) \=\> B): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]]Definition ClassesIterableOps
75. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#groupMapReduce[K,B](key:A=>K)(f:A=>B)(reduce:(B,B)=>B):scala.collection.immutable.Map[K,B] "Permalink")  def groupMapReduce\[K, B](key: ((String, String)) \=\> K)(f: ((String, String)) \=\> B)(reduce: (B, B) \=\> B): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, B]Definition ClassesIterableOps
76. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#grouped(size:Int):Iterator[C] "Permalink")  def grouped(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesIterableOps
77. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeq → AnyRef → Any
78. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#head:A "Permalink")  def head: (String, String)Definition ClassesIterableOps
79. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#headOption:Option[A] "Permalink")  def headOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesLinearSeqOps → IterableOps
80. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indexOf[B>:A](elem:B):Int "Permalink")  def indexOf\[B \>: (String, String)](elem: B): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
81. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indexOf[B>:A](elem:B,from:Int):Int "Permalink")  def indexOf\[B \>: (String, String)](elem: B, from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
82. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indexOfSlice[B>:A](that:scala.collection.Seq[B]):Int "Permalink")  def indexOfSlice\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
83. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indexOfSlice[B>:A](that:scala.collection.Seq[B],from:Int):Int "Permalink")  def indexOfSlice\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B], from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
84. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indexWhere(p:A=>Boolean,from:Int):Int "Permalink")  def indexWhere(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinearSeqOps → SeqOps
85. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indexWhere(p:A=>Boolean):Int "Permalink")  def indexWhere(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
86. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#indices:scala.collection.immutable.Range "Permalink")  def indices: [Range](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Range.html#scala.collection.immutable.Range)Definition ClassesSeqOps
87. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#init:C "Permalink")  def init: QueryDefinition ClassesIterableOps
88. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#inits:Iterator[C] "Permalink")  def inits: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesIterableOps
89. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#intersect[B>:A](that:scala.collection.Seq[B]):C "Permalink")  def intersect\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): QueryDefinition ClassesStrictOptimizedSeqOps → SeqOps
90. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#isDefinedAt(x:Int):Boolean "Permalink")  def isDefinedAt(x: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinearSeqOps → SeqOps
91. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps → IterableOnceOps
92. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
93. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#isTraversableAgain:Boolean "Permalink")  def isTraversableAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOps → IterableOnceOps
94. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#iterableFactory:scala.collection.SeqFactory[scala.collection.immutable.LinearSeq] "Permalink")  def iterableFactory: [SeqFactory](https://www.scala-lang.org/api/2.13.17/scala/collection/SeqFactory.html#scala.collection.SeqFactory)\[[LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)]Definition ClassesLinearSeq → LinearSeq → Seq → Seq → Iterable → Iterable → IterableOps
95. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#iterator:Iterator[A] "Permalink")  def iterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(String, String)]Definition ClassesStrictOptimizedLinearSeqOps → LinearSeqOps → IterableOnce
96. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#knownSize:Int "Permalink")  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnce
97. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#last:A "Permalink")  def last: (String, String)Definition ClassesLinearSeqOps → IterableOps
98. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lastIndexOf[B>:A](elem:B,end:Int):Int "Permalink")  def lastIndexOf\[B \>: (String, String)](elem: B, end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
99. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lastIndexOfSlice[B>:A](that:scala.collection.Seq[B]):Int "Permalink")  def lastIndexOfSlice\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
100. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lastIndexOfSlice[B>:A](that:scala.collection.Seq[B],end:Int):Int "Permalink")  def lastIndexOfSlice\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B], end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
101. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lastIndexWhere(p:A=>Boolean,end:Int):Int "Permalink")  def lastIndexWhere(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinearSeqOps → SeqOps
102. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lastIndexWhere(p:A=>Boolean):Int "Permalink")  def lastIndexWhere(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
103. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lastOption:Option[A] "Permalink")  def lastOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesIterableOps
104. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lazyZip[B](that:Iterable[B]):scala.collection.LazyZip2[A,B,Iterable.this.type] "Permalink")  def lazyZip\[B](that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B]): LazyZip2\[(String, String), B, Query.this.type]Definition ClassesIterable
105. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#length:Int "Permalink")  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinearSeqOps → SeqOps
106. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lengthCompare(that:Iterable[_]):Int "Permalink")  def lengthCompare(that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[\_]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinearSeqOps → SeqOps
107. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lengthCompare(len:Int):Int "Permalink")  def lengthCompare(len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinearSeqOps → SeqOps
108. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lengthIs:scala.collection.IterableOps.SizeCompareOps "Permalink") final  def lengthIs: SizeCompareOpsDefinition ClassesSeqOpsAnnotations@inline()
109. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#lift:A=>Option[B] "Permalink")  def lift: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesPartialFunction
110. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#map[B](f:A=>B):CC[B] "Permalink")  def map\[B](f: ((String, String)) \=\> B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
111. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#max[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def max\[B \>: (String, String)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): (String, String)Definition ClassesIterableOnceOps
112. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#maxBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ((String, String)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): (String, String)Definition ClassesIterableOnceOps
113. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#maxByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxByOption\[B](f: ((String, String)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesIterableOnceOps
114. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#maxOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxOption\[B \>: (String, String)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesIterableOnceOps
115. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#min[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def min\[B \>: (String, String)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): (String, String)Definition ClassesIterableOnceOps
116. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#minBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ((String, String)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): (String, String)Definition ClassesIterableOnceOps
117. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#minByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minByOption\[B](f: ((String, String)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesIterableOnceOps
118. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#minOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minOption\[B \>: (String, String)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesIterableOnceOps
119. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#mkString:String "Permalink") final  def mkString: StringDefinition ClassesIterableOnceOpsAnnotations@inline()
120. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#mkString(sep:String):String "Permalink") final  def mkString(sep: String): StringDefinition ClassesIterableOnceOpsAnnotations@inline()
121. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#mkString(start:String,sep:String,end:String):String "Permalink") final  def mkString(start: String, sep: String, end: String): StringDefinition ClassesIterableOnceOps
122. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
123. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#newSpecificBuilder:akka.http.ccompat.Builder[(String,String),akka.http.scaladsl.model.Uri.Query] "Permalink")  def newSpecificBuilder: [Builder](../../ccompat/index.html#Builder[-A,+To]=scala.collection.mutable.Builder[A,To])\[(String, String), Query]Attributesprotected Definition Classes[QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html) → IterableFactoryDefaults → IterableOps
124. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
125. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
126. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
127. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#occCounts[B](sq:scala.collection.Seq[B]):scala.collection.mutable.Map[B,Int] "Permalink")  def occCounts\[B](sq: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Map.html#scala.collection.mutable.Map)\[B, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Attributesprotected\[[collection](https://www.scala-lang.org/api/2.13.17/scala/collection/index.html#scala.collection)] Definition ClassesSeqOps
128. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), B1 \>: (String, String)](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
129. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#padTo[B>:A](len:Int,elem:B):CC[B] "Permalink")  def padTo\[B \>: (String, String)](len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), elem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
130. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#partition(p:A=>Boolean):(C,C) "Permalink")  def partition(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): (Query, Query)Definition ClassesStrictOptimizedIterableOps → IterableOps
131. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#partitionMap[A1,A2](f:A=>Either[A1,A2]):(CC[A1],CC[A2]) "Permalink")  def partitionMap\[A1, A2](f: ((String, String)) \=\> Either\[A1, A2]): ([LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A1], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A2])Definition ClassesStrictOptimizedIterableOps → IterableOps
132. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#patch[B>:A](from:Int,other:scala.collection.IterableOnce[B],replaced:Int):CC[B] "Permalink")  def patch\[B \>: (String, String)](from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), other: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], replaced: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOps
133. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#permutations:Iterator[C] "Permalink")  def permutations: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesSeqOps
134. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#prepended[B>:A](elem:B):CC[B] "Permalink")  def prepended\[B \>: (String, String)](elem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
135. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#prependedAll[B>:A](prefix:scala.collection.IterableOnce[B]):CC[B] "Permalink")  def prependedAll\[B \>: (String, String)](prefix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
136. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#product[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def product\[B \>: (String, String)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
137. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduce[B>:A](op:(B,B)=>B):B "Permalink")  def reduce\[B \>: (String, String)](op: (B, B) \=\> B): BDefinition ClassesIterableOnceOps
138. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceLeft[B>:A](op:(B,A)=>B):B "Permalink")  def reduceLeft\[B \>: (String, String)](op: (B, (String, String)) \=\> B): BDefinition ClassesIterableOnceOps
139. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceLeftOption[B>:A](op:(B,A)=>B):Option[B] "Permalink")  def reduceLeftOption\[B \>: (String, String)](op: (B, (String, String)) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
140. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceOption[B>:A](op:(B,B)=>B):Option[B] "Permalink")  def reduceOption\[B \>: (String, String)](op: (B, B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
141. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceRight[B>:A](op:(A,B)=>B):B "Permalink")  def reduceRight\[B \>: (String, String)](op: ((String, String), B) \=\> B): BDefinition ClassesIterableOnceOps
142. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceRightOption[B>:A](op:(A,B)=>B):Option[B] "Permalink")  def reduceRightOption\[B \>: (String, String)](op: ((String, String), B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
143. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reverse:C "Permalink")  def reverse: QueryDefinition ClassesSeqOps
144. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reverseIterator:Iterator[A] "Permalink")  def reverseIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(String, String)]Definition ClassesSeqOps
145. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reversed:Iterable[A] "Permalink")  def reversed: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[(String, String)]Attributesprotected Definition ClassesIterableOnceOps
146. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ((String, String)) \=\> U): ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
147. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: (String, String)](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLinearSeqOps → SeqOps
148. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#scan[B>:A](z:B)(op:(B,B)=>B):CC[B] "Permalink")  def scan\[B \>: (String, String)](z: B)(op: (B, B) \=\> B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesIterableOps
149. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#scanLeft[B](z:B)(op:(B,A)=>B):CC[B] "Permalink")  def scanLeft\[B](z: B)(op: (B, (String, String)) \=\> B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
150. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#scanRight[B](z:B)(op:(A,B)=>B):CC[B] "Permalink")  def scanRight\[B](z: B)(op: ((String, String), B) \=\> B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesIterableOps
151. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#search[B>:A](elem:B,from:Int,to:Int)(implicitord:Ordering[B]):scala.collection.Searching.SearchResult "Permalink")  def search\[B \>: (String, String)](elem: B, from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), to: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit ord: Ordering\[B]): SearchResultDefinition ClassesSeqOps
152. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#search[B>:A](elem:B)(implicitord:Ordering[B]):scala.collection.Searching.SearchResult "Permalink")  def search\[B \>: (String, String)](elem: B)(implicit ord: Ordering\[B]): SearchResultDefinition ClassesSeqOps
153. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#segmentLength(p:A=>Boolean,from:Int):Int "Permalink")  def segmentLength(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLinearSeqOps → SeqOps
154. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#segmentLength(p:A=>Boolean):Int "Permalink") final  def segmentLength(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
155. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#size:Int "Permalink") final  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps → IterableOnceOps
156. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sizeCompare(that:Iterable[_]):Int "Permalink") final  def sizeCompare(that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[\_]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps → IterableOps
157. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sizeCompare(otherSize:Int):Int "Permalink") final  def sizeCompare(otherSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps → IterableOps
158. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sizeIs:scala.collection.IterableOps.SizeCompareOps "Permalink") final  def sizeIs: SizeCompareOpsDefinition ClassesIterableOpsAnnotations@inline()
159. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#slice(from:Int,until:Int):C "Permalink")  def slice(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): QueryDefinition ClassesIterableOps → IterableOnceOps
160. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sliding(size:Int,step:Int):Iterator[C] "Permalink")  def sliding(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesIterableOps
161. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sliding(size:Int):Iterator[C] "Permalink")  def sliding(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesIterableOps
162. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sortBy[B](f:A=>B)(implicitord:Ordering[B]):C "Permalink")  def sortBy\[B](f: ((String, String)) \=\> B)(implicit ord: Ordering\[B]): QueryDefinition ClassesSeqOps
163. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sortWith(lt:(A,A)=>Boolean):C "Permalink")  def sortWith(lt: ((String, String), (String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryDefinition ClassesSeqOps
164. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sorted[B>:A](implicitord:Ordering[B]):C "Permalink")  def sorted\[B \>: (String, String)](implicit ord: Ordering\[B]): QueryDefinition ClassesSeqOps
165. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#span(p:A=>Boolean):(C,C) "Permalink")  def span(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): (Query, Query)Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
166. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#splitAt(n:Int):(C,C) "Permalink")  def splitAt(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): (Query, Query)Definition ClassesIterableOps → IterableOnceOps
167. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#startsWith[B>:A](that:scala.collection.IterableOnce[B],offset:Int):Boolean "Permalink")  def startsWith\[B \>: (String, String)](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
168. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):S "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[(String, String), S]): SDefinition ClassesIterableOnce
169. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#strictOptimizedCollect[B,C2](b:scala.collection.mutable.Builder[B,C2],pf:PartialFunction[A,B]):C2 "Permalink") final  def strictOptimizedCollect\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2], pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(String, String), B]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
170. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#strictOptimizedConcat[B>:A,C2](that:scala.collection.IterableOnce[B],b:scala.collection.mutable.Builder[B,C2]):C2 "Permalink") final  def strictOptimizedConcat\[B \>: (String, String), C2](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
171. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#strictOptimizedFlatMap[B,C2](b:scala.collection.mutable.Builder[B,C2],f:A=>scala.collection.IterableOnce[B]):C2 "Permalink") final  def strictOptimizedFlatMap\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2], f: ((String, String)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
172. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#strictOptimizedFlatten[B,C2](b:scala.collection.mutable.Builder[B,C2])(implicittoIterableOnce:A=>scala.collection.IterableOnce[B]):C2 "Permalink") final  def strictOptimizedFlatten\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2])(implicit toIterableOnce: ((String, String)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
173. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#strictOptimizedMap[B,C2](b:scala.collection.mutable.Builder[B,C2],f:A=>B):C2 "Permalink") final  def strictOptimizedMap\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2], f: ((String, String)) \=\> B): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
174. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#strictOptimizedZip[B,C2](that:scala.collection.IterableOnce[B],b:scala.collection.mutable.Builder[(A,B),C2]):C2 "Permalink") final  def strictOptimizedZip\[B, C2](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[((String, String), B), C2]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
175. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#stringPrefix:String "Permalink")  def stringPrefix: StringAttributesprotected\[this] Definition ClassesLinearSeq → Seq → Iterable
176. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sum[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def sum\[B \>: (String, String)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
177. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
178. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#tail:C "Permalink")  def tail: QueryDefinition ClassesIterableOps
179. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#tails:Iterator[C] "Permalink")  def tails: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[Query]Definition ClassesLinearSeqOps → IterableOps
180. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#take(n:Int):C "Permalink")  def take(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): QueryDefinition ClassesIterableOps → IterableOnceOps
181. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#takeRight(n:Int):C "Permalink")  def takeRight(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): QueryDefinition ClassesStrictOptimizedIterableOps → IterableOps
182. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#takeWhile(p:A=>Boolean):C "Permalink")  def takeWhile(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueryDefinition ClassesIterableOps → IterableOnceOps
183. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#tapEach[U](f:A=>U):C "Permalink")  def tapEach\[U](f: ((String, String)) \=\> U): QueryDefinition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
184. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[(String, String), C1]): C1Definition ClassesIterableOnceOps
185. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toArray[B>:A](implicitevidence$2:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: (String, String)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]Definition ClassesIterableOnceOps
186. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink") final  def toBuffer\[B \>: (String, String)]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]Definition ClassesIterableOnceOpsAnnotations@inline()
187. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toIndexedSeq:IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[(String, String)]Definition ClassesIterableOnceOps
188. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[(String, String)]Definition ClassesIterableOnceOps
189. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toMap:Map[String,String] "Permalink")  def toMap: Map\[String, String]
190. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[(String, String), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]Definition ClassesIterableOnceOps
191. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toMultiMap:Map[String,List[String]] "Permalink")  def toMultiMap: Map\[String, List\[String]]Returns this query as a map where keys can have multiple values.

Returns this query as a map where keys can have multiple values. The parameter order is
preserved, so that the following query:

```
a=1&a=2&a=3&a=4&b=1
```
Will return a map like:

```
"a" -> List(1, 2, 3, 4),
"b" -> List(1)
```
192. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toSeq:Seq.this.type "Permalink") final  def toSeq: Query.this.typeDefinition ClassesSeq → IterableOnceOps
193. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: (String, String)]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]Definition ClassesIterableOnceOps
194. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toString():String "Permalink")  def toString(): StringDefinition ClassesQuery → Seq → Function1 → Iterable → AnyRef → Any
195. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[(String, String)]Definition ClassesIterableOnceOps
196. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#transpose[B](implicitasIterable:A=>Iterable[B]):CC[CC[B]@scala.annotation.unchecked.uncheckedVariance] "Permalink")  def transpose\[B](implicit asIterable: ((String, String)) \=\> [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[[LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]]Definition ClassesIterableOps
197. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]Definition ClassesPartialFunction
198. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#unzip[A1,A2](implicitasPair:A=>(A1,A2)):(CC[A1],CC[A2]) "Permalink")  def unzip\[A1, A2](implicit asPair: ((String, String)) \=\> (A1, A2)): ([LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A1], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A2])Definition ClassesStrictOptimizedIterableOps → IterableOps
199. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#unzip3[A1,A2,A3](implicitasTriple:A=>(A1,A2,A3)):(CC[A1],CC[A2],CC[A3]) "Permalink")  def unzip3\[A1, A2, A3](implicit asTriple: ((String, String)) \=\> (A1, A2, A3)): ([LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A1], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A2], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[A3])Definition ClassesStrictOptimizedIterableOps → IterableOps
200. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#updated[B>:A](index:Int,elem:B):CC[B] "Permalink")  def updated\[B \>: (String, String)](index: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), elem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOps
201. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#view:scala.collection.SeqView[A] "Permalink")  def view: SeqView\[(String, String)]Definition ClassesSeqOps → IterableOps
202. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
203. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
204. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
205. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#withFilter(p:A=>Boolean):scala.collection.WithFilter[A,CC] "Permalink")  def withFilter(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [WithFilter](https://www.scala-lang.org/api/2.13.17/scala/collection/WithFilter.html#scala.collection.WithFilter)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_]]Definition ClassesIterableOps
206. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#zip[B](that:scala.collection.IterableOnce[B]):CC[(A@scala.annotation.unchecked.uncheckedVariance,B)] "Permalink")  def zip\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[((String, String), B)]Definition ClassesStrictOptimizedIterableOps → IterableOps
207. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#zipAll[A1>:A,B](that:Iterable[B],thisElem:A1,thatElem:B):CC[(A1,B)] "Permalink")  def zipAll\[A1 \>: (String, String), B](that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B], thisElem: A1, thatElem: B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(A1, B)]Definition ClassesIterableOps
208. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#zipWithIndex:CC[(A@scala.annotation.unchecked.uncheckedVariance,Int)] "Permalink")  def zipWithIndex: [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[((String, String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink")  def /:\[B](z: B)(op: (B, (String, String)) \=\> B): BImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)])./:(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
2. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink") final  def /:\[B](z: B)(op: (B, (String, String)) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldLeft instead of /:
3. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink")  def :\\\[B](z: B)(op: ((String, String), B) \=\> B): BImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).:\(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
4. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink") final  def :\\\[B](z: B)(op: ((String, String), B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldRight instead of :\\
5. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B "Permalink")  def aggregate\[B](z: \=\> B)(seqop: (B, (String, String)) \=\> B, combop: (B, B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* For sequential collections, prefer `foldLeft(z)(seqop)`. For parallel collections, use `ParIterableLike#aggregate`.
6. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#collectFirst[B](f:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(String, String), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).collectFirst(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.collectFirst(...) instead
7. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#companion:scala.collection.IterableFactory[CC] "Permalink")  def companion: [IterableFactory](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableFactory.html#scala.collection.IterableFactory)\[\[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_]]Definition ClassesIterableOpsAnnotations@deprecated @deprecatedOverriding() @inline() Deprecated*(Since version 2\.13\.0\)* Use iterableFactory instead
8. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#copyToBuffer(dest:scala.collection.mutable.Buffer[A]):Unit "Permalink")  def copyToBuffer(dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[(String, String)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).copyToBuffer(dest)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.copyToBuffer(...) instead
9. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#copyToBuffer[B>:A](dest:scala.collection.mutable.Buffer[B]):Unit "Permalink") final  def copyToBuffer\[B \>: (String, String)](dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `dest ++= coll` instead
10. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#count(f:A=>Boolean):Int "Permalink")  def count(f: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).count(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.count(...) instead
11. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#exists(f:A=>Boolean):Boolean "Permalink")  def exists(f: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).exists(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.exists(...) instead
12. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#filter(f:A=>Boolean):Iterator[A] "Permalink")  def filter(f: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).filter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.filter(...) instead
13. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
14. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).find(p)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.find instead
15. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):scala.collection.IterableOnce[B] "Permalink")  def flatMap\[B](f: ((String, String)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).flatMap(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.flatMap instead or consider requiring an Iterable
16. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: A](z: A1)(op: (A1, A1) \=\> A1): A1ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).fold(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.fold instead
17. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#foldLeft[B](z:B)(op:(B,A)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, (String, String)) \=\> B): BImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).foldLeft(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
18. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ((String, String), B) \=\> B): BImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).foldRight(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
19. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#forall(f:A=>Boolean):Boolean "Permalink")  def forall(f: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).forall(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.forall(...) instead
20. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#foreach[U](f:A=>U):Unit "Permalink")  def foreach\[U](f: ((String, String)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).foreach(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foreach(...) instead
21. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Query toStringFormat\[Query] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
22. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#hasDefiniteSize:Boolean "Permalink")  def hasDefiniteSize: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Check .knownSize instead of .hasDefiniteSize for more actionable information (see scaladoc for details)
23. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).isEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.isEmpty instead
24. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#map[B](f:A=>B):scala.collection.IterableOnce[B] "Permalink")  def map\[B](f: ((String, String)) \=\> B): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).map(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.map instead or consider requiring an Iterable
25. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#max(implicitord:scala.math.Ordering[A]):A "Permalink")  def max(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[(String, String)]): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).max(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.max instead
26. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#maxBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ((String, String)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).maxBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.maxBy(...) instead
27. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#min(implicitord:scala.math.Ordering[A]):A "Permalink")  def min(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[(String, String)]): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).min(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.min instead
28. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#minBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ((String, String)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).minBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.minBy(...) instead
29. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#mkString:String "Permalink")  def mkString: StringImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).mkString
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
30. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#mkString(sep:String):String "Permalink")  def mkString(sep: String): StringImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).mkString(sep)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
31. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#mkString(start:String,sep:String,end:String):String "Permalink")  def mkString(start: String, sep: String, end: String): StringImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).mkString(start, sep, end)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
32. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).nonEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.nonEmpty instead
33. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#prefixLength(p:A=>Boolean):Int "Permalink") final  def prefixLength(p: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use segmentLength instead of prefixLength
34. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#product(implicitnum:scala.math.Numeric[A]):A "Permalink")  def product(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[(String, String)]): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).product(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.product instead
35. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduce(f:(A,A)=>A):A "Permalink")  def reduce(f: ((String, String), (String, String)) \=\> (String, String)): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).reduce(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduce(...) instead
36. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceLeft(f:(A,A)=>A):A "Permalink")  def reduceLeft(f: ((String, String), (String, String)) \=\> (String, String)): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).reduceLeft(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeft(...) instead
37. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceLeftOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceLeftOption(f: ((String, String), (String, String)) \=\> (String, String)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).reduceLeftOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeftOption(...) instead
38. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceOption(f: ((String, String), (String, String)) \=\> (String, String)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).reduceOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceOption(...) instead
39. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceRight(f:(A,A)=>A):A "Permalink")  def reduceRight(f: ((String, String), (String, String)) \=\> (String, String)): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).reduceRight(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRight(...) instead
40. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reduceRightOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceRightOption(f: ((String, String), (String, String)) \=\> (String, String)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).reduceRightOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRightOption(...) instead
41. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#repr:C "Permalink") final  def repr: QueryDefinition ClassesIterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use coll instead of repr in a collection implementation, use the collection value itself from the outside
42. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#reverseMap[B](f:A=>B):CC[B] "Permalink")  def reverseMap\[B](f: ((String, String)) \=\> B): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .reverseIterator.map(f).to(...) instead of .reverseMap(f)
43. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: A](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).sameElements(that)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sameElements instead
44. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#seq:Iterable.this.type "Permalink")  def seq: Query.this.typeDefinition ClassesIterableAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Iterable.seq always returns the iterable itself
45. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).size
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.size instead
46. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#sum(implicitnum:scala.math.Numeric[A]):A "Permalink")  def sum(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[(String, String)]): (String, String)ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).sum(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sum instead
47. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[(String, String), C1]): C1ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).to(factory)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(factory) instead
48. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toArray[B>:A](implicitevidence$1:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: A](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toArray(arg0)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toArray
49. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink")  def toBuffer\[B \>: A]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toBuffer
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(ArrayBuffer) instead
50. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toIndexedSeq:scala.collection.IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeq.html#scala.collection.IndexedSeq)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toIndexedSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toIndexedSeq instead
51. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toIterable:Iterable[A] "Permalink") final  def toIterable: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toIterable
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
52. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toIterable:Iterable.this.type "Permalink") final  def toIterable: Query.this.typeDefinition ClassesIterable → IterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.7\)* toIterable is internal and will be made protected; its name is similar to `toList` or `toSeq`, but it doesn't copy non\-immutable collections
53. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toIterator:Iterator[A] "Permalink")  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toIterator
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead
54. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toIterator:Iterator[A] "Permalink") final  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(String, String)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead of .toIterator
55. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toList
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(List) instead
56. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[(String, String), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toMap(ev)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Map) instead
57. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toSeq:Seq[A] "Permalink")  def toSeq: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Seq) instead
58. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: A]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toSet
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Set) instead
59. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toStream:scala.collection.immutable.Stream[A] "Permalink")  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toStream
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(LazyList) instead
60. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toStream:scala.collection.immutable.Stream[A] "Permalink") final  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[(String, String)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .to(LazyList) instead of .toStream
61. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toTraversable:scala.collection.Traversable[A] "Permalink") final  def toTraversable: Traversable\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toTraversable
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
62. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toTraversable:scala.collection.Traversable[A] "Permalink") final  def toTraversable: Traversable\[(String, String)]Definition ClassesIterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* toTraversable is internal and will be made protected; its name is similar to `toList` or `toSeq`, but it doesn't copy non\-immutable collections
63. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).toVector
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Vector) instead
64. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#union[B>:A](that:scala.collection.Seq[B]):CC[B] "Permalink") final  def union\[B \>: (String, String)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[B]Definition ClassesSeqOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `concat` instead
65. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#view(from:Int,until:Int):scala.collection.View[A] "Permalink")  def view(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [View](https://www.scala-lang.org/api/2.13.17/scala/collection/View.html#scala.collection.View)\[(String, String)]Definition ClassesIterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .view.slice(from, until) instead of .view(from, until)
66. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#withFilter(f:A=>Boolean):Iterator[A] "Permalink")  def withFilter(f: ((String, String)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(String, String)]ImplicitThis member is added by an implicit conversion from Query to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(query: IterableOnceExtensionMethods[(String, String)]).withFilter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.withFilter(...) instead
67. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Query, B)ImplicitThis member is added by an implicit conversion from Query toArrowAssoc\[Query] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html)

### Inherited from [StrictOptimizedLinearSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedLinearSeqOps.html#scala.collection.StrictOptimizedLinearSeqOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), Query]

### Inherited from [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedSeqOps.html#scala.collection.StrictOptimizedSeqOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), Query]

### Inherited from [StrictOptimizedIterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedIterableOps.html#scala.collection.StrictOptimizedIterableOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), Query]

### Inherited from [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(String, String)]

### Inherited from [LinearSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeqOps.html#scala.collection.immutable.LinearSeqOps)\[(String, String), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq), [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(String, String)]]

### Inherited from [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/LinearSeq.html#scala.collection.LinearSeq)\[(String, String)]

### Inherited from [LinearSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/LinearSeqOps.html#scala.collection.LinearSeqOps)\[(String, String), \[X][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[X], Query]

### Inherited from [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, String)]

### Inherited from [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SeqOps.html#scala.collection.immutable.SeqOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], [LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[(String, String)]]

### Inherited from [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[(String, String)]

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/SeqOps.html#scala.collection.SeqOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], Query]

### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), (String, String)]

### Inherited from ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> (String, String)

### Inherited from [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[(String, String)]

### Inherited from [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[(String, String)]

### Inherited from [IterableFactoryDefaults](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableFactoryDefaults.html#scala.collection.IterableFactoryDefaults)\[(String, String), \[x][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[x]]

### Inherited from [IterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOps.html#scala.collection.IterableOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], Query]

### Inherited from [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[(String, String), \[\_][LinearSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/LinearSeq.html#scala.collection.immutable.LinearSeq)\[\_], Query]

### Inherited from [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[(String, String)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion iterableOnceExtensionMethods fromQuery to [IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[(String, String)]

### Inherited by implicit conversion any2stringadd fromQuery to any2stringadd\[Query]

### Inherited by implicit conversion StringFormat fromQuery to StringFormat\[Query]

### Inherited by implicit conversion Ensuring fromQuery to Ensuring\[Query]

### Inherited by implicit conversion ArrowAssoc fromQuery to ArrowAssoc\[Query]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/ccompat/QuerySeqOptimized.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/ccompat/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Empty$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv4Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv4Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv6Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv6Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NamedHost.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NonEmptyHost.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$ParsingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$ParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query$$Cons.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query$$Empty$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query.html)*