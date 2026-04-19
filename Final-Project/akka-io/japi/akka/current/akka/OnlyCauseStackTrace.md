---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/OnlyCauseStackTrace.html
title: OnlyCauseStackTrace
---

# OnlyCauseStackTrace

## Content

Package [akka](package-summary.html)
## Interface OnlyCauseStackTrace

- ---

```
public interface OnlyCauseStackTrace
```

Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause,
 scala.util.control.NoStackTrace suppresses all the StackTraces.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Throwable` | `[fillInStackTrace](#fillInStackTrace())()` |  |

- - ### Method Detail
	
	
	
		- #### fillInStackTrace
		
		
		
		```
		java.lang.Throwable fillInStackTrace()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/OnlyCauseStackTrace.html](https://doc.akka.io/japi/akka/current/akka/OnlyCauseStackTrace.html)*