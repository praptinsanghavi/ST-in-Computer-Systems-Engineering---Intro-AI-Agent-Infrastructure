---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.HttpsConnectionContext
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.HttpsConnectionContext
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.HttpsConnectionContext

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.HttpsConnectionContext

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
- [ClientTransport](ClientTransport.html "Abstraction to allow the creation of alternative transports to run HTTP on.")
- [ConnectionContext](ConnectionContext.html)
- [Http](Http$.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.")
- HttpsConnectionContext
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
c[akka](../../index.html).[http](../index.html).[scaladsl](index.html)

# HttpsConnectionContext[**](../../../akka/http/scaladsl/HttpsConnectionContext.html "Permalink")

### 

#### final  class HttpsConnectionContext extends [javadsl.HttpsConnectionContext](../javadsl/HttpsConnectionContext.html) with [ConnectionContext](ConnectionContext.html)

 Context with all information needed to set up a HTTPS connection

This constructor is INTERNAL API, use ConnectionContext.httpsClient instead

Annotations@InternalApi() Source[ConnectionContext.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ConnectionContext.scala#L86)Linear Supertypes[ConnectionContext](ConnectionContext.html), [javadsl.HttpsConnectionContext](../javadsl/HttpsConnectionContext.html), [javadsl.ConnectionContext](../javadsl/ConnectionContext.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpsConnectionContext
2. ConnectionContext
3. HttpsConnectionContext
4. ConnectionContext
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpsConnectionContext toany2stringadd\[HttpsConnectionContext] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpsConnectionContext, B)ImplicitThis member is added by an implicit conversion from HttpsConnectionContext toArrowAssoc\[HttpsConnectionContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#defaultPort:Int "Permalink") final  def defaultPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)INTERNAL API

INTERNAL API

Attributesprotected\[[http](../index.html)] Definition ClassesHttpsConnectionContext → [ConnectionContext](ConnectionContext.html)
9. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpsConnectionContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpsConnectionContextImplicitThis member is added by an implicit conversion from HttpsConnectionContext toEnsuring\[HttpsConnectionContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpsConnectionContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpsConnectionContextImplicitThis member is added by an implicit conversion from HttpsConnectionContext toEnsuring\[HttpsConnectionContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpsConnectionContextImplicitThis member is added by an implicit conversion from HttpsConnectionContext toEnsuring\[HttpsConnectionContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpsConnectionContextImplicitThis member is added by an implicit conversion from HttpsConnectionContext toEnsuring\[HttpsConnectionContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#isSecure:Boolean "Permalink") final  def isSecure: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[HttpsConnectionContext](../javadsl/HttpsConnectionContext.html) → [ConnectionContext](../javadsl/ConnectionContext.html)
19. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpsConnectionContext toStringFormat\[HttpsConnectionContext] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpsConnectionContext, B)ImplicitThis member is added by an implicit conversion from HttpsConnectionContext toArrowAssoc\[HttpsConnectionContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ConnectionContext](ConnectionContext.html)

### Inherited from [javadsl.HttpsConnectionContext](../javadsl/HttpsConnectionContext.html)

### Inherited from [javadsl.ConnectionContext](../javadsl/ConnectionContext.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpsConnectionContext to any2stringadd\[HttpsConnectionContext]

### Inherited by implicit conversion StringFormat fromHttpsConnectionContext to StringFormat\[HttpsConnectionContext]

### Inherited by implicit conversion Ensuring fromHttpsConnectionContext to Ensuring\[HttpsConnectionContext]

### Inherited by implicit conversion ArrowAssoc fromHttpsConnectionContext to ArrowAssoc\[HttpsConnectionContext]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html)*