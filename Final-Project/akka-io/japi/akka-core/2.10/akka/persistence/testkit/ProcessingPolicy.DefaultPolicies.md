---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:50:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond.html
title: ProcessingPolicy.DefaultPolicies.RejectNextNCond
---

# ProcessingPolicy.DefaultPolicies.RejectNextNCond

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ProcessingPolicy.DefaultPolicies.RejectNextNCond

- java.lang.Object
- - [akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond](ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html "class in akka.persistence.testkit")
	- - [akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.CountNextNCond](ProcessingPolicy.DefaultPolicies.CountNextNCond.html "class in akka.persistence.testkit")
		- - akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.RejectNextNCond

- All Implemented Interfaces:
`[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")<U>`

Enclosing interface:
[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")\<[U](ProcessingPolicy.DefaultPolicies.html "type parameter in ProcessingPolicy.DefaultPolicies")\>

---

```
public static class ProcessingPolicy.DefaultPolicies.RejectNextNCond
extends [ProcessingPolicy.DefaultPolicies.CountNextNCond](ProcessingPolicy.DefaultPolicies.CountNextNCond.html "class in akka.persistence.testkit")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.testkit.[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")
		
		
		`[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[U](ProcessingPolicy.DefaultPolicies.html "type parameter in ProcessingPolicy.DefaultPolicies")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RejectNextNCond](#%3Cinit%3E(int,java.lang.Throwable,scala.Function2,scala.Function0))​(int _numberToFail,  java.lang.Throwable _failureException,  scala.Function2<java.lang.String,​U,​java.lang.Object> cond,  scala.Function0<scala.runtime.BoxedUnit> onLimitExceed)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.testkit.[ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond](ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html "class in akka.persistence.testkit")
		
		
		`[tryProcess](ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html#tryProcess(java.lang.String,U))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RejectNextNCond
		
		
		
		```
		public RejectNextNCond​(int _numberToFail,
		                       java.lang.Throwable _failureException,
		                       scala.Function2<java.lang.String,​U,​java.lang.Object> cond,
		                       scala.Function0<scala.runtime.BoxedUnit> onLimitExceed)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static void $lessinit$greater$default$4()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.CountNextNCond.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond.html)*