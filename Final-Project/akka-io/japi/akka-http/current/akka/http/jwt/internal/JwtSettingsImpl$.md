---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl$.html
title: JwtSettingsImpl$
---

# JwtSettingsImpl$

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtSettingsImpl$

- java.lang.Object
- - [akka.http.impl.util.SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal")\>
	- - akka.http.jwt.internal.JwtSettingsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class JwtSettingsImpl$
extends [SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal")>
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.jwt.internal.JwtSettingsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JwtSettingsImpl$](JwtSettingsImpl$.html "class in akka.http.jwt.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtSettingsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config inner)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.util.[SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")
		
		
		`[apply](../../impl/util/SettingsCompanionImpl.html#apply(akka.actor.ActorSystem)), [apply](../../impl/util/SettingsCompanionImpl.html#apply(com.typesafe.config.Config)), [apply](../../impl/util/SettingsCompanionImpl.html#apply(java.lang.String)), [configAdditions](../../impl/util/SettingsCompanionImpl.html#configAdditions()), [prefix](../../impl/util/SettingsCompanionImpl.html#prefix())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JwtSettingsImpl$](JwtSettingsImpl$.html "class in akka.http.jwt.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JwtSettingsImpl$
		
		
		
		```
		public JwtSettingsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public [JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal") fromSubConfig​(com.typesafe.config.Config root,
		                                     com.typesafe.config.Config inner)
		```
		
		
		Specified by:
		`[fromSubConfig](../../impl/util/SettingsCompanionImpl.html#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))` in class `[SettingsCompanionImpl](../../impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")<[JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl$.html)*