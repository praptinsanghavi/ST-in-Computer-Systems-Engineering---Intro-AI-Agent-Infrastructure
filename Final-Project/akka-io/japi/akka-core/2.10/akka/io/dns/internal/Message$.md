---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Message$.html
title: Message$
---

# Message$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class Message$

- java.lang.Object
- - akka.io.dns.internal.Message$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Message$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.io.dns.internal.Message$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Message$](Message$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Message$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<akka.io.dns.internal.Question>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `akka.io.dns.internal.Message` | `[apply](#apply(short,akka.io.dns.internal.MessageFlags,scala.collection.immutable.Seq,scala.collection.immutable.Seq,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(short id,  akka.io.dns.internal.MessageFlags flags,  scala.collection.immutable.Seq<akka.io.dns.internal.Question> questions,  scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> answerRecs,  scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> authorityRecs,  scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> additionalRecs)` |  |
	| `scala.collection.immutable.Seq<akka.io.dns.internal.Question>` | `[apply$default$3](#apply$default$3())()` |  |
	| `scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>` | `[apply$default$4](#apply$default$4())()` |  |
	| `scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>` | `[apply$default$5](#apply$default$5())()` |  |
	| `scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>` | `[apply$default$6](#apply$default$6())()` |  |
	| `akka.io.dns.internal.Message` | `[parse](#parse(akka.util.ByteString))​([ByteString](../../../util/ByteString.html "class in akka.util") msg)` | INTERNAL API |
	| `scala.Option<scala.Tuple6<java.lang.Object,​akka.io.dns.internal.MessageFlags,​scala.collection.immutable.Seq<akka.io.dns.internal.Question>,​scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>,​scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>,​scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>>>` | `[unapply](#unapply(akka.io.dns.internal.Message))​(akka.io.dns.internal.Message x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Message$](Message$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Message$
		
		
		
		```
		public Message$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$3
		
		
		
		```
		public scala.collection.immutable.Seq<akka.io.dns.internal.Question> $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> $lessinit$greater$default$6()
		```
		- #### parse
		
		
		
		```
		public akka.io.dns.internal.Message parse​([ByteString](../../../util/ByteString.html "class in akka.util") msg)
		```
		
		INTERNAL API
		- #### apply
		
		
		
		```
		public akka.io.dns.internal.Message apply​(short id,
		                                          akka.io.dns.internal.MessageFlags flags,
		                                          scala.collection.immutable.Seq<akka.io.dns.internal.Question> questions,
		                                          scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> answerRecs,
		                                          scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> authorityRecs,
		                                          scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> additionalRecs)
		```
		- #### apply$default$3
		
		
		
		```
		public scala.collection.immutable.Seq<akka.io.dns.internal.Question> apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")> apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<java.lang.Object,​akka.io.dns.internal.MessageFlags,​scala.collection.immutable.Seq<akka.io.dns.internal.Question>,​scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>,​scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>,​scala.collection.immutable.Seq<[ResourceRecord](../ResourceRecord.html "class in akka.io.dns")>>> unapply​(akka.io.dns.internal.Message x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Message$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Message$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/Message$.html)*