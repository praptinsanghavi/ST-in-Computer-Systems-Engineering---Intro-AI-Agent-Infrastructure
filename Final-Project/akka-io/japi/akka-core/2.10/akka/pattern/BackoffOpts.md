---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html
title: BackoffOpts
---

# BackoffOpts

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffOpts

- java.lang.Object
- - akka.pattern.BackoffOpts

- ---

```
public class BackoffOpts
extends java.lang.Object
```

Backoff options allow to specify a number of properties for backoff supervisors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackoffOpts](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern")` | `[onFailure](#onFailure(akka.actor.Props,java.lang.String,java.time.Duration,java.time.Duration,double))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure. |
	| `static [BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern")` | `[onFailure](#onFailure(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure. |
	| `static [BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")` | `[onStop](#onStop(akka.actor.Props,java.lang.String,java.time.Duration,java.time.Duration,double))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure. |
	| `static [BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern")` | `[onStop](#onStop(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​([Props](../actor/Props.html "class in akka.actor") childProps,  java.lang.String childName,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BackoffOpts
		
		
		
		```
		public BackoffOpts()
		```

	- ### Method Detail
	
	
	
		- #### onFailure
		
		
		
		```
		public static [BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern") onFailure​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                                java.lang.String childName,
		                                                scala.concurrent.duration.FiniteDuration minBackoff,
		                                                scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                double randomFactor)
		```
		
		Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure.
		 
		 This explicit supervisor behaves similarly to the normal implicit supervision where
		 if an actor throws an exception, the decider on the supervisor will decide when to
		 `Stop`, `Restart`, `Escalate`, `Resume` the child actor.
		 
		
		
		 When the `Restart` directive is specified, the supervisor will delay the restart
		 using an exponential back off strategy (bounded by minBackoff and maxBackoff).
		 
		
		
		 This supervisor is intended to be transparent to both the child actor and external actors.
		 Where external actors can send messages to the supervisor as if it was the child and the
		 messages will be forwarded. And when the child is `Terminated`, the supervisor is also
		 `Terminated`.
		 Transparent to the child means that the child does not have to be aware that it is being
		 supervised specifically by this actor. Just like it does
		 not need to know when it is being supervised by the usual implicit supervisors.
		 The only caveat is that the `ActorRef` of the child is not stable, so any user storing the
		 `sender()` `ActorRef` from the child response may eventually not be able to communicate with
		 the stored `ActorRef`. In general all messages to the child should be directed through this actor.
		 
		
		
		 An example of where this supervisor might be used is when you may have an actor that is
		 responsible for continuously polling on a server for some resource that sometimes may be down.
		 Instead of hammering the server continuously when the resource is unavailable, the actor will
		 be restarted with an exponentially increasing back off until the resource is available again.
		 
		
		
		 '''\*\*\*
		 This supervisor should not be used with `Akka Persistence` child actors.
		 `Akka Persistence` actors shutdown unconditionally on `persistFailure()`s rather
		 than throw an exception on a failure like normal actors.
		 [`onStop(akka.actor.Props, java.lang.String, scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, double)`](#onStop(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double)) should be used instead for cases where the child actor
		 terminates itself as a failure signal instead of the normal behavior of throwing an exception.
		 \*\*\*'''
		 You can define another
		 supervision strategy by using `akka.pattern.BackoffOptions.withSupervisorStrategy` on [`BackoffOnFailureOptions`](BackoffOnFailureOptions.html "interface in akka.pattern").
		 
		
		
		
		Parameters:
		`childProps` \- the [`Props`](../actor/Props.html "class in akka.actor") of the child actor that
		 will be started and supervised
		`childName` \- name of the child actor
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### onFailure
		
		
		
		```
		public static [BackoffOnFailureOptions](BackoffOnFailureOptions.html "interface in akka.pattern") onFailure​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                                java.lang.String childName,
		                                                java.time.Duration minBackoff,
		                                                java.time.Duration maxBackoff,
		                                                double randomFactor)
		```
		
		Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure.
		 
		 This explicit supervisor behaves similarly to the normal implicit supervision where
		 if an actor throws an exception, the decider on the supervisor will decide when to
		 `Stop`, `Restart`, `Escalate`, `Resume` the child actor.
		 
		
		
		 When the `Restart` directive is specified, the supervisor will delay the restart
		 using an exponential back off strategy (bounded by minBackoff and maxBackoff).
		 
		
		
		 This supervisor is intended to be transparent to both the child actor and external actors.
		 Where external actors can send messages to the supervisor as if it was the child and the
		 messages will be forwarded. And when the child is `Terminated`, the supervisor is also
		 `Terminated`.
		 Transparent to the child means that the child does not have to be aware that it is being
		 supervised specifically by this actor. Just like it does
		 not need to know when it is being supervised by the usual implicit supervisors.
		 The only caveat is that the `ActorRef` of the child is not stable, so any user storing the
		 `sender()` `ActorRef` from the child response may eventually not be able to communicate with
		 the stored `ActorRef`. In general all messages to the child should be directed through this actor.
		 
		
		
		 An example of where this supervisor might be used is when you may have an actor that is
		 responsible for continuously polling on a server for some resource that sometimes may be down.
		 Instead of hammering the server continuously when the resource is unavailable, the actor will
		 be restarted with an exponentially increasing back off until the resource is available again.
		 
		
		
		 '''\*\*\*
		 This supervisor should not be used with `Akka Persistence` child actors.
		 `Akka Persistence` actors shutdown unconditionally on `persistFailure()`s rather
		 than throw an exception on a failure like normal actors.
		 [`onStop(akka.actor.Props, java.lang.String, scala.concurrent.duration.FiniteDuration, scala.concurrent.duration.FiniteDuration, double)`](#onStop(akka.actor.Props,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double)) should be used instead for cases where the child actor
		 terminates itself as a failure signal instead of the normal behavior of throwing an exception.
		 \*\*\*'''
		 You can define another
		 supervision strategy by using `akka.pattern.BackoffOptions.withSupervisorStrategy` on [`BackoffOnFailureOptions`](BackoffOnFailureOptions.html "interface in akka.pattern").
		 
		
		
		
		Parameters:
		`childProps` \- the [`Props`](../actor/Props.html "class in akka.actor") of the child actor that
		 will be started and supervised
		`childName` \- name of the child actor
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### onStop
		
		
		
		```
		public static [BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") onStop​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                          java.lang.String childName,
		                                          scala.concurrent.duration.FiniteDuration minBackoff,
		                                          scala.concurrent.duration.FiniteDuration maxBackoff,
		                                          double randomFactor)
		```
		
		Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure.
		 
		 This actor can be used to supervise a child actor and start it again
		 after a back\-off duration if the child actor is stopped.
		 
		
		
		 This is useful in situations where the re\-start of the child actor should be
		 delayed e.g. in order to give an external resource time to recover before the
		 child actor tries contacting it again (after being restarted).
		 
		
		
		 Specifically this pattern is useful for persistent actors,
		 which are stopped in case of persistence failures.
		 Just restarting them immediately would probably fail again (since the data
		 store is probably unavailable). It is better to try again after a delay.
		 
		
		
		 It supports exponential back\-off between the given `minBackoff` and
		 `maxBackoff` durations. For example, if `minBackoff` is 3 seconds and
		 `maxBackoff` 30 seconds the start attempts will be delayed with
		 3, 6, 12, 24, 30, 30 seconds. The exponential back\-off counter is reset
		 if the actor is not terminated within the `minBackoff` duration.
		 
		
		
		 In addition to the calculated exponential back\-off an additional
		 random delay based the given `randomFactor` is added, e.g. 0\.2 adds up to 20%
		 delay. The reason for adding a random delay is to avoid that all failing
		 actors hit the backend resource at the same time.
		 
		
		
		 You can retrieve the current child `ActorRef` by sending `BackoffSupervisor.GetCurrentChild`
		 message to this actor and it will reply with [`BackoffSupervisor.CurrentChild`](BackoffSupervisor.CurrentChild.html "class in akka.pattern")
		 containing the `ActorRef` of the current child, if any.
		 
		
		
		 The `BackoffSupervisor`delegates all messages from the child to the parent of the
		 `BackoffSupervisor`, with the supervisor as sender.
		 
		
		
		 The `BackoffSupervisor` forwards all other messages to the child, if it is currently running.
		 
		
		
		 The child can stop itself and send a [`PoisonPill`](../actor/PoisonPill.html "class in akka.actor") to the parent supervisor
		 if it wants to do an intentional stop.
		 
		
		
		 Exceptions in the child are handled with the default supervisionStrategy, which can be changed by using
		 [`ExtendedBackoffOptions.withSupervisorStrategy(akka.actor.OneForOneStrategy)`](ExtendedBackoffOptions.html#withSupervisorStrategy(akka.actor.OneForOneStrategy)) or [`BackoffOnStopOptions.withDefaultStoppingStrategy()`](BackoffOnStopOptions.html#withDefaultStoppingStrategy()). A
		 `Restart` will perform a normal immediate restart of the child. A `Stop` will
		 stop the child, but it will be started again after the back\-off duration.
		 
		
		
		
		Parameters:
		`childProps` \- the [`Props`](../actor/Props.html "class in akka.actor") of the child actor that
		 will be started and supervised
		`childName` \- name of the child actor
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### onStop
		
		
		
		```
		public static [BackoffOnStopOptions](BackoffOnStopOptions.html "interface in akka.pattern") onStop​([Props](../actor/Props.html "class in akka.actor") childProps,
		                                          java.lang.String childName,
		                                          java.time.Duration minBackoff,
		                                          java.time.Duration maxBackoff,
		                                          double randomFactor)
		```
		
		Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure.
		 
		 This actor can be used to supervise a child actor and start it again
		 after a back\-off duration if the child actor is stopped.
		 
		
		
		 This is useful in situations where the re\-start of the child actor should be
		 delayed e.g. in order to give an external resource time to recover before the
		 child actor tries contacting it again (after being restarted).
		 
		
		
		 Specifically this pattern is useful for persistent actors,
		 which are stopped in case of persistence failures.
		 Just restarting them immediately would probably fail again (since the data
		 store is probably unavailable). It is better to try again after a delay.
		 
		
		
		 It supports exponential back\-off between the given `minBackoff` and
		 `maxBackoff` durations. For example, if `minBackoff` is 3 seconds and
		 `maxBackoff` 30 seconds the start attempts will be delayed with
		 3, 6, 12, 24, 30, 30 seconds. The exponential back\-off counter is reset
		 if the actor is not terminated within the `minBackoff` duration.
		 
		
		
		 In addition to the calculated exponential back\-off an additional
		 random delay based the given `randomFactor` is added, e.g. 0\.2 adds up to 20%
		 delay. The reason for adding a random delay is to avoid that all failing
		 actors hit the backend resource at the same time.
		 
		
		
		 You can retrieve the current child `ActorRef` by sending `BackoffSupervisor.GetCurrentChild`
		 message to this actor and it will reply with [`BackoffSupervisor.CurrentChild`](BackoffSupervisor.CurrentChild.html "class in akka.pattern")
		 containing the `ActorRef` of the current child, if any.
		 
		
		
		 The `BackoffSupervisor`delegates all messages from the child to the parent of the
		 `BackoffSupervisor`, with the supervisor as sender.
		 
		
		
		 The `BackoffSupervisor` forwards all other messages to the child, if it is currently running.
		 
		
		
		 The child can stop itself and send a [`PoisonPill`](../actor/PoisonPill.html "class in akka.actor") to the parent supervisor
		 if it wants to do an intentional stop.
		 
		
		
		 Exceptions in the child are handled with the default supervisionStrategy, which can be changed by using
		 [`ExtendedBackoffOptions.withSupervisorStrategy(akka.actor.OneForOneStrategy)`](ExtendedBackoffOptions.html#withSupervisorStrategy(akka.actor.OneForOneStrategy)) or [`BackoffOnStopOptions.withDefaultStoppingStrategy()`](BackoffOnStopOptions.html#withDefaultStoppingStrategy()). A
		 `Restart` will perform a normal immediate restart of the child. A `Stop` will
		 stop the child, but it will be started again after the back\-off duration.
		 
		
		
		
		Parameters:
		`childProps` \- the [`Props`](../actor/Props.html "class in akka.actor") of the child actor that
		 will be started and supervised
		`childName` \- name of the child actor
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.CurrentChild.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExtendedBackoffOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html)*