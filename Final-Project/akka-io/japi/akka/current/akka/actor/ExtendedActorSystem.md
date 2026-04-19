---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
title: ExtendedActorSystem
---

# ExtendedActorSystem

## Content

Package [akka.actor](package-summary.html)
## Class ExtendedActorSystem

- java.lang.Object
- - [akka.actor.ActorSystem](ActorSystem.html "class in akka.actor")
	- - akka.actor.ExtendedActorSystem

- All Implemented Interfaces:
`[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")`, `[ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor")`

---

```
public abstract class ExtendedActorSystem
extends [ActorSystem](ActorSystem.html "class in akka.actor")
```

More powerful interface to the actor system\&rsquo;s implementation which is presented to extensions (see [`Extension`](Extension.html "interface in akka.actor")).
 
***Important Notice:***

 This class is not meant to be extended by user code. If you want to
 actually roll your own Akka, beware that you are completely on your own in
 that case!

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[ActorSystem](ActorSystem.html "class in akka.actor")
		
		
		`[ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor"), [ActorSystem.Settings$](ActorSystem.Settings$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExtendedActorSystem](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [DynamicAccess](DynamicAccess.html "class in akka.actor")` | `[dynamicAccess](#dynamicAccess())()` | ClassLoader wrapper which is used for reflective accesses internally. |
	| `abstract akka.actor.InternalActorRef` | `[guardian](#guardian())()` | The top\-level supervisor of all actors created using system.actorOf(...). |
	| `abstract [LoggingFilter](../event/LoggingFilter.html "interface in akka.event")` | `[logFilter](#logFilter())()` | Filter of log events that is used by the LoggingAdapter before  publishing log events to the eventStream |
	| `abstract [ActorRefProvider](ActorRefProvider.html "interface in akka.actor")` | `[provider](#provider())()` | The ActorRefProvider is the only entity which creates all actor references within this actor system. |
	| `abstract [ActorRef](ActorRef.html "class in akka.actor")` | `[systemActorOf](#systemActorOf(akka.actor.Props,java.lang.String))​([Props](Props.html "class in akka.actor") props,  java.lang.String name)` | Create an actor in the "/system" namespace. |
	| `abstract akka.actor.InternalActorRef` | `[systemGuardian](#systemGuardian())()` | The top\-level supervisor of all system\-internal services like logging. |
	| `abstract java.util.concurrent.ThreadFactory` | `[threadFactory](#threadFactory())()` | A ThreadFactory that can be used if the transport needs to create any Threads |
	| `abstract long` | `[uid](#uid())()` | Random uid assigned at ActorSystem startup. |
	
	
		- ### Methods inherited from class akka.actor.[ActorSystem](ActorSystem.html "class in akka.actor")
		
		
		`[$div](ActorSystem.html#$div(java.lang.String)), [$div](ActorSystem.html#$div(scala.collection.Iterable)), [apply](ActorSystem.html#apply()), [apply](ActorSystem.html#apply(java.lang.String)), [apply](ActorSystem.html#apply(java.lang.String,akka.actor.BootstrapSetup)), [apply](ActorSystem.html#apply(java.lang.String,akka.actor.setup.ActorSystemSetup)), [apply](ActorSystem.html#apply(java.lang.String,com.typesafe.config.Config)), [apply](ActorSystem.html#apply(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader)), [apply](ActorSystem.html#apply(java.lang.String,scala.Option,scala.Option,scala.Option)), [apply$default$2](ActorSystem.html#apply$default$2()), [apply$default$3](ActorSystem.html#apply$default$3()), [apply$default$4](ActorSystem.html#apply$default$4()), [child](ActorSystem.html#child(java.lang.String)), [create](ActorSystem.html#create()), [create](ActorSystem.html#create(java.lang.String)), [create](ActorSystem.html#create(java.lang.String,akka.actor.BootstrapSetup)), [create](ActorSystem.html#create(java.lang.String,akka.actor.setup.ActorSystemSetup)), [create](ActorSystem.html#create(java.lang.String,com.typesafe.config.Config)), [create](ActorSystem.html#create(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader)), [create](ActorSystem.html#create(java.lang.String,com.typesafe.config.Config,java.lang.ClassLoader,scala.concurrent.ExecutionContext)), [deadLetters](ActorSystem.html#deadLetters()), [descendant](ActorSystem.html#descendant(java.lang.Iterable)), [dispatcher](ActorSystem.html#dispatcher()), [dispatchers](ActorSystem.html#dispatchers()), [eventStream](ActorSystem.html#eventStream()), [extension](ActorSystem.html#extension(akka.actor.ExtensionId)), [getDispatcher](ActorSystem.html#getDispatcher()), [getEventStream](ActorSystem.html#getEventStream()), [getLicenseKeyExpiry](ActorSystem.html#getLicenseKeyExpiry()), [getScheduler](ActorSystem.html#getScheduler()), [getWhenTerminated](ActorSystem.html#getWhenTerminated()), [hasExtension](ActorSystem.html#hasExtension(akka.actor.ExtensionId)), [licenseKeyExpiry](ActorSystem.html#licenseKeyExpiry()), [log](ActorSystem.html#log()), [logConfiguration](ActorSystem.html#logConfiguration()), [mailboxes](ActorSystem.html#mailboxes()), [name](ActorSystem.html#name()), [registerExtension](ActorSystem.html#registerExtension(akka.actor.ExtensionId)), [registerOnTermination](ActorSystem.html#registerOnTermination(java.lang.Runnable)), [registerOnTermination](ActorSystem.html#registerOnTermination(scala.Function0)), [scheduler](ActorSystem.html#scheduler()), [settings](ActorSystem.html#settings()), [startTime](ActorSystem.html#startTime()), [terminate](ActorSystem.html#terminate()), [uptime](ActorSystem.html#uptime()), [Version](ActorSystem.html#Version()), [whenTerminated](ActorSystem.html#whenTerminated())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ActorRefFactory](ActorRefFactory.html "interface in akka.actor")
		
		
		`[actorOf](ActorRefFactory.html#actorOf(akka.actor.Props)), [actorOf](ActorRefFactory.html#actorOf(akka.actor.Props,java.lang.String)), [actorSelection](ActorRefFactory.html#actorSelection(akka.actor.ActorPath)), [actorSelection](ActorRefFactory.html#actorSelection(java.lang.String)), [lookupRoot](ActorRefFactory.html#lookupRoot()), [stop](ActorRefFactory.html#stop(akka.actor.ActorRef)), [systemImpl](ActorRefFactory.html#systemImpl())`
		- ### Methods inherited from interface akka.actor.[ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor")
		
		
		`[classicSystem](ClassicActorSystemProvider.html#classicSystem())`

- - ### Constructor Detail
	
	
	
		- #### ExtendedActorSystem
		
		
		
		```
		public ExtendedActorSystem()
		```

	- ### Method Detail
	
	
	
		- #### dynamicAccess
		
		
		
		```
		public abstract [DynamicAccess](DynamicAccess.html "class in akka.actor") dynamicAccess()
		```
		
		ClassLoader wrapper which is used for reflective accesses internally. This is set
		 to use the context class loader, if one is set, or the class loader which
		 loaded the ActorSystem implementation. The context class loader is also
		 set on all threads created by the ActorSystem, if one was set during
		 creation.
		- #### guardian
		
		
		
		```
		public abstract akka.actor.InternalActorRef guardian()
		```
		
		The top\-level supervisor of all actors created using system.actorOf(...).
		- #### logFilter
		
		
		
		```
		public abstract [LoggingFilter](../event/LoggingFilter.html "interface in akka.event") logFilter()
		```
		
		Filter of log events that is used by the LoggingAdapter before
		 publishing log events to the eventStream
		- #### provider
		
		
		
		```
		public abstract [ActorRefProvider](ActorRefProvider.html "interface in akka.actor") provider()
		```
		
		The ActorRefProvider is the only entity which creates all actor references within this actor system.
		- #### systemActorOf
		
		
		
		```
		public abstract [ActorRef](ActorRef.html "class in akka.actor") systemActorOf​([Props](Props.html "class in akka.actor") props,
		                                       java.lang.String name)
		```
		
		Create an actor in the "/system" namespace. This actor will be shut down
		 during system.terminate only after all user actors have terminated.
		 
		 This is only intended to be used by libraries (and Akka itself).
		 Applications should use ordinary `actorOf`.
		- #### systemGuardian
		
		
		
		```
		public abstract akka.actor.InternalActorRef systemGuardian()
		```
		
		The top\-level supervisor of all system\-internal services like logging.
		- #### threadFactory
		
		
		
		```
		public abstract java.util.concurrent.ThreadFactory threadFactory()
		```
		
		A ThreadFactory that can be used if the transport needs to create any Threads
		- #### uid
		
		
		
		```
		public abstract long uid()
		```
		
		Random uid assigned at ActorSystem startup. When using Akka Cluster this
		 uid is used together with an [`Address`](Address.html "class in akka.actor") to be able to distinguish restarted
		 actor system using the same host and port.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.Settings$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html](https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html)*