---
description: Akka 2.10.17 - akka.util.ByteIterator.ByteArrayIterator
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:19:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ByteIterator$$ByteArrayIterator.html
title: Akka 2.10.17 - akka.util.ByteIterator.ByteArrayIterator
---

# Akka 2.10.17 - akka.util.ByteIterator.ByteArrayIterator

> **Summary:** Akka 2.10.17 - akka.util.ByteIterator.ByteArrayIterator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/ByteIterator$.html "Permalink")  object [ByteIterator](ByteIterator$.html)Definition Classes[util](index.html)
- ByteArrayIterator
- [MultiByteArrayIterator](ByteIterator$$MultiByteArrayIterator.html)
[c](ByteIterator$$ByteArrayIterator$.html "See companion object")[akka](../index.html).[util](index.html).[ByteIterator](ByteIterator$.html)

# [ByteArrayIterator](ByteIterator$$ByteArrayIterator$.html "See companion object")[**](../../akka/util/ByteIterator$$ByteArrayIterator.html "Permalink")

### Companion [object ByteArrayIterator](ByteIterator$$ByteArrayIterator$.html "See companion object")

#### class ByteArrayIterator extends [ByteIterator](ByteIterator.html)

Self TypeByteArrayIteratorSource[ByteIterator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala-2.13/akka/util/ByteIterator.scala#L30)Linear Supertypes[ByteIterator](ByteIterator.html), [BufferedIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/BufferedIterator.html#scala.collection.BufferedIterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]], [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ByteArrayIterator
2. ByteIterator
3. BufferedIterator
4. Iterator
5. IterableOnceOps
6. IterableOnce
7. AnyRef
8. Any
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
### Type Members

1. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#GroupedIterator[B>:A]extendsAbstractIterator[Seq[B]] "Permalink")  class GroupedIterator\[B \>: A] extends [AbstractIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/AbstractIterator.html#scala.collection.AbstractIterator)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[B]]Definition ClassesIterator
### Value Members

1. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ByteArrayIterator toany2stringadd\[ByteArrayIterator] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#++(that:IterableOnce[Byte]):akka.util.ByteIterator "Permalink") final  def \+\+(that: IterableOnce\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ByteIterator](ByteIterator.html)Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
5. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#++[B>:A](xs:=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink") final  def \+\+\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIteratorAnnotations@inline()
6. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ByteArrayIterator, B)ImplicitThis member is added by an implicit conversion from ByteArrayIterator toArrowAssoc\[ByteArrayIterator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
7. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#addString(b:StringBuilder):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder)): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
9. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#addString(b:StringBuilder,sep:String):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), sep: String): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
10. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#addString(b:StringBuilder,start:String,sep:String,end:String):b.type "Permalink")  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), start: String, sep: String, end: String): b.typeDefinition ClassesIterableOnceOps
11. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#asInputStream:java.io.InputStream "Permalink")  def asInputStream: [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)Directly wraps this ByteIterator in an InputStream without copying.

Directly wraps this ByteIterator in an InputStream without copying.
Read and skip operations on the stream will advance the iterator
accordingly.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
12. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#buffered:BufferedIterator.this.type "Permalink")  def buffered: ByteArrayIterator.this.typeDefinition ClassesBufferedIterator → Iterator
14. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
15. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#clone():akka.util.ByteIterator.ByteArrayIterator "Permalink") final  def clone(): ByteArrayIteratorDefinition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → AnyRef
16. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#collect[B](pf:PartialFunction[A,B]):Iterator[B] "Permalink")  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
17. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#collectFirst[B](pf:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
18. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#concat[B>:A](xs:=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink")  def concat\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator
19. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#contains(elem:Any):Boolean "Permalink")  def contains(elem: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator
20. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#copyToArray[B>:Byte](xs:Array[B],start:Int,len:Int):Int "Permalink") final  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteArrayIterator → IterableOnceOps
21. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#copyToArray[B>:Byte](xs:Array[B]):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteArrayIterator → IterableOnceOpsAnnotations@nowarn()
22. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#copyToArray[B>:Byte](xs:Array[B],start:Int):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteArrayIterator → IterableOnceOpsAnnotations@nowarn()
23. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#copyToBuffer(buffer:java.nio.ByteBuffer):Int "Permalink")  def copyToBuffer(buffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)For performance sensitive code, call take() directly on ByteString (it's optimised there)

For performance sensitive code, call take() directly on ByteString (it's optimised there)

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
24. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#corresponds[B](that:scala.collection.IterableOnce[B])(p:(A,B)=>Boolean):Boolean "Permalink")  def corresponds\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B])(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
25. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#count(p:A=>Boolean):Int "Permalink")  def count(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
26. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#distinct:Iterator[A] "Permalink")  def distinct: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
27. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#distinctBy[B](f:A=>B):Iterator[A] "Permalink")  def distinctBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
28. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#drop(n:Int):ByteArrayIterator.this.type "Permalink") final  def drop(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteArrayIterator.this.typeDefinition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → Iterator → IterableOnceOps
29. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#dropWhile(p:Byte=>Boolean):ByteArrayIterator.this.type "Permalink") final  def dropWhile(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteArrayIterator.this.typeDefinition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → Iterator → IterableOnceOps
30. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#duplicate:(akka.util.ByteIterator,akka.util.ByteIterator) "Permalink")  def duplicate: ([ByteIterator](ByteIterator.html), [ByteIterator](ByteIterator.html))Definition Classes[ByteIterator](ByteIterator.html) → Iterator
31. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ByteArrayIterator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteArrayIteratorImplicitThis member is added by an implicit conversion from ByteArrayIterator toEnsuring\[ByteArrayIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
32. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ByteArrayIterator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteArrayIteratorImplicitThis member is added by an implicit conversion from ByteArrayIterator toEnsuring\[ByteArrayIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
33. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteArrayIteratorImplicitThis member is added by an implicit conversion from ByteArrayIterator toEnsuring\[ByteArrayIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
34. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteArrayIteratorImplicitThis member is added by an implicit conversion from ByteArrayIterator toEnsuring\[ByteArrayIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
35. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
37. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#exists(p:A=>Boolean):Boolean "Permalink")  def exists(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
38. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#filter(p:A=>Boolean):Iterator[A] "Permalink")  def filter(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceOps
39. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#filterNot(p:A=>Boolean):Iterator[A] "Permalink")  def filterNot(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceOps
40. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
41. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink")  def flatMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
42. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#flatten[B](implicitev:A=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink")  def flatten\[B](implicit ev: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
43. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](z: A1)(op: (A1, A1) \=\> A1): A1Definition ClassesIterableOnceOps
44. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#foldLeft[B](z:B)(op:(B,Byte)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition Classes[ByteIterator](ByteIterator.html) → IterableOnceOps
45. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOps
46. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#forall(p:A=>Boolean):Boolean "Permalink")  def forall(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
47. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#foreach[U](f:Byte=>U):Unit "Permalink")  def foreach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ByteIterator](ByteIterator.html) → IterableOnceOps
48. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getByte:Byte "Permalink")  def getByte: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Get a single Byte from this iterator.

Get a single Byte from this iterator. Identical to next().

Definition Classes[ByteIterator](ByteIterator.html)
49. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getByteString(n:Int):akka.util.ByteString "Permalink")  def getByteString(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Get a ByteString with specific number of Bytes from this iterator.

Get a ByteString with specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if this.len \< n.

Definition Classes[ByteIterator](ByteIterator.html)
50. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getBytes(xs:Array[Byte],offset:Int,n:Int):ByteArrayIterator.this.type "Permalink")  def getBytes(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteArrayIterator.this.typeGet a specific number of Bytes from this iterator.

Get a specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if length \< n or if (xs.length \- offset) \< n.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)Annotations@throws("")
51. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getBytes(n:Int):Array[Byte] "Permalink")  def getBytes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Get a specific number of Bytes from this iterator.

Get a specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if this.len \< n.

Definition Classes[ByteIterator](ByteIterator.html)
52. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getBytes(xs:Array[Byte]):ByteIterator.this.type "Permalink")  def getBytes(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): ByteArrayIterator.this.typeGet a specific number of Bytes from this iterator.

Get a specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if this.len \< xs.length.

Definition Classes[ByteIterator](ByteIterator.html)
53. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getDouble(implicitbyteOrder:java.nio.ByteOrder):Double "Permalink")  def getDouble(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)Definition Classes[ByteIterator](ByteIterator.html)
55. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getDoubles(xs:Array[Double],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteArrayIterator.this.type "Permalink")  def getDoubles(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Doubles from this iterator.

Get a number of Doubles from this iterator.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
56. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getDoubles(xs:Array[Double])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getDoubles(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Doubles from this iterator.

Get a number of Doubles from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
57. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getFloat(implicitbyteOrder:java.nio.ByteOrder):Float "Permalink")  def getFloat(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)Definition Classes[ByteIterator](ByteIterator.html)
58. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getFloats(xs:Array[Float],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteArrayIterator.this.type "Permalink")  def getFloats(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Floats from this iterator.

Get a number of Floats from this iterator.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
59. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getFloats(xs:Array[Float])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getFloats(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Floats from this iterator.

Get a number of Floats from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
60. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getInt(implicitbyteOrder:java.nio.ByteOrder):Int "Permalink")  def getInt(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Get a single Int from this iterator.

Get a single Int from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
61. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getInts(xs:Array[Int],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteArrayIterator.this.type "Permalink")  def getInts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Ints from this iterator.

Get a number of Ints from this iterator.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
62. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getInts(xs:Array[Int])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getInts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Ints from this iterator.

Get a number of Ints from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
63. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getLong(implicitbyteOrder:java.nio.ByteOrder):Long "Permalink")  def getLong(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Get a single Long from this iterator.

Get a single Long from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
64. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getLongPart(n:Int)(implicitbyteOrder:java.nio.ByteOrder):Long "Permalink")  def getLongPart(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Get a Long from this iterator where only the least significant `n`
bytes were encoded.

Get a Long from this iterator where only the least significant `n`
bytes were encoded.

Definition Classes[ByteIterator](ByteIterator.html)
65. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getLongs(xs:Array[Long],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteArrayIterator.this.type "Permalink")  def getLongs(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Longs from this iterator.

Get a number of Longs from this iterator.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
66. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getLongs(xs:Array[Long])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getLongs(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Longs from this iterator.

Get a number of Longs from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
67. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getShort(implicitbyteOrder:java.nio.ByteOrder):Short "Permalink")  def getShort(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Get a single Short from this iterator.

Get a single Short from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
68. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getShorts(xs:Array[Short],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteArrayIterator.this.type "Permalink")  def getShorts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Shorts from this iterator.

Get a number of Shorts from this iterator.

Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
69. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#getShorts(xs:Array[Short])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getShorts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteArrayIterator.this.typeGet a number of Shorts from this iterator.

Get a number of Shorts from this iterator.

Definition Classes[ByteIterator](ByteIterator.html)
70. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#grouped[B>:A](size:Int):Iterator.this.GroupedIterator[B] "Permalink")  def grouped\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [GroupedIterator](#GroupedIterator[B>:A]extendsAbstractIterator[Seq[B]])\[B]Definition ClassesIterator
71. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#hasNext:Boolean "Permalink") final  def hasNext: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesByteArrayIterator → IteratorAnnotations@inline()
72. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
73. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#head:Byte "Permalink") final  def head: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → BufferedIteratorAnnotations@inline()
74. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#headOption:Option[A] "Permalink")  def headOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesBufferedIterator
75. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#indexOf[B>:Byte](elem:B,from:Int):Int "Permalink")  def indexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B, from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteIterator](ByteIterator.html) → Iterator
76. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#indexOf[B>:Byte](elem:B):Int "Permalink")  def indexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteIterator](ByteIterator.html) → Iterator
77. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#indexOf(elem:Byte,from:Int):Int "Permalink")  def indexOf(elem: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteIterator](ByteIterator.html)
78. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#indexOf(elem:Byte):Int "Permalink")  def indexOf(elem: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteIterator](ByteIterator.html)
79. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#indexWhere(p:Byte=>Boolean,from:Int):Int "Permalink")  def indexWhere(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteIterator](ByteIterator.html) → Iterator
80. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator → IterableOnceOpsAnnotations@deprecatedOverriding()
81. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
82. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#isTraversableAgain:Boolean "Permalink")  def isTraversableAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
83. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#iterator:Iterator[A] "Permalink") final  def iterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceAnnotations@inline()
84. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#knownSize:Int "Permalink")  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnce
85. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#len:Int "Permalink") final  def len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)Annotations@inline()
86. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#length:Int "Permalink") final  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIteratorAnnotations@inline()
87. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#map[B](f:A=>B):Iterator[B] "Permalink")  def map\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
88. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#max[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def max\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
89. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#maxBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
90. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#maxByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxByOption\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
91. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#maxOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
92. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#min[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def min\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
93. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#minBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
94. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#minByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minByOption\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
95. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#minOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
96. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#mkString:String "Permalink") final  def mkString: StringDefinition ClassesIterableOnceOpsAnnotations@inline()
97. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#mkString(sep:String):String "Permalink") final  def mkString(sep: String): StringDefinition ClassesIterableOnceOpsAnnotations@inline()
98. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#mkString(start:String,sep:String,end:String):String "Permalink") final  def mkString(start: String, sep: String, end: String): StringDefinition ClassesIterableOnceOps
99. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
100. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#next():Byte "Permalink") final  def next(): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → Iterator
101. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#nextOption():Option[A] "Permalink")  def nextOption(): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
102. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
103. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
104. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
105. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#padTo[B>:A](len:Int,elem:B):Iterator[B] "Permalink")  def padTo\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), elem: B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator
106. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#partition(p:A=>Boolean):(Iterator[A],Iterator[A]) "Permalink")  def partition(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ([Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)])Definition ClassesIterator
107. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#patch[B>:A](from:Int,patchElems:Iterator[B],replaced:Int):Iterator[B] "Permalink")  def patch\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), patchElems: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B], replaced: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator
108. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#product[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def product\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
109. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduce[B>:A](op:(B,B)=>B):B "Permalink")  def reduce\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, B) \=\> B): BDefinition ClassesIterableOnceOps
110. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceLeft[B>:A](op:(B,A)=>B):B "Permalink")  def reduceLeft\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOps
111. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceLeftOption[B>:A](op:(B,A)=>B):Option[B] "Permalink")  def reduceLeftOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
112. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceOption[B>:A](op:(B,B)=>B):Option[B] "Permalink")  def reduceOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
113. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceRight[B>:A](op:(A,B)=>B):B "Permalink")  def reduceRight\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOps
114. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceRightOption[B>:A](op:(A,B)=>B):Option[B] "Permalink")  def reduceRightOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
115. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reversed:Iterable[A] "Permalink")  def reversed: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Attributesprotected Definition ClassesIterableOnceOps
116. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator
117. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#scanLeft[B](z:B)(op:(B,A)=>B):Iterator[B] "Permalink")  def scanLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
118. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#size:Int "Permalink") final  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteArrayIterator → IterableOnceOps
119. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#slice(from:Int,until:Int):ByteIterator.this.type "Permalink")  def slice(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteArrayIterator.this.typeDefinition Classes[ByteIterator](ByteIterator.html) → Iterator → IterableOnceOps
120. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#sliceIterator(from:Int,until:Int):Iterator[A] "Permalink")  def sliceIterator(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Attributesprotected Definition ClassesIterator
121. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#sliding[B>:A](size:Int,step:Int):Iterator.this.GroupedIterator[B] "Permalink")  def sliding\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [GroupedIterator](#GroupedIterator[B>:A]extendsAbstractIterator[Seq[B]])\[B]Definition ClassesIterator
122. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#span(p:Byte=>Boolean):(akka.util.ByteIterator,akka.util.ByteIterator) "Permalink")  def span(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ([ByteIterator](ByteIterator.html), [ByteIterator](ByteIterator.html))Definition Classes[ByteIterator](ByteIterator.html) → Iterator → IterableOnceOps
123. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#splitAt(n:Int):(C,C) "Permalink")  def splitAt(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ([Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)])Definition ClassesIterableOnceOps
124. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):S "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), S]): SDefinition ClassesIterableOnce
125. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#sum[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def sum\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
126. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
127. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#take(n:Int):ByteArrayIterator.this.type "Permalink") final  def take(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteArrayIterator.this.typeDefinition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → Iterator → IterableOnceOps
128. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#takeWhile(p:Byte=>Boolean):ByteArrayIterator.this.type "Permalink") final  def takeWhile(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteArrayIterator.this.typeDefinition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html) → Iterator → IterableOnceOps
129. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#tapEach[U](f:A=>U):Iterator[A] "Permalink")  def tapEach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceOps
130. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C1]): C1Definition ClassesIterableOnceOps
131. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toArray[B>:Byte](implicitarg0:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]Definition Classes[ByteIterator](ByteIterator.html) → IterableOnceOps
132. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink") final  def toBuffer\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]Definition ClassesIterableOnceOpsAnnotations@inline()
133. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toByteString:akka.util.ByteString "Permalink") final  def toByteString: [ByteString](ByteString.html)Definition ClassesByteArrayIterator → [ByteIterator](ByteIterator.html)
134. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toIndexedSeq:IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
135. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
136. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]Definition ClassesIterableOnceOps
137. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toSeq:akka.util.ByteString "Permalink")  def toSeq: [ByteString](ByteString.html)Definition Classes[ByteIterator](ByteIterator.html) → IterableOnceOps
138. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]Definition ClassesIterableOnceOps
139. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesIterator → AnyRef → Any
140. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
141. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
142. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
143. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
144. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#withFilter(p:A=>Boolean):Iterator[A] "Permalink")  def withFilter(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
145. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#zip[B](that:scala.collection.IterableOnce[B]):Iterator[(A,B)] "Permalink")  def zip\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B)]Definition ClassesIterator
146. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#zipAll[A1>:A,B](that:scala.collection.IterableOnce[B],thisElem:A1,thatElem:B):Iterator[(A1,B)] "Permalink")  def zipAll\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], thisElem: A1, thatElem: B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(A1, B)]Definition ClassesIterator
147. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#zipWithIndex:Iterator[(A,Int)] "Permalink")  def zipWithIndex: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))]Definition ClassesIterator → IterableOnceOps
### Deprecated Value Members

1. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink")  def /:\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte])./:(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
2. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink") final  def /:\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldLeft instead of /:
3. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink")  def :\\\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).:\(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
4. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink") final  def :\\\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldRight instead of :\\
5. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B "Permalink")  def aggregate\[B](z: \=\> B)(seqop: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B, combop: (B, B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* For sequential collections, prefer `foldLeft(z)(seqop)`. For parallel collections, use `ParIterableLike#aggregate`.
6. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#collectFirst[B](f:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).collectFirst(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.collectFirst(...) instead
7. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#copyToBuffer(dest:scala.collection.mutable.Buffer[A]):Unit "Permalink")  def copyToBuffer(dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).copyToBuffer(dest)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.copyToBuffer(...) instead
8. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#copyToBuffer[B>:A](dest:scala.collection.mutable.Buffer[B]):Unit "Permalink") final  def copyToBuffer\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `dest ++= coll` instead
9. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#count(f:A=>Boolean):Int "Permalink")  def count(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).count(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.count(...) instead
10. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#exists(f:A=>Boolean):Boolean "Permalink")  def exists(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).exists(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.exists(...) instead
11. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#filter(f:A=>Boolean):Iterator[A] "Permalink")  def filter(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).filter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.filter(...) instead
12. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
13. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).find(p)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.find instead
14. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):scala.collection.IterableOnce[B] "Permalink")  def flatMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).flatMap(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.flatMap instead or consider requiring an Iterable
15. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: A](z: A1)(op: (A1, A1) \=\> A1): A1ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).fold(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.fold instead
16. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#foldLeft[B](z:B)(op:(B,A)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).foldLeft(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
17. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).foldRight(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
18. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#forall(f:A=>Boolean):Boolean "Permalink")  def forall(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).forall(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.forall(...) instead
19. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#foreach[U](f:A=>U):Unit "Permalink")  def foreach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).foreach(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foreach(...) instead
20. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ByteArrayIterator toStringFormat\[ByteArrayIterator] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
21. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#hasDefiniteSize:Boolean "Permalink") final  def hasDefiniteSize: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator → IterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* hasDefiniteSize on Iterator is the same as isEmpty
22. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).isEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.isEmpty instead
23. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#map[B](f:A=>B):scala.collection.IterableOnce[B] "Permalink")  def map\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).map(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.map instead or consider requiring an Iterable
24. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#max(implicitord:scala.math.Ordering[A]):A "Permalink")  def max(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).max(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.max instead
25. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#maxBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).maxBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.maxBy(...) instead
26. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#min(implicitord:scala.math.Ordering[A]):A "Permalink")  def min(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).min(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.min instead
27. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#minBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).minBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.minBy(...) instead
28. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#mkString:String "Permalink")  def mkString: StringImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).mkString
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
29. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#mkString(sep:String):String "Permalink")  def mkString(sep: String): StringImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).mkString(sep)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
30. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#mkString(start:String,sep:String,end:String):String "Permalink")  def mkString(start: String, sep: String, end: String): StringImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).mkString(start, sep, end)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
31. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).nonEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.nonEmpty instead
32. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#product(implicitnum:scala.math.Numeric[A]):A "Permalink")  def product(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).product(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.product instead
33. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduce(f:(A,A)=>A):A "Permalink")  def reduce(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).reduce(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduce(...) instead
34. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceLeft(f:(A,A)=>A):A "Permalink")  def reduceLeft(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).reduceLeft(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeft(...) instead
35. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceLeftOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceLeftOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).reduceLeftOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeftOption(...) instead
36. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).reduceOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceOption(...) instead
37. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceRight(f:(A,A)=>A):A "Permalink")  def reduceRight(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).reduceRight(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRight(...) instead
38. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#reduceRightOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceRightOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).reduceRightOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRightOption(...) instead
39. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: A](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).sameElements(that)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sameElements instead
40. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#scanRight[B](z:B)(op:(A,B)=>B):Iterator[B] "Permalink")  def scanRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIteratorAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Call scanRight on an Iterable instead.
41. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#seq:Iterator.this.type "Permalink")  def seq: ByteArrayIterator.this.typeDefinition ClassesIteratorAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Iterator.seq always returns the iterator itself
42. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).size
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.size instead
43. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#sum(implicitnum:scala.math.Numeric[A]):A "Permalink")  def sum(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).sum(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sum instead
44. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C1]): C1ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).to(factory)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(factory) instead
45. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toArray[B>:A](implicitevidence$1:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: A](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toArray(arg0)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toArray
46. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink")  def toBuffer\[B \>: A]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toBuffer
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(ArrayBuffer) instead
47. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toIndexedSeq:scala.collection.IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeq.html#scala.collection.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toIndexedSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toIndexedSeq instead
48. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toIterable:Iterable[A] "Permalink") final  def toIterable: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
49. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toIterator:Iterator[A] "Permalink")  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toIterator
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead
50. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toIterator:Iterator[A] "Permalink") final  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead of .toIterator
51. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toList
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(List) instead
52. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toMap(ev)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Map) instead
53. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toSeq:Seq[A] "Permalink")  def toSeq: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Seq) instead
54. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: A]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toSet
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Set) instead
55. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toStream:scala.collection.immutable.Stream[A] "Permalink")  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toStream
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(LazyList) instead
56. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toStream:scala.collection.immutable.Stream[A] "Permalink") final  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .to(LazyList) instead of .toStream
57. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toTraversable:scala.collection.Traversable[A] "Permalink") final  def toTraversable: Traversable\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
58. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).toVector
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Vector) instead
59. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#withFilter(f:A=>Boolean):Iterator[A] "Permalink")  def withFilter(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteArrayIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteArrayIterator: IterableOnceExtensionMethods[Byte]).withFilter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.withFilter(...) instead
60. [**](../../akka/util/ByteIterator$$ByteArrayIterator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ByteArrayIterator, B)ImplicitThis member is added by an implicit conversion from ByteArrayIterator toArrowAssoc\[ByteArrayIterator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ByteIterator](ByteIterator.html)

### Inherited from [BufferedIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/BufferedIterator.html#scala.collection.BufferedIterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]

### Inherited from [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion iterableOnceExtensionMethods fromByteArrayIterator to [IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited by implicit conversion any2stringadd fromByteArrayIterator to any2stringadd\[ByteArrayIterator]

### Inherited by implicit conversion StringFormat fromByteArrayIterator to StringFormat\[ByteArrayIterator]

### Inherited by implicit conversion Ensuring fromByteArrayIterator to Ensuring\[ByteArrayIterator]

### Inherited by implicit conversion ArrowAssoc fromByteArrayIterator to ArrowAssoc\[ByteArrayIterator]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$ByteArrayIterator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$ByteArrayIterator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$MultiByteArrayIterator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$MultiByteArrayIterator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$ByteArrayIterator.html](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$ByteArrayIterator.html)*