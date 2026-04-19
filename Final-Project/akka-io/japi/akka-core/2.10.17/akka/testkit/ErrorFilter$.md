---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ErrorFilter$.html
title: ErrorFilter$
---

# ErrorFilter$

## Content

Package [akka.testkit](package-summary.html)
## Class ErrorFilter$

- java.lang.Object
- - akka.testkit.ErrorFilter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ErrorFilter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.ErrorFilter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ErrorFilter$](ErrorFilter$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ErrorFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ErrorFilter](ErrorFilter.html "class in akka.testkit")` | `[apply](#apply(java.lang.Class,scala.Option,scala.util.Either,boolean,int))​(java.lang.Class<?> throwable,  scala.Option<java.lang.String> source,  scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,  boolean complete,  int occurrences)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Class<?>,​scala.Option<java.lang.String>,​scala.util.Either<java.lang.String,​scala.util.matching.Regex>,​java.lang.Object>>` | `[unapply](#unapply(akka.testkit.ErrorFilter))​([ErrorFilter](ErrorFilter.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ErrorFilter$](ErrorFilter$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ErrorFilter$
		
		
		
		```
		public ErrorFilter$()
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
		public [ErrorFilter](ErrorFilter.html "class in akka.testkit") apply​(java.lang.Class<?> throwable,
		                         scala.Option<java.lang.String> source,
		                         scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,
		                         boolean complete,
		                         int occurrences)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Class<?>,​scala.Option<java.lang.String>,​scala.util.Either<java.lang.String,​scala.util.matching.Regex>,​java.lang.Object>> unapply​([ErrorFilter](ErrorFilter.html "class in akka.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ErrorFilter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ErrorFilter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ErrorFilter$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/ErrorFilter$.html)*