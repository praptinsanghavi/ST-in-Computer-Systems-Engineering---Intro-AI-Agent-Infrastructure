---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/GetRoutees$.html
title: GetRoutees$
---

# GetRoutees$

## Content

Package [akka.routing](package-summary.html)
## Class GetRoutees$

- java.lang.Object
- - [akka.routing.GetRoutees](GetRoutees.html "class in akka.routing")
	- - akka.routing.GetRoutees$

- All Implemented Interfaces:
`[RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class GetRoutees$
extends [GetRoutees](GetRoutees.html "class in akka.routing")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.GetRoutees$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GetRoutees$](GetRoutees$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetRoutees$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[GetRoutees$](GetRoutees$.html "class in akka.routing")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.routing.[GetRoutees](GetRoutees.html "class in akka.routing")
		
		
		`[equals](GetRoutees.html#equals(java.lang.Object)), [productElementName](GetRoutees.html#productElementName(int)), [productElementNames](GetRoutees.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GetRoutees$](GetRoutees$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetRoutees$
		
		
		
		```
		public GetRoutees$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [GetRoutees$](GetRoutees$.html "class in akka.routing") getInstance()
		```
		
		Java API: get the singleton instance
		
		Overrides:
		`[getInstance](GetRoutees.html#getInstance())` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](GetRoutees.html#productPrefix())` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](GetRoutees.html#productArity())` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](GetRoutees.html#productElement(int))` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](GetRoutees.html#productIterator())` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](GetRoutees.html#canEqual(java.lang.Object))` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](GetRoutees.html#hashCode())` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](GetRoutees.html#toString())` in class `[GetRoutees](GetRoutees.html "class in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/routing/GetRoutees$.html
- https://doc.akka.io/japi/akka/current/akka/routing/GetRoutees.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterManagementMesssage.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/GetRoutees$.html](https://doc.akka.io/japi/akka/current/akka/routing/GetRoutees$.html)*