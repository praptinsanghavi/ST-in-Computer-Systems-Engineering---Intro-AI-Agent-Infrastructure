---
description: Akka Projection 1.6.20 - akka.projection.jdbc.javadsl.JdbcHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html
title: Akka Projection 1.6.20 - akka.projection.jdbc.javadsl.JdbcHandler
---

# Akka Projection 1.6.20 - akka.projection.jdbc.javadsl.JdbcHandler

> **Summary:** Akka Projection 1.6.20 - akka.projection.jdbc.javadsl.JdbcHandler

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/jdbc/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[jdbc](../index.html)
- JdbcHandler
- [JdbcProjection](JdbcProjection$.html)
[c](JdbcHandler$.html "See companion object")[akka](../../../index.html).[projection](../../index.html).[jdbc](../index.html).[javadsl](index.html)

# [JdbcHandler](JdbcHandler$.html "See companion object")[**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html "Permalink")

### Companion [object JdbcHandler](JdbcHandler$.html "See companion object")

#### abstract  class JdbcHandler\[Envelope, S \<: [JdbcSession](../JdbcSession.html)] extends [JdbcHandlerLifecycle](../JdbcHandlerLifecycle.html)

Implement this interface for the Envelope handler for Jdbc Projections.

It can be stateful, with variables and mutable data structures.
It is invoked by the `Projection` machinery one envelope at a time and visibility
guarantees between the invocations are handled automatically, i.e. no volatile or
other concurrency primitives are needed for managing the state.

Supported error handling strategies for when processing an `Envelope` fails can be
defined in configuration or using the `withRecoveryStrategy` method of a `Projection`
implementation.

Source[JdbcHandler.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-jdbc/src/main/scala/akka/projection/jdbc/javadsl/JdbcHandler.scala#L47)Linear Supertypes[JdbcHandlerLifecycle](../JdbcHandlerLifecycle.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JdbcHandler
2. JdbcHandlerLifecycle
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#<init>():akka.projection.jdbc.javadsl.JdbcHandler[Envelope,S] "Permalink")  new JdbcHandler()
### Abstract Value Members

1. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#process(session:S,envelope:Envelope):Unit "Permalink") abstract  def process(session: S, envelope: Envelope): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)The `process` method is invoked for each `Envelope`.

The `process` method is invoked for each `Envelope`. Each time a new [JdbcSession](../JdbcSession.html) is passed with a new open transaction.
It's allowed to run any blocking JDBC operation inside this method.

One envelope is processed at a time. It will not be invoked with the next envelope until after this method returns.

Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#start():Unit "Permalink")  def start(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked when the projection is starting, before first envelope is processed.

Invoked when the projection is starting, before first envelope is processed.
Can be overridden to implement initialization.

Definition Classes[JdbcHandlerLifecycle](../JdbcHandlerLifecycle.html)
15. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#stop():Unit "Permalink")  def stop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked when the projection has been stopped.

Invoked when the projection has been stopped. Can be overridden to implement resource
cleanup.

Definition Classes[JdbcHandlerLifecycle](../JdbcHandlerLifecycle.html)
16. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/jdbc/javadsl/JdbcHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [JdbcHandlerLifecycle](../JdbcHandlerLifecycle.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcHandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html)*