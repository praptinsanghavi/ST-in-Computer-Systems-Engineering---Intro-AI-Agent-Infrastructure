---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Empty
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:19:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Empty$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Empty
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Empty

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Empty

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- [Authority](Uri$$Authority.html)
- Empty
- [Host](Uri$$Host.html)
- [IPv4Host](Uri$$IPv4Host.html)
- [IPv6Host](Uri$$IPv6Host.html)
- [NamedHost](Uri$$NamedHost.html)
- [NonEmptyHost](Uri$$NonEmptyHost.html)
- [ParsingMode](Uri$$ParsingMode.html)
- [Path](Uri$$Path.html)
- [Query](Uri$$Query.html)
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html)

# Empty[**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html "Permalink")

### 

#### object Empty extends [Uri](Uri.html)

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L209)Linear Supertypes[Uri](Uri.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Empty
2. Uri
3. Serializable
4. Product
5. Equals
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#authority:akka.http.scaladsl.model.Uri.Authority "Permalink")  val authority: [Authority](Uri$$Authority.html)Definition Classes[Uri](Uri.html)
6. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#copy(scheme:String,authority:akka.http.scaladsl.model.Uri.Authority,path:akka.http.scaladsl.model.Uri.Path,rawQueryString:Option[String],fragment:Option[String]):akka.http.scaladsl.model.Uri "Permalink")  def copy(scheme: String \= scheme, authority: [Authority](Uri$$Authority.html) \= authority, path: [Path](Uri$$Path.html) \= path, rawQueryString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= rawQueryString, fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= fragment): [Uri](Uri.html)Returns a copy of this Uri with the given components.

Returns a copy of this Uri with the given components.

If you want to use the copy constructor to update the 'rawQueryString', it is up to you to
make sure the query string does not contain invalid characters. For this reason we
recommend using Uri\#withRawQueryString() instead.

Definition Classes[Uri](Uri.html)
8. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#effectivePort:Int "Permalink")  def effectivePort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The effective port of this Uri given the currently set authority and scheme values.

The effective port of this Uri given the currently set authority and scheme values.
If the authority has an explicitly set port (i.e. a non\-zero port value) then this port
is the effective port. Otherwise the default port for the current scheme is returned.

Definition Classes[Uri](Uri.html)
9. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#fragment:Option[String] "Permalink")  val fragment: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition Classes[Uri](Uri.html)
11. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#isAbsolute:Boolean "Permalink")  def isAbsolute: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Uri](Uri.html)
13. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEmpty → [Uri](Uri.html)
14. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#isRelative:Boolean "Permalink")  def isRelative: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Uri](Uri.html)
16. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#path:akka.http.scaladsl.model.Uri.Path "Permalink")  val path: [Path](Uri$$Path.html)Definition Classes[Uri](Uri.html)
20. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#query(charset:java.nio.charset.Charset,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri.Query "Permalink")  def query(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html), mode: [ParsingMode](Uri$$ParsingMode.html) \= [Uri.ParsingMode.Relaxed](Uri$.html)): [Query](Uri$$Query.html)Parses the rawQueryString member into a Query instance.

Parses the rawQueryString member into a Query instance.

Definition Classes[Uri](Uri.html)
22. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#queryString(charset:java.nio.charset.Charset):Option[String] "Permalink")  def queryString(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset) \= [UTF8](../../../index.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Returns the query part of the Uri in its decoded form.

Returns the query part of the Uri in its decoded form.

Definition Classes[Uri](Uri.html)
23. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#rawQueryString:Option[String] "Permalink")  val rawQueryString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition Classes[Uri](Uri.html)
24. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#resolvedAgainst(base:akka.http.scaladsl.model.Uri):akka.http.scaladsl.model.Uri "Permalink")  def resolvedAgainst(base: [Uri](Uri.html)): [Uri](Uri.html)Returns a new absolute Uri that is the result of the resolution process defined by
http://tools.ietf.org/html/rfc3986\#section\-5\.2\.2
The given base Uri must be absolute.

Returns a new absolute Uri that is the result of the resolution process defined by
http://tools.ietf.org/html/rfc3986\#section\-5\.2\.2
The given base Uri must be absolute.

Definition Classes[Uri](Uri.html)
25. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#scheme:String "Permalink")  val scheme: StringDefinition Classes[Uri](Uri.html)
26. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#toEffectiveHttpRequestUri(hostHeaderHost:akka.http.scaladsl.model.Uri.Host,hostHeaderPort:Int,securedConnection:Boolean,defaultAuthority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def toEffectiveHttpRequestUri(hostHeaderHost: [Host](Uri$$Host.html), hostHeaderPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, defaultAuthority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$.html)): [Uri](Uri.html)Converts this URI to an "effective HTTP request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5

Converts this URI to an "effective HTTP request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5

Definition Classes[Uri](Uri.html)
28. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#toEffectiveRequestUri(hostHeaderHost:akka.http.scaladsl.model.Uri.Host,hostHeaderPort:Int,defaultScheme:String,defaultAuthority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def toEffectiveRequestUri(hostHeaderHost: [Host](Uri$$Host.html), hostHeaderPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), defaultScheme: String, defaultAuthority: [Authority](Uri$$Authority.html) \= [Authority.Empty](Uri$.html)): [Uri](Uri.html)Converts this URI to an "effective request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5

Converts this URI to an "effective request URI" as defined by
http://tools.ietf.org/html/rfc7230\#section\-5\.5

Definition Classes[Uri](Uri.html)
29. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#toHttpRequestTargetOriginForm:akka.http.scaladsl.model.Uri "Permalink")  def toHttpRequestTargetOriginForm: [Uri](Uri.html)Converts this URI into an HTTP request target "origin\-form" as defined by
https://tools.ietf.org/html/rfc7230\#section\-5\.3\.

Converts this URI into an HTTP request target "origin\-form" as defined by
https://tools.ietf.org/html/rfc7230\#section\-5\.3\.

Note that the resulting URI instance is not a valid RFC 3986 URI! (As it might
be a "relative" URI with a part component starting with a double slash.)

Definition Classes[Uri](Uri.html)
30. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#toRelative:akka.http.scaladsl.model.Uri "Permalink")  def toRelative: [Uri](Uri.html)Converts this URI into a relative URI by keeping the path, query and fragment, but dropping the scheme and authority.

Converts this URI into a relative URI by keeping the path, query and fragment, but dropping the scheme and authority.

Definition Classes[Uri](Uri.html)
31. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#toString():String "Permalink")  def toString(): StringDefinition Classes[Uri](Uri.html) → AnyRef → Any
32. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withAuthority(host:String,port:Int):akka.http.scaladsl.model.Uri "Permalink")  def withAuthority(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Uri](Uri.html)Returns a copy of this Uri with a Authority created using the given host and port.

Returns a copy of this Uri with a Authority created using the given host and port.

Definition Classes[Uri](Uri.html)
36. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withAuthority(host:akka.http.scaladsl.model.Uri.Host,port:Int,userinfo:String):akka.http.scaladsl.model.Uri "Permalink")  def withAuthority(host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), userinfo: String \= ""): [Uri](Uri.html)Returns a copy of this Uri with a Authority created using the given host, port and userinfo.

Returns a copy of this Uri with a Authority created using the given host, port and userinfo.

Definition Classes[Uri](Uri.html)
37. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withAuthority(authority:akka.http.scaladsl.model.Uri.Authority):akka.http.scaladsl.model.Uri "Permalink")  def withAuthority(authority: [Authority](Uri$$Authority.html)): [Uri](Uri.html)Returns a copy of this Uri with the given authority.

Returns a copy of this Uri with the given authority.

Definition Classes[Uri](Uri.html)
38. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withFragment(fragment:String):akka.http.scaladsl.model.Uri "Permalink")  def withFragment(fragment: String): [Uri](Uri.html)Returns a copy of this Uri with the given fragment.

Returns a copy of this Uri with the given fragment.

Definition Classes[Uri](Uri.html)
39. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withHost(host:String):akka.http.scaladsl.model.Uri "Permalink")  def withHost(host: String): [Uri](Uri.html)Returns a copy of this Uri with the given host.

Returns a copy of this Uri with the given host.

Definition Classes[Uri](Uri.html)
40. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withHost(host:akka.http.scaladsl.model.Uri.Host):akka.http.scaladsl.model.Uri "Permalink")  def withHost(host: [Host](Uri$$Host.html)): [Uri](Uri.html)Returns a copy of this Uri with the given host.

Returns a copy of this Uri with the given host.

Definition Classes[Uri](Uri.html)
41. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withPath(path:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri "Permalink")  def withPath(path: [Path](Uri$$Path.html)): [Uri](Uri.html)Returns a copy of this Uri with the given path.

Returns a copy of this Uri with the given path.

Definition Classes[Uri](Uri.html)
42. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withPort(port:Int):akka.http.scaladsl.model.Uri "Permalink")  def withPort(port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Uri](Uri.html)Returns a copy of this Uri with the given port.

Returns a copy of this Uri with the given port.

Definition Classes[Uri](Uri.html)
43. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withQuery(query:akka.http.scaladsl.model.Uri.Query):akka.http.scaladsl.model.Uri "Permalink")  def withQuery(query: [Query](Uri$$Query.html)): [Uri](Uri.html)Returns a copy of this Uri with the given query.

Returns a copy of this Uri with the given query.

Definition Classes[Uri](Uri.html)
44. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withRawQueryString(rawQueryString:String,mode:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.model.Uri "Permalink")  def withRawQueryString(rawQueryString: String, mode: [ParsingMode](Uri$$ParsingMode.html)): [Uri](Uri.html)Returns a copy of this Uri with the given query string.

Returns a copy of this Uri with the given query string.

Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
must be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
and depending on how the query string is parsed this might be relevant: for example, when interpreting
the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in the
key or value.

modedepending on the mode, characters outside of the range allowed by RFC3986 will
 either cause an `IllegalUriException` or be automatically percent\-encoded. Be aware that relying
 on automatic percent\-encoding is usually a programming error.

Definition Classes[Uri](Uri.html)
45. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withRawQueryString(rawQuery:String):akka.http.scaladsl.model.Uri "Permalink")  def withRawQueryString(rawQuery: String): [Uri](Uri.html)Returns a copy of this Uri with the given query string.

Returns a copy of this Uri with the given query string.

Characters that are not within the range described at https://tools.ietf.org/html/rfc3986\#section\-3\.4
should be percent\-encoded. Characters that are in that range may or may not be percent\-encoded,
and depending on how the query string is parsed this might be relevant: for example, when interpreting
the query string as 'key\=value' pairs you could use the percent\-encoded '\=' ('%22\) to include a '\=' in a
key or value.

When characters are encountered that are outside of the RFC3986 range they are automatically
percent\-encoded, but be aware that relying on this is usually a programming error.

Definition Classes[Uri](Uri.html)
46. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withScheme(scheme:String):akka.http.scaladsl.model.Uri "Permalink")  def withScheme(scheme: String): [Uri](Uri.html)Returns a copy of this Uri with the given scheme.

Returns a copy of this Uri with the given scheme. The `scheme` change of the Uri has the following
effect on the port value:

	- If the Uri has a non\-default port for the scheme before the change this port will remain unchanged.
	- If the Uri has the default port for the scheme before the change it will have the default port for
	 the **new** scheme after the change.Definition Classes[Uri](Uri.html)
47. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withUserInfo(userinfo:String):akka.http.scaladsl.model.Uri "Permalink")  def withUserInfo(userinfo: String): [Uri](Uri.html)Returns a copy of this Uri with the given userinfo.

Returns a copy of this Uri with the given userinfo.

Definition Classes[Uri](Uri.html)
48. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#withoutFragment:akka.http.scaladsl.model.Uri "Permalink")  def withoutFragment: [Uri](Uri.html)Drops the fragment from this URI

Drops the fragment from this URI

Definition Classes[Uri](Uri.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Empty$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Uri](Uri.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Empty$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv4Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv4Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv6Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv6Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NamedHost.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NonEmptyHost.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$ParsingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$ParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Empty$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Empty$.html)*