---
description: Akka 2.10.17 - akka.persistence.scalatest.MayVerb
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/scalatest/MayVerb.html
title: Akka 2.10.17 - akka.persistence.scalatest.MayVerb
---

# Akka 2.10.17 - akka.persistence.scalatest.MayVerb

> **Summary:** Akka 2.10.17 - akka.persistence.scalatest.MayVerb

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](index.html)Definition Classes[persistence](../index.html)
- MayVerb
- [OptionalTests](OptionalTests.html)
[t](MayVerb$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[scalatest](index.html)

# [MayVerb](MayVerb$.html "See companion object")[**](../../../akka/persistence/scalatest/MayVerb.html "Permalink")

### Companion [object MayVerb](MayVerb$.html "See companion object")

#### trait MayVerb extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[MayVerb.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-tck/src/main/scala/akka/persistence/scalatest/MayVerb.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[JavaJournalPerfSpec](../japi/journal/JavaJournalPerfSpec.html), [JavaJournalSpec](../japi/journal/JavaJournalSpec.html), [JavaSnapshotStoreSpec](../japi/snapshot/JavaSnapshotStoreSpec.html), [JournalPerfSpec](../journal/JournalPerfSpec.html), [JournalSpec](../journal/JournalSpec.html), [SnapshotStoreSpec](../snapshot/SnapshotStoreSpec.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MayVerb
2. AnyRef
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
### Type Members

1. [**](../../../akka/persistence/scalatest/MayVerb$StringMayWrapperForVerb.html "Permalink")  trait [StringMayWrapperForVerb](MayVerb$StringMayWrapperForVerb.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/persistence/scalatest/MayVerb.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/scalatest/MayVerb.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/scalatest/MayVerb.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MayVerb toany2stringadd\[MayVerb] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/scalatest/MayVerb.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MayVerb, B)ImplicitThis member is added by an implicit conversion from MayVerb toArrowAssoc\[MayVerb] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/scalatest/MayVerb.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/scalatest/MayVerb.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/scalatest/MayVerb.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/scalatest/MayVerb.html#convertToStringMayWrapper(o:String):MayVerb.this.StringMayWrapperForVerb "Permalink") implicit  def convertToStringMayWrapper(o: String): [StringMayWrapperForVerb](MayVerb$StringMayWrapperForVerb.html)Implicitly converts an object of type `String` to a `StringMayWrapper`,
to enable `may` methods to be invokable on that object.
9. [**](../../../akka/persistence/scalatest/MayVerb.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MayVerb) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MayVerbImplicitThis member is added by an implicit conversion from MayVerb toEnsuring\[MayVerb] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/scalatest/MayVerb.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MayVerb) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MayVerbImplicitThis member is added by an implicit conversion from MayVerb toEnsuring\[MayVerb] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/scalatest/MayVerb.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MayVerbImplicitThis member is added by an implicit conversion from MayVerb toEnsuring\[MayVerb] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/scalatest/MayVerb.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MayVerbImplicitThis member is added by an implicit conversion from MayVerb toEnsuring\[MayVerb] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/scalatest/MayVerb.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/scalatest/MayVerb.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/persistence/scalatest/MayVerb.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/scalatest/MayVerb.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/scalatest/MayVerb.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/scalatest/MayVerb.html#mayVerbStacktraceContextFrames:Int "Permalink")  def mayVerbStacktraceContextFrames: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Configurable number of frames to be shown when a MAY test fails (is canceled).

Configurable number of frames to be shown when a MAY test fails (is canceled).

Defaults to `3`.
Must be greater than `0`.
19. [**](../../../akka/persistence/scalatest/MayVerb.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/persistence/scalatest/MayVerb.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/scalatest/MayVerb.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/persistence/scalatest/MayVerb.html#optional(whenSkippedMessage:String)(body:=>Unit):Unit "Permalink")  def optional(whenSkippedMessage: String)(body: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
23. [**](../../../akka/persistence/scalatest/MayVerb.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/persistence/scalatest/MayVerb.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/persistence/scalatest/MayVerb.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/persistence/scalatest/MayVerb.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/persistence/scalatest/MayVerb.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/scalatest/MayVerb.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/scalatest/MayVerb.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MayVerb toStringFormat\[MayVerb] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/scalatest/MayVerb.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MayVerb, B)ImplicitThis member is added by an implicit conversion from MayVerb toArrowAssoc\[MayVerb] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMayVerb to any2stringadd\[MayVerb]

### Inherited by implicit conversion StringFormat fromMayVerb to StringFormat\[MayVerb]

### Inherited by implicit conversion Ensuring fromMayVerb to Ensuring\[MayVerb]

### Inherited by implicit conversion ArrowAssoc fromMayVerb to ArrowAssoc\[MayVerb]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/MayVerb$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/MayVerb$StringMayWrapperForVerb.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/OptionalTests.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/MayVerb.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/MayVerb.html)*