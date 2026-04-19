---
description: Akka 2.10.17 - akka.actor.typed.pubsub
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:54:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/index.html
title: Akka 2.10.17 - akka.actor.typed.pubsub
---

# Akka 2.10.17 - akka.actor.typed.pubsub

> **Summary:** Akka 2.10.17 - akka.actor.typed.pubsub

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](../eventstream/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package pubsubDefinition Classes[typed](../index.html)
- [PubSub](PubSub.html)
- [Topic](Topic$.html "A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.")
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](../receptionist/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[actor](../../index.html).[typed](../index.html)

# pubsub[**](../../../../akka/actor/typed/pubsub/index.html "Permalink")

#### package pubsub

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/pubsub/PubSub.html "Permalink") final  class [PubSub](PubSub.html) extends [Extension](../Extension.html)
### Value Members

1. [**](../../../../akka/actor/typed/pubsub/PubSub$.html "Permalink")  object [PubSub](PubSub$.html "Registry for Topics.") extends [ExtensionId](../ExtensionId.html)\[[PubSub](PubSub.html)]Registry for [Topic](Topic$.html)s.

Registry for [Topic](Topic$.html)s. Keeps one topic actor instance of each requested topic name so that they can be shared
between all subscribers in the same actor system.

Note that manually spawned [Topic](Topic$.html) actors will not appear in the registry.
2. [**](../../../../akka/actor/typed/pubsub/Topic$.html "Permalink")  object [Topic](Topic$.html "A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.")A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

It is mostly useful in a clustered setting, where it is intended to be started once on every node that want to
house subscribers or publish messages to the topic, but it also works in a local setting without cluster.

In a clustered context messages are deduplicated so that there is at most one message sent to each node for
each publish and if there are no subscribers on a node, no message is sent to it. Note that the list of subscribers
is eventually consistent and there are no delivery guarantees built in.

Each topic results in a [akka.actor.typed.receptionist.ServiceKey](../receptionist/ServiceKey.html) in the [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html)
so the same scaling recommendation holds for topics, see docs:
https://doc.akka.io/libraries/akka\-core/current/typed/actor\-discovery.html\#receptionist\-scalability
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/eventstream/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/index.html](https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/index.html)*