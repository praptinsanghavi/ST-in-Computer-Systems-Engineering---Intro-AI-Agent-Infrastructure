---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/security/provider/SeedSize$.html
title: SeedSize$
---

# SeedSize$

## Content

Package [akka.remote.security.provider](package-summary.html)
## Class SeedSize$

- java.lang.Object
- - akka.remote.security.provider.SeedSize$

- ---

```
public class SeedSize$
extends java.lang.Object
```

INTERNAL API
 From AESCounterRNG API docs:
 Valid values are 16 (128 bits), 24 (192 bits) and 32 (256 bits).
 Any other values will result in an exception from the AES implementation.
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SeedSize$](SeedSize$.html "class in akka.remote.security.provider")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SeedSize$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[Seed128](#Seed128())()` |  |
	| `int` | `[Seed192](#Seed192())()` |  |
	| `int` | `[Seed256](#Seed256())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SeedSize$](SeedSize$.html "class in akka.remote.security.provider") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SeedSize$
		
		
		
		```
		public SeedSize$()
		```

	- ### Method Detail
	
	
	
		- #### Seed128
		
		
		
		```
		public int Seed128()
		```
		- #### Seed192
		
		
		
		```
		public int Seed192()
		```
		- #### Seed256
		
		
		
		```
		public int Seed256()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/security/provider/SeedSize$.html
- https://doc.akka.io/japi/akka/current/akka/remote/security/provider/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/security/provider/SeedSize$.html](https://doc.akka.io/japi/akka/current/akka/remote/security/provider/SeedSize$.html)*