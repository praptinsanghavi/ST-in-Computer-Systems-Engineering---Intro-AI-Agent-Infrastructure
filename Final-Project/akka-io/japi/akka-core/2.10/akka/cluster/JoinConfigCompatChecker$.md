---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/JoinConfigCompatChecker$.html
title: JoinConfigCompatChecker$
---

# JoinConfigCompatChecker$

## Content

Package [akka.cluster](package-summary.html)
## Class JoinConfigCompatChecker$

- java.lang.Object
- - akka.cluster.JoinConfigCompatChecker$

- ---

```
public class JoinConfigCompatChecker$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JoinConfigCompatChecker$](JoinConfigCompatChecker$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JoinConfigCompatChecker$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ConfigValidation](ConfigValidation.html "interface in akka.cluster")` | `[exists](#exists(scala.collection.immutable.Seq,com.typesafe.config.Config))​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,  com.typesafe.config.Config toCheck)` | Checks that all `requiredKeys` are available in `toCheck` Config. |
	| `[ConfigValidation](ConfigValidation.html "interface in akka.cluster")` | `[fullMatch](#fullMatch(scala.collection.immutable.Seq,com.typesafe.config.Config,com.typesafe.config.Config))​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,  com.typesafe.config.Config toCheck,  com.typesafe.config.Config actualConfig)` | Checks that all `requiredKeys` are available in `toCheck` Config  and its values match exactly the values in `currentConfig`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JoinConfigCompatChecker$](JoinConfigCompatChecker$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JoinConfigCompatChecker$
		
		
		
		```
		public JoinConfigCompatChecker$()
		```

	- ### Method Detail
	
	
	
		- #### exists
		
		
		
		```
		public [ConfigValidation](ConfigValidation.html "interface in akka.cluster") exists​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,
		                               com.typesafe.config.Config toCheck)
		```
		
		Checks that all `requiredKeys` are available in `toCheck` Config.
		 
		
		Parameters:
		`requiredKeys` \- \- a Seq of required keys
		`toCheck` \- \- the Config instance to be checked
		- #### fullMatch
		
		
		
		```
		public [ConfigValidation](ConfigValidation.html "interface in akka.cluster") fullMatch​(scala.collection.immutable.Seq<java.lang.String> requiredKeys,
		                                  com.typesafe.config.Config toCheck,
		                                  com.typesafe.config.Config actualConfig)
		```
		
		Checks that all `requiredKeys` are available in `toCheck` Config
		 and its values match exactly the values in `currentConfig`.
		 
		
		Parameters:
		`requiredKeys` \- \- a Seq of required keys
		`toCheck` \- \- the Config instance to be checked
		`actualConfig` \- \- the Config instance containing the expected values

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ConfigValidation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/JoinConfigCompatChecker$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/JoinConfigCompatChecker$.html)*