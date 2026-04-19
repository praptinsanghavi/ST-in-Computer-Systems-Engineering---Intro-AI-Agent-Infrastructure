---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping$.html
title: JavaMapping$
---

# JavaMapping$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class JavaMapping$

- java.lang.Object
- - akka.http.impl.util.JavaMapping$

- ---

```
public class JavaMapping$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JavaMapping$](JavaMapping$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaMapping$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<JIn,​SIn,​SOut,​JOut>akka.stream.scaladsl.BidiFlow<JIn,​SIn,​SOut,​JOut,​akka.NotUsed>` | `[adapterBidiFlow](#adapterBidiFlow(akka.http.impl.util.JavaMapping,akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JIn,​SIn> inMapping,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JOut,​SOut> outMapping)` |  |
	| `<T> [JavaMapping.Inherited](JavaMapping.Inherited.html "class in akka.http.impl.util")<[AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")<T>,​[AttributeKey](../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<T>>` | `[attributeKey](#attributeKey())()` |  |
	| `[JavaMapping.Inherited](JavaMapping.Inherited.html "class in akka.http.impl.util")<[AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")<?>,​[AttributeKey](../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>>` | `[AttributeKey](#AttributeKey())()` |  |
	| `<JIn,​SIn,​JOut,​SOut,​JM,​SM>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<akka.stream.javadsl.Flow<JIn,​JOut,​JM>,​akka.stream.scaladsl.Flow<SIn,​SOut,​SM>>` | `[flowMapping](#flowMapping(akka.http.impl.util.JavaMapping,akka.http.impl.util.JavaMapping,akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JIn,​SIn> inMapping,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JOut,​SOut> outMapping,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JM,​SM> matValueMapping)` |  |
	| `<_J,​_S>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.util.concurrent.CompletionStage<_J>,​scala.concurrent.Future<_S>>` | `[futureMapping](#futureMapping(akka.http.impl.util.JavaMapping,scala.concurrent.ExecutionContext))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping,  scala.concurrent.ExecutionContext ec)` |  |
	| `<JIn,​SIn,​JOut,​SOut,​M>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<akka.stream.Graph<akka.stream.FlowShape<JIn,​JOut>,​M>,​akka.stream.Graph<akka.stream.FlowShape<SIn,​SOut>,​M>>` | `[graphFlowMapping](#graphFlowMapping(akka.http.impl.util.JavaMapping,akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JIn,​SIn> inMapping,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JOut,​SOut> outMapping)` |  |
	| `<T> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<T,​T>` | `[identity](#identity())()` | This trivial mapping isn't enabled by default to prevent it from conflicting with the \`Inherited\` ones |
	| `<_J,​_S>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.lang.Iterable<_J>,​scala.collection.immutable.Seq<_S>>` | `[iterableMapping](#iterableMapping(akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping)` |  |
	| `<J,​S>akka.stream.scaladsl.Flow<J,​S,​akka.NotUsed>` | `[javaToScalaAdapterFlow](#javaToScalaAdapterFlow(akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)` |  |
	| `<K,​V>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.util.Map<K,​V>,​scala.collection.immutable.Map<K,​V>>` | `[map](#map())()` |  |
	| `<_J,​_S>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.util.Optional<_J>,​scala.Option<_S>>` | `[option](#option(akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping)` |  |
	| `<J1,​J2,​S1,​S2>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<akka.japi.Pair<J1,​J2>,​scala.Tuple2<S1,​S2>>` | `[pairMapping](#pairMapping(akka.http.impl.util.JavaMapping,akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J1,​S1> _1Mapping,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J2,​S2> _2Mapping)` |  |
	| `<J,​S>akka.stream.scaladsl.Flow<S,​J,​akka.NotUsed>` | `[scalaToJavaAdapterFlow](#scalaToJavaAdapterFlow(akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)` |  |
	| `<J,​S>J` | `[toJava](#toJava(S,akka.http.impl.util.JavaMapping))​(S s,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)` |  |
	| `<J,​S>S` | `[toScala](#toScala(J,akka.http.impl.util.JavaMapping))​(J j,  [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)` |  |
	| `<_J,​_S>[JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<scala.util.Try<_J>,​scala.util.Try<_S>>` | `[tryMapping](#tryMapping(akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JavaMapping$](JavaMapping$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JavaMapping$
		
		
		
		```
		public JavaMapping$()
		```

	- ### Method Detail
	
	
	
		- #### toJava
		
		
		
		```
		public <J,​S> J toJava​(S s,
		                            [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)
		```
		- #### toScala
		
		
		
		```
		public <J,​S> S toScala​(J j,
		                             [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)
		```
		- #### identity
		
		
		
		```
		public <T> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<T,​T> identity()
		```
		
		This trivial mapping isn't enabled by default to prevent it from conflicting with the \`Inherited\` ones
		- #### iterableMapping
		
		
		
		```
		public <_J,​_S> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.lang.Iterable<_J>,​scala.collection.immutable.Seq<_S>> iterableMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping)
		```
		- #### map
		
		
		
		```
		public <K,​V> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.util.Map<K,​V>,​scala.collection.immutable.Map<K,​V>> map()
		```
		- #### option
		
		
		
		```
		public <_J,​_S> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.util.Optional<_J>,​scala.Option<_S>> option​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping)
		```
		- #### flowMapping
		
		
		
		```
		public <JIn,​SIn,​JOut,​SOut,​JM,​SM> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<akka.stream.javadsl.Flow<JIn,​JOut,​JM>,​akka.stream.scaladsl.Flow<SIn,​SOut,​SM>> flowMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JIn,​SIn> inMapping,
		                                                                                                                                                                                                   [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JOut,​SOut> outMapping,
		                                                                                                                                                                                                   [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JM,​SM> matValueMapping)
		```
		- #### graphFlowMapping
		
		
		
		```
		public <JIn,​SIn,​JOut,​SOut,​M> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<akka.stream.Graph<akka.stream.FlowShape<JIn,​JOut>,​M>,​akka.stream.Graph<akka.stream.FlowShape<SIn,​SOut>,​M>> graphFlowMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JIn,​SIn> inMapping,
		                                                                                                                                                                                                                           [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JOut,​SOut> outMapping)
		```
		- #### scalaToJavaAdapterFlow
		
		
		
		```
		public <J,​S> akka.stream.scaladsl.Flow<S,​J,​akka.NotUsed> scalaToJavaAdapterFlow​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)
		```
		- #### javaToScalaAdapterFlow
		
		
		
		```
		public <J,​S> akka.stream.scaladsl.Flow<J,​S,​akka.NotUsed> javaToScalaAdapterFlow​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​S> mapping)
		```
		- #### adapterBidiFlow
		
		
		
		```
		public <JIn,​SIn,​SOut,​JOut> akka.stream.scaladsl.BidiFlow<JIn,​SIn,​SOut,​JOut,​akka.NotUsed> adapterBidiFlow​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JIn,​SIn> inMapping,
		                                                                                                                                                   [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<JOut,​SOut> outMapping)
		```
		- #### pairMapping
		
		
		
		```
		public <J1,​J2,​S1,​S2> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<akka.japi.Pair<J1,​J2>,​scala.Tuple2<S1,​S2>> pairMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J1,​S1> _1Mapping,
		                                                                                                                            [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J2,​S2> _2Mapping)
		```
		- #### tryMapping
		
		
		
		```
		public <_J,​_S> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<scala.util.Try<_J>,​scala.util.Try<_S>> tryMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping)
		```
		- #### futureMapping
		
		
		
		```
		public <_J,​_S> [JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<java.util.concurrent.CompletionStage<_J>,​scala.concurrent.Future<_S>> futureMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<_J,​_S> mapping,
		                                                                                                                           scala.concurrent.ExecutionContext ec)
		```
		- #### AttributeKey
		
		
		
		```
		public [JavaMapping.Inherited](JavaMapping.Inherited.html "class in akka.http.impl.util")<[AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")<?>,​[AttributeKey](../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>> AttributeKey()
		```
		- #### attributeKey
		
		
		
		```
		public <T> [JavaMapping.Inherited](JavaMapping.Inherited.html "class in akka.http.impl.util")<[AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")<T>,​[AttributeKey](../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<T>> attributeKey()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.Inherited.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping$.html)*