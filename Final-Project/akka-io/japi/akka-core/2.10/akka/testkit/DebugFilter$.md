---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:19:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DebugFilter$.html
title: DebugFilter$
---

# DebugFilter$

## Content

Package [akka.testkit](package-summary.html)
## Class DebugFilter$

- java.lang.Object
- - akka.testkit.DebugFilter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DebugFilter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.DebugFilter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DebugFilter$](DebugFilter$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DebugFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DebugFilter](DebugFilter.html "class in akka.testkit")` | `[apply](#apply(scala.Option,scala.util.Either,boolean,int))​(scala.Option<java.lang.String> source,  scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,  boolean complete,  int occurrences)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<scala.Option<java.lang.String>,​scala.util.Either<java.lang.String,​scala.util.matching.Regex>,​java.lang.Object>>` | `[unapply](#unapply(akka.testkit.DebugFilter))​([DebugFilter](DebugFilter.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DebugFilter$](DebugFilter$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DebugFilter$
		
		
		
		```
		public DebugFilter$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public [DebugFilter](DebugFilter.html "class in akka.testkit") apply​(scala.Option<java.lang.String> source,
		                         scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,
		                         boolean complete,
		                         int occurrences)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<scala.Option<java.lang.String>,​scala.util.Either<java.lang.String,​scala.util.matching.Regex>,​java.lang.Object>> unapply​([DebugFilter](DebugFilter.html "class in akka.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DebugFilter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DebugFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DebugFilter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DebugFilter$.html)*