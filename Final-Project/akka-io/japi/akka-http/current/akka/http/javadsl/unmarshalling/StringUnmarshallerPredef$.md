---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef$.html
title: StringUnmarshallerPredef$
---

# StringUnmarshallerPredef$

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Class StringUnmarshallerPredef$

- java.lang.Object
- - akka.http.javadsl.unmarshalling.StringUnmarshallerPredef$

- All Implemented Interfaces:
`[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

---

```
public class StringUnmarshallerPredef$
extends java.lang.Object
implements [PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StringUnmarshallerPredef$](StringUnmarshallerPredef$.html "class in akka.http.javadsl.unmarshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StringUnmarshallerPredef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[booleanFromStringUnmarshaller](#booleanFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[byteFromStringUnmarshaller](#byteFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[doubleFromStringUnmarshaller](#doubleFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[floatFromStringUnmarshaller](#floatFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexByte](#HexByte())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexInt](#HexInt())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexLong](#HexLong())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexShort](#HexShort())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[intFromStringUnmarshaller](#intFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[longFromStringUnmarshaller](#longFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[shortFromStringUnmarshaller](#shortFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID>` | `[uuidFromStringUnmarshaller](#uuidFromStringUnmarshaller())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[_fromStringUnmarshallerFromByteStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#_fromStringUnmarshallerFromByteStringUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [CsvSeq](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#CsvSeq(akka.http.scaladsl.unmarshalling.Unmarshaller)), [numberFormatError](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#numberFormatError(java.lang.String,java.lang.String)), [numberUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#numberUnmarshaller(scala.Function1,java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StringUnmarshallerPredef$](StringUnmarshallerPredef$.html "class in akka.http.javadsl.unmarshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StringUnmarshallerPredef$
		
		
		
		```
		public StringUnmarshallerPredef$()
		```

	- ### Method Detail
	
	
	
		- #### byteFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> byteFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[byteFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#byteFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### shortFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> shortFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[shortFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#shortFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### intFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> intFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[intFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#intFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### longFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> longFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[longFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#longFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### floatFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> floatFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[floatFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#floatFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### doubleFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> doubleFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[doubleFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#doubleFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### booleanFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> booleanFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[booleanFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#booleanFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### uuidFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> uuidFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[uuidFromStringUnmarshaller](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#uuidFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexByte
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexByte()
		```
		
		
		Specified by:
		`[HexByte](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexByte())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexShort
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexShort()
		```
		
		
		Specified by:
		`[HexShort](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexShort())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexInt
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexInt()
		```
		
		
		Specified by:
		`[HexInt](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexInt())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexLong
		
		
		
		```
		public [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexLong()
		```
		
		
		Specified by:
		`[HexLong](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexLong())` in interface `[PredefinedFromStringUnmarshallers](../../scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef$.html)*