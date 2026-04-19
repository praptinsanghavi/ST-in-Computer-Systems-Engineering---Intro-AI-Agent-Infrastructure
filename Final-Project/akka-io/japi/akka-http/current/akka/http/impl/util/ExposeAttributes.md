---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ExposeAttributes.html
title: ExposeAttributes
---

# ExposeAttributes

## Content

Package [akka.http.impl.util](package-summary.html)
## Class ExposeAttributes\<T,​U\>

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<T,​U\>\>
		- - akka.http.impl.util.ExposeAttributes\<T,​U\>

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<T,​U>,​akka.NotUsed>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ExposeAttributes<T,​U>
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<T,​U>>
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.util.ExposeAttributes)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExposeAttributes](#%3Cinit%3E(scala.Function1))​(scala.Function1<akka.stream.Attributes,​scala.Function1<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>> functionConstructor)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `scala.Function1<akka.stream.Attributes,​scala.Function1<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>>` | `[functionConstructor](#functionConstructor())()` |  |
	| `akka.stream.Inlet<[T](ExposeAttributes.html "type parameter in ExposeAttributes")>` | `[in](#in())()` |  |
	| `akka.stream.Outlet<[U](ExposeAttributes.html "type parameter in ExposeAttributes")>` | `[out](#out())()` |  |
	| `akka.stream.FlowShape<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ExposeAttributes
		
		
		
		```
		public ExposeAttributes​(scala.Function1<akka.stream.Attributes,​scala.Function1<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>> functionConstructor)
		```

	- ### Method Detail
	
	
	
		- #### functionConstructor
		
		
		
		```
		public scala.Function1<akka.stream.Attributes,​scala.Function1<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>> functionConstructor()
		```
		- #### in
		
		
		
		```
		public akka.stream.Inlet<[T](ExposeAttributes.html "type parameter in ExposeAttributes")> in()
		```
		- #### out
		
		
		
		```
		public akka.stream.Outlet<[U](ExposeAttributes.html "type parameter in ExposeAttributes")> out()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")> shape()
		```
		
		
		Specified by:
		`shape` in interface `akka.stream.Graph<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>`
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<[T](ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](ExposeAttributes.html "type parameter in ExposeAttributes")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ExposeAttributes.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ExposeAttributes.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ExposeAttributes.html)*