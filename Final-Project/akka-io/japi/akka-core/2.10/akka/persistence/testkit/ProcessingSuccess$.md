---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess$.html
title: ProcessingSuccess$
---

# ProcessingSuccess$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ProcessingSuccess$

- java.lang.Object
- - [akka.persistence.testkit.ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")
	- - akka.persistence.testkit.ProcessingSuccess$

- All Implemented Interfaces:
`[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ProcessingSuccess$
extends [ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")
implements scala.Product, java.io.Serializable
```

Emulates successful processing of some operation.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ProcessingSuccess$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProcessingSuccess$](ProcessingSuccess$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProcessingSuccess$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.testkit.[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")
		
		
		`[equals](ProcessingSuccess.html#equals(java.lang.Object)), [productElementName](ProcessingSuccess.html#productElementName(int)), [productElementNames](ProcessingSuccess.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProcessingSuccess$](ProcessingSuccess$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ProcessingSuccess$
		
		
		
		```
		public ProcessingSuccess$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit") getInstance()
		```
		
		
		Overrides:
		`[getInstance](ProcessingSuccess.html#getInstance())` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](ProcessingSuccess.html#productPrefix())` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](ProcessingSuccess.html#productArity())` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](ProcessingSuccess.html#productElement(int))` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](ProcessingSuccess.html#productIterator())` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](ProcessingSuccess.html#canEqual(java.lang.Object))` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](ProcessingSuccess.html#hashCode())` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ProcessingSuccess.html#toString())` in class `[ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess$.html)*