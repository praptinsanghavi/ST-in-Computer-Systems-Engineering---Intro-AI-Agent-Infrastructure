---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport.ChunkTransformer$.html
title: RenderSupport.ChunkTransformer$
---

# RenderSupport.ChunkTransformer$

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class RenderSupport.ChunkTransformer$

- java.lang.Object
- - akka.http.impl.engine.rendering.RenderSupport.ChunkTransformer$

- Enclosing class:
[RenderSupport](RenderSupport.html "class in akka.http.impl.engine.rendering")

---

```
public static class RenderSupport.ChunkTransformer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RenderSupport.ChunkTransformer$](RenderSupport.ChunkTransformer$.html "class in akka.http.impl.engine.rendering")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChunkTransformer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[HttpEntity.ChunkStreamPart](../../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​akka.util.ByteString,​akka.NotUsed>` | `[flow](#flow())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RenderSupport.ChunkTransformer$](RenderSupport.ChunkTransformer$.html "class in akka.http.impl.engine.rendering") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ChunkTransformer$
		
		
		
		```
		public ChunkTransformer$()
		```

	- ### Method Detail
	
	
	
		- #### flow
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpEntity.ChunkStreamPart](../../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​akka.util.ByteString,​akka.NotUsed> flow()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport.ChunkTransformer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport.ChunkTransformer$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport.ChunkTransformer$.html)*