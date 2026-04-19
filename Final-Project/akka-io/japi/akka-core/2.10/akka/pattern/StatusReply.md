---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.Success$.html
title: StatusReply.Success$
---

# StatusReply.Success$

## Content

Package [akka.pattern](package-summary.html)
## Class StatusReply.Success$

- java.lang.Object
- - akka.pattern.StatusReply.Success$

- Enclosing class:
[StatusReply](StatusReply.html "class in akka.pattern")\<[T](StatusReply.html "type parameter in StatusReply")\>

---

```
public static class StatusReply.Success$
extends java.lang.Object
```

Scala API for creation and pattern matching a successful response.
 
 For example:
 `case StatusReply.Success(value: String) => ...`

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StatusReply.Success$](StatusReply.Success$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Success$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [StatusReply](StatusReply.html "class in akka.pattern")<T>` | `[apply](#apply(T))​(T value)` | Scala API: Create a successful reply containing `value` |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.pattern.StatusReply))​([StatusReply](StatusReply.html "class in akka.pattern")<java.lang.Object> status)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StatusReply.Success$](StatusReply.Success$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Success$
		
		
		
		```
		public Success$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [StatusReply](StatusReply.html "class in akka.pattern")<T> apply​(T value)
		```
		
		Scala API: Create a successful reply containing `value`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([StatusReply](StatusReply.html "class in akka.pattern")<java.lang.Object> status)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.Success$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.Success$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.Success$.html)*