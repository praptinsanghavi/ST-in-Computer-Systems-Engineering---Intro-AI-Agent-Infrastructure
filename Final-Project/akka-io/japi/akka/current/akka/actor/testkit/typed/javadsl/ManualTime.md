---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime.html
title: ManualTime
---

# ManualTime

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class ManualTime

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.ManualTime

- ---

```
public final class ManualTime
extends java.lang.Object
```

Not for user instantiation, see [`get(akka.actor.typed.ActorSystem<A>)`](#get(akka.actor.typed.ActorSystem))

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManualTime](#%3Cinit%3E(akka.testkit.ExplicitlyTriggeredScheduler))​([ExplicitlyTriggeredScheduler](../../../../testkit/ExplicitlyTriggeredScheduler.html "class in akka.testkit") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static com.typesafe.config.Config` | `[config](#config())()` | Config that needs to be in place for the actor system to use the manual |
	| `void` | `[expectNoMessageFor](#expectNoMessageFor(java.time.Duration,akka.actor.testkit.typed.javadsl.TestProbe...))​(java.time.Duration duration,  [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<?>... on)` | Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning. |
	| `void` | `[expectNoMessageFor](#expectNoMessageFor(java.time.Duration,scala.collection.immutable.Seq))​(java.time.Duration duration,  scala.collection.immutable.Seq<[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<?>> on)` |  |
	| `static <A> [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.javadsl")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<A> system)` | Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`  for this to work. |
	| `void` | `[timePasses](#timePasses(java.time.Duration))​(java.time.Duration amount)` | Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning. |
	
	
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
		
		Config that needs to be in place for the actor system to use the manual
		- #### get
		
		
		
		```
		public static <A> [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.javadsl") get​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<A> system)
		```
		
		Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`
		 for this to work.
		- #### expectNoMessageFor
		
		
		
		```
		public void expectNoMessageFor​(java.time.Duration duration,
		                               [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<?>... on)
		```
		
		Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.
		 
		 We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
		 If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
		 this method.
		- #### timePasses
		
		
		
		```
		public void timePasses​(java.time.Duration amount)
		```
		
		Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.
		 
		 We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
		 If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
		 this method.
		- #### expectNoMessageFor
		
		
		
		```
		public void expectNoMessageFor​(java.time.Duration duration,
		                               scala.collection.immutable.Seq<[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<?>> on)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/ExplicitlyTriggeredScheduler.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime.html)*