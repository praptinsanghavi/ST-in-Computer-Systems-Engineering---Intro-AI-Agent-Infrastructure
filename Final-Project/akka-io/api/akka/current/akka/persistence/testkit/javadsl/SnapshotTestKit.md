---
description: Akka 2.10.17 - akka.persistence.testkit.javadsl.SnapshotTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html
title: Akka 2.10.17 - akka.persistence.testkit.javadsl.SnapshotTestKit
---

# Akka 2.10.17 - akka.persistence.testkit.javadsl.SnapshotTestKit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.javadsl.SnapshotTestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing persisted events in persistent actors.")
- SnapshotTestKit
- [UnpersistentBehavior](UnpersistentBehavior.html)
[c](SnapshotTestKit$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [SnapshotTestKit](SnapshotTestKit$.html "See companion object")[**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html "Permalink")

### Companion [object SnapshotTestKit](SnapshotTestKit$.html "See companion object")

#### class SnapshotTestKit extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Class for testing persisted snapshots in persistent actors.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[SnapshotTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/javadsl/SnapshotTestKit.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SnapshotTestKit
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
### Instance Constructors

1. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#<init>(system:akka.actor.ActorSystem):akka.persistence.testkit.javadsl.SnapshotTestKit "Permalink")  new SnapshotTestKit(system: [ActorSystem](../../../actor/ActorSystem.html))
2. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#<init>(scalaTestkit:akka.persistence.testkit.scaladsl.SnapshotTestKit):akka.persistence.testkit.javadsl.SnapshotTestKit "Permalink")  new SnapshotTestKit(scalaTestkit: [scaladsl.SnapshotTestKit](../scaladsl/SnapshotTestKit.html))
### Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SnapshotTestKit toany2stringadd\[SnapshotTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SnapshotTestKit, B)ImplicitThis member is added by an implicit conversion from SnapshotTestKit toArrowAssoc\[SnapshotTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#clearAll():Unit "Permalink")  def clearAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from storage.
8. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#clearByPersistenceId(persistenceId:String):Unit "Permalink")  def clearByPersistenceId(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from storage for particular persistence id.
9. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SnapshotTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SnapshotTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#expectNextPersisted[A](persistenceId:String,snapshot:A,max:java.time.Duration):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, snapshot: A, max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ACheck for `max` time that `snapshot` has been saved in the storage.
17. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#expectNextPersisted[A](persistenceId:String,snapshot:A):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, snapshot: A): ACheck that `snapshot` has been saved in the storage.
18. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A],max:java.time.Duration):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ACheck for `max` time that next persisted in storage for particular persistence id snapshot has expected type.
19. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A]):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A]): ACheck that next persisted in storage for particular persistence id snapshot has expected type.
20. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#expectNothingPersisted(persistenceId:String,max:java.time.Duration):Unit "Permalink")  def expectNothingPersisted(persistenceId: String, max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check for `max` time that nothing has been saved in the storage.
21. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#expectNothingPersisted(persistenceId:String):Unit "Permalink")  def expectNothingPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that nothing has been saved in the storage.
22. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextDelete(persistenceId:String):Unit "Permalink")  def failNextDelete(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for particular persistence id.
23. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextDelete(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextDelete(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for particular persistence id.
24. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextDelete():Unit "Permalink")  def failNextDelete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for any persistence id.
25. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextDelete(cause:Throwable):Unit "Permalink")  def failNextDelete(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for any persistence id.
26. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNDeletes(persistenceId:String,n:Int):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for particular persistence id.
27. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNDeletes(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for particular persistence id.
28. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNDeletes(n:Int):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for any persistence id.
29. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNDeletes(n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for any persistence id.
30. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNOps(n:Int,cause:Throwable):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with the `cause` exception.
31. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNOps(n:Int):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail n following journal operations regardless of their type.

Fail n following journal operations regardless of their type.
Fails operations with default `ExpectedFailure` exception.
32. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNOpsCond(cond:java.util.function.BiFunction[String,akka.persistence.testkit.SnapshotOperation,Boolean],n:Int,cause:Throwable):Unit "Permalink")  def failNextNOpsCond(cond: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [SnapshotOperation](../SnapshotOperation.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with the `cause` exception.
33. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNOpsCond(cond:java.util.function.BiFunction[String,akka.persistence.testkit.SnapshotOperation,Boolean],n:Int):Unit "Permalink")  def failNextNOpsCond(cond: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [SnapshotOperation](../SnapshotOperation.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with default `ExpectedFailure` exception.
34. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNPersisted(n:Int):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with default exception for any persistence id.
35. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNPersisted(n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for any persistence id.
36. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNPersisted(persistenceId:String,n:Int):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations for particular persistence id.
37. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNPersisted(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for particular persistence id.
38. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNReads(persistenceId:String,n:Int):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for particular persistence id.
39. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNReads(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.
40. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNReads(n:Int):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for any persistence id.
41. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextNReads(n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.
42. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextPersisted():Unit "Permalink")  def failNextPersisted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operations with default exception for any persistence id.
43. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextPersisted(cause:Throwable):Unit "Permalink")  def failNextPersisted(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operations with `cause` exception for any persistence id.
44. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextPersisted(persistenceId:String):Unit "Permalink")  def failNextPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operations with default exception for particular persistence id.
45. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextPersisted(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextPersisted(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operations with `cause` exception for particular persistence id.
46. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextRead(persistenceId:String):Unit "Permalink")  def failNextRead(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.
47. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextRead(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextRead(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.
48. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextRead():Unit "Permalink")  def failNextRead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.
49. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#failNextRead(cause:Throwable):Unit "Permalink")  def failNextRead(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.
50. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
51. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
52. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
53. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
54. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
55. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
56. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#persistForRecovery(persistenceId:String,snapshots:java.util.List[akka.japi.Pair[akka.persistence.testkit.SnapshotMeta,Any]]):Unit "Permalink")  def persistForRecovery(persistenceId: String, snapshots: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../../japi/Pair.html)\[[SnapshotMeta](../SnapshotMeta.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Persist `snapshots` with metadata into storage in order.
57. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#persistedInStorage(persistenceId:String):java.util.List[akka.japi.Pair[akka.persistence.testkit.SnapshotMeta,Any]] "Permalink")  def persistedInStorage(persistenceId: String): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../../japi/Pair.html)\[[SnapshotMeta](../SnapshotMeta.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]Retrieve all snapshots and their metadata saved in storage by persistence id.
58. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A],max:java.time.Duration):java.util.List[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[A]Receive for `max` time next `n` snapshots that have been persisted in the storage.
59. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A]):java.util.List[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A]): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[A]Receive next `n` snapshots that have been persisted in the storage.
60. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#resetPolicy():Unit "Permalink")  def resetPolicy(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Returns default policy if it was changed by SnapshotTestKit.withPolicy().
61. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
62. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
63. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
64. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
65. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
66. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#withPolicy(policy:akka.persistence.testkit.SnapshotStorage.SnapshotPolicies.PolicyType):akka.persistence.testkit.javadsl.SnapshotTestKit "Permalink")  def withPolicy(policy: [SnapshotStorage.SnapshotPolicies.PolicyType](../SnapshotStorage$$SnapshotPolicies$.html#PolicyType=akka.persistence.testkit.ProcessingPolicy[U])): SnapshotTestKitSet new processing policy for journal operations.

Set new processing policy for journal operations.
NOTE! Overrides previously invoked `failNext...` or `rejectNext...`
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SnapshotTestKit toStringFormat\[SnapshotTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SnapshotTestKit, B)ImplicitThis member is added by an implicit conversion from SnapshotTestKit toArrowAssoc\[SnapshotTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSnapshotTestKit to any2stringadd\[SnapshotTestKit]

### Inherited by implicit conversion StringFormat fromSnapshotTestKit to StringFormat\[SnapshotTestKit]

### Inherited by implicit conversion Ensuring fromSnapshotTestKit to Ensuring\[SnapshotTestKit]

### Inherited by implicit conversion ArrowAssoc fromSnapshotTestKit to ArrowAssoc\[SnapshotTestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceProbe.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html)*