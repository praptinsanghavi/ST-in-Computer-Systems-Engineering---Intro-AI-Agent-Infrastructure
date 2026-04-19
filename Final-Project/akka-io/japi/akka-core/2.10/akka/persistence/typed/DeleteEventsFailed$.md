---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteEventsFailed$.html
title: DeleteEventsFailed$
---

# DeleteEventsFailed$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class DeleteEventsFailed$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Throwable,​[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")\>
	- - akka.persistence.typed.DeleteEventsFailed$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​java.lang.Throwable,​[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")>`

---

```
public class DeleteEventsFailed$
extends scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Throwable,​[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.DeleteEventsFailed$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeleteEventsFailed$](DeleteEventsFailed$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteEventsFailed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")` | `[apply](#apply(long,java.lang.Throwable))​(long toSequenceNr,  java.lang.Throwable failure)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Throwable>>` | `[unapply](#unapply(akka.persistence.typed.DeleteEventsFailed))​([DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeleteEventsFailed$](DeleteEventsFailed$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeleteEventsFailed$
		
		
		
		```
		public DeleteEventsFailed$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​java.lang.Throwable,​[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Throwable,​[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")>`
		- #### apply
		
		
		
		```
		public [DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed") apply​(long toSequenceNr,
		                                java.lang.Throwable failure)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Throwable>> unapply​([DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteEventsFailed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteEventsFailed$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteEventsFailed$.html)*