---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStrict.html
title: ToStrict
---

# ToStrict

## Content

Package [akka.http.impl.util](package-summary.html)
## Class ToStrict

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")\>\>
		- - akka.http.impl.util.ToStrict

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>,​akka.NotUsed>`

---

```
public class ToStrict
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ToStrict](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.Option,akka.http.scaladsl.model.ContentType))​(scala.concurrent.duration.FiniteDuration timeout,  scala.Option<java.lang.Object> maxBytes,  [ContentType](../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.Inlet<akka.util.ByteString>` | `[byteStringIn](#byteStringIn())()` |  |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Outlet<[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>` | `[httpEntityOut](#httpEntityOut())()` |  |
	| `akka.stream.Attributes` | `[initialAttributes](#initialAttributes())()` |  |
	| `akka.stream.FlowShape<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>` | `[shape](#shape())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ToStrict
		
		
		
		```
		public ToStrict​(scala.concurrent.duration.FiniteDuration timeout,
		                scala.Option<java.lang.Object> maxBytes,
		                [ContentType](../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```

	- ### Method Detail
	
	
	
		- #### byteStringIn
		
		
		
		```
		public akka.stream.Inlet<akka.util.ByteString> byteStringIn()
		```
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>>`
		- #### httpEntityOut
		
		
		
		```
		public akka.stream.Outlet<[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")> httpEntityOut()
		```
		- #### initialAttributes
		
		
		
		```
		public akka.stream.Attributes initialAttributes()
		```
		
		
		Overrides:
		`initialAttributes` in class `akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.FlowShape<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>,​akka.NotUsed>`
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<akka.util.ByteString,​[HttpEntity.Strict](../../scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")> shape()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStrict.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStrict.html)*