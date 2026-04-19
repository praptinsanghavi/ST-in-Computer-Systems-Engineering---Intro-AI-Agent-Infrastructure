---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRetentionCriteria$.html
title: DisabledRetentionCriteria$
---

# DisabledRetentionCriteria$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class DisabledRetentionCriteria$

- java.lang.Object
- - [akka.persistence.typed.javadsl.RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl")
	- - akka.persistence.typed.internal.DisabledRetentionCriteria$

- All Implemented Interfaces:
`[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DisabledRetentionCriteria$
extends [RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl")
implements [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl"), scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.DisabledRetentionCriteria$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DisabledRetentionCriteria$](DisabledRetentionCriteria$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DisabledRetentionCriteria$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[asJava](#asJava())()` |  |
	| `[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")` | `[asScala](#asScala())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl")
		
		
		`[disabled](../javadsl/RetentionCriteria.html#disabled()), [snapshotEvery](../javadsl/RetentionCriteria.html#snapshotEvery(int)), [snapshotEvery](../javadsl/RetentionCriteria.html#snapshotEvery(int,int))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DisabledRetentionCriteria$](DisabledRetentionCriteria$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DisabledRetentionCriteria$
		
		
		
		```
		public DisabledRetentionCriteria$()
		```

	- ### Method Detail
	
	
	
		- #### asScala
		
		
		
		```
		public [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") asScala()
		```
		
		
		Specified by:
		`[asScala](../javadsl/RetentionCriteria.html#asScala())` in class `[RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl")`
		- #### asJava
		
		
		
		```
		public [RetentionCriteria](../javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl") asJava()
		```
		
		
		Specified by:
		`[asJava](../scaladsl/RetentionCriteria.html#asJava())` in interface `[RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")`
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

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRetentionCriteria$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRetentionCriteria$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/DisabledRetentionCriteria$.html)*