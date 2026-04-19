---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
title: MissingHeaderRejection
---

# MissingHeaderRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MissingHeaderRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MissingHeaderRejection](../../scaladsl/server/MissingHeaderRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MissingHeaderRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by header directives.
 Signals that the request was rejected because a required header could not be found.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[headerName](#headerName())()` |  |

- - ### Method Detail
	
	
	
		- #### headerName
		
		
		
		```
		java.lang.String headerName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html)*