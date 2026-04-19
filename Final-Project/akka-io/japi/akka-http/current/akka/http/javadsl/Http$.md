---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http$.html
title: Http$
---

# Http$

## Content

Package [akka.http.javadsl](package-summary.html)
## Class Http$

- java.lang.Object
- - akka.http.javadsl.Http$

- All Implemented Interfaces:
`akka.actor.ExtensionId<[Http](Http.html "class in akka.http.javadsl")>`, `akka.actor.ExtensionIdProvider`

---

```
public class Http$
extends java.lang.Object
implements akka.actor.ExtensionId<[Http](Http.html "class in akka.http.javadsl")>, akka.actor.ExtensionIdProvider
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http$](Http$.html "class in akka.http.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Http](Http.html "class in akka.http.javadsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |
	| `[Http](Http.html "class in akka.http.javadsl")` | `[get](#get(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `[Http](Http.html "class in akka.http.javadsl")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[Http$](Http$.html "class in akka.http.javadsl")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.ExtensionId
		
		
		`apply, apply, equals, hashCode`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http$](Http$.html "class in akka.http.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http$
		
		
		
		```
		public Http$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [Http](Http.html "class in akka.http.javadsl") get​(akka.actor.ActorSystem system)
		```
		
		
		Specified by:
		`get` in interface `akka.actor.ExtensionId<[Http](Http.html "class in akka.http.javadsl")>`
		- #### get
		
		
		
		```
		public [Http](Http.html "class in akka.http.javadsl") get​(akka.actor.ClassicActorSystemProvider system)
		```
		
		
		Specified by:
		`get` in interface `akka.actor.ExtensionId<[Http](Http.html "class in akka.http.javadsl")>`
		- #### lookup
		
		
		
		```
		public [Http$](Http$.html "class in akka.http.javadsl") lookup()
		```
		
		
		Specified by:
		`lookup` in interface `akka.actor.ExtensionIdProvider`
		- #### createExtension
		
		
		
		```
		public [Http](Http.html "class in akka.http.javadsl") createExtension​(akka.actor.ExtendedActorSystem system)
		```
		
		
		Specified by:
		`createExtension` in interface `akka.actor.ExtensionId<[Http](Http.html "class in akka.http.javadsl")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http$.html)*