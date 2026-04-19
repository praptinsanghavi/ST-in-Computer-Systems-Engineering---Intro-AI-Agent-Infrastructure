---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html
title: UnacceptedResponseContentTypeRejection
---

# UnacceptedResponseContentTypeRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnacceptedResponseContentTypeRejection

- java.lang.Object
- - akka.http.scaladsl.server.UnacceptedResponseContentTypeRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[UnacceptedResponseContentTypeRejection](../../javadsl/server/UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnacceptedResponseContentTypeRejection
extends java.lang.Object
implements [UnacceptedResponseContentTypeRejection](../../javadsl/server/UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by marshallers.
 Signals that the request was rejected because the service is not capable of producing a response entity whose
 content type is accepted by the client

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnacceptedResponseContentTypeRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnacceptedResponseContentTypeRejection](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentNegotiator.Alternative](ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `scala.collection.immutable.Set<[ContentNegotiator.Alternative](ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")>` | `[supported](#supported())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnacceptedResponseContentTypeRejection
		
		
		
		```
		public UnacceptedResponseContentTypeRejection​(scala.collection.immutable.Set<[ContentNegotiator.Alternative](ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### supported
		
		
		
		```
		public scala.collection.immutable.Set<[ContentNegotiator.Alternative](ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported()
		```
		
		
		Specified by:
		`[supported](../../javadsl/server/UnacceptedResponseContentTypeRejection.html#supported())` in interface `[UnacceptedResponseContentTypeRejection](../../javadsl/server/UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html)*