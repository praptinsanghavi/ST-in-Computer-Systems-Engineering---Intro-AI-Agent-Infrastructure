---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/NoMessage$.html
title: NoMessage$
---

# NoMessage$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class NoMessage$

- java.lang.Object
- - akka.dispatch.sysmsg.NoMessage$

- All Implemented Interfaces:
`[PossiblyHarmful](../../actor/PossiblyHarmful.html "interface in akka.actor")`, `[SystemMessage](SystemMessage.html "interface in akka.dispatch.sysmsg")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class NoMessage$
extends java.lang.Object
implements [SystemMessage](SystemMessage.html "interface in akka.dispatch.sysmsg"), scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.NoMessage$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoMessage$](NoMessage$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.dispatch.sysmsg.[SystemMessage](SystemMessage.html "interface in akka.dispatch.sysmsg")
		
		
		`[unlink](SystemMessage.html#unlink()), [unlinked](SystemMessage.html#unlinked())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoMessage$](NoMessage$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoMessage$
		
		
		
		```
		public NoMessage$()
		```

	- ### Method Detail
	
	
	
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

- https://doc.akka.io/japi/akka/current/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/NoMessage$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/NoMessage$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/NoMessage$.html)*