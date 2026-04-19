---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html
title: WebSocketSettingsImpl
---

# WebSocketSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class WebSocketSettingsImpl

- java.lang.Object
- - [akka.http.scaladsl.settings.WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")
	- - akka.http.impl.settings.WebSocketSettingsImpl

- All Implemented Interfaces:
`[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WebSocketSettingsImpl
extends [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.WebSocketSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketSettingsImpl](#%3Cinit%3E(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String,scala.concurrent.duration.Duration,scala.Function0,boolean))​(scala.Function0<java.util.Random> randomFactory,  scala.concurrent.duration.Duration receiveIdleTimeout,  scala.concurrent.duration.Duration sendIdleTimeout,  java.lang.String periodicKeepAliveMode,  scala.concurrent.duration.Duration periodicKeepAliveMaxIdle,  scala.Function0<akka.util.ByteString> periodicKeepAliveData,  boolean logFrames)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[client](#client(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[clientFromRoot](#clientFromRoot(com.typesafe.config.Config))​(com.typesafe.config.Config root)` |  |
	| `static boolean` | `[hasNoCustomPeriodicKeepAliveData](#hasNoCustomPeriodicKeepAliveData(akka.http.javadsl.settings.WebSocketSettings))​([WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings") settings)` |  |
	| `boolean` | `[logFrames](#logFrames())()` |  |
	| `scala.Function0<akka.util.ByteString>` | `[periodicKeepAliveData](#periodicKeepAliveData())()` | The provided function will be invoked for each new keep\-alive frame that is sent. |
	| `scala.concurrent.duration.Duration` | `[periodicKeepAliveMaxIdle](#periodicKeepAliveMaxIdle())()` |  |
	| `java.lang.String` | `[periodicKeepAliveMode](#periodicKeepAliveMode())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Function0<java.util.Random>` | `[randomFactory](#randomFactory())()` |  |
	| `scala.concurrent.duration.Duration` | `[receiveIdleTimeout](#receiveIdleTimeout())()` |  |
	| `scala.concurrent.duration.Duration` | `[sendIdleTimeout](#sendIdleTimeout())()` |  |
	| `static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[server](#server(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[serverFromRoot](#serverFromRoot(com.typesafe.config.Config))​(com.typesafe.config.Config root)` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[getPeriodicKeepAliveData](../../scaladsl/settings/WebSocketSettings.html#getPeriodicKeepAliveData()), [getRandomFactory](../../scaladsl/settings/WebSocketSettings.html#getRandomFactory()), [withLogFrames](../../scaladsl/settings/WebSocketSettings.html#withLogFrames(boolean)), [withPeriodicKeepAliveData](../../scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveData(scala.Function0)), [withPeriodicKeepAliveMaxIdle](../../scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveMaxIdle(scala.concurrent.duration.Duration)), [withPeriodicKeepAliveMode](../../scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveMode(java.lang.String)), [withRandomFactoryFactory](../../scaladsl/settings/WebSocketSettings.html#withRandomFactoryFactory(java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`
		- ### Methods inherited from interface akka.http.javadsl.settings.[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")
		
		
		`[withPeriodicKeepAliveData](../../javadsl/settings/WebSocketSettings.html#withPeriodicKeepAliveData(java.util.function.Supplier))`

- - ### Constructor Detail
	
	
	
		- #### WebSocketSettingsImpl
		
		
		
		```
		public WebSocketSettingsImpl​(scala.Function0<java.util.Random> randomFactory,
		                             scala.concurrent.duration.Duration receiveIdleTimeout,
		                             scala.concurrent.duration.Duration sendIdleTimeout,
		                             java.lang.String periodicKeepAliveMode,
		                             scala.concurrent.duration.Duration periodicKeepAliveMaxIdle,
		                             scala.Function0<akka.util.ByteString> periodicKeepAliveData,
		                             boolean logFrames)
		```

	- ### Method Detail
	
	
	
		- #### hasNoCustomPeriodicKeepAliveData
		
		
		
		```
		public static boolean hasNoCustomPeriodicKeepAliveData​([WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings") settings)
		```
		- #### serverFromRoot
		
		
		
		```
		public static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") serverFromRoot​(com.typesafe.config.Config root)
		```
		- #### server
		
		
		
		```
		public static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") server​(com.typesafe.config.Config config)
		```
		- #### clientFromRoot
		
		
		
		```
		public static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") clientFromRoot​(com.typesafe.config.Config root)
		```
		- #### client
		
		
		
		```
		public static [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") client​(com.typesafe.config.Config config)
		```
		- #### randomFactory
		
		
		
		```
		public scala.Function0<java.util.Random> randomFactory()
		```
		
		
		Specified by:
		`[randomFactory](../../scaladsl/settings/WebSocketSettings.html#randomFactory())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		- #### receiveIdleTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration receiveIdleTimeout()
		```
		
		
		Specified by:
		`[receiveIdleTimeout](../../javadsl/settings/WebSocketSettings.html#receiveIdleTimeout())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		Specified by:
		`[receiveIdleTimeout](../../scaladsl/settings/WebSocketSettings.html#receiveIdleTimeout())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		- #### sendIdleTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration sendIdleTimeout()
		```
		
		
		Specified by:
		`[sendIdleTimeout](../../javadsl/settings/WebSocketSettings.html#sendIdleTimeout())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		Specified by:
		`[sendIdleTimeout](../../scaladsl/settings/WebSocketSettings.html#sendIdleTimeout())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		- #### periodicKeepAliveMode
		
		
		
		```
		public java.lang.String periodicKeepAliveMode()
		```
		
		
		Specified by:
		`[periodicKeepAliveMode](../../javadsl/settings/WebSocketSettings.html#periodicKeepAliveMode())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		Specified by:
		`[periodicKeepAliveMode](../../scaladsl/settings/WebSocketSettings.html#periodicKeepAliveMode())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		- #### periodicKeepAliveMaxIdle
		
		
		
		```
		public scala.concurrent.duration.Duration periodicKeepAliveMaxIdle()
		```
		
		
		Specified by:
		`[periodicKeepAliveMaxIdle](../../javadsl/settings/WebSocketSettings.html#periodicKeepAliveMaxIdle())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		Specified by:
		`[periodicKeepAliveMaxIdle](../../scaladsl/settings/WebSocketSettings.html#periodicKeepAliveMaxIdle())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		- #### periodicKeepAliveData
		
		
		
		```
		public scala.Function0<akka.util.ByteString> periodicKeepAliveData()
		```
		
		Description copied from class: `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html#periodicKeepAliveData())`
		The provided function will be invoked for each new keep\-alive frame that is sent.
		 The ByteString will be included in the Ping or Pong frame sent as heartbeat,
		 so keep in mind to keep it relatively small, in order not to make the frames too bloated.
		
		Specified by:
		`[periodicKeepAliveData](../../scaladsl/settings/WebSocketSettings.html#periodicKeepAliveData())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### logFrames
		
		
		
		```
		public boolean logFrames()
		```
		
		
		Specified by:
		`[logFrames](../../javadsl/settings/WebSocketSettings.html#logFrames())` in interface `[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings")`
		Specified by:
		`[logFrames](../../scaladsl/settings/WebSocketSettings.html#logFrames())` in class `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html)*