---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedConfig.html
title: EnhancedConfig
---

# EnhancedConfig

## Content

Package [akka.http.impl.util](package-summary.html)
## Class EnhancedConfig

- java.lang.Object
- - scala.AnyVal
	- - akka.http.impl.util.EnhancedConfig

- ---

```
public class EnhancedConfig
extends scala.AnyVal
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EnhancedConfig](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config underlying)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[getFiniteDuration](#getFiniteDuration(java.lang.String))​(java.lang.String path)` |  |
	| `int` | `[getIntBytes](#getIntBytes(java.lang.String))​(java.lang.String path)` |  |
	| `long` | `[getPossiblyInfiniteBytes](#getPossiblyInfiniteBytes(java.lang.String))​(java.lang.String path)` |  |
	| `int` | `[getPossiblyInfiniteInt](#getPossiblyInfiniteInt(java.lang.String))​(java.lang.String path)` |  |
	| `int` | `[getPossiblyInfiniteIntBytes](#getPossiblyInfiniteIntBytes(java.lang.String))​(java.lang.String path)` |  |
	| `scala.concurrent.duration.Duration` | `[getPotentiallyInfiniteDuration](#getPotentiallyInfiniteDuration(java.lang.String))​(java.lang.String path)` |  |
	| `<T> scala.Option<T>` | `[ifDefined](#ifDefined(java.lang.String,scala.Function2))​(java.lang.String path,  scala.Function2<com.typesafe.config.Config,​java.lang.String,​T> f)` |  |
	| `com.typesafe.config.Config` | `[underlying](#underlying())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EnhancedConfig
		
		
		
		```
		public EnhancedConfig​(com.typesafe.config.Config underlying)
		```

	- ### Method Detail
	
	
	
		- #### underlying
		
		
		
		```
		public com.typesafe.config.Config underlying()
		```
		- #### getPotentiallyInfiniteDuration
		
		
		
		```
		public scala.concurrent.duration.Duration getPotentiallyInfiniteDuration​(java.lang.String path)
		```
		- #### getFiniteDuration
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration getFiniteDuration​(java.lang.String path)
		```
		- #### getPossiblyInfiniteInt
		
		
		
		```
		public int getPossiblyInfiniteInt​(java.lang.String path)
		```
		- #### getIntBytes
		
		
		
		```
		public int getIntBytes​(java.lang.String path)
		```
		- #### getPossiblyInfiniteIntBytes
		
		
		
		```
		public int getPossiblyInfiniteIntBytes​(java.lang.String path)
		```
		- #### getPossiblyInfiniteBytes
		
		
		
		```
		public long getPossiblyInfiniteBytes​(java.lang.String path)
		```
		- #### ifDefined
		
		
		
		```
		public <T> scala.Option<T> ifDefined​(java.lang.String path,
		                                     scala.Function2<com.typesafe.config.Config,​java.lang.String,​T> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedConfig.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedConfig.html)*