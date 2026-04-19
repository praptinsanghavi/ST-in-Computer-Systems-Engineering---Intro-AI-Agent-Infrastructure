---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html
title: ParserSettings$
---

# ParserSettings$

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ParserSettings$

- java.lang.Object
- - akka.http.javadsl.settings.ParserSettings$

- All Implemented Interfaces:
`[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")>`

---

```
public class ParserSettings$
extends java.lang.Object
implements [SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ParserSettings$](ParserSettings$.html "class in akka.http.javadsl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParserSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Deprecated. Use forServer or forClient instead. |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use forServer or forClient instead. |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` | Deprecated. Use forServer or forClient instead. |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[forClient](#forClient(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[forServer](#forServer(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ParserSettings$](ParserSettings$.html "class in akka.http.javadsl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ParserSettings$
		
		
		
		```
		public ParserSettings$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use forServer or forClient instead.
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#create(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		 
		 Java API
		
		
		
		Specified by:
		`[create](SettingsCompanion.html#create(com.typesafe.config.Config))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		
		Deprecated.
		Use forServer or forClient instead.
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#create(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		 
		 Java API
		
		
		
		Specified by:
		`[create](SettingsCompanion.html#create(java.lang.String))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		
		Deprecated.
		Use forServer or forClient instead.
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#create(akka.actor.ActorSystem))`
		WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java.
		 Creates an instance of settings using the configuration provided by the given ActorSystem.
		 
		 Java API
		
		
		
		Specified by:
		`[create](SettingsCompanion.html#create(akka.actor.ActorSystem))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")>`
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### forServer
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") forServer​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### forClient
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") forClient​(akka.actor.ClassicActorSystemProvider system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html)*