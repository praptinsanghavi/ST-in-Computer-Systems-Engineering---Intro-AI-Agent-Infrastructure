---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestEntityExpectedRejection.html
title: RequestEntityExpectedRejection
---

# RequestEntityExpectedRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RequestEntityExpectedRejection

- java.lang.Object
- - akka.http.scaladsl.server.RequestEntityExpectedRejection

- ---

```
public class RequestEntityExpectedRejection
extends java.lang.Object
```

Rejection created by unmarshallers.
 Signals that the request was rejected because an message body entity was expected but not supplied.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestEntityExpectedRejection](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `abstract static int` | `[productArity](#productArity())()` |  |
	| `abstract static java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestEntityExpectedRejection
		
		
		
		```
		public RequestEntityExpectedRejection()
		```

	- ### Method Detail
	
	
	
		- #### canEqual
		
		
		
		```
		public abstract static boolean canEqual​(java.lang.Object that)
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productArity
		
		
		
		```
		public abstract static int productArity()
		```
		- #### productElement
		
		
		
		```
		public abstract static java.lang.Object productElement​(int n)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestEntityExpectedRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestEntityExpectedRejection.html)*