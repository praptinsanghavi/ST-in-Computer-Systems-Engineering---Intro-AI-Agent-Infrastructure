---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ClassLoaderObjectInputStream.html
title: ClassLoaderObjectInputStream
---

# ClassLoaderObjectInputStream

## Content

Package [akka.util](package-summary.html)
## Class ClassLoaderObjectInputStream

- java.lang.Object
- - java.io.InputStream
	- - java.io.ObjectInputStream
		- - akka.util.ClassLoaderObjectInputStream

- All Implemented Interfaces:
`java.io.Closeable`, `java.io.DataInput`, `java.io.ObjectInput`, `java.io.ObjectStreamConstants`, `java.lang.AutoCloseable`

---

```
public class ClassLoaderObjectInputStream
extends java.io.ObjectInputStream
```

ClassLoaderObjectInputStream tries to utilize the provided ClassLoader to load Classes and falls
 back to ObjectInputStreams resolver.
 
 param: classLoader \- the ClassLoader which is to be used primarily
 param: is \- the InputStream that is wrapped

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class java.io.ObjectInputStream
		
		
		`java.io.ObjectInputStream.GetField`

	- ### Field Summary
	
	
		- ### Fields inherited from interface java.io.ObjectStreamConstants
		
		
		`baseWireHandle, PROTOCOL_VERSION_1, PROTOCOL_VERSION_2, SC_BLOCK_DATA, SC_ENUM, SC_EXTERNALIZABLE, SC_SERIALIZABLE, SC_WRITE_METHOD, SERIAL_FILTER_PERMISSION, STREAM_MAGIC, STREAM_VERSION, SUBCLASS_IMPLEMENTATION_PERMISSION, SUBSTITUTION_PERMISSION, TC_ARRAY, TC_BASE, TC_BLOCKDATA, TC_BLOCKDATALONG, TC_CLASS, TC_CLASSDESC, TC_ENDBLOCKDATA, TC_ENUM, TC_EXCEPTION, TC_LONGSTRING, TC_MAX, TC_NULL, TC_OBJECT, TC_PROXYCLASSDESC, TC_REFERENCE, TC_RESET, TC_STRING`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClassLoaderObjectInputStream](#%3Cinit%3E(java.lang.ClassLoader,java.io.InputStream))​(java.lang.ClassLoader classLoader,  java.io.InputStream is)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected java.lang.Class<?>` | `[resolveClass](#resolveClass(java.io.ObjectStreamClass))​(java.io.ObjectStreamClass objectStreamClass)` |  |
	
	
		- ### Methods inherited from class java.io.ObjectInputStream
		
		
		`available, close, defaultReadObject, enableResolveObject, getObjectInputFilter, read, read, readBoolean, readByte, readChar, readClassDescriptor, readDouble, readFields, readFloat, readFully, readFully, readInt, readLine, readLong, readObject, readObjectOverride, readShort, readStreamHeader, readUnshared, readUnsignedByte, readUnsignedShort, readUTF, registerValidation, resolveObject, resolveProxyClass, setObjectInputFilter, skipBytes`
		- ### Methods inherited from class java.io.InputStream
		
		
		`mark, markSupported, nullInputStream, read, readAllBytes, readNBytes, readNBytes, reset, skip, transferTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.io.ObjectInput
		
		
		`read, skip`

- - ### Constructor Detail
	
	
	
		- #### ClassLoaderObjectInputStream
		
		
		
		```
		public ClassLoaderObjectInputStream​(java.lang.ClassLoader classLoader,
		                                    java.io.InputStream is)
		```

	- ### Method Detail
	
	
	
		- #### resolveClass
		
		
		
		```
		protected java.lang.Class<?> resolveClass​(java.io.ObjectStreamClass objectStreamClass)
		```
		
		
		Overrides:
		`resolveClass` in class `java.io.ObjectInputStream`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ClassLoaderObjectInputStream.html](https://doc.akka.io/japi/akka/current/akka/util/ClassLoaderObjectInputStream.html)*