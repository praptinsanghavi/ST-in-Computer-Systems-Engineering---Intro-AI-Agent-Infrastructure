---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html
title: CachingSettings
---

# CachingSettings

## Content

Package [akka.http.caching.javadsl](package-summary.html)
## Class CachingSettings

- java.lang.Object
- - akka.http.caching.javadsl.CachingSettings

- Direct Known Subclasses:
`[CachingSettings](../scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl")`

---

```
public abstract class CachingSettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachingSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[lfuCacheSettings](#lfuCacheSettings())()` |  |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[withLfuCacheSettings](#withLfuCacheSettings(akka.http.caching.javadsl.LfuCacheSettings))​([LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") newSettings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CachingSettings
		
		
		
		```
		public CachingSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") create​(akka.actor.ActorSystem system)
		```
		- #### lfuCacheSettings
		
		
		
		```
		public abstract [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") lfuCacheSettings()
		```
		- #### withLfuCacheSettings
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") withLfuCacheSettings​([LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") newSettings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html)*