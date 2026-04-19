---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/MessageFlags$.html
title: MessageFlags$
---

# MessageFlags$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class MessageFlags$

- java.lang.Object
- - akka.io.dns.internal.MessageFlags$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MessageFlags$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.io.dns.internal.MessageFlags$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MessageFlags$](MessageFlags$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageFlags$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.io.dns.internal.MessageFlags` | `[apply](#apply(boolean,scala.Enumeration.Value,boolean,boolean,boolean,boolean,scala.Enumeration.Value))​(boolean answer,  scala.Enumeration.Value opCode,  boolean authoritativeAnswer,  boolean truncated,  boolean recursionDesired,  boolean recursionAvailable,  scala.Enumeration.Value responseCode)` |  |
	| `akka.io.dns.internal.MessageFlags` | `[apply](#apply(short))​(short flags)` |  |
	| `boolean` | `[apply$default$1](#apply$default$1())()` |  |
	| `scala.Enumeration.Value` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[apply$default$4](#apply$default$4())()` |  |
	| `boolean` | `[apply$default$5](#apply$default$5())()` |  |
	| `boolean` | `[apply$default$6](#apply$default$6())()` |  |
	| `scala.Enumeration.Value` | `[apply$default$7](#apply$default$7())()` |  |
	| `boolean` | `[canEqual$extension](#canEqual$extension(akka.io.dns.internal.MessageFlags,java.lang.Object))​(akka.io.dns.internal.MessageFlags $this,  java.lang.Object x$1)` |  |
	| `short` | `[copy$default$1$extension](#copy$default$1$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `akka.io.dns.internal.MessageFlags` | `[copy$extension](#copy$extension(akka.io.dns.internal.MessageFlags,short))​(akka.io.dns.internal.MessageFlags $this,  short flags)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.io.dns.internal.MessageFlags,java.lang.Object))​(akka.io.dns.internal.MessageFlags $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `boolean` | `[isAnswer$extension](#isAnswer$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `boolean` | `[isAuthoritativeAnswer$extension](#isAuthoritativeAnswer$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `boolean` | `[isQuery$extension](#isQuery$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `boolean` | `[isRecursionAvailable$extension](#isRecursionAvailable$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `boolean` | `[isRecursionDesired$extension](#isRecursionDesired$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `boolean` | `[isTruncated$extension](#isTruncated$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `scala.Enumeration.Value` | `[opCode$extension](#opCode$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `int` | `[productArity$extension](#productArity$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `java.lang.Object` | `[productElement$extension](#productElement$extension(akka.io.dns.internal.MessageFlags,int))​(akka.io.dns.internal.MessageFlags $this,  int x$1)` |  |
	| `java.lang.String` | `[productElementName$extension](#productElementName$extension(akka.io.dns.internal.MessageFlags,int))​(akka.io.dns.internal.MessageFlags $this,  int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator$extension](#productIterator$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `java.lang.String` | `[productPrefix$extension](#productPrefix$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `scala.Enumeration.Value` | `[responseCode$extension](#responseCode$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `java.lang.String` | `[toString$extension](#toString$extension(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags $this)` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.io.dns.internal.MessageFlags))​(akka.io.dns.internal.MessageFlags x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MessageFlags$](MessageFlags$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MessageFlags$
		
		
		
		```
		public MessageFlags$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.io.dns.internal.MessageFlags apply​(boolean answer,
		                                               scala.Enumeration.Value opCode,
		                                               boolean authoritativeAnswer,
		                                               boolean truncated,
		                                               boolean recursionDesired,
		                                               boolean recursionAvailable,
		                                               scala.Enumeration.Value responseCode)
		```
		- #### apply$default$1
		
		
		
		```
		public boolean apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public scala.Enumeration.Value apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public boolean apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public boolean apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public boolean apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public boolean apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public scala.Enumeration.Value apply$default$7()
		```
		- #### apply
		
		
		
		```
		public akka.io.dns.internal.MessageFlags apply​(short flags)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​(akka.io.dns.internal.MessageFlags x$0)
		```
		- #### isQuery$extension
		
		
		
		```
		public final boolean isQuery$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### isAnswer$extension
		
		
		
		```
		public final boolean isAnswer$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### opCode$extension
		
		
		
		```
		public final scala.Enumeration.Value opCode$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### isAuthoritativeAnswer$extension
		
		
		
		```
		public final boolean isAuthoritativeAnswer$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### isTruncated$extension
		
		
		
		```
		public final boolean isTruncated$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### isRecursionDesired$extension
		
		
		
		```
		public final boolean isRecursionDesired$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### isRecursionAvailable$extension
		
		
		
		```
		public final boolean isRecursionAvailable$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### responseCode$extension
		
		
		
		```
		public final scala.Enumeration.Value responseCode$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### toString$extension
		
		
		
		```
		public final java.lang.String toString$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### copy$extension
		
		
		
		```
		public final akka.io.dns.internal.MessageFlags copy$extension​(akka.io.dns.internal.MessageFlags $this,
		                                                              short flags)
		```
		- #### copy$default$1$extension
		
		
		
		```
		public final short copy$default$1$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### productPrefix$extension
		
		
		
		```
		public final java.lang.String productPrefix$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### productArity$extension
		
		
		
		```
		public final int productArity$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### productElement$extension
		
		
		
		```
		public final java.lang.Object productElement$extension​(akka.io.dns.internal.MessageFlags $this,
		                                                       int x$1)
		```
		- #### productIterator$extension
		
		
		
		```
		public final scala.collection.Iterator<java.lang.Object> productIterator$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### canEqual$extension
		
		
		
		```
		public final boolean canEqual$extension​(akka.io.dns.internal.MessageFlags $this,
		                                        java.lang.Object x$1)
		```
		- #### productElementName$extension
		
		
		
		```
		public final java.lang.String productElementName$extension​(akka.io.dns.internal.MessageFlags $this,
		                                                           int x$1)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​(akka.io.dns.internal.MessageFlags $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​(akka.io.dns.internal.MessageFlags $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/MessageFlags$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/MessageFlags$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/MessageFlags$.html)*