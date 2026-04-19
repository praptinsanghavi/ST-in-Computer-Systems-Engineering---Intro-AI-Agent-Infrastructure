---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetryAttributes.ClientMeta.html
title: TelemetryAttributes.ClientMeta
---

# TelemetryAttributes.ClientMeta

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class TelemetryAttributes.ClientMeta

- java.lang.Object
- - akka.http.impl.engine.http2\.TelemetryAttributes.ClientMeta

- All Implemented Interfaces:
`akka.stream.Attributes.Attribute`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[TelemetryAttributes](TelemetryAttributes.html "class in akka.http.impl.engine.http2")

---

```
public static final class TelemetryAttributes.ClientMeta
extends java.lang.Object
implements akka.stream.Attributes.Attribute, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.http2.TelemetryAttributes.ClientMeta)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientMeta](#%3Cinit%3E(java.net.InetSocketAddress))​(java.net.InetSocketAddress remote)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.net.InetSocketAddress` | `[remote](#remote())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ClientMeta
		
		
		
		```
		public ClientMeta​(java.net.InetSocketAddress remote)
		```

	- ### Method Detail
	
	
	
		- #### remote
		
		
		
		```
		public java.net.InetSocketAddress remote()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetryAttributes.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetryAttributes.ClientMeta.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetryAttributes.ClientMeta.html)*