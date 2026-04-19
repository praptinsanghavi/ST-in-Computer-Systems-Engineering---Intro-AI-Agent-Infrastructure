---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordTypeSerializer.html
title: RecordTypeSerializer
---

# RecordTypeSerializer

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class RecordTypeSerializer

- java.lang.Object
- - akka.io.dns.internal.RecordTypeSerializer

- ---

```
public class RecordTypeSerializer
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordTypeSerializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RecordType](../RecordType.html "class in akka.io.dns")` | `[parse](#parse(akka.util.ByteIterator))​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it)` |  |
	| `static void` | `[write](#write(akka.util.ByteStringBuilder,akka.io.dns.RecordType))​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") out,  [RecordType](../RecordType.html "class in akka.io.dns") value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RecordTypeSerializer
		
		
		
		```
		public RecordTypeSerializer()
		```

	- ### Method Detail
	
	
	
		- #### write
		
		
		
		```
		public static void write​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") out,
		                         [RecordType](../RecordType.html "class in akka.io.dns") value)
		```
		- #### parse
		
		
		
		```
		public static [RecordType](../RecordType.html "class in akka.io.dns") parse​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteStringBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordTypeSerializer.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordTypeSerializer.html)*