---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SecureRandomFactory$.html
title: SecureRandomFactory$
---

# SecureRandomFactory$

## Content

Package [akka.remote.artery.tcp](package-summary.html)
## Class SecureRandomFactory$

- java.lang.Object
- - akka.remote.artery.tcp.SecureRandomFactory$

- ---

```
public class SecureRandomFactory$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SecureRandomFactory$](SecureRandomFactory$.html "class in akka.remote.artery.tcp")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SecureRandomFactory$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.security.SecureRandom` | `[createSecureRandom](#createSecureRandom(com.typesafe.config.Config,akka.event.MarkerLoggingAdapter))​(com.typesafe.config.Config config,  [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log)` |  |
	| `java.security.SecureRandom` | `[createSecureRandom](#createSecureRandom(java.lang.String,akka.event.MarkerLoggingAdapter))​(java.lang.String randomNumberGenerator,  [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log)` |  |
	| `java.lang.String` | `[GeneratorJdkSecureRandom](#GeneratorJdkSecureRandom())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SecureRandomFactory$](SecureRandomFactory$.html "class in akka.remote.artery.tcp") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SecureRandomFactory$
		
		
		
		```
		public SecureRandomFactory$()
		```

	- ### Method Detail
	
	
	
		- #### GeneratorJdkSecureRandom
		
		
		
		```
		public java.lang.String GeneratorJdkSecureRandom()
		```
		- #### createSecureRandom
		
		
		
		```
		public java.security.SecureRandom createSecureRandom​(com.typesafe.config.Config config,
		                                                     [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		- #### createSecureRandom
		
		
		
		```
		public java.security.SecureRandom createSecureRandom​(java.lang.String randomNumberGenerator,
		                                                     [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SecureRandomFactory$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SecureRandomFactory$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SecureRandomFactory$.html)*