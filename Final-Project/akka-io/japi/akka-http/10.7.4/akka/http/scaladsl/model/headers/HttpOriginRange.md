---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOriginRange.html
title: HttpOriginRange
---

# HttpOriginRange

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpOriginRange

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpOriginRange](../../../javadsl/model/headers/HttpOriginRange.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpOriginRange

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[HttpOriginRange.$times$](HttpOriginRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[HttpOriginRange.Default](HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpOriginRange
extends [HttpOriginRange](../../../javadsl/model/headers/HttpOriginRange.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[HttpOriginRange.$times$](HttpOriginRange.$times$.html "class in akka.http.scaladsl.model.headers")` |  |
	| `static class` | `[HttpOriginRange.Default](HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers")` |  |
	| `static class` | `[HttpOriginRange.Default$](HttpOriginRange.Default$.html "class in akka.http.scaladsl.model.headers")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpOriginRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpOriginRange.Default](HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers")> origins)` |  |
	| `boolean` | `[matches](#matches(akka.http.javadsl.model.headers.HttpOrigin))​([HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers") origin)` | Java API |
	| `abstract boolean` | `[matches](#matches(akka.http.scaladsl.model.headers.HttpOrigin))​([HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers") origin)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpOriginRange](../../../javadsl/model/headers/HttpOriginRange.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpOriginRange.html#create(akka.http.javadsl.model.headers.HttpOrigin...))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### HttpOriginRange
		
		
		
		```
		public HttpOriginRange()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [HttpOriginRange.Default](HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers") apply​(scala.collection.immutable.Seq<[HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers")> origins)
		```
		- #### matches
		
		
		
		```
		public abstract boolean matches​([HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers") origin)
		```
		- #### matches
		
		
		
		```
		public boolean matches​([HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers") origin)
		```
		
		Java API
		
		Specified by:
		`[matches](../../../javadsl/model/headers/HttpOriginRange.html#matches(akka.http.javadsl.model.headers.HttpOrigin))` in class `[HttpOriginRange](../../../javadsl/model/headers/HttpOriginRange.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpOriginRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOriginRange.$times$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOriginRange.Default$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOriginRange.Default.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOriginRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOriginRange.html)*