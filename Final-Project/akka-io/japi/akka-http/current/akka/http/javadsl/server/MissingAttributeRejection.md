---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingAttributeRejection.html
title: MissingAttributeRejection
---

# MissingAttributeRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MissingAttributeRejection\<T\>

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MissingAttributeRejection](../../scaladsl/server/MissingAttributeRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MissingAttributeRejection<T>
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by attribute directives.
 Signals that the request was rejected because a required request attribute could not be found.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[AttributeKey](../model/AttributeKey.html "class in akka.http.javadsl.model")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")>` | `[key](#key())()` |  |

- - ### Method Detail
	
	
	
		- #### key
		
		
		
		```
		[AttributeKey](../model/AttributeKey.html "class in akka.http.javadsl.model")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")> key()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingAttributeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingAttributeRejection.html)*