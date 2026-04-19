---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html
title: JsonEntityStreamingSupport
---

# JsonEntityStreamingSupport

## Content

Package [akka.http.scaladsl.marshallers.sprayjson](package-summary.html)
## Class JsonEntityStreamingSupport

- java.lang.Object
- - [akka.http.javadsl.common.EntityStreamingSupport](../../../javadsl/common/EntityStreamingSupport.html "class in akka.http.javadsl.common")
	- - [akka.http.scaladsl.common.EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")
		- - [akka.http.javadsl.common.JsonEntityStreamingSupport](../../../javadsl/common/JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")
			- - akka.http.scaladsl.marshallers.sprayjson.JsonEntityStreamingSupport

- ---

```
public final class JsonEntityStreamingSupport
extends [JsonEntityStreamingSupport](../../../javadsl/common/JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JsonEntityStreamingSupport](#%3Cinit%3E(int))​(int maxObjectSize)` |  |
	| `[JsonEntityStreamingSupport](#%3Cinit%3E(int,akka.http.scaladsl.model.ContentTypeRange,akka.http.scaladsl.model.ContentType,akka.stream.scaladsl.Flow,int,boolean))​(int maxObjectSize,  [ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model") supported,  [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") contentType,  akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRenderer,  int parallelism,  boolean unordered)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model")` | `[contentType](#contentType())()` | Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response. |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[framingDecoder](#framingDecoder())()` | Read\-side, decode incoming framed entity. |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[framingRenderer](#framingRenderer())()` | Write\-side, apply framing to outgoing entity stream. |
	| `int` | `[parallelism](#parallelism())()` | Write\-side / read\-side, defines if (un)marshalling should be done in parallel. |
	| `[ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model")` | `[supported](#supported())()` | Read\-side, what content types it is able to frame and unmarshall. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `boolean` | `[unordered](#unordered())()` | Write\-side / read\-side, defines if (un)marshalling should preserve ordering of incoming stream elements. |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[withContentType](#withContentType(akka.http.javadsl.model.ContentType))​([ContentType](../../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") ct)` | Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response. |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[withFramingRenderer](#withFramingRenderer(akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRendererFlow)` |  |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[withFramingRendererFlow](#withFramingRendererFlow(akka.stream.javadsl.Flow))​(akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRendererFlow)` | Java API: Write\-side, apply framing to outgoing entity stream. |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[withParallelMarshalling](#withParallelMarshalling(int,boolean))​(int parallelism,  boolean unordered)` | Write\-side / read\-side, defines parallelism and if ordering should be preserved or not of Source element marshalling. |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[withSupported](#withSupported(akka.http.javadsl.model.ContentTypeRange))​([ContentTypeRange](../../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model") range)` | Read\-side, allows changing what content types are accepted by this framing. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.common.[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")
		
		
		`[csv](../../common/EntityStreamingSupport.html#csv()), [csv](../../common/EntityStreamingSupport.html#csv(int)), [getFramingDecoder](../../common/EntityStreamingSupport.html#getFramingDecoder()), [getFramingRenderer](../../common/EntityStreamingSupport.html#getFramingRenderer()), [json](../../common/EntityStreamingSupport.html#json()), [json](../../common/EntityStreamingSupport.html#json(int))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JsonEntityStreamingSupport
		
		
		
		```
		public JsonEntityStreamingSupport​(int maxObjectSize,
		                                  [ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model") supported,
		                                  [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                                  akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRenderer,
		                                  int parallelism,
		                                  boolean unordered)
		```
		- #### JsonEntityStreamingSupport
		
		
		
		```
		public JsonEntityStreamingSupport​(int maxObjectSize)
		```

	- ### Method Detail
	
	
	
		- #### contentType
		
		
		
		```
		public [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") contentType()
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#contentType())`
		Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.
		
		Specified by:
		`[contentType](../../common/EntityStreamingSupport.html#contentType())` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		- #### framingDecoder
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingDecoder()
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#framingDecoder())`
		Read\-side, decode incoming framed entity.
		 For example with an incoming JSON array, chunk it up into JSON objects contained within that array.
		
		Specified by:
		`[framingDecoder](../../common/EntityStreamingSupport.html#framingDecoder())` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Returns:
		(undocumented)
		- #### framingRenderer
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRenderer()
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#framingRenderer())`
		Write\-side, apply framing to outgoing entity stream.
		 
		 Most typical usage will be a variant of `Flow[ByteString].intersperse`.
		 
		
		
		 For example for rendering a JSON array one would return
		 `Flow[ByteString].intersperse(ByteString("["), ByteString(","), ByteString("]"))`
		 and for rendering a new\-line separated CSV simply `Flow[ByteString].intersperse(ByteString("\n"))`.
		
		
		
		Specified by:
		`[framingRenderer](../../common/EntityStreamingSupport.html#framingRenderer())` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Returns:
		(undocumented)
		- #### parallelism
		
		
		
		```
		public int parallelism()
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#parallelism())`
		Write\-side / read\-side, defines if (un)marshalling should be done in parallel.
		 
		 This may be beneficial marshalling the bottleneck in the pipeline.
		 
		
		
		 See also [`EntityStreamingSupport.parallelism()`](../../common/EntityStreamingSupport.html#parallelism()) and [`EntityStreamingSupport.withParallelMarshalling(int,boolean)`](../../common/EntityStreamingSupport.html#withParallelMarshalling(int,boolean)).
		
		
		
		Specified by:
		`[parallelism](../../common/EntityStreamingSupport.html#parallelism())` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Returns:
		(undocumented)
		- #### supported
		
		
		
		```
		public [ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model") supported()
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#supported())`
		Read\-side, what content types it is able to frame and unmarshall.
		
		Specified by:
		`[supported](../../common/EntityStreamingSupport.html#supported())` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### unordered
		
		
		
		```
		public boolean unordered()
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#unordered())`
		Write\-side / read\-side, defines if (un)marshalling should preserve ordering of incoming stream elements.
		 
		 Allowing for parallel and unordered (un)marshalling often yields higher throughput and also allows avoiding
		 head\-of\-line blocking if some elements are much larger than others.
		 
		
		
		 See also [`EntityStreamingSupport.parallelism()`](../../common/EntityStreamingSupport.html#parallelism()) and [`EntityStreamingSupport.withParallelMarshalling(int,boolean)`](../../common/EntityStreamingSupport.html#withParallelMarshalling(int,boolean)).
		
		
		
		Specified by:
		`[unordered](../../common/EntityStreamingSupport.html#unordered())` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Returns:
		(undocumented)
		- #### withContentType
		
		
		
		```
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") withContentType​([ContentType](../../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") ct)
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#withContentType(akka.http.javadsl.model.ContentType))`
		Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.
		 
		 EntityStreamingSupport traits MUST support re\-configuring the offered `ContentType`.
		 This is due to the need integrating with existing systems which sometimes expect custom Content\-Types,
		 however really are just plain JSON or something else internally (perhaps with slight extensions).
		 
		
		
		 NOTE: Implementations should specialize the return type to their own Type!
		
		
		
		Specified by:
		`[withContentType](../../common/EntityStreamingSupport.html#withContentType(akka.http.javadsl.model.ContentType))` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Parameters:
		`ct` \- (undocumented)
		Returns:
		(undocumented)
		- #### withFramingRenderer
		
		
		
		```
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") withFramingRenderer​(akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRendererFlow)
		```
		- #### withFramingRendererFlow
		
		
		
		```
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") withFramingRendererFlow​(akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> framingRendererFlow)
		```
		
		Description copied from class: `[JsonEntityStreamingSupport](../../../javadsl/common/JsonEntityStreamingSupport.html#withFramingRendererFlow(akka.stream.javadsl.Flow))`
		Java API: Write\-side, apply framing to outgoing entity stream.
		 
		 Most typical usage will be a variant of `Flow[ByteString].intersperse`.
		 
		
		
		 For example for rendering a JSON array one would return
		 `Flow[ByteString].intersperse(ByteString("["), ByteString(","), ByteString("]"))`
		 and for rendering a new\-line separated CSV simply `Flow[ByteString].intersperse(ByteString("\n"))`.
		
		
		
		Specified by:
		`[withFramingRendererFlow](../../../javadsl/common/JsonEntityStreamingSupport.html#withFramingRendererFlow(akka.stream.javadsl.Flow))` in class `[JsonEntityStreamingSupport](../../../javadsl/common/JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")`
		Parameters:
		`framingRendererFlow` \- (undocumented)
		Returns:
		(undocumented)
		- #### withParallelMarshalling
		
		
		
		```
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") withParallelMarshalling​(int parallelism,
		                                                          boolean unordered)
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#withParallelMarshalling(int,boolean))`
		Write\-side / read\-side, defines parallelism and if ordering should be preserved or not of Source element marshalling.
		 
		 Sometimes marshalling multiple elements at once (esp. when elements are not evenly sized, and ordering is not enforced)
		 may yield in higher throughput.
		 
		
		
		 NOTE: Implementations should specialize the return type to their own Type!
		
		
		
		Specified by:
		`[withParallelMarshalling](../../common/EntityStreamingSupport.html#withParallelMarshalling(int,boolean))` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Parameters:
		`parallelism` \- (undocumented)
		`unordered` \- (undocumented)
		Returns:
		(undocumented)
		- #### withSupported
		
		
		
		```
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") withSupported​([ContentTypeRange](../../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model") range)
		```
		
		Description copied from class: `[EntityStreamingSupport](../../common/EntityStreamingSupport.html#withSupported(akka.http.javadsl.model.ContentTypeRange))`
		Read\-side, allows changing what content types are accepted by this framing.
		 
		 EntityStreamingSupport traits MUST support re\-configuring the accepted `ContentTypeRange`.
		 
		
		
		 This is in order to support a\-typical APIs which users still want to communicate with using
		 the provided support trait. Typical examples include APIs which return valid `application/json`
		 however advertise the content type as being `application/javascript` or vendor specific content types,
		 which still parse correctly as JSON, CSV or something else that a provided support trait is built for.
		 
		
		
		 NOTE: Implementations should specialize the return type to their own Type!
		
		
		
		Specified by:
		`[withSupported](../../common/EntityStreamingSupport.html#withSupported(akka.http.javadsl.model.ContentTypeRange))` in class `[EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`
		Parameters:
		`range` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html)*