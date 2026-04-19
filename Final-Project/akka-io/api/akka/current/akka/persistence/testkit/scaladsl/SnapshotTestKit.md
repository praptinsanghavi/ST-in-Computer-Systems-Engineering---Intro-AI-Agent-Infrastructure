---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.SnapshotTestKit

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
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- SnapshotTestKit
- [UnpersistentBehavior](UnpersistentBehavior.html)
[c](SnapshotTestKit$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# [SnapshotTestKit](SnapshotTestKit$.html "See companion object")[**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html "Permalink")

### Companion [object SnapshotTestKit](SnapshotTestKit$.html "See companion object")

#### class SnapshotTestKit extends CommonTestKitOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)), [SnapshotOperation](../SnapshotOperation.html)] with PolicyOpsTestKit\[[SnapshotOperation](../SnapshotOperation.html)] with ExpectOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))] with HasStorage\[[SnapshotOperation](../SnapshotOperation.html), ([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]

Class for testing snapshots of persistent actors.

NOTE! ActorSystem must be configured with [PersistenceTestKitSnapshotPlugin](../PersistenceTestKitSnapshotPlugin.html).
The configuration can be retrieved with [PersistenceTestKitSnapshotPlugin.config](../PersistenceTestKitSnapshotPlugin$.html#config:com.typesafe.config.Config).

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[PersistenceTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/PersistenceTestKit.scala#L320)Linear SupertypesHasStorage\[[SnapshotOperation](../SnapshotOperation.html), ([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))], ExpectOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))], CommonTestKitOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)), [SnapshotOperation](../SnapshotOperation.html)], PolicyOpsTestKit\[[SnapshotOperation](../SnapshotOperation.html)], ClearOps, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SnapshotTestKit
2. HasStorage
3. ExpectOps
4. CommonTestKitOps
5. PolicyOpsTestKit
6. ClearOps
7. AnyRef
8. Any
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

1. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#<init>(system:akka.actor.ActorSystem):akka.persistence.testkit.scaladsl.SnapshotTestKit "Permalink")  new SnapshotTestKit(system: [ActorSystem](../../../actor/ActorSystem.html))
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SnapshotTestKit toany2stringadd\[SnapshotTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SnapshotTestKit, B)ImplicitThis member is added by an implicit conversion from SnapshotTestKit toArrowAssoc\[SnapshotTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#clearAll():Unit "Permalink")  def clearAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from the storage.

Clear all data from the storage.

NOTE! Also clears sequence numbers in storage!

Definition ClassesClearOpsSee alsoClearPreservingSeqNums.clearAllPreservingSeqNumbers()
8. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#clearByPersistenceId(persistenceId:String):Unit "Permalink")  def clearByPersistenceId(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from the storage for particular persistence id.

Clear all data from the storage for particular persistence id.

NOTE! Also clears sequence number in the storage!

Definition ClassesClearOpsSee alsoClearPreservingSeqNums.clearByIdPreservingSeqNumbers()
9. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SnapshotTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SnapshotTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotTestKitImplicitThis member is added by an implicit conversion from SnapshotTestKit toEnsuring\[SnapshotTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNextPersisted[A](persistenceId:String,event:A):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, event: A): ACheck that next persisted in storage for particular persistence id event/snapshot was `event`.

Check that next persisted in storage for particular persistence id event/snapshot was `event`.

Definition ClassesSnapshotTestKit → ExpectOps → CommonTestKitOps
17. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNextPersisted[A](persistenceId:String,event:A,max:scala.concurrent.duration.FiniteDuration):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, event: A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ACheck for `max` time that next persisted in storage for particular persistence id event/snapshot was `event`.

Check for `max` time that next persisted in storage for particular persistence id event/snapshot was `event`.

Definition ClassesExpectOps
18. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A],max:scala.concurrent.duration.FiniteDuration):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A], max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ACheck for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
19. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A]):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A]): ACheck that next persisted in storage for particular persistence id event/snapshot has expected type.

Check that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
20. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNextPersistedType[A](persistenceId:String,max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[A]):A "Permalink")  def expectNextPersistedType\[A](persistenceId: String, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): ACheck for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Check for `max` time that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
21. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNextPersistedType[A](persistenceId:String)(implicitt:scala.reflect.ClassTag[A]):A "Permalink")  def expectNextPersistedType\[A](persistenceId: String)(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): ACheck that next persisted in storage for particular persistence id event/snapshot has expected type.

Check that next persisted in storage for particular persistence id event/snapshot has expected type.

Definition ClassesExpectOps
22. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNothingPersisted(persistenceId:String,max:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def expectNothingPersisted(persistenceId: String, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check for `max` time that nothing was persisted in storage for particular persistence id.

Check for `max` time that nothing was persisted in storage for particular persistence id.

Definition ClassesExpectOps
23. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#expectNothingPersisted(persistenceId:String):Unit "Permalink")  def expectNothingPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that nothing was persisted in storage for particular persistence id.

Check that nothing was persisted in storage for particular persistence id.

Definition ClassesExpectOps
24. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextDelete(persistenceId:String):Unit "Permalink")  def failNextDelete(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for particular persistence id.

Fail next delete from storage attempt with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
25. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextDelete(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextDelete(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for particular persistence id.

Fail next delete from storage attempt with `cause` exception for particular persistence id.

Definition ClassesCommonTestKitOps
26. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextDelete():Unit "Permalink")  def failNextDelete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for any persistence id.

Fail next delete from storage attempt with default exception for any persistence id.

Definition ClassesCommonTestKitOps
27. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextDelete(cause:Throwable):Unit "Permalink")  def failNextDelete(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for any persistence id.

Fail next delete from storage attempt with `cause` exception for any persistence id.

Definition ClassesCommonTestKitOps
28. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNDeletes(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for particular persistence id.

Fail next n delete from storage attempts with `cause` exception for particular persistence id.

Definition ClassesSnapshotTestKit → CommonTestKitOps
29. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNDeletes(n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for any persistence id.

Fail next n delete from storage attempts with `cause` exception for any persistence id.

Definition ClassesSnapshotTestKit → CommonTestKitOps
30. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNDeletes(persistenceId:String,n:Int):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for particular persistence id.

Fail next n delete from storage attempts with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
31. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNDeletes(n:Int):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for any persistence id.

Fail next n delete from storage attempts with default exception for any persistence id.

Definition ClassesCommonTestKitOps
32. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNOps(n:Int,cause:Throwable):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations regardless of their type.

Fail `n` following journal operations regardless of their type.
Fails operations with the `cause` exception.

Definition ClassesPolicyOpsTestKit
33. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNOps(n:Int):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail n following journal operations regardless of their type.

Fail n following journal operations regardless of their type.
Fails operations with default `ExpectedFailure` exception.

Definition ClassesPolicyOpsTestKit
34. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNOpsCond(cond:(String,P)=>Boolean,n:Int,cause:Throwable):Unit "Permalink")  def failNextNOpsCond(cond: (String, [SnapshotOperation](../SnapshotOperation.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with the `cause` exception.

Definition ClassesPolicyOpsTestKit
35. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNOpsCond(cond:(String,P)=>Boolean,n:Int):Unit "Permalink")  def failNextNOpsCond(cond: (String, [SnapshotOperation](../SnapshotOperation.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with default `ExpectedFailure` exception.

Definition ClassesPolicyOpsTestKit
36. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNPersisted(n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for any persistence id.

Fail next `n` write operations with the `cause` exception for any persistence id.

Definition ClassesSnapshotTestKit → CommonTestKitOps
37. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNPersisted(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for particular persistence id.

Fail next `n` write operations with the `cause` exception for particular persistence id.

Definition ClassesSnapshotTestKit → CommonTestKitOps
38. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNPersisted(n:Int):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with default exception for any persistence id.

Fail next `n` write operations with default exception for any persistence id.

Definition ClassesCommonTestKitOps
39. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNPersisted(persistenceId:String,n:Int):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations for particular persistence id.

Fail next `n` write operations for particular persistence id.

Definition ClassesCommonTestKitOps
40. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNReads(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.

Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.

Definition ClassesSnapshotTestKit → CommonTestKitOps
41. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNReads(n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.

Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.

Definition ClassesSnapshotTestKit → CommonTestKitOps
42. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNReads(persistenceId:String,n:Int):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for particular persistence id.

Fail next n read from storage (recovery) attempts with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
43. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextNReads(n:Int):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for any persistence id.

Fail next n read from storage (recovery) attempts with default exception for any persistence id.

Definition ClassesCommonTestKitOps
44. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextPersisted():Unit "Permalink")  def failNextPersisted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with default exception for any persistence id.

Fail next write operation with default exception for any persistence id.

Definition ClassesCommonTestKitOps
45. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextPersisted(cause:Throwable):Unit "Permalink")  def failNextPersisted(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with `cause` exception for any persistence id.

Fail next write operation with `cause` exception for any persistence id.

Definition ClassesCommonTestKitOps
46. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextPersisted(persistenceId:String):Unit "Permalink")  def failNextPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with default exception for particular persistence id.

Fail next write operation with default exception for particular persistence id.

Definition ClassesCommonTestKitOps
47. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextPersisted(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextPersisted(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with `cause` exception for particular persistence id.

Fail next write operation with `cause` exception for particular persistence id.

Definition ClassesCommonTestKitOps
48. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextRead(persistenceId:String):Unit "Permalink")  def failNextRead(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.

Fail next read from storage (recovery) attempt with default exception for any persistence id.

Definition ClassesCommonTestKitOps
49. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextRead(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextRead(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.

Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.

Definition ClassesCommonTestKitOps
50. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextRead():Unit "Permalink")  def failNextRead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.

Fail next read from storage (recovery) attempt with default exception for any persistence id.

Definition ClassesCommonTestKitOps
51. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#failNextRead(cause:Throwable):Unit "Permalink")  def failNextRead(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.

Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.

Definition ClassesCommonTestKitOps
52. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#getItem(persistenceId:String,nextInd:Int):Option[Any] "Permalink")  def getItem(persistenceId: String, nextInd: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesSnapshotTestKit → ExpectOps
54. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
55. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
56. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
57. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
58. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
59. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#persistForRecovery(persistenceId:String,elem:(akka.persistence.testkit.SnapshotMeta,Any)):Unit "Permalink")  def persistForRecovery(persistenceId: String, elem: ([SnapshotMeta](../SnapshotMeta.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Persist a pair of (snapshot metadata, snapshot payload) into storage.
60. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#persistForRecovery(persistenceId:String,elems:Seq[(akka.persistence.testkit.SnapshotMeta,Any)]):Unit "Permalink")  def persistForRecovery(persistenceId: String, elems: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[([SnapshotMeta](../SnapshotMeta.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Persist `elems` pairs of (snapshot metadata, snapshot payload) into storage.
61. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#persistedInStorage(persistenceId:String):Seq[(akka.persistence.testkit.SnapshotMeta,Any)] "Permalink")  def persistedInStorage(persistenceId: String): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[([SnapshotMeta](../SnapshotMeta.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]Retrieve snapshots and their metadata from storage by persistence id.
62. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A],max:scala.concurrent.duration.FiniteDuration):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A], max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
63. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A]):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive next `n` events/snapshots that have been persisted in the storage.

Receive next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
64. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#receivePersisted[A](persistenceId:String,n:Int)(implicitt:scala.reflect.ClassTag[A]):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive next `n` events/snapshots that have been persisted in the storage.

Receive next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
65. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#receivePersisted[A](persistenceId:String,n:Int,max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[A]):Seq[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Receive for `max` time next `n` events/snapshots that have been persisted in the storage.

Definition ClassesExpectOps
66. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#resetPolicy():Unit "Permalink")  def resetPolicy(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Returns default policy if it was changed by PolicyOpsTestKit.this.withPolicy().

Returns default policy if it was changed by PolicyOpsTestKit.this.withPolicy().

Definition ClassesPolicyOpsTestKit
67. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#storage:akka.persistence.testkit.SnapshotStorage "Permalink")  val storage: SnapshotStorageAttributesprotected Definition ClassesSnapshotTestKit → HasStorage
68. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
69. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
70. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
71. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
72. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
73. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#withPolicy(policy:PolicyOpsTestKit.this.Policies.PolicyType):PolicyOpsTestKit.this.type "Permalink")  def withPolicy(policy: [SnapshotStorage.SnapshotPolicies.PolicyType](../SnapshotStorage$$SnapshotPolicies$.html#PolicyType=akka.persistence.testkit.ProcessingPolicy[U])): SnapshotTestKit.this.typeSet new processing policy for journal operations.

Set new processing policy for journal operations.
NOTE! Overrides previously invoked `failNext...` or `rejectNext...`

Definition ClassesPolicyOpsTestKit
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SnapshotTestKit toStringFormat\[SnapshotTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SnapshotTestKit, B)ImplicitThis member is added by an implicit conversion from SnapshotTestKit toArrowAssoc\[SnapshotTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from HasStorage\[[SnapshotOperation](../SnapshotOperation.html), ([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]

### Inherited from ExpectOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]

### Inherited from CommonTestKitOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)), [SnapshotOperation](../SnapshotOperation.html)]

### Inherited from PolicyOpsTestKit\[[SnapshotOperation](../SnapshotOperation.html)]

### Inherited from ClearOps

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
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html)*