---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader.html
title: Http2SettingsHeader
---

# Http2SettingsHeader

## Content

Package [akka.http.scaladsl.model.http2](package-summary.html)
## Class Http2SettingsHeader

- java.lang.Object
- - akka.http.scaladsl.model.http2\.Http2SettingsHeader

- ---

```
public class Http2SettingsHeader
extends java.lang.Object
```

Internal API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2SettingsHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.util.ByteString` | `[headerValueToBinary](#headerValueToBinary(java.lang.String))​(java.lang.String value)` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Try<scala.collection.immutable.Seq<[FrameEvent.Setting](../../../impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2")>>` | `[parse](#parse(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String value,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2SettingsHeader
		
		
		
		```
		public Http2SettingsHeader()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public static java.lang.String name()
		```
		- #### headerValueToBinary
		
		
		
		```
		public static akka.util.ByteString headerValueToBinary​(java.lang.String value)
		```
		- #### parse
		
		
		
		```
		public static scala.util.Try<scala.collection.immutable.Seq<[FrameEvent.Setting](../../../impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2")>> parse​(java.lang.String value,
		                                                                                       akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader.html)*