---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/package-summary.html
title: akka.actor.dungeon
---

# akka.actor.dungeon

## Content

# Package akka.actor.dungeon

- Interface Summary 
| Interface | Description |
| [Children](Children.html "interface in akka.actor.dungeon") | INTERNAL API |
| --- | --- |
| [ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") | INTERNAL API |
| [ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon") |  |
| [ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon") |  |
| [ChildrenContainer.WaitingForChildren](ChildrenContainer.WaitingForChildren.html "interface in akka.actor.dungeon") |  |
| [DeathWatch](DeathWatch.html "interface in akka.actor.dungeon") | INTERNAL API |
| [Dispatch](Dispatch.html "interface in akka.actor.dungeon") | INTERNAL API |
| [FaultHandling](FaultHandling.html "interface in akka.actor.dungeon") |  |
| [FaultHandling.FailedInfo](FaultHandling.FailedInfo.html "interface in akka.actor.dungeon") |  |
| [LicenseKeySupplier](LicenseKeySupplier.html "interface in akka.actor.dungeon") | INTERNAL API: Supplies an Akka license key. |
| [ReceiveTimeout](ReceiveTimeout.html "interface in akka.actor.dungeon") | INTERNAL API |
- Class Summary 
| Class | Description |
| [Children$](Children$.html "class in akka.actor.dungeon") | INTERNAL API |
| --- | --- |
| [ChildrenContainer.ChildrenIterable](ChildrenContainer.ChildrenIterable.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.ChildRestartsIterable](ChildrenContainer.ChildRestartsIterable.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.Creation](ChildrenContainer.Creation.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.Creation$](ChildrenContainer.Creation$.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.EmptyChildrenContainer$](ChildrenContainer.EmptyChildrenContainer$.html "class in akka.actor.dungeon") | This is the empty container, shared among all leaf actors. |
| [ChildrenContainer.NormalChildrenContainer](ChildrenContainer.NormalChildrenContainer.html "class in akka.actor.dungeon") | Normal children container: we do have at least one child, but none of our  children are currently terminating (which is the time period between  calling context.stop(child) and processing the ChildTerminated() system  message). |
| [ChildrenContainer.NormalChildrenContainer$](ChildrenContainer.NormalChildrenContainer$.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.Recreation](ChildrenContainer.Recreation.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.Recreation$](ChildrenContainer.Recreation$.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.TerminatedChildrenContainer$](ChildrenContainer.TerminatedChildrenContainer$.html "class in akka.actor.dungeon") | This is the empty container which is installed after the last child has  terminated while stopping; it is necessary to distinguish from the normal  empty state while calling handleChildTerminated() for the last time. |
| [ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon") | Waiting state: there are outstanding termination requests (i.e. |
| [ChildrenContainer.TerminatingChildrenContainer$](ChildrenContainer.TerminatingChildrenContainer$.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.Termination$](ChildrenContainer.Termination$.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer.UserRequest$](ChildrenContainer.UserRequest$.html "class in akka.actor.dungeon") |  |
| [ChildrenContainer$](ChildrenContainer$.html "class in akka.actor.dungeon") | INTERNAL API |
| [FaultHandling$](FaultHandling$.html "class in akka.actor.dungeon") | INTERNAL API |
| [LicenseKeySupplier$](LicenseKeySupplier$.html "class in akka.actor.dungeon") | INTERNAL API |
| [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor.dungeon") | INTERNAL API |
| [SerializationCheckFailedException$](SerializationCheckFailedException$.html "class in akka.actor.dungeon") |  |
- Exception Summary 
| Exception | Description |
| [SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") |  |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/Children$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/Children.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.ChildRestartsIterable.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.ChildrenIterable.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.Creation$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.Creation.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.EmptyChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.EmptyChildrenContainer.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.NormalChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.NormalChildrenContainer.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.Recreation$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.Recreation.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.SuspendReason.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.TerminatedChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.Termination$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.UserRequest$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.WaitingForChildren.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ChildrenContainer.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/DeathWatch.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/Dispatch.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/FaultHandling$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/FaultHandling.FailedInfo.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/FaultHandling.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/LicenseKeySupplier$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/LicenseKeySupplier.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ReceiveTimeout$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/ReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/SerializationCheckFailedException$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/SerializationCheckFailedException.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/actor/dungeon/package-summary.html)*