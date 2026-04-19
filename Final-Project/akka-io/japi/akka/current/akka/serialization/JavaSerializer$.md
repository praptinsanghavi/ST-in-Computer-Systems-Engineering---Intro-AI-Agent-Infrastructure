---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer$.html
title: JavaSerializer$
---

# JavaSerializer$

## Content

Package [akka.serialization](package-summary.html)
## Class JavaSerializer$

- java.lang.Object
- - akka.serialization.JavaSerializer$

- ---

```
public class JavaSerializer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JavaSerializer$](JavaSerializer$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JavaSerializer.CurrentSystem](JavaSerializer.CurrentSystem.html "class in akka.serialization")` | `[currentSystem](#currentSystem())()` | This holds a reference to the current ActorSystem (the surrounding context)  during serialization and deserialization. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JavaSerializer$](JavaSerializer$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JavaSerializer$
		
		
		
		```
		public JavaSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### currentSystem
		
		
		
		```
		public [JavaSerializer.CurrentSystem](JavaSerializer.CurrentSystem.html "class in akka.serialization") currentSystem()
		```
		
		This holds a reference to the current ActorSystem (the surrounding context)
		 during serialization and deserialization.
		 
		 If you are using Serializers yourself, outside of SerializationExtension,
		 you'll need to surround the serialization/deserialization with:
		 
		
		
		 JavaSerializer.currentSystem.withValue(system) {
		 ...code...
		 }
		 
		
		
		 or
		 
		
		
		 JavaSerializer.currentSystem.withValue(system, callable)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.CurrentSystem.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer$.html](https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer$.html)*