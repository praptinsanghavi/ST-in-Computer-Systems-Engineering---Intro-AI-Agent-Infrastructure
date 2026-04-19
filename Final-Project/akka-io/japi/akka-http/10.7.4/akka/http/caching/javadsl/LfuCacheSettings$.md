---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings$.html
title: LfuCacheSettings$
---

# LfuCacheSettings$

## Content

Package [akka.http.caching.javadsl](package-summary.html)
## Class LfuCacheSettings$

- java.lang.Object
- - akka.http.caching.javadsl.LfuCacheSettings$

- All Implemented Interfaces:
`[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")>`

---

```
public class LfuCacheSettings$
extends java.lang.Object
implements [SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LfuCacheSettings$](LfuCacheSettings$.html "class in akka.http.caching.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCacheSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.javadsl.settings.[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/SettingsCompanion.html#create(akka.actor.ActorSystem))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LfuCacheSettings$](LfuCacheSettings$.html "class in akka.http.caching.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LfuCacheSettings$
		
		
		
		```
		public LfuCacheSettings$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") create​(com.typesafe.config.Config config)
		```
		
		Description copied from interface: `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html#create(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		 
		 Java API
		
		
		
		Specified by:
		`[create](../../javadsl/settings/SettingsCompanion.html#create(com.typesafe.config.Config))` in interface `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl") create​(java.lang.String configOverrides)
		```
		
		Description copied from interface: `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html#create(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		 
		 Java API
		
		
		
		Specified by:
		`[create](../../javadsl/settings/SettingsCompanion.html#create(java.lang.String))` in interface `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[LfuCacheSettings](LfuCacheSettings.html "class in akka.http.caching.javadsl")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/SettingsCompanion.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings$.html)*