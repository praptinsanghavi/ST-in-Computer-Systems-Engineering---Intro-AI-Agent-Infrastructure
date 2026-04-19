---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonByteStringParserInput.html
title: SprayJsonByteStringParserInput
---

# SprayJsonByteStringParserInput

## Content

Package [akka.http.scaladsl.marshallers.sprayjson](package-summary.html)
## Class SprayJsonByteStringParserInput

- java.lang.Object
- - spray.json.ParserInput.DefaultParserInput
	- - spray.json.ParserInput.IndexedBytesParserInput
		- - akka.http.scaladsl.marshallers.sprayjson.SprayJsonByteStringParserInput

- All Implemented Interfaces:
`spray.json.ParserInput`

---

```
public final class SprayJsonByteStringParserInput
extends spray.json.ParserInput.IndexedBytesParserInput
```

INTERNAL API
 
 ParserInput reading directly off a ByteString. (Based on the ByteArrayBasedParserInput)
 that avoids a separate decoding step.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface spray.json.ParserInput
		
		
		`spray.json.ParserInput.ByteArrayBasedParserInput, spray.json.ParserInput.CharArrayBasedParserInput, spray.json.ParserInput.DefaultParserInput, spray.json.ParserInput.IndexedBytesParserInput, spray.json.ParserInput.Line, spray.json.ParserInput.Line$, spray.json.ParserInput.StringBasedParserInput`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SprayJsonByteStringParserInput](#%3Cinit%3E(akka.util.ByteString))​(akka.util.ByteString bytes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected byte` | `[byteAt](#byteAt(int))​(int offset)` |  |
	| `int` | `[length](#length())()` |  |
	| `char[]` | `[sliceCharArray](#sliceCharArray(int,int))​(int start,  int end)` |  |
	| `java.lang.String` | `[sliceString](#sliceString(int,int))​(int start,  int end)` |  |
	
	
		- ### Methods inherited from class spray.json.ParserInput.IndexedBytesParserInput
		
		
		`nextChar, nextUtf8Char`
		- ### Methods inherited from class spray.json.ParserInput.DefaultParserInput
		
		
		`_cursor, _cursor_$eq, cursor, getLine`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SprayJsonByteStringParserInput
		
		
		
		```
		public SprayJsonByteStringParserInput​(akka.util.ByteString bytes)
		```

	- ### Method Detail
	
	
	
		- #### byteAt
		
		
		
		```
		protected byte byteAt​(int offset)
		```
		
		
		Specified by:
		`byteAt` in class `spray.json.ParserInput.IndexedBytesParserInput`
		- #### length
		
		
		
		```
		public int length()
		```
		
		
		Specified by:
		`length` in interface `spray.json.ParserInput`
		Specified by:
		`length` in class `spray.json.ParserInput.IndexedBytesParserInput`
		- #### sliceCharArray
		
		
		
		```
		public char[] sliceCharArray​(int start,
		                             int end)
		```
		- #### sliceString
		
		
		
		```
		public java.lang.String sliceString​(int start,
		                                    int end)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonByteStringParserInput.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonByteStringParserInput.html)*