---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$.html
title: Receptionist$
---

# Receptionist$

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class Receptionist$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../ExtensionId.html "class in akka.actor.typed")\<[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")\>
	- - akka.actor.typed.receptionist.Receptionist$

- ---

```
public class Receptionist$
extends [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")>
```

A Receptionist is an entry point into an Actor hierarchy where select Actors
 publish their identity together with the protocols that they implement. Other
 Actors need only know the Receptionist\&rsquo;s identity in order to be able to use
 the services of the registered Actors.
 
 These are the messages (and the extension) for interacting with the receptionist.
 The receptionist is easiest accessed through the system: `ActorSystem.receptionist`

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Receptionist$](Receptionist$.html "class in akka.actor.typed.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Receptionist$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[deregister](#deregister(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)` | Java API: A Deregister message without Ack that the service was unregistered |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[deregister](#deregister(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")> replyTo)` | Java API: A Deregister message with an actor that will get an ack that the service was unregistered |
	| `<T> [Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")` | `[deregistered](#deregistered(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)` | Java API: Sent by the receptionist, available here for easier testing |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[find](#find(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> replyTo)` | Java API: `Find` message. |
	| `[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `<T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")` | `[listing](#listing(akka.actor.typed.receptionist.ServiceKey,java.util.Set))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances)` | Java API: Sent by the receptionist, available here for easier testing |
	| `<T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")` | `[listing](#listing(akka.actor.typed.receptionist.ServiceKey,java.util.Set,java.util.Set,boolean))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances,  java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> allServiceInstances,  boolean servicesWereAddedOrRemoved)` | Java API: Sent by the receptionist, available here for easier testing |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[register](#register(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)` | Java API: A Register message without Ack that the service was registered. |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[register](#register(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")> replyTo)` | Java API: A `Register` message with Ack that the service was registered. |
	| `<T> [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")` | `[registered](#registered(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)` | Java API: Sent by the receptionist, available here for easier testing |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[subscribe](#subscribe(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)` | Java API: `Subscribe` message. |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../ExtensionId.html#equals(java.lang.Object)), [hashCode](../ExtensionId.html#hashCode()), [id](../ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Receptionist$](Receptionist$.html "class in akka.actor.typed.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Receptionist$
		
		
		
		```
		public Receptionist$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist") createExtension​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../ExtensionId.html "class in akka.actor.typed")<[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")>`
		- #### get
		
		
		
		```
		public [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist") get​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### register
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") register​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                         [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)
		```
		
		Java API: A Register message without Ack that the service was registered.
		 Associate the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") with the given [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist")
		 by sending this command to the `Receptionist.ref`.
		 
		 Multiple registrations can be made for the same key. De\-registration is implied by
		 the end of the referenced Actor\&rsquo;s lifecycle, but it can also be explicitly deregistered before termination.
		- #### register
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") register​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                         [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,
		                                         [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")> replyTo)
		```
		
		Java API: A `Register` message with Ack that the service was registered.
		 Associate the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") with the given [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist")
		 by sending this command to the `Receptionist.ref`.
		 
		 Multiple registrations can be made for the same key. De\-registration is implied by
		 the end of the referenced Actor\&rsquo;s lifecycle, but it can also be explicitly deregistered before termination.
		 
		
		
		 Registration will be acknowledged with the `Registered` message to the given replyTo actor.
		- #### registered
		
		
		
		```
		public <T> [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") registered​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                              [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### deregister
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") deregister​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                           [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)
		```
		
		Java API: A Deregister message without Ack that the service was unregistered
		- #### deregister
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") deregister​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                           [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,
		                                           [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")> replyTo)
		```
		
		Java API: A Deregister message with an actor that will get an ack that the service was unregistered
		- #### deregistered
		
		
		
		```
		public <T> [Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist") deregistered​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### subscribe
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") subscribe​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                          [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)
		```
		
		Java API: `Subscribe` message. The given actor to service updates when this command is sent to
		 the `Receptionist.ref`. When the set of instances registered for the given key changes
		 the subscriber will be sent a `Listing` with the new set of instances for that service.
		 
		 The subscription will be acknowledged by sending out a first `Listing`. The subscription automatically ends
		 with the termination of the subscriber.
		- #### find
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") find​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                     [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> replyTo)
		```
		
		Java API: `Find` message. Query the Receptionist for a list of all Actors implementing the given
		 protocol at one point in time by sending this command to the `Receptionist.ref`.
		- #### listing
		
		
		
		```
		public <T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") listing​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                        java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### listing
		
		
		
		```
		public <T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") listing​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                        java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances,
		                                        java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> allServiceInstances,
		                                        boolean servicesWereAddedOrRemoved)
		```
		
		Java API: Sent by the receptionist, available here for easier testing

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Deregistered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Listing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Registered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$.html)*