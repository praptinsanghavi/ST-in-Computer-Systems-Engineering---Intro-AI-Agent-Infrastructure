---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:40:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/OpCrdt.html
title: OpCrdt
---

# OpCrdt

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Interface OpCrdt\<Operation\>

- All Known Implementing Classes:
`[Counter](Counter.html "class in akka.persistence.typed.crdt")`, `[ORSet](ORSet.html "class in akka.persistence.typed.crdt")`

---

```
public interface OpCrdt<Operation>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[OpCrdt](OpCrdt.html "interface in akka.persistence.typed.crdt")` | `[applyOperation](#applyOperation(Operation))​([Operation](OpCrdt.html "type parameter in OpCrdt") op)` |  |

- - ### Method Detail
	
	
	
		- #### applyOperation
		
		
		
		```
		[OpCrdt](OpCrdt.html "interface in akka.persistence.typed.crdt") applyOperation​([Operation](OpCrdt.html "type parameter in OpCrdt") op)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/OpCrdt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/OpCrdt.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/OpCrdt.html)*