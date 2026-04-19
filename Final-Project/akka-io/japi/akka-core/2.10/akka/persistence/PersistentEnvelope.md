---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentEnvelope.html
title: PersistentEnvelope
---

# PersistentEnvelope

## Content

Package [akka.persistence](package-summary.html)
## Interface PersistentEnvelope

- All Known Implementing Classes:
`[AtomicWrite](AtomicWrite.html "class in akka.persistence")`

---

```
public interface PersistentEnvelope
```

INTERNAL API
 
 Marks messages which can be resequenced by the [`AsyncWriteJournal`](journal/AsyncWriteJournal.html "interface in akka.persistence.journal").
 

 In essence it is either an `NonPersistentRepr` or [`AtomicWrite`](AtomicWrite.html "class in akka.persistence").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[payload](#payload())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |
	| `int` | `[size](#size())()` |  |

- - ### Method Detail
	
	
	
		- #### payload
		
		
		
		```
		java.lang.Object payload()
		```
		- #### sender
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") sender()
		```
		- #### size
		
		
		
		```
		int size()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentEnvelope.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentEnvelope.html)*