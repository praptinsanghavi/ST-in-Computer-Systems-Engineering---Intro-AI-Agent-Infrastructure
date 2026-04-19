---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html
title: ByteContentRange
---

# ByteContentRange

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface ByteContentRange

- All Superinterfaces:
`[ContentRange](ContentRange.html "interface in akka.http.scaladsl.model")`, `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`

All Known Implementing Classes:
`[ContentRange.Default](ContentRange.Default.html "class in akka.http.scaladsl.model")`, `[ContentRange.Unsatisfiable](ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model")`

---

```
public interface ByteContentRange
extends [ContentRange](ContentRange.html "interface in akka.http.scaladsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[ContentRange](ContentRange.html "interface in akka.http.scaladsl.model")
		
		
		`[ContentRange.Default](ContentRange.Default.html "class in akka.http.scaladsl.model"), [ContentRange.Default$](ContentRange.Default$.html "class in akka.http.scaladsl.model"), [ContentRange.Other](ContentRange.Other.html "class in akka.http.scaladsl.model"), [ContentRange.Other$](ContentRange.Other$.html "class in akka.http.scaladsl.model"), [ContentRange.Unsatisfiable](ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model"), [ContentRange.Unsatisfiable$](ContentRange.Unsatisfiable$.html "class in akka.http.scaladsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.OptionalLong` | `[getInstanceLength](#getInstanceLength())()` | Java API |
	| `scala.Option<java.lang.Object>` | `[instanceLength](#instanceLength())()` |  |
	| `boolean` | `[isByteContentRange](#isByteContentRange())()` | Java API |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.[ContentRange](ContentRange.html "interface in akka.http.scaladsl.model")
		
		
		`[getOtherValue](ContentRange.html#getOtherValue()), [getSatisfiableFirst](ContentRange.html#getSatisfiableFirst()), [getSatisfiableLast](ContentRange.html#getSatisfiableLast()), [isOther](ContentRange.html#isOther()), [isSatisfiable](ContentRange.html#isSatisfiable())`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../impl/util/ValueRenderable.html#value())`

- - ### Method Detail
	
	
	
		- #### getInstanceLength
		
		
		
		```
		java.util.OptionalLong getInstanceLength()
		```
		
		Java API
		- #### instanceLength
		
		
		
		```
		scala.Option<java.lang.Object> instanceLength()
		```
		- #### isByteContentRange
		
		
		
		```
		boolean isByteContentRange()
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Default$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Other$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Other.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Unsatisfiable$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Unsatisfiable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html)*