---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.client.RequestBuilding
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.client.RequestBuilding
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.client.RequestBuilding

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.client.RequestBuilding

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](index.html)Definition Classes[scaladsl](../index.html)
- RequestBuilding
- [TransformerAux](TransformerAux.html)
- [TransformerPipelineSupport](TransformerPipelineSupport.html)
[t](RequestBuilding$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[client](index.html)

# [RequestBuilding](RequestBuilding$.html "See companion object")[**](../../../../akka/http/scaladsl/client/RequestBuilding.html "Permalink")

### Companion [object RequestBuilding](RequestBuilding$.html "See companion object")

#### trait RequestBuilding extends [TransformerPipelineSupport](TransformerPipelineSupport.html)

Source[RequestBuilding.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/client/RequestBuilding.scala#L18)Linear Supertypes[TransformerPipelineSupport](TransformerPipelineSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RequestBuilding](RequestBuilding$.html), [RouteTest](../testkit/RouteTest.html), [ScalatestRouteTest](../testkit/ScalatestRouteTest.html), [Specs2RouteTest](../testkit/Specs2RouteTest.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RequestBuilding
2. TransformerPipelineSupport
3. AnyRef
4. Any
Implicitly  
1. by WithTransformation
2. by WithTransformation
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding$RequestBuilder.html "Permalink")  class [RequestBuilder](RequestBuilding$RequestBuilder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  type RequestTransformer \= ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)
3. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html "Permalink") implicit  class [WithTransformation](TransformerPipelineSupport$WithTransformation.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
4. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html "Permalink") implicit  class [WithTransformerConcatenation](TransformerPipelineSupport$WithTransformerConcatenation.html)\[A, B] extends (A) \=\> BDefinition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RequestBuilding toany2stringadd\[RequestBuilding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RequestBuilding, B)ImplicitThis member is added by an implicit conversion from RequestBuilding toArrowAssoc\[RequestBuilding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Delete:RequestBuilding.this.RequestBuilder "Permalink")  val Delete: [RequestBuilder](RequestBuilding$RequestBuilder.html)
7. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Get:RequestBuilding.this.RequestBuilder "Permalink")  val Get: [RequestBuilder](RequestBuilding$RequestBuilder.html)
8. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Head:RequestBuilding.this.RequestBuilder "Permalink")  val Head: [RequestBuilder](RequestBuilding$RequestBuilder.html)
9. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Options:RequestBuilding.this.RequestBuilder "Permalink")  val Options: [RequestBuilder](RequestBuilding$RequestBuilder.html)
10. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Patch:RequestBuilding.this.RequestBuilder "Permalink")  val Patch: [RequestBuilder](RequestBuilding$RequestBuilder.html)
11. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Post:RequestBuilding.this.RequestBuilder "Permalink")  val Post: [RequestBuilder](RequestBuilding$RequestBuilder.html)
12. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#Put:RequestBuilding.this.RequestBuilder "Permalink")  val Put: [RequestBuilder](RequestBuilding$RequestBuilder.html)
13. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#addAttribute[T](key:akka.http.scaladsl.model.AttributeKey[T],value:T):RequestBuilding.this.RequestTransformer "Permalink")  def addAttribute\[T](key: [AttributeKey](../model/AttributeKey.html)\[T], value: T): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
14. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#addCredentials(credentials:akka.http.scaladsl.model.headers.HttpCredentials):RequestBuilding.this.RequestTransformer "Permalink")  def addCredentials(credentials: [HttpCredentials](../model/headers/HttpCredentials.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
15. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#addHeader(headerName:String,headerValue:String):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(headerName: String, headerValue: String): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
16. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#addHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(header: [HttpHeader](../model/HttpHeader.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
17. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#addHeaders(first:akka.http.scaladsl.model.HttpHeader,more:akka.http.scaladsl.model.HttpHeader*):RequestBuilding.this.RequestTransformer "Permalink")  def addHeaders(first: [HttpHeader](../model/HttpHeader.html), more: [HttpHeader](../model/HttpHeader.html)\*): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
18. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RequestBuilding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RequestBuildingImplicitThis member is added by an implicit conversion from RequestBuilding toEnsuring\[RequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RequestBuilding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RequestBuildingImplicitThis member is added by an implicit conversion from RequestBuilding toEnsuring\[RequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RequestBuildingImplicitThis member is added by an implicit conversion from RequestBuilding toEnsuring\[RequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RequestBuildingImplicitThis member is added by an implicit conversion from RequestBuilding toEnsuring\[RequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
26. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#header2AddHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink") implicit  def header2AddHeader(header: [HttpHeader](../model/HttpHeader.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
29. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#logRequest(logFun:akka.http.scaladsl.model.HttpRequest=>Unit):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(logFun: ([HttpRequest](../model/HttpRequest.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)
31. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#logRequest(log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)
32. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#logValue[T](logFun:T=>Unit):T=>T "Permalink")  def logValue\[T](logFun: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
33. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#logValue[T](log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):T=>T "Permalink")  def logValue\[T](log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
34. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#mapHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):RequestBuilding.this.RequestTransformer "Permalink")  def mapHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
35. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#removeHeader(clazz:Class[_]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(clazz: Class\[\_]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
39. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#removeHeader[T<:akka.http.scaladsl.model.HttpHeader](implicitevidence$1:scala.reflect.ClassTag[T]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader\[T \<: [HttpHeader](../model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
40. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#removeHeader(headerName:String):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(headerName: String): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
41. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#removeHeaders(names:String*):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeaders(names: String\*): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)
42. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
44. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
46. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (RequestBuilding) \=\> B): BImplicitThis member is added by an implicit conversion from RequestBuilding to[RequestBuilding.WithTransformation](RequestBuilding$.html#WithTransformation[A]extendsAnyRef)\[RequestBuilding] performed by method WithTransformation in [akka.http.scaladsl.client.TransformerPipelineSupport](TransformerPipelineSupport.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestBuilding: RequestBuilding.WithTransformation[RequestBuilding]).~>(f)
```
Definition Classes[WithTransformation](TransformerPipelineSupport$WithTransformation.html)
2. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (RequestBuilding) \=\> B): BImplicitThis member is added by an implicit conversion from RequestBuilding to[TransformerPipelineSupport.WithTransformation](TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[RequestBuilding] performed by method WithTransformation in [akka.http.scaladsl.client.TransformerPipelineSupport](TransformerPipelineSupport.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(requestBuilding: TransformerPipelineSupport.WithTransformation[RequestBuilding]).~>(f)
```
Definition Classes[WithTransformation](TransformerPipelineSupport$WithTransformation.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RequestBuilding toStringFormat\[RequestBuilding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/client/RequestBuilding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RequestBuilding, B)ImplicitThis member is added by an implicit conversion from RequestBuilding toArrowAssoc\[RequestBuilding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [TransformerPipelineSupport](TransformerPipelineSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion WithTransformation fromRequestBuilding to [RequestBuilding.WithTransformation](RequestBuilding$.html#WithTransformation[A]extendsAnyRef)\[RequestBuilding]

### Inherited by implicit conversion WithTransformation fromRequestBuilding to [TransformerPipelineSupport.WithTransformation](TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[RequestBuilding]

### Inherited by implicit conversion any2stringadd fromRequestBuilding to any2stringadd\[RequestBuilding]

### Inherited by implicit conversion StringFormat fromRequestBuilding to StringFormat\[RequestBuilding]

### Inherited by implicit conversion Ensuring fromRequestBuilding to Ensuring\[RequestBuilding]

### Inherited by implicit conversion ArrowAssoc fromRequestBuilding to ArrowAssoc\[RequestBuilding]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding$RequestBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html)*