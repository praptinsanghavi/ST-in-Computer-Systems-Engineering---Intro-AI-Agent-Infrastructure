---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl$.html
title: ServerSentEventSettingsImpl$
---

# ServerSentEventSettingsImpl$

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ServerSentEventSettingsImpl$

- java.lang.Object
- - [akka.http.impl.util.SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")\>
	- - akka.http.impl.settings.ServerSentEventSettingsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ServerSentEventSettingsImpl$
extends [SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ServerSentEventSettingsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ServerSentEventSettingsImpl$](ServerSentEventSettingsImpl$.html "class in akka.http.impl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSentEventSettingsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.util.[SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")
		
		
		`[apply](../util/SettingsCompanionImpl.html#apply(akka.actor.ActorSystem)), [apply](../util/SettingsCompanionImpl.html#apply(com.typesafe.config.Config)), [apply](../util/SettingsCompanionImpl.html#apply(java.lang.String)), [configAdditions](../util/SettingsCompanionImpl.html#configAdditions()), [prefix](../util/SettingsCompanionImpl.html#prefix())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ServerSentEventSettingsImpl$](ServerSentEventSettingsImpl$.html "class in akka.http.impl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ServerSentEventSettingsImpl$
		
		
		
		```
		public ServerSentEventSettingsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public [ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                 com.typesafe.config.Config c)
		```
		
		
		Specified by:
		`[fromSubConfig](../util/SettingsCompanionImpl.html#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))` in class `[SettingsCompanionImpl](../util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl$.html)*