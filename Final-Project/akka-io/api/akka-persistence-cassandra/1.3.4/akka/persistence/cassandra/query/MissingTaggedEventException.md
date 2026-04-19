---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.MissingTaggedEventException
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/query/MissingTaggedEventException.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.MissingTaggedEventException
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.MissingTaggedEventException

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.MissingTaggedEventException

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[query](index.html)
- [**](../../../../akka/persistence/cassandra/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[query](index.html)
- [CassandraReadJournalProvider](CassandraReadJournalProvider.html)
- MissingTaggedEventException
c[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html).[query](index.html)

# MissingTaggedEventException[**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html "Permalink")

### 

#### final  class MissingTaggedEventException extends RuntimeException

Events by tag query was unable all the events for some persistence ids.

Consider restarting the query from the minOffset if downstream processing is idempotent
as it may re\-deliver previously delivered events.

Annotations@ApiMayChange() Source[MissingTaggedEventException.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/query/MissingTaggedEventException.scala#L23)Linear Supertypes[RuntimeException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MissingTaggedEventException
2. RuntimeException
3. Exception
4. Throwable
5. Serializable
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#<init>(tag:String,missing:Map[String,Set[Long]],minOffset:java.util.UUID,maxOffset:java.util.UUID):akka.persistence.cassandra.query.MissingTaggedEventException "Permalink")  new MissingTaggedEventException(tag: String, missing: Map\[String, Set\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]], minOffset: [UUID](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/UUID.html#java.util.UUID), maxOffset: [UUID](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/UUID.html#java.util.UUID))tagthe tag for the query

missinga map from persistence id to a set of tag pid sequence numbers that could
 not be found

minOffsetminimum offset was used when searching

maxOffsetmaximum offset used when searching
### Value Members

1. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
5. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
10. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
11. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
13. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
14. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
15. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
16. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
18. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#maxOffset:java.util.UUID "Permalink")  val maxOffset: [UUID](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/UUID.html#java.util.UUID)
20. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#minOffset:java.util.UUID "Permalink")  val minOffset: [UUID](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/UUID.html#java.util.UUID)
21. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#missing:Map[String,Set[Long]] "Permalink")  val missing: Map\[String, Set\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]]
22. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
24. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
25. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
26. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
27. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
28. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#tag:String "Permalink")  val tag: String
31. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
32. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/CassandraReadJournalProvider.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/MissingTaggedEventException.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/MissingTaggedEventException.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/MissingTaggedEventException.html)*