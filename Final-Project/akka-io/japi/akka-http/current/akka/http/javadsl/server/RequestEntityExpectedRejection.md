---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestEntityExpectedRejection.html
title: RequestEntityExpectedRejection
---

# RequestEntityExpectedRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RequestEntityExpectedRejection

- java.lang.Object
- - akka.http.javadsl.server.RequestEntityExpectedRejection

- All Implemented Interfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

Direct Known Subclasses:
`[RequestEntityExpectedRejection$](../../scaladsl/server/RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server")`

---

```
public abstract class RequestEntityExpectedRejection
extends java.lang.Object
implements [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by unmarshallers.
 Signals that the request was rejected because an message body entity was expected but not supplied.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestEntityExpectedRejection](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "class in akka.http.javadsl.server")` | `[get](#get())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestEntityExpectedRejection
		
		
		
		```
		public RequestEntityExpectedRejection()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "class in akka.http.javadsl.server") get()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestEntityExpectedRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestEntityExpectedRejection.html)*