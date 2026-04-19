---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:08Z'
section: getting-started
site: akka-io
source_url: https://doc.akka.io/getting-started/ask-akka-agent/index.html
title: 'Build a RAG chat agent :: Akka Documentation'
---

# Build a RAG chat agent :: Akka Documentation

## Content

# Build a RAG chat agent

|  | **New to Akka? Start here:**   Use the [Build your first agent](../author-your-first-service.html) guide to get a simple agentic service running locally and interact with it. |
| --- | --- |

This tutorial walks through building a Retrieval\-Augmented Generation (RAG) chat agent. We start with a simple agent that streams responses from a large language model (LLM), and add retrieval functionality in separate parts of the tutorial. By the end, we will have an agent that uses the latest Akka documentation as its knowledge base, accessible through a web UI.

1. [Creating the agent](the-agent.html) — A streaming Agent that answers questions using an LLM and session memory.
2. [Knowledge indexing with a workflow](indexer.html) — A Workflow that indexes local documentation into a vector database.
3. [Executing RAG queries](rag.html) — A helper class that performs RAG queries by combining vector search with the LLM.
4. [Adding UI endpoints](endpoints.html) — Endpoints that expose a UI, support multiple sessions, and allow users to query the system.

## Related Pages (Internal Links)

- https://doc.akka.io/getting-started/ask-akka-agent/endpoints.html
- https://doc.akka.io/getting-started/ask-akka-agent/indexer.html
- https://doc.akka.io/getting-started/ask-akka-agent/rag.html
- https://doc.akka.io/getting-started/ask-akka-agent/the-agent.html
- https://doc.akka.io/getting-started/author-your-first-service.html

---
*Source: [https://doc.akka.io/getting-started/ask-akka-agent/index.html](https://doc.akka.io/getting-started/ask-akka-agent/index.html)*