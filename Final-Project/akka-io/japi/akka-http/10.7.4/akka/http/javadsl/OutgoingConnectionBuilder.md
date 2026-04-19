---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html
title: OutgoingConnectionBuilder
---

# OutgoingConnectionBuilder

## Content

Package [akka.http.javadsl](package-summary.html)
## Interface OutgoingConnectionBuilder

- ---

```
public interface OutgoingConnectionBuilder
```

Builder for setting up a flow that will create one single connection per materialization to the specified host.
 When customization is done, the flow is created using [`http()`](#http()), [`https()`](#https()), [`http2()`](#http2()) or [`http2WithPriorKnowledge()`](#http2WithPriorKnowledge()).
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[http](#http())()` | Create a flow that when materialized creates a single HTTP/1\.1 plaintext connection with a default port 80 to the server. |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[http2](#http2())()` | Create a flow that when materialized creates a single HTTP/2 TLS connection with a default port 443 |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[http2WithPriorKnowledge](#http2WithPriorKnowledge())()` | Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80 |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[https](#https())()` | Create a flow that when materialized creates a single HTTP/1\.1 TLS connection with a default port 443 |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[logTo](#logTo(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter logger)` | Use a custom logger |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[managedPersistentHttp2](#managedPersistentHttp2())()` | Create a flow that when materialized creates a managed HTTP/2 TLS connection with a default port 443\. |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[managedPersistentHttp2WithPriorKnowledge](#managedPersistentHttp2WithPriorKnowledge())()` | Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80 |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[toHost](#toHost(java.lang.String))​(java.lang.String host)` | Change which host flows built with this builder connects to |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[toPort](#toPort(int))​(int port)` | Change with port flows built with this builder connects to, if not set  the protocol default is used. |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[withClientConnectionSettings](#withClientConnectionSettings(akka.http.javadsl.settings.ClientConnectionSettings))​([ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings)` | Use custom `ClientConnectionSettings` for the connection. |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[withCustomHttpsConnectionContext](#withCustomHttpsConnectionContext(akka.http.javadsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsConnectionContext)` | Use a custom [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl") for the connection. |

- - ### Method Detail
	
	
	
		- #### http
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> http()
		```
		
		Create a flow that when materialized creates a single HTTP/1\.1 plaintext connection with a default port 80 to the server.
		
		Returns:
		(undocumented)
		- #### http2
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> http2()
		```
		
		Create a flow that when materialized creates a single HTTP/2 TLS connection with a default port 443
		 
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
		 so therefore requests needs to have a [`RequestResponseAssociation`](../scaladsl/model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### http2WithPriorKnowledge
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> http2WithPriorKnowledge()
		```
		
		Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80
		 
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
		 so therefore requests needs to have a [`RequestResponseAssociation`](../scaladsl/model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### https
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> https()
		```
		
		Create a flow that when materialized creates a single HTTP/1\.1 TLS connection with a default port 443
		
		Returns:
		(undocumented)
		- #### logTo
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl") logTo​(akka.event.LoggingAdapter logger)
		```
		
		Use a custom logger
		
		Parameters:
		`logger` \- (undocumented)
		Returns:
		(undocumented)
		- #### managedPersistentHttp2
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> managedPersistentHttp2()
		```
		
		Create a flow that when materialized creates a managed HTTP/2 TLS connection with a default port 443\.
		 
		 The connection will be re\-established as needed.
		 
		
		
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out
		 so therefore requests needs to have a [`RequestResponseAssociation`](../scaladsl/model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### managedPersistentHttp2WithPriorKnowledge
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> managedPersistentHttp2WithPriorKnowledge()
		```
		
		Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80
		 
		 The connection will be re\-established as needed.
		 
		
		
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
		 so therefore requests needs to have a [`RequestResponseAssociation`](../scaladsl/model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### toHost
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl") toHost​(java.lang.String host)
		```
		
		Change which host flows built with this builder connects to
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### toPort
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl") toPort​(int port)
		```
		
		Change with port flows built with this builder connects to, if not set
		 the protocol default is used.
		
		Parameters:
		`port` \- (undocumented)
		Returns:
		(undocumented)
		- #### withClientConnectionSettings
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl") withClientConnectionSettings​([ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		Use custom `ClientConnectionSettings` for the connection.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### withCustomHttpsConnectionContext
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl") withCustomHttpsConnectionContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsConnectionContext)
		```
		
		Use a custom [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl") for the connection.
		 Only applicable for `https()` and `http2()`, overrides `defaultHttpsContext`
		
		Parameters:
		`httpsConnectionContext` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestResponseAssociation.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html)*