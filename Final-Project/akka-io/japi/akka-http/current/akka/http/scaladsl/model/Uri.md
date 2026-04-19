---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html
title: Uri.Query
---

# Uri.Query

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Uri.Query

- java.lang.Object
- - akka.http.scaladsl.model.Uri.Query

- All Implemented Interfaces:
`[QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html "interface in akka.http.ccompat")`, `scala.collection.immutable.Iterable<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.LinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​scala.collection.immutable.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.immutable.SeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.Seq,​scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.Iterable<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.IterableFactoryDefaults<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable>`, `scala.collection.IterableOnce<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.IterableOnceOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.LinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.LinearSeq,​scala.collection.LinearSeq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.collection.SeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.Seq,​scala.collection.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>>`, `scala.collection.StrictOptimizedIterableOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model")>`, `scala.collection.StrictOptimizedLinearSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model")>`, `scala.collection.StrictOptimizedSeqOps<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.LinearSeq,​[Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model")>`, `scala.Equals`, `scala.Function1<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.String>>`, `scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.String>>`

Direct Known Subclasses:
`[Uri.Query$.Cons](Uri.Query$.Cons.html "class in akka.http.scaladsl.model")`, `[Uri.Query$.Empty$](Uri.Query$.Empty$.html "class in akka.http.scaladsl.model")`

Enclosing class:
[Uri](Uri.html "class in akka.http.scaladsl.model")

---

```
public abstract static class Uri.Query
extends java.lang.Object
implements [QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html "interface in akka.http.ccompat")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.collection.IterableOps
		
		
		`scala.collection.IterableOps.SizeCompareOps, scala.collection.IterableOps.SizeCompareOps$, scala.collection.IterableOps.WithFilter<A extends java.lang.Object,​CC extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Query](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.String>` | `[get](#get(java.lang.String))​(java.lang.String key)` |  |
	| `scala.collection.immutable.List<java.lang.String>` | `[getAll](#getAll(java.lang.String))​(java.lang.String key)` |  |
	| `java.lang.String` | `[getOrElse](#getOrElse(java.lang.String,scala.Function0))​(java.lang.String key,  scala.Function0<java.lang.String> default_)` |  |
	| `abstract java.lang.String` | `[key](#key())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[toMap](#toMap())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.List<java.lang.String>>` | `[toMultiMap](#toMultiMap())()` | Returns this query as a map where keys can have multiple values. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `abstract java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
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
		- ### Methods inherited from interface akka.http.ccompat.[QuerySeqOptimized](../../ccompat/QuerySeqOptimized.html "interface in akka.http.ccompat")
		
		
		`[empty](../../ccompat/QuerySeqOptimized.html#empty()), [fromSpecific](../../ccompat/QuerySeqOptimized.html#fromSpecific(scala.collection.IterableOnce)), [newSpecificBuilder](../../ccompat/QuerySeqOptimized.html#newSpecificBuilder())`
		- ### Methods inherited from interface scala.collection.immutable.Seq
		
		
		`toSeq`
		- ### Methods inherited from interface scala.collection.Seq
		
		
		`canEqual, equals, hashCode`
		- ### Methods inherited from interface scala.collection.SeqOps
		
		
		`$colon$plus, $colon$plus$plus, $plus$colon, $plus$plus$colon, combinations, concat, containsSlice, corresponds, distinct, endsWith, indexOf, indexOf, indexOfSlice, indexOfSlice, indexWhere, indices, lastIndexOf, lastIndexOf$default$2, lastIndexOfSlice, lastIndexOfSlice, lastIndexWhere, lengthIs, occCounts, patch, permutations, prefixLength, reverse, reverseIterator, reverseMap, scala$collection$SeqOps$$toGenericSeq, search, search, segmentLength, size, sizeCompare, sizeCompare, sortBy, sorted, sortWith, startsWith, startsWith$default$2, union, updated, view`
		- ### Methods inherited from interface scala.collection.StrictOptimizedIterableOps
		
		
		`collect, dropRight, filter, filterImpl, filterNot, flatMap, flatten, map, partition, partitionMap, scanLeft, span, strictOptimizedCollect, strictOptimizedConcat, strictOptimizedFlatMap, strictOptimizedFlatten, strictOptimizedMap, strictOptimizedZip, takeRight, tapEach, unzip, unzip3, zip, zipWithIndex`
		- ### Methods inherited from interface scala.collection.StrictOptimizedLinearSeqOps
		
		
		`drop, dropWhile, iterator`
		- ### Methods inherited from interface scala.collection.StrictOptimizedSeqOps
		
		
		`appended, appendedAll, diff, distinctBy, intersect, padTo, prepended, prependedAll`

- - ### Constructor Detail
	
	
	
		- #### Query
		
		
		
		```
		public Query()
		```

	- ### Method Detail
	
	
	
		- #### key
		
		
		
		```
		public abstract java.lang.String key()
		```
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		- #### get
		
		
		
		```
		public scala.Option<java.lang.String> get​(java.lang.String key)
		```
		- #### getOrElse
		
		
		
		```
		public java.lang.String getOrElse​(java.lang.String key,
		                                  scala.Function0<java.lang.String> default_)
		```
		- #### getAll
		
		
		
		```
		public scala.collection.immutable.List<java.lang.String> getAll​(java.lang.String key)
		```
		- #### toMap
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> toMap()
		```
		- #### toMultiMap
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.List<java.lang.String>> toMultiMap()
		```
		
		Returns this query as a map where keys can have multiple values. The parameter order is
		 preserved, so that the following query:
		 
		
		
		
		```
		
		   a=1&a=2&a=3&a=4&b=1
		 
		```
		
		
		 Will return a map like:
		 
		
		
		
		
		
		```
		
		   "a" -> List(1, 2, 3, 4),
		   "b" -> List(1)
		 
		```
		
		
		Returns:
		(undocumented)
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.String>>`
		Specified by:
		`toString` in interface `scala.collection.Iterable<scala.Tuple2<java.lang.String,​java.lang.String>>`
		Specified by:
		`toString` in interface `scala.collection.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>`
		Overrides:
		`toString` in class `java.lang.Object`

## Code Examples

### Example 1: toMultiMap

```text
a=1&a=2&a=3&a=4&b=1
```

### Example 2: toMultiMap

```text
"a" -> List(1, 2, 3, 4),
   "b" -> List(1)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/ccompat/QuerySeqOptimized.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query$.Cons.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query$.Empty$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html)*