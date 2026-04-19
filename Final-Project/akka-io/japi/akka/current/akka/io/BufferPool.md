---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/BufferPool.html
title: BufferPool
---

# BufferPool

## Content

Package [akka.io](package-summary.html)
## Interface BufferPool

- ---

```
public interface BufferPool
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.nio.ByteBuffer` | `[acquire](#acquire())()` |  |
	| `void` | `[release](#release(java.nio.ByteBuffer))​(java.nio.ByteBuffer buf)` |  |

- - ### Method Detail
	
	
	
		- #### acquire
		
		
		
		```
		java.nio.ByteBuffer acquire()
		```
		- #### release
		
		
		
		```
		void release​(java.nio.ByteBuffer buf)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/BufferPool.html](https://doc.akka.io/japi/akka/current/akka/io/BufferPool.html)*