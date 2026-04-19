---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonSerializer$.html
title: JacksonSerializer$
---

# JacksonSerializer$

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonSerializer$

- java.lang.Object
- - akka.serialization.jackson.JacksonSerializer$

- ---

```
public class JacksonSerializer$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JacksonSerializer$](JacksonSerializer$.html "class in akka.serialization.jackson")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<java.lang.Class<?>>` | `[disallowedSerializationBindings](#disallowedSerializationBindings())()` |  |
	| `boolean` | `[isGZipped](#isGZipped(byte%5B%5D))​(byte[] bytes)` |  |
	| `boolean` | `[isLZ4](#isLZ4(byte%5B%5D))​(byte[] bytes)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JacksonSerializer$](JacksonSerializer$.html "class in akka.serialization.jackson") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JacksonSerializer$
		
		
		
		```
		public JacksonSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### disallowedSerializationBindings
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.Class<?>> disallowedSerializationBindings()
		```
		- #### isGZipped
		
		
		
		```
		public boolean isGZipped​(byte[] bytes)
		```
		- #### isLZ4
		
		
		
		```
		public boolean isLZ4​(byte[] bytes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonSerializer$.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonSerializer$.html)*