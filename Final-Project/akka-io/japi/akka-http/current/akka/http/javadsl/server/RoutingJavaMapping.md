---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RoutingJavaMapping.RequestContext$.html
title: RoutingJavaMapping.RequestContext$
---

# RoutingJavaMapping.RequestContext$

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RoutingJavaMapping.RequestContext$

- java.lang.Object
- - akka.http.javadsl.server.RoutingJavaMapping.RequestContext$

- All Implemented Interfaces:
`[J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<[RequestContext](RequestContext.html "class in akka.http.javadsl.server")>`, `[JavaMapping](../../impl/util/JavaMapping.html "interface in akka.http.impl.util")<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server")>`, `[S2JMapping](../../impl/util/S2JMapping.html "interface in akka.http.impl.util")<[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server")>`

Enclosing class:
[RoutingJavaMapping](RoutingJavaMapping.html "class in akka.http.javadsl.server")

---

```
public static class RoutingJavaMapping.RequestContext$
extends java.lang.Object
implements [JavaMapping](../../impl/util/JavaMapping.html "interface in akka.http.impl.util")<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server")>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.util.[JavaMapping](../../impl/util/JavaMapping.html "interface in akka.http.impl.util")
		
		
		`[JavaMapping.AsJava](../../impl/util/JavaMapping.AsJava.html "interface in akka.http.impl.util")<[J](../../impl/util/JavaMapping.AsJava.html "type parameter in JavaMapping.AsJava")>, [JavaMapping.AsScala](../../impl/util/JavaMapping.AsScala.html "interface in akka.http.impl.util")<[S](../../impl/util/JavaMapping.AsScala.html "type parameter in JavaMapping.AsScala")>, [JavaMapping.ByteRange$](../../impl/util/JavaMapping.ByteRange$.html "class in akka.http.impl.util"), [JavaMapping.ByteString$](../../impl/util/JavaMapping.ByteString$.html "class in akka.http.impl.util"), [JavaMapping.CacheDirective$](../../impl/util/JavaMapping.CacheDirective$.html "class in akka.http.impl.util"), [JavaMapping.ClientConnectionSettings$](../../impl/util/JavaMapping.ClientConnectionSettings$.html "class in akka.http.impl.util"), [JavaMapping.ClientTransport$](../../impl/util/JavaMapping.ClientTransport$.html "class in akka.http.impl.util"), [JavaMapping.ConnectionContext$](../../impl/util/JavaMapping.ConnectionContext$.html "class in akka.http.impl.util"), [JavaMapping.ConnectionPoolSettings$](../../impl/util/JavaMapping.ConnectionPoolSettings$.html "class in akka.http.impl.util"), [JavaMapping.ContentDispositionType$](../../impl/util/JavaMapping.ContentDispositionType$.html "class in akka.http.impl.util"), [JavaMapping.ContentRange$](../../impl/util/JavaMapping.ContentRange$.html "class in akka.http.impl.util"), [JavaMapping.ContentType$](../../impl/util/JavaMapping.ContentType$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeBinary$](../../impl/util/JavaMapping.ContentTypeBinary$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeNonBinary$](../../impl/util/JavaMapping.ContentTypeNonBinary$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeRange$](../../impl/util/JavaMapping.ContentTypeRange$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeWithCharset$](../../impl/util/JavaMapping.ContentTypeWithCharset$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeWithFixedCharset$](../../impl/util/JavaMapping.ContentTypeWithFixedCharset$.html "class in akka.http.impl.util"), [JavaMapping.CookieParsingMode$](../../impl/util/JavaMapping.CookieParsingMode$.html "class in akka.http.impl.util"), [JavaMapping.DateTime$](../../impl/util/JavaMapping.DateTime$.html "class in akka.http.impl.util"), [JavaMapping.EntityTag$](../../impl/util/JavaMapping.EntityTag$.html "class in akka.http.impl.util"), [JavaMapping.EntityTagRange$](../../impl/util/JavaMapping.EntityTagRange$.html "class in akka.http.impl.util"), [JavaMapping.ErrorLoggingVerbosity$](../../impl/util/JavaMapping.ErrorLoggingVerbosity$.html "class in akka.http.impl.util"), [JavaMapping.Host$](../../impl/util/JavaMapping.Host$.html "class in akka.http.impl.util"), [JavaMapping.HostHeader$](../../impl/util/JavaMapping.HostHeader$.html "class in akka.http.impl.util"), [JavaMapping.Http2ServerSettingT$](../../impl/util/JavaMapping.Http2ServerSettingT$.html "class in akka.http.impl.util"), [JavaMapping.HttpChallenge$](../../impl/util/JavaMapping.HttpChallenge$.html "class in akka.http.impl.util"), [JavaMapping.HttpCharset$](../../impl/util/JavaMapping.HttpCharset$.html "class in akka.http.impl.util"), [JavaMapping.HttpCharsetRange$](../../impl/util/JavaMapping.HttpCharsetRange$.html "class in akka.http.impl.util"), [JavaMapping.HttpConnectionContext$](../../impl/util/JavaMapping.HttpConnectionContext$.html "class in akka.http.impl.util"), [JavaMapping.HttpCookie$](../../impl/util/JavaMapping.HttpCookie$.html "class in akka.http.impl.util"), [JavaMapping.HttpCookiePair$](../../impl/util/JavaMapping.HttpCookiePair$.html "class in akka.http.impl.util"), [JavaMapping.HttpCredentials$](../../impl/util/JavaMapping.HttpCredentials$.html "class in akka.http.impl.util"), [JavaMapping.HttpEncoding$](../../impl/util/JavaMapping.HttpEncoding$.html "class in akka.http.impl.util"), [JavaMapping.HttpEncodingRange$](../../impl/util/JavaMapping.HttpEncodingRange$.html "class in akka.http.impl.util"), [JavaMapping.HttpEntity$](../../impl/util/JavaMapping.HttpEntity$.html "class in akka.http.impl.util"), [JavaMapping.HttpHeader$](../../impl/util/JavaMapping.HttpHeader$.html "class in akka.http.impl.util"), [JavaMapping.HttpMethod$](../../impl/util/JavaMapping.HttpMethod$.html "class in akka.http.impl.util"), [JavaMapping.HttpOrigin$](../../impl/util/JavaMapping.HttpOrigin$.html "class in akka.http.impl.util"), [JavaMapping.HttpOriginRange$](../../impl/util/JavaMapping.HttpOriginRange$.html "class in akka.http.impl.util"), [JavaMapping.HttpProtocol$](../../impl/util/JavaMapping.HttpProtocol$.html "class in akka.http.impl.util"), [JavaMapping.HttpRequest$](../../impl/util/JavaMapping.HttpRequest$.html "class in akka.http.impl.util"), [JavaMapping.HttpResponse$](../../impl/util/JavaMapping.HttpResponse$.html "class in akka.http.impl.util"), [JavaMapping.HttpsConnectionContext$](../../impl/util/JavaMapping.HttpsConnectionContext$.html "class in akka.http.impl.util"), [JavaMapping.Identity](../../impl/util/JavaMapping.Identity.html "class in akka.http.impl.util")<[T](../../impl/util/JavaMapping.Identity.html "type parameter in JavaMapping.Identity")>, [JavaMapping.Implicits$](../../impl/util/JavaMapping.Implicits$.html "class in akka.http.impl.util"), [JavaMapping.InetAddressIdentity$](../../impl/util/JavaMapping.InetAddressIdentity$.html "class in akka.http.impl.util"), [JavaMapping.InetSocketAddress$](../../impl/util/JavaMapping.InetSocketAddress$.html "class in akka.http.impl.util"), [JavaMapping.Inherited](../../impl/util/JavaMapping.Inherited.html "class in akka.http.impl.util")<[J](../../impl/util/JavaMapping.Inherited.html "type parameter in JavaMapping.Inherited"),​[S](../../impl/util/JavaMapping.Inherited.html "type parameter in JavaMapping.Inherited") extends [J](../../impl/util/JavaMapping.Inherited.html "type parameter in JavaMapping.Inherited")>, [JavaMapping.Language$](../../impl/util/JavaMapping.Language$.html "class in akka.http.impl.util"), [JavaMapping.LanguageRange$](../../impl/util/JavaMapping.LanguageRange$.html "class in akka.http.impl.util"), [JavaMapping.LinkParam$](../../impl/util/JavaMapping.LinkParam$.html "class in akka.http.impl.util"), [JavaMapping.LinkValue$](../../impl/util/JavaMapping.LinkValue$.html "class in akka.http.impl.util"), [JavaMapping.LongMapping$](../../impl/util/JavaMapping.LongMapping$.html "class in akka.http.impl.util"), [JavaMapping.MediaRange$](../../impl/util/JavaMapping.MediaRange$.html "class in akka.http.impl.util"), [JavaMapping.MediaType$](../../impl/util/JavaMapping.MediaType$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeBinary$](../../impl/util/JavaMapping.MediaTypeBinary$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeFixedCharset$](../../impl/util/JavaMapping.MediaTypeFixedCharset$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeNonBinary$](../../impl/util/JavaMapping.MediaTypeNonBinary$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeOpenCharset$](../../impl/util/JavaMapping.MediaTypeOpenCharset$.html "class in akka.http.impl.util"), [JavaMapping.OutgoingConnection$](../../impl/util/JavaMapping.OutgoingConnection$.html "class in akka.http.impl.util"), [JavaMapping.ParserSettings$](../../impl/util/JavaMapping.ParserSettings$.html "class in akka.http.impl.util"), [JavaMapping.PreviewServerSettings$](../../impl/util/JavaMapping.PreviewServerSettings$.html "class in akka.http.impl.util"), [JavaMapping.ProductVersion$](../../impl/util/JavaMapping.ProductVersion$.html "class in akka.http.impl.util"), [JavaMapping.Query$](../../impl/util/JavaMapping.Query$.html "class in akka.http.impl.util"), [JavaMapping.RangeUnit$](../../impl/util/JavaMapping.RangeUnit$.html "class in akka.http.impl.util"), [JavaMapping.RemoteAddress$](../../impl/util/JavaMapping.RemoteAddress$.html "class in akka.http.impl.util"), [JavaMapping.RequestEntity$](../../impl/util/JavaMapping.RequestEntity$.html "class in akka.http.impl.util"), [JavaMapping.ResponseEntity$](../../impl/util/JavaMapping.ResponseEntity$.html "class in akka.http.impl.util"), [JavaMapping.Server$](../../impl/util/JavaMapping.Server$.html "class in akka.http.impl.util"), [JavaMapping.ServerSettings$](../../impl/util/JavaMapping.ServerSettings$.html "class in akka.http.impl.util"), [JavaMapping.ServerSettingsT$](../../impl/util/JavaMapping.ServerSettingsT$.html "class in akka.http.impl.util"), [JavaMapping.StatusCode$](../../impl/util/JavaMapping.StatusCode$.html "class in akka.http.impl.util"), [JavaMapping.StringIdentity$](../../impl/util/JavaMapping.StringIdentity$.html "class in akka.http.impl.util"), [JavaMapping.TransferEncoding$](../../impl/util/JavaMapping.TransferEncoding$.html "class in akka.http.impl.util"), [JavaMapping.Uri$](../../impl/util/JavaMapping.Uri$.html "class in akka.http.impl.util"), [JavaMapping.UriParsingMode$](../../impl/util/JavaMapping.UriParsingMode$.html "class in akka.http.impl.util"), [JavaMapping.UserAgent$](../../impl/util/JavaMapping.UserAgent$.html "class in akka.http.impl.util"), [JavaMapping.WebsocketSettings$](../../impl/util/JavaMapping.WebsocketSettings$.html "class in akka.http.impl.util"), [JavaMapping.WsMessage$](../../impl/util/JavaMapping.WsMessage$.html "class in akka.http.impl.util")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RoutingJavaMapping.RequestContext$](RoutingJavaMapping.RequestContext$.html "class in akka.http.javadsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[toJava](#toJava(akka.http.scaladsl.server.RequestContext))​([RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server") scalaObject)` |  |
	| `[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server")` | `[toScala](#toScala(akka.http.javadsl.server.RequestContext))​([RequestContext](RequestContext.html "class in akka.http.javadsl.server") javaObject)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RoutingJavaMapping.RequestContext$](RoutingJavaMapping.RequestContext$.html "class in akka.http.javadsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestContext$
		
		
		
		```
		public RequestContext$()
		```

	- ### Method Detail
	
	
	
		- #### toScala
		
		
		
		```
		public [RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server") toScala​([RequestContext](RequestContext.html "class in akka.http.javadsl.server") javaObject)
		```
		
		
		Specified by:
		`[toScala](../../impl/util/J2SMapping.html#toScala(J))` in interface `[J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<[RequestContext](RequestContext.html "class in akka.http.javadsl.server")>`
		- #### toJava
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") toJava​([RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server") scalaObject)
		```
		
		
		Specified by:
		`[toJava](../../impl/util/S2JMapping.html#toJava(S))` in interface `[S2JMapping](../../impl/util/S2JMapping.html "interface in akka.http.impl.util")<[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/J2SMapping.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.AsJava.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.AsScala.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ByteRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ByteString$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.CacheDirective$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ClientConnectionSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ClientTransport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ConnectionPoolSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentDispositionType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentTypeBinary$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentTypeNonBinary$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentTypeRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentTypeWithCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ContentTypeWithFixedCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.CookieParsingMode$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.DateTime$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.EntityTag$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.EntityTagRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.ErrorLoggingVerbosity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Host$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HostHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Http2ServerSettingT$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpChallenge$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpCharsetRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpCookie$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpCookiePair$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpCredentials$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpEncoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpEncodingRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpEntity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpMethod$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpOrigin$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpOriginRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpProtocol$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpRequest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpResponse$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.HttpsConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Identity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Implicits$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.InetAddressIdentity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.InetSocketAddress$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Inherited.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Language$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RoutingJavaMapping.RequestContext$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RoutingJavaMapping.RequestContext$.html)*