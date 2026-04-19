---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tupler.html
title: Tupler
---

# Tupler

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Interface Tupler\<T\>

- ---

```
public interface Tupler<T>
```

Provides a way to convert a value into an Tuple.
 If the value is already a Tuple then it is returned unchanged, otherwise it's wrapped in a Tuple1 instance.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[apply](#apply(T))​([T](Tupler.html "type parameter in Tupler") value)` |  |
	| `[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<java.lang.Object>` | `[OutIsTuple](#OutIsTuple())()` |  |

- - ### Method Detail
	
	
	
		- #### OutIsTuple
		
		
		
		```
		[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<java.lang.Object> OutIsTuple()
		```
		- #### apply
		
		
		
		```
		java.lang.Object apply​([T](Tupler.html "type parameter in Tupler") value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tupler.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tupler.html)*