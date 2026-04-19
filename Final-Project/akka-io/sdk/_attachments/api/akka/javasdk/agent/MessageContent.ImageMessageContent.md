---
description: 'declaration: package: akka.javasdk.agent, interface: MessageContent,
  record: ImageMessageContent, enum: DetailLevel'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:15Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.DetailLevel.html
title: MessageContent.ImageMessageContent.DetailLevel
---

# MessageContent.ImageMessageContent.DetailLevel

> **Summary:** declaration: package: akka.javasdk.agent, interface: MessageContent, record: ImageMessageContent, enum: DetailLevel

## Content

Package [akka.javasdk.agent](package-summary.html)
# Enum Class MessageContent.ImageMessageContent.DetailLevel

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")\>
akka.javasdk.agent.MessageContent.ImageMessageContent.DetailLevel

All Implemented Interfaces:
`[Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")`, `[Comparable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html "class or interface in java.lang")<[MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")>`, `[Constable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/constant/Constable.html "class or interface in java.lang.constant")`

Enclosing class:
`[MessageContent.ImageMessageContent](MessageContent.ImageMessageContent.html "class in akka.javasdk.agent")`

---

public static enum MessageContent.ImageMessageContent.DetailLevel
extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")\>
Controls the level of detail used when processing images.

 The detail level affects both the quality of image analysis and the number of tokens
 consumed by the AI model.

 

Some models might require additional configuration to actually apply this detail level.
 For example, when using Gemini, per\-part image resolution must be enabled via the `akka.javasdk.agent.google-ai-gemini.media-resolution-per-part-enabled` setting.

- ## Nested Class Summary

## Nested classes/interfaces inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[Enum.EnumDesc](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang") extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")>>`
- ## Enum Constant Summary

Enum Constants

Enum Constant
Description
`[AUTO](#AUTO)`

Let the model automatically choose the appropriate detail level.

`[HIGH](#HIGH)`

Higher resolution processing, more detailed analysis but uses more tokens.

`[LOW](#LOW)`

Lower resolution processing, faster and uses fewer tokens.

`[MEDIUM](#MEDIUM)`

Medium resolution processing, balance between detail, cost, and latency.

`[ULTRA_HIGH](#ULTRA_HIGH)`

Ultra\-high resolution processing, highest token count.
- ## Method Summary

Modifier and Type
Method
Description
`static [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")`
`[valueOf](#valueOf(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Returns the enum constant of this class with the specified name.

`static [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")[]`
`[values](#values())()`

Returns an array containing the constants of this enum class, in
the order they are declared.

### Methods inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#clone() "class or interface in java.lang"), [compareTo](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#compareTo(E) "class or interface in java.lang"), [describeConstable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#describeConstable() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#finalize() "class or interface in java.lang"), [getDeclaringClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#getDeclaringClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#hashCode() "class or interface in java.lang"), [name](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#name() "class or interface in java.lang"), [ordinal](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#ordinal() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#toString() "class or interface in java.lang"), [valueOf](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#valueOf(java.lang.Class,java.lang.String) "class or interface in java.lang")`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Enum Constant Details

	- ### LOW
	
	
	public static final [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent") LOW
	Lower resolution processing, faster and uses fewer tokens.
	- ### MEDIUM
	
	
	public static final [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent") MEDIUM
	Medium resolution processing, balance between detail, cost, and latency.
	- ### HIGH
	
	
	public static final [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent") HIGH
	Higher resolution processing, more detailed analysis but uses more tokens.
	- ### ULTRA\_HIGH
	
	
	public static final [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent") ULTRA\_HIGH
	Ultra\-high resolution processing, highest token count.
	- ### AUTO
	
	
	public static final [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent") AUTO
	Let the model automatically choose the appropriate detail level.
- ## Method Details

	- ### values
	
	
	public static [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")\[] values()
	Returns an array containing the constants of this enum class, in
	the order they are declared.
	
	Returns:
	an array containing the constants of this enum class, in the order they are declared
	- ### valueOf
	
	
	public static [MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent") valueOf([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Returns the enum constant of this class with the specified name.
	The string must match *exactly* an identifier used to declare an
	enum constant in this class. (Extraneous whitespace characters are 
	not permitted.)
	
	Parameters:
	`name` \- the name of the enum constant to be returned.
	Returns:
	the enum constant with the specified name
	Throws:
	`[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")` \- if this enum class has no constant with the specified name
	`[NullPointerException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/NullPointerException.html "class or interface in java.lang")` \- if the argument is null

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.DetailLevel.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.DetailLevel.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.DetailLevel.html)*