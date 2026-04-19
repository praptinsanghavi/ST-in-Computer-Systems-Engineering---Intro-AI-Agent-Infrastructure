---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2JDKAlpnSupport.html
title: Http2JDKAlpnSupport
---

# Http2JDKAlpnSupport

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2JDKAlpnSupport

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2JDKAlpnSupport

- ---

```
public class Http2JDKAlpnSupport
extends java.lang.Object
```

INTERNAL API
 
 The actual implementation of ALPN support on supported JDKs. We rely on lazy class loading to not fail with class loading errors
 when ALPN support is missing.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2JDKAlpnSupport](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[applySessionParameters](#applySessionParameters(javax.net.ssl.SSLEngine,akka.stream.TLSProtocol.NegotiateNewSession))​(javax.net.ssl.SSLEngine engine,  akka.stream.TLSProtocol.NegotiateNewSession sessionParameters)` |  |
	| `static void` | `[clientSetApplicationProtocols](#clientSetApplicationProtocols(javax.net.ssl.SSLEngine,java.lang.String%5B%5D))​(javax.net.ssl.SSLEngine engine,  java.lang.String[] protocols)` |  |
	| `static javax.net.ssl.SSLEngine` | `[jdkAlpnSupport](#jdkAlpnSupport(javax.net.ssl.SSLEngine,scala.Function1))​(javax.net.ssl.SSLEngine engine,  scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> setChosenProtocol)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2JDKAlpnSupport
		
		
		
		```
		public Http2JDKAlpnSupport()
		```

	- ### Method Detail
	
	
	
		- #### jdkAlpnSupport
		
		
		
		```
		public static javax.net.ssl.SSLEngine jdkAlpnSupport​(javax.net.ssl.SSLEngine engine,
		                                                     scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> setChosenProtocol)
		```
		- #### applySessionParameters
		
		
		
		```
		public static void applySessionParameters​(javax.net.ssl.SSLEngine engine,
		                                          akka.stream.TLSProtocol.NegotiateNewSession sessionParameters)
		```
		- #### clientSetApplicationProtocols
		
		
		
		```
		public static void clientSetApplicationProtocols​(javax.net.ssl.SSLEngine engine,
		                                                 java.lang.String[] protocols)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2JDKAlpnSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2JDKAlpnSupport.html)*