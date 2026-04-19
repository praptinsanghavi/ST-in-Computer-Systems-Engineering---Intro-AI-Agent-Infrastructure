---
description: Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcSession
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession.html
title: Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcSession
---

# Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcSession

> **Summary:** Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcSession

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/r2dbc/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[r2dbc](../index.html)
- [R2dbcHandler](R2dbcHandler.html "Implement this interface for the Envelope handler for R2DBC Projections.")
- [R2dbcProjection](R2dbcProjection$.html)
- [R2dbcReplication](R2dbcReplication$.html)
- R2dbcSession
[c](R2dbcSession$.html "See companion object")[akka](../../../index.html).[projection](../../index.html).[r2dbc](../index.html).[javadsl](index.html)

# [R2dbcSession](R2dbcSession$.html "See companion object")[**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html "Permalink")

### Companion [object R2dbcSession](R2dbcSession$.html "See companion object")

#### final  class R2dbcSession extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[R2dbcSession.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-r2dbc/src/main/scala/akka/projection/r2dbc/javadsl/R2dbcSession.scala#L59)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcSession
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#<init>(connection:io.r2dbc.spi.Connection)(implicitec:scala.concurrent.ExecutionContext,implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.r2dbc.javadsl.R2dbcSession "Permalink")  new R2dbcSession(connection: Connection)(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_])
### Value Members

1. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#connection:io.r2dbc.spi.Connection "Permalink")  val connection: Connection
7. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#createStatement(sql:String):io.r2dbc.spi.Statement "Permalink")  def createStatement(sql: String): Statement
8. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#select[A](statement:io.r2dbc.spi.Statement)(mapRow:java.util.function.Function[io.r2dbc.spi.Row,A]):java.util.concurrent.CompletionStage[java.util.List[A]] "Permalink")  def select\[A](statement: Statement)(mapRow: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[Row, A]): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[A]]
17. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#selectOne[A](statement:io.r2dbc.spi.Statement)(mapRow:java.util.function.Function[io.r2dbc.spi.Row,A]):java.util.concurrent.CompletionStage[java.util.Optional[A]] "Permalink")  def selectOne\[A](statement: Statement)(mapRow: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[Row, A]): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[A]]
18. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#update(statements:java.util.List[io.r2dbc.spi.Statement]):java.util.concurrent.CompletionStage[java.util.List[Long]] "Permalink")  def update(statements: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[Statement]): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[Long](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Long.html#java.lang.Long)]]
21. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#updateOne(statement:io.r2dbc.spi.Statement):java.util.concurrent.CompletionStage[Long] "Permalink")  def updateOne(statement: Statement): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Long](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Long.html#java.lang.Long)]
22. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcSession.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcHandler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcReplication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession.html)*