---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPaths.html
title: ActorPaths
---

# ActorPaths

## Content

Package [akka.actor](package-summary.html)
## Class ActorPaths

- java.lang.Object
- - akka.actor.ActorPaths

- ---

```
public class ActorPaths
extends java.lang.Object
```

Java API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorPaths](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ActorPath](ActorPath.html "interface in akka.actor")` | `[fromString](#fromString(java.lang.String))​(java.lang.String s)` | Parse string as actor path; throws java.net.MalformedURLException if unable to do so. |
	| `static boolean` | `[isValidPathElement](#isValidPathElement(java.lang.String))​(java.lang.String s)` | This method is used to validate a path element (Actor Name). |
	| `static void` | `[validatePathElement](#validatePathElement(java.lang.String))​(java.lang.String element)` | Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid. |
	| `static void` | `[validatePathElement](#validatePathElement(java.lang.String,java.lang.String))​(java.lang.String element,  java.lang.String fullPath)` | Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorPaths
		
		
		
		```
		public ActorPaths()
		```

	- ### Method Detail
	
	
	
		- #### fromString
		
		
		
		```
		public static [ActorPath](ActorPath.html "interface in akka.actor") fromString​(java.lang.String s)
		```
		
		Parse string as actor path; throws java.net.MalformedURLException if unable to do so.
		- #### validatePathElement
		
		
		
		```
		public static final void validatePathElement​(java.lang.String element)
		```
		
		Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid.
		 See [`isValidPathElement(java.lang.String)`](#isValidPathElement(java.lang.String)) for a non\-throwing version.
		 
		
		Parameters:
		`element` \- actor path element to be validated
		- #### validatePathElement
		
		
		
		```
		public static final void validatePathElement​(java.lang.String element,
		                                             java.lang.String fullPath)
		```
		
		Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid.
		 See [`isValidPathElement(java.lang.String)`](#isValidPathElement(java.lang.String)) for a non\-throwing version.
		 
		
		Parameters:
		`element` \- actor path element to be validated
		`fullPath` \- optional fullPath element that may be included for better error messages; null if not given
		- #### isValidPathElement
		
		
		
		```
		public static final boolean isValidPathElement​(java.lang.String s)
		```
		
		This method is used to validate a path element (Actor Name).
		 Since Actors form a tree, it is addressable using an URL, therefore an Actor Name has to conform to:
		 [RFC\-2396](https://www.ietf.org/rfc/rfc2396.txt).
		 
		 User defined Actor names may not start from a `$` sign \- these are reserved for system names.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPaths.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPaths.html)*