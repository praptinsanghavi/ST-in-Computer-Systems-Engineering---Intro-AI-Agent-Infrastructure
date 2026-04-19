---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow$.html
title: Allow$
---

# Allow$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Allow$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Allow](Allow.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Allow$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Allow$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Allow](Allow.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Allow$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Allow$](Allow$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Allow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Allow](Allow.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply())()` |  |
	| `[Allow](Allow.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.HttpMethod,scala.collection.immutable.Seq))​([HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model") firstMethod,  scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> otherMethods)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")>>` | `[methodsRenderer](#methodsRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Allow$](Allow$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Allow$
		
		
		
		```
		public Allow$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Allow](Allow.html "class in akka.http.scaladsl.model.headers") apply()
		```
		- #### apply
		
		
		
		```
		public [Allow](Allow.html "class in akka.http.scaladsl.model.headers") apply​([HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model") firstMethod,
		                   scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> otherMethods)
		```
		- #### methodsRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")>> methodsRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow$.html)*