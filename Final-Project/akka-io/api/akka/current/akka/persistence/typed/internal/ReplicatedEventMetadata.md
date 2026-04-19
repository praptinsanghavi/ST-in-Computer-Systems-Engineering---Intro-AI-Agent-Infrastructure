---
description: Akka 2.10.17 - akka.persistence.typed.internal.ReplicatedEventMetadata
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:57:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/internal/ReplicatedEventMetadata.html
title: Akka 2.10.17 - akka.persistence.typed.internal.ReplicatedEventMetadata
---

# Akka 2.10.17 - akka.persistence.typed.internal.ReplicatedEventMetadata

> **Summary:** Akka 2.10.17 - akka.persistence.typed.internal.ReplicatedEventMetadata

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[typed](../index.html)
- ReplicatedEventMetadata
- [ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html)
- [ReplicatedSnapshotMetadata](ReplicatedSnapshotMetadata$.html)
[c](ReplicatedEventMetadata$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[internal](index.html)

# [ReplicatedEventMetadata](ReplicatedEventMetadata$.html "See companion object")[**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html "Permalink")

### Companion [object ReplicatedEventMetadata](ReplicatedEventMetadata$.html "See companion object")

#### final  case class ReplicatedEventMetadata(originReplica: [ReplicaId](../ReplicaId.html), originSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), version: VersionVector, concurrent: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

INTERNAL API

originReplicaWhere the event originally was created

originSequenceNrThe original sequenceNr in the origin DC

versionThe version with which the event was persisted at the different DC. The same event will have different version vectors
 at each location as they are received at different times

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[EventSourcedBehaviorImpl.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/internal/EventSourcedBehaviorImpl.scala#L393)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatedEventMetadata
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#<init>(originReplica:akka.persistence.typed.ReplicaId,originSequenceNr:Long,version:akka.persistence.typed.internal.VersionVector,concurrent:Boolean):akka.persistence.typed.internal.ReplicatedEventMetadata "Permalink")  new ReplicatedEventMetadata(originReplica: [ReplicaId](../ReplicaId.html), originSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), version: VersionVector, concurrent: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))originReplicaWhere the event originally was created

originSequenceNrThe original sequenceNr in the origin DC

versionThe version with which the event was persisted at the different DC. The same event will have different version vectors
 at each location as they are received at different times
### Value Members

1. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toany2stringadd\[ReplicatedEventMetadata] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatedEventMetadata, B)ImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toArrowAssoc\[ReplicatedEventMetadata] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#concurrent:Boolean "Permalink")  val concurrent: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatedEventMetadata) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatedEventMetadataImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toEnsuring\[ReplicatedEventMetadata] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatedEventMetadata) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatedEventMetadataImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toEnsuring\[ReplicatedEventMetadata] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatedEventMetadataImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toEnsuring\[ReplicatedEventMetadata] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatedEventMetadataImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toEnsuring\[ReplicatedEventMetadata] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#originReplica:akka.persistence.typed.ReplicaId "Permalink")  val originReplica: [ReplicaId](../ReplicaId.html)
20. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#originSequenceNr:Long "Permalink")  val originSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
21. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#version:akka.persistence.typed.internal.VersionVector "Permalink")  val version: VersionVector
24. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toStringFormat\[ReplicatedEventMetadata] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/internal/ReplicatedEventMetadata.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatedEventMetadata, B)ImplicitThis member is added by an implicit conversion from ReplicatedEventMetadata toArrowAssoc\[ReplicatedEventMetadata] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicatedEventMetadata to any2stringadd\[ReplicatedEventMetadata]

### Inherited by implicit conversion StringFormat fromReplicatedEventMetadata to StringFormat\[ReplicatedEventMetadata]

### Inherited by implicit conversion Ensuring fromReplicatedEventMetadata to Ensuring\[ReplicatedEventMetadata]

### Inherited by implicit conversion ArrowAssoc fromReplicatedEventMetadata to ArrowAssoc\[ReplicatedEventMetadata]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata.html)*