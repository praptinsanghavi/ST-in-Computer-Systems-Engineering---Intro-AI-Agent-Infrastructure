---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout.html
title: ReceiveTimeout
---

# ReceiveTimeout

## Content

Package [akka.actor.dungeon](package-summary.html)
## Interface ReceiveTimeout

- ---

```
public interface ReceiveTimeout
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")>` | `[cancelReceiveTimeoutIfNeeded](#cancelReceiveTimeoutIfNeeded(java.lang.Object))​(java.lang.Object message)` |  |
	| `void` | `[cancelReceiveTimeoutTask](#cancelReceiveTimeoutTask())()` |  |
	| `void` | `[checkReceiveTimeout](#checkReceiveTimeout(boolean))​(boolean reschedule)` |  |
	| `void` | `[checkReceiveTimeoutIfNeeded](#checkReceiveTimeoutIfNeeded(java.lang.Object,scala.Tuple2))​(java.lang.Object message,  scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> beforeReceive)` | Called after \`ActorCell.receiveMessage\` or \`ActorCell.autoReceiveMessage\`. |
	| `boolean` | `[hasTimeoutData](#hasTimeoutData())()` |  |
	| `boolean` | `[messageMarkedToNotInfluenceTimeout](#messageMarkedToNotInfluenceTimeout(java.lang.Object))​(java.lang.Object message)` |  |
	| `scala.concurrent.duration.Duration` | `[receiveTimeout](#receiveTimeout())()` |  |
	| `boolean` | `[receiveTimeoutChanged](#receiveTimeoutChanged(scala.Tuple2))​(scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> beforeReceive)` |  |
	| `void` | `[receiveTimeoutData_$eq](#receiveTimeoutData_$eq(scala.Tuple2))​(scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> x$1)` |  |
	| `void` | `[rescheduleReceiveTimeout](#rescheduleReceiveTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration f)` |  |
	| `void` | `[setReceiveTimeout](#setReceiveTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration timeout)` |  |

- - ### Method Detail
	
	
	
		- #### receiveTimeoutData\_$eq
		
		
		
		```
		void receiveTimeoutData_$eq​(scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> x$1)
		```
		- #### receiveTimeout
		
		
		
		```
		scala.concurrent.duration.Duration receiveTimeout()
		```
		- #### setReceiveTimeout
		
		
		
		```
		void setReceiveTimeout​(scala.concurrent.duration.Duration timeout)
		```
		- #### checkReceiveTimeoutIfNeeded
		
		
		
		```
		void checkReceiveTimeoutIfNeeded​(java.lang.Object message,
		                                 scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> beforeReceive)
		```
		
		Called after \`ActorCell.receiveMessage\` or \`ActorCell.autoReceiveMessage\`.
		- #### checkReceiveTimeout
		
		
		
		```
		void checkReceiveTimeout​(boolean reschedule)
		```
		- #### rescheduleReceiveTimeout
		
		
		
		```
		void rescheduleReceiveTimeout​(scala.concurrent.duration.FiniteDuration f)
		```
		- #### hasTimeoutData
		
		
		
		```
		boolean hasTimeoutData()
		```
		- #### receiveTimeoutChanged
		
		
		
		```
		boolean receiveTimeoutChanged​(scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> beforeReceive)
		```
		- #### cancelReceiveTimeoutIfNeeded
		
		
		
		```
		scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> cancelReceiveTimeoutIfNeeded​(java.lang.Object message)
		```
		- #### cancelReceiveTimeoutTask
		
		
		
		```
		void cancelReceiveTimeoutTask()
		```
		- #### messageMarkedToNotInfluenceTimeout
		
		
		
		```
		boolean messageMarkedToNotInfluenceTimeout​(java.lang.Object message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout.html)*