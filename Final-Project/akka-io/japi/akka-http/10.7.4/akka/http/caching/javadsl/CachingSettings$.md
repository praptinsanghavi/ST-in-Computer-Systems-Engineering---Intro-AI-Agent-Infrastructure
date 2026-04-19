---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings$.html
title: CachingSettings$
---

# CachingSettings$

## Content

Package [akka.http.caching.javadsl](package-summary.html)
## Class CachingSettings$

- java.lang.Object
- - akka.http.caching.javadsl.CachingSettings$

- All Implemented Interfaces:
`[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")>`

---

```
public class CachingSettings$
extends java.lang.Object
implements [SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CachingSettings$](CachingSettings$.html "class in akka.http.caching.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachingSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java. |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CachingSettings$](CachingSettings$.html "class in akka.http.caching.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CachingSettings$
		
		
		
		```
		public CachingSettings$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") create​(com.typesafe.config.Config config)
		```
		
		Description copied from interface: `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html#create(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		 
		 Java API
		
		
		
		Specified by:
		`[create](../../javadsl/settings/SettingsCompanion.html#create(com.typesafe.config.Config))` in interface `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") create​(java.lang.String configOverrides)
		```
		
		Description copied from interface: `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html#create(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		 
		 Java API
		
		
		
		Specified by:
		`[create](../../javadsl/settings/SettingsCompanion.html#create(java.lang.String))` in interface `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl") create​(akka.actor.ActorSystem system)
		```
		
		Description copied from interface: `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html#create(akka.actor.ActorSystem))`
		WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java.
		 Creates an instance of settings using the configuration provided by the given ActorSystem.
		 
		 Java API
		
		
		
		Specified by:
		`[create](../../javadsl/settings/SettingsCompanion.html#create(akka.actor.ActorSystem))` in interface `[SettingsCompanion](../../javadsl/settings/SettingsCompanion.html "interface in akka.http.javadsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.javadsl")>`
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/SettingsCompanion.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings$.html)*