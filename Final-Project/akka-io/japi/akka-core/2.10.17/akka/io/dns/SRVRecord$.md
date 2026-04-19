---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:45:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/SRVRecord$.html
title: SRVRecord$
---

# SRVRecord$

## Content

Package [akka.io.dns](package-summary.html)
## Class SRVRecord$

- java.lang.Object
- - akka.io.dns.SRVRecord$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SRVRecord$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.SRVRecord$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SRVRecord$](SRVRecord$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SRVRecord$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SRVRecord](SRVRecord.html "class in akka.io.dns")` | `[apply](#apply(java.lang.String,akka.io.dns.CachePolicy.Ttl,int,int,int,java.lang.String))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  int priority,  int weight,  int port,  java.lang.String target)` |  |
	| `[SRVRecord](SRVRecord.html "class in akka.io.dns")` | `[parseBody](#parseBody(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,akka.util.ByteIterator,akka.util.ByteString))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short length,  [ByteIterator](../../util/ByteIterator.html "class in akka.util") it,  [ByteString](../../util/ByteString.html "class in akka.util") msg)` | INTERNAL API |
	| `scala.Option<scala.Tuple6<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.io.dns.SRVRecord))​([SRVRecord](SRVRecord.html "class in akka.io.dns") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SRVRecord$](SRVRecord$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SRVRecord$
		
		
		
		```
		public SRVRecord$()
		```

	- ### Method Detail
	
	
	
		- #### parseBody
		
		
		
		```
		public [SRVRecord](SRVRecord.html "class in akka.io.dns") parseBody​(java.lang.String name,
		                           [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                           short length,
		                           [ByteIterator](../../util/ByteIterator.html "class in akka.util") it,
		                           [ByteString](../../util/ByteString.html "class in akka.util") msg)
		```
		
		INTERNAL API
		- #### apply
		
		
		
		```
		public [SRVRecord](SRVRecord.html "class in akka.io.dns") apply​(java.lang.String name,
		                       [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                       int priority,
		                       int weight,
		                       int port,
		                       java.lang.String target)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String>> unapply​([SRVRecord](SRVRecord.html "class in akka.io.dns") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/SRVRecord$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/SRVRecord.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/SRVRecord$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/SRVRecord$.html)*