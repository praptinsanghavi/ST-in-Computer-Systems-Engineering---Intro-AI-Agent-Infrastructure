---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/overview.html
title: Overview • Akka gRPC
---

# Overview • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

## gRPC

[gRPC](https://grpc.io) is a transport mechanism for request/response and (non\-persistent) streaming use cases. See [Why gRPC?](whygrpc.html) for more information about when to use gRPC as your transport.

gRPC APIs are useful instead of (or as a complement to) JSON/REST\-based API.

## Akka gRPC

Akka gRPC provides support for building streaming gRPC servers and clients on top of [Akka Streams](https://doc.akka.io/libraries/akka-core/2.10/stream/) and [Akka HTTP](https://doc.akka.io/libraries/akka-http/10.7/).

It features:

- A generator, that starts from a protobuf service definitions, for:
	- Model classes
	- The service API as a Scala traitJava interface using Akka Stream `Source`s
	- On the [server side](server/index.html), code to create an Akka HTTP route based on your implementation of the service
	- On the [client side](client/index.html) side, a client for the service
- gRPC Runtime implementation that uses
	- [Akka HTTP/2 support](https://doc.akka.io/libraries/akka-http/10.7/server-side/http2.html) for the server side and
	- `grpc-netty-shaded` for the client side.
- Support for [sbt](buildtools/sbt.html), [gradle](buildtools/gradle.html), and [Maven](buildtools/maven.html).

## Project Information

| Project Info: Akka gRPC | |
| --- | --- |
| Artifact | com.lightbend.akka.grpc akka\-grpc\-runtime 2\.5\.10 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.grpc.runtime |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-grpc/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-06\-17 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/) |
| Forums | [Akka Discuss](https://discuss.akka.io/c/akka/akka-grpc) |
| Release notes | [GitHub releases](https://github.com/akka/akka-grpc/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-grpc/issues) |
| Sources | [https://github.com/akka/akka\-grpc](https://github.com/akka/akka-grpc) |

## Project Status

Akka gRPC is supported for users with an [Akka license](https://akka.io/pricing).

Both client\- and server\-side APIs are based on Akka Streams.

The client side is currently implemented on top of [io.grpc:grpc\-netty\-shaded](https://mvnrepository.com/artifact/io.grpc/grpc-netty-shaded).

Later versions may replace this by [io.grpc:grpc\-core](https://mvnrepository.com/artifact/io.grpc/grpc-core) and Akka HTTP, when Akka HTTP offers HTTP/2 client support.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/
- https://doc.akka.io/libraries/akka-grpc/2.5/buildtools/gradle.html
- https://doc.akka.io/libraries/akka-grpc/2.5/buildtools/maven.html
- https://doc.akka.io/libraries/akka-grpc/2.5/buildtools/sbt.html
- https://doc.akka.io/libraries/akka-grpc/2.5/client/index.html
- https://doc.akka.io/libraries/akka-grpc/2.5/index.html
- https://doc.akka.io/libraries/akka-grpc/2.5/server/index.html
- https://doc.akka.io/libraries/akka-grpc/2.5/whygrpc.html
- https://doc.akka.io/libraries/akka-http/10.7/
- https://doc.akka.io/libraries/akka-http/10.7/server-side/http2.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/2.5/overview.html](https://doc.akka.io/libraries/akka-grpc/2.5/overview.html)*