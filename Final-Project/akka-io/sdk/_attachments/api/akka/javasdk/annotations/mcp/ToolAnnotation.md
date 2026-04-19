---
description: 'declaration: package: akka.javasdk.annotations.mcp, enum: ToolAnnotation'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:16Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/ToolAnnotation.html
title: ToolAnnotation
---

# ToolAnnotation

> **Summary:** declaration: package: akka.javasdk.annotations.mcp, enum: ToolAnnotation

## Content

Package [akka.javasdk.annotations.mcp](package-summary.html)
# Enum Class ToolAnnotation

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")\>
akka.javasdk.annotations.mcp.ToolAnnotation

All Implemented Interfaces:
`[Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")`, `[Comparable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html "class or interface in java.lang")<[ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")>`, `[Constable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/constant/Constable.html "class or interface in java.lang.constant")`

---

public enum ToolAnnotation
extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")\<[ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")\>
Behavioral annotations that describe MCP tool characteristics to clients.

 These annotations provide hints about tool behavior to help AI models make informed decisions
 about when and how to use tools. They describe properties like whether a tool modifies data, can
 be called repeatedly safely, or interacts with external systems.

 

**Usage:** Apply these annotations to [`McpTool`](McpTool.html "annotation interface in akka.javasdk.annotations.mcp") methods via the [`McpTool.annotations()`](McpTool.html#annotations()) attribute to help clients understand tool behavior patterns.

 

**Security Note:** All values are **hints only** and are not
 guaranteed to provide a faithful description of actual tool behavior. Clients should never make
 security\-critical tool use decisions based on ToolAnnotations received from untrusted servers.

 

**Annotation Pairs:** Annotations are defined as opposites to allow clear
 specification in Java annotations:

 

- [`Destructive`](#Destructive) vs [`NonDestructive`](#NonDestructive)
- [`Idempotent`](#Idempotent) vs [`NonIdempotent`](#NonIdempotent)
- [`OpenWorld`](#OpenWorld) vs [`ClosedWorld`](#ClosedWorld)
- [`ReadOnly`](#ReadOnly) vs [`Mutating`](#Mutating)

- ## Nested Class Summary

## Nested classes/interfaces inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[Enum.EnumDesc](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang") extends [Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")<[E](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.EnumDesc.html "class or interface in java.lang")>>`
- ## Enum Constant Summary

Enum Constants

Enum Constant
Description
`[ClosedWorld](#ClosedWorld)`

The tool's domain of interaction is closed.

`[Destructive](#Destructive)`

The tool may perform destructive updates to its environment.

`[Idempotent](#Idempotent)`

Calling the tool repeatedly with the same arguments will have no additional effect on the
 environment.

`[Mutating](#Mutating)`

The tool does modify its environment.

`[NonDestructive](#NonDestructive)`

If false, the tool performs only additive updates.

`[NonIdempotent](#NonIdempotent)`

Calling the tool repeatedly with the same arguments will affect the environment each time.

`[OpenWorld](#OpenWorld)`

This tool may interact with an \\"open world\\" of external entities.

`[ReadOnly](#ReadOnly)`

The tool does not modify its environment.
- ## Method Summary

Modifier and Type
Method
Description
`static [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")`
`[valueOf](#valueOf(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Returns the enum constant of this class with the specified name.

`static [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")[]`
`[values](#values())()`

Returns an array containing the constants of this enum class, in
the order they are declared.

### Methods inherited from class java.lang.[Enum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#clone() "class or interface in java.lang"), [compareTo](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#compareTo(E) "class or interface in java.lang"), [describeConstable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#describeConstable() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#finalize() "class or interface in java.lang"), [getDeclaringClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#getDeclaringClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#hashCode() "class or interface in java.lang"), [name](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#name() "class or interface in java.lang"), [ordinal](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#ordinal() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#toString() "class or interface in java.lang"), [valueOf](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html#valueOf(java.lang.Class,java.lang.String) "class or interface in java.lang")`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Enum Constant Details

	- ### Destructive
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") Destructive
	The tool may perform destructive updates to its environment. Opposite of "NonDestructive".
	- ### NonDestructive
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") NonDestructive
	If false, the tool performs only additive updates. Opposite of "Destructive".
	- ### Idempotent
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") Idempotent
	Calling the tool repeatedly with the same arguments will have no additional effect on the
	 environment. Opposite of "NonIdempotent".
	- ### NonIdempotent
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") NonIdempotent
	Calling the tool repeatedly with the same arguments will affect the environment each time.
	 Opposite of "Idempotent".
	- ### OpenWorld
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") OpenWorld
	This tool may interact with an \\"open world\\" of external entities. Opposite of "ClosedWorld".
	
	 For example, the world of a web search tool is open.
	- ### ClosedWorld
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") ClosedWorld
	The tool's domain of interaction is closed. Opposite of "OpenWorld".
	
	 For example, a memory tool is non\-open\-world
	- ### ReadOnly
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") ReadOnly
	The tool does not modify its environment. Opposite of "Mutating"
	- ### Mutating
	
	
	public static final [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") Mutating
	The tool does modify its environment. Opposite of "ReadOnly".
- ## Method Details

	- ### values
	
	
	public static [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")\[] values()
	Returns an array containing the constants of this enum class, in
	the order they are declared.
	
	Returns:
	an array containing the constants of this enum class, in the order they are declared
	- ### valueOf
	
	
	public static [ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") valueOf([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
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

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpTool.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/ToolAnnotation.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/ToolAnnotation.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/ToolAnnotation.html)*