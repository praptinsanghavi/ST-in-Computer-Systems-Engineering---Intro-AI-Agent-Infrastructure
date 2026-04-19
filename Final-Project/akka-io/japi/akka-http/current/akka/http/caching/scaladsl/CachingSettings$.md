---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings$.html
title: CachingSettings$
---

# CachingSettings$

## Content

Package [akka.http.caching.scaladsl](package-summary.html)
## Class CachingSettings$

- java.lang.Object
- - akka.http.caching.scaladsl.CachingSettings$

- All Implemented Interfaces:
`[SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")>`

---

```
public class CachingSettings$
extends java.lang.Object
implements [SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CachingSettings$](CachingSettings$.html "class in akka.http.caching.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachingSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.settings.[SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html "interface in akka.http.scaladsl.settings")
		
		
		`[apply](../../scaladsl/settings/SettingsCompanion.html#apply(akka.actor.ActorSystem)), [apply](../../scaladsl/settings/SettingsCompanion.html#apply(akka.actor.ClassicActorSystemProvider))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CachingSettings$](CachingSettings$.html "class in akka.http.caching.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CachingSettings$
		
		
		
		```
		public CachingSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl") apply​(com.typesafe.config.Config config)
		```
		
		Description copied from interface: `[SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html#apply(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		
		Specified by:
		`[apply](../../scaladsl/settings/SettingsCompanion.html#apply(com.typesafe.config.Config))` in interface `[SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl") apply​(java.lang.String configOverrides)
		```
		
		Description copied from interface: `[SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html#apply(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		
		Specified by:
		`[apply](../../scaladsl/settings/SettingsCompanion.html#apply(java.lang.String))` in interface `[SettingsCompanion](../../scaladsl/settings/SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[CachingSettings](CachingSettings.html "class in akka.http.caching.scaladsl")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings$.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings$.html)*