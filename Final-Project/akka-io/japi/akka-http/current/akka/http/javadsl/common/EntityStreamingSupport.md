---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
title: EntityStreamingSupport
---

# EntityStreamingSupport

## Content

Package [akka.http.javadsl.common](package-summary.html)
## Class EntityStreamingSupport

- java.lang.Object
- - akka.http.javadsl.common.EntityStreamingSupport

- Direct Known Subclasses:
`[EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")`

---

```
public abstract class EntityStreamingSupport
extends java.lang.Object
```

Entity streaming support trait allowing rendering and receiving incoming Source\[T, \_] from HTTP entities.
 
 See [`JsonEntityStreamingSupport`](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common") or [`CsvEntityStreamingSupport`](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common") for default implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityStreamingSupport](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model")` | `[contentType](#contentType())()` | Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response. |
	| `static [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[csv](#csv())()` | Default `text/csv(UTF-8)` entity streaming support. |
	| `static [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[csv](#csv(int))​(int maxLineLength)` | Default `text/csv(UTF-8)` entity streaming support. |
	| `abstract akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[getFramingDecoder](#getFramingDecoder())()` | Read\-side, decode incoming framed entity. |
	| `abstract akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[getFramingRenderer](#getFramingRenderer())()` | Write\-side, apply framing to outgoing entity stream. |
	| `static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[json](#json())()` | Default `application/json` entity streaming support. |
	| `static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[json](#json(int))​(int maxObjectLength)` | Default `application/json` entity streaming support. |
	| `abstract int` | `[parallelism](#parallelism())()` | Write\-side / read\-side, defines if (un)marshalling should be done in parallel. |
	| `abstract [ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.javadsl.model")` | `[supported](#supported())()` | Read\-side, what content types it is able to frame and unmarshall. |
	| `abstract boolean` | `[unordered](#unordered())()` | Write\-side / read\-side, defines if (un)marshalling of incoming stream elements should be preserved or not. |
	| `abstract [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[withContentType](#withContentType(akka.http.javadsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") range)` | Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response. |
	| `abstract [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[withParallelMarshalling](#withParallelMarshalling(int,boolean))​(int parallelism,  boolean unordered)` | Write\-side / read\-side, defines parallelism and if ordering should be preserved or not of Source element marshalling. |
	| `abstract [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[withSupported](#withSupported(akka.http.javadsl.model.ContentTypeRange))​([ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.javadsl.model") range)` | Read\-side, allows changing what content types are accepted by this framing. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EntityStreamingSupport
		
		
		
		```
		public EntityStreamingSupport()
		```

	- ### Method Detail
	
	
	
		- #### json
		
		
		
		```
		public static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common") json()
		```
		
		Default `application/json` entity streaming support.
		 
		 Provides framing (based on scanning the incoming dataBytes for valid JSON objects, so for example uploads using arrays or
		 new\-line separated JSON objects are all parsed correctly) and rendering of Sources as JSON Arrays.
		 A different very popular style of returning streaming JSON is to separate JSON objects on a line\-by\-line basis,
		 you can configure the support trait to do so by calling `withFramingRendererFlow`.
		 
		
		
		 Limits the maximum JSON object length to 8KB, if you want to increase this limit provide a value explicitly.
		 
		
		
		 See also <https://en.wikipedia.org/wiki/JSON_Streaming>
		
		
		
		Returns:
		(undocumented)
		- #### json
		
		
		
		```
		public static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common") json​(int maxObjectLength)
		```
		
		Default `application/json` entity streaming support.
		 
		 Provides framing (based on scanning the incoming dataBytes for valid JSON objects, so for example uploads using arrays or
		 new\-line separated JSON objects are all parsed correctly) and rendering of Sources as JSON Arrays.
		 A different very popular style of returning streaming JSON is to separate JSON objects on a line\-by\-line basis,
		 you can configure the support trait to do so by calling `withFramingRendererFlow`.
		 
		
		
		 See also <https://en.wikipedia.org/wiki/JSON_Streaming>
		
		
		
		Parameters:
		`maxObjectLength` \- (undocumented)
		Returns:
		(undocumented)
		- #### csv
		
		
		
		```
		public static [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common") csv()
		```
		
		Default `text/csv(UTF-8)` entity streaming support.
		 Provides framing and rendering of `\n` separated lines and marshalling Sources into such values.
		 
		 Limits the maximum line\-length to 8KB, if you want to increase this limit provide a value explicitly.
		
		
		
		Returns:
		(undocumented)
		- #### csv
		
		
		
		```
		public static [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common") csv​(int maxLineLength)
		```
		
		Default `text/csv(UTF-8)` entity streaming support.
		 Provides framing and rendering of `\n` separated lines and marshalling Sources into such values.
		
		Parameters:
		`maxLineLength` \- (undocumented)
		Returns:
		(undocumented)
		- #### supported
		
		
		
		```
		public abstract [ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.javadsl.model") supported()
		```
		
		Read\-side, what content types it is able to frame and unmarshall.
		- #### contentType
		
		
		
		```
		public abstract [ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType()
		```
		
		Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.
		- #### getFramingDecoder
		
		
		
		```
		public abstract akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> getFramingDecoder()
		```
		
		Read\-side, decode incoming framed entity.
		 For example with an incoming JSON array, chunk it up into JSON objects contained within that array.
		
		Returns:
		(undocumented)
		- #### getFramingRenderer
		
		
		
		```
		public abstract akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> getFramingRenderer()
		```
		
		Write\-side, apply framing to outgoing entity stream.
		 
		 Most typical usage will be a variant of `Flow[ByteString].intersperse`.
		 
		
		
		 For example for rendering a JSON array one would return
		 `Flow[ByteString].intersperse(ByteString("["), ByteString(","), ByteString("]"))`
		 and for rendering a new\-line separated CSV simply `Flow[ByteString].intersperse(ByteString("\n"))`.
		
		
		
		Returns:
		(undocumented)
		- #### withSupported
		
		
		
		```
		public abstract [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common") withSupported​([ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.javadsl.model") range)
		```
		
		Read\-side, allows changing what content types are accepted by this framing.
		 
		 EntityStreamingSupport traits MUST support re\-configuring the accepted `ContentTypeRange`.
		 
		
		
		 This is in order to support a\-typical APIs which users still want to communicate with using
		 the provided support trait. Typical examples include APIs which return valid `application/json`
		 however advertise the content type as being `application/javascript` or vendor specific content types,
		 which still parse correctly as JSON, CSV or something else that a provided support trait is built for.
		 
		
		
		 NOTE: Implementations should specialize the return type to their own Type!
		
		
		
		Parameters:
		`range` \- (undocumented)
		Returns:
		(undocumented)
		- #### withContentType
		
		
		
		```
		public abstract [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common") withContentType​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") range)
		```
		
		Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.
		 
		 EntityStreamingSupport traits MUST support re\-configuring the offered `ContentType`.
		 This is due to the need integrating with existing systems which sometimes excpect custom Content\-Types,
		 however really are just plain JSON or something else internally (perhaps with slight extensions).
		 
		
		
		 NOTE: Implementations should specialize the return type to their own Type!
		
		
		
		Parameters:
		`range` \- (undocumented)
		Returns:
		(undocumented)
		- #### parallelism
		
		
		
		```
		public abstract int parallelism()
		```
		
		Write\-side / read\-side, defines if (un)marshalling should be done in parallel.
		 
		 This may be beneficial marshalling the bottleneck in the pipeline.
		 
		
		
		 See also [`parallelism()`](#parallelism()) and [`withParallelMarshalling(int,boolean)`](#withParallelMarshalling(int,boolean)).
		
		
		
		Returns:
		(undocumented)
		- #### unordered
		
		
		
		```
		public abstract boolean unordered()
		```
		
		Write\-side / read\-side, defines if (un)marshalling of incoming stream elements should be preserved or not.
		 
		 Allowing for parallel and unordered (un)marshalling often yields higher throughput and also allows avoiding
		 head\-of\-line blocking if some elements are much larger than others.
		 
		
		
		 See also [`parallelism()`](#parallelism()) and [`withParallelMarshalling(int,boolean)`](#withParallelMarshalling(int,boolean)).
		
		
		
		Returns:
		(undocumented)
		- #### withParallelMarshalling
		
		
		
		```
		public abstract [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common") withParallelMarshalling​(int parallelism,
		                                                               boolean unordered)
		```
		
		Write\-side / read\-side, defines parallelism and if ordering should be preserved or not of Source element marshalling.
		 
		 Sometimes marshalling multiple elements at once (esp. when elements are not evenly sized, and ordering is not enforced)
		 may yield in higher throughput.
		 
		
		
		 NOTE: Implementations should specialize the return type to their own Type!
		
		
		
		Parameters:
		`parallelism` \- (undocumented)
		`unordered` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html)*