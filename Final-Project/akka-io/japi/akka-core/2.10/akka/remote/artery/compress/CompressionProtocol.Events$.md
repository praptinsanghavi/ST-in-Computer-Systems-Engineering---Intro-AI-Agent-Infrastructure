---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable.html
title: CompressionProtocol.Events$.ReceivedClassManifestCompressionTable
---

# CompressionProtocol.Events$.ReceivedClassManifestCompressionTable

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class CompressionProtocol.Events$.ReceivedClassManifestCompressionTable

- java.lang.Object
- - akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedClassManifestCompressionTable

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[CompressionProtocol.Events$](CompressionProtocol.Events$.html "class in akka.remote.artery.compress")

---

```
public final class CompressionProtocol.Events$.ReceivedClassManifestCompressionTable
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedClassManifestCompressionTable)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceivedClassManifestCompressionTable](#%3Cinit%3E(akka.remote.UniqueAddress,akka.remote.artery.compress.CompressionTable))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,  akka.remote.artery.compress.CompressionTable<java.lang.String> table)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable` | `[apply](#apply(akka.remote.UniqueAddress,akka.remote.artery.compress.CompressionTable))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,  akka.remote.artery.compress.CompressionTable<java.lang.String> table)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable` | `[copy](#copy(akka.remote.UniqueAddress,akka.remote.artery.compress.CompressionTable))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,  akka.remote.artery.compress.CompressionTable<java.lang.String> table)` |  |
	| `[UniqueAddress](../../UniqueAddress.html "class in akka.remote")` | `[copy$default$1](#copy$default$1())()` |  |
	| `akka.remote.artery.compress.CompressionTable<java.lang.String>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[UniqueAddress](../../UniqueAddress.html "class in akka.remote")` | `[from](#from())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `akka.remote.artery.compress.CompressionTable<java.lang.String>` | `[table](#table())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>>>` | `[unapply](#unapply(akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable))​(akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ReceivedClassManifestCompressionTable
		
		
		
		```
		public ReceivedClassManifestCompressionTable​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,
		                                             akka.remote.artery.compress.CompressionTable<java.lang.String> table)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable apply​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,
		                                                                                                                 akka.remote.artery.compress.CompressionTable<java.lang.String> table)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>>> unapply​(akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable x$0)
		```
		- #### from
		
		
		
		```
		public [UniqueAddress](../../UniqueAddress.html "class in akka.remote") from()
		```
		- #### table
		
		
		
		```
		public akka.remote.artery.compress.CompressionTable<java.lang.String> table()
		```
		- #### copy
		
		
		
		```
		public akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable copy​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,
		                                                                                                         akka.remote.artery.compress.CompressionTable<java.lang.String> table)
		```
		- #### copy$default$1
		
		
		
		```
		public [UniqueAddress](../../UniqueAddress.html "class in akka.remote") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public akka.remote.artery.compress.CompressionTable<java.lang.String> copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/CompressionProtocol.Events$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable.html)*