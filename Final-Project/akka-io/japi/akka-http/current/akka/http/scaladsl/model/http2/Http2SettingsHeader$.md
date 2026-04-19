---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader$.html
title: Http2SettingsHeader$
---

# Http2SettingsHeader$

## Content

Package [akka.http.scaladsl.model.http2](package-summary.html)
## Class Http2SettingsHeader$

- java.lang.Object
- - akka.http.scaladsl.model.http2\.Http2SettingsHeader$

- ---

```
public class Http2SettingsHeader$
extends java.lang.Object
```

Internal API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2SettingsHeader$](Http2SettingsHeader$.html "class in akka.http.scaladsl.model.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2SettingsHeader$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[headerValueToBinary](#headerValueToBinary(java.lang.String))​(java.lang.String value)` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.util.Try<scala.collection.immutable.Seq<[FrameEvent.Setting](../../../impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2")>>` | `[parse](#parse(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String value,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2SettingsHeader$](Http2SettingsHeader$.html "class in akka.http.scaladsl.model.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2SettingsHeader$
		
		
		
		```
		public Http2SettingsHeader$()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### headerValueToBinary
		
		
		
		```
		public akka.util.ByteString headerValueToBinary​(java.lang.String value)
		```
		- #### parse
		
		
		
		```
		public scala.util.Try<scala.collection.immutable.Seq<[FrameEvent.Setting](../../../impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2")>> parse​(java.lang.String value,
		                                                                                akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2SettingsHeader$.html)*