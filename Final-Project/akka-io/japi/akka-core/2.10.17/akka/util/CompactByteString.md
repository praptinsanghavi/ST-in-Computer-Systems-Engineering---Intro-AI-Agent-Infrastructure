---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/CompactByteString.html
title: CompactByteString
---

# CompactByteString

## Content

Package [akka.util](package-summary.html)
## Class CompactByteString

- java.lang.Object
- - [akka.util.ByteString](ByteString.html "class in akka.util")
	- - akka.util.CompactByteString

- All Implemented Interfaces:
`java.io.Serializable`, `scala.collection.immutable.IndexedSeq<java.lang.Object>`, `scala.collection.immutable.IndexedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​scala.collection.immutable.IndexedSeq<java.lang.Object>>`, `scala.collection.immutable.Iterable<java.lang.Object>`, `scala.collection.immutable.Seq<java.lang.Object>`, `scala.collection.immutable.SeqOps<java.lang.Object,​scala.collection.immutable.Seq,​scala.collection.immutable.Seq<java.lang.Object>>`, `scala.collection.immutable.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.IndexedSeq<java.lang.Object>`, `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`, `scala.collection.Iterable<java.lang.Object>`, `scala.collection.IterableFactoryDefaults<java.lang.Object,​scala.collection.Iterable>`, `scala.collection.IterableOnce<java.lang.Object>`, `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.Seq<java.lang.Object>`, `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`, `scala.collection.StrictOptimizedIterableOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.Equals`, `scala.Function1<java.lang.Object,​java.lang.Object>`, `scala.PartialFunction<java.lang.Object,​java.lang.Object>`

Direct Known Subclasses:
`[ByteString.ByteString1C](ByteString.ByteString1C.html "class in akka.util")`

---

```
public abstract class CompactByteString
extends [ByteString](ByteString.html "class in akka.util")
implements java.io.Serializable
```

A compact ByteString.
 
 The ByteString is guarantied to be contiguous in memory and to use only
 as much memory as required for its contents.

See Also:
[Serialized Form](../../serialized-form.html#akka.util.CompactByteString)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.util.[ByteString](ByteString.html "class in akka.util")
		
		
		`[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util"), [ByteString.ByteString1$](ByteString.ByteString1$.html "class in akka.util"), [ByteString.ByteString1C](ByteString.ByteString1C.html "class in akka.util"), [ByteString.ByteString1C$](ByteString.ByteString1C$.html "class in akka.util"), [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util"), [ByteString.ByteStrings$](ByteString.ByteStrings$.html "class in akka.util"), [ByteString.Companion](ByteString.Companion.html "interface in akka.util"), [ByteString.Companion$](ByteString.Companion$.html "class in akka.util")`
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.collection.IterableOps
		
		
		`scala.collection.IterableOps.SizeCompareOps, scala.collection.IterableOps.SizeCompareOps$, scala.collection.IterableOps.WithFilter<A extends java.lang.Object,​CC extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompactByteString](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(byte%5B%5D))​(byte[] bytes)` | Creates a new CompactByteString by copying a byte array. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String))​(java.lang.String string)` | Creates a new CompactByteString by encoding a String as UTF\-8\. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String string,  java.lang.String charset)` | Creates a new CompactByteString by encoding a String with a charset. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` | Creates a new CompactByteString by encoding a String with a charset. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.nio.ByteBuffer))​(java.nio.ByteBuffer bytes)` | Creates a new CompactByteString by copying bytes from a ByteBuffer. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> bytes)` | Creates a new CompactByteString by copying bytes. |
	| `static <T> [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Seq,scala.math.Integral))​(scala.collection.immutable.Seq<T> bytes,  scala.math.Integral<T> num)` | Creates a new CompactByteString by converting from integral numbers to bytes. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> bytes)` | Creates a new CompactByteString by traversing bytes. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[compact](#compact())()` | Create a new ByteString with all contents compacted into a single,  full byte array. |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[empty](#empty())()` |  |
	| `static [CompactByteString](CompactByteString.html "class in akka.util")` | `[fromArray](#fromArray(byte%5B%5D,int,int))​(byte[] array,  int offset,  int length)` | Creates a new CompactByteString by copying length bytes starting at offset from  an Array. |
	| `boolean` | `[isCompact](#isCompact())()` | Check whether this ByteString is compact in memory. |
	
	
		- ### Methods inherited from class akka.util.[ByteString](ByteString.html "class in akka.util")
		
		
		`[$plus$plus](ByteString.html#$plus$plus(akka.util.ByteString)), [apply](ByteString.html#apply(int)), [asByteBuffer](ByteString.html#asByteBuffer()), [asByteBuffers](ByteString.html#asByteBuffers()), [className](ByteString.html#className()), [concat](ByteString.html#concat(akka.util.ByteString)), [copyToArray](ByteString.html#copyToArray(java.lang.Object,int)), [copyToArray](ByteString.html#copyToArray(java.lang.Object,int,int)), [copyToBuffer](ByteString.html#copyToBuffer(java.nio.ByteBuffer)), [createBuilder](ByteString.html#createBuilder()), [decodeBase64](ByteString.html#decodeBase64()), [decodeString](ByteString.html#decodeString(java.lang.String)), [decodeString](ByteString.html#decodeString(java.nio.charset.Charset)), [drop](ByteString.html#drop(int)), [dropRight](ByteString.html#dropRight(int)), [dropWhile](ByteString.html#dropWhile(scala.Function1)), [empty](ByteString.html#empty()), [emptyByteString](ByteString.html#emptyByteString()), [encodeBase64](ByteString.html#encodeBase64()), [foreach](ByteString.html#foreach(scala.Function1)), [fromArray](ByteString.html#fromArray(byte%5B%5D)), [fromArrayUnsafe](ByteString.html#fromArrayUnsafe(byte%5B%5D)), [fromArrayUnsafe](ByteString.html#fromArrayUnsafe(byte%5B%5D,int,int)), [fromByteBuffer](ByteString.html#fromByteBuffer(java.nio.ByteBuffer)), [fromInts](ByteString.html#fromInts(int...)), [fromInts](ByteString.html#fromInts(scala.collection.immutable.Seq)), [fromSpecific](ByteString.html#fromSpecific(scala.collection.IterableOnce)), [fromString](ByteString.html#fromString(java.lang.String)), [fromString](ByteString.html#fromString(java.lang.String,java.lang.String)), [fromString](ByteString.html#fromString(java.lang.String,java.nio.charset.Charset)), [getByteBuffers](ByteString.html#getByteBuffers()), [grouped](ByteString.html#grouped(int)), [head](ByteString.html#head()), [indexOf](ByteString.html#indexOf(B,int)), [indexWhere](ByteString.html#indexWhere(scala.Function1,int)), [init](ByteString.html#init()), [isEmpty](ByteString.html#isEmpty()), [iterator](ByteString.html#iterator()), [last](ByteString.html#last()), [map](ByteString.html#map(scala.Function1)), [mapI](ByteString.html#mapI(scala.Function1)), [newBuilder](ByteString.html#newBuilder()), [newSpecificBuilder](ByteString.html#newSpecificBuilder()), [slice](ByteString.html#slice(int,int)), [span](ByteString.html#span(scala.Function1)), [splitAt](ByteString.html#splitAt(int)), [tail](ByteString.html#tail()), [take](ByteString.html#take(int)), [takeRight](ByteString.html#takeRight(int)), [takeWhile](ByteString.html#takeWhile(scala.Function1)), [toArray](ByteString.html#toArray()), [toArray](ByteString.html#toArray(scala.reflect.ClassTag)), [toArrayUnsafe](ByteString.html#toArrayUnsafe()), [toByteBuffer](ByteString.html#toByteBuffer()), [toString](ByteString.html#toString()), [UTF_8](ByteString.html#UTF_8()), [utf8String](ByteString.html#utf8String())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from interface scala.collection.immutable.IndexedSeq
		
		
		`applyPreferredMaxLength, canEqual, iterableFactory, sameElements, toIndexedSeq`
		- ### Methods inherited from interface scala.collection.IndexedSeq
		
		
		`stringPrefix`
		- ### Methods inherited from interface scala.collection.IndexedSeqOps
		
		
		`foldRight, headOption, knownSize, lengthCompare, lengthCompare, map, prepended, reverse, reversed, reverseIterator, search, search, sliding, stepper, view, view`
		- ### Methods inherited from interface scala.collection.Iterable
		
		
		`coll, collectionClassName, lazyZip, seq, toIterable`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToArray, copyToBuffer, corresponds, count, exists, find, fold, foldLeft, forall, hasDefiniteSize, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, sum, to, toBuffer, toIterator, toList, toMap, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.IterableOps
		
		
		`$plus$plus, companion, groupBy, groupMap, groupMapReduce, inits, isTraversableAgain, lastOption, repr, scan, scanRight, sizeIs, sliding, tails, toTraversable, transpose, withFilter, zipAll`
		- ### Methods inherited from interface scala.PartialFunction
		
		
		`andThen, andThen, applyOrElse, compose, elementWise, isDefinedAt, lift, orElse, runWith, unapply`
		- ### Methods inherited from interface scala.collection.immutable.Seq
		
		
		`toSeq`
		- ### Methods inherited from interface scala.collection.Seq
		
		
		`equals, hashCode`
		- ### Methods inherited from interface scala.collection.SeqOps
		
		
		`$colon$plus, $colon$plus$plus, $plus$colon, $plus$plus$colon, combinations, concat, contains, containsSlice, corresponds, distinct, endsWith, findLast, indexOf, indexOfSlice, indexOfSlice, indexWhere, indices, isDefinedAt, lastIndexOf, lastIndexOf$default$2, lastIndexOfSlice, lastIndexOfSlice, lastIndexWhere, lastIndexWhere, length, lengthIs, occCounts, permutations, prefixLength, reverseMap, scala$collection$SeqOps$$toGenericSeq, segmentLength, segmentLength, size, sizeCompare, sizeCompare, sortBy, sortWith, startsWith, startsWith$default$2, union`
		- ### Methods inherited from interface scala.collection.StrictOptimizedIterableOps
		
		
		`collect, filter, filterImpl, filterNot, flatMap, flatten, map, partition, partitionMap, scanLeft, strictOptimizedCollect, strictOptimizedConcat, strictOptimizedFlatMap, strictOptimizedFlatten, strictOptimizedMap, strictOptimizedZip, tapEach, unzip, unzip3, zip, zipWithIndex`
		- ### Methods inherited from interface scala.collection.immutable.StrictOptimizedSeqOps
		
		
		`distinctBy, patch, sorted, updated`
		- ### Methods inherited from interface scala.collection.StrictOptimizedSeqOps
		
		
		`appended, appendedAll, diff, intersect, padTo, prepended, prependedAll`

- - ### Constructor Detail
	
	
	
		- #### CompactByteString
		
		
		
		```
		public CompactByteString()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(byte[] bytes)
		```
		
		Creates a new CompactByteString by copying a byte array.
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(scala.collection.immutable.Seq<java.lang.Object> bytes)
		```
		
		Creates a new CompactByteString by copying bytes.
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(scala.collection.IterableOnce<java.lang.Object> bytes)
		```
		
		Creates a new CompactByteString by traversing bytes.
		- #### apply
		
		
		
		```
		public static <T> [CompactByteString](CompactByteString.html "class in akka.util") apply​(scala.collection.immutable.Seq<T> bytes,
		                                          scala.math.Integral<T> num)
		```
		
		Creates a new CompactByteString by converting from integral numbers to bytes.
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.nio.ByteBuffer bytes)
		```
		
		Creates a new CompactByteString by copying bytes from a ByteBuffer.
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.lang.String string)
		```
		
		Creates a new CompactByteString by encoding a String as UTF\-8\.
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.lang.String string,
		                                      java.lang.String charset)
		```
		
		Creates a new CompactByteString by encoding a String with a charset.
		- #### apply
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.lang.String string,
		                                      java.nio.charset.Charset charset)
		```
		
		Creates a new CompactByteString by encoding a String with a charset.
		- #### fromArray
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") fromArray​(byte[] array,
		                                          int offset,
		                                          int length)
		```
		
		Creates a new CompactByteString by copying length bytes starting at offset from
		 an Array.
		- #### empty
		
		
		
		```
		public static [CompactByteString](CompactByteString.html "class in akka.util") empty()
		```
		- #### isCompact
		
		
		
		```
		public boolean isCompact()
		```
		
		Description copied from class: `[ByteString](ByteString.html#isCompact())`
		Check whether this ByteString is compact in memory.
		 If the ByteString is compact, it might, however, not be represented
		 by an object that takes full advantage of that fact. Use compact to
		 get such an object.
		
		Specified by:
		`[isCompact](ByteString.html#isCompact())` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### compact
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") compact()
		```
		
		Description copied from class: `[ByteString](ByteString.html#compact())`
		Create a new ByteString with all contents compacted into a single,
		 full byte array.
		 If isCompact returns true, compact is an O(1\) operation, but
		 might return a different object with an optimized implementation.
		
		Specified by:
		`[compact](ByteString.html#compact())` in class `[ByteString](ByteString.html "class in akka.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteString1$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteString1.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteString1C$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteString1C.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.Companion$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.Companion.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/CompactByteString.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/CompactByteString.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/CompactByteString.html)*