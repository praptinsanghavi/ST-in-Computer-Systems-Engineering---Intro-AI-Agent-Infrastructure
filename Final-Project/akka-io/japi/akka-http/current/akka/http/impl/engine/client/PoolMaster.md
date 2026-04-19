---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html
title: PoolMaster
---

# PoolMaster

## Content

Package [akka.http.impl.engine.client](package-summary.html)
## Class PoolMaster

- java.lang.Object
- - akka.http.impl.engine.client.PoolMaster

- ---

```
public class PoolMaster
extends java.lang.Object
```

INTERNAL API
 
 API for accessing the global pool master actor.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolMaster](#%3Cinit%3E(akka.actor.ActorRef))​(akka.actor.ActorRef ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client")` | `[apply](#apply(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |
	| `scala.concurrent.Future<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[dispatchRequest](#dispatchRequest(akka.http.impl.engine.client.PoolId,akka.http.scaladsl.model.HttpRequest,akka.stream.Materializer))​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,  [HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request,  akka.stream.Materializer fm)` | Send a request through the corresponding pool. |
	| `scala.concurrent.Future<java.lang.Object>` | `[poolSize](#poolSize())()` | For testing only |
	| `akka.actor.ActorRef` | `[ref](#ref())()` |  |
	| `scala.concurrent.Future<akka.Done>` | `[shutdown](#shutdown(akka.http.impl.engine.client.PoolId))​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId)` | Shutdown the corresponding pool and signal its termination. |
	| `scala.concurrent.Future<akka.Done>` | `[shutdownAll](#shutdownAll())()` | Triggers an orderly shutdown of all host connections pools currently maintained by the `ActorSystem`. |
	| `void` | `[startPool](#startPool(akka.http.impl.engine.client.PoolId,akka.stream.Materializer))​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,  akka.stream.Materializer fm)` | Start the corresponding pool to make it ready to serve requests. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PoolMaster
		
		
		
		```
		public PoolMaster​(akka.actor.ActorRef ref)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client") apply​(akka.actor.ExtendedActorSystem system)
		```
		- #### ref
		
		
		
		```
		public akka.actor.ActorRef ref()
		```
		- #### dispatchRequest
		
		
		
		```
		public scala.concurrent.Future<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> dispatchRequest​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,
		                                                             [HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                                                             akka.stream.Materializer fm)
		```
		
		Send a request through the corresponding pool. If the pool is not running, it will be started
		 automatically. If it is shutting down, it will restart as soon as the shutdown operation is
		 complete and serve this request.
		 
		
		Parameters:
		`request` \- the request
		`poolId` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		the response
		- #### startPool
		
		
		
		```
		public void startPool​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,
		                      akka.stream.Materializer fm)
		```
		
		Start the corresponding pool to make it ready to serve requests. If the pool is already started,
		 this does nothing. If it is being shutdown, it will restart as soon as the shutdown operation
		 is complete.
		 
		
		Parameters:
		`poolId` \- (undocumented)
		`fm` \- (undocumented)
		- #### shutdown
		
		
		
		```
		public scala.concurrent.Future<akka.Done> shutdown​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId)
		```
		
		Shutdown the corresponding pool and signal its termination. If the pool is not running or is
		 being shutting down, this does nothing.
		 
		 The shutdown will wait for all ongoing requests to be completed.
		 
		
		
		
		Parameters:
		`poolId` \- (undocumented)
		Returns:
		a Future completed when the pool has been shutdown.
		- #### shutdownAll
		
		
		
		```
		public scala.concurrent.Future<akka.Done> shutdownAll()
		```
		
		Triggers an orderly shutdown of all host connections pools currently maintained by the `ActorSystem`.
		 The returned future is completed when all pools that were live at the time of this method call
		 have completed their shutdown process.
		 
		 If existing pool client flows are re\-used or new ones materialized concurrently with or after this
		 method call the respective connection pools will be restarted and not contribute to the returned future.
		
		
		
		Returns:
		(undocumented)
		- #### poolSize
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> poolSize()
		```
		
		For testing only
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html)*