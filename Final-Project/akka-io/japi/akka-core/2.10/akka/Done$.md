---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/Done$.html
title: Done$
---

# Done$

## Content

Package [akka](package-summary.html)
## Class Done$

- java.lang.Object
- - [akka.Done](Done.html "class in akka")
	- - akka.Done$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Done$
extends [Done](Done.html "class in akka")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../serialized-form.html#akka.Done$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Done$](Done$.html "class in akka")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Done$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Done](Done.html "class in akka")` | `[done](#done())()` | Java API: the singleton instance |
	| `[Done](Done.html "class in akka")` | `[getInstance](#getInstance())()` | Java API: the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.[Done](Done.html "class in akka")
		
		
		`[equals](Done.html#equals(java.lang.Object)), [productElementName](Done.html#productElementName(int)), [productElementNames](Done.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Done$](Done$.html "class in akka") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Done$
		
		
		
		```
		public Done$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [Done](Done.html "class in akka") getInstance()
		```
		
		Java API: the singleton instance
		
		Overrides:
		`[getInstance](Done.html#getInstance())` in class `[Done](Done.html "class in akka")`
		- #### done
		
		
		
		```
		public [Done](Done.html "class in akka") done()
		```
		
		Java API: the singleton instance
		 
		 This is equivalent to `Done.getInstance`, but can be used with static import.
		
		
		
		Overrides:
		`[done](Done.html#done())` in class `[Done](Done.html "class in akka")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](Done.html#productPrefix())` in class `[Done](Done.html "class in akka")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](Done.html#productArity())` in class `[Done](Done.html "class in akka")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](Done.html#productElement(int))` in class `[Done](Done.html "class in akka")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](Done.html#productIterator())` in class `[Done](Done.html "class in akka")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](Done.html#canEqual(java.lang.Object))` in class `[Done](Done.html "class in akka")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](Done.html#hashCode())` in class `[Done](Done.html "class in akka")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](Done.html#toString())` in class `[Done](Done.html "class in akka")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/Done$.html](https://doc.akka.io/japi/akka-core/2.10/akka/Done$.html)*