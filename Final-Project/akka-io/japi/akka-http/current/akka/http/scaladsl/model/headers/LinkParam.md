---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html
title: LinkParam
---

# LinkParam

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class LinkParam

- java.lang.Object
- - [akka.http.javadsl.model.headers.LinkParam](../../../javadsl/model/headers/LinkParam.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.LinkParam

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[LinkParams.anchor](LinkParams.anchor.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.hreflang](LinkParams.hreflang.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.media](LinkParams.media.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.rel](LinkParams.rel.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.rev](LinkParams.rev.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.title](LinkParams.title.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.title$times](LinkParams.title$times.html "class in akka.http.scaladsl.model.headers")`, `[LinkParams.type](LinkParams.type.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class LinkParam
extends [LinkParam](../../../javadsl/model/headers/LinkParam.html "class in akka.http.javadsl.model.headers")
implements [ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LinkParam](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[key](#key())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")>>` | `[paramsRenderer](#paramsRenderer())()` |  |
	| `abstract java.lang.Object` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### LinkParam
		
		
		
		```
		public LinkParam()
		```

	- ### Method Detail
	
	
	
		- #### paramsRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")>> paramsRenderer()
		```
		- #### key
		
		
		
		```
		public java.lang.String key()
		```
		
		
		Specified by:
		`[key](../../../javadsl/model/headers/LinkParam.html#key())` in class `[LinkParam](../../../javadsl/model/headers/LinkParam.html "class in akka.http.javadsl.model.headers")`
		- #### value
		
		
		
		```
		public abstract java.lang.Object value()
		```
		
		
		Specified by:
		`[value](../../../javadsl/model/headers/LinkParam.html#value())` in class `[LinkParam](../../../javadsl/model/headers/LinkParam.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.anchor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.hreflang.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.media.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.rel.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.rev.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.title$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.title.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParams.type.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html)*