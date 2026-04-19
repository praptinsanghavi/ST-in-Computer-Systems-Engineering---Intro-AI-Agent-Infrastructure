---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.WriteMessageSuccess.html
title: JournalProtocol.WriteMessageSuccess
---

# JournalProtocol.WriteMessageSuccess

## Content

Package [akka.persistence](package-summary.html)
## Class JournalProtocol.WriteMessageSuccess

- java.lang.Object
- - akka.persistence.JournalProtocol.WriteMessageSuccess

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[JournalProtocol.Message](JournalProtocol.Message.html "interface in akka.persistence")`, `[JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence")`, `[Protocol.Message](Protocol.Message.html "interface in akka.persistence")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[JournalProtocol](JournalProtocol.html "class in akka.persistence")

---

```
public static final class JournalProtocol.WriteMessageSuccess
extends java.lang.Object
implements [JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence"), scala.Product, java.io.Serializable
```

Reply message to a successful [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. For each contained [`PersistentRepr`](PersistentRepr.html "interface in akka.persistence") message
 in the request, a separate reply is sent to the requestor.
 
 param: persistent successfully written message.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.JournalProtocol.WriteMessageSuccess)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteMessageSuccess](#%3Cinit%3E(akka.persistence.PersistentRepr,int))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent,  int actorInstanceId)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[actorInstanceId](#actorInstanceId())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[JournalProtocol.WriteMessageSuccess](JournalProtocol.WriteMessageSuccess.html "class in akka.persistence")` | `[copy](#copy(akka.persistence.PersistentRepr,int))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent,  int actorInstanceId)` |  |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[persistent](#persistent())()` |  |
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
	
	
	
		- #### WriteMessageSuccess
		
		
		
		```
		public WriteMessageSuccess​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent,
		                           int actorInstanceId)
		```

	- ### Method Detail
	
	
	
		- #### persistent
		
		
		
		```
		public [PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent()
		```
		- #### actorInstanceId
		
		
		
		```
		public int actorInstanceId()
		```
		- #### copy
		
		
		
		```
		public [JournalProtocol.WriteMessageSuccess](JournalProtocol.WriteMessageSuccess.html "class in akka.persistence") copy​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent,
		                                                int actorInstanceId)
		```
		- #### copy$default$1
		
		
		
		```
		public [PersistentRepr](PersistentRepr.html "interface in akka.persistence") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.Message.html
- https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.Response.html
- https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.WriteMessageSuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.WriteMessages.html
- https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Protocol.Message.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.WriteMessageSuccess.html](https://doc.akka.io/japi/akka/current/akka/persistence/JournalProtocol.WriteMessageSuccess.html)*