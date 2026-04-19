---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DiagnosticActorLogging.html
title: DiagnosticActorLogging
---

# DiagnosticActorLogging

## Content

Package [akka.actor](package-summary.html)
## Interface DiagnosticActorLogging

- All Superinterfaces:
`[Actor](Actor.html "interface in akka.actor")`

---

```
public interface DiagnosticActorLogging
extends [Actor](Actor.html "interface in akka.actor")
```

Scala API: Mix in DiagnosticActorLogging into your Actor to easily obtain a reference to a logger with MDC support,
 which is available under the name "log".
 In the example bellow "the one who knocks" will be available under the key "iam" for using it in the logback pattern.
 

```

 class MyActor extends Actor with DiagnosticActorLogging {

   override def mdc(currentMessage: Any): MDC = {
     Map("iam", "the one who knocks")
   }

   def receive = {
     case "pigdog" => log.info("We've got yet another pigdog on our hands")
   }
 }
 
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$actor$DiagnosticActorLogging$_setter_$log_$eq](#akka$actor$DiagnosticActorLogging$_setter_$log_$eq(akka.event.DiagnosticLoggingAdapter))​([DiagnosticLoggingAdapter](../event/DiagnosticLoggingAdapter.html "interface in akka.event") x$1)` |  |
	| `void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` | INTERNAL API. |
	| `[DiagnosticLoggingAdapter](../event/DiagnosticLoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[mdc](#mdc(java.lang.Object))​(java.lang.Object currentMessage)` |  |
	| `void` | `[super$aroundReceive](#super$aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [postStop](Actor.html#postStop()), [preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](Actor.html#preStart()), [receive](Actor.html#receive()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### akka$actor$DiagnosticActorLogging$\_setter\_$log\_$eq
		
		
		
		```
		void akka$actor$DiagnosticActorLogging$_setter_$log_$eq​([DiagnosticLoggingAdapter](../event/DiagnosticLoggingAdapter.html "interface in akka.event") x$1)
		```
		- #### aroundReceive
		
		
		
		```
		void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                   java.lang.Object msg)
		```
		
		Description copied from interface: `[Actor](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to this actor's current behavior.
		 
		
		
		
		Specified by:
		`[aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Actor](Actor.html "interface in akka.actor")`
		Parameters:
		`receive` \- current behavior.
		`msg` \- current message.
		- #### log
		
		
		
		```
		[DiagnosticLoggingAdapter](../event/DiagnosticLoggingAdapter.html "interface in akka.event") log()
		```
		- #### mdc
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> mdc​(java.lang.Object currentMessage)
		```
		- #### super$aroundReceive
		
		
		
		```
		void super$aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                         java.lang.Object msg)
		```

## Code Examples

### Example 1: Interface DiagnosticActorLogging

```text
class MyActor extends Actor with DiagnosticActorLogging {

   override def mdc(currentMessage: Any): MDC = {
     Map("iam", "the one who knocks")
   }

   def receive = {
     case "pigdog" => log.info("We've got yet another pigdog on our hands")
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DiagnosticActorLogging.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DiagnosticActorLogging.html)*