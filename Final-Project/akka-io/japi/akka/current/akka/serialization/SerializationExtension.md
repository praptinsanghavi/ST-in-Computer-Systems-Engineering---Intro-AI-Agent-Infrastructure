---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/SerializationExtension.html
title: SerializationExtension
---

# SerializationExtension

## Content

Package [akka.serialization](package-summary.html)
## Class SerializationExtension

- java.lang.Object
- - akka.serialization.SerializationExtension

- ---

```
public class SerializationExtension
extends java.lang.Object
```

SerializationExtension is an Akka Extension to interact with the Serialization
 that is built into Akka

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializationExtension](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [Serialization](Serialization.html "class in akka.serialization")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Serialization](Serialization.html "class in akka.serialization")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [Serialization](Serialization.html "class in akka.serialization")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [SerializationExtension$](SerializationExtension$.html "class in akka.serialization")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializationExtension
		
		
		
		```
		public SerializationExtension()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [Serialization](Serialization.html "class in akka.serialization") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [Serialization](Serialization.html "class in akka.serialization") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [SerializationExtension$](SerializationExtension$.html "class in akka.serialization") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [Serialization](Serialization.html "class in akka.serialization") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/SerializationExtension.html](https://doc.akka.io/japi/akka/current/akka/serialization/SerializationExtension.html)*