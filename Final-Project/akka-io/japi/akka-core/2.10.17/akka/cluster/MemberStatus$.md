---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:18:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus$.html
title: MemberStatus$
---

# MemberStatus$

## Content

Package [akka.cluster](package-summary.html)
## Class MemberStatus$

- java.lang.Object
- - akka.cluster.MemberStatus$

- ---

```
public class MemberStatus$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MemberStatus$](MemberStatus$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MemberStatus$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[down](#down())()` | Java API: retrieve the `Down` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[exiting](#exiting())()` | Java API: retrieve the `Exiting` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[joining](#joining())()` | Java API: retrieve the `Joining` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[leaving](#leaving())()` | Java API: retrieve the `Leaving` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[removed](#removed())()` | Java API: retrieve the `Removed` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[shutDown](#shutDown())()` | Java API: retrieve the `ShutDown` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[shuttingDown](#shuttingDown())()` | Java API: retrieve the `ShuttingDown` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[up](#up())()` | Java API: retrieve the `Up` status singleton |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[weaklyUp](#weaklyUp())()` | Java API: retrieve the `WeaklyUp` status singleton. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MemberStatus$](MemberStatus$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MemberStatus$
		
		
		
		```
		public MemberStatus$()
		```

	- ### Method Detail
	
	
	
		- #### joining
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") joining()
		```
		
		Java API: retrieve the `Joining` status singleton
		- #### weaklyUp
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") weaklyUp()
		```
		
		Java API: retrieve the `WeaklyUp` status singleton.
		- #### up
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") up()
		```
		
		Java API: retrieve the `Up` status singleton
		- #### leaving
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") leaving()
		```
		
		Java API: retrieve the `Leaving` status singleton
		- #### exiting
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") exiting()
		```
		
		Java API: retrieve the `Exiting` status singleton
		- #### down
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") down()
		```
		
		Java API: retrieve the `Down` status singleton
		- #### removed
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") removed()
		```
		
		Java API: retrieve the `Removed` status singleton
		- #### shuttingDown
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") shuttingDown()
		```
		
		Java API: retrieve the `ShuttingDown` status singleton
		- #### shutDown
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") shutDown()
		```
		
		Java API: retrieve the `ShutDown` status singleton

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus$.html)*