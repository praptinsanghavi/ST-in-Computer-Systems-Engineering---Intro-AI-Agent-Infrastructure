---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EventSeq.html
title: EventSeq
---

# EventSeq

## Content

Package [akka.persistence.typed](package-summary.html)
## Interface EventSeq\<A\>

- All Known Implementing Classes:
`[EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.typed")`

---

```
public interface EventSeq<A>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[A](EventSeq.html "type parameter in EventSeq")>` | `[events](#events())()` |  |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `boolean` | `[nonEmpty](#nonEmpty())()` |  |
	| `int` | `[size](#size())()` |  |

- - ### Method Detail
	
	
	
		- #### events
		
		
		
		```
		scala.collection.immutable.Seq<[A](EventSeq.html "type parameter in EventSeq")> events()
		```
		- #### isEmpty
		
		
		
		```
		boolean isEmpty()
		```
		- #### nonEmpty
		
		
		
		```
		boolean nonEmpty()
		```
		- #### size
		
		
		
		```
		int size()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EmptyEventSeq$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EventSeq.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EventSeq.html)*