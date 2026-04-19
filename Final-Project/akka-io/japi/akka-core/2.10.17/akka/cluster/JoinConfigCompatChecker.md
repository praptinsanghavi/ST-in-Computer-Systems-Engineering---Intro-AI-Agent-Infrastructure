---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:18:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html
title: JoinConfigCompatChecker
---

# JoinConfigCompatChecker

## Content

Package [akka.cluster](package-summary.html)
## Class JoinConfigCompatChecker

- java.lang.Object
- - akka.cluster.JoinConfigCompatChecker

- Direct Known Subclasses:
`[JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "class in akka.cluster")`, `[JoinConfigCompatCheckSharding](sharding/JoinConfigCompatCheckSharding.html "class in akka.cluster.sharding")`

---

```
public abstract class JoinConfigCompatChecker
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JoinConfigCompatChecker](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ConfigValidation](ConfigValidation.html "interface in akka.cluster")` | `[check](#check(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config toCheck,  com.typesafe.config.Config actualConfig)` | Runs the Config check. |
	| `static [ConfigValidation](ConfigValidation.html "interface in akka.cluster")` | `[exists](#exists(scala.collection.immutable.Seq,com.typesafe.config.Config))​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,  com.typesafe.config.Config toCheck)` | Checks that all `requiredKeys` are available in `toCheck` Config. |
	| `static [ConfigValidation](ConfigValidation.html "interface in akka.cluster")` | `[fullMatch](#fullMatch(scala.collection.immutable.Seq,com.typesafe.config.Config,com.typesafe.config.Config))​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,  com.typesafe.config.Config toCheck,  com.typesafe.config.Config actualConfig)` | Checks that all `requiredKeys` are available in `toCheck` Config  and its values match exactly the values in `currentConfig`. |
	| `abstract scala.collection.immutable.Seq<java.lang.String>` | `[requiredKeys](#requiredKeys())()` | The configuration keys that are required for this checker |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JoinConfigCompatChecker
		
		
		
		```
		public JoinConfigCompatChecker()
		```

	- ### Method Detail
	
	
	
		- #### exists
		
		
		
		```
		public static [ConfigValidation](ConfigValidation.html "interface in akka.cluster") exists​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,
		                                      com.typesafe.config.Config toCheck)
		```
		
		Checks that all `requiredKeys` are available in `toCheck` Config.
		 
		
		Parameters:
		`requiredKeys` \- \- a Seq of required keys
		`toCheck` \- \- the Config instance to be checked
		- #### fullMatch
		
		
		
		```
		public static [ConfigValidation](ConfigValidation.html "interface in akka.cluster") fullMatch​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,
		                                         com.typesafe.config.Config toCheck,
		                                         com.typesafe.config.Config actualConfig)
		```
		
		Checks that all `requiredKeys` are available in `toCheck` Config
		 and its values match exactly the values in `currentConfig`.
		 
		
		Parameters:
		`requiredKeys` \- \- a Seq of required keys
		`toCheck` \- \- the Config instance to be checked
		`actualConfig` \- \- the Config instance containing the expected values
		- #### requiredKeys
		
		
		
		```
		public abstract scala.collection.immutable.Seq<java.lang.String> requiredKeys()
		```
		
		The configuration keys that are required for this checker
		- #### check
		
		
		
		```
		public abstract [ConfigValidation](ConfigValidation.html "interface in akka.cluster") check​(com.typesafe.config.Config toCheck,
		                                       com.typesafe.config.Config actualConfig)
		```
		
		Runs the Config check.
		 
		 Implementers are free to define what makes Config entry compatible or not.
		 We do provide some pre\-build checks tough: `JoinConfigCompatChecker.exists` and `JoinConfigCompatChecker.fullMatch`
		
		
		
		
		Parameters:
		`toCheck` \- \- the Config instance to be checked
		`actualConfig` \- \- the Config instance containing the actual values
		Returns:
		a [`ConfigValidation`](ConfigValidation.html "interface in akka.cluster"). Can be [`Valid`](Valid.html "class in akka.cluster") or [`Invalid`](Invalid.html "class in akka.cluster"), the later must contain a descriptive list of error messages.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ConfigValidation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Invalid.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Valid.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html)*