---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/internal/NativeImageUtils.ReflectMethod.html
title: NativeImageUtils.ReflectMethod
---

# NativeImageUtils.ReflectMethod

## Content

Package [akka.testkit.internal](package-summary.html)
## Class NativeImageUtils.ReflectMethod

- java.lang.Object
- - akka.testkit.internal.NativeImageUtils.ReflectMethod

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[NativeImageUtils](NativeImageUtils.html "class in akka.testkit.internal")

---

```
public static final class NativeImageUtils.ReflectMethod
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.testkit.internal.NativeImageUtils.ReflectMethod)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReflectMethod](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String name,  scala.collection.immutable.Seq<java.lang.String> parameterTypes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")` | `[copy](#copy(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String name,  scala.collection.immutable.Seq<java.lang.String> parameterTypes)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[parameterTypes](#parameterTypes())()` |  |
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
	
	
	
		- #### ReflectMethod
		
		
		
		```
		public ReflectMethod​(java.lang.String name,
		                     scala.collection.immutable.Seq<java.lang.String> parameterTypes)
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### parameterTypes
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> parameterTypes()
		```
		- #### copy
		
		
		
		```
		public [NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal") copy​(java.lang.String name,
		                                           scala.collection.immutable.Seq<java.lang.String> parameterTypes)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/testkit/internal/NativeImageUtils.ReflectMethod.html
- https://doc.akka.io/japi/akka/current/akka/testkit/internal/NativeImageUtils.html
- https://doc.akka.io/japi/akka/current/akka/testkit/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/internal/NativeImageUtils.ReflectMethod.html](https://doc.akka.io/japi/akka/current/akka/testkit/internal/NativeImageUtils.ReflectMethod.html)*