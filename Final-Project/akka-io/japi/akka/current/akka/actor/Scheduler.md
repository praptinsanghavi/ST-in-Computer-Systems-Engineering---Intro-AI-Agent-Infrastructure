---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.TaskRunOnClose.html
title: Scheduler.TaskRunOnClose
---

# Scheduler.TaskRunOnClose

## Content

Package [akka.actor](package-summary.html)
## Interface Scheduler.TaskRunOnClose

- All Superinterfaces:
`java.lang.Runnable`

Enclosing interface:
[Scheduler](Scheduler.html "interface in akka.actor")

---

```
public static interface Scheduler.TaskRunOnClose
extends java.lang.Runnable
```

If a `TaskRunOnClose` is used in `scheduleOnce` it will be run when the `Scheduler` is
 closed (`ActorSystem` shutdown). This is needed for the internal shutdown of dispatchers
 in Akka and is not intended to be used by end user applications, but it's public because
 a custom implementation of `Scheduler` must also implement this.

- - ### Method Summary
	
	
		- ### Methods inherited from interface java.lang.Runnable
		
		
		`run`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.TaskRunOnClose.html](https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.TaskRunOnClose.html)*