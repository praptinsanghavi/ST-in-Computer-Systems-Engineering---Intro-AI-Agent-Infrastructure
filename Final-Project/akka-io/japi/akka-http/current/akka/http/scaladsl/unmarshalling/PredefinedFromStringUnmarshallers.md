---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
title: PredefinedFromStringUnmarshallers
---

# PredefinedFromStringUnmarshallers

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Interface PredefinedFromStringUnmarshallers

- All Known Implementing Classes:
`[PredefinedFromStringUnmarshallers$](PredefinedFromStringUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling")`, `[StringUnmarshallerPredef$](../../javadsl/unmarshalling/StringUnmarshallerPredef$.html "class in akka.http.javadsl.unmarshalling")`, `[Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling")`

---

```
public interface PredefinedFromStringUnmarshallers
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T>` | `[_fromStringUnmarshallerFromByteStringUnmarshaller](#_fromStringUnmarshallerFromByteStringUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> bsum)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[booleanFromStringUnmarshaller](#booleanFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[byteFromStringUnmarshaller](#byteFromStringUnmarshaller())()` |  |
	| `<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​scala.collection.immutable.Seq<T>>` | `[CsvSeq](#CsvSeq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> unmarshaller)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[doubleFromStringUnmarshaller](#doubleFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[floatFromStringUnmarshaller](#floatFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexByte](#HexByte())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexInt](#HexInt())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexLong](#HexLong())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexShort](#HexShort())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[intFromStringUnmarshaller](#intFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[longFromStringUnmarshaller](#longFromStringUnmarshaller())()` |  |
	| `scala.PartialFunction<java.lang.Throwable,​scala.runtime.Nothing$>` | `[numberFormatError](#numberFormatError(java.lang.String,java.lang.String))​(java.lang.String value,  java.lang.String target)` |  |
	| `<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T>` | `[numberUnmarshaller](#numberUnmarshaller(scala.Function1,java.lang.String))​(scala.Function1<java.lang.String,​T> f,  java.lang.String target)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[shortFromStringUnmarshaller](#shortFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID>` | `[uuidFromStringUnmarshaller](#uuidFromStringUnmarshaller())()` |  |

- - ### Method Detail
	
	
	
		- #### \_fromStringUnmarshallerFromByteStringUnmarshaller
		
		
		
		```
		<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> _fromStringUnmarshallerFromByteStringUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> bsum)
		```
		- #### byteFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> byteFromStringUnmarshaller()
		```
		- #### shortFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> shortFromStringUnmarshaller()
		```
		- #### intFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> intFromStringUnmarshaller()
		```
		- #### longFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> longFromStringUnmarshaller()
		```
		- #### floatFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> floatFromStringUnmarshaller()
		```
		- #### doubleFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> doubleFromStringUnmarshaller()
		```
		- #### booleanFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> booleanFromStringUnmarshaller()
		```
		- #### uuidFromStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> uuidFromStringUnmarshaller()
		```
		- #### CsvSeq
		
		
		
		```
		<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​scala.collection.immutable.Seq<T>> CsvSeq​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> unmarshaller)
		```
		- #### HexByte
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexByte()
		```
		- #### HexShort
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexShort()
		```
		- #### HexInt
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexInt()
		```
		- #### HexLong
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexLong()
		```
		- #### numberUnmarshaller
		
		
		
		```
		<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> numberUnmarshaller​(scala.Function1<java.lang.String,​T> f,
		                                                              java.lang.String target)
		```
		- #### numberFormatError
		
		
		
		```
		scala.PartialFunction<java.lang.Throwable,​scala.runtime.Nothing$> numberFormatError​(java.lang.String value,
		                                                                                          java.lang.String target)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html)*