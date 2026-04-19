---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:15:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/directives/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.directives

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.directives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package directivesDefinition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives$.html)
- [CodingDirectives](CodingDirectives.html)
- [ContentTypeResolver](ContentTypeResolver.html "Implement this interface to provide a custom mapping from a file name to a akka.http.javadsl.model.ContentType.")
- [CookieDirectives](CookieDirectives.html)
- [CorrespondsTo](CorrespondsTo.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [DirectoryRenderer](DirectoryRenderer.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html "Directives that load files and resources.")
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "EXPERIMENTAL API")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [ParameterDirectives](ParameterDirectives.html)
- [PathDirectives](PathDirectives.html "Only path prefixes are matched by these methods, since any kind of chaining path extractions in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.")
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteAdapter](RouteAdapter.html "INTERNAL API")
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html)
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
p[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[server](../index.html)

# directives[**](../../../../../akka/http/javadsl/server/directives/index.html "Permalink")

#### package directives

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/javadsl/server/directives/AttributeDirectives.html "Permalink") abstract  class [AttributeDirectives](AttributeDirectives.html) extends [HeaderDirectives](HeaderDirectives.html)
2. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html "Permalink") abstract  class [BasicDirectives](BasicDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/http/javadsl/server/directives/CacheConditionDirectives.html "Permalink") abstract  class [CacheConditionDirectives](CacheConditionDirectives.html) extends [BasicDirectives](BasicDirectives.html)
4. [**](../../../../../akka/http/javadsl/server/directives/CodingDirectives.html "Permalink") abstract  class [CodingDirectives](CodingDirectives.html) extends [CacheConditionDirectives](CacheConditionDirectives.html)
5. [**](../../../../../akka/http/javadsl/server/directives/ContentTypeResolver.html "Permalink")  trait [ContentTypeResolver](ContentTypeResolver.html "Implement this interface to provide a custom mapping from a file name to a akka.http.javadsl.model.ContentType.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implement this interface to provide a custom mapping from a file name to a [akka.http.javadsl.model.ContentType](../../model/ContentType.html).

Implement this interface to provide a custom mapping from a file name to a [akka.http.javadsl.model.ContentType](../../model/ContentType.html).

Annotations@FunctionalInterface()
6. [**](../../../../../akka/http/javadsl/server/directives/CookieDirectives.html "Permalink") abstract  class [CookieDirectives](CookieDirectives.html) extends [CodingDirectives](CodingDirectives.html)
7. [**](../../../../../akka/http/javadsl/server/directives/CorrespondsTo.html "Permalink")  trait [CorrespondsTo](CorrespondsTo.html) extends [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)Annotations@Target() @Retention() @InternalApi()
8. [**](../../../../../akka/http/javadsl/server/directives/CorsDirectives.html "Permalink") abstract  class [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.") extends [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html)Directives for CORS, cross origin requests.

Directives for CORS, cross origin requests.

For an overview on how CORS works, see the MDN web docs page on CORS: https://developer.mozilla.org/en\-US/docs/Web/HTTP/CORS
CORS is part of the WHATWG Fetch "Living Standard" https://fetch.spec.whatwg.org/\#http\-cors\-protocol

This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.
9. [**](../../../../../akka/http/javadsl/server/directives/DebuggingDirectives.html "Permalink") abstract  class [DebuggingDirectives](DebuggingDirectives.html) extends [CookieDirectives](CookieDirectives.html)
10. [**](../../../../../akka/http/javadsl/server/directives/DirectoryListing.html "Permalink") abstract  class [DirectoryListing](DirectoryListing.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
11. [**](../../../../../akka/http/javadsl/server/directives/DirectoryRenderer.html "Permalink")  trait [DirectoryRenderer](DirectoryRenderer.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../../../akka/http/javadsl/server/directives/ExecutionDirectives.html "Permalink") abstract  class [ExecutionDirectives](ExecutionDirectives.html) extends [DebuggingDirectives](DebuggingDirectives.html)
13. [**](../../../../../akka/http/javadsl/server/directives/FileAndResourceDirectives.html "Permalink") abstract  class [FileAndResourceDirectives](FileAndResourceDirectives.html "Directives that load files and resources.") extends [ExecutionDirectives](ExecutionDirectives.html)Directives that load files and resources.

Directives that load files and resources.

For the directives in this class, the "default classloader" is defined as the classloader that has loaded
the akka.actor.ActorSystem class.
14. [**](../../../../../akka/http/javadsl/server/directives/FileInfo.html "Permalink") abstract  class [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Additional metadata about the file being uploaded/that was uploaded using the [FileUploadDirectives](FileUploadDirectives.html)
15. [**](../../../../../akka/http/javadsl/server/directives/FileUploadDirectives.html "Permalink") abstract  class [FileUploadDirectives](FileUploadDirectives.html) extends [FileAndResourceDirectives](FileAndResourceDirectives.html)
16. [**](../../../../../akka/http/javadsl/server/directives/FormFieldDirectives.html "Permalink") abstract  class [FormFieldDirectives](FormFieldDirectives.html) extends [FileUploadDirectives](FileUploadDirectives.html)
17. [**](../../../../../akka/http/javadsl/server/directives/FramedEntityStreamingDirectives.html "Permalink") abstract  class [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "EXPERIMENTAL API") extends [TimeoutDirectives](TimeoutDirectives.html)EXPERIMENTAL API
18. [**](../../../../../akka/http/javadsl/server/directives/FutureDirectives.html "Permalink") abstract  class [FutureDirectives](FutureDirectives.html) extends [FormFieldDirectives](FormFieldDirectives.html)
19. [**](../../../../../akka/http/javadsl/server/directives/HeaderDirectives.html "Permalink") abstract  class [HeaderDirectives](HeaderDirectives.html) extends [FutureDirectives](FutureDirectives.html)
20. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html "Permalink") abstract  class [HostDirectives](HostDirectives.html) extends [AttributeDirectives](AttributeDirectives.html)
21. [**](../../../../../akka/http/javadsl/server/directives/LogEntry.html "Permalink") abstract  class [LogEntry](LogEntry.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
22. [**](../../../../../akka/http/javadsl/server/directives/MarshallingDirectives.html "Permalink") abstract  class [MarshallingDirectives](MarshallingDirectives.html) extends [HostDirectives](HostDirectives.html)
23. [**](../../../../../akka/http/javadsl/server/directives/MethodDirectives.html "Permalink") abstract  class [MethodDirectives](MethodDirectives.html) extends [MarshallingDirectives](MarshallingDirectives.html)
24. [**](../../../../../akka/http/javadsl/server/directives/MiscDirectives.html "Permalink") abstract  class [MiscDirectives](MiscDirectives.html) extends [MethodDirectives](MethodDirectives.html)
25. [**](../../../../../akka/http/javadsl/server/directives/ParameterDirectives.html "Permalink") abstract  class [ParameterDirectives](ParameterDirectives.html) extends [MiscDirectives](MiscDirectives.html)
26. [**](../../../../../akka/http/javadsl/server/directives/PathDirectives.html "Permalink") abstract  class [PathDirectives](PathDirectives.html "Only path prefixes are matched by these methods, since any kind of chaining path extractions in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.") extends [ParameterDirectives](ParameterDirectives.html)Only path prefixes are matched by these methods, since any kind of chaining path extractions
in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.

Only path prefixes are matched by these methods, since any kind of chaining path extractions
in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.

Just nest path() directives with the required types, ending in pathEnd() if you want to fail
further paths.
27. [**](../../../../../akka/http/javadsl/server/directives/RangeDirectives.html "Permalink") abstract  class [RangeDirectives](RangeDirectives.html) extends [PathDirectives](PathDirectives.html)
28. [**](../../../../../akka/http/javadsl/server/directives/RespondWithDirectives.html "Permalink") abstract  class [RespondWithDirectives](RespondWithDirectives.html) extends [RangeDirectives](RangeDirectives.html)
29. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html "Permalink") final  class [RouteAdapter](RouteAdapter.html "INTERNAL API") extends [Route](../Route.html)INTERNAL API

INTERNAL API

Annotations@InternalApi()
30. [**](../../../../../akka/http/javadsl/server/directives/RouteDirectives.html "Permalink") abstract  class [RouteDirectives](RouteDirectives.html) extends [RespondWithDirectives](RespondWithDirectives.html)
31. [**](../../../../../akka/http/javadsl/server/directives/SchemeDirectives.html "Permalink") abstract  class [SchemeDirectives](SchemeDirectives.html) extends [RouteDirectives](RouteDirectives.html)
32. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives.html "Permalink") abstract  class [SecurityDirectives](SecurityDirectives.html) extends [SchemeDirectives](SchemeDirectives.html)
33. [**](../../../../../akka/http/javadsl/server/directives/TimeoutDirectives.html "Permalink") abstract  class [TimeoutDirectives](TimeoutDirectives.html) extends [WebSocketDirectives](WebSocketDirectives.html)
34. [**](../../../../../akka/http/javadsl/server/directives/TlsDirectives.html "Permalink") abstract  class [TlsDirectives](TlsDirectives.html) extends [CorsDirectives](CorsDirectives.html)
35. [**](../../../../../akka/http/javadsl/server/directives/WebSocketDirectives.html "Permalink") abstract  class [WebSocketDirectives](WebSocketDirectives.html) extends [SecurityDirectives](SecurityDirectives.html)
### Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/CachingDirectives$.html "Permalink")  object [CachingDirectives](CachingDirectives$.html)Annotations@ApiMayChange()
2. [**](../../../../../akka/http/javadsl/server/directives/FramedEntityStreamingDirectives$.html "Permalink")  object [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives$.html) extends [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html)
3. [**](../../../../../akka/http/javadsl/server/directives/LogEntry$.html "Permalink")  object [LogEntry](LogEntry$.html)
4. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter$.html "Permalink")  object [RouteAdapter](RouteAdapter$.html)
5. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$.html "Permalink")  object [SecurityDirectives](SecurityDirectives$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CorrespondsTo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FramedEntityStreamingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FutureDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/HostDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/MethodDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/MiscDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/PathDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RangeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RespondWithDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SchemeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/TimeoutDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/TlsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/WebSocketDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/index.html)*