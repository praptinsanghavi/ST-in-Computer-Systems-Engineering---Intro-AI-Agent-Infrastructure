---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/AAAARecord.html
title: AAAARecord
---

# AAAARecord

## Content

Package [akka.io.dns](package-summary.html)
## Class AAAARecord

- java.lang.Object
- - [akka.io.dns.ResourceRecord](ResourceRecord.html "class in akka.io.dns")
	- - akka.io.dns.AAAARecord

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AAAARecord
extends [ResourceRecord](ResourceRecord.html "class in akka.io.dns")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.AAAARecord)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AAAARecord](#%3Cinit%3E(java.lang.String,akka.io.dns.CachePolicy.Ttl,java.net.Inet6Address))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  java.net.Inet6Address ip)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AAAARecord](AAAARecord.html "class in akka.io.dns")` | `[apply](#apply(java.lang.String,akka.io.dns.CachePolicy.Ttl,java.net.Inet6Address))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  java.net.Inet6Address ip)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AAAARecord](AAAARecord.html "class in akka.io.dns")` | `[copy](#copy(java.lang.String,akka.io.dns.CachePolicy.Ttl,java.net.Inet6Address))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  java.net.Inet6Address ip)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.net.Inet6Address` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.net.Inet6Address` | `[ip](#ip())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static [AAAARecord](AAAARecord.html "class in akka.io.dns")` | `[parseBody](#parseBody(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,akka.util.ByteIterator))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short length,  [ByteIterator](../../util/ByteIterator.html "class in akka.util") it)` | INTERNAL API |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[ttl](#ttl())()` |  |
	| `static scala.Option<scala.Tuple3<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.net.Inet6Address>>` | `[unapply](#unapply(akka.io.dns.AAAARecord))​([AAAARecord](AAAARecord.html "class in akka.io.dns") x$0)` |  |
	
	
		- ### Methods inherited from class akka.io.dns.[ResourceRecord](ResourceRecord.html "class in akka.io.dns")
		
		
		`[parse](ResourceRecord.html#parse(akka.util.ByteIterator,akka.util.ByteString)), [recClass](ResourceRecord.html#recClass()), [recType](ResourceRecord.html#recType())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AAAARecord
		
		
		
		```
		public AAAARecord​(java.lang.String name,
		                  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                  java.net.Inet6Address ip)
		```

	- ### Method Detail
	
	
	
		- #### parseBody
		
		
		
		```
		public static [AAAARecord](AAAARecord.html "class in akka.io.dns") parseBody​(java.lang.String name,
		                                   [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                                   short length,
		                                   [ByteIterator](../../util/ByteIterator.html "class in akka.util") it)
		```
		
		INTERNAL API
		- #### apply
		
		
		
		```
		public static [AAAARecord](AAAARecord.html "class in akka.io.dns") apply​(java.lang.String name,
		                               [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                               java.net.Inet6Address ip)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.net.Inet6Address>> unapply​([AAAARecord](AAAARecord.html "class in akka.io.dns") x$0)
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
		- #### ip
		
		
		
		```
		public java.net.Inet6Address ip()
		```
		- #### copy
		
		
		
		```
		public [AAAARecord](AAAARecord.html "class in akka.io.dns") copy​(java.lang.String name,
		                       [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                       java.net.Inet6Address ip)
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
		public java.net.Inet6Address copy$default$3()
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
- https://doc.akka.io/japi/akka/current/akka/io/dns/AAAARecord.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/AAAARecord.html](https://doc.akka.io/japi/akka/current/akka/io/dns/AAAARecord.html)*