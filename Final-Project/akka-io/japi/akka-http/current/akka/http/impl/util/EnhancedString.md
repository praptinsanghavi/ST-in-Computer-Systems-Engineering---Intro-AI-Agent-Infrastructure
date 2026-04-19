---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedString.html
title: EnhancedString
---

# EnhancedString

## Content

Package [akka.http.impl.util](package-summary.html)
## Class EnhancedString

- java.lang.Object
- - scala.AnyVal
	- - akka.http.impl.util.EnhancedString

- ---

```
public class EnhancedString
extends scala.AnyVal
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EnhancedString](#%3Cinit%3E(java.lang.String))​(java.lang.String underlying)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `byte[]` | `[asciiBytes](#asciiBytes())()` | Returns the ASCII encoded bytes of this string. |
	| `boolean` | `[endsWith](#endsWith(char))​(char c)` | Determines whether the underlying String ends with the given character. |
	| `scala.collection.immutable.LinearSeq<java.lang.String>` | `[fastSplit](#fastSplit(char))​(char delimiter)` | Splits the underlying string into the segments that are delimited by the given character. |
	| `void` | `[getAsciiBytes](#getAsciiBytes(byte%5B%5D,int))​(byte[] array,  int offset)` | Copies the ASCII encoded bytes of this string into the given byte array starting at the `offset` index. |
	| `scala.collection.immutable.Stream<java.lang.String>` | `[lazySplit](#lazySplit(char))​(char delimiter)` | Lazily splits the underlying string into the segments that are delimited by the given character. |
	| `java.lang.String` | `[nullAsEmpty](#nullAsEmpty())()` | If the underlying string is null the method returns the empty string, otherwise the underlying string. |
	| `boolean` | `[startsWith](#startsWith(char))​(char c)` | Determines whether the underlying String starts with the given character. |
	| `java.lang.String` | `[stripMarginWithNewline](#stripMarginWithNewline(java.lang.String))​(java.lang.String newline)` | Strips margin and fixes the newline sequence to the given one preventing dependencies on the build platform |
	| `scala.Option<java.lang.String>` | `[toOption](#toOption())()` | Returns Some(String) if the underlying string is non\-empty, None otherwise |
	| `java.lang.String` | `[toRootLowerCase](#toRootLowerCase())()` | Provides a default toLowerCase that doesn't suffer from the dreaded turkish\-i problem. |
	| `java.lang.String` | `[underlying](#underlying())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EnhancedString
		
		
		
		```
		public EnhancedString​(java.lang.String underlying)
		```

	- ### Method Detail
	
	
	
		- #### underlying
		
		
		
		```
		public java.lang.String underlying()
		```
		- #### fastSplit
		
		
		
		```
		public scala.collection.immutable.LinearSeq<java.lang.String> fastSplit​(char delimiter)
		```
		
		Splits the underlying string into the segments that are delimited by the given character.
		 The delimiter itself is never a part of any segment. If the string does not contain the
		 delimiter the result is a List containing only the underlying string.
		 Note that this implementation differs from the original String.split(...) method in that
		 leading and trailing delimiters are NOT ignored, i.e. they trigger the inclusion of an
		 empty leading or trailing empty string (respectively).
		
		Parameters:
		`delimiter` \- (undocumented)
		Returns:
		(undocumented)
		- #### lazySplit
		
		
		
		```
		public scala.collection.immutable.Stream<java.lang.String> lazySplit​(char delimiter)
		```
		
		Lazily splits the underlying string into the segments that are delimited by the given character.
		 Only the segments that are actually accessed are computed.
		 The delimiter itself is never a part of any segment. If the string does not contain the
		 delimiter the result is a single\-element stream containing only the underlying string.
		 Note that this implementation differs from the original String.split(...) method in that
		 leading and trailing delimiters are NOT ignored, i.e. they trigger the inclusion of an
		 empty leading or trailing empty string (respectively).
		
		Parameters:
		`delimiter` \- (undocumented)
		Returns:
		(undocumented)
		- #### toOption
		
		
		
		```
		public scala.Option<java.lang.String> toOption()
		```
		
		Returns Some(String) if the underlying string is non\-empty, None otherwise
		
		Returns:
		(undocumented)
		- #### nullAsEmpty
		
		
		
		```
		public java.lang.String nullAsEmpty()
		```
		
		If the underlying string is null the method returns the empty string, otherwise the underlying string.
		
		Returns:
		(undocumented)
		- #### asciiBytes
		
		
		
		```
		public byte[] asciiBytes()
		```
		
		Returns the ASCII encoded bytes of this string. Truncates characters to 8\-bit byte value.
		
		Returns:
		(undocumented)
		- #### getAsciiBytes
		
		
		
		```
		public void getAsciiBytes​(byte[] array,
		                          int offset)
		```
		
		Copies the ASCII encoded bytes of this string into the given byte array starting at the `offset` index.
		 Truncates characters to 8\-bit byte value.
		 If the array does not have enough space for the whole string only the portion that fits is copied.
		
		Parameters:
		`array` \- (undocumented)
		`offset` \- (undocumented)
		- #### startsWith
		
		
		
		```
		public boolean startsWith​(char c)
		```
		
		Determines whether the underlying String starts with the given character.
		
		Parameters:
		`c` \- (undocumented)
		Returns:
		(undocumented)
		- #### endsWith
		
		
		
		```
		public boolean endsWith​(char c)
		```
		
		Determines whether the underlying String ends with the given character.
		
		Parameters:
		`c` \- (undocumented)
		Returns:
		(undocumented)
		- #### stripMarginWithNewline
		
		
		
		```
		public java.lang.String stripMarginWithNewline​(java.lang.String newline)
		```
		
		Strips margin and fixes the newline sequence to the given one preventing dependencies on the build platform
		- #### toRootLowerCase
		
		
		
		```
		public java.lang.String toRootLowerCase()
		```
		
		Provides a default toLowerCase that doesn't suffer from the dreaded turkish\-i problem.
		 See http://bugs.java.com/view\_bug.do?bug\_id\=6208680
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedString.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedString.html)*