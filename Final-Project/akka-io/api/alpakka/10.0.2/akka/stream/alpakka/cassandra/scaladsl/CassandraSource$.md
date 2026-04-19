---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSource
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSource
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSource

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSource

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[cassandra](../index.html)
- [CassandraFlow](CassandraFlow$.html "Scala API to create Cassandra flows.")
- [CassandraSession](CassandraSession.html "Data Access Object for Cassandra.")
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- CassandraSource
o[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[scaladsl](index.html)

# CassandraSource[**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html "Permalink")

### 

#### object CassandraSource

Scala API.

Source[CassandraSource.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/scaladsl/CassandraSource.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraSource
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#apply(stmt:com.datastax.oss.driver.api.core.cql.Statement[_])(implicitsession:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.scaladsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def apply(stmt: [Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_])(implicit session: [CassandraSession](CassandraSession.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from a given statement.

Create a [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from a given statement.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).
5. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#apply(cqlStatement:String,bindValues:AnyRef*)(implicitsession:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.scaladsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def apply(cqlStatement: String, bindValues: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)\*)(implicit session: [CassandraSession](CassandraSession.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Prepare, bind and execute a select statement in one go.

Prepare, bind and execute a select statement in one go.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).
6. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#fromFuture(stmt:scala.concurrent.Future[com.datastax.oss.driver.api.core.cql.Statement[_]])(implicitsession:akka.stream.alpakka.cassandra.scaladsl.CassandraSession):akka.stream.scaladsl.Source[com.datastax.oss.driver.api.core.cql.Row,akka.NotUsed] "Permalink")  def fromFuture(stmt: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Statement](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Statement.html#com.datastax.oss.driver.api.core.cql.Statement)\[\_]])(implicit session: [CassandraSession](CassandraSession.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[Row](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/cql/Row.html#com.datastax.oss.driver.api.core.cql.Row), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from a given statement.

Create a [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from a given statement.

See [Querying data](https://docs.datastax.com/en/dse/6.7/cql/cql/cql_using/queriesTOC.html).
11. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html)*