---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteStringBuilder.html
title: ByteStringBuilder
---

# ByteStringBuilder

## Content

Package [akka.util](package-summary.html)
## Class ByteStringBuilder

- java.lang.Object
- - akka.util.ByteStringBuilder

- All Implemented Interfaces:
`scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")>`, `scala.collection.mutable.Clearable`, `scala.collection.mutable.Growable<java.lang.Object>`

---

```
public final class ByteStringBuilder
extends java.lang.Object
implements scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")>
```

A mutable builder for efficiently creating a [`ByteString`](ByteString.html "class in akka.util").
 
 The created ByteString is not automatically compacted.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteStringBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[_tempCapacity](#_tempCapacity())()` |  |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[$plus$plus$eq](#$plus$plus$eq(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") bytes)` |  |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[addAll](#addAll(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") bytes)` |  |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[addAll](#addAll(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> xs)` |  |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[addOne](#addOne(byte))​(byte elem)` |  |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[append](#append(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") bs)` | Java API: append a ByteString to this builder. |
	| `java.io.OutputStream` | `[asOutputStream](#asOutputStream())()` | Directly wraps this ByteStringBuilder in an OutputStream. |
	| `void` | `[clear](#clear())()` |  |
	| `protected [ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[fillArray](#fillArray(int,scala.Function2))​(int len,  scala.Function2<byte[],​java.lang.Object,​scala.runtime.BoxedUnit> fill)` |  |
	| `protected [ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[fillByteBuffer](#fillByteBuffer(int,java.nio.ByteOrder,scala.Function1))​(int len,  java.nio.ByteOrder byteOrder,  scala.Function1<java.nio.ByteBuffer,​scala.runtime.BoxedUnit> fill)` |  |
	| `boolean` | `[isEmpty](#isEmpty())()` | Tests whether this ByteStringBuilder is empty. |
	| `int` | `[length](#length())()` |  |
	| `boolean` | `[nonEmpty](#nonEmpty())()` | Tests whether this ByteStringBuilder is not empty. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putByte](#putByte(byte))​(byte x)` | Add a single Byte to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putBytes](#putBytes(byte%5B%5D))​(byte[] array)` | Add a number of Bytes from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putBytes](#putBytes(byte%5B%5D,int,int))​(byte[] array,  int start,  int len)` | Add a number of Bytes from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putDouble](#putDouble(double,java.nio.ByteOrder))​(double x,  java.nio.ByteOrder byteOrder)` | Add a single Double to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putDoubles](#putDoubles(double%5B%5D,int,int,java.nio.ByteOrder))​(double[] array,  int start,  int len,  java.nio.ByteOrder byteOrder)` | Add a number of Doubles from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putDoubles](#putDoubles(double%5B%5D,java.nio.ByteOrder))​(double[] array,  java.nio.ByteOrder byteOrder)` | Add a number of Doubles from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putFloat](#putFloat(float,java.nio.ByteOrder))​(float x,  java.nio.ByteOrder byteOrder)` | Add a single Float to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putFloats](#putFloats(float%5B%5D,int,int,java.nio.ByteOrder))​(float[] array,  int start,  int len,  java.nio.ByteOrder byteOrder)` | Add a number of Floats from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putFloats](#putFloats(float%5B%5D,java.nio.ByteOrder))​(float[] array,  java.nio.ByteOrder byteOrder)` | Add a number of Floats from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putInt](#putInt(int,java.nio.ByteOrder))​(int x,  java.nio.ByteOrder byteOrder)` | Add a single Int to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putInts](#putInts(int%5B%5D,int,int,java.nio.ByteOrder))​(int[] array,  int start,  int len,  java.nio.ByteOrder byteOrder)` | Add a number of Ints from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putInts](#putInts(int%5B%5D,java.nio.ByteOrder))​(int[] array,  java.nio.ByteOrder byteOrder)` | Add a number of Ints from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putLong](#putLong(long,java.nio.ByteOrder))​(long x,  java.nio.ByteOrder byteOrder)` | Add a single Long to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putLongPart](#putLongPart(long,int,java.nio.ByteOrder))​(long x,  int n,  java.nio.ByteOrder byteOrder)` | Add the `n` least significant bytes of the given Long to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putLongs](#putLongs(long%5B%5D,int,int,java.nio.ByteOrder))​(long[] array,  int start,  int len,  java.nio.ByteOrder byteOrder)` | Add a number of Longs from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putLongs](#putLongs(long%5B%5D,java.nio.ByteOrder))​(long[] array,  java.nio.ByteOrder byteOrder)` | Add a number of Longs from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putShort](#putShort(int,java.nio.ByteOrder))​(int x,  java.nio.ByteOrder byteOrder)` | Add a single Short to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putShorts](#putShorts(short%5B%5D,int,int,java.nio.ByteOrder))​(short[] array,  int start,  int len,  java.nio.ByteOrder byteOrder)` | Add a number of Shorts from an array to this builder. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[putShorts](#putShorts(short%5B%5D,java.nio.ByteOrder))​(short[] array,  java.nio.ByteOrder byteOrder)` | Add a number of Shorts from an array to this builder. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[result](#result())()` |  |
	| `void` | `[sizeHint](#sizeHint(int))​(int len)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.collection.mutable.Builder
		
		
		`mapResult, sizeHint, sizeHint$default$2, sizeHintBounded`
		- ### Methods inherited from interface scala.collection.mutable.Growable
		
		
		`$plus$eq, $plus$eq, $plus$plus$eq, addOne, knownSize`

- - ### Constructor Detail
	
	
	
		- #### ByteStringBuilder
		
		
		
		```
		public ByteStringBuilder()
		```

	- ### Method Detail
	
	
	
		- #### $plus$plus$eq
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") $plus$plus$eq​([ByteString](ByteString.html "class in akka.util") bytes)
		```
		- #### \_tempCapacity
		
		
		
		```
		public int _tempCapacity()
		```
		- #### addAll
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") addAll​([ByteString](ByteString.html "class in akka.util") bytes)
		```
		- #### addAll
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") addAll​(scala.collection.IterableOnce<java.lang.Object> xs)
		```
		
		
		Specified by:
		`addAll` in interface `scala.collection.mutable.Growable<java.lang.Object>`
		- #### addOne
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") addOne​(byte elem)
		```
		- #### append
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") append​([ByteString](ByteString.html "class in akka.util") bs)
		```
		
		Java API: append a ByteString to this builder.
		- #### asOutputStream
		
		
		
		```
		public java.io.OutputStream asOutputStream()
		```
		
		Directly wraps this ByteStringBuilder in an OutputStream. Write
		 operations on the stream are forwarded to the builder.
		- #### clear
		
		
		
		```
		public void clear()
		```
		
		
		Specified by:
		`clear` in interface `scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")>`
		Specified by:
		`clear` in interface `scala.collection.mutable.Clearable`
		- #### fillArray
		
		
		
		```
		protected [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") fillArray​(int len,
		                                      scala.Function2<byte[],​java.lang.Object,​scala.runtime.BoxedUnit> fill)
		```
		- #### fillByteBuffer
		
		
		
		```
		protected final [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") fillByteBuffer​(int len,
		                                                 java.nio.ByteOrder byteOrder,
		                                                 scala.Function1<java.nio.ByteBuffer,​scala.runtime.BoxedUnit> fill)
		```
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		Tests whether this ByteStringBuilder is empty.
		- #### length
		
		
		
		```
		public int length()
		```
		- #### nonEmpty
		
		
		
		```
		public boolean nonEmpty()
		```
		
		Tests whether this ByteStringBuilder is not empty.
		- #### putByte
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putByte​(byte x)
		```
		
		Add a single Byte to this builder.
		- #### putBytes
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putBytes​(byte[] array)
		```
		
		Add a number of Bytes from an array to this builder.
		- #### putBytes
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putBytes​(byte[] array,
		                                  int start,
		                                  int len)
		```
		
		Add a number of Bytes from an array to this builder.
		- #### putDouble
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putDouble​(double x,
		                                   java.nio.ByteOrder byteOrder)
		```
		
		Add a single Double to this builder.
		- #### putDoubles
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putDoubles​(double[] array,
		                                    java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Doubles from an array to this builder.
		- #### putDoubles
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putDoubles​(double[] array,
		                                    int start,
		                                    int len,
		                                    java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Doubles from an array to this builder.
		- #### putFloat
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putFloat​(float x,
		                                  java.nio.ByteOrder byteOrder)
		```
		
		Add a single Float to this builder.
		- #### putFloats
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putFloats​(float[] array,
		                                   java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Floats from an array to this builder.
		- #### putFloats
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putFloats​(float[] array,
		                                   int start,
		                                   int len,
		                                   java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Floats from an array to this builder.
		- #### putInt
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putInt​(int x,
		                                java.nio.ByteOrder byteOrder)
		```
		
		Add a single Int to this builder.
		- #### putInts
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putInts​(int[] array,
		                                 java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Ints from an array to this builder.
		- #### putInts
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putInts​(int[] array,
		                                 int start,
		                                 int len,
		                                 java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Ints from an array to this builder.
		- #### putLong
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putLong​(long x,
		                                 java.nio.ByteOrder byteOrder)
		```
		
		Add a single Long to this builder.
		- #### putLongPart
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putLongPart​(long x,
		                                     int n,
		                                     java.nio.ByteOrder byteOrder)
		```
		
		Add the `n` least significant bytes of the given Long to this builder.
		- #### putLongs
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putLongs​(long[] array,
		                                  java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Longs from an array to this builder.
		- #### putLongs
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putLongs​(long[] array,
		                                  int start,
		                                  int len,
		                                  java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Longs from an array to this builder.
		- #### putShort
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putShort​(int x,
		                                  java.nio.ByteOrder byteOrder)
		```
		
		Add a single Short to this builder.
		- #### putShorts
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putShorts​(short[] array,
		                                   java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Shorts from an array to this builder.
		- #### putShorts
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") putShorts​(short[] array,
		                                   int start,
		                                   int len,
		                                   java.nio.ByteOrder byteOrder)
		```
		
		Add a number of Shorts from an array to this builder.
		- #### result
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") result()
		```
		
		
		Specified by:
		`result` in interface `scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")>`
		- #### sizeHint
		
		
		
		```
		public void sizeHint​(int len)
		```
		
		
		Specified by:
		`sizeHint` in interface `scala.collection.mutable.Builder<java.lang.Object,​[ByteString](ByteString.html "class in akka.util")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteStringBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteStringBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteStringBuilder.html)*