---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/NotUsed$.html
title: NotUsed$
---

# NotUsed$

## Content

Package [akka](package-summary.html)
## Class NotUsed$

- java.lang.Object
- - [akka.NotUsed](NotUsed.html "class in akka")
	- - akka.NotUsed$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class NotUsed$
extends [NotUsed](NotUsed.html "class in akka")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../serialized-form.html#akka.NotUsed$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NotUsed$](NotUsed$.html "class in akka")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NotUsed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[NotUsed](NotUsed.html "class in akka")` | `[getInstance](#getInstance())()` | Java API: the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[NotUsed](NotUsed.html "class in akka")` | `[notUsed](#notUsed())()` | Java API: the singleton instance |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.[NotUsed](NotUsed.html "class in akka")
		
		
		`[equals](NotUsed.html#equals(java.lang.Object)), [productElementName](NotUsed.html#productElementName(int)), [productElementNames](NotUsed.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NotUsed$](NotUsed$.html "class in akka") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NotUsed$
		
		
		
		```
		public NotUsed$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [NotUsed](NotUsed.html "class in akka") getInstance()
		```
		
		Java API: the singleton instance
		
		Overrides:
		`[getInstance](NotUsed.html#getInstance())` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### notUsed
		
		
		
		```
		public [NotUsed](NotUsed.html "class in akka") notUsed()
		```
		
		Java API: the singleton instance
		 
		 This is equivalent to `NotUsed.getInstance`, but can be used with static import.
		
		
		
		Overrides:
		`[notUsed](NotUsed.html#notUsed())` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](NotUsed.html#productPrefix())` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](NotUsed.html#productArity())` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](NotUsed.html#productElement(int))` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](NotUsed.html#productIterator())` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](NotUsed.html#canEqual(java.lang.Object))` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](NotUsed.html#hashCode())` in class `[NotUsed](NotUsed.html "class in akka")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](NotUsed.html#toString())` in class `[NotUsed](NotUsed.html "class in akka")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed$.html
- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/NotUsed$.html](https://doc.akka.io/japi/akka/2.10/akka/NotUsed$.html)*