---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html
title: ByteFlag
---

# ByteFlag

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class ByteFlag

- java.lang.Object
- - scala.AnyVal
	- - akka.http.impl.engine.http2\.ByteFlag

- ---

```
public final class ByteFlag
extends scala.AnyVal
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteFlag](#%3Cinit%3E(int))​(int value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[binaryLeftPad](#binaryLeftPad(byte))​(byte byte_)` |  |
	| `[ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2")` | `[ifSet](#ifSet(boolean))​(boolean flag)` |  |
	| `boolean` | `[isSet](#isSet(akka.http.impl.engine.http2.ByteFlag))​([ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2") byteFlag)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[value](#value())()` |  |
	| `static [ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2")` | `[Zero](#Zero())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ByteFlag
		
		
		
		```
		public ByteFlag​(int value)
		```

	- ### Method Detail
	
	
	
		- #### Zero
		
		
		
		```
		public static [ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2") Zero()
		```
		- #### binaryLeftPad
		
		
		
		```
		public static java.lang.String binaryLeftPad​(byte byte_)
		```
		- #### value
		
		
		
		```
		public int value()
		```
		- #### isSet
		
		
		
		```
		public boolean isSet​([ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2") byteFlag)
		```
		- #### ifSet
		
		
		
		```
		public [ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2") ifSet​(boolean flag)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html)*