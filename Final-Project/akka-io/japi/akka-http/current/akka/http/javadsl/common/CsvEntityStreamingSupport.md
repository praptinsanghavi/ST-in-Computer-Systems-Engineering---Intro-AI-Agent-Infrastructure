---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html
title: CsvEntityStreamingSupport
---

# CsvEntityStreamingSupport

## Content

Package [akka.http.javadsl.common](package-summary.html)
## Class CsvEntityStreamingSupport

- java.lang.Object
- - [akka.http.javadsl.common.EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.javadsl.common")
	- - [akka.http.scaladsl.common.EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")
		- - akka.http.javadsl.common.CsvEntityStreamingSupport

- Direct Known Subclasses:
`[CsvEntityStreamingSupport](../../scaladsl/common/CsvEntityStreamingSupport.html "class in akka.http.scaladsl.common")`

---

```
public abstract class CsvEntityStreamingSupport
extends [EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CsvEntityStreamingSupport](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[withFramingRendererFlow](#withFramingRendererFlow(akka.stream.javadsl.Flow))​(akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> flow)` | Java API: Write\-side, apply framing to outgoing entity stream. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.common.[EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html "class in akka.http.scaladsl.common")
		
		
		`[contentType](../../scaladsl/common/EntityStreamingSupport.html#contentType()), [csv](../../scaladsl/common/EntityStreamingSupport.html#csv()), [csv](../../scaladsl/common/EntityStreamingSupport.html#csv(int)), [framingDecoder](../../scaladsl/common/EntityStreamingSupport.html#framingDecoder()), [framingRenderer](../../scaladsl/common/EntityStreamingSupport.html#framingRenderer()), [getFramingDecoder](../../scaladsl/common/EntityStreamingSupport.html#getFramingDecoder()), [getFramingRenderer](../../scaladsl/common/EntityStreamingSupport.html#getFramingRenderer()), [json](../../scaladsl/common/EntityStreamingSupport.html#json()), [json](../../scaladsl/common/EntityStreamingSupport.html#json(int)), [parallelism](../../scaladsl/common/EntityStreamingSupport.html#parallelism()), [supported](../../scaladsl/common/EntityStreamingSupport.html#supported()), [unordered](../../scaladsl/common/EntityStreamingSupport.html#unordered()), [withContentType](../../scaladsl/common/EntityStreamingSupport.html#withContentType(akka.http.javadsl.model.ContentType)), [withParallelMarshalling](../../scaladsl/common/EntityStreamingSupport.html#withParallelMarshalling(int,boolean)), [withSupported](../../scaladsl/common/EntityStreamingSupport.html#withSupported(akka.http.javadsl.model.ContentTypeRange))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CsvEntityStreamingSupport
		
		
		
		```
		public CsvEntityStreamingSupport()
		```

	- ### Method Detail
	
	
	
		- #### withFramingRendererFlow
		
		
		
		```
		public abstract [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common") withFramingRendererFlow​(akka.stream.javadsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> flow)
		```
		
		Java API: Write\-side, apply framing to outgoing entity stream.
		 
		 Most typical usage will be a variant of `Flow[ByteString].intersperse`.
		 
		
		
		 For example for rendering a JSON array one would return
		 `Flow[ByteString].intersperse(ByteString("["), ByteString(","), ByteString("]"))`
		 and for rendering a new\-line separated CSV simply `Flow[ByteString].intersperse(ByteString("\n"))`.
		
		
		
		Parameters:
		`flow` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html)*