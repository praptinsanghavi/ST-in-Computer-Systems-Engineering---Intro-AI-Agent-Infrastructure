---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/pf/ReceiveBuilder.html
title: ReceiveBuilder
---

# ReceiveBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class ReceiveBuilder

- java.lang.Object
- - akka.japi.pf.ReceiveBuilder

- ---

```
public class ReceiveBuilder
extends java.lang.Object
```

Used for building a partial function for [`AbstractActor.createReceive()`](../../actor/AbstractActor.html#createReceive()).

 There is both a match on type only, and a match on type and predicate.

 

Inside an actor you can use it like this:

 

Example:

 

```

 @Override
 public Receive createReceive() {
   return receiveBuilder()
     .match(Double.class, d -> {
       getSender().tell(d.isNaN() ? 0 : d, self());
     })
     .match(Integer.class, i -> {
       getSender().tell(i * 10, self());
     })
     .match(String.class, s -> s.startsWith("foo"), s -> {
       getSender().tell(s.toUpperCase(), self());
     })
     .build()
   );
 }
 
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceiveBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[addStatement](#addStatement(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> statement)` |  |
	| `[AbstractActor.Receive](../../actor/AbstractActor.Receive.html "class in akka.actor")` | `[build](#build())()` | Build a `PartialFunction` from this builder. |
	| `static [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[create](#create())()` | Return a new [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.japi.pf") with no case statements. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[match](#match(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[match](#match(java.lang.Class,java.util.function.BooleanSupplier,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  java.util.function.BooleanSupplier externalPredicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `[ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchAny](#matchAny(akka.japi.pf.FI.UnitApply))​([FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)` | Add a new case statement to this builder, that matches any argument. |
	| `[ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchAny](#matchAny(java.util.function.BooleanSupplier,akka.japi.pf.FI.UnitApply))​(java.util.function.BooleanSupplier externalPredicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)` | Add a new case statement to this builder, that pass the test of the predicate. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(P object,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.UnitApply))​(P object,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchEquals](#matchEquals(P,java.util.function.BooleanSupplier,akka.japi.pf.FI.UnitApply))​(P object,  java.util.function.BooleanSupplier externalPredicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder without compile time type check. |
	| `[ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)` | Add a new case statement to this builder without compile time type check. |
	| `<P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf")` | `[matchUnchecked](#matchUnchecked(java.lang.Class,java.util.function.BooleanSupplier,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  java.util.function.BooleanSupplier externalPredicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder without compile time type check. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReceiveBuilder
		
		
		
		```
		public ReceiveBuilder()
		```

	- ### Method Detail
	
	
	
		- #### addStatement
		
		
		
		```
		protected void addStatement​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> statement)
		```
		- #### build
		
		
		
		```
		public [AbstractActor.Receive](../../actor/AbstractActor.Receive.html "class in akka.actor") build()
		```
		
		Build a `PartialFunction` from this builder. After this call the builder will be
		 reset.
		
		Returns:
		a PartialFunction for this builder.
		- #### create
		
		
		
		```
		public static [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") create()
		```
		
		Return a new [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.japi.pf") with no case statements. They can be added later as the
		 returned [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.japi.pf") is a mutable object.
		
		Returns:
		a builder with no case statements
		- #### match
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") match​(java.lang.Class<P> type,
		                                [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### matchUnchecked
		
		
		
		```
		public [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchUnchecked​(java.lang.Class<?> type,
		                                     [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)
		```
		
		Add a new case statement to this builder without compile time type check. Should normally not
		 be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### match
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") match​(java.lang.Class<P> type,
		                                [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns
		 true
		Returns:
		a builder with the case statement added
		- #### match
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") match​(java.lang.Class<P> type,
		                                java.util.function.BooleanSupplier externalPredicate,
		                                [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`type` \- a type to match the argument against
		`externalPredicate` \- a external predicate that will be evaluated if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns
		 true
		Returns:
		a builder with the case statement added
		- #### matchUnchecked
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchUnchecked​(java.lang.Class<?> type,
		                                         [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,
		                                         [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder without compile time type check. Should normally not
		 be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns
		 true
		Returns:
		a builder with the case statement added
		- #### matchUnchecked
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchUnchecked​(java.lang.Class<?> type,
		                                         java.util.function.BooleanSupplier externalPredicate,
		                                         [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder without compile time type check. Should normally not
		 be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		Parameters:
		`type` \- a type to match the argument against
		`externalPredicate` \- an external predicate that will be evaluated if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns
		 true
		Returns:
		a builder with the case statement added
		- #### matchEquals
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchEquals​(P object,
		                                      [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`object` \- the object to compare equals with
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		- #### matchEquals
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchEquals​(P object,
		                                      [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                      [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`object` \- the object to compare equals with
		`predicate` \- a predicate that will be evaluated on the argument if the object compares
		 equal
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		- #### matchEquals
		
		
		
		```
		public <P> [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchEquals​(P object,
		                                      java.util.function.BooleanSupplier externalPredicate,
		                                      [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`object` \- the object to compare equals with
		`externalPredicate` \- an external predicate that will be evaluated if the object compares
		 equal
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		- #### matchAny
		
		
		
		```
		public [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchAny​([FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)
		```
		
		Add a new case statement to this builder, that matches any argument.
		
		Parameters:
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added
		- #### matchAny
		
		
		
		```
		public [ReceiveBuilder](ReceiveBuilder.html "class in akka.japi.pf") matchAny​(java.util.function.BooleanSupplier externalPredicate,
		                               [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)
		```
		
		Add a new case statement to this builder, that pass the test of the predicate.
		
		Parameters:
		`externalPredicate` \- an external predicate that will always be evaluated.
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApply.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/pf/ReceiveBuilder.html](https://doc.akka.io/japi/akka/current/akka/japi/pf/ReceiveBuilder.html)*