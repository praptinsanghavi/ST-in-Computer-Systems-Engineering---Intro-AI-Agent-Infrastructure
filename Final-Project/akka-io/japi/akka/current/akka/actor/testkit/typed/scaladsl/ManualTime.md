---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
title: ManualTime
---

# ManualTime

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class ManualTime

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.ManualTime

- ---

```
public final class ManualTime
extends java.lang.Object
```

Not for user instantiation, see [`apply(akka.actor.typed.ActorSystem<?>)`](#apply(akka.actor.typed.ActorSystem))

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManualTime](#%3Cinit%3E(akka.testkit.ExplicitlyTriggeredScheduler))​([ExplicitlyTriggeredScheduler](../../../../testkit/ExplicitlyTriggeredScheduler.html "class in akka.testkit") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`  for this to work. |
	| `static com.typesafe.config.Config` | `[config](#config())()` | Config needed to use the `ExplicitlyTriggeredScheduler` |
	| `void` | `[expectNoMessageFor](#expectNoMessageFor(scala.concurrent.duration.FiniteDuration,akka.actor.testkit.typed.scaladsl.TestProbe...))​(scala.concurrent.duration.FiniteDuration duration,  [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<?>... on)` | Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning. |
	| `void` | `[expectNoMessageFor](#expectNoMessageFor(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration duration,  scala.collection.immutable.Seq<[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<?>> on)` |  |
	| `void` | `[timePasses](#timePasses(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration amount)` | Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ManualTime
		
		
		
		```
		public ManualTime​([ExplicitlyTriggeredScheduler](../../../../testkit/ExplicitlyTriggeredScheduler.html "class in akka.testkit") delegate)
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public static com.typesafe.config.Config config()
		```
		
		Config needed to use the `ExplicitlyTriggeredScheduler`
		- #### apply
		
		
		
		```
		public static [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.scaladsl") apply​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`
		 for this to work.
		- #### expectNoMessageFor
		
		
		
		```
		public void expectNoMessageFor​(scala.concurrent.duration.FiniteDuration duration,
		                               [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<?>... on)
		```
		
		Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.
		 
		 We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
		 If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
		 this method.
		- #### timePasses
		
		
		
		```
		public void timePasses​(scala.concurrent.duration.FiniteDuration amount)
		```
		
		Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.
		 
		 We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
		 If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
		 this method.
		- #### expectNoMessageFor
		
		
		
		```
		public void expectNoMessageFor​(scala.concurrent.duration.FiniteDuration duration,
		                               scala.collection.immutable.Seq<[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<?>> on)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/ExplicitlyTriggeredScheduler.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html)*