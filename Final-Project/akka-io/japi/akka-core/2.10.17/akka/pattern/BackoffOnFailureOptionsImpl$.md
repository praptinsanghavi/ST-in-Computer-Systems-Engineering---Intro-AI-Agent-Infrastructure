---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl$.html
title: BackoffOnFailureOptionsImpl$
---

# BackoffOnFailureOptionsImpl$

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffOnFailureOptionsImpl$

- java.lang.Object
- - akka.pattern.BackoffOnFailureOptionsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class BackoffOnFailureOptionsImpl$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.BackoffOnFailureOptionsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BackoffOnFailureOptionsImpl$](BackoffOnFailureOptionsImpl$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackoffOnFailureOptionsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `<T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `<T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `<T> [BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")<T>` | `[apply](#apply(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Option,akka.actor.OneForOneStrategy,akka.pattern.HandlingWhileStopped))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,  [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,  [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped)` |  |
	| `<T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[apply$default$6](#apply$default$6())()` |  |
	| `<T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[apply$default$7](#apply$default$7())()` |  |
	| `<T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[apply$default$8](#apply$default$8())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple8<[Props](../actor/Props.html "class in akka.actor"),​java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>,​[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor"),​[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")>>` | `[unapply](#unapply(akka.pattern.BackoffOnFailureOptionsImpl))​([BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BackoffOnFailureOptionsImpl$](BackoffOnFailureOptionsImpl$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BackoffOnFailureOptionsImpl$
		
		
		
		```
		public BackoffOnFailureOptionsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$6
		
		
		
		```
		public <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") $lessinit$greater$default$7()
		```
		- #### $lessinit$greater$default$8
		
		
		
		```
		public <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") $lessinit$greater$default$8()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> [BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")<T> apply​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                                java.lang.String childName,
		                                                scala.concurrent.duration.FiniteDuration minBackoff,
		                                                scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                double randomFactor,
		                                                scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,
		                                                [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,
		                                                [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped)
		```
		- #### apply$default$6
		
		
		
		```
		public <T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public <T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") apply$default$7()
		```
		- #### apply$default$8
		
		
		
		```
		public <T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") apply$default$8()
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple8<[Props](../actor/Props.html "class in akka.actor"),​java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>,​[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor"),​[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")>> unapply​([BackoffOnFailureOptionsImpl](BackoffOnFailureOptionsImpl.html "class in akka.pattern")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffReset.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/HandlingWhileStopped.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptionsImpl$.html)*