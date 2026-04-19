---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter$.html
title: Counter$
---

# Counter$

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class Counter$

- java.lang.Object
- - akka.persistence.typed.crdt.Counter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Counter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.crdt.Counter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Counter$](Counter$.html "class in akka.persistence.typed.crdt")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Counter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Counter](Counter.html "class in akka.persistence.typed.crdt")` | `[apply](#apply(scala.math.BigInt))​(scala.math.BigInt value)` |  |
	| `[Counter](Counter.html "class in akka.persistence.typed.crdt")` | `[empty](#empty())()` |  |
	| `scala.Option<scala.math.BigInt>` | `[unapply](#unapply(akka.persistence.typed.crdt.Counter))​([Counter](Counter.html "class in akka.persistence.typed.crdt") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Counter$](Counter$.html "class in akka.persistence.typed.crdt") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Counter$
		
		
		
		```
		public Counter$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [Counter](Counter.html "class in akka.persistence.typed.crdt") empty()
		```
		- #### apply
		
		
		
		```
		public [Counter](Counter.html "class in akka.persistence.typed.crdt") apply​(scala.math.BigInt value)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.math.BigInt> unapply​([Counter](Counter.html "class in akka.persistence.typed.crdt") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter$.html)*