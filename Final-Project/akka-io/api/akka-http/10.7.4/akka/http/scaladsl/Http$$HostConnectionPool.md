---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HostConnectionPool
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HostConnectionPool.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HostConnectionPool
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HostConnectionPool

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.Http.HostConnectionPool

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/Http$.html "Permalink")  object [Http](Http$.html) extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)Definition Classes[scaladsl](index.html)
- HostConnectionPool
- [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html)
- [HttpServerTerminated](Http$$HttpServerTerminated.html)
- [HttpTerminated](Http$$HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [IncomingConnection](Http$$IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](Http$$OutgoingConnection.html "Represents a prospective outgoing HTTP connection.")
- [ServerBinding](Http$$ServerBinding.html "Represents a prospective HTTP server binding.")
c[akka](../../index.html).[http](../index.html).[scaladsl](index.html).[Http](Http$.html)

# HostConnectionPool[**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html "Permalink")

### 

#### sealed abstract  class HostConnectionPool extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

Represents a connection pool to a specific target host and pool configuration.

Not for user extension.

Annotations@DoNotInherit() Source[Http.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L1055)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HostConnectionPool
2. Product
3. Equals
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#setup:akka.http.impl.settings.HostConnectionPoolSetup "Permalink") abstract  def setup: [HostConnectionPoolSetup](../impl/settings/HostConnectionPoolSetup.html)
2. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#shutdown():scala.concurrent.Future[akka.Done] "Permalink") abstract  def shutdown(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Asynchronously triggers the shutdown of the host connection pool.

Asynchronously triggers the shutdown of the host connection pool.

The produced [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) is fulfilled when the shutdown has been completed.
### Concrete Value Members

1. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HostConnectionPool toany2stringadd\[HostConnectionPool] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HostConnectionPool, B)ImplicitThis member is added by an implicit conversion from HostConnectionPool toArrowAssoc\[HostConnectionPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHostConnectionPool → Equals
8. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HostConnectionPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HostConnectionPoolImplicitThis member is added by an implicit conversion from HostConnectionPool toEnsuring\[HostConnectionPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HostConnectionPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HostConnectionPoolImplicitThis member is added by an implicit conversion from HostConnectionPool toEnsuring\[HostConnectionPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HostConnectionPoolImplicitThis member is added by an implicit conversion from HostConnectionPool toEnsuring\[HostConnectionPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HostConnectionPoolImplicitThis member is added by an implicit conversion from HostConnectionPool toEnsuring\[HostConnectionPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHostConnectionPool → Product
22. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesHostConnectionPool → Product
23. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
24. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
26. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
27. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HostConnectionPool toStringFormat\[HostConnectionPool] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HostConnectionPool, B)ImplicitThis member is added by an implicit conversion from HostConnectionPool toArrowAssoc\[HostConnectionPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHostConnectionPool to any2stringadd\[HostConnectionPool]

### Inherited by implicit conversion StringFormat fromHostConnectionPool to StringFormat\[HostConnectionPool]

### Inherited by implicit conversion Ensuring fromHostConnectionPool to Ensuring\[HostConnectionPool]

### Inherited by implicit conversion ArrowAssoc fromHostConnectionPool to ArrowAssoc\[HostConnectionPool]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/impl/settings/HostConnectionPoolSetup.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HostConnectionPool.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpConnectionTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpServerTerminated$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpServerTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$IncomingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$OutgoingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HostConnectionPool.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HostConnectionPool.html)*