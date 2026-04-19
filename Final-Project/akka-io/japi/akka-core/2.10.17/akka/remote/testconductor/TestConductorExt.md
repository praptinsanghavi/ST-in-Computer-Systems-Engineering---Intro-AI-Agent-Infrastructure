---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.html
title: TestConductorExt
---

# TestConductorExt

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorExt

- java.lang.Object
- - akka.remote.testconductor.TestConductorExt

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`, `[Conductor](Conductor.html "interface in akka.remote.testconductor")`, `[Player](Player.html "interface in akka.remote.testconductor")`

---

```
public class TestConductorExt
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor"), [Conductor](Conductor.html "interface in akka.remote.testconductor"), [Player](Player.html "interface in akka.remote.testconductor")
```

This binds together the [`Conductor`](Conductor.html "interface in akka.remote.testconductor") and
 [`Player`](Player.html "interface in akka.remote.testconductor") roles inside an Akka
 [`Extension`](../../actor/Extension.html "interface in akka.actor"). Please follow the aforementioned links for
 more information.
 
 \=\=\=\=Note\=\=\=\=
 This extension requires the `akka.actor.provider`
 to be a `RemoteActorRefProvider`.
 

 To use blackhole, passThrough, and throttle you must activate the
 failure injector and throttler transport adapters by specifying `testTransport(on = true)`
 in your MultiNodeConfig.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[TestConductorExt.Settings](TestConductorExt.Settings.html "class in akka.remote.testconductor")` |  |
	| `class` | `[TestConductorExt.Settings$](TestConductorExt.Settings$.html "class in akka.remote.testconductor")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.remote.testconductor.[Player](Player.html "interface in akka.remote.testconductor")
		
		
		`[Player.Waiter](Player.Waiter.html "class in akka.remote.testconductor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestConductorExt](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` | Transport address of this Netty\-like remote transport. |
	| `[TestConductorExt.Settings$](TestConductorExt.Settings$.html "class in akka.remote.testconductor")` | `[Settings](#Settings())()` |  |
	| `[ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `akka.remote.RemoteTransport` | `[transport](#transport())()` | Remote transport used by the actor ref provider. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.remote.testconductor.[Conductor](Conductor.html "interface in akka.remote.testconductor")
		
		
		`[_controller_$eq](Conductor.html#_controller_$eq(akka.actor.ActorRef)), [abort](Conductor.html#abort(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName)), [blackhole](Conductor.html#blackhole(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction)), [controller](Conductor.html#controller()), [disconnect](Conductor.html#disconnect(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName)), [exit](Conductor.html#exit(akka.remote.testconductor.RoleName,int)), [getNodes](Conductor.html#getNodes()), [passThrough](Conductor.html#passThrough(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction)), [removeNode](Conductor.html#removeNode(akka.remote.testconductor.RoleName)), [requireTestConductorTranport](Conductor.html#requireTestConductorTranport()), [shutdown](Conductor.html#shutdown(akka.remote.testconductor.RoleName)), [shutdown](Conductor.html#shutdown(akka.remote.testconductor.RoleName,boolean)), [sockAddr](Conductor.html#sockAddr()), [startController](Conductor.html#startController(int,akka.remote.testconductor.RoleName,java.net.InetSocketAddress)), [throttle](Conductor.html#throttle(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction,double))`
		- ### Methods inherited from interface akka.remote.testconductor.[Player](Player.html "interface in akka.remote.testconductor")
		
		
		`[_client_$eq](Player.html#_client_$eq(akka.actor.ActorRef)), [client](Player.html#client()), [enter](Player.html#enter(akka.util.Timeout,scala.collection.immutable.Seq)), [enter](Player.html#enter(scala.collection.immutable.Seq)), [getAddressFor](Player.html#getAddressFor(akka.remote.testconductor.RoleName)), [startClient](Player.html#startClient(akka.remote.testconductor.RoleName,java.net.InetSocketAddress))`

- - ### Constructor Detail
	
	
	
		- #### TestConductorExt
		
		
		
		```
		public TestConductorExt​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### Settings
		
		
		
		```
		public [TestConductorExt.Settings$](TestConductorExt.Settings$.html "class in akka.remote.testconductor") Settings()
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		
		Transport address of this Netty\-like remote transport.
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### transport
		
		
		
		```
		public akka.remote.RemoteTransport transport()
		```
		
		Remote transport used by the actor ref provider.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Player.Waiter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Player.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.Settings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.html)*