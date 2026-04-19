---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:27Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/integrations/index.html
title: 'Integrations :: Akka Documentation'
---

# Integrations :: Akka Documentation

## Content

# Integrations

Akka runs on the JVM. All integrations use industry\-standard Java APIs and client libraries. No proprietary adapters or Akka\-specific wrappers are needed. If a Java client exists for it, you can use it in Akka.

## AI \& models

LLM providers are supported natively — 9 providers built into the SDK: Anthropic, OpenAI, Google AI Gemini, Google Cloud Vertex AI, AWS Bedrock, Ollama, LocalAI, Hugging Face, plus custom providers via the `ModelProvider.Custom` interface.

- [Agents](../agents.html) — how Agents interact with AI models
- [Model provider details](../model-provider-details.html) — configuration for each provider

## Data \& knowledge

Akka connects to any data store with a Java client library.

- **Vector databases:** Pinecone, Weaviate, Qdrant, Chroma, pgvector — via their Java client libraries
- **Relational databases:** PostgreSQL, MySQL — via R2DBC or JDBC
- **NoSQL databases:** MongoDB, DynamoDB, Cassandra — via their Java client libraries
- **Search engines:** Elasticsearch, OpenSearch — via their Java client libraries
- [Retrieval\-Augmented Generation (RAG)](../use-cases/rag-and-knowledge.html) — semantic search on vector databases to enrich AI model requests

### No caching layer needed

Akka’s Entity components (Event Sourced Entities, Key Value Entities) are in\-memory systems of durable record. All data is durable, immutable, and in\-memory with sub\-10ms access. There is no need for a separate cache like Redis. Your Entities *are* your cache — with persistence guarantees that Redis cannot provide.

## Messaging \& events

**Akka\-native first.** Akka has built\-in messaging capabilities that should be your primary path. These are durable, integrated with the runtime, and require no external infrastructure:

- [Component and service calls](../component-and-service-calls.html) — invoke other services and components directly
- [Consumers](../consuming-producing.html) — brokerless pub/sub, service\-to\-service eventing, event\-driven consumption
- [Streaming](../streaming.html) — built\-in stream processing

When you need to integrate with systems outside Akka, use external message brokers via their Java client libraries:

- [Message brokers](messaging-and-events.html#external) — Kafka, Google Pub/Sub, Azure Event Hubs
- Webhooks for external system callbacks — implement via [HTTP Endpoints](../http-endpoints.html)

## APIs \& protocols

Akka provides built\-in support for exposing your services:

- [HTTP Endpoints](../http-endpoints.html) — REST APIs with JSON
- [OpenAPI](../http-endpoints.html#_openapi_endpoint_schema) — schema generation (built\-in)
- [WebSockets](../http-endpoints.html#websocket) — real\-time bidirectional communication (built\-in)
- [gRPC Endpoints](../grpc-endpoints.html) — high\-performance APIs
- [MCP Endpoints](../mcp-endpoints.html) — expose Agent functions to remote LLMs via `@FunctionTool` annotations

### Agent protocol support

A2A, ACP, and MCP clients are baked into Akka’s Agent component. Agents natively consume tools and communicate with other Agents via all three protocols. No external libraries needed.

The Akka CLI also provides a built\-in MCP server (`akka mcp serve`) that exposes CLI operations as MCP tools for Claude Desktop, VS Code, and Cursor.

- [MCP](https://akka.io/blog/mcp-a2a-acp-what-does-it-all-mean)

## Identity \& security

- **Akka\-native secret management** (built\-in) — project\-level secrets injected as environment variables, supporting generic secrets, symmetric/asymmetric keys, TLS certificates, and CA bundles. Key rotation without environment variable changes. Values are never exposed in CLI or Console. See [Manage secrets](../../operations/projects/secrets.html).
- **External secrets:** Azure KeyVault integration (currently documented). See [Manage external secrets](../../operations/projects/external-secrets.html).
- **Other external providers** (AWS Secrets Manager, GCP Secret Manager, HashiCorp Vault) — via standard Java APIs.

## Observability

- **OpenTelemetry metrics and logs exporting** (built\-in) — feed into any OTEL\-compatible backend: Grafana, Datadog, New Relic, and others. See [Observability and monitoring](../../operations/observability-and-monitoring/index.html).

## Related Pages (Internal Links)

- https://doc.akka.io/operations/observability-and-monitoring/index.html
- https://doc.akka.io/operations/projects/external-secrets.html
- https://doc.akka.io/operations/projects/secrets.html
- https://doc.akka.io/sdk/agents.html
- https://doc.akka.io/sdk/component-and-service-calls.html
- https://doc.akka.io/sdk/consuming-producing.html
- https://doc.akka.io/sdk/grpc-endpoints.html
- https://doc.akka.io/sdk/http-endpoints.html
- https://doc.akka.io/sdk/integrations/messaging-and-events.html
- https://doc.akka.io/sdk/mcp-endpoints.html
- https://doc.akka.io/sdk/model-provider-details.html
- https://doc.akka.io/sdk/streaming.html
- https://doc.akka.io/sdk/use-cases/rag-and-knowledge.html

---
*Source: [https://doc.akka.io/sdk/integrations/index.html](https://doc.akka.io/sdk/integrations/index.html)*