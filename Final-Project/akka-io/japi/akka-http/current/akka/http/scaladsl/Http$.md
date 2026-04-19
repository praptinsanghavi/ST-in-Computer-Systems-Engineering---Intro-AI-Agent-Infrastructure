---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http$.html
title: Http$
---

# Http$

## Content

Package [akka.http.scaladsl](package-summary.html)
## Class Http$

- java.lang.Object
- - akka.http.scaladsl.Http$

- All Implemented Interfaces:
`akka.actor.ExtensionId<[HttpExt](HttpExt.html "class in akka.http.scaladsl")>`, `akka.actor.ExtensionIdProvider`

---

```
public class Http$
extends java.lang.Object
implements akka.actor.ExtensionId<[HttpExt](HttpExt.html "class in akka.http.scaladsl")>, akka.actor.ExtensionIdProvider
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http$](Http$.html "class in akka.http.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpExt](HttpExt.html "class in akka.http.scaladsl")` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `[HttpExt](HttpExt.html "class in akka.http.scaladsl")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `akka.stream.Attributes` | `[cancellationStrategyAttributeForDelay](#cancellationStrategyAttributeForDelay(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration delay)` |  |
	| `[HttpExt](HttpExt.html "class in akka.http.scaladsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |
	| `[Http$](Http$.html "class in akka.http.scaladsl")` | `[lookup](#lookup())()` |  |
	| `akka.stream.Attributes` | `[prepareAttributes](#prepareAttributes(akka.http.scaladsl.settings.ServerSettings,akka.stream.scaladsl.Tcp.IncomingConnection))​([ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.stream.scaladsl.Tcp.IncomingConnection incoming)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.ExtensionId
		
		
		`equals, get, get, hashCode`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http$](Http$.html "class in akka.http.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http$
		
		
		
		```
		public Http$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpExt](HttpExt.html "class in akka.http.scaladsl") apply​(akka.actor.ClassicActorSystemProvider system)
		```
		
		
		Specified by:
		`apply` in interface `akka.actor.ExtensionId<[HttpExt](HttpExt.html "class in akka.http.scaladsl")>`
		- #### apply
		
		
		
		```
		public [HttpExt](HttpExt.html "class in akka.http.scaladsl") apply​(akka.actor.ActorSystem system)
		```
		
		
		Specified by:
		`apply` in interface `akka.actor.ExtensionId<[HttpExt](HttpExt.html "class in akka.http.scaladsl")>`
		- #### lookup
		
		
		
		```
		public [Http$](Http$.html "class in akka.http.scaladsl") lookup()
		```
		
		
		Specified by:
		`lookup` in interface `akka.actor.ExtensionIdProvider`
		- #### createExtension
		
		
		
		```
		public [HttpExt](HttpExt.html "class in akka.http.scaladsl") createExtension​(akka.actor.ExtendedActorSystem system)
		```
		
		
		Specified by:
		`createExtension` in interface `akka.actor.ExtensionId<[HttpExt](HttpExt.html "class in akka.http.scaladsl")>`
		- #### prepareAttributes
		
		
		
		```
		public akka.stream.Attributes prepareAttributes​([ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                akka.stream.scaladsl.Tcp.IncomingConnection incoming)
		```
		- #### cancellationStrategyAttributeForDelay
		
		
		
		```
		public akka.stream.Attributes cancellationStrategyAttributeForDelay​(scala.concurrent.duration.FiniteDuration delay)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http$.html)*