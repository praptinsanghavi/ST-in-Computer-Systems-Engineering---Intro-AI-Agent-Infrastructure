---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/GracefulStopSupport.html
title: GracefulStopSupport
---

# GracefulStopSupport

## Content

Package [akka.pattern](package-summary.html)
## Interface GracefulStopSupport

- ---

```
public interface GracefulStopSupport
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[gracefulStop](#gracefulStop(akka.actor.ActorRef,scala.concurrent.duration.FiniteDuration,java.lang.Object))​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,  scala.concurrent.duration.FiniteDuration timeout,  java.lang.Object stopMessage)` | Returns a `Future` that will be completed with success (value `true`) when  existing messages of the target actor has been processed and the actor has been  terminated. |
	| `java.lang.Object` | `[gracefulStop$default$3](#gracefulStop$default$3())()` |  |

- - ### Method Detail
	
	
	
		- #### gracefulStop
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> gracefulStop​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,
		                                                       scala.concurrent.duration.FiniteDuration timeout,
		                                                       java.lang.Object stopMessage)
		```
		
		Returns a `Future` that will be completed with success (value `true`) when
		 existing messages of the target actor has been processed and the actor has been
		 terminated.
		 
		 Useful when you need to wait for termination or compose ordered termination of several actors,
		 which should only be done outside of the ActorSystem as blocking inside Actors is discouraged.
		 
		
		
		**IMPORTANT NOTICE:** the actor being terminated and its supervisor
		 being informed of the availability of the deceased actor\&rsquo;s name are two
		 distinct operations, which do not obey any reliable ordering. Especially
		 the following will NOT work:
		 
		
		
		
		
		
		```
		
		 def receive = {
		   case msg =>
		     Await.result(gracefulStop(someChild, timeout), timeout)
		     context.actorOf(Props(...), "someChild") // assuming that that was someChild&rsquo;s name, this will NOT work
		 }
		 
		```
		
		
		 If the target actor isn't terminated within the timeout the `Future`
		 is completed with failure [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern").
		 
		
		
		 If you want to invoke specialized stopping logic on your target actor instead of PoisonPill, you can pass your
		 stop command as a parameter:
		 
		
		
		```
		
		   gracefulStop(someChild, timeout, MyStopGracefullyMessage).onComplete {
		      // Do something after someChild being stopped
		   }
		 
		```
		- #### gracefulStop$default$3
		
		
		
		```
		java.lang.Object gracefulStop$default$3()
		```

## Code Examples

### Example 1: gracefulStop

```text
def receive = {
   case msg =>
     Await.result(gracefulStop(someChild, timeout), timeout)
     context.actorOf(Props(...), "someChild") // assuming that that was someChild&rsquo;s name, this will NOT work
 }
```

### Example 2: gracefulStop

```text
gracefulStop(someChild, timeout, MyStopGracefullyMessage).onComplete {
      // Do something after someChild being stopped
   }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/GracefulStopSupport.html](https://doc.akka.io/japi/akka/current/akka/pattern/GracefulStopSupport.html)*