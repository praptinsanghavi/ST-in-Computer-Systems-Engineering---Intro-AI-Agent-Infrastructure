---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer$.html
title: ProtobufSerializer$
---

# ProtobufSerializer$

## Content

Package [akka.remote.serialization](package-summary.html)
## Class ProtobufSerializer$

- java.lang.Object
- - akka.remote.serialization.ProtobufSerializer$

- ---

```
public class ProtobufSerializer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProtobufSerializer$](ProtobufSerializer$.html "class in akka.remote.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProtobufSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[deserializeActorRef](#deserializeActorRef(akka.actor.ExtendedActorSystem,akka.remote.WireFormats.ActorRefData))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,  [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote") refProtocol)` | Helper to materialize (lookup) an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor")  from Akka's protobuf representation in the supplied  [`ActorSystem`](../../actor/ActorSystem.html "class in akka.actor"). |
	| `[WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote")` | `[serializeActorRef](#serializeActorRef(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | Helper to serialize an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor") to Akka's  protobuf representation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProtobufSerializer$](ProtobufSerializer$.html "class in akka.remote.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ProtobufSerializer$
		
		
		
		```
		public ProtobufSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### serializeActorRef
		
		
		
		```
		public [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote") serializeActorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Helper to serialize an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor") to Akka's
		 protobuf representation.
		- #### deserializeActorRef
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") deserializeActorRef​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                    [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote") refProtocol)
		```
		
		Helper to materialize (lookup) an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor")
		 from Akka's protobuf representation in the supplied
		 [`ActorSystem`](../../actor/ActorSystem.html "class in akka.actor").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.ActorRefData.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer$.html](https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer$.html)*