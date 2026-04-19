---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
title: ServerTerminator
---

# ServerTerminator

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Interface ServerTerminator

- All Known Implementing Classes:
`[GracefulTerminatorStage.ConnectionTerminator](GracefulTerminatorStage.ConnectionTerminator.html "class in akka.http.impl.engine.server")`, `[MasterServerTerminator](MasterServerTerminator.html "class in akka.http.impl.engine.server")`

---

```
public interface ServerTerminator
```

INTERNAL API: Used to start the termination process of an Akka HTTP server.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Http.HttpTerminated](../../../scaladsl/Http.HttpTerminated.html "class in akka.http.scaladsl")>` | `[terminate](#terminate(scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration deadline,  scala.concurrent.ExecutionContext ex)` | Initiate the termination sequence of this server. |

- - ### Method Detail
	
	
	
		- #### terminate
		
		
		
		```
		scala.concurrent.Future<[Http.HttpTerminated](../../../scaladsl/Http.HttpTerminated.html "class in akka.http.scaladsl")> terminate​(scala.concurrent.duration.FiniteDuration deadline,
		                                                       scala.concurrent.ExecutionContext ex)
		```
		
		Initiate the termination sequence of this server.
		
		Parameters:
		`deadline` \- (undocumented)
		`ex` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage.ConnectionTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HttpTerminated.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html)*