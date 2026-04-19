---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html
title: RequestEntityExpectedRejection$
---

# RequestEntityExpectedRejection$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RequestEntityExpectedRejection$

- java.lang.Object
- - [akka.http.javadsl.server.RequestEntityExpectedRejection](../../javadsl/server/RequestEntityExpectedRejection.html "class in akka.http.javadsl.server")
	- - akka.http.scaladsl.server.RequestEntityExpectedRejection$

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class RequestEntityExpectedRejection$
extends [RequestEntityExpectedRejection](../../javadsl/server/RequestEntityExpectedRejection.html "class in akka.http.javadsl.server")
implements [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by unmarshallers.
 Signals that the request was rejected because an message body entity was expected but not supplied.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.RequestEntityExpectedRejection$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestEntityExpectedRejection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.javadsl.server.[RequestEntityExpectedRejection](../../javadsl/server/RequestEntityExpectedRejection.html "class in akka.http.javadsl.server")
		
		
		`[get](../../javadsl/server/RequestEntityExpectedRejection.html#get())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestEntityExpectedRejection$
		
		
		
		```
		public RequestEntityExpectedRejection$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html)*