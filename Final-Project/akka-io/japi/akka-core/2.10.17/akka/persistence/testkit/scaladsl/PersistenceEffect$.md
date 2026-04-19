---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceEffect$.html
title: PersistenceEffect$
---

# PersistenceEffect$

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Class PersistenceEffect$

- java.lang.Object
- - akka.persistence.testkit.scaladsl.PersistenceEffect$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PersistenceEffect$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.testkit.scaladsl.PersistenceEffect$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceEffect$](PersistenceEffect$.html "class in akka.persistence.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceEffect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T>` | `[apply](#apply(T,long,scala.collection.immutable.Set))​(T persistedObject,  long sequenceNr,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple3<T,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.persistence.testkit.scaladsl.PersistenceEffect))​([PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceEffect$](PersistenceEffect$.html "class in akka.persistence.testkit.scaladsl") MODULE$
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
		public <T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> apply​(T persistedObject,
		                                      long sequenceNr,
		                                      scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple3<T,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceEffect$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceEffect$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceEffect$.html)*