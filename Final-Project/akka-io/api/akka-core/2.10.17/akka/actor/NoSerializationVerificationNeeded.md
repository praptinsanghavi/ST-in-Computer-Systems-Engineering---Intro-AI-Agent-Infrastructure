---
description: Akka 2.10.17 - akka.actor.NoSerializationVerificationNeeded
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:40:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/NoSerializationVerificationNeeded.html
title: Akka 2.10.17 - akka.actor.NoSerializationVerificationNeeded
---

# Akka 2.10.17 - akka.actor.NoSerializationVerificationNeeded

> **Summary:** Akka 2.10.17 - akka.actor.NoSerializationVerificationNeeded

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](dungeon/index.html)Definition Classes[actor](index.html)
- [**](../../akka/actor/setup/index.html "Permalink")  package [setup](setup/index.html)Definition Classes[actor](index.html)
- [**](../../akka/actor/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[actor](index.html)
- [**](../../akka/actor/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[actor](index.html)
- [AbstractActor](AbstractActor.html "Java API: compatible with lambda expressions")
- [AbstractActorWithStash](AbstractActorWithStash.html "Java API: compatible with lambda expressions")
- [AbstractActorWithTimers](AbstractActorWithTimers.html "Java API: Support for scheduled self messages via TimerScheduler.")
- [AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "Java API: compatible with lambda expressions")
- [AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "Java API: compatible with lambda expressions")
- [AbstractExtensionId](AbstractExtensionId.html "Java API for ExtensionId")
- [AbstractFSM](AbstractFSM.html "Java API: compatible with lambda expressions")
- [AbstractFSMWithStash](AbstractFSMWithStash.html "Java API: compatible with lambda expressions")
- [AbstractLoggingActor](AbstractLoggingActor.html "Java API: compatible with lambda expressions")
- [AbstractLoggingFSM](AbstractLoggingFSM.html "Java API: compatible with lambda expressions")
- [AbstractScheduler](AbstractScheduler.html "An Akka scheduler service.")
- [AbstractSchedulerBase](AbstractSchedulerBase.html)
- [Actor](Actor.html "Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model': https://en.wikipedia.org/wiki/Actor_model")
- [ActorContext](ActorContext.html "The actor context - the view of the actor cell from the actor.")
- [ActorIdentity](ActorIdentity.html "Reply to akka.actor.Identify.")
- [ActorInitializationException](ActorInitializationException.html "An ActorInitializationException is thrown when the initialization logic for an Actor fails.")
- [ActorInterruptedException](ActorInterruptedException.html "When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to avoid cascading interrupts to other threads than the originally interrupted one.")
- [ActorKilledException](ActorKilledException.html "ActorKilledException is thrown when an Actor receives the akka.actor.Kill message")
- [ActorLogMarker](ActorLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [ActorLogging](ActorLogging.html "Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger, which is available under the name \"log\".")
- [ActorNotFound](ActorNotFound.html "When ActorSelection#resolveOne can't identify the actor the Future is completed with this failure.")
- [ActorPath](ActorPath.html "Actor path is a unique path to an actor that shows the creation path up through the actor tree to the root actor.")
- [ActorPathExtractor](ActorPathExtractor$.html "Given an ActorPath it returns the Address and the path elements if the path is well-formed")
- [ActorPaths](ActorPaths$.html "Java API")
- [ActorRef](ActorRef.html "Immutable and serializable handle to an actor, which may or may not reside on the local host or inside the same akka.actor.ActorSystem.")
- [ActorRefFactory](ActorRefFactory.html "Interface implemented by ActorSystem and ActorContext, the only two places from which you can get fresh actors.")
- [ActorRefProvider](ActorRefProvider.html "Interface for all ActorRef providers to implement.")
- [ActorSelection](ActorSelection.html "An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors, allowing for broadcasting of messages to that section.")
- [ActorSystem](ActorSystem.html "An actor system is a hierarchical group of actors which share common configuration, e.g.")
- [Address](Address.html "The address specifies the physical location under which an Actor can be reached.")
- [AddressFromURIString](AddressFromURIString$.html "This object serves as extractor for Scala and as address parser for Java.")
- [AllDeadLetters](AllDeadLetters.html "Subscribe to this class to be notified about all DeadLetter (also the suppressed ones) and Dropped.")
- [AllForOneStrategy](AllForOneStrategy.html "Applies the fault handling Directive (Resume, Restart, Stop) specified in the Decider to all children when one fails, as opposed to akka.actor.OneForOneStrategy that applies it only to the child actor that failed.")
- [BootstrapSetup](BootstrapSetup.html "Core bootstrap settings of the actor system, create using one of the factories in BootstrapSetup, constructor is *Internal API*.")
- [Cancellable](Cancellable.html "Signifies something that can be cancelled There is no strict guarantee that the implementation is thread-safe, but it should be good practice to make it so.")
- [ChildActorPath](ChildActorPath.html "Not for user instantiation")
- [ChildRestartStats](ChildRestartStats.html "ChildRestartStats is the statistics kept by every parent Actor for every child Actor and is used for SupervisorStrategies to know how to deal with problems that occur for the children.")
- [ClassicActorContextProvider](ClassicActorContextProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.")
- [ClassicActorSystemProvider](ClassicActorSystemProvider.html "Glue API introduced to allow minimal user effort integration between classic and typed for example for streams.")
- [CoordinatedShutdown](CoordinatedShutdown.html "Not for user instantiation, use the extension to access")
- [DeadLetter](DeadLetter.html "When a message is sent to an Actor that is terminated before receiving the message, it will be sent as a DeadLetter to the ActorSystem's EventStream.")
- [DeadLetterSuppression](DeadLetterSuppression.html "Use with caution: Messages extending this trait will not be logged by the default dead-letters listener.")
- [DeathPactException](DeathPactException.html "A DeathPactException is thrown by an Actor that receives a Terminated(someActor) message that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor.")
- [DefaultSupervisorStrategy](DefaultSupervisorStrategy.html)
- [Deploy](Deploy.html "This class represents deployment configuration for a given actor path.")
- [DiagnosticActorLogging](DiagnosticActorLogging.html "Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support, which is available under the name \"log\".")
- [Dropped](Dropped.html "Envelope that is published on the eventStream wrapped in akka.actor.DeadLetter for every message that is dropped due to overfull queues or routers with no routees.")
- [DynamicAccess](DynamicAccess.html "The DynamicAccess implementation is the class which is used for loading all configurable parts of an actor system (the akka.actor.ReflectiveDynamicAccess is the default implementation).")
- [ExtendedActorSystem](ExtendedActorSystem.html "More powerful interface to the actor system’s implementation which is presented to extensions (see akka.actor.Extension).")
- [Extension](Extension.html "The basic ActorSystem covers all that is needed for locally running actors, using futures and so on.")
- [ExtensionId](ExtensionId.html "Identifies an Extension Lookup of Extensions is done by object identity, so the Id must be the same wherever it's used, otherwise you'll get the same extension loaded multiple times.")
- [ExtensionIdProvider](ExtensionIdProvider.html "To be able to load an ExtensionId from the configuration, a class that implements ExtensionIdProvider must be specified.")
- [FSM](FSM.html "Finite State Machine actor trait.")
- [Identify](Identify.html "A message all Actors will understand, that when processed will reply with akka.actor.ActorIdentity containing the ActorRef.")
- [IllegalActorStateException](IllegalActorStateException.html "IllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated.")
- [IndirectActorProducer](IndirectActorProducer.html "This interface defines a class of actor creation strategies deviating from the usual default of just reflectively instantiating the Actor subclass.")
- [InvalidActorNameException](InvalidActorNameException.html "An InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name which doesn't validate.")
- [InvalidMessageException](InvalidMessageException.html "InvalidMessageException is thrown when an invalid message is sent to an Actor; Currently only null is an invalid message.")
- [Kill](Kill.html)
- [LightArrayRevolverScheduler](LightArrayRevolverScheduler.html "This scheduler implementation is based on a revolving wheel of buckets, like Netty’s HashedWheelTimer, which it advances at a fixed tick rate and dispatches tasks it finds in the current bucket to their respective ExecutionContexts.")
- [LocalScope](LocalScope.html)
- [LoggingFSM](LoggingFSM.html "Stackable trait for akka.actor.FSM which adds a rolling event log and debug logging capabilities (analogous to akka.event.LoggingReceive).")
- [NoScopeGiven](NoScopeGiven.html "This is the default value and as such allows overrides.")
- NoSerializationVerificationNeeded
- [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html "Marker trait to indicate that a message should not reset the receive timeout.")
- [OneForOneStrategy](OneForOneStrategy.html "Applies the fault handling Directive (Resume, Restart, Stop) specified in the Decider to the child actor that failed, as opposed to akka.actor.AllForOneStrategy that applies it to all children.")
- [OriginalRestartException](OriginalRestartException$.html "This is an extractor for retrieving the original cause (i.e.")
- [PoisonPill](PoisonPill.html)
- [PossiblyHarmful](PossiblyHarmful.html "Marker trait to indicate that a message might be potentially harmful, this is used to block messages coming in over remoting.")
- [PostRestartException](PostRestartException.html "A PostRestartException is thrown when constructor or postRestart() method fails during a restart attempt.")
- [PreRestartException](PreRestartException.html "A PreRestartException is thrown when the preRestart() method failed; this exception is not propagated to the supervisor, as it originates from the already failed instance, hence it is only visible as log entry on the event stream.")
- [Props](Props.html "Props is a configuration object using in creating an Actor; it is immutable, so it is thread-safe and fully shareable.")
- [ProviderSelection](ProviderSelection.html)
- [ReceiveTimeout](ReceiveTimeout.html)
- [ReflectiveDynamicAccess](ReflectiveDynamicAccess.html "This is the default akka.actor.DynamicAccess implementation used by akka.actor.ExtendedActorSystem unless overridden.")
- [RelativeActorPath](RelativeActorPath$.html "Extractor for so-called “relative actor paths” as in “relative URI”, not in “relative to some actor”.")
- [RootActorPath](RootActorPath.html "Root of the hierarchy of ActorPaths.")
- [ScalaActorRef](ScalaActorRef.html "This trait represents the Scala Actor API There are implicit conversions in package.scala from ActorRef -> ScalaActorRef and back")
- [ScalaActorSelection](ScalaActorSelection.html "Contains the Scala API (!-method) for ActorSelections) which provides automatic tracking of the sender, as per the usual implicit ActorRef pattern.")
- [Scheduler](Scheduler.html "An Akka scheduler service.")
- [Scope](Scope.html "The scope of a akka.actor.Deploy serves two purposes: as a marker for pattern matching the “scope” (i.e.")
- [Stash](Stash.html "The Stash trait enables an actor to temporarily stash away messages that can not or should not be handled using the actor's current behavior.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the Stash exceeds the capacity of the Stash")
- [Status](Status$.html "Superseeded by akka.pattern.StatusReply, prefer that when possible.")
- [StoppingSupervisorStrategy](StoppingSupervisorStrategy.html)
- [SupervisorStrategy](SupervisorStrategy.html "An Akka SupervisorStrategy is the policy to apply for crashing children.")
- [SupervisorStrategyConfigurator](SupervisorStrategyConfigurator.html "Implement this interface in order to configure the supervisorStrategy for the top-level guardian actor (/user).")
- [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html)
- [SuppressedDeadLetter](SuppressedDeadLetter.html "Similar to DeadLetter with the slight twist of NOT being logged by the default dead letters listener.")
- [Terminated](Terminated.html "When Death Watch is used, the watcher will receive a Terminated(watched) message when watched is terminated.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
- [Timers](Timers.html "Scala API: Mix in Timers into your Actor to get support for scheduled self messages via TimerScheduler.")
- [UnboundedStash](UnboundedStash.html "The UnboundedStash trait is a version of akka.actor.Stash that enforces an unbounded stash for you actor.")
- [UnhandledMessage](UnhandledMessage.html "This message is published to the EventStream whenever an Actor receives a message it doesn't understand")
- [UnrestrictedStash](UnrestrictedStash.html "A version of akka.actor.Stash that does not enforce any mailbox type.")
- [UntypedAbstractActor](UntypedAbstractActor.html "If the validation of the ReceiveBuilder match logic turns out to be a bottleneck for some of your actors you can consider to implement it at lower level by extending UntypedAbstractActor instead of AbstractActor.")
- [WrappedMessage](WrappedMessage.html "Message envelopes may implement this trait for better logging, such as logging of message class name of the wrapped message instead of the envelope class name.")
t[akka](../index.html).[actor](index.html)

# NoSerializationVerificationNeeded[**](../../akka/actor/NoSerializationVerificationNeeded.html "Permalink")

### 

#### trait NoSerializationVerificationNeeded extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Marker trait to signal that this class should not be verified for serializability.

Source[Actor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/Actor.scala#L34)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Event](FSM$$Event.html), [StopEvent](FSM$$StopEvent.html), [Terminated](Terminated.html), [UnhandledMessage](UnhandledMessage.html), [Changed](../cluster/ddata/Replicator$$Changed.html), [DataDeleted](../cluster/ddata/Replicator$$DataDeleted.html), [Delete](../cluster/ddata/Replicator$$Delete.html), [DeleteResponse](../cluster/ddata/Replicator$$DeleteResponse.html), [DeleteSuccess](../cluster/ddata/Replicator$$DeleteSuccess.html), [Deleted](../cluster/ddata/Replicator$$Deleted.html), [Expired](../cluster/ddata/Replicator$$Expired.html), [GetDataDeleted](../cluster/ddata/Replicator$$GetDataDeleted.html), [GetFailure](../cluster/ddata/Replicator$$GetFailure.html), [GetResponse](../cluster/ddata/Replicator$$GetResponse.html), [GetSuccess](../cluster/ddata/Replicator$$GetSuccess.html), [ModifyFailure](../cluster/ddata/Replicator$$ModifyFailure.html), [NotFound](../cluster/ddata/Replicator$$NotFound.html), [ReplicationDeleteFailure](../cluster/ddata/Replicator$$ReplicationDeleteFailure.html), [StoreFailure](../cluster/ddata/Replicator$$StoreFailure.html), [SubscribeResponse](../cluster/ddata/Replicator$$SubscribeResponse.html), [Update](../cluster/ddata/Replicator$$Update.html), [UpdateDataDeleted](../cluster/ddata/Replicator$$UpdateDataDeleted.html), [UpdateFailure](../cluster/ddata/Replicator$$UpdateFailure.html), [UpdateResponse](../cluster/ddata/Replicator$$UpdateResponse.html), [UpdateSuccess](../cluster/ddata/Replicator$$UpdateSuccess.html), [UpdateTimeout](../cluster/ddata/Replicator$$UpdateTimeout.html), [Changed](../cluster/ddata/typed/javadsl/Replicator$$Changed.html), [Deleted](../cluster/ddata/typed/javadsl/Replicator$$Deleted.html), [Expired](../cluster/ddata/typed/javadsl/Replicator$$Expired.html), [SubscribeResponse](../cluster/ddata/typed/javadsl/Replicator$$SubscribeResponse.html), [AdaptiveLoadBalancingRoutingLogic](../cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html), [DistributedPubSubSettings](../cluster/pubsub/DistributedPubSubSettings.html), [ClusterShardingSettings](../cluster/sharding/ClusterShardingSettings.html), [AbstractShardAllocationStrategy](../cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html), [ShardAllocationStrategy](../cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html), [StartableAllocationStrategy](../cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html), [ExternalShardAllocationStrategy](../cluster/sharding/external/ExternalShardAllocationStrategy.html), [ShardLocation](../cluster/sharding/external/ExternalShardAllocationStrategy$$ShardLocation.html), [ClusterSingletonManagerSettings](../cluster/singleton/ClusterSingletonManagerSettings.html), [ClusterSingletonProxySettings](../cluster/singleton/ClusterSingletonProxySettings.html), [Lookup](../discovery/Lookup.html), [Resolved](../discovery/ServiceDiscovery$$Resolved.html), [ResolvedTarget](../discovery/ServiceDiscovery$$ResolvedTarget.html), [Debug](../event/Logging$$Debug.html), [Debug2](../event/Logging$$Debug2.html), [Debug3](../event/Logging$$Debug3.html), [Error](../event/Logging$$Error.html), [Error2](../event/Logging$$Error2.html), [Error3](../event/Logging$$Error3.html), [Info](../event/Logging$$Info.html), [Info2](../event/Logging$$Info2.html), [Info3](../event/Logging$$Info3.html), [InitializeLogger](../event/Logging$$InitializeLogger.html), [LogEvent](../event/Logging$$LogEvent.html), [LogEventWithMarker](../event/Logging$$LogEventWithMarker.html), [Warning](../event/Logging$$Warning.html), [Warning2](../event/Logging$$Warning2.html), [Warning3](../event/Logging$$Warning3.html), [Warning4](../event/Logging$$Warning4.html), [SimpleDnsCache](../io/SimpleDnsCache.html), [Abort](../io/Tcp$$Abort$.html), [Aborted](../io/Tcp$$Aborted$.html), [Bind](../io/Tcp$$Bind.html), [Bound](../io/Tcp$$Bound.html), [Close](../io/Tcp$$Close$.html), [CloseCommand](../io/Tcp$$CloseCommand.html), [Closed](../io/Tcp$$Closed$.html), [Command](../io/Tcp$$Command.html), [CommandFailed](../io/Tcp$$CommandFailed.html), [CompoundWrite](../io/Tcp$$CompoundWrite.html), [ConfirmedClose](../io/Tcp$$ConfirmedClose$.html), [ConfirmedClosed](../io/Tcp$$ConfirmedClosed$.html), [Connect](../io/Tcp$$Connect.html), [Connected](../io/Tcp$$Connected.html), [ConnectionClosed](../io/Tcp$$ConnectionClosed.html), [ErrorClosed](../io/Tcp$$ErrorClosed.html), [Event](../io/Tcp$$Event.html), [Message](../io/Tcp$$Message.html), [NoAck](../io/Tcp$$NoAck.html), [NoAck](../io/Tcp$$NoAck$.html), [PeerClosed](../io/Tcp$$PeerClosed$.html), [Received](../io/Tcp$$Received.html), [Register](../io/Tcp$$Register.html), [ResumeAccepting](../io/Tcp$$ResumeAccepting.html), [ResumeReading](../io/Tcp$$ResumeReading$.html), [ResumeWriting](../io/Tcp$$ResumeWriting$.html), [SimpleWriteCommand](../io/Tcp$$SimpleWriteCommand.html), [SuspendReading](../io/Tcp$$SuspendReading$.html), [Unbind](../io/Tcp$$Unbind$.html), [Unbound](../io/Tcp$$Unbound.html), [Unbound](../io/Tcp$$Unbound$.html), [Write](../io/Tcp$$Write.html), [WriteCommand](../io/Tcp$$WriteCommand.html), [WritePath](../io/Tcp$$WritePath.html), [WritingResumed](../io/Tcp$$WritingResumed.html), [WritingResumed](../io/Tcp$$WritingResumed$.html), [AAAARecord](../io/dns/AAAARecord.html), [ARecord](../io/dns/ARecord.html), [CNameRecord](../io/dns/CNameRecord.html), [Resolved](../io/dns/DnsProtocol$$Resolved.html), [ResourceRecord](../io/dns/ResourceRecord.html), [SRVRecord](../io/dns/SRVRecord.html), [UnknownRecord](../io/dns/UnknownRecord.html), [Blackhole](../remote/testkit/Blackhole$.html), [ThrottleMode](../remote/testkit/ThrottleMode.html), [TokenBucket](../remote/testkit/TokenBucket.html), [Unthrottled](../remote/testkit/Unthrottled$.html), [BroadcastRoutingLogic](../routing/BroadcastRoutingLogic.html), [ConsistentHashingRoutingLogic](../routing/ConsistentHashingRoutingLogic.html), [RandomRoutingLogic](../routing/RandomRoutingLogic.html), [RoundRobinRoutingLogic](../routing/RoundRobinRoutingLogic.html), [RoutingLogic](../routing/RoutingLogic.html), [ScatterGatherFirstCompletedRoutingLogic](../routing/ScatterGatherFirstCompletedRoutingLogic.html), [SmallestMailboxRoutingLogic](../routing/SmallestMailboxRoutingLogic.html), [TailChoppingRoutingLogic](../routing/TailChoppingRoutingLogic.html), [DownstreamFinish](../stream/testkit/GraphStageMessages$$DownstreamFinish$.html), [Failure](../stream/testkit/GraphStageMessages$$Failure.html), [Pull](../stream/testkit/GraphStageMessages$$Pull$.html), [Push](../stream/testkit/GraphStageMessages$$Push$.html), [UpstreamFinish](../stream/testkit/GraphStageMessages$$UpstreamFinish$.html), [CancelSubscription](../stream/testkit/TestPublisher$$CancelSubscription.html), [PublisherEvent](../stream/testkit/TestPublisher$$PublisherEvent.html), [RequestMore](../stream/testkit/TestPublisher$$RequestMore.html), [Subscribe](../stream/testkit/TestPublisher$$Subscribe.html), [SubscriptionDone](../stream/testkit/TestPublisher$$SubscriptionDone$.html), [OnComplete](../stream/testkit/TestSubscriber$$OnComplete$.html), [OnError](../stream/testkit/TestSubscriber$$OnError.html), [OnNext](../stream/testkit/TestSubscriber$$OnNext.html), [OnSubscribe](../stream/testkit/TestSubscriber$$OnSubscribe.html), [SubscriberEvent](../stream/testkit/TestSubscriber$$SubscriberEvent.html), [SetAutoPilot](../testkit/TestActor$$SetAutoPilot.html), [SetIgnore](../testkit/TestActor$$SetIgnore.html), [Spawn](../testkit/TestActor$$Spawn.html), [UnWatch](../testkit/TestActor$$UnWatch.html), [Watch](../testkit/TestActor$$Watch.html), [Mute](../testkit/TestEvent$$Mute.html), [UnMute](../testkit/TestEvent$$UnMute.html), [WriteFile](../io/Tcp$$WriteFile.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NoSerializationVerificationNeeded
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/NoSerializationVerificationNeeded.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/NoSerializationVerificationNeeded.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/NoSerializationVerificationNeeded.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toany2stringadd\[NoSerializationVerificationNeeded] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/NoSerializationVerificationNeeded.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NoSerializationVerificationNeeded, B)ImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toArrowAssoc\[NoSerializationVerificationNeeded] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/NoSerializationVerificationNeeded.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/NoSerializationVerificationNeeded.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/NoSerializationVerificationNeeded.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/NoSerializationVerificationNeeded.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NoSerializationVerificationNeeded) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NoSerializationVerificationNeededImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toEnsuring\[NoSerializationVerificationNeeded] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/NoSerializationVerificationNeeded.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NoSerializationVerificationNeeded) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NoSerializationVerificationNeededImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toEnsuring\[NoSerializationVerificationNeeded] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/NoSerializationVerificationNeeded.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NoSerializationVerificationNeededImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toEnsuring\[NoSerializationVerificationNeeded] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/NoSerializationVerificationNeeded.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NoSerializationVerificationNeededImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toEnsuring\[NoSerializationVerificationNeeded] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/NoSerializationVerificationNeeded.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/NoSerializationVerificationNeeded.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/NoSerializationVerificationNeeded.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/NoSerializationVerificationNeeded.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/NoSerializationVerificationNeeded.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/NoSerializationVerificationNeeded.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/NoSerializationVerificationNeeded.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/NoSerializationVerificationNeeded.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/NoSerializationVerificationNeeded.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/NoSerializationVerificationNeeded.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/actor/NoSerializationVerificationNeeded.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/actor/NoSerializationVerificationNeeded.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/actor/NoSerializationVerificationNeeded.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/NoSerializationVerificationNeeded.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/NoSerializationVerificationNeeded.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toStringFormat\[NoSerializationVerificationNeeded] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/NoSerializationVerificationNeeded.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NoSerializationVerificationNeeded, B)ImplicitThis member is added by an implicit conversion from NoSerializationVerificationNeeded toArrowAssoc\[NoSerializationVerificationNeeded] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNoSerializationVerificationNeeded to any2stringadd\[NoSerializationVerificationNeeded]

### Inherited by implicit conversion StringFormat fromNoSerializationVerificationNeeded to StringFormat\[NoSerializationVerificationNeeded]

### Inherited by implicit conversion Ensuring fromNoSerializationVerificationNeeded to Ensuring\[NoSerializationVerificationNeeded]

### Inherited by implicit conversion ArrowAssoc fromNoSerializationVerificationNeeded to ArrowAssoc\[NoSerializationVerificationNeeded]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractFSM$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractFSM.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorNotFound.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPath$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPaths$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AllDeadLetters.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/BootstrapSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Cancellable$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ChildActorPath.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html)*