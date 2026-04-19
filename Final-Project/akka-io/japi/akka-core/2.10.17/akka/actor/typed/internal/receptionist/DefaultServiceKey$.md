---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey$.html
title: DefaultServiceKey$
---

# DefaultServiceKey$

## Content

Package [akka.actor.typed.internal.receptionist](package-summary.html)
## Class DefaultServiceKey$

- java.lang.Object
- - akka.actor.typed.internal.receptionist.DefaultServiceKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DefaultServiceKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.receptionist.DefaultServiceKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultServiceKey$](DefaultServiceKey$.html "class in akka.actor.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultServiceKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T>` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String id,  java.lang.String typeName)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.actor.typed.internal.receptionist.DefaultServiceKey))​([DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultServiceKey$](DefaultServiceKey$.html "class in akka.actor.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultServiceKey$
		
		
		
		```
		public DefaultServiceKey$()
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
		public <T> [DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> apply​(java.lang.String id,
		                                      java.lang.String typeName)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​([DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey$.html)*