---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Collections.EmptyImmutableSeq$.html
title: Collections.EmptyImmutableSeq$
---

# Collections.EmptyImmutableSeq$

## Content

Package [akka.util](package-summary.html)
## Class Collections.EmptyImmutableSeq$

- java.lang.Object
- - akka.util.Collections.EmptyImmutableSeq$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.collection.immutable.Iterable<scala.runtime.Nothing$>`, `scala.collection.immutable.Seq<scala.runtime.Nothing$>`, `scala.collection.immutable.SeqOps<scala.runtime.Nothing$,​scala.collection.immutable.Seq,​scala.collection.immutable.Seq<scala.runtime.Nothing$>>`, `scala.collection.Iterable<scala.runtime.Nothing$>`, `scala.collection.IterableFactoryDefaults<scala.runtime.Nothing$,​scala.collection.Iterable>`, `scala.collection.IterableOnce<scala.runtime.Nothing$>`, `scala.collection.IterableOnceOps<scala.runtime.Nothing$,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<scala.runtime.Nothing$,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.Seq<scala.runtime.Nothing$>`, `scala.collection.SeqOps<scala.runtime.Nothing$,​scala.collection.Seq,​scala.collection.Seq<scala.runtime.Nothing$>>`, `scala.Equals`, `scala.Function1<java.lang.Object,​scala.runtime.Nothing$>`, `scala.PartialFunction<java.lang.Object,​scala.runtime.Nothing$>`, `scala.Product`

Enclosing class:
[Collections](Collections.html "class in akka.util")

---

```
public static class Collections.EmptyImmutableSeq$
extends java.lang.Object
implements scala.collection.immutable.Seq<scala.runtime.Nothing$>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.Collections.EmptyImmutableSeq$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.collection.IterableOps
		
		
		`scala.collection.IterableOps.SizeCompareOps, scala.collection.IterableOps.SizeCompareOps$, scala.collection.IterableOps.WithFilter<A extends java.lang.Object,​CC extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Collections.EmptyImmutableSeq$](Collections.EmptyImmutableSeq$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyImmutableSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.runtime.Nothing$` | `[apply](#apply(int))​(int idx)` |  |
	| `scala.collection.Iterator<scala.runtime.Nothing$>` | `[iterator](#iterator())()` |  |
	| `int` | `[length](#length())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from interface scala.collection.Iterable
		
		
		`className, coll, collectionClassName, lazyZip, seq, toIterable`
		- ### Methods inherited from interface scala.collection.IterableFactoryDefaults
		
		
		`empty, fromSpecific, newSpecificBuilder`
		- ### Methods inherited from interface scala.collection.IterableOnce
		
		
		`knownSize, stepper`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToArray, copyToArray, copyToArray, copyToBuffer, corresponds, count, exists, find, fold, foldLeft, foldRight, forall, foreach, hasDefiniteSize, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, reversed, sum, to, toArray, toBuffer, toIndexedSeq, toIterator, toList, toMap, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.IterableOps
		
		
		`$plus$plus, collect, companion, drop, dropRight, dropWhile, filter, filterNot, flatMap, flatten, groupBy, grouped, groupMap, groupMapReduce, head, headOption, init, inits, isTraversableAgain, last, lastOption, map, partition, partitionMap, repr, scan, scanLeft, scanRight, sizeIs, slice, sliding, sliding, span, splitAt, tail, tails, take, takeRight, takeWhile, tapEach, toTraversable, transpose, unzip, unzip3, view, withFilter, zip, zipAll, zipWithIndex`
		- ### Methods inherited from interface scala.PartialFunction
		
		
		`andThen, andThen, applyOrElse, compose, elementWise, isDefinedAt, lift, orElse, runWith, unapply`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface scala.collection.immutable.Seq
		
		
		`iterableFactory, toSeq`
		- ### Methods inherited from interface scala.collection.Seq
		
		
		`canEqual, equals, hashCode, stringPrefix, toString`
		- ### Methods inherited from interface scala.collection.SeqOps
		
		
		`$colon$plus, $colon$plus$plus, $plus$colon, $plus$plus$colon, appended, appendedAll, combinations, concat, contains, containsSlice, corresponds, diff, distinct, distinctBy, endsWith, findLast, indexOf, indexOf, indexOfSlice, indexOfSlice, indexWhere, indexWhere, indices, intersect, isDefinedAt, isEmpty, lastIndexOf, lastIndexOf$default$2, lastIndexOfSlice, lastIndexOfSlice, lastIndexWhere, lastIndexWhere, lengthCompare, lengthCompare, lengthIs, occCounts, padTo, patch, permutations, prefixLength, prepended, prependedAll, reverse, reverseIterator, reverseMap, sameElements, scala$collection$SeqOps$$toGenericSeq, search, search, segmentLength, segmentLength, size, sizeCompare, sizeCompare, sortBy, sorted, sortWith, startsWith, startsWith$default$2, union, updated, view`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Collections.EmptyImmutableSeq$](Collections.EmptyImmutableSeq$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EmptyImmutableSeq$
		
		
		
		```
		public EmptyImmutableSeq$()
		```

	- ### Method Detail
	
	
	
		- #### iterator
		
		
		
		```
		public final scala.collection.Iterator<scala.runtime.Nothing$> iterator()
		```
		
		
		Specified by:
		`iterator` in interface `scala.collection.IterableOnce<scala.runtime.Nothing$>`
		- #### apply
		
		
		
		```
		public final scala.runtime.Nothing$ apply​(int idx)
		```
		
		
		Specified by:
		`apply` in interface `scala.collection.SeqOps<scala.runtime.Nothing$,​scala.collection.Seq,​scala.collection.Seq<scala.runtime.Nothing$>>`
		- #### length
		
		
		
		```
		public final int length()
		```
		
		
		Specified by:
		`length` in interface `scala.collection.SeqOps<scala.runtime.Nothing$,​scala.collection.Seq,​scala.collection.Seq<scala.runtime.Nothing$>>`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Collections.EmptyImmutableSeq$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Collections.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Collections.EmptyImmutableSeq$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Collections.EmptyImmutableSeq$.html)*