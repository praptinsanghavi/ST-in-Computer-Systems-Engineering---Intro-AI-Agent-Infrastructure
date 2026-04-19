---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.html
title: TestEvent
---

# TestEvent

## Content

Package [akka.testkit](package-summary.html)
## Interface TestEvent

- All Known Implementing Classes:
`[TestEvent.Mute](TestEvent.Mute.html "class in akka.testkit")`, `[TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit")`

---

```
public interface TestEvent
```

Implementation helpers of the EventFilter facilities: send `Mute`
 to the TestEventListener to install a filter, and `UnMute` to
 uninstall it.
 
 You should always prefer the filter methods in the package object
 (see `akka.testkit` `filterEvents` and `filterException`) or on the
 EventFilter implementations.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[TestEvent.Mute](TestEvent.Mute.html "class in akka.testkit")` |  |
	| `static class` | `[TestEvent.Mute$](TestEvent.Mute$.html "class in akka.testkit")` |  |
	| `static class` | `[TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit")` |  |
	| `static class` | `[TestEvent.UnMute$](TestEvent.UnMute$.html "class in akka.testkit")` |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.Mute$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.Mute.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.UnMute$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.UnMute.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestEvent.html)*