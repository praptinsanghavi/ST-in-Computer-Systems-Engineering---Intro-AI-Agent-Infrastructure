---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:52:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$.html
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
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
[o](Uri.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [Uri](Uri.html "See companion class")[**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")

### Companion [class Uri](Uri.html "See companion class")

#### object Uri extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L208)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Uri
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html "Permalink") final  case class [Authority](Uri$$Authority.html)(host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, userinfo: String \= "") extends [javadsl.model.Authority](../../javadsl/model/Authority.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableportA port number that may be `0` to signal the default port of for scheme.
 In general what you want is not the value of this field but [Uri.effectivePort](Uri.html#effectivePort:Int).

userinfoThe percent decoded userinfo. According to https://tools.ietf.org/html/rfc3986\#section\-3\.2\.1
 the "user:password" syntax is deprecated and implementations are encouraged to ignore any characters
 after the colon (`:`). Therefore, it is not guaranteed that future versions of this class will
 preserve full userinfo between parsing and rendering (even if it might do so right now).
2. [**](../../../../akka/http/scaladsl/model/Uri$$Host.html "Permalink") sealed abstract  class [Host](Uri$$Host.html) extends [javadsl.model.Host](../../javadsl/model/Host.html)
3. [**](../../../../akka/http/scaladsl/model/Uri$$IPv4Host.html "Permalink") final  case class [IPv4Host](Uri$$IPv4Host.html) extends [NonEmptyHost](Uri$$NonEmptyHost.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../../akka/http/scaladsl/model/Uri$$IPv6Host.html "Permalink") final  case class [IPv6Host](Uri$$IPv6Host.html) extends [NonEmptyHost](Uri$$NonEmptyHost.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../../akka/http/scaladsl/model/Uri$$NamedHost.html "Permalink") final  case class [NamedHost](Uri$$NamedHost.html)(address: String) extends [NonEmptyHost](Uri$$NonEmptyHost.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
6. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html "Permalink") sealed abstract  class [NonEmptyHost](Uri$$NonEmptyHost.html) extends [Host](Uri$$Host.html)
7. [**](../../../../akka/http/scaladsl/model/Uri$$ParsingMode.html "Permalink") sealed  trait [ParsingMode](Uri$$ParsingMode.html) extends javadsl.model.Uri.ParsingMode
8. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html "Permalink") sealed abstract  class [Path](Uri$$Path.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../../akka/http/scaladsl/model/Uri$$Query.html "Permalink") sealed abstract  class [Query](Uri$$Query.html) extends [QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$.html#/:akka.http.scaladsl.model.Uri "Permalink")  val /: [Uri](Uri.html)
4. [**](../../../../akka/http/scaladsl/model/Uri$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
5. [**](../../../../akka/http/scaladsl/model/Uri$.html#apply(scheme:String,authority:akka.http.scaladsl.model.Uri.Authority,path:akka.http.scaladsl.model.Uri.Path,queryString:Option[String],fragment:Option[String]):akka.http.scaladsl.model.Uri "Permalink")  def apply(scheme: String \= "", authority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$$Authority$.html), path: [Path](Uri$$Path.html) \= [Path.Empty](Uri$$Path$.html), queryString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None): [Uri](Uri.html)Creates a new Uri instance from the given components.

Creates a new Uri instance from the given components.
All components are verified and normalized except the authority which is kept as provided.
If the given combination of components does not constitute a valid URI as defined by
http://tools.ietf.org/html/rfc3986 the method throws an `IllegalUriException`.

queryStringpercent\-encoded query string. When characters are
 encountered that are outside of the RFC3986 range they
 are automatically percent\-encoded
6. [**](../../../../akka/http/scaladsl/model/Uri$.html#apply(input:akka.parboiled2.ParserInput,charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def apply(input: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput), charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset), mode: [ParsingMode](Uri$$ParsingMode.html)): [Uri](Uri.html)Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.

Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
If the given string is not a valid URI the method throws an `IllegalUriException`.

modeif `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
7. [**](../../../../akka/http/scaladsl/model/Uri$.html#apply(input:akka.parboiled2.ParserInput,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def apply(input: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput), mode: [ParsingMode](Uri$$ParsingMode.html)): [Uri](Uri.html)Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.

Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
If the given string is not a valid URI the method throws an `IllegalUriException`.

modeif `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
8. [**](../../../../akka/http/scaladsl/model/Uri$.html#apply(input:akka.parboiled2.ParserInput):akka.http.scaladsl.model.Uri "Permalink")  def apply(input: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput)): [Uri](Uri.html)Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.

Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
Accepts unencoded visible 7\-bit ASCII characters in addition to the rfc.
If the given string is not a valid URI the method throws an `IllegalUriException`.
9. [**](../../../../akka/http/scaladsl/model/Uri$.html#apply(input:String):akka.http.scaladsl.model.Uri "Permalink") implicit  def apply(input: String): [Uri](Uri.html)Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.

Parses a valid URI string into a normalized URI reference as defined
by http://tools.ietf.org/html/rfc3986\#section\-4\.1\.
Percent\-encoded octets are UTF\-8 decoded.
Accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
If the given string is not a valid URI the method throws an `IllegalUriException`.
10. [**](../../../../akka/http/scaladsl/model/Uri$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/model/Uri$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/model/Uri$.html#effectiveHttpRequestUri(scheme:String,host:akka.http.scaladsl.model.Uri.Host,port:Int,path:akka.http.scaladsl.model.Uri.Path,query:Option[String],fragment:Option[String],securedConnection:Boolean,hostHeaderHost:akka.http.scaladsl.model.Uri.Host,hostHeaderPort:Int,defaultAuthority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def effectiveHttpRequestUri(scheme: String, host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), path: [Path](Uri$$Path.html), query: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), hostHeaderHost: [Host](Uri$$Host.html), hostHeaderPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), defaultAuthority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$$Authority$.html)): [Uri](Uri.html)Converts a set of URI components to an "effective HTTP request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5\.
13. [**](../../../../akka/http/scaladsl/model/Uri$.html#effectiveRequestUri(scheme:String,host:akka.http.scaladsl.model.Uri.Host,port:Int,path:akka.http.scaladsl.model.Uri.Path,query:Option[String],fragment:Option[String],defaultScheme:String,hostHeaderHost:akka.http.scaladsl.model.Uri.Host,hostHeaderPort:Int,defaultAuthority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def effectiveRequestUri(scheme: String, host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), path: [Path](Uri$$Path.html), query: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], defaultScheme: String, hostHeaderHost: [Host](Uri$$Host.html), hostHeaderPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), defaultAuthority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$$Authority$.html)): [Uri](Uri.html)Converts a set of URI components to an "effective request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5\.
14. [**](../../../../akka/http/scaladsl/model/Uri$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/model/Uri$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/model/Uri$.html#from(scheme:String,userinfo:String,host:String,port:Int,path:String,queryString:Option[String],fragment:Option[String],mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def from(scheme: String \= "", userinfo: String \= "", host: String \= "", port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, path: String \= "", queryString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, mode: [ParsingMode](Uri$$ParsingMode.html) \= Uri.ParsingMode.Relaxed): [Uri](Uri.html)Creates a new Uri instance from the given components.

Creates a new Uri instance from the given components.
All components are verified and normalized.
If the given combination of components does not constitute a valid URI as defined by
http://tools.ietf.org/html/rfc3986 the method throws an `IllegalUriException`.
17. [**](../../../../akka/http/scaladsl/model/Uri$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/Uri$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/Uri$.html#httpScheme(securedConnection:Boolean):String "Permalink")  def httpScheme(securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
20. [**](../../../../akka/http/scaladsl/model/Uri$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/model/Uri$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/Uri$.html#normalize(uri:akka.parboiled2.ParserInput,charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):String "Permalink")  def normalize(uri: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput), charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html), mode: [ParsingMode](Uri$$ParsingMode.html) \= Uri.ParsingMode.Relaxed): StringNormalizes the given URI string by performing the following normalizations:

Normalizes the given URI string by performing the following normalizations:

	- the `scheme` and `host` components are converted to lowercase
	- a potentially existing `port` component is removed if it matches one of the defined default ports for the scheme
	- percent\-encoded octets are decoded if allowed, otherwise they are converted to uppercase hex notation
	- `.` and `..` path segments are resolved as far as possibleIf the given string is not a valid URI the method throws an `IllegalUriException`.

modeif `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
23. [**](../../../../akka/http/scaladsl/model/Uri$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/Uri$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/Uri$.html#parseAbsolute(input:akka.parboiled2.ParserInput,charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def parseAbsolute(input: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput), charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html), mode: [ParsingMode](Uri$$ParsingMode.html) \= Uri.ParsingMode.Relaxed): [Uri](Uri.html)Parses a string into a normalized absolute URI as defined by http://tools.ietf.org/html/rfc3986\#section\-4\.3\.

Parses a string into a normalized absolute URI as defined by http://tools.ietf.org/html/rfc3986\#section\-4\.3\.
Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
If the given string is not a valid URI the method throws an `IllegalUriException`.

modeif `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
26. [**](../../../../akka/http/scaladsl/model/Uri$.html#parseAndResolve(string:akka.parboiled2.ParserInput,base:akka.http.scaladsl.model.Uri,charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def parseAndResolve(string: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput), base: [Uri](Uri.html), charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html), mode: [ParsingMode](Uri$$ParsingMode.html) \= Uri.ParsingMode.Relaxed): [Uri](Uri.html)Parses a string into a normalized URI reference that is immediately resolved against the given base URI as
defined by http://tools.ietf.org/html/rfc3986\#section\-5\.2\.

Parses a string into a normalized URI reference that is immediately resolved against the given base URI as
defined by http://tools.ietf.org/html/rfc3986\#section\-5\.2\.
Note that the given base Uri must be absolute (i.e. define a scheme).
Percent\-encoded octets are decoded using the given charset (where specified by the RFC).
If the given string is not a valid URI the method throws an `IllegalUriException`.

modeif `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
27. [**](../../../../akka/http/scaladsl/model/Uri$.html#parseHttpRequestTarget(requestTarget:akka.parboiled2.ParserInput,charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def parseHttpRequestTarget(requestTarget: [ParserInput](https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html#akka.parboiled2.ParserInput), charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html), mode: [ParsingMode](Uri$$ParsingMode.html) \= Uri.ParsingMode.Relaxed): [Uri](Uri.html)Parses the given string into an HTTP request target URI as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.3\.

Parses the given string into an HTTP request target URI as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.3\.
If the given string is not a valid URI the method throws an `IllegalUriException`.

modeif `Relaxed`, accepts unencoded visible 7\-bit ASCII characters in addition to the RFC.
28. [**](../../../../akka/http/scaladsl/model/Uri$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/http/scaladsl/model/Uri$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../akka/http/scaladsl/model/Uri$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/model/Uri$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/model/Uri$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/model/Uri$.html#websocketScheme(securedConnection:Boolean):String "Permalink")  def websocketScheme(securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
34. [**](../../../../akka/http/scaladsl/model/Uri$$Authority$.html "Permalink")  object [Authority](Uri$$Authority$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
35. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html "Permalink")  object [Empty](Uri$$Empty$.html) extends [Uri](Uri.html)
36. [**](../../../../akka/http/scaladsl/model/Uri$$Host$.html "Permalink")  object [Host](Uri$$Host$.html)
37. [**](../../../../akka/http/scaladsl/model/Uri$$IPv4Host$.html "Permalink")  object [IPv4Host](Uri$$IPv4Host$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
38. [**](../../../../akka/http/scaladsl/model/Uri$$IPv6Host$.html "Permalink")  object [IPv6Host](Uri$$IPv6Host$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
39. [**](../../../../akka/http/scaladsl/model/Uri$$ParsingMode$.html "Permalink")  object [ParsingMode](Uri$$ParsingMode$.html)
40. [**](../../../../akka/http/scaladsl/model/Uri$$Path$.html "Permalink")  object [Path](Uri$$Path$.html)
41. [**](../../../../akka/http/scaladsl/model/Uri$$Query$.html "Permalink")  object [Query](Uri$$Query$.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/parboiled2/ParserInput.html
- https://doc.akka.io/api/akka-http/current/akka/http/ccompat/QuerySeqOptimized.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Host.html
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

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$.html)*