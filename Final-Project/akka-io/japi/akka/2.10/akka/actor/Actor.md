---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html
title: Actor
---

# Actor

## Content

Package [akka.actor](package-summary.html)
## Interface Actor

- All Known Subinterfaces:
`[AbstractPersistentActorLike](../persistence/AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AsyncWriteJournal](../persistence/journal/AsyncWriteJournal.html "interface in akka.persistence.journal")`, `[AsyncWriteProxy](../persistence/journal/AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[AtLeastOnceDelivery](../persistence/AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](../persistence/AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[DiagnosticActorLogging](DiagnosticActorLogging.html "interface in akka.actor")`, `[DistributedPubSubMediator.Internal$.TopicLike](../cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html "interface in akka.cluster.pubsub")`, `[Eventsourced](../persistence/Eventsourced.html "interface in akka.persistence")`, `[FSM](FSM.html "interface in akka.actor")<S,​D>`, `[LeveldbCompaction](../persistence/journal/leveldb/LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbIdMapping](../persistence/journal/leveldb/LeveldbIdMapping.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbStore](../persistence/journal/leveldb/LeveldbStore.html "interface in akka.persistence.journal.leveldb")`, `[LoggingFSM](LoggingFSM.html "interface in akka.actor")<S,​D>`, `[PersistenceStash](../persistence/PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../persistence/PersistentActor.html "interface in akka.persistence")`, `[SnapshotStore](../persistence/snapshot/SnapshotStore.html "interface in akka.persistence.snapshot")`, `[Snapshotter](../persistence/Snapshotter.html "interface in akka.persistence")`, `[Stash](Stash.html "interface in akka.actor")`, `[Timers](Timers.html "interface in akka.actor")`, `[UnboundedStash](UnboundedStash.html "interface in akka.actor")`, `[UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractActor](AbstractActor.html "class in akka.actor")`, `[AbstractActorWithStash](AbstractActorWithStash.html "class in akka.actor")`, `[AbstractActorWithTimers](AbstractActorWithTimers.html "class in akka.actor")`, `[AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "class in akka.actor")`, `[AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "class in akka.actor")`, `[AbstractFSM](AbstractFSM.html "class in akka.actor")`, `[AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractLoggingActor](AbstractLoggingActor.html "class in akka.actor")`, `[AbstractLoggingFSM](AbstractLoggingFSM.html "class in akka.actor")`, `[AbstractPersistentActor](../persistence/AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](../persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[AsyncWriteJournal](../persistence/journal/japi/AsyncWriteJournal.html "class in akka.persistence.journal.japi")`, `[AsyncWriteJournal.Resequencer](../persistence/journal/AsyncWriteJournal.Resequencer.html "class in akka.persistence.journal")`, `[ClusterSingletonManager](../cluster/singleton/ClusterSingletonManager.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.OldestChangedBuffer](../cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html "class in akka.cluster.singleton")`, `[ClusterSingletonProxy](../cluster/singleton/ClusterSingletonProxy.html "class in akka.cluster.singleton")`, `[DeadLetterListener](../event/DeadLetterListener.html "class in akka.event")`, `[DistributedPubSubMediator](../cluster/pubsub/DistributedPubSubMediator.html "class in akka.cluster.pubsub")`, `[InetAddressDnsResolver](../io/InetAddressDnsResolver.html "class in akka.io")`, `[JavaLogger](../event/jul/JavaLogger.html "class in akka.event.jul")`, `[JournalPerfSpec.BenchActor](../persistence/journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[LmdbDurableStore](../cluster/ddata/LmdbDurableStore.html "class in akka.cluster.ddata")`, `[Logging.DefaultLogger](../event/Logging.DefaultLogger.html "class in akka.event")`, `[NoSnapshotStore](../persistence/snapshot/NoSnapshotStore.html "class in akka.persistence.snapshot")`, `[PersistencePluginProxy](../persistence/journal/PersistencePluginProxy.html "class in akka.persistence.journal")`, `[PersistenceTestKitPlugin](../persistence/testkit/PersistenceTestKitPlugin.html "class in akka.persistence.testkit")`, `[PersistenceTestKitSnapshotPlugin](../persistence/testkit/PersistenceTestKitSnapshotPlugin.html "class in akka.persistence.testkit")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`, `[Player.Waiter](../remote/testconductor/Player.Waiter.html "class in akka.remote.testconductor")`, `[RemoveInternalClusterShardingData](../cluster/sharding/RemoveInternalClusterShardingData.html "class in akka.cluster.sharding")`, `[ReplayMediator](../persistence/journal/ReplayMediator.html "class in akka.persistence.journal")`, `[Replicator](../cluster/ddata/Replicator.html "class in akka.cluster.ddata")`, `[ShardCoordinator](../cluster/sharding/ShardCoordinator.html "class in akka.cluster.sharding")`, `[SharedLeveldbStore](../persistence/journal/leveldb/SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`, `[SimpleDnsManager](../io/SimpleDnsManager.html "class in akka.io")`, `[Slf4jLogger](../event/slf4j/Slf4jLogger.html "class in akka.event.slf4j")`, `[SnapshotStore](../persistence/snapshot/japi/SnapshotStore.html "class in akka.persistence.snapshot.japi")`, `[TestActor](../testkit/TestActor.html "class in akka.testkit")`, `[TestActors.BlackholeActor](../testkit/TestActors.BlackholeActor.html "class in akka.testkit")`, `[TestActors.EchoActor](../testkit/TestActors.EchoActor.html "class in akka.testkit")`, `[TestActors.ForwardActor](../testkit/TestActors.ForwardActor.html "class in akka.testkit")`, `[TestEventListener](../testkit/TestEventListener.html "class in akka.testkit")`, `[UntypedAbstractActor](UntypedAbstractActor.html "class in akka.actor")`

---

```
public interface Actor
```

Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model':
 <https://en.wikipedia.org/wiki/Actor_model>

 An actor has a well\-defined (non\-cyclic) life\-cycle.
 \- ''RUNNING'' (created and started actor) \- can receive messages
 \- ''SHUTDOWN'' (when 'stop' is invoked) \- can't do anything
 

 The Actor's own [`ActorRef`](ActorRef.html "class in akka.actor") is available as `self`, the current
 message\&rsquo;s sender as `sender()` and the [`ActorContext`](ActorContext.html "interface in akka.actor") as
 `context`. The only abstract method is `receive` which shall return the
 initial behavior of the actor as a partial function (behavior can be changed
 using `context.become` and `context.unbecome`).
 

 This is the Scala API (hence the Scala code below), for the Java API see [`AbstractActor`](AbstractActor.html "class in akka.actor").
 

```

 class ExampleActor extends Actor {

   override val supervisorStrategy = OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
     case _: ArithmeticException      => Resume
     case _: NullPointerException     => Restart
     case _: IllegalArgumentException => Stop
     case _: Exception                => Escalate
   }

   def receive = {
                                      // directly calculated reply
     case Request(r)               => sender() ! calculate(r)

                                      // just to demonstrate how to stop yourself
     case Shutdown                 => context.stop(self)

                                      // error kernel with child replying directly to 'sender()'
     case Dangerous(r)             => context.actorOf(Props[ReplyToOriginWorker]).tell(PerformWork(r), sender())

                                      // error kernel with reply going through us
     case OtherJob(r)              => context.actorOf(Props[ReplyToMeWorker]) ! JobRequest(r, sender())
     case JobReply(result, orig_s) => orig_s ! result
   }
 }
 
```

 The last line demonstrates the essence of the error kernel design: spawn
 one\-off actors which terminate after doing their job, pass on `sender()` to
 allow direct reply if that is what makes sense, or round\-trip the sender
 as shown with the fictitious JobRequest/JobReply message pair.
 

 If you don\&rsquo;t like writing `context` you can always `import context._` to get
 direct access to `actorOf`, `stop` etc. This is not default in order to keep
 the name\-space clean.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor")` | emptyBehavior is a Receive\-expression that matches no messages at all, ever. |
	| `static class` | `[Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")` | ignoringBehavior is a Receive\-expression that consumes and ignores all messages. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `void` | `[aroundPostRestart](#aroundPostRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | INTERNAL API. |
	| `void` | `[aroundPostStop](#aroundPostStop())()` | INTERNAL API. |
	| `void` | `[aroundPreRestart](#aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | INTERNAL API. |
	| `void` | `[aroundPreStart](#aroundPreStart())()` | INTERNAL API. |
	| `void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` | INTERNAL API. |
	| `[ActorContext](ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `void` | `[postRestart](#postRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | User overridable callback: By default it calls `preStart()`. |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[preRestart](#preRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | Scala API: User overridable callback: '''By default it disposes of all children and then calls `postStop()`.''' |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[sender](#sender())()` | The reference sender Actor of the last received message. |
	| `[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | User overridable definition the strategy to use for supervising  child actors. |
	| `void` | `[unhandled](#unhandled(java.lang.Object))​(java.lang.Object message)` | User overridable callback. |

- - ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		void akka$actor$Actor$_setter_$context_$eq​([ActorContext](ActorContext.html "interface in akka.actor") x$1)
		```
		
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		void akka$actor$Actor$_setter_$self_$eq​([ActorRef](ActorRef.html "class in akka.actor") x$1)
		```
		
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		- #### context
		
		
		
		```
		[ActorContext](ActorContext.html "interface in akka.actor") context()
		```
		
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		- #### self
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") self()
		```
		
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		- #### sender
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") sender()
		```
		
		The reference sender Actor of the last received message.
		 Is defined if the message was sent from another Actor,
		 else `deadLetters` in [`ActorSystem`](ActorSystem.html "class in akka.actor").
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		- #### receive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		- #### aroundReceive
		
		
		
		```
		void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                   java.lang.Object msg)
		```
		
		INTERNAL API.
		 
		 Can be overridden to intercept calls to this actor's current behavior.
		 
		
		
		
		Parameters:
		`receive` \- current behavior.
		`msg` \- current message.
		- #### aroundPreStart
		
		
		
		```
		void aroundPreStart()
		```
		
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.
		- #### aroundPostStop
		
		
		
		```
		void aroundPostStop()
		```
		
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.
		- #### aroundPreRestart
		
		
		
		```
		void aroundPreRestart​(java.lang.Throwable reason,
		                      scala.Option<java.lang.Object> message)
		```
		
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.
		- #### aroundPostRestart
		
		
		
		```
		void aroundPostRestart​(java.lang.Throwable reason)
		```
		
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.
		- #### supervisorStrategy
		
		
		
		```
		[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		User overridable definition the strategy to use for supervising
		 child actors.
		- #### preStart
		
		
		
		```
		void preStart()
		       throws java.lang.Exception
		```
		
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Throws:
		`java.lang.Exception`
		- #### postStop
		
		
		
		```
		void postStop()
		       throws java.lang.Exception
		```
		
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Throws:
		`java.lang.Exception`
		- #### preRestart
		
		
		
		```
		void preRestart​(java.lang.Throwable reason,
		                scala.Option<java.lang.Object> message)
		         throws java.lang.Exception
		```
		
		Scala API: User overridable callback: '''By default it disposes of all children and then calls `postStop()`.'''
		
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		`message` \- optionally the current message the actor processed when failing, if applicable
		 
		 Is called on a crashed Actor right BEFORE it is restarted to allow clean
		 up of resources before Actor is terminated.
		Throws:
		`java.lang.Exception`
		- #### postRestart
		
		
		
		```
		void postRestart​(java.lang.Throwable reason)
		          throws java.lang.Exception
		```
		
		User overridable callback: By default it calls `preStart()`.
		
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		 
		 Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.
		Throws:
		`java.lang.Exception`
		- #### unhandled
		
		
		
		```
		void unhandled​(java.lang.Object message)
		```
		
		User overridable callback.
		 
		 Is called when a message isn't handled by the current behavior of the actor
		 by default it fails with either a [`DeathPactException`](DeathPactException.html "class in akka.actor") (in
		 case of an unhandled [`Terminated`](Terminated.html "class in akka.actor") message) or publishes an [`UnhandledMessage`](UnhandledMessage.html "class in akka.actor")
		 to the actor's system's [`EventStream`](../event/EventStream.html "class in akka.event")

## Code Examples

### Example 1: Interface Actor

```text
class ExampleActor extends Actor {

   override val supervisorStrategy = OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
     case _: ArithmeticException      => Resume
     case _: NullPointerException     => Restart
     case _: IllegalArgumentException => Stop
     case _: Exception                => Escalate
   }

   def receive = {
                                      // directly calculated reply
     case Request(r)               => sender() ! calculate(r)

                                      // just to demonstrate how to stop yourself
     case Shutdown                 => context.stop(self)

                                      // error kernel with child replying directly to 'sender()'
     case Dangerous(r)             => context.actorOf(Props[ReplyToOriginWorker]).tell(PerformWork(r), sender())

                                      // error kernel with reply going through us
     case OtherJob(r)              => context.actorOf(Props[ReplyToMeWorker]) ! JobRequest(r, sender())
     case JobReply(result, orig_s) => orig_s ! result
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractFSM.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DiagnosticActorLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/FSM.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/LoggingFSM.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Stash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Timers.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/UnboundedStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/UntypedAbstractActor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/japi/akka/2.10/akka/event/DeadLetterListener.html
- https://doc.akka.io/japi/akka/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.DefaultLogger.html
- https://doc.akka.io/japi/akka/2.10/akka/event/jul/JavaLogger.html
- https://doc.akka.io/japi/akka/2.10/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/japi/akka/2.10/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/japi/akka/2.10/akka/io/SimpleDnsManager.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/AtLeastOnceDelivery.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html](https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html)*