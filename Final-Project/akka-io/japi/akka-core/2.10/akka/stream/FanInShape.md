---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:53:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.Init.html
title: FanInShape.Init
---

# FanInShape.Init

## Content

Package [akka.stream](package-summary.html)
## Interface FanInShape.Init\<O\>

- All Known Implementing Classes:
`[FanInShape.Name](FanInShape.Name.html "class in akka.stream")`, `[FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")`

Enclosing class:
[FanInShape](FanInShape.html "class in akka.stream")\<[O](FanInShape.html "type parameter in FanInShape")\>

---

```
public static interface FanInShape.Init<O>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O](FanInShape.Init.html "type parameter in FanInShape.Init")>` | `[outlet](#outlet())()` |  |

- - ### Method Detail
	
	
	
		- #### inlets
		
		
		
		```
		scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		- #### name
		
		
		
		```
		java.lang.String name()
		```
		- #### outlet
		
		
		
		```
		[Outlet](Outlet.html "class in akka.stream")<[O](FanInShape.Init.html "type parameter in FanInShape.Init")> outlet()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.Name.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.Init.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.Init.html)*