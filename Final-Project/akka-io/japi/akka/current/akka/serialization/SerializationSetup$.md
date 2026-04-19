---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/SerializationSetup$.html
title: SerializationSetup$
---

# SerializationSetup$

## Content

Package [akka.serialization](package-summary.html)
## Class SerializationSetup$

- java.lang.Object
- - akka.serialization.SerializationSetup$

- ---

```
public class SerializationSetup$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SerializationSetup$](SerializationSetup$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializationSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SerializationSetup](SerializationSetup.html "class in akka.serialization")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​scala.collection.immutable.Seq<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)` | Scala API: Programmatic definition of serializers |
	| `[SerializationSetup](SerializationSetup.html "class in akka.serialization")` | `[create](#create(akka.japi.Function))​([Function](../japi/Function.html "interface in akka.japi")<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​java.util.List<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)` | Java API: Programmatic definition of serializers |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SerializationSetup$](SerializationSetup$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SerializationSetup$
		
		
		
		```
		public SerializationSetup$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [SerializationSetup](SerializationSetup.html "class in akka.serialization") apply​(scala.Function1<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​scala.collection.immutable.Seq<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)
		```
		
		Scala API: Programmatic definition of serializers
		
		Parameters:
		`createSerializers` \- create pairs of serializer and the set of classes it should be used for
		- #### create
		
		
		
		```
		public [SerializationSetup](SerializationSetup.html "class in akka.serialization") create​([Function](../japi/Function.html "interface in akka.japi")<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​java.util.List<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)
		```
		
		Java API: Programmatic definition of serializers
		
		Parameters:
		`createSerializers` \- create pairs of serializer and the set of classes it should be used for

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/japi/Function.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializationSetup$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializationSetup.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerDetails.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/SerializationSetup$.html](https://doc.akka.io/japi/akka/current/akka/serialization/SerializationSetup$.html)*