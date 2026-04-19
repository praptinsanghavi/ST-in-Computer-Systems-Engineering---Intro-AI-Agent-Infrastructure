---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance$.html
title: Http2Compliance$
---

# Http2Compliance$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Compliance$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2Compliance$

- ---

```
public class Http2Compliance$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2Compliance$](Http2Compliance$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2Compliance$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isClientInitiatedStreamId](#isClientInitiatedStreamId(int))​(int id)` | checks if the stream id was client initiated, by checking if the stream id was odd\-numbered |
	| `scala.runtime.Nothing$` | `[missingHttpIdHeaderException](#missingHttpIdHeaderException())()` |  |
	| `void` | `[requireFrameSize](#requireFrameSize(int,int))​(int size,  int max)` |  |
	| `void` | `[requireNonZeroStreamId](#requireNonZeroStreamId(int))​(int id)` |  |
	| `void` | `[requireNoSelfDependency](#requireNoSelfDependency(int,int))​(int id,  int dependency)` |  |
	| `void` | `[requirePositiveWindowUpdateIncrement](#requirePositiveWindowUpdateIncrement(int,int))​(int streamId,  int increment)` |  |
	| `void` | `[requireZeroStreamId](#requireZeroStreamId(int))​(int id)` |  |
	| `void` | `[validateMaxFrameSize](#validateMaxFrameSize(int))​(int value)` | Validate value of MAX\_FRAME\_SIZE setting. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2Compliance$](Http2Compliance$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2Compliance$
		
		
		
		```
		public Http2Compliance$()
		```

	- ### Method Detail
	
	
	
		- #### missingHttpIdHeaderException
		
		
		
		```
		public final scala.runtime.Nothing$ missingHttpIdHeaderException()
		```
		- #### validateMaxFrameSize
		
		
		
		```
		public void validateMaxFrameSize​(int value)
		```
		
		Validate value of MAX\_FRAME\_SIZE setting.
		- #### requireZeroStreamId
		
		
		
		```
		public final void requireZeroStreamId​(int id)
		```
		- #### requireNonZeroStreamId
		
		
		
		```
		public final void requireNonZeroStreamId​(int id)
		```
		- #### requirePositiveWindowUpdateIncrement
		
		
		
		```
		public final void requirePositiveWindowUpdateIncrement​(int streamId,
		                                                       int increment)
		```
		- #### isClientInitiatedStreamId
		
		
		
		```
		public final boolean isClientInitiatedStreamId​(int id)
		```
		
		checks if the stream id was client initiated, by checking if the stream id was odd\-numbered
		- #### requireFrameSize
		
		
		
		```
		public final void requireFrameSize​(int size,
		                                   int max)
		```
		- #### requireNoSelfDependency
		
		
		
		```
		public final void requireNoSelfDependency​(int id,
		                                          int dependency)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance$.html)*