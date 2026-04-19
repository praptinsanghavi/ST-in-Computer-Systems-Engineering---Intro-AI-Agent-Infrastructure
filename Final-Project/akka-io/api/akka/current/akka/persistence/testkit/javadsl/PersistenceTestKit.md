---
description: Akka 2.10.17 - akka.persistence.testkit.javadsl.PersistenceTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/javadsl/PersistenceTestKit.html
title: Akka 2.10.17 - akka.persistence.testkit.javadsl.PersistenceTestKit
---

# Akka 2.10.17 - akka.persistence.testkit.javadsl.PersistenceTestKit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.javadsl.PersistenceTestKit

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
- PersistenceTestKit
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing persisted snapshots in persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
[c](PersistenceTestKit$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [PersistenceTestKit](PersistenceTestKit$.html "See companion object")[**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html "Permalink")

### Companion [object PersistenceTestKit](PersistenceTestKit$.html "See companion object")

#### class PersistenceTestKit extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Class for testing persisted events in persistent actors.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[PersistenceTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/javadsl/PersistenceTestKit.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceTestKit
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

1. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#<init>(system:akka.actor.ActorSystem):akka.persistence.testkit.javadsl.PersistenceTestKit "Permalink")  new PersistenceTestKit(system: [ActorSystem](../../../actor/ActorSystem.html))
2. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#<init>(scalaTestkit:akka.persistence.testkit.scaladsl.PersistenceTestKit):akka.persistence.testkit.javadsl.PersistenceTestKit "Permalink")  new PersistenceTestKit(scalaTestkit: [scaladsl.PersistenceTestKit](../scaladsl/PersistenceTestKit.html))
### Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKit toany2stringadd\[PersistenceTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceTestKit, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKit toArrowAssoc\[PersistenceTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#clearAll():Unit "Permalink")  def clearAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from storage.

Clear all data from storage.

NOTE! Also clears sequence numbers in storage!

See alsoPersistenceTestKit.clearAllPreservingSeqNumbers()
8. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#clearAllPreservingSeqNumbers():Unit "Permalink")  def clearAllPreservingSeqNumbers(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data in storage preserving sequence numbers.

Clear all data in storage preserving sequence numbers.

See alsoPersistenceTestKit.clearAll()
9. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#clearByIdPreservingSeqNumbers(persistenceId:String):Unit "Permalink")  def clearByIdPreservingSeqNumbers(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data in storage for particular persistence id preserving sequence numbers.

Clear all data in storage for particular persistence id preserving sequence numbers.

See alsoPersistenceTestKit.clearByPersistenceId()
10. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#clearByPersistenceId(persistenceId:String):Unit "Permalink")  def clearByPersistenceId(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear all data from storage for particular persistence id.

Clear all data from storage for particular persistence id.

NOTE! Also clears sequence number in storage!

See alsoPersistenceTestKit.clearByIdPreservingSeqNumbers()
11. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitImplicitThis member is added by an implicit conversion from PersistenceTestKit toEnsuring\[PersistenceTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#expectNextPersisted[A](persistenceId:String,event:A,max:java.time.Duration):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, event: A, max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ACheck for `max` time that `event` has been saved in the storage.
19. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#expectNextPersisted[A](persistenceId:String,event:A):A "Permalink")  def expectNextPersisted\[A](persistenceId: String, event: A): ACheck that `event` has been saved in the storage.
20. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A],max:java.time.Duration):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ACheck for `max` time that next persisted in storage for particular persistence id event has expected type.
21. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#expectNextPersistedClass[A](persistenceId:String,cla:Class[A]):A "Permalink")  def expectNextPersistedClass\[A](persistenceId: String, cla: Class\[A]): ACheck that next persisted in storage for particular persistence id event has expected type.
22. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#expectNothingPersisted(persistenceId:String,max:java.time.Duration):Unit "Permalink")  def expectNothingPersisted(persistenceId: String, max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check for `max` time that nothing has been saved in the storage.
23. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#expectNothingPersisted(persistenceId:String):Unit "Permalink")  def expectNothingPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that nothing has been saved in the storage.
24. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextDelete(persistenceId:String):Unit "Permalink")  def failNextDelete(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for particular persistence id.
25. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextDelete(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextDelete(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for particular persistence id.
26. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextDelete():Unit "Permalink")  def failNextDelete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with default exception for any persistence id.
27. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextDelete(cause:Throwable):Unit "Permalink")  def failNextDelete(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next delete from storage attempt with `cause` exception for any persistence id.
28. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNDeletes(persistenceId:String,n:Int):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for particular persistence id.
29. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNDeletes(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for particular persistence id.
30. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNDeletes(n:Int):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with default exception for any persistence id.
31. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNDeletes(n:Int,cause:Throwable):Unit "Permalink")  def failNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n delete from storage attempts with `cause` exception for any persistence id.
32. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNOps(n:Int,cause:Throwable):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with the `cause` exception.
33. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNOps(n:Int):Unit "Permalink")  def failNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail n following journal operations regardless of their type.

Fail n following journal operations regardless of their type.
Fails operations with default `ExpectedFailure` exception.
34. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNOpsCond(cond:java.util.function.BiFunction[String,akka.persistence.testkit.JournalOperation,Boolean],n:Int,cause:Throwable):Unit "Permalink")  def failNextNOpsCond(cond: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [JournalOperation](../JournalOperation.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with the `cause` exception.
35. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNOpsCond(cond:java.util.function.BiFunction[String,akka.persistence.testkit.JournalOperation,Boolean],n:Int):Unit "Permalink")  def failNextNOpsCond(cond: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [JournalOperation](../JournalOperation.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail `n` following journal operations depending on the condition `cond`.

Fail `n` following journal operations depending on the condition `cond`.
Failure triggers, when `cond` returns true.
Fails operations with default `ExpectedFailure` exception.
36. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNPersisted(n:Int):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with default exception for any persistence id.
37. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNPersisted(n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for any persistence id.
38. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNPersisted(persistenceId:String,n:Int):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations for particular persistence id.
39. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNPersisted(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next `n` write operations with the `cause` exception for particular persistence id.
40. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNReads(persistenceId:String,n:Int):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for particular persistence id.
41. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNReads(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for particular persistence id.
42. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNReads(n:Int):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with default exception for any persistence id.
43. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextNReads(n:Int,cause:Throwable):Unit "Permalink")  def failNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next n read from storage (recovery) attempts with `cause` exception for any persistence id.
44. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextPersisted():Unit "Permalink")  def failNextPersisted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with default exception for any persistence id.
45. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextPersisted(cause:Throwable):Unit "Permalink")  def failNextPersisted(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation event with `cause` exception for any persistence id.
46. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextPersisted(persistenceId:String):Unit "Permalink")  def failNextPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with default exception for particular persistence id.
47. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextPersisted(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextPersisted(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next write operation with `cause` exception for particular persistence id.
48. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextRead(persistenceId:String):Unit "Permalink")  def failNextRead(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.
49. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextRead(persistenceId:String,cause:Throwable):Unit "Permalink")  def failNextRead(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for particular persistence id.
50. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextRead():Unit "Permalink")  def failNextRead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with default exception for any persistence id.
51. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#failNextRead(cause:Throwable):Unit "Permalink")  def failNextRead(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Fail next read from storage (recovery) attempt with `cause` exception for any persistence id.
52. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
55. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
56. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
57. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
58. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#persistForRecovery(persistenceId:String,events:java.util.List[Any]):Unit "Permalink")  def persistForRecovery(persistenceId: String, events: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Persist `events` into storage in order.
59. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#persistedInStorage(persistenceId:String):java.util.List[Any] "Permalink")  def persistedInStorage(persistenceId: String): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Retrieve all events saved in storage by persistence id.
60. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A],max:java.time.Duration):java.util.List[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[A]Receive for `max` time next n events from the storage.
61. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#receivePersisted[A](persistenceId:String,n:Int,cla:Class[A]):java.util.List[A] "Permalink")  def receivePersisted\[A](persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cla: Class\[A]): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[A]Receive next n events from the storage.
62. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextDelete(persistenceId:String,cause:Throwable):Unit "Permalink")  def rejectNextDelete(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operations for particular persistence id with `cause` exception.
63. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextDelete(persistenceId:String):Unit "Permalink")  def rejectNextDelete(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operations for particular persistence id with default exception.
64. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextDelete(cause:Throwable):Unit "Permalink")  def rejectNextDelete(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operation for any persistence id with `cause` exception.
65. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextDelete():Unit "Permalink")  def rejectNextDelete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next delete from storage operation for any persistence id with default exception.
66. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNDeletes(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for particular persistence id with `cause` exception.
67. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNDeletes(persistenceId:String,n:Int):Unit "Permalink")  def rejectNextNDeletes(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for particular persistence id with default exception.
68. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNDeletes(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for any persistence id with `cause` exception.
69. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNDeletes(n:Int):Unit "Permalink")  def rejectNextNDeletes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n delete from storage operations for any persistence id with default exception.
70. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNOps(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject `n` following journal operations regardless of their type.

Reject `n` following journal operations regardless of their type.
Rejects operations with the `cause` exception.
71. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNOps(n:Int):Unit "Permalink")  def rejectNextNOps(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject n following journal operations regardless of their type.

Reject n following journal operations regardless of their type.
Rejects operations with default `ExpectedRejection` exception.
72. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNOpsCond(cond:java.util.function.BiFunction[String,akka.persistence.testkit.JournalOperation,Boolean],n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNOpsCond(cond: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [JournalOperation](../JournalOperation.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject `n` following journal operations depending on the condition `cond`.

Reject `n` following journal operations depending on the condition `cond`.
Rejection triggers, when `cond` returns true.
Rejects operations with the `cause` exception.
73. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNOpsCond(cond:java.util.function.BiFunction[String,akka.persistence.testkit.JournalOperation,Boolean],n:Int):Unit "Permalink")  def rejectNextNOpsCond(cond: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [JournalOperation](../JournalOperation.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject `n` following journal operations depending on the condition `cond`.

Reject `n` following journal operations depending on the condition `cond`.
Rejection triggers, when `cond` returns true.
Reject operations with default `ExpectedRejection` exception.
74. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNPersisted(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for any persistence id with `cause` exception.
75. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNPersisted(n:Int):Unit "Permalink")  def rejectNextNPersisted(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for any persistence id with default exception.
76. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNPersisted(persistenceId:String,n:Int):Unit "Permalink")  def rejectNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for particular persistence id with default exception.
77. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNPersisted(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNPersisted(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n save in storage operations for particular persistence id with `cause` exception.
78. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNReads(persistenceId:String,n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for particular persistence id with `cause` exception.
79. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNReads(persistenceId:String,n:Int):Unit "Permalink")  def rejectNextNReads(persistenceId: String, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for particular persistence id with default exception.
80. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNReads(n:Int,cause:Throwable):Unit "Permalink")  def rejectNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for any persistence id with `cause` exception.
81. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextNReads(n:Int):Unit "Permalink")  def rejectNextNReads(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next n read from storage operations for any persistence id with default exception.
82. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextPersisted():Unit "Permalink")  def rejectNextPersisted(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for any persistence id with default exception.
83. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextPersisted(cause:Throwable):Unit "Permalink")  def rejectNextPersisted(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for any persistence id with `cause` exception.
84. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextPersisted(persistenceId:String,cause:Throwable):Unit "Permalink")  def rejectNextPersisted(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for particular persistence id with `cause` exception.
85. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextPersisted(persistenceId:String):Unit "Permalink")  def rejectNextPersisted(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next save in storage operation for particular persistence id with default exception.
86. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextRead(persistenceId:String,cause:Throwable):Unit "Permalink")  def rejectNextRead(persistenceId: String, cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for particular persistence id with `cause` exception.
87. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextRead(persistenceId:String):Unit "Permalink")  def rejectNextRead(persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for particular persistence id with default exception.
88. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextRead(cause:Throwable):Unit "Permalink")  def rejectNextRead(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for any persistence id with `cause` exception.
89. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#rejectNextRead():Unit "Permalink")  def rejectNextRead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reject next read from storage operation for any persistence id with default exception.
90. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#resetPolicy():Unit "Permalink")  def resetPolicy(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Returns default policy if it was changed by PersistenceTestKit.withPolicy().
91. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
92. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
93. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
94. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
95. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
96. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#withPolicy(policy:akka.persistence.testkit.EventStorage.JournalPolicies.PolicyType):akka.persistence.testkit.javadsl.PersistenceTestKit "Permalink")  def withPolicy(policy: [EventStorage.JournalPolicies.PolicyType](../EventStorage$$JournalPolicies$.html#PolicyType=akka.persistence.testkit.ProcessingPolicy[U])): PersistenceTestKitSet new processing policy for journal operations.

Set new processing policy for journal operations.
NOTE! Overrides previously invoked `failNext...` or `rejectNext...`
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKit toStringFormat\[PersistenceTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceTestKit, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKit toArrowAssoc\[PersistenceTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceTestKit to any2stringadd\[PersistenceTestKit]

### Inherited by implicit conversion StringFormat fromPersistenceTestKit to StringFormat\[PersistenceTestKit]

### Inherited by implicit conversion Ensuring fromPersistenceTestKit to Ensuring\[PersistenceTestKit]

### Inherited by implicit conversion ArrowAssoc fromPersistenceTestKit to ArrowAssoc\[PersistenceTestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$$JournalPolicies$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/JournalOperation.html
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
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit.html)*