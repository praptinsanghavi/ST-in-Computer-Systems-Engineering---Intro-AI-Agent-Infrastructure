---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:44:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.WritePath$.html
title: Tcp.WritePath$
---

# Tcp.WritePath$

## Content

Package [akka.io](package-summary.html)
## Class Tcp.WritePath$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io"),​[Tcp.WritePath](Tcp.WritePath.html "class in akka.io")\>
	- - akka.io.Tcp.WritePath$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io"),​[Tcp.WritePath](Tcp.WritePath.html "class in akka.io")>`

Enclosing class:
[Tcp](Tcp.html "class in akka.io")

---

```
public static class Tcp.WritePath$
extends scala.runtime.AbstractFunction4<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io"),​[Tcp.WritePath](Tcp.WritePath.html "class in akka.io")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.io.Tcp.WritePath$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tcp.WritePath$](Tcp.WritePath$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WritePath$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Tcp.WritePath](Tcp.WritePath.html "class in akka.io")` | `[apply](#apply(java.nio.file.Path,long,long,akka.io.Tcp.Event))​(java.nio.file.Path path,  long position,  long count,  [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io")>>` | `[unapply](#unapply(akka.io.Tcp.WritePath))​([Tcp.WritePath](Tcp.WritePath.html "class in akka.io") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tcp.WritePath$](Tcp.WritePath$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WritePath$
		
		
		
		```
		public WritePath$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io"),​[Tcp.WritePath](Tcp.WritePath.html "class in akka.io")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io"),​[Tcp.WritePath](Tcp.WritePath.html "class in akka.io")>`
		- #### apply
		
		
		
		```
		public [Tcp.WritePath](Tcp.WritePath.html "class in akka.io") apply​(java.nio.file.Path path,
		                           long position,
		                           long count,
		                           [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](Tcp.Event.html "interface in akka.io")>> unapply​([Tcp.WritePath](Tcp.WritePath.html "class in akka.io") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.Event.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.WritePath$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.WritePath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.WritePath$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.WritePath$.html)*