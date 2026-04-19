---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:45:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EmptyEventSeq$.html
title: EmptyEventSeq$
---

# EmptyEventSeq$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EmptyEventSeq$

- java.lang.Object
- - [akka.persistence.journal.EventSeq](EventSeq.html "class in akka.persistence.journal")
	- - akka.persistence.journal.EmptyEventSeq$

- All Implemented Interfaces:
`[EmptyEventSeq](EmptyEventSeq.html "interface in akka.persistence.journal")`

---

```
public class EmptyEventSeq$
extends [EventSeq](EventSeq.html "class in akka.persistence.journal")
implements [EmptyEventSeq](EmptyEventSeq.html "interface in akka.persistence.journal")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyEventSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Nil$` | `[events](#events())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.journal.[EventSeq](EventSeq.html "class in akka.persistence.journal")
		
		
		`[apply](EventSeq.html#apply(scala.collection.immutable.Seq)), [create](EventSeq.html#create(java.lang.Object...)), [create](EventSeq.html#create(scala.collection.immutable.Seq)), [empty](EventSeq.html#empty()), [single](EventSeq.html#single(java.lang.Object))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EmptyEventSeq$
		
		
		
		```
		public EmptyEventSeq$()
		```

	- ### Method Detail
	
	
	
		- #### events
		
		
		
		```
		public scala.collection.immutable.Nil$ events()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EmptyEventSeq$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EmptyEventSeq$.html)*