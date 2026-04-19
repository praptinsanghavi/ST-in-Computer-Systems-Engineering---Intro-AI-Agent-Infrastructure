---
description: Akka Projection 1.6.20 - akka.projection.jdbc.JdbcSession
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html
title: Akka Projection 1.6.20 - akka.projection.jdbc.JdbcSession
---

# Akka Projection 1.6.20 - akka.projection.jdbc.JdbcSession

> **Summary:** Akka Projection 1.6.20 - akka.projection.jdbc.JdbcSession

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/jdbc/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[jdbc](index.html)
- [**](../../../akka/projection/jdbc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[jdbc](index.html)
- [**](../../../akka/projection/jdbc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[jdbc](index.html)
- [JdbcHandlerLifecycle](JdbcHandlerLifecycle.html)
- JdbcSession
t[akka](../../index.html).[projection](../index.html).[jdbc](index.html)

# JdbcSession[**](../../../akka/projection/jdbc/JdbcSession.html "Permalink")

### 

#### trait JdbcSession extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Generic interface to give access to basic JDBC connection operations.

A new JdbcSession will be created for each call to the projection handler. Upon creation a database connection
must be created (preferably relying on connection pool) and used through out the live of this instance.

After usage, the underlying database connection will be closed (returned to the pool) after committing or rolling back
the transaction. It's paramount to configure the connection to NOT use `auto-commit` in order to guarantee that the
event handling and offset persistence operations participate on the same transaction.

The only requirement to implement a JdbcSession is to have access to the underlying JDBC Connection.
When using plain JDBC, one can initialize a connection directly, but when relying on a JDBC framework like JPA it will depend on the
chosen implementation. Hibernate for instance provides indirect access to the underlying connection through a
lambda call and therefore can be used (see [JdbcSession\#withConnection](#withConnection[Result](func:akka.japi.function.Function[java.sql.Connection,Result]):Result) method). Other JPA implementations may not provide this feature.

Source[JdbcSession.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-jdbc/src/main/scala/akka/projection/jdbc/JdbcSession.scala#L28)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JdbcSession
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/projection/jdbc/JdbcSession.html#close():Unit "Permalink") abstract  def close(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Closes the connection after use.

Closes the connection after use.
Should delegate to Connection\#close() or equivalent depending on underlying JDBC framework.

Annotations@throws(classOf\[SQLException]) Exceptions thrown
2. [**](../../../akka/projection/jdbc/JdbcSession.html#commit():Unit "Permalink") abstract  def commit(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Commits the transaction after processing.

Commits the transaction after processing.
Should delegate to Connection\#commit() or equivalent depending on underlying JDBC framework.

Annotations@throws(classOf\[SQLException]) Exceptions thrown
3. [**](../../../akka/projection/jdbc/JdbcSession.html#rollback():Unit "Permalink") abstract  def rollback(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Rollback the transaction in case of failures.

Rollback the transaction in case of failures.
Should delegate to Connection\#rollback() or equivalent depending on underlying JDBC framework.

Annotations@throws(classOf\[SQLException]) Exceptions thrown
4. [**](../../../akka/projection/jdbc/JdbcSession.html#withConnection[Result](func:akka.japi.function.Function[java.sql.Connection,Result]):Result "Permalink") abstract  def withConnection\[Result](func: [Function](https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html#akka.japi.function.Function)\[[Connection](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.sql/java/sql/Connection.html#java.sql.Connection), Result]): ResultThis method provides access to the underlying connection through a lambda call.

This method provides access to the underlying connection through a lambda call.
Implementors should ensure that every single call to this method instance uses the same JDBC connection instance.

For plain JDBC implementations an instance of the open connection should be kept as internal state and passed to the lambda call.
For implementations based on Hibernate, this method can be rely on Hibernate's `Session.doReturningWork`.

Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../akka/projection/jdbc/JdbcSession.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/jdbc/JdbcSession.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/jdbc/JdbcSession.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/jdbc/JdbcSession.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/jdbc/JdbcSession.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../akka/projection/jdbc/JdbcSession.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/projection/jdbc/JdbcSession.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/projection/jdbc/JdbcSession.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../akka/projection/jdbc/JdbcSession.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../akka/projection/jdbc/JdbcSession.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/projection/jdbc/JdbcSession.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/projection/jdbc/JdbcSession.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../akka/projection/jdbc/JdbcSession.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../akka/projection/jdbc/JdbcSession.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/projection/jdbc/JdbcSession.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/projection/jdbc/JdbcSession.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/projection/jdbc/JdbcSession.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/projection/jdbc/JdbcSession.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/jdbc/JdbcSession.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcHandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/internal/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html)*