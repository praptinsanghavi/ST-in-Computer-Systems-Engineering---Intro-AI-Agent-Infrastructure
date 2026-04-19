---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder.html
title: ServerBuilder
---

# ServerBuilder

## Content

Package [akka.http.scaladsl](package-summary.html)
## Interface ServerBuilder

- ---

```
public interface ServerBuilder
```

Builder API to create server bindings.
 
 Use {@link HttpExt.newServerAt()} to create a builder, use methods to customize settings,
 and then call one of the bind\* methods to bind a server.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[adaptSettings](#adaptSettings(scala.Function1))​(scala.Function1<[ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings"),​[ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings")> f)` | Adapt the current configured settings with a function. |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bind](#bind(scala.Function1))​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>> f)` | Bind a new HTTP server at the given endpoint and use the given asynchronous `handler` `Flow` for processing all incoming connections. |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindFlow](#bindFlow(akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​?> handlerFlow)` | Binds a new HTTP server at the given endpoint and uses the given `handler` `Flow` for processing all incoming connections. |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindSync](#bindSync(scala.Function1))​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> f)` | Bind a new HTTP server at the given endpoint and uses the given `handler` `Flow` for processing all incoming connections. |
	| `akka.stream.scaladsl.Source<[Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl"),​scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>>` | `[connectionSource](#connectionSource())()` | Creates a `Source` of [`Http.IncomingConnection`](Http.IncomingConnection.html "class in akka.http.scaladsl") instances which represents a prospective HTTP server binding  on the given `endpoint`. |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[enableHttps](#enableHttps(akka.http.scaladsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") context)` | Enable HTTPS for this binding with the given context. |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[logTo](#logTo(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` | Use a custom logger |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[onInterface](#onInterface(java.lang.String))​(java.lang.String interface_)` | Change interface to bind to |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[onPort](#onPort(int))​(int port)` | Change port to bind to |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer))​(akka.stream.Materializer materializer)` | Use custom `Materializer` for the binding |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[withSettings](#withSettings(akka.http.scaladsl.settings.ServerSettings))​([ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` | Use custom `ServerSettings` for the binding. |

- - ### Method Detail
	
	
	
		- #### onInterface
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") onInterface​(java.lang.String interface_)
		```
		
		Change interface to bind to
		- #### onPort
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") onPort​(int port)
		```
		
		Change port to bind to
		- #### logTo
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") logTo​(akka.event.LoggingAdapter log)
		```
		
		Use a custom logger
		- #### withSettings
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") withSettings​([ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Use custom `ServerSettings` for the binding.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### adaptSettings
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") adaptSettings​(scala.Function1<[ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings"),​[ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings")> f)
		```
		
		Adapt the current configured settings with a function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### enableHttps
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") enableHttps​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") context)
		```
		
		Enable HTTPS for this binding with the given context.
		
		Parameters:
		`context` \- (undocumented)
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") withMaterializer​(akka.stream.Materializer materializer)
		```
		
		Use custom `Materializer` for the binding
		
		Parameters:
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bind
		
		
		
		```
		scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bind​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>> f)
		```
		
		Bind a new HTTP server at the given endpoint and use the given asynchronous `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 Supports HTTP/2 on the same port if http2 support is enabled.
		
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindSync
		
		
		
		```
		scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindSync​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> f)
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
		scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindFlow​(akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​?> handlerFlow)
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
		akka.stream.scaladsl.Source<[Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl"),​scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>> connectionSource()
		```
		
		Creates a `Source` of [`Http.IncomingConnection`](Http.IncomingConnection.html "class in akka.http.scaladsl") instances which represents a prospective HTTP server binding
		 on the given `endpoint`.
		 
		 Note that each materialization will create a new binding, so
		 
		
		
		 \* if the configured port is 0 the resulting source can be materialized several times. Each materialization will
		 then be assigned a new local port by the operating system, which can then be retrieved by the materialized
		 [`Http.ServerBinding`](Http.ServerBinding.html "class in akka.http.scaladsl").
		 
		
		
		 \* if the configured port is non\-zero subsequent materialization attempts of the produced source will immediately
		 fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
		 [`Http.ServerBinding`](Http.ServerBinding.html "class in akka.http.scaladsl").
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.IncomingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder.html)*