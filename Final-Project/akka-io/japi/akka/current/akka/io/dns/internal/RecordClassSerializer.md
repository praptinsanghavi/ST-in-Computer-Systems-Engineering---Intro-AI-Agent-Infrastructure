---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer.html
title: RecordClassSerializer
---

# RecordClassSerializer

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class RecordClassSerializer

- java.lang.Object
- - akka.io.dns.internal.RecordClassSerializer

- ---

```
public class RecordClassSerializer
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordClassSerializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RecordClass](../RecordClass.html "class in akka.io.dns")` | `[parse](#parse(akka.util.ByteIterator))​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it)` |  |
	| `static void` | `[write](#write(akka.util.ByteStringBuilder,akka.io.dns.RecordClass))​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") out,  [RecordClass](../RecordClass.html "class in akka.io.dns") c)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RecordClassSerializer
		
		
		
		```
		public RecordClassSerializer()
		```

	- ### Method Detail
	
	
	
		- #### parse
		
		
		
		```
		public static [RecordClass](../RecordClass.html "class in akka.io.dns") parse​([ByteIterator](../../../util/ByteIterator.html "class in akka.util") it)
		```
		- #### write
		
		
		
		```
		public static void write​([ByteStringBuilder](../../../util/ByteStringBuilder.html "class in akka.util") out,
		                         [RecordClass](../RecordClass.html "class in akka.io.dns") c)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteStringBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/RecordClassSerializer.html)*