---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](client/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](coding/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](common/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](model/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](server/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](settings/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[scaladsl](index.html)
- ClientTransport
- [ConnectionContext](ConnectionContext.html)
- [Http](Http$.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.")
- [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection")
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
[t](ClientTransport$.html "See companion object")[akka](../../index.html).[http](../index.html).[scaladsl](index.html)

# [ClientTransport](ClientTransport$.html "See companion object")[**](../../../akka/http/scaladsl/ClientTransport.html "Permalink")

### Companion [object ClientTransport](ClientTransport$.html "See companion object")

#### trait ClientTransport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Abstraction to allow the creation of alternative transports to run HTTP on.

SPI for implementors of custom client transports.

Source[ClientTransport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ClientTransport.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClientTransport
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
### Abstract Value Members

1. [**](../../../akka/http/scaladsl/ClientTransport.html#connectTo(host:String,port:Int,settings:akka.http.scaladsl.settings.ClientConnectionSettings)(implicitsystem:akka.actor.ActorSystem):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.http.scaladsl.Http.OutgoingConnection]] "Permalink") abstract  def connectTo(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html))(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Http$$OutgoingConnection.html)]]
### Concrete Value Members

1. [**](../../../akka/http/scaladsl/ClientTransport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/ClientTransport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/ClientTransport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClientTransport toany2stringadd\[ClientTransport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/scaladsl/ClientTransport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClientTransport, B)ImplicitThis member is added by an implicit conversion from ClientTransport toArrowAssoc\[ClientTransport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/scaladsl/ClientTransport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/scaladsl/ClientTransport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/scaladsl/ClientTransport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/http/scaladsl/ClientTransport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClientTransport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClientTransportImplicitThis member is added by an implicit conversion from ClientTransport toEnsuring\[ClientTransport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/http/scaladsl/ClientTransport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClientTransport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClientTransportImplicitThis member is added by an implicit conversion from ClientTransport toEnsuring\[ClientTransport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/scaladsl/ClientTransport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClientTransportImplicitThis member is added by an implicit conversion from ClientTransport toEnsuring\[ClientTransport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/scaladsl/ClientTransport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClientTransportImplicitThis member is added by an implicit conversion from ClientTransport toEnsuring\[ClientTransport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/scaladsl/ClientTransport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/http/scaladsl/ClientTransport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/http/scaladsl/ClientTransport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/http/scaladsl/ClientTransport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/scaladsl/ClientTransport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/http/scaladsl/ClientTransport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/http/scaladsl/ClientTransport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/scaladsl/ClientTransport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/scaladsl/ClientTransport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/http/scaladsl/ClientTransport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/http/scaladsl/ClientTransport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/http/scaladsl/ClientTransport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/http/scaladsl/ClientTransport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/ClientTransport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/scaladsl/ClientTransport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClientTransport toStringFormat\[ClientTransport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/scaladsl/ClientTransport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClientTransport, B)ImplicitThis member is added by an implicit conversion from ClientTransport toArrowAssoc\[ClientTransport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClientTransport to any2stringadd\[ClientTransport]

### Inherited by implicit conversion StringFormat fromClientTransport to StringFormat\[ClientTransport]

### Inherited by implicit conversion Ensuring fromClientTransport to Ensuring\[ClientTransport]

### Inherited by implicit conversion ArrowAssoc fromClientTransport to ArrowAssoc\[ClientTransport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$OutgoingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html)*