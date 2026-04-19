---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator.html
title: ByteIterator.MultiByteArrayIterator
---

# ByteIterator.MultiByteArrayIterator

## Content

Package [akka.util](package-summary.html)
## Class ByteIterator.MultiByteArrayIterator

- java.lang.Object
- - [akka.util.ByteIterator](ByteIterator.html "class in akka.util")
	- - akka.util.ByteIterator.MultiByteArrayIterator

- All Implemented Interfaces:
`scala.collection.BufferedIterator<java.lang.Object>`, `scala.collection.IterableOnce<java.lang.Object>`, `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`, `scala.collection.Iterator<java.lang.Object>`

Enclosing class:
[ByteIterator](ByteIterator.html "class in akka.util")

---

```
public static class ByteIterator.MultiByteArrayIterator
extends [ByteIterator](ByteIterator.html "class in akka.util")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.util.[ByteIterator](ByteIterator.html "class in akka.util")
		
		
		`[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util"), [ByteIterator.ByteArrayIterator$](ByteIterator.ByteArrayIterator$.html "class in akka.util"), [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util"), [ByteIterator.MultiByteArrayIterator$](ByteIterator.MultiByteArrayIterator$.html "class in akka.util")`
		- ### Nested classes/interfaces inherited from interface scala.collection.Iterator
		
		
		`scala.collection.Iterator.GroupedIterator<B extends java.lang.Object>, scala.collection.Iterator.SliceIterator<A extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MultiByteArrayIterator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteIterator](ByteIterator.html "class in akka.util")` | `[$plus$plus](#$plus$plus(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> that)` |  |
	| `java.io.InputStream` | `[asInputStream](#asInputStream())()` | Directly wraps this ByteIterator in an InputStream without copying. |
	| `void` | `[clear](#clear())()` |  |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[clone](#clone())()` |  |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object,int,int))​(java.lang.Object xs,  int start,  int len)` |  |
	| `int` | `[copyToBuffer](#copyToBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer buffer)` | For performance sensitive code, call copyToBuffer() directly on ByteString (it's optimised there) |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[current](#current())()` |  |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[drop](#drop(int))​(int n)` | For performance sensitive code, call drop() directly on ByteString (it's optimised there) |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[dropWhile](#dropWhile(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `<U> void` | `[foreach](#foreach(scala.Function1))​(scala.Function1<java.lang.Object,​U> f)` |  |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getBytes](#getBytes(byte%5B%5D,int,int))​(byte[] xs,  int offset,  int n)` | Get a specific number of Bytes from this iterator. |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getDoubles](#getDoubles(double%5B%5D,int,int,java.nio.ByteOrder))​(double[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Doubles from this iterator. |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getFloats](#getFloats(float%5B%5D,int,int,java.nio.ByteOrder))​(float[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Floats from this iterator. |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getInts](#getInts(int%5B%5D,int,int,java.nio.ByteOrder))​(int[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Ints from this iterator. |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getLongs](#getLongs(long%5B%5D,int,int,java.nio.ByteOrder))​(long[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Longs from this iterator. |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getShorts](#getShorts(short%5B%5D,int,int,java.nio.ByteOrder))​(short[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Shorts from this iterator. |
	| `protected <A> [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[getToArray](#getToArray(java.lang.Object,int,int,int,scala.Function0,scala.Function3))​(java.lang.Object xs,  int offset,  int n,  int elemSize,  scala.Function0<A> getSingle,  scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.runtime.BoxedUnit> getMult)` |  |
	| `boolean` | `[hasNext](#hasNext())()` |  |
	| `byte` | `[head](#head())()` |  |
	| `scala.collection.LinearSeq<[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")>` | `[iterators](#iterators())()` |  |
	| `void` | `[iterators_$eq](#iterators_$eq(scala.collection.LinearSeq))​(scala.collection.LinearSeq<[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")> x$1)` |  |
	| `int` | `[len](#len())()` |  |
	| `byte` | `[next](#next())()` |  |
	| `int` | `[size](#size())()` |  |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[take](#take(int))​(int n)` | For performance sensitive code, call take() directly on ByteString (it's optimised there) |
	| `[ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util")` | `[takeWhile](#takeWhile(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[toByteString](#toByteString())()` |  |
	
	
		- ### Methods inherited from class akka.util.[ByteIterator](ByteIterator.html "class in akka.util")
		
		
		`[duplicate](ByteIterator.html#duplicate()), [foldLeft](ByteIterator.html#foldLeft(B,scala.Function2)), [getByte](ByteIterator.html#getByte()), [getBytes](ByteIterator.html#getBytes(byte%5B%5D)), [getBytes](ByteIterator.html#getBytes(int)), [getByteString](ByteIterator.html#getByteString(int)), [getDouble](ByteIterator.html#getDouble(java.nio.ByteOrder)), [getDoubles](ByteIterator.html#getDoubles(double%5B%5D,java.nio.ByteOrder)), [getFloat](ByteIterator.html#getFloat(java.nio.ByteOrder)), [getFloats](ByteIterator.html#getFloats(float%5B%5D,java.nio.ByteOrder)), [getInt](ByteIterator.html#getInt(java.nio.ByteOrder)), [getInts](ByteIterator.html#getInts(int%5B%5D,java.nio.ByteOrder)), [getLong](ByteIterator.html#getLong(java.nio.ByteOrder)), [getLongPart](ByteIterator.html#getLongPart(int,java.nio.ByteOrder)), [getLongs](ByteIterator.html#getLongs(long%5B%5D,java.nio.ByteOrder)), [getShort](ByteIterator.html#getShort(java.nio.ByteOrder)), [getShorts](ByteIterator.html#getShorts(short%5B%5D,java.nio.ByteOrder)), [indexOf](ByteIterator.html#indexOf(byte)), [indexOf](ByteIterator.html#indexOf(byte,int)), [indexOf](ByteIterator.html#indexOf(B)), [indexOf](ByteIterator.html#indexOf(B,int)), [indexWhere](ByteIterator.html#indexWhere(scala.Function1,int)), [indexWhere$default$2](ByteIterator.html#indexWhere$default$2()), [slice](ByteIterator.html#slice(int,int)), [span](ByteIterator.html#span(scala.Function1)), [toArray](ByteIterator.html#toArray(scala.reflect.ClassTag)), [toSeq](ByteIterator.html#toSeq())`
		- ### Methods inherited from class java.lang.Object
		
		
		`equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.collection.BufferedIterator
		
		
		`buffered, headOption`
		- ### Methods inherited from interface scala.collection.IterableOnce
		
		
		`knownSize, stepper`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToArray, copyToArray, copyToBuffer, corresponds, count, exists, find, fold, foldRight, forall, isTraversableAgain, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, reversed, splitAt, sum, to, toBuffer, toIndexedSeq, toIterator, toList, toMap, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.Iterator
		
		
		`$plus$plus, collect, concat, contains, distinct, distinctBy, filter, filterImpl, filterNot, flatMap, flatten, grouped, hasDefiniteSize, isEmpty, iterator, length, map, nextOption, padTo, partition, patch, sameElements, scanLeft, scanRight, seq, sliceIterator, sliding, sliding$default$2, tapEach, toString, withFilter, zip, zipAll, zipWithIndex`

- - ### Constructor Detail
	
	
	
		- #### MultiByteArrayIterator
		
		
		
		```
		public MultiByteArrayIterator()
		```

	- ### Method Detail
	
	
	
		- #### iterators
		
		
		
		```
		public scala.collection.LinearSeq<[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")> iterators()
		```
		- #### iterators\_$eq
		
		
		
		```
		public void iterators_$eq​(scala.collection.LinearSeq<[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")> x$1)
		```
		- #### current
		
		
		
		```
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") current()
		```
		- #### clear
		
		
		
		```
		public void clear()
		```
		
		
		Specified by:
		`[clear](ByteIterator.html#clear())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### hasNext
		
		
		
		```
		public final boolean hasNext()
		```
		- #### head
		
		
		
		```
		public final byte head()
		```
		
		
		Specified by:
		`head` in interface `scala.collection.BufferedIterator<java.lang.Object>`
		Specified by:
		`[head](ByteIterator.html#head())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### next
		
		
		
		```
		public final byte next()
		```
		
		
		Specified by:
		`next` in interface `scala.collection.Iterator<java.lang.Object>`
		Specified by:
		`[next](ByteIterator.html#next())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### len
		
		
		
		```
		public final int len()
		```
		
		
		Specified by:
		`[len](ByteIterator.html#len())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### size
		
		
		
		```
		public final int size()
		```
		- #### $plus$plus
		
		
		
		```
		public final [ByteIterator](ByteIterator.html "class in akka.util") $plus$plus​(scala.collection.IterableOnce<java.lang.Object> that)
		```
		
		
		Overrides:
		`[$plus$plus](ByteIterator.html#$plus$plus(scala.collection.IterableOnce))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### clone
		
		
		
		```
		public final [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") clone()
		```
		
		
		Overrides:
		`[clone](ByteIterator.html#clone())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### take
		
		
		
		```
		public final [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") take​(int n)
		```
		
		For performance sensitive code, call take() directly on ByteString (it's optimised there)
		
		Specified by:
		`take` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`take` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[take](ByteIterator.html#take(int))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### drop
		
		
		
		```
		public final [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") drop​(int n)
		```
		
		For performance sensitive code, call drop() directly on ByteString (it's optimised there)
		
		Specified by:
		`drop` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`drop` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[drop](ByteIterator.html#drop(int))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### takeWhile
		
		
		
		```
		public final [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") takeWhile​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`takeWhile` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`takeWhile` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[takeWhile](ByteIterator.html#takeWhile(scala.Function1))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### dropWhile
		
		
		
		```
		public final [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") dropWhile​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`dropWhile` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`dropWhile` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[dropWhile](ByteIterator.html#dropWhile(scala.Function1))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### copyToArray
		
		
		
		```
		public final <B> int copyToArray​(java.lang.Object xs,
		                                 int start,
		                                 int len)
		```
		- #### foreach
		
		
		
		```
		public <U> void foreach​(scala.Function1<java.lang.Object,​U> f)
		```
		
		
		Specified by:
		`foreach` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Overrides:
		`[foreach](ByteIterator.html#foreach(scala.Function1))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### toByteString
		
		
		
		```
		public final [ByteString](ByteString.html "class in akka.util") toByteString()
		```
		
		
		Specified by:
		`[toByteString](ByteIterator.html#toByteString())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getToArray
		
		
		
		```
		protected final <A> [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getToArray​(java.lang.Object xs,
		                                                                   int offset,
		                                                                   int n,
		                                                                   int elemSize,
		                                                                   scala.Function0<A> getSingle,
		                                                                   scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.runtime.BoxedUnit> getMult)
		```
		- #### getBytes
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getBytes​(byte[] xs,
		                                                    int offset,
		                                                    int n)
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getBytes(byte%5B%5D,int,int))`
		Get a specific number of Bytes from this iterator. In contrast to
		 copyToArray, this method will fail if length \< n or if (xs.length \- offset) \< n.
		
		Specified by:
		`[getBytes](ByteIterator.html#getBytes(byte%5B%5D,int,int))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getShorts
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getShorts​(short[] xs,
		                                                     int offset,
		                                                     int n,
		                                                     java.nio.ByteOrder byteOrder)
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getShorts(short%5B%5D,int,int,java.nio.ByteOrder))`
		Get a number of Shorts from this iterator.
		
		Specified by:
		`[getShorts](ByteIterator.html#getShorts(short%5B%5D,int,int,java.nio.ByteOrder))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getInts
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getInts​(int[] xs,
		                                                   int offset,
		                                                   int n,
		                                                   java.nio.ByteOrder byteOrder)
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getInts(int%5B%5D,int,int,java.nio.ByteOrder))`
		Get a number of Ints from this iterator.
		
		Specified by:
		`[getInts](ByteIterator.html#getInts(int%5B%5D,int,int,java.nio.ByteOrder))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getLongs
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getLongs​(long[] xs,
		                                                    int offset,
		                                                    int n,
		                                                    java.nio.ByteOrder byteOrder)
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getLongs(long%5B%5D,int,int,java.nio.ByteOrder))`
		Get a number of Longs from this iterator.
		
		Specified by:
		`[getLongs](ByteIterator.html#getLongs(long%5B%5D,int,int,java.nio.ByteOrder))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getFloats
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getFloats​(float[] xs,
		                                                     int offset,
		                                                     int n,
		                                                     java.nio.ByteOrder byteOrder)
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getFloats(float%5B%5D,int,int,java.nio.ByteOrder))`
		Get a number of Floats from this iterator.
		
		Specified by:
		`[getFloats](ByteIterator.html#getFloats(float%5B%5D,int,int,java.nio.ByteOrder))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getDoubles
		
		
		
		```
		public [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") getDoubles​(double[] xs,
		                                                      int offset,
		                                                      int n,
		                                                      java.nio.ByteOrder byteOrder)
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getDoubles(double%5B%5D,int,int,java.nio.ByteOrder))`
		Get a number of Doubles from this iterator.
		
		Specified by:
		`[getDoubles](ByteIterator.html#getDoubles(double%5B%5D,int,int,java.nio.ByteOrder))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### copyToBuffer
		
		
		
		```
		public int copyToBuffer​(java.nio.ByteBuffer buffer)
		```
		
		For performance sensitive code, call copyToBuffer() directly on ByteString (it's optimised there)
		
		Specified by:
		`[copyToBuffer](ByteIterator.html#copyToBuffer(java.nio.ByteBuffer))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### asInputStream
		
		
		
		```
		public java.io.InputStream asInputStream()
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#asInputStream())`
		Directly wraps this ByteIterator in an InputStream without copying.
		 Read and skip operations on the stream will advance the iterator
		 accordingly.
		
		Specified by:
		`[asInputStream](ByteIterator.html#asInputStream())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.ByteArrayIterator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.ByteArrayIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator.html)*