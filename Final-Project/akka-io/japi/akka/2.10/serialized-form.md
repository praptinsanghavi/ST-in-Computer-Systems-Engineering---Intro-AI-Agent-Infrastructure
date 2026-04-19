---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/serialized-form.html
title: Serialized Form
---

# Serialized Form

## Content

# Serialized Form

- ## Package akka

	- ### Class [akka.AkkaException](akka/AkkaException.html "class in akka") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.ConfigurationException](akka/ConfigurationException.html "class in akka") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.Done](akka/Done.html "class in akka") extends java.lang.Object implements Serializable
	- ### Class [akka.Done$](akka/Done$.html "class in akka") extends [Done](akka/Done.html "class in akka") implements Serializable
	- ### Class [akka.NotUsed$](akka/NotUsed$.html "class in akka") extends [NotUsed](akka/NotUsed.html "class in akka") implements Serializable
	- ### Class [akka.UnsupportedAkkaVersion](akka/UnsupportedAkkaVersion.html "class in akka") extends java.lang.RuntimeException implements Serializable
- ## Package akka.actor

	- ### Class [akka.actor.ActorIdentity](akka/actor/ActorIdentity.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorIdentity$](akka/actor/ActorIdentity$.html "class in akka.actor") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​[ActorIdentity](akka/actor/ActorIdentity.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.ActorInitializationException](akka/actor/ActorInitializationException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.ActorInitializationException$](akka/actor/ActorInitializationException$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorInterruptedException](akka/actor/ActorInterruptedException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.ActorKilledException](akka/actor/ActorKilledException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.ActorKilledException$](akka/actor/ActorKilledException$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ActorKilledException](akka/actor/ActorKilledException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.ActorNotFound](akka/actor/ActorNotFound.html "class in akka.actor") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.actor.ActorNotFound$](akka/actor/ActorNotFound$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<[ActorSelection](akka/actor/ActorSelection.html "class in akka.actor"),​[ActorNotFound](akka/actor/ActorNotFound.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.ActorPath$](akka/actor/ActorPath$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorRef](akka/actor/ActorRef.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorRef$](akka/actor/ActorRef$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorSelection](akka/actor/ActorSelection.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorSelection$](akka/actor/ActorSelection$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ActorSelectionMessage$](akka/actor/ActorSelectionMessage$.html "class in akka.actor") extends scala.runtime.AbstractFunction3\<java.lang.Object,​scala.collection.immutable.Iterable\<[SelectionPathElement](akka/actor/SelectionPathElement.html "interface in akka.actor")\>,​java.lang.Object,​akka.actor.ActorSelectionMessage\> implements Serializable
	- ### Class [akka.actor.Address](akka/actor/Address.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Address$](akka/actor/Address$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.AddressTerminated$](akka/actor/AddressTerminated$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​akka.actor.AddressTerminated\> implements Serializable
	- ### Class [akka.actor.AllForOneStrategy](akka/actor/AllForOneStrategy.html "class in akka.actor") extends [SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.AllForOneStrategy$](akka/actor/AllForOneStrategy$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ChildActorPath](akka/actor/ChildActorPath.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ChildNameReserved$](akka/actor/ChildNameReserved$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ChildRestartStats](akka/actor/ChildRestartStats.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ChildRestartStats$](akka/actor/ChildRestartStats$.html "class in akka.actor") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[ChildRestartStats](akka/actor/ChildRestartStats.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.ActorSystemTerminateReason$](akka/actor/CoordinatedShutdown.ActorSystemTerminateReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.ClusterDowningReason$](akka/actor/CoordinatedShutdown.ClusterDowningReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.ClusterJoinUnsuccessfulReason$](akka/actor/CoordinatedShutdown.ClusterJoinUnsuccessfulReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.ClusterLeavingReason$](akka/actor/CoordinatedShutdown.ClusterLeavingReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.IncompatibleConfigurationDetectedReason$](akka/actor/CoordinatedShutdown.IncompatibleConfigurationDetectedReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.JvmExitReason$](akka/actor/CoordinatedShutdown.JvmExitReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.Phase$](akka/actor/CoordinatedShutdown.Phase$.html "class in akka.actor") extends scala.runtime.AbstractFunction4\<scala.collection.immutable.Set\<java.lang.String\>,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​java.lang.Object,​akka.actor.CoordinatedShutdown.Phase\> implements Serializable
	- ### Class [akka.actor.CoordinatedShutdown.UnknownReason$](akka/actor/CoordinatedShutdown.UnknownReason$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class akka.actor.CoordinatedShutdown$tasks$StrictPhaseDefinition extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### size
			
			
			
			```
			int size
			```
			- #### tasks
			
			
			
			```
			scala.collection.immutable.Set<akka.actor.CoordinatedShutdown$tasks$TaskDefinition> tasks
			```
	- ### Class akka.actor.CoordinatedShutdown$tasks$StrictPhaseDefinition$ extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### empty
			
			
			
			```
			akka.actor.CoordinatedShutdown$tasks$StrictPhaseDefinition empty
			```
	- ### Class akka.actor.CoordinatedShutdownTerminationWatcher.Watch extends java.lang.Object implements Serializable
	- ### Class akka.actor.CoordinatedShutdownTerminationWatcher.Watch$ extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.concurrent.duration.Deadline,​scala.concurrent.Promise\<[Done](akka/Done.html "class in akka")\>,​akka.actor.CoordinatedShutdownTerminationWatcher.Watch\> implements Serializable
	- ### Class [akka.actor.DeadLetter](akka/actor/DeadLetter.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.DeadLetter$](akka/actor/DeadLetter$.html "class in akka.actor") extends scala.runtime.AbstractFunction3\<java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[DeadLetter](akka/actor/DeadLetter.html "class in akka.actor")\> implements Serializable
	- ### Class akka.actor.DeadLetterActorRef.SerializedDeadLetterActorRef extends java.lang.Object implements Serializable
	- ### Class [akka.actor.DeadLetterActorRef$](akka/actor/DeadLetterActorRef$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.DeathPactException](akka/actor/DeathPactException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.DeathPactException$](akka/actor/DeathPactException$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[DeathPactException](akka/actor/DeathPactException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.Deploy](akka/actor/Deploy.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Deploy$](akka/actor/Deploy$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Dropped](akka/actor/Dropped.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Dropped$](akka/actor/Dropped$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.CurrentState](akka/actor/FSM.CurrentState.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.CurrentState$](akka/actor/FSM.CurrentState$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Event](akka/actor/FSM.Event.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Event$](akka/actor/FSM.Event$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Failure](akka/actor/FSM.Failure.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Failure$](akka/actor/FSM.Failure$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[FSM.Failure](akka/actor/FSM.Failure.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.FSM.FixedDelayMode$](akka/actor/FSM.FixedDelayMode$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.FixedRateMode$](akka/actor/FSM.FixedRateMode$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.LogEntry](akka/actor/FSM.LogEntry.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.LogEntry$](akka/actor/FSM.LogEntry$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Normal$](akka/actor/FSM.Normal$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Shutdown$](akka/actor/FSM.Shutdown$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.SilentState](akka/actor/FSM.SilentState.html "class in akka.actor") extends [FSM.State](akka/actor/FSM.State.html "class in akka.actor")\<[S](akka/actor/FSM.SilentState.html "type parameter in FSM.SilentState"),​[D](akka/actor/FSM.SilentState.html "type parameter in FSM.SilentState")\> implements Serializable
	- ### Class [akka.actor.FSM.SingleMode$](akka/actor/FSM.SingleMode$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.State](akka/actor/FSM.State.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.State$](akka/actor/FSM.State$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.StateTimeout$](akka/actor/FSM.StateTimeout$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.StopEvent](akka/actor/FSM.StopEvent.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.StopEvent$](akka/actor/FSM.StopEvent$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.SubscribeTransitionCallBack](akka/actor/FSM.SubscribeTransitionCallBack.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.SubscribeTransitionCallBack$](akka/actor/FSM.SubscribeTransitionCallBack$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[FSM.SubscribeTransitionCallBack](akka/actor/FSM.SubscribeTransitionCallBack.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.FSM.Timer](akka/actor/FSM.Timer.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Timer$](akka/actor/FSM.Timer$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Transition](akka/actor/FSM.Transition.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.Transition$](akka/actor/FSM.Transition$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.UnsubscribeTransitionCallBack](akka/actor/FSM.UnsubscribeTransitionCallBack.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.FSM.UnsubscribeTransitionCallBack$](akka/actor/FSM.UnsubscribeTransitionCallBack$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[FSM.UnsubscribeTransitionCallBack](akka/actor/FSM.UnsubscribeTransitionCallBack.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.FunctionRef$](akka/actor/FunctionRef$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Identify](akka/actor/Identify.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Identify$](akka/actor/Identify$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Identify](akka/actor/Identify.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.IgnoreActorRef$](akka/actor/IgnoreActorRef$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.IllegalActorStateException](akka/actor/IllegalActorStateException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.IllegalActorStateException$](akka/actor/IllegalActorStateException$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[IllegalActorStateException](akka/actor/IllegalActorStateException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.InternalActorRef$](akka/actor/InternalActorRef$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.InvalidActorNameException](akka/actor/InvalidActorNameException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.InvalidActorNameException$](akka/actor/InvalidActorNameException$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[InvalidActorNameException](akka/actor/InvalidActorNameException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.InvalidMessageException](akka/actor/InvalidMessageException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.InvalidMessageException$](akka/actor/InvalidMessageException$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[InvalidMessageException](akka/actor/InvalidMessageException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.Kill](akka/actor/Kill.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Kill$](akka/actor/Kill$.html "class in akka.actor") extends [Kill](akka/actor/Kill.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.LocalScope$](akka/actor/LocalScope$.html "class in akka.actor") extends [LocalScope](akka/actor/LocalScope.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.Nobody$](akka/actor/Nobody$.html "class in akka.actor") extends akka.actor.InternalActorRef implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			protected java.lang.Object writeReplace()
			                                 throws java.io.ObjectStreamException
			```
			
			
			Throws:
			`java.io.ObjectStreamException`
	- ### Class [akka.actor.NoScopeGiven$](akka/actor/NoScopeGiven$.html "class in akka.actor") extends [NoScopeGiven](akka/actor/NoScopeGiven.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.OneForOneStrategy](akka/actor/OneForOneStrategy.html "class in akka.actor") extends [SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.OneForOneStrategy$](akka/actor/OneForOneStrategy$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.PoisonPill](akka/actor/PoisonPill.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.PoisonPill$](akka/actor/PoisonPill$.html "class in akka.actor") extends [PoisonPill](akka/actor/PoisonPill.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.PostRestartException](akka/actor/PostRestartException.html "class in akka.actor") extends [ActorInitializationException](akka/actor/ActorInitializationException.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.PostRestartException$](akka/actor/PostRestartException$.html "class in akka.actor") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](akka/actor/PostRestartException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.PreRestartException](akka/actor/PreRestartException.html "class in akka.actor") extends [ActorInitializationException](akka/actor/ActorInitializationException.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.PreRestartException$](akka/actor/PreRestartException$.html "class in akka.actor") extends scala.runtime.AbstractFunction4\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option\<java.lang.Object\>,​[PreRestartException](akka/actor/PreRestartException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.Props](akka/actor/Props.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Props$](akka/actor/Props$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.ProviderSelection.Cluster$](akka/actor/ProviderSelection.Cluster$.html "class in akka.actor") extends [ProviderSelection](akka/actor/ProviderSelection.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.ProviderSelection.Custom](akka/actor/ProviderSelection.Custom.html "class in akka.actor") extends [ProviderSelection](akka/actor/ProviderSelection.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.ProviderSelection.Custom$](akka/actor/ProviderSelection.Custom$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ProviderSelection.Custom](akka/actor/ProviderSelection.Custom.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.ProviderSelection.Local$](akka/actor/ProviderSelection.Local$.html "class in akka.actor") extends [ProviderSelection](akka/actor/ProviderSelection.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.ProviderSelection.Remote$](akka/actor/ProviderSelection.Remote$.html "class in akka.actor") extends [ProviderSelection](akka/actor/ProviderSelection.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.ReceiveTimeout$](akka/actor/ReceiveTimeout$.html "class in akka.actor") extends [ReceiveTimeout](akka/actor/ReceiveTimeout.html "class in akka.actor") implements Serializable
	- ### Class [akka.actor.RootActorPath](akka/actor/RootActorPath.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.RootActorPath$](akka/actor/RootActorPath$.html "class in akka.actor") extends scala.runtime.AbstractFunction2\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.String,​[RootActorPath](akka/actor/RootActorPath.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.SchedulerException](akka/actor/SchedulerException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.SchedulerException$](akka/actor/SchedulerException$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[SchedulerException](akka/actor/SchedulerException.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.SelectChildName$](akka/actor/SelectChildName$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.actor.SelectChildName\> implements Serializable
	- ### Class [akka.actor.SelectChildPattern$](akka/actor/SelectChildPattern$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.actor.SelectChildPattern\> implements Serializable
	- ### Class [akka.actor.SelectParent$](akka/actor/SelectParent$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.SerializedActorRef$](akka/actor/SerializedActorRef$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.SerializedIgnore$](akka/actor/SerializedIgnore$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.StashOverflowException](akka/actor/StashOverflowException.html "class in akka.actor") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.StashOverflowException$](akka/actor/StashOverflowException$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Status.Failure](akka/actor/Status.Failure.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Status.Failure$](akka/actor/Status.Failure$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[Status.Failure](akka/actor/Status.Failure.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.Status.Success](akka/actor/Status.Success.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Status.Success$](akka/actor/Status.Success$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Status.Success](akka/actor/Status.Success.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.StopChild$](akka/actor/StopChild$.html "class in akka.actor") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.actor.StopChild\> implements Serializable
	- ### Class [akka.actor.SupervisorStrategy.Escalate$](akka/actor/SupervisorStrategy.Escalate$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.SupervisorStrategy.Restart$](akka/actor/SupervisorStrategy.Restart$.html "class in akka.actor") extends akka.actor.SupervisorStrategy.Restart implements Serializable
	- ### Class [akka.actor.SupervisorStrategy.Resume$](akka/actor/SupervisorStrategy.Resume$.html "class in akka.actor") extends akka.actor.SupervisorStrategy.Resume implements Serializable
	- ### Class [akka.actor.SupervisorStrategy.Stop$](akka/actor/SupervisorStrategy.Stop$.html "class in akka.actor") extends akka.actor.SupervisorStrategy.Stop implements Serializable
	- ### Class [akka.actor.SuppressedDeadLetter](akka/actor/SuppressedDeadLetter.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.SuppressedDeadLetter$](akka/actor/SuppressedDeadLetter$.html "class in akka.actor") extends scala.runtime.AbstractFunction3\<[DeadLetterSuppression](akka/actor/DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](akka/actor/SuppressedDeadLetter.html "class in akka.actor")\> implements Serializable
	- ### Class [akka.actor.SystemGuardian.RegisterTerminationHook$](akka/actor/SystemGuardian.RegisterTerminationHook$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.SystemGuardian.TerminationHook$](akka/actor/SystemGuardian.TerminationHook$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.SystemGuardian.TerminationHookDone$](akka/actor/SystemGuardian.TerminationHookDone$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Terminated](akka/actor/Terminated.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.Terminated$](akka/actor/Terminated$.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class akka.actor.TimerSchedulerImpl.InfluenceReceiveTimeoutTimerMsg extends java.lang.Object implements Serializable
	- ### Class akka.actor.TimerSchedulerImpl.InfluenceReceiveTimeoutTimerMsg$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​akka.actor.TimerSchedulerImpl,​akka.actor.TimerSchedulerImpl.InfluenceReceiveTimeoutTimerMsg\> implements Serializable
	- ### Class akka.actor.TimerSchedulerImpl.NotInfluenceReceiveTimeoutTimerMsg extends java.lang.Object implements Serializable
	- ### Class akka.actor.TimerSchedulerImpl.NotInfluenceReceiveTimeoutTimerMsg$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​akka.actor.TimerSchedulerImpl,​akka.actor.TimerSchedulerImpl.NotInfluenceReceiveTimeoutTimerMsg\> implements Serializable
	- ### Class akka.actor.TimerSchedulerImpl.Timer extends java.lang.Object implements Serializable
	- ### Class akka.actor.TimerSchedulerImpl.Timer$ extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[Cancellable](akka/actor/Cancellable.html "interface in akka.actor"),​akka.actor.TimerSchedulerImpl.Timer\> implements Serializable
	- ### Class [akka.actor.UnhandledMessage](akka/actor/UnhandledMessage.html "class in akka.actor") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.UnhandledMessage$](akka/actor/UnhandledMessage$.html "class in akka.actor") extends scala.runtime.AbstractFunction3\<java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[UnhandledMessage](akka/actor/UnhandledMessage.html "class in akka.actor")\> implements Serializable
- ## Package akka.actor.dungeon

	- ### Class [akka.actor.dungeon.ChildrenContainer.Creation](akka/actor/dungeon/ChildrenContainer.Creation.html "class in akka.actor.dungeon") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.Creation$](akka/actor/dungeon/ChildrenContainer.Creation$.html "class in akka.actor.dungeon") extends scala.runtime.AbstractFunction0\<[ChildrenContainer.Creation](akka/actor/dungeon/ChildrenContainer.Creation.html "class in akka.actor.dungeon")\> implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.Recreation](akka/actor/dungeon/ChildrenContainer.Recreation.html "class in akka.actor.dungeon") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.Recreation$](akka/actor/dungeon/ChildrenContainer.Recreation$.html "class in akka.actor.dungeon") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[ChildrenContainer.Recreation](akka/actor/dungeon/ChildrenContainer.Recreation.html "class in akka.actor.dungeon")\> implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.TerminatingChildrenContainer](akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.TerminatingChildrenContainer$](akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html "class in akka.actor.dungeon") extends scala.runtime.AbstractFunction3\<scala.collection.immutable.TreeMap\<java.lang.String,​[ChildStats](akka/actor/ChildStats.html "interface in akka.actor")\>,​scala.collection.immutable.Set\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​[ChildrenContainer.SuspendReason](akka/actor/dungeon/ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")\> implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.Termination$](akka/actor/dungeon/ChildrenContainer.Termination$.html "class in akka.actor.dungeon") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.dungeon.ChildrenContainer.UserRequest$](akka/actor/dungeon/ChildrenContainer.UserRequest$.html "class in akka.actor.dungeon") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.dungeon.SerializationCheckFailedException](akka/actor/dungeon/SerializationCheckFailedException.html "class in akka.actor.dungeon") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.actor.dungeon.SerializationCheckFailedException$](akka/actor/dungeon/SerializationCheckFailedException$.html "class in akka.actor.dungeon") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](akka/actor/dungeon/SerializationCheckFailedException.html "class in akka.actor.dungeon")\> implements Serializable
- ## Package akka.actor.testkit.typed

	- ### Class [akka.actor.testkit.typed.CapturedLogEvent](akka/actor/testkit/typed/CapturedLogEvent.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.CapturedLogEvent$](akka/actor/testkit/typed/CapturedLogEvent$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.AskInitiated](akka/actor/testkit/typed/Effect.AskInitiated.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.AskInitiated$](akka/actor/testkit/typed/Effect.AskInitiated$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.MessageAdapter](akka/actor/testkit/typed/Effect.MessageAdapter.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.MessageAdapter$](akka/actor/testkit/typed/Effect.MessageAdapter$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.NoEffects$](akka/actor/testkit/typed/Effect.NoEffects$.html "class in akka.actor.testkit.typed") extends [Effect.NoEffects](akka/actor/testkit/typed/Effect.NoEffects.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.ReceiveTimeoutCancelled$](akka/actor/testkit/typed/Effect.ReceiveTimeoutCancelled$.html "class in akka.actor.testkit.typed") extends [Effect.ReceiveTimeoutCancelled](akka/actor/testkit/typed/Effect.ReceiveTimeoutCancelled.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.ReceiveTimeoutSet](akka/actor/testkit/typed/Effect.ReceiveTimeoutSet.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.ReceiveTimeoutSet$](akka/actor/testkit/typed/Effect.ReceiveTimeoutSet$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Scheduled](akka/actor/testkit/typed/Effect.Scheduled.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Scheduled$](akka/actor/testkit/typed/Effect.Scheduled$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Spawned](akka/actor/testkit/typed/Effect.Spawned.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Spawned$](akka/actor/testkit/typed/Effect.Spawned$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.SpawnedAdapter$](akka/actor/testkit/typed/Effect.SpawnedAdapter$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.SpawnedAnonymous](akka/actor/testkit/typed/Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.SpawnedAnonymous$](akka/actor/testkit/typed/Effect.SpawnedAnonymous$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.SpawnedAnonymousAdapter$](akka/actor/testkit/typed/Effect.SpawnedAnonymousAdapter$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Stopped](akka/actor/testkit/typed/Effect.Stopped.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Stopped$](akka/actor/testkit/typed/Effect.Stopped$.html "class in akka.actor.testkit.typed") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Effect.Stopped](akka/actor/testkit/typed/Effect.Stopped.html "class in akka.actor.testkit.typed")\> implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerCancelled](akka/actor/testkit/typed/Effect.TimerCancelled.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerCancelled$](akka/actor/testkit/typed/Effect.TimerCancelled$.html "class in akka.actor.testkit.typed") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Effect.TimerCancelled](akka/actor/testkit/typed/Effect.TimerCancelled.html "class in akka.actor.testkit.typed")\> implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled](akka/actor/testkit/typed/Effect.TimerScheduled.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$](akka/actor/testkit/typed/Effect.TimerScheduled$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.FixedDelayMode$](akka/actor/testkit/typed/Effect.TimerScheduled$.FixedDelayMode$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.FixedDelayModeWithInitialDelay](akka/actor/testkit/typed/Effect.TimerScheduled$.FixedDelayModeWithInitialDelay.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.FixedDelayModeWithInitialDelay$](akka/actor/testkit/typed/Effect.TimerScheduled$.FixedDelayModeWithInitialDelay$.html "class in akka.actor.testkit.typed") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.actor.testkit.typed.Effect.TimerScheduled.FixedDelayModeWithInitialDelay\> implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.FixedRateMode$](akka/actor/testkit/typed/Effect.TimerScheduled$.FixedRateMode$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.FixedRateModeWithInitialDelay](akka/actor/testkit/typed/Effect.TimerScheduled$.FixedRateModeWithInitialDelay.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.FixedRateModeWithInitialDelay$](akka/actor/testkit/typed/Effect.TimerScheduled$.FixedRateModeWithInitialDelay$.html "class in akka.actor.testkit.typed") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.actor.testkit.typed.Effect.TimerScheduled.FixedRateModeWithInitialDelay\> implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.TimerScheduled$.SingleMode$](akka/actor/testkit/typed/Effect.TimerScheduled$.SingleMode$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Unwatched](akka/actor/testkit/typed/Effect.Unwatched.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Unwatched$](akka/actor/testkit/typed/Effect.Unwatched$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Watched](akka/actor/testkit/typed/Effect.Watched.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.Watched$](akka/actor/testkit/typed/Effect.Watched$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.WatchedWith](akka/actor/testkit/typed/Effect.WatchedWith.html "class in akka.actor.testkit.typed") extends [Effect](akka/actor/testkit/typed/Effect.html "class in akka.actor.testkit.typed") implements Serializable
	- ### Class [akka.actor.testkit.typed.Effect.WatchedWith$](akka/actor/testkit/typed/Effect.WatchedWith$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$FixedDelayMode$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$FixedDelayModeWithInitialDelay extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### initialDelay
			
			
			
			```
			scala.concurrent.duration.FiniteDuration initialDelay
			```
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$FixedDelayModeWithInitialDelay$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.actor.testkit.typed.Effect$TimerScheduled$FixedDelayModeWithInitialDelay\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$FixedRateMode$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$FixedRateModeWithInitialDelay extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### initialDelay
			
			
			
			```
			scala.concurrent.duration.FiniteDuration initialDelay
			```
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$FixedRateModeWithInitialDelay$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.actor.testkit.typed.Effect$TimerScheduled$FixedRateModeWithInitialDelay\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.testkit.typed.Effect$TimerScheduled$SingleMode$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.actor.testkit.typed.FishingOutcome.Complete$](akka/actor/testkit/typed/FishingOutcome.Complete$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.FishingOutcome.Continue$](akka/actor/testkit/typed/FishingOutcome.Continue$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.FishingOutcome.ContinueAndIgnore$](akka/actor/testkit/typed/FishingOutcome.ContinueAndIgnore$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.FishingOutcome.Fail](akka/actor/testkit/typed/FishingOutcome.Fail.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.FishingOutcome.Fail$](akka/actor/testkit/typed/FishingOutcome.Fail$.html "class in akka.actor.testkit.typed") extends scala.runtime.AbstractFunction1\<java.lang.String,​[FishingOutcome.Fail](akka/actor/testkit/typed/FishingOutcome.Fail.html "class in akka.actor.testkit.typed")\> implements Serializable
	- ### Class [akka.actor.testkit.typed.LoggingEvent](akka/actor/testkit/typed/LoggingEvent.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.LoggingEvent$](akka/actor/testkit/typed/LoggingEvent$.html "class in akka.actor.testkit.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.TestException](akka/actor/testkit/typed/TestException.html "class in akka.actor.testkit.typed") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.actor.testkit.typed.TestException$](akka/actor/testkit/typed/TestException$.html "class in akka.actor.testkit.typed") extends scala.runtime.AbstractFunction1\<java.lang.String,​[TestException](akka/actor/testkit/typed/TestException.html "class in akka.actor.testkit.typed")\> implements Serializable
- ## Package akka.actor.testkit.typed.internal

	- ### Class [akka.actor.testkit.typed.internal.ActorSystemStub$](akka/actor/testkit/typed/internal/ActorSystemStub$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.Ack$](akka/actor/testkit/typed/internal/ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.ActorStopped](akka/actor/testkit/typed/internal/ActorTestKitGuardian.ActorStopped.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.ActorStopped$](akka/actor/testkit/typed/internal/ActorTestKitGuardian.ActorStopped$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActor](akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActor.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActor$](akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActor$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActorAnonymous](akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.SpawnActorAnonymous$](akka/actor/testkit/typed/internal/ActorTestKitGuardian.SpawnActorAnonymous$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.StopActor](akka/actor/testkit/typed/internal/ActorTestKitGuardian.StopActor.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.ActorTestKitGuardian.StopActor$](akka/actor/testkit/typed/internal/ActorTestKitGuardian.StopActor$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.testkit.typed.internal.LoggingTestKitImpl$](akka/actor/testkit/typed/internal/LoggingTestKitImpl$.html "class in akka.actor.testkit.typed.internal") extends java.lang.Object implements Serializable
- ## Package akka.actor.testkit.typed.scaladsl

	- ### Class [akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit](akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") extends [ActorTestKitBase](akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html "class in akka.actor.testkit.typed.scaladsl") implements Serializable
- ## Package akka.actor.typed

	- ### Class [akka.actor.typed.ActorRef$](akka/actor/typed/ActorRef$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.ActorSystem](akka/actor/typed/ActorSystem.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.ActorSystem$](akka/actor/typed/ActorSystem$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.ActorTags](akka/actor/typed/ActorTags.html "class in akka.actor.typed") extends [Props](akka/actor/typed/Props.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.ActorTags$](akka/actor/typed/ActorTags$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.DeathPactException](akka/actor/typed/DeathPactException.html "class in akka.actor.typed") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.actor.typed.DeathPactException$](akka/actor/typed/DeathPactException$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​[DeathPactException](akka/actor/typed/DeathPactException.html "class in akka.actor.typed")\> implements Serializable
	- ### Class [akka.actor.typed.DispatcherSelector](akka/actor/typed/DispatcherSelector.html "class in akka.actor.typed") extends [Props](akka/actor/typed/Props.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.DispatcherSelector$](akka/actor/typed/DispatcherSelector$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.LogOptions.LogOptionsImpl$](akka/actor/typed/LogOptions.LogOptionsImpl$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction3\<java.lang.Object,​org.slf4j.event.Level,​scala.Option\<org.slf4j.Logger\>,​akka.actor.typed.LogOptions.LogOptionsImpl\> implements Serializable
	- ### Class [akka.actor.typed.MailboxSelector](akka/actor/typed/MailboxSelector.html "class in akka.actor.typed") extends [Props](akka/actor/typed/Props.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.MailboxSelector$](akka/actor/typed/MailboxSelector$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.MessageAdaptionFailure](akka/actor/typed/MessageAdaptionFailure.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.MessageAdaptionFailure$](akka/actor/typed/MessageAdaptionFailure$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[MessageAdaptionFailure](akka/actor/typed/MessageAdaptionFailure.html "class in akka.actor.typed")\> implements Serializable
	- ### Class [akka.actor.typed.PostStop$](akka/actor/typed/PostStop$.html "class in akka.actor.typed") extends [PostStop](akka/actor/typed/PostStop.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.PreRestart$](akka/actor/typed/PreRestart$.html "class in akka.actor.typed") extends [PreRestart](akka/actor/typed/PreRestart.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.Props](akka/actor/typed/Props.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.Props$](akka/actor/typed/Props$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.SerializedActorRef$](akka/actor/typed/SerializedActorRef$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.SpawnProtocol.Spawn](akka/actor/typed/SpawnProtocol.Spawn.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.SpawnProtocol.Spawn$](akka/actor/typed/SpawnProtocol.Spawn$.html "class in akka.actor.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.SupervisorStrategy.Backoff$](akka/actor/typed/SupervisorStrategy.Backoff$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction11\<scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​org.slf4j.event.Level,​org.slf4j.event.Level,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.actor.typed.SupervisorStrategy.Backoff\> implements Serializable
	- ### Class [akka.actor.typed.SupervisorStrategy.Restart$](akka/actor/typed/SupervisorStrategy.Restart$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction6\<java.lang.Object,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​org.slf4j.event.Level,​java.lang.Object,​java.lang.Object,​akka.actor.typed.SupervisorStrategy.Restart\> implements Serializable
	- ### Class [akka.actor.typed.SupervisorStrategy.Resume$](akka/actor/typed/SupervisorStrategy.Resume$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction2\<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Resume\> implements Serializable
	- ### Class [akka.actor.typed.SupervisorStrategy.Stop$](akka/actor/typed/SupervisorStrategy.Stop$.html "class in akka.actor.typed") extends scala.runtime.AbstractFunction2\<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Stop\> implements Serializable
- ## Package akka.actor.typed.delivery

	- ### Class [akka.actor.typed.delivery.ConsumerController.Confirmed$](akka/actor/typed/delivery/ConsumerController.Confirmed$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.DeliverThenStop](akka/actor/typed/delivery/ConsumerController.DeliverThenStop.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.DeliverThenStop$](akka/actor/typed/delivery/ConsumerController.DeliverThenStop$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.RegisterToProducerController](akka/actor/typed/delivery/ConsumerController.RegisterToProducerController.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.RegisterToProducerController$](akka/actor/typed/delivery/ConsumerController.RegisterToProducerController$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.SequencedMessage](akka/actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.SequencedMessage$](akka/actor/typed/delivery/ConsumerController.SequencedMessage$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.Start](akka/actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ConsumerController.Start$](akka/actor/typed/delivery/ConsumerController.Start$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.Cleanup$](akka/actor/typed/delivery/DurableProducerQueue.Cleanup$.html "class in akka.actor.typed.delivery") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.actor.typed.delivery.DurableProducerQueue.Cleanup\> implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.Confirmed$](akka/actor/typed/delivery/DurableProducerQueue.Confirmed$.html "class in akka.actor.typed.delivery") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.String,​java.lang.Object,​akka.actor.typed.delivery.DurableProducerQueue.Confirmed\> implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.LoadState](akka/actor/typed/delivery/DurableProducerQueue.LoadState.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.LoadState$](akka/actor/typed/delivery/DurableProducerQueue.LoadState$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.State](akka/actor/typed/delivery/DurableProducerQueue.State.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.State$](akka/actor/typed/delivery/DurableProducerQueue.State$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageConfirmed.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed$](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageConfirmed$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSent](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSent.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSent$](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSent$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSentAck](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.DurableProducerQueue.StoreMessageSentAck$](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck$.html "class in akka.actor.typed.delivery") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[DurableProducerQueue.StoreMessageSentAck](akka/actor/typed/delivery/DurableProducerQueue.StoreMessageSentAck.html "class in akka.actor.typed.delivery")\> implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.MessageWithConfirmation](akka/actor/typed/delivery/ProducerController.MessageWithConfirmation.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.MessageWithConfirmation$](akka/actor/typed/delivery/ProducerController.MessageWithConfirmation$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.RegisterConsumer](akka/actor/typed/delivery/ProducerController.RegisterConsumer.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.RegisterConsumer$](akka/actor/typed/delivery/ProducerController.RegisterConsumer$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.RequestNext](akka/actor/typed/delivery/ProducerController.RequestNext.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.RequestNext$](akka/actor/typed/delivery/ProducerController.RequestNext$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.Start](akka/actor/typed/delivery/ProducerController.Start.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.ProducerController.Start$](akka/actor/typed/delivery/ProducerController.Start$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.GetWorkerStats](akka/actor/typed/delivery/WorkPullingProducerController.GetWorkerStats.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.GetWorkerStats$](akka/actor/typed/delivery/WorkPullingProducerController.GetWorkerStats$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.MessageWithConfirmation](akka/actor/typed/delivery/WorkPullingProducerController.MessageWithConfirmation.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.MessageWithConfirmation$](akka/actor/typed/delivery/WorkPullingProducerController.MessageWithConfirmation$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.RequestNext](akka/actor/typed/delivery/WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.RequestNext$](akka/actor/typed/delivery/WorkPullingProducerController.RequestNext$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.Start](akka/actor/typed/delivery/WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.Start$](akka/actor/typed/delivery/WorkPullingProducerController.Start$.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.WorkerStats](akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.WorkPullingProducerController.WorkerStats$](akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats$.html "class in akka.actor.typed.delivery") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[WorkPullingProducerController.WorkerStats](akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")\> implements Serializable
- ## Package akka.actor.typed.delivery.internal

	- ### Class [akka.actor.typed.delivery.internal.ChunkedMessage$](akka/actor/typed/delivery/internal/ChunkedMessage$.html "class in akka.actor.typed.delivery.internal") extends scala.runtime.AbstractFunction5\<[ByteString](akka/util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​akka.actor.typed.delivery.internal.ChunkedMessage\> implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack](akka/actor/typed/delivery/internal/ProducerControllerImpl.Ack.html "class in akka.actor.typed.delivery.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack$](akka/actor/typed/delivery/internal/ProducerControllerImpl.Ack$.html "class in akka.actor.typed.delivery.internal") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ProducerControllerImpl.Ack](akka/actor/typed/delivery/internal/ProducerControllerImpl.Ack.html "class in akka.actor.typed.delivery.internal")\> implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.Request](akka/actor/typed/delivery/internal/ProducerControllerImpl.Request.html "class in akka.actor.typed.delivery.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.Request$](akka/actor/typed/delivery/internal/ProducerControllerImpl.Request$.html "class in akka.actor.typed.delivery.internal") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[ProducerControllerImpl.Request](akka/actor/typed/delivery/internal/ProducerControllerImpl.Request.html "class in akka.actor.typed.delivery.internal")\> implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.Resend](akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend.html "class in akka.actor.typed.delivery.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.Resend$](akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend$.html "class in akka.actor.typed.delivery.internal") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ProducerControllerImpl.Resend](akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend.html "class in akka.actor.typed.delivery.internal")\> implements Serializable
	- ### Class [akka.actor.typed.delivery.internal.ProducerControllerImpl.ResendFirstUnconfirmed$](akka/actor/typed/delivery/internal/ProducerControllerImpl.ResendFirstUnconfirmed$.html "class in akka.actor.typed.delivery.internal") extends java.lang.Object implements Serializable
- ## Package akka.actor.typed.eventstream

	- ### Class [akka.actor.typed.eventstream.EventStream.Publish](akka/actor/typed/eventstream/EventStream.Publish.html "class in akka.actor.typed.eventstream") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.eventstream.EventStream.Publish$](akka/actor/typed/eventstream/EventStream.Publish$.html "class in akka.actor.typed.eventstream") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.eventstream.EventStream.Subscribe](akka/actor/typed/eventstream/EventStream.Subscribe.html "class in akka.actor.typed.eventstream") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.eventstream.EventStream.Subscribe$](akka/actor/typed/eventstream/EventStream.Subscribe$.html "class in akka.actor.typed.eventstream") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.eventstream.EventStream.Unsubscribe](akka/actor/typed/eventstream/EventStream.Unsubscribe.html "class in akka.actor.typed.eventstream") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.eventstream.EventStream.Unsubscribe$](akka/actor/typed/eventstream/EventStream.Unsubscribe$.html "class in akka.actor.typed.eventstream") extends java.lang.Object implements Serializable
- ## Package akka.actor.typed.internal

	- ### Class [akka.actor.typed.internal.ActorContextImpl.LoggingContext](akka/actor/typed/internal/ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.ActorContextImpl.LoggingContext$](akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.AdaptMessage$](akka/actor/typed/internal/AdaptMessage$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter$](akka/actor/typed/internal/AdaptWithRegisteredMessageAdapter$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.CachedProps$](akka/actor/typed/internal/CachedProps$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction3\<[Props](akka/actor/typed/Props.html "class in akka.actor.typed"),​[Props](akka/actor/Props.html "class in akka.actor"),​java.lang.Object,​akka.actor.typed.internal.CachedProps\> implements Serializable
	- ### Class [akka.actor.typed.internal.Create$](akka/actor/typed/internal/Create$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction0\<akka.actor.typed.internal.Create\> implements Serializable
	- ### Class [akka.actor.typed.internal.DeathWatchNotification$](akka/actor/typed/internal/DeathWatchNotification$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification\> implements Serializable
	- ### Class [akka.actor.typed.internal.MonitorInterceptor$](akka/actor/typed/internal/MonitorInterceptor$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.NoMessage$](akka/actor/typed/internal/NoMessage$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.PoisonPill$](akka/actor/typed/internal/PoisonPill$.html "class in akka.actor.typed.internal") extends akka.actor.typed.internal.PoisonPill implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.ActorTagsImpl](akka/actor/typed/internal/PropsImpl.ActorTagsImpl.html "class in akka.actor.typed.internal") extends [ActorTags](akka/actor/typed/ActorTags.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.ActorTagsImpl$](akka/actor/typed/internal/PropsImpl.ActorTagsImpl$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.BoundedMailboxSelector](akka/actor/typed/internal/PropsImpl.BoundedMailboxSelector.html "class in akka.actor.typed.internal") extends [MailboxSelector](akka/actor/typed/MailboxSelector.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.BoundedMailboxSelector$](akka/actor/typed/internal/PropsImpl.BoundedMailboxSelector$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[Props](akka/actor/typed/Props.html "class in akka.actor.typed"),​[PropsImpl.BoundedMailboxSelector](akka/actor/typed/internal/PropsImpl.BoundedMailboxSelector.html "class in akka.actor.typed.internal")\> implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DefaultMailboxSelector](akka/actor/typed/internal/PropsImpl.DefaultMailboxSelector.html "class in akka.actor.typed.internal") extends [MailboxSelector](akka/actor/typed/MailboxSelector.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DefaultMailboxSelector$](akka/actor/typed/internal/PropsImpl.DefaultMailboxSelector$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DispatcherDefault](akka/actor/typed/internal/PropsImpl.DispatcherDefault.html "class in akka.actor.typed.internal") extends [DispatcherSelector](akka/actor/typed/DispatcherSelector.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DispatcherDefault$](akka/actor/typed/internal/PropsImpl.DispatcherDefault$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DispatcherFromConfig](akka/actor/typed/internal/PropsImpl.DispatcherFromConfig.html "class in akka.actor.typed.internal") extends [DispatcherSelector](akka/actor/typed/DispatcherSelector.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DispatcherFromConfig$](akka/actor/typed/internal/PropsImpl.DispatcherFromConfig$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<java.lang.String,​[Props](akka/actor/typed/Props.html "class in akka.actor.typed"),​[PropsImpl.DispatcherFromConfig](akka/actor/typed/internal/PropsImpl.DispatcherFromConfig.html "class in akka.actor.typed.internal")\> implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DispatcherSameAsParent](akka/actor/typed/internal/PropsImpl.DispatcherSameAsParent.html "class in akka.actor.typed.internal") extends [DispatcherSelector](akka/actor/typed/DispatcherSelector.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.DispatcherSameAsParent$](akka/actor/typed/internal/PropsImpl.DispatcherSameAsParent$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.EmptyProps$](akka/actor/typed/internal/PropsImpl.EmptyProps$.html "class in akka.actor.typed.internal") extends [Props](akka/actor/typed/Props.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.MailboxFromConfigSelector](akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal") extends [MailboxSelector](akka/actor/typed/MailboxSelector.html "class in akka.actor.typed") implements Serializable
	- ### Class [akka.actor.typed.internal.PropsImpl.MailboxFromConfigSelector$](akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<java.lang.String,​[Props](akka/actor/typed/Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")\> implements Serializable
	- ### Class [akka.actor.typed.internal.RestartSupervisor.ResetRestartCount](akka/actor/typed/internal/RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.RestartSupervisor.ResetRestartCount$](akka/actor/typed/internal/RestartSupervisor.ResetRestartCount$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[RestartSupervisor](akka/actor/typed/internal/RestartSupervisor.html "class in akka.actor.typed.internal")\<?,​? extends java.lang.Throwable\>,​[RestartSupervisor.ResetRestartCount](akka/actor/typed/internal/RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")\> implements Serializable
	- ### Class [akka.actor.typed.internal.RestartSupervisor.ScheduledRestart](akka/actor/typed/internal/RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.RestartSupervisor.ScheduledRestart$](akka/actor/typed/internal/RestartSupervisor.ScheduledRestart$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction1\<[RestartSupervisor](akka/actor/typed/internal/RestartSupervisor.html "class in akka.actor.typed.internal")\<?,​? extends java.lang.Throwable\>,​[RestartSupervisor.ScheduledRestart](akka/actor/typed/internal/RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")\> implements Serializable
	- ### Class [akka.actor.typed.internal.Terminate$](akka/actor/typed/internal/Terminate$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction0\<akka.actor.typed.internal.Terminate\> implements Serializable
	- ### Class akka.actor.typed.internal.TimerSchedulerImpl.Timer extends java.lang.Object implements Serializable
	- ### Class akka.actor.typed.internal.TimerSchedulerImpl.Timer$ extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.TransformMessagesInterceptor$](akka/actor/typed/internal/TransformMessagesInterceptor$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.UnstashException$](akka/actor/typed/internal/UnstashException$.html "class in akka.actor.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.Unwatch$](akka/actor/typed/internal/Unwatch$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​akka.actor.typed.internal.Unwatch\> implements Serializable
	- ### Class [akka.actor.typed.internal.Watch$](akka/actor/typed/internal/Watch$.html "class in akka.actor.typed.internal") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​akka.actor.typed.internal.Watch\> implements Serializable
- ## Package akka.actor.typed.internal.adapter

	- ### Class akka.actor.typed.internal.adapter.ActorAdapter.TypedActorFailedException extends java.lang.RuntimeException implements Serializable
	- ### Class akka.actor.typed.internal.adapter.ActorAdapter.TypedActorFailedException$ extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.actor.typed.internal.adapter.ActorAdapter.TypedActorFailedException\> implements Serializable
	- ### Class [akka.actor.typed.internal.adapter.ActorRefAdapter$](akka/actor/typed/internal/adapter/ActorRefAdapter$.html "class in akka.actor.typed.internal.adapter") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.adapter.ActorSystemAdapter$](akka/actor/typed/internal/adapter/ActorSystemAdapter$.html "class in akka.actor.typed.internal.adapter") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.adapter.GuardianStartupBehavior.Start$](akka/actor/typed/internal/adapter/GuardianStartupBehavior.Start$.html "class in akka.actor.typed.internal.adapter") extends java.lang.Object implements Serializable
- ## Package akka.actor.typed.internal.pubsub

	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.GetTopicStats extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### replyTo
			
			
			
			```
			[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.actor.typed.internal.pubsub.TopicImpl.TopicStats> replyTo
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.GetTopicStats$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.MessagePublished extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### message
			
			
			
			```
			T extends java.lang.Object message
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.MessagePublished$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.Publish extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### message
			
			
			
			```
			T extends java.lang.Object message
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.Publish$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.Subscribe extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### subscriber
			
			
			
			```
			[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")<T extends java.lang.Object> subscriber
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.Subscribe$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.SubscriberTerminated extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### subscriber
			
			
			
			```
			[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")<T extends java.lang.Object> subscriber
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.SubscriberTerminated$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.TopicInstancesUpdated extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### topics
			
			
			
			```
			scala.collection.immutable.Set<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.actor.typed.internal.pubsub.TopicImpl.Command<T extends java.lang.Object>>> topics
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.TopicInstancesUpdated$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.TopicStats extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### localSubscriberCount
			
			
			
			```
			int localSubscriberCount
			```
			- #### topicInstanceCount
			
			
			
			```
			int topicInstanceCount
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.TopicStats$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​akka.actor.typed.internal.pubsub.TopicImpl.TopicStats\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.Unsubscribe extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### subscriber
			
			
			
			```
			[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")<T extends java.lang.Object> subscriber
			```
	- ### Class akka.actor.typed.internal.pubsub.TopicImpl.Unsubscribe$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.actor.typed.internal.receptionist

	- ### Class [akka.actor.typed.internal.receptionist.DefaultServiceKey](akka/actor/typed/internal/receptionist/DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist") extends [ServiceKey](akka/actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")\<[T](akka/actor/typed/internal/receptionist/DefaultServiceKey.html "type parameter in DefaultServiceKey")\> implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.DefaultServiceKey$](akka/actor/typed/internal/receptionist/DefaultServiceKey$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Deregister](akka/actor/typed/internal/receptionist/ReceptionistMessages.Deregister.html "class in akka.actor.typed.internal.receptionist") extends [Receptionist.Command](akka/actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist") implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Deregister$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Deregister$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Deregistered](akka/actor/typed/internal/receptionist/ReceptionistMessages.Deregistered.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Deregistered$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Deregistered$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Find](akka/actor/typed/internal/receptionist/ReceptionistMessages.Find.html "class in akka.actor.typed.internal.receptionist") extends [Receptionist.Command](akka/actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist") implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Find$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Find$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Listing](akka/actor/typed/internal/receptionist/ReceptionistMessages.Listing.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Listing$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Listing$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Register](akka/actor/typed/internal/receptionist/ReceptionistMessages.Register.html "class in akka.actor.typed.internal.receptionist") extends [Receptionist.Command](akka/actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist") implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Register$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Register$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Registered](akka/actor/typed/internal/receptionist/ReceptionistMessages.Registered.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Registered$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Registered$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Subscribe](akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe.html "class in akka.actor.typed.internal.receptionist") extends [Receptionist.Command](akka/actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist") implements Serializable
	- ### Class [akka.actor.typed.internal.receptionist.ReceptionistMessages.Subscribe$](akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe$.html "class in akka.actor.typed.internal.receptionist") extends java.lang.Object implements Serializable
- ## Package akka.actor.typed.internal.routing

	- ### Class [akka.actor.typed.internal.routing.GroupRouterBuilder$](akka/actor/typed/internal/routing/GroupRouterBuilder$.html "class in akka.actor.typed.internal.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.internal.routing.PoolRouterBuilder$](akka/actor/typed/internal/routing/PoolRouterBuilder$.html "class in akka.actor.typed.internal.routing") extends java.lang.Object implements Serializable
- ## Package akka.actor.typed.javadsl

	- ### Class [akka.actor.typed.javadsl.BehaviorBuilder.Case$](akka/actor/typed/javadsl/BehaviorBuilder.Case$.html "class in akka.actor.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.javadsl.ReceiveBuilder.Case$](akka/actor/typed/javadsl/ReceiveBuilder.Case$.html "class in akka.actor.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.actor.typed.javadsl.StashOverflowException](akka/actor/typed/javadsl/StashOverflowException.html "class in akka.actor.typed.javadsl") extends [StashOverflowException](akka/actor/typed/scaladsl/StashOverflowException.html "class in akka.actor.typed.scaladsl") implements Serializable
- ## Package akka.actor.typed.pubsub

	- ### Class akka.actor.typed.pubsub.PubSub$TopicJanitor$TopicStarted extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### name
			
			
			
			```
			java.lang.String name
			```
			- #### topic
			
			
			
			```
			[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")<?> topic
			```
	- ### Class akka.actor.typed.pubsub.PubSub$TopicJanitor$TopicStarted$ extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<?\>,​java.lang.String,​akka.actor.typed.pubsub.PubSub$TopicJanitor$TopicStarted\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.actor.typed.pubsub.PubSub$TopicJanitor$TopicStopped extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### name
			
			
			
			```
			java.lang.String name
			```
	- ### Class akka.actor.typed.pubsub.PubSub$TopicJanitor$TopicStopped$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.actor.typed.pubsub.PubSub$TopicJanitor$TopicStopped\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.actor.typed.scaladsl

	- ### Class [akka.actor.typed.scaladsl.StashOverflowException](akka/actor/typed/scaladsl/StashOverflowException.html "class in akka.actor.typed.scaladsl") extends java.lang.RuntimeException implements Serializable
- ## Package akka.cluster

	- ### Class akka.cluster.ClusterCoreDaemon.Ignored$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterCoreDaemon.Merge$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterCoreDaemon.Newer$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterCoreDaemon.Older$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterCoreDaemon.Same$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.ClusterShuttingDown$](akka/cluster/ClusterEvent.ClusterShuttingDown$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.CurrentClusterState](akka/cluster/ClusterEvent.CurrentClusterState.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.CurrentClusterState$](akka/cluster/ClusterEvent.CurrentClusterState$.html "class in akka.cluster") extends scala.runtime.AbstractFunction5\<scala.collection.immutable.SortedSet\<[Member](akka/cluster/Member.html "class in akka.cluster")\>,​scala.collection.immutable.Set\<[Member](akka/cluster/Member.html "class in akka.cluster")\>,​scala.collection.immutable.Set\<[Address](akka/actor/Address.html "class in akka.actor")\>,​scala.Option\<[Address](akka/actor/Address.html "class in akka.actor")\>,​scala.collection.immutable.Map\<java.lang.String,​scala.Option\<[Address](akka/actor/Address.html "class in akka.actor")\>\>,​[ClusterEvent.CurrentClusterState](akka/cluster/ClusterEvent.CurrentClusterState.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.CurrentInternalStats$](akka/cluster/ClusterEvent.CurrentInternalStats$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<akka.cluster.GossipStats,​akka.cluster.VectorClockStats,​akka.cluster.ClusterEvent.CurrentInternalStats\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.InitialStateAsEvents$](akka/cluster/ClusterEvent.InitialStateAsEvents$.html "class in akka.cluster") extends [ClusterEvent.SubscriptionInitialStateMode](akka/cluster/ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.ClusterEvent.InitialStateAsSnapshot$](akka/cluster/ClusterEvent.InitialStateAsSnapshot$.html "class in akka.cluster") extends [ClusterEvent.SubscriptionInitialStateMode](akka/cluster/ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.ClusterEvent.LeaderChanged](akka/cluster/ClusterEvent.LeaderChanged.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.LeaderChanged$](akka/cluster/ClusterEvent.LeaderChanged$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<scala.Option\<[Address](akka/actor/Address.html "class in akka.actor")\>,​[ClusterEvent.LeaderChanged](akka/cluster/ClusterEvent.LeaderChanged.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberDowned](akka/cluster/ClusterEvent.MemberDowned.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberDowned$](akka/cluster/ClusterEvent.MemberDowned$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberDowned](akka/cluster/ClusterEvent.MemberDowned.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberExited](akka/cluster/ClusterEvent.MemberExited.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberExited$](akka/cluster/ClusterEvent.MemberExited$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberExited](akka/cluster/ClusterEvent.MemberExited.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberJoined](akka/cluster/ClusterEvent.MemberJoined.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberJoined$](akka/cluster/ClusterEvent.MemberJoined$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberJoined](akka/cluster/ClusterEvent.MemberJoined.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberLeft](akka/cluster/ClusterEvent.MemberLeft.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberLeft$](akka/cluster/ClusterEvent.MemberLeft$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberLeft](akka/cluster/ClusterEvent.MemberLeft.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberPreparingForShutdown](akka/cluster/ClusterEvent.MemberPreparingForShutdown.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberPreparingForShutdown$](akka/cluster/ClusterEvent.MemberPreparingForShutdown$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberPreparingForShutdown](akka/cluster/ClusterEvent.MemberPreparingForShutdown.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberReadyForShutdown](akka/cluster/ClusterEvent.MemberReadyForShutdown.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberReadyForShutdown$](akka/cluster/ClusterEvent.MemberReadyForShutdown$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberReadyForShutdown](akka/cluster/ClusterEvent.MemberReadyForShutdown.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberRemoved](akka/cluster/ClusterEvent.MemberRemoved.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberRemoved$](akka/cluster/ClusterEvent.MemberRemoved$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster"),​[ClusterEvent.MemberRemoved](akka/cluster/ClusterEvent.MemberRemoved.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberTombstonesChanged$](akka/cluster/ClusterEvent.MemberTombstonesChanged$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.ClusterEvent.MemberTombstonesChanged\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberUp](akka/cluster/ClusterEvent.MemberUp.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberUp$](akka/cluster/ClusterEvent.MemberUp$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberUp](akka/cluster/ClusterEvent.MemberUp.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberWeaklyUp](akka/cluster/ClusterEvent.MemberWeaklyUp.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.MemberWeaklyUp$](akka/cluster/ClusterEvent.MemberWeaklyUp$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.MemberWeaklyUp](akka/cluster/ClusterEvent.MemberWeaklyUp.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.ReachabilityChanged$](akka/cluster/ClusterEvent.ReachabilityChanged$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<akka.cluster.Reachability,​akka.cluster.ClusterEvent.ReachabilityChanged\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.ReachableDataCenter](akka/cluster/ClusterEvent.ReachableDataCenter.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.ReachableDataCenter$](akka/cluster/ClusterEvent.ReachableDataCenter$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ClusterEvent.ReachableDataCenter](akka/cluster/ClusterEvent.ReachableDataCenter.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.ReachableMember](akka/cluster/ClusterEvent.ReachableMember.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.ReachableMember$](akka/cluster/ClusterEvent.ReachableMember$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.ReachableMember](akka/cluster/ClusterEvent.ReachableMember.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.RoleLeaderChanged](akka/cluster/ClusterEvent.RoleLeaderChanged.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.RoleLeaderChanged$](akka/cluster/ClusterEvent.RoleLeaderChanged$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<[Address](akka/actor/Address.html "class in akka.actor")\>,​[ClusterEvent.RoleLeaderChanged](akka/cluster/ClusterEvent.RoleLeaderChanged.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.SeenChanged$](akka/cluster/ClusterEvent.SeenChanged$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.collection.immutable.Set\<[Address](akka/actor/Address.html "class in akka.actor")\>,​akka.cluster.ClusterEvent.SeenChanged\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.UnreachableDataCenter](akka/cluster/ClusterEvent.UnreachableDataCenter.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.UnreachableDataCenter$](akka/cluster/ClusterEvent.UnreachableDataCenter$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ClusterEvent.UnreachableDataCenter](akka/cluster/ClusterEvent.UnreachableDataCenter.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterEvent.UnreachableMember](akka/cluster/ClusterEvent.UnreachableMember.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterEvent.UnreachableMember$](akka/cluster/ClusterEvent.UnreachableMember$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​[ClusterEvent.UnreachableMember](akka/cluster/ClusterEvent.UnreachableMember.html "class in akka.cluster")\> implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.ExpectedFirstHeartbeat extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.ExpectedFirstHeartbeat$ extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​akka.cluster.ClusterHeartbeatSender.ExpectedFirstHeartbeat\> implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.Heartbeat extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.Heartbeat$ extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.cluster.ClusterHeartbeatSender.Heartbeat\> implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.HeartbeatRsp extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.HeartbeatRsp$ extends scala.runtime.AbstractFunction3\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​java.lang.Object,​java.lang.Object,​akka.cluster.ClusterHeartbeatSender.HeartbeatRsp\> implements Serializable
	- ### Class akka.cluster.ClusterHeartbeatSender.HeartbeatTick$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterHeartbeatSenderState$](akka/cluster/ClusterHeartbeatSenderState$.html "class in akka.cluster") extends scala.runtime.AbstractFunction3\<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​[FailureDetectorRegistry](akka/remote/FailureDetectorRegistry.html "interface in akka.remote")\<[Address](akka/actor/Address.html "class in akka.actor")\>,​akka.cluster.ClusterHeartbeatSenderState\> implements Serializable
	- ### Class akka.cluster.ClusterReadView.State extends java.lang.Object implements Serializable
	- ### Class akka.cluster.ClusterReadView.State$ extends scala.runtime.AbstractFunction4\<[ClusterEvent.CurrentClusterState](akka/cluster/ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​akka.cluster.Reachability,​[Member](akka/cluster/Member.html "class in akka.cluster"),​akka.cluster.ClusterEvent.CurrentInternalStats,​akka.cluster.ClusterReadView.State\> implements Serializable
	- ### Class [akka.cluster.ClusterScope$](akka/cluster/ClusterScope$.html "class in akka.cluster") extends [ClusterScope](akka/cluster/ClusterScope.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.Down](akka/cluster/ClusterUserAction.Down.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.Down$](akka/cluster/ClusterUserAction.Down$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[ClusterUserAction.Down](akka/cluster/ClusterUserAction.Down.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.JoinTo](akka/cluster/ClusterUserAction.JoinTo.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.JoinTo$](akka/cluster/ClusterUserAction.JoinTo$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[ClusterUserAction.JoinTo](akka/cluster/ClusterUserAction.JoinTo.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.Leave](akka/cluster/ClusterUserAction.Leave.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.Leave$](akka/cluster/ClusterUserAction.Leave$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[ClusterUserAction.Leave](akka/cluster/ClusterUserAction.Leave.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.PrepareForShutdown$](akka/cluster/ClusterUserAction.PrepareForShutdown$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.SetAppVersion](akka/cluster/ClusterUserAction.SetAppVersion.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.SetAppVersion$](akka/cluster/ClusterUserAction.SetAppVersion$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Version](akka/util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](akka/cluster/ClusterUserAction.SetAppVersion.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.ClusterUserAction.SetAppVersionLater$](akka/cluster/ClusterUserAction.SetAppVersionLater$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class akka.cluster.CoordinatedShutdownLeave.LeaveReq$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.CrossDcHeartbeatingState$](akka/cluster/CrossDcHeartbeatingState$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class akka.cluster.CrossDcHeartbeatSender.MonitoringActive extends java.lang.Object implements Serializable
	- ### Class akka.cluster.CrossDcHeartbeatSender.MonitoringActive$ extends scala.runtime.AbstractFunction1\<akka.cluster.CrossDcHeartbeatingState,​akka.cluster.CrossDcHeartbeatSender.MonitoringActive\> implements Serializable
	- ### Class akka.cluster.CrossDcHeartbeatSender.MonitoringDormant extends java.lang.Object implements Serializable
	- ### Class akka.cluster.CrossDcHeartbeatSender.MonitoringDormant$ extends scala.runtime.AbstractFunction0\<akka.cluster.CrossDcHeartbeatSender.MonitoringDormant\> implements Serializable
	- ### Class akka.cluster.CrossDcHeartbeatSender.ReportStatus extends java.lang.Object implements Serializable
	- ### Class akka.cluster.CrossDcHeartbeatSender.ReportStatus$ extends scala.runtime.AbstractFunction0\<akka.cluster.CrossDcHeartbeatSender.ReportStatus\> implements Serializable
	- ### Class [akka.cluster.Gossip$](akka/cluster/Gossip$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.GossipEnvelope$](akka/cluster/GossipEnvelope$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.GossipOverview$](akka/cluster/GossipOverview$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.Reachability,​akka.cluster.GossipOverview\> implements Serializable
	- ### Class [akka.cluster.GossipStats$](akka/cluster/GossipStats$.html "class in akka.cluster") extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.GossipStats\> implements Serializable
	- ### Class [akka.cluster.GossipStatus$](akka/cluster/GossipStatus$.html "class in akka.cluster") extends scala.runtime.AbstractFunction3\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[VectorClock](akka/cluster/VectorClock.html "class in akka.cluster"),​byte\[],​akka.cluster.GossipStatus\> implements Serializable
	- ### Class [akka.cluster.HeartbeatNodeRing$](akka/cluster/HeartbeatNodeRing$.html "class in akka.cluster") extends scala.runtime.AbstractFunction4\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​java.lang.Object,​akka.cluster.HeartbeatNodeRing\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.AddOnMemberRemovedListener](akka/cluster/InternalClusterAction.AddOnMemberRemovedListener.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.AddOnMemberRemovedListener$](akka/cluster/InternalClusterAction.AddOnMemberRemovedListener$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<java.lang.Runnable,​[InternalClusterAction.AddOnMemberRemovedListener](akka/cluster/InternalClusterAction.AddOnMemberRemovedListener.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.AddOnMemberUpListener](akka/cluster/InternalClusterAction.AddOnMemberUpListener.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.AddOnMemberUpListener$](akka/cluster/InternalClusterAction.AddOnMemberUpListener$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<java.lang.Runnable,​[InternalClusterAction.AddOnMemberUpListener](akka/cluster/InternalClusterAction.AddOnMemberUpListener.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.CompatibleConfig](akka/cluster/InternalClusterAction.CompatibleConfig.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.CompatibleConfig$](akka/cluster/InternalClusterAction.CompatibleConfig$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<com.typesafe.config.Config,​[InternalClusterAction.CompatibleConfig](akka/cluster/InternalClusterAction.CompatibleConfig.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$](akka/cluster/InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.ExitingCompleted$](akka/cluster/InternalClusterAction.ExitingCompleted$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.ExitingConfirmed](akka/cluster/InternalClusterAction.ExitingConfirmed.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.ExitingConfirmed$](akka/cluster/InternalClusterAction.ExitingConfirmed$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[InternalClusterAction.ExitingConfirmed](akka/cluster/InternalClusterAction.ExitingConfirmed.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.GetClusterCoreRef$](akka/cluster/InternalClusterAction.GetClusterCoreRef$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.GossipSpeedupTick$](akka/cluster/InternalClusterAction.GossipSpeedupTick$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.GossipTick$](akka/cluster/InternalClusterAction.GossipTick$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.IncompatibleConfig$](akka/cluster/InternalClusterAction.IncompatibleConfig$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.InitJoin](akka/cluster/InternalClusterAction.InitJoin.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.InitJoin$](akka/cluster/InternalClusterAction.InitJoin$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<com.typesafe.config.Config,​[InternalClusterAction.InitJoin](akka/cluster/InternalClusterAction.InitJoin.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.InitJoinAck](akka/cluster/InternalClusterAction.InitJoinAck.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.InitJoinAck$](akka/cluster/InternalClusterAction.InitJoinAck$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<[Address](akka/actor/Address.html "class in akka.actor"),​[InternalClusterAction.ConfigCheck](akka/cluster/InternalClusterAction.ConfigCheck.html "interface in akka.cluster"),​[InternalClusterAction.InitJoinAck](akka/cluster/InternalClusterAction.InitJoinAck.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.InitJoinNack](akka/cluster/InternalClusterAction.InitJoinNack.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.InitJoinNack$](akka/cluster/InternalClusterAction.InitJoinNack$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[InternalClusterAction.InitJoinNack](akka/cluster/InternalClusterAction.InitJoinNack.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Join](akka/cluster/InternalClusterAction.Join.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Join$](akka/cluster/InternalClusterAction.Join$.html "class in akka.cluster") extends scala.runtime.AbstractFunction3\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set\<java.lang.String\>,​[Version](akka/util/Version.html "class in akka.util"),​[InternalClusterAction.Join](akka/cluster/InternalClusterAction.Join.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.JoinSeedNode$](akka/cluster/InternalClusterAction.JoinSeedNode$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.JoinSeedNodes](akka/cluster/InternalClusterAction.JoinSeedNodes.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.JoinSeedNodes$](akka/cluster/InternalClusterAction.JoinSeedNodes$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.IndexedSeq\<[Address](akka/actor/Address.html "class in akka.actor")\>,​[InternalClusterAction.JoinSeedNodes](akka/cluster/InternalClusterAction.JoinSeedNodes.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.LeaderActionsTick$](akka/cluster/InternalClusterAction.LeaderActionsTick$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.PublishChanges](akka/cluster/InternalClusterAction.PublishChanges.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.PublishChanges$](akka/cluster/InternalClusterAction.PublishChanges$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<akka.cluster.MembershipState,​[InternalClusterAction.PublishChanges](akka/cluster/InternalClusterAction.PublishChanges.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.PublishEvent](akka/cluster/InternalClusterAction.PublishEvent.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.PublishEvent$](akka/cluster/InternalClusterAction.PublishEvent$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[ClusterEvent.ClusterDomainEvent](akka/cluster/ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster"),​[InternalClusterAction.PublishEvent](akka/cluster/InternalClusterAction.PublishEvent.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.PublishStatsTick$](akka/cluster/InternalClusterAction.PublishStatsTick$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.ReapUnreachableTick$](akka/cluster/InternalClusterAction.ReapUnreachableTick$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.SendCurrentClusterState](akka/cluster/InternalClusterAction.SendCurrentClusterState.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.SendCurrentClusterState$](akka/cluster/InternalClusterAction.SendCurrentClusterState$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[InternalClusterAction.SendCurrentClusterState](akka/cluster/InternalClusterAction.SendCurrentClusterState.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.SendGossipTo](akka/cluster/InternalClusterAction.SendGossipTo.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.SendGossipTo$](akka/cluster/InternalClusterAction.SendGossipTo$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[InternalClusterAction.SendGossipTo](akka/cluster/InternalClusterAction.SendGossipTo.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Subscribe](akka/cluster/InternalClusterAction.Subscribe.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Subscribe$](akka/cluster/InternalClusterAction.Subscribe$.html "class in akka.cluster") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ClusterEvent.SubscriptionInitialStateMode](akka/cluster/ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster"),​scala.collection.immutable.Set\<java.lang.Class\<?\>\>,​[InternalClusterAction.Subscribe](akka/cluster/InternalClusterAction.Subscribe.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.UncheckedConfig$](akka/cluster/InternalClusterAction.UncheckedConfig$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Unsubscribe](akka/cluster/InternalClusterAction.Unsubscribe.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Unsubscribe$](akka/cluster/InternalClusterAction.Unsubscribe$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.Option\<java.lang.Class\<?\>\>,​[InternalClusterAction.Unsubscribe](akka/cluster/InternalClusterAction.Unsubscribe.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Welcome](akka/cluster/InternalClusterAction.Welcome.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.InternalClusterAction.Welcome$](akka/cluster/InternalClusterAction.Welcome$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​akka.cluster.Gossip,​[InternalClusterAction.Welcome](akka/cluster/InternalClusterAction.Welcome.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.Invalid](akka/cluster/Invalid.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.Invalid$](akka/cluster/Invalid$.html "class in akka.cluster") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<java.lang.String\>,​[Invalid](akka/cluster/Invalid.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.Member](akka/cluster/Member.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.Member$](akka/cluster/Member$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.MembershipState$](akka/cluster/MembershipState$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.MemberStatus.Down$](akka/cluster/MemberStatus.Down$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.Exiting$](akka/cluster/MemberStatus.Exiting$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.Joining$](akka/cluster/MemberStatus.Joining$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.Leaving$](akka/cluster/MemberStatus.Leaving$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.PreparingForShutdown$](akka/cluster/MemberStatus.PreparingForShutdown$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.ReadyForShutdown$](akka/cluster/MemberStatus.ReadyForShutdown$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.Removed$](akka/cluster/MemberStatus.Removed$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.Up$](akka/cluster/MemberStatus.Up$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class [akka.cluster.MemberStatus.WeaklyUp$](akka/cluster/MemberStatus.WeaklyUp$.html "class in akka.cluster") extends [MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster") implements Serializable
	- ### Class akka.cluster.Reachability.Reachable$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.Reachability.Record extends java.lang.Object implements Serializable
	- ### Class akka.cluster.Reachability.Record$ extends scala.runtime.AbstractFunction4\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​akka.cluster.Reachability.ReachabilityStatus,​java.lang.Object,​akka.cluster.Reachability.Record\> implements Serializable
	- ### Class akka.cluster.Reachability.Terminated$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.Reachability.Unreachable$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.Reachability$](akka/cluster/Reachability$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.UniqueAddress$](akka/cluster/UniqueAddress$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\> implements Serializable
	- ### Class [akka.cluster.Valid$](akka/cluster/Valid$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClock](akka/cluster/VectorClock.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClock.After$](akka/cluster/VectorClock.After$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClock.Before$](akka/cluster/VectorClock.Before$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClock.Concurrent$](akka/cluster/VectorClock.Concurrent$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClock.Same$](akka/cluster/VectorClock.Same$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClock$](akka/cluster/VectorClock$.html "class in akka.cluster") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.VectorClockStats$](akka/cluster/VectorClockStats$.html "class in akka.cluster") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​akka.cluster.VectorClockStats\> implements Serializable
- ## Package akka.cluster.ddata

	- ### Class [akka.cluster.ddata.DurableStore.DurableDataEnvelope](akka/cluster/ddata/DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.Expire](akka/cluster/ddata/DurableStore.Expire.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.Expire$](akka/cluster/ddata/DurableStore.Expire$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​[DurableStore.Expire](akka/cluster/ddata/DurableStore.Expire.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.LoadAll$](akka/cluster/ddata/DurableStore.LoadAll$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.LoadAllCompleted$](akka/cluster/ddata/DurableStore.LoadAllCompleted$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.LoadData](akka/cluster/ddata/DurableStore.LoadData.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.LoadData$](akka/cluster/ddata/DurableStore.LoadData$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<java.lang.String,​[DurableStore.DurableDataEnvelope](akka/cluster/ddata/DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata")\>,​[DurableStore.LoadData](akka/cluster/ddata/DurableStore.LoadData.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.LoadFailed](akka/cluster/ddata/DurableStore.LoadFailed.html "class in akka.cluster.ddata") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.Store](akka/cluster/ddata/DurableStore.Store.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.Store$](akka/cluster/ddata/DurableStore.Store$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<java.lang.String,​[DurableStore.DurableDataEnvelope](akka/cluster/ddata/DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata"),​scala.Option\<[DurableStore.StoreReply](akka/cluster/ddata/DurableStore.StoreReply.html "class in akka.cluster.ddata")\>,​[DurableStore.Store](akka/cluster/ddata/DurableStore.Store.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.StoreReply](akka/cluster/ddata/DurableStore.StoreReply.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.DurableStore.StoreReply$](akka/cluster/ddata/DurableStore.StoreReply$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[DurableStore.StoreReply](akka/cluster/ddata/DurableStore.StoreReply.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Flag](akka/cluster/ddata/Flag.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Flag$](akka/cluster/ddata/Flag$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.FlagKey](akka/cluster/ddata/FlagKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[Flag](akka/cluster/ddata/Flag.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.FlagKey$](akka/cluster/ddata/FlagKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.GCounter](akka/cluster/ddata/GCounter.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.GCounter$](akka/cluster/ddata/GCounter$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.GCounterKey](akka/cluster/ddata/GCounterKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[GCounter](akka/cluster/ddata/GCounter.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.GCounterKey$](akka/cluster/ddata/GCounterKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.GSet](akka/cluster/ddata/GSet.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.GSet$](akka/cluster/ddata/GSet$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.GSetKey](akka/cluster/ddata/GSetKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[GSet](akka/cluster/ddata/GSet.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/GSetKey.html "type parameter in GSetKey")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.GSetKey$](akka/cluster/ddata/GSetKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Key.UnspecificKey](akka/cluster/ddata/Key.UnspecificKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Key.UnspecificKey$](akka/cluster/ddata/Key.UnspecificKey$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Key.UnspecificKey](akka/cluster/ddata/Key.UnspecificKey.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Key$](akka/cluster/ddata/Key$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWMap](akka/cluster/ddata/LWWMap.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWMap.LWWMapTag$](akka/cluster/ddata/LWWMap.LWWMapTag$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWMap$](akka/cluster/ddata/LWWMap$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWMapKey](akka/cluster/ddata/LWWMapKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[LWWMap](akka/cluster/ddata/LWWMap.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/LWWMapKey.html "type parameter in LWWMapKey"),​[B](akka/cluster/ddata/LWWMapKey.html "type parameter in LWWMapKey")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.LWWMapKey$](akka/cluster/ddata/LWWMapKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWRegister](akka/cluster/ddata/LWWRegister.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWRegister$](akka/cluster/ddata/LWWRegister$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.LWWRegisterKey](akka/cluster/ddata/LWWRegisterKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[LWWRegister](akka/cluster/ddata/LWWRegister.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/LWWRegisterKey.html "type parameter in LWWRegisterKey")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.LWWRegisterKey$](akka/cluster/ddata/LWWRegisterKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ManyVersionVector](akka/cluster/ddata/ManyVersionVector.html "class in akka.cluster.ddata") extends [VersionVector](akka/cluster/ddata/VersionVector.html "class in akka.cluster.ddata") implements Serializable
	- ### Class [akka.cluster.ddata.ManyVersionVector$](akka/cluster/ddata/ManyVersionVector$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.TreeMap\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​java.lang.Object\>,​[ManyVersionVector](akka/cluster/ddata/ManyVersionVector.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.OneVersionVector](akka/cluster/ddata/OneVersionVector.html "class in akka.cluster.ddata") extends [VersionVector](akka/cluster/ddata/VersionVector.html "class in akka.cluster.ddata") implements Serializable
	- ### Class [akka.cluster.ddata.OneVersionVector$](akka/cluster/ddata/OneVersionVector$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​java.lang.Object,​[OneVersionVector](akka/cluster/ddata/OneVersionVector.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.ORMap](akka/cluster/ddata/ORMap.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap.DeltaGroup$](akka/cluster/ddata/ORMap.DeltaGroup$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap.PutDeltaOp$](akka/cluster/ddata/ORMap.PutDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap.RemoveDeltaOp$](akka/cluster/ddata/ORMap.RemoveDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap.RemoveKeyDeltaOp$](akka/cluster/ddata/ORMap.RemoveKeyDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap.UpdateDeltaOp$](akka/cluster/ddata/ORMap.UpdateDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap.VanillaORMapTag$](akka/cluster/ddata/ORMap.VanillaORMapTag$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMap$](akka/cluster/ddata/ORMap$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMapKey](akka/cluster/ddata/ORMapKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[ORMap](akka/cluster/ddata/ORMap.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/ORMapKey.html "type parameter in ORMapKey"),​[B](akka/cluster/ddata/ORMapKey.html "type parameter in ORMapKey") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.ORMapKey$](akka/cluster/ddata/ORMapKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMultiMap](akka/cluster/ddata/ORMultiMap.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMultiMap.ORMultiMapTag$](akka/cluster/ddata/ORMultiMap.ORMultiMapTag$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMultiMap.ORMultiMapWithValueDeltasTag$](akka/cluster/ddata/ORMultiMap.ORMultiMapWithValueDeltasTag$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMultiMap$](akka/cluster/ddata/ORMultiMap$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORMultiMapKey](akka/cluster/ddata/ORMultiMapKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[ORMultiMap](akka/cluster/ddata/ORMultiMap.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/ORMultiMapKey.html "type parameter in ORMultiMapKey"),​[B](akka/cluster/ddata/ORMultiMapKey.html "type parameter in ORMultiMapKey")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.ORMultiMapKey$](akka/cluster/ddata/ORMultiMapKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSet](akka/cluster/ddata/ORSet.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSet.AddDeltaOp$](akka/cluster/ddata/ORSet.AddDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSet.DeltaGroup$](akka/cluster/ddata/ORSet.DeltaGroup$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSet.FullStateDeltaOp$](akka/cluster/ddata/ORSet.FullStateDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSet.RemoveDeltaOp$](akka/cluster/ddata/ORSet.RemoveDeltaOp$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSet$](akka/cluster/ddata/ORSet$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.ORSetKey](akka/cluster/ddata/ORSetKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[ORSet](akka/cluster/ddata/ORSet.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/ORSetKey.html "type parameter in ORSetKey")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.ORSetKey$](akka/cluster/ddata/ORSetKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounter](akka/cluster/ddata/PNCounter.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounter$](akka/cluster/ddata/PNCounter$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterKey](akka/cluster/ddata/PNCounterKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[PNCounter](akka/cluster/ddata/PNCounter.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterKey$](akka/cluster/ddata/PNCounterKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterMap](akka/cluster/ddata/PNCounterMap.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterMap.PNCounterMapTag$](akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterMap$](akka/cluster/ddata/PNCounterMap$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterMapKey](akka/cluster/ddata/PNCounterMapKey.html "class in akka.cluster.ddata") extends [Key](akka/cluster/ddata/Key.html "class in akka.cluster.ddata")\<[PNCounterMap](akka/cluster/ddata/PNCounterMap.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/PNCounterMapKey.html "type parameter in PNCounterMapKey")\>\> implements Serializable
	- ### Class [akka.cluster.ddata.PNCounterMapKey$](akka/cluster/ddata/PNCounterMapKey$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PruningState.PruningInitialized](akka/cluster/ddata/PruningState.PruningInitialized.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PruningState.PruningInitialized$](akka/cluster/ddata/PruningState.PruningInitialized$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​scala.collection.immutable.Set\<[Address](akka/actor/Address.html "class in akka.actor")\>,​[PruningState.PruningInitialized](akka/cluster/ddata/PruningState.PruningInitialized.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.PruningState.PruningPerformed](akka/cluster/ddata/PruningState.PruningPerformed.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.PruningState.PruningPerformed$](akka/cluster/ddata/PruningState.PruningPerformed$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[PruningState.PruningPerformed](akka/cluster/ddata/PruningState.PruningPerformed.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class akka.cluster.ddata.ReadWriteAggregator.SendToSecondary$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Changed](akka/cluster/ddata/Replicator.Changed.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Changed$](akka/cluster/ddata/Replicator.Changed$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.DataDeleted](akka/cluster/ddata/Replicator.DataDeleted.html "class in akka.cluster.ddata") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.DataDeleted$](akka/cluster/ddata/Replicator.DataDeleted$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Delete](akka/cluster/ddata/Replicator.Delete.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Delete$](akka/cluster/ddata/Replicator.Delete$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Deleted](akka/cluster/ddata/Replicator.Deleted.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Deleted$](akka/cluster/ddata/Replicator.Deleted$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.DeleteSuccess](akka/cluster/ddata/Replicator.DeleteSuccess.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.DeleteSuccess$](akka/cluster/ddata/Replicator.DeleteSuccess$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Expired](akka/cluster/ddata/Replicator.Expired.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Expired$](akka/cluster/ddata/Replicator.Expired$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.FlushChanges$](akka/cluster/ddata/Replicator.FlushChanges$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Get](akka/cluster/ddata/Replicator.Get.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Get$](akka/cluster/ddata/Replicator.Get$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetDataDeleted](akka/cluster/ddata/Replicator.GetDataDeleted.html "class in akka.cluster.ddata") extends [Replicator.GetResponse](akka/cluster/ddata/Replicator.GetResponse.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.GetDataDeleted.html "type parameter in Replicator.GetDataDeleted") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetDataDeleted$](akka/cluster/ddata/Replicator.GetDataDeleted$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetFailure](akka/cluster/ddata/Replicator.GetFailure.html "class in akka.cluster.ddata") extends [Replicator.GetResponse](akka/cluster/ddata/Replicator.GetResponse.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.GetFailure.html "type parameter in Replicator.GetFailure") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetFailure$](akka/cluster/ddata/Replicator.GetFailure$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetKeyIds$](akka/cluster/ddata/Replicator.GetKeyIds$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetKeyIdsResult$](akka/cluster/ddata/Replicator.GetKeyIdsResult$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.ddata.Replicator.GetKeyIdsResult\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetReplicaCount$](akka/cluster/ddata/Replicator.GetReplicaCount$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetSuccess](akka/cluster/ddata/Replicator.GetSuccess.html "class in akka.cluster.ddata") extends [Replicator.GetResponse](akka/cluster/ddata/Replicator.GetResponse.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.GetSuccess.html "type parameter in Replicator.GetSuccess") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.GetSuccess$](akka/cluster/ddata/Replicator.GetSuccess$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.ClockTick$](akka/cluster/ddata/Replicator.Internal$.ClockTick$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DataEnvelope](akka/cluster/ddata/Replicator.Internal$.DataEnvelope.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DataEnvelope$](akka/cluster/ddata/Replicator.Internal$.DataEnvelope$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<[ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata"),​scala.collection.immutable.Map\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[PruningState](akka/cluster/ddata/PruningState.html "interface in akka.cluster.ddata")\>,​[VersionVector](akka/cluster/ddata/VersionVector.html "class in akka.cluster.ddata"),​akka.cluster.ddata.Replicator.Internal.DataEnvelope\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DeletedData$](akka/cluster/ddata/Replicator.Internal$.DeletedData$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Delta](akka/cluster/ddata/Replicator.Internal$.Delta.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Delta$](akka/cluster/ddata/Replicator.Internal$.Delta$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<akka.cluster.ddata.Replicator.Internal.DataEnvelope,​java.lang.Object,​java.lang.Object,​akka.cluster.ddata.Replicator.Internal.Delta\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DeltaNack$](akka/cluster/ddata/Replicator.Internal$.DeltaNack$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DeltaPropagation](akka/cluster/ddata/Replicator.Internal$.DeltaPropagation.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DeltaPropagation$](akka/cluster/ddata/Replicator.Internal$.DeltaPropagation$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.DeltaPropagationTick$](akka/cluster/ddata/Replicator.Internal$.DeltaPropagationTick$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Gossip](akka/cluster/ddata/Replicator.Internal$.Gossip.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Gossip$](akka/cluster/ddata/Replicator.Internal$.Gossip$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction4\<scala.collection.immutable.Map\<java.lang.String,​scala.Tuple2\<akka.cluster.ddata.Replicator.Internal.DataEnvelope,​java.lang.Object\>\>,​java.lang.Object,​scala.Option\<java.lang.Object\>,​scala.Option\<java.lang.Object\>,​akka.cluster.ddata.Replicator.Internal.Gossip\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.GossipTick$](akka/cluster/ddata/Replicator.Internal$.GossipTick$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Read](akka/cluster/ddata/Replicator.Internal$.Read.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Read$](akka/cluster/ddata/Replicator.Internal$.Read$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.ddata.Replicator.Internal.Read\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.ReadRepair](akka/cluster/ddata/Replicator.Internal$.ReadRepair.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.ReadRepair$](akka/cluster/ddata/Replicator.Internal$.ReadRepair$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<java.lang.String,​akka.cluster.ddata.Replicator.Internal.DataEnvelope,​akka.cluster.ddata.Replicator.Internal.ReadRepair\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.ReadRepairAck$](akka/cluster/ddata/Replicator.Internal$.ReadRepairAck$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.ReadResult](akka/cluster/ddata/Replicator.Internal$.ReadResult.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.ReadResult$](akka/cluster/ddata/Replicator.Internal$.ReadResult$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.Option\<akka.cluster.ddata.Replicator.Internal.DataEnvelope\>,​akka.cluster.ddata.Replicator.Internal.ReadResult\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.RemovedNodePruningTick$](akka/cluster/ddata/Replicator.Internal$.RemovedNodePruningTick$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Status](akka/cluster/ddata/Replicator.Internal$.Status.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Status$](akka/cluster/ddata/Replicator.Internal$.Status$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction5\<scala.collection.immutable.Map\<java.lang.String,​scala.Tuple2\<[ByteString](akka/util/ByteString.html "class in akka.util"),​java.lang.Object\>\>,​java.lang.Object,​java.lang.Object,​scala.Option\<java.lang.Object\>,​scala.Option\<java.lang.Object\>,​akka.cluster.ddata.Replicator.Internal.Status\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.TestFullStateGossip](akka/cluster/ddata/Replicator.Internal$.TestFullStateGossip.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.TestFullStateGossip$](akka/cluster/ddata/Replicator.Internal$.TestFullStateGossip$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.ddata.Replicator.Internal.TestFullStateGossip\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Write](akka/cluster/ddata/Replicator.Internal$.Write.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.Write$](akka/cluster/ddata/Replicator.Internal$.Write$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<java.lang.String,​akka.cluster.ddata.Replicator.Internal.DataEnvelope,​scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.ddata.Replicator.Internal.Write\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.WriteAck$](akka/cluster/ddata/Replicator.Internal$.WriteAck$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Internal$.WriteNack$](akka/cluster/ddata/Replicator.Internal$.WriteNack$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ModifyFailure](akka/cluster/ddata/Replicator.ModifyFailure.html "class in akka.cluster.ddata") extends [Replicator.UpdateFailure](akka/cluster/ddata/Replicator.UpdateFailure.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.ModifyFailure.html "type parameter in Replicator.ModifyFailure") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ModifyFailure$](akka/cluster/ddata/Replicator.ModifyFailure$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.NotFound](akka/cluster/ddata/Replicator.NotFound.html "class in akka.cluster.ddata") extends [Replicator.GetResponse](akka/cluster/ddata/Replicator.GetResponse.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.NotFound.html "type parameter in Replicator.NotFound") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.NotFound$](akka/cluster/ddata/Replicator.NotFound$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadAll](akka/cluster/ddata/Replicator.ReadAll.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadAll$](akka/cluster/ddata/Replicator.ReadAll$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[Replicator.ReadAll](akka/cluster/ddata/Replicator.ReadAll.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadFrom](akka/cluster/ddata/Replicator.ReadFrom.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadFrom$](akka/cluster/ddata/Replicator.ReadFrom$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.concurrent.duration.FiniteDuration,​[Replicator.ReadFrom](akka/cluster/ddata/Replicator.ReadFrom.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadLocal$](akka/cluster/ddata/Replicator.ReadLocal$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadMajority](akka/cluster/ddata/Replicator.ReadMajority.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadMajority$](akka/cluster/ddata/Replicator.ReadMajority$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<scala.concurrent.duration.FiniteDuration,​java.lang.Object,​[Replicator.ReadMajority](akka/cluster/ddata/Replicator.ReadMajority.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadMajorityPlus](akka/cluster/ddata/Replicator.ReadMajorityPlus.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReadMajorityPlus$](akka/cluster/ddata/Replicator.ReadMajorityPlus$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<scala.concurrent.duration.FiniteDuration,​java.lang.Object,​java.lang.Object,​[Replicator.ReadMajorityPlus](akka/cluster/ddata/Replicator.ReadMajorityPlus.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReplicaCount](akka/cluster/ddata/Replicator.ReplicaCount.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReplicaCount$](akka/cluster/ddata/Replicator.ReplicaCount$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Replicator.ReplicaCount](akka/cluster/ddata/Replicator.ReplicaCount.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReplicationDeleteFailure](akka/cluster/ddata/Replicator.ReplicationDeleteFailure.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.ReplicationDeleteFailure$](akka/cluster/ddata/Replicator.ReplicationDeleteFailure$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.StoreFailure](akka/cluster/ddata/Replicator.StoreFailure.html "class in akka.cluster.ddata") extends [Replicator.UpdateFailure](akka/cluster/ddata/Replicator.UpdateFailure.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.StoreFailure.html "type parameter in Replicator.StoreFailure") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.StoreFailure$](akka/cluster/ddata/Replicator.StoreFailure$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Subscribe](akka/cluster/ddata/Replicator.Subscribe.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Subscribe$](akka/cluster/ddata/Replicator.Subscribe$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Unsubscribe](akka/cluster/ddata/Replicator.Unsubscribe.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Unsubscribe$](akka/cluster/ddata/Replicator.Unsubscribe$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Update](akka/cluster/ddata/Replicator.Update.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.Update$](akka/cluster/ddata/Replicator.Update$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.UpdateDataDeleted](akka/cluster/ddata/Replicator.UpdateDataDeleted.html "class in akka.cluster.ddata") extends [Replicator.UpdateResponse](akka/cluster/ddata/Replicator.UpdateResponse.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.UpdateDataDeleted.html "type parameter in Replicator.UpdateDataDeleted") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.UpdateDataDeleted$](akka/cluster/ddata/Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.UpdateSuccess](akka/cluster/ddata/Replicator.UpdateSuccess.html "class in akka.cluster.ddata") extends [Replicator.UpdateResponse](akka/cluster/ddata/Replicator.UpdateResponse.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.UpdateSuccess.html "type parameter in Replicator.UpdateSuccess") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.UpdateSuccess$](akka/cluster/ddata/Replicator.UpdateSuccess$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.UpdateTimeout](akka/cluster/ddata/Replicator.UpdateTimeout.html "class in akka.cluster.ddata") extends [Replicator.UpdateFailure](akka/cluster/ddata/Replicator.UpdateFailure.html "class in akka.cluster.ddata")\<[A](akka/cluster/ddata/Replicator.UpdateTimeout.html "type parameter in Replicator.UpdateTimeout") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.UpdateTimeout$](akka/cluster/ddata/Replicator.UpdateTimeout$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteAll](akka/cluster/ddata/Replicator.WriteAll.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteAll$](akka/cluster/ddata/Replicator.WriteAll$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[Replicator.WriteAll](akka/cluster/ddata/Replicator.WriteAll.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteLocal$](akka/cluster/ddata/Replicator.WriteLocal$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteMajority](akka/cluster/ddata/Replicator.WriteMajority.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteMajority$](akka/cluster/ddata/Replicator.WriteMajority$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<scala.concurrent.duration.FiniteDuration,​java.lang.Object,​[Replicator.WriteMajority](akka/cluster/ddata/Replicator.WriteMajority.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteMajorityPlus](akka/cluster/ddata/Replicator.WriteMajorityPlus.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteMajorityPlus$](akka/cluster/ddata/Replicator.WriteMajorityPlus$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction3\<scala.concurrent.duration.FiniteDuration,​java.lang.Object,​java.lang.Object,​[Replicator.WriteMajorityPlus](akka/cluster/ddata/Replicator.WriteMajorityPlus.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteTo](akka/cluster/ddata/Replicator.WriteTo.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.Replicator.WriteTo$](akka/cluster/ddata/Replicator.WriteTo$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.concurrent.duration.FiniteDuration,​[Replicator.WriteTo](akka/cluster/ddata/Replicator.WriteTo.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class akka.cluster.ddata.Replicator$Internal$ClockTick$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DataEnvelope extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### data
			
			
			
			```
			[ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata") data
			```
			- #### deltaVersions
			
			
			
			```
			[VersionVector](akka/cluster/ddata/VersionVector.html "class in akka.cluster.ddata") deltaVersions
			```
			- #### pruning
			
			
			
			```
			scala.collection.immutable.Map<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[PruningState](akka/cluster/ddata/PruningState.html "interface in akka.cluster.ddata")> pruning
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DataEnvelope$ extends scala.runtime.AbstractFunction3\<[ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata"),​scala.collection.immutable.Map\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[PruningState](akka/cluster/ddata/PruningState.html "interface in akka.cluster.ddata")\>,​[VersionVector](akka/cluster/ddata/VersionVector.html "class in akka.cluster.ddata"),​akka.cluster.ddata.Replicator$Internal$DataEnvelope\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DeletedData$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Delta extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### dataEnvelope
			
			
			
			```
			akka.cluster.ddata.Replicator$Internal$DataEnvelope dataEnvelope
			```
			- #### fromSeqNr
			
			
			
			```
			long fromSeqNr
			```
			- #### toSeqNr
			
			
			
			```
			long toSeqNr
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Delta$ extends scala.runtime.AbstractFunction3\<akka.cluster.ddata.Replicator$Internal$DataEnvelope,​java.lang.Object,​java.lang.Object,​akka.cluster.ddata.Replicator$Internal$Delta\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DeltaNack$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DeltaPropagation extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### \_fromNode
			
			
			
			```
			[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster") _fromNode
			```
			- #### deltas
			
			
			
			```
			scala.collection.immutable.Map<java.lang.String,​akka.cluster.ddata.Replicator$Internal$Delta> deltas
			```
			- #### reply
			
			
			
			```
			boolean reply
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DeltaPropagation$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$DeltaPropagationTick$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Gossip extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### fromSystemUid
			
			
			
			```
			scala.Option<java.lang.Object> fromSystemUid
			```
			- #### sendBack
			
			
			
			```
			boolean sendBack
			```
			- #### toSystemUid
			
			
			
			```
			scala.Option<java.lang.Object> toSystemUid
			```
			- #### updatedData
			
			
			
			```
			scala.collection.immutable.Map<java.lang.String,​scala.Tuple2<akka.cluster.ddata.Replicator$Internal$DataEnvelope,​java.lang.Object>> updatedData
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Gossip$ extends scala.runtime.AbstractFunction4\<scala.collection.immutable.Map\<java.lang.String,​scala.Tuple2\<akka.cluster.ddata.Replicator$Internal$DataEnvelope,​java.lang.Object\>\>,​java.lang.Object,​scala.Option\<java.lang.Object\>,​scala.Option\<java.lang.Object\>,​akka.cluster.ddata.Replicator$Internal$Gossip\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$GossipTick$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Read extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### fromNode
			
			
			
			```
			scala.Option<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> fromNode
			```
			- #### key
			
			
			
			```
			java.lang.String key
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Read$ extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.ddata.Replicator$Internal$Read\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$ReadRepair extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### envelope
			
			
			
			```
			akka.cluster.ddata.Replicator$Internal$DataEnvelope envelope
			```
			- #### key
			
			
			
			```
			java.lang.String key
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$ReadRepair$ extends scala.runtime.AbstractFunction2\<java.lang.String,​akka.cluster.ddata.Replicator$Internal$DataEnvelope,​akka.cluster.ddata.Replicator$Internal$ReadRepair\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$ReadRepairAck$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$ReadResult extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### envelope
			
			
			
			```
			scala.Option<akka.cluster.ddata.Replicator$Internal$DataEnvelope> envelope
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$ReadResult$ extends scala.runtime.AbstractFunction1\<scala.Option\<akka.cluster.ddata.Replicator$Internal$DataEnvelope\>,​akka.cluster.ddata.Replicator$Internal$ReadResult\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$RemovedNodePruningTick$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Status extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### chunk
			
			
			
			```
			int chunk
			```
			- #### digests
			
			
			
			```
			scala.collection.immutable.Map<java.lang.String,​scala.Tuple2<[ByteString](akka/util/ByteString.html "class in akka.util"),​java.lang.Object>> digests
			```
			- #### fromSystemUid
			
			
			
			```
			scala.Option<java.lang.Object> fromSystemUid
			```
			- #### toSystemUid
			
			
			
			```
			scala.Option<java.lang.Object> toSystemUid
			```
			- #### totChunks
			
			
			
			```
			int totChunks
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Status$ extends scala.runtime.AbstractFunction5\<scala.collection.immutable.Map\<java.lang.String,​scala.Tuple2\<[ByteString](akka/util/ByteString.html "class in akka.util"),​java.lang.Object\>\>,​java.lang.Object,​java.lang.Object,​scala.Option\<java.lang.Object\>,​scala.Option\<java.lang.Object\>,​akka.cluster.ddata.Replicator$Internal$Status\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$TestFullStateGossip extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### enabled
			
			
			
			```
			boolean enabled
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$TestFullStateGossip$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.ddata.Replicator$Internal$TestFullStateGossip\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Write extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### envelope
			
			
			
			```
			akka.cluster.ddata.Replicator$Internal$DataEnvelope envelope
			```
			- #### fromNode
			
			
			
			```
			scala.Option<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> fromNode
			```
			- #### key
			
			
			
			```
			java.lang.String key
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$Write$ extends scala.runtime.AbstractFunction3\<java.lang.String,​akka.cluster.ddata.Replicator$Internal$DataEnvelope,​scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.ddata.Replicator$Internal$Write\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$WriteAck$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.ddata.Replicator$Internal$WriteNack$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.cluster.ddata.SelfUniqueAddress](akka/cluster/ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.SelfUniqueAddress$](akka/cluster/ddata/SelfUniqueAddress$.html "class in akka.cluster.ddata") extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster"),​[SelfUniqueAddress](akka/cluster/ddata/SelfUniqueAddress.html "class in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.VersionVector](akka/cluster/ddata/VersionVector.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.VersionVector.After$](akka/cluster/ddata/VersionVector.After$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.VersionVector.Before$](akka/cluster/ddata/VersionVector.Before$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.VersionVector.Concurrent$](akka/cluster/ddata/VersionVector.Concurrent$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.VersionVector.Same$](akka/cluster/ddata/VersionVector.Same$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.VersionVector$](akka/cluster/ddata/VersionVector$.html "class in akka.cluster.ddata") extends java.lang.Object implements Serializable
- ## Package akka.cluster.ddata.protobuf.msg

	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.Flag](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### enabled\_
			
			
			
			```
			boolean enabled_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.GCounter.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### node\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") node_
			```
			- #### value\_
			
			
			
			```
			akka.protobufv3.internal.ByteString value_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### actorRefElements\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList actorRefElements_
			```
			- #### intElements\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList intElements_
			```
			- #### intElementsMemoizedSerializedSize
			
			
			
			```
			int intElementsMemoizedSerializedSize
			```
			- #### longElements\_
			
			
			
			```
			akka.protobufv3.internal.Internal.LongList longElements_
			```
			- #### longElementsMemoizedSerializedSize
			
			
			
			```
			int longElementsMemoizedSerializedSize
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherElements\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> otherElements_
			```
			- #### stringElements\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList stringElements_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWMap](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWMap.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.LWWMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### keys\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") keys_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### intKey\_
			
			
			
			```
			int intKey_
			```
			- #### longKey\_
			
			
			
			```
			long longKey_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherKey\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") otherKey_
			```
			- #### stringKey\_
			
			
			
			```
			java.lang.Object stringKey_
			```
			- #### value\_
			
			
			
			```
			[ReplicatedDataMessages.LWWRegister](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") value_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWRegister](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### node\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") node_
			```
			- #### state\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") state_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.ORMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### keys\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") keys_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### intKey\_
			
			
			
			```
			int intKey_
			```
			- #### longKey\_
			
			
			
			```
			long longKey_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherKey\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") otherKey_
			```
			- #### stringKey\_
			
			
			
			```
			java.lang.Object stringKey_
			```
			- #### value\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMapDeltaGroup](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.ORMapDeltaGroup.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMapDeltaGroup.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entryData\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg")> entryData_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### operation\_
			
			
			
			```
			int operation_
			```
			- #### underlying\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") underlying_
			```
			- #### zeroTag\_
			
			
			
			```
			int zeroTag_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### intKey\_
			
			
			
			```
			int intKey_
			```
			- #### longKey\_
			
			
			
			```
			long longKey_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherKey\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") otherKey_
			```
			- #### stringKey\_
			
			
			
			```
			java.lang.Object stringKey_
			```
			- #### value\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMultiMap](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMultiMap.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.ORMultiMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMultiMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### keys\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") keys_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### withValueDeltas\_
			
			
			
			```
			boolean withValueDeltas_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMultiMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMultiMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### intKey\_
			
			
			
			```
			int intKey_
			```
			- #### longKey\_
			
			
			
			```
			long longKey_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherKey\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") otherKey_
			```
			- #### stringKey\_
			
			
			
			```
			java.lang.Object stringKey_
			```
			- #### value\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### actorRefElements\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList actorRefElements_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### dots\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.VersionVector](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")> dots_
			```
			- #### intElements\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList intElements_
			```
			- #### intElementsMemoizedSerializedSize
			
			
			
			```
			int intElementsMemoizedSerializedSize
			```
			- #### longElements\_
			
			
			
			```
			akka.protobufv3.internal.Internal.LongList longElements_
			```
			- #### longElementsMemoizedSerializedSize
			
			
			
			```
			int longElementsMemoizedSerializedSize
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherElements\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> otherElements_
			```
			- #### stringElements\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList stringElements_
			```
			- #### vvector\_
			
			
			
			```
			[ReplicatorMessages.VersionVector](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") vvector_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### operation\_
			
			
			
			```
			int operation_
			```
			- #### underlying\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") underlying_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### decrements\_
			
			
			
			```
			[ReplicatedDataMessages.GCounter](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") decrements_
			```
			- #### increments\_
			
			
			
			```
			[ReplicatedDataMessages.GCounter](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") increments_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounterMap](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterMap.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedDataMessages.PNCounterMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### keys\_
			
			
			
			```
			[ReplicatedDataMessages.ORSet](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") keys_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounterMap.Entry](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### intKey\_
			
			
			
			```
			int intKey_
			```
			- #### longKey\_
			
			
			
			```
			long longKey_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### otherKey\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") otherKey_
			```
			- #### stringKey\_
			
			
			
			```
			java.lang.Object stringKey_
			```
			- #### value\_
			
			
			
			```
			[ReplicatedDataMessages.PNCounter](akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") value_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Changed](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Changed.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") data_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") data_
			```
			- #### deltaVersions\_
			
			
			
			```
			[ReplicatorMessages.VersionVector](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") deltaVersions_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### pruning\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.DataEnvelope.PruningEntry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> pruning_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### obsoleteTime\_
			
			
			
			```
			long obsoleteTime_
			```
			- #### ownerAddress\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") ownerAddress_
			```
			- #### performed\_
			
			
			
			```
			boolean performed_
			```
			- #### removedAddress\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") removedAddress_
			```
			- #### seen\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.Address](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")> seen_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.DeltaPropagation.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### fromNode\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") fromNode_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### reply\_
			
			
			
			```
			boolean reply_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### envelope\_
			
			
			
			```
			[ReplicatorMessages.DataEnvelope](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") envelope_
			```
			- #### fromSeqNr\_
			
			
			
			```
			long fromSeqNr_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### toSeqNr\_
			
			
			
			```
			long toSeqNr_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DurableDataEnvelope](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") data_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### pruning\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.DataEnvelope.PruningEntry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> pruning_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Empty](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Empty.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Get](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### consistency\_
			
			
			
			```
			int consistency_
			```
			- #### consistencyAdditional\_
			
			
			
			```
			int consistencyAdditional_
			```
			- #### consistencyMinCap\_
			
			
			
			```
			int consistencyMinCap_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### request\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") request_
			```
			- #### timeout\_
			
			
			
			```
			int timeout_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.GetFailure](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.GetFailure.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### request\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") request_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.GetSuccess](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.GetSuccess.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") data_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### request\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") request_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.Gossip.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### fromSystemUid\_
			
			
			
			```
			long fromSystemUid_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### sendBack\_
			
			
			
			```
			boolean sendBack_
			```
			- #### toSystemUid\_
			
			
			
			```
			long toSystemUid_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### envelope\_
			
			
			
			```
			[ReplicatorMessages.DataEnvelope](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") envelope_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### usedTimestamp\_
			
			
			
			```
			long usedTimestamp_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.NotFound](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.NotFound.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### request\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") request_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### enclosedMessage\_
			
			
			
			```
			akka.protobufv3.internal.ByteString enclosedMessage_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Read](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Read.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### fromNode\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") fromNode_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.ReadResult](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.ReadResult.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### envelope\_
			
			
			
			```
			[ReplicatorMessages.DataEnvelope](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") envelope_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### chunk\_
			
			
			
			```
			int chunk_
			```
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.Status.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### fromSystemUid\_
			
			
			
			```
			long fromSystemUid_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### toSystemUid\_
			
			
			
			```
			long toSystemUid_
			```
			- #### totChunks\_
			
			
			
			```
			int totChunks_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### digest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString digest_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### usedTimestamp\_
			
			
			
			```
			long usedTimestamp_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.StringGSet](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### elements\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList elements_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Subscribe](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Subscribe.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### ref\_
			
			
			
			```
			java.lang.Object ref_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[ReplicatorMessages.Address](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### uid\_
			
			
			
			```
			int uid_
			```
			- #### uid2\_
			
			
			
			```
			int uid2_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Unsubscribe](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			[ReplicatorMessages.OtherMessage](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### ref\_
			
			
			
			```
			java.lang.Object ref_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatorMessages.VersionVector.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg")> entries_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Entry](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### node\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") node_
			```
			- #### version\_
			
			
			
			```
			long version_
			```
	- ### Class [akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Write](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Write.html "class in akka.cluster.ddata.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### envelope\_
			
			
			
			```
			[ReplicatorMessages.DataEnvelope](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") envelope_
			```
			- #### fromNode\_
			
			
			
			```
			[ReplicatorMessages.UniqueAddress](akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") fromNode_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
- ## Package akka.cluster.ddata.typed.javadsl

	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Changed](akka/cluster/ddata/typed/javadsl/Replicator.Changed.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Changed$](akka/cluster/ddata/typed/javadsl/Replicator.Changed$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.DataDeleted](akka/cluster/ddata/typed/javadsl/Replicator.DataDeleted.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.DataDeleted$](akka/cluster/ddata/typed/javadsl/Replicator.DataDeleted$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Delete](akka/cluster/ddata/typed/javadsl/Replicator.Delete.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Delete$](akka/cluster/ddata/typed/javadsl/Replicator.Delete$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Deleted](akka/cluster/ddata/typed/javadsl/Replicator.Deleted.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Deleted$](akka/cluster/ddata/typed/javadsl/Replicator.Deleted$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.DeleteFailure](akka/cluster/ddata/typed/javadsl/Replicator.DeleteFailure.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.DeleteFailure$](akka/cluster/ddata/typed/javadsl/Replicator.DeleteFailure$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.DeleteSuccess](akka/cluster/ddata/typed/javadsl/Replicator.DeleteSuccess.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.DeleteSuccess$](akka/cluster/ddata/typed/javadsl/Replicator.DeleteSuccess$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Expired](akka/cluster/ddata/typed/javadsl/Replicator.Expired.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Expired$](akka/cluster/ddata/typed/javadsl/Replicator.Expired$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.FlushChanges$](akka/cluster/ddata/typed/javadsl/Replicator.FlushChanges$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Get](akka/cluster/ddata/typed/javadsl/Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Get$](akka/cluster/ddata/typed/javadsl/Replicator.Get$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetDataDeleted](akka/cluster/ddata/typed/javadsl/Replicator.GetDataDeleted.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.GetResponse](akka/cluster/ddata/typed/javadsl/Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.GetDataDeleted.html "type parameter in Replicator.GetDataDeleted") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetDataDeleted$](akka/cluster/ddata/typed/javadsl/Replicator.GetDataDeleted$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetFailure](akka/cluster/ddata/typed/javadsl/Replicator.GetFailure.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.GetResponse](akka/cluster/ddata/typed/javadsl/Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.GetFailure.html "type parameter in Replicator.GetFailure") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetFailure$](akka/cluster/ddata/typed/javadsl/Replicator.GetFailure$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetReplicaCount](akka/cluster/ddata/typed/javadsl/Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetReplicaCount$](akka/cluster/ddata/typed/javadsl/Replicator.GetReplicaCount$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[Replicator.ReplicaCount](akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")\>,​[Replicator.GetReplicaCount](akka/cluster/ddata/typed/javadsl/Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetSuccess](akka/cluster/ddata/typed/javadsl/Replicator.GetSuccess.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.GetResponse](akka/cluster/ddata/typed/javadsl/Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.GetSuccess.html "type parameter in Replicator.GetSuccess") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.GetSuccess$](akka/cluster/ddata/typed/javadsl/Replicator.GetSuccess$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure](akka/cluster/ddata/typed/javadsl/Replicator.ModifyFailure.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.UpdateFailure](akka/cluster/ddata/typed/javadsl/Replicator.UpdateFailure.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.ModifyFailure.html "type parameter in Replicator.ModifyFailure") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure$](akka/cluster/ddata/typed/javadsl/Replicator.ModifyFailure$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.NotFound](akka/cluster/ddata/typed/javadsl/Replicator.NotFound.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.GetResponse](akka/cluster/ddata/typed/javadsl/Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.NotFound.html "type parameter in Replicator.NotFound") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.NotFound$](akka/cluster/ddata/typed/javadsl/Replicator.NotFound$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadAll](akka/cluster/ddata/typed/javadsl/Replicator.ReadAll.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadAll$](akka/cluster/ddata/typed/javadsl/Replicator.ReadAll$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction1\<java.time.Duration,​[Replicator.ReadAll](akka/cluster/ddata/typed/javadsl/Replicator.ReadAll.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadFrom](akka/cluster/ddata/typed/javadsl/Replicator.ReadFrom.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadFrom$](akka/cluster/ddata/typed/javadsl/Replicator.ReadFrom$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.time.Duration,​[Replicator.ReadFrom](akka/cluster/ddata/typed/javadsl/Replicator.ReadFrom.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadLocal$](akka/cluster/ddata/typed/javadsl/Replicator.ReadLocal$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadMajority](akka/cluster/ddata/typed/javadsl/Replicator.ReadMajority.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReadMajority$](akka/cluster/ddata/typed/javadsl/Replicator.ReadMajority$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction2\<java.time.Duration,​java.lang.Object,​[Replicator.ReadMajority](akka/cluster/ddata/typed/javadsl/Replicator.ReadMajority.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReplicaCount](akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.ReplicaCount$](akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Replicator.ReplicaCount](akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.StoreFailure](akka/cluster/ddata/typed/javadsl/Replicator.StoreFailure.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.UpdateFailure](akka/cluster/ddata/typed/javadsl/Replicator.UpdateFailure.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.StoreFailure.html "type parameter in Replicator.StoreFailure") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.StoreFailure$](akka/cluster/ddata/typed/javadsl/Replicator.StoreFailure$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Subscribe](akka/cluster/ddata/typed/javadsl/Replicator.Subscribe.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Subscribe$](akka/cluster/ddata/typed/javadsl/Replicator.Subscribe$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Unsubscribe](akka/cluster/ddata/typed/javadsl/Replicator.Unsubscribe.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Unsubscribe$](akka/cluster/ddata/typed/javadsl/Replicator.Unsubscribe$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Update](akka/cluster/ddata/typed/javadsl/Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.Update$](akka/cluster/ddata/typed/javadsl/Replicator.Update$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.UpdateDataDeleted](akka/cluster/ddata/typed/javadsl/Replicator.UpdateDataDeleted.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.UpdateResponse](akka/cluster/ddata/typed/javadsl/Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.UpdateDataDeleted.html "type parameter in Replicator.UpdateDataDeleted") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.UpdateDataDeleted$](akka/cluster/ddata/typed/javadsl/Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.UpdateSuccess](akka/cluster/ddata/typed/javadsl/Replicator.UpdateSuccess.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.UpdateResponse](akka/cluster/ddata/typed/javadsl/Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.UpdateSuccess.html "type parameter in Replicator.UpdateSuccess") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.UpdateSuccess$](akka/cluster/ddata/typed/javadsl/Replicator.UpdateSuccess$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.UpdateTimeout](akka/cluster/ddata/typed/javadsl/Replicator.UpdateTimeout.html "class in akka.cluster.ddata.typed.javadsl") extends [Replicator.UpdateFailure](akka/cluster/ddata/typed/javadsl/Replicator.UpdateFailure.html "class in akka.cluster.ddata.typed.javadsl")\<[A](akka/cluster/ddata/typed/javadsl/Replicator.UpdateTimeout.html "type parameter in Replicator.UpdateTimeout") extends [ReplicatedData](akka/cluster/ddata/ReplicatedData.html "interface in akka.cluster.ddata")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.UpdateTimeout$](akka/cluster/ddata/typed/javadsl/Replicator.UpdateTimeout$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteAll](akka/cluster/ddata/typed/javadsl/Replicator.WriteAll.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteAll$](akka/cluster/ddata/typed/javadsl/Replicator.WriteAll$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction1\<java.time.Duration,​[Replicator.WriteAll](akka/cluster/ddata/typed/javadsl/Replicator.WriteAll.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteLocal$](akka/cluster/ddata/typed/javadsl/Replicator.WriteLocal$.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteMajority](akka/cluster/ddata/typed/javadsl/Replicator.WriteMajority.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteMajority$](akka/cluster/ddata/typed/javadsl/Replicator.WriteMajority$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction2\<java.time.Duration,​java.lang.Object,​[Replicator.WriteMajority](akka/cluster/ddata/typed/javadsl/Replicator.WriteMajority.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteTo](akka/cluster/ddata/typed/javadsl/Replicator.WriteTo.html "class in akka.cluster.ddata.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.javadsl.Replicator.WriteTo$](akka/cluster/ddata/typed/javadsl/Replicator.WriteTo$.html "class in akka.cluster.ddata.typed.javadsl") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.time.Duration,​[Replicator.WriteTo](akka/cluster/ddata/typed/javadsl/Replicator.WriteTo.html "class in akka.cluster.ddata.typed.javadsl")\> implements Serializable
- ## Package akka.cluster.ddata.typed.scaladsl

	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Delete](akka/cluster/ddata/typed/scaladsl/Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Delete$](akka/cluster/ddata/typed/scaladsl/Replicator.Delete$.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Get](akka/cluster/ddata/typed/scaladsl/Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Get$](akka/cluster/ddata/typed/scaladsl/Replicator.Get$.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.GetReplicaCount](akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.GetReplicaCount$](akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount$.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Subscribe](akka/cluster/ddata/typed/scaladsl/Replicator.Subscribe.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Subscribe$](akka/cluster/ddata/typed/scaladsl/Replicator.Subscribe$.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Unsubscribe](akka/cluster/ddata/typed/scaladsl/Replicator.Unsubscribe.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Unsubscribe$](akka/cluster/ddata/typed/scaladsl/Replicator.Unsubscribe$.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Update](akka/cluster/ddata/typed/scaladsl/Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.ddata.typed.scaladsl.Replicator.Update$](akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html "class in akka.cluster.ddata.typed.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.cluster.metrics

	- ### Class [akka.cluster.metrics.AdaptiveLoadBalancingGroup](akka/cluster/metrics/AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.AdaptiveLoadBalancingGroup$](akka/cluster/metrics/AdaptiveLoadBalancingGroup$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction3\<[MetricsSelector](akka/cluster/metrics/MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.String,​[AdaptiveLoadBalancingGroup](akka/cluster/metrics/AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class [akka.cluster.metrics.AdaptiveLoadBalancingPool](akka/cluster/metrics/AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.AdaptiveLoadBalancingPool$](akka/cluster/metrics/AdaptiveLoadBalancingPool$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction5\<[MetricsSelector](akka/cluster/metrics/MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[AdaptiveLoadBalancingPool](akka/cluster/metrics/AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class [akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic](akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic$](akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction2\<[ActorSystem](akka/actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](akka/cluster/metrics/MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class [akka.cluster.metrics.CapacityMetricsSelector](akka/cluster/metrics/CapacityMetricsSelector.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.ClusterMetricsChanged](akka/cluster/metrics/ClusterMetricsChanged.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.ClusterMetricsChanged$](akka/cluster/metrics/ClusterMetricsChanged$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[NodeMetrics](akka/cluster/metrics/NodeMetrics.html "class in akka.cluster.metrics")\>,​[ClusterMetricsChanged](akka/cluster/metrics/ClusterMetricsChanged.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class akka.cluster.metrics.ClusterMetricsCollector.GossipTick$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.metrics.ClusterMetricsCollector.MetricsTick$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.ClusterMetricsSettings](akka/cluster/metrics/ClusterMetricsSettings.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.ClusterMetricsSettings$](akka/cluster/metrics/ClusterMetricsSettings$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction1\<com.typesafe.config.Config,​[ClusterMetricsSettings](akka/cluster/metrics/ClusterMetricsSettings.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class [akka.cluster.metrics.ClusterMetricsStrategy](akka/cluster/metrics/ClusterMetricsStrategy.html "class in akka.cluster.metrics") extends [OneForOneStrategy](akka/actor/OneForOneStrategy.html "class in akka.actor") implements Serializable
	- ### Class [akka.cluster.metrics.ClusterMetricsStrategy$](akka/cluster/metrics/ClusterMetricsStrategy$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.CollectionControlMessage](akka/cluster/metrics/CollectionControlMessage.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.CollectionStartMessage$](akka/cluster/metrics/CollectionStartMessage$.html "class in akka.cluster.metrics") extends [CollectionControlMessage](akka/cluster/metrics/CollectionControlMessage.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.CollectionStopMessage$](akka/cluster/metrics/CollectionStopMessage$.html "class in akka.cluster.metrics") extends [CollectionControlMessage](akka/cluster/metrics/CollectionControlMessage.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.CpuMetricsSelector$](akka/cluster/metrics/CpuMetricsSelector$.html "class in akka.cluster.metrics") extends [CapacityMetricsSelector](akka/cluster/metrics/CapacityMetricsSelector.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.DefaultSigarProvider](akka/cluster/metrics/DefaultSigarProvider.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.DefaultSigarProvider$](akka/cluster/metrics/DefaultSigarProvider$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction1\<[ClusterMetricsSettings](akka/cluster/metrics/ClusterMetricsSettings.html "class in akka.cluster.metrics"),​[DefaultSigarProvider](akka/cluster/metrics/DefaultSigarProvider.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class [akka.cluster.metrics.EWMA](akka/cluster/metrics/EWMA.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.EWMA$](akka/cluster/metrics/EWMA$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.HeapMetricsSelector$](akka/cluster/metrics/HeapMetricsSelector$.html "class in akka.cluster.metrics") extends [CapacityMetricsSelector](akka/cluster/metrics/CapacityMetricsSelector.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.Metric](akka/cluster/metrics/Metric.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.Metric$](akka/cluster/metrics/Metric$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.MetricsGossip$](akka/cluster/metrics/MetricsGossip$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.MetricsGossipEnvelope$](akka/cluster/metrics/MetricsGossipEnvelope$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object,​akka.cluster.metrics.MetricsGossipEnvelope\> implements Serializable
	- ### Class [akka.cluster.metrics.MetricsSelector$](akka/cluster/metrics/MetricsSelector$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.MixMetricsSelector](akka/cluster/metrics/MixMetricsSelector.html "class in akka.cluster.metrics") extends [MixMetricsSelectorBase](akka/cluster/metrics/MixMetricsSelectorBase.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.MixMetricsSelector$](akka/cluster/metrics/MixMetricsSelector$.html "class in akka.cluster.metrics") extends [MixMetricsSelectorBase](akka/cluster/metrics/MixMetricsSelectorBase.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.MixMetricsSelectorBase](akka/cluster/metrics/MixMetricsSelectorBase.html "class in akka.cluster.metrics") extends [CapacityMetricsSelector](akka/cluster/metrics/CapacityMetricsSelector.html "class in akka.cluster.metrics") implements Serializable
	- ### Class [akka.cluster.metrics.NodeMetrics](akka/cluster/metrics/NodeMetrics.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.NodeMetrics$](akka/cluster/metrics/NodeMetrics$.html "class in akka.cluster.metrics") extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set\<[Metric](akka/cluster/metrics/Metric.html "class in akka.cluster.metrics")\>,​[NodeMetrics](akka/cluster/metrics/NodeMetrics.html "class in akka.cluster.metrics")\> implements Serializable
	- ### Class [akka.cluster.metrics.StandardMetrics.Cpu](akka/cluster/metrics/StandardMetrics.Cpu.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.StandardMetrics.Cpu$](akka/cluster/metrics/StandardMetrics.Cpu$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.StandardMetrics.HeapMemory](akka/cluster/metrics/StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.StandardMetrics.HeapMemory$](akka/cluster/metrics/StandardMetrics.HeapMemory$.html "class in akka.cluster.metrics") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.metrics.SystemLoadAverageMetricsSelector$](akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html "class in akka.cluster.metrics") extends [CapacityMetricsSelector](akka/cluster/metrics/CapacityMetricsSelector.html "class in akka.cluster.metrics") implements Serializable
- ## Package akka.cluster.metrics.protobuf.msg

	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.AdaptiveLoadBalancingPool](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### metricsSelector\_
			
			
			
			```
			[ClusterMetricsMessages.MetricsSelector](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") metricsSelector_
			```
			- #### nrOfInstances\_
			
			
			
			```
			int nrOfInstances_
			```
			- #### routerDispatcher\_
			
			
			
			```
			java.lang.Object routerDispatcher_
			```
			- #### usePoolDispatcher\_
			
			
			
			```
			boolean usePoolDispatcher_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossip](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### allAddresses\_
			
			
			
			```
			java.util.List<[ClusterMetricsMessages.Address](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")> allAddresses_
			```
			- #### allMetricNames\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList allMetricNames_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### nodeMetrics\_
			
			
			
			```
			java.util.List<[ClusterMetricsMessages.NodeMetrics](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> nodeMetrics_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossipEnvelope](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ClusterMetricsMessages.Address](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") from_
			```
			- #### gossip\_
			
			
			
			```
			[ClusterMetricsMessages.MetricsGossip](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") gossip_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### reply\_
			
			
			
			```
			boolean reply_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			akka.protobufv3.internal.ByteString data_
			```
			- #### manifest\_
			
			
			
			```
			java.lang.Object manifest_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MixMetricsSelector](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### selectors\_
			
			
			
			```
			java.util.List<[ClusterMetricsMessages.MetricsSelector](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")> selectors_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addressIndex\_
			
			
			
			```
			int addressIndex_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### metrics\_
			
			
			
			```
			java.util.List<[ClusterMetricsMessages.NodeMetrics.Metric](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")> metrics_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.EWMA](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### alpha\_
			
			
			
			```
			double alpha_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### value\_
			
			
			
			```
			double value_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Metric](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### ewma\_
			
			
			
			```
			[ClusterMetricsMessages.NodeMetrics.EWMA](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") ewma_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### nameIndex\_
			
			
			
			```
			int nameIndex_
			```
			- #### number\_
			
			
			
			```
			[ClusterMetricsMessages.NodeMetrics.Number](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") number_
			```
	- ### Class [akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Number](akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### serialized\_
			
			
			
			```
			akka.protobufv3.internal.ByteString serialized_
			```
			- #### type\_
			
			
			
			```
			int type_
			```
			- #### value32\_
			
			
			
			```
			int value32_
			```
			- #### value64\_
			
			
			
			```
			long value64_
			```
- ## Package akka.cluster.protobuf.msg

	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Address](akka/cluster/protobuf/msg/ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPool](akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### pool\_
			
			
			
			```
			[ClusterMessages.Pool](akka/cluster/protobuf/msg/ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") pool_
			```
			- #### settings\_
			
			
			
			```
			[ClusterMessages.ClusterRouterPoolSettings](akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") settings_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPoolSettings](akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### allowLocalRoutees\_
			
			
			
			```
			boolean allowLocalRoutees_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### maxInstancesPerNode\_
			
			
			
			```
			int maxInstancesPerNode_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### totalInstances\_
			
			
			
			```
			int totalInstances_
			```
			- #### useRole\_
			
			
			
			```
			java.lang.Object useRole_
			```
			- #### useRoles\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList useRoles_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck](akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### clusterConfig\_
			
			
			
			```
			java.lang.Object clusterConfig_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### type\_
			
			
			
			```
			int type_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Empty](akka/cluster/protobuf/msg/ClusterMessages.Empty.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Gossip](akka/cluster/protobuf/msg/ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### allAddresses\_
			
			
			
			```
			java.util.List<[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")> allAddresses_
			```
			- #### allAppVersions\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList allAppVersions_
			```
			- #### allHashes\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList allHashes_
			```
			- #### allRoles\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList allRoles_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### members\_
			
			
			
			```
			java.util.List<[ClusterMessages.Member](akka/cluster/protobuf/msg/ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")> members_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### overview\_
			
			
			
			```
			[ClusterMessages.GossipOverview](akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") overview_
			```
			- #### tombstones\_
			
			
			
			```
			java.util.List<[ClusterMessages.Tombstone](akka/cluster/protobuf/msg/ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")> tombstones_
			```
			- #### version\_
			
			
			
			```
			[ClusterMessages.VectorClock](akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") version_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.GossipEnvelope](akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### serializedGossip\_
			
			
			
			```
			akka.protobufv3.internal.ByteString serializedGossip_
			```
			- #### to\_
			
			
			
			```
			[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") to_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.GossipOverview](akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### observerReachability\_
			
			
			
			```
			java.util.List<[ClusterMessages.ObserverReachability](akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")> observerReachability_
			```
			- #### seen\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList seen_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.GossipStatus](akka/cluster/protobuf/msg/ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### allHashes\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList allHashes_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### seenDigest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString seenDigest_
			```
			- #### version\_
			
			
			
			```
			[ClusterMessages.VectorClock](akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") version_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Heartbeat](akka/cluster/protobuf/msg/ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### creationTime\_
			
			
			
			```
			long creationTime_
			```
			- #### from\_
			
			
			
			```
			[ClusterMessages.Address](akka/cluster/protobuf/msg/ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### sequenceNr\_
			
			
			
			```
			long sequenceNr_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.HeartBeatResponse](akka/cluster/protobuf/msg/ClusterMessages.HeartBeatResponse.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### creationTime\_
			
			
			
			```
			long creationTime_
			```
			- #### from\_
			
			
			
			```
			[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### sequenceNr\_
			
			
			
			```
			long sequenceNr_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.InitJoin](akka/cluster/protobuf/msg/ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### currentConfig\_
			
			
			
			```
			java.lang.Object currentConfig_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.InitJoinAck](akka/cluster/protobuf/msg/ClusterMessages.InitJoinAck.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[ClusterMessages.Address](akka/cluster/protobuf/msg/ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### configCheck\_
			
			
			
			```
			[ClusterMessages.ConfigCheck](akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") configCheck_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Join](akka/cluster/protobuf/msg/ClusterMessages.Join.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### appVersion\_
			
			
			
			```
			java.lang.Object appVersion_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### node\_
			
			
			
			```
			[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") node_
			```
			- #### roles\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList roles_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Member](akka/cluster/protobuf/msg/ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addressIndex\_
			
			
			
			```
			int addressIndex_
			```
			- #### appVersionIndex\_
			
			
			
			```
			int appVersionIndex_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### rolesIndexes\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList rolesIndexes_
			```
			- #### rolesIndexesMemoizedSerializedSize
			
			
			
			```
			int rolesIndexesMemoizedSerializedSize
			```
			- #### status\_
			
			
			
			```
			int status_
			```
			- #### upNumber\_
			
			
			
			```
			int upNumber_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability](akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addressIndex\_
			
			
			
			```
			int addressIndex_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### subjectReachability\_
			
			
			
			```
			java.util.List<[ClusterMessages.SubjectReachability](akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")> subjectReachability_
			```
			- #### version\_
			
			
			
			```
			long version_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Pool](akka/cluster/protobuf/msg/ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			akka.protobufv3.internal.ByteString data_
			```
			- #### manifest\_
			
			
			
			```
			java.lang.Object manifest_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability](akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addressIndex\_
			
			
			
			```
			int addressIndex_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### status\_
			
			
			
			```
			int status_
			```
			- #### version\_
			
			
			
			```
			long version_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Tombstone](akka/cluster/protobuf/msg/ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addressIndex\_
			
			
			
			```
			int addressIndex_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[ClusterMessages.Address](akka/cluster/protobuf/msg/ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### uid\_
			
			
			
			```
			int uid_
			```
			- #### uid2\_
			
			
			
			```
			int uid2_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.VectorClock](akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
			- #### versions\_
			
			
			
			```
			java.util.List<[ClusterMessages.VectorClock.Version](akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> versions_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version](akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hashIndex\_
			
			
			
			```
			int hashIndex_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.cluster.protobuf.msg.ClusterMessages.Welcome](akka/cluster/protobuf/msg/ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ClusterMessages.UniqueAddress](akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") from_
			```
			- #### gossip\_
			
			
			
			```
			[ClusterMessages.Gossip](akka/cluster/protobuf/msg/ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") gossip_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
- ## Package akka.cluster.pubsub

	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Count$](akka/cluster/pubsub/DistributedPubSubMediator.Count$.html "class in akka.cluster.pubsub") extends [DistributedPubSubMediator.Count](akka/cluster/pubsub/DistributedPubSubMediator.Count.html "class in akka.cluster.pubsub") implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.CountSubscribers](akka/cluster/pubsub/DistributedPubSubMediator.CountSubscribers.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.CountSubscribers$](akka/cluster/pubsub/DistributedPubSubMediator.CountSubscribers$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<java.lang.String,​[DistributedPubSubMediator.CountSubscribers](akka/cluster/pubsub/DistributedPubSubMediator.CountSubscribers.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.CurrentTopics](akka/cluster/pubsub/DistributedPubSubMediator.CurrentTopics.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.CurrentTopics$](akka/cluster/pubsub/DistributedPubSubMediator.CurrentTopics$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​[DistributedPubSubMediator.CurrentTopics](akka/cluster/pubsub/DistributedPubSubMediator.CurrentTopics.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.GetTopics$](akka/cluster/pubsub/DistributedPubSubMediator.GetTopics$.html "class in akka.cluster.pubsub") extends [DistributedPubSubMediator.GetTopics](akka/cluster/pubsub/DistributedPubSubMediator.GetTopics.html "class in akka.cluster.pubsub") implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Bucket](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Bucket.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Bucket$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Bucket$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.TreeMap\<java.lang.String,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder\>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.Bucket\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Delta](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Delta.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Delta$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Delta$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Iterable\<akka.cluster.pubsub.DistributedPubSubMediator.Internal.Bucket\>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.Delta\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.DeltaCount$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.DeltaCount$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.GossipTick$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.GossipTick$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.MediatorRouterEnvelope](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.MediatorRouterEnvelope$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.MediatorRouterEnvelope\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.NewSubscriberArrived$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NewSubscriberArrived$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.NoMoreSubscribers$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NoMoreSubscribers$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Prune$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Prune$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.RegisterTopic](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.RegisterTopic.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.RegisterTopic$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.RegisterTopic$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.pubsub.DistributedPubSubMediator.Internal.RegisterTopic\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.SendToOneSubscriber](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.SendToOneSubscriber.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.SendToOneSubscriber$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.SendToOneSubscriber$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.SendToOneSubscriber\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Status](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Status.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Status$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Status$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Map\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object\>,​java.lang.Object,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.Status\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Subscribed](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Subscribed.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Subscribed$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Subscribed$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction2\<[DistributedPubSubMediator.SubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.pubsub.DistributedPubSubMediator.Internal.Subscribed\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.TerminateRequest$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TerminateRequest$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Unsubscribed](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Unsubscribed.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.Unsubscribed$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Unsubscribed$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction2\<[DistributedPubSubMediator.UnsubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.pubsub.DistributedPubSubMediator.Internal.Unsubscribed\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.ValueHolder](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Internal$.ValueHolder$](akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.pubsub.DistributedPubSubMediator.Internal.ValueHolder\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Publish](akka/cluster/pubsub/DistributedPubSubMediator.Publish.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Publish$](akka/cluster/pubsub/DistributedPubSubMediator.Publish$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Put](akka/cluster/pubsub/DistributedPubSubMediator.Put.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Put$](akka/cluster/pubsub/DistributedPubSubMediator.Put$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[DistributedPubSubMediator.Put](akka/cluster/pubsub/DistributedPubSubMediator.Put.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Remove](akka/cluster/pubsub/DistributedPubSubMediator.Remove.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Remove$](akka/cluster/pubsub/DistributedPubSubMediator.Remove$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<java.lang.String,​[DistributedPubSubMediator.Remove](akka/cluster/pubsub/DistributedPubSubMediator.Remove.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Send](akka/cluster/pubsub/DistributedPubSubMediator.Send.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Send$](akka/cluster/pubsub/DistributedPubSubMediator.Send$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​java.lang.Object,​[DistributedPubSubMediator.Send](akka/cluster/pubsub/DistributedPubSubMediator.Send.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.SendToAll](akka/cluster/pubsub/DistributedPubSubMediator.SendToAll.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.SendToAll$](akka/cluster/pubsub/DistributedPubSubMediator.SendToAll$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​java.lang.Object,​[DistributedPubSubMediator.SendToAll](akka/cluster/pubsub/DistributedPubSubMediator.SendToAll.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Subscribe](akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Subscribe$](akka/cluster/pubsub/DistributedPubSubMediator.Subscribe$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.SubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.SubscribeAck$](akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<[DistributedPubSubMediator.Subscribe](akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.SubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe](akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe$](akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe$.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck$](akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck$.html "class in akka.cluster.pubsub") extends scala.runtime.AbstractFunction1\<[DistributedPubSubMediator.Unsubscribe](akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub"),​[DistributedPubSubMediator.UnsubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub")\> implements Serializable
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Bucket extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### content
			
			
			
			```
			scala.collection.immutable.TreeMap<java.lang.String,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$ValueHolder> content
			```
			- #### owner
			
			
			
			```
			[Address](akka/actor/Address.html "class in akka.actor") owner
			```
			- #### version
			
			
			
			```
			long version
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Bucket$ extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.TreeMap\<java.lang.String,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$ValueHolder\>,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$Bucket\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Delta extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### buckets
			
			
			
			```
			scala.collection.immutable.Iterable<akka.cluster.pubsub.DistributedPubSubMediator$Internal$Bucket> buckets
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Delta$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Iterable\<akka.cluster.pubsub.DistributedPubSubMediator$Internal$Bucket\>,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$Delta\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$DeltaCount$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$GossipTick$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$MediatorRouterEnvelope extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### msg
			
			
			
			```
			java.lang.Object msg
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$MediatorRouterEnvelope$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$MediatorRouterEnvelope\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$NewSubscriberArrived$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$NoMoreSubscribers$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Prune$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$RegisterTopic extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### topicRef
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") topicRef
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$RegisterTopic$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.pubsub.DistributedPubSubMediator$Internal$RegisterTopic\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$SendToOneSubscriber extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### msg
			
			
			
			```
			java.lang.Object msg
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$SendToOneSubscriber$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$SendToOneSubscriber\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Status extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### isReplyToStatus
			
			
			
			```
			boolean isReplyToStatus
			```
			- #### versions
			
			
			
			```
			scala.collection.immutable.Map<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object> versions
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Status$ extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Map\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object\>,​java.lang.Object,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$Status\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Subscribed extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### ack
			
			
			
			```
			[DistributedPubSubMediator.SubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub") ack
			```
			- #### subscriber
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") subscriber
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Subscribed$ extends scala.runtime.AbstractFunction2\<[DistributedPubSubMediator.SubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.pubsub.DistributedPubSubMediator$Internal$Subscribed\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$TerminateRequest$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Unsubscribed extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### ack
			
			
			
			```
			[DistributedPubSubMediator.UnsubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub") ack
			```
			- #### subscriber
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") subscriber
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$Unsubscribed$ extends scala.runtime.AbstractFunction2\<[DistributedPubSubMediator.UnsubscribeAck](akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.pubsub.DistributedPubSubMediator$Internal$Unsubscribed\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$ValueHolder extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### ref
			
			
			
			```
			scala.Option<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> ref
			```
			- #### version
			
			
			
			```
			long version
			```
	- ### Class akka.cluster.pubsub.DistributedPubSubMediator$Internal$ValueHolder$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.pubsub.DistributedPubSubMediator$Internal$ValueHolder\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.cluster.pubsub.protobuf.msg

	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### buckets\_
			
			
			
			```
			java.util.List<[DistributedPubSubMessages.Delta.Bucket](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")> buckets_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### content\_
			
			
			
			```
			java.util.List<[DistributedPubSubMessages.Delta.Entry](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> content_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### owner\_
			
			
			
			```
			[DistributedPubSubMessages.Address](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") owner_
			```
			- #### version\_
			
			
			
			```
			long version_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### ref\_
			
			
			
			```
			java.lang.Object ref_
			```
			- #### version\_
			
			
			
			```
			long version_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### enclosedMessage\_
			
			
			
			```
			akka.protobufv3.internal.ByteString enclosedMessage_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Publish](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			[DistributedPubSubMessages.Payload](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") payload_
			```
			- #### topic\_
			
			
			
			```
			java.lang.Object topic_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Send](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### localAffinity\_
			
			
			
			```
			boolean localAffinity_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
			- #### payload\_
			
			
			
			```
			[DistributedPubSubMessages.Payload](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") payload_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToAll](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### allButSelf\_
			
			
			
			```
			boolean allButSelf_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
			- #### payload\_
			
			
			
			```
			[DistributedPubSubMessages.Payload](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") payload_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToOneSubscriber](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			[DistributedPubSubMessages.Payload](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") payload_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### replyToStatus\_
			
			
			
			```
			boolean replyToStatus_
			```
			- #### versions\_
			
			
			
			```
			java.util.List<[DistributedPubSubMessages.Status.Version](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")> versions_
			```
	- ### Class [akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status.Version](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[DistributedPubSubMessages.Address](akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
- ## Package akka.cluster.routing

	- ### Class [akka.cluster.routing.ClusterRouterGroup](akka/cluster/routing/ClusterRouterGroup.html "class in akka.cluster.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterGroup$](akka/cluster/routing/ClusterRouterGroup$.html "class in akka.cluster.routing") extends scala.runtime.AbstractFunction2\<[Group](akka/routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](akka/cluster/routing/ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](akka/cluster/routing/ClusterRouterGroup.html "class in akka.cluster.routing")\> implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterGroupSettings](akka/cluster/routing/ClusterRouterGroupSettings.html "class in akka.cluster.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterGroupSettings$](akka/cluster/routing/ClusterRouterGroupSettings$.html "class in akka.cluster.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterPool](akka/cluster/routing/ClusterRouterPool.html "class in akka.cluster.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterPool$](akka/cluster/routing/ClusterRouterPool$.html "class in akka.cluster.routing") extends scala.runtime.AbstractFunction2\<[Pool](akka/routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](akka/cluster/routing/ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](akka/cluster/routing/ClusterRouterPool.html "class in akka.cluster.routing")\> implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterPoolSettings](akka/cluster/routing/ClusterRouterPoolSettings.html "class in akka.cluster.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.routing.ClusterRouterPoolSettings$](akka/cluster/routing/ClusterRouterPoolSettings$.html "class in akka.cluster.routing") extends java.lang.Object implements Serializable
- ## Package akka.cluster.sbr

	- ### Class akka.cluster.sbr.DowningStrategy.AcquireLeaseAndDownIndirectlyConnected extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.AcquireLeaseAndDownIndirectlyConnected$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.cluster.sbr.DowningStrategy.AcquireLeaseAndDownIndirectlyConnected\> implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.AcquireLeaseAndDownUnreachable extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.AcquireLeaseAndDownUnreachable$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.cluster.sbr.DowningStrategy.AcquireLeaseAndDownUnreachable\> implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.DownAll$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.DownIndirectlyConnected$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.DownReachable$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.DownSelfQuarantinedByRemote$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.DownUnreachable$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.DowningStrategy.ReverseDownIndirectlyConnected$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sbr.KeepOldestSettings$](akka/cluster/sbr/KeepOldestSettings$.html "class in akka.cluster.sbr") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<java.lang.String\>,​akka.cluster.sbr.KeepOldestSettings\> implements Serializable
	- ### Class [akka.cluster.sbr.LeaseMajoritySettings$](akka/cluster/sbr/LeaseMajoritySettings$.html "class in akka.cluster.sbr") extends scala.runtime.AbstractFunction5\<java.lang.String,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.Option\<java.lang.String\>,​scala.Option\<java.lang.String\>,​akka.cluster.sbr.LeaseMajoritySettings\> implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.AcquireLease$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.AcquireLeaseResult extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.AcquireLeaseResult$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.sbr.SplitBrainResolver.AcquireLeaseResult\> implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReachabilityChangedStats extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReachabilityChangedStats$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sbr.SplitBrainResolver.ReachabilityChangedStats\> implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition$.NoLease$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition$.WhenMembersRemoved extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition$.WhenMembersRemoved$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition.WhenMembersRemoved\> implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition$.WhenTimeElapsed extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition$.WhenTimeElapsed$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.Deadline,​akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseCondition.WhenTimeElapsed\> implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseResult extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseResult$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.sbr.SplitBrainResolver.ReleaseLeaseResult\> implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver.Tick$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$NoLease$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$WhenMembersRemoved extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### nodes
			
			
			
			```
			scala.collection.immutable.Set<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> nodes
			```
	- ### Class akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$WhenMembersRemoved$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$WhenMembersRemoved\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$WhenTimeElapsed extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### deadline
			
			
			
			```
			scala.concurrent.duration.Deadline deadline
			```
	- ### Class akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$WhenTimeElapsed$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.Deadline,​akka.cluster.sbr.SplitBrainResolver$ReleaseLeaseCondition$WhenTimeElapsed\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.cluster.sbr.StaticQuorumSettings$](akka/cluster/sbr/StaticQuorumSettings$.html "class in akka.cluster.sbr") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<java.lang.String\>,​akka.cluster.sbr.StaticQuorumSettings\> implements Serializable
- ## Package akka.cluster.sharding

	- ### Class akka.cluster.sharding.ClusterShardingGuardian.Start extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.Start$ extends scala.runtime.AbstractFunction7\<java.lang.String,​scala.Function1\<java.lang.String,​[Props](akka/actor/Props.html "class in akka.actor")\>,​[ClusterShardingSettings](akka/cluster/sharding/ClusterShardingSettings.html "class in akka.cluster.sharding"),​scala.PartialFunction\<java.lang.Object,​scala.Tuple2\<java.lang.String,​java.lang.Object\>\>,​scala.Function1\<java.lang.Object,​java.lang.String\>,​[ShardCoordinator.ShardAllocationStrategy](akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding"),​java.lang.Object,​akka.cluster.sharding.ClusterShardingGuardian.Start\> implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.StartCoordinatorIfNeeded extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.StartCoordinatorIfNeeded$ extends scala.runtime.AbstractFunction3\<java.lang.String,​[ClusterShardingSettings](akka/cluster/sharding/ClusterShardingSettings.html "class in akka.cluster.sharding"),​[ShardCoordinator.ShardAllocationStrategy](akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding"),​akka.cluster.sharding.ClusterShardingGuardian.StartCoordinatorIfNeeded\> implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.Started extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.Started$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ClusterShardingGuardian.Started\> implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.StartProxy extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingGuardian.StartProxy$ extends scala.runtime.AbstractFunction5\<java.lang.String,​scala.Option\<java.lang.String\>,​[ClusterShardingSettings](akka/cluster/sharding/ClusterShardingSettings.html "class in akka.cluster.sharding"),​scala.PartialFunction\<java.lang.Object,​scala.Tuple2\<java.lang.String,​java.lang.Object\>\>,​scala.Function1\<java.lang.Object,​java.lang.String\>,​akka.cluster.sharding.ClusterShardingGuardian.StartProxy\> implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.AlwaysAdmissionFilter$](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.AlwaysAdmissionFilter$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter$](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.FrequencySketchAdmissionFilter\> implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer\> implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.NoAdmissionOptimizer$](akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.NoAdmissionOptimizer$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.IdlePassivationStrategy$](akka/cluster/sharding/ClusterShardingSettings.IdlePassivationStrategy$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.LeastFrequentlyUsedPassivationStrategy$](akka/cluster/sharding/ClusterShardingSettings.LeastFrequentlyUsedPassivationStrategy$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.LeastRecentlyUsedPassivationStrategy$](akka/cluster/sharding/ClusterShardingSettings.LeastRecentlyUsedPassivationStrategy$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.MostRecentlyUsedPassivationStrategy$](akka/cluster/sharding/ClusterShardingSettings.MostRecentlyUsedPassivationStrategy$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<akka.cluster.sharding.ClusterShardingSettings.IdlePassivationStrategy\>,​akka.cluster.sharding.ClusterShardingSettings.MostRecentlyUsedPassivationStrategy\> implements Serializable
	- ### Class [akka.cluster.sharding.ClusterShardingSettings.NoPassivationStrategy$](akka/cluster/sharding/ClusterShardingSettings.NoPassivationStrategy$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$AlwaysAdmissionFilter$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$FrequencySketchAdmissionFilter extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### counterBits
			
			
			
			```
			int counterBits
			```
			- #### depth
			
			
			
			```
			int depth
			```
			- #### resetMultiplier
			
			
			
			```
			double resetMultiplier
			```
			- #### widthMultiplier
			
			
			
			```
			int widthMultiplier
			```
	- ### Class akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$FrequencySketchAdmissionFilter$ extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$FrequencySketchAdmissionFilter\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$HillClimbingAdmissionOptimizer extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### adjustMultiplier
			
			
			
			```
			double adjustMultiplier
			```
			- #### initialStep
			
			
			
			```
			double initialStep
			```
			- #### restartThreshold
			
			
			
			```
			double restartThreshold
			```
			- #### stepDecay
			
			
			
			```
			double stepDecay
			```
	- ### Class akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$HillClimbingAdmissionOptimizer$ extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$HillClimbingAdmissionOptimizer\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ClusterShardingSettings$CompositePassivationStrategy$NoAdmissionOptimizer$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals](akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals$](akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals\> implements Serializable
	- ### Class [akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result](akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$](akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<scala.util.Try\<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals\>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result\> implements Serializable
	- ### Class akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Removals extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### events
			
			
			
			```
			boolean events
			```
			- #### snapshots
			
			
			
			```
			boolean snapshots
			```
	- ### Class akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Removals$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Removals\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Result extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### removals
			
			
			
			```
			scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Removals> removals
			```
	- ### Class akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Result$ extends scala.runtime.AbstractFunction1\<scala.util.Try\<akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Removals\>,​akka.cluster.sharding.RemoveInternalClusterShardingData$RemoveOnePersistenceId$Result\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.Shard.Active extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.Active$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.Shard.Active\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.CurrentShardState extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.CurrentShardState$ extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.Shard.CurrentShardState\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.EntitiesMovedToOtherShard extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.EntitiesMovedToOtherShard$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.Shard.EntitiesMovedToOtherShard\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.GetCurrentShardState$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.GetShardStats$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.LeaseAcquireResult extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.LeaseAcquireResult$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<java.lang.Throwable\>,​akka.cluster.sharding.Shard.LeaseAcquireResult\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.LeaseLost extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.LeaseLost$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.cluster.sharding.Shard.LeaseLost\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.LeaseRetry$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.NoState$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.PassivateIntervalTick$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.Passivating extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.Passivating$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.Shard.Passivating\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.RememberedButNotCreated$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.RememberEntityTimeout extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.RememberEntityTimeout$ extends scala.runtime.AbstractFunction1\<[RememberEntitiesShardStore.Command](akka/cluster/sharding/internal/RememberEntitiesShardStore.Command.html "interface in akka.cluster.sharding.internal"),​akka.cluster.sharding.Shard.RememberEntityTimeout\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.RememberingStart extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.RememberingStart$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.RememberingStop$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.RestartTerminatedEntity extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.RestartTerminatedEntity$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.Shard.RestartTerminatedEntity\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.ShardStats extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.Shard.ShardStats$ extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​akka.cluster.sharding.Shard.ShardStats\> implements Serializable
	- ### Class akka.cluster.sharding.Shard.WaitingForRestart$ extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.BeginHandOff](akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOff.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.BeginHandOff$](akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOff$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.BeginHandOff\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.BeginHandOffAck](akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOffAck.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.BeginHandOffAck$](akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOffAck$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.BeginHandOffAck\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.GetShardHome](akka/cluster/sharding/ShardCoordinator.Internal$.GetShardHome.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.GetShardHome$](akka/cluster/sharding/ShardCoordinator.Internal$.GetShardHome$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.GetShardHome\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.GracefulShutdownReq](akka/cluster/sharding/ShardCoordinator.Internal$.GracefulShutdownReq.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.GracefulShutdownReq$](akka/cluster/sharding/ShardCoordinator.Internal$.GracefulShutdownReq$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.GracefulShutdownReq\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.HandOff](akka/cluster/sharding/ShardCoordinator.Internal$.HandOff.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.HandOff$](akka/cluster/sharding/ShardCoordinator.Internal$.HandOff$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.HandOff\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.HostShard](akka/cluster/sharding/ShardCoordinator.Internal$.HostShard.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.HostShard$](akka/cluster/sharding/ShardCoordinator.Internal$.HostShard$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.HostShard\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.RegionStopped](akka/cluster/sharding/ShardCoordinator.Internal$.RegionStopped.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.RegionStopped$](akka/cluster/sharding/ShardCoordinator.Internal$.RegionStopped$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.RegionStopped\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.Register](akka/cluster/sharding/ShardCoordinator.Internal$.Register.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.Register$](akka/cluster/sharding/ShardCoordinator.Internal$.Register$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.Register\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.RegisterAck](akka/cluster/sharding/ShardCoordinator.Internal$.RegisterAck.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.RegisterAck$](akka/cluster/sharding/ShardCoordinator.Internal$.RegisterAck$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.RegisterAck\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.RegisterProxy](akka/cluster/sharding/ShardCoordinator.Internal$.RegisterProxy.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.RegisterProxy$](akka/cluster/sharding/ShardCoordinator.Internal$.RegisterProxy$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.RegisterProxy\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardCoordinatorInitialized$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardCoordinatorInitialized$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHome](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHome.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHome$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHome$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction2\<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.ShardHome\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHomeAllocated](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeAllocated.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHomeAllocated$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeAllocated$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction2\<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.ShardHomeAllocated\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHomeDeallocated](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeDeallocated.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHomeDeallocated$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeDeallocated$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.ShardHomeDeallocated\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHomes](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomes.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardHomes$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomes$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.Seq\<java.lang.String\>\>,​akka.cluster.sharding.ShardCoordinator.Internal.ShardHomes\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionProxyRegistered](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyRegistered.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionProxyRegistered$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyRegistered$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.ShardRegionProxyRegistered\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionProxyTerminated](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyTerminated.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionProxyTerminated$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyTerminated$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.ShardRegionProxyTerminated\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionRegistered](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionRegistered.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionRegistered$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionRegistered$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.ShardRegionRegistered\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionTerminated](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionTerminated.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardRegionTerminated$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionTerminated$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.Internal.ShardRegionTerminated\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardStarted](akka/cluster/sharding/ShardCoordinator.Internal$.ShardStarted.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardStarted$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardStarted$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.ShardStarted\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardStopped](akka/cluster/sharding/ShardCoordinator.Internal$.ShardStopped.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.ShardStopped$](akka/cluster/sharding/ShardCoordinator.Internal$.ShardStopped$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator.Internal.ShardStopped\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.State](akka/cluster/sharding/ShardCoordinator.Internal$.State.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.State$](akka/cluster/sharding/ShardCoordinator.Internal$.State$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.StateInitialized$](akka/cluster/sharding/ShardCoordinator.Internal$.StateInitialized$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.StopShards](akka/cluster/sharding/ShardCoordinator.Internal$.StopShards.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.StopShards$](akka/cluster/sharding/ShardCoordinator.Internal$.StopShards$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.ShardCoordinator.Internal.StopShards\> implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.Internal$.Terminate$](akka/cluster/sharding/ShardCoordinator.Internal$.Terminate$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.LeastShardAllocationStrategy](akka/cluster/sharding/ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding") extends akka.cluster.sharding.internal.AbstractLeastShardAllocationStrategy implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.RebalanceWorker$.ShardRegionTerminated](akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$](akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html "class in akka.cluster.sharding") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated\> implements Serializable
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$BeginHandOff extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$BeginHandOff$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$BeginHandOff\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$BeginHandOffAck extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$BeginHandOffAck$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$BeginHandOffAck\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$GetShardHome extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$GetShardHome$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$GetShardHome\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$GracefulShutdownReq extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shardRegion
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") shardRegion
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$GracefulShutdownReq$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$GracefulShutdownReq\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$HandOff extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$HandOff$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$HandOff\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$HostShard extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$HostShard$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$HostShard\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$RegionStopped extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shardRegion
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") shardRegion
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$RegionStopped$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$RegionStopped\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$Register extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shardRegion
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") shardRegion
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$Register$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$Register\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$RegisterAck extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### coordinator
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") coordinator
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$RegisterAck$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$RegisterAck\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$RegisterProxy extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shardRegionProxy
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") shardRegionProxy
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$RegisterProxy$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$RegisterProxy\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardCoordinatorInitialized$ extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHome extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### ref
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") ref
			```
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHome$ extends scala.runtime.AbstractFunction2\<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$ShardHome\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHomeAllocated extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### region
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") region
			```
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHomeAllocated$ extends scala.runtime.AbstractFunction2\<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$ShardHomeAllocated\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHomeDeallocated extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHomeDeallocated$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$ShardHomeDeallocated\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHomes extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### homes
			
			
			
			```
			scala.collection.immutable.Map<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.Seq<java.lang.String>> homes
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardHomes$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.Seq\<java.lang.String\>\>,​akka.cluster.sharding.ShardCoordinator$Internal$ShardHomes\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionProxyRegistered extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### regionProxy
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") regionProxy
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionProxyRegistered$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionProxyRegistered\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionProxyTerminated extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### regionProxy
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") regionProxy
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionProxyTerminated$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionProxyTerminated\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionRegistered extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### region
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") region
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionRegistered$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionRegistered\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionTerminated extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### region
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") region
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionTerminated$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$Internal$ShardRegionTerminated\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardStarted extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardStarted$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$ShardStarted\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardStopped extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### shard
			
			
			
			```
			java.lang.String shard
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$ShardStopped$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardCoordinator$Internal$ShardStopped\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$State extends java.lang.Object implements Serializable
	
	
	
	serialVersionUID:
	1L
	
		- ### Serialized Fields
		
		
			- #### regionProxies
			
			
			
			```
			scala.collection.immutable.Set<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> regionProxies
			```
			- #### regions
			
			
			
			```
			scala.collection.immutable.Map<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.Vector<java.lang.String>> regions
			```
			- #### rememberEntities
			
			
			
			```
			boolean rememberEntities
			```
			- #### shards
			
			
			
			```
			scala.collection.immutable.Map<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> shards
			```
			- #### unallocatedShards
			
			
			
			```
			scala.collection.immutable.Set<java.lang.String> unallocatedShards
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$State$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$StateInitialized$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$StopShards extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### shards
			
			
			
			```
			scala.collection.immutable.Set<java.lang.String> shards
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$StopShards$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.ShardCoordinator$Internal$StopShards\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$Internal$Terminate$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$RebalanceWorker$ShardRegionTerminated extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### region
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") region
			```
	- ### Class akka.cluster.sharding.ShardCoordinator$RebalanceWorker$ShardRegionTerminated$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator$RebalanceWorker$ShardRegionTerminated\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.cluster.sharding.ShardingQueries.ShardsQueryResult](akka/cluster/sharding/ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.ShardingQueries.ShardsQueryResult$](akka/cluster/sharding/ShardingQueries.ShardsQueryResult$.html "class in akka.cluster.sharding") extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ClusterShardingStats extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ClusterShardingStats$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<[Address](akka/actor/Address.html "class in akka.actor"),​akka.cluster.sharding.ShardRegion.ShardRegionStats\>,​akka.cluster.sharding.ShardRegion.ClusterShardingStats\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.CurrentRegions extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.CurrentRegions$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[Address](akka/actor/Address.html "class in akka.actor")\>,​akka.cluster.sharding.ShardRegion.CurrentRegions\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.CurrentShardRegionState extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.CurrentShardRegionState$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<akka.cluster.sharding.ShardRegion.ShardState\>,​akka.cluster.sharding.ShardRegion.CurrentShardRegionState\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.GetClusterShardingStats extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.GetClusterShardingStats$ extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.cluster.sharding.ShardRegion.GetClusterShardingStats\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.GetCurrentRegions$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.GetShardRegionState$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.GetShardRegionStats$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.GracefulShutdown$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.Passivate extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.Passivate$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.sharding.ShardRegion.Passivate\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.SetActiveEntityLimit extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.SetActiveEntityLimit$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.sharding.ShardRegion.SetActiveEntityLimit\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardInitialized extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardInitialized$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardRegion.ShardInitialized\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardRegionStats extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardRegionStats$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<java.lang.String,​java.lang.Object\>,​akka.cluster.sharding.ShardRegion.ShardRegionStats\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardState extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardState$ extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.ShardRegion.ShardState\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.ShardsUpdated$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.sharding.ShardRegion.ShardsUpdated\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.StartEntity extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.StartEntity$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.ShardRegion.StartEntity\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.StartEntityAck extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion.StartEntityAck$ extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.String,​akka.cluster.sharding.ShardRegion.StartEntityAck\> implements Serializable
	- ### Class akka.cluster.sharding.ShardRegion$HandOffStopper$StopTimeout$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.sharding.ShardRegion$HandOffStopper$StopTimeoutWarning$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.cluster.sharding.external

	- ### Class [akka.cluster.sharding.external.ClientTimeoutException](akka/cluster/sharding/external/ClientTimeoutException.html "class in akka.cluster.sharding.external") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocation$](akka/cluster/sharding/external/ExternalShardAllocationStrategy.GetShardLocation$.html "class in akka.cluster.sharding.external") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocation\> implements Serializable
	- ### Class [akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocationResponse$](akka/cluster/sharding/external/ExternalShardAllocationStrategy.GetShardLocationResponse$.html "class in akka.cluster.sharding.external") extends scala.runtime.AbstractFunction1\<scala.Option\<[Address](akka/actor/Address.html "class in akka.actor")\>,​akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocationResponse\> implements Serializable
	- ### Class [akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocations$](akka/cluster/sharding/external/ExternalShardAllocationStrategy.GetShardLocations$.html "class in akka.cluster.sharding.external") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocationsResponse$](akka/cluster/sharding/external/ExternalShardAllocationStrategy.GetShardLocationsResponse$.html "class in akka.cluster.sharding.external") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<java.lang.String,​[Address](akka/actor/Address.html "class in akka.actor")\>,​akka.cluster.sharding.external.ExternalShardAllocationStrategy.GetShardLocationsResponse\> implements Serializable
	- ### Class [akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation](akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation$](akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation$.html "class in akka.cluster.sharding.external") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")\> implements Serializable
- ## Package akka.cluster.sharding.internal

	- ### Class [akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry](akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry$](akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[Member](akka/cluster/Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq\<java.lang.String\>,​[ClusterShardAllocationMixin.RegionEntry](akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.ClusterShardAllocationMixin.ShardSuitabilityOrdering](akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.ClusterShardAllocationMixin.ShardSuitabilityOrdering$](akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html "class in akka.cluster.sharding.internal") extends [ClusterShardAllocationMixin.ShardSuitabilityOrdering](akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal") implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesCoordinatorStore.MigrationMarker$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesCoordinatorStore.State extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesCoordinatorStore.State$ extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Set\<java.lang.String\>,​java.lang.Object,​akka.cluster.sharding.internal.EventSourcedRememberEntitiesCoordinatorStore.State\> implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.EntitiesStarted extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.EntitiesStarted$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.EntitiesStarted\> implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.EntitiesStopped extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.EntitiesStopped$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.EntitiesStopped\> implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.StartedAck$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.State extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.State$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.State\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.AddShard](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.AddShard$](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction1\<java.lang.String,​[RememberEntitiesCoordinatorStore.AddShard](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.GetShards$](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.GetShards$.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.RememberedShards](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.RememberedShards$](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​[RememberEntitiesCoordinatorStore.RememberedShards](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.UpdateDone](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.UpdateDone$](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction1\<java.lang.String,​[RememberEntitiesCoordinatorStore.UpdateDone](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.UpdateFailed](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesCoordinatorStore.UpdateFailed$](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction1\<java.lang.String,​[RememberEntitiesCoordinatorStore.UpdateFailed](akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.GetEntities$](akka/cluster/sharding/internal/RememberEntitiesShardStore.GetEntities$.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.RememberedEntities](akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.RememberedEntities$](akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​[RememberEntitiesShardStore.RememberedEntities](akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.Update](akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.Update$](akka/cluster/sharding/internal/RememberEntitiesShardStore.Update$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Set\<java.lang.String\>,​scala.collection.immutable.Set\<java.lang.String\>,​[RememberEntitiesShardStore.Update](akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.UpdateDone](akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.internal.RememberEntitiesShardStore.UpdateDone$](akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone$.html "class in akka.cluster.sharding.internal") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Set\<java.lang.String\>,​scala.collection.immutable.Set\<java.lang.String\>,​[RememberEntitiesShardStore.UpdateDone](akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")\> implements Serializable
	- ### Class akka.cluster.sharding.internal.RememberEntityStarterManager.StartEntities extends java.lang.Object implements Serializable
	- ### Class akka.cluster.sharding.internal.RememberEntityStarterManager.StartEntities$ extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.String,​scala.collection.immutable.Set\<java.lang.String\>,​akka.cluster.sharding.internal.RememberEntityStarterManager.StartEntities\> implements Serializable
- ## Package akka.cluster.sharding.protobuf.msg

	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ActorRefMessage](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ActorRefMessage.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### ref\_
			
			
			
			```
			java.lang.Object ref_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStats](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### stats\_
			
			
			
			```
			java.util.List<[ClusterShardingMessages.ClusterShardingStatsEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")> stats_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[ClusterShardingMessages.Address](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### stats\_
			
			
			
			```
			[ClusterShardingMessages.ShardRegionStats](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") stats_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### regionProxies\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList regionProxies_
			```
			- #### regions\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList regions_
			```
			- #### shards\_
			
			
			
			```
			java.util.List<[ClusterShardingMessages.CoordinatorState.ShardEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> shards_
			```
			- #### unallocatedShards\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList unallocatedShards_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### regionRef\_
			
			
			
			```
			java.lang.Object regionRef_
			```
			- #### shardId\_
			
			
			
			```
			java.lang.Object shardId_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentRegions](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### regions\_
			
			
			
			```
			java.util.List<[ClusterShardingMessages.Address](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")> regions_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentShardRegionState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### failed\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList failed_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shards\_
			
			
			
			```
			java.util.List<[ClusterShardingMessages.ShardState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg")> shards_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentShardState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityIds\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList entityIds_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shardId\_
			
			
			
			```
			java.lang.Object shardId_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntitiesStarted](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntitiesStarted.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entityId\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntitiesStopped](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntitiesStopped.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entityId\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityStarted](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityId\_
			
			
			
			```
			java.lang.Object entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entities\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList entities_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityStopped](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStopped.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityId\_
			
			
			
			```
			java.lang.Object entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.GetClusterShardingStats](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.GetClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### timeoutNanos\_
			
			
			
			```
			long timeoutNanos_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### value\_
			
			
			
			```
			int value_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.RememberedShardState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### marker\_
			
			
			
			```
			boolean marker_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shardId\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList shardId_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHome](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHome.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### region\_
			
			
			
			```
			java.lang.Object region_
			```
			- #### shard\_
			
			
			
			```
			java.lang.Object shard_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomeAllocated](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomeAllocated.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### region\_
			
			
			
			```
			java.lang.Object region_
			```
			- #### shard\_
			
			
			
			```
			java.lang.Object shard_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomes](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### homes\_
			
			
			
			```
			java.util.List<[ClusterShardingMessages.ShardHomesEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg")> homes_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### region\_
			
			
			
			```
			java.lang.Object region_
			```
			- #### shard\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList shard_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardIdMessage](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardIdMessage.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shard\_
			
			
			
			```
			java.lang.Object shard_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardRegionStats](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### failed\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList failed_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### stats\_
			
			
			
			```
			java.util.List<[ClusterShardingMessages.MapFieldEntry](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")> stats_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityIds\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList entityIds_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shardId\_
			
			
			
			```
			java.lang.Object shardId_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardStats](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityCount\_
			
			
			
			```
			int entityCount_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shard\_
			
			
			
			```
			java.lang.Object shard_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StartEntity](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StartEntity.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityId\_
			
			
			
			```
			java.lang.Object entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StartEntityAck](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StartEntityAck.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityId\_
			
			
			
			```
			java.lang.Object entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shardId\_
			
			
			
			```
			java.lang.Object shardId_
			```
	- ### Class [akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards](akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### shards\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList shards_
			```
- ## Package akka.cluster.sharding.typed

	- ### Class [akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreModeDData$](akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreModeDData$.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreModeEventSourced$](akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreModeEventSourced$.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreModeDData$](akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreModeDData$.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreModePersistence$](akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreModePersistence$.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.GetClusterShardingStats](akka/cluster/sharding/typed/GetClusterShardingStats.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.GetClusterShardingStats$](akka/cluster/sharding/typed/GetClusterShardingStats$.html "class in akka.cluster.sharding.typed") extends scala.runtime.AbstractFunction3\<[EntityTypeKey](akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")\<?\>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<akka.cluster.sharding.ShardRegion.ClusterShardingStats\>,​[GetClusterShardingStats](akka/cluster/sharding/typed/GetClusterShardingStats.html "class in akka.cluster.sharding.typed")\> implements Serializable
	- ### Class [akka.cluster.sharding.typed.GetShardRegionState](akka/cluster/sharding/typed/GetShardRegionState.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.GetShardRegionState$](akka/cluster/sharding/typed/GetShardRegionState$.html "class in akka.cluster.sharding.typed") extends scala.runtime.AbstractFunction2\<[EntityTypeKey](akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")\<?\>,​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<akka.cluster.sharding.ShardRegion.CurrentShardRegionState\>,​[GetShardRegionState](akka/cluster/sharding/typed/GetShardRegionState.html "class in akka.cluster.sharding.typed")\> implements Serializable
	- ### Class [akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted$](akka/cluster/sharding/typed/ShardingDirectReplication.VerifyStarted$.html "class in akka.cluster.sharding.typed") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[Done](akka/Done.html "class in akka")\>,​akka.cluster.sharding.typed.ShardingDirectReplication.VerifyStarted\> implements Serializable
	- ### Class [akka.cluster.sharding.typed.ShardingEnvelope](akka/cluster/sharding/typed/ShardingEnvelope.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.ShardingEnvelope$](akka/cluster/sharding/typed/ShardingEnvelope$.html "class in akka.cluster.sharding.typed") extends java.lang.Object implements Serializable
- ## Package akka.cluster.sharding.typed.delivery

	- ### Class [akka.cluster.sharding.typed.delivery.ShardingProducerController.MessageWithConfirmation](akka/cluster/sharding/typed/delivery/ShardingProducerController.MessageWithConfirmation.html "class in akka.cluster.sharding.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.delivery.ShardingProducerController.MessageWithConfirmation$](akka/cluster/sharding/typed/delivery/ShardingProducerController.MessageWithConfirmation$.html "class in akka.cluster.sharding.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.delivery.ShardingProducerController.RequestNext](akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.delivery.ShardingProducerController.RequestNext$](akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext$.html "class in akka.cluster.sharding.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.delivery.ShardingProducerController.Start](akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.delivery.ShardingProducerController.Start$](akka/cluster/sharding/typed/delivery/ShardingProducerController.Start$.html "class in akka.cluster.sharding.typed.delivery") extends java.lang.Object implements Serializable
- ## Package akka.cluster.sharding.typed.internal

	- ### Class [akka.cluster.sharding.typed.internal.EntityTypeKeyImpl$](akka/cluster/sharding/typed/internal/EntityTypeKeyImpl$.html "class in akka.cluster.sharding.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$](akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html "class in akka.cluster.sharding.typed.internal") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.typed.internal.ShardedDaemonProcessId.DecodedId](akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.internal.ShardedDaemonProcessId.DecodedId$](akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId$.html "class in akka.cluster.sharding.typed.internal") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessId.DecodedId](akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal")\> implements Serializable
	- ### Class [akka.cluster.sharding.typed.internal.ShardedDaemonProcessState$](akka/cluster/sharding/typed/internal/ShardedDaemonProcessState$.html "class in akka.cluster.sharding.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.internal.ShardedDaemonProcessStateKey$](akka/cluster/sharding/typed/internal/ShardedDaemonProcessStateKey$.html "class in akka.cluster.sharding.typed.internal") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.cluster.sharding.typed.internal.ShardedDaemonProcessStateKey\> implements Serializable
- ## Package akka.cluster.sharding.typed.internal.protobuf

	- ### Class [akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.ChangeNumberOfProcesses](akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### newNumberOfProcesses\_
			
			
			
			```
			int newNumberOfProcesses_
			```
			- #### replyTo\_
			
			
			
			```
			java.lang.Object replyTo_
			```
	- ### Class [akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.DaemonProcessScaleState](akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### completed\_
			
			
			
			```
			boolean completed_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### numberOfProcesses\_
			
			
			
			```
			int numberOfProcesses_
			```
			- #### revision\_
			
			
			
			```
			long revision_
			```
			- #### startedTimestampMillis\_
			
			
			
			```
			long startedTimestampMillis_
			```
	- ### Class [akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcesses](akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### replyTo\_
			
			
			
			```
			java.lang.Object replyTo_
			```
	- ### Class [akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply](akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### numberOfProcesses\_
			
			
			
			```
			int numberOfProcesses_
			```
			- #### rescaleInProgress\_
			
			
			
			```
			boolean rescaleInProgress_
			```
			- #### revision\_
			
			
			
			```
			long revision_
			```
			- #### startedTimestampMillis\_
			
			
			
			```
			long startedTimestampMillis_
			```
	- ### Class [akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.ShardingEnvelope](akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityId\_
			
			
			
			```
			java.lang.Object entityId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") message_
			```
- ## Package akka.cluster.sharding.typed.javadsl

	- ### Class [akka.cluster.sharding.typed.javadsl.ClusterSharding.Passivate](akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.javadsl.ClusterSharding.Passivate$](akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate$.html "class in akka.cluster.sharding.typed.javadsl") extends java.lang.Object implements Serializable
- ## Package akka.cluster.sharding.typed.scaladsl

	- ### Class [akka.cluster.sharding.typed.scaladsl.ClusterSharding.Passivate](akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.sharding.typed.scaladsl.ClusterSharding.Passivate$](akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate$.html "class in akka.cluster.sharding.typed.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.cluster.singleton

	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquireLeaseFailure](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseFailure.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquireLeaseFailure$](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseFailure$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.cluster.singleton.ClusterSingletonManager.Internal.AcquireLeaseFailure\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquireLeaseResult](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseResult.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquireLeaseResult$](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseResult$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.AcquireLeaseResult\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquiringLease$](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLease$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquiringLeaseData](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLeaseData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.AcquiringLeaseData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLeaseData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.AcquiringLeaseData\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.BecomingOldest$](akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldest$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.BecomingOldestData](akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldestData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.BecomingOldestData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldestData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.List\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.BecomingOldestData\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.Cleanup$](akka/cluster/singleton/ClusterSingletonManager.Internal$.Cleanup$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.DelayedMemberRemoved](akka/cluster/singleton/ClusterSingletonManager.Internal$.DelayedMemberRemoved.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.DelayedMemberRemoved$](akka/cluster/singleton/ClusterSingletonManager.Internal$.DelayedMemberRemoved$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​akka.cluster.singleton.ClusterSingletonManager.Internal.DelayedMemberRemoved\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.End$](akka/cluster/singleton/ClusterSingletonManager.Internal$.End$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.EndData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.EndData$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandingOver$](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOver$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandingOverData](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOverData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandingOverData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOverData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.HandingOverData\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandOverDone$](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverDone$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandOverInProgress$](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverInProgress$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandOverRetry](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverRetry.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandOverRetry$](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverRetry$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.HandOverRetry\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.HandOverToMe$](akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverToMe$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.LeaseLost](akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseLost.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.LeaseLost$](akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseLost$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.LeaseLost\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.LeaseRetry$](akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseRetry$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.Oldest$](akka/cluster/singleton/ClusterSingletonManager.Internal$.Oldest$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.GetNext$](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.GetNext$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.List\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestData](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestData\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.ReleaseLeaseFailure](akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseFailure.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.ReleaseLeaseFailure$](akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseFailure$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.cluster.singleton.ClusterSingletonManager.Internal.ReleaseLeaseFailure\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.ReleaseLeaseResult](akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseResult.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.ReleaseLeaseResult$](akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseResult$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.ReleaseLeaseResult\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.SelfExiting$](akka/cluster/singleton/ClusterSingletonManager.Internal$.SelfExiting$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.Start$](akka/cluster/singleton/ClusterSingletonManager.Internal$.Start$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.StartOldestChangedBuffer$](akka/cluster/singleton/ClusterSingletonManager.Internal$.StartOldestChangedBuffer$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.Stopping$](akka/cluster/singleton/ClusterSingletonManager.Internal$.Stopping$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.StoppingData](akka/cluster/singleton/ClusterSingletonManager.Internal$.StoppingData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.StoppingData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.StoppingData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.singleton.ClusterSingletonManager.Internal.StoppingData\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.TakeOver$](akka/cluster/singleton/ClusterSingletonManager.Internal$.TakeOver$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.TakeOverFromMe$](akka/cluster/singleton/ClusterSingletonManager.Internal$.TakeOverFromMe$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.TakeOverRetry](akka/cluster/singleton/ClusterSingletonManager.Internal$.TakeOverRetry.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.TakeOverRetry$](akka/cluster/singleton/ClusterSingletonManager.Internal$.TakeOverRetry$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.TakeOverRetry\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.Uninitialized$](akka/cluster/singleton/ClusterSingletonManager.Internal$.Uninitialized$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.WasOldest$](akka/cluster/singleton/ClusterSingletonManager.Internal$.WasOldest$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.WasOldestData](akka/cluster/singleton/ClusterSingletonManager.Internal$.WasOldestData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.WasOldestData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.WasOldestData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction2\<scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.WasOldestData\> implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.Younger$](akka/cluster/singleton/ClusterSingletonManager.Internal$.Younger$.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.YoungerData](akka/cluster/singleton/ClusterSingletonManager.Internal$.YoungerData.html "class in akka.cluster.singleton") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.singleton.ClusterSingletonManager.Internal$.YoungerData$](akka/cluster/singleton/ClusterSingletonManager.Internal$.YoungerData$.html "class in akka.cluster.singleton") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.List\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData\> implements Serializable
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquireLeaseFailure extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### t
			
			
			
			```
			java.lang.Throwable t
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquireLeaseFailure$ extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.cluster.singleton.ClusterSingletonManager$Internal$AcquireLeaseFailure\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquireLeaseResult extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### holdingLease
			
			
			
			```
			boolean holdingLease
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquireLeaseResult$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager$Internal$AcquireLeaseResult\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquiringLease$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquiringLeaseData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### leaseRequestInProgress
			
			
			
			```
			boolean leaseRequestInProgress
			```
			- #### singleton
			
			
			
			```
			scala.Option<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> singleton
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$AcquiringLeaseData$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$AcquiringLeaseData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$BecomingOldest$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$BecomingOldestData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### previousOldest
			
			
			
			```
			scala.collection.immutable.List<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> previousOldest
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$BecomingOldestData$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.List\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$BecomingOldestData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$Cleanup$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$DelayedMemberRemoved extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### member
			
			
			
			```
			[Member](akka/cluster/Member.html "class in akka.cluster") member
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$DelayedMemberRemoved$ extends scala.runtime.AbstractFunction1\<[Member](akka/cluster/Member.html "class in akka.cluster"),​akka.cluster.singleton.ClusterSingletonManager$Internal$DelayedMemberRemoved\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$End$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$EndData$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandingOver$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandingOverData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### handOverTo
			
			
			
			```
			scala.Option<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> handOverTo
			```
			- #### singleton
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") singleton
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandingOverData$ extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$HandingOverData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandOverDone$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandOverInProgress$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandOverRetry extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### count
			
			
			
			```
			int count
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandOverRetry$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager$Internal$HandOverRetry\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$HandOverToMe$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$LeaseLost extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### reason
			
			
			
			```
			scala.Option<java.lang.Throwable> reason
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$LeaseLost$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$LeaseLost\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$LeaseRetry$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$Oldest$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$GetNext$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$InitialOldestState extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### oldest
			
			
			
			```
			scala.collection.immutable.List<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> oldest
			```
			- #### safeToBeOldest
			
			
			
			```
			boolean safeToBeOldest
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$InitialOldestState$ extends scala.runtime.AbstractFunction2\<scala.collection.immutable.List\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$InitialOldestState\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$OldestChanged extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### oldest
			
			
			
			```
			scala.Option<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> oldest
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$OldestChanged$ extends scala.runtime.AbstractFunction1\<scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$OldestChangedBuffer$OldestChanged\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### singleton
			
			
			
			```
			scala.Option<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> singleton
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$OldestData$ extends scala.runtime.AbstractFunction1\<scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$OldestData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$ReleaseLeaseFailure extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### t
			
			
			
			```
			java.lang.Throwable t
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$ReleaseLeaseFailure$ extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.cluster.singleton.ClusterSingletonManager$Internal$ReleaseLeaseFailure\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$ReleaseLeaseResult extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### released
			
			
			
			```
			boolean released
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$ReleaseLeaseResult$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager$Internal$ReleaseLeaseResult\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$SelfExiting$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$Start$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$StartOldestChangedBuffer$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$Stopping$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$StoppingData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### singleton
			
			
			
			```
			[ActorRef](akka/actor/ActorRef.html "class in akka.actor") singleton
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$StoppingData$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.cluster.singleton.ClusterSingletonManager$Internal$StoppingData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$TakeOver$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$TakeOverFromMe$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$TakeOverRetry extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### count
			
			
			
			```
			int count
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$TakeOverRetry$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager$Internal$TakeOverRetry\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$Uninitialized$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$WasOldest$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$WasOldestData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### newOldestOption
			
			
			
			```
			scala.Option<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> newOldestOption
			```
			- #### singleton
			
			
			
			```
			scala.Option<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> singleton
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$WasOldestData$ extends scala.runtime.AbstractFunction2\<scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​scala.Option\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$WasOldestData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$Younger$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$YoungerData extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### oldest
			
			
			
			```
			scala.collection.immutable.List<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")> oldest
			```
	- ### Class akka.cluster.singleton.ClusterSingletonManager$Internal$YoungerData$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.List\<[UniqueAddress](akka/cluster/UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager$Internal$YoungerData\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.cluster.singleton.ClusterSingletonManagerIsStuck](akka/cluster/singleton/ClusterSingletonManagerIsStuck.html "class in akka.cluster.singleton") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
- ## Package akka.cluster.typed

	- ### Class [akka.cluster.typed.Down](akka/cluster/typed/Down.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Down$](akka/cluster/typed/Down$.html "class in akka.cluster.typed") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[Down](akka/cluster/typed/Down.html "class in akka.cluster.typed")\> implements Serializable
	- ### Class [akka.cluster.typed.GetCurrentState](akka/cluster/typed/GetCurrentState.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.GetCurrentState$](akka/cluster/typed/GetCurrentState$.html "class in akka.cluster.typed") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[ClusterEvent.CurrentClusterState](akka/cluster/ClusterEvent.CurrentClusterState.html "class in akka.cluster")\>,​[GetCurrentState](akka/cluster/typed/GetCurrentState.html "class in akka.cluster.typed")\> implements Serializable
	- ### Class [akka.cluster.typed.Join](akka/cluster/typed/Join.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Join$](akka/cluster/typed/Join$.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.JoinSeedNodes](akka/cluster/typed/JoinSeedNodes.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.JoinSeedNodes$](akka/cluster/typed/JoinSeedNodes$.html "class in akka.cluster.typed") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[Address](akka/actor/Address.html "class in akka.actor")\>,​[JoinSeedNodes](akka/cluster/typed/JoinSeedNodes.html "class in akka.cluster.typed")\> implements Serializable
	- ### Class [akka.cluster.typed.Leave](akka/cluster/typed/Leave.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Leave$](akka/cluster/typed/Leave$.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.PrepareForFullClusterShutdown$](akka/cluster/typed/PrepareForFullClusterShutdown$.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.SelfRemoved](akka/cluster/typed/SelfRemoved.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.SelfRemoved$](akka/cluster/typed/SelfRemoved$.html "class in akka.cluster.typed") extends scala.runtime.AbstractFunction1\<[MemberStatus](akka/cluster/MemberStatus.html "class in akka.cluster"),​[SelfRemoved](akka/cluster/typed/SelfRemoved.html "class in akka.cluster.typed")\> implements Serializable
	- ### Class [akka.cluster.typed.SelfUp](akka/cluster/typed/SelfUp.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.SelfUp$](akka/cluster/typed/SelfUp$.html "class in akka.cluster.typed") extends scala.runtime.AbstractFunction1\<[ClusterEvent.CurrentClusterState](akka/cluster/ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](akka/cluster/typed/SelfUp.html "class in akka.cluster.typed")\> implements Serializable
	- ### Class [akka.cluster.typed.SetAppVersionLater](akka/cluster/typed/SetAppVersionLater.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.SetAppVersionLater$](akka/cluster/typed/SetAppVersionLater$.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Subscribe](akka/cluster/typed/Subscribe.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Subscribe$](akka/cluster/typed/Subscribe$.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Unsubscribe](akka/cluster/typed/Unsubscribe.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.Unsubscribe$](akka/cluster/typed/Unsubscribe$.html "class in akka.cluster.typed") extends java.lang.Object implements Serializable
- ## Package akka.cluster.typed.internal.protobuf

	- ### Class [akka.cluster.typed.internal.protobuf.ClusterMessages.PubSubMessagePublished](akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") message_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry](akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### actorRef\_
			
			
			
			```
			java.lang.Object actorRef_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### createdTimestamp\_
			
			
			
			```
			long createdTimestamp_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### systemUid\_
			
			
			
			```
			long systemUid_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.Ack](akka/cluster/typed/internal/protobuf/ReliableDelivery.Ack.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### confirmedSeqNr\_
			
			
			
			```
			long confirmedSeqNr_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.Cleanup](akka/cluster/typed/internal/protobuf/ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### qualifiers\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList qualifiers_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed](akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### qualifier\_
			
			
			
			```
			java.lang.Object qualifier_
			```
			- #### seqNr\_
			
			
			
			```
			long seqNr_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent](akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### ack\_
			
			
			
			```
			boolean ack_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### firstChunk\_
			
			
			
			```
			boolean firstChunk_
			```
			- #### lastChunk\_
			
			
			
			```
			boolean lastChunk_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") message_
			```
			- #### qualifier\_
			
			
			
			```
			java.lang.Object qualifier_
			```
			- #### seqNr\_
			
			
			
			```
			long seqNr_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.RegisterConsumer](akka/cluster/typed/internal/protobuf/ReliableDelivery.RegisterConsumer.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### consumerControllerRef\_
			
			
			
			```
			java.lang.Object consumerControllerRef_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.Request](akka/cluster/typed/internal/protobuf/ReliableDelivery.Request.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### confirmedSeqNr\_
			
			
			
			```
			long confirmedSeqNr_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### requestUpToSeqNr\_
			
			
			
			```
			long requestUpToSeqNr_
			```
			- #### supportResend\_
			
			
			
			```
			boolean supportResend_
			```
			- #### viaTimeout\_
			
			
			
			```
			boolean viaTimeout_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.Resend](akka/cluster/typed/internal/protobuf/ReliableDelivery.Resend.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### fromSeqNr\_
			
			
			
			```
			long fromSeqNr_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.SequencedMessage](akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### ack\_
			
			
			
			```
			boolean ack_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### first\_
			
			
			
			```
			boolean first_
			```
			- #### firstChunk\_
			
			
			
			```
			boolean firstChunk_
			```
			- #### lastChunk\_
			
			
			
			```
			boolean lastChunk_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") message_
			```
			- #### producerControllerRef\_
			
			
			
			```
			java.lang.Object producerControllerRef_
			```
			- #### producerId\_
			
			
			
			```
			java.lang.Object producerId_
			```
			- #### seqNr\_
			
			
			
			```
			long seqNr_
			```
	- ### Class [akka.cluster.typed.internal.protobuf.ReliableDelivery.State](akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### confirmed\_
			
			
			
			```
			java.util.List<[ReliableDelivery.Confirmed](akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")> confirmed_
			```
			- #### currentSeqNr\_
			
			
			
			```
			long currentSeqNr_
			```
			- #### highestConfirmedSeqNr\_
			
			
			
			```
			long highestConfirmedSeqNr_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### unconfirmed\_
			
			
			
			```
			java.util.List<[ReliableDelivery.MessageSent](akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")> unconfirmed_
			```
- ## Package akka.cluster.typed.internal.receptionist

	- ### Class akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry extends java.lang.Object implements Serializable
	- ### Class akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry$ extends java.lang.Object implements Serializable
	- ### Class akka.cluster.typed.internal.receptionist.ClusterReceptionist.State extends java.lang.Object implements Serializable
	- ### Class akka.cluster.typed.internal.receptionist.ClusterReceptionist.State$ extends scala.runtime.AbstractFunction4\<akka.cluster.typed.internal.receptionist.ShardedServiceRegistry,​scala.collection.immutable.Map\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<?\>,​scala.collection.immutable.Set\<akka.actor.typed.internal.receptionist.AbstractServiceKey\>\>,​scala.collection.immutable.Map\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<?\>,​scala.collection.immutable.Set\<scala.Tuple2\<akka.actor.typed.internal.receptionist.AbstractServiceKey,​scala.concurrent.duration.Deadline\>\>\>,​[TypedMultiMap](akka/util/TypedMultiMap.html "class in akka.util")\<akka.actor.typed.internal.receptionist.AbstractServiceKey,​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.State\> implements Serializable
	- ### Class [akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings$](akka/cluster/typed/internal/receptionist/ClusterReceptionistSettings$.html "class in akka.cluster.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.internal.receptionist.ServiceRegistry$](akka/cluster/typed/internal/receptionist/ServiceRegistry$.html "class in akka.cluster.typed.internal.receptionist") extends java.lang.Object implements Serializable
	- ### Class [akka.cluster.typed.internal.receptionist.ShardedServiceRegistry$](akka/cluster/typed/internal/receptionist/ShardedServiceRegistry$.html "class in akka.cluster.typed.internal.receptionist") extends java.lang.Object implements Serializable
- ## Package akka.coordination.lease

	- ### Class [akka.coordination.lease.LeaseException](akka/coordination/lease/LeaseException.html "class in akka.coordination.lease") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.coordination.lease.LeaseTimeoutException](akka/coordination/lease/LeaseTimeoutException.html "class in akka.coordination.lease") extends [LeaseException](akka/coordination/lease/LeaseException.html "class in akka.coordination.lease") implements Serializable
- ## Package akka.discovery

	- ### Class [akka.discovery.Lookup$](akka/discovery/Lookup$.html "class in akka.discovery") extends java.lang.Object implements Serializable
	- ### Class [akka.discovery.ServiceDiscovery.DiscoveryTimeoutException](akka/discovery/ServiceDiscovery.DiscoveryTimeoutException.html "class in akka.discovery") extends java.lang.RuntimeException implements Serializable
- ## Package akka.dispatch

	- ### Class [akka.dispatch.AbstractNodeQueue](akka/dispatch/AbstractNodeQueue.html "class in akka.dispatch") extends java.util.concurrent.atomic.AtomicReference\<[AbstractNodeQueue.Node](akka/dispatch/AbstractNodeQueue.Node.html "class in akka.dispatch")\<[T](akka/dispatch/AbstractNodeQueue.html "type parameter in AbstractNodeQueue")\>\> implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### \_tailDoNotCallMeDirectly
			
			
			
			```
			[AbstractNodeQueue.Node](akka/dispatch/AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](akka/dispatch/AbstractNodeQueue.html "type parameter in AbstractNodeQueue")> _tailDoNotCallMeDirectly
			```
	- ### Class [akka.dispatch.BoundedControlAwareMailbox](akka/dispatch/BoundedControlAwareMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.BoundedControlAwareMailbox.MessageQueue](akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.BoundedControlAwareMailbox$](akka/dispatch/BoundedControlAwareMailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.BoundedDequeBasedMailbox](akka/dispatch/BoundedDequeBasedMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.BoundedDequeBasedMailbox.MessageQueue](akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch") extends java.util.concurrent.LinkedBlockingDeque\<[Envelope](akka/dispatch/Envelope.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.BoundedDequeBasedMailbox$](akka/dispatch/BoundedDequeBasedMailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.BoundedMailbox](akka/dispatch/BoundedMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.BoundedMailbox.MessageQueue](akka/dispatch/BoundedMailbox.MessageQueue.html "class in akka.dispatch") extends java.util.concurrent.LinkedBlockingQueue\<[Envelope](akka/dispatch/Envelope.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.BoundedMailbox$](akka/dispatch/BoundedMailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class akka.dispatch.CachingConfig.StringPathEntry extends java.lang.Object implements Serializable
	- ### Class akka.dispatch.CachingConfig.StringPathEntry$ extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​com.typesafe.config.Config,​java.lang.String,​akka.dispatch.CachingConfig.StringPathEntry\> implements Serializable
	- ### Class akka.dispatch.CachingConfig.ValuePathEntry extends java.lang.Object implements Serializable
	- ### Class akka.dispatch.CachingConfig.ValuePathEntry$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​com.typesafe.config.Config,​akka.dispatch.CachingConfig.ValuePathEntry\> implements Serializable
	- ### Class [akka.dispatch.DefaultDispatcherPrerequisites$](akka/dispatch/DefaultDispatcherPrerequisites$.html "class in akka.dispatch") extends scala.runtime.AbstractFunction7\<java.util.concurrent.ThreadFactory,​[EventStream](akka/event/EventStream.html "class in akka.event"),​[Scheduler](akka/actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](akka/actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](akka/actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option\<scala.concurrent.ExecutionContext\>,​akka.dispatch.DefaultDispatcherPrerequisites\> implements Serializable
	- ### Class [akka.dispatch.Envelope](akka/dispatch/Envelope.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.Envelope$](akka/dispatch/Envelope$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask](akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinTask.html "class in akka.dispatch") extends java.util.concurrent.ForkJoinTask\<scala.runtime.BoxedUnit\> implements Serializable
	- ### Class [akka.dispatch.Mailbox$](akka/dispatch/Mailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.MonitorableThreadFactory](akka/dispatch/MonitorableThreadFactory.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.MonitorableThreadFactory$](akka/dispatch/MonitorableThreadFactory$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.NodeMessageQueue](akka/dispatch/NodeMessageQueue.html "class in akka.dispatch") extends [AbstractNodeQueue](akka/dispatch/AbstractNodeQueue.html "class in akka.dispatch")\<[Envelope](akka/dispatch/Envelope.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.NonBlockingBoundedMailbox](akka/dispatch/NonBlockingBoundedMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.NonBlockingBoundedMailbox$](akka/dispatch/NonBlockingBoundedMailbox$.html "class in akka.dispatch") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[NonBlockingBoundedMailbox](akka/dispatch/NonBlockingBoundedMailbox.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.SingleConsumerOnlyUnboundedMailbox](akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.SingleConsumerOnlyUnboundedMailbox$](akka/dispatch/SingleConsumerOnlyUnboundedMailbox$.html "class in akka.dispatch") extends scala.runtime.AbstractFunction0\<[SingleConsumerOnlyUnboundedMailbox](akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.TaskInvocation](akka/dispatch/TaskInvocation.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.TaskInvocation$](akka/dispatch/TaskInvocation$.html "class in akka.dispatch") extends scala.runtime.AbstractFunction3\<[EventStream](akka/event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0\<scala.runtime.BoxedUnit\>,​[TaskInvocation](akka/dispatch/TaskInvocation.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.ThreadPoolConfig](akka/dispatch/ThreadPoolConfig.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.ThreadPoolConfig$](akka/dispatch/ThreadPoolConfig$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.ThreadPoolConfigBuilder](akka/dispatch/ThreadPoolConfigBuilder.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.ThreadPoolConfigBuilder$](akka/dispatch/ThreadPoolConfigBuilder$.html "class in akka.dispatch") extends scala.runtime.AbstractFunction1\<[ThreadPoolConfig](akka/dispatch/ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](akka/dispatch/ThreadPoolConfigBuilder.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.UnboundedControlAwareMailbox](akka/dispatch/UnboundedControlAwareMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedControlAwareMailbox.MessageQueue](akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedControlAwareMailbox$](akka/dispatch/UnboundedControlAwareMailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedDequeBasedMailbox](akka/dispatch/UnboundedDequeBasedMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedDequeBasedMailbox.MessageQueue](akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch") extends java.util.concurrent.LinkedBlockingDeque\<[Envelope](akka/dispatch/Envelope.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.UnboundedDequeBasedMailbox$](akka/dispatch/UnboundedDequeBasedMailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedMailbox](akka/dispatch/UnboundedMailbox.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedMailbox.MessageQueue](akka/dispatch/UnboundedMailbox.MessageQueue.html "class in akka.dispatch") extends java.util.concurrent.ConcurrentLinkedQueue\<[Envelope](akka/dispatch/Envelope.html "class in akka.dispatch")\> implements Serializable
	- ### Class [akka.dispatch.UnboundedMailbox$](akka/dispatch/UnboundedMailbox$.html "class in akka.dispatch") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.UnboundedPriorityMailbox.MessageQueue](akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch") extends java.util.concurrent.PriorityBlockingQueue\<[Envelope](akka/dispatch/Envelope.html "class in akka.dispatch")\> implements Serializable
- ## Package akka.dispatch.sysmsg

	- ### Class [akka.dispatch.sysmsg.Create$](akka/dispatch/sysmsg/Create$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction1\<scala.Option\<[ActorInitializationException](akka/actor/ActorInitializationException.html "class in akka.actor")\>,​akka.dispatch.sysmsg.Create\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.DeathWatchNotification$](akka/dispatch/sysmsg/DeathWatchNotification$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.dispatch.sysmsg.DeathWatchNotification\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Failed$](akka/dispatch/sysmsg/Failed$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object,​akka.dispatch.sysmsg.Failed\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.NoMessage$](akka/dispatch/sysmsg/NoMessage$.html "class in akka.dispatch.sysmsg") extends java.lang.Object implements Serializable
	- ### Class [akka.dispatch.sysmsg.Recreate$](akka/dispatch/sysmsg/Recreate$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Resume$](akka/dispatch/sysmsg/Resume$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.dispatch.sysmsg.Resume\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Supervise$](akka/dispatch/sysmsg/Supervise$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​akka.dispatch.sysmsg.Supervise\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Suspend$](akka/dispatch/sysmsg/Suspend$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction0\<akka.dispatch.sysmsg.Suspend\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Terminate$](akka/dispatch/sysmsg/Terminate$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction0\<akka.dispatch.sysmsg.Terminate\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Unwatch$](akka/dispatch/sysmsg/Unwatch$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.dispatch.sysmsg.Unwatch\> implements Serializable
	- ### Class [akka.dispatch.sysmsg.Watch$](akka/dispatch/sysmsg/Watch$.html "class in akka.dispatch.sysmsg") extends scala.runtime.AbstractFunction2\<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch\> implements Serializable
- ## Package akka.event

	- ### Class akka.event.ActorClassificationUnsubscriber.Register extends java.lang.Object implements Serializable
	- ### Class akka.event.ActorClassificationUnsubscriber.Register$ extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​akka.event.ActorClassificationUnsubscriber.Register\> implements Serializable
	- ### Class akka.event.ActorClassificationUnsubscriber.Unregister extends java.lang.Object implements Serializable
	- ### Class akka.event.ActorClassificationUnsubscriber.Unregister$ extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​akka.event.ActorClassificationUnsubscriber.Unregister\> implements Serializable
	- ### Class [akka.event.ActorWithLogClass$](akka/event/ActorWithLogClass$.html "class in akka.event") extends scala.runtime.AbstractFunction2\<[Actor](akka/actor/Actor.html "interface in akka.actor"),​java.lang.Class\<?\>,​akka.event.ActorWithLogClass\> implements Serializable
	- ### Class akka.event.EventStreamUnsubscriber.Register extends java.lang.Object implements Serializable
	- ### Class akka.event.EventStreamUnsubscriber.Register$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.event.EventStreamUnsubscriber.Register\> implements Serializable
	- ### Class akka.event.EventStreamUnsubscriber.UnregisterIfNoMoreSubscribedChannels extends java.lang.Object implements Serializable
	- ### Class akka.event.EventStreamUnsubscriber.UnregisterIfNoMoreSubscribedChannels$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.event.EventStreamUnsubscriber.UnregisterIfNoMoreSubscribedChannels\> implements Serializable
	- ### Class [akka.event.Logging.Debug](akka/event/Logging.Debug.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Debug$](akka/event/Logging.Debug$.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Debug2](akka/event/Logging.Debug2.html "class in akka.event") extends [Logging.Debug](akka/event/Logging.Debug.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Debug3](akka/event/Logging.Debug3.html "class in akka.event") extends [Logging.Debug2](akka/event/Logging.Debug2.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Error](akka/event/Logging.Error.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Error$](akka/event/Logging.Error$.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Error$.NoCause$](akka/event/Logging.Error$.NoCause$.html "class in akka.event") extends java.lang.Throwable implements Serializable
	- ### Class [akka.event.Logging.Error2](akka/event/Logging.Error2.html "class in akka.event") extends [Logging.Error](akka/event/Logging.Error.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Error2$](akka/event/Logging.Error2$.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Error3](akka/event/Logging.Error3.html "class in akka.event") extends [Logging.Error2](akka/event/Logging.Error2.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Info](akka/event/Logging.Info.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Info$](akka/event/Logging.Info$.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Info2](akka/event/Logging.Info2.html "class in akka.event") extends [Logging.Info](akka/event/Logging.Info.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Info3](akka/event/Logging.Info3.html "class in akka.event") extends [Logging.Info2](akka/event/Logging.Info2.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.InitializeLogger](akka/event/Logging.InitializeLogger.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.InitializeLogger$](akka/event/Logging.InitializeLogger$.html "class in akka.event") extends scala.runtime.AbstractFunction1\<[LoggingBus](akka/event/LoggingBus.html "interface in akka.event"),​[Logging.InitializeLogger](akka/event/Logging.InitializeLogger.html "class in akka.event")\> implements Serializable
	- ### Class [akka.event.Logging.LogEventException](akka/event/Logging.LogEventException.html "class in akka.event") extends java.lang.Throwable implements Serializable
	- ### Class [akka.event.Logging.LoggerException](akka/event/Logging.LoggerException.html "class in akka.event") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.event.Logging.LoggerInitializationException](akka/event/Logging.LoggerInitializationException.html "class in akka.event") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.event.Logging.LoggerInitialized$](akka/event/Logging.LoggerInitialized$.html "class in akka.event") extends [Logging.LoggerInitialized](akka/event/Logging.LoggerInitialized.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event") extends scala.AnyVal implements Serializable
	- ### Class [akka.event.Logging.LogLevel$](akka/event/Logging.LogLevel$.html "class in akka.event") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event")\> implements Serializable
	- ### Class [akka.event.Logging.Warning](akka/event/Logging.Warning.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Warning$](akka/event/Logging.Warning$.html "class in akka.event") extends java.lang.Object implements Serializable
	- ### Class [akka.event.Logging.Warning2](akka/event/Logging.Warning2.html "class in akka.event") extends [Logging.Warning](akka/event/Logging.Warning.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Warning3](akka/event/Logging.Warning3.html "class in akka.event") extends [Logging.Warning2](akka/event/Logging.Warning2.html "class in akka.event") implements Serializable
	- ### Class [akka.event.Logging.Warning4](akka/event/Logging.Warning4.html "class in akka.event") extends [Logging.Warning2](akka/event/Logging.Warning2.html "class in akka.event") implements Serializable
	- ### Class akka.event.Logging$Error$NoCause$ extends java.lang.Throwable implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.io

	- ### Class [akka.io.Dns.Resolve](akka/io/Dns.Resolve.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Dns.Resolve$](akka/io/Dns.Resolve$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Dns.Resolve](akka/io/Dns.Resolve.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Dns.Resolved](akka/io/Dns.Resolved.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Dns.Resolved$](akka/io/Dns.Resolved$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Inet.SO$.ReceiveBufferSize](akka/io/Inet.SO$.ReceiveBufferSize.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Inet.SO$.ReceiveBufferSize$](akka/io/Inet.SO$.ReceiveBufferSize$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet.SO.ReceiveBufferSize\> implements Serializable
	- ### Class [akka.io.Inet.SO$.ReuseAddress](akka/io/Inet.SO$.ReuseAddress.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Inet.SO$.ReuseAddress$](akka/io/Inet.SO$.ReuseAddress$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet.SO.ReuseAddress\> implements Serializable
	- ### Class [akka.io.Inet.SO$.SendBufferSize](akka/io/Inet.SO$.SendBufferSize.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Inet.SO$.SendBufferSize$](akka/io/Inet.SO$.SendBufferSize$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet.SO.SendBufferSize\> implements Serializable
	- ### Class [akka.io.Inet.SO$.TrafficClass](akka/io/Inet.SO$.TrafficClass.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Inet.SO$.TrafficClass$](akka/io/Inet.SO$.TrafficClass$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet.SO.TrafficClass\> implements Serializable
	- ### Class akka.io.Inet$SO$ReceiveBufferSize extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### size
			
			
			
			```
			int size
			```
	- ### Class akka.io.Inet$SO$ReceiveBufferSize$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet$SO$ReceiveBufferSize\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.Inet$SO$ReuseAddress extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### on
			
			
			
			```
			boolean on
			```
	- ### Class akka.io.Inet$SO$ReuseAddress$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet$SO$ReuseAddress\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.Inet$SO$SendBufferSize extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### size
			
			
			
			```
			int size
			```
	- ### Class akka.io.Inet$SO$SendBufferSize$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet$SO$SendBufferSize\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.Inet$SO$TrafficClass extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### tc
			
			
			
			```
			int tc
			```
	- ### Class akka.io.Inet$SO$TrafficClass$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Inet$SO$TrafficClass\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.SelectionHandler.ChannelAcceptable$ extends java.lang.Object implements Serializable
	- ### Class akka.io.SelectionHandler.ChannelConnectable$ extends java.lang.Object implements Serializable
	- ### Class akka.io.SelectionHandler.ChannelReadable$ extends java.lang.Object implements Serializable
	- ### Class akka.io.SelectionHandler.ChannelWritable$ extends java.lang.Object implements Serializable
	- ### Class akka.io.SelectionHandler.Retry extends java.lang.Object implements Serializable
	- ### Class akka.io.SelectionHandler.Retry$ extends scala.runtime.AbstractFunction2\<akka.io.SelectionHandler.WorkerForCommand,​java.lang.Object,​akka.io.SelectionHandler.Retry\> implements Serializable
	- ### Class akka.io.SelectionHandler.WorkerForCommand extends java.lang.Object implements Serializable
	- ### Class akka.io.SelectionHandler.WorkerForCommand$ extends scala.runtime.AbstractFunction3\<akka.io.SelectionHandler.HasFailureMessage,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.Function1\<[ChannelRegistry](akka/io/ChannelRegistry.html "interface in akka.io"),​[Props](akka/actor/Props.html "class in akka.actor")\>,​akka.io.SelectionHandler.WorkerForCommand\> implements Serializable
	- ### Class [akka.io.SimpleDnsCache.CacheEntry$](akka/io/SimpleDnsCache.CacheEntry$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Abort$](akka/io/Tcp.Abort$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Aborted$](akka/io/Tcp.Aborted$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Bind](akka/io/Tcp.Bind.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Bind$](akka/io/Tcp.Bind$.html "class in akka.io") extends scala.runtime.AbstractFunction5\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.net.InetSocketAddress,​java.lang.Object,​scala.collection.immutable.Iterable\<[Inet.SocketOption](akka/io/Inet.SocketOption.html "interface in akka.io")\>,​java.lang.Object,​[Tcp.Bind](akka/io/Tcp.Bind.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.Bound](akka/io/Tcp.Bound.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Bound$](akka/io/Tcp.Bound$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.net.InetSocketAddress,​[Tcp.Bound](akka/io/Tcp.Bound.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.Close$](akka/io/Tcp.Close$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Closed$](akka/io/Tcp.Closed$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.CommandFailed](akka/io/Tcp.CommandFailed.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.CommandFailed$](akka/io/Tcp.CommandFailed$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<[Tcp.Command](akka/io/Tcp.Command.html "interface in akka.io"),​[Tcp.CommandFailed](akka/io/Tcp.CommandFailed.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.CompoundWrite](akka/io/Tcp.CompoundWrite.html "class in akka.io") extends [Tcp.WriteCommand](akka/io/Tcp.WriteCommand.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Tcp.CompoundWrite$](akka/io/Tcp.CompoundWrite$.html "class in akka.io") extends scala.runtime.AbstractFunction2\<[Tcp.SimpleWriteCommand](akka/io/Tcp.SimpleWriteCommand.html "class in akka.io"),​[Tcp.WriteCommand](akka/io/Tcp.WriteCommand.html "class in akka.io"),​[Tcp.CompoundWrite](akka/io/Tcp.CompoundWrite.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.ConfirmedClose$](akka/io/Tcp.ConfirmedClose$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.ConfirmedClosed$](akka/io/Tcp.ConfirmedClosed$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Connect](akka/io/Tcp.Connect.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Connect$](akka/io/Tcp.Connect$.html "class in akka.io") extends scala.runtime.AbstractFunction5\<java.net.InetSocketAddress,​scala.Option\<java.net.InetSocketAddress\>,​scala.collection.immutable.Iterable\<[Inet.SocketOption](akka/io/Inet.SocketOption.html "interface in akka.io")\>,​scala.Option\<scala.concurrent.duration.FiniteDuration\>,​java.lang.Object,​[Tcp.Connect](akka/io/Tcp.Connect.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.Connected](akka/io/Tcp.Connected.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Connected$](akka/io/Tcp.Connected$.html "class in akka.io") extends scala.runtime.AbstractFunction2\<java.net.InetSocketAddress,​java.net.InetSocketAddress,​[Tcp.Connected](akka/io/Tcp.Connected.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.ErrorClosed](akka/io/Tcp.ErrorClosed.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.ErrorClosed$](akka/io/Tcp.ErrorClosed$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Tcp.ErrorClosed](akka/io/Tcp.ErrorClosed.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.NoAck](akka/io/Tcp.NoAck.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.NoAck$](akka/io/Tcp.NoAck$.html "class in akka.io") extends [Tcp.NoAck](akka/io/Tcp.NoAck.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Tcp.PeerClosed$](akka/io/Tcp.PeerClosed$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Received](akka/io/Tcp.Received.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Received$](akka/io/Tcp.Received$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<[ByteString](akka/util/ByteString.html "class in akka.util"),​[Tcp.Received](akka/io/Tcp.Received.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.Register](akka/io/Tcp.Register.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Register$](akka/io/Tcp.Register$.html "class in akka.io") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[Tcp.Register](akka/io/Tcp.Register.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.ResumeAccepting](akka/io/Tcp.ResumeAccepting.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.ResumeAccepting$](akka/io/Tcp.ResumeAccepting$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Tcp.ResumeAccepting](akka/io/Tcp.ResumeAccepting.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.ResumeReading$](akka/io/Tcp.ResumeReading$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.ResumeWriting$](akka/io/Tcp.ResumeWriting$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.SO$.KeepAlive](akka/io/Tcp.SO$.KeepAlive.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.SO$.KeepAlive$](akka/io/Tcp.SO$.KeepAlive$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Tcp.SO.KeepAlive\> implements Serializable
	- ### Class [akka.io.Tcp.SO$.OOBInline](akka/io/Tcp.SO$.OOBInline.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.SO$.OOBInline$](akka/io/Tcp.SO$.OOBInline$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Tcp.SO.OOBInline\> implements Serializable
	- ### Class [akka.io.Tcp.SO$.TcpNoDelay](akka/io/Tcp.SO$.TcpNoDelay.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.SO$.TcpNoDelay$](akka/io/Tcp.SO$.TcpNoDelay$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Tcp.SO.TcpNoDelay\> implements Serializable
	- ### Class [akka.io.Tcp.SuspendReading$](akka/io/Tcp.SuspendReading$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Unbind$](akka/io/Tcp.Unbind$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Unbound$](akka/io/Tcp.Unbound$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.Write](akka/io/Tcp.Write.html "class in akka.io") extends [Tcp.SimpleWriteCommand](akka/io/Tcp.SimpleWriteCommand.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Tcp.Write$](akka/io/Tcp.Write$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Tcp.WriteFile](akka/io/Tcp.WriteFile.html "class in akka.io") extends [Tcp.SimpleWriteCommand](akka/io/Tcp.SimpleWriteCommand.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Tcp.WriteFile$](akka/io/Tcp.WriteFile$.html "class in akka.io") extends scala.runtime.AbstractFunction4\<java.lang.String,​java.lang.Object,​java.lang.Object,​[Tcp.Event](akka/io/Tcp.Event.html "interface in akka.io"),​[Tcp.WriteFile](akka/io/Tcp.WriteFile.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.WritePath](akka/io/Tcp.WritePath.html "class in akka.io") extends [Tcp.SimpleWriteCommand](akka/io/Tcp.SimpleWriteCommand.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Tcp.WritePath$](akka/io/Tcp.WritePath$.html "class in akka.io") extends scala.runtime.AbstractFunction4\<java.nio.file.Path,​java.lang.Object,​java.lang.Object,​[Tcp.Event](akka/io/Tcp.Event.html "interface in akka.io"),​[Tcp.WritePath](akka/io/Tcp.WritePath.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Tcp.WritingResumed$](akka/io/Tcp.WritingResumed$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class akka.io.Tcp$SO$KeepAlive extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### on
			
			
			
			```
			boolean on
			```
	- ### Class akka.io.Tcp$SO$KeepAlive$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Tcp$SO$KeepAlive\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.Tcp$SO$OOBInline extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### on
			
			
			
			```
			boolean on
			```
	- ### Class akka.io.Tcp$SO$OOBInline$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Tcp$SO$OOBInline\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.Tcp$SO$TcpNoDelay extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### on
			
			
			
			```
			boolean on
			```
	- ### Class akka.io.Tcp$SO$TcpNoDelay$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Tcp$SO$TcpNoDelay\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.io.TcpConnection.CloseInformation extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpConnection.CloseInformation$ extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Set\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​[Tcp.Event](akka/io/Tcp.Event.html "interface in akka.io"),​akka.io.TcpConnection.CloseInformation\> implements Serializable
	- ### Class akka.io.TcpConnection.ConnectionInfo extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpConnection.ConnectionInfo$ extends scala.runtime.AbstractFunction4\<[ChannelRegistration](akka/io/ChannelRegistration.html "interface in akka.io"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.io.TcpConnection.ConnectionInfo\> implements Serializable
	- ### Class akka.io.TcpConnection.Unregistered$ extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpConnection.UpdatePendingWriteAndThen extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpConnection.UpdatePendingWriteAndThen$ extends scala.runtime.AbstractFunction2\<akka.io.TcpConnection.PendingWrite,​scala.Function0\<scala.runtime.BoxedUnit\>,​akka.io.TcpConnection.UpdatePendingWriteAndThen\> implements Serializable
	- ### Class akka.io.TcpConnection.WriteFileFailed extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpConnection.WriteFileFailed$ extends scala.runtime.AbstractFunction1\<java.io.IOException,​akka.io.TcpConnection.WriteFileFailed\> implements Serializable
	- ### Class akka.io.TcpListener.FailedRegisterIncoming extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpListener.FailedRegisterIncoming$ extends scala.runtime.AbstractFunction1\<java.nio.channels.SocketChannel,​akka.io.TcpListener.FailedRegisterIncoming\> implements Serializable
	- ### Class akka.io.TcpListener.RegisterIncoming extends java.lang.Object implements Serializable
	- ### Class akka.io.TcpListener.RegisterIncoming$ extends scala.runtime.AbstractFunction1\<java.nio.channels.SocketChannel,​akka.io.TcpListener.RegisterIncoming\> implements Serializable
	- ### Class [akka.io.Udp.Bind](akka/io/Udp.Bind.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Bind$](akka/io/Udp.Bind$.html "class in akka.io") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.net.InetSocketAddress,​scala.collection.immutable.Iterable\<[Inet.SocketOption](akka/io/Inet.SocketOption.html "interface in akka.io")\>,​[Udp.Bind](akka/io/Udp.Bind.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Udp.Bound](akka/io/Udp.Bound.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Bound$](akka/io/Udp.Bound$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.net.InetSocketAddress,​[Udp.Bound](akka/io/Udp.Bound.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Udp.CommandFailed](akka/io/Udp.CommandFailed.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.CommandFailed$](akka/io/Udp.CommandFailed$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<[Udp.Command](akka/io/Udp.Command.html "interface in akka.io"),​[Udp.CommandFailed](akka/io/Udp.CommandFailed.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Udp.NoAck](akka/io/Udp.NoAck.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.NoAck$](akka/io/Udp.NoAck$.html "class in akka.io") extends [Udp.NoAck](akka/io/Udp.NoAck.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Udp.Received](akka/io/Udp.Received.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Received$](akka/io/Udp.Received$.html "class in akka.io") extends scala.runtime.AbstractFunction2\<[ByteString](akka/util/ByteString.html "class in akka.util"),​java.net.InetSocketAddress,​[Udp.Received](akka/io/Udp.Received.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.Udp.ResumeReading$](akka/io/Udp.ResumeReading$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Send](akka/io/Udp.Send.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Send$](akka/io/Udp.Send$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.SimpleSender](akka/io/Udp.SimpleSender.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.SimpleSender$](akka/io/Udp.SimpleSender$.html "class in akka.io") extends [Udp.SimpleSender](akka/io/Udp.SimpleSender.html "class in akka.io") implements Serializable
	- ### Class [akka.io.Udp.SimpleSenderReady$](akka/io/Udp.SimpleSenderReady$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.SO$.Broadcast](akka/io/Udp.SO$.Broadcast.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.SO$.Broadcast$](akka/io/Udp.SO$.Broadcast$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Udp.SO.Broadcast\> implements Serializable
	- ### Class [akka.io.Udp.SuspendReading$](akka/io/Udp.SuspendReading$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Unbind$](akka/io/Udp.Unbind$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.Udp.Unbound$](akka/io/Udp.Unbound$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class akka.io.Udp$SO$Broadcast extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### on
			
			
			
			```
			boolean on
			```
	- ### Class akka.io.Udp$SO$Broadcast$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.Udp$SO$Broadcast\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.io.UdpConnected.CommandFailed](akka/io/UdpConnected.CommandFailed.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.CommandFailed$](akka/io/UdpConnected.CommandFailed$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<[UdpConnected.Command](akka/io/UdpConnected.Command.html "interface in akka.io"),​[UdpConnected.CommandFailed](akka/io/UdpConnected.CommandFailed.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.UdpConnected.Connect](akka/io/UdpConnected.Connect.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.Connect$](akka/io/UdpConnected.Connect$.html "class in akka.io") extends scala.runtime.AbstractFunction4\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.net.InetSocketAddress,​scala.Option\<java.net.InetSocketAddress\>,​scala.collection.immutable.Iterable\<[Inet.SocketOption](akka/io/Inet.SocketOption.html "interface in akka.io")\>,​[UdpConnected.Connect](akka/io/UdpConnected.Connect.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.UdpConnected.Connected$](akka/io/UdpConnected.Connected$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.Disconnect$](akka/io/UdpConnected.Disconnect$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.Disconnected$](akka/io/UdpConnected.Disconnected$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.NoAck](akka/io/UdpConnected.NoAck.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.NoAck$](akka/io/UdpConnected.NoAck$.html "class in akka.io") extends [UdpConnected.NoAck](akka/io/UdpConnected.NoAck.html "class in akka.io") implements Serializable
	- ### Class [akka.io.UdpConnected.Received](akka/io/UdpConnected.Received.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.Received$](akka/io/UdpConnected.Received$.html "class in akka.io") extends scala.runtime.AbstractFunction1\<[ByteString](akka/util/ByteString.html "class in akka.util"),​[UdpConnected.Received](akka/io/UdpConnected.Received.html "class in akka.io")\> implements Serializable
	- ### Class [akka.io.UdpConnected.ResumeReading$](akka/io/UdpConnected.ResumeReading$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.Send](akka/io/UdpConnected.Send.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.Send$](akka/io/UdpConnected.Send$.html "class in akka.io") extends java.lang.Object implements Serializable
	- ### Class [akka.io.UdpConnected.SuspendReading$](akka/io/UdpConnected.SuspendReading$.html "class in akka.io") extends java.lang.Object implements Serializable
- ## Package akka.io.dns

	- ### Class [akka.io.dns.AAAARecord](akka/io/dns/AAAARecord.html "class in akka.io.dns") extends [ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns") implements Serializable
	- ### Class [akka.io.dns.AAAARecord$](akka/io/dns/AAAARecord$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.ARecord](akka/io/dns/ARecord.html "class in akka.io.dns") extends [ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns") implements Serializable
	- ### Class [akka.io.dns.ARecord$](akka/io/dns/ARecord$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.CachePolicy.Forever$](akka/io/dns/CachePolicy.Forever$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.CachePolicy.Never$](akka/io/dns/CachePolicy.Never$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.CachePolicy.Ttl$.TtlIsOrdered$](akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.CachePolicy$Ttl$TtlIsOrdered$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.io.dns.CNameRecord](akka/io/dns/CNameRecord.html "class in akka.io.dns") extends [ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns") implements Serializable
	- ### Class [akka.io.dns.CNameRecord$](akka/io/dns/CNameRecord$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Ip](akka/io/dns/DnsProtocol.Ip.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Ip$](akka/io/dns/DnsProtocol.Ip$.html "class in akka.io.dns") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[DnsProtocol.Ip](akka/io/dns/DnsProtocol.Ip.html "class in akka.io.dns")\> implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Resolve](akka/io/dns/DnsProtocol.Resolve.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Resolve$](akka/io/dns/DnsProtocol.Resolve$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Resolved](akka/io/dns/DnsProtocol.Resolved.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Resolved$](akka/io/dns/DnsProtocol.Resolved$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.DnsProtocol.Srv$](akka/io/dns/DnsProtocol.Srv$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.RecordClass](akka/io/dns/RecordClass.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.RecordClass$](akka/io/dns/RecordClass$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.RecordType](akka/io/dns/RecordType.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.RecordType$](akka/io/dns/RecordType$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.SRVRecord](akka/io/dns/SRVRecord.html "class in akka.io.dns") extends [ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns") implements Serializable
	- ### Class [akka.io.dns.SRVRecord$](akka/io/dns/SRVRecord$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.UnknownRecord](akka/io/dns/UnknownRecord.html "class in akka.io.dns") extends [ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns") implements Serializable
	- ### Class [akka.io.dns.UnknownRecord$](akka/io/dns/UnknownRecord$.html "class in akka.io.dns") extends java.lang.Object implements Serializable
- ## Package akka.io.dns.internal

	- ### Class akka.io.dns.internal.AsyncDnsManager.GetCache$ extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.AsyncDnsResolver.ResolveFailedException extends java.lang.Exception implements Serializable
	- ### Class akka.io.dns.internal.AsyncDnsResolver.ResolveFailedException$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.io.dns.internal.AsyncDnsResolver.ResolveFailedException\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Answer extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Answer$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​scala.collection.immutable.Seq\<[ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns")\>,​scala.collection.immutable.Seq\<[ResourceRecord](akka/io/dns/ResourceRecord.html "class in akka.io.dns")\>,​akka.io.dns.internal.DnsClient.Answer\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Dropped extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Dropped$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.io.dns.internal.DnsClient.Dropped\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.DropRequest extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.DropRequest$ extends scala.runtime.AbstractFunction1\<akka.io.dns.internal.DnsClient.DnsQuestion,​akka.io.dns.internal.DnsClient.DropRequest\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Question4 extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Question4$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.String,​akka.io.dns.internal.DnsClient.Question4\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Question6 extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.Question6$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.String,​akka.io.dns.internal.DnsClient.Question6\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.SrvQuestion extends java.lang.Object implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.SrvQuestion$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.String,​akka.io.dns.internal.DnsClient.SrvQuestion\> implements Serializable
	- ### Class akka.io.dns.internal.DnsClient.TcpDropped$ extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.internal.Message$](akka/io/dns/internal/Message$.html "class in akka.io.dns.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.internal.MessageFlags$](akka/io/dns/internal/MessageFlags$.html "class in akka.io.dns.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.internal.OpCode$](akka/io/dns/internal/OpCode$.html "class in akka.io.dns.internal") extends scala.Enumeration implements Serializable
	- ### Class akka.io.dns.internal.package.CachePolicyIsOrdered$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.io.dns.internal.Question$](akka/io/dns/internal/Question$.html "class in akka.io.dns.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.io.dns.internal.ResolvConf$](akka/io/dns/internal/ResolvConf$.html "class in akka.io.dns.internal") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.List\<java.lang.String\>,​java.lang.Object,​akka.io.dns.internal.ResolvConf\> implements Serializable
	- ### Class [akka.io.dns.internal.ResponseCode$](akka/io/dns/internal/ResponseCode$.html "class in akka.io.dns.internal") extends scala.Enumeration implements Serializable
- ## Package akka.japi

	- ### Class [akka.japi.JavaPartialFunction.NoMatch$](akka/japi/JavaPartialFunction.NoMatch$.html "class in akka.japi") extends [JavaPartialFunction.NoMatchException](akka/japi/JavaPartialFunction.NoMatchException.html "class in akka.japi") implements Serializable
	- ### Class [akka.japi.JavaPartialFunction.NoMatchException](akka/japi/JavaPartialFunction.NoMatchException.html "class in akka.japi") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.japi.Option.Some](akka/japi/Option.Some.html "class in akka.japi") extends [Option](akka/japi/Option.html "class in akka.japi")\<[A](akka/japi/Option.Some.html "type parameter in Option.Some")\> implements Serializable
	- ### Class [akka.japi.Option.Some$](akka/japi/Option.Some$.html "class in akka.japi") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.Pair](akka/japi/Pair.html "class in akka.japi") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.Pair$](akka/japi/Pair$.html "class in akka.japi") extends java.lang.Object implements Serializable
- ## Package akka.japi.function
- ## Package akka.japi.tuple

	- ### Class [akka.japi.tuple.Tuple10](akka/japi/tuple/Tuple10.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple10$](akka/japi/tuple/Tuple10$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple11](akka/japi/tuple/Tuple11.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple11$](akka/japi/tuple/Tuple11$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple12](akka/japi/tuple/Tuple12.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple12$](akka/japi/tuple/Tuple12$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple13](akka/japi/tuple/Tuple13.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple13$](akka/japi/tuple/Tuple13$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple14](akka/japi/tuple/Tuple14.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple14$](akka/japi/tuple/Tuple14$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple15](akka/japi/tuple/Tuple15.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple15$](akka/japi/tuple/Tuple15$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple16](akka/japi/tuple/Tuple16.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple16$](akka/japi/tuple/Tuple16$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple17](akka/japi/tuple/Tuple17.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple17$](akka/japi/tuple/Tuple17$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple18](akka/japi/tuple/Tuple18.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple18$](akka/japi/tuple/Tuple18$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple19](akka/japi/tuple/Tuple19.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple19$](akka/japi/tuple/Tuple19$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple20](akka/japi/tuple/Tuple20.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple20$](akka/japi/tuple/Tuple20$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple21](akka/japi/tuple/Tuple21.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple21$](akka/japi/tuple/Tuple21$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple22](akka/japi/tuple/Tuple22.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple22$](akka/japi/tuple/Tuple22$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple3](akka/japi/tuple/Tuple3.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple3$](akka/japi/tuple/Tuple3$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple4](akka/japi/tuple/Tuple4.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple4$](akka/japi/tuple/Tuple4$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple5](akka/japi/tuple/Tuple5.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple5$](akka/japi/tuple/Tuple5$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple6](akka/japi/tuple/Tuple6.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple6$](akka/japi/tuple/Tuple6$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple7](akka/japi/tuple/Tuple7.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple7$](akka/japi/tuple/Tuple7$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple8](akka/japi/tuple/Tuple8.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple8$](akka/japi/tuple/Tuple8$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple9](akka/japi/tuple/Tuple9.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
	- ### Class [akka.japi.tuple.Tuple9$](akka/japi/tuple/Tuple9$.html "class in akka.japi.tuple") extends java.lang.Object implements Serializable
- ## Package akka.pattern

	- ### Class [akka.pattern.AskTimeoutException](akka/pattern/AskTimeoutException.html "class in akka.pattern") extends java.util.concurrent.TimeoutException implements Serializable
	- ### Class [akka.pattern.AutoReset$](akka/pattern/AutoReset$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset\> implements Serializable
	- ### Class [akka.pattern.BackoffOnFailureOptionsImpl](akka/pattern/BackoffOnFailureOptionsImpl.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffOnFailureOptionsImpl$](akka/pattern/BackoffOnFailureOptionsImpl$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffOnStopOptionsImpl](akka/pattern/BackoffOnStopOptionsImpl.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffOnStopOptionsImpl$](akka/pattern/BackoffOnStopOptionsImpl$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.CurrentChild](akka/pattern/BackoffSupervisor.CurrentChild.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.CurrentChild$](akka/pattern/BackoffSupervisor.CurrentChild$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<scala.Option\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​[BackoffSupervisor.CurrentChild](akka/pattern/BackoffSupervisor.CurrentChild.html "class in akka.pattern")\> implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.GetCurrentChild$](akka/pattern/BackoffSupervisor.GetCurrentChild$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.GetRestartCount$](akka/pattern/BackoffSupervisor.GetRestartCount$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.Reset$](akka/pattern/BackoffSupervisor.Reset$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.ResetRestartCount$](akka/pattern/BackoffSupervisor.ResetRestartCount$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.pattern.BackoffSupervisor.ResetRestartCount\> implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.RestartCount](akka/pattern/BackoffSupervisor.RestartCount.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.RestartCount$](akka/pattern/BackoffSupervisor.RestartCount$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[BackoffSupervisor.RestartCount](akka/pattern/BackoffSupervisor.RestartCount.html "class in akka.pattern")\> implements Serializable
	- ### Class [akka.pattern.BackoffSupervisor.StartChild$](akka/pattern/BackoffSupervisor.StartChild$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.CircuitBreakerOpenException](akka/pattern/CircuitBreakerOpenException.html "class in akka.pattern") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.pattern.CircuitBreakerOpenException$](akka/pattern/CircuitBreakerOpenException$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.ForwardDeathLetters$](akka/pattern/ForwardDeathLetters$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.ForwardTo$](akka/pattern/ForwardTo$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.pattern.ForwardTo\> implements Serializable
	- ### Class [akka.pattern.ManualReset$](akka/pattern/ManualReset$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.PromiseActorRef$](akka/pattern/PromiseActorRef$.html "class in akka.pattern") extends java.lang.Object implements Serializable
	- ### Class [akka.pattern.ReplyWith$](akka/pattern/ReplyWith$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.pattern.ReplyWith\> implements Serializable
	- ### Class [akka.pattern.StatusReply.ErrorMessage](akka/pattern/StatusReply.ErrorMessage.html "class in akka.pattern") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.pattern.StatusReply.ErrorMessage$](akka/pattern/StatusReply.ErrorMessage$.html "class in akka.pattern") extends scala.runtime.AbstractFunction1\<java.lang.String,​[StatusReply.ErrorMessage](akka/pattern/StatusReply.ErrorMessage.html "class in akka.pattern")\> implements Serializable
- ## Package akka.persistence

	- ### Class [akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$](akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.collection.immutable.Seq\<[AtLeastOnceDelivery.UnconfirmedDelivery](akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery.html "class in akka.persistence")\>,​[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.Internal$.Delivery](akka/persistence/AtLeastOnceDelivery.Internal$.Delivery.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.Internal$.Delivery$](akka/persistence/AtLeastOnceDelivery.Internal$.Delivery$.html "class in akka.persistence") extends scala.runtime.AbstractFunction4\<[ActorPath](akka/actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery\> implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.Internal$.RedeliveryTick$](akka/persistence/AtLeastOnceDelivery.Internal$.RedeliveryTick$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException](akka/persistence/AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery](akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery$](akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<java.lang.Object,​[ActorPath](akka/actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​[AtLeastOnceDelivery.UnconfirmedDelivery](akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning](akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning$](akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[AtLeastOnceDelivery.UnconfirmedDelivery](akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery.html "class in akka.persistence")\>,​[AtLeastOnceDelivery.UnconfirmedWarning](akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence")\> implements Serializable
	- ### Class akka.persistence.AtLeastOnceDelivery$Internal$Delivery extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### attempt
			
			
			
			```
			int attempt
			```
			- #### destination
			
			
			
			```
			[ActorPath](akka/actor/ActorPath.html "interface in akka.actor") destination
			```
			- #### message
			
			
			
			```
			java.lang.Object message
			```
			- #### timestamp
			
			
			
			```
			long timestamp
			```
	- ### Class akka.persistence.AtLeastOnceDelivery$Internal$Delivery$ extends scala.runtime.AbstractFunction4\<[ActorPath](akka/actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery$Internal$Delivery\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.persistence.AtLeastOnceDelivery$Internal$RedeliveryTick$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.persistence.AtomicWrite](akka/persistence/AtomicWrite.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.AtomicWrite$](akka/persistence/AtomicWrite$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.CompositeMetadata$](akka/persistence/CompositeMetadata$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteMessagesFailure](akka/persistence/DeleteMessagesFailure.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteMessagesFailure$](akka/persistence/DeleteMessagesFailure$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Throwable,​java.lang.Object,​[DeleteMessagesFailure](akka/persistence/DeleteMessagesFailure.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.DeleteMessagesSuccess](akka/persistence/DeleteMessagesSuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteMessagesSuccess$](akka/persistence/DeleteMessagesSuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[DeleteMessagesSuccess](akka/persistence/DeleteMessagesSuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotFailure](akka/persistence/DeleteSnapshotFailure.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotFailure$](akka/persistence/DeleteSnapshotFailure$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](akka/persistence/DeleteSnapshotFailure.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotsFailure](akka/persistence/DeleteSnapshotsFailure.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotsFailure$](akka/persistence/DeleteSnapshotsFailure$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<[SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotsFailure](akka/persistence/DeleteSnapshotsFailure.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotsSuccess](akka/persistence/DeleteSnapshotsSuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotsSuccess$](akka/persistence/DeleteSnapshotsSuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<[SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsSuccess](akka/persistence/DeleteSnapshotsSuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotSuccess](akka/persistence/DeleteSnapshotSuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.DeleteSnapshotSuccess$](akka/persistence/DeleteSnapshotSuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​[DeleteSnapshotSuccess](akka/persistence/DeleteSnapshotSuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.DiscardToDeadLetterStrategy$](akka/persistence/DiscardToDeadLetterStrategy$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.Eventsourced.AsyncHandlerInvocation](akka/persistence/Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.Eventsourced.AsyncHandlerInvocation$](akka/persistence/Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Function1\<java.lang.Object,​scala.runtime.BoxedUnit\>,​[Eventsourced.AsyncHandlerInvocation](akka/persistence/Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.Eventsourced.RecoveryTick](akka/persistence/Eventsourced.RecoveryTick.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.Eventsourced.RecoveryTick$](akka/persistence/Eventsourced.RecoveryTick$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Eventsourced.RecoveryTick](akka/persistence/Eventsourced.RecoveryTick.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.Eventsourced.StashingHandlerInvocation](akka/persistence/Eventsourced.StashingHandlerInvocation.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.Eventsourced.StashingHandlerInvocation$](akka/persistence/Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Function1\<java.lang.Object,​scala.runtime.BoxedUnit\>,​[Eventsourced.StashingHandlerInvocation](akka/persistence/Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.FilteredPayload$](akka/persistence/FilteredPayload$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.DeleteMessagesTo](akka/persistence/JournalProtocol.DeleteMessagesTo.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.DeleteMessagesTo$](akka/persistence/JournalProtocol.DeleteMessagesTo$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[JournalProtocol.DeleteMessagesTo](akka/persistence/JournalProtocol.DeleteMessagesTo.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.LoopMessageSuccess](akka/persistence/JournalProtocol.LoopMessageSuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.LoopMessageSuccess$](akka/persistence/JournalProtocol.LoopMessageSuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[JournalProtocol.LoopMessageSuccess](akka/persistence/JournalProtocol.LoopMessageSuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.RecoverySuccess](akka/persistence/JournalProtocol.RecoverySuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.RecoverySuccess$](akka/persistence/JournalProtocol.RecoverySuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[JournalProtocol.RecoverySuccess](akka/persistence/JournalProtocol.RecoverySuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.ReplayedMessage](akka/persistence/JournalProtocol.ReplayedMessage.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.ReplayedMessage$](akka/persistence/JournalProtocol.ReplayedMessage$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<[PersistentRepr](akka/persistence/PersistentRepr.html "interface in akka.persistence"),​[JournalProtocol.ReplayedMessage](akka/persistence/JournalProtocol.ReplayedMessage.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.ReplayMessages](akka/persistence/JournalProtocol.ReplayMessages.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.ReplayMessages$](akka/persistence/JournalProtocol.ReplayMessages$.html "class in akka.persistence") extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[JournalProtocol.ReplayMessages](akka/persistence/JournalProtocol.ReplayMessages.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.ReplayMessagesFailure](akka/persistence/JournalProtocol.ReplayMessagesFailure.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.ReplayMessagesFailure$](akka/persistence/JournalProtocol.ReplayMessagesFailure$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[JournalProtocol.ReplayMessagesFailure](akka/persistence/JournalProtocol.ReplayMessagesFailure.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessageFailure](akka/persistence/JournalProtocol.WriteMessageFailure.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessageFailure$](akka/persistence/JournalProtocol.WriteMessageFailure$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<[PersistentRepr](akka/persistence/PersistentRepr.html "interface in akka.persistence"),​java.lang.Throwable,​java.lang.Object,​[JournalProtocol.WriteMessageFailure](akka/persistence/JournalProtocol.WriteMessageFailure.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessageRejected](akka/persistence/JournalProtocol.WriteMessageRejected.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessageRejected$](akka/persistence/JournalProtocol.WriteMessageRejected$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<[PersistentRepr](akka/persistence/PersistentRepr.html "interface in akka.persistence"),​java.lang.Throwable,​java.lang.Object,​[JournalProtocol.WriteMessageRejected](akka/persistence/JournalProtocol.WriteMessageRejected.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessages](akka/persistence/JournalProtocol.WriteMessages.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessages$](akka/persistence/JournalProtocol.WriteMessages$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessagesFailed](akka/persistence/JournalProtocol.WriteMessagesFailed.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessagesFailed$](akka/persistence/JournalProtocol.WriteMessagesFailed$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Throwable,​java.lang.Object,​[JournalProtocol.WriteMessagesFailed](akka/persistence/JournalProtocol.WriteMessagesFailed.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessagesSuccessful$](akka/persistence/JournalProtocol.WriteMessagesSuccessful$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessageSuccess](akka/persistence/JournalProtocol.WriteMessageSuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.JournalProtocol.WriteMessageSuccess$](akka/persistence/JournalProtocol.WriteMessageSuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<[PersistentRepr](akka/persistence/PersistentRepr.html "interface in akka.persistence"),​java.lang.Object,​[JournalProtocol.WriteMessageSuccess](akka/persistence/JournalProtocol.WriteMessageSuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.NonPersistentRepr$](akka/persistence/NonPersistentRepr$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.persistence.NonPersistentRepr\> implements Serializable
	- ### Class [akka.persistence.Persistence.PluginHolder$](akka/persistence/Persistence.PluginHolder$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<scala.Function0\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​[EventAdapters](akka/persistence/journal/EventAdapters.html "class in akka.persistence.journal"),​com.typesafe.config.Config,​akka.persistence.Persistence.PluginHolder\> implements Serializable
	- ### Class akka.persistence.PersistencePlugin.PluginHolder extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### javadslPlugin
			
			
			
			```
			JavaDsl extends java.lang.Object javadslPlugin
			```
			- #### scaladslPlugin
			
			
			
			```
			ScalaDsl extends java.lang.Object scaladslPlugin
			```
	- ### Class akka.persistence.PersistencePlugin.PluginHolder$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.persistence.PersistentImpl$](akka/persistence/PersistentImpl$.html "class in akka.persistence") extends scala.runtime.AbstractFunction9\<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option\<java.lang.Object\>,​akka.persistence.PersistentImpl\> implements Serializable
	- ### Class [akka.persistence.PersistentRepr$](akka/persistence/PersistentRepr$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.PluginSpec](akka/persistence/PluginSpec.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.Recovery](akka/persistence/Recovery.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.Recovery$](akka/persistence/Recovery$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.RecoveryCompleted$](akka/persistence/RecoveryCompleted$.html "class in akka.persistence") extends [RecoveryCompleted](akka/persistence/RecoveryCompleted.html "class in akka.persistence") implements Serializable
	- ### Class akka.persistence.RecoveryPermitter.RecoveryPermitGranted$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.RecoveryPermitter.RequestRecoveryPermit$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.RecoveryPermitter.ReturnRecoveryPermit$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.RecoveryTimedOut](akka/persistence/RecoveryTimedOut.html "class in akka.persistence") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.persistence.ReplyToStrategy](akka/persistence/ReplyToStrategy.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.ReplyToStrategy$](akka/persistence/ReplyToStrategy$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ReplyToStrategy](akka/persistence/ReplyToStrategy.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SaveSnapshotFailure](akka/persistence/SaveSnapshotFailure.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SaveSnapshotFailure$](akka/persistence/SaveSnapshotFailure$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[SaveSnapshotFailure](akka/persistence/SaveSnapshotFailure.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SaveSnapshotSuccess](akka/persistence/SaveSnapshotSuccess.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SaveSnapshotSuccess$](akka/persistence/SaveSnapshotSuccess$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​[SaveSnapshotSuccess](akka/persistence/SaveSnapshotSuccess.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SelectedSnapshot](akka/persistence/SelectedSnapshot.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SelectedSnapshot$](akka/persistence/SelectedSnapshot$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotMetadata$](akka/persistence/SnapshotMetadata$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​java.lang.Object,​[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotOffer](akka/persistence/SnapshotOffer.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotOffer$](akka/persistence/SnapshotOffer$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](akka/persistence/SnapshotOffer.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.DeleteSnapshot](akka/persistence/SnapshotProtocol.DeleteSnapshot.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.DeleteSnapshot$](akka/persistence/SnapshotProtocol.DeleteSnapshot$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​[SnapshotProtocol.DeleteSnapshot](akka/persistence/SnapshotProtocol.DeleteSnapshot.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.DeleteSnapshots](akka/persistence/SnapshotProtocol.DeleteSnapshots.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.DeleteSnapshots$](akka/persistence/SnapshotProtocol.DeleteSnapshots$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<java.lang.String,​[SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence"),​[SnapshotProtocol.DeleteSnapshots](akka/persistence/SnapshotProtocol.DeleteSnapshots.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.LoadSnapshot](akka/persistence/SnapshotProtocol.LoadSnapshot.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.LoadSnapshot$](akka/persistence/SnapshotProtocol.LoadSnapshot$.html "class in akka.persistence") extends scala.runtime.AbstractFunction3\<java.lang.String,​[SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence"),​java.lang.Object,​[SnapshotProtocol.LoadSnapshot](akka/persistence/SnapshotProtocol.LoadSnapshot.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.LoadSnapshotFailed](akka/persistence/SnapshotProtocol.LoadSnapshotFailed.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.LoadSnapshotFailed$](akka/persistence/SnapshotProtocol.LoadSnapshotFailed$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[SnapshotProtocol.LoadSnapshotFailed](akka/persistence/SnapshotProtocol.LoadSnapshotFailed.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.LoadSnapshotResult](akka/persistence/SnapshotProtocol.LoadSnapshotResult.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.LoadSnapshotResult$](akka/persistence/SnapshotProtocol.LoadSnapshotResult$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<scala.Option\<[SelectedSnapshot](akka/persistence/SelectedSnapshot.html "class in akka.persistence")\>,​java.lang.Object,​[SnapshotProtocol.LoadSnapshotResult](akka/persistence/SnapshotProtocol.LoadSnapshotResult.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.SaveSnapshot](akka/persistence/SnapshotProtocol.SaveSnapshot.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotProtocol.SaveSnapshot$](akka/persistence/SnapshotProtocol.SaveSnapshot$.html "class in akka.persistence") extends scala.runtime.AbstractFunction2\<[SnapshotMetadata](akka/persistence/SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotProtocol.SaveSnapshot](akka/persistence/SnapshotProtocol.SaveSnapshot.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.SnapshotSelectionCriteria$](akka/persistence/SnapshotSelectionCriteria$.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.TestPayload](akka/persistence/TestPayload.html "class in akka.persistence") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.TestPayload$](akka/persistence/TestPayload$.html "class in akka.persistence") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[TestPayload](akka/persistence/TestPayload.html "class in akka.persistence")\> implements Serializable
	- ### Class [akka.persistence.ThrowOverflowExceptionStrategy$](akka/persistence/ThrowOverflowExceptionStrategy$.html "class in akka.persistence") extends java.lang.Object implements Serializable
- ## Package akka.persistence.fsm

	- ### Class [akka.persistence.fsm.PersistentFSM.PersistentFSMSnapshot$](akka/persistence/fsm/PersistentFSM.PersistentFSMSnapshot$.html "class in akka.persistence.fsm") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.fsm.PersistentFSM.StateChangeEvent](akka/persistence/fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.fsm.PersistentFSM.StateChangeEvent$](akka/persistence/fsm/PersistentFSM.StateChangeEvent$.html "class in akka.persistence.fsm") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<scala.concurrent.duration.FiniteDuration\>,​[PersistentFSM.StateChangeEvent](akka/persistence/fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm")\> implements Serializable
- ## Package akka.persistence.japi.journal

	- ### Class [akka.persistence.japi.journal.JavaJournalPerfSpec](akka/persistence/japi/journal/JavaJournalPerfSpec.html "class in akka.persistence.japi.journal") extends [JournalPerfSpec](akka/persistence/journal/JournalPerfSpec.html "class in akka.persistence.journal") implements Serializable
	- ### Class [akka.persistence.japi.journal.JavaJournalSpec](akka/persistence/japi/journal/JavaJournalSpec.html "class in akka.persistence.japi.journal") extends [JournalSpec](akka/persistence/journal/JournalSpec.html "class in akka.persistence.journal") implements Serializable
- ## Package akka.persistence.japi.snapshot

	- ### Class [akka.persistence.japi.snapshot.JavaSnapshotStoreSpec](akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html "class in akka.persistence.japi.snapshot") extends [SnapshotStoreSpec](akka/persistence/snapshot/SnapshotStoreSpec.html "class in akka.persistence.snapshot") implements Serializable
- ## Package akka.persistence.journal

	- ### Class [akka.persistence.journal.AsyncReplayTimeoutException](akka/persistence/journal/AsyncReplayTimeoutException.html "class in akka.persistence.journal") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteJournal.Desequenced](akka/persistence/journal/AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteJournal.Desequenced$](akka/persistence/journal/AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[AsyncWriteJournal.Desequenced](akka/persistence/journal/AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteProxy.InitTimeout$](akka/persistence/journal/AsyncWriteProxy.InitTimeout$.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteProxy.SetStore](akka/persistence/journal/AsyncWriteProxy.SetStore.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteProxy.SetStore$](akka/persistence/journal/AsyncWriteProxy.SetStore$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](akka/persistence/journal/AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.DeleteMessagesTo](akka/persistence/journal/AsyncWriteTarget.DeleteMessagesTo.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.DeleteMessagesTo$](akka/persistence/journal/AsyncWriteTarget.DeleteMessagesTo$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[AsyncWriteTarget.DeleteMessagesTo](akka/persistence/journal/AsyncWriteTarget.DeleteMessagesTo.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.ReplayFailure](akka/persistence/journal/AsyncWriteTarget.ReplayFailure.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.ReplayFailure$](akka/persistence/journal/AsyncWriteTarget.ReplayFailure$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[AsyncWriteTarget.ReplayFailure](akka/persistence/journal/AsyncWriteTarget.ReplayFailure.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.ReplayMessages](akka/persistence/journal/AsyncWriteTarget.ReplayMessages.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.ReplayMessages$](akka/persistence/journal/AsyncWriteTarget.ReplayMessages$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction4\<java.lang.String,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[AsyncWriteTarget.ReplayMessages](akka/persistence/journal/AsyncWriteTarget.ReplayMessages.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.ReplaySuccess](akka/persistence/journal/AsyncWriteTarget.ReplaySuccess.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.ReplaySuccess$](akka/persistence/journal/AsyncWriteTarget.ReplaySuccess$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[AsyncWriteTarget.ReplaySuccess](akka/persistence/journal/AsyncWriteTarget.ReplaySuccess.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.WriteMessages](akka/persistence/journal/AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.AsyncWriteTarget.WriteMessages$](akka/persistence/journal/AsyncWriteTarget.WriteMessages$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[AtomicWrite](akka/persistence/AtomicWrite.html "class in akka.persistence")\>,​[AsyncWriteTarget.WriteMessages](akka/persistence/journal/AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.EventAdapters.CombinedReadEventAdapter$](akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[EventAdapter](akka/persistence/journal/EventAdapter.html "interface in akka.persistence.journal")\>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter\> implements Serializable
	- ### Class [akka.persistence.journal.EventsSeq](akka/persistence/journal/EventsSeq.html "class in akka.persistence.journal") extends [EventSeq](akka/persistence/journal/EventSeq.html "class in akka.persistence.journal") implements Serializable
	- ### Class [akka.persistence.journal.EventsSeq$](akka/persistence/journal/EventsSeq$.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.IdentityEventAdapter$](akka/persistence/journal/IdentityEventAdapter$.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.IdentityEventAdapters$](akka/persistence/journal/IdentityEventAdapters$.html "class in akka.persistence.journal") extends [EventAdapters](akka/persistence/journal/EventAdapters.html "class in akka.persistence.journal") implements Serializable
	- ### Class [akka.persistence.journal.JournalPerfSpec](akka/persistence/journal/JournalPerfSpec.html "class in akka.persistence.journal") extends [JournalSpec](akka/persistence/journal/JournalSpec.html "class in akka.persistence.journal") implements Serializable
	- ### Class [akka.persistence.journal.JournalPerfSpec.Cmd](akka/persistence/journal/JournalPerfSpec.Cmd.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.JournalPerfSpec.Cmd$](akka/persistence/journal/JournalPerfSpec.Cmd$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[JournalPerfSpec.Cmd](akka/persistence/journal/JournalPerfSpec.Cmd.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.JournalPerfSpec.ResetCounter$](akka/persistence/journal/JournalPerfSpec.ResetCounter$.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.JournalPerfSpec$](akka/persistence/journal/JournalPerfSpec$.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.JournalSpec](akka/persistence/journal/JournalSpec.html "class in akka.persistence.journal") extends [PluginSpec](akka/persistence/PluginSpec.html "class in akka.persistence") implements Serializable
	- ### Class [akka.persistence.journal.JournalSpec$](akka/persistence/journal/JournalSpec$.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.NoopReadEventAdapter$](akka/persistence/journal/NoopReadEventAdapter$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<[WriteEventAdapter](akka/persistence/journal/WriteEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopReadEventAdapter\> implements Serializable
	- ### Class [akka.persistence.journal.NoopWriteEventAdapter$](akka/persistence/journal/NoopWriteEventAdapter$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<[ReadEventAdapter](akka/persistence/journal/ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter\> implements Serializable
	- ### Class [akka.persistence.journal.PersistencePluginProxy.TargetLocation](akka/persistence/journal/PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.PersistencePluginProxy.TargetLocation$](akka/persistence/journal/PersistencePluginProxy.TargetLocation$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](akka/persistence/journal/PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class akka.persistence.journal.ReplayFilter.Disabled$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.ReplayFilter.Fail$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.ReplayFilter.RepairByDiscardOld$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.ReplayFilter.Warn$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.SingleEventSeq](akka/persistence/journal/SingleEventSeq.html "class in akka.persistence.journal") extends [EventSeq](akka/persistence/journal/EventSeq.html "class in akka.persistence.journal") implements Serializable
	- ### Class [akka.persistence.journal.SingleEventSeq$](akka/persistence/journal/SingleEventSeq$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[SingleEventSeq](akka/persistence/journal/SingleEventSeq.html "class in akka.persistence.journal")\> implements Serializable
	- ### Class [akka.persistence.journal.Tagged](akka/persistence/journal/Tagged.html "class in akka.persistence.journal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.Tagged$](akka/persistence/journal/Tagged$.html "class in akka.persistence.journal") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.collection.immutable.Set\<java.lang.String\>,​[Tagged](akka/persistence/journal/Tagged.html "class in akka.persistence.journal")\> implements Serializable
- ## Package akka.persistence.journal.inmem

	- ### Class akka.persistence.journal.inmem.InmemJournal.Delete extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.inmem.InmemJournal.Delete$ extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​akka.persistence.journal.inmem.InmemJournal.Delete\> implements Serializable
	- ### Class akka.persistence.journal.inmem.InmemJournal.MessageWithMeta$ extends scala.runtime.AbstractFunction2\<[PersistentRepr](akka/persistence/PersistentRepr.html "interface in akka.persistence"),​\<any\>,​akka.persistence.journal.inmem.InmemJournal.MessageWithMeta\> implements Serializable
	- ### Class akka.persistence.journal.inmem.InmemJournal.ReplayWithMeta$ extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.persistence.journal.inmem.InmemJournal.ReplayWithMeta\> implements Serializable
	- ### Class akka.persistence.journal.inmem.InmemJournal.Write extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.inmem.InmemJournal.Write$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.String,​java.lang.Object,​akka.persistence.journal.inmem.InmemJournal.Write\> implements Serializable
- ## Package akka.persistence.journal.leveldb

	- ### Class [akka.persistence.journal.leveldb.Key$](akka/persistence/journal/leveldb/Key$.html "class in akka.persistence.journal.leveldb") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb](akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb$](akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html "class in akka.persistence.journal.leveldb") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[LeveldbCompaction.TryCompactLeveldb](akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.CurrentPersistenceIds extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.CurrentPersistenceIds$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<java.lang.String\>,​akka.persistence.journal.leveldb.LeveldbJournal.CurrentPersistenceIds\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.EventAppended extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.EventAppended$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.persistence.journal.leveldb.LeveldbJournal.EventAppended\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.PersistenceIdAdded extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.PersistenceIdAdded$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.persistence.journal.leveldb.LeveldbJournal.PersistenceIdAdded\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage$ extends scala.runtime.AbstractFunction3\<[PersistentRepr](akka/persistence/PersistentRepr.html "interface in akka.persistence"),​java.lang.String,​java.lang.Object,​akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.ReplayTaggedMessages extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.ReplayTaggedMessages$ extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.persistence.journal.leveldb.LeveldbJournal.ReplayTaggedMessages\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.SubscribeAllPersistenceIds$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.SubscribePersistenceId extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.SubscribePersistenceId$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.persistence.journal.leveldb.LeveldbJournal.SubscribePersistenceId\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.SubscribeTag extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.SubscribeTag$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.persistence.journal.leveldb.LeveldbJournal.SubscribeTag\> implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.TaggedEventAppended extends java.lang.Object implements Serializable
	- ### Class akka.persistence.journal.leveldb.LeveldbJournal.TaggedEventAppended$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.persistence.journal.leveldb.LeveldbJournal.TaggedEventAppended\> implements Serializable
- ## Package akka.persistence.query

	- ### Class [akka.persistence.query.EventEnvelope](akka/persistence/query/EventEnvelope.html "class in akka.persistence.query") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.query.EventEnvelope$](akka/persistence/query/EventEnvelope$.html "class in akka.persistence.query") extends scala.runtime.AbstractFunction4\<[Offset](akka/persistence/query/Offset.html "class in akka.persistence.query"),​java.lang.String,​java.lang.Object,​java.lang.Object,​[EventEnvelope](akka/persistence/query/EventEnvelope.html "class in akka.persistence.query")\> implements Serializable
	- ### Class [akka.persistence.query.NoOffset$](akka/persistence/query/NoOffset$.html "class in akka.persistence.query") extends [Offset](akka/persistence/query/Offset.html "class in akka.persistence.query") implements Serializable
	- ### Class [akka.persistence.query.Sequence](akka/persistence/query/Sequence.html "class in akka.persistence.query") extends [Offset](akka/persistence/query/Offset.html "class in akka.persistence.query") implements Serializable
	- ### Class [akka.persistence.query.Sequence$](akka/persistence/query/Sequence$.html "class in akka.persistence.query") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Sequence](akka/persistence/query/Sequence.html "class in akka.persistence.query")\> implements Serializable
	- ### Class [akka.persistence.query.TimeBasedUUID](akka/persistence/query/TimeBasedUUID.html "class in akka.persistence.query") extends [Offset](akka/persistence/query/Offset.html "class in akka.persistence.query") implements Serializable
	- ### Class [akka.persistence.query.TimeBasedUUID$](akka/persistence/query/TimeBasedUUID$.html "class in akka.persistence.query") extends scala.runtime.AbstractFunction1\<java.util.UUID,​[TimeBasedUUID](akka/persistence/query/TimeBasedUUID.html "class in akka.persistence.query")\> implements Serializable
- ## Package akka.persistence.query.internal.protobuf

	- ### Class [akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope](akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### entityType\_
			
			
			
			```
			java.lang.Object entityType_
			```
			- #### event\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") event_
			```
			- #### filtered\_
			
			
			
			```
			boolean filtered_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### metadata\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") metadata_
			```
			- #### offset\_
			
			
			
			```
			java.lang.Object offset_
			```
			- #### offsetManifest\_
			
			
			
			```
			java.lang.Object offsetManifest_
			```
			- #### persistenceId\_
			
			
			
			```
			java.lang.Object persistenceId_
			```
			- #### sequenceNr\_
			
			
			
			```
			long sequenceNr_
			```
			- #### slice\_
			
			
			
			```
			int slice_
			```
			- #### source\_
			
			
			
			```
			java.lang.Object source_
			```
			- #### tags\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList tags_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
- ## Package akka.persistence.query.journal.leveldb

	- ### Class akka.persistence.query.journal.leveldb.EventsByPersistenceIdStage.Continue$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.query.journal.leveldb.EventsByTagStage.Continue$ extends java.lang.Object implements Serializable
- ## Package akka.persistence.query.typed.internal

	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.ConsumerTracking extends java.lang.Object implements Serializable
	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.ConsumerTracking$ extends scala.runtime.AbstractFunction5\<java.lang.String,​scala.collection.immutable.Vector\<[TimestampOffset](akka/persistence/query/TimestampOffset.html "class in akka.persistence.query")\>,​java.lang.Object,​[KillSwitch](akka/stream/KillSwitch.html "interface in akka.stream"),​scala.Option\<java.time.Instant\>,​akka.persistence.query.typed.internal.EventsBySliceFirehose.ConsumerTracking\> implements Serializable
	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.FirehoseKey extends java.lang.Object implements Serializable
	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.FirehoseKey$ extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​scala.collection.immutable.Range,​akka.persistence.query.typed.internal.EventsBySliceFirehose.FirehoseKey\> implements Serializable
	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.Settings extends java.lang.Object implements Serializable
	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.Settings$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.query.typed.internal.EventsBySliceFirehose.SlowConsumerException extends java.lang.RuntimeException implements Serializable
- ## Package akka.persistence.scalatest

	- ### Class [akka.persistence.scalatest.MayVerb.TestCanceledByFailure](akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest") extends org.scalatest.exceptions.TestCanceledException implements Serializable
	- ### Class [akka.persistence.scalatest.MayVerb.TestCanceledByFailure$](akka/persistence/scalatest/MayVerb.TestCanceledByFailure$.html "class in akka.persistence.scalatest") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.StackTraceElement\[],​[MayVerb.TestCanceledByFailure](akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")\> implements Serializable
- ## Package akka.persistence.serialization

	- ### Class [akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot](akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### currentDeliveryId\_
			
			
			
			```
			long currentDeliveryId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### unconfirmedDeliveries\_
			
			
			
			```
			java.util.List<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> unconfirmedDeliveries_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### deliveryId\_
			
			
			
			```
			long deliveryId_
			```
			- #### destination\_
			
			
			
			```
			java.lang.Object destination_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			[MessageFormats.PersistentPayload](akka/persistence/serialization/MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") payload_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.AtomicWrite](akka/persistence/serialization/MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			java.util.List<[MessageFormats.PersistentMessage](akka/persistence/serialization/MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")> payload_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.CompositeMetadata](akka/persistence/serialization/MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payloads\_
			
			
			
			```
			java.util.List<[MessageFormats.PersistentPayload](akka/persistence/serialization/MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")> payloads_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.PersistentFSMSnapshot](akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### data\_
			
			
			
			```
			[MessageFormats.PersistentPayload](akka/persistence/serialization/MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") data_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### stateIdentifier\_
			
			
			
			```
			java.lang.Object stateIdentifier_
			```
			- #### timeoutNanos\_
			
			
			
			```
			long timeoutNanos_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.PersistentMessage](akka/persistence/serialization/MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### deleted\_
			
			
			
			```
			boolean deleted_
			```
			- #### manifest\_
			
			
			
			```
			java.lang.Object manifest_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### metadata\_
			
			
			
			```
			[MessageFormats.PersistentPayload](akka/persistence/serialization/MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") metadata_
			```
			- #### payload\_
			
			
			
			```
			[MessageFormats.PersistentPayload](akka/persistence/serialization/MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") payload_
			```
			- #### persistenceId\_
			
			
			
			```
			java.lang.Object persistenceId_
			```
			- #### sender\_
			
			
			
			```
			java.lang.Object sender_
			```
			- #### sequenceNr\_
			
			
			
			```
			long sequenceNr_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
			- #### writerUuid\_
			
			
			
			```
			java.lang.Object writerUuid_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.PersistentPayload](akka/persistence/serialization/MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			akka.protobufv3.internal.ByteString payload_
			```
			- #### payloadManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString payloadManifest_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent](akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### stateIdentifier\_
			
			
			
			```
			java.lang.Object stateIdentifier_
			```
			- #### timeout\_
			
			
			
			```
			java.lang.Object timeout_
			```
			- #### timeoutNanos\_
			
			
			
			```
			long timeoutNanos_
			```
	- ### Class [akka.persistence.serialization.Snapshot](akka/persistence/serialization/Snapshot.html "class in akka.persistence.serialization") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.serialization.Snapshot$](akka/persistence/serialization/Snapshot$.html "class in akka.persistence.serialization") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Snapshot](akka/persistence/serialization/Snapshot.html "class in akka.persistence.serialization")\> implements Serializable
- ## Package akka.persistence.snapshot

	- ### Class [akka.persistence.snapshot.NoSnapshotStore.NoSnapshotStoreException](akka/persistence/snapshot/NoSnapshotStore.NoSnapshotStoreException.html "class in akka.persistence.snapshot") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.persistence.snapshot.SnapshotStoreSpec](akka/persistence/snapshot/SnapshotStoreSpec.html "class in akka.persistence.snapshot") extends [PluginSpec](akka/persistence/PluginSpec.html "class in akka.persistence") implements Serializable
	- ### Class [akka.persistence.snapshot.SnapshotStoreSpec$](akka/persistence/snapshot/SnapshotStoreSpec$.html "class in akka.persistence.snapshot") extends java.lang.Object implements Serializable
- ## Package akka.persistence.state.javadsl

	- ### Class [akka.persistence.state.javadsl.GetObjectResult](akka/persistence/state/javadsl/GetObjectResult.html "class in akka.persistence.state.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.state.javadsl.GetObjectResult$](akka/persistence/state/javadsl/GetObjectResult$.html "class in akka.persistence.state.javadsl") extends java.lang.Object implements Serializable
- ## Package akka.persistence.state.scaladsl

	- ### Class [akka.persistence.state.scaladsl.GetObjectResult](akka/persistence/state/scaladsl/GetObjectResult.html "class in akka.persistence.state.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.state.scaladsl.GetObjectResult$](akka/persistence/state/scaladsl/GetObjectResult$.html "class in akka.persistence.state.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.persistence.testkit

	- ### Class [akka.persistence.testkit.DeleteEvents](akka/persistence/testkit/DeleteEvents.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.DeleteEvents$](akka/persistence/testkit/DeleteEvents$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[DeleteEvents](akka/persistence/testkit/DeleteEvents.html "class in akka.persistence.testkit")\> implements Serializable
	- ### Class [akka.persistence.testkit.DeleteSnapshotByMeta](akka/persistence/testkit/DeleteSnapshotByMeta.html "class in akka.persistence.testkit") extends [DeleteSnapshot](akka/persistence/testkit/DeleteSnapshot.html "class in akka.persistence.testkit") implements Serializable
	- ### Class [akka.persistence.testkit.DeleteSnapshotByMeta$](akka/persistence/testkit/DeleteSnapshotByMeta$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction1\<[SnapshotMeta](akka/persistence/testkit/SnapshotMeta.html "class in akka.persistence.testkit"),​[DeleteSnapshotByMeta](akka/persistence/testkit/DeleteSnapshotByMeta.html "class in akka.persistence.testkit")\> implements Serializable
	- ### Class [akka.persistence.testkit.DeleteSnapshotsByCriteria](akka/persistence/testkit/DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") extends [DeleteSnapshot](akka/persistence/testkit/DeleteSnapshot.html "class in akka.persistence.testkit") implements Serializable
	- ### Class [akka.persistence.testkit.DeleteSnapshotsByCriteria$](akka/persistence/testkit/DeleteSnapshotsByCriteria$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction1\<[SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](akka/persistence/testkit/DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")\> implements Serializable
	- ### Class [akka.persistence.testkit.ExpectedFailure](akka/persistence/testkit/ExpectedFailure.html "class in akka.persistence.testkit") extends java.lang.Throwable implements Serializable
	- ### Class [akka.persistence.testkit.ExpectedFailure$](akka/persistence/testkit/ExpectedFailure$.html "class in akka.persistence.testkit") extends [ExpectedFailure](akka/persistence/testkit/ExpectedFailure.html "class in akka.persistence.testkit") implements Serializable
	- ### Class [akka.persistence.testkit.ExpectedRejection](akka/persistence/testkit/ExpectedRejection.html "class in akka.persistence.testkit") extends java.lang.Throwable implements Serializable
	- ### Class [akka.persistence.testkit.ExpectedRejection$](akka/persistence/testkit/ExpectedRejection$.html "class in akka.persistence.testkit") extends [ExpectedRejection](akka/persistence/testkit/ExpectedRejection.html "class in akka.persistence.testkit") implements Serializable
	- ### Class [akka.persistence.testkit.PersistenceTestKitPlugin.Write$](akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​akka.persistence.testkit.PersistenceTestKitPlugin.Write\> implements Serializable
	- ### Class [akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.PassAll$](akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.ProcessingSuccess$](akka/persistence/testkit/ProcessingSuccess$.html "class in akka.persistence.testkit") extends [ProcessingSuccess](akka/persistence/testkit/ProcessingSuccess.html "class in akka.persistence.testkit") implements Serializable
	- ### Class [akka.persistence.testkit.ReadEvents](akka/persistence/testkit/ReadEvents.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.ReadEvents$](akka/persistence/testkit/ReadEvents$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<java.lang.Object\>,​[ReadEvents](akka/persistence/testkit/ReadEvents.html "class in akka.persistence.testkit")\> implements Serializable
	- ### Class [akka.persistence.testkit.ReadSeqNum$](akka/persistence/testkit/ReadSeqNum$.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.ReadSnapshot](akka/persistence/testkit/ReadSnapshot.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.ReadSnapshot$](akka/persistence/testkit/ReadSnapshot$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction2\<[SnapshotSelectionCriteria](akka/persistence/SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option\<java.lang.Object\>,​[ReadSnapshot](akka/persistence/testkit/ReadSnapshot.html "class in akka.persistence.testkit")\> implements Serializable
	- ### Class [akka.persistence.testkit.Reject](akka/persistence/testkit/Reject.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.Reject$](akka/persistence/testkit/Reject$.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.SnapshotMeta](akka/persistence/testkit/SnapshotMeta.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.SnapshotMeta$](akka/persistence/testkit/SnapshotMeta$.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.StorageFailure](akka/persistence/testkit/StorageFailure.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.StorageFailure$](akka/persistence/testkit/StorageFailure$.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.WriteEvents](akka/persistence/testkit/WriteEvents.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.WriteEvents$](akka/persistence/testkit/WriteEvents$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<java.lang.Object\>,​[WriteEvents](akka/persistence/testkit/WriteEvents.html "class in akka.persistence.testkit")\> implements Serializable
	- ### Class [akka.persistence.testkit.WriteSnapshot](akka/persistence/testkit/WriteSnapshot.html "class in akka.persistence.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.WriteSnapshot$](akka/persistence/testkit/WriteSnapshot$.html "class in akka.persistence.testkit") extends scala.runtime.AbstractFunction2\<[SnapshotMeta](akka/persistence/testkit/SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](akka/persistence/testkit/WriteSnapshot.html "class in akka.persistence.testkit")\> implements Serializable
- ## Package akka.persistence.testkit.internal

	- ### Class akka.persistence.testkit.internal.EventSourcedBehaviorTestKitImpl.CommandResultImpl extends java.lang.Object implements Serializable
	- ### Class akka.persistence.testkit.internal.EventSourcedBehaviorTestKitImpl.CommandResultImpl$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.testkit.internal.EventSourcedBehaviorTestKitImpl.RestartResultImpl extends java.lang.Object implements Serializable
	- ### Class akka.persistence.testkit.internal.EventSourcedBehaviorTestKitImpl.RestartResultImpl$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.testkit.internal.SerializedEventStorageImpl.Serialized extends java.lang.Object implements Serializable
	- ### Class akka.persistence.testkit.internal.SerializedEventStorageImpl.Serialized$ extends scala.runtime.AbstractFunction9\<java.lang.String,​java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.String,​byte\[],​scala.collection.immutable.Set\<java.lang.String\>,​scala.Option\<java.lang.Object\>,​akka.persistence.testkit.internal.SerializedEventStorageImpl.Serialized\> implements Serializable
- ## Package akka.persistence.testkit.javadsl

	- ### Class [akka.persistence.testkit.javadsl.PersistenceEffect](akka/persistence/testkit/javadsl/PersistenceEffect.html "class in akka.persistence.testkit.javadsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.javadsl.PersistenceEffect$](akka/persistence/testkit/javadsl/PersistenceEffect$.html "class in akka.persistence.testkit.javadsl") extends java.lang.Object implements Serializable
- ## Package akka.persistence.testkit.scaladsl

	- ### Class [akka.persistence.testkit.scaladsl.PersistenceEffect](akka/persistence/testkit/scaladsl/PersistenceEffect.html "class in akka.persistence.testkit.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.scaladsl.PersistenceEffect$](akka/persistence/testkit/scaladsl/PersistenceEffect$.html "class in akka.persistence.testkit.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState](akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState.html "class in akka.persistence.testkit.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState$](akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState$.html "class in akka.persistence.testkit.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced](akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced$](akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html "class in akka.persistence.testkit.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.persistence.testkit.state.scaladsl

	- ### Class [akka.persistence.testkit.state.scaladsl.Record](akka/persistence/testkit/state/scaladsl/Record.html "class in akka.persistence.testkit.state.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.testkit.state.scaladsl.Record$](akka/persistence/testkit/state/scaladsl/Record$.html "class in akka.persistence.testkit.state.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.persistence.typed

	- ### Class [akka.persistence.typed.DeleteEventsCompleted](akka/persistence/typed/DeleteEventsCompleted.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.DeleteEventsCompleted$](akka/persistence/typed/DeleteEventsCompleted$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[DeleteEventsCompleted](akka/persistence/typed/DeleteEventsCompleted.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.DeleteEventsFailed](akka/persistence/typed/DeleteEventsFailed.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.DeleteEventsFailed$](akka/persistence/typed/DeleteEventsFailed$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Throwable,​[DeleteEventsFailed](akka/persistence/typed/DeleteEventsFailed.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.DeleteSnapshotsCompleted](akka/persistence/typed/DeleteSnapshotsCompleted.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.DeleteSnapshotsCompleted$](akka/persistence/typed/DeleteSnapshotsCompleted$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<[DeletionTarget](akka/persistence/typed/DeletionTarget.html "interface in akka.persistence.typed"),​[DeleteSnapshotsCompleted](akka/persistence/typed/DeleteSnapshotsCompleted.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.DeleteSnapshotsFailed](akka/persistence/typed/DeleteSnapshotsFailed.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.DeleteSnapshotsFailed$](akka/persistence/typed/DeleteSnapshotsFailed$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction2\<[DeletionTarget](akka/persistence/typed/DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](akka/persistence/typed/DeleteSnapshotsFailed.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.DeletionTarget.Criteria](akka/persistence/typed/DeletionTarget.Criteria.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.DeletionTarget.Criteria$](akka/persistence/typed/DeletionTarget.Criteria$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<[SnapshotSelectionCriteria](akka/persistence/typed/SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​[DeletionTarget.Criteria](akka/persistence/typed/DeletionTarget.Criteria.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.DeletionTarget.Individual](akka/persistence/typed/DeletionTarget.Individual.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.DeletionTarget.Individual$](akka/persistence/typed/DeletionTarget.Individual$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<[SnapshotMetadata](akka/persistence/typed/SnapshotMetadata.html "class in akka.persistence.typed"),​[DeletionTarget.Individual](akka/persistence/typed/DeletionTarget.Individual.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.EmptyEventSeq$](akka/persistence/typed/EmptyEventSeq$.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.EventRejectedException](akka/persistence/typed/EventRejectedException.html "class in akka.persistence.typed") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.persistence.typed.EventsSeq$](akka/persistence/typed/EventsSeq$.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.PersistFailed](akka/persistence/typed/PersistFailed.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.PersistFailed$](akka/persistence/typed/PersistFailed$.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.PersistRejected](akka/persistence/typed/PersistRejected.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.PersistRejected$](akka/persistence/typed/PersistRejected$.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.RecoveryCompleted$](akka/persistence/typed/RecoveryCompleted$.html "class in akka.persistence.typed") extends [RecoveryCompleted](akka/persistence/typed/RecoveryCompleted.html "class in akka.persistence.typed") implements Serializable
	- ### Class [akka.persistence.typed.RecoveryFailed](akka/persistence/typed/RecoveryFailed.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.RecoveryFailed$](akka/persistence/typed/RecoveryFailed$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[RecoveryFailed](akka/persistence/typed/RecoveryFailed.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.ReplicaId](akka/persistence/typed/ReplicaId.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.ReplicaId$](akka/persistence/typed/ReplicaId$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ReplicaId](akka/persistence/typed/ReplicaId.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.SingleEventSeq$](akka/persistence/typed/SingleEventSeq$.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.SnapshotCompleted](akka/persistence/typed/SnapshotCompleted.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.SnapshotCompleted$](akka/persistence/typed/SnapshotCompleted$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<[SnapshotMetadata](akka/persistence/typed/SnapshotMetadata.html "class in akka.persistence.typed"),​[SnapshotCompleted](akka/persistence/typed/SnapshotCompleted.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.SnapshotFailed](akka/persistence/typed/SnapshotFailed.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.SnapshotFailed$](akka/persistence/typed/SnapshotFailed$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction2\<[SnapshotMetadata](akka/persistence/typed/SnapshotMetadata.html "class in akka.persistence.typed"),​java.lang.Throwable,​[SnapshotFailed](akka/persistence/typed/SnapshotFailed.html "class in akka.persistence.typed")\> implements Serializable
	- ### Class [akka.persistence.typed.SnapshotRecovered](akka/persistence/typed/SnapshotRecovered.html "class in akka.persistence.typed") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.SnapshotRecovered$](akka/persistence/typed/SnapshotRecovered$.html "class in akka.persistence.typed") extends scala.runtime.AbstractFunction1\<[SnapshotMetadata](akka/persistence/typed/SnapshotMetadata.html "class in akka.persistence.typed"),​[SnapshotRecovered](akka/persistence/typed/SnapshotRecovered.html "class in akka.persistence.typed")\> implements Serializable
- ## Package akka.persistence.typed.crdt

	- ### Class [akka.persistence.typed.crdt.Counter](akka/persistence/typed/crdt/Counter.html "class in akka.persistence.typed.crdt") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.crdt.Counter.Updated](akka/persistence/typed/crdt/Counter.Updated.html "class in akka.persistence.typed.crdt") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.crdt.Counter.Updated$](akka/persistence/typed/crdt/Counter.Updated$.html "class in akka.persistence.typed.crdt") extends scala.runtime.AbstractFunction1\<scala.math.BigInt,​[Counter.Updated](akka/persistence/typed/crdt/Counter.Updated.html "class in akka.persistence.typed.crdt")\> implements Serializable
	- ### Class [akka.persistence.typed.crdt.Counter$](akka/persistence/typed/crdt/Counter$.html "class in akka.persistence.typed.crdt") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.crdt.LwwTime](akka/persistence/typed/crdt/LwwTime.html "class in akka.persistence.typed.crdt") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.crdt.LwwTime$](akka/persistence/typed/crdt/LwwTime$.html "class in akka.persistence.typed.crdt") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[ReplicaId](akka/persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[LwwTime](akka/persistence/typed/crdt/LwwTime.html "class in akka.persistence.typed.crdt")\> implements Serializable
- ## Package akka.persistence.typed.internal

	- ### Class [akka.persistence.typed.internal.AsyncEffect$](akka/persistence/typed/internal/AsyncEffect$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.BehaviorSetup.NoSnapshot$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.BehaviorSetup.SnapshotWithoutRetention$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.BehaviorSetup.SnapshotWithRetention$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.CompositeEffect$](akka/persistence/typed/internal/CompositeEffect$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.DefaultRecovery$](akka/persistence/typed/internal/DefaultRecovery$.html "class in akka.persistence.typed.internal") extends [Recovery](akka/persistence/typed/javadsl/Recovery.html "class in akka.persistence.typed.javadsl") implements Serializable
	- ### Class [akka.persistence.typed.internal.DisabledRecovery$](akka/persistence/typed/internal/DisabledRecovery$.html "class in akka.persistence.typed.internal") extends [Recovery](akka/persistence/typed/javadsl/Recovery.html "class in akka.persistence.typed.javadsl") implements Serializable
	- ### Class [akka.persistence.typed.internal.DisabledRetentionCriteria$](akka/persistence/typed/internal/DisabledRetentionCriteria$.html "class in akka.persistence.typed.internal") extends [RetentionCriteria](akka/persistence/typed/javadsl/RetentionCriteria.html "class in akka.persistence.typed.javadsl") implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetPersistenceId extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetPersistenceId$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[PersistenceId](akka/persistence/typed/PersistenceId.html "class in akka.persistence.typed")\>,​akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetPersistenceId\> implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetSeenSequenceNr extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetSeenSequenceNr$ extends scala.runtime.AbstractFunction2\<[ReplicaId](akka/persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<java.lang.Object\>,​akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetSeenSequenceNr\> implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetState extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetState$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetStateReply extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetStateReply$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetVersion extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetVersion$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<akka.persistence.typed.internal.VersionVector\>,​akka.persistence.typed.internal.EventSourcedBehaviorImpl.GetVersion\> implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.WriterIdentity extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.EventSourcedBehaviorImpl.WriterIdentity$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventSourcedBehaviorImpl$](akka/persistence/typed/internal/EventSourcedBehaviorImpl$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventSourcedSettings$](akka/persistence/typed/internal/EventSourcedSettings$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventWriter.EventWriterSettings](akka/persistence/typed/internal/EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventWriter.EventWriterSettings$](akka/persistence/typed/internal/EventWriter.EventWriterSettings$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventWriter.Write](akka/persistence/typed/internal/EventWriter.Write.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventWriter.Write$](akka/persistence/typed/internal/EventWriter.Write$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction8\<java.lang.String,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option\<java.lang.Object\>,​scala.collection.immutable.Set\<java.lang.String\>,​[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[StatusReply](akka/pattern/StatusReply.html "class in akka.pattern")\<[EventWriter.WriteAck](akka/persistence/typed/internal/EventWriter.WriteAck.html "class in akka.persistence.typed.internal")\>\>,​[EventWriter.Write](akka/persistence/typed/internal/EventWriter.Write.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.internal.EventWriter.WriteAck](akka/persistence/typed/internal/EventWriter.WriteAck.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.EventWriter.WriteAck$](akka/persistence/typed/internal/EventWriter.WriteAck$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[EventWriter.WriteAck](akka/persistence/typed/internal/EventWriter.WriteAck.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class akka.persistence.typed.internal.EventWriter$AskMaxSeqNrReason$FillGaps$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.persistence.typed.internal.EventWriter$AskMaxSeqNrReason$SnapshotEvent$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.persistence.typed.internal.EventWriter$AskMaxSeqNrReason$WriteFailure extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### originalErrorDesc
			
			
			
			```
			java.lang.String originalErrorDesc
			```
	- ### Class akka.persistence.typed.internal.EventWriter$AskMaxSeqNrReason$WriteFailure$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.persistence.typed.internal.EventWriter$AskMaxSeqNrReason$WriteFailure\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.persistence.typed.internal.InternalProtocol.AsyncEffectCompleted](akka/persistence/typed/internal/InternalProtocol.AsyncEffectCompleted.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.AsyncEffectCompleted$](akka/persistence/typed/internal/InternalProtocol.AsyncEffectCompleted$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.AsyncReplicationInterceptCompleted](akka/persistence/typed/internal/InternalProtocol.AsyncReplicationInterceptCompleted.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.AsyncReplicationInterceptCompleted$](akka/persistence/typed/internal/InternalProtocol.AsyncReplicationInterceptCompleted$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction1\<scala.Function0\<[Behavior](akka/actor/typed/Behavior.html "class in akka.actor.typed")\<[InternalProtocol](akka/persistence/typed/internal/InternalProtocol.html "interface in akka.persistence.typed.internal")\>\>,​[InternalProtocol.AsyncReplicationInterceptCompleted](akka/persistence/typed/internal/InternalProtocol.AsyncReplicationInterceptCompleted.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.ContinueUnstash$](akka/persistence/typed/internal/InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.IncomingCommand](akka/persistence/typed/internal/InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.IncomingCommand$](akka/persistence/typed/internal/InternalProtocol.IncomingCommand$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.JournalResponse](akka/persistence/typed/internal/InternalProtocol.JournalResponse.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.JournalResponse$](akka/persistence/typed/internal/InternalProtocol.JournalResponse$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction1\<[JournalProtocol.Response](akka/persistence/JournalProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.JournalResponse](akka/persistence/typed/internal/InternalProtocol.JournalResponse.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.RecoveryPermitGranted$](akka/persistence/typed/internal/InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.RecoveryTickEvent](akka/persistence/typed/internal/InternalProtocol.RecoveryTickEvent.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.RecoveryTickEvent$](akka/persistence/typed/internal/InternalProtocol.RecoveryTickEvent$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[InternalProtocol.RecoveryTickEvent](akka/persistence/typed/internal/InternalProtocol.RecoveryTickEvent.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.ReplicatedEventEnvelope](akka/persistence/typed/internal/InternalProtocol.ReplicatedEventEnvelope.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.ReplicatedEventEnvelope$](akka/persistence/typed/internal/InternalProtocol.ReplicatedEventEnvelope$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.SnapshotterResponse](akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.InternalProtocol.SnapshotterResponse$](akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction1\<[SnapshotProtocol.Response](akka/persistence/SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.internal.JournalInteractions.EventToPersist](akka/persistence/typed/internal/JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.JournalInteractions.EventToPersist$](akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.String,​scala.Option\<java.lang.Object\>,​[JournalInteractions.EventToPersist](akka/persistence/typed/internal/JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.internal.ManyVersionVector$](akka/persistence/typed/internal/ManyVersionVector$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.TreeMap\<java.lang.String,​java.lang.Object\>,​akka.persistence.typed.internal.ManyVersionVector\> implements Serializable
	- ### Class [akka.persistence.typed.internal.OneVersionVector$](akka/persistence/typed/internal/OneVersionVector$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​akka.persistence.typed.internal.OneVersionVector\> implements Serializable
	- ### Class [akka.persistence.typed.internal.Persist$](akka/persistence/typed/internal/Persist$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.PersistAll$](akka/persistence/typed/internal/PersistAll$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.PersistNothing$](akka/persistence/typed/internal/PersistNothing$.html "class in akka.persistence.typed.internal") extends akka.persistence.typed.internal.EffectImpl\<scala.runtime.Nothing$,​scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.internal.PublishedEventImpl$](akka/persistence/typed/internal/PublishedEventImpl$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction6\<[PersistenceId](akka/persistence/typed/PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option\<[ReplicatedPublishedEventMetaData](akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")\>,​scala.Option\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[Done](akka/Done.html "class in akka")\>\>,​akka.persistence.typed.internal.PublishedEventImpl\> implements Serializable
	- ### Class [akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria$](akka/persistence/typed/internal/RecoveryWithSnapshotSelectionCriteria$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction1\<[SnapshotSelectionCriteria](akka/persistence/typed/SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria\> implements Serializable
	- ### Class akka.persistence.typed.internal.ReplayingEvents.ReplayingState$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplayOnlyLastRecovery$](akka/persistence/typed/internal/ReplayOnlyLastRecovery$.html "class in akka.persistence.typed.internal") extends [Recovery](akka/persistence/typed/javadsl/Recovery.html "class in akka.persistence.typed.javadsl") implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplicatedEvent$](akka/persistence/typed/internal/ReplicatedEvent$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplicatedEventAck$](akka/persistence/typed/internal/ReplicatedEventAck$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplicatedEventMetadata](akka/persistence/typed/internal/ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplicatedEventMetadata$](akka/persistence/typed/internal/ReplicatedEventMetadata$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplicatedSnapshotMetadata$](akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.ReplicationSetup$](akka/persistence/typed/internal/ReplicationSetup$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction3\<[ReplicaId](akka/persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map\<[ReplicaId](akka/persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​java.lang.String\>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup\> implements Serializable
	- ### Class akka.persistence.typed.internal.Running.RunningState extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.Running.RunningState$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl$](akka/persistence/typed/internal/SnapshotCountRetentionCriteriaImpl$.html "class in akka.persistence.typed.internal") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl\> implements Serializable
	- ### Class [akka.persistence.typed.internal.Stash$](akka/persistence/typed/internal/Stash$.html "class in akka.persistence.typed.internal") extends akka.persistence.typed.internal.EffectImpl\<scala.runtime.Nothing$,​scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.internal.StashOverflowStrategy.Drop$](akka/persistence/typed/internal/StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.StashOverflowStrategy.Fail$](akka/persistence/typed/internal/StashOverflowStrategy.Fail$.html "class in akka.persistence.typed.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.internal.Stop$](akka/persistence/typed/internal/Stop$.html "class in akka.persistence.typed.internal") extends akka.persistence.typed.internal.SideEffect\<scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.internal.Unhandled$](akka/persistence/typed/internal/Unhandled$.html "class in akka.persistence.typed.internal") extends akka.persistence.typed.internal.EffectImpl\<scala.runtime.Nothing$,​scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.internal.UnstashAll$](akka/persistence/typed/internal/UnstashAll$.html "class in akka.persistence.typed.internal") extends akka.persistence.typed.internal.SideEffect\<scala.runtime.Nothing$\> implements Serializable
	- ### Class akka.persistence.typed.internal.VersionVector.After$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.VersionVector.Before$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.VersionVector.Concurrent$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.internal.VersionVector.Same$ extends java.lang.Object implements Serializable
- ## Package akka.persistence.typed.scaladsl

	- ### Class [akka.persistence.typed.scaladsl.SnapshotWhenPredicate$](akka/persistence/typed/scaladsl/SnapshotWhenPredicate$.html "class in akka.persistence.typed.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.persistence.typed.serialization

	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.Counter](akka/persistence/typed/serialization/ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### value\_
			
			
			
			```
			akka.protobufv3.internal.ByteString value_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.CounterUpdate](akka/persistence/typed/serialization/ReplicatedEventSourcing.CounterUpdate.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### delta\_
			
			
			
			```
			akka.protobufv3.internal.ByteString delta_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSet](akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### dots\_
			
			
			
			```
			java.util.List<[ReplicatedEventSourcing.VersionVector](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")> dots_
			```
			- #### intElements\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList intElements_
			```
			- #### intElementsMemoizedSerializedSize
			
			
			
			```
			int intElementsMemoizedSerializedSize
			```
			- #### longElements\_
			
			
			
			```
			akka.protobufv3.internal.Internal.LongList longElements_
			```
			- #### longElementsMemoizedSerializedSize
			
			
			
			```
			int longElementsMemoizedSerializedSize
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### originDc\_
			
			
			
			```
			java.lang.Object originDc_
			```
			- #### otherElements\_
			
			
			
			```
			java.util.List<[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote")> otherElements_
			```
			- #### stringElements\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList stringElements_
			```
			- #### vvector\_
			
			
			
			```
			[ReplicatedEventSourcing.VersionVector](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") vvector_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaGroup](akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry](akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization")> entries_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaGroup.Entry](akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### operation\_
			
			
			
			```
			int operation_
			```
			- #### underlying\_
			
			
			
			```
			[ReplicatedEventSourcing.ORSet](akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") underlying_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.PublishedEvent](akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### metadata\_
			
			
			
			```
			[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") metadata_
			```
			- #### payload\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") payload_
			```
			- #### persistenceId\_
			
			
			
			```
			java.lang.Object persistenceId_
			```
			- #### replyTo\_
			
			
			
			```
			java.lang.Object replyTo_
			```
			- #### sequenceNr\_
			
			
			
			```
			long sequenceNr_
			```
			- #### timestamp\_
			
			
			
			```
			long timestamp_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedEventMetadata](akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### concurrent\_
			
			
			
			```
			boolean concurrent_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### originReplica\_
			
			
			
			```
			java.lang.Object originReplica_
			```
			- #### originSequenceNr\_
			
			
			
			```
			long originSequenceNr_
			```
			- #### versionVector\_
			
			
			
			```
			[ReplicatedEventSourcing.VersionVector](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") versionVector_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### metadata\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") metadata_
			```
			- #### replicaId\_
			
			
			
			```
			java.lang.Object replicaId_
			```
			- #### versionVector\_
			
			
			
			```
			[ReplicatedEventSourcing.VersionVector](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") versionVector_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata](akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### seenPerReplica\_
			
			
			
			```
			java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")> seenPerReplica_
			```
			- #### version\_
			
			
			
			```
			[ReplicatedEventSourcing.VersionVector](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") version_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### replicaId\_
			
			
			
			```
			java.lang.Object replicaId_
			```
			- #### sequenceNr\_
			
			
			
			```
			long sequenceNr_
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### entries\_
			
			
			
			```
			java.util.List<[ReplicatedEventSourcing.VersionVector.Entry](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> entries_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry](akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### key\_
			
			
			
			```
			java.lang.Object key_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### version\_
			
			
			
			```
			long version_
			```
- ## Package akka.persistence.typed.state

	- ### Class [akka.persistence.typed.state.RecoveryCompleted$](akka/persistence/typed/state/RecoveryCompleted$.html "class in akka.persistence.typed.state") extends [RecoveryCompleted](akka/persistence/typed/state/RecoveryCompleted.html "class in akka.persistence.typed.state") implements Serializable
	- ### Class [akka.persistence.typed.state.RecoveryFailed](akka/persistence/typed/state/RecoveryFailed.html "class in akka.persistence.typed.state") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.RecoveryFailed$](akka/persistence/typed/state/RecoveryFailed$.html "class in akka.persistence.typed.state") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[RecoveryFailed](akka/persistence/typed/state/RecoveryFailed.html "class in akka.persistence.typed.state")\> implements Serializable
- ## Package akka.persistence.typed.state.internal

	- ### Class [akka.persistence.typed.state.internal.CompositeEffect$](akka/persistence/typed/state/internal/CompositeEffect$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.Delete$](akka/persistence/typed/state/internal/Delete$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.state.internal.DurableStateBehaviorImpl.GetPersistenceId extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.state.internal.DurableStateBehaviorImpl.GetPersistenceId$ extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/typed/ActorRef.html "interface in akka.actor.typed")\<[PersistenceId](akka/persistence/typed/PersistenceId.html "class in akka.persistence.typed")\>,​akka.persistence.typed.state.internal.DurableStateBehaviorImpl.GetPersistenceId\> implements Serializable
	- ### Class akka.persistence.typed.state.internal.DurableStateBehaviorImpl.GetState extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.state.internal.DurableStateBehaviorImpl.GetState$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.DurableStateBehaviorImpl$](akka/persistence/typed/state/internal/DurableStateBehaviorImpl$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.DurableStateSettings$](akka/persistence/typed/state/internal/DurableStateSettings$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.ContinueUnstash$](akka/persistence/typed/state/internal/InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.DeleteFailure](akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.DeleteFailure$](akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure$.html "class in akka.persistence.typed.state.internal") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[InternalProtocol.DeleteFailure](akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure.html "class in akka.persistence.typed.state.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.DeleteSuccess$](akka/persistence/typed/state/internal/InternalProtocol.DeleteSuccess$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.GetFailure](akka/persistence/typed/state/internal/InternalProtocol.GetFailure.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.GetFailure$](akka/persistence/typed/state/internal/InternalProtocol.GetFailure$.html "class in akka.persistence.typed.state.internal") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[InternalProtocol.GetFailure](akka/persistence/typed/state/internal/InternalProtocol.GetFailure.html "class in akka.persistence.typed.state.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.GetSuccess](akka/persistence/typed/state/internal/InternalProtocol.GetSuccess.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.GetSuccess$](akka/persistence/typed/state/internal/InternalProtocol.GetSuccess$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.IncomingCommand](akka/persistence/typed/state/internal/InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.IncomingCommand$](akka/persistence/typed/state/internal/InternalProtocol.IncomingCommand$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.RecoveryPermitGranted$](akka/persistence/typed/state/internal/InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.RecoveryTimeout$](akka/persistence/typed/state/internal/InternalProtocol.RecoveryTimeout$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.UpsertFailure](akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.UpsertFailure$](akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure$.html "class in akka.persistence.typed.state.internal") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[InternalProtocol.UpsertFailure](akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure.html "class in akka.persistence.typed.state.internal")\> implements Serializable
	- ### Class [akka.persistence.typed.state.internal.InternalProtocol.UpsertSuccess$](akka/persistence/typed/state/internal/InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.Persist$](akka/persistence/typed/state/internal/Persist$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.PersistNothing$](akka/persistence/typed/state/internal/PersistNothing$.html "class in akka.persistence.typed.state.internal") extends akka.persistence.typed.state.internal.EffectImpl\<scala.runtime.Nothing$\> implements Serializable
	- ### Class akka.persistence.typed.state.internal.Recovering.RecoveryState$ extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.state.internal.Running.RunningState extends java.lang.Object implements Serializable
	- ### Class akka.persistence.typed.state.internal.Running.RunningState$ extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.Stash$](akka/persistence/typed/state/internal/Stash$.html "class in akka.persistence.typed.state.internal") extends akka.persistence.typed.state.internal.EffectImpl\<scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.state.internal.StashOverflowStrategy.Drop$](akka/persistence/typed/state/internal/StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.StashOverflowStrategy.Fail$](akka/persistence/typed/state/internal/StashOverflowStrategy.Fail$.html "class in akka.persistence.typed.state.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.persistence.typed.state.internal.Stop$](akka/persistence/typed/state/internal/Stop$.html "class in akka.persistence.typed.state.internal") extends akka.persistence.typed.state.internal.SideEffect\<scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.state.internal.Unhandled$](akka/persistence/typed/state/internal/Unhandled$.html "class in akka.persistence.typed.state.internal") extends akka.persistence.typed.state.internal.EffectImpl\<scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.persistence.typed.state.internal.UnstashAll$](akka/persistence/typed/state/internal/UnstashAll$.html "class in akka.persistence.typed.state.internal") extends akka.persistence.typed.state.internal.SideEffect\<scala.runtime.Nothing$\> implements Serializable
- ## Package akka.pki.pem

	- ### Class [akka.pki.pem.PEMLoadingException](akka/pki/pem/PEMLoadingException.html "class in akka.pki.pem") extends java.lang.RuntimeException implements Serializable
- ## Package akka.remote

	- ### Class [akka.remote.ArteryControlFormats.Address](akka/remote/ArteryControlFormats.Address.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.remote.ArteryControlFormats.ArteryHeartbeatRsp](akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### uid\_
			
			
			
			```
			long uid_
			```
	- ### Class [akka.remote.ArteryControlFormats.CompressionTableAdvertisement](akka/remote/ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") from_
			```
			- #### keys\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList keys_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### originUid\_
			
			
			
			```
			long originUid_
			```
			- #### tableVersion\_
			
			
			
			```
			int tableVersion_
			```
			- #### values\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList values_
			```
	- ### Class [akka.remote.ArteryControlFormats.CompressionTableAdvertisementAck](akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### version\_
			
			
			
			```
			int version_
			```
	- ### Class [akka.remote.ArteryControlFormats.FlushAck](akka/remote/ArteryControlFormats.FlushAck.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### expectedAcks\_
			
			
			
			```
			int expectedAcks_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.ArteryControlFormats.HandshakeReq](akka/remote/ArteryControlFormats.HandshakeReq.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### to\_
			
			
			
			```
			[ArteryControlFormats.Address](akka/remote/ArteryControlFormats.Address.html "class in akka.remote") to_
			```
	- ### Class [akka.remote.ArteryControlFormats.MessageWithAddress](akka/remote/ArteryControlFormats.MessageWithAddress.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.ArteryControlFormats.Quarantined](akka/remote/ArteryControlFormats.Quarantined.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### to\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") to_
			```
	- ### Class [akka.remote.ArteryControlFormats.SystemMessageDeliveryAck](akka/remote/ArteryControlFormats.SystemMessageDeliveryAck.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### from\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") from_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### seqNo\_
			
			
			
			```
			long seqNo_
			```
	- ### Class [akka.remote.ArteryControlFormats.SystemMessageEnvelope](akka/remote/ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### ackReplyTo\_
			
			
			
			```
			[ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") ackReplyTo_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			akka.protobufv3.internal.ByteString message_
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### seqNo\_
			
			
			
			```
			long seqNo_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.remote.ArteryControlFormats.UniqueAddress](akka/remote/ArteryControlFormats.UniqueAddress.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[ArteryControlFormats.Address](akka/remote/ArteryControlFormats.Address.html "class in akka.remote") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### uid\_
			
			
			
			```
			long uid_
			```
	- ### Class [akka.remote.ContainerFormats.ActorIdentity](akka/remote/ContainerFormats.ActorIdentity.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### correlationId\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") correlationId_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### ref\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") ref_
			```
	- ### Class [akka.remote.ContainerFormats.ActorInitializationException](akka/remote/ContainerFormats.ActorInitializationException.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### actor\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") actor_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### cause\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") cause_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			java.lang.Object message_
			```
	- ### Class [akka.remote.ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
	- ### Class [akka.remote.ContainerFormats.Identify](akka/remote/ContainerFormats.Identify.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messageId\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") messageId_
			```
	- ### Class [akka.remote.ContainerFormats.Option](akka/remote/ContainerFormats.Option.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### value\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") value_
			```
	- ### Class [akka.remote.ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### enclosedMessage\_
			
			
			
			```
			akka.protobufv3.internal.ByteString enclosedMessage_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.remote.ContainerFormats.Selection](akka/remote/ContainerFormats.Selection.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### matcher\_
			
			
			
			```
			java.lang.Object matcher_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### type\_
			
			
			
			```
			int type_
			```
	- ### Class [akka.remote.ContainerFormats.SelectionEnvelope](akka/remote/ContainerFormats.SelectionEnvelope.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### enclosedMessage\_
			
			
			
			```
			akka.protobufv3.internal.ByteString enclosedMessage_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### pattern\_
			
			
			
			```
			java.util.List<[ContainerFormats.Selection](akka/remote/ContainerFormats.Selection.html "class in akka.remote")> pattern_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
			- #### wildcardFanOut\_
			
			
			
			```
			boolean wildcardFanOut_
			```
	- ### Class [akka.remote.ContainerFormats.StackTraceElement](akka/remote/ContainerFormats.StackTraceElement.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### className\_
			
			
			
			```
			java.lang.Object className_
			```
			- #### fileName\_
			
			
			
			```
			java.lang.Object fileName_
			```
			- #### lineNumber\_
			
			
			
			```
			int lineNumber_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### methodName\_
			
			
			
			```
			java.lang.Object methodName_
			```
	- ### Class [akka.remote.ContainerFormats.StatusReplyErrorMessage](akka/remote/ContainerFormats.StatusReplyErrorMessage.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### errorMessage\_
			
			
			
			```
			java.lang.Object errorMessage_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.ContainerFormats.Throwable](akka/remote/ContainerFormats.Throwable.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### cause\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") cause_
			```
			- #### className\_
			
			
			
			```
			java.lang.Object className_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			java.lang.Object message_
			```
			- #### stackTrace\_
			
			
			
			```
			java.util.List<[ContainerFormats.StackTraceElement](akka/remote/ContainerFormats.StackTraceElement.html "class in akka.remote")> stackTrace_
			```
	- ### Class [akka.remote.ContainerFormats.ThrowableNotSerializable](akka/remote/ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			java.lang.Object message_
			```
			- #### originalClassName\_
			
			
			
			```
			java.lang.Object originalClassName_
			```
			- #### originalMessage\_
			
			
			
			```
			java.lang.Object originalMessage_
			```
	- ### Class [akka.remote.ContainerFormats.WatcherHeartbeatResponse](akka/remote/ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### uid\_
			
			
			
			```
			long uid_
			```
	- ### Class [akka.remote.DaemonMsgCreate$](akka/remote/DaemonMsgCreate$.html "class in akka.remote") extends scala.runtime.AbstractFunction4\<[Props](akka/actor/Props.html "class in akka.actor"),​[Deploy](akka/actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate\> implements Serializable
	- ### Class [akka.remote.HeartbeatHistory$](akka/remote/HeartbeatHistory$.html "class in akka.remote") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.MessageSerializer.SerializationException](akka/remote/MessageSerializer.SerializationException.html "class in akka.remote") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.remote.NotAllowedClassRemoteDeploymentAttemptException](akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html "class in akka.remote") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.remote.RARP$](akka/remote/RARP$.html "class in akka.remote") extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteActorRefProvider.Finished$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteActorRefProvider.Idle$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteActorRefProvider.Uninitialized$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteActorRefProvider.WaitDaemonShutdown$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteActorRefProvider.WaitTransportShutdown$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteDeploymentWatcher.WatchRemote extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteDeploymentWatcher.WatchRemote$ extends scala.runtime.AbstractFunction2\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.remote.RemoteDeploymentWatcher.WatchRemote\> implements Serializable
	- ### Class [akka.remote.RemoteScope](akka/remote/RemoteScope.html "class in akka.remote") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.RemoteScope$](akka/remote/RemoteScope$.html "class in akka.remote") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[RemoteScope](akka/remote/RemoteScope.html "class in akka.remote")\> implements Serializable
	- ### Class [akka.remote.RemoteTransportException](akka/remote/RemoteTransportException.html "class in akka.remote") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.remote.RemoteTransportExceptionNoStackTrace](akka/remote/RemoteTransportExceptionNoStackTrace.html "class in akka.remote") extends [RemoteTransportException](akka/remote/RemoteTransportException.html "class in akka.remote") implements Serializable
	- ### Class akka.remote.RemoteWatcher.ArteryHeartbeat$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.ArteryHeartbeatRsp extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.ArteryHeartbeatRsp$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.remote.RemoteWatcher.ArteryHeartbeatRsp\> implements Serializable
	- ### Class akka.remote.RemoteWatcher.ExpectedFirstHeartbeat extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.ExpectedFirstHeartbeat$ extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​akka.remote.RemoteWatcher.ExpectedFirstHeartbeat\> implements Serializable
	- ### Class akka.remote.RemoteWatcher.Heartbeat$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.HeartbeatRsp extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.HeartbeatRsp$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.remote.RemoteWatcher.HeartbeatRsp\> implements Serializable
	- ### Class akka.remote.RemoteWatcher.HeartbeatTick$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.ReapUnreachableTick$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.Stats extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.Stats$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.UnwatchRemote extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.UnwatchRemote$ extends scala.runtime.AbstractFunction2\<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.remote.RemoteWatcher.UnwatchRemote\> implements Serializable
	- ### Class akka.remote.RemoteWatcher.WatchRemote extends java.lang.Object implements Serializable
	- ### Class akka.remote.RemoteWatcher.WatchRemote$ extends scala.runtime.AbstractFunction2\<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.remote.RemoteWatcher.WatchRemote\> implements Serializable
	- ### Class [akka.remote.SystemMessageFormats.DeathWatchNotificationData](akka/remote/SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### actor\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") actor_
			```
			- #### addressTerminated\_
			
			
			
			```
			boolean addressTerminated_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### existenceConfirmed\_
			
			
			
			```
			boolean existenceConfirmed_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.SystemMessageFormats.FailedData](akka/remote/SystemMessageFormats.FailedData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### child\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") child_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### uid\_
			
			
			
			```
			long uid_
			```
	- ### Class [akka.remote.SystemMessageFormats.SuperviseData](akka/remote/SystemMessageFormats.SuperviseData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### async\_
			
			
			
			```
			boolean async_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### child\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") child_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.SystemMessageFormats.SystemMessage](akka/remote/SystemMessageFormats.SystemMessage.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### causeData\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") causeData_
			```
			- #### dwNotificationData\_
			
			
			
			```
			[SystemMessageFormats.DeathWatchNotificationData](akka/remote/SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") dwNotificationData_
			```
			- #### failedData\_
			
			
			
			```
			[SystemMessageFormats.FailedData](akka/remote/SystemMessageFormats.FailedData.html "class in akka.remote") failedData_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### superviseData\_
			
			
			
			```
			[SystemMessageFormats.SuperviseData](akka/remote/SystemMessageFormats.SuperviseData.html "class in akka.remote") superviseData_
			```
			- #### type\_
			
			
			
			```
			int type_
			```
			- #### watchData\_
			
			
			
			```
			[SystemMessageFormats.WatchData](akka/remote/SystemMessageFormats.WatchData.html "class in akka.remote") watchData_
			```
	- ### Class [akka.remote.SystemMessageFormats.WatchData](akka/remote/SystemMessageFormats.WatchData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### watchee\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") watchee_
			```
			- #### watcher\_
			
			
			
			```
			[ContainerFormats.ActorRef](akka/remote/ContainerFormats.ActorRef.html "class in akka.remote") watcher_
			```
	- ### Class [akka.remote.UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.UniqueAddress$](akka/remote/UniqueAddress$.html "class in akka.remote") extends scala.runtime.AbstractFunction2\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote")\> implements Serializable
	- ### Class [akka.remote.WireFormats.AckAndEnvelopeContainer](akka/remote/WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### ack\_
			
			
			
			```
			[WireFormats.AcknowledgementInfo](akka/remote/WireFormats.AcknowledgementInfo.html "class in akka.remote") ack_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### envelope\_
			
			
			
			```
			[WireFormats.RemoteEnvelope](akka/remote/WireFormats.RemoteEnvelope.html "class in akka.remote") envelope_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.WireFormats.AcknowledgementInfo](akka/remote/WireFormats.AcknowledgementInfo.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### cumulativeAck\_
			
			
			
			```
			long cumulativeAck_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### nacks\_
			
			
			
			```
			akka.protobufv3.internal.Internal.LongList nacks_
			```
	- ### Class [akka.remote.WireFormats.ActorRefData](akka/remote/WireFormats.ActorRefData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
	- ### Class [akka.remote.WireFormats.AddressData](akka/remote/WireFormats.AddressData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### hostname\_
			
			
			
			```
			java.lang.Object hostname_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.remote.WireFormats.AkkaControlMessage](akka/remote/WireFormats.AkkaControlMessage.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### commandType\_
			
			
			
			```
			int commandType_
			```
			- #### handshakeInfo\_
			
			
			
			```
			[WireFormats.AkkaHandshakeInfo](akka/remote/WireFormats.AkkaHandshakeInfo.html "class in akka.remote") handshakeInfo_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.WireFormats.AkkaHandshakeInfo](akka/remote/WireFormats.AkkaHandshakeInfo.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### cookie\_
			
			
			
			```
			java.lang.Object cookie_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### origin\_
			
			
			
			```
			[WireFormats.AddressData](akka/remote/WireFormats.AddressData.html "class in akka.remote") origin_
			```
			- #### uid\_
			
			
			
			```
			long uid_
			```
	- ### Class [akka.remote.WireFormats.AkkaProtocolMessage](akka/remote/WireFormats.AkkaProtocolMessage.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### instruction\_
			
			
			
			```
			[WireFormats.AkkaControlMessage](akka/remote/WireFormats.AkkaControlMessage.html "class in akka.remote") instruction_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			akka.protobufv3.internal.ByteString payload_
			```
	- ### Class [akka.remote.WireFormats.DaemonMsgCreateData](akka/remote/WireFormats.DaemonMsgCreateData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### deploy\_
			
			
			
			```
			[WireFormats.DeployData](akka/remote/WireFormats.DeployData.html "class in akka.remote") deploy_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
			- #### props\_
			
			
			
			```
			[WireFormats.PropsData](akka/remote/WireFormats.PropsData.html "class in akka.remote") props_
			```
			- #### supervisor\_
			
			
			
			```
			[WireFormats.ActorRefData](akka/remote/WireFormats.ActorRefData.html "class in akka.remote") supervisor_
			```
	- ### Class [akka.remote.WireFormats.DefaultResizer](akka/remote/WireFormats.DefaultResizer.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### backoffRate\_
			
			
			
			```
			double backoffRate_
			```
			- #### backoffThreshold\_
			
			
			
			```
			double backoffThreshold_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### lowerBound\_
			
			
			
			```
			int lowerBound_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messagesPerResize\_
			
			
			
			```
			int messagesPerResize_
			```
			- #### pressureThreshold\_
			
			
			
			```
			int pressureThreshold_
			```
			- #### rampupRate\_
			
			
			
			```
			double rampupRate_
			```
			- #### upperBound\_
			
			
			
			```
			int upperBound_
			```
	- ### Class [akka.remote.WireFormats.DeployData](akka/remote/WireFormats.DeployData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### config\_
			
			
			
			```
			akka.protobufv3.internal.ByteString config_
			```
			- #### configManifest\_
			
			
			
			```
			java.lang.Object configManifest_
			```
			- #### configSerializerId\_
			
			
			
			```
			int configSerializerId_
			```
			- #### dispatcher\_
			
			
			
			```
			java.lang.Object dispatcher_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
			- #### routerConfig\_
			
			
			
			```
			akka.protobufv3.internal.ByteString routerConfig_
			```
			- #### routerConfigManifest\_
			
			
			
			```
			java.lang.Object routerConfigManifest_
			```
			- #### routerConfigSerializerId\_
			
			
			
			```
			int routerConfigSerializerId_
			```
			- #### scope\_
			
			
			
			```
			akka.protobufv3.internal.ByteString scope_
			```
			- #### scopeManifest\_
			
			
			
			```
			java.lang.Object scopeManifest_
			```
			- #### scopeSerializerId\_
			
			
			
			```
			int scopeSerializerId_
			```
			- #### tags\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList tags_
			```
	- ### Class [akka.remote.WireFormats.FiniteDuration](akka/remote/WireFormats.FiniteDuration.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### unit\_
			
			
			
			```
			int unit_
			```
			- #### value\_
			
			
			
			```
			long value_
			```
	- ### Class [akka.remote.WireFormats.FromConfig](akka/remote/WireFormats.FromConfig.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### resizer\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") resizer_
			```
			- #### routerDispatcher\_
			
			
			
			```
			java.lang.Object routerDispatcher_
			```
	- ### Class [akka.remote.WireFormats.GenericRoutingPool](akka/remote/WireFormats.GenericRoutingPool.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### nrOfInstances\_
			
			
			
			```
			int nrOfInstances_
			```
			- #### resizer\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") resizer_
			```
			- #### routerDispatcher\_
			
			
			
			```
			java.lang.Object routerDispatcher_
			```
			- #### usePoolDispatcher\_
			
			
			
			```
			boolean usePoolDispatcher_
			```
	- ### Class [akka.remote.WireFormats.PropsData](akka/remote/WireFormats.PropsData.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### args\_
			
			
			
			```
			akka.protobufv3.internal.Internal.ProtobufList<akka.protobufv3.internal.ByteString> args_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### clazz\_
			
			
			
			```
			java.lang.Object clazz_
			```
			- #### deploy\_
			
			
			
			```
			[WireFormats.DeployData](akka/remote/WireFormats.DeployData.html "class in akka.remote") deploy_
			```
			- #### hasManifest\_
			
			
			
			```
			akka.protobufv3.internal.Internal.BooleanList hasManifest_
			```
			- #### manifests\_
			
			
			
			```
			akka.protobufv3.internal.LazyStringArrayList manifests_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### serializerIds\_
			
			
			
			```
			akka.protobufv3.internal.Internal.IntList serializerIds_
			```
	- ### Class [akka.remote.WireFormats.RemoteEnvelope](akka/remote/WireFormats.RemoteEnvelope.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			[WireFormats.SerializedMessage](akka/remote/WireFormats.SerializedMessage.html "class in akka.remote") message_
			```
			- #### recipient\_
			
			
			
			```
			[WireFormats.ActorRefData](akka/remote/WireFormats.ActorRefData.html "class in akka.remote") recipient_
			```
			- #### sender\_
			
			
			
			```
			[WireFormats.ActorRefData](akka/remote/WireFormats.ActorRefData.html "class in akka.remote") sender_
			```
			- #### seq\_
			
			
			
			```
			long seq_
			```
	- ### Class [akka.remote.WireFormats.RemoteRouterConfig](akka/remote/WireFormats.RemoteRouterConfig.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### local\_
			
			
			
			```
			[ContainerFormats.Payload](akka/remote/ContainerFormats.Payload.html "class in akka.remote") local_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### nodes\_
			
			
			
			```
			java.util.List<[WireFormats.AddressData](akka/remote/WireFormats.AddressData.html "class in akka.remote")> nodes_
			```
	- ### Class [akka.remote.WireFormats.RemoteScope](akka/remote/WireFormats.RemoteScope.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### node\_
			
			
			
			```
			[WireFormats.AddressData](akka/remote/WireFormats.AddressData.html "class in akka.remote") node_
			```
	- ### Class [akka.remote.WireFormats.ScatterGatherPool](akka/remote/WireFormats.ScatterGatherPool.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### generic\_
			
			
			
			```
			[WireFormats.GenericRoutingPool](akka/remote/WireFormats.GenericRoutingPool.html "class in akka.remote") generic_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### within\_
			
			
			
			```
			[WireFormats.FiniteDuration](akka/remote/WireFormats.FiniteDuration.html "class in akka.remote") within_
			```
	- ### Class [akka.remote.WireFormats.SerializedMessage](akka/remote/WireFormats.SerializedMessage.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### message\_
			
			
			
			```
			akka.protobufv3.internal.ByteString message_
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.remote.WireFormats.TailChoppingPool](akka/remote/WireFormats.TailChoppingPool.html "class in akka.remote") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### generic\_
			
			
			
			```
			[WireFormats.GenericRoutingPool](akka/remote/WireFormats.GenericRoutingPool.html "class in akka.remote") generic_
			```
			- #### interval\_
			
			
			
			```
			[WireFormats.FiniteDuration](akka/remote/WireFormats.FiniteDuration.html "class in akka.remote") interval_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### within\_
			
			
			
			```
			[WireFormats.FiniteDuration](akka/remote/WireFormats.FiniteDuration.html "class in akka.remote") within_
			```
- ## Package akka.remote.artery

	- ### Class [akka.remote.artery.ActorSystemTerminating$](akka/remote/artery/ActorSystemTerminating$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminating\> implements Serializable
	- ### Class [akka.remote.artery.ActorSystemTerminatingAck$](akka/remote/artery/ActorSystemTerminatingAck$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck\> implements Serializable
	- ### Class akka.remote.artery.ArteryTransport.AeronTerminated extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.ArteryTransport.InboundStreamMatValues extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.ArteryTransport.InboundStreamMatValues$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.ArteryTransport.ShutdownSignal$ extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.ArteryTransport.ShuttingDown$ extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.Association.LazyQueueWrapper extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.Association.LazyQueueWrapper$ extends scala.runtime.AbstractFunction2\<java.util.Queue\<[OutboundEnvelope](akka/remote/artery/OutboundEnvelope.html "interface in akka.remote.artery")\>,​scala.Function0\<scala.runtime.BoxedUnit\>,​akka.remote.artery.Association.LazyQueueWrapper\> implements Serializable
	- ### Class akka.remote.artery.Association.OutboundStreamMatValues extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.Association.OutboundStreamMatValues$ extends scala.runtime.AbstractFunction3\<\<any\>,​scala.concurrent.Future\<[Done](akka/Done.html "class in akka")\>,​\<any\>,​akka.remote.artery.Association.OutboundStreamMatValues\> implements Serializable
	- ### Class akka.remote.artery.Association.OutboundStreamStopIdleSignal$ extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.Association.OutboundStreamStopQuarantinedSignal$ extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.Association.QueueWrapperImpl extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.Association.QueueWrapperImpl$ extends scala.runtime.AbstractFunction1\<java.util.Queue\<[OutboundEnvelope](akka/remote/artery/OutboundEnvelope.html "interface in akka.remote.artery")\>,​akka.remote.artery.Association.QueueWrapperImpl\> implements Serializable
	- ### Class akka.remote.artery.Association.UidCollisionException extends java.lang.IllegalArgumentException implements Serializable
	- ### Class akka.remote.artery.AssociationState.QuarantinedTimestamp extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.AssociationState.QuarantinedTimestamp$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​akka.remote.artery.AssociationState.QuarantinedTimestamp\> implements Serializable
	- ### Class akka.remote.artery.AssociationState.UidKnown$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.AssociationState.UidQuarantined$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.AssociationState.UidUnknown$ extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.CacheStatistics$](akka/remote/artery/CacheStatistics$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.CacheStatistics\> implements Serializable
	- ### Class [akka.remote.artery.Flush$](akka/remote/artery/Flush$.html "class in akka.remote.artery") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.FlushAck$](akka/remote/artery/FlushAck$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.remote.artery.FlushAck\> implements Serializable
	- ### Class [akka.remote.artery.GracefulShutdownQuarantinedEvent](akka/remote/artery/GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.GracefulShutdownQuarantinedEvent$](akka/remote/artery/GracefulShutdownQuarantinedEvent$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​java.lang.String,​[GracefulShutdownQuarantinedEvent](akka/remote/artery/GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery")\> implements Serializable
	- ### Class akka.remote.artery.InboundControlJunction.Attach$ extends scala.runtime.AbstractFunction2\<akka.remote.artery.InboundControlJunction.ControlMessageObserver,​scala.concurrent.Promise\<[Done](akka/Done.html "class in akka")\>,​akka.remote.artery.InboundControlJunction.Attach\> implements Serializable
	- ### Class akka.remote.artery.InboundControlJunction.Dettach$ extends scala.runtime.AbstractFunction1\<akka.remote.artery.InboundControlJunction.ControlMessageObserver,​akka.remote.artery.InboundControlJunction.Dettach\> implements Serializable
	- ### Class akka.remote.artery.OutboundHandshake.HandshakeReq extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.OutboundHandshake.HandshakeReq$ extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​[Address](akka/actor/Address.html "class in akka.actor"),​akka.remote.artery.OutboundHandshake.HandshakeReq\> implements Serializable
	- ### Class akka.remote.artery.OutboundHandshake.HandshakeRsp extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.OutboundHandshake.HandshakeRsp$ extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.OutboundHandshake.HandshakeRsp\> implements Serializable
	- ### Class akka.remote.artery.OutboundHandshake.HandshakeTimeoutException extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.remote.artery.Quarantined$](akka/remote/artery/Quarantined$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.Quarantined\> implements Serializable
	- ### Class [akka.remote.artery.QuarantinedEvent](akka/remote/artery/QuarantinedEvent.html "class in akka.remote.artery") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.QuarantinedEvent$](akka/remote/artery/QuarantinedEvent$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction1\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​[QuarantinedEvent](akka/remote/artery/QuarantinedEvent.html "class in akka.remote.artery")\> implements Serializable
	- ### Class akka.remote.artery.RestartCounter.State extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.RestartCounter.State$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.concurrent.duration.Deadline,​akka.remote.artery.RestartCounter.State\> implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.Ack extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.Ack$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.SystemMessageDelivery.Ack\> implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.ClearSystemMessageDelivery extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.ClearSystemMessageDelivery$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.remote.artery.SystemMessageDelivery.ClearSystemMessageDelivery\> implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.GaveUpSystemMessageException extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.Nack extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.Nack$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.SystemMessageDelivery.Nack\> implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.SystemMessageEnvelope extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.SystemMessageDelivery.SystemMessageEnvelope$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.SystemMessageDelivery.SystemMessageEnvelope\> implements Serializable
	- ### Class [akka.remote.artery.TestManagementCommands.FailInboundStreamOnce](akka/remote/artery/TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.TestManagementCommands.FailInboundStreamOnce$](akka/remote/artery/TestManagementCommands.FailInboundStreamOnce$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](akka/remote/artery/TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")\> implements Serializable
	- ### Class [akka.remote.artery.TestState$](akka/remote/artery/TestState$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Map\<[Address](akka/actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set\<[Address](akka/actor/Address.html "class in akka.actor")\>\>,​scala.Option\<java.lang.Throwable\>,​akka.remote.artery.TestState\> implements Serializable
	- ### Class [akka.remote.artery.ThisActorSystemQuarantinedEvent](akka/remote/artery/ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.ThisActorSystemQuarantinedEvent$](akka/remote/artery/ThisActorSystemQuarantinedEvent$.html "class in akka.remote.artery") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​[ThisActorSystemQuarantinedEvent](akka/remote/artery/ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery")\> implements Serializable
- ## Package akka.remote.artery.aeron

	- ### Class akka.remote.artery.aeron.AeronSink.GaveUpMessageException extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.aeron.AeronSink.PublicationClosedException extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.artery.aeron.TaskRunner.Add extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.aeron.TaskRunner.Add$ extends scala.runtime.AbstractFunction1\<scala.Function0\<java.lang.Object\>,​akka.remote.artery.aeron.TaskRunner.Add\> implements Serializable
	- ### Class akka.remote.artery.aeron.TaskRunner.CommandQueue extends [AbstractNodeQueue](akka/dispatch/AbstractNodeQueue.html "class in akka.dispatch")\<akka.remote.artery.aeron.TaskRunner.Command\> implements Serializable
	- ### Class akka.remote.artery.aeron.TaskRunner.Remove extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.aeron.TaskRunner.Remove$ extends scala.runtime.AbstractFunction1\<scala.Function0\<java.lang.Object\>,​akka.remote.artery.aeron.TaskRunner.Remove\> implements Serializable
	- ### Class akka.remote.artery.aeron.TaskRunner.Shutdown$ extends java.lang.Object implements Serializable
- ## Package akka.remote.artery.compress

	- ### Class [akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisement$](akka/remote/artery/compress/CompressionProtocol.ActorRefCompressionAdvertisement$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisement\> implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck$](akka/remote/artery/compress/CompressionProtocol.ActorRefCompressionAdvertisementAck$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck\> implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.ClassManifestCompressionAdvertisement$](akka/remote/artery/compress/CompressionProtocol.ClassManifestCompressionAdvertisement$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<java.lang.String\>,​akka.remote.artery.compress.CompressionProtocol.ClassManifestCompressionAdvertisement\> implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.ClassManifestCompressionAdvertisementAck$](akka/remote/artery/compress/CompressionProtocol.ClassManifestCompressionAdvertisementAck$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ClassManifestCompressionAdvertisementAck\> implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.Events$.HeavyHitterDetected](akka/remote/artery/compress/CompressionProtocol.Events$.HeavyHitterDetected.html "class in akka.remote.artery.compress") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.Events$.HeavyHitterDetected$](akka/remote/artery/compress/CompressionProtocol.Events$.HeavyHitterDetected$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.Events.HeavyHitterDetected\> implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedActorRefCompressionTable](akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedActorRefCompressionTable.html "class in akka.remote.artery.compress") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedActorRefCompressionTable$](akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedActorRefCompressionTable$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedActorRefCompressionTable\> implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedClassManifestCompressionTable](akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable.html "class in akka.remote.artery.compress") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$](akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html "class in akka.remote.artery.compress") extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<java.lang.String\>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable\> implements Serializable
	- ### Class akka.remote.artery.compress.CompressionProtocol$Events$HeavyHitterDetected extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### count
			
			
			
			```
			long count
			```
			- #### id
			
			
			
			```
			int id
			```
			- #### key
			
			
			
			```
			java.lang.Object key
			```
	- ### Class akka.remote.artery.compress.CompressionProtocol$Events$HeavyHitterDetected$ extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol$Events$HeavyHitterDetected\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.remote.artery.compress.CompressionProtocol$Events$ReceivedActorRefCompressionTable extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### from
			
			
			
			```
			[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote") from
			```
			- #### table
			
			
			
			```
			akka.remote.artery.compress.CompressionTable<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")> table
			```
	- ### Class akka.remote.artery.compress.CompressionProtocol$Events$ReceivedActorRefCompressionTable$ extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​akka.remote.artery.compress.CompressionProtocol$Events$ReceivedActorRefCompressionTable\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.remote.artery.compress.CompressionProtocol$Events$ReceivedClassManifestCompressionTable extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### from
			
			
			
			```
			[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote") from
			```
			- #### table
			
			
			
			```
			akka.remote.artery.compress.CompressionTable<java.lang.String> table
			```
	- ### Class akka.remote.artery.compress.CompressionProtocol$Events$ReceivedClassManifestCompressionTable$ extends scala.runtime.AbstractFunction2\<[UniqueAddress](akka/remote/UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<java.lang.String\>,​akka.remote.artery.compress.CompressionProtocol$Events$ReceivedClassManifestCompressionTable\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.remote.artery.compress.DecompressionTable$](akka/remote/artery/compress/DecompressionTable$.html "class in akka.remote.artery.compress") extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.compress.InboundCompression.Tables extends java.lang.Object implements Serializable
	- ### Class akka.remote.artery.compress.InboundCompression.Tables$ extends java.lang.Object implements Serializable
	- ### Class [akka.remote.artery.compress.NoInboundCompressions$](akka/remote/artery/compress/NoInboundCompressions$.html "class in akka.remote.artery.compress") extends java.lang.Object implements Serializable
- ## Package akka.remote.artery.tcp

	- ### Class [akka.remote.artery.tcp.SslTransportException](akka/remote/artery/tcp/SslTransportException.html "class in akka.remote.artery.tcp") extends java.lang.RuntimeException implements Serializable
- ## Package akka.remote.routing

	- ### Class [akka.remote.routing.RemoteRouterConfig](akka/remote/routing/RemoteRouterConfig.html "class in akka.remote.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.routing.RemoteRouterConfig$](akka/remote/routing/RemoteRouterConfig$.html "class in akka.remote.routing") extends scala.runtime.AbstractFunction2\<[Pool](akka/routing/Pool.html "interface in akka.routing"),​scala.collection.Iterable\<[Address](akka/actor/Address.html "class in akka.actor")\>,​[RemoteRouterConfig](akka/remote/routing/RemoteRouterConfig.html "class in akka.remote.routing")\> implements Serializable
- ## Package akka.remote.serialization

	- ### Class [akka.remote.serialization.ThrowableNotSerializableException](akka/remote/serialization/ThrowableNotSerializableException.html "class in akka.remote.serialization") extends java.lang.IllegalArgumentException implements Serializable
- ## Package akka.remote.testconductor

	- ### Class [akka.remote.testconductor.AddressReply$](akka/remote/testconductor/AddressReply$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction2\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​[Address](akka/actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.BarrierEmpty extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.BarrierEmpty$ extends scala.runtime.AbstractFunction2\<akka.remote.testconductor.BarrierCoordinator.Data,​java.lang.String,​akka.remote.testconductor.BarrierCoordinator.BarrierEmpty\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.BarrierTimeout extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.BarrierTimeout$ extends scala.runtime.AbstractFunction1\<akka.remote.testconductor.BarrierCoordinator.Data,​akka.remote.testconductor.BarrierCoordinator.BarrierTimeout\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.ClientLost extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.ClientLost$ extends scala.runtime.AbstractFunction2\<akka.remote.testconductor.BarrierCoordinator.Data,​[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.BarrierCoordinator.ClientLost\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.Data extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.Data$ extends scala.runtime.AbstractFunction4\<scala.collection.immutable.Set\<akka.remote.testconductor.Controller.NodeInfo\>,​java.lang.String,​scala.collection.immutable.List\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>,​scala.concurrent.duration.Deadline,​akka.remote.testconductor.BarrierCoordinator.Data\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.DuplicateNode extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.DuplicateNode$ extends scala.runtime.AbstractFunction2\<akka.remote.testconductor.BarrierCoordinator.Data,​akka.remote.testconductor.Controller.NodeInfo,​akka.remote.testconductor.BarrierCoordinator.DuplicateNode\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.FailedBarrier extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.FailedBarrier$ extends scala.runtime.AbstractFunction1\<akka.remote.testconductor.BarrierCoordinator.Data,​akka.remote.testconductor.BarrierCoordinator.FailedBarrier\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.Idle$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.RemoveClient extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.RemoveClient$ extends scala.runtime.AbstractFunction1\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.BarrierCoordinator.RemoveClient\> implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.Waiting$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.WrongBarrier extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.BarrierCoordinator.WrongBarrier$ extends scala.runtime.AbstractFunction3\<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.remote.testconductor.BarrierCoordinator.Data,​akka.remote.testconductor.BarrierCoordinator.WrongBarrier\> implements Serializable
	- ### Class [akka.remote.testconductor.BarrierResult$](akka/remote/testconductor/BarrierResult$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​akka.remote.testconductor.BarrierResult\> implements Serializable
	- ### Class [akka.remote.testconductor.Client$](akka/remote/testconductor/Client$.html "class in akka.remote.testconductor") extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.AwaitDone$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Connected extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Connected$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Connecting$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.ConnectionFailure extends java.lang.RuntimeException implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.ConnectionFailure$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.remote.testconductor.ClientFSM.ConnectionFailure\> implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Data extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Data$ extends scala.runtime.AbstractFunction2\<scala.Option\<io.netty.channel.Channel\>,​scala.Option\<scala.Tuple2\<java.lang.String,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor")\>\>,​akka.remote.testconductor.ClientFSM.Data\> implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Disconnected$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ClientFSM.Failed$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.Controller.ClientDisconnected extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.Controller.ClientDisconnected$ extends scala.runtime.AbstractFunction1\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.Controller.ClientDisconnected\> implements Serializable
	- ### Class akka.remote.testconductor.Controller.ClientDisconnectedException extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class akka.remote.testconductor.Controller.CreateServerFSM extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.Controller.CreateServerFSM$ extends scala.runtime.AbstractFunction1\<io.netty.channel.Channel,​akka.remote.testconductor.Controller.CreateServerFSM\> implements Serializable
	- ### Class akka.remote.testconductor.Controller.GetNodes$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.Controller.GetSockAddr$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.Controller.NodeInfo extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.Controller.NodeInfo$ extends scala.runtime.AbstractFunction3\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​[Address](akka/actor/Address.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​akka.remote.testconductor.Controller.NodeInfo\> implements Serializable
	- ### Class [akka.remote.testconductor.Disconnect$](akka/remote/testconductor/Disconnect$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction3\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​java.lang.Object,​akka.remote.testconductor.Disconnect\> implements Serializable
	- ### Class [akka.remote.testconductor.DisconnectMsg$](akka/remote/testconductor/DisconnectMsg$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction2\<[Address](akka/actor/Address.html "class in akka.actor"),​java.lang.Object,​akka.remote.testconductor.DisconnectMsg\> implements Serializable
	- ### Class [akka.remote.testconductor.Done$](akka/remote/testconductor/Done$.html "class in akka.remote.testconductor") extends akka.remote.testconductor.Done implements Serializable
	- ### Class [akka.remote.testconductor.EnterBarrier$](akka/remote/testconductor/EnterBarrier$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<scala.concurrent.duration.FiniteDuration\>,​akka.remote.testconductor.EnterBarrier\> implements Serializable
	- ### Class [akka.remote.testconductor.FailBarrier$](akka/remote/testconductor/FailBarrier$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.remote.testconductor.FailBarrier\> implements Serializable
	- ### Class [akka.remote.testconductor.GetAddress$](akka/remote/testconductor/GetAddress$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress\> implements Serializable
	- ### Class [akka.remote.testconductor.Hello$](akka/remote/testconductor/Hello$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction2\<java.lang.String,​[Address](akka/actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello\> implements Serializable
	- ### Class [akka.remote.testconductor.Remove$](akka/remote/testconductor/Remove$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.Remove\> implements Serializable
	- ### Class [akka.remote.testconductor.RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testconductor.RoleName$](akka/remote/testconductor/RoleName$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<java.lang.String,​[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor")\> implements Serializable
	- ### Class [akka.remote.testconductor.Server$](akka/remote/testconductor/Server$.html "class in akka.remote.testconductor") extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ServerFSM.Initial$ extends java.lang.Object implements Serializable
	- ### Class akka.remote.testconductor.ServerFSM.Ready$ extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testconductor.Terminate$](akka/remote/testconductor/Terminate$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction2\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​scala.util.Either\<java.lang.Object,​java.lang.Object\>,​akka.remote.testconductor.Terminate\> implements Serializable
	- ### Class [akka.remote.testconductor.TerminateMsg$](akka/remote/testconductor/TerminateMsg$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<scala.util.Either\<java.lang.Object,​java.lang.Object\>,​akka.remote.testconductor.TerminateMsg\> implements Serializable
	- ### Class [akka.remote.testconductor.TestConductorProtocol.Address](akka/remote/testconductor/TestConductorProtocol.Address.html "class in akka.remote.testconductor") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### host\_
			
			
			
			```
			java.lang.Object host_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### port\_
			
			
			
			```
			int port_
			```
			- #### protocol\_
			
			
			
			```
			java.lang.Object protocol_
			```
			- #### system\_
			
			
			
			```
			java.lang.Object system_
			```
	- ### Class [akka.remote.testconductor.TestConductorProtocol.AddressRequest](akka/remote/testconductor/TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addr\_
			
			
			
			```
			[TestConductorProtocol.Address](akka/remote/testconductor/TestConductorProtocol.Address.html "class in akka.remote.testconductor") addr_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### node\_
			
			
			
			```
			java.lang.Object node_
			```
	- ### Class [akka.remote.testconductor.TestConductorProtocol.EnterBarrier](akka/remote/testconductor/TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### name\_
			
			
			
			```
			java.lang.Object name_
			```
			- #### op\_
			
			
			
			```
			int op_
			```
			- #### timeout\_
			
			
			
			```
			long timeout_
			```
	- ### Class [akka.remote.testconductor.TestConductorProtocol.Hello](akka/remote/testconductor/TestConductorProtocol.Hello.html "class in akka.remote.testconductor") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[TestConductorProtocol.Address](akka/remote/testconductor/TestConductorProtocol.Address.html "class in akka.remote.testconductor") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### name\_
			
			
			
			```
			java.lang.Object name_
			```
	- ### Class [akka.remote.testconductor.TestConductorProtocol.InjectFailure](akka/remote/testconductor/TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### address\_
			
			
			
			```
			[TestConductorProtocol.Address](akka/remote/testconductor/TestConductorProtocol.Address.html "class in akka.remote.testconductor") address_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### direction\_
			
			
			
			```
			int direction_
			```
			- #### exitValue\_
			
			
			
			```
			int exitValue_
			```
			- #### failure\_
			
			
			
			```
			int failure_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### rateMBit\_
			
			
			
			```
			float rateMBit_
			```
	- ### Class [akka.remote.testconductor.TestConductorProtocol.Wrapper](akka/remote/testconductor/TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### addr\_
			
			
			
			```
			[TestConductorProtocol.AddressRequest](akka/remote/testconductor/TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") addr_
			```
			- #### barrier\_
			
			
			
			```
			[TestConductorProtocol.EnterBarrier](akka/remote/testconductor/TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") barrier_
			```
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### done\_
			
			
			
			```
			java.lang.Object done_
			```
			- #### failure\_
			
			
			
			```
			[TestConductorProtocol.InjectFailure](akka/remote/testconductor/TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") failure_
			```
			- #### hello\_
			
			
			
			```
			[TestConductorProtocol.Hello](akka/remote/testconductor/TestConductorProtocol.Hello.html "class in akka.remote.testconductor") hello_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.remote.testconductor.Throttle$](akka/remote/testconductor/Throttle$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction4\<[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​[RoleName](akka/remote/testconductor/RoleName.html "class in akka.remote.testconductor"),​[Direction](akka/remote/testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.Throttle\> implements Serializable
	- ### Class [akka.remote.testconductor.ThrottleMsg$](akka/remote/testconductor/ThrottleMsg$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​[Direction](akka/remote/testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.ThrottleMsg\> implements Serializable
	- ### Class [akka.remote.testconductor.ToClient$](akka/remote/testconductor/ToClient$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<[ClientOp](akka/remote/testconductor/ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient\> implements Serializable
	- ### Class [akka.remote.testconductor.ToServer$](akka/remote/testconductor/ToServer$.html "class in akka.remote.testconductor") extends scala.runtime.AbstractFunction1\<[ServerOp](akka/remote/testconductor/ServerOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToServer\> implements Serializable
- ## Package akka.remote.testkit

	- ### Class [akka.remote.testkit.Blackhole$](akka/remote/testkit/Blackhole$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.Direction.Both$](akka/remote/testkit/Direction.Both$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.Direction.Receive$](akka/remote/testkit/Direction.Receive$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.Direction.Send$](akka/remote/testkit/Direction.Send$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.ForceDisassociate](akka/remote/testkit/ForceDisassociate.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.ForceDisassociate$](akka/remote/testkit/ForceDisassociate$.html "class in akka.remote.testkit") extends scala.runtime.AbstractFunction1\<[Address](akka/actor/Address.html "class in akka.actor"),​[ForceDisassociate](akka/remote/testkit/ForceDisassociate.html "class in akka.remote.testkit")\> implements Serializable
	- ### Class [akka.remote.testkit.ForceDisassociateAck$](akka/remote/testkit/ForceDisassociateAck$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.SetThrottle](akka/remote/testkit/SetThrottle.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.SetThrottle$](akka/remote/testkit/SetThrottle$.html "class in akka.remote.testkit") extends scala.runtime.AbstractFunction3\<[Address](akka/actor/Address.html "class in akka.actor"),​[Direction](akka/remote/testkit/Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](akka/remote/testkit/ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](akka/remote/testkit/SetThrottle.html "class in akka.remote.testkit")\> implements Serializable
	- ### Class [akka.remote.testkit.SetThrottleAck$](akka/remote/testkit/SetThrottleAck$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.TokenBucket](akka/remote/testkit/TokenBucket.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.remote.testkit.TokenBucket$](akka/remote/testkit/TokenBucket$.html "class in akka.remote.testkit") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[TokenBucket](akka/remote/testkit/TokenBucket.html "class in akka.remote.testkit")\> implements Serializable
	- ### Class [akka.remote.testkit.Unthrottled$](akka/remote/testkit/Unthrottled$.html "class in akka.remote.testkit") extends java.lang.Object implements Serializable
- ## Package akka.routing

	- ### Class [akka.routing.ActorRefRoutee](akka/routing/ActorRefRoutee.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ActorRefRoutee$](akka/routing/ActorRefRoutee$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](akka/routing/ActorRefRoutee.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ActorSelectionRoutee](akka/routing/ActorSelectionRoutee.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ActorSelectionRoutee$](akka/routing/ActorSelectionRoutee$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<[ActorSelection](akka/actor/ActorSelection.html "class in akka.actor"),​[ActorSelectionRoutee](akka/routing/ActorSelectionRoutee.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.AddRoutee](akka/routing/AddRoutee.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.AddRoutee$](akka/routing/AddRoutee$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<[Routee](akka/routing/Routee.html "interface in akka.routing"),​[AddRoutee](akka/routing/AddRoutee.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.AdjustPoolSize](akka/routing/AdjustPoolSize.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.AdjustPoolSize$](akka/routing/AdjustPoolSize$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[AdjustPoolSize](akka/routing/AdjustPoolSize.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.BalancingPool](akka/routing/BalancingPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.BalancingPool$](akka/routing/BalancingPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction3\<java.lang.Object,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​[BalancingPool](akka/routing/BalancingPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.Broadcast](akka/routing/Broadcast.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Broadcast$](akka/routing/Broadcast$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Broadcast](akka/routing/Broadcast.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.BroadcastGroup](akka/routing/BroadcastGroup.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.BroadcastGroup$](akka/routing/BroadcastGroup$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.String,​[BroadcastGroup](akka/routing/BroadcastGroup.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.BroadcastPool](akka/routing/BroadcastPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.BroadcastPool$](akka/routing/BroadcastPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction5\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[BroadcastPool](akka/routing/BroadcastPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ConsistentHashingGroup](akka/routing/ConsistentHashingGroup.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ConsistentHashingGroup$](akka/routing/ConsistentHashingGroup$.html "class in akka.routing") extends scala.runtime.AbstractFunction4\<scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.Object,​scala.PartialFunction\<java.lang.Object,​java.lang.Object\>,​java.lang.String,​[ConsistentHashingGroup](akka/routing/ConsistentHashingGroup.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ConsistentHashingPool](akka/routing/ConsistentHashingPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ConsistentHashingPool$](akka/routing/ConsistentHashingPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction7\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​java.lang.Object,​scala.PartialFunction\<java.lang.Object,​java.lang.Object\>,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ConsistentHashingPool](akka/routing/ConsistentHashingPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope](akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope$](akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ConsistentHashingRoutingLogic](akka/routing/ConsistentHashingRoutingLogic.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ConsistentHashingRoutingLogic$](akka/routing/ConsistentHashingRoutingLogic$.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ConsistentRoutee$](akka/routing/ConsistentRoutee$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<[Routee](akka/routing/Routee.html "interface in akka.routing"),​[Address](akka/actor/Address.html "class in akka.actor"),​akka.routing.ConsistentRoutee\> implements Serializable
	- ### Class [akka.routing.CustomRouterConfig](akka/routing/CustomRouterConfig.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Deafen](akka/routing/Deafen.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Deafen$](akka/routing/Deafen$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[Deafen](akka/routing/Deafen.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.DefaultOptimalSizeExploringResizer](akka/routing/DefaultOptimalSizeExploringResizer.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.DefaultOptimalSizeExploringResizer$](akka/routing/DefaultOptimalSizeExploringResizer$.html "class in akka.routing") extends scala.runtime.AbstractFunction10\<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​java.lang.Object,​java.lang.Object,​[DefaultOptimalSizeExploringResizer](akka/routing/DefaultOptimalSizeExploringResizer.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.DefaultResizer](akka/routing/DefaultResizer.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.DefaultResizer$](akka/routing/DefaultResizer$.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.FromConfig](akka/routing/FromConfig.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.FromConfig$](akka/routing/FromConfig$.html "class in akka.routing") extends [FromConfig](akka/routing/FromConfig.html "class in akka.routing") implements Serializable
	- ### Class [akka.routing.GetRoutees$](akka/routing/GetRoutees$.html "class in akka.routing") extends [GetRoutees](akka/routing/GetRoutees.html "class in akka.routing") implements Serializable
	- ### Class [akka.routing.GroupBase](akka/routing/GroupBase.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Listen](akka/routing/Listen.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Listen$](akka/routing/Listen$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[Listen](akka/routing/Listen.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.NoRouter](akka/routing/NoRouter.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.NoRouter$](akka/routing/NoRouter$.html "class in akka.routing") extends [NoRouter](akka/routing/NoRouter.html "class in akka.routing") implements Serializable
	- ### Class [akka.routing.OptimalSizeExploringResizer.ResizeRecord](akka/routing/OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.OptimalSizeExploringResizer.ResizeRecord$](akka/routing/OptimalSizeExploringResizer.ResizeRecord$.html "class in akka.routing") extends scala.runtime.AbstractFunction4\<scala.Option\<[OptimalSizeExploringResizer.UnderUtilizationStreak](akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")\>,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[OptimalSizeExploringResizer.ResizeRecord](akka/routing/OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.OptimalSizeExploringResizer.UnderUtilizationStreak](akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.OptimalSizeExploringResizer.UnderUtilizationStreak$](akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<java.time.LocalDateTime,​java.lang.Object,​[OptimalSizeExploringResizer.UnderUtilizationStreak](akka/routing/OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.OptimalSizeExploringResizer$](akka/routing/OptimalSizeExploringResizer$.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Pool$](akka/routing/Pool$.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.PoolBase](akka/routing/PoolBase.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.RandomGroup](akka/routing/RandomGroup.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.RandomGroup$](akka/routing/RandomGroup$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.String,​[RandomGroup](akka/routing/RandomGroup.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.RandomPool](akka/routing/RandomPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.RandomPool$](akka/routing/RandomPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction5\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[RandomPool](akka/routing/RandomPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.RemoveRoutee](akka/routing/RemoveRoutee.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.RemoveRoutee$](akka/routing/RemoveRoutee$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<[Routee](akka/routing/Routee.html "interface in akka.routing"),​[RemoveRoutee](akka/routing/RemoveRoutee.html "class in akka.routing")\> implements Serializable
	- ### Class akka.routing.ResizablePoolActor.Resize$ extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ResizerInitializationException](akka/routing/ResizerInitializationException.html "class in akka.routing") extends [AkkaException](akka/AkkaException.html "class in akka") implements Serializable
	- ### Class [akka.routing.RoundRobinGroup](akka/routing/RoundRobinGroup.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.RoundRobinGroup$](akka/routing/RoundRobinGroup$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.String,​[RoundRobinGroup](akka/routing/RoundRobinGroup.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.RoundRobinPool](akka/routing/RoundRobinPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.RoundRobinPool$](akka/routing/RoundRobinPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction5\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[RoundRobinPool](akka/routing/RoundRobinPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.Routees](akka/routing/Routees.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Routees$](akka/routing/Routees$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.IndexedSeq\<[Routee](akka/routing/Routee.html "interface in akka.routing")\>,​[Routees](akka/routing/Routees.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.Router](akka/routing/Router.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.Router$](akka/routing/Router$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<[RoutingLogic](akka/routing/RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq\<[Routee](akka/routing/Routee.html "interface in akka.routing")\>,​[Router](akka/routing/Router.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedGroup](akka/routing/ScatterGatherFirstCompletedGroup.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedGroup$](akka/routing/ScatterGatherFirstCompletedGroup$.html "class in akka.routing") extends scala.runtime.AbstractFunction3\<scala.collection.immutable.Iterable\<java.lang.String\>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](akka/routing/ScatterGatherFirstCompletedGroup.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedPool](akka/routing/ScatterGatherFirstCompletedPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedPool$](akka/routing/ScatterGatherFirstCompletedPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction6\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ScatterGatherFirstCompletedPool](akka/routing/ScatterGatherFirstCompletedPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedRoutees$](akka/routing/ScatterGatherFirstCompletedRoutees$.html "class in akka.routing") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.IndexedSeq\<[Routee](akka/routing/Routee.html "interface in akka.routing")\>,​scala.concurrent.duration.FiniteDuration,​akka.routing.ScatterGatherFirstCompletedRoutees\> implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedRoutingLogic](akka/routing/ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.ScatterGatherFirstCompletedRoutingLogic$](akka/routing/ScatterGatherFirstCompletedRoutingLogic$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[ScatterGatherFirstCompletedRoutingLogic](akka/routing/ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.SeveralRoutees](akka/routing/SeveralRoutees.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.SeveralRoutees$](akka/routing/SeveralRoutees$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.IndexedSeq\<[Routee](akka/routing/Routee.html "interface in akka.routing")\>,​[SeveralRoutees](akka/routing/SeveralRoutees.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.SmallestMailboxPool](akka/routing/SmallestMailboxPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.SmallestMailboxPool$](akka/routing/SmallestMailboxPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction5\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[SmallestMailboxPool](akka/routing/SmallestMailboxPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.TailChoppingGroup](akka/routing/TailChoppingGroup.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.TailChoppingGroup$](akka/routing/TailChoppingGroup$.html "class in akka.routing") extends scala.runtime.AbstractFunction4\<scala.collection.immutable.Iterable\<java.lang.String\>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](akka/routing/TailChoppingGroup.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.TailChoppingPool](akka/routing/TailChoppingPool.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.TailChoppingPool$](akka/routing/TailChoppingPool$.html "class in akka.routing") extends scala.runtime.AbstractFunction7\<java.lang.Object,​scala.Option\<[Resizer](akka/routing/Resizer.html "interface in akka.routing")\>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[TailChoppingPool](akka/routing/TailChoppingPool.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.TailChoppingRoutees$](akka/routing/TailChoppingRoutees$.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.TailChoppingRoutingLogic](akka/routing/TailChoppingRoutingLogic.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.TailChoppingRoutingLogic$](akka/routing/TailChoppingRoutingLogic$.html "class in akka.routing") extends scala.runtime.AbstractFunction4\<[Scheduler](akka/actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](akka/routing/TailChoppingRoutingLogic.html "class in akka.routing")\> implements Serializable
	- ### Class [akka.routing.WithListeners](akka/routing/WithListeners.html "class in akka.routing") extends java.lang.Object implements Serializable
	- ### Class [akka.routing.WithListeners$](akka/routing/WithListeners$.html "class in akka.routing") extends scala.runtime.AbstractFunction1\<scala.Function1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit\>,​[WithListeners](akka/routing/WithListeners.html "class in akka.routing")\> implements Serializable
- ## Package akka.serialization

	- ### Class [akka.serialization.DisabledJavaSerializer](akka/serialization/DisabledJavaSerializer.html "class in akka.serialization") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.DisabledJavaSerializer.JavaSerializationException](akka/serialization/DisabledJavaSerializer.JavaSerializationException.html "class in akka.serialization") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.serialization.DisabledJavaSerializer$](akka/serialization/DisabledJavaSerializer$.html "class in akka.serialization") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.Serialization.Information](akka/serialization/Serialization.Information.html "class in akka.serialization") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.Serialization.Information$](akka/serialization/Serialization.Information$.html "class in akka.serialization") extends scala.runtime.AbstractFunction2\<[Address](akka/actor/Address.html "class in akka.actor"),​[ActorSystem](akka/actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](akka/serialization/Serialization.Information.html "class in akka.serialization")\> implements Serializable
- ## Package akka.serialization.jackson

	- ### Class [akka.serialization.jackson.ActorRefDeserializer$](akka/serialization/jackson/ActorRefDeserializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.ActorRefSerializer$](akka/serialization/jackson/ActorRefSerializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.AddressDeserializer$](akka/serialization/jackson/AddressDeserializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.AddressSerializer$](akka/serialization/jackson/AddressSerializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.AkkaSerializationDeserializer](akka/serialization/jackson/AkkaSerializationDeserializer.html "class in akka.serialization.jackson") extends com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer\<java.lang.Object\> implements Serializable
	- ### Class [akka.serialization.jackson.AkkaSerializationSerializer](akka/serialization/jackson/AkkaSerializationSerializer.html "class in akka.serialization.jackson") extends com.fasterxml.jackson.databind.ser.std.StdScalarSerializer\<java.lang.Object\> implements Serializable
	- ### Class [akka.serialization.jackson.Compression.GZip](akka/serialization/jackson/Compression.GZip.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.Compression.GZip$](akka/serialization/jackson/Compression.GZip$.html "class in akka.serialization.jackson") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Compression.GZip](akka/serialization/jackson/Compression.GZip.html "class in akka.serialization.jackson")\> implements Serializable
	- ### Class [akka.serialization.jackson.Compression.LZ4](akka/serialization/jackson/Compression.LZ4.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.Compression.LZ4$](akka/serialization/jackson/Compression.LZ4$.html "class in akka.serialization.jackson") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Compression.LZ4](akka/serialization/jackson/Compression.LZ4.html "class in akka.serialization.jackson")\> implements Serializable
	- ### Class [akka.serialization.jackson.FiniteDurationDeserializer$](akka/serialization/jackson/FiniteDurationDeserializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.FiniteDurationSerializer$](akka/serialization/jackson/FiniteDurationSerializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class akka.serialization.jackson.JacksonSerializer.LZ4Meta extends java.lang.Object implements Serializable
	- ### Class akka.serialization.jackson.JacksonSerializer.LZ4Meta$ extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.SinkRefDeserializer$](akka/serialization/jackson/SinkRefDeserializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.SinkRefSerializer$](akka/serialization/jackson/SinkRefSerializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.SourceRefDeserializer$](akka/serialization/jackson/SourceRefDeserializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.SourceRefSerializer$](akka/serialization/jackson/SourceRefSerializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.TypedActorRefDeserializer$](akka/serialization/jackson/TypedActorRefDeserializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
	- ### Class [akka.serialization.jackson.TypedActorRefSerializer$](akka/serialization/jackson/TypedActorRefSerializer$.html "class in akka.serialization.jackson") extends java.lang.Object implements Serializable
- ## Package akka.stream

	- ### Class [akka.stream.AbruptIOTerminationException](akka/stream/AbruptIOTerminationException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.AbruptIOTerminationException$](akka/stream/AbruptIOTerminationException$.html "class in akka.stream") extends scala.runtime.AbstractFunction2\<[IOResult](akka/stream/IOResult.html "class in akka.stream"),​java.lang.Throwable,​[AbruptIOTerminationException](akka/stream/AbruptIOTerminationException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.AbruptStageTerminationException](akka/stream/AbruptStageTerminationException.html "class in akka.stream") extends [AbruptStreamTerminationException](akka/stream/AbruptStreamTerminationException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.AbruptStreamTerminationException](akka/stream/AbruptStreamTerminationException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.AbruptTerminationException](akka/stream/AbruptTerminationException.html "class in akka.stream") extends [AbruptStreamTerminationException](akka/stream/AbruptStreamTerminationException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.AbruptTerminationException$](akka/stream/AbruptTerminationException$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](akka/stream/AbruptTerminationException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.DebugLogging](akka/stream/ActorAttributes.DebugLogging.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.DebugLogging$](akka/stream/ActorAttributes.DebugLogging$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ActorAttributes.DebugLogging](akka/stream/ActorAttributes.DebugLogging.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.Dispatcher](akka/stream/ActorAttributes.Dispatcher.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.Dispatcher$](akka/stream/ActorAttributes.Dispatcher$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ActorAttributes.Dispatcher](akka/stream/ActorAttributes.Dispatcher.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.FuzzingMode](akka/stream/ActorAttributes.FuzzingMode.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.FuzzingMode$](akka/stream/ActorAttributes.FuzzingMode$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ActorAttributes.FuzzingMode](akka/stream/ActorAttributes.FuzzingMode.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.MaxFixedBufferSize](akka/stream/ActorAttributes.MaxFixedBufferSize.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.MaxFixedBufferSize$](akka/stream/ActorAttributes.MaxFixedBufferSize$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ActorAttributes.MaxFixedBufferSize](akka/stream/ActorAttributes.MaxFixedBufferSize.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.OutputBurstLimit](akka/stream/ActorAttributes.OutputBurstLimit.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.OutputBurstLimit$](akka/stream/ActorAttributes.OutputBurstLimit$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ActorAttributes.OutputBurstLimit](akka/stream/ActorAttributes.OutputBurstLimit.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.StreamSubscriptionTimeout](akka/stream/ActorAttributes.StreamSubscriptionTimeout.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.StreamSubscriptionTimeout$](akka/stream/ActorAttributes.StreamSubscriptionTimeout$.html "class in akka.stream") extends scala.runtime.AbstractFunction2\<scala.concurrent.duration.FiniteDuration,​[StreamSubscriptionTimeoutTerminationMode](akka/stream/StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream"),​[ActorAttributes.StreamSubscriptionTimeout](akka/stream/ActorAttributes.StreamSubscriptionTimeout.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.SupervisionStrategy](akka/stream/ActorAttributes.SupervisionStrategy.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.SupervisionStrategy$](akka/stream/ActorAttributes.SupervisionStrategy$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<scala.Function1\<java.lang.Throwable,​[Supervision.Directive](akka/stream/Supervision.Directive.html "interface in akka.stream")\>,​[ActorAttributes.SupervisionStrategy](akka/stream/ActorAttributes.SupervisionStrategy.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ActorAttributes.SyncProcessingLimit](akka/stream/ActorAttributes.SyncProcessingLimit.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.ActorAttributes.SyncProcessingLimit$](akka/stream/ActorAttributes.SyncProcessingLimit$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ActorAttributes.SyncProcessingLimit](akka/stream/ActorAttributes.SyncProcessingLimit.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.AmorphousShape](akka/stream/AmorphousShape.html "class in akka.stream") extends [Shape](akka/stream/Shape.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.AmorphousShape$](akka/stream/AmorphousShape$.html "class in akka.stream") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Seq\<[Inlet](akka/stream/Inlet.html "class in akka.stream")\<?\>\>,​scala.collection.immutable.Seq\<[Outlet](akka/stream/Outlet.html "class in akka.stream")\<?\>\>,​[AmorphousShape](akka/stream/AmorphousShape.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.Attributes](akka/stream/Attributes.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.AsyncBoundary$](akka/stream/Attributes.AsyncBoundary$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy](akka/stream/Attributes.CancellationStrategy.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy$](akka/stream/Attributes.CancellationStrategy$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy$.AfterDelay](akka/stream/Attributes.CancellationStrategy$.AfterDelay.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy$.AfterDelay$](akka/stream/Attributes.CancellationStrategy$.AfterDelay$.html "class in akka.stream") extends scala.runtime.AbstractFunction2\<scala.concurrent.duration.FiniteDuration,​akka.stream.Attributes.CancellationStrategy.Strategy,​akka.stream.Attributes.CancellationStrategy.AfterDelay\> implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy$.CompleteStage$](akka/stream/Attributes.CancellationStrategy$.CompleteStage$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy$.FailStage$](akka/stream/Attributes.CancellationStrategy$.FailStage$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.CancellationStrategy$.PropagateFailure$](akka/stream/Attributes.CancellationStrategy$.PropagateFailure$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.InputBuffer](akka/stream/Attributes.InputBuffer.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.InputBuffer$](akka/stream/Attributes.InputBuffer$.html "class in akka.stream") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[Attributes.InputBuffer](akka/stream/Attributes.InputBuffer.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.Attributes.LogLevels](akka/stream/Attributes.LogLevels.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.LogLevels$](akka/stream/Attributes.LogLevels$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.Name](akka/stream/Attributes.Name.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Attributes.Name$](akka/stream/Attributes.Name$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Attributes.Name](akka/stream/Attributes.Name.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.Attributes$](akka/stream/Attributes$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class akka.stream.Attributes$CancellationStrategy$AfterDelay extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### delay
			
			
			
			```
			scala.concurrent.duration.FiniteDuration delay
			```
			- #### strategy
			
			
			
			```
			akka.stream.Attributes$CancellationStrategy$Strategy strategy
			```
	- ### Class akka.stream.Attributes$CancellationStrategy$AfterDelay$ extends scala.runtime.AbstractFunction2\<scala.concurrent.duration.FiniteDuration,​akka.stream.Attributes$CancellationStrategy$Strategy,​akka.stream.Attributes$CancellationStrategy$AfterDelay\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.Attributes$CancellationStrategy$CompleteStage$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.Attributes$CancellationStrategy$FailStage$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.Attributes$CancellationStrategy$PropagateFailure$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.stream.BackpressureTimeoutException](akka/stream/BackpressureTimeoutException.html "class in akka.stream") extends [StreamTimeoutException](akka/stream/StreamTimeoutException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.BidiShape](akka/stream/BidiShape.html "class in akka.stream") extends [Shape](akka/stream/Shape.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.BidiShape$](akka/stream/BidiShape$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.BindFailedException](akka/stream/BindFailedException.html "class in akka.stream") extends [StreamTcpException](akka/stream/StreamTcpException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.BindFailedException$](akka/stream/BindFailedException$.html "class in akka.stream") extends [BindFailedException](akka/stream/BindFailedException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.BufferOverflowException](akka/stream/BufferOverflowException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.BufferOverflowException$](akka/stream/BufferOverflowException$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.String,​[BufferOverflowException](akka/stream/BufferOverflowException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.Client$](akka/stream/Client$.html "class in akka.stream") extends [Client](akka/stream/Client.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.CompletionStrategy.Draining$](akka/stream/CompletionStrategy.Draining$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.CompletionStrategy.Immediately$](akka/stream/CompletionStrategy.Immediately$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.CompletionStrategy$](akka/stream/CompletionStrategy$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.CompletionTimeoutException](akka/stream/CompletionTimeoutException.html "class in akka.stream") extends [StreamTimeoutException](akka/stream/StreamTimeoutException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.ConnectionException](akka/stream/ConnectionException.html "class in akka.stream") extends [StreamTcpException](akka/stream/StreamTcpException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.DelayOverflowStrategy](akka/stream/DelayOverflowStrategy.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.DelayOverflowStrategy$](akka/stream/DelayOverflowStrategy$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.EagerClose$](akka/stream/EagerClose$.html "class in akka.stream") extends [EagerClose](akka/stream/EagerClose.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.FanInShape.Name](akka/stream/FanInShape.Name.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanInShape.Name$](akka/stream/FanInShape.Name$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanInShape.Ports](akka/stream/FanInShape.Ports.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanInShape.Ports$](akka/stream/FanInShape.Ports$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanOutShape.Name](akka/stream/FanOutShape.Name.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanOutShape.Name$](akka/stream/FanOutShape.Name$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanOutShape.Ports](akka/stream/FanOutShape.Ports.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FanOutShape.Ports$](akka/stream/FanOutShape.Ports$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FlowMonitorState.Failed](akka/stream/FlowMonitorState.Failed.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FlowMonitorState.Failed$](akka/stream/FlowMonitorState.Failed$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[FlowMonitorState.Failed](akka/stream/FlowMonitorState.Failed.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.FlowMonitorState.Finished$](akka/stream/FlowMonitorState.Finished$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FlowMonitorState.Initialized$](akka/stream/FlowMonitorState.Initialized$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FlowMonitorState.Received](akka/stream/FlowMonitorState.Received.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FlowMonitorState.Received$](akka/stream/FlowMonitorState.Received$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.FlowShape](akka/stream/FlowShape.html "class in akka.stream") extends [Shape](akka/stream/Shape.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.FlowShape$](akka/stream/FlowShape$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.IgnoreBoth$](akka/stream/IgnoreBoth$.html "class in akka.stream") extends [IgnoreBoth](akka/stream/IgnoreBoth.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.IgnoreCancel$](akka/stream/IgnoreCancel$.html "class in akka.stream") extends [IgnoreCancel](akka/stream/IgnoreCancel.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.IgnoreComplete$](akka/stream/IgnoreComplete$.html "class in akka.stream") extends [IgnoreComplete](akka/stream/IgnoreComplete.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.InitialTimeoutException](akka/stream/InitialTimeoutException.html "class in akka.stream") extends [StreamTimeoutException](akka/stream/StreamTimeoutException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.InvalidPartnerActorException](akka/stream/InvalidPartnerActorException.html "class in akka.stream") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.stream.InvalidPartnerActorException$](akka/stream/InvalidPartnerActorException$.html "class in akka.stream") extends scala.runtime.AbstractFunction3\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](akka/stream/InvalidPartnerActorException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.InvalidSequenceNumberException](akka/stream/InvalidSequenceNumberException.html "class in akka.stream") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.stream.InvalidSequenceNumberException$](akka/stream/InvalidSequenceNumberException$.html "class in akka.stream") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.String,​[InvalidSequenceNumberException](akka/stream/InvalidSequenceNumberException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.IOOperationIncompleteException](akka/stream/IOOperationIncompleteException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.IOResult](akka/stream/IOResult.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.IOResult$](akka/stream/IOResult$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.MaterializationContext$](akka/stream/MaterializationContext$.html "class in akka.stream") extends scala.runtime.AbstractFunction3\<[Materializer](akka/stream/Materializer.html "class in akka.stream"),​[Attributes](akka/stream/Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext\> implements Serializable
	- ### Class [akka.stream.MaterializationException](akka/stream/MaterializationException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.MaterializationException$](akka/stream/MaterializationException$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.NeverMaterializedException](akka/stream/NeverMaterializedException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.OverflowStrategies.Backpressure$](akka/stream/OverflowStrategies.Backpressure$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Backpressure\> implements Serializable
	- ### Class [akka.stream.OverflowStrategies.DropBuffer$](akka/stream/OverflowStrategies.DropBuffer$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropBuffer\> implements Serializable
	- ### Class [akka.stream.OverflowStrategies.DropHead$](akka/stream/OverflowStrategies.DropHead$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropHead\> implements Serializable
	- ### Class [akka.stream.OverflowStrategies.DropNew$](akka/stream/OverflowStrategies.DropNew$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew\> implements Serializable
	- ### Class [akka.stream.OverflowStrategies.DropTail$](akka/stream/OverflowStrategies.DropTail$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropTail\> implements Serializable
	- ### Class [akka.stream.OverflowStrategies.EmitEarly$](akka/stream/OverflowStrategies.EmitEarly$.html "class in akka.stream") extends [DelayOverflowStrategy](akka/stream/DelayOverflowStrategy.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.OverflowStrategies.Fail$](akka/stream/OverflowStrategies.Fail$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[Logging.LogLevel](akka/event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail\> implements Serializable
	- ### Class [akka.stream.OverflowStrategy](akka/stream/OverflowStrategy.html "class in akka.stream") extends [DelayOverflowStrategy](akka/stream/DelayOverflowStrategy.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.OverflowStrategy$](akka/stream/OverflowStrategy$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.QueueOfferResult.Dropped$](akka/stream/QueueOfferResult.Dropped$.html "class in akka.stream") extends [QueueOfferResult](akka/stream/QueueOfferResult.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.QueueOfferResult.Enqueued$](akka/stream/QueueOfferResult.Enqueued$.html "class in akka.stream") extends [QueueOfferResult](akka/stream/QueueOfferResult.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.QueueOfferResult.Failure](akka/stream/QueueOfferResult.Failure.html "class in akka.stream") extends [QueueCompletionResult](akka/stream/QueueCompletionResult.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.QueueOfferResult.Failure$](akka/stream/QueueOfferResult.Failure$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[QueueOfferResult.Failure](akka/stream/QueueOfferResult.Failure.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.QueueOfferResult.QueueClosed$](akka/stream/QueueOfferResult.QueueClosed$.html "class in akka.stream") extends [QueueCompletionResult](akka/stream/QueueCompletionResult.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.RateExceededException](akka/stream/RateExceededException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.RemoteStreamRefActorTerminatedException](akka/stream/RemoteStreamRefActorTerminatedException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.RemoteStreamRefActorTerminatedException$](akka/stream/RemoteStreamRefActorTerminatedException$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.String,​[RemoteStreamRefActorTerminatedException](akka/stream/RemoteStreamRefActorTerminatedException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.Server$](akka/stream/Server$.html "class in akka.stream") extends [Server](akka/stream/Server.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.SinkShape](akka/stream/SinkShape.html "class in akka.stream") extends [Shape](akka/stream/Shape.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.SinkShape$](akka/stream/SinkShape$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.SourceShape](akka/stream/SourceShape.html "class in akka.stream") extends [Shape](akka/stream/Shape.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.SourceShape$](akka/stream/SourceShape$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.StreamDetachedException](akka/stream/StreamDetachedException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.StreamIdleTimeoutException](akka/stream/StreamIdleTimeoutException.html "class in akka.stream") extends [StreamTimeoutException](akka/stream/StreamTimeoutException.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.StreamLimitReachedException](akka/stream/StreamLimitReachedException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.BufferCapacity](akka/stream/StreamRefAttributes.BufferCapacity.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.BufferCapacity$](akka/stream/StreamRefAttributes.BufferCapacity$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[StreamRefAttributes.BufferCapacity](akka/stream/StreamRefAttributes.BufferCapacity.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.DemandRedeliveryInterval](akka/stream/StreamRefAttributes.DemandRedeliveryInterval.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.DemandRedeliveryInterval$](akka/stream/StreamRefAttributes.DemandRedeliveryInterval$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.DemandRedeliveryInterval](akka/stream/StreamRefAttributes.DemandRedeliveryInterval.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline](akka/stream/StreamRefAttributes.FinalTerminationSignalDeadline.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline$](akka/stream/StreamRefAttributes.FinalTerminationSignalDeadline$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.FinalTerminationSignalDeadline](akka/stream/StreamRefAttributes.FinalTerminationSignalDeadline.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.SubscriptionTimeout](akka/stream/StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.StreamRefAttributes.SubscriptionTimeout$](akka/stream/StreamRefAttributes.SubscriptionTimeout$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](akka/stream/StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.StreamRefMessages.ActorRef](akka/stream/StreamRefMessages.ActorRef.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### path\_
			
			
			
			```
			java.lang.Object path_
			```
	- ### Class [akka.stream.StreamRefMessages.CumulativeDemand](akka/stream/StreamRefMessages.CumulativeDemand.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### seqNr\_
			
			
			
			```
			long seqNr_
			```
	- ### Class [akka.stream.StreamRefMessages.OnSubscribeHandshake](akka/stream/StreamRefMessages.OnSubscribeHandshake.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### targetRef\_
			
			
			
			```
			[StreamRefMessages.ActorRef](akka/stream/StreamRefMessages.ActorRef.html "class in akka.stream") targetRef_
			```
	- ### Class [akka.stream.StreamRefMessages.Payload](akka/stream/StreamRefMessages.Payload.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### enclosedMessage\_
			
			
			
			```
			akka.protobufv3.internal.ByteString enclosedMessage_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### messageManifest\_
			
			
			
			```
			akka.protobufv3.internal.ByteString messageManifest_
			```
			- #### serializerId\_
			
			
			
			```
			int serializerId_
			```
	- ### Class [akka.stream.StreamRefMessages.RemoteStreamCompleted](akka/stream/StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### seqNr\_
			
			
			
			```
			long seqNr_
			```
	- ### Class [akka.stream.StreamRefMessages.RemoteStreamFailure](akka/stream/StreamRefMessages.RemoteStreamFailure.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### cause\_
			
			
			
			```
			akka.protobufv3.internal.ByteString cause_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
	- ### Class [akka.stream.StreamRefMessages.SequencedOnNext](akka/stream/StreamRefMessages.SequencedOnNext.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### payload\_
			
			
			
			```
			[StreamRefMessages.Payload](akka/stream/StreamRefMessages.Payload.html "class in akka.stream") payload_
			```
			- #### seqNr\_
			
			
			
			```
			long seqNr_
			```
	- ### Class [akka.stream.StreamRefMessages.SinkRef](akka/stream/StreamRefMessages.SinkRef.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### targetRef\_
			
			
			
			```
			[StreamRefMessages.ActorRef](akka/stream/StreamRefMessages.ActorRef.html "class in akka.stream") targetRef_
			```
	- ### Class [akka.stream.StreamRefMessages.SourceRef](akka/stream/StreamRefMessages.SourceRef.html "class in akka.stream") extends akka.protobufv3\.internal.GeneratedMessageV3 implements Serializable
	
	
	
	serialVersionUID:
	0L
	
		- ### Serialized Fields
		
		
			- #### bitField0\_
			
			
			
			```
			int bitField0_
			```
			- #### memoizedIsInitialized
			
			
			
			```
			byte memoizedIsInitialized
			```
			- #### originRef\_
			
			
			
			```
			[StreamRefMessages.ActorRef](akka/stream/StreamRefMessages.ActorRef.html "class in akka.stream") originRef_
			```
	- ### Class [akka.stream.StreamRefSubscriptionTimeoutException](akka/stream/StreamRefSubscriptionTimeoutException.html "class in akka.stream") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.stream.StreamRefSubscriptionTimeoutException$](akka/stream/StreamRefSubscriptionTimeoutException$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<java.lang.String,​[StreamRefSubscriptionTimeoutException](akka/stream/StreamRefSubscriptionTimeoutException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.StreamSubscriptionTimeoutTerminationMode.CancelTermination$](akka/stream/StreamSubscriptionTimeoutTerminationMode.CancelTermination$.html "class in akka.stream") extends [StreamSubscriptionTimeoutTerminationMode](akka/stream/StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.StreamSubscriptionTimeoutTerminationMode.NoopTermination$](akka/stream/StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html "class in akka.stream") extends [StreamSubscriptionTimeoutTerminationMode](akka/stream/StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.StreamSubscriptionTimeoutTerminationMode.WarnTermination$](akka/stream/StreamSubscriptionTimeoutTerminationMode.WarnTermination$.html "class in akka.stream") extends [StreamSubscriptionTimeoutTerminationMode](akka/stream/StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.StreamTcpException](akka/stream/StreamTcpException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.StreamTimeoutException](akka/stream/StreamTimeoutException.html "class in akka.stream") extends java.util.concurrent.TimeoutException implements Serializable
	- ### Class [akka.stream.SubscriptionWithCancelException.NoMoreElementsNeeded$](akka/stream/SubscriptionWithCancelException.NoMoreElementsNeeded$.html "class in akka.stream") extends [SubscriptionWithCancelException.NonFailureCancellation](akka/stream/SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.SubscriptionWithCancelException.NonFailureCancellation](akka/stream/SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.SubscriptionWithCancelException.StageWasCompleted$](akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html "class in akka.stream") extends [SubscriptionWithCancelException.NonFailureCancellation](akka/stream/SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.SubstreamCancelStrategies.Drain$](akka/stream/SubstreamCancelStrategies.Drain$.html "class in akka.stream") extends [SubstreamCancelStrategy](akka/stream/SubstreamCancelStrategy.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.SubstreamCancelStrategies.Propagate$](akka/stream/SubstreamCancelStrategies.Propagate$.html "class in akka.stream") extends [SubstreamCancelStrategy](akka/stream/SubstreamCancelStrategy.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.Supervision.Restart$](akka/stream/Supervision.Restart$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Supervision.Resume$](akka/stream/Supervision.Resume$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.Supervision.Stop$](akka/stream/Supervision.Stop$.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.TargetRefNotInitializedYetException](akka/stream/TargetRefNotInitializedYetException.html "class in akka.stream") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.stream.TargetRefNotInitializedYetException$](akka/stream/TargetRefNotInitializedYetException$.html "class in akka.stream") extends scala.runtime.AbstractFunction0\<[TargetRefNotInitializedYetException](akka/stream/TargetRefNotInitializedYetException.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.ThrottleMode.Enforcing$](akka/stream/ThrottleMode.Enforcing$.html "class in akka.stream") extends [ThrottleMode](akka/stream/ThrottleMode.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.ThrottleMode.Shaping$](akka/stream/ThrottleMode.Shaping$.html "class in akka.stream") extends [ThrottleMode](akka/stream/ThrottleMode.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.TLSClientAuth.Need$](akka/stream/TLSClientAuth.Need$.html "class in akka.stream") extends [TLSClientAuth](akka/stream/TLSClientAuth.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.TLSClientAuth.None$](akka/stream/TLSClientAuth.None$.html "class in akka.stream") extends [TLSClientAuth](akka/stream/TLSClientAuth.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.TLSClientAuth.Want$](akka/stream/TLSClientAuth.Want$.html "class in akka.stream") extends [TLSClientAuth](akka/stream/TLSClientAuth.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.TLSProtocol.NegotiateNewSession](akka/stream/TLSProtocol.NegotiateNewSession.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.TLSProtocol.NegotiateNewSession$](akka/stream/TLSProtocol.NegotiateNewSession$.html "class in akka.stream") extends [TLSProtocol.NegotiateNewSession](akka/stream/TLSProtocol.NegotiateNewSession.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.TLSProtocol.SendBytes](akka/stream/TLSProtocol.SendBytes.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.TLSProtocol.SendBytes$](akka/stream/TLSProtocol.SendBytes$.html "class in akka.stream") extends scala.runtime.AbstractFunction1\<[ByteString](akka/util/ByteString.html "class in akka.util"),​[TLSProtocol.SendBytes](akka/stream/TLSProtocol.SendBytes.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.TLSProtocol.SessionBytes](akka/stream/TLSProtocol.SessionBytes.html "class in akka.stream") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.TLSProtocol.SessionBytes$](akka/stream/TLSProtocol.SessionBytes$.html "class in akka.stream") extends scala.runtime.AbstractFunction2\<javax.net.ssl.SSLSession,​[ByteString](akka/util/ByteString.html "class in akka.util"),​[TLSProtocol.SessionBytes](akka/stream/TLSProtocol.SessionBytes.html "class in akka.stream")\> implements Serializable
	- ### Class [akka.stream.TLSProtocol.SessionTruncated$](akka/stream/TLSProtocol.SessionTruncated$.html "class in akka.stream") extends [TLSProtocol.SessionTruncated](akka/stream/TLSProtocol.SessionTruncated.html "class in akka.stream") implements Serializable
	- ### Class [akka.stream.TooManySubstreamsOpenException](akka/stream/TooManySubstreamsOpenException.html "class in akka.stream") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.stream.WatchedActorTerminatedException](akka/stream/WatchedActorTerminatedException.html "class in akka.stream") extends java.lang.RuntimeException implements Serializable
- ## Package akka.stream.scaladsl

	- ### Class [akka.stream.scaladsl.Framing.FramingException](akka/stream/scaladsl/Framing.FramingException.html "class in akka.stream.scaladsl") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.scaladsl.JsonFraming.PartialObjectException](akka/stream/scaladsl/JsonFraming.PartialObjectException.html "class in akka.stream.scaladsl") extends [Framing.FramingException](akka/stream/scaladsl/Framing.FramingException.html "class in akka.stream.scaladsl") implements Serializable
	- ### Class [akka.stream.scaladsl.JsonFraming.PartialObjectException$](akka/stream/scaladsl/JsonFraming.PartialObjectException$.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.MergeHub.ProducerFailed extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.scaladsl.Partition.PartitionOutOfBoundsException](akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html "class in akka.stream.scaladsl") extends java.lang.IndexOutOfBoundsException implements Serializable
	- ### Class [akka.stream.scaladsl.Partition.PartitionOutOfBoundsException$](akka/stream/scaladsl/Partition.PartitionOutOfBoundsException$.html "class in akka.stream.scaladsl") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Partition.PartitionOutOfBoundsException](akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html "class in akka.stream.scaladsl")\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Closed extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Closed$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.stream.scaladsl.PartitionHub.Internal.Closed\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Completed$ extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Consumer extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Consumer$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​[AsyncCallback](akka/stream/stage/AsyncCallback.html "interface in akka.stream.stage")\<akka.stream.scaladsl.PartitionHub.Internal.ConsumerEvent\>,​akka.stream.scaladsl.PartitionHub.Internal.Consumer\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.ConsumerQueue extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.ConsumerQueue$ extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.HubCompleted extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.HubCompleted$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.stream.scaladsl.PartitionHub.Internal.HubCompleted\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Initialize$ extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.NeedWakeup extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.NeedWakeup$ extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.PartitionHub.Internal.Consumer,​akka.stream.scaladsl.PartitionHub.Internal.NeedWakeup\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Open extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Open$ extends scala.runtime.AbstractFunction2\<scala.concurrent.Future\<[AsyncCallback](akka/stream/stage/AsyncCallback.html "interface in akka.stream.stage")\<akka.stream.scaladsl.PartitionHub.Internal.HubEvent\>\>,​scala.collection.immutable.List\<akka.stream.scaladsl.PartitionHub.Internal.Consumer\>,​akka.stream.scaladsl.PartitionHub.Internal.Open\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.RegistrationPending$ extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.TryPull$ extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.UnRegister extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.UnRegister$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.stream.scaladsl.PartitionHub.Internal.UnRegister\> implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub.Internal$.Wakeup$ extends java.lang.Object implements Serializable
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Closed extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### failure
			
			
			
			```
			scala.Option<java.lang.Throwable> failure
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Closed$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.stream.scaladsl.PartitionHub$Internal$Closed\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Completed$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Consumer extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### callback
			
			
			
			```
			[AsyncCallback](akka/stream/stage/AsyncCallback.html "interface in akka.stream.stage")<akka.stream.scaladsl.PartitionHub$Internal$ConsumerEvent> callback
			```
			- #### id
			
			
			
			```
			long id
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Consumer$ extends scala.runtime.AbstractFunction2\<java.lang.Object,​[AsyncCallback](akka/stream/stage/AsyncCallback.html "interface in akka.stream.stage")\<akka.stream.scaladsl.PartitionHub$Internal$ConsumerEvent\>,​akka.stream.scaladsl.PartitionHub$Internal$Consumer\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$ConsumerQueue extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### queue
			
			
			
			```
			scala.collection.immutable.Queue<java.lang.Object> queue
			```
			- #### size
			
			
			
			```
			int size
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$ConsumerQueue$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$HubCompleted extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### failure
			
			
			
			```
			scala.Option<java.lang.Throwable> failure
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$HubCompleted$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Throwable\>,​akka.stream.scaladsl.PartitionHub$Internal$HubCompleted\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Initialize$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$NeedWakeup extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### consumer
			
			
			
			```
			akka.stream.scaladsl.PartitionHub$Internal$Consumer consumer
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$NeedWakeup$ extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.PartitionHub$Internal$Consumer,​akka.stream.scaladsl.PartitionHub$Internal$NeedWakeup\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Open extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### callbackFuture
			
			
			
			```
			scala.concurrent.Future<[AsyncCallback](akka/stream/stage/AsyncCallback.html "interface in akka.stream.stage")<akka.stream.scaladsl.PartitionHub$Internal$HubEvent>> callbackFuture
			```
			- #### registrations
			
			
			
			```
			scala.collection.immutable.List<akka.stream.scaladsl.PartitionHub$Internal$Consumer> registrations
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Open$ extends scala.runtime.AbstractFunction2\<scala.concurrent.Future\<[AsyncCallback](akka/stream/stage/AsyncCallback.html "interface in akka.stream.stage")\<akka.stream.scaladsl.PartitionHub$Internal$HubEvent\>\>,​scala.collection.immutable.List\<akka.stream.scaladsl.PartitionHub$Internal$Consumer\>,​akka.stream.scaladsl.PartitionHub$Internal$Open\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$RegistrationPending$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$TryPull$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$UnRegister extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### id
			
			
			
			```
			long id
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$UnRegister$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.stream.scaladsl.PartitionHub$Internal$UnRegister\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.stream.scaladsl.PartitionHub$Internal$Wakeup$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.stream.scaladsl.RestartWithBackoffFlow.Delay](akka/stream/scaladsl/RestartWithBackoffFlow.Delay.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.RestartWithBackoffFlow.Delay$](akka/stream/scaladsl/RestartWithBackoffFlow.Delay$.html "class in akka.stream.scaladsl") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[RestartWithBackoffFlow.Delay](akka/stream/scaladsl/RestartWithBackoffFlow.Delay.html "class in akka.stream.scaladsl")\> implements Serializable
	- ### Class [akka.stream.scaladsl.RunnableGraph](akka/stream/scaladsl/RunnableGraph.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.RunnableGraph$](akka/stream/scaladsl/RunnableGraph$.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.Tcp.IncomingConnection](akka/stream/scaladsl/Tcp.IncomingConnection.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.Tcp.IncomingConnection$](akka/stream/scaladsl/Tcp.IncomingConnection$.html "class in akka.stream.scaladsl") extends scala.runtime.AbstractFunction3\<java.net.InetSocketAddress,​java.net.InetSocketAddress,​[Flow](akka/stream/scaladsl/Flow.html "class in akka.stream.scaladsl")\<[ByteString](akka/util/ByteString.html "class in akka.util"),​[ByteString](akka/util/ByteString.html "class in akka.util"),​[NotUsed](akka/NotUsed.html "class in akka")\>,​[Tcp.IncomingConnection](akka/stream/scaladsl/Tcp.IncomingConnection.html "class in akka.stream.scaladsl")\> implements Serializable
	- ### Class [akka.stream.scaladsl.Tcp.OutgoingConnection](akka/stream/scaladsl/Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.Tcp.OutgoingConnection$](akka/stream/scaladsl/Tcp.OutgoingConnection$.html "class in akka.stream.scaladsl") extends scala.runtime.AbstractFunction2\<java.net.InetSocketAddress,​java.net.InetSocketAddress,​[Tcp.OutgoingConnection](akka/stream/scaladsl/Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")\> implements Serializable
	- ### Class [akka.stream.scaladsl.Tcp.ServerBinding](akka/stream/scaladsl/Tcp.ServerBinding.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.Tcp.ServerBinding$](akka/stream/scaladsl/Tcp.ServerBinding$.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.TcpAttributes.TcpWriteBufferSize](akka/stream/scaladsl/TcpAttributes.TcpWriteBufferSize.html "class in akka.stream.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.scaladsl.TcpAttributes.TcpWriteBufferSize$](akka/stream/scaladsl/TcpAttributes.TcpWriteBufferSize$.html "class in akka.stream.scaladsl") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[TcpAttributes.TcpWriteBufferSize](akka/stream/scaladsl/TcpAttributes.TcpWriteBufferSize.html "class in akka.stream.scaladsl")\> implements Serializable
	- ### Class [akka.stream.scaladsl.TcpIdleTimeoutException](akka/stream/scaladsl/TcpIdleTimeoutException.html "class in akka.stream.scaladsl") extends java.util.concurrent.TimeoutException implements Serializable
- ## Package akka.stream.snapshot

	- ### Class [akka.stream.snapshot.ConnectionSnapshot.Closed$](akka/stream/snapshot/ConnectionSnapshot.Closed$.html "class in akka.stream.snapshot") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.snapshot.ConnectionSnapshot.ShouldPull$](akka/stream/snapshot/ConnectionSnapshot.ShouldPull$.html "class in akka.stream.snapshot") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.snapshot.ConnectionSnapshot.ShouldPush$](akka/stream/snapshot/ConnectionSnapshot.ShouldPush$.html "class in akka.stream.snapshot") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.snapshot.ConnectionSnapshotImpl$](akka/stream/snapshot/ConnectionSnapshotImpl$.html "class in akka.stream.snapshot") extends scala.runtime.AbstractFunction4\<java.lang.Object,​[LogicSnapshot](akka/stream/snapshot/LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](akka/stream/snapshot/LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](akka/stream/snapshot/ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"),​akka.stream.snapshot.ConnectionSnapshotImpl\> implements Serializable
	- ### Class [akka.stream.snapshot.LogicSnapshotImpl$](akka/stream/snapshot/LogicSnapshotImpl$.html "class in akka.stream.snapshot") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.String,​[Attributes](akka/stream/Attributes.html "class in akka.stream"),​akka.stream.snapshot.LogicSnapshotImpl\> implements Serializable
	- ### Class [akka.stream.snapshot.RunningInterpreterImpl$](akka/stream/snapshot/RunningInterpreterImpl$.html "class in akka.stream.snapshot") extends scala.runtime.AbstractFunction5\<scala.collection.immutable.Seq\<[LogicSnapshot](akka/stream/snapshot/LogicSnapshot.html "interface in akka.stream.snapshot")\>,​scala.collection.immutable.Seq\<[ConnectionSnapshot](akka/stream/snapshot/ConnectionSnapshot.html "interface in akka.stream.snapshot")\>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq\<[LogicSnapshot](akka/stream/snapshot/LogicSnapshot.html "interface in akka.stream.snapshot")\>,​akka.stream.snapshot.RunningInterpreterImpl\> implements Serializable
	- ### Class [akka.stream.snapshot.StreamSnapshotImpl$](akka/stream/snapshot/StreamSnapshotImpl$.html "class in akka.stream.snapshot") extends scala.runtime.AbstractFunction3\<[ActorPath](akka/actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq\<[RunningInterpreter](akka/stream/snapshot/RunningInterpreter.html "interface in akka.stream.snapshot")\>,​scala.collection.immutable.Seq\<[UninitializedInterpreter](akka/stream/snapshot/UninitializedInterpreter.html "interface in akka.stream.snapshot")\>,​akka.stream.snapshot.StreamSnapshotImpl\> implements Serializable
	- ### Class [akka.stream.snapshot.UninitializedInterpreterImpl$](akka/stream/snapshot/UninitializedInterpreterImpl$.html "class in akka.stream.snapshot") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[LogicSnapshot](akka/stream/snapshot/LogicSnapshot.html "interface in akka.stream.snapshot")\>,​akka.stream.snapshot.UninitializedInterpreterImpl\> implements Serializable
- ## Package akka.stream.stage

	- ### Class [akka.stream.stage.ConcurrentAsyncCallbackState.Event](akka/stream/stage/ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.ConcurrentAsyncCallbackState.Event$](akka/stream/stage/ConcurrentAsyncCallbackState.Event$.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.ConcurrentAsyncCallbackState.Initialized$](akka/stream/stage/ConcurrentAsyncCallbackState.Initialized$.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.ConcurrentAsyncCallbackState.Pending](akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.ConcurrentAsyncCallbackState.Pending$](akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException](akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException$](akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage") extends scala.runtime.AbstractFunction0\<[GraphStageLogic.StageActorRefNotInitializedException](akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage")\> implements Serializable
	- ### Class [akka.stream.stage.TimerMessages.Scheduled](akka/stream/stage/TimerMessages.Scheduled.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.TimerMessages.Scheduled$](akka/stream/stage/TimerMessages.Scheduled$.html "class in akka.stream.stage") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​[TimerMessages.Scheduled](akka/stream/stage/TimerMessages.Scheduled.html "class in akka.stream.stage")\> implements Serializable
	- ### Class [akka.stream.stage.TimerMessages.Timer](akka/stream/stage/TimerMessages.Timer.html "class in akka.stream.stage") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.stage.TimerMessages.Timer$](akka/stream/stage/TimerMessages.Timer$.html "class in akka.stream.stage") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[Cancellable](akka/actor/Cancellable.html "interface in akka.actor"),​[TimerMessages.Timer](akka/stream/stage/TimerMessages.Timer.html "class in akka.stream.stage")\> implements Serializable
- ## Package akka.stream.testkit

	- ### Class [akka.stream.testkit.GraphStageMessages.DownstreamFinish$](akka/stream/testkit/GraphStageMessages.DownstreamFinish$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.Failure](akka/stream/testkit/GraphStageMessages.Failure.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.Failure$](akka/stream/testkit/GraphStageMessages.Failure$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[GraphStageMessages.Failure](akka/stream/testkit/GraphStageMessages.Failure.html "class in akka.stream.testkit")\> implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.Pull$](akka/stream/testkit/GraphStageMessages.Pull$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.Push$](akka/stream/testkit/GraphStageMessages.Push$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.StageFailure](akka/stream/testkit/GraphStageMessages.StageFailure.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.StageFailure$](akka/stream/testkit/GraphStageMessages.StageFailure$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction2\<[GraphStageMessages.StageMessage](akka/stream/testkit/GraphStageMessages.StageMessage.html "interface in akka.stream.testkit"),​java.lang.Throwable,​[GraphStageMessages.StageFailure](akka/stream/testkit/GraphStageMessages.StageFailure.html "class in akka.stream.testkit")\> implements Serializable
	- ### Class [akka.stream.testkit.GraphStageMessages.UpstreamFinish$](akka/stream/testkit/GraphStageMessages.UpstreamFinish$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.StreamTestKit.CompletedSubscription](akka/stream/testkit/StreamTestKit.CompletedSubscription.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.StreamTestKit.CompletedSubscription$](akka/stream/testkit/StreamTestKit.CompletedSubscription$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.StreamTestKit.FailedSubscription](akka/stream/testkit/StreamTestKit.FailedSubscription.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.StreamTestKit.FailedSubscription$](akka/stream/testkit/StreamTestKit.FailedSubscription$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.StreamTestKit.PublisherProbeSubscription](akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.StreamTestKit.PublisherProbeSubscription$](akka/stream/testkit/StreamTestKit.PublisherProbeSubscription$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestPublisher.CancelSubscription](akka/stream/testkit/TestPublisher.CancelSubscription.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestPublisher.CancelSubscription$](akka/stream/testkit/TestPublisher.CancelSubscription$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction2\<org.reactivestreams.Subscription,​java.lang.Throwable,​[TestPublisher.CancelSubscription](akka/stream/testkit/TestPublisher.CancelSubscription.html "class in akka.stream.testkit")\> implements Serializable
	- ### Class [akka.stream.testkit.TestPublisher.RequestMore](akka/stream/testkit/TestPublisher.RequestMore.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestPublisher.RequestMore$](akka/stream/testkit/TestPublisher.RequestMore$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction2\<org.reactivestreams.Subscription,​java.lang.Object,​[TestPublisher.RequestMore](akka/stream/testkit/TestPublisher.RequestMore.html "class in akka.stream.testkit")\> implements Serializable
	- ### Class [akka.stream.testkit.TestPublisher.Subscribe](akka/stream/testkit/TestPublisher.Subscribe.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestPublisher.Subscribe$](akka/stream/testkit/TestPublisher.Subscribe$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction1\<org.reactivestreams.Subscription,​[TestPublisher.Subscribe](akka/stream/testkit/TestPublisher.Subscribe.html "class in akka.stream.testkit")\> implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnComplete$](akka/stream/testkit/TestSubscriber.OnComplete$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnError](akka/stream/testkit/TestSubscriber.OnError.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnError$](akka/stream/testkit/TestSubscriber.OnError$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[TestSubscriber.OnError](akka/stream/testkit/TestSubscriber.OnError.html "class in akka.stream.testkit")\> implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnNext](akka/stream/testkit/TestSubscriber.OnNext.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnNext$](akka/stream/testkit/TestSubscriber.OnNext$.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnSubscribe](akka/stream/testkit/TestSubscriber.OnSubscribe.html "class in akka.stream.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.stream.testkit.TestSubscriber.OnSubscribe$](akka/stream/testkit/TestSubscriber.OnSubscribe$.html "class in akka.stream.testkit") extends scala.runtime.AbstractFunction1\<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](akka/stream/testkit/TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")\> implements Serializable
- ## Package akka.testkit

	- ### Class [akka.testkit.CustomEventFilter](akka/testkit/CustomEventFilter.html "class in akka.testkit") extends [EventFilter](akka/testkit/EventFilter.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.CustomEventFilter$](akka/testkit/CustomEventFilter$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.DeadLettersFilter](akka/testkit/DeadLettersFilter.html "class in akka.testkit") extends [EventFilter](akka/testkit/EventFilter.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.DeadLettersFilter$](akka/testkit/DeadLettersFilter$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.DebugFilter](akka/testkit/DebugFilter.html "class in akka.testkit") extends [EventFilter](akka/testkit/EventFilter.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.DebugFilter$](akka/testkit/DebugFilter$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.ErrorFilter](akka/testkit/ErrorFilter.html "class in akka.testkit") extends [EventFilter](akka/testkit/EventFilter.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.ErrorFilter$](akka/testkit/ErrorFilter$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.InfoFilter](akka/testkit/InfoFilter.html "class in akka.testkit") extends [EventFilter](akka/testkit/EventFilter.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.InfoFilter$](akka/testkit/InfoFilter$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.SocketUtil.Both$](akka/testkit/SocketUtil.Both$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.SocketUtil.Tcp$](akka/testkit/SocketUtil.Tcp$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.SocketUtil.Udp$](akka/testkit/SocketUtil.Udp$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.KeepRunning$](akka/testkit/TestActor.KeepRunning$.html "class in akka.testkit") extends [TestActor.AutoPilot](akka/testkit/TestActor.AutoPilot.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.TestActor.NoAutoPilot$](akka/testkit/TestActor.NoAutoPilot$.html "class in akka.testkit") extends [TestActor.AutoPilot](akka/testkit/TestActor.AutoPilot.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.TestActor.NullMessage$](akka/testkit/TestActor.NullMessage$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.RealMessage](akka/testkit/TestActor.RealMessage.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.RealMessage$](akka/testkit/TestActor.RealMessage$.html "class in akka.testkit") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[TestActor.RealMessage](akka/testkit/TestActor.RealMessage.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestActor.SetAutoPilot](akka/testkit/TestActor.SetAutoPilot.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.SetAutoPilot$](akka/testkit/TestActor.SetAutoPilot$.html "class in akka.testkit") extends scala.runtime.AbstractFunction1\<[TestActor.AutoPilot](akka/testkit/TestActor.AutoPilot.html "class in akka.testkit"),​[TestActor.SetAutoPilot](akka/testkit/TestActor.SetAutoPilot.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestActor.SetIgnore](akka/testkit/TestActor.SetIgnore.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.SetIgnore$](akka/testkit/TestActor.SetIgnore$.html "class in akka.testkit") extends scala.runtime.AbstractFunction1\<scala.Option\<scala.PartialFunction\<java.lang.Object,​java.lang.Object\>\>,​[TestActor.SetIgnore](akka/testkit/TestActor.SetIgnore.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestActor.Spawn](akka/testkit/TestActor.Spawn.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.Spawn$](akka/testkit/TestActor.Spawn$.html "class in akka.testkit") extends scala.runtime.AbstractFunction3\<[Props](akka/actor/Props.html "class in akka.actor"),​scala.Option\<java.lang.String\>,​scala.Option\<[SupervisorStrategy](akka/actor/SupervisorStrategy.html "class in akka.actor")\>,​[TestActor.Spawn](akka/testkit/TestActor.Spawn.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestActor.UnWatch](akka/testkit/TestActor.UnWatch.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.UnWatch$](akka/testkit/TestActor.UnWatch$.html "class in akka.testkit") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[TestActor.UnWatch](akka/testkit/TestActor.UnWatch.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestActor.Watch](akka/testkit/TestActor.Watch.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestActor.Watch$](akka/testkit/TestActor.Watch$.html "class in akka.testkit") extends scala.runtime.AbstractFunction1\<[ActorRef](akka/actor/ActorRef.html "class in akka.actor"),​[TestActor.Watch](akka/testkit/TestActor.Watch.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestActorRef$](akka/testkit/TestActorRef$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestBarrierTimeoutException](akka/testkit/TestBarrierTimeoutException.html "class in akka.testkit") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.testkit.TestEvent.Mute](akka/testkit/TestEvent.Mute.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestEvent.Mute$](akka/testkit/TestEvent.Mute$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestEvent.UnMute](akka/testkit/TestEvent.UnMute.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestEvent.UnMute$](akka/testkit/TestEvent.UnMute$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.TestException](akka/testkit/TestException.html "class in akka.testkit") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.testkit.TestException$](akka/testkit/TestException$.html "class in akka.testkit") extends scala.runtime.AbstractFunction1\<java.lang.String,​[TestException](akka/testkit/TestException.html "class in akka.testkit")\> implements Serializable
	- ### Class [akka.testkit.TestFSMRef$](akka/testkit/TestFSMRef$.html "class in akka.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.WarningFilter](akka/testkit/WarningFilter.html "class in akka.testkit") extends [EventFilter](akka/testkit/EventFilter.html "class in akka.testkit") implements Serializable
	- ### Class [akka.testkit.WarningFilter$](akka/testkit/WarningFilter$.html "class in akka.testkit") extends java.lang.Object implements Serializable
- ## Package akka.testkit.internal

	- ### Class [akka.testkit.internal.NativeImageUtils.Condition](akka/testkit/internal/NativeImageUtils.Condition.html "class in akka.testkit.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.Condition$](akka/testkit/internal/NativeImageUtils.Condition$.html "class in akka.testkit.internal") extends scala.runtime.AbstractFunction1\<java.lang.String,​[NativeImageUtils.Condition](akka/testkit/internal/NativeImageUtils.Condition.html "class in akka.testkit.internal")\> implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.ReflectConfigEntry](akka/testkit/internal/NativeImageUtils.ReflectConfigEntry.html "class in akka.testkit.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.ReflectConfigEntry$](akka/testkit/internal/NativeImageUtils.ReflectConfigEntry$.html "class in akka.testkit.internal") extends scala.runtime.AbstractFunction22\<java.lang.String,​scala.collection.immutable.Seq\<[NativeImageUtils.ReflectMethod](akka/testkit/internal/NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")\>,​scala.collection.immutable.Seq\<[NativeImageUtils.ReflectMethod](akka/testkit/internal/NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")\>,​scala.collection.immutable.Seq\<[NativeImageUtils.ReflectField](akka/testkit/internal/NativeImageUtils.ReflectField.html "class in akka.testkit.internal")\>,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option\<[NativeImageUtils.Condition](akka/testkit/internal/NativeImageUtils.Condition.html "class in akka.testkit.internal")\>,​[NativeImageUtils.ReflectConfigEntry](akka/testkit/internal/NativeImageUtils.ReflectConfigEntry.html "class in akka.testkit.internal")\> implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.ReflectField](akka/testkit/internal/NativeImageUtils.ReflectField.html "class in akka.testkit.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.ReflectField$](akka/testkit/internal/NativeImageUtils.ReflectField$.html "class in akka.testkit.internal") extends scala.runtime.AbstractFunction1\<java.lang.String,​[NativeImageUtils.ReflectField](akka/testkit/internal/NativeImageUtils.ReflectField.html "class in akka.testkit.internal")\> implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.ReflectMethod](akka/testkit/internal/NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.testkit.internal.NativeImageUtils.ReflectMethod$](akka/testkit/internal/NativeImageUtils.ReflectMethod$.html "class in akka.testkit.internal") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.collection.immutable.Seq\<java.lang.String\>,​[NativeImageUtils.ReflectMethod](akka/testkit/internal/NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")\> implements Serializable
- ## Package akka.util

	- ### Class [akka.util.Base62\.Base62EncodingException](akka/util/Base62.Base62EncodingException.html "class in akka.util") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.util.ByteString.ByteString1](akka/util/ByteString.ByteString1.html "class in akka.util") extends [ByteString](akka/util/ByteString.html "class in akka.util") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			protected java.lang.Object writeReplace()
			```
	- ### Class [akka.util.ByteString.ByteString1$](akka/util/ByteString.ByteString1$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.ByteString.ByteString1C](akka/util/ByteString.ByteString1C.html "class in akka.util") extends [CompactByteString](akka/util/CompactByteString.html "class in akka.util") implements Serializable
	- ### Class [akka.util.ByteString.ByteString1C$](akka/util/ByteString.ByteString1C$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.ByteString.ByteStrings](akka/util/ByteString.ByteStrings.html "class in akka.util") extends [ByteString](akka/util/ByteString.html "class in akka.util") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			protected java.lang.Object writeReplace()
			```
	- ### Class [akka.util.ByteString.ByteStrings$](akka/util/ByteString.ByteStrings$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.Collections.EmptyImmutableSeq$](akka/util/Collections.EmptyImmutableSeq$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.CompactByteString](akka/util/CompactByteString.html "class in akka.util") extends [ByteString](akka/util/ByteString.html "class in akka.util") implements Serializable
	- ### Class [akka.util.CompactByteString$](akka/util/CompactByteString$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.LineNumbers.NoSourceInfo$](akka/util/LineNumbers.NoSourceInfo$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.LineNumbers.SourceFile](akka/util/LineNumbers.SourceFile.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.LineNumbers.SourceFile$](akka/util/LineNumbers.SourceFile$.html "class in akka.util") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LineNumbers.SourceFile](akka/util/LineNumbers.SourceFile.html "class in akka.util")\> implements Serializable
	- ### Class [akka.util.LineNumbers.SourceFileLines](akka/util/LineNumbers.SourceFileLines.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.LineNumbers.SourceFileLines$](akka/util/LineNumbers.SourceFileLines$.html "class in akka.util") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​java.lang.Object,​[LineNumbers.SourceFileLines](akka/util/LineNumbers.SourceFileLines.html "class in akka.util")\> implements Serializable
	- ### Class [akka.util.LineNumbers.UnknownSourceFormat](akka/util/LineNumbers.UnknownSourceFormat.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.LineNumbers.UnknownSourceFormat$](akka/util/LineNumbers.UnknownSourceFormat$.html "class in akka.util") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LineNumbers.UnknownSourceFormat](akka/util/LineNumbers.UnknownSourceFormat.html "class in akka.util")\> implements Serializable
	- ### Class [akka.util.ReentrantGuard](akka/util/ReentrantGuard.html "class in akka.util") extends java.util.concurrent.locks.ReentrantLock implements Serializable
	- ### Class [akka.util.SerializedSuspendableExecutionContext$](akka/util/SerializedSuspendableExecutionContext$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.Timeout](akka/util/Timeout.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.Timeout$](akka/util/Timeout$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.WildcardIndex$](akka/util/WildcardIndex$.html "class in akka.util") extends java.lang.Object implements Serializable
	- ### Class [akka.util.WildcardTree$](akka/util/WildcardTree$.html "class in akka.util") extends java.lang.Object implements Serializable

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka/2.10/akka/ConfigurationException.html
- https://doc.akka.io/japi/akka/2.10/akka/Done$.html
- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/NotUsed$.html
- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorIdentity$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorIdentity.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorKilledException$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorNotFound$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorNotFound.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPath$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSelection$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSelectionMessage$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Address$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AddressTerminated$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AllForOneStrategy$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/AllForOneStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ChildActorPath.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ChildNameReserved$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ChildRestartStats$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ChildStats.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ActorSystemTerminateReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ClusterDowningReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ClusterJoinUnsuccessfulReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.ClusterLeavingReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.IncompatibleConfigurationDetectedReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.JvmExitReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.Phase$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.UnknownReason$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DeadLetter$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DeadLetterActorRef$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/DeathPactException$.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/serialized-form.html](https://doc.akka.io/japi/akka/2.10/serialized-form.html)*