---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnit.html
title: RangeUnit
---

# RangeUnit

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class RangeUnit

- java.lang.Object
- - [akka.http.javadsl.model.headers.RangeUnit](../../../javadsl/model/headers/RangeUnit.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.RangeUnit

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[RangeUnits.Bytes$](RangeUnits.Bytes$.html "class in akka.http.scaladsl.model.headers")`, `[RangeUnits.Other](RangeUnits.Other.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class RangeUnit
extends [RangeUnit](../../../javadsl/model/headers/RangeUnit.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RangeUnit](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[RangeUnit](../../../javadsl/model/headers/RangeUnit.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/RangeUnit.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### RangeUnit
		
		
		
		```
		public RangeUnit()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		
		Specified by:
		`[name](../../../javadsl/model/headers/RangeUnit.html#name())` in class `[RangeUnit](../../../javadsl/model/headers/RangeUnit.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/RangeUnit.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnits.Bytes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnits.Other.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnit.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnit.html)*