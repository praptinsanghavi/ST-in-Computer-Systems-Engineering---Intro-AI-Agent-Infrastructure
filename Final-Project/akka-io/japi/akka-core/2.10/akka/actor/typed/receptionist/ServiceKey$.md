---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$.html
title: ServiceKey$
---

# ServiceKey$

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class ServiceKey$

- java.lang.Object
- - akka.actor.typed.receptionist.ServiceKey$

- ---

```
public class ServiceKey$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ServiceKey$](ServiceKey$.html "class in akka.actor.typed.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServiceKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag))​(java.lang.String id,  scala.reflect.ClassTag<T> classTag)` | Scala API: Creates a service key. |
	| `<T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T>` | `[create](#create(java.lang.Class,java.lang.String))​(java.lang.Class<T> clazz,  java.lang.String id)` | Java API: Creates a service key. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ServiceKey$](ServiceKey$.html "class in akka.actor.typed.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ServiceKey$
		
		
		
		```
		public ServiceKey$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> apply​(java.lang.String id,
		                               scala.reflect.ClassTag<T> classTag)
		```
		
		Scala API: Creates a service key. The given ID should uniquely define a service with a given protocol.
		- #### create
		
		
		
		```
		public <T> [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> create​(java.lang.Class<T> clazz,
		                                java.lang.String id)
		```
		
		Java API: Creates a service key. The given ID should uniquely define a service with a given protocol.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$.html)*