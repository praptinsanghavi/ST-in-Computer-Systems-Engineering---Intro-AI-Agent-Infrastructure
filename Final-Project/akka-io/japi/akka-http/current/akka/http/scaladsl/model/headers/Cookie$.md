---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie$.html
title: Cookie$
---

# Cookie$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Cookie$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Cookie$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Cookie$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Cookie$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Cookie$](Cookie$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cookie$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.HttpCookiePair,scala.collection.immutable.Seq))​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> more)` |  |
	| `[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(scala.Tuple2,scala.collection.immutable.Seq))​(scala.Tuple2<java.lang.String,​java.lang.String> first,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> more)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>>` | `[cookiePairsRenderer](#cookiePairsRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Cookie$](Cookie$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Cookie$
		
		
		
		```
		public Cookie$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers") apply​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") first,
		                    scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> more)
		```
		- #### apply
		
		
		
		```
		public [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String name,
		                    java.lang.String value)
		```
		- #### apply
		
		
		
		```
		public [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers") apply​(scala.Tuple2<java.lang.String,​java.lang.String> first,
		                    scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> more)
		```
		- #### cookiePairsRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>> cookiePairsRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie$.html)*