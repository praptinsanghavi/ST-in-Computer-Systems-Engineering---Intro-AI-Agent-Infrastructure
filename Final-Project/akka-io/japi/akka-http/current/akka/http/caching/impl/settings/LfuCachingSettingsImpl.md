---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html
title: LfuCachingSettingsImpl
---

# LfuCachingSettingsImpl

## Content

Package [akka.http.caching.impl.settings](package-summary.html)
## Class LfuCachingSettingsImpl

- java.lang.Object
- - [akka.http.caching.javadsl.LfuCacheSettings](../../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")
	- - [akka.http.caching.scaladsl.LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")
		- - akka.http.caching.impl.settings.LfuCachingSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class LfuCachingSettingsImpl
extends [LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.caching.impl.settings.LfuCachingSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCachingSettingsImpl](#%3Cinit%3E(int,int,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration))​(int maxCapacity,  int initialCapacity,  scala.concurrent.duration.Duration timeToLive,  scala.concurrent.duration.Duration timeToIdle)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `static [LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config inner)` |  |
	| `int` | `[initialCapacity](#initialCapacity())()` |  |
	| `int` | `[maxCapacity](#maxCapacity())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.concurrent.duration.Duration` | `[timeToIdle](#timeToIdle())()` |  |
	| `scala.concurrent.duration.Duration` | `[timeToLive](#timeToLive())()` |  |
	
	
		- ### Methods inherited from class akka.http.caching.scaladsl.[LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")
		
		
		`[getInitialCapacity](../../scaladsl/LfuCacheSettings.html#getInitialCapacity()), [getMaxCapacity](../../scaladsl/LfuCacheSettings.html#getMaxCapacity()), [getTimeToIdle](../../scaladsl/LfuCacheSettings.html#getTimeToIdle()), [getTimeToLive](../../scaladsl/LfuCacheSettings.html#getTimeToLive()), [withInitialCapacity](../../scaladsl/LfuCacheSettings.html#withInitialCapacity(int)), [withMaxCapacity](../../scaladsl/LfuCacheSettings.html#withMaxCapacity(int)), [withTimeToIdle](../../scaladsl/LfuCacheSettings.html#withTimeToIdle(scala.concurrent.duration.Duration)), [withTimeToLive](../../scaladsl/LfuCacheSettings.html#withTimeToLive(scala.concurrent.duration.Duration))`
		- ### Methods inherited from class akka.http.caching.javadsl.[LfuCacheSettings](../../javadsl/LfuCacheSettings.html "class in akka.http.caching.javadsl")
		
		
		`[create](../../javadsl/LfuCacheSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/LfuCacheSettings.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### LfuCachingSettingsImpl
		
		
		
		```
		public LfuCachingSettingsImpl​(int maxCapacity,
		                              int initialCapacity,
		                              scala.concurrent.duration.Duration timeToLive,
		                              scala.concurrent.duration.Duration timeToIdle)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                   com.typesafe.config.Config inner)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### maxCapacity
		
		
		
		```
		public int maxCapacity()
		```
		
		
		Specified by:
		`[maxCapacity](../../scaladsl/LfuCacheSettings.html#maxCapacity())` in class `[LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")`
		- #### initialCapacity
		
		
		
		```
		public int initialCapacity()
		```
		
		
		Specified by:
		`[initialCapacity](../../scaladsl/LfuCacheSettings.html#initialCapacity())` in class `[LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")`
		- #### timeToLive
		
		
		
		```
		public scala.concurrent.duration.Duration timeToLive()
		```
		
		
		Specified by:
		`[timeToLive](../../scaladsl/LfuCacheSettings.html#timeToLive())` in class `[LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")`
		- #### timeToIdle
		
		
		
		```
		public scala.concurrent.duration.Duration timeToIdle()
		```
		
		
		Specified by:
		`[timeToIdle](../../scaladsl/LfuCacheSettings.html#timeToIdle())` in class `[LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html)*