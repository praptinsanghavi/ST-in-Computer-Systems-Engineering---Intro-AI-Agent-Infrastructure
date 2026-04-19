---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteStrings.html
title: ByteString.ByteStrings
---

# ByteString.ByteStrings

## Content

Package [akka.util](package-summary.html)
## Class ByteString.ByteStrings

- java.lang.Object
- - [akka.util.ByteString](ByteString.html "class in akka.util")
	- - akka.util.ByteString.ByteStrings

- All Implemented Interfaces:
`java.io.Serializable`, `scala.collection.immutable.IndexedSeq<java.lang.Object>`, `scala.collection.immutable.IndexedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​scala.collection.immutable.IndexedSeq<java.lang.Object>>`, `scala.collection.immutable.Iterable<java.lang.Object>`, `scala.collection.immutable.Seq<java.lang.Object>`, `scala.collection.immutable.SeqOps<java.lang.Object,​scala.collection.immutable.Seq,​scala.collection.immutable.Seq<java.lang.Object>>`, `scala.collection.immutable.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.IndexedSeq<java.lang.Object>`, `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`, `scala.collection.Iterable<java.lang.Object>`, `scala.collection.IterableFactoryDefaults<java.lang.Object,​scala.collection.Iterable>`, `scala.collection.IterableOnce<java.lang.Object>`, `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.Seq<java.lang.Object>`, `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`, `scala.collection.StrictOptimizedIterableOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.Equals`, `scala.Function1<java.lang.Object,​java.lang.Object>`, `scala.PartialFunction<java.lang.Object,​java.lang.Object>`

Enclosing class:
[ByteString](ByteString.html "class in akka.util")

---

```
public static final class ByteString.ByteStrings
extends [ByteString](ByteString.html "class in akka.util")
implements java.io.Serializable
```

A ByteString with 2 or more fragments.

See Also:
[Serialized Form](../../serialized-form.html#akka.util.ByteString.ByteStrings)

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
	| `[ByteStrings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteString](ByteString.html "class in akka.util")` | `[$plus$plus](#$plus$plus(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") that)` | Efficiently concatenate another ByteString. |
	| `byte` | `[apply](#apply(int))​(int idx)` |  |
	| `java.nio.ByteBuffer` | `[asByteBuffer](#asByteBuffer())()` | Returns a read\-only ByteBuffer that directly wraps this ByteString  if it is not fragmented. |
	| `scala.collection.immutable.Iterable<java.nio.ByteBuffer>` | `[asByteBuffers](#asByteBuffers())()` | Scala API: Returns an immutable Iterable of read\-only ByteBuffers that directly wraps this ByteStrings  all fragments. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[compact](#compact())()` | Create a new ByteString with all contents compacted into a single,  full byte array. |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object,int,int))​(java.lang.Object dest,  int start,  int len)` |  |
	| `int` | `[copyToBuffer](#copyToBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer buffer)` | Copy as many bytes as possible to a ByteBuffer, starting from it's  current position. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[decodeBase64](#decodeBase64())()` |  |
	| `java.lang.String` | `[decodeString](#decodeString(java.lang.String))​(java.lang.String charset)` | Decodes this ByteString using a charset to produce a String. |
	| `java.lang.String` | `[decodeString](#decodeString(java.nio.charset.Charset))​(java.nio.charset.Charset charset)` | Decodes this ByteString using a charset to produce a String. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[drop](#drop(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[dropRight](#dropRight(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[encodeBase64](#encodeBase64())()` | Returns a ByteString which is the Base64 representation of this ByteString |
	| `<B> int` | `[indexOf](#indexOf(B,int))​(B elem,  int from)` |  |
	| `boolean` | `[isCompact](#isCompact())()` | Check whether this ByteString is compact in memory. |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[iterator](#iterator())()` | Avoid \`iterator\` in performance sensitive code, call ops directly on ByteString instead |
	| `int` | `[length](#length())()` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[slice](#slice(int,int))​(int from,  int until)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[take](#take(int))​(int n)` |  |
	| `protected java.lang.Object` | `[writeReplace](#writeReplace())()` |  |
	
	
		- ### Methods inherited from class akka.util.[ByteString](ByteString.html "class in akka.util")
		
		
		`[className](ByteString.html#className()), [concat](ByteString.html#concat(akka.util.ByteString)), [copyToArray](ByteString.html#copyToArray(java.lang.Object,int)), [createBuilder](ByteString.html#createBuilder()), [dropWhile](ByteString.html#dropWhile(scala.Function1)), [empty](ByteString.html#empty()), [emptyByteString](ByteString.html#emptyByteString()), [foreach](ByteString.html#foreach(scala.Function1)), [fromArray](ByteString.html#fromArray(byte%5B%5D)), [fromArray](ByteString.html#fromArray(byte%5B%5D,int,int)), [fromArrayUnsafe](ByteString.html#fromArrayUnsafe(byte%5B%5D)), [fromArrayUnsafe](ByteString.html#fromArrayUnsafe(byte%5B%5D,int,int)), [fromByteBuffer](ByteString.html#fromByteBuffer(java.nio.ByteBuffer)), [fromInts](ByteString.html#fromInts(int...)), [fromInts](ByteString.html#fromInts(scala.collection.immutable.Seq)), [fromSpecific](ByteString.html#fromSpecific(scala.collection.IterableOnce)), [fromString](ByteString.html#fromString(java.lang.String)), [fromString](ByteString.html#fromString(java.lang.String,java.lang.String)), [fromString](ByteString.html#fromString(java.lang.String,java.nio.charset.Charset)), [getByteBuffers](ByteString.html#getByteBuffers()), [grouped](ByteString.html#grouped(int)), [head](ByteString.html#head()), [indexWhere](ByteString.html#indexWhere(scala.Function1,int)), [init](ByteString.html#init()), [isEmpty](ByteString.html#isEmpty()), [last](ByteString.html#last()), [map](ByteString.html#map(scala.Function1)), [mapI](ByteString.html#mapI(scala.Function1)), [newBuilder](ByteString.html#newBuilder()), [newSpecificBuilder](ByteString.html#newSpecificBuilder()), [span](ByteString.html#span(scala.Function1)), [splitAt](ByteString.html#splitAt(int)), [tail](ByteString.html#tail()), [takeRight](ByteString.html#takeRight(int)), [takeWhile](ByteString.html#takeWhile(scala.Function1)), [toArray](ByteString.html#toArray()), [toArray](ByteString.html#toArray(scala.reflect.ClassTag)), [toArrayUnsafe](ByteString.html#toArrayUnsafe()), [toByteBuffer](ByteString.html#toByteBuffer()), [toString](ByteString.html#toString()), [UTF_8](ByteString.html#UTF_8()), [utf8String](ByteString.html#utf8String())`
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
		
		
		`$colon$plus, $colon$plus$plus, $plus$colon, $plus$plus$colon, combinations, concat, contains, containsSlice, corresponds, distinct, endsWith, findLast, indexOf, indexOfSlice, indexOfSlice, indexWhere, indices, isDefinedAt, lastIndexOf, lastIndexOf$default$2, lastIndexOfSlice, lastIndexOfSlice, lastIndexWhere, lastIndexWhere, lengthIs, occCounts, permutations, prefixLength, reverseMap, scala$collection$SeqOps$$toGenericSeq, segmentLength, segmentLength, size, sizeCompare, sizeCompare, sortBy, sortWith, startsWith, startsWith$default$2, union`
		- ### Methods inherited from interface scala.collection.StrictOptimizedIterableOps
		
		
		`collect, filter, filterImpl, filterNot, flatMap, flatten, map, partition, partitionMap, scanLeft, strictOptimizedCollect, strictOptimizedConcat, strictOptimizedFlatMap, strictOptimizedFlatten, strictOptimizedMap, strictOptimizedZip, tapEach, unzip, unzip3, zip, zipWithIndex`
		- ### Methods inherited from interface scala.collection.immutable.StrictOptimizedSeqOps
		
		
		`distinctBy, patch, sorted, updated`
		- ### Methods inherited from interface scala.collection.StrictOptimizedSeqOps
		
		
		`appended, appendedAll, diff, intersect, padTo, prepended, prependedAll`

- - ### Constructor Detail
	
	
	
		- #### ByteStrings
		
		
		
		```
		public ByteStrings()
		```

	- ### Method Detail
	
	
	
		- #### length
		
		
		
		```
		public int length()
		```
		
		
		Specified by:
		`length` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		- #### apply
		
		
		
		```
		public byte apply​(int idx)
		```
		
		
		Specified by:
		`apply` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		Specified by:
		`[apply](ByteString.html#apply(int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### iterator
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") iterator()
		```
		
		Avoid \`iterator\` in performance sensitive code, call ops directly on ByteString instead
		
		Specified by:
		`iterator` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`iterator` in interface `scala.collection.IterableOnce<java.lang.Object>`
		Overrides:
		`[iterator](ByteString.html#iterator())` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### $plus$plus
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") $plus$plus​([ByteString](ByteString.html "class in akka.util") that)
		```
		
		Description copied from class: `[ByteString](ByteString.html#$plus$plus(akka.util.ByteString))`
		Efficiently concatenate another ByteString.
		
		Specified by:
		`[$plus$plus](ByteString.html#$plus$plus(akka.util.ByteString))` in class `[ByteString](ByteString.html "class in akka.util")`
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
		- #### copyToBuffer
		
		
		
		```
		public int copyToBuffer​(java.nio.ByteBuffer buffer)
		```
		
		Description copied from class: `[ByteString](ByteString.html#copyToBuffer(java.nio.ByteBuffer))`
		Copy as many bytes as possible to a ByteBuffer, starting from it's
		 current position. This method will not overflow the buffer.
		 
		
		Specified by:
		`[copyToBuffer](ByteString.html#copyToBuffer(java.nio.ByteBuffer))` in class `[ByteString](ByteString.html "class in akka.util")`
		Parameters:
		`buffer` \- a ByteBuffer to copy bytes to
		Returns:
		the number of bytes actually copied
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
		- #### asByteBuffer
		
		
		
		```
		public java.nio.ByteBuffer asByteBuffer()
		```
		
		Description copied from class: `[ByteString](ByteString.html#asByteBuffer())`
		Returns a read\-only ByteBuffer that directly wraps this ByteString
		 if it is not fragmented.
		
		Specified by:
		`[asByteBuffer](ByteString.html#asByteBuffer())` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### asByteBuffers
		
		
		
		```
		public scala.collection.immutable.Iterable<java.nio.ByteBuffer> asByteBuffers()
		```
		
		Description copied from class: `[ByteString](ByteString.html#asByteBuffers())`
		Scala API: Returns an immutable Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
		 all fragments. Will always have at least one entry.
		
		Specified by:
		`[asByteBuffers](ByteString.html#asByteBuffers())` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### decodeString
		
		
		
		```
		public java.lang.String decodeString​(java.lang.String charset)
		```
		
		Description copied from class: `[ByteString](ByteString.html#decodeString(java.lang.String))`
		Decodes this ByteString using a charset to produce a String.
		 If you have a `Charset` instance available, use `decodeString(charset: java.nio.charset.Charset` instead.
		
		Specified by:
		`[decodeString](ByteString.html#decodeString(java.lang.String))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### decodeString
		
		
		
		```
		public java.lang.String decodeString​(java.nio.charset.Charset charset)
		```
		
		Description copied from class: `[ByteString](ByteString.html#decodeString(java.nio.charset.Charset))`
		Decodes this ByteString using a charset to produce a String.
		 Avoids Charset.forName lookup in String internals, thus is preferable to `decodeString(charset: String)`.
		
		Specified by:
		`[decodeString](ByteString.html#decodeString(java.nio.charset.Charset))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### decodeBase64
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") decodeBase64()
		```
		
		
		Specified by:
		`[decodeBase64](ByteString.html#decodeBase64())` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### encodeBase64
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") encodeBase64()
		```
		
		Description copied from class: `[ByteString](ByteString.html#encodeBase64())`
		Returns a ByteString which is the Base64 representation of this ByteString
		
		Specified by:
		`[encodeBase64](ByteString.html#encodeBase64())` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### take
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") take​(int n)
		```
		
		
		Specified by:
		`take` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`take` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`take` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Overrides:
		`[take](ByteString.html#take(int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### dropRight
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") dropRight​(int n)
		```
		
		
		Specified by:
		`dropRight` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`dropRight` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`dropRight` in interface `scala.collection.StrictOptimizedIterableOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`
		Overrides:
		`[dropRight](ByteString.html#dropRight(int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### slice
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") slice​(int from,
		                        int until)
		```
		
		
		Specified by:
		`slice` in interface `scala.collection.immutable.IndexedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​scala.collection.immutable.IndexedSeq<java.lang.Object>>`
		Specified by:
		`slice` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`slice` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`slice` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Overrides:
		`[slice](ByteString.html#slice(int,int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### drop
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") drop​(int n)
		```
		
		
		Specified by:
		`drop` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`drop` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`drop` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Overrides:
		`[drop](ByteString.html#drop(int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### indexOf
		
		
		
		```
		public <B> int indexOf​(B elem,
		                       int from)
		```
		
		
		Specified by:
		`indexOf` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		Overrides:
		`[indexOf](ByteString.html#indexOf(B,int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### copyToArray
		
		
		
		```
		public <B> int copyToArray​(java.lang.Object dest,
		                           int start,
		                           int len)
		```
		
		
		Specified by:
		`copyToArray` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Overrides:
		`[copyToArray](ByteString.html#copyToArray(java.lang.Object,int,int))` in class `[ByteString](ByteString.html "class in akka.util")`
		- #### writeReplace
		
		
		
		```
		protected java.lang.Object writeReplace()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.MultiByteArrayIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteString1$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteString1.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteString1C$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteString1C.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteStrings$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteStrings.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.Companion$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.Companion.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html
- https://doc.akka.io/japi/akka/current/akka/util/CompactByteString.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteStrings.html](https://doc.akka.io/japi/akka/current/akka/util/ByteString.ByteStrings.html)*