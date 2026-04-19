---
description: Akka HTTP 10.7.4 - akka.http.ParsingErrorHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/ParsingErrorHandler.html
title: Akka HTTP 10.7.4 - akka.http.ParsingErrorHandler
---

# Akka HTTP 10.7.4 - akka.http.ParsingErrorHandler

> **Summary:** Akka HTTP 10.7.4 - akka.http.ParsingErrorHandler

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
- [DefaultParsingErrorHandler](DefaultParsingErrorHandler$.html)
- ParsingErrorHandler
- [Version](Version$.html)
c[akka](../index.html).[http](index.html)

# ParsingErrorHandler[**](../../akka/http/ParsingErrorHandler.html "Permalink")

### 

#### abstract  class ParsingErrorHandler extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ParsingErrorHandler.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/ParsingErrorHandler.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DefaultParsingErrorHandler](DefaultParsingErrorHandler$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ParsingErrorHandler
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

1. [**](../../akka/http/ParsingErrorHandler.html#<init>():akka.http.ParsingErrorHandler "Permalink")  new ParsingErrorHandler()
### Abstract Value Members

1. [**](../../akka/http/ParsingErrorHandler.html#handle(status:akka.http.scaladsl.model.StatusCode,error:akka.http.scaladsl.model.ErrorInfo,log:akka.event.LoggingAdapter,settings:akka.http.scaladsl.settings.ServerSettings):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def handle(status: [StatusCode](scaladsl/model/StatusCode.html), error: [ErrorInfo](scaladsl/model/ErrorInfo.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), settings: [ServerSettings](scaladsl/settings/ServerSettings.html)): [HttpResponse](javadsl/model/HttpResponse.html)
### Concrete Value Members

1. [**](../../akka/http/ParsingErrorHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/http/ParsingErrorHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/http/ParsingErrorHandler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ParsingErrorHandler toany2stringadd\[ParsingErrorHandler] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/http/ParsingErrorHandler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ParsingErrorHandler, B)ImplicitThis member is added by an implicit conversion from ParsingErrorHandler toArrowAssoc\[ParsingErrorHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/http/ParsingErrorHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/http/ParsingErrorHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/http/ParsingErrorHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/http/ParsingErrorHandler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ParsingErrorHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ParsingErrorHandlerImplicitThis member is added by an implicit conversion from ParsingErrorHandler toEnsuring\[ParsingErrorHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/http/ParsingErrorHandler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ParsingErrorHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParsingErrorHandlerImplicitThis member is added by an implicit conversion from ParsingErrorHandler toEnsuring\[ParsingErrorHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/http/ParsingErrorHandler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ParsingErrorHandlerImplicitThis member is added by an implicit conversion from ParsingErrorHandler toEnsuring\[ParsingErrorHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/http/ParsingErrorHandler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParsingErrorHandlerImplicitThis member is added by an implicit conversion from ParsingErrorHandler toEnsuring\[ParsingErrorHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/http/ParsingErrorHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/http/ParsingErrorHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/http/ParsingErrorHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/http/ParsingErrorHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/http/ParsingErrorHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/http/ParsingErrorHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/http/ParsingErrorHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/http/ParsingErrorHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/http/ParsingErrorHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/http/ParsingErrorHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/http/ParsingErrorHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/http/ParsingErrorHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/http/ParsingErrorHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/http/ParsingErrorHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/http/ParsingErrorHandler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ParsingErrorHandler toStringFormat\[ParsingErrorHandler] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/http/ParsingErrorHandler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ParsingErrorHandler, B)ImplicitThis member is added by an implicit conversion from ParsingErrorHandler toArrowAssoc\[ParsingErrorHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromParsingErrorHandler to any2stringadd\[ParsingErrorHandler]

### Inherited by implicit conversion StringFormat fromParsingErrorHandler to StringFormat\[ParsingErrorHandler]

### Inherited by implicit conversion Ensuring fromParsingErrorHandler to Ensuring\[ParsingErrorHandler]

### Inherited by implicit conversion ArrowAssoc fromParsingErrorHandler to ArrowAssoc\[ParsingErrorHandler]

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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/jwt/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/shaded/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/ParsingErrorHandler.html](https://doc.akka.io/api/akka-http/current/akka/http/ParsingErrorHandler.html)*