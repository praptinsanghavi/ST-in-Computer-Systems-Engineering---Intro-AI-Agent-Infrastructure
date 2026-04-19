---
description: 'declaration: package: akka.javasdk, class: JsonMigration'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:48Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonMigration.html
title: JsonMigration
---

# JsonMigration

> **Summary:** declaration: package: akka.javasdk, class: JsonMigration

## Content

Package [akka.javasdk](package-summary.html)
# Class JsonMigration

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.JsonMigration

---

public abstract class JsonMigration
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Allows to specify dedicated strategy for JSON schema evolution.

 It is used when deserializing data of older version than the [`currentVersion()`](#currentVersion()). You implement the transformation of the JSON structure in the
 [`transform(int, com.fasterxml.jackson.databind.JsonNode)`](#transform(int,com.fasterxml.jackson.databind.JsonNode)) method. If you have changed the class name you should add it to
 [`supportedClassNames()`](#supportedClassNames()).

- ## Constructor Summary

Constructors

Constructor
Description
`[JsonMigration](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`abstract int`
`[currentVersion](#currentVersion())()`

Define current version, that is, the value used when serializing new data.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[supportedClassNames](#supportedClassNames())()`

Override this method if you have changed the class name.

`int`
`[supportedForwardVersion](#supportedForwardVersion())()`

Define the supported forward version this migration can read (must be greater or equal than
 `currentVersion`).

`com.fasterxml.jackson.databind.JsonNode`
`[transform](#transform(int,com.fasterxml.jackson.databind.JsonNode))(int fromVersion,
 com.fasterxml.jackson.databind.JsonNode json)`

Implement the transformation of the incoming JSON structure to the current JSON structure.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### JsonMigration
	
	
	public JsonMigration()
- ## Method Details

	- ### currentVersion
	
	
	public abstract int currentVersion()
	Define current version, that is, the value used when serializing new data. The first version,
	 when no migration was used, is always 0\.
	- ### supportedForwardVersion
	
	
	public int supportedForwardVersion()
	Define the supported forward version this migration can read (must be greater or equal than
	 `currentVersion`). If this value is different from [`currentVersion()`](#currentVersion()) a
	 [`transform(int, com.fasterxml.jackson.databind.JsonNode)`](#transform(int,com.fasterxml.jackson.databind.JsonNode)) will be used to downcast the received payload to the current
	 schema.
	- ### transform
	
	
	public com.fasterxml.jackson.databind.JsonNode transform(int fromVersion,
	 com.fasterxml.jackson.databind.JsonNode json)
	Implement the transformation of the incoming JSON structure to the current JSON structure. The
	 `JsonNode` is mutable so you can add and remove fields, or change values. Note that you
	 have to cast to specific sub\-classes such as `ObjectNode` and `ArrayNode` to get
	 access to mutators.
	
	Parameters:
	`fromVersion` \- the version of the old data
	`json` \- the incoming JSON data
	- ### supportedClassNames
	
	
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> supportedClassNames()
	Override this method if you have changed the class name. Return all old class names.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonMigration.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonMigration.html)*