---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
title: ByteRange
---

# ByteRange

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class ByteRange

- java.lang.Object
- - akka.http.javadsl.model.headers.ByteRange

- Direct Known Subclasses:
`[ByteRange](../../../scaladsl/model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class ByteRange
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ByteRange](ByteRange.html "class in akka.http.javadsl.model.headers")` | `[createFromOffset](#createFromOffset(long))​(long offset)` |  |
	| `static [ByteRange](ByteRange.html "class in akka.http.javadsl.model.headers")` | `[createSlice](#createSlice(long,long))​(long first,  long last)` |  |
	| `static [ByteRange](ByteRange.html "class in akka.http.javadsl.model.headers")` | `[createSuffix](#createSuffix(long))​(long length)` |  |
	| `abstract java.util.OptionalLong` | `[getOffset](#getOffset())()` |  |
	| `abstract java.util.OptionalLong` | `[getSliceFirst](#getSliceFirst())()` |  |
	| `abstract java.util.OptionalLong` | `[getSliceLast](#getSliceLast())()` |  |
	| `abstract java.util.OptionalLong` | `[getSuffixLength](#getSuffixLength())()` |  |
	| `abstract boolean` | `[isFromOffset](#isFromOffset())()` |  |
	| `abstract boolean` | `[isSlice](#isSlice())()` |  |
	| `abstract boolean` | `[isSuffix](#isSuffix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ByteRange
		
		
		
		```
		public ByteRange()
		```

	- ### Method Detail
	
	
	
		- #### isSlice
		
		
		
		```
		public abstract boolean isSlice()
		```
		- #### isFromOffset
		
		
		
		```
		public abstract boolean isFromOffset()
		```
		- #### isSuffix
		
		
		
		```
		public abstract boolean isSuffix()
		```
		- #### getSliceFirst
		
		
		
		```
		public abstract java.util.OptionalLong getSliceFirst()
		```
		- #### getSliceLast
		
		
		
		```
		public abstract java.util.OptionalLong getSliceLast()
		```
		- #### getOffset
		
		
		
		```
		public abstract java.util.OptionalLong getOffset()
		```
		- #### getSuffixLength
		
		
		
		```
		public abstract java.util.OptionalLong getSuffixLength()
		```
		- #### createSlice
		
		
		
		```
		public static [ByteRange](ByteRange.html "class in akka.http.javadsl.model.headers") createSlice​(long first,
		                                    long last)
		```
		- #### createFromOffset
		
		
		
		```
		public static [ByteRange](ByteRange.html "class in akka.http.javadsl.model.headers") createFromOffset​(long offset)
		```
		- #### createSuffix
		
		
		
		```
		public static [ByteRange](ByteRange.html "class in akka.http.javadsl.model.headers") createSuffix​(long length)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/ByteRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html)*