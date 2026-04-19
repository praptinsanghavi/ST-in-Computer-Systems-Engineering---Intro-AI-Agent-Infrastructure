---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/scaladsl/GetObjectResult.html
title: GetObjectResult
---

# GetObjectResult

## Content

Package [akka.persistence.state.scaladsl](package-summary.html)
## Class GetObjectResult\<A\>

- java.lang.Object
- - akka.persistence.state.scaladsl.GetObjectResult\<A\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class GetObjectResult<A>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.state.scaladsl.GetObjectResult)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetObjectResult](#%3Cinit%3E(scala.Option,long))​(scala.Option<[A](GetObjectResult.html "type parameter in GetObjectResult")> value,  long revision)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<A>` | `[apply](#apply(scala.Option,long))​(scala.Option<A> value,  long revision)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A> [GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<A>` | `[copy](#copy(scala.Option,long))​(scala.Option<A> value,  long revision)` |  |
	| `<A> scala.Option<A>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<A> long` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[revision](#revision())()` |  |
	| `[GetObjectResult](../javadsl/GetObjectResult.html "class in akka.persistence.state.javadsl")<[A](GetObjectResult.html "type parameter in GetObjectResult")>` | `[toJava](#toJava())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A> scala.Option<scala.Tuple2<scala.Option<A>,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.state.scaladsl.GetObjectResult))​([GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<A> x$0)` |  |
	| `scala.Option<[A](GetObjectResult.html "type parameter in GetObjectResult")>` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### GetObjectResult
		
		
		
		```
		public GetObjectResult​(scala.Option<[A](GetObjectResult.html "type parameter in GetObjectResult")> value,
		                       long revision)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A> [GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<A> apply​(scala.Option<A> value,
		                                           long revision)
		```
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<scala.Tuple2<scala.Option<A>,​java.lang.Object>> unapply​([GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<A> x$0)
		```
		- #### value
		
		
		
		```
		public scala.Option<[A](GetObjectResult.html "type parameter in GetObjectResult")> value()
		```
		- #### revision
		
		
		
		```
		public long revision()
		```
		- #### toJava
		
		
		
		```
		public [GetObjectResult](../javadsl/GetObjectResult.html "class in akka.persistence.state.javadsl")<[A](GetObjectResult.html "type parameter in GetObjectResult")> toJava()
		```
		- #### copy
		
		
		
		```
		public <A> [GetObjectResult](GetObjectResult.html "class in akka.persistence.state.scaladsl")<A> copy​(scala.Option<A> value,
		                                   long revision)
		```
		- #### copy$default$1
		
		
		
		```
		public <A> scala.Option<A> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <A> long copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/GetObjectResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/scaladsl/GetObjectResult.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/scaladsl/GetObjectResult.html)*