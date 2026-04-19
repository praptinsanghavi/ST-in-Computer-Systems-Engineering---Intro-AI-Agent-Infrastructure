---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath$.html
title: ActorPath$
---

# ActorPath$

## Content

Package [akka.actor](package-summary.html)
## Class ActorPath$

- java.lang.Object
- - akka.actor.ActorPath$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorPath$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorPath$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorPath$](ActorPath$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorPath$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[fromString](#fromString(java.lang.String))​(java.lang.String s)` | Parse string as actor path; throws java.net.MalformedURLException if unable to do so. |
	| `boolean` | `[isValidPathElement](#isValidPathElement(java.lang.String))​(java.lang.String s)` | This method is used to validate a path element (Actor Name). |
	| `void` | `[validatePathElement](#validatePathElement(java.lang.String))​(java.lang.String element)` | Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid. |
	| `void` | `[validatePathElement](#validatePathElement(java.lang.String,java.lang.String))​(java.lang.String element,  java.lang.String fullPath)` | Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorPath$](ActorPath$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorPath$
		
		
		
		```
		public ActorPath$()
		```

	- ### Method Detail
	
	
	
		- #### fromString
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") fromString​(java.lang.String s)
		```
		
		Parse string as actor path; throws java.net.MalformedURLException if unable to do so.
		- #### validatePathElement
		
		
		
		```
		public final void validatePathElement​(java.lang.String element)
		```
		
		Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid.
		 See [`isValidPathElement(java.lang.String)`](#isValidPathElement(java.lang.String)) for a non\-throwing version.
		 
		
		Parameters:
		`element` \- actor path element to be validated
		- #### validatePathElement
		
		
		
		```
		public final void validatePathElement​(java.lang.String element,
		                                      java.lang.String fullPath)
		```
		
		Validates the given actor path element and throws an [`InvalidActorNameException`](InvalidActorNameException.html "class in akka.actor") if invalid.
		 See [`isValidPathElement(java.lang.String)`](#isValidPathElement(java.lang.String)) for a non\-throwing version.
		 
		
		Parameters:
		`element` \- actor path element to be validated
		`fullPath` \- optional fullPath element that may be included for better error messages; null if not given
		- #### isValidPathElement
		
		
		
		```
		public final boolean isValidPathElement​(java.lang.String s)
		```
		
		This method is used to validate a path element (Actor Name).
		 Since Actors form a tree, it is addressable using an URL, therefore an Actor Name has to conform to:
		 [RFC\-2396](https://www.ietf.org/rfc/rfc2396.txt).
		 
		 User defined Actor names may not start from a `$` sign \- these are reserved for system names.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath$.html)*