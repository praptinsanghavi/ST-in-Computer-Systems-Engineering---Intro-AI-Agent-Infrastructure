---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
title: JoinConfigCompatCheckSharding
---

# JoinConfigCompatCheckSharding

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class JoinConfigCompatCheckSharding

- java.lang.Object
- - [akka.cluster.JoinConfigCompatChecker](../JoinConfigCompatChecker.html "class in akka.cluster")
	- - akka.cluster.sharding.JoinConfigCompatCheckSharding

- ---

```
public final class JoinConfigCompatCheckSharding
extends [JoinConfigCompatChecker](../JoinConfigCompatChecker.html "class in akka.cluster")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JoinConfigCompatCheckSharding](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ConfigValidation](../ConfigValidation.html "interface in akka.cluster")` | `[check](#check(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config toCheck,  com.typesafe.config.Config actualConfig)` | Runs the Config check. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[requiredKeys](#requiredKeys())()` | The configuration keys that are required for this checker |
	
	
		- ### Methods inherited from class akka.cluster.[JoinConfigCompatChecker](../JoinConfigCompatChecker.html "class in akka.cluster")
		
		
		`[exists](../JoinConfigCompatChecker.html#exists(scala.collection.immutable.Seq,com.typesafe.config.Config)), [fullMatch](../JoinConfigCompatChecker.html#fullMatch(scala.collection.immutable.Seq,com.typesafe.config.Config,com.typesafe.config.Config))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JoinConfigCompatCheckSharding
		
		
		
		```
		public JoinConfigCompatCheckSharding()
		```

	- ### Method Detail
	
	
	
		- #### check
		
		
		
		```
		public [ConfigValidation](../ConfigValidation.html "interface in akka.cluster") check​(com.typesafe.config.Config toCheck,
		                              com.typesafe.config.Config actualConfig)
		```
		
		Description copied from class: `[JoinConfigCompatChecker](../JoinConfigCompatChecker.html#check(com.typesafe.config.Config,com.typesafe.config.Config))`
		Runs the Config check.
		 
		 Implementers are free to define what makes Config entry compatible or not.
		 We do provide some pre\-build checks tough: `JoinConfigCompatChecker.exists` and `JoinConfigCompatChecker.fullMatch`
		
		
		
		
		Specified by:
		`[check](../JoinConfigCompatChecker.html#check(com.typesafe.config.Config,com.typesafe.config.Config))` in class `[JoinConfigCompatChecker](../JoinConfigCompatChecker.html "class in akka.cluster")`
		Parameters:
		`toCheck` \- \- the Config instance to be checked
		`actualConfig` \- \- the Config instance containing the actual values
		Returns:
		a [`ConfigValidation`](../ConfigValidation.html "interface in akka.cluster"). Can be [`Valid`](../Valid.html "class in akka.cluster") or [`Invalid`](../Invalid.html "class in akka.cluster"), the later must contain a descriptive list of error messages.
		- #### requiredKeys
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> requiredKeys()
		```
		
		Description copied from class: `[JoinConfigCompatChecker](../JoinConfigCompatChecker.html#requiredKeys())`
		The configuration keys that are required for this checker
		
		Specified by:
		`[requiredKeys](../JoinConfigCompatChecker.html#requiredKeys())` in class `[JoinConfigCompatChecker](../JoinConfigCompatChecker.html "class in akka.cluster")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ConfigValidation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Invalid.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Valid.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/JoinConfigCompatCheckSharding.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/JoinConfigCompatCheckSharding.html)*