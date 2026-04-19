---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ThrottleControl.html
title: ThrottleControl
---

# ThrottleControl

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ThrottleControl

- java.lang.Object
- - akka.stream.scaladsl.ThrottleControl

- ---

```
public final class ThrottleControl
extends java.lang.Object
```

Control the throttle rate from the outside of the stream, or share a common throttle rate
 across several streams.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrottleControl](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration))​(int cost,  scala.concurrent.duration.FiniteDuration per)` |  |
	| `[ThrottleControl](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode))​(int cost,  scala.concurrent.duration.FiniteDuration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[getCost](#getCost())()` | Speed is limited to `cost/per`. |
	| `scala.concurrent.duration.FiniteDuration` | `[getPer](#getPer())()` | Speed is limited to `cost/per`. |
	| `void` | `[initIfNotShared](#initIfNotShared())()` |  |
	| `[ThrottleMode](../ThrottleMode.html "class in akka.stream")` | `[mode](#mode())()` |  |
	| `void` | `[update](#update(int,scala.concurrent.duration.FiniteDuration))​(int cost,  scala.concurrent.duration.FiniteDuration per)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThrottleControl
		
		
		
		```
		public ThrottleControl​(int cost,
		                       scala.concurrent.duration.FiniteDuration per)
		```
		- #### ThrottleControl
		
		
		
		```
		public ThrottleControl​(int cost,
		                       scala.concurrent.duration.FiniteDuration per,
		                       int maximumBurst,
		                       [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```

	- ### Method Detail
	
	
	
		- #### getCost
		
		
		
		```
		public int getCost()
		```
		
		Speed is limited to `cost/per`. This is the current cost.
		- #### getPer
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration getPer()
		```
		
		Speed is limited to `cost/per`. This is the current per duration.
		- #### initIfNotShared
		
		
		
		```
		public void initIfNotShared()
		```
		- #### mode
		
		
		
		```
		public [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode()
		```
		- #### update
		
		
		
		```
		public void update​(int cost,
		                   scala.concurrent.duration.FiniteDuration per)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ThrottleControl.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ThrottleControl.html)*