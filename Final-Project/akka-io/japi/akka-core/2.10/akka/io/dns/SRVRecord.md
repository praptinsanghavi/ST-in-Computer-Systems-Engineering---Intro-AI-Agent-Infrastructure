---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord.html
title: SRVRecord
---

# SRVRecord

## Content

Package [akka.io.dns](package-summary.html)
## Class SRVRecord

- java.lang.Object
- - [akka.io.dns.ResourceRecord](ResourceRecord.html "class in akka.io.dns")
	- - akka.io.dns.SRVRecord

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SRVRecord
extends [ResourceRecord](ResourceRecord.html "class in akka.io.dns")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.SRVRecord)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SRVRecord](#%3Cinit%3E(java.lang.String,akka.io.dns.CachePolicy.Ttl,int,int,int,java.lang.String))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  int priority,  int weight,  int port,  java.lang.String target)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SRVRecord](SRVRecord.html "class in akka.io.dns")` | `[apply](#apply(java.lang.String,akka.io.dns.CachePolicy.Ttl,int,int,int,java.lang.String))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  int priority,  int weight,  int port,  java.lang.String target)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SRVRecord](SRVRecord.html "class in akka.io.dns")` | `[copy](#copy(java.lang.String,akka.io.dns.CachePolicy.Ttl,int,int,int,java.lang.String))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  int priority,  int weight,  int port,  java.lang.String target)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[copy$default$2](#copy$default$2())()` |  |
	| `int` | `[copy$default$3](#copy$default$3())()` |  |
	| `int` | `[copy$default$4](#copy$default$4())()` |  |
	| `int` | `[copy$default$5](#copy$default$5())()` |  |
	| `java.lang.String` | `[copy$default$6](#copy$default$6())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static [SRVRecord](SRVRecord.html "class in akka.io.dns")` | `[parseBody](#parseBody(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,akka.util.ByteIterator,akka.util.ByteString))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short length,  [ByteIterator](../../util/ByteIterator.html "class in akka.util") it,  [ByteString](../../util/ByteString.html "class in akka.util") msg)` | INTERNAL API |
	| `int` | `[port](#port())()` |  |
	| `int` | `[priority](#priority())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[target](#target())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[ttl](#ttl())()` |  |
	| `static scala.Option<scala.Tuple6<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.io.dns.SRVRecord))​([SRVRecord](SRVRecord.html "class in akka.io.dns") x$0)` |  |
	| `int` | `[weight](#weight())()` |  |
	
	
		- ### Methods inherited from class akka.io.dns.[ResourceRecord](ResourceRecord.html "class in akka.io.dns")
		
		
		`[parse](ResourceRecord.html#parse(akka.util.ByteIterator,akka.util.ByteString)), [recClass](ResourceRecord.html#recClass()), [recType](ResourceRecord.html#recType())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SRVRecord
		
		
		
		```
		public SRVRecord​(java.lang.String name,
		                 [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                 int priority,
		                 int weight,
		                 int port,
		                 java.lang.String target)
		```

	- ### Method Detail
	
	
	
		- #### parseBody
		
		
		
		```
		public static [SRVRecord](SRVRecord.html "class in akka.io.dns") parseBody​(java.lang.String name,
		                                  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                                  short length,
		                                  [ByteIterator](../../util/ByteIterator.html "class in akka.util") it,
		                                  [ByteString](../../util/ByteString.html "class in akka.util") msg)
		```
		
		INTERNAL API
		- #### apply
		
		
		
		```
		public static [SRVRecord](SRVRecord.html "class in akka.io.dns") apply​(java.lang.String name,
		                              [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                              int priority,
		                              int weight,
		                              int port,
		                              java.lang.String target)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple6<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String>> unapply​([SRVRecord](SRVRecord.html "class in akka.io.dns") x$0)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Overrides:
		`[name](ResourceRecord.html#name())` in class `[ResourceRecord](ResourceRecord.html "class in akka.io.dns")`
		- #### ttl
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl()
		```
		
		
		Overrides:
		`[ttl](ResourceRecord.html#ttl())` in class `[ResourceRecord](ResourceRecord.html "class in akka.io.dns")`
		- #### priority
		
		
		
		```
		public int priority()
		```
		- #### weight
		
		
		
		```
		public int weight()
		```
		- #### port
		
		
		
		```
		public int port()
		```
		- #### target
		
		
		
		```
		public java.lang.String target()
		```
		- #### copy
		
		
		
		```
		public [SRVRecord](SRVRecord.html "class in akka.io.dns") copy​(java.lang.String name,
		                      [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                      int priority,
		                      int weight,
		                      int port,
		                      java.lang.String target)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public int copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public int copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public int copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public java.lang.String copy$default$6()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord.html)*