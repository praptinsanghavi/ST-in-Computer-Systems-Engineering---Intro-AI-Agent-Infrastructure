---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html
title: DelayStrategy
---

# DelayStrategy

## Content

Package [akka.stream.javadsl](package-summary.html)
## Interface DelayStrategy\<T\>

- ---

```
public interface DelayStrategy<T>
```

Allows to manage delay and can be stateful to compute delay for any sequence of elements,
 all elements go through nextDelay() updating state and returning delay for each element

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.time.Duration` | `[nextDelay](#nextDelay(T))​([T](DelayStrategy.html "type parameter in DelayStrategy") elem)` | Returns delay for ongoing element, `Duration.Zero` means passing without delay |

- - ### Method Detail
	
	
	
		- #### nextDelay
		
		
		
		```
		java.time.Duration nextDelay​([T](DelayStrategy.html "type parameter in DelayStrategy") elem)
		```
		
		Returns delay for ongoing element, `Duration.Zero` means passing without delay

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html)*