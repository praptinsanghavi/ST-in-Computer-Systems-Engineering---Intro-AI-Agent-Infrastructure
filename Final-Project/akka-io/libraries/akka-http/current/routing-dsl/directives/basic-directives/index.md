---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
title: BasicDirectives • Akka HTTP
---

# BasicDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# BasicDirectives

Basic directives are building blocks for building [Custom Directives](../custom-directives.html). As such they usually aren’t used in a route directly but rather in the definition of new directives.

## Providing Values to Inner Routes

These directives provide values to the inner routes with extractions. They can be distinguished on two axes: a) provide a constant value or extract a value from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") b) provide a single value or a tuple of values.

> - [extract](extract.html)
> - [extractActorSystem](extractActorSystem.html)
> - [extractDataBytes](extractDataBytes.html)
> - [extractExecutionContext](extractExecutionContext.html)
> - [extractLog](extractLog.html)
> - [extractMatchedPath](extractMatchedPath.html)
> - [extractMaterializer](extractMaterializer.html)
> - [extractParserSettings](extractParserSettings.html)
> - [extractRequestContext](extractRequestContext.html)
> - [extractRequestEntity](extractRequestEntity.html)
> - [extractRequest](extractRequest.html)
> - [extractSettings](extractSettings.html)
> - [extractStrictEntity](extractStrictEntity.html)
> - [extractUnmatchedPath](extractUnmatchedPath.html)
> - [extractUri](extractUri.html)
> - [textract](textract.html)
> - [provide](provide.html)
> - [tprovide](tprovide.html)

## Transforming the Request(Context)

> - [mapRequest](mapRequest.html)
> - [mapRequestContext](mapRequestContext.html)
> - [mapSettings](mapSettings.html)
> - [mapUnmatchedPath](mapUnmatchedPath.html)
> - [withExecutionContext](withExecutionContext.html)
> - [withLog](withLog.html)
> - [withMaterializer](withMaterializer.html)
> - [withSettings](withSettings.html)
> - [toStrictEntity](toStrictEntity.html)

## Transforming the Response

These directives allow to hook into the response path and transform the complete response or the parts of a response or the list of rejections:

> - [mapResponse](mapResponse.html)
> - [mapResponseEntity](mapResponseEntity.html)
> - [mapResponseHeaders](mapResponseHeaders.html)

## Transforming the RouteResult

These directives allow to transform the RouteResult of the inner route.

> - [cancelRejection](cancelRejection.html)
> - [cancelRejections](cancelRejections.html)
> - [mapRejections](mapRejections.html)
> - [mapRouteResult](mapRouteResult.html)
> - [mapRouteResultFuture](mapRouteResultFuture.html)
> - [mapRouteResultPF](mapRouteResultPF.html)
> - [mapRouteResultWith](mapRouteResultWith.html)
> - [mapRouteResultWithPF](mapRouteResultWithPF.html)
> - [recoverRejections](recoverRejections.html)
> - [recoverRejectionsWith](recoverRejectionsWith.html)

## Other

> - [mapInnerRoute](mapInnerRoute.html)
> - [pass](pass.html)

## Alphabetically

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/optionalAttribute.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractActorSystem.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractDataBytes.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractParserSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractStrictEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapInnerRoute.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapResponseEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapResponseHeaders.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResult.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultFuture.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultPF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWithPF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/pass.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/provide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/recoverRejectionsWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/toStrictEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withExecutionContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html)*