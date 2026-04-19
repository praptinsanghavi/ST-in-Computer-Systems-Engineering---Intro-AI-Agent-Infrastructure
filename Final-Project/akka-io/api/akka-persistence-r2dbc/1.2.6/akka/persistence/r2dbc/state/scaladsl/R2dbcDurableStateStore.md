---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html
title: ''
---

# 

## Content

\< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- [AdditionalColumn](AdditionalColumn.html)
- [ChangeHandler](ChangeHandler.html)
- R2dbcDurableStateStore
[c](R2dbcDurableStateStore$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html).[scaladsl](index.html)

# [R2dbcDurableStateStore](R2dbcDurableStateStore$.html "See companion object")[**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html "Permalink")

### Companion [object R2dbcDurableStateStore](R2dbcDurableStateStore$.html "See companion object")

#### class R2dbcDurableStateStore\[A] extends DurableStateUpdateWithChangeEventStore\[A] with DurableStateStoreBySliceQuery\[A] with DurableStateStorePagedPersistenceIdsQuery\[A]

Linear SupertypesDurableStateStorePagedPersistenceIdsQuery\[A], DurableStateStoreBySliceQuery\[A], DurableStateUpdateWithChangeEventStore\[A], DurableStateUpdateStore\[A], DurableStateStore\[A], AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcDurableStateStore
2. DurableStateStorePagedPersistenceIdsQuery
3. DurableStateStoreBySliceQuery
4. DurableStateUpdateWithChangeEventStore
5. DurableStateUpdateStore
6. DurableStateStore
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config,cfgPath:String):akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore[A] "Permalink")  new R2dbcDurableStateStore(system: ExtendedActorSystem, config: Config, cfgPath: String)
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#changesBySlices(entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink")  def changesBySlices(entityType: String, minSlice: Int, maxSlice: Int, offset: Offset): Source\[DurableStateChange\[A], NotUsed]Definition ClassesR2dbcDurableStateStore → DurableStateStoreBySliceQuery
6. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#currentChangesBySlices(entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink")  def currentChangesBySlices(entityType: String, minSlice: Int, maxSlice: Int, offset: Offset): Source\[DurableStateChange\[A], NotUsed]Definition ClassesR2dbcDurableStateStore → DurableStateStoreBySliceQuery
8. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#currentPersistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(): Source\[String, NotUsed]
9. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#currentPersistenceIds(entityType:String,afterId:Option[String],limit:Long):akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(entityType: String, afterId: Option\[String], limit: Long): Source\[String, NotUsed]Get the current persistence ids.

Get the current persistence ids.

Note: to reuse existing index, the actual query filters entity types based on persistence\_id column and sql LIKE
operator. Hence the persistenceId must start with an entity type followed by default separator ("\|") from
akka.persistence.typed.PersistenceId.

entityType
 The entity type name.

afterId
 The ID to start returning results from, or None to return all ids. This should be an id returned from a
 previous invocation of this command. Callers should not assume that ids are returned in sorted order.

limit
 The maximum results to return. Use Long.MaxValue to return all results. Must be greater than zero.

returns
 A source containing all the persistence ids, limited as specified.
10. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#currentPersistenceIds(afterId:Option[String],limit:Long):akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(afterId: Option\[String], limit: Long): Source\[String, NotUsed]Note: If you have configured `custom-table` this query will look in both the default table and the custom tables.

Note: If you have configured `custom-table` this query will look in both the default table and the custom tables.
If you are only interested in ids for a specific entity type it's more efficient to use `currentPersistenceIds`
with `entityType` parameter.

Definition ClassesR2dbcDurableStateStore → DurableStateStorePagedPersistenceIdsQuery
11. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#deleteObject(persistenceId:String,revision:Long,changeEvent:Any):scala.concurrent.Future[akka.Done] "Permalink")  def deleteObject(persistenceId: String, revision: Long, changeEvent: Any): Future\[Done]Delete the value, which will fail with `IllegalStateException` if the existing stored `revision` \+ 1 isn't equal to
the given `revision`.

Delete the value, which will fail with `IllegalStateException` if the existing stored `revision` \+ 1 isn't equal to
the given `revision`. This optimistic locking check can be disabled with configuration `assert-single-writer`. The
stored revision for the persistenceId is updated and next call to [getObject](#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]]) will return the revision, but with
no value.

If the given revision is `0` it will fully delete the value and revision from the database without any optimistic
locking check. Next call to [getObject](#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]]) will then return revision 0 and no value.

The `changeEvent` is written to the event journal in the same transaction as the DurableState upsert. Same
`persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.

Definition ClassesR2dbcDurableStateStore → DurableStateUpdateWithChangeEventStore
12. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#deleteObject(persistenceId:String,revision:Long):scala.concurrent.Future[akka.Done] "Permalink")  def deleteObject(persistenceId: String, revision: Long): Future\[Done]Delete the value, which will fail with `IllegalStateException` if the existing stored `revision` \+ 1 isn't equal to
the given `revision`.

Delete the value, which will fail with `IllegalStateException` if the existing stored `revision` \+ 1 isn't equal to
the given `revision`. This optimistic locking check can be disabled with configuration `assert-single-writer`. The
stored revision for the persistenceId is updated and next call to [getObject](#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]]) will return the revision, but with
no value.

If the given revision is `0` it will fully delete the value and revision from the database without any optimistic
locking check. Next call to [getObject](#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]]) will then return revision 0 and no value.

Definition ClassesR2dbcDurableStateStore → DurableStateUpdateStore
13. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
14. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
15. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]] "Permalink")  def getObject(persistenceId: String): Future\[GetObjectResult\[A]]Definition ClassesR2dbcDurableStateStore → DurableStateStore
17. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
19. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
20. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): IntDefinition ClassesR2dbcDurableStateStore → DurableStateStoreBySliceQuery
23. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#sliceRanges(numberOfRanges:Int):Seq[Range] "Permalink")  def sliceRanges(numberOfRanges: Int): Seq\[Range]Definition ClassesR2dbcDurableStateStore → DurableStateStoreBySliceQuery
24. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#upsertObject(persistenceId:String,revision:Long,value:A,tag:String,changeEvent:Any):scala.concurrent.Future[akka.Done] "Permalink")  def upsertObject(persistenceId: String, revision: Long, value: A, tag: String, changeEvent: Any): Future\[Done]Insert the value if `revision` is 1, which will fail with `IllegalStateException` if there is already a stored
value for the given `persistenceId`.

Insert the value if `revision` is 1, which will fail with `IllegalStateException` if there is already a stored
value for the given `persistenceId`. Otherwise update the value, which will fail with `IllegalStateException` if
the existing stored `revision` \+ 1 isn't equal to the given `revision`. This optimistic locking check can be
disabled with configuration `assert-single-writer`.

The `changeEvent` is written to the event journal in the same transaction as the DurableState upsert. Same
`persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.

Definition ClassesR2dbcDurableStateStore → DurableStateUpdateWithChangeEventStore
27. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#upsertObject(persistenceId:String,revision:Long,value:A,tag:String):scala.concurrent.Future[akka.Done] "Permalink")  def upsertObject(persistenceId: String, revision: Long, value: A, tag: String): Future\[Done]Insert the value if `revision` is 1, which will fail with `IllegalStateException` if there is already a stored
value for the given `persistenceId`.

Insert the value if `revision` is 1, which will fail with `IllegalStateException` if there is already a stored
value for the given `persistenceId`. Otherwise update the value, which will fail with `IllegalStateException` if
the existing stored `revision` \+ 1 isn't equal to the given `revision`. This optimistic locking check can be
disabled with configuration `assert-single-writer`.

Definition ClassesR2dbcDurableStateStore → DurableStateUpdateStore
28. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#deleteObject(persistenceId:String):scala.concurrent.Future[akka.Done] "Permalink")  def deleteObject(persistenceId: String): Future\[Done]Definition ClassesR2dbcDurableStateStore → DurableStateUpdateStoreAnnotations@deprecated Deprecated*(Since version 1\.0\.0\)* Use the deleteObject overload with revision instead.
2. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from DurableStateStorePagedPersistenceIdsQuery\[A]

### Inherited from DurableStateStoreBySliceQuery\[A]

### Inherited from DurableStateUpdateWithChangeEventStore\[A]

### Inherited from DurableStateUpdateStore\[A]

### Inherited from DurableStateStore\[A]

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.2.6/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html)*