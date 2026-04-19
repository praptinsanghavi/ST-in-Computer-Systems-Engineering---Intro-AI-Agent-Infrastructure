---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
title: akka.http.scaladsl
---

# akka.http.scaladsl

## Content

# Package akka.http.scaladsl

- Interface Summary 
| Interface | Description |
| [ClientTransport](ClientTransport.html "interface in akka.http.scaladsl") | Abstraction to allow the creation of alternative transports to run HTTP on. |
| --- | --- |
| [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") |  |
| [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") | Builder for setting up a flow that will create one single connection per materialization to the specified host. |
| [ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") | Builder API to create server bindings. |
| [TimeoutAccess](TimeoutAccess.html "interface in akka.http.scaladsl") | Enables programmatic access to the server\-side request timeout logic. |
- Class Summary 
| Class | Description |
| [ClientTransport$](ClientTransport$.html "class in akka.http.scaladsl") | Entry point to create or access predefined client transports. |
| --- | --- |
| [ConnectionContext$](ConnectionContext$.html "class in akka.http.scaladsl") |  |
| [Http](Http.html "class in akka.http.scaladsl") |  |
| [Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl") | Represents a connection pool to a specific target host and pool configuration. |
| [Http.HostConnectionPool$](Http.HostConnectionPool$.html "class in akka.http.scaladsl") | Deprecated. Not needed any more. |
| [Http.HostConnectionPoolImpl](Http.HostConnectionPoolImpl.html "class in akka.http.scaladsl") | INTERNAL API |
| [Http.HttpConnectionTerminated](Http.HttpConnectionTerminated.html "class in akka.http.scaladsl") |  |
| [Http.HttpConnectionTerminated$](Http.HttpConnectionTerminated$.html "class in akka.http.scaladsl") |  |
| [Http.HttpServerTerminated](Http.HttpServerTerminated.html "class in akka.http.scaladsl") |  |
| [Http.HttpServerTerminated$](Http.HttpServerTerminated$.html "class in akka.http.scaladsl") |  |
| [Http.HttpTerminated](Http.HttpTerminated.html "class in akka.http.scaladsl") | Type used to carry meaningful information when server termination has completed successfully. |
| [Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl") | Represents one accepted incoming HTTP connection. |
| [Http.IncomingConnection$](Http.IncomingConnection$.html "class in akka.http.scaladsl") |  |
| [Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl") | Represents a prospective outgoing HTTP connection. |
| [Http.OutgoingConnection$](Http.OutgoingConnection$.html "class in akka.http.scaladsl") |  |
| [Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl") | Represents a prospective HTTP server binding. |
| [Http.ServerBinding$](Http.ServerBinding$.html "class in akka.http.scaladsl") |  |
| [Http$](Http$.html "class in akka.http.scaladsl") |  |
| [HttpConnectionContext](HttpConnectionContext.html "class in akka.http.scaladsl") |  |
| [HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl") |  |
| [HttpExt](HttpExt.html "class in akka.http.scaladsl") | Akka extension for HTTP which serves as the main entry point into akka\-http. |
| [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") | Context with all information needed to set up a HTTPS connection |
| [ServerBuilder$](ServerBuilder$.html "class in akka.http.scaladsl") | Internal API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HostConnectionPool$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HostConnectionPool.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HostConnectionPoolImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HttpConnectionTerminated$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HttpConnectionTerminated.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HttpServerTerminated$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HttpServerTerminated.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HttpTerminated.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.IncomingConnection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.IncomingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/TimeoutAccess.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html)*