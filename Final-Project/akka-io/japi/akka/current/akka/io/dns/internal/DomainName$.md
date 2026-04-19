---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/DomainName$.html
title: DomainName$
---

# DomainName$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class DomainName$

- java.lang.Object
- - akka.io.dns.internal.DomainName$

- ---

```
public class DomainName$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DomainName$](DomainName$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DomainName$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `short` | `[length](#length(java.lang.String))​(java.lang.String name)` |  |
	| `java.lang.String` | `[parse](#parse(akka.util.ByteIterator,akka.util.ByteString))​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it,  [ByteString](../../../util/ByteString.html "class in akka.util") msg)` |  |
	| `void` | `[write](#write(akka.util.ByteStringBuilder,java.lang.String))​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") it,  java.lang.String name)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DomainName$](DomainName$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DomainName$
		
		
		
		```
		public DomainName$()
		```

	- ### Method Detail
	
	
	
		- #### length
		
		
		
		```
		public short length​(java.lang.String name)
		```
		- #### write
		
		
		
		```
		public void write​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") it,
		                  java.lang.String name)
		```
		- #### parse
		
		
		
		```
		public java.lang.String parse​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it,
		                              [ByteString](../../../util/ByteString.html "class in akka.util") msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/DomainName$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteStringBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/DomainName$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/DomainName$.html)*