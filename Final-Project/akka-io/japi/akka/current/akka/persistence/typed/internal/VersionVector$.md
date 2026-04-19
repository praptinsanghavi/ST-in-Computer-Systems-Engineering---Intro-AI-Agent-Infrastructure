---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/VersionVector$.html
title: VersionVector$
---

# VersionVector$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class VersionVector$

- java.lang.Object
- - akka.persistence.typed.internal.VersionVector$

- ---

```
public class VersionVector$
extends java.lang.Object
```

INTERNAL API
 
 VersionVector module with helper classes and methods.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [VersionVector$](VersionVector$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[VersionVector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.VersionVector` | `[apply](#apply())()` |  |
	| `akka.persistence.typed.internal.VersionVector` | `[apply](#apply(java.lang.String,long))​(java.lang.String key,  long version)` |  |
	| `akka.persistence.typed.internal.VersionVector` | `[apply](#apply(scala.collection.immutable.TreeMap))​(scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object> versions)` |  |
	| `akka.persistence.typed.internal.VersionVector` | `[empty](#empty())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [VersionVector$](VersionVector$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### VersionVector$
		
		
		
		```
		public VersionVector$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public akka.persistence.typed.internal.VersionVector empty()
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.VersionVector apply()
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.VersionVector apply​(scala.collection.immutable.TreeMap<java.lang.String,​java.lang.Object> versions)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.VersionVector apply​(java.lang.String key,
		                                                           long version)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/VersionVector$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/VersionVector$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/VersionVector$.html)*