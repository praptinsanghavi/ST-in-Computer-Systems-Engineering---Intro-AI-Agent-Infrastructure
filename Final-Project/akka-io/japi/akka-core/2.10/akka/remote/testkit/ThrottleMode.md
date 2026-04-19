---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ThrottleMode.html
title: ThrottleMode
---

# ThrottleMode

## Content

Package [akka.remote.testkit](package-summary.html)
## Interface ThrottleMode

- All Superinterfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

All Known Implementing Classes:
`[Blackhole$](Blackhole$.html "class in akka.remote.testkit")`, `[TokenBucket](TokenBucket.html "class in akka.remote.testkit")`, `[Unthrottled$](Unthrottled$.html "class in akka.remote.testkit")`

---

```
public interface ThrottleMode
extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[timeToAvailable](#timeToAvailable(long,int))​(long currentNanoTime,  int tokens)` |  |
	| `scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object>` | `[tryConsumeTokens](#tryConsumeTokens(long,int))​(long nanoTimeOfSend,  int tokens)` |  |

- - ### Method Detail
	
	
	
		- #### tryConsumeTokens
		
		
		
		```
		scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object> tryConsumeTokens​(long nanoTimeOfSend,
		                                                                   int tokens)
		```
		- #### timeToAvailable
		
		
		
		```
		scala.concurrent.duration.FiniteDuration timeToAvailable​(long currentNanoTime,
		                                                         int tokens)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ThrottleMode.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ThrottleMode.html)*