---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
title: PreviewServerSettings
---

# PreviewServerSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class PreviewServerSettings

- java.lang.Object
- - akka.http.javadsl.settings.PreviewServerSettings

- Direct Known Subclasses:
`[PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class PreviewServerSettings
extends java.lang.Object
```

Public API but not intended for subclassing
 
 Options that are in "preview" or "early access" mode.
 These options may change and/or be removed within patch releases
 without early notice (e.g. by moving them into a stable supported place).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PreviewServerSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract boolean` | `[enableHttp2](#enableHttp2())()` | Configures the Http extension to bind using HTTP/2 if given an  [`HttpsConnectionContext`](../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl"). |
	| `[PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings")` | `[withEnableHttp2](#withEnableHttp2(boolean))​(boolean newValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PreviewServerSettings
		
		
		
		```
		public PreviewServerSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		- #### enableHttp2
		
		
		
		```
		public abstract boolean enableHttp2()
		```
		
		Configures the Http extension to bind using HTTP/2 if given an
		 [`HttpsConnectionContext`](../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl"). Otherwise binds as plain HTTP.
		
		Returns:
		(undocumented)
		- #### withEnableHttp2
		
		
		
		```
		public [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") withEnableHttp2​(boolean newValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html)*