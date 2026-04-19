---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html
title: akka.http.javadsl.server.directives
---

# akka.http.javadsl.server.directives

## Content

# Package akka.http.javadsl.server.directives

- Interface Summary 
| Interface | Description |
| [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") | Implement this interface to provide a custom mapping from a file name to a \[\[akka.http.javadsl.model.ContentType]]. |
| --- | --- |
| [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") |  |
- Class Summary 
| Class | Description |
| [AttributeDirectives](AttributeDirectives.html "class in akka.http.javadsl.server.directives") |  |
| --- | --- |
| [BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [CachingDirectives](CachingDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [CachingDirectives$](CachingDirectives$.html "class in akka.http.javadsl.server.directives") |  |
| [CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [CorsDirectives](CorsDirectives.html "class in akka.http.javadsl.server.directives") | Directives for CORS, cross origin requests. |
| [DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [DirectoryListing](DirectoryListing.html "class in akka.http.javadsl.server.directives") |  |
| [ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [FileAndResourceDirectives](FileAndResourceDirectives.html "class in akka.http.javadsl.server.directives") | Directives that load files and resources. |
| [FileInfo](FileInfo.html "class in akka.http.javadsl.server.directives") | Additional metadata about the file being uploaded/that was uploaded using the [`FileUploadDirectives`](FileUploadDirectives.html "class in akka.http.javadsl.server.directives") |
| [FileUploadDirectives](FileUploadDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [FormFieldDirectives](FormFieldDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "class in akka.http.javadsl.server.directives") | EXPERIMENTAL API |
| [FramedEntityStreamingDirectives$](FramedEntityStreamingDirectives$.html "class in akka.http.javadsl.server.directives") |  |
| [FutureDirectives](FutureDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [HeaderDirectives](HeaderDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [HostDirectives](HostDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives") |  |
| [LogEntry$](LogEntry$.html "class in akka.http.javadsl.server.directives") |  |
| [MarshallingDirectives](MarshallingDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [MethodDirectives](MethodDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [MiscDirectives](MiscDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [ParameterDirectives](ParameterDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [PathDirectives](PathDirectives.html "class in akka.http.javadsl.server.directives") | Only path prefixes are matched by these methods, since any kind of chaining path extractions  in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java. |
| [RangeDirectives](RangeDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [RespondWithDirectives](RespondWithDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") | INTERNAL API |
| [RouteAdapter$](RouteAdapter$.html "class in akka.http.javadsl.server.directives") |  |
| [RouteDirectives](RouteDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [SchemeDirectives](SchemeDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [SecurityDirectives](SecurityDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [SecurityDirectives.ProvidedCredentials](SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives") | Represents HTTP Basic or OAuth2 authentication credentials supplied with a request. |
| [SecurityDirectives.ProvidedCredentials$](SecurityDirectives.ProvidedCredentials$.html "class in akka.http.javadsl.server.directives") |  |
| [SecurityDirectives$](SecurityDirectives$.html "class in akka.http.javadsl.server.directives") |  |
| [TimeoutDirectives](TimeoutDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [TlsDirectives](TlsDirectives.html "class in akka.http.javadsl.server.directives") |  |
| [WebSocketDirectives](WebSocketDirectives.html "class in akka.http.javadsl.server.directives") |  |
- Annotation Types Summary 
| Annotation Type | Description |
| [CorrespondsTo](CorrespondsTo.html "annotation in akka.http.javadsl.server.directives") | INTERNAL API – used for consistency specs   Used to hint at consistency spec implementations that a given JavaDSL method corresponds  to a method of given name in ScalaDSL. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CachingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CorrespondsTo.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/CorsDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FramedEntityStreamingDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FutureDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/HostDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/MethodDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/MiscDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/PathDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RangeDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RespondWithDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/SchemeDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives.ProvidedCredentials$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives.ProvidedCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/TimeoutDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/TlsDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/WebSocketDirectives.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html)*