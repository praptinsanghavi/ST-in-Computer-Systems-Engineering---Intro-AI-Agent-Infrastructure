---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.html
title: Http2Protocol.SettingIdentifier$
---

# Http2Protocol.SettingIdentifier$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Protocol.SettingIdentifier$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$

- Enclosing class:
[Http2Protocol](Http2Protocol.html "class in akka.http.impl.engine.http2")

---

```
public static class Http2Protocol.SettingIdentifier$
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Http2Protocol.SettingIdentifier$.SETTINGS_ENABLE_PUSH$](Http2Protocol.SettingIdentifier$.SETTINGS_ENABLE_PUSH$.html "class in akka.http.impl.engine.http2")` | SETTINGS\_ENABLE\_PUSH (0x2\): This setting can be used to disable  server push (Section 8\.2\). |
	| `static class` | `[Http2Protocol.SettingIdentifier$.SETTINGS_HEADER_TABLE_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_HEADER_TABLE_SIZE$.html "class in akka.http.impl.engine.http2")` | SETTINGS\_HEADER\_TABLE\_SIZE (0x1\): Allows the sender to inform the  remote endpoint of the maximum size of the header compression  table used to decode header blocks, in octets. |
	| `static class` | `[Http2Protocol.SettingIdentifier$.SETTINGS_INITIAL_WINDOW_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_INITIAL_WINDOW_SIZE$.html "class in akka.http.impl.engine.http2")` | SETTINGS\_INITIAL\_WINDOW\_SIZE (0x4\): Indicates the sender's initial  window size (in octets) for stream\-level flow control. |
	| `static class` | `[Http2Protocol.SettingIdentifier$.SETTINGS_MAX_CONCURRENT_STREAMS$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_CONCURRENT_STREAMS$.html "class in akka.http.impl.engine.http2")` | SETTINGS\_MAX\_CONCURRENT\_STREAMS (0x3\): Indicates the maximum number  of concurrent streams that the sender will allow. |
	| `static class` | `[Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html "class in akka.http.impl.engine.http2")` | SETTINGS\_MAX\_FRAME\_SIZE (0x5\): Indicates the size of the largest  frame payload that the sender is willing to receive, in octets. |
	| `static class` | `[Http2Protocol.SettingIdentifier$.SETTINGS_MAX_HEADER_LIST_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_HEADER_LIST_SIZE$.html "class in akka.http.impl.engine.http2")` | SETTINGS\_MAX\_HEADER\_LIST\_SIZE (0x6\): This advisory setting informs a  peer of the maximum size of header list that the sender is  prepared to accept, in octets. |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2Protocol.SettingIdentifier$](Http2Protocol.SettingIdentifier$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SettingIdentifier$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")>` | `[All](#All())()` |  |
	| `akka.util.OptionVal<[Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")>` | `[byId](#byId(int))​(int id)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2Protocol.SettingIdentifier$](Http2Protocol.SettingIdentifier$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SettingIdentifier$
		
		
		
		```
		public SettingIdentifier$()
		```

	- ### Method Detail
	
	
	
		- #### All
		
		
		
		```
		public scala.collection.immutable.Seq<[Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")> All()
		```
		- #### byId
		
		
		
		```
		public akka.util.OptionVal<[Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")> byId​(int id)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_ENABLE_PUSH$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_HEADER_TABLE_SIZE$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_INITIAL_WINDOW_SIZE$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_CONCURRENT_STREAMS$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_HEADER_LIST_SIZE$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.html)*