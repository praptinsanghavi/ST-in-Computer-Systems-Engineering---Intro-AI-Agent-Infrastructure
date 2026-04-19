---
description: Akka 2.10.17 - akka.actor.setup
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/setup/index.html
title: Akka 2.10.17 - akka.actor.setup
---

# Akka 2.10.17 - akka.actor.setup

> **Summary:** Akka 2.10.17 - akka.actor.setup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](../dungeon/index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/setup/index.html "Permalink")  package setupDefinition Classes[actor](../index.html)
- [ActorSystemSetup](ActorSystemSetup.html "A set of setup settings for programmatic configuration of the actor system.")
- [Setup](Setup.html "Marker supertype for a setup part that can be put inside ActorSystemSetup, if a specific concrete setup is not specified in the actor system setup that means defaults are used (usually from the config file) - no concrete setup instance should be mandatory in the ActorSystemSetup that an actor system is created with.")
- [**](../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[actor](../index.html)
p[akka](../../index.html).[actor](../index.html)

# setup[**](../../../akka/actor/setup/index.html "Permalink")

#### package setup

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/actor/setup/ActorSystemSetup.html "Permalink") final  class [ActorSystemSetup](ActorSystemSetup.html "A set of setup settings for programmatic configuration of the actor system.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A set of setup settings for programmatic configuration of the actor system.

A set of setup settings for programmatic configuration of the actor system.

Constructor is \*Internal API\*. Use the factory methods [ActorSystemSetup\#create](ActorSystemSetup$.html#create(settings:akka.actor.setup.Setup*):akka.actor.setup.ActorSystemSetup) and akka.actor.Actor\#apply to create
instances.
2. [**](../../../akka/actor/setup/Setup.html "Permalink") abstract  class [Setup](Setup.html "Marker supertype for a setup part that can be put inside ActorSystemSetup, if a specific concrete setup is not specified in the actor system setup that means defaults are used (usually from the config file) - no concrete setup instance should be mandatory in the ActorSystemSetup that an actor system is created with.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker supertype for a setup part that can be put inside [ActorSystemSetup](ActorSystemSetup.html), if a specific concrete setup
is not specified in the actor system setup that means defaults are used (usually from the config file) \- no concrete
setup instance should be mandatory in the [ActorSystemSetup](ActorSystemSetup.html) that an actor system is created with.
### Value Members

1. [**](../../../akka/actor/setup/ActorSystemSetup$.html "Permalink")  object [ActorSystemSetup](ActorSystemSetup$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/dungeon/index.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/ActorSystemSetup$.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/setup/index.html](https://doc.akka.io/api/akka/current/akka/actor/setup/index.html)*