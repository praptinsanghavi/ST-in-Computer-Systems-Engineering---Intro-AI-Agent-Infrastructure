---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Segment$.html
title: PathMatchers.Segment$
---

# PathMatchers.Segment$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class PathMatchers.Segment$

- java.lang.Object
- - [akka.http.scaladsl.server.PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")\<scala.Tuple1\<java.lang.String\>\>
	- - akka.http.scaladsl.server.PathMatchers.Segment$

- All Implemented Interfaces:
`scala.Function1<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>>`

Enclosing interface:
[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")

---

```
public static class PathMatchers.Segment$
extends [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.server.[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")
		
		
		`[PathMatcher.EnhancedPathMatcher](PathMatcher.EnhancedPathMatcher.html "class in akka.http.scaladsl.server")<[L](PathMatcher.EnhancedPathMatcher.html "type parameter in PathMatcher.EnhancedPathMatcher")>, [PathMatcher.Lift](PathMatcher.Lift.html "interface in akka.http.scaladsl.server")<[L](PathMatcher.Lift.html "type parameter in PathMatcher.Lift"),​[M](PathMatcher.Lift.html "type parameter in PathMatcher.Lift")>, [PathMatcher.Lift$](PathMatcher.Lift$.html "class in akka.http.scaladsl.server"), [PathMatcher.LowLevelLiftImplicits](PathMatcher.LowLevelLiftImplicits.html "interface in akka.http.scaladsl.server"), [PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")<[L](PathMatcher.Matched.html "type parameter in PathMatcher.Matched")>, [PathMatcher.Matched$](PathMatcher.Matched$.html "class in akka.http.scaladsl.server"), [PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<[L](PathMatcher.Matching.html "type parameter in PathMatcher.Matching")>, [PathMatcher.PathMatcher1Ops](PathMatcher.PathMatcher1Ops.html "class in akka.http.scaladsl.server")<[T](PathMatcher.PathMatcher1Ops.html "type parameter in PathMatcher.PathMatcher1Ops")>, [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server")`
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Segment$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[apply](#apply(akka.http.scaladsl.model.Uri.Path))​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") path)` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.server.[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")
		
		
		`[_regex2PathMatcher](PathMatcher.html#_regex2PathMatcher(scala.util.matching.Regex)), [_segmentStringToPathMatcher](PathMatcher.html#_segmentStringToPathMatcher(java.lang.String)), [_stringExtractionPair2PathMatcher](PathMatcher.html#_stringExtractionPair2PathMatcher(scala.Tuple2)), [_stringNameOptionReceptacle2PathMatcher](PathMatcher.html#_stringNameOptionReceptacle2PathMatcher(akka.http.scaladsl.common.NameOptionReceptacle)), [_valueMap2PathMatcher](PathMatcher.html#_valueMap2PathMatcher(scala.collection.immutable.Map)), [append](PathMatcher.html#append(akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.util.TupleOps.Join)), [apply](PathMatcher.html#apply(akka.http.scaladsl.model.Uri.Path,L,akka.http.scaladsl.server.util.Tuple)), [apply](PathMatcher.html#apply(akka.http.scaladsl.server.PathMatcher)), [EmptyMatch](PathMatcher.html#EmptyMatch()), [ev](PathMatcher.html#ev()), [or](PathMatcher.html#or(akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.util.Tuple)), [provide](PathMatcher.html#provide(L,akka.http.scaladsl.server.util.Tuple)), [repeat](PathMatcher.html#repeat(int,int,akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.PathMatcher.Lift)), [repeat](PathMatcher.html#repeat(int,akka.http.scaladsl.server.PathMatcher.Lift)), [repeat](PathMatcher.html#repeat(int,akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.PathMatcher.Lift)), [slash](PathMatcher.html#slash()), [slash](PathMatcher.html#slash(akka.http.scaladsl.server.PathMatcher,akka.http.scaladsl.server.util.TupleOps.Join)), [tflatMap](PathMatcher.html#tflatMap(scala.Function1,akka.http.scaladsl.server.util.Tuple)), [tmap](PathMatcher.html#tmap(scala.Function1,akka.http.scaladsl.server.util.Tuple)), [transform](PathMatcher.html#transform(scala.Function1,akka.http.scaladsl.server.util.Tuple))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### Segment$
		
		
		
		```
		public Segment$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> apply​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") path)
		```

## Related Pages (Internal Links)

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
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Segment$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Segment$.html)*