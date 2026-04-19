---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2Exception.html
title: Http2Exception
---

# Http2Exception

## Content

Package [akka.http.scaladsl.model.http2](package-summary.html)
## Class Http2Exception

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.model.http2\.Http2Exception

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[PeerClosedStreamException](PeerClosedStreamException.html "class in akka.http.scaladsl.model.http2")`

---

```
public class Http2Exception
extends java.lang.RuntimeException
```

Base class for HTTP2 exceptions.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.http2.Http2Exception)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2Exception](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2Exception
		
		
		
		```
		public Http2Exception​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/PeerClosedStreamException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2Exception.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/http2/Http2Exception.html)*