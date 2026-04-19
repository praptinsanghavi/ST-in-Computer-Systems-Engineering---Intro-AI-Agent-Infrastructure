---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/ccompat/QuerySeqOptimized.html
title: QuerySeqOptimized
---

# QuerySeqOptimized

## Content

Package [akka.http.ccompat](package-summary.html)
## Interface QuerySeqOptimized

- All Superinterfaces:
`scala.Equals`, `scala.Function1<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.Iterable<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.Iterable<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.IterableFactoryDefaults<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable>`, `scala.collection.IterableOnce<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.IterableOnceOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.immutable.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.LinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​scala.collection.immutable.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.LinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.LinearSeq,​scala.collection.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.SeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.Seq,​scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.SeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Seq,​scala.collection.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.StrictOptimizedIterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")>`, `scala.collection.StrictOptimizedLinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")>`, `scala.collection.StrictOptimizedSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")>`

All Known Implementing Classes:
`[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")`, `[Uri.Query$.Cons](../scaladsl/model/Uri.Query$.Cons.html "class in akka.http.scaladsl.model")`, `[Uri.Query$.Empty$](../scaladsl/model/Uri.Query$.Empty$.html "class in akka.http.scaladsl.model")`

---

```
public interface QuerySeqOptimized
extends scala.collection.immutable.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>, scala.collection.StrictOptimizedLinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.collection.IterableOps
		
		
		`scala.collection.IterableOps.SizeCompareOps, scala.collection.IterableOps.SizeCompareOps$, scala.collection.IterableOps.WithFilter<A extends java.lang.Object,​CC extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[empty](#empty())()` |  |
	| `[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[fromSpecific](#fromSpecific(scala.collection.IterableOnce))​(scala.collection.IterableOnce<scala.Tuple2<java.lang.String,​java.lang.String>> coll)` |  |
	| `scala.collection.mutable.Builder<scala.Tuple2<java.lang.String,​java.lang.String>,​[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")>` | `[newSpecificBuilder](#newSpecificBuilder())()` |  |
	
	
		- ### Methods inherited from interface scala.Function1
		
		
		`apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from interface scala.collection.Iterable
		
		
		`className, coll, collectionClassName, lazyZip, seq, toIterable`
		- ### Methods inherited from interface scala.collection.IterableOnce
		
		
		`knownSize, stepper`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToArray, copyToArray, copyToArray, copyToBuffer, corresponds, count, fold, foldRight, hasDefiniteSize, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, reversed, sum, to, toArray, toBuffer, toIndexedSeq, toIterator, toList, toMap, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.IterableOps
		
		
		`$plus$plus, companion, groupBy, grouped, groupMap, groupMapReduce, init, inits, isTraversableAgain, lastOption, repr, scan, scanRight, sizeIs, slice, sliding, sliding, splitAt, take, takeWhile, toTraversable, transpose, view, withFilter, zipAll`
		- ### Methods inherited from interface scala.collection.immutable.LinearSeq
		
		
		`iterableFactory`
		- ### Methods inherited from interface scala.collection.LinearSeq
		
		
		`stringPrefix`
		- ### Methods inherited from interface scala.collection.LinearSeqOps
		
		
		`apply, contains, exists, find, findLast, foldLeft, forall, foreach, head, headOption, indexWhere, isDefinedAt, isEmpty, last, lastIndexWhere, length, lengthCompare, lengthCompare, sameElements, segmentLength, tail, tails`
		- ### Methods inherited from interface scala.PartialFunction
		
		
		`andThen, andThen, applyOrElse, compose, elementWise, isDefinedAt, lift, orElse, runWith, unapply`
		- ### Methods inherited from interface scala.collection.immutable.Seq
		
		
		`toSeq`
		- ### Methods inherited from interface scala.collection.Seq
		
		
		`canEqual, equals, hashCode, toString`
		- ### Methods inherited from interface scala.collection.SeqOps
		
		
		`$colon$plus, $colon$plus$plus, $plus$colon, $plus$plus$colon, combinations, concat, containsSlice, corresponds, distinct, endsWith, indexOf, indexOf, indexOfSlice, indexOfSlice, indexWhere, indices, lastIndexOf, lastIndexOf$default$2, lastIndexOfSlice, lastIndexOfSlice, lastIndexWhere, lengthIs, occCounts, patch, permutations, prefixLength, reverse, reverseIterator, reverseMap, scala$collection$SeqOps$$toGenericSeq, search, search, segmentLength, size, sizeCompare, sizeCompare, sortBy, sorted, sortWith, startsWith, startsWith$default$2, union, updated, view`
		- ### Methods inherited from interface scala.collection.StrictOptimizedIterableOps
		
		
		`collect, dropRight, filter, filterImpl, filterNot, flatMap, flatten, map, partition, partitionMap, scanLeft, span, strictOptimizedCollect, strictOptimizedConcat, strictOptimizedFlatMap, strictOptimizedFlatten, strictOptimizedMap, strictOptimizedZip, takeRight, tapEach, unzip, unzip3, zip, zipWithIndex`
		- ### Methods inherited from interface scala.collection.StrictOptimizedLinearSeqOps
		
		
		`drop, dropWhile, iterator`
		- ### Methods inherited from interface scala.collection.StrictOptimizedSeqOps
		
		
		`appended, appendedAll, diff, distinctBy, intersect, padTo, prepended, prependedAll`

- - ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") empty()
		```
		
		
		Specified by:
		`empty` in interface `scala.collection.IterableFactoryDefaults<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable>`
		Specified by:
		`empty` in interface `scala.collection.IterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### fromSpecific
		
		
		
		```
		[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") fromSpecific​(scala.collection.IterableOnce<scala.Tuple2<java.lang.String,​java.lang.String>> coll)
		```
		
		
		Specified by:
		`fromSpecific` in interface `scala.collection.IterableFactoryDefaults<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable>`
		Specified by:
		`fromSpecific` in interface `scala.collection.IterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### newSpecificBuilder
		
		
		
		```
		scala.collection.mutable.Builder<scala.Tuple2<java.lang.String,​java.lang.String>,​[Uri.Query](../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")> newSpecificBuilder()
		```
		
		
		Specified by:
		`newSpecificBuilder` in interface `scala.collection.IterableFactoryDefaults<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable>`
		Specified by:
		`newSpecificBuilder` in interface `scala.collection.IterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/ccompat/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query$.Cons.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query$.Empty$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/ccompat/QuerySeqOptimized.html](https://doc.akka.io/japi/akka-http/current/akka/http/ccompat/QuerySeqOptimized.html)*