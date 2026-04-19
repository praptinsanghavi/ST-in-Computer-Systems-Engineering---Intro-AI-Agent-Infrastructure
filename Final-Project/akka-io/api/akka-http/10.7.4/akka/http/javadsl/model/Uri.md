---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.Uri
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Uri.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.Uri
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.Uri

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.Uri

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
- [ContentRange](ContentRange.html)
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
- Uri
c[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html)

# Uri[**](../../../../akka/http/javadsl/model/Uri.html "Permalink")

### 

#### abstract  class Uri extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Represents an Uri. Use methods on the class to create modified copies of a given instance.

Source[Uri.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/java/akka/http/javadsl/model/Uri.java#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Uri
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

1. [**](../../../../akka/http/javadsl/model/Uri.html#<init>():akka.http.javadsl.model.Uri "Permalink")  new Uri()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/Uri.html#addPathSegment(segment:String):akka.http.javadsl.model.Uri "Permalink") abstract  def addPathSegment(segment: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with a path segment added at the end.
2. [**](../../../../akka/http/javadsl/model/Uri.html#asScala():akka.http.scaladsl.model.Uri "Permalink") abstract  def asScala(): [scaladsl.model.Uri](../../scaladsl/model/Uri.html)Returns the Scala DSL representation of this Uri.
3. [**](../../../../akka/http/javadsl/model/Uri.html#fragment(fragment:java.util.Optional[String]):akka.http.javadsl.model.Uri "Permalink") abstract  def fragment(fragment: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]): UriReturns a copy of this instance with a new optional fragment.
4. [**](../../../../akka/http/javadsl/model/Uri.html#fragment(fragment:String):akka.http.javadsl.model.Uri "Permalink") abstract  def fragment(fragment: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with a new fragment.
5. [**](../../../../akka/http/javadsl/model/Uri.html#fragment():java.util.Optional[String] "Permalink") abstract  def fragment(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]Returns the fragment part of this Uri.
6. [**](../../../../akka/http/javadsl/model/Uri.html#getHost():akka.http.javadsl.model.Host "Permalink") abstract  def getHost(): [Host](Host.html)Returns the host of this instance
7. [**](../../../../akka/http/javadsl/model/Uri.html#getPathString():String "Permalink") abstract  def getPathString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the path of this instance
8. [**](../../../../akka/http/javadsl/model/Uri.html#getPort():Int "Permalink") abstract  def getPort(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the port of this instance
9. [**](../../../../akka/http/javadsl/model/Uri.html#getScheme():String "Permalink") abstract  def getScheme(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the scheme of this instance
10. [**](../../../../akka/http/javadsl/model/Uri.html#getUserInfo():String "Permalink") abstract  def getUserInfo(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the user info of this instance
11. [**](../../../../akka/http/javadsl/model/Uri.html#host(host:String):akka.http.javadsl.model.Uri "Permalink") abstract  def host(host: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with a new host.
12. [**](../../../../akka/http/javadsl/model/Uri.html#host(host:akka.http.javadsl.model.Host):akka.http.javadsl.model.Uri "Permalink") abstract  def host(host: [Host](Host.html)): UriReturns a copy of this instance with a new Host.
13. [**](../../../../akka/http/javadsl/model/Uri.html#host():akka.http.javadsl.model.Host "Permalink") abstract  def host(): [Host](Host.html)Returns the Host of this Uri.
14. [**](../../../../akka/http/javadsl/model/Uri.html#isAbsolute():Boolean "Permalink") abstract  def isAbsolute(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this is an absolute Uri.
15. [**](../../../../akka/http/javadsl/model/Uri.html#isEmpty():Boolean "Permalink") abstract  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this is an empty Uri.
16. [**](../../../../akka/http/javadsl/model/Uri.html#isRelative():Boolean "Permalink") abstract  def isRelative(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if this is a relative Uri.
17. [**](../../../../akka/http/javadsl/model/Uri.html#path(path:String):akka.http.javadsl.model.Uri "Permalink") abstract  def path(path: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with a new path.
18. [**](../../../../akka/http/javadsl/model/Uri.html#path():String "Permalink") abstract  def path(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns a String representation of the path of this Uri.
19. [**](../../../../akka/http/javadsl/model/Uri.html#pathSegments():Iterable[String] "Permalink") abstract  def pathSegments(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]Returns the path segments of this Uri as an Iterable.
20. [**](../../../../akka/http/javadsl/model/Uri.html#port(port:Int):akka.http.javadsl.model.Uri "Permalink") abstract  def port(port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): UriReturns a copy of this instance with a new port.
21. [**](../../../../akka/http/javadsl/model/Uri.html#port():Int "Permalink") abstract  def port(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the port of this Uri.
22. [**](../../../../akka/http/javadsl/model/Uri.html#query(query:akka.http.javadsl.model.Query):akka.http.javadsl.model.Uri "Permalink") abstract  def query(query: [Query](Query.html)): UriReturns a copy of this instance with a new query.
23. [**](../../../../akka/http/javadsl/model/Uri.html#query(charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.javadsl.model.Query "Permalink") abstract  def query(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset), mode: [ParsingMode](../../scaladsl/model/Uri$$ParsingMode.html)): [Query](Query.html)Returns the parsed Query instance of this Uri using the given charset and parsing mode.
24. [**](../../../../akka/http/javadsl/model/Uri.html#query():akka.http.javadsl.model.Query "Permalink") abstract  def query(): [Query](Query.html)Returns the parsed Query instance of this Uri.
25. [**](../../../../akka/http/javadsl/model/Uri.html#queryString(charset:java.nio.charset.Charset):java.util.Optional[String] "Permalink") abstract  def queryString(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset)): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]Returns a decoded String representation of the query of this Uri.
26. [**](../../../../akka/http/javadsl/model/Uri.html#rawQueryString(rawQuery:String,strict:Boolean):akka.http.javadsl.model.Uri "Permalink") abstract  def rawQueryString(rawQuery: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), strict: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UriReturns a copy of this instance with a new query.

Returns a copy of this instance with a new query.

Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
and depending on how the query string is parsed this might be relevant: for example, when interpreting
the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
key or value.

strictdepending on the 'strict' flag, characters outside of the range allowed by RFC3986 will
 either cause a `IllegalUriException` or be automatically percent\-encoded. Be aware that relying
 on automatic percent\-encoding is usually a programming error.
27. [**](../../../../akka/http/javadsl/model/Uri.html#rawQueryString(rawQuery:String):akka.http.javadsl.model.Uri "Permalink") abstract  def rawQueryString(rawQuery: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with a new query.

Returns a copy of this instance with a new query.

Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
and depending on how the query string is parsed this might be relevant: for example, when interpreting
the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
key or value.

When characters are encountered that are outside of the RFC3986 range they are automatically
percent\-encoded, but be aware that relying on this is usually a programming error.
28. [**](../../../../akka/http/javadsl/model/Uri.html#rawQueryString():java.util.Optional[String] "Permalink") abstract  def rawQueryString(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]Returns an undecoded String representation of the query of this Uri.
29. [**](../../../../akka/http/javadsl/model/Uri.html#scheme(scheme:String):akka.http.javadsl.model.Uri "Permalink") abstract  def scheme(scheme: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with a new scheme.
30. [**](../../../../akka/http/javadsl/model/Uri.html#scheme():String "Permalink") abstract  def scheme(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the scheme of this Uri.
31. [**](../../../../akka/http/javadsl/model/Uri.html#toRelative():akka.http.javadsl.model.Uri "Permalink") abstract  def toRelative(): UriReturns a copy of this instance that is relative.
32. [**](../../../../akka/http/javadsl/model/Uri.html#userInfo(userInfo:String):akka.http.javadsl.model.Uri "Permalink") abstract  def userInfo(userInfo: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): UriReturns a copy of this instance with new user\-info.
33. [**](../../../../akka/http/javadsl/model/Uri.html#userInfo():String "Permalink") abstract  def userInfo(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Returns the user\-info of this Uri.
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/Uri.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/Uri.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/Uri.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Uri toany2stringadd\[Uri] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/Uri.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Uri, B)ImplicitThis member is added by an implicit conversion from Uri toArrowAssoc\[Uri] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/Uri.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/Uri.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/Uri.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/Uri.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Uri) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/Uri.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Uri) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/Uri.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/Uri.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/Uri.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/Uri.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/Uri.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/Uri.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/Uri.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/Uri.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/Uri.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/Uri.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/Uri.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/Uri.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/Uri.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/Uri.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/Uri.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/Uri.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/Uri.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Uri toStringFormat\[Uri] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/Uri.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Uri, B)ImplicitThis member is added by an implicit conversion from Uri toArrowAssoc\[Uri] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUri to any2stringadd\[Uri]

### Inherited by implicit conversion StringFormat fromUri to StringFormat\[Uri]

### Inherited by implicit conversion Ensuring fromUri to Ensuring\[Uri]

### Inherited by implicit conversion ArrowAssoc fromUri to ArrowAssoc\[Uri]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Multiparts.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Query.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddresses.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseFuture$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseFuture.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/SslSessionInfo$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/SslSessionInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Trailer$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Uri.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Uri.html)*