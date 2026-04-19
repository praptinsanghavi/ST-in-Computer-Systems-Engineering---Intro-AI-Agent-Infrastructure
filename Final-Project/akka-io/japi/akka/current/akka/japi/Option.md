---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/Option.Some$.html
title: Option.Some$
---

# Option.Some$

## Content

Package [akka.japi](package-summary.html)
## Class Option.Some$

- java.lang.Object
- - akka.japi.Option.Some$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[Option](Option.html "class in akka.japi")\<[A](Option.html "type parameter in Option")\>

---

```
public static class Option.Some$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.japi.Option.Some$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Option.Some$](Option.Some$.html "class in akka.japi")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Some$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Option.Some](Option.Some.html "class in akka.japi")<A>` | `[apply](#apply(A))​(A v)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<A>` | `[unapply](#unapply(akka.japi.Option.Some))​([Option.Some](Option.Some.html "class in akka.japi")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Option.Some$](Option.Some$.html "class in akka.japi") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Some$
		
		
		
		```
		public Some$()
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
		public <A> [Option.Some](Option.Some.html "class in akka.japi")<A> apply​(A v)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<A> unapply​([Option.Some](Option.Some.html "class in akka.japi")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/Option.Some$.html
- https://doc.akka.io/japi/akka/current/akka/japi/Option.Some.html
- https://doc.akka.io/japi/akka/current/akka/japi/Option.html
- https://doc.akka.io/japi/akka/current/akka/japi/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/Option.Some$.html](https://doc.akka.io/japi/akka/current/akka/japi/Option.Some$.html)*