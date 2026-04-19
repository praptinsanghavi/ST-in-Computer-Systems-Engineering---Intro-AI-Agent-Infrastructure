---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
title: PredefinedFromStringUnmarshallers$
---

# PredefinedFromStringUnmarshallers$

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Class PredefinedFromStringUnmarshallers$

- java.lang.Object
- - akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers$

- All Implemented Interfaces:
`[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

---

```
public class PredefinedFromStringUnmarshallers$
extends java.lang.Object
implements [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PredefinedFromStringUnmarshallers$](PredefinedFromStringUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PredefinedFromStringUnmarshallers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[booleanFromStringUnmarshaller](#booleanFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[byteFromStringUnmarshaller](#byteFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[doubleFromStringUnmarshaller](#doubleFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[floatFromStringUnmarshaller](#floatFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexByte](#HexByte())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexInt](#HexInt())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexLong](#HexLong())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexShort](#HexShort())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[intFromStringUnmarshaller](#intFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[longFromStringUnmarshaller](#longFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[shortFromStringUnmarshaller](#shortFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID>` | `[uuidFromStringUnmarshaller](#uuidFromStringUnmarshaller())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[_fromStringUnmarshallerFromByteStringUnmarshaller](PredefinedFromStringUnmarshallers.html#_fromStringUnmarshallerFromByteStringUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [CsvSeq](PredefinedFromStringUnmarshallers.html#CsvSeq(akka.http.scaladsl.unmarshalling.Unmarshaller)), [numberFormatError](PredefinedFromStringUnmarshallers.html#numberFormatError(java.lang.String,java.lang.String)), [numberUnmarshaller](PredefinedFromStringUnmarshallers.html#numberUnmarshaller(scala.Function1,java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PredefinedFromStringUnmarshallers$](PredefinedFromStringUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PredefinedFromStringUnmarshallers$
		
		
		
		```
		public PredefinedFromStringUnmarshallers$()
		```

	- ### Method Detail
	
	
	
		- #### byteFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> byteFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[byteFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#byteFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### shortFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> shortFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[shortFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#shortFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### intFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> intFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[intFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#intFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### longFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> longFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[longFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#longFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### floatFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> floatFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[floatFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#floatFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### doubleFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> doubleFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[doubleFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#doubleFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### booleanFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> booleanFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[booleanFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#booleanFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### uuidFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> uuidFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[uuidFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#uuidFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexByte
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexByte()
		```
		
		
		Specified by:
		`[HexByte](PredefinedFromStringUnmarshallers.html#HexByte())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexShort
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexShort()
		```
		
		
		Specified by:
		`[HexShort](PredefinedFromStringUnmarshallers.html#HexShort())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexInt
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexInt()
		```
		
		
		Specified by:
		`[HexInt](PredefinedFromStringUnmarshallers.html#HexInt())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexLong
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexLong()
		```
		
		
		Specified by:
		`[HexLong](PredefinedFromStringUnmarshallers.html#HexLong())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html)*