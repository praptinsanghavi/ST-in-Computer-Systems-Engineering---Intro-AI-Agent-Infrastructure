---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.ByteArrayIterator.html
title: ByteIterator.ByteArrayIterator
---

# ByteIterator.ByteArrayIterator

## Content

Package [akka.util](package-summary.html)
## Class ByteIterator.ByteArrayIterator

- java.lang.Object
- - [akka.util.ByteIterator](ByteIterator.html "class in akka.util")
	- - akka.util.ByteIterator.ByteArrayIterator

- All Implemented Interfaces:
`scala.collection.BufferedIterator<java.lang.Object>`, `scala.collection.IterableOnce<java.lang.Object>`, `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`, `scala.collection.Iterator<java.lang.Object>`

Enclosing class:
[ByteIterator](ByteIterator.html "class in akka.util")

---

```
public static class ByteIterator.ByteArrayIterator
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
	| `[ByteArrayIterator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteIterator](ByteIterator.html "class in akka.util")` | `[$plus$plus](#$plus$plus(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> that)` |  |
	| `byte[]` | `[array](#array())()` |  |
	| `java.io.InputStream` | `[asInputStream](#asInputStream())()` | Directly wraps this ByteIterator in an InputStream without copying. |
	| `void` | `[clear](#clear())()` |  |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[clone](#clone())()` |  |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object))​(java.lang.Object xs)` |  |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object,int))​(java.lang.Object xs,  int start)` |  |
	| `<B> int` | `[copyToArray](#copyToArray(java.lang.Object,int,int))​(java.lang.Object xs,  int start,  int len)` |  |
	| `int` | `[copyToBuffer](#copyToBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer buffer)` | For performance sensitive code, call take() directly on ByteString (it's optimised there) |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[drop](#drop(int))​(int n)` |  |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[dropWhile](#dropWhile(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `int` | `[from](#from())()` |  |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[getBytes](#getBytes(byte%5B%5D,int,int))​(byte[] xs,  int offset,  int n)` | Get a specific number of Bytes from this iterator. |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[getDoubles](#getDoubles(double%5B%5D,int,int,java.nio.ByteOrder))​(double[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Doubles from this iterator. |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[getFloats](#getFloats(float%5B%5D,int,int,java.nio.ByteOrder))​(float[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Floats from this iterator. |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[getInts](#getInts(int%5B%5D,int,int,java.nio.ByteOrder))​(int[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Ints from this iterator. |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[getLongs](#getLongs(long%5B%5D,int,int,java.nio.ByteOrder))​(long[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Longs from this iterator. |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[getShorts](#getShorts(short%5B%5D,int,int,java.nio.ByteOrder))​(short[] xs,  int offset,  int n,  java.nio.ByteOrder byteOrder)` | Get a number of Shorts from this iterator. |
	| `boolean` | `[hasNext](#hasNext())()` |  |
	| `byte` | `[head](#head())()` |  |
	| `int` | `[len](#len())()` |  |
	| `byte` | `[next](#next())()` |  |
	| `int` | `[size](#size())()` |  |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[take](#take(int))​(int n)` |  |
	| `[ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util")` | `[takeWhile](#takeWhile(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> p)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[toByteString](#toByteString())()` |  |
	| `int` | `[until](#until())()` |  |
	
	
		- ### Methods inherited from class akka.util.[ByteIterator](ByteIterator.html "class in akka.util")
		
		
		`[duplicate](ByteIterator.html#duplicate()), [foldLeft](ByteIterator.html#foldLeft(B,scala.Function2)), [foreach](ByteIterator.html#foreach(scala.Function1)), [getByte](ByteIterator.html#getByte()), [getBytes](ByteIterator.html#getBytes(byte%5B%5D)), [getBytes](ByteIterator.html#getBytes(int)), [getByteString](ByteIterator.html#getByteString(int)), [getDouble](ByteIterator.html#getDouble(java.nio.ByteOrder)), [getDoubles](ByteIterator.html#getDoubles(double%5B%5D,java.nio.ByteOrder)), [getFloat](ByteIterator.html#getFloat(java.nio.ByteOrder)), [getFloats](ByteIterator.html#getFloats(float%5B%5D,java.nio.ByteOrder)), [getInt](ByteIterator.html#getInt(java.nio.ByteOrder)), [getInts](ByteIterator.html#getInts(int%5B%5D,java.nio.ByteOrder)), [getLong](ByteIterator.html#getLong(java.nio.ByteOrder)), [getLongPart](ByteIterator.html#getLongPart(int,java.nio.ByteOrder)), [getLongs](ByteIterator.html#getLongs(long%5B%5D,java.nio.ByteOrder)), [getShort](ByteIterator.html#getShort(java.nio.ByteOrder)), [getShorts](ByteIterator.html#getShorts(short%5B%5D,java.nio.ByteOrder)), [indexOf](ByteIterator.html#indexOf(byte)), [indexOf](ByteIterator.html#indexOf(byte,int)), [indexOf](ByteIterator.html#indexOf(B)), [indexOf](ByteIterator.html#indexOf(B,int)), [indexWhere](ByteIterator.html#indexWhere(scala.Function1,int)), [indexWhere$default$2](ByteIterator.html#indexWhere$default$2()), [slice](ByteIterator.html#slice(int,int)), [span](ByteIterator.html#span(scala.Function1)), [toArray](ByteIterator.html#toArray(scala.reflect.ClassTag)), [toSeq](ByteIterator.html#toSeq())`
		- ### Methods inherited from class java.lang.Object
		
		
		`equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.collection.BufferedIterator
		
		
		`buffered, headOption`
		- ### Methods inherited from interface scala.collection.IterableOnce
		
		
		`knownSize, stepper`
		- ### Methods inherited from interface scala.collection.IterableOnceOps
		
		
		`$colon$bslash, $div$colon, addString, addString, addString, aggregate, collectFirst, copyToBuffer, corresponds, count, exists, find, fold, foldRight, forall, isTraversableAgain, max, maxBy, maxByOption, maxOption, min, minBy, minByOption, minOption, mkString, mkString, mkString, nonEmpty, product, reduce, reduceLeft, reduceLeftOption, reduceOption, reduceRight, reduceRightOption, reversed, splitAt, sum, to, toBuffer, toIndexedSeq, toIterator, toList, toMap, toSet, toStream, toVector`
		- ### Methods inherited from interface scala.collection.Iterator
		
		
		`$plus$plus, collect, concat, contains, distinct, distinctBy, filter, filterImpl, filterNot, flatMap, flatten, grouped, hasDefiniteSize, isEmpty, iterator, length, map, nextOption, padTo, partition, patch, sameElements, scanLeft, scanRight, seq, sliceIterator, sliding, sliding$default$2, tapEach, toString, withFilter, zip, zipAll, zipWithIndex`

- - ### Constructor Detail
	
	
	
		- #### ByteArrayIterator
		
		
		
		```
		public ByteArrayIterator()
		```

	- ### Method Detail
	
	
	
		- #### array
		
		
		
		```
		public byte[] array()
		```
		- #### from
		
		
		
		```
		public int from()
		```
		- #### until
		
		
		
		```
		public int until()
		```
		- #### len
		
		
		
		```
		public final int len()
		```
		
		
		Specified by:
		`[len](ByteIterator.html#len())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
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
		- #### clear
		
		
		
		```
		public void clear()
		```
		
		
		Specified by:
		`[clear](ByteIterator.html#clear())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
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
		public final [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") clone()
		```
		
		
		Overrides:
		`[clone](ByteIterator.html#clone())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### take
		
		
		
		```
		public final [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") take​(int n)
		```
		
		
		Specified by:
		`take` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`take` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[take](ByteIterator.html#take(int))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### drop
		
		
		
		```
		public final [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") drop​(int n)
		```
		
		
		Specified by:
		`drop` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`drop` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[drop](ByteIterator.html#drop(int))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### takeWhile
		
		
		
		```
		public final [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") takeWhile​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`takeWhile` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`takeWhile` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[takeWhile](ByteIterator.html#takeWhile(scala.Function1))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### dropWhile
		
		
		
		```
		public final [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") dropWhile​(scala.Function1<java.lang.Object,​java.lang.Object> p)
		```
		
		
		Specified by:
		`dropWhile` in interface `scala.collection.IterableOnceOps<java.lang.Object,​scala.collection.Iterator,​scala.collection.Iterator<java.lang.Object>>`
		Specified by:
		`dropWhile` in interface `scala.collection.Iterator<java.lang.Object>`
		Overrides:
		`[dropWhile](ByteIterator.html#dropWhile(scala.Function1))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### copyToArray
		
		
		
		```
		public <B> int copyToArray​(java.lang.Object xs,
		                           int start)
		```
		- #### copyToArray
		
		
		
		```
		public <B> int copyToArray​(java.lang.Object xs)
		```
		- #### copyToArray
		
		
		
		```
		public final <B> int copyToArray​(java.lang.Object xs,
		                                 int start,
		                                 int len)
		```
		- #### toByteString
		
		
		
		```
		public final [ByteString](ByteString.html "class in akka.util") toByteString()
		```
		
		
		Specified by:
		`[toByteString](ByteIterator.html#toByteString())` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		- #### getBytes
		
		
		
		```
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") getBytes​(byte[] xs,
		                                               int offset,
		                                               int n)
		                                        throws java.util.NoSuchElementException
		```
		
		Description copied from class: `[ByteIterator](ByteIterator.html#getBytes(byte%5B%5D,int,int))`
		Get a specific number of Bytes from this iterator. In contrast to
		 copyToArray, this method will fail if length \< n or if (xs.length \- offset) \< n.
		
		Specified by:
		`[getBytes](ByteIterator.html#getBytes(byte%5B%5D,int,int))` in class `[ByteIterator](ByteIterator.html "class in akka.util")`
		Throws:
		`java.util.NoSuchElementException`
		- #### getShorts
		
		
		
		```
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") getShorts​(short[] xs,
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
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") getInts​(int[] xs,
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
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") getLongs​(long[] xs,
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
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") getFloats​(float[] xs,
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
		public [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") getDoubles​(double[] xs,
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
		
		Description copied from class: `[ByteIterator](ByteIterator.html#copyToBuffer(java.nio.ByteBuffer))`
		For performance sensitive code, call take() directly on ByteString (it's optimised there)
		
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

- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.ByteArrayIterator$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.ByteArrayIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.MultiByteArrayIterator$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.MultiByteArrayIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.ByteArrayIterator.html](https://doc.akka.io/japi/akka/current/akka/util/ByteIterator.ByteArrayIterator.html)*