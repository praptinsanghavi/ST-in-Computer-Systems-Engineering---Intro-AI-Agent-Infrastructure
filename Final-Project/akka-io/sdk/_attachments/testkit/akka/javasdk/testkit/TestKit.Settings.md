---
description: 'declaration: package: akka.javasdk.testkit, class: TestKit, class: Settings,
  enum: EventingSupport'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:23Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.EventingSupport.html
title: TestKit.Settings.EventingSupport
---

# TestKit.Settings.EventingSupport

> **Summary:** declaration: package: akka.javasdk.testkit, class: TestKit, class: Settings, enum: EventingSupport

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Enum Class TestKit.Settings.EventingSupport

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")\>
akka.javasdk.testkit.TestKit.Settings.EventingSupport

All Implemented Interfaces:
`[Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")`, `[Comparable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html "class or interface in java.lang")<[TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")>`, `[Constable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/constant/Constable.html "class or interface in java.lang.constant")`

Enclosing class:
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`

---

public static enum TestKit.Settings.EventingSupport
extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")\>

- ## Nested Class Summary

## Nested classes/interfaces inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[Enum.EnumDesc](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang") extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")>>`
- ## Enum Constant Summary

Enum Constants

Enum Constant
Description
`[GOOGLE_PUBSUB](#GOOGLE_PUBSUB)`

Used if you want to use an external Google PubSub (or its Emulator) on your tests.

`[KAFKA](#KAFKA)`

Used if you want to use an external Kafka broker on your tests.

`[TEST_BROKER](#TEST_BROKER)`

This is the default type used and allows the testing eventing integrations without an
 external broker dependency running.
- ## Method Summary

Modifier and Type
Method
Description
`static [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")`
`[valueOf](#valueOf(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Returns the enum constant of this class with the specified name.

`static [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")[]`
`[values](#values())()`

Returns an array containing the constants of this enum class, in
the order they are declared.

### Methods inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#clone() "class or interface in java.lang"), [compareTo](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#compareTo(E) "class or interface in java.lang"), [describeConstable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#describeConstable() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#finalize() "class or interface in java.lang"), [getDeclaringClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#getDeclaringClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#hashCode() "class or interface in java.lang"), [name](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#name() "class or interface in java.lang"), [ordinal](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#ordinal() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#toString() "class or interface in java.lang"), [valueOf](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#valueOf(java.lang.Class,java.lang.String) "class or interface in java.lang")`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Enum Constant Details

	- ### TEST\_BROKER
	
	
	public static final [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") TEST\_BROKER
	This is the default type used and allows the testing eventing integrations without an
	 external broker dependency running.
	- ### GOOGLE\_PUBSUB
	
	
	public static final [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") GOOGLE\_PUBSUB
	Used if you want to use an external Google PubSub (or its Emulator) on your tests.
	
	 Note: the Google PubSub broker instance needs to be started independently.
	- ### KAFKA
	
	
	public static final [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") KAFKA
	Used if you want to use an external Kafka broker on your tests.
	
	 Note: the Kafka broker instance needs to be started independently.
- ## Method Details

	- ### values
	
	
	public static [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")\[] values()
	Returns an array containing the constants of this enum class, in
	the order they are declared.
	
	Returns:
	an array containing the constants of this enum class, in the order they are declared
	- ### valueOf
	
	
	public static [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") valueOf([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
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

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.EventingSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.EventingSupport.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.EventingSupport.html)*