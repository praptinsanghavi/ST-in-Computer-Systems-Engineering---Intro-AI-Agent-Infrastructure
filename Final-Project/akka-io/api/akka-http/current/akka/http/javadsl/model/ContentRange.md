---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentRange
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:09:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentRange.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentRange
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentRange

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentRange

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/javadsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)Definition Classes[model](index.html)
- [AttributeKey](AttributeKey.html)
- [AttributeKeys](AttributeKeys.html)
- [Authority](Authority.html "Represents a hostname, port and user info.")
- [BodyPartEntity](BodyPartEntity.html "Marker-interface for entity types that can be used in a body part")
- ContentRange
- [ContentType](ContentType.html "Represents an Http content-type.")
- [ContentTypeRange](ContentTypeRange.html "A data structure that combines an acceptable media range and an acceptable charset range into one structure to be used with unmarshalling.")
- [ContentTypes](ContentTypes.html "Contains the set of predefined content-types for convenience.")
- [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.")
- [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")
- [Host](Host.html "Represents a host in a URI or a Host header.")
- [HttpCharset](HttpCharset.html "Represents a charset in Http.")
- [HttpCharsetRange](HttpCharsetRange.html "Represents an Http charset range.")
- [HttpCharsetRanges](HttpCharsetRanges.html "Contains constructors to create a HttpCharsetRange.")
- [HttpCharsets](HttpCharsets.html "Contains a set of predefined charsets.")
- [HttpEntities](HttpEntities.html "Constructors for HttpEntity instances")
- [HttpEntity](HttpEntity.html "Represents the entity of an Http message.")
- [HttpHeader](HttpHeader.html "The base type representing Http headers.")
- [HttpMessage](HttpMessage.html "The base type for an Http message (request or response).")
- [HttpMethod](HttpMethod.html "Represents an HTTP request method.")
- [HttpMethods](HttpMethods.html "Contains static constants for predefined method types.")
- [HttpProtocol](HttpProtocol.html "Represents an Http protocol (currently only HTTP/1.0 or HTTP/1.1).")
- [HttpProtocols](HttpProtocols.html "Contains constants of the supported Http protocols.")
- [HttpRequest](HttpRequest.html "Represents an Http request.")
- [HttpResponse](HttpResponse.html "Represents an Http response.")
- [MediaRange](MediaRange.html "Represents an Http media-range.")
- [MediaRanges](MediaRanges.html "Contains a set of predefined media-ranges and static methods to create custom ones.")
- [MediaType](MediaType.html)
- [MediaTypes](MediaTypes.html "Contains the set of predefined media-types.")
- [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.")
- [Multiparts](Multiparts.html "Constructors for Multipart instances")
- [Query](Query.html)
- [RemoteAddress](RemoteAddress.html)
- [RemoteAddresses](RemoteAddresses.html)
- [RequestEntity](RequestEntity.html "Marker-interface for entity types that can be used in a request")
- [RequestEntityAcceptance](RequestEntityAcceptance.html)
- [RequestEntityAcceptances](RequestEntityAcceptances.html)
- [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.")
- [ResponseEntity](ResponseEntity.html "Marker-interface for entity types that can be used in a response")
- [ResponseFuture](ResponseFuture.html "An association for completing a future when the response arrives.")
- [SslSessionInfo](SslSessionInfo.html)
- [StatusCode](StatusCode.html "Represents an Http status-code and message.")
- [StatusCodes](StatusCodes.html "Contains the set of predefined status-codes along with static methods to access and create custom status-codes.")
- [Trailer](Trailer.html "Trailing headers for HTTP/2 responses")
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings.html)
- [UniversalEntity](UniversalEntity.html "Marker-interface for entity types that can be used in any context")
- [Uri](Uri.html "Represents an Uri.")
c[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html)

# ContentRange[**](../../../../akka/http/javadsl/model/ContentRange.html "Permalink")

### 

#### abstract  class ContentRange extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ContentRange.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/java/akka/http/javadsl/model/ContentRange.java#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ByteContentRange](../../scaladsl/model/ByteContentRange.html), [ContentRange](../../scaladsl/model/ContentRange.html), [Default](../../scaladsl/model/ContentRange$$Default.html), [Other](../../scaladsl/model/ContentRange$$Other.html), [Unsatisfiable](../../scaladsl/model/ContentRange$$Unsatisfiable.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ContentRange
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

1. [**](../../../../akka/http/javadsl/model/ContentRange.html#<init>():akka.http.javadsl.model.ContentRange "Permalink")  new ContentRange()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/ContentRange.html#getInstanceLength():java.util.OptionalLong "Permalink") abstract  def getInstanceLength(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)
2. [**](../../../../akka/http/javadsl/model/ContentRange.html#getOtherValue():java.util.Optional[String] "Permalink") abstract  def getOtherValue(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]
3. [**](../../../../akka/http/javadsl/model/ContentRange.html#getSatisfiableFirst():java.util.OptionalLong "Permalink") abstract  def getSatisfiableFirst(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)
4. [**](../../../../akka/http/javadsl/model/ContentRange.html#getSatisfiableLast():java.util.OptionalLong "Permalink") abstract  def getSatisfiableLast(): [OptionalLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalLong.html#java.util.OptionalLong)
5. [**](../../../../akka/http/javadsl/model/ContentRange.html#isByteContentRange():Boolean "Permalink") abstract  def isByteContentRange(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
6. [**](../../../../akka/http/javadsl/model/ContentRange.html#isOther():Boolean "Permalink") abstract  def isOther(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../../../akka/http/javadsl/model/ContentRange.html#isSatisfiable():Boolean "Permalink") abstract  def isSatisfiable(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/ContentRange.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/ContentRange.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/ContentRange.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ContentRange toany2stringadd\[ContentRange] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/ContentRange.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ContentRange, B)ImplicitThis member is added by an implicit conversion from ContentRange toArrowAssoc\[ContentRange] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/ContentRange.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/ContentRange.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/ContentRange.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/ContentRange.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ContentRange) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ContentRangeImplicitThis member is added by an implicit conversion from ContentRange toEnsuring\[ContentRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/ContentRange.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ContentRange) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ContentRangeImplicitThis member is added by an implicit conversion from ContentRange toEnsuring\[ContentRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/ContentRange.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ContentRangeImplicitThis member is added by an implicit conversion from ContentRange toEnsuring\[ContentRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/ContentRange.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ContentRangeImplicitThis member is added by an implicit conversion from ContentRange toEnsuring\[ContentRange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/ContentRange.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/ContentRange.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/ContentRange.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/ContentRange.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/ContentRange.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/ContentRange.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/ContentRange.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/ContentRange.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/ContentRange.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/ContentRange.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/ContentRange.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/ContentRange.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/ContentRange.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/ContentRange.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/ContentRange.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ContentRange toStringFormat\[ContentRange] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/ContentRange.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ContentRange, B)ImplicitThis member is added by an implicit conversion from ContentRange toArrowAssoc\[ContentRange] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromContentRange to any2stringadd\[ContentRange]

### Inherited by implicit conversion StringFormat fromContentRange to StringFormat\[ContentRange]

### Inherited by implicit conversion Ensuring fromContentRange to Ensuring\[ContentRange]

### Inherited by implicit conversion ArrowAssoc fromContentRange to ArrowAssoc\[ContentRange]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Multiparts.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RemoteAddresses.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseFuture$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseFuture.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/SslSessionInfo$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/SslSessionInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/StatusCodes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Trailer$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentRange.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentRange.html)*