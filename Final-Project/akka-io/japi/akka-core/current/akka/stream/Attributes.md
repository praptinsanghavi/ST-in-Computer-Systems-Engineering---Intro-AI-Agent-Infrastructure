---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:00:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy$.html
title: Attributes.NestedMaterializationCancellationPolicy$
---

# Attributes.NestedMaterializationCancellationPolicy$

## Content

Package [akka.stream](package-summary.html)
## Class Attributes.NestedMaterializationCancellationPolicy$

- java.lang.Object
- - akka.stream.Attributes.NestedMaterializationCancellationPolicy$

- Enclosing class:
[Attributes](Attributes.html "class in akka.stream")

---

```
public static class Attributes.NestedMaterializationCancellationPolicy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Attributes.NestedMaterializationCancellationPolicy$](Attributes.NestedMaterializationCancellationPolicy$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NestedMaterializationCancellationPolicy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream")` | `[Default](#Default())()` | Default [`Attributes.NestedMaterializationCancellationPolicy`](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream"),  please see {@link akka.stream.Attributes.NestedMaterializationCancellationPolicy.EagerCancellation()} for details. |
	| `[Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream")` | `[EagerCancellation](#EagerCancellation())()` | A [`Attributes.NestedMaterializationCancellationPolicy`](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") that configures graph stages  delaying nested flow materialization to cancel immediately when downstream cancels before  nested flow materialization. |
	| `[Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream")` | `[PropagateToNested](#PropagateToNested())()` | A [`Attributes.NestedMaterializationCancellationPolicy`](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") that configures graph stages  delaying nested flow materialization to delay cancellation when downstream cancels before  nested flow materialization. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Attributes.NestedMaterializationCancellationPolicy$](Attributes.NestedMaterializationCancellationPolicy$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NestedMaterializationCancellationPolicy$
		
		
		
		```
		public NestedMaterializationCancellationPolicy$()
		```

	- ### Method Detail
	
	
	
		- #### EagerCancellation
		
		
		
		```
		public [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") EagerCancellation()
		```
		
		A [`Attributes.NestedMaterializationCancellationPolicy`](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") that configures graph stages
		 delaying nested flow materialization to cancel immediately when downstream cancels before
		 nested flow materialization.
		 This applies to `akka.stream.scaladsl.FlowOps.flatMapPrefix`, `akka.stream.scaladsl.Flow.futureFlow` and derived operators.
		- #### PropagateToNested
		
		
		
		```
		public [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") PropagateToNested()
		```
		
		A [`Attributes.NestedMaterializationCancellationPolicy`](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") that configures graph stages
		 delaying nested flow materialization to delay cancellation when downstream cancels before
		 nested flow materialization. Once the nested flow is materialized it will be cancelled immediately.
		 This applies to `akka.stream.scaladsl.FlowOps.flatMapPrefix`, `akka.stream.scaladsl.Flow.futureFlow` and derived operators.
		- #### Default
		
		
		
		```
		public [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") Default()
		```
		
		Default [`Attributes.NestedMaterializationCancellationPolicy`](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream"),
		 please see {@link akka.stream.Attributes.NestedMaterializationCancellationPolicy.EagerCancellation()} for details.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy$.html)*