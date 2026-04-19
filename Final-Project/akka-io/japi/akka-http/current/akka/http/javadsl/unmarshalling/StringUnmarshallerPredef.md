---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef.html
title: StringUnmarshallerPredef
---

# StringUnmarshallerPredef

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Class StringUnmarshallerPredef

- java.lang.Object
- - akka.http.javadsl.unmarshalling.StringUnmarshallerPredef

- ---

```
public class StringUnmarshallerPredef
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StringUnmarshallerPredef](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T>` | `[_fromStringUnmarshallerFromByteStringUnmarshaller](#_fromStringUnmarshallerFromByteStringUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> bsum)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$booleanFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$booleanFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$byteFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$byteFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$doubleFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$doubleFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$floatFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$floatFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexByte_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexByte_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexInt_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexInt_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexLong_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexLong_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexShort_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexShort_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$intFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$intFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$longFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$longFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$shortFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$shortFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$uuidFromStringUnmarshaller_$eq](#akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$uuidFromStringUnmarshaller_$eq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> x$1)` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[booleanFromStringUnmarshaller](#booleanFromStringUnmarshaller())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[byteFromStringUnmarshaller](#byteFromStringUnmarshaller())()` |  |
	| `static <T> [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​scala.collection.immutable.Seq<T>>` | `[CsvSeq](#CsvSeq(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> unmarshaller)` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[doubleFromStringUnmarshaller](#doubleFromStringUnmarshaller())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[floatFromStringUnmarshaller](#floatFromStringUnmarshaller())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexByte](#HexByte())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexInt](#HexInt())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexLong](#HexLong())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexShort](#HexShort())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[intFromStringUnmarshaller](#intFromStringUnmarshaller())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[longFromStringUnmarshaller](#longFromStringUnmarshaller())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[shortFromStringUnmarshaller](#shortFromStringUnmarshaller())()` |  |
	| `static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID>` | `[uuidFromStringUnmarshaller](#uuidFromStringUnmarshaller())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StringUnmarshallerPredef
		
		
		
		```
		public StringUnmarshallerPredef()
		```

	- ### Method Detail
	
	
	
		- #### byteFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> byteFromStringUnmarshaller()
		```
		- #### shortFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> shortFromStringUnmarshaller()
		```
		- #### intFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> intFromStringUnmarshaller()
		```
		- #### longFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> longFromStringUnmarshaller()
		```
		- #### floatFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> floatFromStringUnmarshaller()
		```
		- #### doubleFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> doubleFromStringUnmarshaller()
		```
		- #### booleanFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> booleanFromStringUnmarshaller()
		```
		- #### uuidFromStringUnmarshaller
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> uuidFromStringUnmarshaller()
		```
		- #### HexByte
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexByte()
		```
		- #### HexShort
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexShort()
		```
		- #### HexInt
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexInt()
		```
		- #### HexLong
		
		
		
		```
		public static [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexLong()
		```
		- #### \_fromStringUnmarshallerFromByteStringUnmarshaller
		
		
		
		```
		public static <T> [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> _fromStringUnmarshallerFromByteStringUnmarshaller​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> bsum)
		```
		- #### CsvSeq
		
		
		
		```
		public static <T> [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​scala.collection.immutable.Seq<T>> CsvSeq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> unmarshaller)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$byteFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$byteFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$shortFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$shortFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$intFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$intFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$longFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$longFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$floatFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$floatFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$doubleFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$doubleFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$booleanFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$booleanFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$uuidFromStringUnmarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$uuidFromStringUnmarshaller_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$HexByte\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexByte_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$HexShort\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexShort_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$HexInt\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexInt_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```
		- #### akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$\_setter\_$HexLong\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$unmarshalling$PredefinedFromStringUnmarshallers$_setter_$HexLong_$eq​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallerPredef.html)*