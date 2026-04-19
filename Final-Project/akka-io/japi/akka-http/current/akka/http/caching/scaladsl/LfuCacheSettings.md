---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html
title: LfuCacheSettings
---

# LfuCacheSettings

## Content

Package [akka.http.caching.scaladsl](package-summary.html)
## Class LfuCacheSettings

- java.lang.Object
- - [akka.http.caching.javadsl.LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")
	- - akka.http.caching.scaladsl.LfuCacheSettings

- Direct Known Subclasses:
`[LfuCachingSettingsImpl](../impl/settings/LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")`

---

```
public abstract class LfuCacheSettings
extends [LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCacheSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `int` | `[getInitialCapacity](#getInitialCapacity())()` |  |
	| `int` | `[getMaxCapacity](#getMaxCapacity())()` |  |
	| `scala.concurrent.duration.Duration` | `[getTimeToIdle](#getTimeToIdle())()` |  |
	| `scala.concurrent.duration.Duration` | `[getTimeToLive](#getTimeToLive())()` |  |
	| `abstract int` | `[initialCapacity](#initialCapacity())()` |  |
	| `abstract int` | `[maxCapacity](#maxCapacity())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[timeToIdle](#timeToIdle())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[timeToLive](#timeToLive())()` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[withInitialCapacity](#withInitialCapacity(int))​(int newInitialCapacity)` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[withMaxCapacity](#withMaxCapacity(int))​(int newMaxCapacity)` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[withTimeToIdle](#withTimeToIdle(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newTimeToIdle)` |  |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[withTimeToLive](#withTimeToLive(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newTimeToLive)` |  |
	
	
		- ### Methods inherited from class akka.http.caching.javadsl.[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")
		
		
		`[create](../javadsl/LfuCacheSettings.html#create(com.typesafe.config.Config)), [create](../javadsl/LfuCacheSettings.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LfuCacheSettings
		
		
		
		```
		public LfuCacheSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") apply​(java.lang.String configOverrides)
		```
		- #### maxCapacity
		
		
		
		```
		public abstract int maxCapacity()
		```
		- #### initialCapacity
		
		
		
		```
		public abstract int initialCapacity()
		```
		- #### timeToLive
		
		
		
		```
		public abstract scala.concurrent.duration.Duration timeToLive()
		```
		- #### timeToIdle
		
		
		
		```
		public abstract scala.concurrent.duration.Duration timeToIdle()
		```
		- #### getMaxCapacity
		
		
		
		```
		public final int getMaxCapacity()
		```
		
		
		Specified by:
		`[getMaxCapacity](../javadsl/LfuCacheSettings.html#getMaxCapacity())` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### getInitialCapacity
		
		
		
		```
		public final int getInitialCapacity()
		```
		
		
		Specified by:
		`[getInitialCapacity](../javadsl/LfuCacheSettings.html#getInitialCapacity())` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### getTimeToLive
		
		
		
		```
		public final scala.concurrent.duration.Duration getTimeToLive()
		```
		
		
		Specified by:
		`[getTimeToLive](../javadsl/LfuCacheSettings.html#getTimeToLive())` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### getTimeToIdle
		
		
		
		```
		public final scala.concurrent.duration.Duration getTimeToIdle()
		```
		
		
		Specified by:
		`[getTimeToIdle](../javadsl/LfuCacheSettings.html#getTimeToIdle())` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### withMaxCapacity
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") withMaxCapacity​(int newMaxCapacity)
		```
		
		
		Overrides:
		`[withMaxCapacity](../javadsl/LfuCacheSettings.html#withMaxCapacity(int))` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### withInitialCapacity
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") withInitialCapacity​(int newInitialCapacity)
		```
		
		
		Overrides:
		`[withInitialCapacity](../javadsl/LfuCacheSettings.html#withInitialCapacity(int))` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### withTimeToLive
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") withTimeToLive​(scala.concurrent.duration.Duration newTimeToLive)
		```
		
		
		Overrides:
		`[withTimeToLive](../javadsl/LfuCacheSettings.html#withTimeToLive(scala.concurrent.duration.Duration))` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`
		- #### withTimeToIdle
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") withTimeToIdle​(scala.concurrent.duration.Duration newTimeToIdle)
		```
		
		
		Overrides:
		`[withTimeToIdle](../javadsl/LfuCacheSettings.html#withTimeToIdle(scala.concurrent.duration.Duration))` in class `[LfuCacheSettings](../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html)*