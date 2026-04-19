---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html
title: DeleteSnapshotSuccess
---

# DeleteSnapshotSuccess

## Content

Package [akka.persistence](package-summary.html)
## Class DeleteSnapshotSuccess

- java.lang.Object
- - akka.persistence.DeleteSnapshotSuccess

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[Protocol.Message](Protocol.Message.html "interface in akka.persistence")`, `[SnapshotProtocol.Message](SnapshotProtocol.Message.html "interface in akka.persistence")`, `[SnapshotProtocol.Response](SnapshotProtocol.Response.html "interface in akka.persistence")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteSnapshotSuccess
extends java.lang.Object
implements [SnapshotProtocol.Response](SnapshotProtocol.Response.html "interface in akka.persistence"), scala.Product, java.io.Serializable
```

Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after successful deletion of a snapshot.
 
 param: metadata snapshot metadata.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.DeleteSnapshotSuccess)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotSuccess](#%3Cinit%3E(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence")` | `[copy](#copy(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[metadata](#metadata())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")>` | `[unapply](#unapply(akka.persistence.DeleteSnapshotSuccess))​([DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteSnapshotSuccess
		
		
		
		```
		public DeleteSnapshotSuccess​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")> unapply​([DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence") x$0)
		```
		- #### metadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata()
		```
		- #### copy
		
		
		
		```
		public [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence") copy​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") copy$default$1()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Protocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html)*