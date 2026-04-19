---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage$.html
title: GracefulTerminatorStage$
---

# GracefulTerminatorStage$

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class GracefulTerminatorStage$

- java.lang.Object
- - akka.http.impl.engine.server.GracefulTerminatorStage$

- ---

```
public class GracefulTerminatorStage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GracefulTerminatorStage$](GracefulTerminatorStage$.html "class in akka.http.impl.engine.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GracefulTerminatorStage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[apply](#apply(akka.actor.ActorSystem,akka.http.scaladsl.settings.ServerSettings))​(akka.actor.ActorSystem system,  [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GracefulTerminatorStage$](GracefulTerminatorStage$.html "class in akka.http.impl.engine.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GracefulTerminatorStage$
		
		
		
		```
		public GracefulTerminatorStage$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")> apply​(akka.actor.ActorSystem system,
		                                                                                                                                       [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage$.html)*