---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl$.html
title: ServerSettingsImpl$
---

# ServerSettingsImpl$

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ServerSettingsImpl$

- java.lang.Object
- - [akka.http.impl.util.SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings")\>
	- - akka.http.impl.settings.ServerSettingsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ServerSettingsImpl$
extends [SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings")>
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ServerSettingsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ServerSettingsImpl$](ServerSettingsImpl$.html "class in akka.http.impl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSettingsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `[ServerSettings.Timeouts](../../javadsl/settings/ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings")` | `[timeoutsShortcut](#timeoutsShortcut(akka.http.javadsl.settings.ServerSettings))​([ServerSettings](../../javadsl/settings/ServerSettings.html "class in akka.http.javadsl.settings") s)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.util.[SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")
		
		
		`[apply](../util/SettingsCompanionImpl.html#apply(akka.actor.ActorSystem)), [apply](../util/SettingsCompanionImpl.html#apply(com.typesafe.config.Config)), [apply](../util/SettingsCompanionImpl.html#apply(java.lang.String)), [configAdditions](../util/SettingsCompanionImpl.html#configAdditions()), [prefix](../util/SettingsCompanionImpl.html#prefix())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ServerSettingsImpl$](ServerSettingsImpl$.html "class in akka.http.impl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ServerSettingsImpl$
		
		
		
		```
		public ServerSettingsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### timeoutsShortcut
		
		
		
		```
		public [ServerSettings.Timeouts](../../javadsl/settings/ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings") timeoutsShortcut​([ServerSettings](../../javadsl/settings/ServerSettings.html "class in akka.http.javadsl.settings") s)
		```
		- #### fromSubConfig
		
		
		
		```
		public [ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                        com.typesafe.config.Config c)
		```
		
		
		Specified by:
		`[fromSubConfig](../util/SettingsCompanionImpl.html#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))` in class `[SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.Timeouts.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl$.html)*