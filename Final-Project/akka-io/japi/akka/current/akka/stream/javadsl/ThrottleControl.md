---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ThrottleControl.html
title: ThrottleControl
---

# ThrottleControl

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class ThrottleControl

- java.lang.Object
- - akka.stream.javadsl.ThrottleControl

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
	| `[ThrottleControl](#%3Cinit%3E(int,java.time.Duration))​(int cost,  java.time.Duration per)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[getCost](#getCost())()` | Speed is limited to `cost/per`. |
	| `java.time.Duration` | `[getPer](#getPer())()` | Speed is limited to `cost/per`. |
	| `[ThrottleMode](../ThrottleMode.html "class in akka.stream")` | `[mode](#mode())()` |  |
	| `void` | `[update](#update(int,java.time.Duration))​(int cost,  java.time.Duration per)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThrottleControl
		
		
		
		```
		public ThrottleControl​(int cost,
		                       java.time.Duration per)
		```

	- ### Method Detail
	
	
	
		- #### getCost
		
		
		
		```
		public int getCost()
		```
		
		Speed is limited to `cost/per`. This is the current cost.
		- #### getPer
		
		
		
		```
		public java.time.Duration getPer()
		```
		
		Speed is limited to `cost/per`. This is the current per duration.
		- #### mode
		
		
		
		```
		public [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode()
		```
		- #### update
		
		
		
		```
		public void update​(int cost,
		                   java.time.Duration per)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ThrottleControl.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ThrottleControl.html)*