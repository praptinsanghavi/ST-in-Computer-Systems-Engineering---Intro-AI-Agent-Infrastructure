---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.session.scaladsl.R2dbcSession
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.session.scaladsl.R2dbcSession
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.session.scaladsl.R2dbcSession

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.session.scaladsl.R2dbcSession

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/session/index.html "Permalink")  package [session](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/session/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[session](../index.html)
- R2dbcSession
[c](R2dbcSession$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[session](../index.html).[scaladsl](index.html)

# [R2dbcSession](R2dbcSession$.html "See companion object")[**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html "Permalink")

### Companion [object R2dbcSession](R2dbcSession$.html "See companion object")

#### final  class R2dbcSession extends AnyRef

Annotations@ApiMayChange() Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
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

1. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#<init>(connection:io.r2dbc.spi.Connection)(implicitec:scala.concurrent.ExecutionContext,implicitsystem:akka.actor.typed.ActorSystem[_]):akka.persistence.r2dbc.session.scaladsl.R2dbcSession "Permalink")  new R2dbcSession(connection: Connection)(implicit ec: ExecutionContext, system: ActorSystem\[\_])
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#connection:io.r2dbc.spi.Connection "Permalink")  val connection: Connection
7. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#createStatement(sql:String):io.r2dbc.spi.Statement "Permalink")  def createStatement(sql: String): Statement
8. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#ec:scala.concurrent.ExecutionContext "Permalink") implicit  val ec: ExecutionContext
9. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
10. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
11. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
14. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#select[A](statement:io.r2dbc.spi.Statement)(mapRow:io.r2dbc.spi.Row=>A):scala.concurrent.Future[IndexedSeq[A]] "Permalink")  def select\[A](statement: Statement)(mapRow: (Row) \=\> A): Future\[IndexedSeq\[A]]
18. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#selectOne[A](statement:io.r2dbc.spi.Statement)(mapRow:io.r2dbc.spi.Row=>A):scala.concurrent.Future[Option[A]] "Permalink")  def selectOne\[A](statement: Statement)(mapRow: (Row) \=\> A): Future\[Option\[A]]
19. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#system:akka.actor.typed.ActorSystem[_] "Permalink") implicit  val system: ActorSystem\[\_]
21. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#update(statements:IndexedSeq[io.r2dbc.spi.Statement]):scala.concurrent.Future[IndexedSeq[Long]] "Permalink")  def update(statements: IndexedSeq\[Statement]): Future\[IndexedSeq\[Long]]
23. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#updateOne(statement:io.r2dbc.spi.Statement):scala.concurrent.Future[Long] "Permalink")  def updateOne(statement: Statement): Future\[Long]
24. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html)*