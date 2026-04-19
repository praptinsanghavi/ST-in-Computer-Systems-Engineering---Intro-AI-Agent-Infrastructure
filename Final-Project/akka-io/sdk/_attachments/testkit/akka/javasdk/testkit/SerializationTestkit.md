---
description: 'declaration: package: akka.javasdk.testkit, class: SerializationTestkit'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:17Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SerializationTestkit.html
title: SerializationTestkit
---

# SerializationTestkit

> **Summary:** declaration: package: akka.javasdk.testkit, class: SerializationTestkit

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class SerializationTestkit

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.SerializationTestkit

---

public final class SerializationTestkit
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Helper class for serializing and deserializing objects for testing schema migration. Supports
 both JSON and Protobuf serialization formats.

- ## Constructor Summary

Constructors

Constructor
Description
`[SerializationTestkit](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`static <T> T`
`[deserialize](#deserialize(java.lang.Class,byte%5B%5D))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> valueClass,
 byte[] bytes)`

Deserialize bytes to the expected type.

`static <T> byte[]`
`[serialize](#serialize(T))(T value)`

Serialize a value to bytes.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### SerializationTestkit
	
	
	public SerializationTestkit()
- ## Method Details

	- ### serialize
	
	
	public static \<T\> byte\[] serialize(T value)
	Serialize a value to bytes. Automatically uses protobuf format for protobuf messages and JSON
	 format for other types.
	- ### deserialize
	
	
	public static \<T\> T deserialize([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> valueClass,
	 byte\[] bytes)
	Deserialize bytes to the expected type. Automatically detects the content type and uses the
	 appropriate deserializer.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SerializationTestkit.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SerializationTestkit.html)*