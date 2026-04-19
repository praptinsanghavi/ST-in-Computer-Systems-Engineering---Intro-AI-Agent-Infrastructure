---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
title: Http2SubStream
---

# Http2SubStream

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2SubStream

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2SubStream

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Http2SubStream
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Represents one direction of an Http2 substream.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.http2.Http2SubStream)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2SubStream](#%3Cinit%3E(akka.http.impl.engine.http2.FrameEvent.ParsedHeadersFrame,akka.util.OptionVal,scala.util.Either,scala.collection.immutable.Map))​([FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") initialHeaders,  akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders,  scala.util.Either<akka.util.ByteString,​akka.stream.scaladsl.Source<java.lang.Object,​java.lang.Object>> data,  scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(akka.http.scaladsl.model.HttpEntity,akka.http.impl.engine.http2.FrameEvent.ParsedHeadersFrame,akka.util.OptionVal,scala.collection.immutable.Map))​([HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,  [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers,  akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders,  scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)` |  |
	| `scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object>` | `[correlationAttributes](#correlationAttributes())()` |  |
	| `[RequestEntity](../../../scaladsl/model/RequestEntity.html "interface in akka.http.scaladsl.model")` | `[createEntity](#createEntity(long,akka.util.OptionVal))​(long contentLength,  akka.util.OptionVal<[ContentType](../../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model")> contentTypeOption)` | Create the request entity (when we're the server) or response entity (when we're the client) for this substream |
	| `scala.util.Either<akka.util.ByteString,​akka.stream.scaladsl.Source<java.lang.Object,​java.lang.Object>>` | `[data](#data())()` |  |
	| `boolean` | `[hasEntity](#hasEntity())()` |  |
	| `[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")` | `[initialHeaders](#initialHeaders())()` |  |
	| `int` | `[streamId](#streamId())()` |  |
	| `akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")>` | `[trailingHeaders](#trailingHeaders())()` |  |
	| `[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")` | `[withCorrelationAttributes](#withCorrelationAttributes(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> newAttributes)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### Http2SubStream
		
		
		
		```
		public Http2SubStream​([FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") initialHeaders,
		                      akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders,
		                      scala.util.Either<akka.util.ByteString,​akka.stream.scaladsl.Source<java.lang.Object,​java.lang.Object>> data,
		                      scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2") apply​([HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity,
		                                   [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers,
		                                   akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders,
		                                   scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)
		```
		- #### initialHeaders
		
		
		
		```
		public [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") initialHeaders()
		```
		- #### trailingHeaders
		
		
		
		```
		public akka.util.OptionVal<[FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")> trailingHeaders()
		```
		- #### data
		
		
		
		```
		public scala.util.Either<akka.util.ByteString,​akka.stream.scaladsl.Source<java.lang.Object,​java.lang.Object>> data()
		```
		- #### correlationAttributes
		
		
		
		```
		public scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes()
		```
		- #### streamId
		
		
		
		```
		public int streamId()
		```
		- #### hasEntity
		
		
		
		```
		public boolean hasEntity()
		```
		- #### withCorrelationAttributes
		
		
		
		```
		public [Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2") withCorrelationAttributes​(scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> newAttributes)
		```
		- #### createEntity
		
		
		
		```
		public [RequestEntity](../../../scaladsl/model/RequestEntity.html "interface in akka.http.scaladsl.model") createEntity​(long contentLength,
		                                  akka.util.OptionVal<[ContentType](../../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model")> contentTypeOption)
		```
		
		Create the request entity (when we're the server) or response entity (when we're the client) for this substream
		
		Parameters:
		`contentLength` \- (undocumented)
		`contentTypeOption` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html)*