---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/serialization/ThrowableNotSerializableException.html
title: ThrowableNotSerializableException
---

# ThrowableNotSerializableException

## Content

Package [akka.remote.serialization](package-summary.html)
## Class ThrowableNotSerializableException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - java.lang.IllegalArgumentException
				- - akka.remote.serialization.ThrowableNotSerializableException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class ThrowableNotSerializableException
extends java.lang.IllegalArgumentException
```

Use as replacement for an original exception when it can't be serialized or deserialized.
 param: originalMessage the message of the original exception
 param: originalClassName the class name of the original exception
 param: cause exception that caused deserialization error, optional and will not be serialized

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.serialization.ThrowableNotSerializableException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrowableNotSerializableException](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String originalMessage,  java.lang.String originalClassName)` |  |
	| `[ThrowableNotSerializableException](#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.Throwable))​(java.lang.String originalMessage,  java.lang.String originalClassName,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[originalClassName](#originalClassName())()` |  |
	| `java.lang.String` | `[originalMessage](#originalMessage())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThrowableNotSerializableException
		
		
		
		```
		public ThrowableNotSerializableException​(java.lang.String originalMessage,
		                                         java.lang.String originalClassName,
		                                         java.lang.Throwable cause)
		```
		- #### ThrowableNotSerializableException
		
		
		
		```
		public ThrowableNotSerializableException​(java.lang.String originalMessage,
		                                         java.lang.String originalClassName)
		```

	- ### Method Detail
	
	
	
		- #### originalClassName
		
		
		
		```
		public java.lang.String originalClassName()
		```
		- #### originalMessage
		
		
		
		```
		public java.lang.String originalMessage()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/serialization/ThrowableNotSerializableException.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/serialization/ThrowableNotSerializableException.html)*