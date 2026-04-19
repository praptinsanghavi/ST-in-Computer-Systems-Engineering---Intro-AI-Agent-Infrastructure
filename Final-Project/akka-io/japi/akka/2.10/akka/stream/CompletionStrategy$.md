---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy$.html
title: CompletionStrategy$
---

# CompletionStrategy$

## Content

Package [akka.stream](package-summary.html)
## Class CompletionStrategy$

- java.lang.Object
- - akka.stream.CompletionStrategy$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class CompletionStrategy$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.CompletionStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompletionStrategy$](CompletionStrategy$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompletionStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[CompletionStrategy](CompletionStrategy.html "interface in akka.stream")` | `[draining](#draining())()` | Already buffered elements will be signaled before signaling completion. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[CompletionStrategy](CompletionStrategy.html "interface in akka.stream")` | `[immediately](#immediately())()` | The completion will be signaled immediately even if elements are still buffered. |
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

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompletionStrategy$](CompletionStrategy$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CompletionStrategy$
		
		
		
		```
		public CompletionStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### immediately
		
		
		
		```
		public [CompletionStrategy](CompletionStrategy.html "interface in akka.stream") immediately()
		```
		
		The completion will be signaled immediately even if elements are still buffered.
		- #### draining
		
		
		
		```
		public [CompletionStrategy](CompletionStrategy.html "interface in akka.stream") draining()
		```
		
		Already buffered elements will be signaled before signaling completion.
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

- https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy$.html)*