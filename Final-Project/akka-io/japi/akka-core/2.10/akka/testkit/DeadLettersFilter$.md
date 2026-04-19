---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:19:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DeadLettersFilter$.html
title: DeadLettersFilter$
---

# DeadLettersFilter$

## Content

Package [akka.testkit](package-summary.html)
## Class DeadLettersFilter$

- java.lang.Object
- - akka.testkit.DeadLettersFilter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DeadLettersFilter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.DeadLettersFilter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeadLettersFilter$](DeadLettersFilter$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeadLettersFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit")` | `[apply](#apply(java.lang.Class,int))​(java.lang.Class<?> messageClass,  int occurrences)` | Filter which matches DeadLetter events, if the wrapped message conforms to the  given type. |
	| `<T> [DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit")` | `[apply](#apply(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> t)` |  |
	| `scala.Option<java.lang.Class<?>>` | `[unapply](#unapply(akka.testkit.DeadLettersFilter))​([DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeadLettersFilter$](DeadLettersFilter$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeadLettersFilter$
		
		
		
		```
		public DeadLettersFilter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit") apply​(scala.reflect.ClassTag<T> t)
		```
		- #### apply
		
		
		
		```
		public [DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit") apply​(java.lang.Class<?> messageClass,
		                               int occurrences)
		```
		
		Filter which matches DeadLetter events, if the wrapped message conforms to the
		 given type.
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Class<?>> unapply​([DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DeadLettersFilter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DeadLettersFilter$.html)*