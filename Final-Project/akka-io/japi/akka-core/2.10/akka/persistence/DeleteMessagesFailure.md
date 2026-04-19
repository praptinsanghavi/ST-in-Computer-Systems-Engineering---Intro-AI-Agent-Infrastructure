---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
title: DeleteMessagesFailure
---

# DeleteMessagesFailure

## Content

Package [akka.persistence](package-summary.html)
## Class DeleteMessagesFailure

- java.lang.Object
- - akka.persistence.DeleteMessagesFailure

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[JournalProtocol.Message](JournalProtocol.Message.html "interface in akka.persistence")`, `[JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence")`, `[Protocol.Message](Protocol.Message.html "interface in akka.persistence")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteMessagesFailure
extends java.lang.Object
implements [JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence"), scala.Product, java.io.Serializable
```

Reply message to a failed [`JournalProtocol.DeleteMessagesTo`](JournalProtocol.DeleteMessagesTo.html "class in akka.persistence") request.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.DeleteMessagesFailure)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteMessagesFailure](#%3Cinit%3E(java.lang.Throwable,long))​(java.lang.Throwable cause,  long toSequenceNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence")` | `[apply](#apply(java.lang.Throwable,long))​(java.lang.Throwable cause,  long toSequenceNr)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[cause](#cause())()` |  |
	| `[DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence")` | `[copy](#copy(java.lang.Throwable,long))​(java.lang.Throwable cause,  long toSequenceNr)` |  |
	| `java.lang.Throwable` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[toSequenceNr](#toSequenceNr())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Throwable,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.DeleteMessagesFailure))​([DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteMessagesFailure
		
		
		
		```
		public DeleteMessagesFailure​(java.lang.Throwable cause,
		                             long toSequenceNr)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence") apply​(java.lang.Throwable cause,
		                                          long toSequenceNr)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Throwable,​java.lang.Object>> unapply​([DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence") x$0)
		```
		- #### cause
		
		
		
		```
		public java.lang.Throwable cause()
		```
		- #### toSequenceNr
		
		
		
		```
		public long toSequenceNr()
		```
		- #### copy
		
		
		
		```
		public [DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence") copy​(java.lang.Throwable cause,
		                                  long toSequenceNr)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Throwable copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.DeleteMessagesTo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Protocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html)*