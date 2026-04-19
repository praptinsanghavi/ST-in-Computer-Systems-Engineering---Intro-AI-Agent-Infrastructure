---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnFailureOptions.html
title: BackoffOnFailureOptions
---

# BackoffOnFailureOptions

## Content

Package [akka.pattern](package-summary.html)
## Interface BackoffOnFailureOptions

- All Superinterfaces:
`[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern")>`

All Known Implementing Classes:
`[BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")`

---

```
public interface BackoffOnFailureOptions
extends [ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")<[BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern")>
```

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.pattern.[ExtendedBackoffOptions](ExtendedBackoffOptions.html "interface in akka.pattern")
		
		
		`[props](ExtendedBackoffOptions.html#props()), [withAutoReset](ExtendedBackoffOptions.html#withAutoReset(scala.concurrent.duration.FiniteDuration)), [withHandlerWhileStopped](ExtendedBackoffOptions.html#withHandlerWhileStopped(akka.actor.ActorRef)), [withManualReset](ExtendedBackoffOptions.html#withManualReset()), [withMaxNrOfRetries](ExtendedBackoffOptions.html#withMaxNrOfRetries(int)), [withReplyWhileStopped](ExtendedBackoffOptions.html#withReplyWhileStopped(java.lang.Object)), [withSupervisorStrategy](ExtendedBackoffOptions.html#withSupervisorStrategy(akka.actor.OneForOneStrategy))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnFailureOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExtendedBackoffOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnFailureOptions.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnFailureOptions.html)*