---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer$.html
title: Renderer$
---

# Renderer$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class Renderer$

- java.lang.Object
- - akka.http.impl.util.Renderer$

- ---

```
public class Renderer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Renderer$](Renderer$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Renderer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Renderer](Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<T>>` | `[defaultSeqRenderer](#defaultSeqRenderer(akka.http.impl.util.Renderer))​([Renderer](Renderer.html "interface in akka.http.impl.util")<T> evidence$1)` |  |
	| `<S,​T>[Renderer](Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<T>>` | `[genericSeqRenderer](#genericSeqRenderer(S,S,akka.http.impl.util.Renderer,akka.http.impl.util.Renderer))​(S separator,  S empty,  [Renderer](Renderer.html "interface in akka.http.impl.util")<S> sRenderer,  [Renderer](Renderer.html "interface in akka.http.impl.util")<T> tRenderer)` |  |
	| `<D,​T>[Renderer](Renderer.html "interface in akka.http.impl.util")<scala.Option<T>>` | `[optionRenderer](#optionRenderer(D,akka.http.impl.util.Renderer,akka.http.impl.util.Renderer))​(D defaultValue,  [Renderer](Renderer.html "interface in akka.http.impl.util")<D> sRenderer,  [Renderer](Renderer.html "interface in akka.http.impl.util")<T> tRenderer)` |  |
	| `<T extends [Renderable](Renderable.html "interface in akka.http.impl.util")>[Renderer](Renderer.html "interface in akka.http.impl.util")<T>` | `[renderableRenderer](#renderableRenderer())()` |  |
	| `<T> [Renderer](Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<T>>` | `[seqRenderer](#seqRenderer(java.lang.String,java.lang.String,akka.http.impl.util.Renderer))​(java.lang.String separator,  java.lang.String empty,  [Renderer](Renderer.html "interface in akka.http.impl.util")<T> evidence$2)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Renderer$](Renderer$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Renderer$
		
		
		
		```
		public Renderer$()
		```

	- ### Method Detail
	
	
	
		- #### renderableRenderer
		
		
		
		```
		public <T extends [Renderable](Renderable.html "interface in akka.http.impl.util")> [Renderer](Renderer.html "interface in akka.http.impl.util")<T> renderableRenderer()
		```
		- #### optionRenderer
		
		
		
		```
		public <D,​T> [Renderer](Renderer.html "interface in akka.http.impl.util")<scala.Option<T>> optionRenderer​(D defaultValue,
		                                                            [Renderer](Renderer.html "interface in akka.http.impl.util")<D> sRenderer,
		                                                            [Renderer](Renderer.html "interface in akka.http.impl.util")<T> tRenderer)
		```
		- #### defaultSeqRenderer
		
		
		
		```
		public <T> [Renderer](Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<T>> defaultSeqRenderer​([Renderer](Renderer.html "interface in akka.http.impl.util")<T> evidence$1)
		```
		- #### seqRenderer
		
		
		
		```
		public <T> [Renderer](Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<T>> seqRenderer​(java.lang.String separator,
		                                                                        java.lang.String empty,
		                                                                        [Renderer](Renderer.html "interface in akka.http.impl.util")<T> evidence$2)
		```
		- #### genericSeqRenderer
		
		
		
		```
		public <S,​T> [Renderer](Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<T>> genericSeqRenderer​(S separator,
		                                                                                       S empty,
		                                                                                       [Renderer](Renderer.html "interface in akka.http.impl.util")<S> sRenderer,
		                                                                                       [Renderer](Renderer.html "interface in akka.http.impl.util")<T> tRenderer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer$.html)*