---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord$.html
title: ARecord$
---

# ARecord$

## Content

Package [akka.io.dns](package-summary.html)
## Class ARecord$

- java.lang.Object
- - akka.io.dns.ARecord$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ARecord$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.ARecord$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ARecord$](ARecord$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ARecord$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ARecord](ARecord.html "class in akka.io.dns")` | `[apply](#apply(java.lang.String,akka.io.dns.CachePolicy.Ttl,java.net.InetAddress))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  java.net.InetAddress ip)` |  |
	| `[ARecord](ARecord.html "class in akka.io.dns")` | `[parseBody](#parseBody(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,akka.util.ByteIterator))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short length,  [ByteIterator](../../util/ByteIterator.html "class in akka.util") it)` |  |
	| `scala.Option<scala.Tuple3<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.net.InetAddress>>` | `[unapply](#unapply(akka.io.dns.ARecord))​([ARecord](ARecord.html "class in akka.io.dns") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ARecord$](ARecord$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ARecord$
		
		
		
		```
		public ARecord$()
		```

	- ### Method Detail
	
	
	
		- #### parseBody
		
		
		
		```
		public [ARecord](ARecord.html "class in akka.io.dns") parseBody​(java.lang.String name,
		                         [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                         short length,
		                         [ByteIterator](../../util/ByteIterator.html "class in akka.util") it)
		```
		- #### apply
		
		
		
		```
		public [ARecord](ARecord.html "class in akka.io.dns") apply​(java.lang.String name,
		                     [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                     java.net.InetAddress ip)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.net.InetAddress>> unapply​([ARecord](ARecord.html "class in akka.io.dns") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord$.html)*