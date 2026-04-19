---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceProbe
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceProbe
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceProbe

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceProbe

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- PersistenceProbe
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
t[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# PersistenceProbe[**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html "Permalink")

### 

#### trait PersistenceProbe\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/UnpersistentBehavior.scala#L91)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceProbe
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
### Abstract Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#drain():Seq[akka.persistence.testkit.scaladsl.PersistenceEffect[T]] "Permalink") abstract  def drain(): Seq\[[PersistenceEffect](PersistenceEffect.html)\[T]]Collect all persistence effects from the probe and empty the probe
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#expectPersisted(obj:T,tags:Set[String]):akka.persistence.testkit.scaladsl.PersistenceProbe[T] "Permalink") abstract  def expectPersisted(obj: T, tags: Set\[String]): PersistenceProbe\[T]Assert that the given object was persisted with the given tags in the oldest
 persistence effect and remove that persistence effect.

Assert that the given object was persisted with the given tags in the oldest
 persistence effect and remove that persistence effect. If the persistence
 effect has tags which are not given, the assertion fails.
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#expectPersisted(obj:T,tag:String):akka.persistence.testkit.scaladsl.PersistenceProbe[T] "Permalink") abstract  def expectPersisted(obj: T, tag: String): PersistenceProbe\[T]Assert that the given object was persisted with the given tag in the oldest
 persistence effect and remove that persistence effect.

Assert that the given object was persisted with the given tag in the oldest
 persistence effect and remove that persistence effect. If the persistence
 effect has multiple tags, only one of them has to match in order for the
 assertion to succeed.
4. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#expectPersisted(obj:T):akka.persistence.testkit.scaladsl.PersistenceProbe[T] "Permalink") abstract  def expectPersisted(obj: T): PersistenceProbe\[T]Assert that the given object was persisted in the oldest persistence effect and
 remove that persistence effect
5. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#expectPersistedType[S<:T]()(implicitevidence$1:scala.reflect.ClassTag[S]):akka.persistence.testkit.scaladsl.PersistenceEffect[S] "Permalink") abstract  def expectPersistedType\[S \<: T]()(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): [PersistenceEffect](PersistenceEffect.html)\[S]Get and remove the oldest persistence effect from the probe, failing if the
 persisted object is not of the requested type
6. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#extract():akka.persistence.testkit.scaladsl.PersistenceEffect[T] "Permalink") abstract  def extract(): [PersistenceEffect](PersistenceEffect.html)\[T]Get and remove the oldest persistence effect from the probe
7. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#hasEffects:Boolean "Permalink") abstract  def hasEffects: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Are there any persistence effects?
### Concrete Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toany2stringadd\[PersistenceProbe\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceProbe\[T], B)ImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toArrowAssoc\[PersistenceProbe\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceProbe\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceProbe\[T]ImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toEnsuring\[PersistenceProbe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceProbe\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceProbe\[T]ImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toEnsuring\[PersistenceProbe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceProbe\[T]ImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toEnsuring\[PersistenceProbe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceProbe\[T]ImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toEnsuring\[PersistenceProbe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toStringFormat\[PersistenceProbe\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceProbe\[T], B)ImplicitThis member is added by an implicit conversion from PersistenceProbe\[T] toArrowAssoc\[PersistenceProbe\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceProbe\[T] to any2stringadd\[PersistenceProbe\[T]]

### Inherited by implicit conversion StringFormat fromPersistenceProbe\[T] to StringFormat\[PersistenceProbe\[T]]

### Inherited by implicit conversion Ensuring fromPersistenceProbe\[T] to Ensuring\[PersistenceProbe\[T]]

### Inherited by implicit conversion ArrowAssoc fromPersistenceProbe\[T] to ArrowAssoc\[PersistenceProbe\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html)*