---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html
title: PathMatcher
---

# PathMatcher

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class PathMatcher\<L\>

- java.lang.Object
- - akka.http.scaladsl.server.PathMatcher\<L\>

- All Implemented Interfaces:
`scala.Function1<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<L>>`

Direct Known Subclasses:
`[PathMatchers.NumberMatcher](PathMatchers.NumberMatcher.html "class in akka.http.scaladsl.server")`, `[PathMatchers.PathEnd$](PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server")`, `[PathMatchers.Remaining$](PathMatchers.Remaining$.html "class in akka.http.scaladsl.server")`, `[PathMatchers.RemainingPath$](PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server")`, `[PathMatchers.Segment$](PathMatchers.Segment$.html "class in akka.http.scaladsl.server")`, `[PathMatchers.Slash$](PathMatchers.Slash$.html "class in akka.http.scaladsl.server")`

---

```
public abstract class PathMatcher<L>
extends java.lang.Object
implements scala.Function1<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<L>>
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatcher.Unmatched.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[PathMatcher.EnhancedPathMatcher](PathMatcher.EnhancedPathMatcher.html "class in akka.http.scaladsl.server")<[L](PathMatcher.EnhancedPathMatcher.html "type parameter in PathMatcher.EnhancedPathMatcher")>` |  |
	| `static interface` | `[PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.Lift.html "type parameter in PathMatcher.Lift"),​[M](PathMatcher.Lift.html "type parameter in PathMatcher.Lift")>` |  |
	| `static class` | `[PathMatcher.Lift$](PathMatcher.Lift$.html "class in akka.http.scaladsl.server")` |  |
	| `static interface` | `[PathMatcher.LowLevelLiftImplicits](PathMatcher.LowLevelLiftImplicits.html "interface in akka.http.scaladsl.server")` |  |
	| `static class` | `[PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")<[L](PathMatcher.Matched.html "type parameter in PathMatcher.Matched")>` |  |
	| `static class` | `[PathMatcher.Matched$](PathMatcher.Matched$.html "class in akka.http.scaladsl.server")` |  |
	| `static class` | `[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<[L](PathMatcher.Matching.html "type parameter in PathMatcher.Matching")>` |  |
	| `static class` | `[PathMatcher.PathMatcher1Ops](PathMatcher.PathMatcher1Ops.html "class in akka.http.scaladsl.server")<[T](PathMatcher.PathMatcher1Ops.html "type parameter in PathMatcher.PathMatcher1Ops")>` |  |
	| `static class` | `[PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher](#%3Cinit%3E(akka.http.scaladsl.server.util.Tuple))​([Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher")> ev)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[_regex2PathMatcher](#_regex2PathMatcher(scala.util.matching.Regex))​(scala.util.matching.Regex regex)` |  |
	| `static [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[_segmentStringToPathMatcher](#_segmentStringToPathMatcher(java.lang.String))​(java.lang.String segment)` |  |
	| `static <T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[_stringExtractionPair2PathMatcher](#_stringExtractionPair2PathMatcher(scala.Tuple2))​(scala.Tuple2<java.lang.String,​T> tuple)` |  |
	| `static [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[_stringNameOptionReceptacle2PathMatcher](#_stringNameOptionReceptacle2PathMatcher(akka.http.scaladsl.common.NameOptionReceptacle))​([NameOptionReceptacle](../common/NameOptionReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String> nr)` |  |
	| `static <T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[_valueMap2PathMatcher](#_valueMap2PathMatcher(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​T> valueMap)` |  |
	| `<R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object>` | `[append](#append(akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.util.TupleOps.Join))​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> other,  [TupleOps.Join](util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher"),​R> join)` |  |
	| `static <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L>` | `[apply](#apply(akka.http.scaladsl.model.Uri.Path,L,akka.http.scaladsl.server.util.Tuple))​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") prefix,  L extractions,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$18)` | Creates a PathMatcher that matches and consumes the given path prefix and extracts the given list of extractions. |
	| `static <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L>` | `[apply](#apply(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> magnet)` | Provoke implicit conversions to PathMatcher to be applied |
	| `static [PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[EmptyMatch](#EmptyMatch())()` | The empty match returned when a Regex matcher matches the empty path |
	| `[Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher")>` | `[ev](#ev())()` |  |
	| `<R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R>` | `[or](#or(akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.util.Tuple))​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<? extends R> other,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$2)` |  |
	| `static <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L>` | `[provide](#provide(L,akka.http.scaladsl.server.util.Tuple))​(L extractions,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$17)` | Creates a PathMatcher that always matches, consumes nothing and extracts the given Tuple of values. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object>` | `[repeat](#repeat(int,int,akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.PathMatcher.Lift))​(int min,  int max,  [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> separator,  [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.collection.immutable.List> lift)` | Turns this `PathMatcher` into one that matches a number of times (with the given separator)  and potentially extracts a `List` of the underlying matcher's extractions. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object>` | `[repeat](#repeat(int,akka.http.scaladsl.server.PathMatcher.Lift))​(int count,  [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.collection.immutable.List> lift)` | Same as `repeat(min = count, max = count)`. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object>` | `[repeat](#repeat(int,akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.PathMatcher.Lift))​(int count,  [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> separator,  [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.collection.immutable.List> lift)` | Same as `repeat(min = count, max = count, separator = separator)`. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher")>` | `[slash](#slash())()` |  |
	| `<R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object>` | `[slash](#slash(akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.util.TupleOps.Join))​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> other,  [TupleOps.Join](util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher"),​R> join)` |  |
	| `<R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R>` | `[tflatMap](#tflatMap(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.Option<R>> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$5)` |  |
	| `<R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R>` | `[tmap](#tmap(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<[L](PathMatcher.html "type parameter in PathMatcher"),​R> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$4)` |  |
	| `<R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R>` | `[transform](#transform(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher")>,​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$3)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher
		
		
		
		```
		public PathMatcher​([Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher")> ev)
		```

	- ### Method Detail
	
	
	
		- #### provide
		
		
		
		```
		public static <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> provide​(L extractions,
		                                         [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$17)
		```
		
		Creates a PathMatcher that always matches, consumes nothing and extracts the given Tuple of values.
		
		Parameters:
		`extractions` \- (undocumented)
		`evidence$17` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public static <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> apply​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") prefix,
		                                       L extractions,
		                                       [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$18)
		```
		
		Creates a PathMatcher that matches and consumes the given path prefix and extracts the given list of extractions.
		 If the given prefix is empty the returned PathMatcher matches always and consumes nothing.
		
		Parameters:
		`prefix` \- (undocumented)
		`extractions` \- (undocumented)
		`evidence$18` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public static <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> apply​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> magnet)
		```
		
		Provoke implicit conversions to PathMatcher to be applied
		- #### EmptyMatch
		
		
		
		```
		public static [PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> EmptyMatch()
		```
		
		The empty match returned when a Regex matcher matches the empty path
		- #### \_stringExtractionPair2PathMatcher
		
		
		
		```
		public static <T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> _stringExtractionPair2PathMatcher​(scala.Tuple2<java.lang.String,​T> tuple)
		```
		- #### \_segmentStringToPathMatcher
		
		
		
		```
		public static [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> _segmentStringToPathMatcher​(java.lang.String segment)
		```
		- #### \_stringNameOptionReceptacle2PathMatcher
		
		
		
		```
		public static [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> _stringNameOptionReceptacle2PathMatcher​([NameOptionReceptacle](../common/NameOptionReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String> nr)
		```
		- #### \_regex2PathMatcher
		
		
		
		```
		public static [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> _regex2PathMatcher​(scala.util.matching.Regex regex)
		```
		- #### \_valueMap2PathMatcher
		
		
		
		```
		public static <T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> _valueMap2PathMatcher​(scala.collection.immutable.Map<java.lang.String,​T> valueMap)
		```
		- #### ev
		
		
		
		```
		public [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher")> ev()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher")> slash()
		```
		- #### slash
		
		
		
		```
		public <R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object> slash​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> other,
		                                               [TupleOps.Join](util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher"),​R> join)
		```
		- #### or
		
		
		
		```
		public <R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> or​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<? extends R> other,
		                             [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$2)
		```
		- #### append
		
		
		
		```
		public <R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object> append​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> other,
		                                                [TupleOps.Join](util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<[L](PathMatcher.html "type parameter in PathMatcher"),​R> join)
		```
		- #### transform
		
		
		
		```
		public <R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> transform​(scala.Function1<[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher")>,​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>> f,
		                                    [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$3)
		```
		- #### tmap
		
		
		
		```
		public <R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> tmap​(scala.Function1<[L](PathMatcher.html "type parameter in PathMatcher"),​R> f,
		                               [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$4)
		```
		- #### tflatMap
		
		
		
		```
		public <R> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<R> tflatMap​(scala.Function1<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.Option<R>> f,
		                                   [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$5)
		```
		- #### repeat
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object> repeat​(int count,
		                                            [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.collection.immutable.List> lift)
		```
		
		Same as `repeat(min = count, max = count)`.
		
		Parameters:
		`count` \- (undocumented)
		`lift` \- (undocumented)
		Returns:
		(undocumented)
		- #### repeat
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object> repeat​(int count,
		                                            [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> separator,
		                                            [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.collection.immutable.List> lift)
		```
		
		Same as `repeat(min = count, max = count, separator = separator)`.
		
		Parameters:
		`count` \- (undocumented)
		`separator` \- (undocumented)
		`lift` \- (undocumented)
		Returns:
		(undocumented)
		- #### repeat
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<java.lang.Object> repeat​(int min,
		                                            int max,
		                                            [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> separator,
		                                            [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.html "type parameter in PathMatcher"),​scala.collection.immutable.List> lift)
		```
		
		Turns this `PathMatcher` into one that matches a number of times (with the given separator)
		 and potentially extracts a `List` of the underlying matcher's extractions.
		 If less than `min` applications of the underlying matcher have succeeded the produced matcher fails,
		 otherwise it matches up to the given `max` number of applications.
		 Note that it won't fail even if more than `max` applications could succeed!
		 The "surplus" path elements will simply be left unmatched.
		 
		 The result type depends on the type of the underlying matcher:
		 
		
		
		
		
		
		
		  | If a `matcher` is of type | then `matcher.repeat(...)` is of type || `PathMatcher0` | `PathMatcher0` |
		| `PathMatcher1[T]` | `PathMatcher1[List[T]` |
		| `PathMatcher[L :Tuple]` | `PathMatcher[List[L}` |
		
		
		
		Parameters:
		`min` \- (undocumented)
		`max` \- (undocumented)
		`separator` \- (undocumented)
		`lift` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.EnhancedPathMatcher.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.Lift$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.Lift.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.LowLevelLiftImplicits.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.Matched$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.Matched.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.Matching.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.PathMatcher1Ops.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.Unmatched$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.NumberMatcher.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.PathEnd$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Remaining$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.RemainingPath$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Segment$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Slash$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.Join.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html)*