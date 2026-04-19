---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRefResolver.html
title: ActorRefResolver
---

# ActorRefResolver

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorRefResolver

- java.lang.Object
- - akka.actor.typed.ActorRefResolver

- All Implemented Interfaces:
`[Extension](Extension.html "interface in akka.actor.typed")`

---

```
public abstract class ActorRefResolver
extends java.lang.Object
implements [Extension](Extension.html "interface in akka.actor.typed")
```

Serialization and deserialization of `ActorRef`.
 
 This class is not intended for user extension other than for test purposes (e.g.
 stub implementation). More methods may be added in the future and that may break
 such implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefResolver](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `abstract <T> [ActorRef](ActorRef.html "interface in akka.actor.typed")<T>` | `[resolveActorRef](#resolveActorRef(java.lang.String))​(java.lang.String serializedActorRef)` | Deserialize an `ActorRef` in the [`toSerializationFormat(akka.actor.typed.ActorRef<T>)`](#toSerializationFormat(akka.actor.typed.ActorRef)). |
	| `abstract <T> java.lang.String` | `[toSerializationFormat](#toSerializationFormat(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<T> ref)` | Generate full String representation including the uid for the actor cell  instance as URI fragment, replacing the Address in the RootActor Path  with the local one unless this path\&rsquo;s address includes host and port  information. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorRefResolver
		
		
		
		```
		public ActorRefResolver()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed") get​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### createExtension
		
		
		
		```
		public static [ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed") createExtension​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### id
		
		
		
		```
		public static [ExtensionId](ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### toSerializationFormat
		
		
		
		```
		public abstract <T> java.lang.String toSerializationFormat​([ActorRef](ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		Generate full String representation including the uid for the actor cell
		 instance as URI fragment, replacing the Address in the RootActor Path
		 with the local one unless this path\&rsquo;s address includes host and port
		 information. This representation should be used as serialized
		 representation.
		- #### resolveActorRef
		
		
		
		```
		public abstract <T> [ActorRef](ActorRef.html "interface in akka.actor.typed")<T> resolveActorRef​(java.lang.String serializedActorRef)
		```
		
		Deserialize an `ActorRef` in the [`toSerializationFormat(akka.actor.typed.ActorRef<T>)`](#toSerializationFormat(akka.actor.typed.ActorRef)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRefResolver.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRefResolver.html)*