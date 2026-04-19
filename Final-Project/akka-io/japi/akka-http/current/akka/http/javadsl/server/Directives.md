---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Directives.html
title: Directives
---

# Directives

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class Directives

- java.lang.Object
- - akka.http.javadsl.server.Directives

- ---

```
public class Directives
extends java.lang.Object
```

Collects all default directives into one class for simple importing of static functions.
 
 See [`Directives`](../../scaladsl/server/Directives.html "interface in akka.http.scaladsl.server") for ScalaDSL equivalent of this class.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Directives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B>[Route](Route.html "interface in akka.http.javadsl.server")` | `[allOf](#allOf(java.util.function.Function,java.util.function.Function,java.util.function.BiFunction))​(java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,  java.util.function.Function<java.util.function.Function<B,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,  java.util.function.BiFunction<A,​B,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` | Nests two 1\-argument directives together  Usage example:  `allOf(this::extractScheme, this::extractMethod, (scheme, method) -> complete("You did a " + method.name() + " using " + scheme))` |
	| `static <A> [Route](Route.html "interface in akka.http.javadsl.server")` | `[allOf](#allOf(java.util.function.Function,java.util.function.Function,java.util.function.Function))​(java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,  java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,  java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` | Nests one 0\-argument and 1\-argument directives together  Usage example:  `allOf(bindParameter(this::pathPrefix, "guess"), this::extractMethod, method -> complete("You did a " + method.name()))` |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[allOf](#allOf(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,  java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` | Nests two 0\-argument directives together  Usage example:  `allOf(bindParameter(this::pathPrefix, "alice"), bindParameter(this::path, "bob"), () -> complete("Charlie!"))` |
	| `static <A> [Route](Route.html "interface in akka.http.javadsl.server")` | `[anyOf](#anyOf(java.util.function.Function,java.util.function.Function,java.util.function.Function))​(java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,  java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,  java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` | Composes two 1\-argument directives (directives whose inner route takes a parameter) which share the same inner route. |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[anyOf](#anyOf(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,  java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` | Composes two 0\-argument directives which share the same inner Route. |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[attribute](#attribute(akka.http.javadsl.model.AttributeKey,java.util.function.Function))​([AttributeKey](../model/AttributeKey.html "class in akka.http.javadsl.model")<T> key,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateBasic](#authenticateBasic(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateBasicAsync](#authenticateBasicAsync(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateBasicAsyncOptional](#authenticateBasicAsyncOptional(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateBasicOptional](#authenticateBasicOptional(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateBasicPF](#authenticateBasicPF(java.lang.String,scala.PartialFunction,java.util.function.Function))​(java.lang.String realm,  scala.PartialFunction<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​T> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateBasicPFAsync](#authenticateBasicPFAsync(java.lang.String,scala.PartialFunction,java.util.function.Function))​(java.lang.String realm,  scala.PartialFunction<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<T>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateOAuth2](#authenticateOAuth2(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateOAuth2Async](#authenticateOAuth2Async(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateOAuth2AsyncOptional](#authenticateOAuth2AsyncOptional(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateOAuth2Optional](#authenticateOAuth2Optional(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String realm,  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <C extends [HttpCredentials](../model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers"),​T>[Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateOrRejectWithChallenge](#authenticateOrRejectWithChallenge(java.lang.Class,java.util.function.Function,java.util.function.Function))​(java.lang.Class<C> c,  java.util.function.Function<java.util.Optional<C>,​java.util.concurrent.CompletionStage<scala.util.Either<[HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers"),​T>>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[authenticateOrRejectWithChallenge](#authenticateOrRejectWithChallenge(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<java.util.Optional<[HttpCredentials](../model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")>,​java.util.concurrent.CompletionStage<scala.util.Either<[HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers"),​T>>> authenticator,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[authorize](#authorize(java.util.function.Supplier,java.util.function.Supplier))​(java.util.function.Supplier<java.lang.Object> check,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[authorizeAsync](#authorizeAsync(java.util.function.Supplier,java.util.function.Supplier))​(java.util.function.Supplier<java.util.concurrent.CompletionStage<java.lang.Object>> check,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[authorizeAsyncWithRequestContext](#authorizeAsyncWithRequestContext(akka.japi.function.Function,java.util.function.Supplier))​(akka.japi.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<java.lang.Object>> check,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[authorizeWithRequestContext](#authorizeWithRequestContext(akka.japi.function.Function,java.util.function.Supplier))​(akka.japi.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​java.lang.Object> check,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[cancelRejection](#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier))​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[cancelRejections](#cancelRejections(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<java.lang.Class<?>> classes,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[cancelRejections](#cancelRejections(java.util.function.Predicate,java.util.function.Supplier))​(java.util.function.Predicate<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> filter,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[checkSameOrigin](#checkSameOrigin(akka.http.javadsl.model.headers.HttpOriginRange,java.util.function.Supplier))​([HttpOriginRange](../model/headers/HttpOriginRange.html "class in akka.http.javadsl.model.headers") allowed,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[complete](#complete(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.RequestEntity))​([RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.ResponseEntity))​([ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[complete](#complete(akka.http.javadsl.model.StatusCode))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,akka.http.javadsl.model.RequestEntity))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,akka.http.javadsl.model.ResponseEntity))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.Iterable,akka.http.javadsl.model.RequestEntity))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.Iterable,akka.http.javadsl.model.ResponseEntity))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.Iterable,T,akka.http.javadsl.marshalling.Marshaller))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.String))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.String entity)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,T,akka.http.javadsl.marshalling.Marshaller))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(java.lang.Iterable,akka.http.javadsl.model.RequestEntity))​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(java.lang.Iterable,akka.http.javadsl.model.ResponseEntity))​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(java.lang.Iterable,T,akka.http.javadsl.marshalling.Marshaller))​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[complete](#complete(java.lang.String))​(java.lang.String body)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(T,akka.http.javadsl.marshalling.Marshaller))​(T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOK](#completeOK(T,akka.http.javadsl.marshalling.Marshaller))​(T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFuture](#completeOKWithFuture(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> value)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFuture](#completeOKWithFuture(java.util.concurrent.CompletionStage,akka.http.javadsl.marshalling.Marshaller))​(java.util.concurrent.CompletionStage<T> value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFuture](#completeOKWithFuture(scala.concurrent.Future,akka.http.javadsl.marshalling.Marshaller))​(scala.concurrent.Future<T> value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFutureString](#completeOKWithFutureString(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<java.lang.String> value)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFutureString](#completeOKWithFutureString(scala.concurrent.Future))​(scala.concurrent.Future<java.lang.String> value)` |  |
	| `static <T,​M>[Route](Route.html "interface in akka.http.javadsl.server")` | `[completeOKWithSource](#completeOKWithSource(akka.stream.javadsl.Source,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.common.EntityStreamingSupport))​(akka.stream.javadsl.Source<T,​M> source,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m,  [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.javadsl.common") support)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[completeOrRecoverWith](#completeOrRecoverWith(java.util.function.Supplier,akka.http.javadsl.marshalling.Marshaller,java.util.function.Function))​(java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller,  java.util.function.Function<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[completeWith](#completeWith(akka.http.javadsl.marshalling.Marshaller,java.util.function.Consumer))​([Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​? extends [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller,  java.util.function.Consumer<java.util.function.Consumer<T>> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFuture](#completeWithFuture(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> value)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFuture](#completeWithFuture(java.util.concurrent.CompletionStage,akka.http.javadsl.marshalling.Marshaller))​(java.util.concurrent.CompletionStage<T> value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFuture](#completeWithFuture(scala.concurrent.Future,akka.http.javadsl.marshalling.Marshaller))​(scala.concurrent.Future<T> value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFutureResponse](#completeWithFutureResponse(scala.concurrent.Future))​(scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> value)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[completeWithFutureStatus](#completeWithFutureStatus(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")> status)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[completeWithFutureStatus](#completeWithFutureStatus(scala.concurrent.Future))​(scala.concurrent.Future<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")> status)` |  |
	| `static <T,​M>[Route](Route.html "interface in akka.http.javadsl.server")` | `[completeWithSource](#completeWithSource(akka.stream.javadsl.Source,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.common.EntityStreamingSupport))​(akka.stream.javadsl.Source<T,​M> source,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​akka.util.ByteString> m,  [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.javadsl.common") support)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[concat](#concat(akka.http.javadsl.server.Route,akka.http.javadsl.server.Route...))​([Route](Route.html "interface in akka.http.javadsl.server") first,  [Route](Route.html "interface in akka.http.javadsl.server")... alternatives)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[concat](#concat(akka.http.javadsl.server.Route,scala.collection.immutable.Seq))​([Route](Route.html "interface in akka.http.javadsl.server") first,  scala.collection.immutable.Seq<[Route](Route.html "interface in akka.http.javadsl.server")> alternatives)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier))​([DateTime](../model/DateTime.html "class in akka.http.javadsl.model") lastModified,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier))​([EntityTag](../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,  [DateTime](../model/DateTime.html "class in akka.http.javadsl.model") lastModified,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier))​([EntityTag](../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))​(java.util.Optional<[EntityTag](../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")> eTag,  java.util.Optional<[DateTime](../model/DateTime.html "class in akka.http.javadsl.model")> lastModified,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[cookie](#cookie(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<[HttpCookiePair](../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[cors](#cors(akka.http.javadsl.settings.CorsSettings,java.util.function.Supplier))​([CorsSettings](../settings/CorsSettings.html "class in akka.http.javadsl.settings") settings,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[cors](#cors(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[decodeRequest](#decodeRequest(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[decodeRequestWith](#decodeRequestWith(akka.http.javadsl.coding.Coder,java.util.function.Supplier))​([Coder](../coding/Coder.html "enum in akka.http.javadsl.coding") coder,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[decodeRequestWith](#decodeRequestWith(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[Coder](../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives")` | `[defaultContentTypeResolver](#defaultContentTypeResolver())()` |  |
	| `static [DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives")` | `[defaultDirectoryRenderer](#defaultDirectoryRenderer())()` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[delete](#delete(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier))​([HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.String,java.lang.String,java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.lang.String domain,  java.lang.String path,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.String,java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.lang.String domain,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[encodeResponse](#encodeResponse(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[encodeResponseWith](#encodeResponseWith(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[Coder](../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[entity](#entity(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[entityAsSourceOf](#entityAsSourceOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.common.EntityStreamingSupport,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<akka.util.ByteString,​T> um,  [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.javadsl.common") support,  java.util.function.Function<akka.stream.javadsl.Source<T,​akka.NotUsed>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[extract](#extract(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​T> extract,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractActorSystem](#extractActorSystem(java.util.function.Function))​(java.util.function.Function<akka.actor.ActorSystem,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractClientCertificate](#extractClientCertificate(java.util.function.Function))​(java.util.function.Function<java.security.cert.X509Certificate,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractClientIP](#extractClientIP(java.util.function.Function))​(java.util.function.Function<[RemoteAddress](../model/RemoteAddress.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractCredentials](#extractCredentials(java.util.function.Function))​(java.util.function.Function<java.util.Optional<[HttpCredentials](../model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractDataBytes](#extractDataBytes(java.util.function.Function))​(java.util.function.Function<akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractEntity](#extractEntity(java.util.function.Function))​(java.util.function.Function<[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractExecutionContext](#extractExecutionContext(java.util.function.Function))​(java.util.function.Function<scala.concurrent.ExecutionContextExecutor,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractHost](#extractHost(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractLog](#extractLog(java.util.function.Function))​(java.util.function.Function<akka.event.LoggingAdapter,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractMatchedPath](#extractMatchedPath(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractMaterializer](#extractMaterializer(java.util.function.Function))​(java.util.function.Function<akka.stream.Materializer,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractMethod](#extractMethod(java.util.function.Function))​(java.util.function.Function<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractOfferedWsProtocols](#extractOfferedWsProtocols(java.util.function.Function))​(java.util.function.Function<java.util.List<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractParserSettings](#extractParserSettings(java.util.function.Function))​(java.util.function.Function<[ParserSettings](../settings/ParserSettings.html "class in akka.http.javadsl.settings"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractRequest](#extractRequest(java.util.function.Function))​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractRequestContext](#extractRequestContext(java.util.function.Function))​(java.util.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractRequestEntity](#extractRequestEntity(java.util.function.Function))​(java.util.function.Function<[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractRequestTimeout](#extractRequestTimeout(java.util.function.Function))​(java.util.function.Function<scala.concurrent.duration.Duration,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractScheme](#extractScheme(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractSettings](#extractSettings(java.util.function.Function))​(java.util.function.Function<[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractSslSession](#extractSslSession(java.util.function.Function))​(java.util.function.Function<javax.net.ssl.SSLSession,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractStrictEntity](#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function))​(scala.concurrent.duration.FiniteDuration timeout,  long maxBytes,  java.util.function.Function<[HttpEntity.Strict](../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractStrictEntity](#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function))​(scala.concurrent.duration.FiniteDuration timeout,  java.util.function.Function<[HttpEntity.Strict](../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractUnmatchedPath](#extractUnmatchedPath(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractUpgradeToWebSocket](#extractUpgradeToWebSocket(java.util.function.Function))​(java.util.function.Function<[UpgradeToWebSocket](../model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractUri](#extractUri(java.util.function.Function))​(java.util.function.Function<[Uri](../model/Uri.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[extractWebSocketUpgrade](#extractWebSocketUpgrade(java.util.function.Function))​(java.util.function.Function<[WebSocketUpgrade](../model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[failWith](#failWith(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[fileUpload](#fileUpload(java.lang.String,java.util.function.BiFunction))​(java.lang.String fieldName,  java.util.function.BiFunction<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[fileUploadAll](#fileUploadAll(java.lang.String,java.util.function.Function))​(java.lang.String fieldName,  java.util.function.Function<java.util.List<java.util.Map.Entry<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[formField](#formField(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[formField](#formField(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldList](#formFieldList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<java.util.List<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldList](#formFieldList(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.List<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldList](#formFieldList(java.util.function.Function))​(java.util.function.Function<java.util.List<java.util.Map.Entry<java.lang.String,​java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldMap](#formFieldMap(java.util.function.Function))​(java.util.function.Function<java.util.Map<java.lang.String,​java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldMultiMap](#formFieldMultiMap(java.util.function.Function))​(java.util.function.Function<java.util.Map<java.lang.String,​java.util.List<java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldOptional](#formFieldOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[formFieldOptional](#formFieldOptional(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[get](#get(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(java.lang.String...))​(java.lang.String... directories)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> directories)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String))​(java.lang.String directory)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directory,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer))​(java.lang.String directory,  [DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directory,  [DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromDirectory](#getFromDirectory(java.lang.String))​(java.lang.String directoryPath)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromDirectory](#getFromDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directoryPath,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.io.File))​(java.io.File file)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.io.File,akka.http.javadsl.model.ContentType))​(java.io.File file,  [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.io.File,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.io.File file,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.lang.String))​(java.lang.String file)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String file,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String))​(java.lang.String path)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType))​(java.lang.String path,  [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType,java.lang.ClassLoader))​(java.lang.String path,  [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType,  java.lang.ClassLoader classLoader)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String path,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String))​(java.lang.String directoryName)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directoryName,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver,java.lang.ClassLoader))​(java.lang.String directoryName,  [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver,  java.lang.ClassLoader classLoader)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String,java.lang.ClassLoader))​(java.lang.String directoryName,  java.lang.ClassLoader classLoader)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[handle](#handle(akka.japi.function.Function))​(akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>> handler)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[handleExceptions](#handleExceptions(akka.http.javadsl.server.ExceptionHandler,java.util.function.Supplier))​([ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") handler,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[handleRejections](#handleRejections(akka.http.javadsl.server.RejectionHandler,java.util.function.Supplier))​([RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") handler,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[handleSync](#handleSync(akka.japi.function.Function))​(akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> handler)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[handleWebSocketMessages](#handleWebSocketMessages(akka.stream.javadsl.Flow))​(akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> handler)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[handleWebSocketMessagesForOptionalProtocol](#handleWebSocketMessagesForOptionalProtocol(akka.stream.javadsl.Flow,java.util.Optional))​(akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> handler,  java.util.Optional<java.lang.String> subprotocol)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[handleWebSocketMessagesForProtocol](#handleWebSocketMessagesForProtocol(akka.stream.javadsl.Flow,java.lang.String))​(akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> handler,  java.lang.String subprotocol)` |  |
	| `static <T,​R>[Route](Route.html "interface in akka.http.javadsl.server")` | `[handleWith](#handleWith(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.marshalling.Marshaller,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<R,​? extends [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller,  java.util.function.Function<T,​R> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[head](#head(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[headerValue](#headerValue(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​java.util.Optional<T>> f,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[headerValueByName](#headerValueByName(java.lang.String,java.util.function.Function))​(java.lang.String headerName,  java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T extends [HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>[RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[headerValueByType](#headerValueByType(java.lang.Class,java.util.function.Function))​(java.lang.Class<T> t,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[headerValuePF](#headerValuePF(scala.PartialFunction,java.util.function.Function))​(scala.PartialFunction<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​T> pf,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[host](#host(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<java.lang.String> hostNames,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[host](#host(java.lang.String,java.util.function.Supplier))​(java.lang.String hostName,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[host](#host(java.util.function.Predicate,java.util.function.Supplier))​(java.util.function.Predicate<java.lang.String> predicate,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[host](#host(java.util.regex.Pattern,java.util.function.Function))​(java.util.regex.Pattern regex,  java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[ignoreTrailingSlash](#ignoreTrailingSlash(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,java.lang.String...))​([DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,  java.lang.String... directories)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,scala.collection.immutable.Seq))​([DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,  scala.collection.immutable.Seq<java.lang.String> directories)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(java.lang.String...))​(java.lang.String... directories)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> directories)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[logRequest](#logRequest(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier))​(java.lang.String marker,  akka.event.Logging.LogLevel level,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[logRequest](#logRequest(java.lang.String,java.util.function.Supplier))​(java.lang.String marker,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[logRequest](#logRequest(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> show,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[logRequestResult](#logRequestResult(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier))​(java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,  java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[logRequestResultOptional](#logRequestResultOptional(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier))​(java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.Optional<[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")>> showSuccess,  java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.Optional<[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")>> showRejection,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[logResult](#logResult(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier))​(java.lang.String marker,  akka.event.Logging.LogLevel level,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[logResult](#logResult(java.lang.String,java.util.function.Supplier))​(java.lang.String marker,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[logResult](#logResult(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,  java.util.function.Function<java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapInnerRoute](#mapInnerRoute(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[Route](Route.html "interface in akka.http.javadsl.server"),​[Route](Route.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRejections](#mapRejections(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRequest](#mapRequest(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRequestContext](#mapRequestContext(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​[RequestContext](RequestContext.html "class in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapResponse](#mapResponse(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapResponseEntity](#mapResponseEntity(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model"),​[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapResponseHeaders](#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>,​java.util.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResult](#mapRouteResult(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultFuture](#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultPF](#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier))​(scala.PartialFunction<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultWith](#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultWithPF](#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier))​(scala.PartialFunction<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapSettings](#mapSettings(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[mapUnmatchedPath](#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.lang.String,​java.lang.String> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[method](#method(akka.http.javadsl.model.HttpMethod,java.util.function.Supplier))​([HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model") method,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[onComplete](#onComplete(java.util.concurrent.CompletionStage,java.util.function.Function))​(java.util.concurrent.CompletionStage<T> cs,  java.util.function.Function<scala.util.Try<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[onComplete](#onComplete(java.util.function.Supplier,java.util.function.Function))​(java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,  java.util.function.Function<scala.util.Try<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[onCompleteWithBreaker](#onCompleteWithBreaker(akka.pattern.CircuitBreaker,java.util.function.Supplier,java.util.function.Function))​(akka.pattern.CircuitBreaker breaker,  java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,  java.util.function.Function<scala.util.Try<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[onSuccess](#onSuccess(java.util.concurrent.CompletionStage,java.util.function.Function))​(java.util.concurrent.CompletionStage<T> cs,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[onSuccess](#onSuccess(java.util.function.Supplier,java.util.function.Function))​(java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[optionalAttribute](#optionalAttribute(akka.http.javadsl.model.AttributeKey,java.util.function.Function))​([AttributeKey](../model/AttributeKey.html "class in akka.http.javadsl.model")<T> key,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[optionalCookie](#optionalCookie(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.Optional<[HttpCookiePair](../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[optionalHeaderValue](#optionalHeaderValue(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​java.util.Optional<T>> f,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[optionalHeaderValueByName](#optionalHeaderValueByName(java.lang.String,java.util.function.Function))​(java.lang.String headerName,  java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T extends [HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>[RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[optionalHeaderValueByType](#optionalHeaderValueByType(java.lang.Class,java.util.function.Function))​(java.lang.Class<T> t,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[optionalHeaderValuePF](#optionalHeaderValuePF(scala.PartialFunction,java.util.function.Function))​(scala.PartialFunction<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​T> pf,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[options](#options(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[overrideMethodWithParameter](#overrideMethodWithParameter(java.lang.String,java.util.function.Supplier))​(java.lang.String paramName,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameter](#parameter(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameter](#parameter(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterList](#parameterList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<java.util.List<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterList](#parameterList(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.List<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterList](#parameterList(java.util.function.Function))​(java.util.function.Function<java.util.List<java.util.Map.Entry<java.lang.String,​java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterMap](#parameterMap(java.util.function.Function))​(java.util.function.Function<java.util.Map<java.lang.String,​java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterMultiMap](#parameterMultiMap(java.util.function.Function))​(java.util.function.Function<java.util.Map<java.lang.String,​java.util.List<java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterOptional](#parameterOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterOptional](#parameterOptional(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterOrDefault](#parameterOrDefault(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  T defaultValue,  java.lang.String name,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[parameterRequiredValue](#parameterRequiredValue(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Supplier))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  T requiredValue,  java.lang.String name,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pass](#pass(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[patch](#patch(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") p,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> p,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[path](#path(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[path](#path(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathEnd](#pathEnd(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathEndOrSingleSlash](#pathEndOrSingleSlash(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") p,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> p,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1> [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSingleSlash](#pathSingleSlash(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1> [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1> [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[post](#post(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[provide](#provide(T,java.util.function.Function))​(T t,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[put](#put(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1> [Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1> [Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T1,​T2>[Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[recoverRejections](#recoverRejections(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[recoverRejectionsWith](#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[redirect](#redirect(akka.http.javadsl.model.Uri,akka.http.javadsl.model.StatusCode))​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,  [StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[redirectToNoTrailingSlashIfPresent](#redirectToNoTrailingSlashIfPresent(akka.http.javadsl.model.StatusCode,java.util.function.Supplier))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[redirectToTrailingSlashIfMissing](#redirectToTrailingSlashIfMissing(akka.http.javadsl.model.StatusCode,java.util.function.Supplier))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[reject](#reject())()` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[reject](#reject(akka.http.javadsl.server.Rejection,akka.http.javadsl.server.Rejection...))​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection,  [Rejection](Rejection.html "interface in akka.http.javadsl.server")... rejections)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[reject](#reject(akka.http.javadsl.server.Rejection,scala.collection.immutable.Seq))​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection,  scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[rejectEmptyResponse](#rejectEmptyResponse(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static <T> [Route](Route.html "interface in akka.http.javadsl.server")` | `[request](#request(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​T> unmarshaller,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[requestEncodedWith](#requestEncodedWith(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[requestEntityEmpty](#requestEntityEmpty(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[requestEntityPresent](#requestEntityPresent(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[requireClientCertificateIdentity](#requireClientCertificateIdentity(java.lang.String,java.util.function.Supplier))​(java.lang.String cnRegex,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[respondWithDefaultHeader](#respondWithDefaultHeader(akka.http.javadsl.model.HttpHeader,java.util.function.Supplier))​([HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model") responseHeader,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[respondWithDefaultHeaders](#respondWithDefaultHeaders(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> responseHeaders,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[respondWithHeader](#respondWithHeader(akka.http.javadsl.model.HttpHeader,java.util.function.Supplier))​([HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model") responseHeader,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[respondWithHeaders](#respondWithHeaders(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> responseHeaders,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[responseEncodingAccepted](#responseEncodingAccepted(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[route](#route(akka.http.javadsl.server.Route...))​([Route](Route.html "interface in akka.http.javadsl.server")... alternatives)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[route](#route(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Route](Route.html "interface in akka.http.javadsl.server")> alternatives)` | Deprecated. |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[scheme](#scheme(java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[selectPreferredLanguage](#selectPreferredLanguage(java.lang.Iterable,java.util.function.Function))​(java.lang.Iterable<[Language](../model/headers/Language.html "class in akka.http.javadsl.model.headers")> languages,  java.util.function.Function<[Language](../model/headers/Language.html "class in akka.http.javadsl.model.headers"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[setCookie](#setCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier))​([HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[setCookie](#setCookie(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[storeUploadedFile](#storeUploadedFile(java.lang.String,java.util.function.Function,java.util.function.BiFunction))​(java.lang.String fieldName,  java.util.function.Function<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File> destFn,  java.util.function.BiFunction<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[storeUploadedFiles](#storeUploadedFiles(java.lang.String,java.util.function.Function,java.util.function.Function))​(java.lang.String fieldName,  java.util.function.Function<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File> destFn,  java.util.function.Function<java.util.List<java.util.Map.Entry<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[toStrictEntity](#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier))​(scala.concurrent.duration.FiniteDuration timeout,  long maxBytes,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[toStrictEntity](#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier))​(scala.concurrent.duration.FiniteDuration timeout,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[validate](#validate(java.util.function.BooleanSupplier,java.lang.String,java.util.function.Supplier))​(java.util.function.BooleanSupplier check,  java.lang.String errorMsg,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withExecutionContext](#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier))​(scala.concurrent.ExecutionContextExecutor ec,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withLog](#withLog(akka.event.LoggingAdapter,java.util.function.Supplier))​(akka.event.LoggingAdapter log,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer,java.util.function.Supplier))​(akka.stream.Materializer mat,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[withoutRequestTimeout](#withoutRequestTimeout(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withoutSizeLimit](#withoutSizeLimit(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withPrecompressedMediaTypeSupport](#withPrecompressedMediaTypeSupport(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withRangeSupport](#withRangeSupport(java.util.function.Supplier))​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[withRequestTimeout](#withRequestTimeout(scala.concurrent.duration.Duration,java.util.function.Function,java.util.function.Supplier))​(scala.concurrent.duration.Duration timeout,  java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> timeoutHandler,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[withRequestTimeout](#withRequestTimeout(scala.concurrent.duration.Duration,java.util.function.Supplier))​(scala.concurrent.duration.Duration timeout,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[withRequestTimeoutResponse](#withRequestTimeoutResponse(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> timeoutHandler,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withSettings](#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") s,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `static [Route](Route.html "interface in akka.http.javadsl.server")` | `[withSizeLimit](#withSizeLimit(long,java.util.function.Supplier))​(long maxBytes,  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Directives
		
		
		
		```
		public Directives()
		```

	- ### Method Detail
	
	
	
		- #### route
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") route​([Route](Route.html "interface in akka.http.javadsl.server")... alternatives)
		```
		- #### getFromBrowseableDirectories
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(java.lang.String... directories)
		```
		- #### route
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") route​(scala.collection.immutable.Seq<[Route](Route.html "interface in akka.http.javadsl.server")> alternatives)
		```
		
		Deprecated.
		- #### getFromBrowseableDirectories
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(scala.collection.immutable.Seq<java.lang.String> directories)
		```
		- #### anyOf
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") anyOf​(java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,
		                          java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,
		                          java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Composes two 0\-argument directives which share the same inner Route. This is equivalent to
		 `first(inner).orElse(second(inner))`
		 Usage example:
		 `anyOf(this::get, this::post, () -> complete("hi")))`
		
		Parameters:
		`first` \- the first 0\-argument directive
		`second` \- the second 0\-argument directive
		`inner` \- the inner route Producer
		Returns:
		the resulting route
		- #### anyOf
		
		
		
		```
		public static <A> [Route](Route.html "interface in akka.http.javadsl.server") anyOf​(java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,
		                              java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,
		                              java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Composes two 1\-argument directives (directives whose inner route takes a parameter) which share the same inner route.
		 This is the same as `first(inner).orElse(second(inner))`.
		 This can be used also for directives that take an additional parameter if the directive is partially applied, ie. parameter
		 Usage example:
		 `anyOf(bindParameter(this::path, "bar"), bindParameter(this::path, "baz"), () -> complete("bar or baz"))`
		
		Parameters:
		`first` \- the first 1\-argument directive
		`second` \- the second 1\-argument directive
		`inner` \- the inner route that takes one argument
		Returns:
		the resulting route
		- #### allOf
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") allOf​(java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,
		                          java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,
		                          java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Nests two 0\-argument directives together
		 Usage example:
		 `allOf(bindParameter(this::pathPrefix, "alice"), bindParameter(this::path, "bob"), () -> complete("Charlie!"))`
		
		Parameters:
		`first` \- the 0\-argument directive (outer one)
		`second` \- the 0\-argument directive (inner one)
		`inner` \- the inner route function
		Returns:
		the resulting route
		- #### allOf
		
		
		
		```
		public static <A,​B> [Route](Route.html "interface in akka.http.javadsl.server") allOf​(java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,
		                                      java.util.function.Function<java.util.function.Function<B,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,
		                                      java.util.function.BiFunction<A,​B,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Nests two 1\-argument directives together
		 Usage example:
		 `allOf(this::extractScheme, this::extractMethod, (scheme, method) -> complete("You did a " + method.name() + " using " + scheme))`
		
		Parameters:
		`first` \- the first 1\-argument directive (outer one)
		`second` \- the second 1\-argument directive (inner one)
		`inner` \- the inner route function that takes 2 different parameters
		Returns:
		the resulting route
		- #### allOf
		
		
		
		```
		public static <A> [Route](Route.html "interface in akka.http.javadsl.server") allOf​(java.util.function.Function<java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> first,
		                              java.util.function.Function<java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")>,​[Route](Route.html "interface in akka.http.javadsl.server")> second,
		                              java.util.function.Function<A,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Nests one 0\-argument and 1\-argument directives together
		 Usage example:
		 `allOf(bindParameter(this::pathPrefix, "guess"), this::extractMethod, method -> complete("You did a " + method.name()))`
		
		Parameters:
		`first` \- the 0\-argument directive (outer one)
		`second` \- the 1\-argument directive (inner one)
		`inner` \- the inner route function that takes 1 parameter
		Returns:
		the resulting route
		- #### mapRequest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRequest​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")> f,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRequestContext
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRequestContext​(java.util.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​[RequestContext](RequestContext.html "class in akka.http.javadsl.server")> f,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRejections
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRejections​(java.util.function.Function<java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>> f,
		                                  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapResponse
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapResponse​(java.util.function.Function<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> f,
		                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapResponseEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapResponseEntity​(java.util.function.Function<[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model"),​[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model")> f,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapResponseHeaders
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapResponseHeaders​(java.util.function.Function<java.util.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>,​java.util.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")>> f,
		                                       java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapInnerRoute
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapInnerRoute​(java.util.function.Function<[Route](Route.html "interface in akka.http.javadsl.server"),​[Route](Route.html "interface in akka.http.javadsl.server")> f,
		                                  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResult
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRouteResult​(java.util.function.Function<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> f,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultPF
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRouteResultPF​(scala.PartialFunction<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> f,
		                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultFuture
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRouteResultFuture​(java.util.function.Function<java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRouteResultWith​(java.util.function.Function<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                       java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultWithPF
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapRouteResultWithPF​(scala.PartialFunction<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapSettings
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapSettings​(java.util.function.Function<[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings")> f,
		                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pass
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pass​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### provide
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") provide​(T t,
		                                java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### cancelRejection
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") cancelRejection​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection,
		                                    java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### cancelRejections
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") cancelRejections​(java.lang.Iterable<java.lang.Class<?>> classes,
		                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### cancelRejections
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") cancelRejections​(java.util.function.Predicate<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> filter,
		                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### recoverRejections
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") recoverRejections​(java.util.function.Function<java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> f,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### recoverRejectionsWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") recoverRejectionsWith​(java.util.function.Function<java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                          java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapUnmatchedPath
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") mapUnmatchedPath​(java.util.function.Function<java.lang.String,​java.lang.String> f,
		                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractUnmatchedPath
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractUnmatchedPath​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractMatchedPath
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractMatchedPath​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractRequest
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractRequest​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractUri
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractUri​(java.util.function.Function<[Uri](../model/Uri.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractEntity​(java.util.function.Function<[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractMaterializer
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractMaterializer​(java.util.function.Function<akka.stream.Materializer,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractActorSystem
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractActorSystem​(java.util.function.Function<akka.actor.ActorSystem,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractExecutionContext
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractExecutionContext​(java.util.function.Function<scala.concurrent.ExecutionContextExecutor,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extract
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") extract​(java.util.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​T> extract,
		                                java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withLog
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withLog​(akka.event.LoggingAdapter log,
		                            java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withExecutionContext
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withExecutionContext​(scala.concurrent.ExecutionContextExecutor ec,
		                                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withMaterializer
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withMaterializer​(akka.stream.Materializer mat,
		                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withSettings
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withSettings​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") s,
		                                 java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractLog
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractLog​(java.util.function.Function<akka.event.LoggingAdapter,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractParserSettings
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractParserSettings​(java.util.function.Function<[ParserSettings](../settings/ParserSettings.html "class in akka.http.javadsl.settings"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractSettings
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractSettings​(java.util.function.Function<[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractRequestContext
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractRequestContext​(java.util.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractDataBytes
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractDataBytes​(java.util.function.Function<akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractRequestEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractRequestEntity​(java.util.function.Function<[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractStrictEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                        java.util.function.Function<[HttpEntity.Strict](../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractStrictEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                        long maxBytes,
		                                        java.util.function.Function<[HttpEntity.Strict](../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### toStrictEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") toStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### toStrictEntity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") toStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                   long maxBytes,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### conditional
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") conditional​([EntityTag](../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,
		                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### conditional
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") conditional​([DateTime](../model/DateTime.html "class in akka.http.javadsl.model") lastModified,
		                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### conditional
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") conditional​([EntityTag](../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,
		                                [DateTime](../model/DateTime.html "class in akka.http.javadsl.model") lastModified,
		                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### conditional
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") conditional​(java.util.Optional<[EntityTag](../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")> eTag,
		                                java.util.Optional<[DateTime](../model/DateTime.html "class in akka.http.javadsl.model")> lastModified,
		                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### responseEncodingAccepted
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") responseEncodingAccepted​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,
		                                             java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### encodeResponse
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") encodeResponse​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### encodeResponseWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") encodeResponseWith​(java.lang.Iterable<[Coder](../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,
		                                       java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### decodeRequestWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") decodeRequestWith​([Coder](../coding/Coder.html "enum in akka.http.javadsl.coding") coder,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### requestEncodedWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") requestEncodedWith​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,
		                                       java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### decodeRequestWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") decodeRequestWith​(java.lang.Iterable<[Coder](../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### decodeRequest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") decodeRequest​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withPrecompressedMediaTypeSupport
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withPrecompressedMediaTypeSupport​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### cookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") cookie​(java.lang.String name,
		                           java.util.function.Function<[HttpCookiePair](../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### optionalCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") optionalCookie​(java.lang.String name,
		                                   java.util.function.Function<java.util.Optional<[HttpCookiePair](../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### setCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") setCookie​([HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,
		                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### setCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") setCookie​(java.lang.Iterable<[HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,
		                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### deleteCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") deleteCookie​([HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,
		                                 java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### deleteCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.Iterable<[HttpCookie](../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,
		                                 java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### deleteCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.String name,
		                                 java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### deleteCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.String name,
		                                 java.lang.String domain,
		                                 java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### deleteCookie
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.String name,
		                                 java.lang.String domain,
		                                 java.lang.String path,
		                                 java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logRequest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") logRequest​(java.lang.String marker,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logRequest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") logRequest​(java.lang.String marker,
		                               akka.event.Logging.LogLevel level,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logRequest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") logRequest​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> show,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logResult
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") logResult​(java.lang.String marker,
		                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logResult
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") logResult​(java.lang.String marker,
		                              akka.event.Logging.LogLevel level,
		                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logResult
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") logResult​(java.util.function.Function<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,
		                                     java.util.function.Function<java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,
		                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logRequestResult
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") logRequestResult​(java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,
		                                            java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,
		                                            java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### logRequestResultOptional
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") logRequestResultOptional​(java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.Optional<[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")>> showSuccess,
		                                                    java.util.function.BiFunction<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.Optional<[LogEntry](directives/LogEntry.html "class in akka.http.javadsl.server.directives")>> showRejection,
		                                                    java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### handleExceptions
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") handleExceptions​([ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") handler,
		                                            java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### handleRejections
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") handleRejections​([RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") handler,
		                                            java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### getFromResource
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path)
		```
		- #### getFromResource
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path,
		                                    [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromResource
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path,
		                                    [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType)
		```
		- #### getFromResource
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path,
		                                    [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                    java.lang.ClassLoader classLoader)
		```
		- #### getFromResourceDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName)
		```
		- #### getFromResourceDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName,
		                                             java.lang.ClassLoader classLoader)
		```
		- #### getFromResourceDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName,
		                                             [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromResourceDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName,
		                                             [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver,
		                                             java.lang.ClassLoader classLoader)
		```
		- #### getFromFile
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromFile​(java.io.File file)
		```
		- #### getFromFile
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromFile​(java.io.File file,
		                                [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromFile
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromFile​(java.io.File file,
		                                [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType)
		```
		- #### getFromFile
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromFile​(java.lang.String file)
		```
		- #### getFromFile
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromFile​(java.lang.String file,
		                                [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromDirectory​(java.lang.String directoryPath)
		```
		- #### getFromDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromDirectory​(java.lang.String directoryPath,
		                                     [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromBrowseableDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory,
		                                               [DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer,
		                                               [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromBrowseableDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory,
		                                               [DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer)
		```
		- #### getFromBrowseableDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory,
		                                               [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		- #### getFromBrowseableDirectory
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory)
		```
		- #### listDirectoryContents
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") listDirectoryContents​(scala.collection.immutable.Seq<java.lang.String> directories)
		```
		- #### listDirectoryContents
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") listDirectoryContents​([DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,
		                                          scala.collection.immutable.Seq<java.lang.String> directories)
		```
		- #### defaultDirectoryRenderer
		
		
		
		```
		public static [DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") defaultDirectoryRenderer()
		```
		- #### defaultContentTypeResolver
		
		
		
		```
		public static [ContentTypeResolver](directives/ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") defaultContentTypeResolver()
		```
		- #### listDirectoryContents
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") listDirectoryContents​(java.lang.String... directories)
		```
		- #### listDirectoryContents
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") listDirectoryContents​([DirectoryRenderer](directives/DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,
		                                          java.lang.String... directories)
		```
		- #### storeUploadedFile
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") storeUploadedFile​(java.lang.String fieldName,
		                                      java.util.function.Function<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File> destFn,
		                                      java.util.function.BiFunction<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### storeUploadedFiles
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") storeUploadedFiles​(java.lang.String fieldName,
		                                       java.util.function.Function<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File> destFn,
		                                       java.util.function.Function<java.util.List<java.util.Map.Entry<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​java.io.File>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### fileUpload
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") fileUpload​(java.lang.String fieldName,
		                               java.util.function.BiFunction<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### fileUploadAll
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") fileUploadAll​(java.lang.String fieldName,
		                                  java.util.function.Function<java.util.List<java.util.Map.Entry<[FileInfo](directives/FileInfo.html "class in akka.http.javadsl.server.directives"),​akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formField
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") formField​(java.lang.String name,
		                              java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldOptional
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") formFieldOptional​(java.lang.String name,
		                                      java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldList
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") formFieldList​(java.lang.String name,
		                                  java.util.function.Function<java.util.List<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formField
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") formField​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                  java.lang.String name,
		                                  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldOptional
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") formFieldOptional​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                          java.lang.String name,
		                                          java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldList
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") formFieldList​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                      java.lang.String name,
		                                      java.util.function.Function<java.util.List<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldMap
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") formFieldMap​(java.util.function.Function<java.util.Map<java.lang.String,​java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldMultiMap
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") formFieldMultiMap​(java.util.function.Function<java.util.Map<java.lang.String,​java.util.List<java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### formFieldList
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") formFieldList​(java.util.function.Function<java.util.List<java.util.Map.Entry<java.lang.String,​java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### onComplete
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") onComplete​(java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,
		                                          java.util.function.Function<scala.util.Try<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### onComplete
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") onComplete​(java.util.concurrent.CompletionStage<T> cs,
		                                          java.util.function.Function<scala.util.Try<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### onCompleteWithBreaker
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") onCompleteWithBreaker​(akka.pattern.CircuitBreaker breaker,
		                                                     java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,
		                                                     java.util.function.Function<scala.util.Try<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### onSuccess
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") onSuccess​(java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,
		                                         java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### onSuccess
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") onSuccess​(java.util.concurrent.CompletionStage<T> cs,
		                                         java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### completeOrRecoverWith
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") completeOrRecoverWith​(java.util.function.Supplier<java.util.concurrent.CompletionStage<T>> f,
		                                              [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller,
		                                              java.util.function.Function<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### checkSameOrigin
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") checkSameOrigin​([HttpOriginRange](../model/headers/HttpOriginRange.html "class in akka.http.javadsl.model.headers") allowed,
		                                    java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### headerValue
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") headerValue​(java.util.function.Function<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​java.util.Optional<T>> f,
		                                           java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### headerValuePF
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") headerValuePF​(scala.PartialFunction<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​T> pf,
		                                             java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### headerValueByName
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") headerValueByName​(java.lang.String headerName,
		                                             java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### headerValueByType
		
		
		
		```
		public static <T extends [HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") headerValueByType​(java.lang.Class<T> t,
		                                                                    java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### optionalHeaderValue
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") optionalHeaderValue​(java.util.function.Function<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​java.util.Optional<T>> f,
		                                                   java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### optionalHeaderValuePF
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") optionalHeaderValuePF​(scala.PartialFunction<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model"),​T> pf,
		                                                     java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### optionalHeaderValueByName
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") optionalHeaderValueByName​(java.lang.String headerName,
		                                                     java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### optionalHeaderValueByType
		
		
		
		```
		public static <T extends [HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") optionalHeaderValueByType​(java.lang.Class<T> t,
		                                                                            java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### attribute
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") attribute​([AttributeKey](../model/AttributeKey.html "class in akka.http.javadsl.model")<T> key,
		                                         java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### optionalAttribute
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") optionalAttribute​([AttributeKey](../model/AttributeKey.html "class in akka.http.javadsl.model")<T> key,
		                                                 java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractHost
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractHost​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### host
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") host​(java.lang.Iterable<java.lang.String> hostNames,
		                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### host
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") host​(java.lang.String hostName,
		                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### host
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") host​(java.util.function.Predicate<java.lang.String> predicate,
		                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### host
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") host​(java.util.regex.Pattern regex,
		                         java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### request
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") request​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​T> unmarshaller,
		                                java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### entity
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") entity​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller,
		                               java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### completeWith
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") completeWith​([Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​? extends [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller,
		                                     java.util.function.Consumer<java.util.function.Consumer<T>> inner)
		```
		- #### handleWith
		
		
		
		```
		public static <T,​R> [Route](Route.html "interface in akka.http.javadsl.server") handleWith​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​T> unmarshaller,
		                                           [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<R,​? extends [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller,
		                                           java.util.function.Function<T,​R> inner)
		```
		- #### delete
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") delete​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### get
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") get​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### head
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") head​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### options
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") options​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### patch
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") patch​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### post
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") post​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### put
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") put​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractMethod
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractMethod​(java.util.function.Function<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### method
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") method​([HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model") method,
		                           java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### overrideMethodWithParameter
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") overrideMethodWithParameter​(java.lang.String paramName,
		                                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### validate
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") validate​(java.util.function.BooleanSupplier check,
		                             java.lang.String errorMsg,
		                             java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractClientIP
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractClientIP​(java.util.function.Function<[RemoteAddress](../model/RemoteAddress.html "class in akka.http.javadsl.model"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### requestEntityEmpty
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") requestEntityEmpty​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### requestEntityPresent
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") requestEntityPresent​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rejectEmptyResponse
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") rejectEmptyResponse​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withSizeLimit
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withSizeLimit​(long maxBytes,
		                                  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withoutSizeLimit
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withoutSizeLimit​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### selectPreferredLanguage
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") selectPreferredLanguage​(java.lang.Iterable<[Language](../model/headers/Language.html "class in akka.http.javadsl.model.headers")> languages,
		                                            java.util.function.Function<[Language](../model/headers/Language.html "class in akka.http.javadsl.model.headers"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameter
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") parameter​(java.lang.String name,
		                              java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterOptional
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") parameterOptional​(java.lang.String name,
		                                      java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterRequiredValue
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") parameterRequiredValue​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                               T requiredValue,
		                                               java.lang.String name,
		                                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterList
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") parameterList​(java.lang.String name,
		                                  java.util.function.Function<java.util.List<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameter
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") parameter​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                  java.lang.String name,
		                                  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterOptional
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") parameterOptional​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                          java.lang.String name,
		                                          java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterOrDefault
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") parameterOrDefault​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                           T defaultValue,
		                                           java.lang.String name,
		                                           java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterList
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") parameterList​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                      java.lang.String name,
		                                      java.util.function.Function<java.util.List<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterMap
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") parameterMap​(java.util.function.Function<java.util.Map<java.lang.String,​java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterMultiMap
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") parameterMultiMap​(java.util.function.Function<java.util.Map<java.lang.String,​java.util.List<java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterList
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") parameterList​(java.util.function.Function<java.util.List<java.util.Map.Entry<java.lang.String,​java.lang.String>>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathEnd
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathEnd​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathEndOrSingleSlash
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathEndOrSingleSlash​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSingleSlash
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathSingleSlash​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") path​(java.lang.String segment,
		                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") path​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") path​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") p,
		                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") path​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> p,
		                             java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") path​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,
		                                       java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathPrefix​(java.lang.String segment,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathPrefix​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathPrefix​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") p,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") pathPrefix​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> p,
		                                   java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") pathPrefix​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,
		                                             java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefix​(java.lang.String segment,
		                                  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefix​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                                  java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public static <T1> [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefix​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                       java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefix​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                                java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefixTest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathPrefixTest​(java.lang.String segment,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefixTest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathPrefixTest​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefixTest
		
		
		
		```
		public static <T1> [Route](Route.html "interface in akka.http.javadsl.server") pathPrefixTest​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                        java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefixTest
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") pathPrefixTest​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                                 java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​(java.lang.String segment,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public static <T1> [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                           java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                                    java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathSuffix​(java.lang.String segment,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffix
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathSuffix​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                               java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffix
		
		
		
		```
		public static <T1> [Route](Route.html "interface in akka.http.javadsl.server") pathSuffix​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                    java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffix
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") pathSuffix​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                             java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathSuffixTest​(java.lang.String segment,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") pathSuffixTest​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public static <T1> [Route](Route.html "interface in akka.http.javadsl.server") pathSuffixTest​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                        java.util.function.Function<T1,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public static <T1,​T2> [Route](Route.html "interface in akka.http.javadsl.server") pathSuffixTest​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                                 java.util.function.BiFunction<T1,​T2,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### redirectToTrailingSlashIfMissing
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") redirectToTrailingSlashIfMissing​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,
		                                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### redirectToNoTrailingSlashIfPresent
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") redirectToNoTrailingSlashIfPresent​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,
		                                                       java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") pathPrefix​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                   java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") path​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                             java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### ignoreTrailingSlash
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") ignoreTrailingSlash​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withRangeSupport
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") withRangeSupport​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### respondWithHeader
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") respondWithHeader​([HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model") responseHeader,
		                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### respondWithDefaultHeader
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") respondWithDefaultHeader​([HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model") responseHeader,
		                                             java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### respondWithHeaders
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") respondWithHeaders​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> responseHeaders,
		                                       java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### respondWithDefaultHeaders
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") respondWithDefaultHeaders​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> responseHeaders,
		                                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### concat
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") concat​([Route](Route.html "interface in akka.http.javadsl.server") first,
		                           scala.collection.immutable.Seq<[Route](Route.html "interface in akka.http.javadsl.server")> alternatives)
		```
		- #### reject
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") reject​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection,
		                           scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)
		```
		- #### reject
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") reject()
		```
		- #### redirect
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") redirect​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,
		                             [StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType)
		```
		- #### failWith
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") failWith​(java.lang.Throwable error)
		```
		- #### complete
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") complete​(java.lang.String body)
		```
		- #### complete
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") complete​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)
		```
		- #### complete
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status)
		```
		- #### complete
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(T value,
		                                        [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		- #### complete
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                        java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                        T value,
		                                        [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                    java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                    [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                    java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                    [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### complete
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                        T value,
		                                        [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                    [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                    [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                    java.lang.String entity)
		```
		- #### complete
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                        T value,
		                                        [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                    [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                    [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### completeOK
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOK​(T value,
		                                          [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([ResponseEntity](../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### complete
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		- #### completeWithFutureResponse
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFutureResponse​(scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> value)
		```
		- #### completeOKWithFutureString
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFutureString​(scala.concurrent.Future<java.lang.String> value)
		```
		- #### completeWithFutureStatus
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") completeWithFutureStatus​(scala.concurrent.Future<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")> status)
		```
		- #### completeOKWithFuture
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFuture​(scala.concurrent.Future<T> value,
		                                                    [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		- #### completeWithFuture
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFuture​(scala.concurrent.Future<T> value,
		                                                  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		- #### completeWithFuture
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFuture​(java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> value)
		```
		- #### completeOKWithFuture
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFuture​(java.util.concurrent.CompletionStage<[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> value)
		```
		- #### completeOKWithFutureString
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFutureString​(java.util.concurrent.CompletionStage<java.lang.String> value)
		```
		- #### completeWithFutureStatus
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") completeWithFutureStatus​(java.util.concurrent.CompletionStage<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")> status)
		```
		- #### completeOKWithFuture
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFuture​(java.util.concurrent.CompletionStage<T> value,
		                                                    [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		- #### completeWithFuture
		
		
		
		```
		public static <T> [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFuture​(java.util.concurrent.CompletionStage<T> value,
		                                                  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		- #### handle
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") handle​(akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>> handler)
		```
		- #### handleSync
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") handleSync​(akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> handler)
		```
		- #### concat
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") concat​([Route](Route.html "interface in akka.http.javadsl.server") first,
		                           [Route](Route.html "interface in akka.http.javadsl.server")... alternatives)
		```
		- #### reject
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") reject​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection,
		                           [Rejection](Rejection.html "interface in akka.http.javadsl.server")... rejections)
		```
		- #### extractScheme
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractScheme​(java.util.function.Function<java.lang.String,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### scheme
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") scheme​(java.lang.String name,
		                           java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractCredentials
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractCredentials​(java.util.function.Function<java.util.Optional<[HttpCredentials](../model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateBasic
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateBasic​(java.lang.String realm,
		                                          java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,
		                                          java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateBasicPF
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateBasicPF​(java.lang.String realm,
		                                            scala.PartialFunction<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​T> authenticator,
		                                            java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateBasicPFAsync
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateBasicPFAsync​(java.lang.String realm,
		                                                 scala.PartialFunction<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<T>> authenticator,
		                                                 java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateBasicOptional
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateBasicOptional​(java.lang.String realm,
		                                                  java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,
		                                                  java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateBasicAsync
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateBasicAsync​(java.lang.String realm,
		                                               java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,
		                                               java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateBasicAsyncOptional
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateBasicAsyncOptional​(java.lang.String realm,
		                                                       java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,
		                                                       java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateOAuth2
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateOAuth2​(java.lang.String realm,
		                                           java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,
		                                           java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateOAuth2Optional
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateOAuth2Optional​(java.lang.String realm,
		                                                   java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.Optional<T>> authenticator,
		                                                   java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateOAuth2Async
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateOAuth2Async​(java.lang.String realm,
		                                                java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,
		                                                java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateOAuth2AsyncOptional
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateOAuth2AsyncOptional​(java.lang.String realm,
		                                                        java.util.function.Function<java.util.Optional<[SecurityDirectives.ProvidedCredentials](directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")>,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> authenticator,
		                                                        java.util.function.Function<java.util.Optional<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateOrRejectWithChallenge
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateOrRejectWithChallenge​(java.util.function.Function<java.util.Optional<[HttpCredentials](../model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")>,​java.util.concurrent.CompletionStage<scala.util.Either<[HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers"),​T>>> authenticator,
		                                                          java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authenticateOrRejectWithChallenge
		
		
		
		```
		public static <C extends [HttpCredentials](../model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers"),​T> [Route](Route.html "interface in akka.http.javadsl.server") authenticateOrRejectWithChallenge​(java.lang.Class<C> c,
		                                                                                          java.util.function.Function<java.util.Optional<C>,​java.util.concurrent.CompletionStage<scala.util.Either<[HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers"),​T>>> authenticator,
		                                                                                          java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authorize
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") authorize​(java.util.function.Supplier<java.lang.Object> check,
		                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authorizeWithRequestContext
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") authorizeWithRequestContext​(akka.japi.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​java.lang.Object> check,
		                                                java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authorizeAsync
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") authorizeAsync​(java.util.function.Supplier<java.util.concurrent.CompletionStage<java.lang.Object>> check,
		                                   java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### authorizeAsyncWithRequestContext
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") authorizeAsyncWithRequestContext​(akka.japi.function.Function<[RequestContext](RequestContext.html "class in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<java.lang.Object>> check,
		                                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractUpgradeToWebSocket
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractUpgradeToWebSocket​(java.util.function.Function<[UpgradeToWebSocket](../model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractWebSocketUpgrade
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractWebSocketUpgrade​(java.util.function.Function<[WebSocketUpgrade](../model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws"),​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractOfferedWsProtocols
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractOfferedWsProtocols​(java.util.function.Function<java.util.List<java.lang.String>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### handleWebSocketMessages
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") handleWebSocketMessages​(akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> handler)
		```
		- #### handleWebSocketMessagesForProtocol
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") handleWebSocketMessagesForProtocol​(akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> handler,
		                                                           java.lang.String subprotocol)
		```
		- #### handleWebSocketMessagesForOptionalProtocol
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") handleWebSocketMessagesForOptionalProtocol​(akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> handler,
		                                                                   java.util.Optional<java.lang.String> subprotocol)
		```
		- #### extractRequestTimeout
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") extractRequestTimeout​(java.util.function.Function<scala.concurrent.duration.Duration,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withRequestTimeout
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") withRequestTimeout​(scala.concurrent.duration.Duration timeout,
		                                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withRequestTimeout
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") withRequestTimeout​(scala.concurrent.duration.Duration timeout,
		                                              java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> timeoutHandler,
		                                              java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withoutRequestTimeout
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") withoutRequestTimeout​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### withRequestTimeoutResponse
		
		
		
		```
		public static [RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives") withRequestTimeoutResponse​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> timeoutHandler,
		                                                      java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### entityAsSourceOf
		
		
		
		```
		public static <T> [Route](Route.html "interface in akka.http.javadsl.server") entityAsSourceOf​([Unmarshaller](../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<akka.util.ByteString,​T> um,
		                                         [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.javadsl.common") support,
		                                         java.util.function.Function<akka.stream.javadsl.Source<T,​akka.NotUsed>,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### completeWithSource
		
		
		
		```
		public static <T,​M> [Route](Route.html "interface in akka.http.javadsl.server") completeWithSource​(akka.stream.javadsl.Source<T,​M> source,
		                                                   [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​akka.util.ByteString> m,
		                                                   [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.javadsl.common") support)
		```
		- #### completeOKWithSource
		
		
		
		```
		public static <T,​M> [Route](Route.html "interface in akka.http.javadsl.server") completeOKWithSource​(akka.stream.javadsl.Source<T,​M> source,
		                                                     [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m,
		                                                     [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.javadsl.common") support)
		```
		- #### cors
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") cors​(java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### cors
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") cors​([CorsSettings](../settings/CorsSettings.html "class in akka.http.javadsl.settings") settings,
		                         java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractSslSession
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractSslSession​(java.util.function.Function<javax.net.ssl.SSLSession,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### extractClientCertificate
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") extractClientCertificate​(java.util.function.Function<java.security.cert.X509Certificate,​[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### requireClientCertificateIdentity
		
		
		
		```
		public static [Route](Route.html "interface in akka.http.javadsl.server") requireClientCertificateIdentity​(java.lang.String cnRegex,
		                                                     java.util.function.Supplier<[Route](Route.html "interface in akka.http.javadsl.server")> inner)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOriginRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/SecurityDirectives.ProvidedCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Directives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Directives.html)*