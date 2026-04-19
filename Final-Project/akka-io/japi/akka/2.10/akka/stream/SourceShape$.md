---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape$.html
title: SourceShape$
---

# SourceShape$

## Content

Package [akka.stream](package-summary.html)
## Class SourceShape$

- java.lang.Object
- - akka.stream.SourceShape$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SourceShape$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.SourceShape$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SourceShape$](SourceShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SourceShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [SourceShape](SourceShape.html "class in akka.stream")<T>` | `[apply](#apply(akka.stream.Outlet))​([Outlet](Outlet.html "class in akka.stream")<T> out)` |  |
	| `<T> [SourceShape](SourceShape.html "class in akka.stream")<T>` | `[of](#of(akka.stream.Outlet))​([Outlet](Outlet.html "class in akka.stream")<T> outlet)` | Java API |
	| `<T> scala.Option<[Outlet](Outlet.html "class in akka.stream")<T>>` | `[unapply](#unapply(akka.stream.SourceShape))​([SourceShape](SourceShape.html "class in akka.stream")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SourceShape$](SourceShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SourceShape$
		
		
		
		```
		public SourceShape$()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public <T> [SourceShape](SourceShape.html "class in akka.stream")<T> of​([Outlet](Outlet.html "class in akka.stream")<T> outlet)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <T> [SourceShape](SourceShape.html "class in akka.stream")<T> apply​([Outlet](Outlet.html "class in akka.stream")<T> out)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<[Outlet](Outlet.html "class in akka.stream")<T>> unapply​([SourceShape](SourceShape.html "class in akka.stream")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape$.html)*