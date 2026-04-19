---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/Match.html
title: Match
---

# Match

## Content

Package [akka.japi.pf](package-summary.html)
## Class Match\<I,​R\>

- java.lang.Object
- - akka.japi.pf.Match\<I,​R\>

- Type Parameters:
`I` \- the input type, that this PartialFunction will be applied to
`R` \- the return type, that the results of the application will have

---

```
public class Match<I,​R>
extends java.lang.Object
```

Version of `PartialFunction` that can be built during runtime from Java.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `protected scala.PartialFunction<I,​R>` | `statements` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<I,​R>` | `asPF()` | Turn this [`Match`](Match.html "class in akka.japi.pf") into a `PartialFunction`. |
	| `static <F,​T>[Match](Match.html "class in akka.japi.pf")<F,​T>` | `[create](#create(akka.japi.pf.PFBuilder))​([PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> builder)` | Create a [`Match`](Match.html "class in akka.japi.pf") from the builder. |
	| `[R](Match.html "type parameter in Match")` | `[match](#match(I))​([I](Match.html "type parameter in Match") i)` | Convenience function to make the Java code more readable. |
	| `static <F,​T,​P>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​T> apply)` | Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​T,​P>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​T> apply)` | Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​T>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T>` | `[matchAny](#matchAny(akka.japi.pf.FI.Apply))​([FI.Apply](FI.Apply.html "interface in akka.japi.pf")<F,​T> apply)` | Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​T,​P>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T>` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.Apply))​(P object,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​T> apply)` | Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​T>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.Apply))​(java.lang.Class<?> type,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​T> apply)` | Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added without  compile time type check of the parameters. |
	| `static <F,​T>[PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))​(java.lang.Class<?> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,  [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​T> apply)` | Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added without  compile time type check of the parameters. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### statements
		
		
		
		```
		protected final scala.PartialFunction<I,​R> statements
		```

	- ### Method Detail
	
	
	
		- #### match
		
		
		
		```
		public static <F,​T,​P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> match​(java.lang.Class<P> type,
		                                                             [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​T> apply)
		```
		
		Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		See Also:
		[`PFBuilder.match(Class, FI.Apply)`](PFBuilder.html#match(java.lang.Class,akka.japi.pf.FI.Apply))
		- #### matchUnchecked
		
		
		
		```
		public static <F,​T> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> matchUnchecked​(java.lang.Class<?> type,
		                                                              [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​T> apply)
		```
		
		Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added without
		 compile time type check of the parameters. Should normally not be used, but when matching on
		 class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		See Also:
		[`PFBuilder.matchUnchecked(Class, FI.Apply)`](PFBuilder.html#matchUnchecked(java.lang.Class,akka.japi.pf.FI.Apply))
		- #### match
		
		
		
		```
		public static <F,​T,​P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> match​(java.lang.Class<P> type,
		                                                             [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                                             [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​T> apply)
		```
		
		Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		See Also:
		[`PFBuilder.match(Class, FI.TypedPredicate, FI.Apply)`](PFBuilder.html#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))
		- #### matchUnchecked
		
		
		
		```
		public static <F,​T> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> matchUnchecked​(java.lang.Class<?> type,
		                                                              [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,
		                                                              [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<?,​T> apply)
		```
		
		Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added without
		 compile time type check of the parameters. Should normally not be used, but when matching on
		 class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.
		
		See Also:
		[`PFBuilder.matchUnchecked(Class, FI.TypedPredicate, FI.Apply)`](PFBuilder.html#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))
		- #### matchEquals
		
		
		
		```
		public static <F,​T,​P> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> matchEquals​(P object,
		                                                                   [FI.Apply](FI.Apply.html "interface in akka.japi.pf")<P,​T> apply)
		```
		
		Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`object` \- the object to compare equals with
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		See Also:
		[`PFBuilder.matchEquals(Object, FI.Apply)`](PFBuilder.html#matchEquals(P,akka.japi.pf.FI.Apply))
		- #### matchAny
		
		
		
		```
		public static <F,​T> [PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> matchAny​([FI.Apply](FI.Apply.html "interface in akka.japi.pf")<F,​T> apply)
		```
		
		Convenience function to create a [`PFBuilder`](PFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added
		See Also:
		[`PFBuilder.matchAny(FI.Apply)`](PFBuilder.html#matchAny(akka.japi.pf.FI.Apply))
		- #### create
		
		
		
		```
		public static final <F,​T> [Match](Match.html "class in akka.japi.pf")<F,​T> create​([PFBuilder](PFBuilder.html "class in akka.japi.pf")<F,​T> builder)
		```
		
		Create a [`Match`](Match.html "class in akka.japi.pf") from the builder.
		
		Parameters:
		`builder` \- a builder representing the partial function
		Returns:
		a [`Match`](Match.html "class in akka.japi.pf") that can be reused
		- #### match
		
		
		
		```
		public [R](Match.html "type parameter in Match") match​([I](Match.html "type parameter in Match") i)
		        throws scala.MatchError
		```
		
		Convenience function to make the Java code more readable.
		
		 
		
		
		
		```
		
		   Match<X, Y> matcher = Match.create(...);
		
		   Y someY = matcher.match(obj);
		 
		```
		
		
		Parameters:
		`i` \- the argument to apply the match to
		Returns:
		the result of the application
		Throws:
		`scala.MatchError` \- if there is no match
		- #### asPF
		
		
		
		```
		public scala.PartialFunction<I,​R> asPF()
		```
		
		Turn this [`Match`](Match.html "class in akka.japi.pf") into a `PartialFunction`.
		
		Returns:
		a partial function representation ot his [`Match`](Match.html "class in akka.japi.pf")

## Code Examples

### Example 1: match

```text
Match<X, Y> matcher = Match.create(...);

   Y someY = matcher.match(obj);
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.Apply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/Match.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/Match.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/Match.html)*