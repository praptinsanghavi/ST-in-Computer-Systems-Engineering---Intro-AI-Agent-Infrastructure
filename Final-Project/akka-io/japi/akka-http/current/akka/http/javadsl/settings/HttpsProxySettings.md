---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
title: HttpsProxySettings
---

# HttpsProxySettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class HttpsProxySettings

- java.lang.Object
- - akka.http.javadsl.settings.HttpsProxySettings

- Direct Known Subclasses:
`[HttpsProxySettings](../../scaladsl/settings/HttpsProxySettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class HttpsProxySettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpsProxySettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `java.lang.String` | `[getHost](#getHost())()` |  |
	| `int` | `[getPort](#getPort())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpsProxySettings
		
		
		
		```
		public HttpsProxySettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		- #### getHost
		
		
		
		```
		public java.lang.String getHost()
		```
		- #### getPort
		
		
		
		```
		public int getPort()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html)*