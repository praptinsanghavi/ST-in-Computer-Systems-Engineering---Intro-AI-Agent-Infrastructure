---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
title: WebSocketSettings
---

# WebSocketSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class WebSocketSettings

- java.lang.Object
- - akka.http.scaladsl.settings.WebSocketSettings

- All Implemented Interfaces:
`[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`

Direct Known Subclasses:
`[WebSocketSettingsImpl](../../impl/settings/WebSocketSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class WebSocketSettings
extends java.lang.Object
implements [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.function.Supplier<akka.util.ByteString>` | `[getPeriodicKeepAliveData](#getPeriodicKeepAliveData())()` | The provided supplier will be invoked for each new keep\-alive frame that is sent. |
	| `java.util.function.Supplier<java.util.Random>` | `[getRandomFactory](#getRandomFactory())()` |  |
	| `abstract boolean` | `[logFrames](#logFrames())()` |  |
	| `abstract scala.Function0<akka.util.ByteString>` | `[periodicKeepAliveData](#periodicKeepAliveData())()` | The provided function will be invoked for each new keep\-alive frame that is sent. |
	| `abstract scala.concurrent.duration.Duration` | `[periodicKeepAliveMaxIdle](#periodicKeepAliveMaxIdle())()` |  |
	| `abstract java.lang.String` | `[periodicKeepAliveMode](#periodicKeepAliveMode())()` |  |
	| `abstract scala.Function0<java.util.Random>` | `[randomFactory](#randomFactory())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[receiveIdleTimeout](#receiveIdleTimeout())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[sendIdleTimeout](#sendIdleTimeout())()` |  |
	| `[WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[withLogFrames](#withLogFrames(boolean))​(boolean shouldLog)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[withPeriodicKeepAliveData](#withPeriodicKeepAliveData(scala.Function0))​(scala.Function0<akka.util.ByteString> newValue)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[withPeriodicKeepAliveMaxIdle](#withPeriodicKeepAliveMaxIdle(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[withPeriodicKeepAliveMode](#withPeriodicKeepAliveMode(java.lang.String))​(java.lang.String newValue)` |  |
	| `[WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[withRandomFactoryFactory](#withRandomFactoryFactory(java.util.function.Supplier))​(java.util.function.Supplier<java.util.Random> newValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.javadsl.settings.[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")
		
		
		`[withPeriodicKeepAliveData](../../javadsl/settings/WebSocketSettings.html#withPeriodicKeepAliveData(java.util.function.Supplier))`

- - ### Constructor Detail
	
	
	
		- #### WebSocketSettings
		
		
		
		```
		public WebSocketSettings()
		```

	- ### Method Detail
	
	
	
		- #### getPeriodicKeepAliveData
		
		
		
		```
		public final java.util.function.Supplier<akka.util.ByteString> getPeriodicKeepAliveData()
		```
		
		Description copied from interface: `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html#getPeriodicKeepAliveData())`
		The provided supplier will be invoked for each new keep\-alive frame that is sent.
		 The ByteString will be included in the Ping or Pong frame sent as heartbeat,
		 so keep in mind to keep it relatively small, in order not to make the frames too bloated.
		
		Specified by:
		`[getPeriodicKeepAliveData](../../javadsl/settings/WebSocketSettings.html#getPeriodicKeepAliveData())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### getRandomFactory
		
		
		
		```
		public final java.util.function.Supplier<java.util.Random> getRandomFactory()
		```
		
		
		Specified by:
		`[getRandomFactory](../../javadsl/settings/WebSocketSettings.html#getRandomFactory())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### logFrames
		
		
		
		```
		public abstract boolean logFrames()
		```
		
		
		Specified by:
		`[logFrames](../../javadsl/settings/WebSocketSettings.html#logFrames())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### periodicKeepAliveData
		
		
		
		```
		public abstract scala.Function0<akka.util.ByteString> periodicKeepAliveData()
		```
		
		The provided function will be invoked for each new keep\-alive frame that is sent.
		 The ByteString will be included in the Ping or Pong frame sent as heartbeat,
		 so keep in mind to keep it relatively small, in order not to make the frames too bloated.
		
		Returns:
		(undocumented)
		- #### periodicKeepAliveMaxIdle
		
		
		
		```
		public abstract scala.concurrent.duration.Duration periodicKeepAliveMaxIdle()
		```
		
		
		Specified by:
		`[periodicKeepAliveMaxIdle](../../javadsl/settings/WebSocketSettings.html#periodicKeepAliveMaxIdle())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### periodicKeepAliveMode
		
		
		
		```
		public abstract java.lang.String periodicKeepAliveMode()
		```
		
		
		Specified by:
		`[periodicKeepAliveMode](../../javadsl/settings/WebSocketSettings.html#periodicKeepAliveMode())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### randomFactory
		
		
		
		```
		public abstract scala.Function0<java.util.Random> randomFactory()
		```
		- #### receiveIdleTimeout
		
		
		
		```
		public abstract scala.concurrent.duration.Duration receiveIdleTimeout()
		```
		
		
		Specified by:
		`[receiveIdleTimeout](../../javadsl/settings/WebSocketSettings.html#receiveIdleTimeout())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### sendIdleTimeout
		
		
		
		```
		public abstract scala.concurrent.duration.Duration sendIdleTimeout()
		```
		
		
		Specified by:
		`[sendIdleTimeout](../../javadsl/settings/WebSocketSettings.html#sendIdleTimeout())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### withLogFrames
		
		
		
		```
		public [WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings") withLogFrames​(boolean shouldLog)
		```
		
		
		Specified by:
		`[withLogFrames](../../javadsl/settings/WebSocketSettings.html#withLogFrames(boolean))` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### withPeriodicKeepAliveData
		
		
		
		```
		public [WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings") withPeriodicKeepAliveData​(scala.Function0<akka.util.ByteString> newValue)
		```
		- #### withPeriodicKeepAliveMaxIdle
		
		
		
		```
		public [WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings") withPeriodicKeepAliveMaxIdle​(scala.concurrent.duration.Duration newValue)
		```
		
		
		Specified by:
		`[withPeriodicKeepAliveMaxIdle](../../javadsl/settings/WebSocketSettings.html#withPeriodicKeepAliveMaxIdle(scala.concurrent.duration.Duration))` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### withPeriodicKeepAliveMode
		
		
		
		```
		public [WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings") withPeriodicKeepAliveMode​(java.lang.String newValue)
		```
		
		
		Specified by:
		`[withPeriodicKeepAliveMode](../../javadsl/settings/WebSocketSettings.html#withPeriodicKeepAliveMode(java.lang.String))` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		- #### withRandomFactoryFactory
		
		
		
		```
		public [WebSocketSettings](WebSocketSettings.html "class in akka.http.scaladsl.settings") withRandomFactoryFactory​(java.util.function.Supplier<java.util.Random> newValue)
		```
		
		
		Specified by:
		`[withRandomFactoryFactory](../../javadsl/settings/WebSocketSettings.html#withRandomFactoryFactory(java.util.function.Supplier))` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html)*