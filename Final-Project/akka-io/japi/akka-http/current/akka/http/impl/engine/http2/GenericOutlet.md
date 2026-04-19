---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html
title: GenericOutlet
---

# GenericOutlet

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface GenericOutlet\<T\>

- ---

```
public interface GenericOutlet<T>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canBePushed](#canBePushed())()` |  |
	| `void` | `[complete](#complete())()` |  |
	| `void` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `void` | `[push](#push(T))​([T](GenericOutlet.html "type parameter in GenericOutlet") elem)` |  |
	| `void` | `[setHandler](#setHandler(akka.stream.stage.OutHandler))​(akka.stream.stage.OutHandler handler)` |  |

- - ### Method Detail
	
	
	
		- #### canBePushed
		
		
		
		```
		boolean canBePushed()
		```
		- #### complete
		
		
		
		```
		void complete()
		```
		- #### fail
		
		
		
		```
		void fail​(java.lang.Throwable cause)
		```
		- #### push
		
		
		
		```
		void push​([T](GenericOutlet.html "type parameter in GenericOutlet") elem)
		```
		- #### setHandler
		
		
		
		```
		void setHandler​(akka.stream.stage.OutHandler handler)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html)*