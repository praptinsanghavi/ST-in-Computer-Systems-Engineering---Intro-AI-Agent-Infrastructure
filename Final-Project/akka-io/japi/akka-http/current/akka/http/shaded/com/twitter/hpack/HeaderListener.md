---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/HeaderListener.html
title: HeaderListener
---

# HeaderListener

## Content

Package [akka.http.shaded.com.twitter.hpack](package-summary.html)
## Interface HeaderListener

- ---

```
public interface HeaderListener
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[addHeader](#addHeader(java.lang.String,java.lang.String,java.lang.Object,boolean))​(java.lang.String name,  java.lang.String value,  java.lang.Object parsed,  boolean sensitive)` | emitHeader is called by the decoder during header field emission. |

- - ### Method Detail
	
	
	
		- #### addHeader
		
		
		
		```
		java.lang.Object addHeader​(java.lang.String name,
		                           java.lang.String value,
		                           java.lang.Object parsed,
		                           boolean sensitive)
		```
		
		emitHeader is called by the decoder during header field emission.
		 The name and value byte arrays must not be modified.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/HeaderListener.html](https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/HeaderListener.html)*