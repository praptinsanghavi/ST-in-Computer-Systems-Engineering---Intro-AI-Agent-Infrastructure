---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/concepts/commands-and-events.html
title: 'Commands and Events :: Akka Guide'
---

# Commands and Events :: Akka Guide

## Content

# Commands and Events

Commands and Events are two of the building blocks of [Event Sourcing](event-sourcing.html). In order to reconstruct the state of an entity in memory we must read the history of events for that entity from the datastore and process each event one at a time.

Once the state reconstruction finishes, the entity is ready to process new commands. A command is a request to mutate the state.

Events will be serialized and published into the *Journal* table in the database. The *Journal* can then be consumed by the emitting entity or by third parties (e.g. to build an aggregate or other kinds of projections). Events are built on top of [messages](message-driven-event-driven.html#message_vs_event).

A client trying to mutate the state of an entity will produce a command message and send it to the entity. Commands are a type of message. Sometimes, commands include the address of the sender, the entity can use the sender address to send a message back with a reply.

Events are [facts ![new tab](../_images/new-tab.svg)](https://www.reactiveprinciples.org/patterns/communicate-facts.html), while commands are requests for a state mutation.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/guide/concepts/event-sourcing.html
- https://doc.akka.io/libraries/guide/concepts/message-driven-event-driven.html

---
*Source: [https://doc.akka.io/libraries/guide/concepts/commands-and-events.html](https://doc.akka.io/libraries/guide/concepts/commands-and-events.html)*