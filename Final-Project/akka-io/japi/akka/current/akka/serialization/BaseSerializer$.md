---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer$.html
title: BaseSerializer$
---

# BaseSerializer$

## Content

Package [akka.serialization](package-summary.html)
## Class BaseSerializer$

- java.lang.Object
- - akka.serialization.BaseSerializer$

- ---

```
public class BaseSerializer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BaseSerializer$](BaseSerializer$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BaseSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[SerializationIdentifiers](#SerializationIdentifiers())()` | Configuration namespace of serialization identifiers in the `reference.conf`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BaseSerializer$](BaseSerializer$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BaseSerializer$
		
		
		
		```
		public BaseSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### SerializationIdentifiers
		
		
		
		```
		public final java.lang.String SerializationIdentifiers()
		```
		
		Configuration namespace of serialization identifiers in the `reference.conf`.
		 
		 Each serializer implementation must have an entry in the following format:
		 `akka.actor.serialization-identifiers."FQCN" = ID`
		 where `FQCN` is fully qualified class name of the serializer implementation
		 and `ID` is globally unique serializer identifier number.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer$.html](https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer$.html)*