---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/PeerClosedStreamException.html
title: PeerClosedStreamException
---

# PeerClosedStreamException

## Content

Package [akka.http.scaladsl.model.http2](package-summary.html)
## Class PeerClosedStreamException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.http.scaladsl.model.http2\.Http2Exception](Http2Exception.html "class in akka.http.scaladsl.model.http2")
				- - akka.http.scaladsl.model.http2\.PeerClosedStreamException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class PeerClosedStreamException
extends [Http2Exception](Http2Exception.html "class in akka.http.scaladsl.model.http2")
implements scala.util.control.NoStackTrace
```

Exception that will be reported on the request entity stream when the peer closed the stream.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.http2.PeerClosedStreamException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PeerClosedStreamException](#%3Cinit%3E(int,akka.http.impl.engine.http2.Http2Protocol.ErrorCode))​(int streamId,  [Http2Protocol.ErrorCode](../../../impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") errorCode)` |  |
	| `[PeerClosedStreamException](#%3Cinit%3E(int,java.lang.String,int))​(int streamId,  java.lang.String errorCode,  int numericErrorCode)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[errorCode](#errorCode())()` |  |
	| `int` | `[numericErrorCode](#numericErrorCode())()` |  |
	| `int` | `[streamId](#streamId())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### PeerClosedStreamException
		
		
		
		```
		public PeerClosedStreamException​(int streamId,
		                                 java.lang.String errorCode,
		                                 int numericErrorCode)
		```
		- #### PeerClosedStreamException
		
		
		
		```
		public PeerClosedStreamException​(int streamId,
		                                 [Http2Protocol.ErrorCode](../../../impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") errorCode)
		```

	- ### Method Detail
	
	
	
		- #### errorCode
		
		
		
		```
		public java.lang.String errorCode()
		```
		- #### numericErrorCode
		
		
		
		```
		public int numericErrorCode()
		```
		- #### streamId
		
		
		
		```
		public int streamId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2Exception.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/PeerClosedStreamException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/PeerClosedStreamException.html)*