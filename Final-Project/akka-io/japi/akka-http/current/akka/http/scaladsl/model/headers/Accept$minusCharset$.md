---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset$.html
title: Accept$minusCharset$
---

# Accept$minusCharset$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Accept$minusCharset$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusCharset](Accept$minusCharset.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Accept$minusCharset$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Accept$minusCharset$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Accept$minusCharset](Accept$minusCharset.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Accept$minusCharset$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Accept$minusCharset$](Accept$minusCharset$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Accept$minusCharset$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Accept$minusCharset](Accept$minusCharset.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.HttpCharsetRange,scala.collection.immutable.Seq))​([HttpCharsetRange](../HttpCharsetRange.html "class in akka.http.scaladsl.model") first,  scala.collection.immutable.Seq<[HttpCharsetRange](../HttpCharsetRange.html "class in akka.http.scaladsl.model")> more)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpCharsetRange](../HttpCharsetRange.html "class in akka.http.scaladsl.model")>>` | `[charsetRangesRenderer](#charsetRangesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Accept$minusCharset$](Accept$minusCharset$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Accept$minusCharset$
		
		
		
		```
		public Accept$minusCharset$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Accept$minusCharset](Accept$minusCharset.html "class in akka.http.scaladsl.model.headers") apply​([HttpCharsetRange](../HttpCharsetRange.html "class in akka.http.scaladsl.model") first,
		                                 scala.collection.immutable.Seq<[HttpCharsetRange](../HttpCharsetRange.html "class in akka.http.scaladsl.model")> more)
		```
		- #### charsetRangesRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpCharsetRange](../HttpCharsetRange.html "class in akka.http.scaladsl.model")>> charsetRangesRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset$.html)*