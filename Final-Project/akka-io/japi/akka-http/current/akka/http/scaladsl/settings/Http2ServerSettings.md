---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html
title: Http2ServerSettings.Http2ServerSettingsImpl$
---

# Http2ServerSettings.Http2ServerSettingsImpl$

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class Http2ServerSettings.Http2ServerSettingsImpl$

- java.lang.Object
- - [akka.http.impl.util.SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[Http2ServerSettings.Http2ServerSettingsImpl](Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")\>
	- - akka.http.scaladsl.settings.Http2ServerSettings.Http2ServerSettingsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing interface:
[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.scaladsl.settings")

---

```
public static class Http2ServerSettings.Http2ServerSettingsImpl$
extends [SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[Http2ServerSettings.Http2ServerSettingsImpl](Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.settings.Http2ServerSettings.Http2ServerSettingsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2ServerSettings.Http2ServerSettingsImpl$](Http2ServerSettings.Http2ServerSettingsImpl$.html "class in akka.http.scaladsl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2ServerSettingsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Http2ServerSettings.Http2ServerSettingsImpl](Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.util.[SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")
		
		
		`[apply](../../impl/util/SettingsCompanionImpl.html#apply(akka.actor.ActorSystem)), [apply](../../impl/util/SettingsCompanionImpl.html#apply(com.typesafe.config.Config)), [apply](../../impl/util/SettingsCompanionImpl.html#apply(java.lang.String)), [configAdditions](../../impl/util/SettingsCompanionImpl.html#configAdditions()), [prefix](../../impl/util/SettingsCompanionImpl.html#prefix())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2ServerSettings.Http2ServerSettingsImpl$](Http2ServerSettings.Http2ServerSettingsImpl$.html "class in akka.http.scaladsl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2ServerSettingsImpl$
		
		
		
		```
		public Http2ServerSettingsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public [Http2ServerSettings.Http2ServerSettingsImpl](Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                                 com.typesafe.config.Config c)
		```
		
		
		Specified by:
		`[fromSubConfig](../../impl/util/SettingsCompanionImpl.html#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))` in class `[SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[Http2ServerSettings.Http2ServerSettingsImpl](Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html)*