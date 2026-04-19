---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/SerializationCheckFailedException.html
title: SerializationCheckFailedException
---

# SerializationCheckFailedException

## Content

Package [akka.actor.dungeon](package-summary.html)
## Class SerializationCheckFailedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../../AkkaException.html "class in akka")
				- - akka.actor.dungeon.SerializationCheckFailedException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SerializationCheckFailedException
extends [AkkaException](../../AkkaException.html "class in akka")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.dungeon.SerializationCheckFailedException)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")` | `[apply](#apply(java.lang.Object,java.lang.Throwable))​(java.lang.Object msg,  java.lang.Throwable cause)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[cause](#cause())()` |  |
	| `[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")` | `[copy](#copy(java.lang.Object,java.lang.Throwable))​(java.lang.Object msg,  java.lang.Throwable cause)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Throwable` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.dungeon.SerializationCheckFailedException))​([SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") apply​(java.lang.Object msg,
		                                                      java.lang.Throwable cause)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Throwable>> unapply​([SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") x$0)
		```
		- #### msg
		
		
		
		```
		public java.lang.Object msg()
		```
		- #### cause
		
		
		
		```
		public java.lang.Throwable cause()
		```
		- #### copy
		
		
		
		```
		public [SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") copy​(java.lang.Object msg,
		                                              java.lang.Throwable cause)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Throwable copy$default$2()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/SerializationCheckFailedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/SerializationCheckFailedException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/SerializationCheckFailedException.html)*