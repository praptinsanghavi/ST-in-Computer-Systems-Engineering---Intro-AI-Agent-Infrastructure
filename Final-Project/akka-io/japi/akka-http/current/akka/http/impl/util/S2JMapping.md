---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/S2JMapping.html
title: S2JMapping
---

# S2JMapping

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface S2JMapping\<S\>

- All Known Subinterfaces:
`[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S>`

All Known Implementing Classes:
`[CacheJavaMapping.Implicits$.CachingSettings$](../../caching/CacheJavaMapping.Implicits$.CachingSettings$.html "class in akka.http.caching")`, `[CacheJavaMapping.Implicits$.LfuCacheSettings$](../../caching/CacheJavaMapping.Implicits$.LfuCacheSettings$.html "class in akka.http.caching")`, `[JavaMapping.ByteRange$](JavaMapping.ByteRange$.html "class in akka.http.impl.util")`, `[JavaMapping.ByteString$](JavaMapping.ByteString$.html "class in akka.http.impl.util")`, `[JavaMapping.CacheDirective$](JavaMapping.CacheDirective$.html "class in akka.http.impl.util")`, `[JavaMapping.ClientConnectionSettings$](JavaMapping.ClientConnectionSettings$.html "class in akka.http.impl.util")`, `[JavaMapping.ClientTransport$](JavaMapping.ClientTransport$.html "class in akka.http.impl.util")`, `[JavaMapping.ConnectionContext$](JavaMapping.ConnectionContext$.html "class in akka.http.impl.util")`, `[JavaMapping.ConnectionPoolSettings$](JavaMapping.ConnectionPoolSettings$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentDispositionType$](JavaMapping.ContentDispositionType$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentRange$](JavaMapping.ContentRange$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentType$](JavaMapping.ContentType$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentTypeBinary$](JavaMapping.ContentTypeBinary$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentTypeNonBinary$](JavaMapping.ContentTypeNonBinary$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentTypeRange$](JavaMapping.ContentTypeRange$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentTypeWithCharset$](JavaMapping.ContentTypeWithCharset$.html "class in akka.http.impl.util")`, `[JavaMapping.ContentTypeWithFixedCharset$](JavaMapping.ContentTypeWithFixedCharset$.html "class in akka.http.impl.util")`, `[JavaMapping.CookieParsingMode$](JavaMapping.CookieParsingMode$.html "class in akka.http.impl.util")`, `[JavaMapping.DateTime$](JavaMapping.DateTime$.html "class in akka.http.impl.util")`, `[JavaMapping.EntityTag$](JavaMapping.EntityTag$.html "class in akka.http.impl.util")`, `[JavaMapping.EntityTagRange$](JavaMapping.EntityTagRange$.html "class in akka.http.impl.util")`, `[JavaMapping.ErrorLoggingVerbosity$](JavaMapping.ErrorLoggingVerbosity$.html "class in akka.http.impl.util")`, `[JavaMapping.Host$](JavaMapping.Host$.html "class in akka.http.impl.util")`, `[JavaMapping.HostHeader$](JavaMapping.HostHeader$.html "class in akka.http.impl.util")`, `[JavaMapping.Http2ServerSettingT$](JavaMapping.Http2ServerSettingT$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpChallenge$](JavaMapping.HttpChallenge$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpCharset$](JavaMapping.HttpCharset$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpCharsetRange$](JavaMapping.HttpCharsetRange$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpConnectionContext$](JavaMapping.HttpConnectionContext$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpCookie$](JavaMapping.HttpCookie$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpCookiePair$](JavaMapping.HttpCookiePair$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpCredentials$](JavaMapping.HttpCredentials$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpEncoding$](JavaMapping.HttpEncoding$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpEncodingRange$](JavaMapping.HttpEncodingRange$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpEntity$](JavaMapping.HttpEntity$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpHeader$](JavaMapping.HttpHeader$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpMethod$](JavaMapping.HttpMethod$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpOrigin$](JavaMapping.HttpOrigin$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpOriginRange$](JavaMapping.HttpOriginRange$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpProtocol$](JavaMapping.HttpProtocol$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpRequest$](JavaMapping.HttpRequest$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpResponse$](JavaMapping.HttpResponse$.html "class in akka.http.impl.util")`, `[JavaMapping.HttpsConnectionContext$](JavaMapping.HttpsConnectionContext$.html "class in akka.http.impl.util")`, `[JavaMapping.Identity](JavaMapping.Identity.html "class in akka.http.impl.util")`, `[JavaMapping.InetAddressIdentity$](JavaMapping.InetAddressIdentity$.html "class in akka.http.impl.util")`, `[JavaMapping.InetSocketAddress$](JavaMapping.InetSocketAddress$.html "class in akka.http.impl.util")`, `[JavaMapping.Inherited](JavaMapping.Inherited.html "class in akka.http.impl.util")`, `[JavaMapping.Language$](JavaMapping.Language$.html "class in akka.http.impl.util")`, `[JavaMapping.LanguageRange$](JavaMapping.LanguageRange$.html "class in akka.http.impl.util")`, `[JavaMapping.LinkParam$](JavaMapping.LinkParam$.html "class in akka.http.impl.util")`, `[JavaMapping.LinkValue$](JavaMapping.LinkValue$.html "class in akka.http.impl.util")`, `[JavaMapping.LongMapping$](JavaMapping.LongMapping$.html "class in akka.http.impl.util")`, `[JavaMapping.MediaRange$](JavaMapping.MediaRange$.html "class in akka.http.impl.util")`, `[JavaMapping.MediaType$](JavaMapping.MediaType$.html "class in akka.http.impl.util")`, `[JavaMapping.MediaTypeBinary$](JavaMapping.MediaTypeBinary$.html "class in akka.http.impl.util")`, `[JavaMapping.MediaTypeFixedCharset$](JavaMapping.MediaTypeFixedCharset$.html "class in akka.http.impl.util")`, `[JavaMapping.MediaTypeNonBinary$](JavaMapping.MediaTypeNonBinary$.html "class in akka.http.impl.util")`, `[JavaMapping.MediaTypeOpenCharset$](JavaMapping.MediaTypeOpenCharset$.html "class in akka.http.impl.util")`, `[JavaMapping.OutgoingConnection$](JavaMapping.OutgoingConnection$.html "class in akka.http.impl.util")`, `[JavaMapping.ParserSettings$](JavaMapping.ParserSettings$.html "class in akka.http.impl.util")`, `[JavaMapping.PreviewServerSettings$](JavaMapping.PreviewServerSettings$.html "class in akka.http.impl.util")`, `[JavaMapping.ProductVersion$](JavaMapping.ProductVersion$.html "class in akka.http.impl.util")`, `[JavaMapping.Query$](JavaMapping.Query$.html "class in akka.http.impl.util")`, `[JavaMapping.RangeUnit$](JavaMapping.RangeUnit$.html "class in akka.http.impl.util")`, `[JavaMapping.RemoteAddress$](JavaMapping.RemoteAddress$.html "class in akka.http.impl.util")`, `[JavaMapping.RequestEntity$](JavaMapping.RequestEntity$.html "class in akka.http.impl.util")`, `[JavaMapping.ResponseEntity$](JavaMapping.ResponseEntity$.html "class in akka.http.impl.util")`, `[JavaMapping.Server$](JavaMapping.Server$.html "class in akka.http.impl.util")`, `[JavaMapping.ServerSettings$](JavaMapping.ServerSettings$.html "class in akka.http.impl.util")`, `[JavaMapping.ServerSettingsT$](JavaMapping.ServerSettingsT$.html "class in akka.http.impl.util")`, `[JavaMapping.StatusCode$](JavaMapping.StatusCode$.html "class in akka.http.impl.util")`, `[JavaMapping.StringIdentity$](JavaMapping.StringIdentity$.html "class in akka.http.impl.util")`, `[JavaMapping.TransferEncoding$](JavaMapping.TransferEncoding$.html "class in akka.http.impl.util")`, `[JavaMapping.Uri$](JavaMapping.Uri$.html "class in akka.http.impl.util")`, `[JavaMapping.UriParsingMode$](JavaMapping.UriParsingMode$.html "class in akka.http.impl.util")`, `[JavaMapping.UserAgent$](JavaMapping.UserAgent$.html "class in akka.http.impl.util")`, `[JavaMapping.WebsocketSettings$](JavaMapping.WebsocketSettings$.html "class in akka.http.impl.util")`, `[JavaMapping.WsMessage$](JavaMapping.WsMessage$.html "class in akka.http.impl.util")`, `[RoutingJavaMapping.convertDirectoryListing$](../../javadsl/server/RoutingJavaMapping.convertDirectoryListing$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.convertDirectoryRenderer$](../../javadsl/server/RoutingJavaMapping.convertDirectoryRenderer$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.convertEntityStreamingSupport$](../../javadsl/server/RoutingJavaMapping.convertEntityStreamingSupport$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.convertLogEntry$](../../javadsl/server/RoutingJavaMapping.convertLogEntry$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.convertParserSettings$](../../javadsl/server/RoutingJavaMapping.convertParserSettings$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.convertRouteResult$](../../javadsl/server/RoutingJavaMapping.convertRouteResult$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.convertRouteSettings$](../../javadsl/server/RoutingJavaMapping.convertRouteSettings$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.Rejection$](../../javadsl/server/RoutingJavaMapping.Rejection$.html "class in akka.http.javadsl.server")`, `[RoutingJavaMapping.RequestContext$](../../javadsl/server/RoutingJavaMapping.RequestContext$.html "class in akka.http.javadsl.server")`

---

```
public interface S2JMapping<S>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[toJava](#toJava(S))​([S](S2JMapping.html "type parameter in S2JMapping") scalaObject)` |  |

- - ### Method Detail
	
	
	
		- #### toJava
		
		
		
		```
		java.lang.Object toJava​([S](S2JMapping.html "type parameter in S2JMapping") scalaObject)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/CacheJavaMapping.Implicits$.CachingSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/CacheJavaMapping.Implicits$.LfuCacheSettings$.html
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
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.InetAddressIdentity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.InetSocketAddress$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Inherited.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Language$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.LanguageRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.LinkParam$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/S2JMapping.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/S2JMapping.html)*