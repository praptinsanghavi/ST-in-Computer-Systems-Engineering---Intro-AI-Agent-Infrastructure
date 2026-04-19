---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/RetrySettings$.html
title: RetrySettings$
---

# RetrySettings$

## Content

Package [akka.pattern](package-summary.html)
## Class RetrySettings$

- java.lang.Object
- - akka.pattern.RetrySettings$

- ---

```
public class RetrySettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RetrySettings$](RetrySettings$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetrySettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[apply](#apply(int))​(int maxRetries)` | Scala API: Create settings with exponential backoff delay between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Create settings from configuration. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[create](#create(int))​(int maxRetries)` | Scala API: Create settings with exponential backoff delay between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from configuration. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RetrySettings$](RetrySettings$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RetrySettings$
		
		
		
		```
		public RetrySettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") apply​(int maxRetries)
		```
		
		Scala API: Create settings with exponential backoff delay between retries.
		 The exponential backoff settings are calculated based on number of retries.
		
		Parameters:
		`maxRetries` \- maximum number of retries
		Returns:
		RetrySettings with exponential backoff delay
		- #### create
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") create​(int maxRetries)
		```
		
		Scala API: Create settings with exponential backoff delay between retries.
		 The exponential backoff settings are calculated based on number of retries.
		
		Parameters:
		`maxRetries` \- maximum number of retries
		Returns:
		RetrySettings with exponential backoff delay
		- #### apply
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Create settings from configuration.
		- #### create
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from configuration.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/RetrySettings$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/RetrySettings.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/RetrySettings$.html](https://doc.akka.io/japi/akka/current/akka/pattern/RetrySettings$.html)*