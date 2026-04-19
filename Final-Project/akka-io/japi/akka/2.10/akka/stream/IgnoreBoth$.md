---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:02:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreBoth$.html
title: IgnoreBoth$
---

# IgnoreBoth$

## Content

Package [akka.stream](package-summary.html)
## Class IgnoreBoth$

- java.lang.Object
- - [akka.stream.TLSClosing](TLSClosing.html "class in akka.stream")
	- - [akka.stream.IgnoreBoth](IgnoreBoth.html "class in akka.stream")
		- - akka.stream.IgnoreBoth$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class IgnoreBoth$
extends [IgnoreBoth](IgnoreBoth.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.IgnoreBoth$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IgnoreBoth$](IgnoreBoth$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IgnoreBoth$](#%3Cinit%3E())()` |  |

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
	
	
		- ### Methods inherited from class akka.stream.[IgnoreBoth](IgnoreBoth.html "class in akka.stream")
		
		
		`[equals](IgnoreBoth.html#equals(java.lang.Object)), [ignoreCancel](IgnoreBoth.html#ignoreCancel()), [ignoreComplete](IgnoreBoth.html#ignoreComplete()), [productElementName](IgnoreBoth.html#productElementName(int)), [productElementNames](IgnoreBoth.html#productElementNames())`
		- ### Methods inherited from class akka.stream.[TLSClosing](TLSClosing.html "class in akka.stream")
		
		
		`[eagerClose](TLSClosing.html#eagerClose()), [ignoreBoth](TLSClosing.html#ignoreBoth())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IgnoreBoth$](IgnoreBoth$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IgnoreBoth$
		
		
		
		```
		public IgnoreBoth$()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](IgnoreBoth.html#productPrefix())` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](IgnoreBoth.html#productArity())` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](IgnoreBoth.html#productElement(int))` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](IgnoreBoth.html#productIterator())` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](IgnoreBoth.html#canEqual(java.lang.Object))` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](IgnoreBoth.html#hashCode())` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](IgnoreBoth.html#toString())` in class `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreBoth$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreBoth.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/TLSClosing.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreBoth$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreBoth$.html)*