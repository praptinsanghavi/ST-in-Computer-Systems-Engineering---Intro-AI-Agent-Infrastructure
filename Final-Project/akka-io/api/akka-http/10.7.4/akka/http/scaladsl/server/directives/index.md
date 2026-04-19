---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:06:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package directivesDefinition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [AuthenticationDirective](AuthenticationDirective.html)
- [AuthenticationResult](AuthenticationResult$.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives.html)
- [CodingDirectives](CodingDirectives.html)
- [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html)
- [ContentTypeResolver](ContentTypeResolver.html)
- [CookieDirectives](CookieDirectives.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [Credentials](Credentials.html "Represents authentication credentials supplied with a request.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html)
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "Allows the MarshallingDirectives.entity directive to extract a akka.stream.scaladsl.Source of elements.")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HeaderMagnet](HeaderMagnet.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [LoggingMagnet](LoggingMagnet.html)
- [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [OnSuccessMagnet](OnSuccessMagnet.html)
- [ParameterDirectives](ParameterDirectives.html)
- [ParameterDirectivesInstances](ParameterDirectivesInstances.html)
- [PathDirectives](PathDirectives.html)
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html "Provides directives for securing an inner route using the standard Http authentication headers `WWW-Authenticate` and Authorization.")
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[server](../index.html)
p[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html)

# directives[**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")

#### package directives

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/AttributeDirectives.html "Permalink")  trait [AttributeDirectives](AttributeDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../../akka/http/scaladsl/server/directives/AuthenticationDirective.html "Permalink")  trait [AuthenticationDirective](AuthenticationDirective.html)\[T] extends [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]
3. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives.html "Permalink")  trait [BasicDirectives](BasicDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../../akka/http/scaladsl/server/directives/CacheConditionDirectives.html "Permalink")  trait [CacheConditionDirectives](CacheConditionDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../../akka/http/scaladsl/server/directives/CachingDirectives.html "Permalink")  trait [CachingDirectives](CachingDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@ApiMayChange()
6. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives.html "Permalink")  trait [CodingDirectives](CodingDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html "Permalink")  trait [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../../../../akka/http/scaladsl/server/directives/ContentTypeResolver.html "Permalink")  trait [ContentTypeResolver](ContentTypeResolver.html) extends [javadsl.server.directives.ContentTypeResolver](../../../javadsl/server/directives/ContentTypeResolver.html)
9. [**](../../../../../akka/http/scaladsl/server/directives/CookieDirectives.html "Permalink")  trait [CookieDirectives](CookieDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
10. [**](../../../../../akka/http/scaladsl/server/directives/CorsDirectives.html "Permalink")  trait [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Directives for CORS, cross origin requests.

Directives for CORS, cross origin requests.

For an overview on how CORS works, see the MDN web docs page on CORS: https://developer.mozilla.org/en\-US/docs/Web/HTTP/CORS
CORS is part of the WHATWG Fetch "Living Standard" https://fetch.spec.whatwg.org/\#http\-cors\-protocol

This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.
11. [**](../../../../../akka/http/scaladsl/server/directives/Credentials.html "Permalink") sealed  trait [Credentials](Credentials.html "Represents authentication credentials supplied with a request.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents authentication credentials supplied with a request.

Represents authentication credentials supplied with a request. Credentials can either be
[Credentials.Missing](Credentials$$Missing$.html) or can be [Credentials.Provided](Credentials$$Provided.html) in which case an identifier is
supplied and a function to check the known secret against the provided one in a secure fashion.
12. [**](../../../../../akka/http/scaladsl/server/directives/DebuggingDirectives.html "Permalink")  trait [DebuggingDirectives](DebuggingDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
13. [**](../../../../../akka/http/scaladsl/server/directives/DirectoryListing.html "Permalink") final  case class [DirectoryListing](DirectoryListing.html)(path: String, isRoot: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), files: Seq\[[File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)]) extends [javadsl.server.directives.DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
14. [**](../../../../../akka/http/scaladsl/server/directives/ExecutionDirectives.html "Permalink")  trait [ExecutionDirectives](ExecutionDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
15. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives.html "Permalink")  trait [FileAndResourceDirectives](FileAndResourceDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
16. [**](../../../../../akka/http/scaladsl/server/directives/FileInfo.html "Permalink") final  case class [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")(fieldName: String, fileName: String, contentType: [ContentType](../../model/ContentType.html)) extends [javadsl.server.directives.FileInfo](../../../javadsl/server/directives/FileInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAdditional metadata about the file being uploaded/that was uploaded using the [FileUploadDirectives](FileUploadDirectives.html)

Additional metadata about the file being uploaded/that was uploaded using the [FileUploadDirectives](FileUploadDirectives.html)

fieldNameName of the form field the file was uploaded in

fileNameUser specified name of the uploaded file

contentTypeContent type of the file
17. [**](../../../../../akka/http/scaladsl/server/directives/FileUploadDirectives.html "Permalink")  trait [FileUploadDirectives](FileUploadDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
18. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives.html "Permalink")  trait [FormFieldDirectives](FormFieldDirectives.html) extends [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html) with ToNameReceptacleEnhancements
19. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectivesInstances.html "Permalink")  trait [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
20. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html "Permalink")  trait [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "Allows the MarshallingDirectives.entity directive to extract a akka.stream.scaladsl.Source of elements.") extends [MarshallingDirectives](MarshallingDirectives.html)Allows the [MarshallingDirectives.entity](MarshallingDirectives$.html#entity[T](um:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.server.Directive1[T]) directive to extract a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements.

Allows the [MarshallingDirectives.entity](MarshallingDirectives$.html#entity[T](um:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.server.Directive1[T]) directive to extract a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements.

See [common.EntityStreamingSupport](../../common/EntityStreamingSupport.html) for useful default framing `Flow` instances and
support traits such as `SprayJsonSupport` (or your other favourite JSON library) to provide the needed Marshaller s.
21. [**](../../../../../akka/http/scaladsl/server/directives/FutureDirectives.html "Permalink")  trait [FutureDirectives](FutureDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
22. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html "Permalink")  trait [HeaderDirectives](HeaderDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
23. [**](../../../../../akka/http/scaladsl/server/directives/HeaderMagnet.html "Permalink")  trait [HeaderMagnet](HeaderMagnet.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
24. [**](../../../../../akka/http/scaladsl/server/directives/HostDirectives.html "Permalink")  trait [HostDirectives](HostDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
25. [**](../../../../../akka/http/scaladsl/server/directives/LogEntry.html "Permalink")  case class [LogEntry](LogEntry.html)(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), level: LogLevel \= [DebugLevel](../../../../index.html)) extends [javadsl.server.directives.LogEntry](../../../javadsl/server/directives/LogEntry.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
26. [**](../../../../../akka/http/scaladsl/server/directives/LoggingMagnet.html "Permalink")  case class [LoggingMagnet](LoggingMagnet.html)\[T](f: ([LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)) \=\> T) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
27. [**](../../../../../akka/http/scaladsl/server/directives/LowPriorityHeaderMagnetImplicits.html "Permalink")  trait [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
28. [**](../../../../../akka/http/scaladsl/server/directives/MarshallingDirectives.html "Permalink")  trait [MarshallingDirectives](MarshallingDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
29. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html "Permalink")  trait [MethodDirectives](MethodDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
30. [**](../../../../../akka/http/scaladsl/server/directives/MiscDirectives.html "Permalink")  trait [MiscDirectives](MiscDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
31. [**](../../../../../akka/http/scaladsl/server/directives/OnSuccessMagnet.html "Permalink")  trait [OnSuccessMagnet](OnSuccessMagnet.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
32. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives.html "Permalink")  trait [ParameterDirectives](ParameterDirectives.html) extends [ParameterDirectivesInstances](ParameterDirectivesInstances.html) with ToNameReceptacleEnhancements
33. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectivesInstances.html "Permalink")  trait [ParameterDirectivesInstances](ParameterDirectivesInstances.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
34. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html "Permalink")  trait [PathDirectives](PathDirectives.html) extends [PathMatchers](../PathMatchers.html) with [ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html) with ToNameReceptacleEnhancements
35. [**](../../../../../akka/http/scaladsl/server/directives/RangeDirectives.html "Permalink")  trait [RangeDirectives](RangeDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
36. [**](../../../../../akka/http/scaladsl/server/directives/RespondWithDirectives.html "Permalink")  trait [RespondWithDirectives](RespondWithDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
37. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives.html "Permalink")  trait [RouteDirectives](RouteDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
38. [**](../../../../../akka/http/scaladsl/server/directives/SchemeDirectives.html "Permalink")  trait [SchemeDirectives](SchemeDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
39. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives.html "Permalink")  trait [SecurityDirectives](SecurityDirectives.html "Provides directives for securing an inner route using the standard Http authentication headers `WWW-Authenticate` and Authorization.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Provides directives for securing an inner route using the standard Http authentication headers \`WWW\-Authenticate\`
and Authorization.

Provides directives for securing an inner route using the standard Http authentication headers \`WWW\-Authenticate\`
and Authorization. Most prominently, HTTP Basic authentication and OAuth 2\.0 Authorization Framework
as defined in RFC 2617 and RFC 6750 respectively.

See: [RFC 2617](https://www.ietf.org/rfc/rfc2617.txt).
See: [RFC 6750](https://www.ietf.org/rfc/rfc6750.txt).
40. [**](../../../../../akka/http/scaladsl/server/directives/TimeoutDirectives.html "Permalink")  trait [TimeoutDirectives](TimeoutDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
41. [**](../../../../../akka/http/scaladsl/server/directives/TlsDirectives.html "Permalink")  trait [TlsDirectives](TlsDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
42. [**](../../../../../akka/http/scaladsl/server/directives/WebSocketDirectives.html "Permalink")  trait [WebSocketDirectives](WebSocketDirectives.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/AttributeDirectives$.html "Permalink")  object [AttributeDirectives](AttributeDirectives$.html) extends [AttributeDirectives](AttributeDirectives.html)
2. [**](../../../../../akka/http/scaladsl/server/directives/AuthenticationDirective$.html "Permalink")  object [AuthenticationDirective](AuthenticationDirective$.html)
3. [**](../../../../../akka/http/scaladsl/server/directives/AuthenticationResult$.html "Permalink")  object [AuthenticationResult](AuthenticationResult$.html)
4. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html "Permalink")  object [BasicDirectives](BasicDirectives$.html) extends [BasicDirectives](BasicDirectives.html)
5. [**](../../../../../akka/http/scaladsl/server/directives/CacheConditionDirectives$.html "Permalink")  object [CacheConditionDirectives](CacheConditionDirectives$.html) extends [CacheConditionDirectives](CacheConditionDirectives.html)
6. [**](../../../../../akka/http/scaladsl/server/directives/CachingDirectives$.html "Permalink")  object [CachingDirectives](CachingDirectives$.html) extends [CachingDirectives](CachingDirectives.html)
7. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html "Permalink")  object [CodingDirectives](CodingDirectives$.html) extends [CodingDirectives](CodingDirectives.html)
8. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html "Permalink")  object [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet$.html)
9. [**](../../../../../akka/http/scaladsl/server/directives/ContentTypeResolver$.html "Permalink")  object [ContentTypeResolver](ContentTypeResolver$.html)
10. [**](../../../../../akka/http/scaladsl/server/directives/CookieDirectives$.html "Permalink")  object [CookieDirectives](CookieDirectives$.html) extends [CookieDirectives](CookieDirectives.html)
11. [**](../../../../../akka/http/scaladsl/server/directives/CorsDirectives$.html "Permalink")  object [CorsDirectives](CorsDirectives$.html) extends [CorsDirectives](CorsDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$.html "Permalink")  object [Credentials](Credentials$.html)
13. [**](../../../../../akka/http/scaladsl/server/directives/DebuggingDirectives$.html "Permalink")  object [DebuggingDirectives](DebuggingDirectives$.html) extends [DebuggingDirectives](DebuggingDirectives.html)
14. [**](../../../../../akka/http/scaladsl/server/directives/DirectoryListing$.html "Permalink")  object [DirectoryListing](DirectoryListing$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
15. [**](../../../../../akka/http/scaladsl/server/directives/ExecutionDirectives$.html "Permalink")  object [ExecutionDirectives](ExecutionDirectives$.html) extends [ExecutionDirectives](ExecutionDirectives.html)
16. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html "Permalink")  object [FileAndResourceDirectives](FileAndResourceDirectives$.html) extends [FileAndResourceDirectives](FileAndResourceDirectives.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/FileUploadDirectives$.html "Permalink")  object [FileUploadDirectives](FileUploadDirectives$.html) extends [FileUploadDirectives](FileUploadDirectives.html)
18. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$.html "Permalink")  object [FormFieldDirectives](FormFieldDirectives$.html) extends [FormFieldDirectives](FormFieldDirectives.html)
19. [**](../../../../../akka/http/scaladsl/server/directives/FutureDirectives$.html "Permalink")  object [FutureDirectives](FutureDirectives$.html) extends [FutureDirectives](FutureDirectives.html)
20. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives$.html "Permalink")  object [HeaderDirectives](HeaderDirectives$.html) extends [HeaderDirectives](HeaderDirectives.html)
21. [**](../../../../../akka/http/scaladsl/server/directives/HeaderMagnet$.html "Permalink")  object [HeaderMagnet](HeaderMagnet$.html) extends [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html)
22. [**](../../../../../akka/http/scaladsl/server/directives/HostDirectives$.html "Permalink")  object [HostDirectives](HostDirectives$.html) extends [HostDirectives](HostDirectives.html)
23. [**](../../../../../akka/http/scaladsl/server/directives/LogEntry$.html "Permalink")  object [LogEntry](LogEntry$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
24. [**](../../../../../akka/http/scaladsl/server/directives/LoggingMagnet$.html "Permalink")  object [LoggingMagnet](LoggingMagnet$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
25. [**](../../../../../akka/http/scaladsl/server/directives/MarshallingDirectives$.html "Permalink")  object [MarshallingDirectives](MarshallingDirectives$.html) extends [MarshallingDirectives](MarshallingDirectives.html)
26. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives$.html "Permalink")  object [MethodDirectives](MethodDirectives$.html) extends [MethodDirectives](MethodDirectives.html)
27. [**](../../../../../akka/http/scaladsl/server/directives/MiscDirectives$.html "Permalink")  object [MiscDirectives](MiscDirectives$.html) extends [MiscDirectives](MiscDirectives.html)
28. [**](../../../../../akka/http/scaladsl/server/directives/OnSuccessMagnet$.html "Permalink")  object [OnSuccessMagnet](OnSuccessMagnet$.html)
29. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$.html "Permalink")  object [ParameterDirectives](ParameterDirectives$.html) extends [ParameterDirectives](ParameterDirectives.html)
30. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives$.html "Permalink")  object [PathDirectives](PathDirectives$.html) extends [PathDirectives](PathDirectives.html)
31. [**](../../../../../akka/http/scaladsl/server/directives/RangeDirectives$.html "Permalink")  object [RangeDirectives](RangeDirectives$.html) extends [RangeDirectives](RangeDirectives.html)
32. [**](../../../../../akka/http/scaladsl/server/directives/RespondWithDirectives$.html "Permalink")  object [RespondWithDirectives](RespondWithDirectives$.html) extends [RespondWithDirectives](RespondWithDirectives.html)
33. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html "Permalink")  object [RouteDirectives](RouteDirectives$.html) extends [RouteDirectives](RouteDirectives.html)
34. [**](../../../../../akka/http/scaladsl/server/directives/SchemeDirectives$.html "Permalink")  object [SchemeDirectives](SchemeDirectives$.html) extends [SchemeDirectives](SchemeDirectives.html)
35. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html "Permalink")  object [SecurityDirectives](SecurityDirectives$.html) extends [SecurityDirectives](SecurityDirectives.html)
36. [**](../../../../../akka/http/scaladsl/server/directives/TimeoutDirectives$.html "Permalink")  object [TimeoutDirectives](TimeoutDirectives$.html) extends [TimeoutDirectives](TimeoutDirectives.html)
37. [**](../../../../../akka/http/scaladsl/server/directives/TlsDirectives$.html "Permalink")  object [TlsDirectives](TlsDirectives$.html) extends [TlsDirectives](TlsDirectives.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Missing$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Provided.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html)*