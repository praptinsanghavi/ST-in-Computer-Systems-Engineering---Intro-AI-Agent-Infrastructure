---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/Serialization$.html
title: Serialization$
---

# Serialization$

## Content

Package [akka.serialization](package-summary.html)
## Class Serialization$

- java.lang.Object
- - akka.serialization.Serialization$

- ---

```
public class Serialization$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Serialization$](Serialization$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Serialization$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Serialization.Information](Serialization.Information.html "class in akka.serialization")` | `[getCurrentTransportInformation](#getCurrentTransportInformation())()` | Gets the serialization information from a `ThreadLocal` that was assigned via  [`Serialization.withTransportInformation(akka.actor.ExtendedActorSystem, scala.Function0<T>)`](Serialization.html#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0)). |
	| `java.lang.String` | `[serializedActorPath](#serializedActorPath(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)` | The serialized path of an actorRef, based on the current transport serialization information. |
	| `<T> T` | `[withTransportInformation](#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,  scala.Function0<T> f)` | Sets serialization information in a `ThreadLocal` and runs `f`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Serialization$](Serialization$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Serialization$
		
		
		
		```
		public Serialization$()
		```

	- ### Method Detail
	
	
	
		- #### serializedActorPath
		
		
		
		```
		public java.lang.String serializedActorPath​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		The serialized path of an actorRef, based on the current transport serialization information.
		 If there is no external address available in the given `ActorRef` then the systems default
		 address will be used and that is retrieved from the ThreadLocal `Serialization.Information`
		 that was set with [`Serialization.withTransportInformation(akka.actor.ExtendedActorSystem, scala.Function0<T>)`](Serialization.html#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0)).
		- #### withTransportInformation
		
		
		
		```
		public <T> T withTransportInformation​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                      scala.Function0<T> f)
		```
		
		Sets serialization information in a `ThreadLocal` and runs `f`. The information is
		 needed for serializing local actor refs, or if serializer library e.g. custom serializer/deserializer
		 in Jackson need access to the current `ActorSystem`. The current `Information` can be accessed within
		 `f` via [`Serialization.getCurrentTransportInformation()`](Serialization.html#getCurrentTransportInformation()).
		 
		 Akka Remoting sets this value when serializing and deserializing messages, and when using
		 the ordinary `serialize` and `deserialize` methods in [`Serialization`](Serialization.html "class in akka.serialization") the value is also
		 set automatically.
		 
		
		
		
		Returns:
		value returned by `f`
		- #### getCurrentTransportInformation
		
		
		
		```
		public [Serialization.Information](Serialization.Information.html "class in akka.serialization") getCurrentTransportInformation()
		```
		
		Gets the serialization information from a `ThreadLocal` that was assigned via
		 [`Serialization.withTransportInformation(akka.actor.ExtendedActorSystem, scala.Function0<T>)`](Serialization.html#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0)). The information is needed for serializing
		 local actor refs, or if serializer library e.g. custom serializer/deserializer
		 in Jackson need access to the current `ActorSystem`.
		 
		
		Throws:
		`java.lang.IllegalStateException` \- if the information was not set

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.Information.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/Serialization$.html](https://doc.akka.io/japi/akka/current/akka/serialization/Serialization$.html)*