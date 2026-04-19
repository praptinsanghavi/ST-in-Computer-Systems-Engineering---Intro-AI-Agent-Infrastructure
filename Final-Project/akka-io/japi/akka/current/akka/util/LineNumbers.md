---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/LineNumbers.UnknownSourceFormat.html
title: LineNumbers.UnknownSourceFormat
---

# LineNumbers.UnknownSourceFormat

## Content

Package [akka.util](package-summary.html)
## Class LineNumbers.UnknownSourceFormat

- java.lang.Object
- - akka.util.LineNumbers.UnknownSourceFormat

- All Implemented Interfaces:
`[LineNumbers.Result](LineNumbers.Result.html "interface in akka.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[LineNumbers](LineNumbers.html "class in akka.util")

---

```
public static final class LineNumbers.UnknownSourceFormat
extends java.lang.Object
implements [LineNumbers.Result](LineNumbers.Result.html "interface in akka.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.LineNumbers.UnknownSourceFormat)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnknownSourceFormat](#%3Cinit%3E(java.lang.String))​(java.lang.String explanation)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[LineNumbers.UnknownSourceFormat](LineNumbers.UnknownSourceFormat.html "class in akka.util")` | `[copy](#copy(java.lang.String))​(java.lang.String explanation)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.String` | `[explanation](#explanation())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### UnknownSourceFormat
		
		
		
		```
		public UnknownSourceFormat​(java.lang.String explanation)
		```

	- ### Method Detail
	
	
	
		- #### explanation
		
		
		
		```
		public java.lang.String explanation()
		```
		- #### copy
		
		
		
		```
		public [LineNumbers.UnknownSourceFormat](LineNumbers.UnknownSourceFormat.html "class in akka.util") copy​(java.lang.String explanation)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
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
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/LineNumbers.Result.html
- https://doc.akka.io/japi/akka/current/akka/util/LineNumbers.UnknownSourceFormat.html
- https://doc.akka.io/japi/akka/current/akka/util/LineNumbers.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/LineNumbers.UnknownSourceFormat.html](https://doc.akka.io/japi/akka/current/akka/util/LineNumbers.UnknownSourceFormat.html)*