---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html
title: ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond
---

# ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond

- java.lang.Object
- - akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond

- All Implemented Interfaces:
`[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")<U>`

Direct Known Subclasses:
`[ProcessingPolicy.DefaultPolicies.CountNextNCond](ProcessingPolicy.DefaultPolicies.CountNextNCond.html "class in akka.persistence.testkit")`

Enclosing interface:
[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")\<[U](ProcessingPolicy.DefaultPolicies.html "type parameter in ProcessingPolicy.DefaultPolicies")\>

---

```
public static class ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond
extends java.lang.Object
implements [ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")<U>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.testkit.[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")
		
		
		`[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[U](ProcessingPolicy.DefaultPolicies.html "type parameter in ProcessingPolicy.DefaultPolicies")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReturnAfterNextNCond](#%3Cinit%3E(scala.Function0,scala.Function0,scala.Function2))​(scala.Function0<[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")> returnOnTrigger,  scala.Function0<[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")> returnNonTrigger,  scala.Function2<java.lang.String,​U,​java.lang.Object> cond)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")` | `[tryProcess](#tryProcess(java.lang.String,U))​(java.lang.String persistenceId,  U processingUnit)` | Emulates behavior of the storage. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReturnAfterNextNCond
		
		
		
		```
		public ReturnAfterNextNCond​(scala.Function0<[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")> returnOnTrigger,
		                            scala.Function0<[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")> returnNonTrigger,
		                            scala.Function2<java.lang.String,​U,​java.lang.Object> cond)
		```

	- ### Method Detail
	
	
	
		- #### tryProcess
		
		
		
		```
		public [ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit") tryProcess​(java.lang.String persistenceId,
		                                   U processingUnit)
		```
		
		Description copied from interface: `[ProcessingPolicy](ProcessingPolicy.html#tryProcess(java.lang.String,U))`
		Emulates behavior of the storage.
		 The function is invoked when any of the plugin's operations is executed.
		 If you need this operation to succeed return [`ProcessingSuccess`](ProcessingSuccess.html "class in akka.persistence.testkit"),
		 otherwise you should return some of the [`ProcessingFailure`](ProcessingFailure.html "interface in akka.persistence.testkit")'s.
		 
		
		Specified by:
		`[tryProcess](ProcessingPolicy.html#tryProcess(java.lang.String,U))` in interface `[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")<U>`
		Parameters:
		`persistenceId` \- persistenceId or other id of the processing operation
		`processingUnit` \- details about current operation to be executed
		Returns:
		needed result of processing the operation

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.CountNextNCond.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html)*