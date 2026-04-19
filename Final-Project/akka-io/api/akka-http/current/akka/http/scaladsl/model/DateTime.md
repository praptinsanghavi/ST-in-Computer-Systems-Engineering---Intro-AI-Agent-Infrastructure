---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.DateTime
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:51:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.DateTime
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.DateTime

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.DateTime

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](http2/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)Definition Classes[model](index.html)
- [AttributeKey](AttributeKey.html)
- [AttributeKeys](AttributeKeys$.html)
- [BodyPartEntity](BodyPartEntity.html)
- [ByteContentRange](ByteContentRange.html)
- [ContentRange](ContentRange.html)
- [ContentType](ContentType.html "A ContentType represents a specific MediaType / HttpCharset combination.")
- [ContentTypeRange](ContentTypeRange.html)
- [ContentTypes](ContentTypes$.html)
- DateTime
- [EntityStreamException](EntityStreamException.html)
- [EntityStreamSizeException](EntityStreamSizeException.html "This exception is thrown when the size of the HTTP Entity exceeds the configured limit.")
- [ErrorInfo](ErrorInfo.html "Two-level model of error information.")
- [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "Marker for exceptions that provide an ErrorInfo")
- [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")
- [HttpCharset](HttpCharset.html)
- [HttpCharsetRange](HttpCharsetRange.html "A charset range as encountered in Accept-Charset.")
- [HttpCharsets](HttpCharsets$.html)
- [HttpEntity](HttpEntity.html "Models the entity (aka \"body\" or \"content\") of an HTTP message.")
- [HttpHeader](HttpHeader.html "The model of an HTTP header.")
- [HttpMessage](HttpMessage.html "Common base class of HttpRequest and HttpResponse.")
- [HttpMethod](HttpMethod.html "The method of an HTTP request.")
- [HttpMethods](HttpMethods$.html)
- [HttpProtocol](HttpProtocol.html "The protocol of an HTTP message")
- [HttpProtocols](HttpProtocols$.html)
- [HttpRequest](HttpRequest.html "The immutable model HTTP request model.")
- [HttpResponse](HttpResponse.html "The immutable HTTP response model.")
- [IllegalHeaderException](IllegalHeaderException.html)
- [IllegalRequestException](IllegalRequestException.html)
- [IllegalResponseException](IllegalResponseException.html)
- [IllegalUriException](IllegalUriException.html)
- [InvalidContentLengthException](InvalidContentLengthException.html)
- [MediaRange](MediaRange.html)
- [MediaRanges](MediaRanges$.html)
- [MediaType](MediaType.html "A MediaType describes the type of the content of an HTTP message entity.")
- [MediaTypes](MediaTypes$.html)
- [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.")
- [OptHttpRequest](OptHttpRequest.html)
- [OptHttpResponse](OptHttpResponse.html)
- [ParsingException](ParsingException.html)
- [RemoteAddress](RemoteAddress.html)
- [RequestEntity](RequestEntity.html "An HttpEntity that can be used for requests.")
- [RequestEntityAcceptance](RequestEntityAcceptance.html)
- [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.")
- [RequestTimeoutException](RequestTimeoutException.html)
- [ResponseEntity](ResponseEntity.html "An HttpEntity that can be used for responses.")
- [ResponsePromise](ResponsePromise.html "An association for completing a future when the response arrives.")
- [SensitiveHttpHeader](SensitiveHttpHeader.html "Marker trait for headers which contain portentially secret / sensitive information.")
- [SimpleRequestResponseAttribute](SimpleRequestResponseAttribute.html "A simple value holder class implementing RequestResponseAssociation.")
- [SslSessionInfo](SslSessionInfo.html)
- [StatusCode](StatusCode.html "The result status code of an HTTP response.")
- [StatusCodes](StatusCodes$.html)
- [Trailer](Trailer.html)
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings$.html)
- [UniversalEntity](UniversalEntity.html)
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
[c](DateTime$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [DateTime](DateTime$.html "See companion object")[**](../../../../akka/http/scaladsl/model/DateTime.html "Permalink")

### Companion [object DateTime](DateTime$.html "See companion object")

#### final  case class DateTime extends [javadsl.model.DateTime](../../javadsl/model/DateTime.html) with Ordered\[DateTime] with Renderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Immutable, fast and efficient Date \+ Time implementation without any dependencies.
Does not support TimeZones, all DateTime values are always GMT based.
Note that this implementation discards milliseconds (i.e. rounds down to full seconds).

Source[DateTime.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/DateTime.scala#L14)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), Renderable, [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime], [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[DateTime], [javadsl.model.DateTime](../../javadsl/model/DateTime.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DateTime
2. Serializable
3. Product
4. Equals
5. Renderable
6. Ordered
7. Comparable
8. DateTime
9. AnyRef
10. Any
Implicitly  
1. by orderingToOrdered
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/DateTime.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/DateTime.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/DateTime.html#+(millis:Long):akka.http.scaladsl.model.DateTime "Permalink")  def \+(millis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): DateTimeCreates a new `DateTime` that represents the point in time the given number of ms later.
4. [**](../../../../akka/http/scaladsl/model/DateTime.html#-(millis:Long):akka.http.scaladsl.model.DateTime "Permalink")  def \-(millis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): DateTimeCreates a new `DateTime` that represents the point in time the given number of ms earlier.
5. [**](../../../../akka/http/scaladsl/model/DateTime.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DateTime, B)ImplicitThis member is added by an implicit conversion from DateTime toArrowAssoc\[DateTime] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../akka/http/scaladsl/model/DateTime.html#<(that:A):Boolean "Permalink")  def \<(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
7. [**](../../../../akka/http/scaladsl/model/DateTime.html#<=(that:A):Boolean "Permalink")  def \<\=(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
8. [**](../../../../akka/http/scaladsl/model/DateTime.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/http/scaladsl/model/DateTime.html#>(that:A):Boolean "Permalink")  def \>(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
10. [**](../../../../akka/http/scaladsl/model/DateTime.html#>=(that:A):Boolean "Permalink")  def \>\=(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
11. [**](../../../../akka/http/scaladsl/model/DateTime.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/model/DateTime.html#clicks:Long "Permalink")  val clicks: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Returns this instant as "clicks", i.e.

Returns this instant as "clicks", i.e. as milliseconds since January 1, 1970, 00:00:00 GMT

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
13. [**](../../../../akka/http/scaladsl/model/DateTime.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/DateTime.html#compare(that:akka.http.scaladsl.model.DateTime):Int "Permalink")  def compare(that: DateTime): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesDateTime → Ordered
15. [**](../../../../akka/http/scaladsl/model/DateTime.html#compareTo(that:A):Int "Permalink")  def compareTo(that: DateTime): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesOrdered → Comparable
16. [**](../../../../akka/http/scaladsl/model/DateTime.html#day:Int "Permalink")  val day: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the day of this instant in GMT.

Returns the day of this instant in GMT.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
17. [**](../../../../akka/http/scaladsl/model/DateTime.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DateTime) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DateTimeImplicitThis member is added by an implicit conversion from DateTime toEnsuring\[DateTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/model/DateTime.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DateTime) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DateTimeImplicitThis member is added by an implicit conversion from DateTime toEnsuring\[DateTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/model/DateTime.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DateTimeImplicitThis member is added by an implicit conversion from DateTime toEnsuring\[DateTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/model/DateTime.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DateTimeImplicitThis member is added by an implicit conversion from DateTime toEnsuring\[DateTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/model/DateTime.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/DateTime.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesDateTime → Equals → AnyRef → Any
23. [**](../../../../akka/http/scaladsl/model/DateTime.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/DateTime.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesDateTime → AnyRef → Any
25. [**](../../../../akka/http/scaladsl/model/DateTime.html#hour:Int "Permalink")  val hour: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the hour of this instant in GMT.

Returns the hour of this instant in GMT.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
26. [**](../../../../akka/http/scaladsl/model/DateTime.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../../../akka/http/scaladsl/model/DateTime.html#isLeapYear:Boolean "Permalink")  val isLeapYear: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this instant interpreted as a Date in GMT belongs to a leap year.

Returns if this instant interpreted as a Date in GMT belongs to a leap year.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
28. [**](../../../../akka/http/scaladsl/model/DateTime.html#minus(millis:Long):akka.http.scaladsl.model.DateTime "Permalink")  def minus(millis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): DateTimeCreates a new `DateTime` that represents the point in time the given number of ms earlier.

Creates a new `DateTime` that represents the point in time the given number of ms earlier.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
29. [**](../../../../akka/http/scaladsl/model/DateTime.html#minute:Int "Permalink")  val minute: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the minute of this instant in GMT.

Returns the minute of this instant in GMT.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
30. [**](../../../../akka/http/scaladsl/model/DateTime.html#month:Int "Permalink")  val month: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the month of this instant in GMT.

Returns the month of this instant in GMT.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
31. [**](../../../../akka/http/scaladsl/model/DateTime.html#monthStr():String "Permalink")  def monthStr(): StringThe month as a 3 letter abbreviation:
`Jan`, `Feb`, `Mar`, `Apr`, `May`, `Jun`, `Jul`, `Aug`, `Sep`, `Oct`, `Nov` or `Dec`

The month as a 3 letter abbreviation:
`Jan`, `Feb`, `Mar`, `Apr`, `May`, `Jun`, `Jul`, `Aug`, `Sep`, `Oct`, `Nov` or `Dec`

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
32. [**](../../../../akka/http/scaladsl/model/DateTime.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../../../akka/http/scaladsl/model/DateTime.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../../akka/http/scaladsl/model/DateTime.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../../akka/http/scaladsl/model/DateTime.html#plus(millis:Long):akka.http.scaladsl.model.DateTime "Permalink")  def plus(millis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): DateTimeCreates a new `DateTime` that represents the point in time the given number of ms later.

Creates a new `DateTime` that represents the point in time the given number of ms later.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
36. [**](../../../../akka/http/scaladsl/model/DateTime.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
37. [**](../../../../akka/http/scaladsl/model/DateTime.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.type`yyyy-mm-ddThh:mm:ss`

`yyyy-mm-ddThh:mm:ss`

Definition ClassesDateTime → Renderable
38. [**](../../../../akka/http/scaladsl/model/DateTime.html#renderIsoDate[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def renderIsoDate\[R \<: Rendering](r: R): r.type`yyyy-mm-dd`
39. [**](../../../../akka/http/scaladsl/model/DateTime.html#renderIsoDateTimeString[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def renderIsoDateTimeString\[R \<: Rendering](r: R): r.type`yyyy-mm-ddThh:mm:ss`
40. [**](../../../../akka/http/scaladsl/model/DateTime.html#renderIsoLikeDateTimeString[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def renderIsoLikeDateTimeString\[R \<: Rendering](r: R): r.type`yyyy-mm-dd hh:mm:ss`
41. [**](../../../../akka/http/scaladsl/model/DateTime.html#renderRfc1123DateTimeString[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def renderRfc1123DateTimeString\[R \<: Rendering](r: R): r.typeRFC1123 date string, e.g.

RFC1123 date string, e.g. `Sun, 06 Nov 1994 08:49:37 GMT`
42. [**](../../../../akka/http/scaladsl/model/DateTime.html#second:Int "Permalink")  val second: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the second of this instant in GMT.

Returns the second of this instant in GMT.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
43. [**](../../../../akka/http/scaladsl/model/DateTime.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
44. [**](../../../../akka/http/scaladsl/model/DateTime.html#toIsoDateString():String "Permalink")  def toIsoDateString(): String`yyyy-mm-dd`

`yyyy-mm-dd`

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
45. [**](../../../../akka/http/scaladsl/model/DateTime.html#toIsoDateTimeString():String "Permalink")  def toIsoDateTimeString(): String`yyyy-mm-ddThh:mm:ss`

`yyyy-mm-ddThh:mm:ss`

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
46. [**](../../../../akka/http/scaladsl/model/DateTime.html#toIsoLikeDateTimeString():String "Permalink")  def toIsoLikeDateTimeString(): String`yyyy-mm-dd hh:mm:ss`

`yyyy-mm-dd hh:mm:ss`

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
47. [**](../../../../akka/http/scaladsl/model/DateTime.html#toRfc1123DateTimeString():String "Permalink")  def toRfc1123DateTimeString(): StringRFC1123 date string, e.g.

RFC1123 date string, e.g. `Sun, 06 Nov 1994 08:49:37 GMT`

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
48. [**](../../../../akka/http/scaladsl/model/DateTime.html#toString():String "Permalink")  def toString(): String`yyyy-mm-ddThh:mm:ss`

`yyyy-mm-ddThh:mm:ss`

Definition ClassesDateTime → AnyRef → Any
49. [**](../../../../akka/http/scaladsl/model/DateTime.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
50. [**](../../../../akka/http/scaladsl/model/DateTime.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
51. [**](../../../../akka/http/scaladsl/model/DateTime.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
52. [**](../../../../akka/http/scaladsl/model/DateTime.html#weekday:Int "Permalink")  val weekday: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the weekday of this instant in GMT.

Returns the weekday of this instant in GMT. Sunday is 0, Monday is 1, etc.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
53. [**](../../../../akka/http/scaladsl/model/DateTime.html#weekdayStr():String "Permalink")  def weekdayStr(): StringThe day of the week as a 3 letter abbreviation:
`Sun`, `Mon`, `Tue`, `Wed`, `Thu`, `Fri` or `Sat`

The day of the week as a 3 letter abbreviation:
`Sun`, `Mon`, `Tue`, `Wed`, `Thu`, `Fri` or `Sat`

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
54. [**](../../../../akka/http/scaladsl/model/DateTime.html#year:Int "Permalink")  val year: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the year of this instant in GMT.

Returns the year of this instant in GMT.

Definition ClassesDateTime → [DateTime](../../javadsl/model/DateTime.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/DateTime.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DateTime toany2stringadd\[DateTime] performed by method any2stringadd in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: any2stringadd[DateTime]).+(other)
```
Definition Classesany2stringadd
2. [**](../../../../akka/http/scaladsl/model/DateTime.html#<(that:A):Boolean "Permalink")  def \<(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from DateTime to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: Ordered[DateTime]).<(that)
```
Definition ClassesOrdered
3. [**](../../../../akka/http/scaladsl/model/DateTime.html#<=(that:A):Boolean "Permalink")  def \<\=(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from DateTime to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: Ordered[DateTime]).<=(that)
```
Definition ClassesOrdered
4. [**](../../../../akka/http/scaladsl/model/DateTime.html#>(that:A):Boolean "Permalink")  def \>(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from DateTime to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: Ordered[DateTime]).>(that)
```
Definition ClassesOrdered
5. [**](../../../../akka/http/scaladsl/model/DateTime.html#>=(that:A):Boolean "Permalink")  def \>\=(that: DateTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from DateTime to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: Ordered[DateTime]).>=(that)
```
Definition ClassesOrdered
6. [**](../../../../akka/http/scaladsl/model/DateTime.html#compare(that:A):Int "Permalink")  def compare(that: DateTime): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from DateTime to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: Ordered[DateTime]).compare(that)
```
Definition ClassesOrdered
7. [**](../../../../akka/http/scaladsl/model/DateTime.html#compareTo(that:A):Int "Permalink")  def compareTo(that: DateTime): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from DateTime to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(dateTime: Ordered[DateTime]).compareTo(that)
```
Definition ClassesOrdered → Comparable
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/DateTime.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/DateTime.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DateTime toStringFormat\[DateTime] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/DateTime.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DateTime, B)ImplicitThis member is added by an implicit conversion from DateTime toArrowAssoc\[DateTime] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from Renderable

### Inherited from [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime]

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[DateTime]

### Inherited from [javadsl.model.DateTime](../../javadsl/model/DateTime.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion orderingToOrdered fromDateTime to [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[DateTime]

### Inherited by implicit conversion any2stringadd fromDateTime to any2stringadd\[DateTime]

### Inherited by implicit conversion StringFormat fromDateTime to StringFormat\[DateTime]

### Inherited by implicit conversion Ensuring fromDateTime to Ensuring\[DateTime]

### Inherited by implicit conversion ArrowAssoc fromDateTime to ArrowAssoc\[DateTime]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalRequestException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalResponseException$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html)*