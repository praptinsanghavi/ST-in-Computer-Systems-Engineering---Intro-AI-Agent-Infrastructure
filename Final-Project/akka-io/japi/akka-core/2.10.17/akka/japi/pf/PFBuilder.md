---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/PFBuilder.html
title: PFBuilder
---

# PFBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class PFBuilder\<I,​R\>

- java.lang.Object
- - akka.japi.pf.PFBuilder\<I,​R\>

- Type Parameters:
`I` \- the input type, that this PartialFunction will be applied to
`R` \- the return type, that the results of the application will have

---

```
public final class PFBuilder<I,​R>
extends java.lang.Object
```

A builder for `PartialFunction`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `protected scala.PartialFunction<F,​T>` | `statements` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PFBuilder](#%3Cinit%3E())()` | Create a PFBuilder. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `addStatement​(scala.PartialFunction<F,​T> statement)` |  |
	| `scala.PartialFunction<F,​T>` | `build()` | Build a `PartialFunction` from this builder. |
	| `<P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)` | Add a new case statement to this builder. |
	| `<P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)` | Add a new case statement to this builder. |
	| `[PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")>` | `[matchAny](#matchAny(akka.japi.pf.FI.Apply))​([FI.Apply](FI.Apply.html "interface in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> apply)` | Add a new case statement to this builder, that matches any argument. |
	| `<P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")>` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.Apply))​(P object,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)` | Add a new case statement to this builder. |
	| `[PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.Apply))​(java.lang.Class<?> type,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)` | Add a new case statement to this builder without compile time type check of the parameters. |
	| `[PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))​(java.lang.Class<?> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)` | Add a new case statement to this builder without compile time type check of the parameters. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### statements
		
		
		
		```
		protected scala.PartialFunction<F,​T> statements
		```

	- ### Constructor Detail
	
	
	
		- #### PFBuilder
		
		
		
		```
		public PFBuilder()
		```
		
		Create a PFBuilder.

	- ### Method Detail
	
	
	
		- #### match
		
		
		
		```
		public <P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> match​(java.lang.Class<P> type,
		                                      [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### matchUnchecked
		
		
		
		```
		public [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> matchUnchecked​(java.lang.Class<?> type,
		                                           [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)
		```
		
		Add a new case statement to this builder without compile time type check of the parameters.
		 Should normally not be used, but when matching on class with generic type argument it can be
		 useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### match
		
		
		
		```
		public <P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> match​(java.lang.Class<P> type,
		                                      [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                      [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)
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
		public [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> matchUnchecked​(java.lang.Class<?> type,
		                                           [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,
		                                           [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)
		```
		
		Add a new case statement to this builder without compile time type check of the parameters.
		 Should normally not be used, but when matching on class with generic type argument it can be
		 useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns
		 true
		Returns:
		a builder with the case statement added
		- #### matchEquals
		
		
		
		```
		public <P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> matchEquals​(P object,
		                                            [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​[R](PFBuilder.html "type parameter in PFBuilder")> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`object` \- the object to compare equals with
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		- #### matchAny
		
		
		
		```
		public [PFBuilder](PFBuilder.html "class in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> matchAny​([FI.Apply](FI.Apply.html "interface in akka.japi.pf")<[I](PFBuilder.html "type parameter in PFBuilder"),​[R](PFBuilder.html "type parameter in PFBuilder")> apply)
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.Apply.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/PFBuilder.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/PFBuilder.html)*