---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html
title: RequestBuilding$
---

# RequestBuilding$

## Content

Package [akka.http.scaladsl.client](package-summary.html)
## Class RequestBuilding$

- java.lang.Object
- - akka.http.scaladsl.client.RequestBuilding$

- All Implemented Interfaces:
`[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`, `[TransformerPipelineSupport](TransformerPipelineSupport.html "interface in akka.http.scaladsl.client")`

---

```
public class RequestBuilding$
extends java.lang.Object
implements [RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.client.[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")
		
		
		`[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.client.[TransformerPipelineSupport](TransformerPipelineSupport.html "interface in akka.http.scaladsl.client")
		
		
		`[TransformerPipelineSupport.WithTransformation](TransformerPipelineSupport.WithTransformation.html "class in akka.http.scaladsl.client")<[A](TransformerPipelineSupport.WithTransformation.html "type parameter in TransformerPipelineSupport.WithTransformation")>, [TransformerPipelineSupport.WithTransformerConcatenation](TransformerPipelineSupport.WithTransformerConcatenation.html "class in akka.http.scaladsl.client")<[A](TransformerPipelineSupport.WithTransformerConcatenation.html "type parameter in TransformerPipelineSupport.WithTransformerConcatenation"),​[B](TransformerPipelineSupport.WithTransformerConcatenation.html "type parameter in TransformerPipelineSupport.WithTransformerConcatenation")>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RequestBuilding$](RequestBuilding$.html "class in akka.http.scaladsl.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestBuilding$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Delete](#Delete())()` |  |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Get](#Get())()` |  |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Head](#Head())()` |  |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Options](#Options())()` |  |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Patch](#Patch())()` |  |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Post](#Post())()` |  |
	| `[RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client")` | `[Put](#Put())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.client.[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")
		
		
		`[addAttribute](RequestBuilding.html#addAttribute(akka.http.scaladsl.model.AttributeKey,T)), [addCredentials](RequestBuilding.html#addCredentials(akka.http.scaladsl.model.headers.HttpCredentials)), [addHeader](RequestBuilding.html#addHeader(akka.http.scaladsl.model.HttpHeader)), [addHeader](RequestBuilding.html#addHeader(java.lang.String,java.lang.String)), [addHeaders](RequestBuilding.html#addHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [header2AddHeader](RequestBuilding.html#header2AddHeader(akka.http.scaladsl.model.HttpHeader)), [logRequest](RequestBuilding.html#logRequest(akka.event.LoggingAdapter,akka.event.Logging.LogLevel)), [logRequest](RequestBuilding.html#logRequest(scala.Function1)), [mapHeaders](RequestBuilding.html#mapHeaders(scala.Function1)), [removeHeader](RequestBuilding.html#removeHeader(java.lang.Class)), [removeHeader](RequestBuilding.html#removeHeader(java.lang.String)), [removeHeader](RequestBuilding.html#removeHeader(scala.reflect.ClassTag)), [removeHeaders](RequestBuilding.html#removeHeaders(scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.client.[TransformerPipelineSupport](TransformerPipelineSupport.html "interface in akka.http.scaladsl.client")
		
		
		`[logValue](TransformerPipelineSupport.html#logValue(akka.event.LoggingAdapter,akka.event.Logging.LogLevel)), [logValue](TransformerPipelineSupport.html#logValue(scala.Function1))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RequestBuilding$](RequestBuilding$.html "class in akka.http.scaladsl.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestBuilding$
		
		
		
		```
		public RequestBuilding$()
		```

	- ### Method Detail
	
	
	
		- #### Get
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Get()
		```
		
		
		Specified by:
		`[Get](RequestBuilding.html#Get())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`
		- #### Post
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Post()
		```
		
		
		Specified by:
		`[Post](RequestBuilding.html#Post())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`
		- #### Put
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Put()
		```
		
		
		Specified by:
		`[Put](RequestBuilding.html#Put())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`
		- #### Patch
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Patch()
		```
		
		
		Specified by:
		`[Patch](RequestBuilding.html#Patch())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`
		- #### Delete
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Delete()
		```
		
		
		Specified by:
		`[Delete](RequestBuilding.html#Delete())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`
		- #### Options
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Options()
		```
		
		
		Specified by:
		`[Options](RequestBuilding.html#Options())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`
		- #### Head
		
		
		
		```
		public [RequestBuilding.RequestBuilder](RequestBuilding.RequestBuilder.html "class in akka.http.scaladsl.client") Head()
		```
		
		
		Specified by:
		`[Head](RequestBuilding.html#Head())` in interface `[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.RequestBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.WithTransformation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.WithTransformerConcatenation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html)*