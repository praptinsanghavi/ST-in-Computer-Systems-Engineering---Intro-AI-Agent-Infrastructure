---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Clock.html
title: Clock
---

# Clock

## Content

Package [akka.util](package-summary.html)
## Interface Clock

- All Superinterfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public interface Clock
extends [Extension](../actor/Extension.html "interface in akka.actor")
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[currentTime](#currentTime())()` |  |
	| `long` | `[earlierTime](#earlierTime(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |

- - ### Method Detail
	
	
	
		- #### currentTime
		
		
		
		```
		long currentTime()
		```
		- #### earlierTime
		
		
		
		```
		long earlierTime​(scala.concurrent.duration.FiniteDuration duration)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Clock.html](https://doc.akka.io/japi/akka/current/akka/util/Clock.html)*