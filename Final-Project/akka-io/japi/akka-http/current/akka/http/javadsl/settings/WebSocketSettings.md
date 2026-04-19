---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
title: WebSocketSettings
---

# WebSocketSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Interface WebSocketSettings

- All Known Implementing Classes:
`[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`, `[WebSocketSettingsImpl](../../impl/settings/WebSocketSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public interface WebSocketSettings
```

Public API but not intended for subclassing

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.function.Supplier<akka.util.ByteString>` | `[getPeriodicKeepAliveData](#getPeriodicKeepAliveData())()` | The provided supplier will be invoked for each new keep\-alive frame that is sent. |
	| `java.util.function.Supplier<java.util.Random>` | `[getRandomFactory](#getRandomFactory())()` |  |
	| `boolean` | `[logFrames](#logFrames())()` |  |
	| `scala.concurrent.duration.Duration` | `[periodicKeepAliveMaxIdle](#periodicKeepAliveMaxIdle())()` |  |
	| `java.lang.String` | `[periodicKeepAliveMode](#periodicKeepAliveMode())()` |  |
	| `scala.concurrent.duration.Duration` | `[receiveIdleTimeout](#receiveIdleTimeout())()` |  |
	| `scala.concurrent.duration.Duration` | `[sendIdleTimeout](#sendIdleTimeout())()` |  |
	| `[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[withLogFrames](#withLogFrames(boolean))​(boolean shouldLog)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[withPeriodicKeepAliveData](#withPeriodicKeepAliveData(java.util.function.Supplier))​(java.util.function.Supplier<akka.util.ByteString> newValue)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[withPeriodicKeepAliveMaxIdle](#withPeriodicKeepAliveMaxIdle(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[withPeriodicKeepAliveMode](#withPeriodicKeepAliveMode(java.lang.String))​(java.lang.String newValue)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[withRandomFactoryFactory](#withRandomFactoryFactory(java.util.function.Supplier))​(java.util.function.Supplier<java.util.Random> newValue)` |  |

- - ### Method Detail
	
	
	
		- #### getRandomFactory
		
		
		
		```
		java.util.function.Supplier<java.util.Random> getRandomFactory()
		```
		- #### receiveIdleTimeout
		
		
		
		```
		scala.concurrent.duration.Duration receiveIdleTimeout()
		```
		- #### sendIdleTimeout
		
		
		
		```
		scala.concurrent.duration.Duration sendIdleTimeout()
		```
		- #### periodicKeepAliveMode
		
		
		
		```
		java.lang.String periodicKeepAliveMode()
		```
		- #### periodicKeepAliveMaxIdle
		
		
		
		```
		scala.concurrent.duration.Duration periodicKeepAliveMaxIdle()
		```
		- #### getPeriodicKeepAliveData
		
		
		
		```
		java.util.function.Supplier<akka.util.ByteString> getPeriodicKeepAliveData()
		```
		
		The provided supplier will be invoked for each new keep\-alive frame that is sent.
		 The ByteString will be included in the Ping or Pong frame sent as heartbeat,
		 so keep in mind to keep it relatively small, in order not to make the frames too bloated.
		
		Returns:
		(undocumented)
		- #### withRandomFactoryFactory
		
		
		
		```
		[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") withRandomFactoryFactory​(java.util.function.Supplier<java.util.Random> newValue)
		```
		- #### withPeriodicKeepAliveMode
		
		
		
		```
		[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") withPeriodicKeepAliveMode​(java.lang.String newValue)
		```
		- #### withPeriodicKeepAliveMaxIdle
		
		
		
		```
		[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") withPeriodicKeepAliveMaxIdle​(scala.concurrent.duration.Duration newValue)
		```
		- #### withPeriodicKeepAliveData
		
		
		
		```
		[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") withPeriodicKeepAliveData​(java.util.function.Supplier<akka.util.ByteString> newValue)
		```
		- #### logFrames
		
		
		
		```
		boolean logFrames()
		```
		- #### withLogFrames
		
		
		
		```
		[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") withLogFrames​(boolean shouldLog)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html)*