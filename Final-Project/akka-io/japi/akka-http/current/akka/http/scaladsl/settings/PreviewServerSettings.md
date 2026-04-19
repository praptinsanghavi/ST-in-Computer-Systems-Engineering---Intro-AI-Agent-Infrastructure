---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
title: PreviewServerSettings
---

# PreviewServerSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class PreviewServerSettings

- java.lang.Object
- - [akka.http.javadsl.settings.PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")
	- - akka.http.scaladsl.settings.PreviewServerSettings

- Direct Known Subclasses:
`[PreviewServerSettingsImpl](../../impl/settings/PreviewServerSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class PreviewServerSettings
extends [PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")
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
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract boolean` | `[enableHttp2](#enableHttp2())()` | Deprecated. Use ServerSettings.http2Enabled instead. |
	| `static [PreviewServerSettingsImpl](../../impl/settings/PreviewServerSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `[PreviewServerSettings](PreviewServerSettings.html "class in akka.http.scaladsl.settings")` | `[withEnableHttp2](#withEnableHttp2(boolean))​(boolean newValue)` | Deprecated. Use ServerSettings.withHttp2Enabled instead. |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/PreviewServerSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/PreviewServerSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/PreviewServerSettings.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PreviewServerSettings
		
		
		
		```
		public PreviewServerSettings()
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [PreviewServerSettingsImpl](../../impl/settings/PreviewServerSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                      com.typesafe.config.Config c)
		```
		- #### apply
		
		
		
		```
		public static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		- #### enableHttp2
		
		
		
		```
		public abstract boolean enableHttp2()
		```
		
		Deprecated.
		Use ServerSettings.http2Enabled instead. Since 10\.5\.0\.
		
		Description copied from class: `[PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html#enableHttp2())`
		Configures the Http extension to bind using HTTP/2 if given an
		 [`HttpsConnectionContext`](../HttpsConnectionContext.html "class in akka.http.scaladsl"). Otherwise binds as plain HTTP.
		
		Specified by:
		`[enableHttp2](../../javadsl/settings/PreviewServerSettings.html#enableHttp2())` in class `[PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### withEnableHttp2
		
		
		
		```
		public [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.scaladsl.settings") withEnableHttp2​(boolean newValue)
		```
		
		Deprecated.
		Use ServerSettings.withHttp2Enabled instead. Since 10\.5\.0\.
		
		
		Overrides:
		`[withEnableHttp2](../../javadsl/settings/PreviewServerSettings.html#withEnableHttp2(boolean))` in class `[PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/PreviewServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html)*