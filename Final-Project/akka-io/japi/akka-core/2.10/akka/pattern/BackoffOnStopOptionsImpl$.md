---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl$.html
title: BackoffOnStopOptionsImpl$
---

# BackoffOnStopOptionsImpl$

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffOnStopOptionsImpl$

- java.lang.Object
- - akka.pattern.BackoffOnStopOptionsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class BackoffOnStopOptionsImpl$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.BackoffOnStopOptionsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BackoffOnStopOptionsImpl$](BackoffOnStopOptionsImpl$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackoffOnStopOptionsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `<T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `<T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[$lessinit$greater$default$8](#$lessinit$greater$default$8())()` |  |
	| `<T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>` | `[$lessinit$greater$default$9](#$lessinit$greater$default$9())()` |  |
	| `<T> [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T>` | `[apply](#apply(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Option,akka.actor.OneForOneStrategy,akka.pattern.HandlingWhileStopped,scala.Option))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,  [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,  [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,  scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)` |  |
	| `<T> scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>` | `[apply$default$6](#apply$default$6())()` |  |
	| `<T> [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor")` | `[apply$default$7](#apply$default$7())()` |  |
	| `<T> [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern")` | `[apply$default$8](#apply$default$8())()` |  |
	| `<T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>` | `[apply$default$9](#apply$default$9())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple9<[Props](../actor/Props.html "class in akka.actor"),​java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>,​[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor"),​[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern"),​scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>>>` | `[unapply](#unapply(akka.pattern.BackoffOnStopOptionsImpl))​([BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BackoffOnStopOptionsImpl$](BackoffOnStopOptionsImpl$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BackoffOnStopOptionsImpl$
		
		
		
		```
		public BackoffOnStopOptionsImpl$()
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
		- #### $lessinit$greater$default$9
		
		
		
		```
		public <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> $lessinit$greater$default$9()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> [BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> apply​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                             java.lang.String childName,
		                                             scala.concurrent.duration.FiniteDuration minBackoff,
		                                             scala.concurrent.duration.FiniteDuration maxBackoff,
		                                             double randomFactor,
		                                             scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")> reset,
		                                             [OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy,
		                                             [HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern") handlingWhileStopped,
		                                             scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> finalStopMessage)
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
		- #### apply$default$9
		
		
		
		```
		public <T> scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>> apply$default$9()
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple9<[Props](../actor/Props.html "class in akka.actor"),​java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.Option<[BackoffReset](BackoffReset.html "interface in akka.pattern")>,​[OneForOneStrategy](../actor/OneForOneStrategy.html "class in akka.actor"),​[HandlingWhileStopped](HandlingWhileStopped.html "interface in akka.pattern"),​scala.Option<scala.Function1<java.lang.Object,​java.lang.Object>>>> unapply​([BackoffOnStopOptionsImpl](BackoffOnStopOptionsImpl.html "class in akka.pattern")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffReset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/HandlingWhileStopped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptionsImpl$.html)*