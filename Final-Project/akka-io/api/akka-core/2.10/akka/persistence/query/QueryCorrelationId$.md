---
description: Akka 2.10.17 - akka.persistence.query.QueryCorrelationId
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/QueryCorrelationId$.html
title: Akka 2.10.17 - akka.persistence.query.QueryCorrelationId
---

# Akka 2.10.17 - akka.persistence.query.QueryCorrelationId

> **Summary:** Akka 2.10.17 - akka.persistence.query.QueryCorrelationId

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[query](index.html)
- [DeletedDurableState](DeletedDurableState.html)
- [DurableStateChange](DurableStateChange.html "The DurableStateStoreQuery stream elements for DurableStateStoreQuery.")
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.")
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- [Offset](Offset.html)
- [PersistenceQuery](PersistenceQuery.html)
- QueryCorrelationId
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
o[akka](../../index.html).[persistence](../index.html).[query](index.html)

# QueryCorrelationId[**](../../../akka/persistence/query/QueryCorrelationId$.html "Permalink")

### 

#### object QueryCorrelationId

(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and
error messages. Used by akka\-projections to make correlating projection logs with debug and trace logging from the
underlying akka persistence query implementations possible.

Source[QueryCorrelationId.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/QueryCorrelationId.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. QueryCorrelationId
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/query/QueryCorrelationId$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/QueryCorrelationId$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/QueryCorrelationId$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/query/QueryCorrelationId$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/query/QueryCorrelationId$.html#callWithCorrelationId[T](correlationId:String,function:java.util.function.Supplier[T]):T "Permalink")  def callWithCorrelationId\[T](correlationId: String, function: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TJava API: Expected to be used "around" calls to plugin query method, will clear the correlation id from thread local
to make sure there is no leak between logic executed on shared threads.
6. [**](../../../akka/persistence/query/QueryCorrelationId$.html#callWithCorrelationId[T](correlationId:java.util.Optional[String],function:java.util.function.Supplier[T]):T "Permalink")  def callWithCorrelationId\[T](correlationId: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], function: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TJava API: Expected to be used "around" calls to plugin query method to pass along a previously extracted optional correlation id,
will clear the correlation id from thread local to make sure there is no leak between logic executed on shared threads.
7. [**](../../../akka/persistence/query/QueryCorrelationId$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/query/QueryCorrelationId$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/persistence/query/QueryCorrelationId$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/persistence/query/QueryCorrelationId$.html#get():Option[String] "Permalink")  def get(): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Scala API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks.

Scala API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks.
Calling code is responsible to clear it out after method returns. The value is stored in a thread local so is not available
across threads or streams. Further passing around of the uuid inside the query plugin implementation is up to the implementer.
11. [**](../../../akka/persistence/query/QueryCorrelationId$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/persistence/query/QueryCorrelationId$.html#getCorrelationId():java.util.Optional[String] "Permalink")  def getCorrelationId(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks.

Java API: Expected to be called by query plugins directly after receiving a query call, before starting any asynchronous tasks.
Calling code is responsible to clear it out after method returns. The value is stored in a thread local so is not available
across threads or streams. Further passing around of the uuid inside the query plugin implementation is up to the implementer.
13. [**](../../../akka/persistence/query/QueryCorrelationId$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/query/QueryCorrelationId$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/persistence/query/QueryCorrelationId$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/persistence/query/QueryCorrelationId$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/query/QueryCorrelationId$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/persistence/query/QueryCorrelationId$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/persistence/query/QueryCorrelationId$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/persistence/query/QueryCorrelationId$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/persistence/query/QueryCorrelationId$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/persistence/query/QueryCorrelationId$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/query/QueryCorrelationId$.html#withCorrelationId[T](correlationId:Option[String])(f:()=>T):T "Permalink")  def withCorrelationId\[T](correlationId: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String])(f: () \=\> T): TScala API: Expected to be used "around" calls to plugin query method to pass along a previously extracted optional correlation id,
will clear the correlation id from thread local to make sure there is no leak between logic executed on shared threads.
24. [**](../../../akka/persistence/query/QueryCorrelationId$.html#withCorrelationId[T](correlationId:String)(f:()=>T):T "Permalink")  def withCorrelationId\[T](correlationId: String)(f: () \=\> T): TScala API: Expected to be used "around" calls to plugin query method, will clear the correlation id from thread local
to make sure there is no leak between logic executed on shared threads.
### Deprecated Value Members

1. [**](../../../akka/persistence/query/QueryCorrelationId$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/QueryCorrelationId$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/QueryCorrelationId$.html)*