---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager$.html
title: ClusterSingletonManager$
---

# ClusterSingletonManager$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager$

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonManager$

- ---

```
public class ClusterSingletonManager$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonManager$](ClusterSingletonManager$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonManager$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.Props,java.lang.Object,akka.cluster.singleton.ClusterSingletonManagerSettings))​([Props](../../actor/Props.html "class in akka.actor") singletonProps,  java.lang.Object terminationMessage,  [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") settings)` | Scala API: Factory method for `ClusterSingletonManager` [`Props`](../../actor/Props.html "class in akka.actor"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonManager$](ClusterSingletonManager$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSingletonManager$
		
		
		
		```
		public ClusterSingletonManager$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([Props](../../actor/Props.html "class in akka.actor") singletonProps,
		                   java.lang.Object terminationMessage,
		                   [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") settings)
		```
		
		Scala API: Factory method for `ClusterSingletonManager` [`Props`](../../actor/Props.html "class in akka.actor").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager$.html](https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager$.html)*