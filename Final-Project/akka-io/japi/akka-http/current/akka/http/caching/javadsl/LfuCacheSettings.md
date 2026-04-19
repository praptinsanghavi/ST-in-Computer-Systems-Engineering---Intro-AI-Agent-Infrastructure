---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html
title: LfuCacheSettings
---

# LfuCacheSettings

## Content

Package [akka.http.caching.javadsl](package-summary.html)
## Class LfuCacheSettings

- java.lang.Object
- - akka.http.caching.javadsl.LfuCacheSettings

- Direct Known Subclasses:
`[LfuCacheSettings](../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")`

---

```
public abstract class LfuCacheSettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCacheSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract int` | `[getInitialCapacity](#getInitialCapacity())()` |  |
	| `abstract int` | `[getMaxCapacity](#getMaxCapacity())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[getTimeToIdle](#getTimeToIdle())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[getTimeToLive](#getTimeToLive())()` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[withInitialCapacity](#withInitialCapacity(int))​(int newInitialCapacity)` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[withMaxCapacity](#withMaxCapacity(int))​(int newMaxCapacity)` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[withTimeToIdle](#withTimeToIdle(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newTimeToIdle)` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[withTimeToLive](#withTimeToLive(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newTimeToLive)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LfuCacheSettings
		
		
		
		```
		public LfuCacheSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") create​(java.lang.String configOverrides)
		```
		- #### getMaxCapacity
		
		
		
		```
		public abstract int getMaxCapacity()
		```
		- #### getInitialCapacity
		
		
		
		```
		public abstract int getInitialCapacity()
		```
		- #### getTimeToLive
		
		
		
		```
		public abstract scala.concurrent.duration.Duration getTimeToLive()
		```
		- #### getTimeToIdle
		
		
		
		```
		public abstract scala.concurrent.duration.Duration getTimeToIdle()
		```
		- #### withMaxCapacity
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") withMaxCapacity​(int newMaxCapacity)
		```
		- #### withInitialCapacity
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") withInitialCapacity​(int newInitialCapacity)
		```
		- #### withTimeToLive
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") withTimeToLive​(scala.concurrent.duration.Duration newTimeToLive)
		```
		- #### withTimeToIdle
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") withTimeToIdle​(scala.concurrent.duration.Duration newTimeToIdle)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html)*