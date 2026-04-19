---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/SaveSnapshotSuccess$.html
title: SaveSnapshotSuccess$
---

# SaveSnapshotSuccess$

## Content

Package [akka.persistence](package-summary.html)
## Class SaveSnapshotSuccess$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")\>
	- - akka.persistence.SaveSnapshotSuccess$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")>`

---

```
public class SaveSnapshotSuccess$
extends scala.runtime.AbstractFunction1<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SaveSnapshotSuccess$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SaveSnapshotSuccess$](SaveSnapshotSuccess$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SaveSnapshotSuccess$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")>` | `[unapply](#unapply(akka.persistence.SaveSnapshotSuccess))​([SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SaveSnapshotSuccess$](SaveSnapshotSuccess$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SaveSnapshotSuccess$
		
		
		
		```
		public SaveSnapshotSuccess$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")> unapply​([SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/SaveSnapshotSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/SaveSnapshotSuccess$.html](https://doc.akka.io/japi/akka/current/akka/persistence/SaveSnapshotSuccess$.html)*