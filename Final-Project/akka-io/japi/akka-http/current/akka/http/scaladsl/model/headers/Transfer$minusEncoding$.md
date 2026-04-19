---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding$.html
title: Transfer$minusEncoding$
---

# Transfer$minusEncoding$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Transfer$minusEncoding$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Transfer$minusEncoding$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Transfer$minusEncoding$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Transfer$minusEncoding$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Transfer$minusEncoding$](Transfer$minusEncoding$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Transfer$minusEncoding$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.TransferEncoding,scala.collection.immutable.Seq))​([TransferEncoding](../TransferEncoding.html "class in akka.http.scaladsl.model") first,  scala.collection.immutable.Seq<[TransferEncoding](../TransferEncoding.html "class in akka.http.scaladsl.model")> more)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[TransferEncoding](../TransferEncoding.html "class in akka.http.scaladsl.model")>>` | `[encodingsRenderer](#encodingsRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Transfer$minusEncoding$](Transfer$minusEncoding$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Transfer$minusEncoding$
		
		
		
		```
		public Transfer$minusEncoding$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers") apply​([TransferEncoding](../TransferEncoding.html "class in akka.http.scaladsl.model") first,
		                                    scala.collection.immutable.Seq<[TransferEncoding](../TransferEncoding.html "class in akka.http.scaladsl.model")> more)
		```
		- #### encodingsRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[TransferEncoding](../TransferEncoding.html "class in akka.http.scaladsl.model")>> encodingsRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding$.html)*