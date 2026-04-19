---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding$.html
title: Accept$minusEncoding$
---

# Accept$minusEncoding$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Accept$minusEncoding$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Accept$minusEncoding$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Accept$minusEncoding$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Accept$minusEncoding$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Accept$minusEncoding$](Accept$minusEncoding$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Accept$minusEncoding$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply())()` |  |
	| `[Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.HttpEncodingRange,scala.collection.immutable.Seq))​([HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers") firstEncoding,  scala.collection.immutable.Seq<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")> otherEncodings)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")>>` | `[encodingsRenderer](#encodingsRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Accept$minusEncoding$](Accept$minusEncoding$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Accept$minusEncoding$
		
		
		
		```
		public Accept$minusEncoding$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers") apply()
		```
		- #### apply
		
		
		
		```
		public [Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers") apply​([HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers") firstEncoding,
		                                  scala.collection.immutable.Seq<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")> otherEncodings)
		```
		- #### encodingsRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")>> encodingsRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding$.html)*