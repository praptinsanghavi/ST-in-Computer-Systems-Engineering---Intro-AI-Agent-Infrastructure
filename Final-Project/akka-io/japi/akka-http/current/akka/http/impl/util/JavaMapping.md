---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:43:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.WsMessage$.html
title: JavaMapping.WsMessage$
---

# JavaMapping.WsMessage$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class JavaMapping.WsMessage$

- java.lang.Object
- - akka.http.impl.util.JavaMapping.WsMessage$

- All Implemented Interfaces:
`[J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<[Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>`, `[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<[Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>`, `[S2JMapping](S2JMapping.html "interface in akka.http.impl.util")<[Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>`

Enclosing interface:
[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")\<[\_J](JavaMapping.html "type parameter in JavaMapping"),​[\_S](JavaMapping.html "type parameter in JavaMapping")\>

---

```
public static class JavaMapping.WsMessage$
extends java.lang.Object
implements [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<[Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.util.[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")
		
		
		`[JavaMapping.AsJava](JavaMapping.AsJava.html "interface in akka.http.impl.util")<[J](JavaMapping.AsJava.html "type parameter in JavaMapping.AsJava")>, [JavaMapping.AsScala](JavaMapping.AsScala.html "interface in akka.http.impl.util")<[S](JavaMapping.AsScala.html "type parameter in JavaMapping.AsScala")>, [JavaMapping.ByteRange$](JavaMapping.ByteRange$.html "class in akka.http.impl.util"), [JavaMapping.ByteString$](JavaMapping.ByteString$.html "class in akka.http.impl.util"), [JavaMapping.CacheDirective$](JavaMapping.CacheDirective$.html "class in akka.http.impl.util"), [JavaMapping.ClientConnectionSettings$](JavaMapping.ClientConnectionSettings$.html "class in akka.http.impl.util"), [JavaMapping.ClientTransport$](JavaMapping.ClientTransport$.html "class in akka.http.impl.util"), [JavaMapping.ConnectionContext$](JavaMapping.ConnectionContext$.html "class in akka.http.impl.util"), [JavaMapping.ConnectionPoolSettings$](JavaMapping.ConnectionPoolSettings$.html "class in akka.http.impl.util"), [JavaMapping.ContentDispositionType$](JavaMapping.ContentDispositionType$.html "class in akka.http.impl.util"), [JavaMapping.ContentRange$](JavaMapping.ContentRange$.html "class in akka.http.impl.util"), [JavaMapping.ContentType$](JavaMapping.ContentType$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeBinary$](JavaMapping.ContentTypeBinary$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeNonBinary$](JavaMapping.ContentTypeNonBinary$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeRange$](JavaMapping.ContentTypeRange$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeWithCharset$](JavaMapping.ContentTypeWithCharset$.html "class in akka.http.impl.util"), [JavaMapping.ContentTypeWithFixedCharset$](JavaMapping.ContentTypeWithFixedCharset$.html "class in akka.http.impl.util"), [JavaMapping.CookieParsingMode$](JavaMapping.CookieParsingMode$.html "class in akka.http.impl.util"), [JavaMapping.DateTime$](JavaMapping.DateTime$.html "class in akka.http.impl.util"), [JavaMapping.EntityTag$](JavaMapping.EntityTag$.html "class in akka.http.impl.util"), [JavaMapping.EntityTagRange$](JavaMapping.EntityTagRange$.html "class in akka.http.impl.util"), [JavaMapping.ErrorLoggingVerbosity$](JavaMapping.ErrorLoggingVerbosity$.html "class in akka.http.impl.util"), [JavaMapping.Host$](JavaMapping.Host$.html "class in akka.http.impl.util"), [JavaMapping.HostHeader$](JavaMapping.HostHeader$.html "class in akka.http.impl.util"), [JavaMapping.Http2ServerSettingT$](JavaMapping.Http2ServerSettingT$.html "class in akka.http.impl.util"), [JavaMapping.HttpChallenge$](JavaMapping.HttpChallenge$.html "class in akka.http.impl.util"), [JavaMapping.HttpCharset$](JavaMapping.HttpCharset$.html "class in akka.http.impl.util"), [JavaMapping.HttpCharsetRange$](JavaMapping.HttpCharsetRange$.html "class in akka.http.impl.util"), [JavaMapping.HttpConnectionContext$](JavaMapping.HttpConnectionContext$.html "class in akka.http.impl.util"), [JavaMapping.HttpCookie$](JavaMapping.HttpCookie$.html "class in akka.http.impl.util"), [JavaMapping.HttpCookiePair$](JavaMapping.HttpCookiePair$.html "class in akka.http.impl.util"), [JavaMapping.HttpCredentials$](JavaMapping.HttpCredentials$.html "class in akka.http.impl.util"), [JavaMapping.HttpEncoding$](JavaMapping.HttpEncoding$.html "class in akka.http.impl.util"), [JavaMapping.HttpEncodingRange$](JavaMapping.HttpEncodingRange$.html "class in akka.http.impl.util"), [JavaMapping.HttpEntity$](JavaMapping.HttpEntity$.html "class in akka.http.impl.util"), [JavaMapping.HttpHeader$](JavaMapping.HttpHeader$.html "class in akka.http.impl.util"), [JavaMapping.HttpMethod$](JavaMapping.HttpMethod$.html "class in akka.http.impl.util"), [JavaMapping.HttpOrigin$](JavaMapping.HttpOrigin$.html "class in akka.http.impl.util"), [JavaMapping.HttpOriginRange$](JavaMapping.HttpOriginRange$.html "class in akka.http.impl.util"), [JavaMapping.HttpProtocol$](JavaMapping.HttpProtocol$.html "class in akka.http.impl.util"), [JavaMapping.HttpRequest$](JavaMapping.HttpRequest$.html "class in akka.http.impl.util"), [JavaMapping.HttpResponse$](JavaMapping.HttpResponse$.html "class in akka.http.impl.util"), [JavaMapping.HttpsConnectionContext$](JavaMapping.HttpsConnectionContext$.html "class in akka.http.impl.util"), [JavaMapping.Identity](JavaMapping.Identity.html "class in akka.http.impl.util")<[T](JavaMapping.Identity.html "type parameter in JavaMapping.Identity")>, [JavaMapping.Implicits$](JavaMapping.Implicits$.html "class in akka.http.impl.util"), [JavaMapping.InetAddressIdentity$](JavaMapping.InetAddressIdentity$.html "class in akka.http.impl.util"), [JavaMapping.InetSocketAddress$](JavaMapping.InetSocketAddress$.html "class in akka.http.impl.util"), [JavaMapping.Inherited](JavaMapping.Inherited.html "class in akka.http.impl.util")<[J](JavaMapping.Inherited.html "type parameter in JavaMapping.Inherited"),​[S](JavaMapping.Inherited.html "type parameter in JavaMapping.Inherited") extends [J](JavaMapping.Inherited.html "type parameter in JavaMapping.Inherited")>, [JavaMapping.Language$](JavaMapping.Language$.html "class in akka.http.impl.util"), [JavaMapping.LanguageRange$](JavaMapping.LanguageRange$.html "class in akka.http.impl.util"), [JavaMapping.LinkParam$](JavaMapping.LinkParam$.html "class in akka.http.impl.util"), [JavaMapping.LinkValue$](JavaMapping.LinkValue$.html "class in akka.http.impl.util"), [JavaMapping.LongMapping$](JavaMapping.LongMapping$.html "class in akka.http.impl.util"), [JavaMapping.MediaRange$](JavaMapping.MediaRange$.html "class in akka.http.impl.util"), [JavaMapping.MediaType$](JavaMapping.MediaType$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeBinary$](JavaMapping.MediaTypeBinary$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeFixedCharset$](JavaMapping.MediaTypeFixedCharset$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeNonBinary$](JavaMapping.MediaTypeNonBinary$.html "class in akka.http.impl.util"), [JavaMapping.MediaTypeOpenCharset$](JavaMapping.MediaTypeOpenCharset$.html "class in akka.http.impl.util"), [JavaMapping.OutgoingConnection$](JavaMapping.OutgoingConnection$.html "class in akka.http.impl.util"), [JavaMapping.ParserSettings$](JavaMapping.ParserSettings$.html "class in akka.http.impl.util"), [JavaMapping.PreviewServerSettings$](JavaMapping.PreviewServerSettings$.html "class in akka.http.impl.util"), [JavaMapping.ProductVersion$](JavaMapping.ProductVersion$.html "class in akka.http.impl.util"), [JavaMapping.Query$](JavaMapping.Query$.html "class in akka.http.impl.util"), [JavaMapping.RangeUnit$](JavaMapping.RangeUnit$.html "class in akka.http.impl.util"), [JavaMapping.RemoteAddress$](JavaMapping.RemoteAddress$.html "class in akka.http.impl.util"), [JavaMapping.RequestEntity$](JavaMapping.RequestEntity$.html "class in akka.http.impl.util"), [JavaMapping.ResponseEntity$](JavaMapping.ResponseEntity$.html "class in akka.http.impl.util"), [JavaMapping.Server$](JavaMapping.Server$.html "class in akka.http.impl.util"), [JavaMapping.ServerSettings$](JavaMapping.ServerSettings$.html "class in akka.http.impl.util"), [JavaMapping.ServerSettingsT$](JavaMapping.ServerSettingsT$.html "class in akka.http.impl.util"), [JavaMapping.StatusCode$](JavaMapping.StatusCode$.html "class in akka.http.impl.util"), [JavaMapping.StringIdentity$](JavaMapping.StringIdentity$.html "class in akka.http.impl.util"), [JavaMapping.TransferEncoding$](JavaMapping.TransferEncoding$.html "class in akka.http.impl.util"), [JavaMapping.Uri$](JavaMapping.Uri$.html "class in akka.http.impl.util"), [JavaMapping.UriParsingMode$](JavaMapping.UriParsingMode$.html "class in akka.http.impl.util"), [JavaMapping.UserAgent$](JavaMapping.UserAgent$.html "class in akka.http.impl.util"), [JavaMapping.WebsocketSettings$](JavaMapping.WebsocketSettings$.html "class in akka.http.impl.util"), [JavaMapping.WsMessage$](JavaMapping.WsMessage$.html "class in akka.http.impl.util")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JavaMapping.WsMessage$](JavaMapping.WsMessage$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WsMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")` | `[toJava](#toJava(akka.http.scaladsl.model.ws.Message))​([Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws") scalaObject)` |  |
	| `[Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")` | `[toScala](#toScala(akka.http.javadsl.model.ws.Message))​([Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws") javaObject)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JavaMapping.WsMessage$](JavaMapping.WsMessage$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WsMessage$
		
		
		
		```
		public WsMessage$()
		```

	- ### Method Detail
	
	
	
		- #### toScala
		
		
		
		```
		public [Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws") toScala​([Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws") javaObject)
		```
		
		
		Specified by:
		`[toScala](J2SMapping.html#toScala(J))` in interface `[J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<[Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>`
		- #### toJava
		
		
		
		```
		public [Message](../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws") toJava​([Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws") scalaObject)
		```
		
		
		Specified by:
		`[toJava](S2JMapping.html#toJava(S))` in interface `[S2JMapping](S2JMapping.html "interface in akka.http.impl.util")<[Message](../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>`

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
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.WsMessage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.WsMessage$.html)*