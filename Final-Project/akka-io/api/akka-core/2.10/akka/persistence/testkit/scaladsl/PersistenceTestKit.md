---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceTestKit
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceTestKit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceTestKit

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
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- PersistenceTestKit
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
[c](PersistenceTestKit$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# [PersistenceTestKit](PersistenceTestKit$.html "See companion object")[**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html "Permalink")

### Companion [object PersistenceTestKit](PersistenceTestKit$.html "See companion object")

#### class PersistenceTestKit extends PersistenceTestKitOps\[[PersistentRepr](../../PersistentRepr.html), [JournalOperation](../JournalOperation.html)] with ExpectOps\[[PersistentRepr](../../PersistentRepr.html)] with HasStorage\[[JournalOperation](../JournalOperation.html), [PersistentRepr](../../PersistentRepr.html)]

Class for testing events of persistent actors.

NOTE! ActorSystem must be configured with [PersistenceTestKitPlugin](../PersistenceTestKitPlugin.html).
The configuration can be retrieved with [PersistenceTestKitPlugin.config](../PersistenceTestKitPlugin$.html#config:com.typesafe.config.Config).

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[PersistenceTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/PersistenceTestKit.scala#L437)Linear SupertypesHasStorage\[[JournalOperation](../JournalOperation.html), [PersistentRepr](../../PersistentRepr.html)], ExpectOps\[[PersistentRepr](../../PersistentRepr.html)], PersistenceTestKitOps\[[PersistentRepr](../../PersistentRepr.html), [JournalOperation](../JournalOperation.html)], CommonTestKitOps\[[PersistentRepr](../../PersistentRepr.html), [JournalOperation](../JournalOperation.html)], PolicyOpsTestKit\[[JournalOperation](../JournalOperation.html)], ClearOps, ClearPreservingSeqNums, RejectSupport\[[JournalOperation](../JournalOperation.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceTestKit
2. HasStorage
3. ExpectOps
4. PersistenceTestKitOps
5. CommonTestKitOps
6. PolicyOpsTestKit
7. ClearOps
8. ClearPreservingSeqNums
9. RejectSupport
10. AnyRef
11. Any
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

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#<init>(system:akka.actor.ActorSystem):akka.persistence.testkit.scaladsl.PersistenceTestKit "Permalink")  new PersistenceTestKit(system: [ActorSystem](../../../actor/ActorSystem.html))
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKit toany2stringadd\[PersistenceTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceTestKit, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKit toArrowAssoc\[PersistenceTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#clearAll():Unit "Permalink")  def clearAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from the storage.

Clear all data from the storage.

NOTE! Also clears sequence numbers in storage!

Definition ClassesClearOpsSee alsoClearPreservingSeqNums.clearAllPreservingSeqNumbers()
8. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#clearAllPreservingSeqNumbers():Unit "Permalink")  def clearAllPreservingSeqNumbers(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data in the storage preserving sequence numbers.

Clear all data in the storage preserving sequence numbers.

Definition ClassesClearPreservingSeqNumsSee alsoClearOps.clearAll()
9. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#clearByIdPreservingSeqNumbers(persistenceId:String):Unit "Permalink")  def clearByIdPreservingSeqNumbers(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data in the storage for particular persistence id preserving sequence numbers.

Clear all data in the storage for particular persistence id preserving sequence numbers.

Definition ClassesClearPreservingSeqNumsSee alsoClearOps.clearByPersistenceId()
10. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#clearByPersistenceId(persistenceId:String):Unit "Permalink")  def clearByPersistenceId(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from the storage for particular persistence id.

Clear all data from the storage for particular persistence id.

NOTE! Also clears sequence number in the storage!

Definition ClassesClearOpsSee alsoClearPreservingSeqNums.clearByIdPreservingSeqNumbers()
11. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNextPersisted[A](persistenceId:String,event:A,max:scala.concurrent.duration.FiniteDuration):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, event: A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ACheck for `max` time that next persisted in storage for particular persistence id event/snapshot was `event`.

Check for `max` time that next persisted in storage for particular persistence id event/snapshot was `event`.

Definition ClassesExpectOps
19. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNextPersisted[A](persistenceId:String,event:A):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, event: A): ACheck that next persisted in storage for particular persistence id event/snapshot was `event`.

Check that next persisted in storage for particular persistence id event/snapshot was `event`.

Definition ClassesExpectOps
20. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A],max:scala.concurrent.duration.FiniteDuration):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A], max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ACheck for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
21. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A]):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A]): ACheck that next persisted in storage for particular persistence id event/snapshot has expected type.

Check that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
22. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNextPersistedType[A](persistenceId:String,max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[A]):A "Permalink")  def expectNextPersistedType\[A](persistenceId: String, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): ACheck for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
23. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNextPersistedType[A](persistenceId:String)(implicitt:scala.reflect.ClassTag[A]):A "Permalink")  def expectNextPersistedType\[A](persistenceId: String)(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): ACheck that next persisted in storage for particular persistence id event/snapshot has expected type.

Check that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
24. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNothingPersisted(persistenceId:String,max:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def expectNothingPersisted(persistenceId: String, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check for `max` time that nothing was persisted in storage for particular persistence id.

Check for `max` time that nothing was persisted in storage for particular persistence id.

Definition ClassesExpectOps
25. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#expectNothingPersisted(persistenceId:String):Unit "Permalink")  def expectNothingPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that nothing was persisted in storage for particular persistence id.

Check that nothing was persisted in storage for particular persistence id.

Definition ClassesExpectOps
26. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextDelete(persistenceId:String):Unit "Permalink")  def failNextDelete(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for particular persistence id.

Fail next delete from storage attempt with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
27. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextDelete(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextDelete(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for particular persistence id.

Fail next delete from storage attempt with `cause` exception for particular persistence id.

Definition ClassesCommonTestKitOps
28. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextDelete():Unit "Permalink")  def failNextDelete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for any persistence id.

Fail next delete from storage attempt with default exception for any persistence id.

Definition ClassesCommonTestKitOps
29. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextDelete(cause:Throwable):Unit "Permalink")  def failNextDelete(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for any persistence id.

Fail next delete from storage attempt with `cause` exception for any persistence id.

Definition ClassesCommonTestKitOps
30. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNDeletes(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for particular persistence id.

Fail next n delete from storage attempts with `cause` exception for particular persistence id.

Definition ClassesPersistenceTestKit → CommonTestKitOps
31. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNDeletes(n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for any persistence id.

Fail next n delete from storage attempts with `cause` exception for any persistence id.

Definition ClassesPersistenceTestKit → CommonTestKitOps
32. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNDeletes(persistenceId:String,n:Int):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for particular persistence id.

Fail next n delete from storage attempts with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
33. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNDeletes(n:Int):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for any persistence id.

Fail next n delete from storage attempts with default exception for any persistence id.

Definition ClassesCommonTestKitOps
34. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNOps(n:Int,cause:Throwable):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations regardless of their type.

Fail `n` following journal operations regardless of their type.
Fails operations with the `cause` exception.

Definition ClassesPolicyOpsTestKit
35. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNOps(n:Int):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail n following journal operations regardless of their type.

Fail n following journal operations regardless of their type.
Fails operations with default `ExpectedFailure` exception.

Definition ClassesPolicyOpsTestKit
36. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNOpsCond(cond:(String,P)=>Boolean,n:Int,cause:Throwable):Unit "Permalink")  def failNextNOpsCond(cond: (String, [JournalOperation](../JournalOperation.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with the `cause` exception.

Definition ClassesPolicyOpsTestKit
37. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNOpsCond(cond:(String,P)=>Boolean,n:Int):Unit "Permalink")  def failNextNOpsCond(cond: (String, [JournalOperation](../JournalOperation.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with default `ExpectedFailure` exception.

Definition ClassesPolicyOpsTestKit
38. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNPersisted(n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for any persistence id.

Fail next `n` write operations with the `cause` exception for any persistence id.

Definition ClassesPersistenceTestKit → CommonTestKitOps
39. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNPersisted(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for particular persistence id.

Fail next `n` write operations with the `cause` exception for particular persistence id.

Definition ClassesPersistenceTestKit → CommonTestKitOps
40. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNPersisted(n:Int):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with default exception for any persistence id.

Fail next `n` write operations with default exception for any persistence id.

Definition ClassesCommonTestKitOps
41. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNPersisted(persistenceId:String,n:Int):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations for particular persistence id.

Fail next `n` write operations for particular persistence id.

Definition ClassesCommonTestKitOps
42. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNReads(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.

Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.

Definition ClassesPersistenceTestKit → CommonTestKitOps
43. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNReads(n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.

Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.

Definition ClassesPersistenceTestKit → CommonTestKitOps
44. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNReads(persistenceId:String,n:Int):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for particular persistence id.

Fail next n read from storage (recovery) attempts with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
45. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextNReads(n:Int):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for any persistence id.

Fail next n read from storage (recovery) attempts with default exception for any persistence id.

Definition ClassesCommonTestKitOps
46. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextPersisted():Unit "Permalink")  def failNextPersisted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with default exception for any persistence id.

Fail next write operation with default exception for any persistence id.

Definition ClassesCommonTestKitOps
47. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextPersisted(cause:Throwable):Unit "Permalink")  def failNextPersisted(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with `cause` exception for any persistence id.

Fail next write operation with `cause` exception for any persistence id.

Definition ClassesCommonTestKitOps
48. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextPersisted(persistenceId:String):Unit "Permalink")  def failNextPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with default exception for particular persistence id.

Fail next write operation with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
49. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextPersisted(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextPersisted(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with `cause` exception for particular persistence id.

Fail next write operation with `cause` exception for particular persistence id.

Definition ClassesCommonTestKitOps
50. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextRead(persistenceId:String):Unit "Permalink")  def failNextRead(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.

Fail next read from storage (recovery) attempt with default exception for any persistence id.

Definition ClassesCommonTestKitOps
51. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextRead(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextRead(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.

Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.

Definition ClassesCommonTestKitOps
52. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextRead():Unit "Permalink")  def failNextRead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.

Fail next read from storage (recovery) attempt with default exception for any persistence id.

Definition ClassesCommonTestKitOps
53. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#failNextRead(cause:Throwable):Unit "Permalink")  def failNextRead(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.

Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.

Definition ClassesCommonTestKitOps
54. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
55. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#getItem(persistenceId:String,nextInd:Int):Option[Any] "Permalink")  def getItem(persistenceId: String, nextInd: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesExpectOps
56. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
57. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
58. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
59. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
60. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
61. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#persistForRecovery(persistenceId:String,events:Seq[Any]):Unit "Permalink")  def persistForRecovery(persistenceId: String, events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Persist `snapshots` into storage in order.

Persist `snapshots` into storage in order.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
62. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#persistedInStorage(persistenceId:String):Seq[Any] "Permalink")  def persistedInStorage(persistenceId: String): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Retrieve all snapshots saved in storage by persistence id.

Retrieve all snapshots saved in storage by persistence id.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
63. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A],max:scala.concurrent.duration.FiniteDuration):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A], max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
64. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A]):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive next `n` events/snapshots that have been persisted in the storage.

Receive next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
65. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#receivePersisted[A](persistenceId:String,n:Int)(implicitt:scala.reflect.ClassTag[A]):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive next `n` events/snapshots that have been persisted in the storage.

Receive next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
66. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#receivePersisted[A](persistenceId:String,n:Int,max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[A]):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
67. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextDelete(persistenceId:String,cause:Throwable):Unit "Permalink")  def rejectNextDelete(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operations for particular persistence id with `cause` exception.

Reject next delete from storage operations for particular persistence id with `cause` exception.

Definition ClassesPersistenceTestKitOps
68. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextDelete(persistenceId:String):Unit "Permalink")  def rejectNextDelete(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operations for particular persistence id with default exception.

Reject next delete from storage operations for particular persistence id with default exception.

Definition ClassesPersistenceTestKitOps
69. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextDelete(cause:Throwable):Unit "Permalink")  def rejectNextDelete(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operation for any persistence id with `cause` exception.

Reject next delete from storage operation for any persistence id with `cause` exception.

Definition ClassesPersistenceTestKitOps
70. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextDelete():Unit "Permalink")  def rejectNextDelete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operation for any persistence id with default exception.

Reject next delete from storage operation for any persistence id with default exception.

Definition ClassesPersistenceTestKitOps
71. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNDeletes(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for particular persistence id with `cause` exception.

Reject next n delete from storage operations for particular persistence id with `cause` exception.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
72. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNDeletes(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for any persistence id with `cause` exception.

Reject next n delete from storage operations for any persistence id with `cause` exception.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
73. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNDeletes(persistenceId:String,n:Int):Unit "Permalink")  def rejectNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for particular persistence id with default exception.

Reject next n delete from storage operations for particular persistence id with default exception.

Definition ClassesPersistenceTestKitOps
74. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNDeletes(n:Int):Unit "Permalink")  def rejectNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for any persistence id with default exception.

Reject next n delete from storage operations for any persistence id with default exception.

Definition ClassesPersistenceTestKitOps
75. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNOps(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject `n` following journal operations regardless of their type.

Reject `n` following journal operations regardless of their type.
Rejects operations with the `cause` exception.

Definition ClassesRejectSupport
76. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNOps(n:Int):Unit "Permalink")  def rejectNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject n following journal operations regardless of their type.

Reject n following journal operations regardless of their type.
Rejects operations with default `ExpectedRejection` exception.

Definition ClassesRejectSupport
77. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNOpsCond(cond:(String,U)=>Boolean,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNOpsCond(cond: (String, [JournalOperation](../JournalOperation.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject `n` following journal operations depending on the condition `cond`.

Reject `n` following journal operations depending on the condition `cond`.
Rejection triggers, when `cond` returns true.
Rejects operations with the `cause` exception.

Definition ClassesRejectSupport
78. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNOpsCond(cond:(String,U)=>Boolean,n:Int):Unit "Permalink")  def rejectNextNOpsCond(cond: (String, [JournalOperation](../JournalOperation.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject `n` following journal operations depending on the condition `cond`.

Reject `n` following journal operations depending on the condition `cond`.
Rejection triggers, when `cond` returns true.
Reject operations with default `ExpectedRejection` exception.

Definition ClassesRejectSupport
79. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNPersisted(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for any persistence id with `cause` exception.

Reject next n save in storage operations for any persistence id with `cause` exception.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
80. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNPersisted(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for particular persistence id with `cause` exception.

Reject next n save in storage operations for particular persistence id with `cause` exception.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
81. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNPersisted(n:Int):Unit "Permalink")  def rejectNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for any persistence id with default exception.

Reject next n save in storage operations for any persistence id with default exception.

Definition ClassesPersistenceTestKitOps
82. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNPersisted(persistenceId:String,n:Int):Unit "Permalink")  def rejectNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for particular persistence id with default exception.

Reject next n save in storage operations for particular persistence id with default exception.

Definition ClassesPersistenceTestKitOps
83. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNReads(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for particular persistence id with `cause` exception.

Reject next n read from storage operations for particular persistence id with `cause` exception.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
84. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNReads(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for any persistence id with `cause` exception.

Reject next n read from storage operations for any persistence id with `cause` exception.

Definition ClassesPersistenceTestKit → PersistenceTestKitOps
85. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNReads(persistenceId:String,n:Int):Unit "Permalink")  def rejectNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for particular persistence id with default exception.

Reject next n read from storage operations for particular persistence id with default exception.

Definition ClassesPersistenceTestKitOps
86. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextNReads(n:Int):Unit "Permalink")  def rejectNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for any persistence id with default exception.

Reject next n read from storage operations for any persistence id with default exception.

Definition ClassesPersistenceTestKitOps
87. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextPersisted():Unit "Permalink")  def rejectNextPersisted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for any persistence id with default exception.

Reject next save in storage operation for any persistence id with default exception.

Definition ClassesPersistenceTestKitOps
88. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextPersisted(cause:Throwable):Unit "Permalink")  def rejectNextPersisted(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for any persistence id with `cause` exception.

Reject next save in storage operation for any persistence id with `cause` exception.

Definition ClassesPersistenceTestKitOps
89. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextPersisted(persistenceId:String,cause:Throwable):Unit "Permalink")  def rejectNextPersisted(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for particular persistence id with `cause` exception.

Reject next save in storage operation for particular persistence id with `cause` exception.

Definition ClassesPersistenceTestKitOps
90. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextPersisted(persistenceId:String):Unit "Permalink")  def rejectNextPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for particular persistence id with default exception.

Reject next save in storage operation for particular persistence id with default exception.

Definition ClassesPersistenceTestKitOps
91. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextRead(persistenceId:String,cause:Throwable):Unit "Permalink")  def rejectNextRead(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for particular persistence id with `cause` exception.

Reject next read from storage operation for particular persistence id with `cause` exception.

Definition ClassesPersistenceTestKitOps
92. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextRead(persistenceId:String):Unit "Permalink")  def rejectNextRead(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for particular persistence id with default exception.

Reject next read from storage operation for particular persistence id with default exception.

Definition ClassesPersistenceTestKitOps
93. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextRead(cause:Throwable):Unit "Permalink")  def rejectNextRead(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for any persistence id with `cause` exception.

Reject next read from storage operation for any persistence id with `cause` exception.

Definition ClassesPersistenceTestKitOps
94. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#rejectNextRead():Unit "Permalink")  def rejectNextRead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for any persistence id with default exception.

Reject next read from storage operation for any persistence id with default exception.

Definition ClassesPersistenceTestKitOps
95. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#resetPolicy():Unit "Permalink")  def resetPolicy(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Returns default policy if it was changed by PolicyOpsTestKit.this.withPolicy().

Returns default policy if it was changed by PolicyOpsTestKit.this.withPolicy().

Definition ClassesPolicyOpsTestKit
96. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#storage:akka.persistence.testkit.EventStorage "Permalink")  val storage: EventStorageAttributesprotected Definition ClassesPersistenceTestKit → HasStorage
97. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
98. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
99. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
100. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
101. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
102. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#withPolicy(policy:PolicyOpsTestKit.this.Policies.PolicyType):PolicyOpsTestKit.this.type "Permalink")  def withPolicy(policy: [EventStorage.JournalPolicies.PolicyType](../EventStorage$$JournalPolicies$.html#PolicyType=akka.persistence.testkit.ProcessingPolicy[U])): PersistenceTestKit.this.typeSet new processing policy for journal operations.

Set new processing policy for journal operations.
NOTE! Overrides previously invoked `failNext...` or `rejectNext...`

Definition ClassesPolicyOpsTestKit
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKit toStringFormat\[PersistenceTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceTestKit, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKit toArrowAssoc\[PersistenceTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from HasStorage\[[JournalOperation](../JournalOperation.html), [PersistentRepr](../../PersistentRepr.html)]

### Inherited from ExpectOps\[[PersistentRepr](../../PersistentRepr.html)]

### Inherited from PersistenceTestKitOps\[[PersistentRepr](../../PersistentRepr.html), [JournalOperation](../JournalOperation.html)]

### Inherited from CommonTestKitOps\[[PersistentRepr](../../PersistentRepr.html), [JournalOperation](../JournalOperation.html)]

### Inherited from PolicyOpsTestKit\[[JournalOperation](../JournalOperation.html)]

### Inherited from ClearOps

### Inherited from ClearPreservingSeqNums

### Inherited from RejectSupport\[[JournalOperation](../JournalOperation.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceTestKit to any2stringadd\[PersistenceTestKit]

### Inherited by implicit conversion StringFormat fromPersistenceTestKit to StringFormat\[PersistenceTestKit]

### Inherited by implicit conversion Ensuring fromPersistenceTestKit to Ensuring\[PersistenceTestKit]

### Inherited by implicit conversion ArrowAssoc fromPersistenceTestKit to ArrowAssoc\[PersistenceTestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/EventStorage$$JournalPolicies$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html)*