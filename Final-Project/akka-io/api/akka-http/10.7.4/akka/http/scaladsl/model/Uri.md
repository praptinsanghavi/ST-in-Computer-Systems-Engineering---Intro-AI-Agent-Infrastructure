---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:10:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri

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
- [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.")
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
- Uri
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
[c](Uri$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [Uri](Uri$.html "See companion object")[**](../../../../akka/http/scaladsl/model/Uri.html "Permalink")

### Companion [object Uri](Uri$.html "See companion object")

#### sealed abstract  case class Uri extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986\.
All members of this class represent the \*decoded\* URI elements (i.e. without percent\-encoding),
with the exception of 'rawQueryString': rawQueryString should be a string that only contains
characters permitted by https://tools.ietf.org/html/rfc3986\#section\-3\.4, any other characters
must be percent\-encoded (for example through UriParser.parseRawQueryString)

Annotations@DoNotInherit() Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L31)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Empty](Uri$$Empty$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Uri
2. Serializable
3. Product
4. Equals
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
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri.html#isEmpty:Boolean "Permalink") abstract  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Uri toany2stringadd\[Uri] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Uri.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Uri, B)ImplicitThis member is added by an implicit conversion from Uri toArrowAssoc\[Uri] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Uri.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/Uri.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/Uri.html#authority:akka.http.scaladsl.model.Uri.Authority "Permalink")  val authority: [Authority](Uri$$Authority.html)
8. [**](../../../../akka/http/scaladsl/model/Uri.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/model/Uri.html#copy(scheme:String,authority:akka.http.scaladsl.model.Uri.Authority,path:akka.http.scaladsl.model.Uri.Path,rawQueryString:Option[String],fragment:Option[String]):akka.http.scaladsl.model.Uri "Permalink")  def copy(scheme: String \= scheme, authority: [Authority](Uri$$Authority.html) \= authority, path: [Path](Uri$$Path.html) \= path, rawQueryString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= rawQueryString, fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= fragment): UriReturns a copy of this Uri with the given components.

Returns a copy of this Uri with the given components.

If you want to use the copy constructor to update the 'rawQueryString', it is up to you to
make sure the query string does not contain invalid characters. For this reason we
recommend using Uri\#withRawQueryString() instead.
10. [**](../../../../akka/http/scaladsl/model/Uri.html#effectivePort:Int "Permalink")  def effectivePort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The effective port of this Uri given the currently set authority and scheme values.

The effective port of this Uri given the currently set authority and scheme values.
If the authority has an explicitly set port (i.e. a non\-zero port value) then this port
is the effective port. Otherwise the default port for the current scheme is returned.
11. [**](../../../../akka/http/scaladsl/model/Uri.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Uri) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/Uri.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Uri) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/Uri.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/Uri.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UriImplicitThis member is added by an implicit conversion from Uri toEnsuring\[Uri] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/model/Uri.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/model/Uri.html#fragment:Option[String] "Permalink")  val fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
17. [**](../../../../akka/http/scaladsl/model/Uri.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/Uri.html#isAbsolute:Boolean "Permalink")  def isAbsolute: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
19. [**](../../../../akka/http/scaladsl/model/Uri.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../akka/http/scaladsl/model/Uri.html#isRelative:Boolean "Permalink")  def isRelative: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../../../akka/http/scaladsl/model/Uri.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/Uri.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/Uri.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/Uri.html#path:akka.http.scaladsl.model.Uri.Path "Permalink")  val path: [Path](Uri$$Path.html)
25. [**](../../../../akka/http/scaladsl/model/Uri.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../../akka/http/scaladsl/model/Uri.html#query(charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri.Query "Permalink")  def query(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html), mode: [ParsingMode](Uri$$ParsingMode.html) \= [Uri.ParsingMode.Relaxed](Uri$.html)): [Query](Uri$$Query.html)Parses the rawQueryString member into a Query instance.
27. [**](../../../../akka/http/scaladsl/model/Uri.html#queryString(charset:java.nio.charset.Charset):Option[String] "Permalink")  def queryString(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Returns the query part of the Uri in its decoded form.
28. [**](../../../../akka/http/scaladsl/model/Uri.html#rawQueryString:Option[String] "Permalink")  val rawQueryString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
29. [**](../../../../akka/http/scaladsl/model/Uri.html#resolvedAgainst(base:akka.http.scaladsl.model.Uri):akka.http.scaladsl.model.Uri "Permalink")  def resolvedAgainst(base: Uri): UriReturns a new absolute Uri that is the result of the resolution process defined by
http://tools.ietf.org/html/rfc3986\#section\-5\.2\.2
The given base Uri must be absolute.
30. [**](../../../../akka/http/scaladsl/model/Uri.html#scheme:String "Permalink")  val scheme: String
31. [**](../../../../akka/http/scaladsl/model/Uri.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/scaladsl/model/Uri.html#toEffectiveHttpRequestUri(hostHeaderHost:akka.http.scaladsl.model.Uri.Host,hostHeaderPort:Int,securedConnection:Boolean,defaultAuthority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def toEffectiveHttpRequestUri(hostHeaderHost: [Host](Uri$$Host.html), hostHeaderPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, defaultAuthority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$.html)): UriConverts this URI to an "effective HTTP request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5
33. [**](../../../../akka/http/scaladsl/model/Uri.html#toEffectiveRequestUri(hostHeaderHost:akka.http.scaladsl.model.Uri.Host,hostHeaderPort:Int,defaultScheme:String,defaultAuthority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def toEffectiveRequestUri(hostHeaderHost: [Host](Uri$$Host.html), hostHeaderPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), defaultScheme: String, defaultAuthority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$.html)): UriConverts this URI to an "effective request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5
34. [**](../../../../akka/http/scaladsl/model/Uri.html#toHttpRequestTargetOriginForm:akka.http.scaladsl.model.Uri "Permalink")  def toHttpRequestTargetOriginForm: UriConverts this URI into an HTTP request target "origin\-form" as defined by
https://tools.ietf.org/html/rfc7230\#section\-5\.3\.

Converts this URI into an HTTP request target "origin\-form" as defined by
https://tools.ietf.org/html/rfc7230\#section\-5\.3\.

Note that the resulting URI instance is not a valid RFC 3986 URI! (As it might
be a "relative" URI with a part component starting with a double slash.)
35. [**](../../../../akka/http/scaladsl/model/Uri.html#toRelative:akka.http.scaladsl.model.Uri "Permalink")  def toRelative: UriConverts this URI into a relative URI by keeping the path, query and fragment, but dropping the scheme and authority.
36. [**](../../../../akka/http/scaladsl/model/Uri.html#toString():String "Permalink")  def toString(): StringDefinition ClassesUri → AnyRef → Any
37. [**](../../../../akka/http/scaladsl/model/Uri.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../akka/http/scaladsl/model/Uri.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../../akka/http/scaladsl/model/Uri.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../../akka/http/scaladsl/model/Uri.html#withAuthority(host:String,port:Int):akka.http.scaladsl.model.Uri "Permalink")  def withAuthority(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): UriReturns a copy of this Uri with a Authority created using the given host and port.
41. [**](../../../../akka/http/scaladsl/model/Uri.html#withAuthority(host:akka.http.scaladsl.model.Uri.Host,port:Int,userinfo:String):akka.http.scaladsl.model.Uri "Permalink")  def withAuthority(host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), userinfo: String \= ""): UriReturns a copy of this Uri with a Authority created using the given host, port and userinfo.
42. [**](../../../../akka/http/scaladsl/model/Uri.html#withAuthority(authority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def withAuthority(authority: [Authority](Uri$$Authority.html)): UriReturns a copy of this Uri with the given authority.
43. [**](../../../../akka/http/scaladsl/model/Uri.html#withFragment(fragment:String):akka.http.scaladsl.model.Uri "Permalink")  def withFragment(fragment: String): UriReturns a copy of this Uri with the given fragment.
44. [**](../../../../akka/http/scaladsl/model/Uri.html#withHost(host:String):akka.http.scaladsl.model.Uri "Permalink")  def withHost(host: String): UriReturns a copy of this Uri with the given host.
45. [**](../../../../akka/http/scaladsl/model/Uri.html#withHost(host:akka.http.scaladsl.model.Uri.Host):akka.http.scaladsl.model.Uri "Permalink")  def withHost(host: [Host](Uri$$Host.html)): UriReturns a copy of this Uri with the given host.
46. [**](../../../../akka/http/scaladsl/model/Uri.html#withPath(path:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri "Permalink")  def withPath(path: [Path](Uri$$Path.html)): UriReturns a copy of this Uri with the given path.
47. [**](../../../../akka/http/scaladsl/model/Uri.html#withPort(port:Int):akka.http.scaladsl.model.Uri "Permalink")  def withPort(port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): UriReturns a copy of this Uri with the given port.
48. [**](../../../../akka/http/scaladsl/model/Uri.html#withQuery(query:akka.http.scaladsl.model.Uri.Query):akka.http.scaladsl.model.Uri "Permalink")  def withQuery(query: [Query](Uri$$Query.html)): UriReturns a copy of this Uri with the given query.
49. [**](../../../../akka/http/scaladsl/model/Uri.html#withRawQueryString(rawQueryString:String,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def withRawQueryString(rawQueryString: String, mode: [ParsingMode](Uri$$ParsingMode.html)): UriReturns a copy of this Uri with the given query string.

Returns a copy of this Uri with the given query string.

Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
must be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
and depending on how the query string is parsed this might be relevant: for example, when interpreting
the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
key or value.

modedepending on the mode, characters outside of the range allowed by RFC3986 will
 either cause an `IllegalUriException` or be automatically percent\-encoded. Be aware that relying
 on automatic percent\-encoding is usually a programming error.
50. [**](../../../../akka/http/scaladsl/model/Uri.html#withRawQueryString(rawQuery:String):akka.http.scaladsl.model.Uri "Permalink")  def withRawQueryString(rawQuery: String): UriReturns a copy of this Uri with the given query string.

Returns a copy of this Uri with the given query string.

Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
and depending on how the query string is parsed this might be relevant: for example, when interpreting
the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in a
key or value.

When characters are encountered that are outside of the RFC3986 range they are automatically
percent\-encoded, but be aware that relying on this is usually a programming error.
51. [**](../../../../akka/http/scaladsl/model/Uri.html#withScheme(scheme:String):akka.http.scaladsl.model.Uri "Permalink")  def withScheme(scheme: String): UriReturns a copy of this Uri with the given scheme.

Returns a copy of this Uri with the given scheme. The `scheme` change of the Uri has the following
effect on the port value:

	- If the Uri has a non\-default port for the scheme before the change this port will remain unchanged.
	- If the Uri has the default port for the scheme before the change it will have the default port for
	 the **new** scheme after the change.
52. [**](../../../../akka/http/scaladsl/model/Uri.html#withUserInfo(userinfo:String):akka.http.scaladsl.model.Uri "Permalink")  def withUserInfo(userinfo: String): UriReturns a copy of this Uri with the given userinfo.
53. [**](../../../../akka/http/scaladsl/model/Uri.html#withoutFragment:akka.http.scaladsl.model.Uri "Permalink")  def withoutFragment: UriDrops the fragment from this URI
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Uri.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Uri toStringFormat\[Uri] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Uri.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Uri, B)ImplicitThis member is added by an implicit conversion from Uri toArrowAssoc\[Uri] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUri to any2stringadd\[Uri]

### Inherited by implicit conversion StringFormat fromUri to StringFormat\[Uri]

### Inherited by implicit conversion Ensuring fromUri to Ensuring\[Uri]

### Inherited by implicit conversion ArrowAssoc fromUri to ArrowAssoc\[Uri]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalHeaderException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalRequestException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalResponseException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalResponseException.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html)*