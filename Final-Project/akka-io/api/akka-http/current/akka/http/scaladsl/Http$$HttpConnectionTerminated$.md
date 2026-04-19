---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HttpConnectionTerminated
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:12:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HttpConnectionTerminated
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HttpConnectionTerminated

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HttpConnectionTerminated

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/Http$.html "Permalink")  object [Http](Http$.html) extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)Definition Classes[scaladsl](index.html)
- [HostConnectionPool](Http$$HostConnectionPool.html "Represents a connection pool to a specific target host and pool configuration.")
- [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html)
- [HttpServerTerminated](Http$$HttpServerTerminated.html)
- [HttpTerminated](Http$$HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [IncomingConnection](Http$$IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](Http$$OutgoingConnection.html "Represents a prospective outgoing HTTP connection.")
- [ServerBinding](Http$$ServerBinding.html "Represents a prospective HTTP server binding.")
[o](Http$$HttpConnectionTerminated.html "See companion class")[akka](../../index.html).[http](../index.html).[scaladsl](index.html).[Http](Http$.html)

# [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html "See companion class")[**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html "Permalink")

### Companion [class HttpConnectionTerminated](Http$$HttpConnectionTerminated.html "See companion class")

#### object HttpConnectionTerminated extends [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html)

Source[Http.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L1012)Linear Supertypes[HttpConnectionTerminated](Http$$HttpConnectionTerminated.html), [HttpTerminated](Http$$HttpTerminated.html), [javadsl.HttpTerminated](../javadsl/HttpTerminated.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpConnectionTerminated
2. HttpConnectionTerminated
3. HttpTerminated
4. HttpTerminated
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html)

### Inherited from [HttpTerminated](Http$$HttpTerminated.html)

### Inherited from [javadsl.HttpTerminated](../javadsl/HttpTerminated.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HostConnectionPool.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpServerTerminated$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpServerTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$IncomingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$OutgoingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$ServerBinding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html)*