---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance.IllegalPayloadLengthInSettingsFrame.html
title: Http2Compliance.IllegalPayloadLengthInSettingsFrame
---

# Http2Compliance.IllegalPayloadLengthInSettingsFrame

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Compliance.IllegalPayloadLengthInSettingsFrame

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - java.lang.IllegalStateException
				- - [akka.http.impl.engine.http2\.Http2Compliance.Http2ProtocolException](Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2")
					- - [akka.http.impl.engine.http2\.Http2Compliance.IllegalHttp2FrameSize](Http2Compliance.IllegalHttp2FrameSize.html "class in akka.http.impl.engine.http2")
						- - akka.http.impl.engine.http2\.Http2Compliance.IllegalPayloadLengthInSettingsFrame

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[Http2Compliance](Http2Compliance.html "class in akka.http.impl.engine.http2")

---

```
public static final class Http2Compliance.IllegalPayloadLengthInSettingsFrame
extends [Http2Compliance.IllegalHttp2FrameSize](Http2Compliance.IllegalHttp2FrameSize.html "class in akka.http.impl.engine.http2")
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.http2.Http2Compliance.IllegalPayloadLengthInSettingsFrame)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IllegalPayloadLengthInSettingsFrame](#%3Cinit%3E(int,java.lang.String))​(int size,  java.lang.String expected)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.impl.engine.http2\.[Http2Compliance.Http2ProtocolException](Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2")
		
		
		`[errorCode](Http2Compliance.Http2ProtocolException.html#errorCode())`
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IllegalPayloadLengthInSettingsFrame
		
		
		
		```
		public IllegalPayloadLengthInSettingsFrame​(int size,
		                                           java.lang.String expected)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance.IllegalHttp2FrameSize.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance.IllegalPayloadLengthInSettingsFrame.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Compliance.IllegalPayloadLengthInSettingsFrame.html)*