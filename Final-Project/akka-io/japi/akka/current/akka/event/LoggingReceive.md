---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/LoggingReceive.html
title: LoggingReceive
---

# LoggingReceive

## Content

Package [akka.event](package-summary.html)
## Class LoggingReceive

- java.lang.Object
- - akka.event.LoggingReceive

- All Implemented Interfaces:
`scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>`, `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>`

---

```
public class LoggingReceive
extends java.lang.Object
implements scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>
```

This decorator adds invocation logging to a Receive function.
 param: source the log source, if not defined the actor of the context will be used

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingReceive](#%3Cinit%3E(scala.Option,scala.PartialFunction,akka.actor.ActorContext))​(scala.Option<java.lang.Object> source,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` |  |
	| `[LoggingReceive](#%3Cinit%3E(scala.Option,scala.PartialFunction,scala.Option,akka.actor.ActorContext))​(scala.Option<java.lang.Object> source,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  scala.Option<java.lang.String> label,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` |  |
	| `[LoggingReceive](#%3Cinit%3E(scala.Option,scala.PartialFunction,scala.Option,akka.event.Logging.LogLevel,akka.actor.ActorContext))​(scala.Option<java.lang.Object> source,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  scala.Option<java.lang.String> label,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(java.lang.Object))​(java.lang.Object o)` |  |
	| `static [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor")` | `[create](#create(akka.actor.AbstractActor.Receive,akka.actor.AbstractActor.ActorContext))​([AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") r,  [AbstractActor.ActorContext](../actor/AbstractActor.ActorContext.html "interface in akka.actor") context)` | Java API: compatible with lambda expressions |
	| `boolean` | `[isDefinedAt](#isDefinedAt(java.lang.Object))​(java.lang.Object o)` |  |
	| `static scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[withLabel](#withLabel(java.lang.String,akka.event.Logging.LogLevel,scala.PartialFunction,akka.actor.ActorContext))​(java.lang.String label,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | Create a decorated logger which will append `" in state " + label` to each message it logs. |
	| `static scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[withLabel](#withLabel(java.lang.String,scala.PartialFunction,akka.actor.ActorContext))​(java.lang.String label,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | Create a decorated logger which will append `" in state " + label` to each message it logs. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from interface scala.PartialFunction
		
		
		`andThen, andThen, applyOrElse, compose, elementWise, lift, orElse, runWith, unapply`

- - ### Constructor Detail
	
	
	
		- #### LoggingReceive
		
		
		
		```
		public LoggingReceive​(scala.Option<java.lang.Object> source,
		                      scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                      scala.Option<java.lang.String> label,
		                      [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,
		                      [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		- #### LoggingReceive
		
		
		
		```
		public LoggingReceive​(scala.Option<java.lang.Object> source,
		                      scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                      scala.Option<java.lang.String> label,
		                      [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		- #### LoggingReceive
		
		
		
		```
		public LoggingReceive​(scala.Option<java.lang.Object> source,
		                      scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                      [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") create​([AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") r,
		                                           [AbstractActor.ActorContext](../actor/AbstractActor.ActorContext.html "interface in akka.actor") context)
		```
		
		Java API: compatible with lambda expressions
		- #### withLabel
		
		
		
		```
		public static scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> withLabel​(java.lang.String label,
		                                                                                              [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel,
		                                                                                              scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                                                                                              [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Create a decorated logger which will append `" in state " + label` to each message it logs.
		- #### withLabel
		
		
		
		```
		public static scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> withLabel​(java.lang.String label,
		                                                                                              scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r,
		                                                                                              [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		Create a decorated logger which will append `" in state " + label` to each message it logs.
		- #### isDefinedAt
		
		
		
		```
		public boolean isDefinedAt​(java.lang.Object o)
		```
		
		
		Specified by:
		`isDefinedAt` in interface `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>`
		- #### apply
		
		
		
		```
		public void apply​(java.lang.Object o)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/LoggingReceive.html](https://doc.akka.io/japi/akka/current/akka/event/LoggingReceive.html)*