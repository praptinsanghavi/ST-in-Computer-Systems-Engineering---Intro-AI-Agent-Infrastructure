---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerMessages.Timer$.html
title: TimerMessages.Timer$
---

# TimerMessages.Timer$

## Content

Package [akka.stream.stage](package-summary.html)
## Class TimerMessages.Timer$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor"),​[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")\>
	- - akka.stream.stage.TimerMessages.Timer$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor"),​[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")>`

Enclosing class:
[TimerMessages](TimerMessages.html "class in akka.stream.stage")

---

```
public static class TimerMessages.Timer$
extends scala.runtime.AbstractFunction2<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor"),​[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.stage.TimerMessages.Timer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TimerMessages.Timer$](TimerMessages.Timer$.html "class in akka.stream.stage")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Timer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")` | `[apply](#apply(int,akka.actor.Cancellable))​(int id,  [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>>` | `[unapply](#unapply(akka.stream.stage.TimerMessages.Timer))​([TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TimerMessages.Timer$](TimerMessages.Timer$.html "class in akka.stream.stage") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Timer$
		
		
		
		```
		public Timer$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor"),​[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor"),​[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")>`
		- #### apply
		
		
		
		```
		public [TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage") apply​(int id,
		                                 [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>> unapply​([TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerMessages.Timer$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerMessages.Timer.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerMessages.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerMessages.Timer$.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerMessages.Timer$.html)*