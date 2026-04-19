---
description: Akka HTTP 10.7.4 - akka.http.DefaultParsingErrorHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/DefaultParsingErrorHandler$.html
title: Akka HTTP 10.7.4 - akka.http.DefaultParsingErrorHandler
---

# Akka HTTP 10.7.4 - akka.http.DefaultParsingErrorHandler

> **Summary:** Akka HTTP 10.7.4 - akka.http.DefaultParsingErrorHandler

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/http/index.html "Permalink")  package [http](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/http/caching/index.html "Permalink")  package [caching](caching/index.html)Definition Classes[http](index.html)
- [**](../../akka/http/ccompat/index.html "Permalink")  package [ccompat](ccompat/index.html "INTERNAL API")INTERNAL API

INTERNAL API

Definition Classes[http](index.html)
- [**](../../akka/http/impl/index.html "Permalink")  package [impl](impl/index.html)Definition Classes[http](index.html)
- [**](../../akka/http/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[http](index.html)
- [**](../../akka/http/jwt/index.html "Permalink")  package [jwt](jwt/index.html)Definition Classes[http](index.html)
- [**](../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[http](index.html)
- [**](../../akka/http/shaded/index.html "Permalink")  package [shaded](shaded/index.html)Definition Classes[http](index.html)
- DefaultParsingErrorHandler
- [ParsingErrorHandler](ParsingErrorHandler.html)
- [Version](Version$.html)
o[akka](../index.html).[http](index.html)

# DefaultParsingErrorHandler[**](../../akka/http/DefaultParsingErrorHandler$.html "Permalink")

### 

#### object DefaultParsingErrorHandler extends [ParsingErrorHandler](ParsingErrorHandler.html)

Source[ParsingErrorHandler.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/ParsingErrorHandler.scala#L16)Linear Supertypes[ParsingErrorHandler](ParsingErrorHandler.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DefaultParsingErrorHandler
2. ParsingErrorHandler
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/http/DefaultParsingErrorHandler$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/http/DefaultParsingErrorHandler$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/http/DefaultParsingErrorHandler$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/http/DefaultParsingErrorHandler$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/http/DefaultParsingErrorHandler$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/http/DefaultParsingErrorHandler$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/http/DefaultParsingErrorHandler$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/http/DefaultParsingErrorHandler$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/http/DefaultParsingErrorHandler$.html#handle(status:akka.http.scaladsl.model.StatusCode,info:akka.http.scaladsl.model.ErrorInfo,log:akka.event.LoggingAdapter,settings:akka.http.scaladsl.settings.ServerSettings):akka.http.scaladsl.model.HttpResponse "Permalink")  def handle(status: [StatusCode](scaladsl/model/StatusCode.html), info: [ErrorInfo](scaladsl/model/ErrorInfo.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), settings: [ServerSettings](scaladsl/settings/ServerSettings.html)): [HttpResponse](scaladsl/model/HttpResponse.html)Definition ClassesDefaultParsingErrorHandler → [ParsingErrorHandler](ParsingErrorHandler.html)
10. [**](../../akka/http/DefaultParsingErrorHandler$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/http/DefaultParsingErrorHandler$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/http/DefaultParsingErrorHandler$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/http/DefaultParsingErrorHandler$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/http/DefaultParsingErrorHandler$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/http/DefaultParsingErrorHandler$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/http/DefaultParsingErrorHandler$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/http/DefaultParsingErrorHandler$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/http/DefaultParsingErrorHandler$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/http/DefaultParsingErrorHandler$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/http/DefaultParsingErrorHandler$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ParsingErrorHandler](ParsingErrorHandler.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-http/current/akka/http/DefaultParsingErrorHandler$.html
- https://doc.akka.io/api/akka-http/current/akka/http/ParsingErrorHandler.html
- https://doc.akka.io/api/akka-http/current/akka/http/Version$.html
- https://doc.akka.io/api/akka-http/current/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/ccompat/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/impl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/jwt/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/shaded/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/DefaultParsingErrorHandler$.html](https://doc.akka.io/api/akka-http/current/akka/http/DefaultParsingErrorHandler$.html)*