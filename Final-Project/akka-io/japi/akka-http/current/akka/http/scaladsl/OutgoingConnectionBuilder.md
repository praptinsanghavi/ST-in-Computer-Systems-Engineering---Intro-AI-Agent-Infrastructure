---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
title: OutgoingConnectionBuilder
---

# OutgoingConnectionBuilder

## Content

Package [akka.http.scaladsl](package-summary.html)
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
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[http](#http())()` | Create a flow that when materialized creates a single HTTP/1\.1 plaintext connection with a default port 80 to the server. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[http2](#http2())()` | Create a flow that when materialized creates a single HTTP/2 TLS connection with a default port 443 |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[http2WithPriorKnowledge](#http2WithPriorKnowledge())()` | Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80 |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[https](#https())()` | Create a flow that when materialized creates a single HTTP/1\.1 TLS connection with a default port 443 |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl")` | `[logTo](#logTo(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter logger)` | Use a custom logger |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[managedPersistentHttp2](#managedPersistentHttp2())()` | Create a flow that when materialized creates a managed HTTP/2 TLS connection with a default port 443\. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[managedPersistentHttp2WithPriorKnowledge](#managedPersistentHttp2WithPriorKnowledge())()` | Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80 |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl")` | `[toHost](#toHost(java.lang.String))​(java.lang.String host)` | Change which host flows built with this builder connects to |
	| `[OutgoingConnectionBuilder](../javadsl/OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[toJava](#toJava())()` | INTERNAL API |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl")` | `[toPort](#toPort(int))​(int port)` | Change with port flows built with this builder connects to, if not set  the protocol default is used. |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl")` | `[withClientConnectionSettings](#withClientConnectionSettings(akka.http.scaladsl.settings.ClientConnectionSettings))​([ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings)` | Use custom `ClientConnectionSettings` for the connection. |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl")` | `[withCustomHttpsConnectionContext](#withCustomHttpsConnectionContext(akka.http.scaladsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") httpsConnectionContext)` | Use a custom [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl") for the connection. |

- - ### Method Detail
	
	
	
		- #### http
		
		
		
		```
		akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> http()
		```
		
		Create a flow that when materialized creates a single HTTP/1\.1 plaintext connection with a default port 80 to the server.
		
		Returns:
		(undocumented)
		- #### http2
		
		
		
		```
		akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> http2()
		```
		
		Create a flow that when materialized creates a single HTTP/2 TLS connection with a default port 443
		 
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
		 so therefore requests needs to have a [`RequestResponseAssociation`](model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### http2WithPriorKnowledge
		
		
		
		```
		akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> http2WithPriorKnowledge()
		```
		
		Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80
		 
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
		 so therefore requests needs to have a [`RequestResponseAssociation`](model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### https
		
		
		
		```
		akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> https()
		```
		
		Create a flow that when materialized creates a single HTTP/1\.1 TLS connection with a default port 443
		
		Returns:
		(undocumented)
		- #### logTo
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") logTo​(akka.event.LoggingAdapter logger)
		```
		
		Use a custom logger
		
		Parameters:
		`logger` \- (undocumented)
		Returns:
		(undocumented)
		- #### managedPersistentHttp2
		
		
		
		```
		akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> managedPersistentHttp2()
		```
		
		Create a flow that when materialized creates a managed HTTP/2 TLS connection with a default port 443\.
		 
		 The connection will be re\-established as needed.
		 
		
		
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out
		 so therefore requests needs to have a [`RequestResponseAssociation`](model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### managedPersistentHttp2WithPriorKnowledge
		
		
		
		```
		akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> managedPersistentHttp2WithPriorKnowledge()
		```
		
		Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80
		 
		 The connection will be re\-established as needed.
		 
		
		
		 Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
		 so therefore requests needs to have a [`RequestResponseAssociation`](model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
		 which Akka HTTP will carry over to the corresponding response for a request.
		
		
		
		Returns:
		(undocumented)
		- #### toHost
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") toHost​(java.lang.String host)
		```
		
		Change which host flows built with this builder connects to
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### toJava
		
		
		
		```
		[OutgoingConnectionBuilder](../javadsl/OutgoingConnectionBuilder.html "interface in akka.http.javadsl") toJava()
		```
		
		INTERNAL API
		
		Returns:
		(undocumented)
		- #### toPort
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") toPort​(int port)
		```
		
		Change with port flows built with this builder connects to, if not set
		 the protocol default is used.
		
		Parameters:
		`port` \- (undocumented)
		Returns:
		(undocumented)
		- #### withClientConnectionSettings
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") withClientConnectionSettings​([ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Use custom `ClientConnectionSettings` for the connection.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### withCustomHttpsConnectionContext
		
		
		
		```
		[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") withCustomHttpsConnectionContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") httpsConnectionContext)
		```
		
		Use a custom [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl") for the connection.
		 Only applicable for `https()` and `http2()`, overrides `defaultHttpsContext`
		
		Parameters:
		`httpsConnectionContext` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestResponseAssociation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html)*