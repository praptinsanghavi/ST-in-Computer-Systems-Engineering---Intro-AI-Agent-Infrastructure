---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
title: akka.http.impl.engine.server
---

# akka.http.impl.engine.server

## Content

# Package akka.http.impl.engine.server

- Interface Summary 
| Interface | Description |
| [MasterServerTerminator.State](MasterServerTerminator.State.html "interface in akka.http.impl.engine.server") |  |
| --- | --- |
| [ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server") | INTERNAL API: Used to start the termination process of an Akka HTTP server. |
- Class Summary 
| Class | Description |
| [GracefulTerminatorStage](GracefulTerminatorStage.html "class in akka.http.impl.engine.server") | INTERNAL API: See detailed docs termination process on [`Http.ServerBinding`](../../../scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl"). |
| --- | --- |
| [GracefulTerminatorStage$](GracefulTerminatorStage$.html "class in akka.http.impl.engine.server") |  |
| [HttpAttributes](HttpAttributes.html "class in akka.http.impl.engine.server") | INTERNAL API  Internally used attributes set in the HTTP pipeline. |
| [HttpAttributes.RemoteAddress](HttpAttributes.RemoteAddress.html "class in akka.http.impl.engine.server") |  |
| [HttpAttributes.RemoteAddress$](HttpAttributes.RemoteAddress$.html "class in akka.http.impl.engine.server") |  |
| [HttpAttributes.TLSSessionInfo](HttpAttributes.TLSSessionInfo.html "class in akka.http.impl.engine.server") | INTERNAL API  Internally used TLS session info in the HTTP pipeline. |
| [HttpAttributes.TLSSessionInfo$](HttpAttributes.TLSSessionInfo$.html "class in akka.http.impl.engine.server") |  |
| [HttpAttributes$](HttpAttributes$.html "class in akka.http.impl.engine.server") | INTERNAL API  Internally used attributes set in the HTTP pipeline. |
| [HttpServerBluePrint](HttpServerBluePrint.html "class in akka.http.impl.engine.server") | INTERNAL API |
| [HttpServerBluePrint.ControllerStage](HttpServerBluePrint.ControllerStage.html "class in akka.http.impl.engine.server") |  |
| [HttpServerBluePrint.PrepareRequests](HttpServerBluePrint.PrepareRequests.html "class in akka.http.impl.engine.server") | Two state stage, either transforms an incoming RequestOutput into a HttpRequest with strict entity and then pushes  that (the "idle" inHandler) or creates a HttpRequest with a streamed entity and switch to a state which will push  incoming chunks into the streaming entity until end of request is reached (the StreamedEntityCreator case in create  entity). |
| [HttpServerBluePrint.RequestTimeoutSupport](HttpServerBluePrint.RequestTimeoutSupport.html "class in akka.http.impl.engine.server") |  |
| [HttpServerBluePrint$](HttpServerBluePrint$.html "class in akka.http.impl.engine.server") | INTERNAL API |
| [InternalCustomHeader](InternalCustomHeader.html "class in akka.http.impl.engine.server") | Internal API |
| [MasterServerTerminator](MasterServerTerminator.html "class in akka.http.impl.engine.server") | INTERNAL API: Collects signals from per\-connection terminators and manages the termination process kickoff |
| [MasterServerTerminator.AliveConnectionTerminators](MasterServerTerminator.AliveConnectionTerminators.html "class in akka.http.impl.engine.server") |  |
| [MasterServerTerminator.AliveConnectionTerminators$](MasterServerTerminator.AliveConnectionTerminators$.html "class in akka.http.impl.engine.server") |  |
| [MasterServerTerminator.Terminating](MasterServerTerminator.Terminating.html "class in akka.http.impl.engine.server") |  |
| [MasterServerTerminator.Terminating$](MasterServerTerminator.Terminating$.html "class in akka.http.impl.engine.server") |  |
| [MasterServerTerminator$](MasterServerTerminator$.html "class in akka.http.impl.engine.server") | INTERNAL API |
| [UpgradeToOtherProtocolResponseHeader](UpgradeToOtherProtocolResponseHeader.html "class in akka.http.impl.engine.server") | Internal API |
| [UpgradeToOtherProtocolResponseHeader$](UpgradeToOtherProtocolResponseHeader$.html "class in akka.http.impl.engine.server") |  |
- Exception Summary 
| Exception | Description |
| [ServerTerminationDeadlineReached](ServerTerminationDeadlineReached.html "class in akka.http.impl.engine.server") | INTERNAL API |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes.RemoteAddress$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes.RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes.TLSSessionInfo$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes.TLSSessionInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpAttributes.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.ControllerStage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.PrepareRequests.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.RequestTimeoutSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/InternalCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.AliveConnectionTerminators$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.AliveConnectionTerminators.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.State.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.Terminating$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.Terminating.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/MasterServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminationDeadlineReached.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html)*