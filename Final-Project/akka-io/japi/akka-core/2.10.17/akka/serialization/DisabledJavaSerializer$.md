---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html
title: DisabledJavaSerializer$
---

# DisabledJavaSerializer$

## Content

Package [akka.serialization](package-summary.html)
## Class DisabledJavaSerializer$

- java.lang.Object
- - akka.serialization.DisabledJavaSerializer$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DisabledJavaSerializer$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.serialization.DisabledJavaSerializer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DisabledJavaSerializer$](DisabledJavaSerializer$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DisabledJavaSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization")` | `[apply](#apply(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `[DisabledJavaSerializer.JavaSerializationException](DisabledJavaSerializer.JavaSerializationException.html "class in akka.serialization")` | `[IllegalDeserialization](#IllegalDeserialization())()` |  |
	| `[DisabledJavaSerializer.JavaSerializationException](DisabledJavaSerializer.JavaSerializationException.html "class in akka.serialization")` | `[IllegalSerialization](#IllegalSerialization())()` |  |
	| `scala.Option<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")>` | `[unapply](#unapply(akka.serialization.DisabledJavaSerializer))​([DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DisabledJavaSerializer$](DisabledJavaSerializer$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DisabledJavaSerializer$
		
		
		
		```
		public DisabledJavaSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### IllegalSerialization
		
		
		
		```
		public final [DisabledJavaSerializer.JavaSerializationException](DisabledJavaSerializer.JavaSerializationException.html "class in akka.serialization") IllegalSerialization()
		```
		- #### IllegalDeserialization
		
		
		
		```
		public final [DisabledJavaSerializer.JavaSerializationException](DisabledJavaSerializer.JavaSerializationException.html "class in akka.serialization") IllegalDeserialization()
		```
		- #### apply
		
		
		
		```
		public [DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization") apply​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")> unapply​([DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer.JavaSerializationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html)*