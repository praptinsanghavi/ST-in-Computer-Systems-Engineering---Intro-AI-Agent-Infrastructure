---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/AllForOneStrategy$.html
title: AllForOneStrategy$
---

# AllForOneStrategy$

## Content

Package [akka.actor](package-summary.html)
## Class AllForOneStrategy$

- java.lang.Object
- - akka.actor.AllForOneStrategy$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class AllForOneStrategy$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.AllForOneStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AllForOneStrategy$](AllForOneStrategy$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AllForOneStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `scala.concurrent.duration.Duration` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `boolean` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[AllForOneStrategy](AllForOneStrategy.html "class in akka.actor")` | `[apply](#apply(int,scala.concurrent.duration.Duration,boolean,scala.PartialFunction))​(int maxNrOfRetries,  scala.concurrent.duration.Duration withinTimeRange,  boolean loggingEnabled,  scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)` |  |
	| `int` | `[apply$default$1](#apply$default$1())()` |  |
	| `scala.concurrent.duration.Duration` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.AllForOneStrategy))​([AllForOneStrategy](AllForOneStrategy.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AllForOneStrategy$](AllForOneStrategy$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AllForOneStrategy$
		
		
		
		```
		public AllForOneStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public int $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.concurrent.duration.Duration $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public boolean $lessinit$greater$default$3()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public [AllForOneStrategy](AllForOneStrategy.html "class in akka.actor") apply​(int maxNrOfRetries,
		                               scala.concurrent.duration.Duration withinTimeRange,
		                               boolean loggingEnabled,
		                               scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> decider)
		```
		- #### apply$default$1
		
		
		
		```
		public int apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public scala.concurrent.duration.Duration apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public boolean apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object>> unapply​([AllForOneStrategy](AllForOneStrategy.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AllForOneStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/AllForOneStrategy$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AllForOneStrategy$.html)*