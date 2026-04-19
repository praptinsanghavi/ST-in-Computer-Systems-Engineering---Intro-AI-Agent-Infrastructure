---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.Clock.html
title: LWWRegister.Clock
---

# LWWRegister.Clock

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface LWWRegister.Clock\<A\>

- Enclosing class:
[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")\<[A](LWWRegister.html "type parameter in LWWRegister")\>

---

```
public static interface LWWRegister.Clock<A>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[apply](#apply(long,A))​(long currentTimestamp,  [A](LWWRegister.Clock.html "type parameter in LWWRegister.Clock") value)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		long apply​(long currentTimestamp,
		           [A](LWWRegister.Clock.html "type parameter in LWWRegister.Clock") value)
		```
		
		
		Parameters:
		`currentTimestamp` \- the current `timestamp` value of the `LWWRegister`
		`value` \- the register value to set and associate with the returned timestamp
		Returns:
		next timestamp

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.Clock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.Clock.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.Clock.html)*