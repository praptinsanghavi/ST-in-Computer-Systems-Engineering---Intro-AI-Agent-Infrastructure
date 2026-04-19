---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.html
title: Player
---

# Player

## Content

Package [akka.remote.testconductor](package-summary.html)
## Interface Player

- All Known Implementing Classes:
`[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")`

---

```
public interface Player
```

The Player is the client component of the
 [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor") extension. It registers with
 the [`Conductor`](Conductor.html "interface in akka.remote.testconductor")\&rsquo;s `Controller`
 in order to participate in barriers and enable network failure injection.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[Player.Waiter](Player.Waiter.html "class in akka.remote.testconductor")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_client_$eq](#_client_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[client](#client())()` |  |
	| `void` | `[enter](#enter(akka.util.Timeout,scala.collection.immutable.Seq))​([Timeout](../../util/Timeout.html "class in akka.util") timeout,  scala.collection.immutable.Seq<java.lang.String> name)` | Enter the named barriers, one after the other, in the order given. |
	| `void` | `[enter](#enter(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> name)` | Enter the named barriers, one after the other, in the order given. |
	| `scala.concurrent.Future<[Address](../../actor/Address.html "class in akka.actor")>` | `[getAddressFor](#getAddressFor(akka.remote.testconductor.RoleName))​([RoleName](RoleName.html "class in akka.remote.testconductor") name)` | Query remote transport address of named node. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[startClient](#startClient(akka.remote.testconductor.RoleName,java.net.InetSocketAddress))​([RoleName](RoleName.html "class in akka.remote.testconductor") name,  java.net.InetSocketAddress controllerAddr)` | Connect to the conductor on the given port (the host is taken from setting  `akka.testconductor.host`). |

- - ### Method Detail
	
	
	
		- #### \_client\_$eq
		
		
		
		```
		void _client_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		- #### client
		
		
		
		```
		[ActorRef](../../actor/ActorRef.html "class in akka.actor") client()
		```
		- #### startClient
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> startClient​([RoleName](RoleName.html "class in akka.remote.testconductor") name,
		                                                                    java.net.InetSocketAddress controllerAddr)
		```
		
		Connect to the conductor on the given port (the host is taken from setting
		 `akka.testconductor.host`). The connection is made asynchronously, but you
		 should await completion of the returned Future because that implies that
		 all expected participants of this test have successfully connected (i.e.
		 this is a first barrier in itself). The number of expected participants is
		 set in [`Conductor`](Conductor.html "interface in akka.remote.testconductor")`.startController()`.
		- #### enter
		
		
		
		```
		void enter​(scala.collection.immutable.Seq<java.lang.String> name)
		```
		
		Enter the named barriers, one after the other, in the order given. Will
		 throw an exception in case of timeouts or other errors.
		- #### enter
		
		
		
		```
		void enter​([Timeout](../../util/Timeout.html "class in akka.util") timeout,
		           scala.collection.immutable.Seq<java.lang.String> name)
		```
		
		Enter the named barriers, one after the other, in the order given. Will
		 throw an exception in case of timeouts or other errors.
		- #### getAddressFor
		
		
		
		```
		scala.concurrent.Future<[Address](../../actor/Address.html "class in akka.actor")> getAddressFor​([RoleName](RoleName.html "class in akka.remote.testconductor") name)
		```
		
		Query remote transport address of named node.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.Waiter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.html)*