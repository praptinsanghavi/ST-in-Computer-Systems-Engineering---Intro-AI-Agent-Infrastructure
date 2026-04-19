---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

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
- CassandraSessionRegistry
- [CassandraSource](CassandraSource$.html "Scala API.")
[c](CassandraSessionRegistry$.html "See companion object")[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html).[scaladsl](index.html)

# [CassandraSessionRegistry](CassandraSessionRegistry$.html "See companion object")[**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html "Permalink")

### Companion [object CassandraSessionRegistry](CassandraSessionRegistry$.html "See companion object")

#### final  class CassandraSessionRegistry extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

Source[CassandraSessionRegistry.scala](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/scala/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.scala#L41)Linear Supertypes[Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraSessionRegistry
2. Extension
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#<init>(system:akka.actor.ExtendedActorSystem):akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry "Permalink")  new CassandraSessionRegistry(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem))
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
13. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#sessionFor(settings:akka.stream.alpakka.cassandra.CassandraSessionSettings):akka.stream.alpakka.cassandra.scaladsl.CassandraSession "Permalink")  def sessionFor(settings: [CassandraSessionSettings](../CassandraSessionSettings.html)): [CassandraSession](CassandraSession.html)Get an existing session or start a new one with the given settings,
makes it possible to share one session across plugins.

Get an existing session or start a new one with the given settings,
makes it possible to share one session across plugins.

Note that the session must not be stopped manually, it is shut down when the actor system is shutdown,
if you need a more fine grained life cycle control, create the CassandraSession manually instead.
15. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#sessionFor(configPath:String,init:com.datastax.oss.driver.api.core.CqlSession=>scala.concurrent.Future[akka.Done]):akka.stream.alpakka.cassandra.scaladsl.CassandraSession "Permalink")  def sessionFor(configPath: String, init: ([CqlSession](https://javadoc.io/static/org.apache.cassandra/java-driver-core/4.19.1/com/datastax/oss/driver/api/core/CqlSession.html#com.datastax.oss.driver.api.core.CqlSession)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]): [CassandraSession](CassandraSession.html)Get an existing session or start a new one with the given settings,
makes it possible to share one session across plugins.

Get an existing session or start a new one with the given settings,
makes it possible to share one session across plugins.

The `init` function will be performed once when the session is created, i.e.
if `sessionFor` is called from multiple places with different `init` it will
only execute the first.

Sessions in the session registry are closed after actor system termination.
16. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#sessionFor(configPath:String):akka.stream.alpakka.cassandra.scaladsl.CassandraSession "Permalink")  def sessionFor(configPath: String): [CassandraSession](CassandraSession.html)Get an existing session or start a new one with the given settings,
makes it possible to share one session across plugins.

Get an existing session or start a new one with the given settings,
makes it possible to share one session across plugins.

Sessions in the session registry are closed after actor system termination.
17. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings.html
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
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html)*