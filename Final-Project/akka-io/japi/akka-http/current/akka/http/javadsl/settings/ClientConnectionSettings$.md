---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html
title: ClientConnectionSettings$
---

# ClientConnectionSettings$

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ClientConnectionSettings$

- java.lang.Object
- - akka.http.javadsl.settings.ClientConnectionSettings$

- All Implemented Interfaces:
`[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")>`

---

```
public class ClientConnectionSettings$
extends java.lang.Object
implements [SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClientConnectionSettings$](ClientConnectionSettings$.html "class in akka.http.javadsl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientConnectionSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java. |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClientConnectionSettings$](ClientConnectionSettings$.html "class in akka.http.javadsl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClientConnectionSettings$
		
		
		
		```
		public ClientConnectionSettings$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#create(com.typesafe.config.Config))`
		Creates an instance of settings using the given Config.
		 
		 Java API
		
		
		
		Specified by:
		`[create](SettingsCompanion.html#create(com.typesafe.config.Config))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")>`
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#create(java.lang.String))`
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		 
		 Java API
		
		
		
		Specified by:
		`[create](SettingsCompanion.html#create(java.lang.String))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")>`
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		
		Description copied from interface: `[SettingsCompanion](SettingsCompanion.html#create(akka.actor.ActorSystem))`
		WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java.
		 Creates an instance of settings using the configuration provided by the given ActorSystem.
		 
		 Java API
		
		
		
		Specified by:
		`[create](SettingsCompanion.html#create(akka.actor.ActorSystem))` in interface `[SettingsCompanion](SettingsCompanion.html "interface in akka.http.javadsl.settings")<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")>`
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html)*