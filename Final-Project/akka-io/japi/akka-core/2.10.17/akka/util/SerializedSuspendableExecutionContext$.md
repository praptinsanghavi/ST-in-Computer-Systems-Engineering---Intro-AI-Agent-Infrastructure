---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/SerializedSuspendableExecutionContext$.html
title: SerializedSuspendableExecutionContext$
---

# SerializedSuspendableExecutionContext$

## Content

Package [akka.util](package-summary.html)
## Class SerializedSuspendableExecutionContext$

- java.lang.Object
- - akka.util.SerializedSuspendableExecutionContext$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SerializedSuspendableExecutionContext$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.SerializedSuspendableExecutionContext$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SerializedSuspendableExecutionContext$](SerializedSuspendableExecutionContext$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializedSuspendableExecutionContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.util.SerializedSuspendableExecutionContext` | `[apply](#apply(int,scala.concurrent.ExecutionContext))​(int throughput,  scala.concurrent.ExecutionContext context)` |  |
	| `int` | `[Off](#Off())()` |  |
	| `int` | `[On](#On())()` |  |
	| `int` | `[Suspended](#Suspended())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SerializedSuspendableExecutionContext$](SerializedSuspendableExecutionContext$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SerializedSuspendableExecutionContext$
		
		
		
		```
		public SerializedSuspendableExecutionContext$()
		```

	- ### Method Detail
	
	
	
		- #### Off
		
		
		
		```
		public final int Off()
		```
		- #### On
		
		
		
		```
		public final int On()
		```
		- #### Suspended
		
		
		
		```
		public final int Suspended()
		```
		- #### apply
		
		
		
		```
		public akka.util.SerializedSuspendableExecutionContext apply​(int throughput,
		                                                             scala.concurrent.ExecutionContext context)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/SerializedSuspendableExecutionContext$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/SerializedSuspendableExecutionContext$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/SerializedSuspendableExecutionContext$.html)*