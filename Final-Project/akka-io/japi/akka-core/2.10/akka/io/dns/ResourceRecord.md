---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html
title: ResourceRecord
---

# ResourceRecord

## Content

Package [akka.io.dns](package-summary.html)
## Class ResourceRecord

- java.lang.Object
- - akka.io.dns.ResourceRecord

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

Direct Known Subclasses:
`[AAAARecord](AAAARecord.html "class in akka.io.dns")`, `[ARecord](ARecord.html "class in akka.io.dns")`, `[CNameRecord](CNameRecord.html "class in akka.io.dns")`, `[SRVRecord](SRVRecord.html "class in akka.io.dns")`, `[UnknownRecord](UnknownRecord.html "class in akka.io.dns")`

---

```
public abstract class ResourceRecord
extends java.lang.Object
implements [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResourceRecord](#%3Cinit%3E(java.lang.String,akka.io.dns.CachePolicy.Ttl,short,short))​(java.lang.String name,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,  short recType,  short recClass)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static [ResourceRecord](ResourceRecord.html "class in akka.io.dns")` | `[parse](#parse(akka.util.ByteIterator,akka.util.ByteString))​([ByteIterator](../../util/ByteIterator.html "class in akka.util") it,  [ByteString](../../util/ByteString.html "class in akka.util") msg)` | INTERNAL API |
	| `short` | `[recClass](#recClass())()` |  |
	| `short` | `[recType](#recType())()` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[ttl](#ttl())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ResourceRecord
		
		
		
		```
		public ResourceRecord​(java.lang.String name,
		                      [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl,
		                      short recType,
		                      short recClass)
		```

	- ### Method Detail
	
	
	
		- #### parse
		
		
		
		```
		public static [ResourceRecord](ResourceRecord.html "class in akka.io.dns") parse​([ByteIterator](../../util/ByteIterator.html "class in akka.util") it,
		                                   [ByteString](../../util/ByteString.html "class in akka.util") msg)
		```
		
		INTERNAL API
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### ttl
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl()
		```
		- #### recType
		
		
		
		```
		public short recType()
		```
		- #### recClass
		
		
		
		```
		public short recClass()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/AAAARecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ARecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CNameRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/SRVRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/UnknownRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html)*