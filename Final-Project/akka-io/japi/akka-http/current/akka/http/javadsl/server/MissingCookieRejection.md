---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingCookieRejection.html
title: MissingCookieRejection
---

# MissingCookieRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MissingCookieRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MissingCookieRejection](../../scaladsl/server/MissingCookieRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MissingCookieRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by the `cookie` directive.
 Signals that the request was rejected because a cookie was not found.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[cookieName](#cookieName())()` |  |

- - ### Method Detail
	
	
	
		- #### cookieName
		
		
		
		```
		java.lang.String cookieName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingCookieRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingCookieRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingCookieRejection.html)*