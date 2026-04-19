---
description: 'declaration: package: akka.javasdk, class: JsonSupport'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:47Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonSupport.html
title: JsonSupport
---

# JsonSupport

> **Summary:** declaration: package: akka.javasdk, class: JsonSupport

## Content

Package [akka.javasdk](package-summary.html)
# Class JsonSupport

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.JsonSupport

---

public final class JsonSupport
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

- ## Method Summary

Modifier and Type
Method
Description
`static <T> T`
`[decodeJson](#decodeJson(java.lang.Class,byte%5B%5D))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 byte[] bytes)`

Decode the given bytes to an instance of T using Jackson.

`static <T> T`
`[decodeJson](#decodeJson(java.lang.Class,akka.util.ByteString))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 akka.util.ByteString bytes)`

Decode the given bytes to an instance of T using Jackson.

`static <T> T`
`[decodeJson](#decodeJson(java.lang.Class,com.google.protobuf.Any))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 com.google.protobuf.Any any)`

Deprecated.
Protobuf Any with JSON is not supported

`static <T> [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<T>`
`[decodeJson](#decodeJson(java.lang.Class,java.lang.String,com.google.protobuf.Any))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") jsonType,
 com.google.protobuf.Any any)`

Deprecated.
Protobuf Any with JSON is not supported

`static <T,
C extends [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")<T>>  
C`
`[decodeJsonCollection](#decodeJsonCollection(java.lang.Class,java.lang.Class,byte%5B%5D))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<C> collectionType,
 byte[] bytes)`

Deprecated.
was only intended for internal use

`static <T,
C extends [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")<T>>  
C`
`[decodeJsonCollection](#decodeJsonCollection(java.lang.Class,java.lang.Class,akka.util.ByteString))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<C> collectionType,
 akka.util.ByteString bytes)`

Deprecated.
was only intended for internal use

`static <T,
C extends [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")<T>>  
C`
`[decodeJsonCollection](#decodeJsonCollection(java.lang.Class,java.lang.Class,com.google.protobuf.Any))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<C> collectionType,
 com.google.protobuf.Any any)`

Deprecated.
Protobuf Any with JSON is not supported

`static akka.util.ByteString`
`[encodeDynamicCollectionToAkkaByteString](#encodeDynamicCollectionToAkkaByteString(java.lang.String,java.util.Collection))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
 [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")<?> values)`

Deprecated.
was only intended for internal use

`static akka.util.ByteString`
`[encodeDynamicToAkkaByteString](#encodeDynamicToAkkaByteString(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value)`

Deprecated.
was only intended for internal use

`static <T> com.google.protobuf.Any`
`[encodeJson](#encodeJson(T))(T value)`

Deprecated.
Protobuf Any with JSON is not supported

`static <T> com.google.protobuf.Any`
`[encodeJson](#encodeJson(T,java.lang.String))(T value,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") jsonType)`

Deprecated.
Protobuf Any with JSON is not supported

`static <T> akka.util.ByteString`
`[encodeToAkkaByteString](#encodeToAkkaByteString(T))(T value)`

Encode the given value as JSON using Jackson.

`static <T> com.google.protobuf.ByteString`
`[encodeToBytes](#encodeToBytes(T))(T value)`

Deprecated.
Use encodeToAkkaByteString

`static <T> [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[encodeToString](#encodeToString(T))(T value)`

Encode the given value as JSON using Jackson.

`static com.fasterxml.jackson.databind.ObjectMapper`
`[getObjectMapper](#getObjectMapper())()`

The Jackson ObjectMapper that is used for encoding and decoding JSON for HTTP endpoints and
 HTTP requests.

`static <T> T`
`[parseBytes](#parseBytes(byte%5B%5D,java.lang.Class))(byte[] bytes,
 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass)`

Deprecated.
Use decodeJson

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Method Details

	- ### getObjectMapper
	
	
	public static com.fasterxml.jackson.databind.ObjectMapper getObjectMapper()
	The Jackson ObjectMapper that is used for encoding and decoding JSON for HTTP endpoints and
	 HTTP requests.
	
	 You may adjust its configuration, but that must only be performed before starting the
	 service, from [`ServiceSetup.onStartup()`](ServiceSetup.html#onStartup()).
	- ### encodeJson
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T\> com.google.protobuf.Any encodeJson(T value)
	Deprecated.
	Protobuf Any with JSON is not supported
	
	Encode the given value as JSON using Jackson and put the encoded string as bytes in a protobuf
	 Any with the type URL `"json.akka.io/[valueClassName]"`.
	
	 Note that if the serialized Any is published to a pub/sub topic that is consumed by an
	 external service using the class name suffix this introduces coupling as the internal class
	 name of this service becomes known to the outside of the service (and for exampe renaming it
	 may break existing consumers). For such cases consider using the overload with an explicit name
	 for the JSON type instead.
	- ### encodeJson
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T\> com.google.protobuf.Any encodeJson(T value,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") jsonType)
	Deprecated.
	Protobuf Any with JSON is not supported
	
	Encode the given value as JSON using Jackson and put the encoded string as bytes in a protobuf
	 Any with the type URL `"json.akka.io/[jsonType]"`.
	
	Parameters:
	`value` \- the object to encode as JSON, must be an instance of a class properly annotated
	 with the needed Jackson annotations.
	`jsonType` \- A discriminator making it possible to identify which type of object is in the
	 JSON, useful for example when multiple different objects are passed through a pub/sub
	 topic.
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the given value cannot be turned into JSON
	- ### encodeToBytes
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T\> com.google.protobuf.ByteString encodeToBytes(T value)
	 throws com.fasterxml.jackson.core.JsonProcessingException
	Deprecated.
	Use encodeToAkkaByteString
	
	
	Throws:
	`com.fasterxml.jackson.core.JsonProcessingException`
	- ### encodeToAkkaByteString
	
	
	public static \<T\> akka.util.ByteString encodeToAkkaByteString(T value)
	Encode the given value as JSON using Jackson.
	
	Parameters:
	`value` \- the object to encode as JSON, must be an instance of a class properly annotated
	 with the needed Jackson annotations.
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the given value cannot be turned into JSON
	- ### encodeToString
	
	
	public static \<T\> [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") encodeToString(T value)
	Encode the given value as JSON using Jackson.
	
	Parameters:
	`value` \- the object to encode as JSON, must be an instance of a class properly annotated
	 with the needed Jackson annotations.
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the given value cannot be turned into JSON
	- ### encodeDynamicToAkkaByteString
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static akka.util.ByteString encodeDynamicToAkkaByteString([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value)
	Deprecated.
	was only intended for internal use
	- ### encodeDynamicCollectionToAkkaByteString
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static akka.util.ByteString encodeDynamicCollectionToAkkaByteString([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
	 [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")\<?\> values)
	Deprecated.
	was only intended for internal use
	- ### decodeJson
	
	
	public static \<T\> T decodeJson([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 akka.util.ByteString bytes)
	Decode the given bytes to an instance of T using Jackson. The bytes must be the JSON string as
	 bytes.
	
	Parameters:
	`valueClass` \- The type of class to deserialize the object to, the class must have the
	 proper Jackson annotations for deserialization.
	`bytes` \- The bytes to deserialize.
	Returns:
	The decoded object
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the given value cannot be decoded to a T
	- ### decodeJson
	
	
	public static \<T\> T decodeJson([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 byte\[] bytes)
	Decode the given bytes to an instance of T using Jackson. The bytes must be the JSON string as
	 bytes.
	
	Parameters:
	`valueClass` \- The type of class to deserialize the object to, the class must have the
	 proper Jackson annotations for deserialization.
	`bytes` \- The bytes to deserialize.
	Returns:
	The decoded object
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the given value cannot be decoded to a T
	- ### decodeJson
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T\> T decodeJson([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 com.google.protobuf.Any any)
	Deprecated.
	Protobuf Any with JSON is not supported
	
	Decode the given protobuf Any object to an instance of T using Jackson. The object must have
	 the JSON string as bytes as value and a type URL starting with "json.akka.io/".
	
	Parameters:
	`valueClass` \- The type of class to deserialize the object to, the class must have the
	 proper Jackson annotations for deserialization.
	`any` \- The protobuf Any object to deserialize.
	Returns:
	The decoded object
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the given value cannot be decoded to a T
	- ### parseBytes
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T\> T parseBytes(byte\[] bytes,
	 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass)
	 throws [IOException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/IOException.html "class or interface in java.io")
	Deprecated.
	Use decodeJson
	
	
	Throws:
	`[IOException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/IOException.html "class or interface in java.io")`
	- ### decodeJsonCollection
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T,
	C extends [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")\<T\>\> C decodeJsonCollection([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<C\> collectionType,
	 com.google.protobuf.Any any)
	Deprecated.
	Protobuf Any with JSON is not supported
	- ### decodeJsonCollection
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T,
	C extends [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")\<T\>\> C decodeJsonCollection([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<C\> collectionType,
	 akka.util.ByteString bytes)
	Deprecated.
	was only intended for internal use
	- ### decodeJsonCollection
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T,
	C extends [Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")\<T\>\> C decodeJsonCollection([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 [Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<C\> collectionType,
	 byte\[] bytes)
	Deprecated.
	was only intended for internal use
	- ### decodeJson
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	public static \<T\> [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<T\> decodeJson([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") jsonType,
	 com.google.protobuf.Any any)
	Deprecated.
	Protobuf Any with JSON is not supported
	
	Decode the given protobuf Any to an instance of T using Jackson but only if the suffix of the
	 type URL matches the given jsonType.
	
	Returns:
	An Optional containing the successfully decoded value or an empty Optional if the type
	 suffix does not match.
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if the suffix matches but the Any cannot be parsed into a T

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonSupport.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonSupport.html)*