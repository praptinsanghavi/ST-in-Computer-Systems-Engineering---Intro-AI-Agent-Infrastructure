---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription.html
title: SlotState.WaitingForResponseEntitySubscription
---

# SlotState.WaitingForResponseEntitySubscription

## Content

Package [akka.http.impl.engine.client.pool](package-summary.html)
## Class SlotState.WaitingForResponseEntitySubscription

- java.lang.Object
- - [akka.http.impl.engine.client.pool.SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")
	- - [akka.http.impl.engine.client.pool.SlotState.ConnectedState](SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool")
		- - akka.http.impl.engine.client.pool.SlotState.WaitingForResponseEntitySubscription

- All Implemented Interfaces:
`[SlotState.BusyState](SlotState.BusyState.html "interface in akka.http.impl.engine.client.pool")`, `[SlotState.BusyWithResultAlreadyDetermined](SlotState.BusyWithResultAlreadyDetermined.html "interface in akka.http.impl.engine.client.pool")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")

---

```
public static final class SlotState.WaitingForResponseEntitySubscription
extends [SlotState.ConnectedState](SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool")
implements [SlotState.BusyWithResultAlreadyDetermined](SlotState.BusyWithResultAlreadyDetermined.html "interface in akka.http.impl.engine.client.pool"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../../serialized-form.html#akka.http.impl.engine.client.pool.SlotState.WaitingForResponseEntitySubscription)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.impl.engine.client.pool.[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")
		
		
		`[SlotState.BusyState](SlotState.BusyState.html "interface in akka.http.impl.engine.client.pool"), [SlotState.BusyWithResultAlreadyDetermined](SlotState.BusyWithResultAlreadyDetermined.html "interface in akka.http.impl.engine.client.pool"), [SlotState.ConnectedState](SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool"), [SlotState.Connecting](SlotState.Connecting.html "class in akka.http.impl.engine.client.pool"), [SlotState.Connecting$](SlotState.Connecting$.html "class in akka.http.impl.engine.client.pool"), [SlotState.Embargoed](SlotState.Embargoed.html "class in akka.http.impl.engine.client.pool"), [SlotState.Embargoed$](SlotState.Embargoed$.html "class in akka.http.impl.engine.client.pool"), [SlotState.Failed](SlotState.Failed.html "class in akka.http.impl.engine.client.pool"), [SlotState.Failed$](SlotState.Failed$.html "class in akka.http.impl.engine.client.pool"), [SlotState.Idle](SlotState.Idle.html "class in akka.http.impl.engine.client.pool"), [SlotState.Idle$](SlotState.Idle$.html "class in akka.http.impl.engine.client.pool"), [SlotState.IdleState](SlotState.IdleState.html "interface in akka.http.impl.engine.client.pool"), [SlotState.OutOfEmbargo$](SlotState.OutOfEmbargo$.html "class in akka.http.impl.engine.client.pool"), [SlotState.PreConnecting$](SlotState.PreConnecting$.html "class in akka.http.impl.engine.client.pool"), [SlotState.PushingRequestToConnection](SlotState.PushingRequestToConnection.html "class in akka.http.impl.engine.client.pool"), [SlotState.PushingRequestToConnection$](SlotState.PushingRequestToConnection$.html "class in akka.http.impl.engine.client.pool"), [SlotState.ShouldCloseConnectionState](SlotState.ShouldCloseConnectionState.html "class in akka.http.impl.engine.client.pool"), [SlotState.ToBeClosed$](SlotState.ToBeClosed$.html "class in akka.http.impl.engine.client.pool"), [SlotState.Unconnected$](SlotState.Unconnected$.html "class in akka.http.impl.engine.client.pool"), [SlotState.UnconnectedState](SlotState.UnconnectedState.html "interface in akka.http.impl.engine.client.pool"), [SlotState.WaitingForEndOfRequestEntity$](SlotState.WaitingForEndOfRequestEntity$.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForEndOfResponseEntity](SlotState.WaitingForEndOfResponseEntity.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForEndOfResponseEntity$](SlotState.WaitingForEndOfResponseEntity$.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForResponse](SlotState.WaitingForResponse.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForResponse$](SlotState.WaitingForResponse$.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForResponseDispatch](SlotState.WaitingForResponseDispatch.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForResponseDispatch$](SlotState.WaitingForResponseDispatch$.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForResponseEntitySubscription](SlotState.WaitingForResponseEntitySubscription.html "class in akka.http.impl.engine.client.pool"), [SlotState.WaitingForResponseEntitySubscription$](SlotState.WaitingForResponseEntitySubscription$.html "class in akka.http.impl.engine.client.pool")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WaitingForResponseEntitySubscription](#%3Cinit%3E(akka.http.impl.engine.client.PoolFlow.RequestContext,akka.http.scaladsl.model.HttpResponse,scala.concurrent.duration.Duration,boolean))​([PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") ongoingRequest,  [HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") ongoingResponse,  scala.concurrent.duration.Duration stateTimeout,  boolean waitingForEndOfRequestEntity)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")` | `[ongoingRequest](#ongoingRequest())()` |  |
	| `[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[ongoingResponse](#ongoingResponse())()` |  |
	| `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")` | `[onRequestEntityCompleted](#onRequestEntityCompleted(akka.http.impl.engine.client.pool.SlotContext))​([SlotContext](SlotContext.html "class in akka.http.impl.engine.client.pool") ctx)` | Will be called either immediately if the request entity is strict or otherwise later |
	| `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")` | `[onResponseEntitySubscribed](#onResponseEntitySubscribed(akka.http.impl.engine.client.pool.SlotContext))​([SlotContext](SlotContext.html "class in akka.http.impl.engine.client.pool") ctx)` |  |
	| `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")` | `[onTimeout](#onTimeout(akka.http.impl.engine.client.pool.SlotContext))​([SlotContext](SlotContext.html "class in akka.http.impl.engine.client.pool") ctx)` |  |
	| `scala.concurrent.duration.Duration` | `[stateTimeout](#stateTimeout())()` | A slot can define a timeout for that state after which onTimeout will be called. |
	| `boolean` | `[waitingForEndOfRequestEntity](#waitingForEndOfRequestEntity())()` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.client.pool.[SlotState.ConnectedState](SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool")
		
		
		`[isConnected](SlotState.ConnectedState.html#isConnected()), [onNewConnectionEmbargo](SlotState.ConnectedState.html#onNewConnectionEmbargo(akka.http.impl.engine.client.pool.SlotContext,scala.concurrent.duration.FiniteDuration))`
		- ### Methods inherited from class akka.http.impl.engine.client.pool.[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")
		
		
		`[idle](SlotState.html#idle(akka.http.impl.engine.client.pool.SlotContext)), [illegalState](SlotState.html#illegalState(akka.http.impl.engine.client.pool.SlotContext,java.lang.String)), [isIdle](SlotState.html#isIdle()), [name](SlotState.html#name()), [onConnectionAttemptFailed](SlotState.html#onConnectionAttemptFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onConnectionAttemptSucceeded](SlotState.html#onConnectionAttemptSucceeded(akka.http.impl.engine.client.pool.SlotContext,akka.http.scaladsl.Http.OutgoingConnection)), [onConnectionCompleted](SlotState.html#onConnectionCompleted(akka.http.impl.engine.client.pool.SlotContext)), [onConnectionFailed](SlotState.html#onConnectionFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onNewRequest](SlotState.html#onNewRequest(akka.http.impl.engine.client.pool.SlotContext,akka.http.impl.engine.client.PoolFlow.RequestContext)), [onPreConnect](SlotState.html#onPreConnect(akka.http.impl.engine.client.pool.SlotContext)), [onRequestDispatched](SlotState.html#onRequestDispatched(akka.http.impl.engine.client.pool.SlotContext)), [onRequestEntityFailed](SlotState.html#onRequestEntityFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onResponseDispatchable](SlotState.html#onResponseDispatchable(akka.http.impl.engine.client.pool.SlotContext)), [onResponseEntityCompleted](SlotState.html#onResponseEntityCompleted(akka.http.impl.engine.client.pool.SlotContext)), [onResponseEntityFailed](SlotState.html#onResponseEntityFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onResponseReceived](SlotState.html#onResponseReceived(akka.http.impl.engine.client.pool.SlotContext,akka.http.scaladsl.model.HttpResponse)), [onShutdown](SlotState.html#onShutdown(akka.http.impl.engine.client.pool.SlotContext))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.engine.client.pool.[SlotState.BusyState](SlotState.BusyState.html "interface in akka.http.impl.engine.client.pool")
		
		
		`[failOngoingRequest](SlotState.BusyState.html#failOngoingRequest(akka.http.impl.engine.client.pool.SlotContext,java.lang.String,java.lang.Throwable)), [isIdle](SlotState.BusyState.html#isIdle()), [onConnectionAttemptFailed](SlotState.BusyState.html#onConnectionAttemptFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onShutdown](SlotState.BusyState.html#onShutdown(akka.http.impl.engine.client.pool.SlotContext))`
		- ### Methods inherited from interface akka.http.impl.engine.client.pool.[SlotState.BusyWithResultAlreadyDetermined](SlotState.BusyWithResultAlreadyDetermined.html "interface in akka.http.impl.engine.client.pool")
		
		
		`[onConnectionCompleted](SlotState.BusyWithResultAlreadyDetermined.html#onConnectionCompleted(akka.http.impl.engine.client.pool.SlotContext)), [onConnectionFailed](SlotState.BusyWithResultAlreadyDetermined.html#onConnectionFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onRequestEntityFailed](SlotState.BusyWithResultAlreadyDetermined.html#onRequestEntityFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable)), [onResponseEntityFailed](SlotState.BusyWithResultAlreadyDetermined.html#onResponseEntityFailed(akka.http.impl.engine.client.pool.SlotContext,java.lang.Throwable))`

- - ### Constructor Detail
	
	
	
		- #### WaitingForResponseEntitySubscription
		
		
		
		```
		public WaitingForResponseEntitySubscription​([PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") ongoingRequest,
		                                            [HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") ongoingResponse,
		                                            scala.concurrent.duration.Duration stateTimeout,
		                                            boolean waitingForEndOfRequestEntity)
		```

	- ### Method Detail
	
	
	
		- #### ongoingRequest
		
		
		
		```
		public [PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") ongoingRequest()
		```
		
		
		Specified by:
		`[ongoingRequest](SlotState.BusyState.html#ongoingRequest())` in interface `[SlotState.BusyState](SlotState.BusyState.html "interface in akka.http.impl.engine.client.pool")`
		- #### ongoingResponse
		
		
		
		```
		public [HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") ongoingResponse()
		```
		- #### stateTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration stateTimeout()
		```
		
		Description copied from class: `[SlotState](SlotState.html#stateTimeout())`
		A slot can define a timeout for that state after which onTimeout will be called.
		
		Overrides:
		`[stateTimeout](SlotState.html#stateTimeout())` in class `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")`
		- #### waitingForEndOfRequestEntity
		
		
		
		```
		public boolean waitingForEndOfRequestEntity()
		```
		
		
		Specified by:
		`[waitingForEndOfRequestEntity](SlotState.BusyState.html#waitingForEndOfRequestEntity())` in interface `[SlotState.BusyState](SlotState.BusyState.html "interface in akka.http.impl.engine.client.pool")`
		- #### onRequestEntityCompleted
		
		
		
		```
		public [SlotState](SlotState.html "class in akka.http.impl.engine.client.pool") onRequestEntityCompleted​([SlotContext](SlotContext.html "class in akka.http.impl.engine.client.pool") ctx)
		```
		
		Description copied from class: `[SlotState](SlotState.html#onRequestEntityCompleted(akka.http.impl.engine.client.pool.SlotContext))`
		Will be called either immediately if the request entity is strict or otherwise later
		
		Overrides:
		`[onRequestEntityCompleted](SlotState.html#onRequestEntityCompleted(akka.http.impl.engine.client.pool.SlotContext))` in class `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")`
		- #### onResponseEntitySubscribed
		
		
		
		```
		public [SlotState](SlotState.html "class in akka.http.impl.engine.client.pool") onResponseEntitySubscribed​([SlotContext](SlotContext.html "class in akka.http.impl.engine.client.pool") ctx)
		```
		
		
		Overrides:
		`[onResponseEntitySubscribed](SlotState.html#onResponseEntitySubscribed(akka.http.impl.engine.client.pool.SlotContext))` in class `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")`
		- #### onTimeout
		
		
		
		```
		public [SlotState](SlotState.html "class in akka.http.impl.engine.client.pool") onTimeout​([SlotContext](SlotContext.html "class in akka.http.impl.engine.client.pool") ctx)
		```
		
		
		Overrides:
		`[onTimeout](SlotState.html#onTimeout(akka.http.impl.engine.client.pool.SlotContext))` in class `[SlotState](SlotState.html "class in akka.http.impl.engine.client.pool")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.BusyState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.BusyWithResultAlreadyDetermined.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.ConnectedState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Connecting$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Connecting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Embargoed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Embargoed.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Failed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Failed.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Idle$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Idle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.IdleState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.OutOfEmbargo$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.PreConnecting$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.PushingRequestToConnection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.PushingRequestToConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.ShouldCloseConnectionState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.ToBeClosed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.Unconnected$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.UnconnectedState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfRequestEntity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfResponseEntity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponse$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseDispatch$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseDispatch.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription.html)*