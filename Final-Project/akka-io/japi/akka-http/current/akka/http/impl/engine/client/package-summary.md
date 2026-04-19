---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html
title: akka.http.impl.engine.client
---

# akka.http.impl.engine.client

## Content

# Package akka.http.impl.engine.client

- Interface Summary 
| Interface | Description |
| [HttpsProxyGraphStage.State](HttpsProxyGraphStage.State.html "interface in akka.http.impl.engine.client") |  |
| --- | --- |
| [PoolId.PoolUsage](PoolId.PoolUsage.html "interface in akka.http.impl.engine.client") |  |
| [PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client") | The pool interface is a push style interface to a pool of connections against a single host. |
| [PoolInterface.ShutdownReason](PoolInterface.ShutdownReason.html "interface in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolInterfaceStatus](PoolMasterActor.PoolInterfaceStatus.html "interface in akka.http.impl.engine.client") |  |
- Class Summary 
| Class | Description |
| [HttpsProxyGraphStage](HttpsProxyGraphStage.html "class in akka.http.impl.engine.client") | INTERNAL API |
| --- | --- |
| [HttpsProxyGraphStage.Connected$](HttpsProxyGraphStage.Connected$.html "class in akka.http.impl.engine.client") |  |
| [HttpsProxyGraphStage.Connecting$](HttpsProxyGraphStage.Connecting$.html "class in akka.http.impl.engine.client") |  |
| [HttpsProxyGraphStage.Starting$](HttpsProxyGraphStage.Starting$.html "class in akka.http.impl.engine.client") |  |
| [HttpsProxyGraphStage$](HttpsProxyGraphStage$.html "class in akka.http.impl.engine.client") | INTERNAL API |
| [OutgoingConnectionBlueprint](OutgoingConnectionBlueprint.html "class in akka.http.impl.engine.client") | INTERNAL API |
| [OutgoingConnectionBlueprint.PrepareResponse](OutgoingConnectionBlueprint.PrepareResponse.html "class in akka.http.impl.engine.client") | This is essentially a three state state machine, it is either 'idle' \- waiting for a response to come in  or has seen the start of a response and is waiting for either chunks followed by MessageEnd if chunked  or just MessageEnd in the case of a strict response. |
| [OutgoingConnectionBlueprint.ResponseParsingMerge](OutgoingConnectionBlueprint.ResponseParsingMerge.html "class in akka.http.impl.engine.client") | A merge that follows this logic:  1\. |
| [OutgoingConnectionBlueprint$](OutgoingConnectionBlueprint$.html "class in akka.http.impl.engine.client") | INTERNAL API |
| [PoolFlow](PoolFlow.html "class in akka.http.impl.engine.client") | Internal API |
| [PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") |  |
| [PoolFlow.RequestContext$](PoolFlow.RequestContext$.html "class in akka.http.impl.engine.client") |  |
| [PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client") |  |
| [PoolFlow.ResponseContext$](PoolFlow.ResponseContext$.html "class in akka.http.impl.engine.client") |  |
| [PoolFlow$](PoolFlow$.html "class in akka.http.impl.engine.client") | Internal API |
| [PoolId](PoolId.html "class in akka.http.impl.engine.client") | Represents a pool by its target endpoint and settings and its designated usage (shared or unique). |
| [PoolId.SharedPool$](PoolId.SharedPool$.html "class in akka.http.impl.engine.client") |  |
| [PoolId.UniquePool](PoolId.UniquePool.html "class in akka.http.impl.engine.client") |  |
| [PoolId.UniquePool$](PoolId.UniquePool$.html "class in akka.http.impl.engine.client") |  |
| [PoolId$](PoolId$.html "class in akka.http.impl.engine.client") |  |
| [PoolInterface.PoolInterfaceStage](PoolInterface.PoolInterfaceStage.html "class in akka.http.impl.engine.client") |  |
| [PoolInterface.ShutdownReason$](PoolInterface.ShutdownReason$.html "class in akka.http.impl.engine.client") |  |
| [PoolInterface.ShutdownReason$.IdleTimeout$](PoolInterface.ShutdownReason$.IdleTimeout$.html "class in akka.http.impl.engine.client") |  |
| [PoolInterface.ShutdownReason$.ShutdownRequested$](PoolInterface.ShutdownReason$.ShutdownRequested$.html "class in akka.http.impl.engine.client") |  |
| [PoolInterface$](PoolInterface$.html "class in akka.http.impl.engine.client") |  |
| [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client") | INTERNAL API |
| [PoolMaster$](PoolMaster$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor](PoolMasterActor.html "class in akka.http.impl.engine.client") | INTERNAL API |
| [PoolMasterActor.HasBeenShutdown](PoolMasterActor.HasBeenShutdown.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.HasBeenShutdown$](PoolMasterActor.HasBeenShutdown$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolInterfaceRunning](PoolMasterActor.PoolInterfaceRunning.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolInterfaceRunning$](PoolMasterActor.PoolInterfaceRunning$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolInterfaceShuttingDown](PoolMasterActor.PoolInterfaceShuttingDown.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolInterfaceShuttingDown$](PoolMasterActor.PoolInterfaceShuttingDown$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolSize](PoolMasterActor.PoolSize.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolSize$](PoolMasterActor.PoolSize$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolStatus](PoolMasterActor.PoolStatus.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.PoolStatus$](PoolMasterActor.PoolStatus$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.SendRequest](PoolMasterActor.SendRequest.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.SendRequest$](PoolMasterActor.SendRequest$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.Shutdown](PoolMasterActor.Shutdown.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.Shutdown$](PoolMasterActor.Shutdown$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.ShutdownAll](PoolMasterActor.ShutdownAll.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.ShutdownAll$](PoolMasterActor.ShutdownAll$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.StartPool](PoolMasterActor.StartPool.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor.StartPool$](PoolMasterActor.StartPool$.html "class in akka.http.impl.engine.client") |  |
| [PoolMasterActor$](PoolMasterActor$.html "class in akka.http.impl.engine.client") |  |
| [ProxyConnectionFailedException$](ProxyConnectionFailedException$.html "class in akka.http.impl.engine.client") |  |
- Exception Summary 
| Exception | Description |
| [OutgoingConnectionBlueprint.UnexpectedConnectionClosureException](OutgoingConnectionBlueprint.UnexpectedConnectionClosureException.html "class in akka.http.impl.engine.client") |  |
| --- | --- |
| [ProxyConnectionFailedException](ProxyConnectionFailedException.html "class in akka.http.impl.engine.client") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage.Connected$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage.Connecting$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage.Starting$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage.State.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint.PrepareResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint.ResponseParsingMerge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint.UnexpectedConnectionClosureException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.ResponseContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.ResponseContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.PoolUsage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.SharedPool$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.UniquePool$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.UniquePool.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.PoolInterfaceStage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.ShutdownReason$.IdleTimeout$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.ShutdownReason$.ShutdownRequested$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.ShutdownReason$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.ShutdownReason.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceStatus.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolSize$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolSize.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolStatus$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.PoolStatus.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.SendRequest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.SendRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.Shutdown$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.Shutdown.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.ShutdownAll$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMasterActor.ShutdownAll.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html)*