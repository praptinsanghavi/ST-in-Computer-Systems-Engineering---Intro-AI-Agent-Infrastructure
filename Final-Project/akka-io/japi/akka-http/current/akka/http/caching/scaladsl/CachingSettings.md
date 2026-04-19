---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html
title: CachingSettings
---

# CachingSettings

## Content

Package [akka.http.caching.scaladsl](package-summary.html)
## Class CachingSettings

- java.lang.Object
- - [akka.http.caching.javadsl.CachingSettings](../javadsl/CachingSettings.html "class in akka.http.caching.javadsl")
	- - akka.http.caching.scaladsl.CachingSettings

- Direct Known Subclasses:
`[CachingSettingsImpl](../impl/settings/CachingSettingsImpl.html "class in akka.http.caching.impl.settings")`

---

```
public abstract class CachingSettings
extends [CachingSettings](../javadsl/CachingSettings.html "class in akka.http.caching.javadsl")
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachingSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[lfuCacheSettings](#lfuCacheSettings())()` |  |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")` | `[withLfuCacheSettings](#withLfuCacheSettings(akka.http.caching.scaladsl.LfuCacheSettings))​([LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") newSettings)` |  |
	
	
		- ### Methods inherited from class akka.http.caching.javadsl.[CachingSettings](../javadsl/CachingSettings.html "class in akka.http.caching.javadsl")
		
		
		`[create](../javadsl/CachingSettings.html#create(akka.actor.ActorSystem)), [create](../javadsl/CachingSettings.html#create(com.typesafe.config.Config)), [create](../javadsl/CachingSettings.html#create(java.lang.String)), [withLfuCacheSettings](../javadsl/CachingSettings.html#withLfuCacheSettings(akka.http.caching.javadsl.LfuCacheSettings))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CachingSettings
		
		
		
		```
		public CachingSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl") apply​(java.lang.String configOverrides)
		```
		- #### lfuCacheSettings
		
		
		
		```
		public abstract [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") lfuCacheSettings()
		```
		
		
		Specified by:
		`[lfuCacheSettings](../javadsl/CachingSettings.html#lfuCacheSettings())` in class `[CachingSettings](../javadsl/CachingSettings.html "class in akka.http.caching.javadsl")`
		- #### withLfuCacheSettings
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl") withLfuCacheSettings​([LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.scaladsl") newSettings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/CachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html)*