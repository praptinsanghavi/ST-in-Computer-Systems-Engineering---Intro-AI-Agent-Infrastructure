---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/EventWriter.WriteAck$.html
title: EventWriter.WriteAck$
---

# EventWriter.WriteAck$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventWriter.WriteAck$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")\>
	- - akka.persistence.typed.internal.EventWriter.WriteAck$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​java.lang.Object,​[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")>`

Enclosing class:
[EventWriter](EventWriter.html "class in akka.persistence.typed.internal")

---

```
public static class EventWriter.WriteAck$
extends scala.runtime.AbstractFunction2<java.lang.String,​java.lang.Object,​[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.EventWriter.WriteAck$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventWriter.WriteAck$](EventWriter.WriteAck$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteAck$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")` | `[apply](#apply(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNumber)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.internal.EventWriter.WriteAck))​([EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventWriter.WriteAck$](EventWriter.WriteAck$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WriteAck$
		
		
		
		```
		public WriteAck$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​java.lang.Object,​[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​java.lang.Object,​[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")>`
		- #### apply
		
		
		
		```
		public [EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal") apply​(java.lang.String persistenceId,
		                                  long sequenceNumber)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>> unapply​([EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/EventWriter.WriteAck$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/EventWriter.WriteAck.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/EventWriter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/EventWriter.WriteAck$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/EventWriter.WriteAck$.html)*