---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaSerializationDeserializer.html
title: AkkaSerializationDeserializer
---

# AkkaSerializationDeserializer

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class AkkaSerializationDeserializer

- java.lang.Object
- - com.fasterxml.jackson.databind.JsonDeserializer\<T\>
	- - com.fasterxml.jackson.databind.deser.std.StdDeserializer\<T\>
		- - com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer\<java.lang.Object\>
			- - akka.serialization.jackson.AkkaSerializationDeserializer

- All Implemented Interfaces:
`[ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson")`, `com.fasterxml.jackson.databind.deser.NullValueProvider`, `com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable`, `java.io.Serializable`

---

```
public final class AkkaSerializationDeserializer
extends com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer<java.lang.Object>
implements [ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson")
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.serialization.jackson.AkkaSerializationDeserializer)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class com.fasterxml.jackson.databind.JsonDeserializer
		
		
		`com.fasterxml.jackson.databind.JsonDeserializer.None`

	- ### Field Summary
	
	
		- ### Fields inherited from class com.fasterxml.jackson.databind.deser.std.StdDeserializer
		
		
		`_valueClass, _valueType, F_MASK_ACCEPT_ARRAYS, F_MASK_INT_COERCIONS`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaSerializationDeserializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[deserialize](#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext))​(com.fasterxml.jackson.core.JsonParser jp,  com.fasterxml.jackson.databind.DeserializationContext ctxt)` |  |
	| `[Serialization](../Serialization.html "class in akka.serialization")` | `[serialization](#serialization())()` |  |
	
	
		- ### Methods inherited from class com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer
		
		
		`deserialize, deserializeWithType, getEmptyAccessPattern, getNullAccessPattern, logicalType, supportsUpdate`
		- ### Methods inherited from class com.fasterxml.jackson.databind.deser.std.StdDeserializer
		
		
		`_byteOverflow, _checkBooleanToStringCoercion, _checkCoercionFail, _checkDoubleSpecialValue, _checkFloatSpecialValue, _checkFloatToIntCoercion, _checkFloatToStringCoercion, _checkFromStringCoercion, _checkFromStringCoercion, _checkIntToFloatCoercion, _checkIntToStringCoercion, _checkTextualNull, _checkToStringCoercion, _coerceBooleanFromInt, _coercedTypeDesc, _coercedTypeDesc, _coerceEmptyString, _coerceIntegral, _coerceNullToken, _coerceTextualNull, _deserializeFromArray, _deserializeFromEmpty, _deserializeFromEmptyString, _deserializeFromString, _deserializeWrappedValue, _failDoubleToIntCoercion, _findCoercionFromBlankString, _findCoercionFromEmptyArray, _findCoercionFromEmptyString, _findNullProvider, _hasTextualNull, _intOverflow, _isBlank, _isEmptyOrTextualNull, _isFalse, _isIntNumber, _isNaN, _isNegInf, _isPosInf, _isTrue, _neitherNull, _nonNullNumber, _parseBoolean, _parseBooleanFromInt, _parseBooleanPrimitive, _parseBooleanPrimitive, _parseBytePrimitive, _parseDate, _parseDate, _parseDateFromArray, _parseDouble, _parseDouble, _parseDoublePrimitive, _parseDoublePrimitive, _parseDoublePrimitive, _parseFloatPrimitive, _parseFloatPrimitive, _parseFloatPrimitive, _parseInteger, _parseInteger, _parseIntPrimitive, _parseIntPrimitive, _parseLong, _parseLong, _parseLongPrimitive, _parseLongPrimitive, _parseShortPrimitive, _parseString, _parseString, _reportFailedNullCoerce, _shortOverflow, _verifyEndArrayForSingle, _verifyNullForPrimitive, _verifyNullForPrimitiveCoercion, _verifyNullForScalarCoercion, _verifyNumberForScalarCoercion, _verifyStringForScalarCoercion, findContentNullProvider, findContentNullStyle, findConvertingContentDeserializer, findDeserializer, findFormatFeature, findFormatOverrides, findValueNullProvider, getValueClass, getValueInstantiator, getValueType, getValueType, handledType, handleMissingEndArrayForSingle, handleNestedArrayForSingle, handleUnknownProperty, isDefaultDeserializer, isDefaultKeyDeserializer`
		- ### Methods inherited from class com.fasterxml.jackson.databind.JsonDeserializer
		
		
		`deserializeWithType, findBackReference, getAbsentValue, getDelegatee, getEmptyValue, getEmptyValue, getKnownPropertyNames, getNullValue, getNullValue, getObjectIdReader, isCachable, replaceDelegatee, unwrappingDeserializer`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.jackson.[ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson")
		
		
		`[currentSystem](ActorSystemAccess.html#currentSystem())`

- - ### Constructor Detail
	
	
	
		- #### AkkaSerializationDeserializer
		
		
		
		```
		public AkkaSerializationDeserializer()
		```

	- ### Method Detail
	
	
	
		- #### deserialize
		
		
		
		```
		public java.lang.Object deserialize​(com.fasterxml.jackson.core.JsonParser jp,
		                                    com.fasterxml.jackson.databind.DeserializationContext ctxt)
		```
		
		
		Specified by:
		`deserialize` in class `com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>`
		- #### serialization
		
		
		
		```
		public [Serialization](../Serialization.html "class in akka.serialization") serialization()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/ActorSystemAccess.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaSerializationDeserializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaSerializationDeserializer.html)*