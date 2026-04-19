---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityNode.html
title: PriorityNode
---

# PriorityNode

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface PriorityNode

- ---

```
public interface PriorityNode
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2")>` | `[children](#children())()` |  |
	| `[PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2")` | `[dependency](#dependency())()` |  |
	| `int` | `[streamId](#streamId())()` |  |
	| `int` | `[weight](#weight())()` |  |

- - ### Method Detail
	
	
	
		- #### children
		
		
		
		```
		scala.collection.immutable.Seq<[PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2")> children()
		```
		- #### dependency
		
		
		
		```
		[PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2") dependency()
		```
		- #### streamId
		
		
		
		```
		int streamId()
		```
		- #### weight
		
		
		
		```
		int weight()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityNode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityNode.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityNode.html)*