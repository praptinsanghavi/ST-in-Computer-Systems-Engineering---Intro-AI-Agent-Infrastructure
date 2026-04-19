---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
title: ParserSettings$
---

# ParserSettings$

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class ParserSettings$

- java.lang.Object
- - akka.http.scaladsl.settings.ParserSettings$

- All Implemented Interfaces:
`[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")>`

---

```
public class ParserSettings$
extends java.lang.Object
implements [SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ParserSettings$](ParserSettings$.html "class in akka.http.scaladsl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParserSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use forServer or forClient instead. |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` | Deprecated. Use forServer or forClient instead. |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[forClient](#forClient(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[forServer](#forServer(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.settings.[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")
		
		
		`[apply](SettingsCompanion.html#apply(akka.actor.ActorSystem)), [apply](SettingsCompanion.html#apply(akka.actor.ClassicActorSystemProvider))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ParserSettings$](ParserSettings$.html "class in akka.http.scaladsl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ParserSettings$
		
		
		
		```
		public ParserSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use forServer or forClient instead. Since 10\.2\.0\.
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#apply(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		
		Specified by:
		`[apply](SettingsCompanion.html#apply(com.typesafe.config.Config))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		
		Deprecated.
		Use forServer or forClient instead. Since 10\.2\.0\.
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#apply(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		
		Specified by:
		`[apply](SettingsCompanion.html#apply(java.lang.String))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)
		- #### forServer
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") forServer​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### forClient
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") forClient​(akka.actor.ClassicActorSystemProvider system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html)*