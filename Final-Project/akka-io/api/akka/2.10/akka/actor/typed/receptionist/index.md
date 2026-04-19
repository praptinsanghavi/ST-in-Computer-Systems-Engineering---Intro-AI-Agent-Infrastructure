---
description: Akka 2.10.17 - akka.actor.typed.receptionist
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/index.html
title: Akka 2.10.17 - akka.actor.typed.receptionist
---

# Akka 2.10.17 - akka.actor.typed.receptionist

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist

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
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package receptionistDefinition Classes[typed](../index.html)
- [Receptionist](Receptionist.html "Register and discover actors that implement a service with a protocol defined by a ServiceKey.")
- [ReceptionistSetup](ReceptionistSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Receptionist extension.")
- [ServiceKey](ServiceKey.html "A service key is an object that implements this trait for a given protocol T, meaning that it signifies that the type T is the entry point into the protocol spoken by that service (think of it as the set of first messages that a client could send).")
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[actor](../../index.html).[typed](../index.html)

# receptionist[**](../../../../akka/actor/typed/receptionist/index.html "Permalink")

#### package receptionist

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist.html "Permalink") abstract  class [Receptionist](Receptionist.html "Register and discover actors that implement a service with a protocol defined by a ServiceKey.") extends [Extension](../Extension.html)Register and discover actors that implement a service with a protocol defined by a [ServiceKey](ServiceKey.html).

Register and discover actors that implement a service with a protocol defined by a [ServiceKey](ServiceKey.html).

This class is not intended for user extension other than for test purposes (e.g.
stub implementation). More methods may be added in the future and that may break
such implementations.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html "Permalink") final  class [ReceptionistSetup](ReceptionistSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Receptionist extension.") extends [ExtensionSetup](../ExtensionSetup.html)\[[Receptionist](Receptionist.html)]Can be used in [akka.actor.setup.ActorSystemSetup](../../setup/ActorSystemSetup.html) when starting the [ActorSystem](../ActorSystem.html)
to replace the default implementation of the [Receptionist](Receptionist.html) extension.

Can be used in [akka.actor.setup.ActorSystemSetup](../../setup/ActorSystemSetup.html) when starting the [ActorSystem](../ActorSystem.html)
to replace the default implementation of the [Receptionist](Receptionist.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.
3. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html "Permalink") abstract  class [ServiceKey](ServiceKey.html "A service key is an object that implements this trait for a given protocol T, meaning that it signifies that the type T is the entry point into the protocol spoken by that service (think of it as the set of first messages that a client could send).")\[T] extends AbstractServiceKeyA service key is an object that implements this trait for a given protocol
T, meaning that it signifies that the type T is the entry point into the
protocol spoken by that service (think of it as the set of first messages
that a client could send).

A service key is an object that implements this trait for a given protocol
T, meaning that it signifies that the type T is the entry point into the
protocol spoken by that service (think of it as the set of first messages
that a client could send).

Not for user extension, see factories in companion object: [ServiceKey\#create](ServiceKey$.html#create[T](clazz:Class[T],id:String):akka.actor.typed.receptionist.ServiceKey[T]) and [ServiceKey\#apply](ServiceKey$.html#apply[T](id:String)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.receptionist.ServiceKey[T])

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html "Permalink")  object [Receptionist](Receptionist$.html "A Receptionist is an entry point into an Actor hierarchy where select Actors publish their identity together with the protocols that they implement.") extends [ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)]A Receptionist is an entry point into an Actor hierarchy where select Actors
publish their identity together with the protocols that they implement.

A Receptionist is an entry point into an Actor hierarchy where select Actors
publish their identity together with the protocols that they implement. Other
Actors need only know the Receptionist’s identity in order to be able to use
the services of the registered Actors.

These are the messages (and the extension) for interacting with the receptionist.
The receptionist is easiest accessed through the system: [ActorSystem.receptionist](../ActorSystem.html#receptionist:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command])
2. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup$.html "Permalink")  object [ReceptionistSetup](ReceptionistSetup$.html)
3. [**](../../../../akka/actor/typed/receptionist/ServiceKey$.html "Permalink")  object [ServiceKey](ServiceKey$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/eventstream/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/ReceptionistSetup$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/index.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/index.html)*