---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass$.html
title: RecordClass$
---

# RecordClass$

## Content

Package [akka.io.dns](package-summary.html)
## Class RecordClass$

- java.lang.Object
- - akka.io.dns.RecordClass$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class RecordClass$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.RecordClass$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecordClass$](RecordClass$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordClass$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[apply](#apply(short,java.lang.String))​(short code,  java.lang.String name)` |  |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[CH](#CH())()` |  |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[CS](#CS())()` |  |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[HS](#HS())()` |  |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[IN](#IN())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.io.dns.RecordClass))​([RecordClass](RecordClass.html "class in akka.io.dns") x$0)` |  |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[WILDCARD](#WILDCARD())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecordClass$](RecordClass$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecordClass$
		
		
		
		```
		public RecordClass$()
		```

	- ### Method Detail
	
	
	
		- #### IN
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") IN()
		```
		- #### CS
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") CS()
		```
		- #### CH
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") CH()
		```
		- #### HS
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") HS()
		```
		- #### WILDCARD
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") WILDCARD()
		```
		- #### apply
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") apply​(short code,
		                         java.lang.String name)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>> unapply​([RecordClass](RecordClass.html "class in akka.io.dns") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass$.html)*