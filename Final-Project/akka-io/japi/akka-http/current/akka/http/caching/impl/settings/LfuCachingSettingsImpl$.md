---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html
title: LfuCachingSettingsImpl$
---

# LfuCachingSettingsImpl$

## Content

Package [akka.http.caching.impl.settings](package-summary.html)
## Class LfuCachingSettingsImpl$

- java.lang.Object
- - [akka.http.impl.util.SettingsCompanionImpl](../../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")\>
	- - akka.http.caching.impl.settings.LfuCachingSettingsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LfuCachingSettingsImpl$
extends [SettingsCompanionImpl](../../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")>
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.caching.impl.settings.LfuCachingSettingsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LfuCachingSettingsImpl$](LfuCachingSettingsImpl$.html "class in akka.http.caching.impl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCachingSettingsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config inner)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.util.[SettingsCompanionImpl](../../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")
		
		
		`[apply](../../../impl/util/SettingsCompanionImpl.html#apply(akka.actor.ActorSystem)), [apply](../../../impl/util/SettingsCompanionImpl.html#apply(com.typesafe.config.Config)), [apply](../../../impl/util/SettingsCompanionImpl.html#apply(java.lang.String)), [configAdditions](../../../impl/util/SettingsCompanionImpl.html#configAdditions()), [prefix](../../../impl/util/SettingsCompanionImpl.html#prefix())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LfuCachingSettingsImpl$](LfuCachingSettingsImpl$.html "class in akka.http.caching.impl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LfuCachingSettingsImpl$
		
		
		
		```
		public LfuCachingSettingsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public [LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                            com.typesafe.config.Config inner)
		```
		
		
		Specified by:
		`[fromSubConfig](../../../impl/util/SettingsCompanionImpl.html#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))` in class `[SettingsCompanionImpl](../../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[LfuCachingSettingsImpl](LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html)*