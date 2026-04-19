---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceEffect$.html
title: PersistenceEffect$
---

# PersistenceEffect$

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class PersistenceEffect$

- java.lang.Object
- - akka.persistence.testkit.javadsl.PersistenceEffect$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PersistenceEffect$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.testkit.javadsl.PersistenceEffect$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceEffect$](PersistenceEffect$.html "class in akka.persistence.testkit.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceEffect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.javadsl")<T>` | `[apply](#apply(T,long,java.util.Set))​(T persistedObject,  long sequenceNr,  java.util.Set<java.lang.String> tags)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple3<T,​java.lang.Object,​java.util.Set<java.lang.String>>>` | `[unapply](#unapply(akka.persistence.testkit.javadsl.PersistenceEffect))​([PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.javadsl")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceEffect$](PersistenceEffect$.html "class in akka.persistence.testkit.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistenceEffect$
		
		
		
		```
		public PersistenceEffect$()
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
		public <T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.javadsl")<T> apply​(T persistedObject,
		                                      long sequenceNr,
		                                      java.util.Set<java.lang.String> tags)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple3<T,​java.lang.Object,​java.util.Set<java.lang.String>>> unapply​([PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.javadsl")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceEffect$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceEffect.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceEffect$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceEffect$.html)*