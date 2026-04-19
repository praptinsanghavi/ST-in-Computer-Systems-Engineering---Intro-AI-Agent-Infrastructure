---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html
title: RequestEntityAcceptance
---

# RequestEntityAcceptance

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class RequestEntityAcceptance

- java.lang.Object
- - akka.http.javadsl.model.RequestEntityAcceptance

- Direct Known Subclasses:
`[RequestEntityAcceptance.Disallowed$](../../scaladsl/model/RequestEntityAcceptance.Disallowed$.html "class in akka.http.scaladsl.model")`, `[RequestEntityAcceptance.Expected$](../../scaladsl/model/RequestEntityAcceptance.Expected$.html "class in akka.http.scaladsl.model")`, `[RequestEntityAcceptance.Tolerated$](../../scaladsl/model/RequestEntityAcceptance.Tolerated$.html "class in akka.http.scaladsl.model")`

---

```
public abstract class RequestEntityAcceptance
extends java.lang.Object
```

See Also:
[`for convenience access to often used values.
 Do not extend this to a concrete Java class,
 as implementation of RequestEntityAcceptation should only exist in Scala`](RequestEntityAcceptances.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestEntityAcceptance](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[isEntityAccepted](#isEntityAccepted())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestEntityAcceptance
		
		
		
		```
		public RequestEntityAcceptance()
		```

	- ### Method Detail
	
	
	
		- #### isEntityAccepted
		
		
		
		```
		public abstract boolean isEntityAccepted()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntityAcceptance.Disallowed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntityAcceptance.Expected$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntityAcceptance.Tolerated$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html)*