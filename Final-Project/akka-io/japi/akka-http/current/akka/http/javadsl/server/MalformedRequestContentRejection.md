---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedRequestContentRejection.html
title: MalformedRequestContentRejection
---

# MalformedRequestContentRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MalformedRequestContentRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MalformedRequestContentRejection](../../scaladsl/server/MalformedRequestContentRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MalformedRequestContentRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by unmarshallers.
 Signals that the request was rejected because unmarshalling failed with an error that wasn't
 an `IllegalArgumentException`. Usually that means that the request content was not of the expected format.
 Note that semantic issues with the request content (e.g. because some parameter was out of range)
 will usually trigger a `ValidationRejection` instead.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Throwable` | `[getCause](#getCause())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |

- - ### Method Detail
	
	
	
		- #### getCause
		
		
		
		```
		java.lang.Throwable getCause()
		```
		- #### message
		
		
		
		```
		java.lang.String message()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedRequestContentRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedRequestContentRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedRequestContentRejection.html)*