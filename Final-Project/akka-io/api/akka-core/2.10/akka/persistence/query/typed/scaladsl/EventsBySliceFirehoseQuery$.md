---
description: Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html
title: Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery
---

# Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/query/index.html "Permalink")  package [query](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[query](../../index.html)
- [**](../../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "Query API for reading durable state objects.")
- [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
- [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.")
- [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
[o](EventsBySliceFirehoseQuery.html "See companion class")[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "See companion class")[**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html "Permalink")

### Companion [class EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "See companion class")

#### object EventsBySliceFirehoseQuery

Source[EventsBySliceFirehoseQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsBySliceFirehoseQuery
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#Identifier:String "Permalink")  val Identifier: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
5. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html)*