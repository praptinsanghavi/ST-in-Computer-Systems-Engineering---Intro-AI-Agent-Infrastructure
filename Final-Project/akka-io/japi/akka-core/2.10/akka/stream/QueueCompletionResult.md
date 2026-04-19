---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueCompletionResult.html
title: QueueCompletionResult
---

# QueueCompletionResult

## Content

Package [akka.stream](package-summary.html)
## Class QueueCompletionResult

- java.lang.Object
- - [akka.stream.QueueOfferResult](QueueOfferResult.html "class in akka.stream")
	- - akka.stream.QueueCompletionResult

- Direct Known Subclasses:
`[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")`, `[QueueOfferResult.QueueClosed$](QueueOfferResult.QueueClosed$.html "class in akka.stream")`

---

```
public abstract class QueueCompletionResult
extends [QueueOfferResult](QueueOfferResult.html "class in akka.stream")
```

Not for user extension

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[QueueOfferResult](QueueOfferResult.html "class in akka.stream")
		
		
		`[QueueOfferResult.Dropped$](QueueOfferResult.Dropped$.html "class in akka.stream"), [QueueOfferResult.Enqueued$](QueueOfferResult.Enqueued$.html "class in akka.stream"), [QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream"), [QueueOfferResult.Failure$](QueueOfferResult.Failure$.html "class in akka.stream"), [QueueOfferResult.QueueClosed$](QueueOfferResult.QueueClosed$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[QueueCompletionResult](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.stream.[QueueOfferResult](QueueOfferResult.html "class in akka.stream")
		
		
		`[dropped](QueueOfferResult.html#dropped()), [enqueued](QueueOfferResult.html#enqueued()), [isEnqueued](QueueOfferResult.html#isEnqueued())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### QueueCompletionResult
		
		
		
		```
		public QueueCompletionResult()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Dropped$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Enqueued$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.QueueClosed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueCompletionResult.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueCompletionResult.html)*