---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails.html
title: SerializerDetails
---

# SerializerDetails

## Content

Package [akka.serialization](package-summary.html)
## Class SerializerDetails

- java.lang.Object
- - akka.serialization.SerializerDetails

- ---

```
public final class SerializerDetails
extends java.lang.Object
```

Constructor is internal API: Use the factories [`create(java.lang.String, akka.serialization.Serializer, java.util.List<java.lang.Class<?>>)`](#create(java.lang.String,akka.serialization.Serializer,java.util.List)) or [`apply(java.lang.String, akka.serialization.Serializer, scala.collection.immutable.Seq<java.lang.Class<?>>)`](#apply(java.lang.String,akka.serialization.Serializer,scala.collection.immutable.Seq))
 to construct

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializerDetails](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[alias](#alias())()` |  |
	| `static [SerializerDetails](SerializerDetails.html "class in akka.serialization")` | `[apply](#apply(java.lang.String,akka.serialization.Serializer,scala.collection.immutable.Seq))​(java.lang.String alias,  [Serializer](Serializer.html "interface in akka.serialization") serializer,  scala.collection.immutable.Seq<java.lang.Class<?>> useFor)` | Scala API: factory for details about one programmatically setup serializer |
	| `static [SerializerDetails](SerializerDetails.html "class in akka.serialization")` | `[create](#create(java.lang.String,akka.serialization.Serializer,java.util.List))​(java.lang.String alias,  [Serializer](Serializer.html "interface in akka.serialization") serializer,  java.util.List<java.lang.Class<?>> useFor)` | Java API: factory for details about one programmatically setup serializer |
	| `[Serializer](Serializer.html "interface in akka.serialization")` | `[serializer](#serializer())()` |  |
	| `scala.collection.immutable.Seq<java.lang.Class<?>>` | `[useFor](#useFor())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializerDetails
		
		
		
		```
		public SerializerDetails()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SerializerDetails](SerializerDetails.html "class in akka.serialization") apply​(java.lang.String alias,
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
		public static [SerializerDetails](SerializerDetails.html "class in akka.serialization") create​(java.lang.String alias,
		                                       [Serializer](Serializer.html "interface in akka.serialization") serializer,
		                                       java.util.List<java.lang.Class<?>> useFor)
		```
		
		Java API: factory for details about one programmatically setup serializer
		 
		
		Parameters:
		`alias` \- Register the serializer under this alias (this allows it to be used by bindings in the config)
		`useFor` \- A set of classes or superclasses to bind to the serializer, selection works just as if
		 the classes, the alias and the serializer had been in the config.
		- #### alias
		
		
		
		```
		public java.lang.String alias()
		```
		- #### serializer
		
		
		
		```
		public [Serializer](Serializer.html "interface in akka.serialization") serializer()
		```
		- #### useFor
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Class<?>> useFor()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails.html](https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails.html)*