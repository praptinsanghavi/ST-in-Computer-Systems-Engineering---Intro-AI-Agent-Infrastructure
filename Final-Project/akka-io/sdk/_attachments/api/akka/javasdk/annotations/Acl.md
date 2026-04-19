---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Acl,
  enum: Principal'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:02Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.Principal.html
title: Acl.Principal
---

# Acl.Principal

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Acl, enum: Principal

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Enum Class Acl.Principal

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")\>
akka.javasdk.annotations.Acl.Principal

All Implemented Interfaces:
`[Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")`, `[Comparable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html "class or interface in java.lang")<[Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")>`, `[Constable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/constant/Constable.html "class or interface in java.lang.constant")`

Enclosing class:
`[Acl](Acl.html "annotation interface in akka.javasdk.annotations")`

---

public static enum Acl.Principal
extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")\>
This enum contains principal matchers that don't have any configuration, such as a name,
 associated with them, for ease of reference in annotations.

- ## Nested Class Summary

## Nested classes/interfaces inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[Enum.EnumDesc](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang") extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")>>`
- ## Enum Constant Summary

Enum Constants

Enum Constant
Description
`[ALL](#ALL)`

All (or no) principals.

`[INTERNET](#INTERNET)`

The internet.

`[UNSPECIFIED](#UNSPECIFIED)`
- ## Method Summary

Modifier and Type
Method
Description
`static [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")`
`[valueOf](#valueOf(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Returns the enum constant of this class with the specified name.

`static [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")[]`
`[values](#values())()`

Returns an array containing the constants of this enum class, in
the order they are declared.

### Methods inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#clone() "class or interface in java.lang"), [compareTo](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#compareTo(E) "class or interface in java.lang"), [describeConstable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#describeConstable() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#finalize() "class or interface in java.lang"), [getDeclaringClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#getDeclaringClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#hashCode() "class or interface in java.lang"), [name](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#name() "class or interface in java.lang"), [ordinal](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#ordinal() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#toString() "class or interface in java.lang"), [valueOf](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#valueOf(java.lang.Class,java.lang.String) "class or interface in java.lang")`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Enum Constant Details

	- ### UNSPECIFIED
	
	
	public static final [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations") UNSPECIFIED
	- ### ALL
	
	
	public static final [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations") ALL
	All (or no) principals. This matches all requests regardless of what principals are
	 associated with it.
	- ### INTERNET
	
	
	public static final [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations") INTERNET
	The internet. This will match all requests that originated from the internet, and passed
	 through the ingress via a configured route.
- ## Method Details

	- ### values
	
	
	public static [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")\[] values()
	Returns an array containing the constants of this enum class, in
	the order they are declared.
	
	Returns:
	an array containing the constants of this enum class, in the order they are declared
	- ### valueOf
	
	
	public static [Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations") valueOf([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
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

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.Principal.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.Principal.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.Principal.html)*