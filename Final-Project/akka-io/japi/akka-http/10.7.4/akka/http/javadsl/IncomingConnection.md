---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/IncomingConnection.html
title: IncomingConnection
---

# IncomingConnection

## Content

Package [akka.http.javadsl](package-summary.html)
## Class IncomingConnection

- java.lang.Object
- - akka.http.javadsl.IncomingConnection

- ---

```
public class IncomingConnection
extends java.lang.Object
```

Represents one accepted incoming HTTP connection.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IncomingConnection](#%3Cinit%3E(akka.http.scaladsl.Http.IncomingConnection))​([Http.IncomingConnection](../scaladsl/Http.IncomingConnection.html "class in akka.http.scaladsl") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Flow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[flow](#flow())()` | A flow representing the incoming requests and outgoing responses for this connection. |
	| `<Mat> Mat` | `[handleWith](#handleWith(akka.stream.javadsl.Flow,akka.stream.Materializer))​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​Mat> handler,  akka.stream.Materializer materializer)` | Handles the connection with the given flow, which is materialized exactly once  and the respective materialization result returned. |
	| `void` | `[handleWithAsyncHandler](#handleWithAsyncHandler(akka.japi.function.Function,int,akka.stream.Materializer))​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,  int parallelism,  akka.stream.Materializer materializer)` | Handles the connection with the given handler function. |
	| `void` | `[handleWithAsyncHandler](#handleWithAsyncHandler(akka.japi.function.Function,akka.stream.Materializer))​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,  akka.stream.Materializer materializer)` | Handles the connection with the given handler function. |
	| `void` | `[handleWithSyncHandler](#handleWithSyncHandler(akka.japi.function.Function,akka.stream.Materializer))​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler,  akka.stream.Materializer materializer)` | Handles the connection with the given handler function. |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` | The local address of this connection. |
	| `java.net.InetSocketAddress` | `[remoteAddress](#remoteAddress())()` | The address of the remote peer. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IncomingConnection
		
		
		
		```
		public IncomingConnection​([Http.IncomingConnection](../scaladsl/Http.IncomingConnection.html "class in akka.http.scaladsl") delegate)
		```

	- ### Method Detail
	
	
	
		- #### flow
		
		
		
		```
		public akka.stream.javadsl.Flow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed> flow()
		```
		
		A flow representing the incoming requests and outgoing responses for this connection.
		 
		 Use `Flow.join` or one of the handleXXX methods to consume handle requests on this connection.
		
		
		
		Returns:
		(undocumented)
		- #### handleWith
		
		
		
		```
		public <Mat> Mat handleWith​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​Mat> handler,
		                            akka.stream.Materializer materializer)
		```
		
		Handles the connection with the given flow, which is materialized exactly once
		 and the respective materialization result returned.
		
		Parameters:
		`handler` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleWithAsyncHandler
		
		
		
		```
		public void handleWithAsyncHandler​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,
		                                   akka.stream.Materializer materializer)
		```
		
		Handles the connection with the given handler function.
		
		Parameters:
		`handler` \- (undocumented)
		`materializer` \- (undocumented)
		- #### handleWithAsyncHandler
		
		
		
		```
		public void handleWithAsyncHandler​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,
		                                   int parallelism,
		                                   akka.stream.Materializer materializer)
		```
		
		Handles the connection with the given handler function.
		
		Parameters:
		`handler` \- (undocumented)
		`parallelism` \- (undocumented)
		`materializer` \- (undocumented)
		- #### handleWithSyncHandler
		
		
		
		```
		public void handleWithSyncHandler​(akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler,
		                                  akka.stream.Materializer materializer)
		```
		
		Handles the connection with the given handler function.
		
		Parameters:
		`handler` \- (undocumented)
		`materializer` \- (undocumented)
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		
		The local address of this connection.
		
		Returns:
		(undocumented)
		- #### remoteAddress
		
		
		
		```
		public java.net.InetSocketAddress remoteAddress()
		```
		
		The address of the remote peer.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/Http.IncomingConnection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/IncomingConnection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/IncomingConnection.html)*