---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.html
title: Receptionist
---

# Receptionist

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class Receptionist

- java.lang.Object
- - akka.actor.typed.receptionist.Receptionist

- All Implemented Interfaces:
`[Extension](../Extension.html "interface in akka.actor.typed")`

---

```
public abstract class Receptionist
extends java.lang.Object
implements [Extension](../Extension.html "interface in akka.actor.typed")
```

Register and discover actors that implement a service with a protocol defined by a [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist").
 
 This class is not intended for user extension other than for test purposes (e.g.
 stub implementation). More methods may be added in the future and that may break
 such implementations.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | The set of commands accepted by a Receptionist. |
	| `static class` | `[Receptionist.Deregister$](Receptionist.Deregister$.html "class in akka.actor.typed.receptionist")` | Remove association between the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") and the given [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
	| `static interface` | `[Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")` | Confirmation that the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") no more associated with the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist") in the local receptionist. |
	| `static class` | `[Receptionist.Deregistered$](Receptionist.Deregistered$.html "class in akka.actor.typed.receptionist")` | Sent by the receptionist, available here for easier testing |
	| `static class` | `[Receptionist.Find$](Receptionist.Find$.html "class in akka.actor.typed.receptionist")` | `Find` message. |
	| `static interface` | `[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")` | Current listing of all Actors that implement the protocol given by the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
	| `static class` | `[Receptionist.Listing$](Receptionist.Listing$.html "class in akka.actor.typed.receptionist")` | Sent by the receptionist, available here for easier testing |
	| `static class` | `[Receptionist.Register$](Receptionist.Register$.html "class in akka.actor.typed.receptionist")` | `Register` message. |
	| `static interface` | `[Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")` | Confirmation that the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") has been associated with the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist"). |
	| `static class` | `[Receptionist.Registered$](Receptionist.Registered$.html "class in akka.actor.typed.receptionist")` | Sent by the receptionist, available here for easier testing |
	| `static class` | `[Receptionist.Subscribe$](Receptionist.Subscribe$.html "class in akka.actor.typed.receptionist")` | `Subscribe` message. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Receptionist](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[deregister](#deregister(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)` | Java API: A Deregister message without Ack that the service was unregistered |
	| `static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[deregister](#deregister(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")> replyTo)` | Java API: A Deregister message with an actor that will get an ack that the service was unregistered |
	| `static <T> [Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")` | `[deregistered](#deregistered(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)` | Java API: Sent by the receptionist, available here for easier testing |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[find](#find(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> replyTo)` | Java API: `Find` message. |
	| `static [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `static <T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")` | `[listing](#listing(akka.actor.typed.receptionist.ServiceKey,java.util.Set))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances)` | Java API: Sent by the receptionist, available here for easier testing |
	| `static <T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")` | `[listing](#listing(akka.actor.typed.receptionist.ServiceKey,java.util.Set,java.util.Set,boolean))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances,  java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> allServiceInstances,  boolean servicesWereAddedOrRemoved)` | Java API: Sent by the receptionist, available here for easier testing |
	| `abstract [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[ref](#ref())()` |  |
	| `static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[register](#register(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)` | Java API: A Register message without Ack that the service was registered. |
	| `static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[register](#register(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")> replyTo)` | Java API: A `Register` message with Ack that the service was registered. |
	| `static <T> [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")` | `[registered](#registered(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)` | Java API: Sent by the receptionist, available here for easier testing |
	| `static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[subscribe](#subscribe(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)` | Java API: `Subscribe` message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Receptionist
		
		
		
		```
		public Receptionist()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist") createExtension​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### get
		
		
		
		```
		public static [Receptionist](Receptionist.html "class in akka.actor.typed.receptionist") get​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### register
		
		
		
		```
		public static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") register​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)
		```
		
		Java API: A Register message without Ack that the service was registered.
		 Associate the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") with the given [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist")
		 by sending this command to the `Receptionist.ref`.
		 
		 Multiple registrations can be made for the same key. De\-registration is implied by
		 the end of the referenced Actor\&rsquo;s lifecycle, but it can also be explicitly deregistered before termination.
		- #### register
		
		
		
		```
		public static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") register​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,
		                                                [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")> replyTo)
		```
		
		Java API: A `Register` message with Ack that the service was registered.
		 Associate the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") with the given [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist")
		 by sending this command to the `Receptionist.ref`.
		 
		 Multiple registrations can be made for the same key. De\-registration is implied by
		 the end of the referenced Actor\&rsquo;s lifecycle, but it can also be explicitly deregistered before termination.
		 
		
		
		 Registration will be acknowledged with the [`Receptionist.Registered`](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") message to the given replyTo actor.
		- #### registered
		
		
		
		```
		public static <T> [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") registered​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                     [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### deregister
		
		
		
		```
		public static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") deregister​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service)
		```
		
		Java API: A Deregister message without Ack that the service was unregistered
		- #### deregister
		
		
		
		```
		public static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") deregister​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> service,
		                                                  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist")> replyTo)
		```
		
		Java API: A Deregister message with an actor that will get an ack that the service was unregistered
		- #### deregistered
		
		
		
		```
		public static <T> [Receptionist.Deregistered](Receptionist.Deregistered.html "interface in akka.actor.typed.receptionist") deregistered​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                         [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### subscribe
		
		
		
		```
		public static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") subscribe​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                 [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)
		```
		
		Java API: `Subscribe` message. The given actor to service updates when this command is sent to
		 the `Receptionist.ref`. When the set of instances registered for the given key changes
		 the subscriber will be sent a [`Receptionist.Listing`](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") with the new set of instances for that service.
		 
		 The subscription will be acknowledged by sending out a first [`Receptionist.Listing`](Receptionist.Listing.html "interface in akka.actor.typed.receptionist"). The subscription automatically ends
		 with the termination of the subscriber.
		- #### find
		
		
		
		```
		public static <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") find​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                            [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> replyTo)
		```
		
		Java API: `Find` message. Query the Receptionist for a list of all Actors implementing the given
		 protocol at one point in time by sending this command to the `Receptionist.ref`.
		- #### listing
		
		
		
		```
		public static <T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") listing​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                               java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### listing
		
		
		
		```
		public static <T> [Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") listing​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                               java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> serviceInstances,
		                                               java.util.Set<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> allServiceInstances,
		                                               boolean servicesWereAddedOrRemoved)
		```
		
		Java API: Sent by the receptionist, available here for easier testing
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### id
		
		
		
		```
		public static [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### ref
		
		
		
		```
		public abstract [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")> ref()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Deregister$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Deregistered$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Deregistered.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Find$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Listing$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Listing.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Register$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Registered$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Registered.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.Subscribe$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.html](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/receptionist/Receptionist.html)*