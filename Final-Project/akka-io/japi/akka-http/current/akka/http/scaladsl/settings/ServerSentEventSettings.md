---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
title: ServerSentEventSettings
---

# ServerSentEventSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class ServerSentEventSettings

- java.lang.Object
- - [akka.http.javadsl.settings.ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")
	- - akka.http.scaladsl.settings.ServerSentEventSettings

- Direct Known Subclasses:
`[ServerSentEventSettingsImpl](../../impl/settings/ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class ServerSentEventSettings
extends [ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")
```

Public API but not intended for subclassing
 
 Options that are in "preview" or "early access" mode.
 These options may change and/or be removed within patch releases
 without early notice (e.g. by moving them into a stable supported place).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSentEventSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `static [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `abstract int` | `[maxEventSize](#maxEventSize())()` | The maximum size for parsing server\-sent events |
	| `abstract int` | `[maxLineSize](#maxLineSize())()` | The maximum size for parsing lines of a server\-sent event |
	| `[ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings")` | `[withEmitEmptyEvents](#withEmitEmptyEvents(boolean))​(boolean newValue)` |  |
	| `[ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings")` | `[withLineLength](#withLineLength(int))​(int newValue)` |  |
	| `[ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxEventSize](#withMaxEventSize(int))​(int newValue)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")
		
		
		`[emitEmptyEvents](../../javadsl/settings/ServerSentEventSettings.html#emitEmptyEvents())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServerSentEventSettings
		
		
		
		```
		public ServerSentEventSettings()
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                    com.typesafe.config.Config c)
		```
		- #### apply
		
		
		
		```
		public static [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		- #### maxEventSize
		
		
		
		```
		public abstract int maxEventSize()
		```
		
		Description copied from class: `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html#maxEventSize())`
		The maximum size for parsing server\-sent events
		
		Specified by:
		`[maxEventSize](../../javadsl/settings/ServerSentEventSettings.html#maxEventSize())` in class `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### maxLineSize
		
		
		
		```
		public abstract int maxLineSize()
		```
		
		Description copied from class: `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html#maxLineSize())`
		The maximum size for parsing lines of a server\-sent event
		
		Specified by:
		`[maxLineSize](../../javadsl/settings/ServerSentEventSettings.html#maxLineSize())` in class `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### withMaxEventSize
		
		
		
		```
		public [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings") withMaxEventSize​(int newValue)
		```
		
		
		Overrides:
		`[withMaxEventSize](../../javadsl/settings/ServerSentEventSettings.html#withMaxEventSize(int))` in class `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")`
		- #### withLineLength
		
		
		
		```
		public [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings") withLineLength​(int newValue)
		```
		
		
		Overrides:
		`[withLineLength](../../javadsl/settings/ServerSentEventSettings.html#withLineLength(int))` in class `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")`
		- #### withEmitEmptyEvents
		
		
		
		```
		public [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.scaladsl.settings") withEmitEmptyEvents​(boolean newValue)
		```
		
		
		Overrides:
		`[withEmitEmptyEvents](../../javadsl/settings/ServerSentEventSettings.html#withEmitEmptyEvents(boolean))` in class `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html)*