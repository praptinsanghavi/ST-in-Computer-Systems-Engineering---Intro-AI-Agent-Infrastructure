---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart$.html
title: PreRestart$
---

# PreRestart$

## Content

Package [akka.actor.typed](package-summary.html)
## Class PreRestart$

- java.lang.Object
- - [akka.actor.typed.PreRestart](PreRestart.html "class in akka.actor.typed")
	- - akka.actor.typed.PreRestart$

- All Implemented Interfaces:
`[Signal](Signal.html "interface in akka.actor.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class PreRestart$
extends [PreRestart](PreRestart.html "class in akka.actor.typed")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.PreRestart$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PreRestart$](PreRestart$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PreRestart$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[PreRestart](PreRestart.html "class in akka.actor.typed")` | `[instance](#instance())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[PreRestart](PreRestart.html "class in akka.actor.typed")
		
		
		`[equals](PreRestart.html#equals(java.lang.Object)), [productElementName](PreRestart.html#productElementName(int)), [productElementNames](PreRestart.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PreRestart$](PreRestart$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PreRestart$
		
		
		
		```
		public PreRestart$()
		```

	- ### Method Detail
	
	
	
		- #### instance
		
		
		
		```
		public [PreRestart](PreRestart.html "class in akka.actor.typed") instance()
		```
		
		
		Overrides:
		`[instance](PreRestart.html#instance())` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](PreRestart.html#productPrefix())` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](PreRestart.html#productArity())` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](PreRestart.html#productElement(int))` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](PreRestart.html#productIterator())` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](PreRestart.html#canEqual(java.lang.Object))` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](PreRestart.html#hashCode())` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](PreRestart.html#toString())` in class `[PreRestart](PreRestart.html "class in akka.actor.typed")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart$.html)*