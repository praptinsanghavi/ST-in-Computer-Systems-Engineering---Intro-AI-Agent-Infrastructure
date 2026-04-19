---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
title: DateHeaderRendering
---

# DateHeaderRendering

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Interface DateHeaderRendering

- ---

```
public interface DateHeaderRendering
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `byte[]` | `[renderHeaderBytes](#renderHeaderBytes())()` |  |
	| `scala.Tuple2<java.lang.String,​java.lang.String>` | `[renderHeaderPair](#renderHeaderPair())()` |  |
	| `java.lang.String` | `[renderHeaderValue](#renderHeaderValue())()` |  |

- - ### Method Detail
	
	
	
		- #### renderHeaderPair
		
		
		
		```
		scala.Tuple2<java.lang.String,​java.lang.String> renderHeaderPair()
		```
		- #### renderHeaderBytes
		
		
		
		```
		byte[] renderHeaderBytes()
		```
		- #### renderHeaderValue
		
		
		
		```
		java.lang.String renderHeaderValue()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html)*