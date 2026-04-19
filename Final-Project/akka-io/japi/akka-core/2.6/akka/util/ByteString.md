---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.html
title: ByteString
---

# ByteString

## Content

Package [akka.util](package-summary.html)
## Class ByteString

- java.lang.Object
- - akka.util.ByteString

- All Implemented Interfaces:
`scala.collection.immutable.IndexedSeq<java.lang.Object>`, `scala.collection.immutable.IndexedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​scala.collection.immutable.IndexedSeq<java.lang.Object>>`, `scala.collection.immutable.Iterable<java.lang.Object>`, `scala.collection.immutable.Seq<java.lang.Object>`, `scala.collection.immutable.SeqOps<java.lang.Object,​scala.collection.immutable.Seq,​scala.collection.immutable.Seq<java.lang.Object>>`, `scala.collection.immutable.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.IndexedSeq<java.lang.Object>`, `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`, `scala.collection.Iterable<java.lang.Object>`, `scala.collection.IterableFactoryDefaults<java.lang.Object,​scala.collection.Iterable>`, `scala.collection.IterableOnce<java.lang.Object>`, `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`, `scala.collection.Seq<java.lang.Object>`, `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`, `scala.collection.StrictOptimizedIterableOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`, `scala.Equals`, `scala.Function1<java.lang.Object,​java.lang.Object>`, `scala.PartialFunction<java.lang.Object,​java.lang.Object>`

Direct Known Subclasses:
`[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util")`, `[ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util")`, `[CompactByteString](CompactByteString.html "class in akka.util")`

---

```
public abstract class ByteString
extends java.lang.Object
implements scala.collection.immutable.IndexedSeq<java.lang.Object>, scala.collection.immutable.IndexedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>, scala.collection.immutable.StrictOptimizedSeqOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>
```

A rope\-like immutable data structure containing bytes.
 The goal of this structure is to reduce copying of arrays
 when concatenating and slicing sequences of bytes,
 and also providing a thread safe way of working with bytes.
 
 TODO: Add performance characteristics

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util")` | An unfragmented ByteString. |
	| `static class` | `[ByteString.ByteString1$](ByteString.ByteString1$.html "class in akka.util")` | INTERNAL API: ByteString backed by exactly one array, with start / end markers |
	| `static class` | `[ByteString.ByteString1C](ByteString.ByteString1C.html "class in akka.util")` | A compact (unsliced) and unfragmented ByteString, implementation of ByteString1C. |
	| `static class` | `[ByteString.ByteString1C$](ByteString.ByteString1C$.html "class in akka.util")` |  |
	| `static class` | `[ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util")` | A ByteString with 2 or more fragments. |
	| `static class` | `[ByteString.ByteStrings$](ByteString.ByteStrings$.html "class in akka.util")` |  |
	| `static interface` | `[ByteString.Companion](ByteString.Companion.html "interface in akka.util")` |  |
	| `static class` | `[ByteString.Companion$](ByteString.Companion$.html "class in akka.util")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.collection.IterableOps
		
		
		`scala.collection.IterableOps.SizeCompareOps, scala.collection.IterableOps.SizeCompareOps$, scala.collection.IterableOps.WithFilter<A extends java.lang.Object,​CC extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteString](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ByteString](ByteString.html "class in akka.util")` | `[$plus$plus](#$plus$plus(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") that)` | Efficiently concatenate another ByteString. |
	| `abstract byte` | `[apply](#apply(int))​(int idx)` |  |
	| `abstract java.nio.ByteBuffer` | `[asByteBuffer](#asByteBuffer())()` | Returns a read\-only ByteBuffer that directly wraps this ByteString  if it is not fragmented. |
	| `abstract scala.collection.immutable.Iterable<java.nio.ByteBuffer>` | `[asByteBuffers](#asByteBuffers())()` | Scala API: Returns an immutable Iterable of read\-only ByteBuffers that directly wraps this ByteStrings  all fragments. |
	| `java.lang.String` | `[className](#className())()` |  |
	| `abstract [CompactByteString](CompactByteString.html "class in akka.util")` | `[compact](#compact())()` | Create a new ByteString with all contents compacted into a single,  full byte array. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[concat](#concat(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") that)` | Java API: efficiently concatenate another ByteString. |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object,int))​(java.lang.Object xs,  int start)` |  |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object,int,int))​(java.lang.Object xs,  int start,  int len)` |  |
	| `abstract int` | `[copyToBuffer](#copyToBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer buffer)` | Copy as many bytes as possible to a ByteBuffer, starting from it's  current position. |
	| `static [ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[createBuilder](#createBuilder())()` | Java API |
	| `abstract [ByteString](ByteString.html "class in akka.util")` | `[decodeBase64](#decodeBase64())()` |  |
	| `abstract java.lang.String` | `[decodeString](#decodeString(java.lang.String))​(java.lang.String charset)` | Decodes this ByteString using a charset to produce a String. |
	| `abstract java.lang.String` | `[decodeString](#decodeString(java.nio.charset.Charset))​(java.nio.charset.Charset charset)` | Decodes this ByteString using a charset to produce a String. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[drop](#drop(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[dropRight](#dropRight(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[dropWhile](#dropWhile(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[empty](#empty())()` |  |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[emptyByteString](#emptyByteString())()` | Java API |
	| `abstract [ByteString](ByteString.html "class in akka.util")` | `[encodeBase64](#encodeBase64())()` | Returns a ByteString which is the Base64 representation of this ByteString |
	| `<U> void` | `[foreach](#foreach(scala.Function1))​(scala.Function1<java.lang.Object,​U> f)` |  |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromArray](#fromArray(byte%5B%5D))​(byte[] array)` | Creates a new ByteString by copying a byte array. |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromArray](#fromArray(byte%5B%5D,int,int))​(byte[] array,  int offset,  int length)` | Creates a new ByteString by copying length bytes starting at offset from  an Array. |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromArrayUnsafe](#fromArrayUnsafe(byte%5B%5D))​(byte[] array)` | Unsafe API: Use only in situations you are completely confident that this is what  you need, and that you understand the implications documented below. |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromArrayUnsafe](#fromArrayUnsafe(byte%5B%5D,int,int))​(byte[] array,  int offset,  int length)` | Unsafe API: Use only in situations you are completely confident that this is what  you need, and that you understand the implications documented below. |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromByteBuffer](#fromByteBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer buffer)` | Creates a new ByteString by copying bytes out of a ByteBuffer. |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromInts](#fromInts(int...))​(int... array)` | JAVA API  Creates a new ByteString by copying an int array by converting from integral numbers to bytes. |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromInts](#fromInts(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> array)` | JAVA API  Creates a new ByteString by copying an int array by converting from integral numbers to bytes. |
	| `protected [ByteString](ByteString.html "class in akka.util")` | `[fromSpecific](#fromSpecific(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> coll)` |  |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromString](#fromString(java.lang.String))​(java.lang.String string)` | Creates a new ByteString which will contain the UTF\-8 representation of the given String |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromString](#fromString(java.lang.String,java.lang.String))​(java.lang.String string,  java.lang.String charset)` | Creates a new ByteString which will contain the representation of the given String in the given charset |
	| `static [ByteString](ByteString.html "class in akka.util")` | `[fromString](#fromString(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` | Creates a new ByteString which will contain the representation of the given String in the given charset |
	| `java.lang.Iterable<java.nio.ByteBuffer>` | `[getByteBuffers](#getByteBuffers())()` | Java API: Returns an Iterable of read\-only ByteBuffers that directly wraps this ByteStrings  all fragments. |
	| `scala.collection.Iterator<[ByteString](ByteString.html "class in akka.util")>` | `[grouped](#grouped(int))​(int size)` |  |
	| `byte` | `[head](#head())()` |  |
	| `<B> int` | `[indexOf](#indexOf(B,int))​(B elem,  int from)` |  |
	| `int` | `[indexWhere](#indexWhere(scala.Function1,int))​(scala.Function1<java.lang.Object,​java.lang.Object> p,  int from)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[init](#init())()` |  |
	| `abstract boolean` | `[isCompact](#isCompact())()` | Check whether this ByteString is compact in memory. |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `[ByteIterator](ByteIterator.html "class in akka.util")` | `[iterator](#iterator())()` |  |
	| `byte` | `[last](#last())()` |  |
	| `<A> [ByteString](ByteString.html "class in akka.util")` | `[map](#map(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> f)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[mapI](#mapI(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> f)` | map method that will automatically cast Int back into Byte. |
	| `static [ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[newBuilder](#newBuilder())()` |  |
	| `protected scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")>` | `[newSpecificBuilder](#newSpecificBuilder())()` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[slice](#slice(int,int))​(int from,  int until)` |  |
	| `scala.Tuple2<[ByteString](ByteString.html "class in akka.util"),​[ByteString](ByteString.html "class in akka.util")>` | `[span](#span(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `scala.Tuple2<[ByteString](ByteString.html "class in akka.util"),​[ByteString](ByteString.html "class in akka.util")>` | `[splitAt](#splitAt(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[tail](#tail())()` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[take](#take(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[takeRight](#takeRight(int))​(int n)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[takeWhile](#takeWhile(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `protected byte[]` | `[toArray](#toArray())()` | Java API: copy this ByteString into a fresh byte array |
	| `<B> java.lang.Object` | `[toArray](#toArray(scala.reflect.ClassTag))​(scala.reflect.ClassTag<B> arg0)` |  |
	| `byte[]` | `[toArrayUnsafe](#toArrayUnsafe())()` | Unsafe API: Use only in situations you are completely confident that this is what  you need, and that you understand the implications documented below. |
	| `java.nio.ByteBuffer` | `[toByteBuffer](#toByteBuffer())()` | Creates a new ByteBuffer with a copy of all bytes contained in this  ByteString. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static java.lang.String` | `[UTF_8](#UTF_8())()` | Standard "UTF\-8" charset |
	| `java.lang.String` | `[utf8String](#utf8String())()` | Decodes this ByteString as a UTF\-8 encoded String. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from interface scala.collection.immutable.IndexedSeq
		
		
		`applyPreferredMaxLength, canEqual, iterableFactory, sameElements, toIndexedSeq`
		- ### Methods inherited from interface scala.collection.IndexedSeq
		
		
		`stringPrefix`
		- ### Methods inherited from interface scala.collection.IndexedSeqOps
		
		
		`foldRight, headOption, knownSize, lengthCompare, lengthCompare, map, prepended, reverse, reversed, reverseIterator, search, search, stepper, view, view`
		- ### Methods inherited from interface scala.collection.Iterable
		
		
		`coll, collectionClassName, lazyZip, seq, toIterable`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToArray, copyToBuffer, corresponds, count, exists, find, fold, foldLeft, forall, hasDefiniteSize, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, sum, to, toBuffer, toIterator, toList, toMap, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.IterableOps
		
		
		`$plus$plus, companion, groupBy, groupMap, groupMapReduce, inits, isTraversableAgain, lastOption, repr, scan, scanRight, sizeIs, sliding, sliding, tails, toTraversable, transpose, withFilter, zipAll`
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
	
	
	
		- #### ByteString
		
		
		
		```
		public ByteString()
		```

	- ### Method Detail
	
	
	
		- #### fromInts
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromInts​(int... array)
		```
		
		JAVA API
		 Creates a new ByteString by copying an int array by converting from integral numbers to bytes.
		- #### fromArray
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromArray​(byte[] array)
		```
		
		Creates a new ByteString by copying a byte array.
		- #### fromArrayUnsafe
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromArrayUnsafe​(byte[] array)
		```
		
		Unsafe API: Use only in situations you are completely confident that this is what
		 you need, and that you understand the implications documented below.
		 
		 Creates a ByteString without copying the passed in byte array, unlike other factory
		 methods defined on ByteString. This method of creating a ByteString saves one array
		 copy and allocation and therefore can lead to better performance, however it also means
		 that one MUST NOT modify the passed in array, or unexpected immutable data structure
		 contract\-breaking behavior will manifest itself.
		 
		
		
		 This API is intended for users who have obtained an byte array from some other API, and
		 want wrap it into an ByteArray, and from there on only use that reference (the ByteString)
		 to operate on the wrapped data. For all other intents and purposes, please use the usual
		 apply and create methods \- which provide the immutability guarantees by copying the array.
		- #### fromArray
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromArray​(byte[] array,
		                                   int offset,
		                                   int length)
		```
		
		Creates a new ByteString by copying length bytes starting at offset from
		 an Array.
		- #### fromArrayUnsafe
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromArrayUnsafe​(byte[] array,
		                                         int offset,
		                                         int length)
		```
		
		Unsafe API: Use only in situations you are completely confident that this is what
		 you need, and that you understand the implications documented below.
		 
		 Creates a ByteString without copying the passed in byte array, unlike other factory
		 methods defined on ByteString. This method of creating a ByteString saves one array
		 copy and allocation and therefore can lead to better performance, however it also means
		 that one MUST NOT modify the passed in array, or unexpected immutable data structure
		 contract\-breaking behavior will manifest itself.
		 
		
		
		 This API is intended for users who have obtained an byte array from some other API, and
		 want wrap it into an ByteArray, and from there on only use that reference (the ByteString)
		 to operate on the wrapped data. For all other intents and purposes, please use the usual
		 apply and create methods \- which provide the immutability guarantees by copying the array.
		- #### fromInts
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromInts​(scala.collection.immutable.Seq<java.lang.Object> array)
		```
		
		JAVA API
		 Creates a new ByteString by copying an int array by converting from integral numbers to bytes.
		- #### fromString
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromString​(java.lang.String string)
		```
		
		Creates a new ByteString which will contain the UTF\-8 representation of the given String
		- #### fromString
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromString​(java.lang.String string,
		                                    java.lang.String charset)
		```
		
		Creates a new ByteString which will contain the representation of the given String in the given charset
		- #### fromString
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromString​(java.lang.String string,
		                                    java.nio.charset.Charset charset)
		```
		
		Creates a new ByteString which will contain the representation of the given String in the given charset
		- #### UTF\_8
		
		
		
		```
		public static java.lang.String UTF_8()
		```
		
		Standard "UTF\-8" charset
		- #### fromByteBuffer
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") fromByteBuffer​(java.nio.ByteBuffer buffer)
		```
		
		Creates a new ByteString by copying bytes out of a ByteBuffer.
		- #### emptyByteString
		
		
		
		```
		public static [ByteString](ByteString.html "class in akka.util") emptyByteString()
		```
		
		Java API
		- #### newBuilder
		
		
		
		```
		public static [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") newBuilder()
		```
		- #### createBuilder
		
		
		
		```
		public static [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") createBuilder()
		```
		
		Java API
		- #### fromSpecific
		
		
		
		```
		protected [ByteString](ByteString.html "class in akka.util") fromSpecific​(scala.collection.IterableOnce<java.lang.Object> coll)
		```
		
		
		Specified by:
		`fromSpecific` in interface `scala.collection.IterableFactoryDefaults<java.lang.Object,​scala.collection.Iterable>`
		Specified by:
		`fromSpecific` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### newSpecificBuilder
		
		
		
		```
		protected scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")> newSpecificBuilder()
		```
		
		
		Specified by:
		`newSpecificBuilder` in interface `scala.collection.IterableFactoryDefaults<java.lang.Object,​scala.collection.Iterable>`
		Specified by:
		`newSpecificBuilder` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### empty
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") empty()
		```
		
		
		Specified by:
		`empty` in interface `scala.collection.IterableFactoryDefaults<java.lang.Object,​scala.collection.Iterable>`
		Specified by:
		`empty` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### apply
		
		
		
		```
		public abstract byte apply​(int idx)
		```
		
		
		Specified by:
		`apply` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		- #### className
		
		
		
		```
		public final java.lang.String className()
		```
		
		
		Specified by:
		`className` in interface `scala.collection.Iterable<java.lang.Object>`
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		
		Specified by:
		`isEmpty` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`isEmpty` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		- #### iterator
		
		
		
		```
		public [ByteIterator](ByteIterator.html "class in akka.util") iterator()
		```
		
		
		Specified by:
		`iterator` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`iterator` in interface `scala.collection.IterableOnce<java.lang.Object>`
		- #### head
		
		
		
		```
		public byte head()
		```
		
		
		Specified by:
		`head` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`head` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### tail
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") tail()
		```
		
		
		Specified by:
		`tail` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### last
		
		
		
		```
		public byte last()
		```
		
		
		Specified by:
		`last` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`last` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### init
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") init()
		```
		
		
		Specified by:
		`init` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
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
		- #### takeRight
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") takeRight​(int n)
		```
		
		
		Specified by:
		`takeRight` in interface `scala.collection.IndexedSeqOps<java.lang.Object,​scala.collection.IndexedSeq,​scala.collection.IndexedSeq<java.lang.Object>>`
		Specified by:
		`takeRight` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`takeRight` in interface `scala.collection.StrictOptimizedIterableOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`
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
		- #### takeWhile
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") takeWhile​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`takeWhile` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`takeWhile` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### dropWhile
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") dropWhile​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`dropWhile` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`dropWhile` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### span
		
		
		
		```
		public scala.Tuple2<[ByteString](ByteString.html "class in akka.util"),​[ByteString](ByteString.html "class in akka.util")> span​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`span` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`span` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`span` in interface `scala.collection.StrictOptimizedIterableOps<java.lang.Object,​scala.collection.immutable.IndexedSeq,​[ByteString](ByteString.html "class in akka.util")>`
		- #### splitAt
		
		
		
		```
		public scala.Tuple2<[ByteString](ByteString.html "class in akka.util"),​[ByteString](ByteString.html "class in akka.util")> splitAt​(int n)
		```
		
		
		Specified by:
		`splitAt` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		Specified by:
		`splitAt` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### indexWhere
		
		
		
		```
		public int indexWhere​(scala.Function1<java.lang.Object,​java.lang.Object> p,
		                      int from)
		```
		
		
		Specified by:
		`indexWhere` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		- #### indexOf
		
		
		
		```
		public <B> int indexOf​(B elem,
		                       int from)
		```
		
		
		Specified by:
		`indexOf` in interface `scala.collection.SeqOps<java.lang.Object,​scala.collection.Seq,​scala.collection.Seq<java.lang.Object>>`
		- #### grouped
		
		
		
		```
		public scala.collection.Iterator<[ByteString](ByteString.html "class in akka.util")> grouped​(int size)
		```
		
		
		Specified by:
		`grouped` in interface `scala.collection.IterableOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​java.lang.Object>`
		Specified by:
		`toString` in interface `scala.collection.Iterable<java.lang.Object>`
		Specified by:
		`toString` in interface `scala.collection.Seq<java.lang.Object>`
		Overrides:
		`toString` in class `java.lang.Object`
		- #### toArray
		
		
		
		```
		protected byte[] toArray()
		```
		
		Java API: copy this ByteString into a fresh byte array
		 
		
		Returns:
		this ByteString copied into a byte array
		- #### toArray
		
		
		
		```
		public final <B> java.lang.Object toArray​(scala.reflect.ClassTag<B> arg0)
		```
		
		
		Specified by:
		`toArray` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### copyToArray
		
		
		
		```
		public final <B> int copyToArray​(java.lang.Object xs,
		                                 int start)
		```
		
		
		Specified by:
		`copyToArray` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### copyToArray
		
		
		
		```
		public <B> int copyToArray​(java.lang.Object xs,
		                           int start,
		                           int len)
		```
		
		
		Specified by:
		`copyToArray` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### toArrayUnsafe
		
		
		
		```
		public byte[] toArrayUnsafe()
		```
		
		Unsafe API: Use only in situations you are completely confident that this is what
		 you need, and that you understand the implications documented below.
		 
		 If the ByteString is backed by a single array it is returned without any copy. If it is backed by a rope
		 of multiple ByteString instances a new array will be allocated and the contents will be copied
		 into it before returning it.
		 
		
		
		 This method of exposing the bytes of a ByteString can save one array
		 copy and allocation in the happy path scenario which can lead to better performance,
		 however it also means that one MUST NOT modify the returned array, or unexpected
		 immutable data structure contract\-breaking behavior will manifest itself.
		 
		
		
		 This API is intended for users who need to pass the byte array to some other API, which will
		 only read the bytes and never mutate then. For all other intents and purposes, please use the usual
		 toArray method \- which provide the immutability guarantees by copying the backing array.
		- #### foreach
		
		
		
		```
		public <U> void foreach​(scala.Function1<java.lang.Object,​U> f)
		```
		
		
		Specified by:
		`foreach` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterable,​scala.collection.Iterable>`
		- #### $plus$plus
		
		
		
		```
		public abstract [ByteString](ByteString.html "class in akka.util") $plus$plus​([ByteString](ByteString.html "class in akka.util") that)
		```
		
		Efficiently concatenate another ByteString.
		- #### concat
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") concat​([ByteString](ByteString.html "class in akka.util") that)
		```
		
		Java API: efficiently concatenate another ByteString.
		- #### copyToBuffer
		
		
		
		```
		public abstract int copyToBuffer​(java.nio.ByteBuffer buffer)
		```
		
		Copy as many bytes as possible to a ByteBuffer, starting from it's
		 current position. This method will not overflow the buffer.
		 
		
		Parameters:
		`buffer` \- a ByteBuffer to copy bytes to
		Returns:
		the number of bytes actually copied
		- #### compact
		
		
		
		```
		public abstract [CompactByteString](CompactByteString.html "class in akka.util") compact()
		```
		
		Create a new ByteString with all contents compacted into a single,
		 full byte array.
		 If isCompact returns true, compact is an O(1\) operation, but
		 might return a different object with an optimized implementation.
		- #### isCompact
		
		
		
		```
		public abstract boolean isCompact()
		```
		
		Check whether this ByteString is compact in memory.
		 If the ByteString is compact, it might, however, not be represented
		 by an object that takes full advantage of that fact. Use compact to
		 get such an object.
		- #### asByteBuffer
		
		
		
		```
		public abstract java.nio.ByteBuffer asByteBuffer()
		```
		
		Returns a read\-only ByteBuffer that directly wraps this ByteString
		 if it is not fragmented.
		- #### asByteBuffers
		
		
		
		```
		public abstract scala.collection.immutable.Iterable<java.nio.ByteBuffer> asByteBuffers()
		```
		
		Scala API: Returns an immutable Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
		 all fragments. Will always have at least one entry.
		- #### getByteBuffers
		
		
		
		```
		public java.lang.Iterable<java.nio.ByteBuffer> getByteBuffers()
		```
		
		Java API: Returns an Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
		 all fragments. Will always have at least one entry.
		- #### toByteBuffer
		
		
		
		```
		public java.nio.ByteBuffer toByteBuffer()
		```
		
		Creates a new ByteBuffer with a copy of all bytes contained in this
		 ByteString.
		- #### utf8String
		
		
		
		```
		public final java.lang.String utf8String()
		```
		
		Decodes this ByteString as a UTF\-8 encoded String.
		- #### decodeString
		
		
		
		```
		public abstract java.lang.String decodeString​(java.lang.String charset)
		```
		
		Decodes this ByteString using a charset to produce a String.
		 If you have a `Charset` instance available, use `decodeString(charset: java.nio.charset.Charset` instead.
		- #### decodeString
		
		
		
		```
		public abstract java.lang.String decodeString​(java.nio.charset.Charset charset)
		```
		
		Decodes this ByteString using a charset to produce a String.
		 Avoids Charset.forName lookup in String internals, thus is preferable to `decodeString(charset: String)`.
		- #### decodeBase64
		
		
		
		```
		public abstract [ByteString](ByteString.html "class in akka.util") decodeBase64()
		```
		- #### encodeBase64
		
		
		
		```
		public abstract [ByteString](ByteString.html "class in akka.util") encodeBase64()
		```
		
		Returns a ByteString which is the Base64 representation of this ByteString
		- #### mapI
		
		
		
		```
		public final [ByteString](ByteString.html "class in akka.util") mapI​(scala.Function1<java.lang.Object,​java.lang.Object> f)
		```
		
		map method that will automatically cast Int back into Byte.
		- #### map
		
		
		
		```
		public <A> [ByteString](ByteString.html "class in akka.util") map​(scala.Function1<java.lang.Object,​java.lang.Object> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.ByteString1$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.ByteString1.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.ByteString1C$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.ByteString1C.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.ByteStrings$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.ByteStrings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.Companion$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.Companion.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteStringBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/CompactByteString.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.html](https://doc.akka.io/japi/akka-core/2.6/akka/util/ByteString.html)*