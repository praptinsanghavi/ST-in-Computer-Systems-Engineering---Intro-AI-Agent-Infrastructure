---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/package-summary.html
title: akka.actor.typed.pubsub
---

# akka.actor.typed.pubsub

## Content

# Package akka.actor.typed.pubsub

- Interface Summary 
| Interface | Description |
| [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")\<T\> | Not for user extension |
| --- | --- |
| [Topic.TopicStats](Topic.TopicStats.html "interface in akka.actor.typed.pubsub") | Response to the `GetTopicStats` query. |
- Class Summary 
| Class | Description |
| [PubSub](PubSub.html "class in akka.actor.typed.pubsub") |  |
| --- | --- |
| [PubSub$](PubSub$.html "class in akka.actor.typed.pubsub") | Registry for [`Topic`](Topic.html "class in akka.actor.typed.pubsub")s. |
| [Topic](Topic.html "class in akka.actor.typed.pubsub") | A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors. |
| [Topic.GetTopicStats$](Topic.GetTopicStats$.html "class in akka.actor.typed.pubsub") | Scala API: Get a summary of the state for a local topic actor. |
| [Topic.Publish$](Topic.Publish$.html "class in akka.actor.typed.pubsub") | Scala API: Publish the message to all currently known subscribers. |
| [Topic.Subscribe$](Topic.Subscribe$.html "class in akka.actor.typed.pubsub") | Scala API: Subscribe to this topic. |
| [Topic.Unsubscribe$](Topic.Unsubscribe$.html "class in akka.actor.typed.pubsub") | Scala API: Unsubscribe a previously subscribed actor from this topic. |
| [Topic$](Topic$.html "class in akka.actor.typed.pubsub") | A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.GetTopicStats$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.Publish$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.Subscribe$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.TopicStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.Unsubscribe$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/Topic.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/package-summary.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/pubsub/package-summary.html)*