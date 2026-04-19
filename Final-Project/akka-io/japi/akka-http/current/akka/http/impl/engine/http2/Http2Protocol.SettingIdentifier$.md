---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html
title: Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$
---

# Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_FRAME\_SIZE$

- java.lang.Object
- - [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")
	- - akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_FRAME\_SIZE$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Http2Protocol.SettingIdentifier$](Http2Protocol.SettingIdentifier$.html "class in akka.http.impl.engine.http2")

---

```
public static class Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$
extends [Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")
implements scala.Product, java.io.Serializable
```

SETTINGS\_MAX\_FRAME\_SIZE (0x5\): Indicates the size of the largest
 frame payload that the sender is willing to receive, in octets.
 
 The initial value is 2^14 (16,384\) octets. The value advertised
 by an endpoint MUST be between this initial value and the maximum
 allowed frame size (2^24\-1 or 16,777,215 octets), inclusive.
 Values outside this range MUST be treated as a connection error
 (Section 5\.4\.1\) of type PROTOCOL\_ERROR.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.http2.Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SETTINGS_MAX_FRAME_SIZE$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.impl.engine.http2\.[Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2")
		
		
		`[id](Http2Protocol.SettingIdentifier.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SETTINGS\_MAX\_FRAME\_SIZE$
		
		
		
		```
		public SETTINGS_MAX_FRAME_SIZE$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html)*