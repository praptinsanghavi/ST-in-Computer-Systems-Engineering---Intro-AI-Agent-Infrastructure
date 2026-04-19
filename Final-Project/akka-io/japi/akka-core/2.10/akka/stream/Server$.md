---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/Server$.html
title: Server$
---

# Server$

## Content

Package [akka.stream](package-summary.html)
## Class Server$

- java.lang.Object
- - [akka.stream.TLSRole](TLSRole.html "class in akka.stream")
	- - [akka.stream.Server](Server.html "class in akka.stream")
		- - akka.stream.Server$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Server$
extends [Server](Server.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.Server$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Server$](Server$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Server$](#%3Cinit%3E())()` |  |

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
	
	
		- ### Methods inherited from class akka.stream.[Server](Server.html "class in akka.stream")
		
		
		`[equals](Server.html#equals(java.lang.Object)), [productElementName](Server.html#productElementName(int)), [productElementNames](Server.html#productElementNames())`
		- ### Methods inherited from class akka.stream.[TLSRole](TLSRole.html "class in akka.stream")
		
		
		`[client](TLSRole.html#client()), [server](TLSRole.html#server())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Server$](Server$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Server$
		
		
		
		```
		public Server$()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](Server.html#productPrefix())` in class `[Server](Server.html "class in akka.stream")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](Server.html#productArity())` in class `[Server](Server.html "class in akka.stream")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](Server.html#productElement(int))` in class `[Server](Server.html "class in akka.stream")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](Server.html#productIterator())` in class `[Server](Server.html "class in akka.stream")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](Server.html#canEqual(java.lang.Object))` in class `[Server](Server.html "class in akka.stream")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](Server.html#hashCode())` in class `[Server](Server.html "class in akka.stream")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](Server.html#toString())` in class `[Server](Server.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Server$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Server.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/TLSRole.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/Server$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Server$.html)*