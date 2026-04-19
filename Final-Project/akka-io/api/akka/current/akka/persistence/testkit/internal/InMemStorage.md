---
description: Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorage
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/internal/InMemStorage.html
title: Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorage
---

# Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorage

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.internal.InMemStorage

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[testkit](../index.html)
- InMemStorage
- [InMemStorageExtension](InMemStorageExtension.html "INTERNAL API")
- [InternalReprSupport](InternalReprSupport.html "INTERNAL API")
- [PolicyOps](PolicyOps.html "INTERNAL API")
t[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[internal](index.html)

# InMemStorage[**](../../../../akka/persistence/testkit/internal/InMemStorage.html "Permalink")

### 

#### sealed  trait InMemStorage\[K, R] extends [InternalReprSupport](InternalReprSupport.html)\[R]

INTERNAL API

Annotations@[InternalApi](../../../annotation/InternalApi.html)() Source[TestKitStorage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/internal/TestKitStorage.scala#L32)Linear Supertypes[InternalReprSupport](InternalReprSupport.html)\[R], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. InMemStorage
2. InternalReprSupport
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#InternalRepr "Permalink") abstract  type InternalReprDefinition Classes[InternalReprSupport](InternalReprSupport.html)
### Abstract Value Members

1. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#reprToSeqNum(repr:R):Long "Permalink") abstract  def reprToSeqNum(repr: R): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
### Concrete Value Members

1. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toany2stringadd\[InMemStorage\[K, R]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (InMemStorage\[K, R], B)ImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toArrowAssoc\[InMemStorage\[K, R]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#add(key:K,elems:Seq[R]):Unit "Permalink")  def add(key: K, elems: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[R]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Adds elements ordered by seqnum, sets new seqnum as max(old, max(newElemsSeqNums)))
7. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#add(key:K,p:R):Unit "Permalink")  def add(key: K, p: R): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
8. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#clearAll():Unit "Permalink")  def clearAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
10. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#clearAllPreservingSeqNumbers():Unit "Permalink")  def clearAllPreservingSeqNumbers(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
11. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#delete(key:K,needsToBeDeleted:R=>Boolean):Vector[R] "Permalink")  def delete(key: K, needsToBeDeleted: (R) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Vector\[R]Deletes elements preserving highest sequence number.
13. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#deleteToSeqNumber(key:K,toSeqNumberInclusive:Long):Unit "Permalink")  def deleteToSeqNumber(key: K, toSeqNumberInclusive: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
14. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (InMemStorage\[K, R]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InMemStorage\[K, R]ImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toEnsuring\[InMemStorage\[K, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (InMemStorage\[K, R]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InMemStorage\[K, R]ImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toEnsuring\[InMemStorage\[K, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InMemStorage\[K, R]ImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toEnsuring\[InMemStorage\[K, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InMemStorage\[K, R]ImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toEnsuring\[InMemStorage\[K, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#findMany(key:K,fromInclusive:Int,maxNum:Int):Option[Vector[R]] "Permalink")  def findMany(key: K, fromInclusive: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxNum: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Vector\[R]]
21. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#findOneByIndex(key:K,index:Int):Option[R] "Permalink")  def findOneByIndex(key: K, index: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R]
22. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#firstInExpectNextQueue(key:K):Option[R] "Permalink")  def firstInExpectNextQueue(key: K): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R]
23. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#getHighestSeqNumber(key:K):Long "Permalink")  def getHighestSeqNumber(key: K): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
25. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#keys():Seq[K] "Permalink")  def keys(): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[K]
28. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#read(key:K,fromInclusive:Long,toInclusive:Long,maxNumber:Long):Seq[R] "Permalink")  def read(key: K, fromInclusive: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toInclusive: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxNumber: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[R]Reads elems within the range of seqnums.
32. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#read(key:K):Option[Vector[R]] "Permalink")  def read(key: K): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Vector\[R]]
33. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#readAll():Iterable[R] "Permalink")  def readAll(): Iterable\[R]
34. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#removeFirstInExpectNextQueue(key:K):Unit "Permalink")  def removeFirstInExpectNextQueue(key: K): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
35. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#removeKey(key:K):Vector[R] "Permalink")  def removeKey(key: K): Vector\[R]Removes key and the whole value including seqnum.
36. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#removePreservingSeqNumber(key:K):Unit "Permalink")  def removePreservingSeqNumber(key: K): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
37. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#updateOrSetNew(key:K,updater:Vector[R]=>Vector[R]):Vector[R] "Permalink")  def updateOrSetNew(key: K, updater: (Vector\[R]) \=\> Vector\[R]): Vector\[R]Sets new elements returned by updater ordered by seqnum.

Sets new elements returned by updater ordered by seqnum. Sets new seqnum as max(old, max(newElemsFromUpdaterSeqNums))
40. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toStringFormat\[InMemStorage\[K, R]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/internal/InMemStorage.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (InMemStorage\[K, R], B)ImplicitThis member is added by an implicit conversion from InMemStorage\[K, R] toArrowAssoc\[InMemStorage\[K, R]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [InternalReprSupport](InternalReprSupport.html)\[R]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromInMemStorage\[K, R] to any2stringadd\[InMemStorage\[K, R]]

### Inherited by implicit conversion StringFormat fromInMemStorage\[K, R] to StringFormat\[InMemStorage\[K, R]]

### Inherited by implicit conversion Ensuring fromInMemStorage\[K, R] to Ensuring\[InMemStorage\[K, R]]

### Inherited by implicit conversion ArrowAssoc fromInMemStorage\[K, R] to ArrowAssoc\[InMemStorage\[K, R]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorage.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorageExtension.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/PolicyOps.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorage.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/InMemStorage.html)*