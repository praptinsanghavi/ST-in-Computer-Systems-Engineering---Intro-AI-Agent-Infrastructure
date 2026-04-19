---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl$.html
title: Cache$minusControl$
---

# Cache$minusControl$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Cache$minusControl$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Cache$minusControl$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Cache$minusControl$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Cache$minusControl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Cache$minusControl$](Cache$minusControl$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cache$minusControl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.CacheDirective,scala.collection.immutable.Seq))​([CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")> more)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")>>` | `[directivesRenderer](#directivesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Cache$minusControl$](Cache$minusControl$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Cache$minusControl$
		
		
		
		```
		public Cache$minusControl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers") apply​([CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers") first,
		                                scala.collection.immutable.Seq<[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")> more)
		```
		- #### directivesRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")>> directivesRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl$.html)*