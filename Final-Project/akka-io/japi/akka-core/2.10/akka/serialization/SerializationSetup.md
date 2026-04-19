---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializationSetup.html
title: SerializationSetup
---

# SerializationSetup

## Content

Package [akka.serialization](package-summary.html)
## Class SerializationSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../actor/setup/Setup.html "class in akka.actor.setup")
	- - akka.serialization.SerializationSetup

- ---

```
public final class SerializationSetup
extends [Setup](../actor/setup/Setup.html "class in akka.actor.setup")
```

Setup for the serialization subsystem, constructor is \*Internal API\*, use factories in [`SerializationSetup`](SerializationSetup.html "class in akka.serialization")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializationSetup](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SerializationSetup](SerializationSetup.html "class in akka.serialization")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​scala.collection.immutable.Seq<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)` | Scala API: Programmatic definition of serializers |
	| `static [SerializationSetup](SerializationSetup.html "class in akka.serialization")` | `[create](#create(akka.japi.Function))​([Function](../japi/Function.html "interface in akka.japi")<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​java.util.List<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)` | Java API: Programmatic definition of serializers |
	| `scala.Function1<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​scala.collection.immutable.Seq<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>>` | `[createSerializers](#createSerializers())()` |  |
	
	
		- ### Methods inherited from class akka.actor.setup.[Setup](../actor/setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../actor/setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializationSetup
		
		
		
		```
		public SerializationSetup()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SerializationSetup](SerializationSetup.html "class in akka.serialization") apply​(scala.Function1<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​scala.collection.immutable.Seq<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)
		```
		
		Scala API: Programmatic definition of serializers
		
		Parameters:
		`createSerializers` \- create pairs of serializer and the set of classes it should be used for
		- #### create
		
		
		
		```
		public static [SerializationSetup](SerializationSetup.html "class in akka.serialization") create​([Function](../japi/Function.html "interface in akka.japi")<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​java.util.List<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers)
		```
		
		Java API: Programmatic definition of serializers
		
		Parameters:
		`createSerializers` \- create pairs of serializer and the set of classes it should be used for
		- #### createSerializers
		
		
		
		```
		public scala.Function1<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor"),​scala.collection.immutable.Seq<[SerializerDetails](SerializerDetails.html "class in akka.serialization")>> createSerializers()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializationSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializerDetails.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializationSetup.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializationSetup.html)*