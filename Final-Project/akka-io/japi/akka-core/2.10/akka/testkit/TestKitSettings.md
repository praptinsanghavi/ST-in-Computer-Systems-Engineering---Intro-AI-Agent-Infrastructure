---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKitSettings.html
title: TestKitSettings
---

# TestKitSettings

## Content

Package [akka.testkit](package-summary.html)
## Class TestKitSettings

- java.lang.Object
- - akka.testkit.TestKitSettings

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public class TestKitSettings
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitSettings](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[Timeout](../util/Timeout.html "class in akka.util")` | `[DefaultTimeout](#DefaultTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[ExpectNoMessageDefaultTimeout](#ExpectNoMessageDefaultTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[SingleExpectDefaultTimeout](#SingleExpectDefaultTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[TestEventFilterLeeway](#TestEventFilterLeeway())()` |  |
	| `double` | `[TestTimeFactor](#TestTimeFactor())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestKitSettings
		
		
		
		```
		public TestKitSettings​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### DefaultTimeout
		
		
		
		```
		public [Timeout](../util/Timeout.html "class in akka.util") DefaultTimeout()
		```
		- #### ExpectNoMessageDefaultTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration ExpectNoMessageDefaultTimeout()
		```
		- #### SingleExpectDefaultTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration SingleExpectDefaultTimeout()
		```
		- #### TestEventFilterLeeway
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration TestEventFilterLeeway()
		```
		- #### TestTimeFactor
		
		
		
		```
		public double TestTimeFactor()
		```
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKitSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKitSettings.html)*