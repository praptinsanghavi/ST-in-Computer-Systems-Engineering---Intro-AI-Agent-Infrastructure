---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestKitUtils$.html
title: TestKitUtils$
---

# TestKitUtils$

## Content

Package [akka.testkit](package-summary.html)
## Class TestKitUtils$

- java.lang.Object
- - akka.testkit.TestKitUtils$

- ---

```
public class TestKitUtils$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestKitUtils$](TestKitUtils$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitUtils$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[scrubActorSystemName](#scrubActorSystemName(java.lang.String))​(java.lang.String name)` | Sanitize the `name` to be used as valid actor system name by  replacing invalid characters. |
	| `java.lang.String` | `[testNameFromCallStack](#testNameFromCallStack(java.lang.Class,scala.util.matching.Regex))​(java.lang.Class<?> classToStartFrom,  scala.util.matching.Regex testKitRegex)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestKitUtils$](TestKitUtils$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestKitUtils$
		
		
		
		```
		public TestKitUtils$()
		```

	- ### Method Detail
	
	
	
		- #### testNameFromCallStack
		
		
		
		```
		public java.lang.String testNameFromCallStack​(java.lang.Class<?> classToStartFrom,
		                                              scala.util.matching.Regex testKitRegex)
		```
		- #### scrubActorSystemName
		
		
		
		```
		public java.lang.String scrubActorSystemName​(java.lang.String name)
		```
		
		Sanitize the `name` to be used as valid actor system name by
		 replacing invalid characters. `name` may for example be a fully qualified
		 class name and then the short class name will be used.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/testkit/TestKitUtils$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestKitUtils$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestKitUtils$.html)*