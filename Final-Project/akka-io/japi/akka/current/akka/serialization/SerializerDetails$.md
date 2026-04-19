---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails$.html
title: SerializerDetails$
---

# SerializerDetails$

## Content

Package [akka.serialization](package-summary.html)
## Class SerializerDetails$

- java.lang.Object
- - akka.serialization.SerializerDetails$

- ---

```
public class SerializerDetails$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SerializerDetails$](SerializerDetails$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializerDetails$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SerializerDetails](SerializerDetails.html "class in akka.serialization")` | `[apply](#apply(java.lang.String,akka.serialization.Serializer,scala.collection.immutable.Seq))​(java.lang.String alias,  [Serializer](Serializer.html "interface in akka.serialization") serializer,  scala.collection.immutable.Seq<java.lang.Class<?>> useFor)` | Scala API: factory for details about one programmatically setup serializer |
	| `[SerializerDetails](SerializerDetails.html "class in akka.serialization")` | `[create](#create(java.lang.String,akka.serialization.Serializer,java.util.List))​(java.lang.String alias,  [Serializer](Serializer.html "interface in akka.serialization") serializer,  java.util.List<java.lang.Class<?>> useFor)` | Java API: factory for details about one programmatically setup serializer |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SerializerDetails$](SerializerDetails$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SerializerDetails$
		
		
		
		```
		public SerializerDetails$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [SerializerDetails](SerializerDetails.html "class in akka.serialization") apply​(java.lang.String alias,
		                               [Serializer](Serializer.html "interface in akka.serialization") serializer,
		                               scala.collection.immutable.Seq<java.lang.Class<?>> useFor)
		```
		
		Scala API: factory for details about one programmatically setup serializer
		 
		
		Parameters:
		`alias` \- Register the serializer under this alias (this allows it to be used by bindings in the config)
		`useFor` \- A set of classes or superclasses to bind to the serializer, selection works just as if
		 the classes, the alias and the serializer had been in the config.
		- #### create
		
		
		
		```
		public [SerializerDetails](SerializerDetails.html "class in akka.serialization") create​(java.lang.String alias,
		                                [Serializer](Serializer.html "interface in akka.serialization") serializer,
		                                java.util.List<java.lang.Class<?>> useFor)
		```
		
		Java API: factory for details about one programmatically setup serializer
		 
		
		Parameters:
		`alias` \- Register the serializer under this alias (this allows it to be used by bindings in the config)
		`useFor` \- A set of classes or superclasses to bind to the serializer, selection works just as if
		 the classes, the alias and the serializer had been in the config.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails$.html](https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails$.html)*