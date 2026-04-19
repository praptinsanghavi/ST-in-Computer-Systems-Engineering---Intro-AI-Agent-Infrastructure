---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html
title: akka.actor
---

# akka.actor

## Content

# Package akka.actor

- Interface Summary 
| Interface | Description |
| [AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor") | The actor context \- the view of the actor cell from the actor. |
| --- | --- |
| [AbstractProps](AbstractProps.html "interface in akka.actor") | Java API: Factory for Props instances. |
| [Actor](Actor.html "interface in akka.actor") | Actor base trait that should be extended by or mixed to create an Actor with the semantics of the 'Actor Model':  <https://en.wikipedia.org/wiki/Actor_model> |
| [ActorContext](ActorContext.html "interface in akka.actor") | The actor context \- the view of the actor cell from the actor. |
| [ActorLogging](ActorLogging.html "interface in akka.actor") | Scala API: Mix in ActorLogging into your Actor to easily obtain a reference to a logger,  which is available under the name "log". |
| [ActorPath](ActorPath.html "interface in akka.actor") | Actor path is a unique path to an actor that shows the creation path  up through the actor tree to the root actor. |
| [ActorRefFactory](ActorRefFactory.html "interface in akka.actor") | Interface implemented by ActorSystem and ActorContext, the only two places  from which you can get fresh actors. |
| [ActorRefProvider](ActorRefProvider.html "interface in akka.actor") | Interface for all ActorRef providers to implement. |
| [ActorRefScope](ActorRefScope.html "interface in akka.actor") | All ActorRefs have a scope which describes where they live. |
| [AllDeadLetters](AllDeadLetters.html "interface in akka.actor") | Subscribe to this class to be notified about all [`DeadLetter`](DeadLetter.html "class in akka.actor") (also the suppressed ones)  and [`Dropped`](Dropped.html "class in akka.actor"). |
| [AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor") | INTERNAL API |
| [Cancellable](Cancellable.html "interface in akka.actor") | Signifies something that can be cancelled  There is no strict guarantee that the implementation is thread\-safe,  but it should be good practice to make it so. |
| [Cell](Cell.html "interface in akka.actor") | INTERNAL API |
| [ChildStats](ChildStats.html "interface in akka.actor") | INTERNAL API |
| [ClassicActorContextProvider](ClassicActorContextProvider.html "interface in akka.actor") | Glue API introduced to allow minimal user effort integration between classic and typed for example for streams. |
| [ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") | Glue API introduced to allow minimal user effort integration between classic and typed for example for streams. |
| [CoordinatedShutdown.PhaseDefinition](CoordinatedShutdown.PhaseDefinition.html "interface in akka.actor") |  |
| [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") | Reason for the shutdown, which can be used by tasks in case they need to do  different things depending on what caused the shutdown. |
| [DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") | Use with caution: Messages extending this trait will not be logged by the default dead\-letters listener. |
| [DiagnosticActorLogging](DiagnosticActorLogging.html "interface in akka.actor") | Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support,  which is available under the name "log". |
| [Extension](Extension.html "interface in akka.actor") | The basic ActorSystem covers all that is needed for locally running actors,  using futures and so on. |
| [ExtensionId](ExtensionId.html "interface in akka.actor")\<T extends [Extension](Extension.html "interface in akka.actor")\> | Identifies an Extension  Lookup of Extensions is done by object identity, so the Id must be the same wherever it's used,  otherwise you'll get the same extension loaded multiple times. |
| [ExtensionIdProvider](ExtensionIdProvider.html "interface in akka.actor") | To be able to load an ExtensionId from the configuration,  a class that implements ExtensionIdProvider must be specified. |
| [FSM](FSM.html "interface in akka.actor")\<S,​D\> | Finite State Machine actor trait. |
| [FSM.Reason](FSM.Reason.html "interface in akka.actor") | Reason why this [`FSM`](FSM.html "interface in akka.actor") is shutting down. |
| [FSM.TimerMode](FSM.TimerMode.html "interface in akka.actor") | INTERNAL API |
| [IndirectActorProducer](IndirectActorProducer.html "interface in akka.actor") | This interface defines a class of actor creation strategies deviating from  the usual default of just reflectively instantiating the [`Actor`](Actor.html "interface in akka.actor")  subclass. |
| [JVMShutdownHooks](JVMShutdownHooks.html "interface in akka.actor") |  |
| [LightArrayRevolverScheduler.TimerTask](LightArrayRevolverScheduler.TimerTask.html "interface in akka.actor") | INTERNAL API |
| [LocalRef](LocalRef.html "interface in akka.actor") | Refs which are statically known to be local inherit from this Scope |
| [LoggingFSM](LoggingFSM.html "interface in akka.actor")\<S,​D\> | Stackable trait for [`FSM`](FSM.html "interface in akka.actor") which adds a rolling event log and  debug logging capabilities (analogous to [`LoggingReceive`](../event/LoggingReceive.html "class in akka.event")). |
| [MinimalActorRef](MinimalActorRef.html "interface in akka.actor") | Trait for ActorRef implementations where all methods contain default stubs. |
| [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "interface in akka.actor") | Marker trait to signal that this class should not be verified for serializability. |
| [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html "interface in akka.actor") | Marker trait to indicate that a message should not reset the receive timeout. |
| [PathUtils](PathUtils.html "interface in akka.actor") | INTERNAL API |
| [PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor") | Marker trait to indicate that a message might be potentially harmful,  this is used to block messages coming in over remoting. |
| [RepointableRef](RepointableRef.html "interface in akka.actor") | RepointableActorRef (and potentially others) may change their locality at  runtime, meaning that isLocal might not be stable. |
| [ScalaActorRef](ScalaActorRef.html "interface in akka.actor") | Deprecated. tell method is now provided by ActorRef trait. |
| [ScalaActorSelection](ScalaActorSelection.html "interface in akka.actor") | Contains the Scala API (!\-method) for ActorSelections) which provides automatic tracking of the sender,  as per the usual implicit ActorRef pattern. |
| [Scheduler](Scheduler.html "interface in akka.actor") | An Akka scheduler service. |
| [Scheduler.TaskRunOnClose](Scheduler.TaskRunOnClose.html "interface in akka.actor") | If a `TaskRunOnClose` is used in `scheduleOnce` it will be run when the `Scheduler` is  closed (`ActorSystem` shutdown). |
| [Scope](Scope.html "interface in akka.actor") | The scope of a [`Deploy`](Deploy.html "class in akka.actor") serves two purposes: as a marker for  pattern matching the \&ldquo;scope\&rdquo; (i.e. |
| [SelectionPathElement](SelectionPathElement.html "interface in akka.actor") | INTERNAL API |
| [Stash](Stash.html "interface in akka.actor") | The `Stash` trait enables an actor to temporarily stash away messages that can not or  should not be handled using the actor's current behavior. |
| [StashFactory](StashFactory.html "interface in akka.actor") | INTERNAL API. |
| [StashSupport](StashSupport.html "interface in akka.actor") |  |
| [Status$Status](Status$Status.html "interface in akka.actor") |  |
| [SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor") |  |
| [SupervisorStrategyConfigurator](SupervisorStrategyConfigurator.html "interface in akka.actor") | Implement this interface in order to configure the supervisorStrategy for  the top\-level guardian actor (`/user`). |
| [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html "interface in akka.actor") |  |
| [Timers](Timers.html "interface in akka.actor") | Scala API: Mix in Timers into your Actor to get support for scheduled  `self` messages via [`TimerScheduler`](TimerScheduler.html "class in akka.actor"). |
| [UnboundedStash](UnboundedStash.html "interface in akka.actor") | The `UnboundedStash` trait is a version of [`Stash`](Stash.html "interface in akka.actor") that enforces an unbounded stash for you actor. |
| [UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor") | A version of [`Stash`](Stash.html "interface in akka.actor") that does not enforce any mailbox type. |
| [WrappedMessage](WrappedMessage.html "interface in akka.actor") | Message envelopes may implement this trait for better logging, such as logging of  message class name of the wrapped message instead of the envelope class name. |
- Class Summary 
| Class | Description |
| [AbstractActor](AbstractActor.html "class in akka.actor") | Java API: compatible with lambda expressions |
| --- | --- |
| [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") | Defines which messages the Actor can handle, along with the implementation of  how the messages should be processed. |
| [AbstractActor$](AbstractActor$.html "class in akka.actor") | Java API: compatible with lambda expressions |
| [AbstractActorWithStash](AbstractActorWithStash.html "class in akka.actor") | Java API: compatible with lambda expressions |
| [AbstractActorWithTimers](AbstractActorWithTimers.html "class in akka.actor") | Java API: Support for scheduled `self` messages via [`TimerScheduler`](TimerScheduler.html "class in akka.actor"). |
| [AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "class in akka.actor") | Java API: compatible with lambda expressions |
| [AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "class in akka.actor") | Java API: compatible with lambda expressions |
| [AbstractExtensionId](AbstractExtensionId.html "class in akka.actor")\<T extends [Extension](Extension.html "interface in akka.actor")\> | Java API for ExtensionId |
| [AbstractFSM](AbstractFSM.html "class in akka.actor")\<S,​D\> | Java API: compatible with lambda expressions |
| [AbstractFSM$](AbstractFSM$.html "class in akka.actor") | Java API: compatible with lambda expressions |
| [AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")\<S,​D\> | Java API: compatible with lambda expressions |
| [AbstractLoggingActor](AbstractLoggingActor.html "class in akka.actor") | Java API: compatible with lambda expressions |
| [AbstractLoggingFSM](AbstractLoggingFSM.html "class in akka.actor")\<S,​D\> | Java API: compatible with lambda expressions |
| [AbstractScheduler](AbstractScheduler.html "class in akka.actor") | An Akka scheduler service. |
| [AbstractSchedulerBase](AbstractSchedulerBase.html "class in akka.actor") |  |
| [Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor") | emptyBehavior is a Receive\-expression that matches no messages at all, ever. |
| [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor") | ignoringBehavior is a Receive\-expression that consumes and ignores all messages. |
| [Actor$](Actor$.html "class in akka.actor") |  |
| [ActorCell$](ActorCell$.html "class in akka.actor") | INTERNAL API |
| [ActorIdentity](ActorIdentity.html "class in akka.actor") | Reply to [`Identify`](Identify.html "class in akka.actor"). |
| [ActorIdentity$](ActorIdentity$.html "class in akka.actor") |  |
| [ActorInitializationException$](ActorInitializationException$.html "class in akka.actor") |  |
| [ActorKilledException$](ActorKilledException$.html "class in akka.actor") |  |
| [ActorLogMarker](ActorLogMarker.html "class in akka.actor") | This is public with the purpose to document the used markers and properties of log events. |
| [ActorLogMarker$](ActorLogMarker$.html "class in akka.actor") | This is public with the purpose to document the used markers and properties of log events. |
| [ActorNotFound$](ActorNotFound$.html "class in akka.actor") |  |
| [ActorPath$](ActorPath$.html "class in akka.actor") |  |
| [ActorPathExtractor](ActorPathExtractor.html "class in akka.actor") | Given an ActorPath it returns the Address and the path elements if the path is well\-formed |
| [ActorPathExtractor$](ActorPathExtractor$.html "class in akka.actor") | Given an ActorPath it returns the Address and the path elements if the path is well\-formed |
| [ActorPaths](ActorPaths.html "class in akka.actor") | Java API |
| [ActorPaths$](ActorPaths$.html "class in akka.actor") | Java API |
| [ActorRef](ActorRef.html "class in akka.actor") | Immutable and serializable handle to an actor, which may or may not reside  on the local host or inside the same [`ActorSystem`](ActorSystem.html "class in akka.actor"). |
| [ActorRef$](ActorRef$.html "class in akka.actor") |  |
| [ActorSelection](ActorSelection.html "class in akka.actor") | An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,  allowing for broadcasting of messages to that section. |
| [ActorSelection$](ActorSelection$.html "class in akka.actor") | An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,  allowing for broadcasting of messages to that section. |
| [ActorSelectionMessage$](ActorSelectionMessage$.html "class in akka.actor") |  |
| [ActorSystem](ActorSystem.html "class in akka.actor") | An actor system is a hierarchical group of actors which share common  configuration, e.g. |
| [ActorSystem.Settings](ActorSystem.Settings.html "class in akka.actor") | Settings are the overall ActorSystem Settings which also provides a convenient access to the Config object. |
| [ActorSystem.Settings$](ActorSystem.Settings$.html "class in akka.actor") | INTERNAL API |
| [ActorSystem$](ActorSystem$.html "class in akka.actor") |  |
| [Address](Address.html "class in akka.actor") | The address specifies the physical location under which an Actor can be  reached. |
| [Address$](Address$.html "class in akka.actor") |  |
| [AddressFromURIString](AddressFromURIString.html "class in akka.actor") | This object serves as extractor for Scala and as address parser for Java. |
| [AddressFromURIString$](AddressFromURIString$.html "class in akka.actor") | This object serves as extractor for Scala and as address parser for Java. |
| [AddressTerminated$](AddressTerminated$.html "class in akka.actor") |  |
| [AllForOneStrategy](AllForOneStrategy.html "class in akka.actor") | Applies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`  to all children when one fails, as opposed to [`OneForOneStrategy`](OneForOneStrategy.html "class in akka.actor") that applies  it only to the child actor that failed. |
| [AllForOneStrategy$](AllForOneStrategy$.html "class in akka.actor") |  |
| [BootstrapSetup](BootstrapSetup.html "class in akka.actor") |  |
| [BootstrapSetup$](BootstrapSetup$.html "class in akka.actor") |  |
| [Cancellable$](Cancellable$.html "class in akka.actor") |  |
| [ChildActorPath](ChildActorPath.html "class in akka.actor") | Not for user instantiation |
| [ChildNameReserved](ChildNameReserved.html "class in akka.actor") | INTERNAL API |
| [ChildNameReserved$](ChildNameReserved$.html "class in akka.actor") | INTERNAL API |
| [ChildRestartStats](ChildRestartStats.html "class in akka.actor") | ChildRestartStats is the statistics kept by every parent Actor for every child Actor  and is used for SupervisorStrategies to know how to deal with problems that occur for the children. |
| [ChildRestartStats$](ChildRestartStats$.html "class in akka.actor") |  |
| [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") |  |
| [CoordinatedShutdown.ActorSystemTerminateReason$](CoordinatedShutdown.ActorSystemTerminateReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown.ClusterDowningReason$](CoordinatedShutdown.ClusterDowningReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown.ClusterJoinUnsuccessfulReason$](CoordinatedShutdown.ClusterJoinUnsuccessfulReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown.ClusterLeavingReason$](CoordinatedShutdown.ClusterLeavingReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown.IncompatibleConfigurationDetectedReason$](CoordinatedShutdown.IncompatibleConfigurationDetectedReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown.JvmExitReason$](CoordinatedShutdown.JvmExitReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown.Phase$](CoordinatedShutdown.Phase$.html "class in akka.actor") |  |
| [CoordinatedShutdown.UnknownReason$](CoordinatedShutdown.UnknownReason$.html "class in akka.actor") |  |
| [CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor") |  |
| [CoordinatedShutdownTerminationWatcher$](CoordinatedShutdownTerminationWatcher$.html "class in akka.actor") | INTERNAL API |
| [DeadLetter](DeadLetter.html "class in akka.actor") | When a message is sent to an Actor that is terminated before receiving the message, it will be sent as a DeadLetter  to the ActorSystem's EventStream. |
| [DeadLetter$](DeadLetter$.html "class in akka.actor") |  |
| [DeadLetterActorRef$](DeadLetterActorRef$.html "class in akka.actor") |  |
| [DeathPactException$](DeathPactException$.html "class in akka.actor") |  |
| [DefaultSupervisorStrategy](DefaultSupervisorStrategy.html "class in akka.actor") |  |
| [Deploy](Deploy.html "class in akka.actor") |  |
| [Deploy$](Deploy$.html "class in akka.actor") |  |
| [Dropped](Dropped.html "class in akka.actor") | Envelope that is published on the eventStream wrapped in [`DeadLetter`](DeadLetter.html "class in akka.actor") for every message that is  dropped due to overfull queues or routers with no routees. |
| [Dropped$](Dropped$.html "class in akka.actor") |  |
| [DynamicAccess](DynamicAccess.html "class in akka.actor") | The DynamicAccess implementation is the class which is used for  loading all configurable parts of an actor system (the  [`ReflectiveDynamicAccess`](ReflectiveDynamicAccess.html "class in akka.actor") is the default implementation). |
| [ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") | More powerful interface to the actor system\&rsquo;s implementation which is presented to extensions (see [`Extension`](Extension.html "interface in akka.actor")). |
| [FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor") | This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
| [FSM.CurrentState](FSM.CurrentState.html "class in akka.actor")\<S\> | Message type which is sent directly to the subscribed actor in  [`FSM.SubscribeTransitionCallBack`](FSM.SubscribeTransitionCallBack.html "class in akka.actor") before sending any  [`FSM.Transition`](FSM.Transition.html "class in akka.actor") messages. |
| [FSM.CurrentState$](FSM.CurrentState$.html "class in akka.actor") |  |
| [FSM.Event](FSM.Event.html "class in akka.actor")\<D\> | All messages sent to the [`FSM`](FSM.html "interface in akka.actor") will be wrapped inside an  `Event`, which allows pattern matching to extract both state and data. |
| [FSM.Event$](FSM.Event$.html "class in akka.actor") |  |
| [FSM.Failure](FSM.Failure.html "class in akka.actor") | Signifies that the [`FSM`](FSM.html "interface in akka.actor") is shutting itself down because of  an error, e.g. |
| [FSM.Failure$](FSM.Failure$.html "class in akka.actor") |  |
| [FSM.FixedDelayMode$](FSM.FixedDelayMode$.html "class in akka.actor") | INTERNAL API |
| [FSM.FixedRateMode$](FSM.FixedRateMode$.html "class in akka.actor") | INTERNAL API |
| [FSM.LogEntry](FSM.LogEntry.html "class in akka.actor")\<S,​D\> | Log Entry of the [`LoggingFSM`](LoggingFSM.html "interface in akka.actor"), can be obtained by calling `getLog`. |
| [FSM.LogEntry$](FSM.LogEntry$.html "class in akka.actor") |  |
| [FSM.Normal$](FSM.Normal$.html "class in akka.actor") | Default reason if calling `stop()`. |
| [FSM.NullFunction$](FSM.NullFunction$.html "class in akka.actor") | A partial function value which does not match anything and can be used to  \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers. |
| [FSM.Shutdown$](FSM.Shutdown$.html "class in akka.actor") | Reason given when someone was calling `system.stop(fsm)` from outside;  also applies to `Stop` supervision directive. |
| [FSM.SilentState](FSM.SilentState.html "class in akka.actor")\<S,​D\> | INTERNAL API  Using a subclass for binary compatibility reasons |
| [FSM.SingleMode$](FSM.SingleMode$.html "class in akka.actor") | INTERNAL API |
| [FSM.State](FSM.State.html "class in akka.actor")\<S,​D\> |  |
| [FSM.State$](FSM.State$.html "class in akka.actor") | This captures all of the managed state of the [`FSM`](FSM.html "interface in akka.actor"): the state  name, the state data, possibly custom timeout, stop reason and replies  accumulated while processing the last message. |
| [FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") | This case object is received in case of a state timeout. |
| [FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")\<S,​D\> | Case class representing the state of the [`FSM`](FSM.html "interface in akka.actor") within the  `onTermination` block. |
| [FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") |  |
| [FSM.SubscribeTransitionCallBack](FSM.SubscribeTransitionCallBack.html "class in akka.actor") | Send this to an [`FSM`](FSM.html "interface in akka.actor") to request first the [`FSM.CurrentState`](FSM.CurrentState.html "class in akka.actor")  and then a series of [`FSM.Transition`](FSM.Transition.html "class in akka.actor") updates. |
| [FSM.SubscribeTransitionCallBack$](FSM.SubscribeTransitionCallBack$.html "class in akka.actor") |  |
| [FSM.Timer](FSM.Timer.html "class in akka.actor") | INTERNAL API |
| [FSM.Timer$](FSM.Timer$.html "class in akka.actor") |  |
| [FSM.TransformHelper](FSM.TransformHelper.html "class in akka.actor") |  |
| [FSM.Transition](FSM.Transition.html "class in akka.actor")\<S\> | Message type which is used to communicate transitions between states to  all subscribed listeners (use [`FSM.SubscribeTransitionCallBack`](FSM.SubscribeTransitionCallBack.html "class in akka.actor")). |
| [FSM.Transition$](FSM.Transition$.html "class in akka.actor") |  |
| [FSM.UnsubscribeTransitionCallBack](FSM.UnsubscribeTransitionCallBack.html "class in akka.actor") | Unsubscribe from [`FSM.Transition`](FSM.Transition.html "class in akka.actor") notifications which was  effected by sending the corresponding [`FSM.SubscribeTransitionCallBack`](FSM.SubscribeTransitionCallBack.html "class in akka.actor"). |
| [FSM.UnsubscribeTransitionCallBack$](FSM.UnsubscribeTransitionCallBack$.html "class in akka.actor") |  |
| [FSM$](FSM$.html "class in akka.actor") |  |
| [FunctionRef$](FunctionRef$.html "class in akka.actor") | INTERNAL API |
| [Identify](Identify.html "class in akka.actor") | A message all Actors will understand, that when processed will reply with  [`ActorIdentity`](ActorIdentity.html "class in akka.actor") containing the `ActorRef`. |
| [Identify$](Identify$.html "class in akka.actor") |  |
| [IgnoreActorRef$](IgnoreActorRef$.html "class in akka.actor") | INTERNAL API |
| [IllegalActorStateException$](IllegalActorStateException$.html "class in akka.actor") |  |
| [IndirectActorProducer$](IndirectActorProducer$.html "class in akka.actor") |  |
| [InternalActorRef$](InternalActorRef$.html "class in akka.actor") | INTERNAL API |
| [InvalidActorNameException$](InvalidActorNameException$.html "class in akka.actor") |  |
| [InvalidMessageException$](InvalidMessageException$.html "class in akka.actor") |  |
| [JVMShutdownHooks$](JVMShutdownHooks$.html "class in akka.actor") |  |
| [Kill](Kill.html "class in akka.actor") |  |
| [Kill$](Kill$.html "class in akka.actor") | A message all Actors will understand, that when processed will make the Actor throw an ActorKilledException,  which will trigger supervision. |
| [LightArrayRevolverScheduler](LightArrayRevolverScheduler.html "class in akka.actor") | This scheduler implementation is based on a revolving wheel of buckets,  like Netty\&rsquo;s HashedWheelTimer, which it advances at a fixed tick rate and  dispatches tasks it finds in the current bucket to their respective  ExecutionContexts. |
| [LightArrayRevolverScheduler.TaskHolder](LightArrayRevolverScheduler.TaskHolder.html "class in akka.actor") | INTERNAL API |
| [LightArrayRevolverScheduler$](LightArrayRevolverScheduler$.html "class in akka.actor") |  |
| [LocalActorRefProvider$](LocalActorRefProvider$.html "class in akka.actor") |  |
| [LocalScope](LocalScope.html "class in akka.actor") |  |
| [LocalScope$](LocalScope$.html "class in akka.actor") | The Local Scope is the default one, which is assumed on all deployments  which do not set a different scope. |
| [Nobody](Nobody.html "class in akka.actor") | This is an internal look\-up failure token, not useful for anything else. |
| [Nobody$](Nobody$.html "class in akka.actor") | This is an internal look\-up failure token, not useful for anything else. |
| [NoScopeGiven](NoScopeGiven.html "class in akka.actor") | This is the default value and as such allows overrides. |
| [NoScopeGiven$](NoScopeGiven$.html "class in akka.actor") |  |
| [OneForOneStrategy](OneForOneStrategy.html "class in akka.actor") | Applies the fault handling `Directive` (Resume, Restart, Stop) specified in the `Decider`  to the child actor that failed, as opposed to [`AllForOneStrategy`](AllForOneStrategy.html "class in akka.actor") that applies  it to all children. |
| [OneForOneStrategy$](OneForOneStrategy$.html "class in akka.actor") |  |
| [OriginalRestartException](OriginalRestartException.html "class in akka.actor") | This is an extractor for retrieving the original cause (i.e. |
| [OriginalRestartException$](OriginalRestartException$.html "class in akka.actor") | This is an extractor for retrieving the original cause (i.e. |
| [PoisonPill](PoisonPill.html "class in akka.actor") |  |
| [PoisonPill$](PoisonPill$.html "class in akka.actor") | A message all Actors will understand, that when processed will terminate the Actor permanently. |
| [PostRestartException$](PostRestartException$.html "class in akka.actor") |  |
| [PreRestartException$](PreRestartException$.html "class in akka.actor") |  |
| [Props](Props.html "class in akka.actor") |  |
| [Props$](Props$.html "class in akka.actor") | Factory for Props instances. |
| [ProviderSelection](ProviderSelection.html "class in akka.actor") |  |
| [ProviderSelection.Cluster$](ProviderSelection.Cluster$.html "class in akka.actor") |  |
| [ProviderSelection.Custom](ProviderSelection.Custom.html "class in akka.actor") |  |
| [ProviderSelection.Custom$](ProviderSelection.Custom$.html "class in akka.actor") |  |
| [ProviderSelection.Local$](ProviderSelection.Local$.html "class in akka.actor") |  |
| [ProviderSelection.Remote$](ProviderSelection.Remote$.html "class in akka.actor") |  |
| [ProviderSelection$](ProviderSelection$.html "class in akka.actor") |  |
| [ReceiveTimeout](ReceiveTimeout.html "class in akka.actor") |  |
| [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor") | When using ActorContext.setReceiveTimeout, the singleton instance of ReceiveTimeout will be sent  to the Actor when there hasn't been any message for that long. |
| [ReflectiveDynamicAccess](ReflectiveDynamicAccess.html "class in akka.actor") | This is the default [`DynamicAccess`](DynamicAccess.html "class in akka.actor") implementation used by [`ExtendedActorSystem`](ExtendedActorSystem.html "class in akka.actor")  unless overridden. |
| [RelativeActorPath](RelativeActorPath.html "class in akka.actor") | Extractor for so\-called \&ldquo;relative actor paths\&rdquo; as in \&ldquo;relative URI\&rdquo;, not in  \&ldquo;relative to some actor\&rdquo;. |
| [RelativeActorPath$](RelativeActorPath$.html "class in akka.actor") | Extractor for so\-called \&ldquo;relative actor paths\&rdquo; as in \&ldquo;relative URI\&rdquo;, not in  \&ldquo;relative to some actor\&rdquo;. |
| [RootActorPath](RootActorPath.html "class in akka.actor") | Root of the hierarchy of ActorPaths. |
| [RootActorPath$](RootActorPath$.html "class in akka.actor") |  |
| [Scheduler$](Scheduler$.html "class in akka.actor") |  |
| [SchedulerException$](SchedulerException$.html "class in akka.actor") |  |
| [SelectChildName$](SelectChildName$.html "class in akka.actor") |  |
| [SelectChildPattern$](SelectChildPattern$.html "class in akka.actor") |  |
| [SelectParent](SelectParent.html "class in akka.actor") | INTERNAL API |
| [SelectParent$](SelectParent$.html "class in akka.actor") | INTERNAL API |
| [SerializedActorRef$](SerializedActorRef$.html "class in akka.actor") | INTERNAL API |
| [SerializedIgnore](SerializedIgnore.html "class in akka.actor") | INTERNAL API |
| [SerializedIgnore$](SerializedIgnore$.html "class in akka.actor") | INTERNAL API |
| [StashOverflowException$](StashOverflowException$.html "class in akka.actor") |  |
| [Status](Status.html "class in akka.actor") | Superseeded by [`StatusReply`](../pattern/StatusReply.html "class in akka.pattern"), prefer that when possible. |
| [Status.Failure](Status.Failure.html "class in akka.actor") | This class/message type is preferably used to indicate failure of some operation performed. |
| [Status.Failure$](Status.Failure$.html "class in akka.actor") |  |
| [Status.Success](Status.Success.html "class in akka.actor") | This class/message type is preferably used to indicate success of some operation performed. |
| [Status.Success$](Status.Success$.html "class in akka.actor") |  |
| [Status$](Status$.html "class in akka.actor") | Superseeded by [`StatusReply`](../pattern/StatusReply.html "class in akka.pattern"), prefer that when possible. |
| [StopChild$](StopChild$.html "class in akka.actor") |  |
| [StoppingSupervisorStrategy](StoppingSupervisorStrategy.html "class in akka.actor") |  |
| [SupervisorStrategy](SupervisorStrategy.html "class in akka.actor") | An Akka SupervisorStrategy is the policy to apply for crashing children. |
| [SupervisorStrategy.Escalate$](SupervisorStrategy.Escalate$.html "class in akka.actor") | Escalates the failure to the supervisor of the supervisor,  by rethrowing the cause of the failure, i.e. |
| [SupervisorStrategy.Restart$](SupervisorStrategy.Restart$.html "class in akka.actor") | Discards the old Actor instance and replaces it with a new,  then resumes message processing. |
| [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor") | Resumes message processing for the failed Actor |
| [SupervisorStrategy.Stop$](SupervisorStrategy.Stop$.html "class in akka.actor") | Stops the Actor |
| [SupervisorStrategy$](SupervisorStrategy$.html "class in akka.actor") |  |
| [SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") | Similar to [`DeadLetter`](DeadLetter.html "class in akka.actor") with the slight twist of NOT being logged by the default dead letters listener. |
| [SuppressedDeadLetter$](SuppressedDeadLetter$.html "class in akka.actor") |  |
| [SystemGuardian](SystemGuardian.html "class in akka.actor") | INTERNAL API |
| [SystemGuardian.RegisterTerminationHook$](SystemGuardian.RegisterTerminationHook$.html "class in akka.actor") | For the purpose of orderly shutdown it's possible  to register interest in the termination of systemGuardian  and receive a notification `TerminationHook`  before systemGuardian is stopped. |
| [SystemGuardian.TerminationHook$](SystemGuardian.TerminationHook$.html "class in akka.actor") |  |
| [SystemGuardian.TerminationHookDone$](SystemGuardian.TerminationHookDone$.html "class in akka.actor") |  |
| [SystemGuardian$](SystemGuardian$.html "class in akka.actor") | INTERNAL API |
| [Terminated](Terminated.html "class in akka.actor") | When Death Watch is used, the watcher will receive a Terminated(watched)  message when watched is terminated. |
| [Terminated$](Terminated$.html "class in akka.actor") |  |
| [TimerScheduler](TimerScheduler.html "class in akka.actor") | Support for scheduled `self` messages in an actor. |
| [TimerSchedulerImpl$](TimerSchedulerImpl$.html "class in akka.actor") | INTERNAL API |
| [UnhandledMessage](UnhandledMessage.html "class in akka.actor") | This message is published to the EventStream whenever an Actor receives a message it doesn't understand |
| [UnhandledMessage$](UnhandledMessage$.html "class in akka.actor") |  |
| [UntypedAbstractActor](UntypedAbstractActor.html "class in akka.actor") | If the validation of the `ReceiveBuilder` match logic turns out to be a bottleneck for some of your  actors you can consider to implement it at lower level by extending `UntypedAbstractActor` instead  of `AbstractActor`. |
| [WrappedMessage$](WrappedMessage$.html "class in akka.actor") |  |
- Exception Summary 
| Exception | Description |
| [ActorInitializationException](ActorInitializationException.html "class in akka.actor") | An ActorInitializationException is thrown when the initialization logic for an Actor fails. |
| --- | --- |
| [ActorInterruptedException](ActorInterruptedException.html "class in akka.actor") | When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to  avoid cascading interrupts to other threads than the originally interrupted one. |
| [ActorKilledException](ActorKilledException.html "class in akka.actor") | ActorKilledException is thrown when an Actor receives the [`Kill`](Kill.html "class in akka.actor") message |
| [ActorNotFound](ActorNotFound.html "class in akka.actor") | When [`ActorSelection.resolveOne(akka.util.Timeout)`](ActorSelection.html#resolveOne(akka.util.Timeout)) can't identify the actor the  `Future` is completed with this failure. |
| [DeathPactException](DeathPactException.html "class in akka.actor") | A DeathPactException is thrown by an Actor that receives a Terminated(someActor) message  that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor. |
| [IllegalActorStateException](IllegalActorStateException.html "class in akka.actor") | IllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated. |
| [InvalidActorNameException](InvalidActorNameException.html "class in akka.actor") | An InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name  which doesn't validate. |
| [InvalidMessageException](InvalidMessageException.html "class in akka.actor") | InvalidMessageException is thrown when an invalid message is sent to an Actor;  Currently only `null` is an invalid message. |
| [PostRestartException](PostRestartException.html "class in akka.actor") | A PostRestartException is thrown when constructor or postRestart() method  fails during a restart attempt. |
| [PreRestartException](PreRestartException.html "class in akka.actor") | A PreRestartException is thrown when the preRestart() method failed; this  exception is not propagated to the supervisor, as it originates from the  already failed instance, hence it is only visible as log entry on the event  stream. |
| [SchedulerException](SchedulerException.html "class in akka.actor") | This exception is thrown by Scheduler.schedule\* when scheduling is not  possible, e.g. |
| [StashOverflowException](StashOverflowException.html "class in akka.actor") | Is thrown when the size of the Stash exceeds the capacity of the Stash |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActor$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractFSM$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractFSM.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractLoggingActor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractProps.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractScheduler.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AbstractSchedulerBase.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorCell$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorIdentity$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorIdentity.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorKilledException$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorLogMarker.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorNotFound$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorNotFound.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPath$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPathExtractor$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPathExtractor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPaths$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPaths.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRefScope.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSelection$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSelectionMessage$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem$.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html)*