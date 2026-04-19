---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.Message.html
title: TestActor.Message
---

# TestActor.Message

## Content

Package [akka.testkit](package-summary.html)
## Interface TestActor.Message

- All Known Implementing Classes:
`[TestActor.NullMessage$](TestActor.NullMessage$.html "class in akka.testkit")`, `[TestActor.RealMessage](TestActor.RealMessage.html "class in akka.testkit")`

Enclosing class:
[TestActor](TestActor.html "class in akka.testkit")

---

```
public static interface TestActor.Message
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[msg](#msg())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |

- - ### Method Detail
	
	
	
		- #### msg
		
		
		
		```
		java.lang.Object msg()
		```
		- #### sender
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") sender()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.NullMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.RealMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.Message.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.Message.html)*