---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Base62$.html
title: Base62$
---

# Base62$

## Content

Package [akka.util](package-summary.html)
## Class Base62$

- java.lang.Object
- - akka.util.Base62$

- ---

```
public class Base62$
extends java.lang.Object
```

Base62 encoder/decoder.
 
 Unlike an encoding like Base64, a perfect Base62 encoding never aligns with the bytes \- there are no whole numbers
 for which you can say "for every n bytes, there are m characters output." This is because 62 and 256 share no common
 exponents. So you can't perfectly break the input up into blocks, and encode it one block at a time, like you can
 with Base64\.
 

 Instead, we approximate it. We break the raw bytes into blocks of 8 bytes, and encoded blocks of 11 base62 digits.
 This size was chosen because 62^^11 is greater than, but somewhat close to logarithmically, 256^^8\. Because it's
 greater than, it guarantees that every 8 byte block value can fit in 11 base62 characters, while the closeness
 minimises the overhead due to values of 11 base62 characters that are too big to map to 8 bytes. I checked block
 sizes up to 10, and found this yielded the best efficiency. Also, 8 is the longest input block size that allows us
 to do all the arithmetic using primitive data types (in this case, unsigned long), rather than having to use a big
 integer type, which would impact performance and make our code more complex.
 

 So, our encoded string is 11/8 (1\.375\) times longer than the input bytes, which is slightly worse than the optimal
 base62 encoding efficiency of 8/log2(62\), ie 1\.344 times longer than the input bytes. But, implementing the optimal
 encoding requires dividing the entire input byte array by 62 over and over, which would mean our encoding would run
 in O(n2\) rather than O(n).
 

 This does mean certain input strings, containing only valid base62 characters, may not be possible to decode. This
 is also true with base64, but such corruptions can only happen in the last block, if the last block is one character
 long. Whereas such corruptions can happen in any block in this encoding, for example, a block of only z's is invalid
 anywhere in the encoded form.
 

 The encoder is reasonably performant. I haven't done any fine tunings or micro\-benchmarks of it, but I have taken
 care to ensure it does run in O(n), and avoided unnecessary buffer copies where possible. For the purposes of license
 encoding, its runtime is negligible compared to the cryptographic signing and verification operations.
 

 There are other Base62 encoders out there, and they use a number of different incompatible approaches. Keybase has
 a library called saltpack which contains a Base62 encoder. It uses the same block encoding approach, but with 32
 byte blocks. However, its encoder is flexible enough to allow creating an encoder with any arbitrary block length.
 This implementation has been verified to be compatible with the Keybase saltpack BaseX encoder for Base62 with a
 block size of 8\.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Base62$](Base62$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Base62$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `byte[]` | `[decode](#decode(java.lang.String))​(java.lang.String encoded)` | Decode the given encoded string into a byte array. |
	| `java.lang.String` | `[encode](#encode(byte%5B%5D))​(byte[] raw)` | Encode the given byte array into a string. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Base62$](Base62$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Base62$
		
		
		
		```
		public Base62$()
		```

	- ### Method Detail
	
	
	
		- #### encode
		
		
		
		```
		public java.lang.String encode​(byte[] raw)
		```
		
		Encode the given byte array into a string.
		- #### decode
		
		
		
		```
		public byte[] decode​(java.lang.String encoded)
		```
		
		Decode the given encoded string into a byte array.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/Base62$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Base62$.html](https://doc.akka.io/japi/akka/current/akka/util/Base62$.html)*