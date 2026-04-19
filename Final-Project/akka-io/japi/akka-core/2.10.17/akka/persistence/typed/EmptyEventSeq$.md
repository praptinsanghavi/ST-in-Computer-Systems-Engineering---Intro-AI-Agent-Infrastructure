---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EmptyEventSeq$.html
title: EmptyEventSeq$
---

# EmptyEventSeq$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class EmptyEventSeq$

- java.lang.Object
- - akka.persistence.typed.EmptyEventSeq$

- All Implemented Interfaces:
`[EventSeq](EventSeq.html "interface in akka.persistence.typed")<scala.runtime.Nothing$>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class EmptyEventSeq$
extends java.lang.Object
implements [EventSeq](EventSeq.html "interface in akka.persistence.typed")<scala.runtime.Nothing$>, scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.EmptyEventSeq$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyEventSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Seq<scala.runtime.Nothing$>` | `[events](#events())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `int` | `[size](#size())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface akka.persistence.typed.[EventSeq](EventSeq.html "interface in akka.persistence.typed")
		
		
		`[isEmpty](EventSeq.html#isEmpty()), [nonEmpty](EventSeq.html#nonEmpty())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EmptyEventSeq$
		
		
		
		```
		public EmptyEventSeq$()
		```

	- ### Method Detail
	
	
	
		- #### events
		
		
		
		```
		public scala.collection.immutable.Seq<scala.runtime.Nothing$> events()
		```
		
		
		Specified by:
		`[events](EventSeq.html#events())` in interface `[EventSeq](EventSeq.html "interface in akka.persistence.typed")<scala.runtime.Nothing$>`
		- #### size
		
		
		
		```
		public int size()
		```
		
		
		Specified by:
		`[size](EventSeq.html#size())` in interface `[EventSeq](EventSeq.html "interface in akka.persistence.typed")<scala.runtime.Nothing$>`
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EmptyEventSeq$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EmptyEventSeq$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EmptyEventSeq$.html)*