---
description: Akka HTTP 10.7.4 - akka.http.javadsl.ConnectHttp
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:04:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttp.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.ConnectHttp
---

# Akka HTTP 10.7.4 - akka.http.javadsl.ConnectHttp

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.ConnectHttp

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](coding/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/common/index.html "Permalink")  package [common](common/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/model/index.html "Permalink")  package [model](model/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/server/index.html "Permalink")  package [server](server/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](settings/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)Definition Classes[javadsl](index.html)
- [ClientTransport](ClientTransport.html "SPI for implementors of custom client transports.")
- ConnectHttp
- [ConnectHttpImpl](ConnectHttpImpl.html "INTERNAL API")
- [ConnectHttpsImpl](ConnectHttpsImpl.html "INTERNAL API")
- [ConnectWithHttps](ConnectWithHttps.html)
- [ConnectionContext](ConnectionContext.html)
- [HandlerProvider](HandlerProvider.html "A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.")
- [HostConnectionPool](HostConnectionPool.html)
- [Http](Http.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpTerminated](HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [HttpsConnectionContext](HttpsConnectionContext.html)
- [IncomingConnection](IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](OutgoingConnection.html)
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBinding](ServerBinding.html "Represents a prospective HTTP server binding.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
[c](ConnectHttp$.html "See companion object")[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# [ConnectHttp](ConnectHttp$.html "See companion object")[**](../../../akka/http/javadsl/ConnectHttp.html "Permalink")

### Companion [object ConnectHttp](ConnectHttp$.html "See companion object")

#### abstract  class ConnectHttp extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@DoNotInherit() Source[ConnectHttp.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ConnectHttp.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConnectHttpImpl](ConnectHttpImpl.html), [ConnectHttpsImpl](ConnectHttpsImpl.html), [ConnectWithHttps](ConnectWithHttps.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConnectHttp
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/http/javadsl/ConnectHttp.html#<init>():akka.http.javadsl.ConnectHttp "Permalink")  new ConnectHttp()
### Abstract Value Members

1. [**](../../../akka/http/javadsl/ConnectHttp.html#connectionContext:java.util.Optional[akka.http.javadsl.HttpsConnectionContext] "Permalink") abstract  def connectionContext: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpsConnectionContext](HttpsConnectionContext.html)]
2. [**](../../../akka/http/javadsl/ConnectHttp.html#host:String "Permalink") abstract  def host: String
3. [**](../../../akka/http/javadsl/ConnectHttp.html#isHttps:Boolean "Permalink") abstract  def isHttps: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
4. [**](../../../akka/http/javadsl/ConnectHttp.html#port:Int "Permalink") abstract  def port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
### Concrete Value Members

1. [**](../../../akka/http/javadsl/ConnectHttp.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/ConnectHttp.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/ConnectHttp.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConnectHttp toany2stringadd\[ConnectHttp] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/javadsl/ConnectHttp.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConnectHttp, B)ImplicitThis member is added by an implicit conversion from ConnectHttp toArrowAssoc\[ConnectHttp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/javadsl/ConnectHttp.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/javadsl/ConnectHttp.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/javadsl/ConnectHttp.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/http/javadsl/ConnectHttp.html#effectiveConnectionContext(fallbackContext:akka.http.javadsl.ConnectionContext):akka.http.javadsl.ConnectionContext "Permalink") final  def effectiveConnectionContext(fallbackContext: [ConnectionContext](ConnectionContext.html)): [ConnectionContext](ConnectionContext.html)
9. [**](../../../akka/http/javadsl/ConnectHttp.html#effectiveHttpsConnectionContext(fallbackContext:akka.http.javadsl.HttpsConnectionContext):akka.http.javadsl.HttpsConnectionContext "Permalink") final  def effectiveHttpsConnectionContext(fallbackContext: [HttpsConnectionContext](HttpsConnectionContext.html)): [HttpsConnectionContext](HttpsConnectionContext.html)
10. [**](../../../akka/http/javadsl/ConnectHttp.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConnectHttp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConnectHttpImplicitThis member is added by an implicit conversion from ConnectHttp toEnsuring\[ConnectHttp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/javadsl/ConnectHttp.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConnectHttp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConnectHttpImplicitThis member is added by an implicit conversion from ConnectHttp toEnsuring\[ConnectHttp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/javadsl/ConnectHttp.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConnectHttpImplicitThis member is added by an implicit conversion from ConnectHttp toEnsuring\[ConnectHttp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/http/javadsl/ConnectHttp.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConnectHttpImplicitThis member is added by an implicit conversion from ConnectHttp toEnsuring\[ConnectHttp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/http/javadsl/ConnectHttp.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/http/javadsl/ConnectHttp.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/http/javadsl/ConnectHttp.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/http/javadsl/ConnectHttp.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/http/javadsl/ConnectHttp.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/http/javadsl/ConnectHttp.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/http/javadsl/ConnectHttp.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/http/javadsl/ConnectHttp.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/http/javadsl/ConnectHttp.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/http/javadsl/ConnectHttp.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesConnectHttp → AnyRef → Any
24. [**](../../../akka/http/javadsl/ConnectHttp.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/http/javadsl/ConnectHttp.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/http/javadsl/ConnectHttp.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/ConnectHttp.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/javadsl/ConnectHttp.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConnectHttp toStringFormat\[ConnectHttp] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/javadsl/ConnectHttp.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConnectHttp, B)ImplicitThis member is added by an implicit conversion from ConnectHttp toArrowAssoc\[ConnectHttp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConnectHttp to any2stringadd\[ConnectHttp]

### Inherited by implicit conversion StringFormat fromConnectHttp to StringFormat\[ConnectHttp]

### Inherited by implicit conversion Ensuring fromConnectHttp to Ensuring\[ConnectHttp]

### Inherited by implicit conversion ArrowAssoc fromConnectHttp to ArrowAssoc\[ConnectHttp]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttp$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttpImpl.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttpsImpl.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HostConnectionPool.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/IncomingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/OutgoingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBuilder$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html)*