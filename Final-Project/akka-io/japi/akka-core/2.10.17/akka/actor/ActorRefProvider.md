---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:43:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefProvider.html
title: ActorRefProvider
---

# ActorRefProvider

## Content

Package [akka.actor](package-summary.html)
## Interface ActorRefProvider

- ---

```
public interface ActorRefProvider
```

Interface for all ActorRef providers to implement.
 Not intended for extension outside of Akka.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.InternalActorRef` | `[actorOf](#actorOf(akka.actor.ActorSystemImpl,akka.actor.Props,akka.actor.InternalActorRef,akka.actor.ActorPath,boolean,scala.Option,boolean,boolean))​(akka.actor.ActorSystemImpl system,  [Props](Props.html "class in akka.actor") props,  akka.actor.InternalActorRef supervisor,  [ActorPath](ActorPath.html "interface in akka.actor") path,  boolean systemService,  scala.Option<[Deploy](Deploy.html "class in akka.actor")> deploy,  boolean lookupDeploy,  boolean async)` | INTERNAL API: Actor factory with create\-only semantics: will create an actor as  described by props with the given supervisor and path (may be different  in case of remote supervision). |
	| `java.lang.String` | `[addressString](#addressString())()` | INTERNAL API |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[deadLetters](#deadLetters())()` | Dead letter destination for this provider. |
	| `akka.actor.Deployer` | `[deployer](#deployer())()` | The Deployer associated with this ActorRefProvider |
	| `[Address](Address.html "class in akka.actor")` | `[getDefaultAddress](#getDefaultAddress())()` | Obtain the external address of the default transport. |
	| `scala.Option<[Address](Address.html "class in akka.actor")>` | `[getExternalAddressFor](#getExternalAddressFor(akka.actor.Address))​([Address](Address.html "class in akka.actor") addr)` | Obtain the address which is to be used within sender references when  sending to the given other address or none if the other address cannot be  reached from this system (i.e. |
	| `akka.actor.LocalActorRef` | `[guardian](#guardian())()` | Reference to the supervisor used for all top\-level user actors. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[ignoreRef](#ignoreRef())()` | INTERNAL API |
	| `void` | `[init](#init(akka.actor.ActorSystemImpl))​(akka.actor.ActorSystemImpl system)` | INTERNAL API: Initialization of an ActorRefProvider happens in two steps: first  construction of the object with settings, eventStream, etc. |
	| `void` | `[registerTempActor](#registerTempActor(akka.actor.InternalActorRef,akka.actor.ActorPath))​(akka.actor.InternalActorRef actorRef,  [ActorPath](ActorPath.html "interface in akka.actor") path)` | INTERNAL API: Registers an actorRef at a path returned by tempPath(); do NOT pass in any other path. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[resolveActorRef](#resolveActorRef(akka.actor.ActorPath))​([ActorPath](ActorPath.html "interface in akka.actor") path)` | Create actor reference for a specified path. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[resolveActorRef](#resolveActorRef(java.lang.String))​(java.lang.String path)` | Create actor reference for a specified path. |
	| `akka.actor.InternalActorRef` | `[rootGuardian](#rootGuardian())()` | Reference to the supervisor of guardian and systemGuardian; this is  exposed so that the ActorSystemImpl can use it as lookupRoot, i.e. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[rootGuardianAt](#rootGuardianAt(akka.actor.Address))​([Address](Address.html "class in akka.actor") address)` | Reference to the supervisor of guardian and systemGuardian at the specified address;  this is exposed so that the ActorRefFactory can use it as lookupRoot, i.e. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[rootPath](#rootPath())()` | The root path for all actors within this actor system, not including any remote address information. |
	| `[Serialization.Information](../serialization/Serialization.Information.html "class in akka.serialization")` | `[serializationInformation](#serializationInformation())()` | INTERNAL API |
	| `[ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor")` | `[settings](#settings())()` | The Settings associated with this ActorRefProvider |
	| `akka.actor.LocalActorRef` | `[systemGuardian](#systemGuardian())()` | Reference to the supervisor used for all top\-level system actors. |
	| `long` | `[systemUid](#systemUid())()` |  |
	| `akka.actor.InternalActorRef` | `[tempContainer](#tempContainer())()` | Returns the actor reference representing the \&ldquo;/temp\&rdquo; path. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[tempPath](#tempPath())()` | Generates and returns a unique actor path below \&ldquo;/temp\&rdquo;. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[tempPath](#tempPath(java.lang.String))​(java.lang.String prefix)` | Generates and returns a unique actor path starting with `prefix` below \&ldquo;/temp\&rdquo;. |
	| `scala.concurrent.Future<[Terminated](Terminated.html "class in akka.actor")>` | `[terminationFuture](#terminationFuture())()` | This Future is completed upon termination of this ActorRefProvider, which  is usually initiated by stopping the guardian via ActorSystem.stop(). |
	| `void` | `[unregisterTempActor](#unregisterTempActor(akka.actor.ActorPath))​([ActorPath](ActorPath.html "interface in akka.actor") path)` | Unregister a temporary actor from the \&ldquo;/temp\&rdquo; path (i.e. |

- - ### Method Detail
	
	
	
		- #### actorOf
		
		
		
		```
		akka.actor.InternalActorRef actorOf​(akka.actor.ActorSystemImpl system,
		                                    [Props](Props.html "class in akka.actor") props,
		                                    akka.actor.InternalActorRef supervisor,
		                                    [ActorPath](ActorPath.html "interface in akka.actor") path,
		                                    boolean systemService,
		                                    scala.Option<[Deploy](Deploy.html "class in akka.actor")> deploy,
		                                    boolean lookupDeploy,
		                                    boolean async)
		```
		
		INTERNAL API: Actor factory with create\-only semantics: will create an actor as
		 described by props with the given supervisor and path (may be different
		 in case of remote supervision). If systemService is true, deployment is
		 bypassed (local\-only). If Some(deploy) is passed in, it should be
		 regarded as taking precedence over the nominally applicable settings,
		 but it should be overridable from external configuration; the lookup of
		 the latter can be suppressed by setting lookupDeploy to false.
		- #### addressString
		
		
		
		```
		java.lang.String addressString()
		```
		
		INTERNAL API
		- #### deadLetters
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") deadLetters()
		```
		
		Dead letter destination for this provider.
		- #### deployer
		
		
		
		```
		akka.actor.Deployer deployer()
		```
		
		The Deployer associated with this ActorRefProvider
		- #### getDefaultAddress
		
		
		
		```
		[Address](Address.html "class in akka.actor") getDefaultAddress()
		```
		
		Obtain the external address of the default transport.
		- #### getExternalAddressFor
		
		
		
		```
		scala.Option<[Address](Address.html "class in akka.actor")> getExternalAddressFor​([Address](Address.html "class in akka.actor") addr)
		```
		
		Obtain the address which is to be used within sender references when
		 sending to the given other address or none if the other address cannot be
		 reached from this system (i.e. no means of communication known; no
		 attempt is made to verify actual reachability).
		- #### guardian
		
		
		
		```
		akka.actor.LocalActorRef guardian()
		```
		
		Reference to the supervisor used for all top\-level user actors.
		- #### ignoreRef
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") ignoreRef()
		```
		
		INTERNAL API
		- #### init
		
		
		
		```
		void init​(akka.actor.ActorSystemImpl system)
		```
		
		INTERNAL API: Initialization of an ActorRefProvider happens in two steps: first
		 construction of the object with settings, eventStream, etc.
		 and then—when the ActorSystem is constructed—the second phase during
		 which actors may be created (e.g. the guardians).
		- #### registerTempActor
		
		
		
		```
		void registerTempActor​(akka.actor.InternalActorRef actorRef,
		                       [ActorPath](ActorPath.html "interface in akka.actor") path)
		```
		
		INTERNAL API: Registers an actorRef at a path returned by tempPath(); do NOT pass in any other path.
		- #### resolveActorRef
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") resolveActorRef​(java.lang.String path)
		```
		
		Create actor reference for a specified path. If no such
		 actor exists, it will be (equivalent to) a dead letter reference.
		- #### resolveActorRef
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") resolveActorRef​([ActorPath](ActorPath.html "interface in akka.actor") path)
		```
		
		Create actor reference for a specified path. If no such
		 actor exists, it will be (equivalent to) a dead letter reference.
		- #### rootGuardian
		
		
		
		```
		akka.actor.InternalActorRef rootGuardian()
		```
		
		Reference to the supervisor of guardian and systemGuardian; this is
		 exposed so that the ActorSystemImpl can use it as lookupRoot, i.e.
		 for anchoring absolute actor look\-ups.
		- #### rootGuardianAt
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") rootGuardianAt​([Address](Address.html "class in akka.actor") address)
		```
		
		Reference to the supervisor of guardian and systemGuardian at the specified address;
		 this is exposed so that the ActorRefFactory can use it as lookupRoot, i.e.
		 for anchoring absolute actor selections.
		- #### rootPath
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") rootPath()
		```
		
		The root path for all actors within this actor system, not including any remote address information.
		- #### serializationInformation
		
		
		
		```
		[Serialization.Information](../serialization/Serialization.Information.html "class in akka.serialization") serializationInformation()
		```
		
		INTERNAL API
		- #### settings
		
		
		
		```
		[ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor") settings()
		```
		
		The Settings associated with this ActorRefProvider
		- #### systemGuardian
		
		
		
		```
		akka.actor.LocalActorRef systemGuardian()
		```
		
		Reference to the supervisor used for all top\-level system actors.
		- #### systemUid
		
		
		
		```
		long systemUid()
		```
		- #### tempContainer
		
		
		
		```
		akka.actor.InternalActorRef tempContainer()
		```
		
		Returns the actor reference representing the \&ldquo;/temp\&rdquo; path.
		- #### tempPath
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") tempPath()
		```
		
		Generates and returns a unique actor path below \&ldquo;/temp\&rdquo;.
		- #### tempPath
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") tempPath​(java.lang.String prefix)
		```
		
		Generates and returns a unique actor path starting with `prefix` below \&ldquo;/temp\&rdquo;.
		- #### terminationFuture
		
		
		
		```
		scala.concurrent.Future<[Terminated](Terminated.html "class in akka.actor")> terminationFuture()
		```
		
		This Future is completed upon termination of this ActorRefProvider, which
		 is usually initiated by stopping the guardian via ActorSystem.stop().
		- #### unregisterTempActor
		
		
		
		```
		void unregisterTempActor​([ActorPath](ActorPath.html "interface in akka.actor") path)
		```
		
		Unregister a temporary actor from the \&ldquo;/temp\&rdquo; path (i.e. obtained from tempPath()); do NOT pass in any other path.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.Information.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefProvider.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefProvider.html)*