---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link$.html
title: Link$
---

# Link$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Link$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Link](Link.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Link$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Link$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Link](Link.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Link$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Link$](Link$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Link$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Link](Link.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.LinkValue,scala.collection.immutable.Seq))​([LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers") firstValue,  scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> otherValues)` |  |
	| `[Link](Link.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.headers.LinkParam,scala.collection.immutable.Seq))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  [LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> more)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")>>` | `[valuesRenderer](#valuesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Link$](Link$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Link$
		
		
		
		```
		public Link$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Link](Link.html "class in akka.http.scaladsl.model.headers") apply​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                  [LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers") first,
		                  scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> more)
		```
		- #### apply
		
		
		
		```
		public [Link](Link.html "class in akka.http.scaladsl.model.headers") apply​([LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers") firstValue,
		                  scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> otherValues)
		```
		- #### valuesRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")>> valuesRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link$.html)*