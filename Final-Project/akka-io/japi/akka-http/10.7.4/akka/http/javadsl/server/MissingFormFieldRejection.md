---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html
title: MissingFormFieldRejection
---

# MissingFormFieldRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MissingFormFieldRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MissingFormFieldRejection](../../scaladsl/server/MissingFormFieldRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MissingFormFieldRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by form field filters.
 Signals that the request was rejected because a form field was not found.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[fieldName](#fieldName())()` |  |

- - ### Method Detail
	
	
	
		- #### fieldName
		
		
		
		```
		java.lang.String fieldName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingFormFieldRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html)*