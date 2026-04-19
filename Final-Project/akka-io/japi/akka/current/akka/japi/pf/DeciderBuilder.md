---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/pf/DeciderBuilder.html
title: DeciderBuilder
---

# DeciderBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class DeciderBuilder

- java.lang.Object
- - akka.japi.pf.DeciderBuilder

- ---

```
public class DeciderBuilder
extends java.lang.Object
```

Used for building a partial function for [`Actor.supervisorStrategy()`](../../actor/Actor.html#supervisorStrategy()). \* Inside an actor you can use it like this with Java 8 to define
 your supervisorStrategy.

 Example:

 

```

 @Override
 private static SupervisorStrategy strategy =
   new OneForOneStrategy(10, Duration.ofMinutes(1), DeciderBuilder.
     match(ArithmeticException.class, e -> resume()).
     match(NullPointerException.class, e -> restart()).
     match(IllegalArgumentException.class, e -> stop()).
     matchAny(o -> escalate()).build());

 @Override
 public SupervisorStrategy supervisorStrategy() {
   return strategy;
 }
 
```

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <P extends java.lang.Throwable>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> apply)` | Return a new [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with a case statement added. |
	| `static <P extends java.lang.Throwable>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> apply)` | Return a new [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with a case statement added. |
	| `static [PFBuilder](PFBuilder.html "class in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[matchAny](#matchAny(akka.japi.pf.FI.Apply))​([FI.Apply](FI.Apply.html "interface in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> apply)` | Return a new [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with a case statement added. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### match
		
		
		
		```
		public static <P extends java.lang.Throwable> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> match​(java.lang.Class<P> type,
		                                                                                                                      [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> apply)
		```
		
		Return a new [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with a case statement added.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### match
		
		
		
		```
		public static <P extends java.lang.Throwable> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> match​(java.lang.Class<P> type,
		                                                                                                                      [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                                                                                                      [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> apply)
		```
		
		Return a new [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with a case statement added.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns
		 true
		Returns:
		a builder with the case statement added
		- #### matchAny
		
		
		
		```
		public static [PFBuilder](PFBuilder.html "class in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> matchAny​([FI.Apply](FI.Apply.html "interface in akka.japi.pf")<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> apply)
		```
		
		Return a new [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with a case statement added.
		
		Parameters:
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.Apply.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/pf/DeciderBuilder.html](https://doc.akka.io/japi/akka/current/akka/japi/pf/DeciderBuilder.html)*