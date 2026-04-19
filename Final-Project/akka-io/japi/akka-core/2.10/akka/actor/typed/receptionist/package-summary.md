---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:20:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/package-summary.html
title: akka.actor.typed.receptionist
---

# akka.actor.typed.receptionist

## Content

# Package akka.actor.typed.receptionist

- Interface Summary 
| Interface | Description |
| [Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist") | Confirmation that the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") no more associated with the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist") in the local receptionist. |
| --- | --- |
| [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") | Current listing of all Actors that implement the protocol given by the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
| [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") | Confirmation that the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") has been associated with the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
- Class Summary 
| Class | Description |
| [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist") | Register and discover actors that implement a service with a protocol defined by a [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
| --- | --- |
| [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") | The set of commands accepted by a Receptionist. |
| [Receptionist.Deregister$](Receptionist.Deregister$.html "class in akka.actor.typed.receptionist") | Remove association between the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") and the given [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
| [Receptionist.Deregistered$](Receptionist.Deregistered$.html "class in akka.actor.typed.receptionist") | Sent by the receptionist, available here for easier testing |
| [Receptionist.Find$](Receptionist.Find$.html "class in akka.actor.typed.receptionist") | `Find` message. |
| [Receptionist.Listing$](Receptionist.Listing$.html "class in akka.actor.typed.receptionist") | Sent by the receptionist, available here for easier testing |
| [Receptionist.Register$](Receptionist.Register$.html "class in akka.actor.typed.receptionist") | `Register` message. |
| [Receptionist.Registered$](Receptionist.Registered$.html "class in akka.actor.typed.receptionist") | Sent by the receptionist, available here for easier testing |
| [Receptionist.Subscribe$](Receptionist.Subscribe$.html "class in akka.actor.typed.receptionist") | `Subscribe` message. |
| [Receptionist$](Receptionist$.html "class in akka.actor.typed.receptionist") | A Receptionist is an entry point into an Actor hierarchy where select Actors  publish their identity together with the protocols that they implement. |
| [ReceptionistSetup](ReceptionistSetup.html "class in akka.actor.typed.receptionist") | Can be used in [`ActorSystemSetup`](../../setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`  to replace the default implementation of the [`Receptionist`](Receptionist.html "class in akka.actor.typed.receptionist") extension. |
| [ReceptionistSetup$](ReceptionistSetup$.html "class in akka.actor.typed.receptionist") |  |
| [ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")\<T\> | A service key is an object that implements this trait for a given protocol  T, meaning that it signifies that the type T is the entry point into the  protocol spoken by that service (think of it as the set of first messages  that a client could send). |
| [ServiceKey$](ServiceKey$.html "class in akka.actor.typed.receptionist") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Deregister$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Deregistered$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Deregistered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Find$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Listing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Listing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Register$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Registered$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Registered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Subscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ReceptionistSetup$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/package-summary.html)*