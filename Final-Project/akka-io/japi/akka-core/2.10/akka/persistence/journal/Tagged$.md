---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged$.html
title: Tagged$
---

# Tagged$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class Tagged$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​scala.collection.immutable.Set\<java.lang.String\>,​[Tagged](Tagged.html "class in akka.persistence.journal")\>
	- - akka.persistence.journal.Tagged$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​[Tagged](Tagged.html "class in akka.persistence.journal")>`

---

```
public class Tagged$
extends scala.runtime.AbstractFunction2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​[Tagged](Tagged.html "class in akka.persistence.journal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.Tagged$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tagged$](Tagged$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tagged$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Tagged](Tagged.html "class in akka.persistence.journal")` | `[apply](#apply(java.lang.Object,scala.collection.immutable.Set))​(java.lang.Object payload,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.persistence.journal.Tagged))​([Tagged](Tagged.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tagged$](Tagged$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tagged$
		
		
		
		```
		public Tagged$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​[Tagged](Tagged.html "class in akka.persistence.journal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​[Tagged](Tagged.html "class in akka.persistence.journal")>`
		- #### apply
		
		
		
		```
		public [Tagged](Tagged.html "class in akka.persistence.journal") apply​(java.lang.Object payload,
		                    scala.collection.immutable.Set<java.lang.String> tags)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>,​[Tagged](Tagged.html "class in akka.persistence.journal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([Tagged](Tagged.html "class in akka.persistence.journal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged$.html)*