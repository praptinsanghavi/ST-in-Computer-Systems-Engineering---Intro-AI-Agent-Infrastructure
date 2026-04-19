---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:01:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.DataDeleted.html
title: Replicator.DataDeleted
---

# Replicator.DataDeleted

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Replicator.DataDeleted\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\>

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.cluster.ddata.Replicator.DataDeleted\<A\>

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<A>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

Enclosing class:
[Replicator](Replicator.html "class in akka.cluster.ddata")

---

```
public static final class Replicator.DataDeleted<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace, [Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<A>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Replicator.DataDeleted)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DataDeleted](#%3Cinit%3E(akka.cluster.ddata.Key,scala.Option))​([Key](Key.html "class in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted")> key,  scala.Option<java.lang.Object> request)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>[Replicator.DataDeleted](Replicator.DataDeleted.html "class in akka.cluster.ddata")<A>` | `[copy](#copy(akka.cluster.ddata.Key,scala.Option))​([Key](Key.html "class in akka.cluster.ddata")<A> key,  scala.Option<java.lang.Object> request)` |  |
	| `<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>[Key](Key.html "class in akka.cluster.ddata")<A>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>scala.Option<java.lang.Object>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Key](Key.html "class in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted")>` | `[key](#key())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<java.lang.Object>` | `[request](#request())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.cluster.ddata.[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")
		
		
		`[getRequest](Replicator.DeleteResponse.html#getRequest())`

- - ### Constructor Detail
	
	
	
		- #### DataDeleted
		
		
		
		```
		public DataDeleted​([Key](Key.html "class in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted")> key,
		                   scala.Option<java.lang.Object> request)
		```

	- ### Method Detail
	
	
	
		- #### key
		
		
		
		```
		public [Key](Key.html "class in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted")> key()
		```
		
		
		Specified by:
		`[key](Replicator.DeleteResponse.html#key())` in interface `[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>`
		- #### request
		
		
		
		```
		public scala.Option<java.lang.Object> request()
		```
		
		
		Specified by:
		`[request](Replicator.DeleteResponse.html#request())` in interface `[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Throwable`
		- #### copy
		
		
		
		```
		public <A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> [Replicator.DataDeleted](Replicator.DataDeleted.html "class in akka.cluster.ddata")<A> copy​([Key](Key.html "class in akka.cluster.ddata")<A> key,
		                                                                 scala.Option<java.lang.Object> request)
		```
		- #### copy$default$1
		
		
		
		```
		public <A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> [Key](Key.html "class in akka.cluster.ddata")<A> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> scala.Option<java.lang.Object> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.DataDeleted.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.DeleteResponse.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.DataDeleted.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.DataDeleted.html)*