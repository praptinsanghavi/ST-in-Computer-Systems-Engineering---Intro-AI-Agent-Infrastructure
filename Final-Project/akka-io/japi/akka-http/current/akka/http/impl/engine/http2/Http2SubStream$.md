---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream$.html
title: Http2SubStream$
---

# Http2SubStream$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2SubStream$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2SubStream$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Http2SubStream$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.http2.Http2SubStream$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2SubStream$](Http2SubStream$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2SubStream$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(akka.http.scaladsl.model.HttpEntity,akka.http.impl.engine.http2.FrameEvent.ParsedHeadersFrame,akka.util.OptionVal,scala.collection.immutable.Map))​([HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,  [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers,  akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders,  scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2SubStream$](Http2SubStream$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2SubStream$
		
		
		
		```
		public Http2SubStream$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2") apply​([HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,
		                            [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers,
		                            akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders,
		                            scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream$.html)*