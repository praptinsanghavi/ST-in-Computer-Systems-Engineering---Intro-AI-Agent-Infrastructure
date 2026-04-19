---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.SnapshotPolicies$.html
title: SnapshotStorage.SnapshotPolicies$
---

# SnapshotStorage.SnapshotPolicies$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class SnapshotStorage.SnapshotPolicies$

- java.lang.Object
- - akka.persistence.testkit.SnapshotStorage.SnapshotPolicies$

- All Implemented Interfaces:
`[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`

Enclosing interface:
[SnapshotStorage](SnapshotStorage.html "interface in akka.persistence.testkit")

---

```
public static class SnapshotStorage.SnapshotPolicies$
extends java.lang.Object
implements [ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.testkit.[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")
		
		
		`[ProcessingPolicy.DefaultPolicies.CountNextNCond](ProcessingPolicy.DefaultPolicies.CountNextNCond.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.FailNextN](ProcessingPolicy.DefaultPolicies.FailNextN.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.FailNextNCond](ProcessingPolicy.DefaultPolicies.FailNextNCond.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.RejectNextN](ProcessingPolicy.DefaultPolicies.RejectNextN.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.RejectNextNCond](ProcessingPolicy.DefaultPolicies.RejectNextNCond.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit"), [ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond](ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html "class in akka.persistence.testkit")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotStorage.SnapshotPolicies$](SnapshotStorage.SnapshotPolicies$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotPolicies$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit")` | `[FailNextN](#FailNextN())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit")` | `[FailNextNCond](#FailNextNCond())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit")` | `[PassAll](#PassAll())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit")` | `[RejectNextN](#RejectNextN())()` |  |
	| `[ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit")` | `[RejectNextNCond](#RejectNextNCond())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotStorage.SnapshotPolicies$](SnapshotStorage.SnapshotPolicies$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotPolicies$
		
		
		
		```
		public SnapshotPolicies$()
		```

	- ### Method Detail
	
	
	
		- #### PassAll
		
		
		
		```
		public [ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit") PassAll()
		```
		
		
		Specified by:
		`[PassAll](ProcessingPolicy.DefaultPolicies.html#PassAll())` in interface `[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`
		- #### RejectNextNCond
		
		
		
		```
		public [ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit") RejectNextNCond()
		```
		
		
		Specified by:
		`[RejectNextNCond](ProcessingPolicy.DefaultPolicies.html#RejectNextNCond())` in interface `[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`
		- #### FailNextNCond
		
		
		
		```
		public [ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit") FailNextNCond()
		```
		
		
		Specified by:
		`[FailNextNCond](ProcessingPolicy.DefaultPolicies.html#FailNextNCond())` in interface `[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`
		- #### FailNextN
		
		
		
		```
		public [ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit") FailNextN()
		```
		
		
		Specified by:
		`[FailNextN](ProcessingPolicy.DefaultPolicies.html#FailNextN())` in interface `[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`
		- #### RejectNextN
		
		
		
		```
		public [ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit") RejectNextN()
		```
		
		
		Specified by:
		`[RejectNextN](ProcessingPolicy.DefaultPolicies.html#RejectNextN())` in interface `[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.CountNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextN$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextN.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextNCond$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextN$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextN.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.SnapshotPolicies$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.SnapshotPolicies$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.SnapshotPolicies$.html)*