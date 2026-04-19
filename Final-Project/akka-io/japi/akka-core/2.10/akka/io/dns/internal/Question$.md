---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Question$.html
title: Question$
---

# Question$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class Question$

- java.lang.Object
- - akka.io.dns.internal.Question$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Question$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.io.dns.internal.Question$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Question$](Question$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Question$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.io.dns.internal.Question` | `[apply](#apply(java.lang.String,akka.io.dns.RecordType,akka.io.dns.RecordClass))​(java.lang.String name,  [RecordType](../RecordType.html "class in akka.io.dns") qType,  [RecordClass](../RecordClass.html "class in akka.io.dns") qClass)` |  |
	| `akka.io.dns.internal.Question` | `[parse](#parse(akka.util.ByteIterator,akka.util.ByteString))​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it,  [ByteString](../../../util/ByteString.html "class in akka.util") msg)` |  |
	| `scala.Option<scala.Tuple3<java.lang.String,​[RecordType](../RecordType.html "class in akka.io.dns"),​[RecordClass](../RecordClass.html "class in akka.io.dns")>>` | `[unapply](#unapply(akka.io.dns.internal.Question))​(akka.io.dns.internal.Question x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Question$](Question$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Question$
		
		
		
		```
		public Question$()
		```

	- ### Method Detail
	
	
	
		- #### parse
		
		
		
		```
		public akka.io.dns.internal.Question parse​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it,
		                                           [ByteString](../../../util/ByteString.html "class in akka.util") msg)
		```
		- #### apply
		
		
		
		```
		public akka.io.dns.internal.Question apply​(java.lang.String name,
		                                           [RecordType](../RecordType.html "class in akka.io.dns") qType,
		                                           [RecordClass](../RecordClass.html "class in akka.io.dns") qClass)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.String,​[RecordType](../RecordType.html "class in akka.io.dns"),​[RecordClass](../RecordClass.html "class in akka.io.dns")>> unapply​(akka.io.dns.internal.Question x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/RecordClass.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/RecordType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Question$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Question$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Question$.html)*