---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.client.RequestBuilding
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:05:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html
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
- [RequestBuilding](RequestBuilding.html)
- [TransformerAux](TransformerAux.html)
- [TransformerPipelineSupport](TransformerPipelineSupport.html)
[o](RequestBuilding.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[client](index.html)

# [RequestBuilding](RequestBuilding.html "See companion trait")[**](../../../../akka/http/scaladsl/client/RequestBuilding$.html "Permalink")

### Companion [trait RequestBuilding](RequestBuilding.html "See companion trait")

#### object RequestBuilding extends [RequestBuilding](RequestBuilding.html)

Source[RequestBuilding.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/client/RequestBuilding.scala#L102)Linear Supertypes[RequestBuilding](RequestBuilding.html), [TransformerPipelineSupport](TransformerPipelineSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RequestBuilding
2. RequestBuilding
3. TransformerPipelineSupport
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding$RequestBuilder.html "Permalink")  class [RequestBuilder](RequestBuilding$RequestBuilder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
2. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  type RequestTransformer \= ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](RequestBuilding.html)
3. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html "Permalink") implicit  class [WithTransformation](TransformerPipelineSupport$WithTransformation.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
4. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html "Permalink") implicit  class [WithTransformerConcatenation](TransformerPipelineSupport$WithTransformerConcatenation.html)\[A, B] extends (A) \=\> BDefinition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Delete:RequestBuilding.this.RequestBuilder "Permalink")  val Delete: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
5. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Get:RequestBuilding.this.RequestBuilder "Permalink")  val Get: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
6. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Head:RequestBuilding.this.RequestBuilder "Permalink")  val Head: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
7. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Options:RequestBuilding.this.RequestBuilder "Permalink")  val Options: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
8. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Patch:RequestBuilding.this.RequestBuilder "Permalink")  val Patch: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
9. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Post:RequestBuilding.this.RequestBuilder "Permalink")  val Post: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
10. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#Put:RequestBuilding.this.RequestBuilder "Permalink")  val Put: [RequestBuilder](#RequestBuilderextendsAnyRef)Definition Classes[RequestBuilding](RequestBuilding.html)
11. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#addAttribute[T](key:akka.http.scaladsl.model.AttributeKey[T],value:T):RequestBuilding.this.RequestTransformer "Permalink")  def addAttribute\[T](key: [AttributeKey](../model/AttributeKey.html)\[T], value: T): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
12. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#addCredentials(credentials:akka.http.scaladsl.model.headers.HttpCredentials):RequestBuilding.this.RequestTransformer "Permalink")  def addCredentials(credentials: [HttpCredentials](../model/headers/HttpCredentials.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
13. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#addHeader(headerName:String,headerValue:String):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(headerName: String, headerValue: String): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
14. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#addHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink")  def addHeader(header: [HttpHeader](../model/HttpHeader.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
15. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#addHeaders(first:akka.http.scaladsl.model.HttpHeader,more:akka.http.scaladsl.model.HttpHeader*):RequestBuilding.this.RequestTransformer "Permalink")  def addHeaders(first: [HttpHeader](../model/HttpHeader.html), more: [HttpHeader](../model/HttpHeader.html)\*): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
16. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#header2AddHeader(header:akka.http.scaladsl.model.HttpHeader):RequestBuilding.this.RequestTransformer "Permalink") implicit  def header2AddHeader(header: [HttpHeader](../model/HttpHeader.html)): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
23. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#logRequest(logFun:akka.http.scaladsl.model.HttpRequest=>Unit):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(logFun: ([HttpRequest](../model/HttpRequest.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](RequestBuilding.html)
25. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#logRequest(log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest "Permalink")  def logRequest(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)Definition Classes[RequestBuilding](RequestBuilding.html)
26. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#logValue[T](logFun:T=>Unit):T=>T "Permalink")  def logValue\[T](logFun: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
27. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#logValue[T](log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):T=>T "Permalink")  def logValue\[T](log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): (T) \=\> TDefinition Classes[TransformerPipelineSupport](TransformerPipelineSupport.html)
28. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#mapHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):RequestBuilding.this.RequestTransformer "Permalink")  def mapHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
29. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#removeHeader(clazz:Class[_]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(clazz: Class\[\_]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
33. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#removeHeader[T<:akka.http.scaladsl.model.HttpHeader](implicitevidence$1:scala.reflect.ClassTag[T]):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader\[T \<: [HttpHeader](../model/HttpHeader.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
34. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#removeHeader(headerName:String):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeader(headerName: String): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
35. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#removeHeaders(names:String*):RequestBuilding.this.RequestTransformer "Permalink")  def removeHeaders(names: String\*): [RequestTransformer](#RequestTransformer=akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest)Definition Classes[RequestBuilding](RequestBuilding.html)
36. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/client/RequestBuilding$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [RequestBuilding](RequestBuilding.html)

### Inherited from [TransformerPipelineSupport](TransformerPipelineSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding$RequestBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerAux$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerAux.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/RequestBuilding$.html)*