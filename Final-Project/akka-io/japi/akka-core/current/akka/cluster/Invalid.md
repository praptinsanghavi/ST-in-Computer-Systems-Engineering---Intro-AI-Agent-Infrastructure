---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:52:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/Invalid.html
title: Invalid
---

# Invalid

## Content

Package [akka.cluster](package-summary.html)
## Class Invalid

- java.lang.Object
- - akka.cluster.Invalid

- All Implemented Interfaces:
`[ConfigValidation](ConfigValidation.html "interface in akka.cluster")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Invalid
extends java.lang.Object
implements [ConfigValidation](ConfigValidation.html "interface in akka.cluster"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.Invalid)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Invalid](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> errorMessages)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Invalid](Invalid.html "class in akka.cluster")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> errorMessages)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Invalid](Invalid.html "class in akka.cluster")` | `[copy](#copy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> errorMessages)` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[errorMessages](#errorMessages())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Seq<java.lang.String>>` | `[unapply](#unapply(akka.cluster.Invalid))​([Invalid](Invalid.html "class in akka.cluster") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.[ConfigValidation](ConfigValidation.html "interface in akka.cluster")
		
		
		`[$plus$plus](ConfigValidation.html#$plus$plus(akka.cluster.ConfigValidation)), [concat](ConfigValidation.html#concat(akka.cluster.ConfigValidation))`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Invalid
		
		
		
		```
		public Invalid​(scala.collection.immutable.Seq<java.lang.String> errorMessages)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Invalid](Invalid.html "class in akka.cluster") apply​(scala.collection.immutable.Seq<java.lang.String> errorMessages)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Seq<java.lang.String>> unapply​([Invalid](Invalid.html "class in akka.cluster") x$0)
		```
		- #### errorMessages
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> errorMessages()
		```
		- #### copy
		
		
		
		```
		public [Invalid](Invalid.html "class in akka.cluster") copy​(scala.collection.immutable.Seq<java.lang.String> errorMessages)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/current/akka/cluster/ConfigValidation.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Invalid.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/Invalid.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/Invalid.html)*