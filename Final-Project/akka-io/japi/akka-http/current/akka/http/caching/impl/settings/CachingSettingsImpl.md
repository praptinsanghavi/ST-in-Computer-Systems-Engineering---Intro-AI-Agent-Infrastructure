---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/CachingSettingsImpl.html
title: CachingSettingsImpl
---

# CachingSettingsImpl

## Content

Package [akka.http.caching.impl.settings](package-summary.html)
## Class CachingSettingsImpl

- java.lang.Object
- - [akka.http.caching.javadsl.CachingSettings](../../javadsl/CachingSettings.html "class in akka.http.caching.javadsl")
	- - [akka.http.caching.scaladsl.CachingSettings](../../scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl")
		- - akka.http.caching.impl.settings.CachingSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class CachingSettingsImpl
extends [CachingSettings](../../scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.caching.impl.settings.CachingSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachingSettingsImpl](#%3Cinit%3E(akka.http.caching.scaladsl.LfuCacheSettings))​([LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl") lfuCacheSettings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `static [CachingSettingsImpl](CachingSettingsImpl.html "class in akka.http.caching.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `[LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl")` | `[lfuCacheSettings](#lfuCacheSettings())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class akka.http.caching.scaladsl.[CachingSettings](../../scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl")
		
		
		`[withLfuCacheSettings](../../scaladsl/CachingSettings.html#withLfuCacheSettings(akka.http.caching.scaladsl.LfuCacheSettings))`
		- ### Methods inherited from class akka.http.caching.javadsl.[CachingSettings](../../javadsl/CachingSettings.html "class in akka.http.caching.javadsl")
		
		
		`[create](../../javadsl/CachingSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/CachingSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/CachingSettings.html#create(java.lang.String)), [withLfuCacheSettings](../../javadsl/CachingSettings.html#withLfuCacheSettings(akka.http.caching.javadsl.LfuCacheSettings))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### CachingSettingsImpl
		
		
		
		```
		public CachingSettingsImpl​([LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl") lfuCacheSettings)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [CachingSettingsImpl](CachingSettingsImpl.html "class in akka.http.caching.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                com.typesafe.config.Config c)
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
		- #### lfuCacheSettings
		
		
		
		```
		public [LfuCacheSettings](../../scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl") lfuCacheSettings()
		```
		
		
		Specified by:
		`[lfuCacheSettings](../../scaladsl/CachingSettings.html#lfuCacheSettings())` in class `[CachingSettings](../../scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/CachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/CachingSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/CachingSettingsImpl.html)*