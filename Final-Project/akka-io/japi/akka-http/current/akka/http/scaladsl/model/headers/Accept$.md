---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$.html
title: Accept$
---

# Accept$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Accept$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept](Accept.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Accept$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Accept$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Accept](Accept.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Accept$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Accept$](Accept$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Accept$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Accept](Accept.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.MediaRange,scala.collection.immutable.Seq))​([MediaRange](../MediaRange.html "class in akka.http.scaladsl.model") firstMediaRange,  scala.collection.immutable.Seq<[MediaRange](../MediaRange.html "class in akka.http.scaladsl.model")> otherMediaRanges)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[MediaRange](../MediaRange.html "class in akka.http.scaladsl.model")>>` | `[mediaRangesRenderer](#mediaRangesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Accept$](Accept$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Accept$
		
		
		
		```
		public Accept$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Accept](Accept.html "class in akka.http.scaladsl.model.headers") apply​([MediaRange](../MediaRange.html "class in akka.http.scaladsl.model") firstMediaRange,
		                    scala.collection.immutable.Seq<[MediaRange](../MediaRange.html "class in akka.http.scaladsl.model")> otherMediaRanges)
		```
		- #### mediaRangesRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[MediaRange](../MediaRange.html "class in akka.http.scaladsl.model")>> mediaRangesRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$.html)*