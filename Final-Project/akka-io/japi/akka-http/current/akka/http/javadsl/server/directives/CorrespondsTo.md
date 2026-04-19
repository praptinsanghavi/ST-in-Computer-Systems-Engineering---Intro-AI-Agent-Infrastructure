---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CorrespondsTo.html
title: CorrespondsTo
---

# CorrespondsTo

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Annotation Type CorrespondsTo

- ---

```
@Target(METHOD)
@Retention(RUNTIME)
@InternalApi
public @interface CorrespondsTo
```

INTERNAL API – used for consistency specs

 Used to hint at consistency spec implementations that a given JavaDSL method corresponds
 to a method of given name in ScalaDSL.

 E.g. a Java method paramsList could be hinted using `@CorrespondsTo("paramsSeq")`.

- - ### Required Element Summary
	
	
	
	Required Elements 
	| Modifier and Type | Required Element | Description |
	| `java.lang.String` | `[value](#value())` |  |

- - ### Element Detail
	
	
	
		- #### value
		
		
		
		```
		java.lang.String value
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CorrespondsTo.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CorrespondsTo.html)*