---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord$.html
title: UnknownRecord$
---

# UnknownRecord$

## Content

Package [akka.io.dns](package-summary.html)
## Class UnknownRecord$

- java.lang.Object
- - akka.io.dns.UnknownRecord$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class UnknownRecord$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.UnknownRecord$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UnknownRecord$](UnknownRecord$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnknownRecord$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[UnknownRecord](UnknownRecord.html "class in akka.io.dns")` | `[apply](#apply(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,short,akka.util.ByteString))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short recType,  short recClass,  [ByteString](../../util/ByteString.html "class in akka.util") data)` |  |
	| `[UnknownRecord](UnknownRecord.html "class in akka.io.dns")` | `[parseBody](#parseBody(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,short,short,akka.util.ByteIterator))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short recType,  short recClass,  short length,  [ByteIterator](../../util/ByteIterator.html "class in akka.util") it)` | INTERNAL API |
	| `scala.Option<scala.Tuple5<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.lang.Object,​java.lang.Object,​[ByteString](../../util/ByteString.html "class in akka.util")>>` | `[unapply](#unapply(akka.io.dns.UnknownRecord))​([UnknownRecord](UnknownRecord.html "class in akka.io.dns") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UnknownRecord$](UnknownRecord$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnknownRecord$
		
		
		
		```
		public UnknownRecord$()
		```

	- ### Method Detail
	
	
	
		- #### parseBody
		
		
		
		```
		public [UnknownRecord](UnknownRecord.html "class in akka.io.dns") parseBody​(java.lang.String name,
		                               [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                               short recType,
		                               short recClass,
		                               short length,
		                               [ByteIterator](../../util/ByteIterator.html "class in akka.util") it)
		```
		
		INTERNAL API
		- #### apply
		
		
		
		```
		public [UnknownRecord](UnknownRecord.html "class in akka.io.dns") apply​(java.lang.String name,
		                           [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                           short recType,
		                           short recClass,
		                           [ByteString](../../util/ByteString.html "class in akka.util") data)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<java.lang.String,​[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns"),​java.lang.Object,​java.lang.Object,​[ByteString](../../util/ByteString.html "class in akka.util")>> unapply​([UnknownRecord](UnknownRecord.html "class in akka.io.dns") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord$.html)*