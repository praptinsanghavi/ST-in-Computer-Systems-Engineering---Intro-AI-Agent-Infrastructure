---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
title: ServerSentEventSettings
---

# ServerSentEventSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ServerSentEventSettings

- java.lang.Object
- - akka.http.javadsl.settings.ServerSentEventSettings

- Direct Known Subclasses:
`[ServerSentEventSettings](../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class ServerSentEventSettings
extends java.lang.Object
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
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[emitEmptyEvents](#emitEmptyEvents())()` | Should events with empty data field be passed to the application. |
	| `abstract int` | `[maxEventSize](#maxEventSize())()` | The maximum size for parsing server\-sent events |
	| `abstract int` | `[maxLineSize](#maxLineSize())()` | The maximum size for parsing lines of a server\-sent event |
	| `[ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.javadsl.settings")` | `[withEmitEmptyEvents](#withEmitEmptyEvents(boolean))​(boolean newValue)` |  |
	| `[ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.javadsl.settings")` | `[withLineLength](#withLineLength(int))​(int newValue)` |  |
	| `[ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.javadsl.settings")` | `[withMaxEventSize](#withMaxEventSize(int))​(int newValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServerSentEventSettings
		
		
		
		```
		public ServerSentEventSettings()
		```

	- ### Method Detail
	
	
	
		- #### emitEmptyEvents
		
		
		
		```
		public abstract boolean emitEmptyEvents()
		```
		
		Should events with empty data field be passed to the application.
		
		Returns:
		(undocumented)
		- #### maxEventSize
		
		
		
		```
		public abstract int maxEventSize()
		```
		
		The maximum size for parsing server\-sent events
		
		Returns:
		(undocumented)
		- #### maxLineSize
		
		
		
		```
		public abstract int maxLineSize()
		```
		
		The maximum size for parsing lines of a server\-sent event
		
		Returns:
		(undocumented)
		- #### withEmitEmptyEvents
		
		
		
		```
		public [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.javadsl.settings") withEmitEmptyEvents​(boolean newValue)
		```
		- #### withLineLength
		
		
		
		```
		public [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.javadsl.settings") withLineLength​(int newValue)
		```
		- #### withMaxEventSize
		
		
		
		```
		public [ServerSentEventSettings](ServerSentEventSettings.html "class in akka.http.javadsl.settings") withMaxEventSize​(int newValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html)*