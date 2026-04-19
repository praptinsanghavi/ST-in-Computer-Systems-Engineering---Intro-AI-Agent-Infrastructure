---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html
title: ProcessingPolicy.DefaultPolicies.PassAll$
---

# ProcessingPolicy.DefaultPolicies.PassAll$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ProcessingPolicy.DefaultPolicies.PassAll$

- java.lang.Object
- - akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.PassAll$

- All Implemented Interfaces:
`[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")<U>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")\<[U](ProcessingPolicy.DefaultPolicies.html "type parameter in ProcessingPolicy.DefaultPolicies")\>

---

```
public static class ProcessingPolicy.DefaultPolicies.PassAll$
extends java.lang.Object
implements [ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")<U>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.PassAll$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.testkit.[ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")
		
		
		`[ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[U](ProcessingPolicy.DefaultPolicies.html "type parameter in ProcessingPolicy.DefaultPolicies")>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PassAll$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")` | `[tryProcess](#tryProcess(java.lang.String,U))​(java.lang.String persistenceId,  U processingUnit)` | Emulates behavior of the storage. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PassAll$
		
		
		
		```
		public PassAll$()
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
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html)*