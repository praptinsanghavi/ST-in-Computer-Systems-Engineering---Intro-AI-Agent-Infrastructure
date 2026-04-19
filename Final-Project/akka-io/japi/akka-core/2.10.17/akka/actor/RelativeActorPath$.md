---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RelativeActorPath$.html
title: RelativeActorPath$
---

# RelativeActorPath$

## Content

Package [akka.actor](package-summary.html)
## Class RelativeActorPath$

- java.lang.Object
- - akka.actor.RelativeActorPath$

- All Implemented Interfaces:
`[PathUtils](PathUtils.html "interface in akka.actor")`

---

```
public class RelativeActorPath$
extends java.lang.Object
implements [PathUtils](PathUtils.html "interface in akka.actor")
```

Extractor for so\-called \&ldquo;relative actor paths\&rdquo; as in \&ldquo;relative URI\&rdquo;, not in
 \&ldquo;relative to some actor\&rdquo;. Examples:
 
 \* "grand/child"
 \* "/user/hello/world"

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RelativeActorPath$](RelativeActorPath$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RelativeActorPath$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<scala.collection.immutable.Seq<java.lang.String>>` | `[unapply](#unapply(java.lang.String))​(java.lang.String addr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[PathUtils](PathUtils.html "interface in akka.actor")
		
		
		`[split](PathUtils.html#split(java.lang.String,java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RelativeActorPath$](RelativeActorPath$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RelativeActorPath$
		
		
		
		```
		public RelativeActorPath$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<java.lang.String>> unapply​(java.lang.String addr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PathUtils.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RelativeActorPath$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RelativeActorPath$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RelativeActorPath$.html)*