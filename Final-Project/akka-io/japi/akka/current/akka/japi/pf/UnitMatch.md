---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitMatch.html
title: UnitMatch
---

# UnitMatch

## Content

Package [akka.japi.pf](package-summary.html)
## Class UnitMatch\<I\>

- java.lang.Object
- - akka.japi.pf.UnitMatch\<I\>

- Type Parameters:
`I` \- the input type, that this PartialFunction will be applied to

---

```
public class UnitMatch<I>
extends java.lang.Object
```

Version of `PartialFunction` that can be built during runtime from Java. This is a
 specialized version of [`UnitMatch`](UnitMatch.html "class in akka.japi.pf") to map java void methods to `BoxedUnit`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `protected scala.PartialFunction<I,​R>` | `statements` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<I,​R>` | `asPF()` | Turn this [`Match`](Match.html "class in akka.japi.pf") into a `PartialFunction`. |
	| `static <F> [UnitMatch](UnitMatch.html "class in akka.japi.pf")<F>` | `[create](#create(akka.japi.pf.UnitPFBuilder))​([UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> builder)` | Create a [`UnitMatch`](UnitMatch.html "class in akka.japi.pf") from the builder. |
	| `void` | `[match](#match(I))​([I](UnitMatch.html "type parameter in UnitMatch") i)` | Convenience function to make the Java code more readable. |
	| `static <F,​P>[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​P>[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F>` | `[match](#match(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<P> type,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F>` | `[matchAny](#matchAny(akka.japi.pf.FI.UnitApply))​([FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​P>[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F>` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(P object,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​P>[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F>` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.UnitApply))​(P object,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static <F,​P>[UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	| `static [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<java.lang.Object>` | `[matchUnchecked](#matchUnchecked(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<?> type,  [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)` | Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added. |
	
	
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
		public static <F,​P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> match​(java.lang.Class<P> type,
		                                                 [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		See Also:
		[`UnitPFBuilder.match(Class, FI.UnitApply)`](UnitPFBuilder.html#match(java.lang.Class,akka.japi.pf.FI.UnitApply))
		- #### matchUnchecked
		
		
		
		```
		public static [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<java.lang.Object> matchUnchecked​(java.lang.Class<?> type,
		                                                             [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		 Should normally not be used.
		
		See Also:
		[`UnitPFBuilder.matchUnchecked(Class, FI.UnitApply)`](UnitPFBuilder.html#matchUnchecked(java.lang.Class,akka.japi.pf.FI.UnitApply))
		- #### match
		
		
		
		```
		public static <F,​P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> match​(java.lang.Class<P> type,
		                                                 [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                                 [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type and predicate matches
		Returns:
		a builder with the case statement added
		See Also:
		[`UnitPFBuilder.match(Class, FI.TypedPredicate, FI.UnitApply)`](UnitPFBuilder.html#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))
		- #### matchUnchecked
		
		
		
		```
		public static <F,​P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> matchUnchecked​(java.lang.Class<?> type,
		                                                          [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<?> predicate,
		                                                          [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<?> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		 Should normally not be used.
		
		See Also:
		[`UnitPFBuilder.matchUnchecked(Class, FI.TypedPredicate, FI.UnitApply)`](UnitPFBuilder.html#matchUnchecked(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))
		- #### matchEquals
		
		
		
		```
		public static <F,​P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> matchEquals​(P object,
		                                                       [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`object` \- the object to compare equals with
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		See Also:
		[`UnitPFBuilder.matchEquals(Object, FI.UnitApply)`](UnitPFBuilder.html#matchEquals(P,akka.japi.pf.FI.UnitApply))
		- #### matchEquals
		
		
		
		```
		public static <F,​P> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> matchEquals​(P object,
		                                                       [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                                       [FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<P> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`object` \- the object to compare equals with
		`predicate` \- a predicate that will be evaluated on the argument the object compares equal
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		See Also:
		[`UnitPFBuilder.matchEquals(Object, FI.UnitApply)`](UnitPFBuilder.html#matchEquals(P,akka.japi.pf.FI.UnitApply))
		- #### matchAny
		
		
		
		```
		public static <F> [UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> matchAny​([FI.UnitApply](FI.UnitApply.html "interface in akka.japi.pf")<java.lang.Object> apply)
		```
		
		Convenience function to create a [`UnitPFBuilder`](UnitPFBuilder.html "class in akka.japi.pf") with the first case statement added.
		
		Parameters:
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added
		See Also:
		[`UnitPFBuilder.matchAny(FI.UnitApply)`](UnitPFBuilder.html#matchAny(akka.japi.pf.FI.UnitApply))
		- #### create
		
		
		
		```
		public static <F> [UnitMatch](UnitMatch.html "class in akka.japi.pf")<F> create​([UnitPFBuilder](UnitPFBuilder.html "class in akka.japi.pf")<F> builder)
		```
		
		Create a [`UnitMatch`](UnitMatch.html "class in akka.japi.pf") from the builder.
		
		Parameters:
		`builder` \- a builder representing the partial function
		Returns:
		a [`UnitMatch`](UnitMatch.html "class in akka.japi.pf") that can be reused
		- #### match
		
		
		
		```
		public void match​([I](UnitMatch.html "type parameter in UnitMatch") i)
		           throws scala.MatchError
		```
		
		Convenience function to make the Java code more readable.
		
		 
		
		
		
		```
		
		   UnitMatcher<X> matcher = UnitMatcher.create(...);
		
		   matcher.match(obj);
		 
		```
		
		
		Parameters:
		`i` \- the argument to apply the match to
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
UnitMatcher<X> matcher = UnitMatcher.create(...);

   matcher.match(obj);
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/FI.UnitApply.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/Match.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitMatch.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/japi/akka/current/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitMatch.html](https://doc.akka.io/japi/akka/current/akka/japi/pf/UnitMatch.html)*