---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer$.html
title: RecordClassSerializer$
---

# RecordClassSerializer$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class RecordClassSerializer$

- java.lang.Object
- - akka.io.dns.internal.RecordClassSerializer$

- ---

```
public class RecordClassSerializer$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecordClassSerializer$](RecordClassSerializer$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordClassSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RecordClass](../RecordClass.html "class in akka.io.dns")` | `[parse](#parse(akka.util.ByteIterator))​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it)` |  |
	| `void` | `[write](#write(akka.util.ByteStringBuilder,akka.io.dns.RecordClass))​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") out,  [RecordClass](../RecordClass.html "class in akka.io.dns") c)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecordClassSerializer$](RecordClassSerializer$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecordClassSerializer$
		
		
		
		```
		public RecordClassSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### parse
		
		
		
		```
		public [RecordClass](../RecordClass.html "class in akka.io.dns") parse​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it)
		```
		- #### write
		
		
		
		```
		public void write​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") out,
		                  [RecordClass](../RecordClass.html "class in akka.io.dns") c)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteStringBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer$.html)*