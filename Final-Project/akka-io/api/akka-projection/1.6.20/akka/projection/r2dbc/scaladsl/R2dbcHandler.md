---
description: Akka Projection 1.6.20 - akka.projection.r2dbc.scaladsl.R2dbcHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcHandler.html
title: Akka Projection 1.6.20 - akka.projection.r2dbc.scaladsl.R2dbcHandler
---

# Akka Projection 1.6.20 - akka.projection.r2dbc.scaladsl.R2dbcHandler

> **Summary:** Akka Projection 1.6.20 - akka.projection.r2dbc.scaladsl.R2dbcHandler

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/r2dbc/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[r2dbc](../index.html)
- R2dbcHandler
- [R2dbcProjection](R2dbcProjection$.html)
- [R2dbcReplication](R2dbcReplication$.html)
- [R2dbcSession](R2dbcSession.html)
[t](R2dbcHandler$.html "See companion object")[akka](../../../index.html).[projection](../../index.html).[r2dbc](../index.html).[scaladsl](index.html)

# [R2dbcHandler](R2dbcHandler$.html "See companion object")[**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html "Permalink")

### Companion [object R2dbcHandler](R2dbcHandler$.html "See companion object")

#### trait R2dbcHandler\[Envelope] extends [HandlerLifecycle](../../scaladsl/HandlerLifecycle.html)

Implement this interface for the Envelope handler for R2DBC Projections.

It can be stateful, with variables and mutable data structures. It is invoked by the `Projection` machinery one
envelope at a time and visibility guarantees between the invocations are handled automatically, i.e. no volatile or
other concurrency primitives are needed for managing the state.

Supported error handling strategies for when processing an `Envelope` fails can be defined in configuration or using
the `withRecoveryStrategy` method of a `Projection` implementation.

Annotations@ApiMayChange() Source[R2dbcHandler.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-r2dbc/src/main/scala/akka/projection/r2dbc/scaladsl/R2dbcHandler.scala#L24)Linear Supertypes[HandlerLifecycle](../../scaladsl/HandlerLifecycle.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcHandler
2. HandlerLifecycle
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#process(session:akka.projection.r2dbc.scaladsl.R2dbcSession,envelope:Envelope):scala.concurrent.Future[akka.Done] "Permalink") abstract  def process(session: [R2dbcSession](R2dbcSession.html), envelope: Envelope): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]The `process` method is invoked for each `Envelope`.

The `process` method is invoked for each `Envelope`. Each time a new `Connection` is passed with a new open
transaction. You can use `createStatement`, `update` and other methods provided by the [R2dbcSession](R2dbcSession.html). The
results of several statements can be combined with `Future` composition (e.g. `flatMap`). The transaction will be
automatically committed or rolled back when the returned `Future[Done]` is completed.

One envelope is processed at a time. It will not be invoked with the next envelope until after this method returns
and the returned `Future[Done]` is completed.
### Concrete Value Members

1. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#start():scala.concurrent.Future[akka.Done] "Permalink")  def start(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Invoked when the projection is starting, before first envelope is processed.

Invoked when the projection is starting, before first envelope is processed.
Can be overridden to implement initialization. It is also called when the `Projection`
is restarted after a failure.

Definition Classes[HandlerLifecycle](../../scaladsl/HandlerLifecycle.html)
15. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#stop():scala.concurrent.Future[akka.Done] "Permalink")  def stop(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Invoked when the projection has been stopped.

Invoked when the projection has been stopped. Can be overridden to implement resource
cleanup. It is also called when the `Projection` is restarted after a failure.

Definition Classes[HandlerLifecycle](../../scaladsl/HandlerLifecycle.html)
16. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/r2dbc/scaladsl/R2dbcHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [HandlerLifecycle](../../scaladsl/HandlerLifecycle.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcHandler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcReplication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcSession$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcSession.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcHandler.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/scaladsl/R2dbcHandler.html)*