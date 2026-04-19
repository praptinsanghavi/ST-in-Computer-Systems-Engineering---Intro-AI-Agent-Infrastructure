---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
title: ServiceKey
---

# ServiceKey

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class ServiceKey\<T\>

- java.lang.Object
- - akka.actor.typed.internal.receptionist.AbstractServiceKey
	- - akka.actor.typed.receptionist.ServiceKey\<T\>

- Direct Known Subclasses:
`[DefaultServiceKey](../internal/receptionist/DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")`

---

```
public abstract class ServiceKey<T>
extends akka.actor.typed.internal.receptionist.AbstractServiceKey
```

A service key is an object that implements this trait for a given protocol
 T, meaning that it signifies that the type T is the entry point into the
 protocol spoken by that service (think of it as the set of first messages
 that a client could send).
 
 Not for user extension, see factories in companion object: [`create(java.lang.Class<T>, java.lang.String)`](#create(java.lang.Class,java.lang.String)) and [`apply(java.lang.String, scala.reflect.ClassTag<T>)`](#apply(java.lang.String,scala.reflect.ClassTag))

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ServiceKey.Listing$](ServiceKey.Listing$.html "class in akka.actor.typed.receptionist")` | Scala API: Provides a type safe pattern match for listings. |
	| `class` | `[ServiceKey.Registered$](ServiceKey.Registered$.html "class in akka.actor.typed.receptionist")` | Scala API: Provides a type safe pattern match for registration acks |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServiceKey](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag))​(java.lang.String id,  scala.reflect.ClassTag<T> classTag)` | Scala API: Creates a service key. |
	| `[ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<[T](ServiceKey.html "type parameter in ServiceKey")>` | `[asServiceKey](#asServiceKey())()` |  |
	| `static <T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T>` | `[create](#create(java.lang.Class,java.lang.String))​(java.lang.Class<T> clazz,  java.lang.String id)` | Java API: Creates a service key. |
	| `abstract java.lang.String` | `[id](#id())()` |  |
	| `[ServiceKey.Listing$](ServiceKey.Listing$.html "class in akka.actor.typed.receptionist")` | `[Listing](#Listing())()` | Accessor for nested Scala object |
	| `[ServiceKey.Registered$](ServiceKey.Registered$.html "class in akka.actor.typed.receptionist")` | `[Registered](#Registered())()` | Accessor for nested Scala object |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServiceKey
		
		
		
		```
		public ServiceKey()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> apply​(java.lang.String id,
		                                      scala.reflect.ClassTag<T> classTag)
		```
		
		Scala API: Creates a service key. The given ID should uniquely define a service with a given protocol.
		- #### create
		
		
		
		```
		public static <T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> create​(java.lang.Class<T> clazz,
		                                       java.lang.String id)
		```
		
		Java API: Creates a service key. The given ID should uniquely define a service with a given protocol.
		- #### Listing
		
		
		
		```
		public [ServiceKey.Listing$](ServiceKey.Listing$.html "class in akka.actor.typed.receptionist") Listing()
		```
		
		Accessor for nested Scala object
		
		Returns:
		(undocumented)
		- #### Registered
		
		
		
		```
		public [ServiceKey.Registered$](ServiceKey.Registered$.html "class in akka.actor.typed.receptionist") Registered()
		```
		
		Accessor for nested Scala object
		
		Returns:
		(undocumented)
		- #### id
		
		
		
		```
		public abstract java.lang.String id()
		```
		- #### asServiceKey
		
		
		
		```
		public [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<[T](ServiceKey.html "type parameter in ServiceKey")> asServiceKey()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.Listing$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.Registered$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html)*