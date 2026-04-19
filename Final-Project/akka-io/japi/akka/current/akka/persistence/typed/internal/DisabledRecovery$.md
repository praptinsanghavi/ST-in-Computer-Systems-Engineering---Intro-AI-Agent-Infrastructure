---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRecovery$.html
title: DisabledRecovery$
---

# DisabledRecovery$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class DisabledRecovery$

- java.lang.Object
- - [akka.persistence.typed.javadsl.Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")
	- - akka.persistence.typed.internal.DisabledRecovery$

- All Implemented Interfaces:
`[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DisabledRecovery$
extends [Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")
implements [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl"), scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.DisabledRecovery$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DisabledRecovery$](DisabledRecovery$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DisabledRecovery$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")` | `[asJava](#asJava())()` |  |
	| `[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[asScala](#asScala())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")
		
		
		`[disabled](../javadsl/Recovery.html#disabled()), [enabled](../javadsl/Recovery.html#enabled()), [replayOnlyLast](../javadsl/Recovery.html#replayOnlyLast()), [withSnapshotSelectionCriteria](../javadsl/Recovery.html#withSnapshotSelectionCriteria(akka.persistence.typed.SnapshotSelectionCriteria))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DisabledRecovery$](DisabledRecovery$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DisabledRecovery$
		
		
		
		```
		public DisabledRecovery$()
		```

	- ### Method Detail
	
	
	
		- #### asScala
		
		
		
		```
		public [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") asScala()
		```
		
		
		Specified by:
		`[asScala](../javadsl/Recovery.html#asScala())` in class `[Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl")`
		- #### asJava
		
		
		
		```
		public [Recovery](../javadsl/Recovery.html "class in akka.persistence.typed.javadsl") asJava()
		```
		
		
		Specified by:
		`[asJava](../scaladsl/Recovery.html#asJava())` in interface `[Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRecovery$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRecovery$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRecovery$.html)*