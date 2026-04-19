---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefSettings.html
title: StreamRefSettings
---

# StreamRefSettings

## Content

Package [akka.stream](package-summary.html)
## Interface StreamRefSettings

- ---

```
public interface StreamRefSettings
```

Settings specific to [`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream").
 More detailed documentation about each of the settings is available in `reference.conf`.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `int` | `[bufferCapacity](#bufferCapacity())()` | Deprecated. Use attribute 'StreamRefAttributes.BufferCapacity' to read the concrete setting value. |
	| `scala.concurrent.duration.FiniteDuration` | `[demandRedeliveryInterval](#demandRedeliveryInterval())()` | Deprecated. Use attribute 'StreamRefAttributes.DemandRedeliveryInterval' to read the concrete setting value. |
	| `scala.concurrent.duration.FiniteDuration` | `[finalTerminationSignalDeadline](#finalTerminationSignalDeadline())()` | Deprecated. Use attribute 'StreamRefAttributes.FinalTerminationSignalDeadline' to read the concrete setting value. |
	| `scala.concurrent.duration.FiniteDuration` | `[subscriptionTimeout](#subscriptionTimeout())()` | Deprecated. Use attribute 'StreamRefAttributes.SubscriptionTimeout' to read the concrete setting value. |
	| `[StreamRefSettings](StreamRefSettings.html "interface in akka.stream")` | `[withBufferCapacity](#withBufferCapacity(int))​(int value)` |  |
	| `[StreamRefSettings](StreamRefSettings.html "interface in akka.stream")` | `[withDemandRedeliveryInterval](#withDemandRedeliveryInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[StreamRefSettings](StreamRefSettings.html "interface in akka.stream")` | `[withSubscriptionTimeout](#withSubscriptionTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[StreamRefSettings](StreamRefSettings.html "interface in akka.stream")` | `[withTerminationReceivedBeforeCompletionLeeway](#withTerminationReceivedBeforeCompletionLeeway(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |

- - ### Method Detail
	
	
	
		- #### bufferCapacity
		
		
		
		```
		int bufferCapacity()
		```
		
		Deprecated.
		Use attribute 'StreamRefAttributes.BufferCapacity' to read the concrete setting value. Since 2\.6\.0\.
		- #### demandRedeliveryInterval
		
		
		
		```
		scala.concurrent.duration.FiniteDuration demandRedeliveryInterval()
		```
		
		Deprecated.
		Use attribute 'StreamRefAttributes.DemandRedeliveryInterval' to read the concrete setting value. Since 2\.6\.0\.
		- #### subscriptionTimeout
		
		
		
		```
		scala.concurrent.duration.FiniteDuration subscriptionTimeout()
		```
		
		Deprecated.
		Use attribute 'StreamRefAttributes.SubscriptionTimeout' to read the concrete setting value. Since 2\.6\.0\.
		- #### finalTerminationSignalDeadline
		
		
		
		```
		scala.concurrent.duration.FiniteDuration finalTerminationSignalDeadline()
		```
		
		Deprecated.
		Use attribute 'StreamRefAttributes.FinalTerminationSignalDeadline' to read the concrete setting value. Since 2\.6\.0\.
		- #### withBufferCapacity
		
		
		
		```
		[StreamRefSettings](StreamRefSettings.html "interface in akka.stream") withBufferCapacity​(int value)
		```
		- #### withDemandRedeliveryInterval
		
		
		
		```
		[StreamRefSettings](StreamRefSettings.html "interface in akka.stream") withDemandRedeliveryInterval​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withSubscriptionTimeout
		
		
		
		```
		[StreamRefSettings](StreamRefSettings.html "interface in akka.stream") withSubscriptionTimeout​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withTerminationReceivedBeforeCompletionLeeway
		
		
		
		```
		[StreamRefSettings](StreamRefSettings.html "interface in akka.stream") withTerminationReceivedBeforeCompletionLeeway​(scala.concurrent.duration.FiniteDuration value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefSettings.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefSettings.html)*