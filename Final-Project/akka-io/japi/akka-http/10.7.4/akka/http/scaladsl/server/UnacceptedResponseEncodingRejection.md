---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html
title: UnacceptedResponseEncodingRejection
---

# UnacceptedResponseEncodingRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnacceptedResponseEncodingRejection

- java.lang.Object
- - akka.http.scaladsl.server.UnacceptedResponseEncodingRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[UnacceptedResponseEncodingRejection](../../javadsl/server/UnacceptedResponseEncodingRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnacceptedResponseEncodingRejection
extends java.lang.Object
implements [UnacceptedResponseEncodingRejection](../../javadsl/server/UnacceptedResponseEncodingRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by encoding filters.
 Signals that the request was rejected because the service is not capable of producing a response entity whose
 content encoding is accepted by the client

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnacceptedResponseEncodingRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnacceptedResponseEncodingRejection](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")> supported)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server")` | `[apply](#apply(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") supported)` |  |
	| `java.util.Set<[HttpEncoding](../../javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")>` | `[getSupported](#getSupported())()` |  |
	| `scala.collection.immutable.Set<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")>` | `[supported](#supported())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnacceptedResponseEncodingRejection
		
		
		
		```
		public UnacceptedResponseEncodingRejection​(scala.collection.immutable.Set<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")> supported)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server") apply​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") supported)
		```
		- #### supported
		
		
		
		```
		public scala.collection.immutable.Set<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")> supported()
		```
		- #### getSupported
		
		
		
		```
		public java.util.Set<[HttpEncoding](../../javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")> getSupported()
		```
		
		
		Specified by:
		`[getSupported](../../javadsl/server/UnacceptedResponseEncodingRejection.html#getSupported())` in interface `[UnacceptedResponseEncodingRejection](../../javadsl/server/UnacceptedResponseEncodingRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html)*