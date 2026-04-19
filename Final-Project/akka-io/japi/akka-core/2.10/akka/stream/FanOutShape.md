---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:53:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.Init.html
title: FanOutShape.Init
---

# FanOutShape.Init

## Content

Package [akka.stream](package-summary.html)
## Interface FanOutShape.Init\<I\>

- All Known Implementing Classes:
`[FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")`, `[FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")`

Enclosing class:
[FanOutShape](FanOutShape.html "class in akka.stream")\<[I](FanOutShape.html "type parameter in FanOutShape")\>

---

```
public static interface FanOutShape.Init<I>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>` | `[inlet](#inlet())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` |  |

- - ### Method Detail
	
	
	
		- #### inlet
		
		
		
		```
		[Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")> inlet()
		```
		- #### name
		
		
		
		```
		java.lang.String name()
		```
		- #### outlets
		
		
		
		```
		scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.Init.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.Init.html)*