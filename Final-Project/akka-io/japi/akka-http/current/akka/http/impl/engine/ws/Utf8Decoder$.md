---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Decoder$.html
title: Utf8Decoder$
---

# Utf8Decoder$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class Utf8Decoder$

- java.lang.Object
- - akka.http.impl.engine.ws.Utf8Decoder$

- All Implemented Interfaces:
`[StreamingCharsetDecoder](StreamingCharsetDecoder.html "interface in akka.http.impl.engine.ws")`

---

```
public class Utf8Decoder$
extends java.lang.Object
implements [StreamingCharsetDecoder](StreamingCharsetDecoder.html "interface in akka.http.impl.engine.ws")
```

A Utf8 \-\> Utf16 (\= Java char) decoder.
 
 This decoder is based on the one of Bjoern Hoehrmann from
 

 http://bjoern.hoehrmann.de/utf\-8/decoder/dfa/
 

 which is licensed under this license:
 

 Copyright (C) 2008\-2017 Bjoern Hoehrmann 

 Permission is hereby granted, free of charge, to any person obtaining a
 copy of this software and associated documentation files (the "Software"),
 to deal in the Software without restriction, including without limitation
 the rights to use, copy, modify, merge, publish, distribute, sublicense,
 and/or sell copies of the Software, and to permit persons to whom the
 Software is furnished to do so, subject to the following conditions:
 

 The above copyright notice and this permission notice shall be included
 in all copies or substantial portions of the Software.
 

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 

 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Utf8Decoder$](Utf8Decoder$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Utf8Decoder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `byte[]` | `[characterClasses](#characterClasses())()` |  |
	| `[StreamingCharsetDecoderInstance](StreamingCharsetDecoderInstance.html "interface in akka.http.impl.engine.ws")` | `[create](#create())()` |  |
	| `byte[]` | `[states](#states())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.engine.ws.[StreamingCharsetDecoder](StreamingCharsetDecoder.html "interface in akka.http.impl.engine.ws")
		
		
		`[decode](StreamingCharsetDecoder.html#decode(akka.util.ByteString))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Utf8Decoder$](Utf8Decoder$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Utf8Decoder$
		
		
		
		```
		public Utf8Decoder$()
		```

	- ### Method Detail
	
	
	
		- #### characterClasses
		
		
		
		```
		public byte[] characterClasses()
		```
		- #### states
		
		
		
		```
		public byte[] states()
		```
		- #### create
		
		
		
		```
		public [StreamingCharsetDecoderInstance](StreamingCharsetDecoderInstance.html "interface in akka.http.impl.engine.ws") create()
		```
		
		
		Specified by:
		`[create](StreamingCharsetDecoder.html#create())` in interface `[StreamingCharsetDecoder](StreamingCharsetDecoder.html "interface in akka.http.impl.engine.ws")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/StreamingCharsetDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/StreamingCharsetDecoderInstance.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Decoder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Decoder$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Decoder$.html)*