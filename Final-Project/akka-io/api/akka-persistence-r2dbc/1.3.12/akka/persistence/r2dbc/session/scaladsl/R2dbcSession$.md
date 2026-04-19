---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.session.scaladsl.R2dbcSession
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html
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
- [R2dbcSession](R2dbcSession.html)
[o](R2dbcSession.html "See companion class")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[session](../index.html).[scaladsl](index.html)

# [R2dbcSession](R2dbcSession.html "See companion class")[**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html "Permalink")

### Companion [class R2dbcSession](R2dbcSession.html "See companion class")

#### object R2dbcSession

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
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#withSession[A](system:akka.actor.typed.ActorSystem[_],connectionFactoryConfigPath:String)(fun:akka.persistence.r2dbc.session.scaladsl.R2dbcSession=>scala.concurrent.Future[A]):scala.concurrent.Future[A] "Permalink")  def withSession\[A](system: ActorSystem\[\_], connectionFactoryConfigPath: String)(fun: ([R2dbcSession](R2dbcSession.html)) \=\> Future\[A]): Future\[A]
20. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#withSession[A](system:akka.actor.typed.ActorSystem[_])(fun:akka.persistence.r2dbc.session.scaladsl.R2dbcSession=>scala.concurrent.Future[A]):scala.concurrent.Future[A] "Permalink")  def withSession\[A](system: ActorSystem\[\_])(fun: ([R2dbcSession](R2dbcSession.html)) \=\> Future\[A]): Future\[A]Runs the passed function in using a R2dbcSession with a new transaction.

Runs the passed function in using a R2dbcSession with a new transaction. The connection is closed and the
transaction is committed at the end or rolled back in case of failures.
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession$.html)*