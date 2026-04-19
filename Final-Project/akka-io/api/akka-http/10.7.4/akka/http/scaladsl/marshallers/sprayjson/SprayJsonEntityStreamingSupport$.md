---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonEntityStreamingSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonEntityStreamingSupport
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonEntityStreamingSupport

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonEntityStreamingSupport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/index.html "Permalink")  package [sprayjson](index.html)Definition Classes[marshallers](../index.html)
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- SprayJsonEntityStreamingSupport
- [SprayJsonSupport](SprayJsonSupport.html "A trait providing automatic to and from JSON marshalling/unmarshalling using an in-scope *spray-json* protocol.")
o[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshallers](../index.html).[sprayjson](index.html)

# SprayJsonEntityStreamingSupport[**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html "Permalink")

### 

#### object SprayJsonEntityStreamingSupport

Entity streaming support, implemented using spray\-json.

See also [github.com/spray/spray\-json](https://github.com/spray/spray-json) for details about Spray JSON itself

Source[SprayJsonSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-marshallers-scala/akka-http-spray-json/src/main/scala/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.scala#L78)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SprayJsonEntityStreamingSupport
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#json(maxObjectLength:Int):akka.http.scaladsl.marshallers.sprayjson.JsonEntityStreamingSupport "Permalink")  def json(maxObjectLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)Default `application/json` entity streaming support.

Default `application/json` entity streaming support.

Provides framing (based on scanning the incoming dataBytes for valid JSON objects, so for example uploads using arrays or
new\-line separated JSON objects are all parsed correctly) and rendering of Sources as JSON Arrays.
A different very popular style of returning streaming JSON is to separate JSON objects on a line\-by\-line basis,
you can configure the support trait to do so by calling `withFramingRendererFlow`.

See also <https://en.wikipedia.org/wiki/JSON_Streaming>
12. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#json():akka.http.scaladsl.marshallers.sprayjson.JsonEntityStreamingSupport "Permalink")  def json(): [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)Default `application/json` entity streaming support.

Default `application/json` entity streaming support.

Provides framing (based on scanning the incoming dataBytes for valid JSON objects, so for example uploads using arrays or
new\-line separated JSON objects are all parsed correctly) and rendering of Sources as JSON Arrays.
A different very popular style of returning streaming JSON is to separate JSON objects on a line\-by\-line basis,
you can configure the support trait to do so by calling `withFramingRendererFlow`.

Limits the maximum JSON object length to 8KB, if you want to increase this limit provide a value explicitly.

See also <https://en.wikipedia.org/wiki/JSON_Streaming>
13. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html)*