---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultSystemMessageQueue.html
title: DefaultSystemMessageQueue
---

# DefaultSystemMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Interface DefaultSystemMessageQueue

- All Known Implementing Classes:
`[CallingThreadMailbox](../testkit/CallingThreadMailbox.html "class in akka.testkit")`

---

```
public interface DefaultSystemMessageQueue
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[hasSystemMessages](#hasSystemMessages())()` |  |
	| `akka.dispatch.sysmsg.EarliestFirstSystemMessageList` | `[systemDrain](#systemDrain(akka.dispatch.sysmsg.LatestFirstSystemMessageList))​(akka.dispatch.sysmsg.LatestFirstSystemMessageList newContents)` |  |
	| `void` | `[systemEnqueue](#systemEnqueue(akka.actor.ActorRef,akka.dispatch.sysmsg.SystemMessage))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [SystemMessage](sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)` |  |

- - ### Method Detail
	
	
	
		- #### hasSystemMessages
		
		
		
		```
		boolean hasSystemMessages()
		```
		- #### systemDrain
		
		
		
		```
		akka.dispatch.sysmsg.EarliestFirstSystemMessageList systemDrain​(akka.dispatch.sysmsg.LatestFirstSystemMessageList newContents)
		```
		- #### systemEnqueue
		
		
		
		```
		void systemEnqueue​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		                   [SystemMessage](sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/testkit/CallingThreadMailbox.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultSystemMessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/DefaultSystemMessageQueue.html)*