---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/RelativeActorPath.html
title: RelativeActorPath
---

# RelativeActorPath

## Content

Package [akka.actor](package-summary.html)
## Class RelativeActorPath

- java.lang.Object
- - akka.actor.RelativeActorPath

- ---

```
public class RelativeActorPath
extends java.lang.Object
```

Extractor for so\-called \&ldquo;relative actor paths\&rdquo; as in \&ldquo;relative URI\&rdquo;, not in
 \&ldquo;relative to some actor\&rdquo;. Examples:
 
 \* "grand/child"
 \* "/user/hello/world"

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RelativeActorPath](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected static scala.collection.immutable.List<java.lang.String>` | `[split](#split(java.lang.String,java.lang.String))​(java.lang.String s,  java.lang.String fragment)` |  |
	| `static scala.Option<scala.collection.immutable.Seq<java.lang.String>>` | `[unapply](#unapply(java.lang.String))​(java.lang.String addr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RelativeActorPath
		
		
		
		```
		public RelativeActorPath()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Seq<java.lang.String>> unapply​(java.lang.String addr)
		```
		- #### split
		
		
		
		```
		protected static scala.collection.immutable.List<java.lang.String> split​(java.lang.String s,
		                                                                         java.lang.String fragment)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/RelativeActorPath.html](https://doc.akka.io/japi/akka/current/akka/actor/RelativeActorPath.html)*