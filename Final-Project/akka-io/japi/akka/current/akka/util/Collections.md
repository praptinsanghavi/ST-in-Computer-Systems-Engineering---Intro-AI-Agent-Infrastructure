---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Collections.PartialImmutableValuesIterable.html
title: Collections.PartialImmutableValuesIterable
---

# Collections.PartialImmutableValuesIterable

## Content

Package [akka.util](package-summary.html)
## Class Collections.PartialImmutableValuesIterable\<From,​To\>

- java.lang.Object
- - akka.util.Collections.PartialImmutableValuesIterable\<From,​To\>

- All Implemented Interfaces:
`scala.collection.immutable.Iterable<To>`, `scala.collection.Iterable<To>`, `scala.collection.IterableFactoryDefaults<To,​scala.collection.Iterable>`, `scala.collection.IterableOnce<To>`, `scala.collection.IterableOnceOps<To,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<To,​scala.collection.Iterable,​scala.collection.Iterable>`

Direct Known Subclasses:
`[ChildrenContainer.ChildrenIterable](../actor/dungeon/ChildrenContainer.ChildrenIterable.html "class in akka.actor.dungeon")`, `[ChildrenContainer.ChildRestartsIterable](../actor/dungeon/ChildrenContainer.ChildRestartsIterable.html "class in akka.actor.dungeon")`

Enclosing class:
[Collections](Collections.html "class in akka.util")

---

```
public abstract static class Collections.PartialImmutableValuesIterable<From,​To>
extends java.lang.Object
implements scala.collection.immutable.Iterable<To>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.collection.IterableOps
		
		
		`scala.collection.IterableOps.SizeCompareOps, scala.collection.IterableOps.SizeCompareOps$, scala.collection.IterableOps.WithFilter<A extends java.lang.Object,​CC extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PartialImmutableValuesIterable](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable")` | `[apply](#apply(From))​([From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable") from)` |  |
	| `<C> void` | `[foreach](#foreach(scala.Function1))​(scala.Function1<[To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable"),​C> f)` |  |
	| `abstract boolean` | `[isDefinedAt](#isDefinedAt(From))​([From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable") from)` |  |
	| `scala.collection.Iterator<[To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable")>` | `[iterator](#iterator())()` |  |
	| `int` | `[size](#size())()` |  |
	| `abstract scala.collection.Iterator<[From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable")>` | `[valuesIterator](#valuesIterator())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.collection.immutable.Iterable
		
		
		`iterableFactory`
		- ### Methods inherited from interface scala.collection.Iterable
		
		
		`className, coll, collectionClassName, lazyZip, seq, stringPrefix, toIterable, toString`
		- ### Methods inherited from interface scala.collection.IterableFactoryDefaults
		
		
		`empty, fromSpecific, newSpecificBuilder`
		- ### Methods inherited from interface scala.collection.IterableOnce
		
		
		`knownSize, stepper`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToArray, copyToArray, copyToArray, copyToBuffer, corresponds, count, exists, find, fold, foldLeft, foldRight, forall, hasDefiniteSize, isEmpty, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, reversed, sum, to, toArray, toBuffer, toIndexedSeq, toIterator, toList, toMap, toSeq, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.IterableOps
		
		
		`$plus$plus, $plus$plus$colon, collect, companion, concat, drop, dropRight, dropWhile, filter, filterNot, flatMap, flatten, groupBy, grouped, groupMap, groupMapReduce, head, headOption, init, inits, isTraversableAgain, last, lastOption, map, partition, partitionMap, repr, scan, scanLeft, scanRight, sizeCompare, sizeCompare, sizeIs, slice, sliding, sliding, span, splitAt, tail, tails, take, takeRight, takeWhile, tapEach, toTraversable, transpose, unzip, unzip3, view, view, withFilter, zip, zipAll, zipWithIndex`

- - ### Constructor Detail
	
	
	
		- #### PartialImmutableValuesIterable
		
		
		
		```
		public PartialImmutableValuesIterable()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract [To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable") apply​([From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable") from)
		```
		- #### foreach
		
		
		
		```
		public <C> void foreach​(scala.Function1<[To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable"),​C> f)
		```
		
		
		Specified by:
		`foreach` in interface `scala.collection.IterableOnceOps<[To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable"),​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### isDefinedAt
		
		
		
		```
		public abstract boolean isDefinedAt​([From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable") from)
		```
		- #### iterator
		
		
		
		```
		public final scala.collection.Iterator<[To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable")> iterator()
		```
		
		
		Specified by:
		`iterator` in interface `scala.collection.IterableOnce<[From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable")>`
		- #### size
		
		
		
		```
		public int size()
		```
		
		
		Specified by:
		`size` in interface `scala.collection.IterableOnceOps<[To](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable"),​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### valuesIterator
		
		
		
		```
		public abstract scala.collection.Iterator<[From](Collections.PartialImmutableValuesIterable.html "type parameter in Collections.PartialImmutableValuesIterable")> valuesIterator()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.ChildRestartsIterable.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.ChildrenIterable.html
- https://doc.akka.io/japi/akka/current/akka/util/Collections.PartialImmutableValuesIterable.html
- https://doc.akka.io/japi/akka/current/akka/util/Collections.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Collections.PartialImmutableValuesIterable.html](https://doc.akka.io/japi/akka/current/akka/util/Collections.PartialImmutableValuesIterable.html)*