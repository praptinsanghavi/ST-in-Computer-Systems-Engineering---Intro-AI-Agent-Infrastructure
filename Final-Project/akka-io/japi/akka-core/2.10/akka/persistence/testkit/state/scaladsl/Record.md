---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/Record.html
title: Record
---

# Record

## Content

Package [akka.persistence.testkit.state.scaladsl](package-summary.html)
## Class Record\<A\>

- java.lang.Object
- - akka.persistence.testkit.state.scaladsl.Record\<A\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Record<A>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.testkit.state.scaladsl.Record)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Record](#%3Cinit%3E(long,java.lang.String,long,scala.Option,java.lang.String,long))​(long globalOffset,  java.lang.String persistenceId,  long revision,  scala.Option<[A](Record.html "type parameter in Record")> value,  java.lang.String tag,  long timestamp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> long` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `static <A> [Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A>` | `[apply](#apply(long,java.lang.String,long,scala.Option,java.lang.String,long))​(long globalOffset,  java.lang.String persistenceId,  long revision,  scala.Option<A> value,  java.lang.String tag,  long timestamp)` |  |
	| `static <A> long` | `[apply$default$6](#apply$default$6())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A> [Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A>` | `[copy](#copy(long,java.lang.String,long,scala.Option,java.lang.String,long))​(long globalOffset,  java.lang.String persistenceId,  long revision,  scala.Option<A> value,  java.lang.String tag,  long timestamp)` |  |
	| `<A> long` | `[copy$default$1](#copy$default$1())()` |  |
	| `<A> java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `<A> long` | `[copy$default$3](#copy$default$3())()` |  |
	| `<A> scala.Option<A>` | `[copy$default$4](#copy$default$4())()` |  |
	| `<A> java.lang.String` | `[copy$default$5](#copy$default$5())()` |  |
	| `<A> long` | `[copy$default$6](#copy$default$6())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `long` | `[globalOffset](#globalOffset())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[revision](#revision())()` |  |
	| `java.lang.String` | `[tag](#tag())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](Record.html "type parameter in Record")>` | `[toDurableStateChange](#toDurableStateChange())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A> scala.Option<scala.Tuple6<java.lang.Object,​java.lang.String,​java.lang.Object,​scala.Option<A>,​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.state.scaladsl.Record))​([Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> x$0)` |  |
	| `scala.Option<[A](Record.html "type parameter in Record")>` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Record
		
		
		
		```
		public Record​(long globalOffset,
		              java.lang.String persistenceId,
		              long revision,
		              scala.Option<[A](Record.html "type parameter in Record")> value,
		              java.lang.String tag,
		              long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static <A> long $lessinit$greater$default$6()
		```
		- #### apply
		
		
		
		```
		public static <A> [Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> apply​(long globalOffset,
		                                  java.lang.String persistenceId,
		                                  long revision,
		                                  scala.Option<A> value,
		                                  java.lang.String tag,
		                                  long timestamp)
		```
		- #### apply$default$6
		
		
		
		```
		public static <A> long apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<scala.Tuple6<java.lang.Object,​java.lang.String,​java.lang.Object,​scala.Option<A>,​java.lang.String,​java.lang.Object>> unapply​([Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> x$0)
		```
		- #### globalOffset
		
		
		
		```
		public long globalOffset()
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### revision
		
		
		
		```
		public long revision()
		```
		- #### value
		
		
		
		```
		public scala.Option<[A](Record.html "type parameter in Record")> value()
		```
		- #### tag
		
		
		
		```
		public java.lang.String tag()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### toDurableStateChange
		
		
		
		```
		public [DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](Record.html "type parameter in Record")> toDurableStateChange()
		```
		- #### copy
		
		
		
		```
		public <A> [Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> copy​(long globalOffset,
		                          java.lang.String persistenceId,
		                          long revision,
		                          scala.Option<A> value,
		                          java.lang.String tag,
		                          long timestamp)
		```
		- #### copy$default$1
		
		
		
		```
		public <A> long copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <A> java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <A> long copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <A> scala.Option<A> copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public <A> java.lang.String copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public <A> long copy$default$6()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/Record.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/Record.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/Record.html)*