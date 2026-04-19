---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html
title: InternalReprSupport
---

# InternalReprSupport

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Interface InternalReprSupport\<R\>

- All Known Subinterfaces:
`[EventStorage](../EventStorage.html "interface in akka.persistence.testkit")`, `[InMemStorage](InMemStorage.html "interface in akka.persistence.testkit.internal")<K,​R>`, `[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")`, `[TestKitStorage](TestKitStorage.html "interface in akka.persistence.testkit.internal")<P,​R>`

---

```
public interface InternalReprSupport<R>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[toInternal](#toInternal(R))​([R](InternalReprSupport.html "type parameter in InternalReprSupport") repr)` |  |
	| `[R](InternalReprSupport.html "type parameter in InternalReprSupport")` | `[toRepr](#toRepr(java.lang.Object))​(java.lang.Object internal)` |  |

- - ### Method Detail
	
	
	
		- #### toInternal
		
		
		
		```
		java.lang.Object toInternal​([R](InternalReprSupport.html "type parameter in InternalReprSupport") repr)
		```
		- #### toRepr
		
		
		
		```
		[R](InternalReprSupport.html "type parameter in InternalReprSupport") toRepr​(java.lang.Object internal)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/EventStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InMemStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html)*