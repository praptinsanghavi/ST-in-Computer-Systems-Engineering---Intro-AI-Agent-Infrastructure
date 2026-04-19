---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallers.html
title: StringUnmarshallers
---

# StringUnmarshallers

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Class StringUnmarshallers

- java.lang.Object
- - akka.http.javadsl.unmarshalling.StringUnmarshallers

- ---

```
public final class StringUnmarshallers
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Boolean>` | `[BOOLEAN](#BOOLEAN)` | An unmarshaller that parses the input String as a Boolean, matching "true", "yes", "on" as true, and "false", "no", "off" as false. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Byte>` | `[BYTE](#BYTE)` | An unmarshaller that parses the input String as a Byte in decimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Byte>` | `[BYTE_HEX](#BYTE_HEX)` | An unmarshaller that parses the input String as a Byte in hexadecimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Double>` | `[DOUBLE](#DOUBLE)` | An unmarshaller that parses the input String as a Double in decimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Float>` | `[FLOAT](#FLOAT)` | An unmarshaller that parses the input String as a Float in decimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Integer>` | `[INTEGER](#INTEGER)` | An unmarshaller that parses the input String as an Integer in decimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Integer>` | `[INTEGER_HEX](#INTEGER_HEX)` | An unmarshaller that parses the input String as an Integer in hexadecimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Long>` | `[LONG](#LONG)` | An unmarshaller that parses the input String as a Long in decimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Long>` | `[LONG_HEX](#LONG_HEX)` | An unmarshaller that parses the input String as a Long in hexadecimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Short>` | `[SHORT](#SHORT)` | An unmarshaller that parses the input String as a Short in decimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Short>` | `[SHORT_HEX](#SHORT_HEX)` | An unmarshaller that parses the input String as a Short in hexadecimal notation. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.String>` | `[STRING](#STRING)` | An unmarshaller that returns the input String unchanged. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.util.UUID>` | `[UUID](#UUID)` | An unmarshaller that parses the input String as a UUID. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StringUnmarshallers](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### STRING
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.String> STRING
		```
		
		An unmarshaller that returns the input String unchanged.
		- #### BYTE
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Byte> BYTE
		```
		
		An unmarshaller that parses the input String as a Byte in decimal notation.
		- #### SHORT
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Short> SHORT
		```
		
		An unmarshaller that parses the input String as a Short in decimal notation.
		- #### INTEGER
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Integer> INTEGER
		```
		
		An unmarshaller that parses the input String as an Integer in decimal notation.
		- #### LONG
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Long> LONG
		```
		
		An unmarshaller that parses the input String as a Long in decimal notation.
		- #### BYTE\_HEX
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Byte> BYTE_HEX
		```
		
		An unmarshaller that parses the input String as a Byte in hexadecimal notation.
		- #### SHORT\_HEX
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Short> SHORT_HEX
		```
		
		An unmarshaller that parses the input String as a Short in hexadecimal notation.
		- #### INTEGER\_HEX
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Integer> INTEGER_HEX
		```
		
		An unmarshaller that parses the input String as an Integer in hexadecimal notation.
		- #### LONG\_HEX
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Long> LONG_HEX
		```
		
		An unmarshaller that parses the input String as a Long in hexadecimal notation.
		- #### FLOAT
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Float> FLOAT
		```
		
		An unmarshaller that parses the input String as a Float in decimal notation.
		- #### DOUBLE
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Double> DOUBLE
		```
		
		An unmarshaller that parses the input String as a Double in decimal notation.
		- #### BOOLEAN
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.lang.Boolean> BOOLEAN
		```
		
		An unmarshaller that parses the input String as a Boolean, matching "true", "yes", "on" as true, and "false", "no", "off" as false.
		- #### UUID
		
		
		
		```
		public static final [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​java.util.UUID> UUID
		```
		
		An unmarshaller that parses the input String as a UUID.

	- ### Constructor Detail
	
	
	
		- #### StringUnmarshallers
		
		
		
		```
		public StringUnmarshallers()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallers.html)*