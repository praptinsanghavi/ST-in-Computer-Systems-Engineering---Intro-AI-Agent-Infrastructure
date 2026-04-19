---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBuilder.html
title: ServerBuilder
---

# ServerBuilder

## Content

Package [akka.http.javadsl](package-summary.html)
## Interface ServerBuilder

- ---

```
public interface ServerBuilder
```

Builder API to create server bindings.
 
 Use {@link Http.newServerAt()} to create a builder, use methods to customize settings,
 and then call one of the bind\* methods to bind a server.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[adaptSettings](#adaptSettings(akka.japi.function.Function))​(akka.japi.function.Function<[ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings"),​[ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings")> f)` | Adapt the current configured settings with a function. |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bind](#bind(akka.http.javadsl.HandlerProvider))​([HandlerProvider](HandlerProvider.html "interface in akka.http.javadsl") handlerProvider)` | Bind a new HTTP server and use the given handler provider to create an asynchronous `handler` `Flow` for processing all incoming connections. |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bind](#bind(akka.japi.function.Function))​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> f)` | Bind a new HTTP server and use the given asynchronous `handler` `Flow` for processing all incoming connections. |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindFlow](#bindFlow(akka.stream.javadsl.Flow))​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​?> handlerFlow)` | Binds a new HTTP server at the given endpoint and uses the given `handler` `Flow` for processing all incoming connections. |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindSync](#bindSync(akka.japi.function.Function))​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> f)` | Bind a new HTTP server at the given endpoint and uses the given `handler` `Flow` for processing all incoming connections. |
	| `akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>>` | `[connectionSource](#connectionSource())()` | Creates a `Source` of [`IncomingConnection`](IncomingConnection.html "class in akka.http.javadsl") instances which represents a prospective HTTP server binding  on the given `endpoint`. |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[enableHttps](#enableHttps(akka.http.javadsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)` | Enable HTTPS for this binding with the given context. |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[logTo](#logTo(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` | Use a custom logger |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[onInterface](#onInterface(java.lang.String))​(java.lang.String interface_)` | Change interface to bind to |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[onPort](#onPort(int))​(int port)` | Change port to bind to |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer))​(akka.stream.Materializer materializer)` | Use custom `Materializer` for the binding |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[withSettings](#withSettings(akka.http.javadsl.settings.ServerSettings))​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings)` | Use custom `ServerSettings` for the binding. |

- - ### Method Detail
	
	
	
		- #### onInterface
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") onInterface​(java.lang.String interface_)
		```
		
		Change interface to bind to
		- #### onPort
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") onPort​(int port)
		```
		
		Change port to bind to
		- #### logTo
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") logTo​(akka.event.LoggingAdapter log)
		```
		
		Use a custom logger
		- #### withSettings
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") withSettings​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		Use custom `ServerSettings` for the binding.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### adaptSettings
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") adaptSettings​(akka.japi.function.Function<[ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings"),​[ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings")> f)
		```
		
		Adapt the current configured settings with a function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### enableHttps
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") enableHttps​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)
		```
		
		Enable HTTPS for this binding with the given context.
		
		Parameters:
		`context` \- (undocumented)
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") withMaterializer​(akka.stream.Materializer materializer)
		```
		
		Use custom `Materializer` for the binding
		
		Parameters:
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bind
		
		
		
		```
		java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bind​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> f)
		```
		
		Bind a new HTTP server and use the given asynchronous `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 Supports HTTP/2 on the same port if http2 support is enabled.
		
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### bind
		
		
		
		```
		java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bind​([HandlerProvider](HandlerProvider.html "interface in akka.http.javadsl") handlerProvider)
		```
		
		Bind a new HTTP server and use the given handler provider to create an asynchronous `handler`
		`Flow` for processing all incoming connections.
		 
		 Most importantly, you can pass a Route to this method because Route implements HandlerProvider.
		 
		
		
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 Supports HTTP/2 on the same port if http2 support is enabled.
		
		
		
		Parameters:
		`handlerProvider` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindSync
		
		
		
		```
		java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindSync​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> f)
		```
		
		Bind a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 Supports HTTP/2 on the same port if http2 support is enabled.
		
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindFlow
		
		
		
		```
		java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindFlow​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​?> handlerFlow)
		```
		
		Binds a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		
		
		
		Parameters:
		`handlerFlow` \- (undocumented)
		Returns:
		(undocumented)
		- #### connectionSource
		
		
		
		```
		akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>> connectionSource()
		```
		
		Creates a `Source` of [`IncomingConnection`](IncomingConnection.html "class in akka.http.javadsl") instances which represents a prospective HTTP server binding
		 on the given `endpoint`.
		 
		 Note that each materialization will create a new binding, so
		 
		
		
		 \* if the configured port is 0 the resulting source can be materialized several times. Each materialization will
		 then be assigned a new local port by the operating system, which can then be retrieved by the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 \* if the configured port is non\-zero subsequent materialization attempts of the produced source will immediately
		 fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/IncomingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBuilder.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBuilder.html)*