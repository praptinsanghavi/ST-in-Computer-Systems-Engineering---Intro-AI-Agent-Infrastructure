---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPathExtractor$.html
title: ActorPathExtractor$
---

# ActorPathExtractor$

## Content

Package [akka.actor](package-summary.html)
## Class ActorPathExtractor$

- java.lang.Object
- - akka.actor.ActorPathExtractor$

- All Implemented Interfaces:
`[PathUtils](PathUtils.html "interface in akka.actor")`

---

```
public class ActorPathExtractor$
extends java.lang.Object
implements [PathUtils](PathUtils.html "interface in akka.actor")
```

Given an ActorPath it returns the Address and the path elements if the path is well\-formed

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorPathExtractor$](ActorPathExtractor$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorPathExtractor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<scala.Tuple2<[Address](Address.html "class in akka.actor"),​scala.collection.immutable.Iterable<java.lang.String>>>` | `[unapply](#unapply(java.lang.String))​(java.lang.String addr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[PathUtils](PathUtils.html "interface in akka.actor")
		
		
		`[split](PathUtils.html#split(java.lang.String,java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorPathExtractor$](ActorPathExtractor$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorPathExtractor$
		
		
		
		```
		public ActorPathExtractor$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Address](Address.html "class in akka.actor"),​scala.collection.immutable.Iterable<java.lang.String>>> unapply​(java.lang.String addr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PathUtils.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPathExtractor$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPathExtractor$.html)*