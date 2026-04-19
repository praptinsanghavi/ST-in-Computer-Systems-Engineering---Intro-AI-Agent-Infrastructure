---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html
title: ServerBinding
---

# ServerBinding

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ServerBinding

- java.lang.Object
- - akka.http.javadsl.ServerBinding

- ---

```
public class ServerBinding
extends java.lang.Object
```

Represents a prospective HTTP server binding.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerBinding](#%3Cinit%3E(akka.http.scaladsl.Http.ServerBinding))​([Http.ServerBinding](../scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ServerBinding](ServerBinding.html "class in akka.http.javadsl")` | `[addToCoordinatedShutdown](#addToCoordinatedShutdown(java.time.Duration,akka.actor.ClassicActorSystemProvider))​(java.time.Duration hardTerminationDeadline,  akka.actor.ClassicActorSystemProvider system)` | Adds this `ServerBinding` to the actor system's coordinated shutdown, so that [`unbind()`](#unbind()) and [`terminate(java.time.Duration)`](#terminate(java.time.Duration)) get  called appropriately before the system is shut down. |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` | The local address of the endpoint bound by the materialization of the `connections` `Source`. |
	| `java.util.concurrent.CompletionStage<[HttpTerminated](HttpTerminated.html "class in akka.http.javadsl")>` | `[terminate](#terminate(java.time.Duration))​(java.time.Duration hardDeadline)` | Triggers "graceful" termination request being handled on this connection. |
	| `java.util.concurrent.CompletionStage<akka.Done>` | `[unbind](#unbind())()` | Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections` `Source` |
	| `java.util.concurrent.CompletionStage<[HttpTerminated](HttpTerminated.html "class in akka.http.javadsl")>` | `[whenTerminated](#whenTerminated())()` | This completion stage completes when the termination process, as initiated by an [`terminate(java.time.Duration)`](#terminate(java.time.Duration)) call has completed. |
	| `java.util.concurrent.CompletionStage<java.time.Duration>` | `[whenTerminationSignalIssued](#whenTerminationSignalIssued())()` | Completes when the [`terminate(java.time.Duration)`](#terminate(java.time.Duration)) is called and server termination is in progress. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServerBinding
		
		
		
		```
		public ServerBinding​([Http.ServerBinding](../scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl") delegate)
		```

	- ### Method Detail
	
	
	
		- #### addToCoordinatedShutdown
		
		
		
		```
		public [ServerBinding](ServerBinding.html "class in akka.http.javadsl") addToCoordinatedShutdown​(java.time.Duration hardTerminationDeadline,
		                                              akka.actor.ClassicActorSystemProvider system)
		```
		
		Adds this `ServerBinding` to the actor system's coordinated shutdown, so that [`unbind()`](#unbind()) and [`terminate(java.time.Duration)`](#terminate(java.time.Duration)) get
		 called appropriately before the system is shut down.
		 
		
		Parameters:
		`hardTerminationDeadline` \- timeout after which all requests and connections shall be forcefully terminated
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		
		The local address of the endpoint bound by the materialization of the `connections` `Source`.
		
		Returns:
		(undocumented)
		- #### terminate
		
		
		
		```
		public java.util.concurrent.CompletionStage<[HttpTerminated](HttpTerminated.html "class in akka.http.javadsl")> terminate​(java.time.Duration hardDeadline)
		```
		
		Triggers "graceful" termination request being handled on this connection.
		 
		 Termination works as follows:
		 
		
		
		 1\) Unbind:
		 \- the server port is unbound; no new connections will be accepted.
		 
		
		
		 1\.5\) Immediately the ServerBinding `whenTerminationSignalIssued` future is completed.
		 This can be used to signal parts of the application that the http server is shutting down and they should clean up as well.
		 Note also that for more advanced shut down scenarios you may want to use the Coordinated Shutdown capabilities of Akka.
		 
		
		
		 2\) if a connection has no "in\-flight" request, it is terminated immediately
		 
		
		
		 3\) Handle in\-flight request:
		 \- if a request is "in\-flight" (being handled by user code), it is given `hardDeadline` time to complete,
		 \- if user code emits a response within the timeout, then this response is sent to the client with a `Connection: close` header and the connection is closed.
		 \- however if it is a streaming response, it is also mandated that it shall complete within the deadline, and if it does not
		 the connection will be terminated regardless of status of the streaming response (this is because such response could be infinite,
		 which could trap the server in a situation where it could not terminate if it were to wait for a response to "finish")
		 \- existing streaming responses must complete before the deadline as well.
		 When the deadline is reached the connection will be terminated regardless of status of the streaming responses.
		 \- if user code does not reply with a response within the deadline we produce a special `akka.http.javadsl.settings.ServerSettings.getTerminationDeadlineExceededResponse`
		 HTTP response (e.g. 503 Service Unavailable)
		 
		
		
		 4\) Keep draining incoming requests on existing connection:
		 \- The existing connection will remain alive for until the `hardDeadline` is exceeded,
		 yet no new requests will be delivered to the user handler. All such drained responses will be replied to with an
		 termination response (as explained in phase 3\).
		 
		
		
		 5\) Close still existing connections
		 \- Connections are terminated forcefully once the `hardDeadline` is exceeded.
		 The `whenTerminated` future is completed as well, so the graceful termination (of the `ActorSystem` or entire JVM
		 itself can be safely performed, as by then it is known that no connections remain alive to this server).
		 
		
		
		 Note that the termination response is configurable in [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"), and by default is an `503 Service Unavailable`,
		 with an empty response entity.
		 
		
		
		
		Parameters:
		`hardDeadline` \- timeout after which all requests and connections shall be forcefully terminated
		Returns:
		completion stage which completes successfully with a marker object once all connections have been terminated
		- #### unbind
		
		
		
		```
		public java.util.concurrent.CompletionStage<akka.Done> unbind()
		```
		
		Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections`
		`Source`
		
		 The produced `CompletionStage` is fulfilled when the unbinding has been completed.
		
		
		
		Returns:
		(undocumented)
		- #### whenTerminated
		
		
		
		```
		public java.util.concurrent.CompletionStage<[HttpTerminated](HttpTerminated.html "class in akka.http.javadsl")> whenTerminated()
		```
		
		This completion stage completes when the termination process, as initiated by an [`terminate(java.time.Duration)`](#terminate(java.time.Duration)) call has completed.
		 This means that the server is by then: unbound, and has closed all existing connections.
		 
		 This signal can for example be used to safely terminate the underlying ActorSystem.
		 
		
		
		 Note: This mechanism is currently NOT hooked into the Coordinated Shutdown mechanisms of Akka.
		 TODO: This feature request is tracked by: https://github.com/akka/akka\-http/issues/1210
		 
		
		
		 Note that this signal may be used for Coordinated Shutdown to proceed to next steps in the shutdown.
		 You may also explicitly depend on this completion stage to perform your next shutting down steps.
		
		
		
		Returns:
		(undocumented)
		- #### whenTerminationSignalIssued
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.time.Duration> whenTerminationSignalIssued()
		```
		
		Completes when the [`terminate(java.time.Duration)`](#terminate(java.time.Duration)) is called and server termination is in progress.
		 Can be useful to make parts of your application aware that termination has been issued,
		 and they have `Duration` time remaining to clean\-up before the server will forcefully close
		 existing connections.
		 
		 Note that while termination is in progress, no new connections will be accepted (i.e. termination implies prior [`unbind()`](#unbind())).
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/Http.ServerBinding.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html)*