---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteStringParserInput.html
title: ByteStringParserInput
---

# ByteStringParserInput

## Content

Package [akka.http.impl.util](package-summary.html)
## Class ByteStringParserInput

- java.lang.Object
- - akka.parboiled2\.ParserInput.DefaultParserInput
	- - akka.http.impl.util.ByteStringParserInput

- All Implemented Interfaces:
`akka.parboiled2.ParserInput`

---

```
public final class ByteStringParserInput
extends akka.parboiled2.ParserInput.DefaultParserInput
```

ParserInput reading directly off a ByteString. (Based on the ByteArrayBasedParserInput)
 This avoids a separate decoding step but assumes that each byte represents exactly one character,
 which is encoded by ISO\-8859\-1!
 You can therefore use this ParserInput type only if you know that all input will be `ISO-8859-1`\-encoded,
 or only contains 7\-bit ASCII characters (which is a subset of ISO\-8859\-1\)!
 
 Note that this ParserInput type will NOT work with general `UTF-8`\-encoded input as this can contain
 character representations spanning multiple bytes. However, if you know that your input will only ever contain
 7\-bit ASCII characters (0x00\-0x7F) then UTF\-8 is fine, since the first 127 UTF\-8 characters are
 encoded with only one byte that is identical to 7\-bit ASCII and ISO\-8859\-1\.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.parboiled2\.ParserInput
		
		
		`akka.parboiled2.ParserInput.ByteArrayBasedParserInput, akka.parboiled2.ParserInput.ByteArrayBasedParserInput$, akka.parboiled2.ParserInput.CharArrayBasedParserInput, akka.parboiled2.ParserInput.CharArrayBasedParserInput$, akka.parboiled2.ParserInput.DefaultParserInput, akka.parboiled2.ParserInput.StringBasedParserInput`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteStringParserInput](#%3Cinit%3E(akka.util.ByteString))​(akka.util.ByteString bytes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `char` | `[charAt](#charAt(int))​(int ix)` |  |
	| `int` | `[length](#length())()` |  |
	| `char[]` | `[sliceCharArray](#sliceCharArray(int,int))​(int start,  int end)` |  |
	| `java.lang.String` | `[sliceString](#sliceString(int,int))​(int start,  int end)` |  |
	
	
		- ### Methods inherited from class akka.parboiled2\.ParserInput.DefaultParserInput
		
		
		`getLine`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ByteStringParserInput
		
		
		
		```
		public ByteStringParserInput​(akka.util.ByteString bytes)
		```

	- ### Method Detail
	
	
	
		- #### charAt
		
		
		
		```
		public char charAt​(int ix)
		```
		- #### length
		
		
		
		```
		public int length()
		```
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

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteStringParserInput.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteStringParserInput.html)*