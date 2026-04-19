---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range$.html
title: Range$
---

# Range$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Range$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Range](Range.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Range$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Range$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Range](Range.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Range$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Range$](Range$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Range$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Range](Range.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.ByteRange,scala.collection.immutable.Seq))​([ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers")> more)` |  |
	| `[Range](Range.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers")> ranges)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers")>>` | `[rangesRenderer](#rangesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Range$](Range$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Range$
		
		
		
		```
		public Range$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Range](Range.html "class in akka.http.scaladsl.model.headers") apply​([ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers") first,
		                   scala.collection.immutable.Seq<[ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers")> more)
		```
		- #### apply
		
		
		
		```
		public [Range](Range.html "class in akka.http.scaladsl.model.headers") apply​(scala.collection.immutable.Seq<[ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers")> ranges)
		```
		- #### rangesRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[ByteRange](ByteRange.html "class in akka.http.scaladsl.model.headers")>> rangesRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range$.html)*