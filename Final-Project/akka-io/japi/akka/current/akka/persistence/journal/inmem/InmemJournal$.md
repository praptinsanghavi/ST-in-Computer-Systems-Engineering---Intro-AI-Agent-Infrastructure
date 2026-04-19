---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemJournal$.html
title: InmemJournal$
---

# InmemJournal$

## Content

Package [akka.persistence.journal.inmem](package-summary.html)
## Class InmemJournal$

- java.lang.Object
- - akka.persistence.journal.inmem.InmemJournal$

- ---

```
public class InmemJournal$
extends java.lang.Object
```

The InmemJournal publishes writes and deletes to the `eventStream`, which tests may use to
 verify that expected events have been persisted or deleted.
 
 InmemJournal is only intended to be used for tests and therefore binary backwards compatibility
 of the published messages are not guaranteed.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InmemJournal$](InmemJournal$.html "class in akka.persistence.journal.inmem")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InmemJournal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InmemJournal$](InmemJournal$.html "class in akka.persistence.journal.inmem") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InmemJournal$
		
		
		
		```
		public InmemJournal$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemJournal$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemJournal$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemJournal$.html)*