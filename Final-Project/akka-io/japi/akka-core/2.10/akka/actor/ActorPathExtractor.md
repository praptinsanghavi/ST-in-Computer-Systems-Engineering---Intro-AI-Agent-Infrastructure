---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPathExtractor.html
title: ActorPathExtractor
---

# ActorPathExtractor

## Content

Package [akka.actor](package-summary.html)
## Class ActorPathExtractor

- java.lang.Object
- - akka.actor.ActorPathExtractor

- ---

```
public class ActorPathExtractor
extends java.lang.Object
```

Given an ActorPath it returns the Address and the path elements if the path is well\-formed

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorPathExtractor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected static scala.collection.immutable.List<java.lang.String>` | `[split](#split(java.lang.String,java.lang.String))​(java.lang.String s,  java.lang.String fragment)` |  |
	| `static scala.Option<scala.Tuple2<[Address](Address.html "class in akka.actor"),​scala.collection.immutable.Iterable<java.lang.String>>>` | `[unapply](#unapply(java.lang.String))​(java.lang.String addr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorPathExtractor
		
		
		
		```
		public ActorPathExtractor()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Address](Address.html "class in akka.actor"),​scala.collection.immutable.Iterable<java.lang.String>>> unapply​(java.lang.String addr)
		```
		- #### split
		
		
		
		```
		protected static scala.collection.immutable.List<java.lang.String> split​(java.lang.String s,
		                                                                         java.lang.String fragment)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPathExtractor.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPathExtractor.html)*