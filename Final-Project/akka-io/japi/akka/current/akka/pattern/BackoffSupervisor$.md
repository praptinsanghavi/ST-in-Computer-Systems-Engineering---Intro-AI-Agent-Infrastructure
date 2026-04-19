---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor$.html
title: BackoffSupervisor$
---

# BackoffSupervisor$

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffSupervisor$

- java.lang.Object
- - akka.pattern.BackoffSupervisor$

- ---

```
public class BackoffSupervisor$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BackoffSupervisor$](BackoffSupervisor$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackoffSupervisor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BackoffSupervisor.GetCurrentChild$](BackoffSupervisor.GetCurrentChild$.html "class in akka.pattern")` | `[getCurrentChild](#getCurrentChild())()` | Java API: Send this message to the `BackoffSupervisor` and it will reply with  [`BackoffSupervisor.CurrentChild`](BackoffSupervisor.CurrentChild.html "class in akka.pattern") containing the `ActorRef` of the current child, if any. |
	| `[BackoffSupervisor.GetRestartCount$](BackoffSupervisor.GetRestartCount$.html "class in akka.pattern")` | `[getRestartCount](#getRestartCount())()` | Java API: Send this message to the `BackoffSupervisor` and it will reply with  [`BackoffSupervisor.RestartCount`](BackoffSupervisor.RestartCount.html "class in akka.pattern") containing the current restart count. |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.pattern.BackoffOnFailureOptions))​([BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern") options)` | Props for creating a `BackoffSupervisor` actor from [`BackoffOnFailureOptions`](BackoffOnFailureOptions.html "interface in akka.pattern"). |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.pattern.BackoffOnStopOptions))​([BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") options)` | Props for creating a `BackoffSupervisor` actor from [`BackoffOnStopOptions`](BackoffOnStopOptions.html "interface in akka.pattern"). |
	| `[BackoffSupervisor.Reset$](BackoffSupervisor.Reset$.html "class in akka.pattern")` | `[reset](#reset())()` | Java API: Send this message to the `BackoffSupervisor` and it will reset the back\-off. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BackoffSupervisor$](BackoffSupervisor$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BackoffSupervisor$
		
		
		
		```
		public BackoffSupervisor$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​([BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") options)
		```
		
		Props for creating a `BackoffSupervisor` actor from [`BackoffOnStopOptions`](BackoffOnStopOptions.html "interface in akka.pattern").
		 
		
		Parameters:
		`options` \- the [`BackoffOnStopOptions`](BackoffOnStopOptions.html "interface in akka.pattern") that specify how to construct a backoff\-supervisor.
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​([BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern") options)
		```
		
		Props for creating a `BackoffSupervisor` actor from [`BackoffOnFailureOptions`](BackoffOnFailureOptions.html "interface in akka.pattern").
		 
		
		Parameters:
		`options` \- the [`BackoffOnFailureOptions`](BackoffOnFailureOptions.html "interface in akka.pattern") that specify how to construct a backoff\-supervisor.
		- #### getCurrentChild
		
		
		
		```
		public [BackoffSupervisor.GetCurrentChild$](BackoffSupervisor.GetCurrentChild$.html "class in akka.pattern") getCurrentChild()
		```
		
		Java API: Send this message to the `BackoffSupervisor` and it will reply with
		 [`BackoffSupervisor.CurrentChild`](BackoffSupervisor.CurrentChild.html "class in akka.pattern") containing the `ActorRef` of the current child, if any.
		- #### reset
		
		
		
		```
		public [BackoffSupervisor.Reset$](BackoffSupervisor.Reset$.html "class in akka.pattern") reset()
		```
		
		Java API: Send this message to the `BackoffSupervisor` and it will reset the back\-off.
		 This should be used in conjunction with `withManualReset` in `BackoffOptions`.
		- #### getRestartCount
		
		
		
		```
		public [BackoffSupervisor.GetRestartCount$](BackoffSupervisor.GetRestartCount$.html "class in akka.pattern") getRestartCount()
		```
		
		Java API: Send this message to the `BackoffSupervisor` and it will reply with
		 [`BackoffSupervisor.RestartCount`](BackoffSupervisor.RestartCount.html "class in akka.pattern") containing the current restart count.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.CurrentChild.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.GetCurrentChild$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.GetRestartCount$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.Reset$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor.RestartCount.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor$.html](https://doc.akka.io/japi/akka/current/akka/pattern/BackoffSupervisor$.html)*