---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html
title: ReplicatedPublishedEventMetaData
---

# ReplicatedPublishedEventMetaData

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplicatedPublishedEventMetaData

- java.lang.Object
- - akka.persistence.typed.internal.ReplicatedPublishedEventMetaData

- ---

```
public final class ReplicatedPublishedEventMetaData
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedPublishedEventMetaData](#%3Cinit%3E(akka.persistence.typed.ReplicaId,akka.persistence.typed.internal.VersionVector))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId,  akka.persistence.typed.internal.VersionVector version)` | Deprecated. Use constructor with metadata parameter. |
	| `[ReplicatedPublishedEventMetaData](#%3Cinit%3E(akka.persistence.typed.ReplicaId,akka.persistence.typed.internal.VersionVector,scala.Option))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId,  akka.persistence.typed.internal.VersionVector version,  scala.Option<java.lang.Object> metadata)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[replicaId](#replicaId())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedPublishedEventMetaData
		
		
		
		```
		public ReplicatedPublishedEventMetaData​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                        akka.persistence.typed.internal.VersionVector version,
		                                        scala.Option<java.lang.Object> metadata)
		```
		- #### ReplicatedPublishedEventMetaData
		
		
		
		```
		public ReplicatedPublishedEventMetaData​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                        akka.persistence.typed.internal.VersionVector version)
		```
		
		Deprecated.
		Use constructor with metadata parameter. Since 2\.10\.1\.

	- ### Method Detail
	
	
	
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### replicaId
		
		
		
		```
		public [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html)*