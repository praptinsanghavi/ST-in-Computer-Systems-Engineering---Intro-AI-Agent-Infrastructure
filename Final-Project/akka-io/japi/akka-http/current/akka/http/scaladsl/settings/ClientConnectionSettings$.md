---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
title: ClientConnectionSettings$
---

# ClientConnectionSettings$

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class ClientConnectionSettings$

- java.lang.Object
- - akka.http.scaladsl.settings.ClientConnectionSettings$

- All Implemented Interfaces:
`[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")>`

---

```
public class ClientConnectionSettings$
extends java.lang.Object
implements [SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClientConnectionSettings$](ClientConnectionSettings$.html "class in akka.http.scaladsl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientConnectionSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.settings.[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")
		
		
		`[apply](SettingsCompanion.html#apply(akka.actor.ActorSystem)), [apply](SettingsCompanion.html#apply(akka.actor.ClassicActorSystemProvider))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClientConnectionSettings$](ClientConnectionSettings$.html "class in akka.http.scaladsl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClientConnectionSettings$
		
		
		
		```
		public ClientConnectionSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#apply(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		
		Specified by:
		`[apply](SettingsCompanion.html#apply(com.typesafe.config.Config))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#apply(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		
		Specified by:
		`[apply](SettingsCompanion.html#apply(java.lang.String))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.scaladsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html)*