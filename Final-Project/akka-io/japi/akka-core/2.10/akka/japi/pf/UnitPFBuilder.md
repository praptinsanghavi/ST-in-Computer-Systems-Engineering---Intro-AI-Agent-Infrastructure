---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html
title: UnitPFBuilder
---

# UnitPFBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class UnitPFBuilder\<I\>

- java.lang.Object
- - akka.japi.pf.UnitPFBuilder\<I\>

- Type Parameters:
`I` \- the input type, that this PartialFunction to be applied to

---

```
public final class UnitPFBuilder<I>
extends java.lang.Object
```

A builder for `PartialFunction`. This is a specialized version of [`PFBuilder`](PFBuilder.html "class in akka.japi.pf")
 to map java void methods to `BoxedUnit`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `protected scala.PartialFunction<F,​T>` | `statements` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnitPFBuilder](#%3Cinit%3E())()` | Create a UnitPFBuilder. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `addStatement​(scala.PartialFunction<F,​T> statement)` |  |
	| `scala.PartialFunction<F,​T>` | `build()` | Build a `PartialFunction` from this builder. |
	| `<P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[matchAny](#matchAny(akka.japi.pf.FI.UnitApply))​([FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)` | Add a new case statement to this builder, that matches any argument. |
	| `<P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(P object,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `<P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.UnitApply))​(P object,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Add a new case statement to this builder. |
	| `[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)` | Add a new case statement to this builder without compile time type check. |
	| `[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)` | Add a new case statement to this builder without compile time type check. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### statements
		
		
		
		```
		protected scala.PartialFunction<F,​T> statements
		```

	- ### Constructor Detail
	
	
	
		- #### UnitPFBuilder
		
		
		
		```
		public UnitPFBuilder()
		```
		
		Create a UnitPFBuilder.

	- ### Method Detail
	
	
	
		- #### match
		
		
		
		```
		public <P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> match​(java.lang.Class<P> type,
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
		public [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> matchUnchecked​(java.lang.Class<?> type,
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
		public <P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> match​(java.lang.Class<P> type,
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
		- #### matchUnchecked
		
		
		
		```
		public [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> matchUnchecked​(java.lang.Class<?> type,
		                                       [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,
		                                       [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)
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
		- #### matchEquals
		
		
		
		```
		public <P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> matchEquals​(P object,
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
		public <P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> matchEquals​(P object,
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
		- #### matchAny
		
		
		
		```
		public [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<[I](UnitPFBuilder.html "type parameter in UnitPFBuilder")> matchAny​([FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)
		```
		
		Add a new case statement to this builder, that matches any argument.
		
		Parameters:
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added
		- #### addStatement
		
		
		
		```
		protected void addStatement​(scala.PartialFunction<F,​T> statement)
		```
		- #### build
		
		
		
		```
		public scala.PartialFunction<F,​T> build()
		```
		
		Build a `PartialFunction` from this builder. After this call the builder will be
		 reset.
		
		Returns:
		a PartialFunction for this builder.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.UnitApply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html)*