---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:18:57Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/glossary.html
title: 'Glossary of Terms :: Akka Documentation'
---

# Glossary of Terms :: Akka Documentation

## Content

# Glossary of Terms

A2A (Agent\-to\-Agent)

Google’s protocol for agent\-to\-agent communication, enabling interoperability between autonomous agents across different platforms and frameworks.

ACP (Agent Communication Protocol)

A Linux Foundation protocol for agent communication, providing a vendor\-neutral standard for how AI agents discover, connect to, and interact with one another.

Agent

A component that interacts with an AI model to perform a specific task. It is typically backed by a large language model (LLM). It maintains contextual history in a session memory, which may be shared between multiple agents that are collaborating on the same goal. It may provide function tools and call them as requested by the model.

Agentic AI

AI systems capable of autonomous decision\-making, tool use, and multi\-step reasoning. Unlike traditional AI that responds to single prompts, agentic AI can plan, execute, and adapt across complex workflows while interacting with external systems.

AI Agent

An Akka component that interacts with an AI model to perform tasks, maintaining session memory. AI Agents can collaborate with other agents, invoke function tools, and leverage Akka’s runtime for durability, resilience, and scalability. See also [Agent](#agent).

CI/CD

You can deploy [Service](#service)s using a Continuous Integration/Continuous Delivery service. See [Integrating with CI/CD tools](../operations/integrating-cicd/index.html) for instructions.

Command

A command comes from a *sender*, and a reply may be sent to the sender. A command expresses the intention to alter the state or retrieve information based on the state of an [Entity](#entity) or [Workflow](#workflow). A command is materialized by a message received by a component implementation. Commands are not persisted and might fail.

Command handler

A *command handler* is the code that handles a command. It may validate the command using the current state, and may emit events or update the state as part of its processing. A command handler **must not** update the state of the entity directly, only *indirectly* by using [Effect](#effect) API.

Effect

Effects are predefined operations that align with the capabilities of each [Component](#component), except [Endpoint](#endpoint)s. These operations are the Component’s Effect API. Returning an Effect from the [Command handler](#command_handler) allows the Akka runtime to execute infrastructure\-related code transparently to the user. For example, event\-sourced entities provide an Effect API that among other things can persist events.

Component

The SDK supports [Agent](#agent), [Endpoint](#endpoint), [Key Value Entity](#key_value_entity), [Event Sourced Entity](#event_sourced_entity), [Workflow](#workflow), [Consumer](#consumer), [View](#view) and [Timed actions](#timed_action) components. These components enable you to implement your business logic.

Component client

A utility to call Akka components without knowing where they are located.

Component ID

An ID to identify components. Changing Component ID for [Stateful component](#stateful_component)s should be done with caution, because the ID is used for persistence.

Constitution

In Spec\-Driven Development ([SDD (Spec\-Driven Development)](#sdd)), the unbreakable rules for an entire project. A constitution defines technology requirements, design mandates, coding standards, and architectural constraints that all generated code must adhere to.

Consumer

A component used to consume or produce a stream of changes.

Endpoint

An *endpoint* component is a way to expose a service to the outside world. They act as controllers ahead of the other components, like [Entity](#entity)s or [View](#view)s. They don’t require [Component ID](#component_id) because URL address is enough to identify them.

Entity

Components like [Key Value Entity](#key_value_entity) and [Event Sourced Entity](#event_sourced_entity) are usually referred as entities. An entity is conceptually equivalent to a class, or a type of state. It will have multiple [Entity instance](#entity_instance)s, each of which has a unique ID and can handle commands. For example, a service may implement a chat room entity, encompassing the logic associated with chat rooms, and a particular chat room may be an instance of that entity, containing a list of the users currently in the room and a history of the messages sent to it. Entities cache their state and persist it using [Effect](#effect) APIs.

Entity instance

An instance of an [Entity](#entity), which is identified by a unique [ID](#id).

EU AI Act

The European Union’s regulation on artificial intelligence, requiring transparency, explainability, and human oversight for AI systems. Akka supports EU AI Act compliance through runtime\-embedded governance, audit trails, and policy enforcement via [Guardrails](#guardrails).

Event

An *event* indicates that a change has occurred to an entity and persists the current state. Events are stored in a *journal*, and are read and replayed each time the entity is reloaded by the Akka runtime state management system. An event emitted by one component or service might be interpreted as a command by another.

Event handler

An *event handler* is the only piece of code that is allowed to *update* the state of the [Event Sourced Entity](#event_sourced_entity). It receives events, and, according to the event, updates the state.

Event Sourced Entity

A type of [Entity](#entity) that stores its state using a journal of events, and restores its state by replaying that journal. These are discussed in more detail in [Event Sourced state model](../concepts/state-model.html#_the_event_sourced_state_model).

Guardrails

Runtime policy enforcement mechanisms that validate, filter, or block Agent inputs and outputs. Guardrails ensure AI Agents operate within defined safety boundaries, supporting compliance with regulations such as the EU AI Act.

ID

An id used to identify instances of a [Stateful component](#stateful_component)s.

Journal

Persistent storage for [Event](#event)s from [Event Sourced Entity](#event_sourced_entity)s. Some documentation uses the terms *Event Log* or *Event Store* instead of journal. Akka handles event storage for you, relieving you of connecting to, configuring, or managing the journal.

Key Value Entity

A Key Value Entity stores state in an update\-in\-place model, similar to a Key\-Value store that supports CRUD (Create, Read, Update, Delete) operations. In Domain Driven Design (DDD) terms, a Value Entity is an "Entity." In contrast with "Value Objects," you reference Entities by an identifier and the value associated with that identifier can change (be updated) over time. These are discussed in more detail in [Key Value state model](../concepts/state-model.html#_the_key_value_state_model).

LLM (Large Language Model)

AI models trained on large datasets that generate text, code, and structured output. Akka [Agent](#agent)s use LLMs as their reasoning engine, with Akka providing the runtime infrastructure for durability, state management, and tool integration.

MCP (Model Context Protocol)

Anthropic’s protocol for connecting AI models to external tools and data sources. MCP provides a standardized interface for LLMs to discover and invoke tools, retrieve context, and interact with external systems.

OpenID Connect

Akka supports user management with Single Sign\-On via OpenID Connect.

Production Gap

The barrier between AI prototypes and production\-grade systems. Prototypes may demonstrate capability but lack the durability, resilience, reliability, and operational readiness required for enterprise deployment. One of the [Three Barriers](#three_barriers) that Akka solves.

Project

A project is the root of one or more [Service](#service)s that are meant to be deployed and run together. The project is a logical container for these services and provides common management capabilities.

Reliability

An Akka dimension — 99\.9999% availability, active\-active high availability and disaster recovery (HA/DR), with contractual commitments and indemnities.

Repeatability

An Akka dimension — consistent development across teams via golden paths and [Spec\-Driven Development](#sdd). Repeatability eliminates dependency on scarce distributed systems experts by encoding best practices into specifications that AI can execute.

Risk Control

An Akka dimension — runtime\-embedded governance, policy enforcement, and [EU AI Act](#eu_ai_act) compliance. Risk Control includes [Guardrails](#guardrails), audit trails, and [sanitization](#sanitizer) to ensure AI systems operate within regulatory and organizational boundaries. One of the [Three Dimensions](#three_dimensions).

Runtime

When you deploy a [Service](#service), Akka wraps it with the runtime. The runtime manages entity state, and exposes the service implementation to the rest of the system. It translates incoming messages to commands and sends them to the service. The runtime also forms a cluster with other instances of the same service, allowing advanced distributed state management features such as sharding, replication and addressed communication between instances.

Sanitizer

A data sanitization component that scrubs personally identifiable information (PII) from Agent interactions while preserving explainability and audit trails.

SDD (Spec\-Driven Development)

Akka’s primary development approach where specifications are the source of truth and code is AI\-generated. SDD uses a [Constitution](#constitution) for project\-wide rules and individual specs for each component, enabling repeatable, high\-quality development without requiring distributed systems expertise.

Service

A service is implemented by the Akka SDK. At runtime, Akka enriches the incoming and outgoing messages with state management capabilities, such as the ability to receive and update state. You implement the business logic for the service, which includes stateful entities. You deploy your services and Akka adds a [Runtime](#runtime) that handles incoming communication and persistence at runtime.

Snapshot

A snapshot records current state of an [Event Sourced Entity](#event_sourced_entity). Akka persists snapshots periodically as an optimization. With snapshots, when the Entity is reloaded from the journal, the entire journal doesn’t need to be replayed, just the changes since the last snapshot.

Specialist Trap

The barrier where agentic AI delivery depends on scarce distributed systems experts, limiting how many teams can build and operate production AI systems. One of the [Three Barriers](#three_barriers) that Akka solves through [Spec\-Driven Development](#sdd) and [Repeatability](#repeatability).

Spec\-Driven Development

See [SDD (Spec\-Driven Development)](#sdd).

State

The *state* is simply data—​the current set of values for an [Entity instance](#entity_instance). [Entity](#entity)s hold their state in memory.

State model

Each entity uses one of the supported state models. The state model determines the way Akka manages data. Currently, these include [Key Value Entity](#key_value_entity) and [Event Sourced Entity](#event_sourced_entity).

Stateful component

A component like [Key Value Entity](#key_value_entity),[Event Sourced Entity](#event_sourced_entity) or [Workflow](#workflow)

Three Barriers

The three challenges preventing enterprises from deploying agentic AI at scale: the [Production Gap](#production_gap), Liability, and the [Specialist Trap](#specialist_trap). Akka is designed to overcome all three.

Three Dimensions

The three ways Akka delivers reliable agentic AI: [Reliability](#reliability), [Risk Control](#risk_control), and [Repeatability](#repeatability). Together, they address the [Three Barriers](#three_barriers) and enable enterprise\-grade AI systems.

Timed actions

A Timed Action provides consistent scheduling and execution of a call to another [Component](#component) at specified intervals or delays. They are convenient for automating repetitive work and handling timeouts within business logic implementation.

View

A View provides a way to retrieve state from multiple Entities based on a query. You can query non\-key data items. You can create views from Key Value Entity state, Event Sourced Entity events, and by subscribing to topics.

Workflow

Workflows are high\-level descriptions to easily align business requirements with their implementation in code. Orchestration across multiple services with support for failure scenarios and compensating actions is simple with Akka Workflows.

Workflow step

A Workflow definition element which encapsulates an action to perform and a transition to the next step (or end transition to finish the Workflow execution).

## Related Pages (Internal Links)

- https://doc.akka.io/concepts/state-model.html
- https://doc.akka.io/operations/integrating-cicd/index.html

---
*Source: [https://doc.akka.io/reference/glossary.html](https://doc.akka.io/reference/glossary.html)*