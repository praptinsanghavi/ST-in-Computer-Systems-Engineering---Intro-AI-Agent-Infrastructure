---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHeader.html
title: FrameHeader
---

# FrameHeader

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameHeader

- java.lang.Object
- - akka.http.impl.engine.ws.FrameHeader

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FrameHeader
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Model of the frame header

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.ws.FrameHeader)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameHeader](#%3Cinit%3E(akka.http.impl.engine.ws.Protocol.Opcode,scala.Option,long,boolean,boolean,boolean,boolean))​([Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode,  scala.Option<java.lang.Object> mask,  long length,  boolean fin,  boolean rsv1,  boolean rsv2,  boolean rsv3)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7))​(T1 v1,  T2 v2,  T3 v3,  T4 v4,  T5 v5,  T6 v6,  T7 v7)` |  |
	| `boolean` | `[fin](#fin())()` |  |
	| `long` | `[length](#length())()` |  |
	| `scala.Option<java.lang.Object>` | `[mask](#mask())()` |  |
	| `[Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws")` | `[opcode](#opcode())()` |  |
	| `boolean` | `[rsv1](#rsv1())()` |  |
	| `boolean` | `[rsv2](#rsv2())()` |  |
	| `boolean` | `[rsv3](#rsv3())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### FrameHeader
		
		
		
		```
		public FrameHeader​([Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode,
		                   scala.Option<java.lang.Object> mask,
		                   long length,
		                   boolean fin,
		                   boolean rsv1,
		                   boolean rsv2,
		                   boolean rsv3)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3,
		                               T4 v4,
		                               T5 v5,
		                               T6 v6,
		                               T7 v7)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### opcode
		
		
		
		```
		public [Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode()
		```
		- #### mask
		
		
		
		```
		public scala.Option<java.lang.Object> mask()
		```
		- #### length
		
		
		
		```
		public long length()
		```
		- #### fin
		
		
		
		```
		public boolean fin()
		```
		- #### rsv1
		
		
		
		```
		public boolean rsv1()
		```
		- #### rsv2
		
		
		
		```
		public boolean rsv2()
		```
		- #### rsv3
		
		
		
		```
		public boolean rsv3()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Protocol.Opcode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHeader.html)*