---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy.html
title: DelayStrategy
---

# DelayStrategy

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface DelayStrategy\<T\>

- ---

```
public interface DelayStrategy<T>
```

Allows to manage delay. Can be stateful to compute delay for any sequence
 of elements, as instances are not shared among running streams and all
 elements go through nextDelay(), updating state and returning delay for that
 element.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[nextDelay](#nextDelay(T))​([T](DelayStrategy.html "type parameter in DelayStrategy") elem)` | Returns delay for ongoing element, `Duration.Zero` means passing without delay |

- - ### Method Detail
	
	
	
		- #### nextDelay
		
		
		
		```
		scala.concurrent.duration.FiniteDuration nextDelay​([T](DelayStrategy.html "type parameter in DelayStrategy") elem)
		```
		
		Returns delay for ongoing element, `Duration.Zero` means passing without delay

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy.html)*