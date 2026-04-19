---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:24Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/akka-grpc.html
title: 'Akka gRPC :: Akka Guide'
---

# Akka gRPC :: Akka Guide

## Content

# Akka gRPC

[gRPC ![new tab](../_images/new-tab.svg)](https://grpc.io) is a transport mechanism for request/response and streaming use cases. It can run in almost any environment with bindings to many programming languages. It takes a schema\-first approach, where your protocol is declared in a [Protobuf service descriptor ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/proto.html). From the service descriptor the source code for the messages, client and server stubs are generated.

It has several advantages:

- Schema\-first design favors well\-defined and decoupled service interfaces over brittle ad\-hoc solutions.
- The Protobuf\-based wire protocol is efficient, well\-known, and allows compatible schema evolution.
- It is based on HTTP/2 which allows multiplexing several data streams over a single connection.
- Streaming requests and responses are first class.
- There are tools available for many languages allowing seamless interoperability between clients and services written in different languages.

That makes it well\-suited for:

- Connections between internal services
- Connecting to external services that expose a gRPC API (even ones written in other languages)
- Serving data to web or mobile front\-ends

[Akka gRPC ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/) is a gRPC library for the Akka ecosystem. It has support for Maven, gradle and sbt. The gRPC servers and clients use [Akka Streams](akka-stream.html), Scala `Future` and Java `CompletionStage` in the user facing API.

## Learn more

- The [Introduction to Akka gRPC video ![new tab](../_images/new-tab.svg)](https://akka.io/blog/news/2020/04/08/akka-grpc-intro-video) is a good starting point for learning Akka gRPC.
- [Akka gRPC "Why gRPC?" ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/whygrpc.html)
- [Akka gRPC server walk\-through ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html)
- [Akka gRPC client walk\-through ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/client/walkthrough.html)

## Related Pages (Internal Links)

- https://doc.akka.io/guide/concepts/akka-stream.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-grpc/current/client/walkthrough.html
- https://doc.akka.io/libraries/akka-grpc/current/proto.html
- https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html
- https://doc.akka.io/libraries/akka-grpc/current/whygrpc.html

---
*Source: [https://doc.akka.io/guide/concepts/akka-grpc.html](https://doc.akka.io/guide/concepts/akka-grpc.html)*