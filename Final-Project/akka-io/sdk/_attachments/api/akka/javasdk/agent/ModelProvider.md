---
description: 'declaration: package: akka.javasdk.agent, interface: ModelProvider,
  record: FromConfig'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:38Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.FromConfig.html
title: ModelProvider.FromConfig
---

# ModelProvider.FromConfig

> **Summary:** declaration: package: akka.javasdk.agent, interface: ModelProvider, record: FromConfig

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class ModelProvider.FromConfig

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.ModelProvider.FromConfig

All Implemented Interfaces:
`[ModelProvider](ModelProvider.html "interface in akka.javasdk.agent")`

Enclosing interface:
`[ModelProvider](ModelProvider.html "interface in akka.javasdk.agent")`

---

public static record ModelProvider.FromConfig([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") configPath)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [ModelProvider](ModelProvider.html "interface in akka.javasdk.agent")

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[ModelProvider](ModelProvider.html "interface in akka.javasdk.agent")

`[ModelProvider.Anthropic](ModelProvider.Anthropic.html "class in akka.javasdk.agent"), [ModelProvider.Bedrock](ModelProvider.Bedrock.html "class in akka.javasdk.agent"), [ModelProvider.Custom](ModelProvider.Custom.html "interface in akka.javasdk.agent"), [ModelProvider.FromConfig](ModelProvider.FromConfig.html "class in akka.javasdk.agent"), [ModelProvider.GoogleAIGemini](ModelProvider.GoogleAIGemini.html "class in akka.javasdk.agent"), [ModelProvider.HuggingFace](ModelProvider.HuggingFace.html "class in akka.javasdk.agent"), [ModelProvider.LocalAI](ModelProvider.LocalAI.html "class in akka.javasdk.agent"), [ModelProvider.Ollama](ModelProvider.Ollama.html "class in akka.javasdk.agent"), [ModelProvider.OpenAi](ModelProvider.OpenAi.html "class in akka.javasdk.agent"), [ModelProvider.VertexAi](ModelProvider.VertexAi.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[FromConfig](#%3Cinit%3E(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") configPath)`

Creates an instance of a `FromConfig` record class.
- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[configPath](#configPath())()`

Returns the value of the `configPath` record component.

`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### FromConfig
	
	
	public FromConfig([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") configPath)
	Creates an instance of a `FromConfig` record class.
	
	Parameters:
	`configPath` \- the value for the `configPath` record component
- ## Method Details

	- ### toString
	
	
	public final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toString()
	Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.
	
	Specified by:
	`[toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#toString() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a string representation of this object
	- ### hashCode
	
	
	public final int hashCode()
	Returns a hash code value for this object. The value is derived from the hash code of each of the record components.
	
	Specified by:
	`[hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#hashCode() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a hash code value for this object
	- ### equals
	
	
	public final boolean equals([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)
	Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object) "class or interface in java.util").
	
	Specified by:
	`[equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#equals(java.lang.Object) "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Parameters:
	`o` \- the object with which to compare
	Returns:
	`true` if this object is the same as the `o` argument; `false` otherwise.
	- ### configPath
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") configPath()
	Returns the value of the `configPath` record component.
	
	Returns:
	the value of the `configPath` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Anthropic.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Bedrock.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Custom.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.FromConfig.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.GoogleAIGemini.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.HuggingFace.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.LocalAI.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Ollama.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.OpenAi.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.VertexAi.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.FromConfig.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.FromConfig.html)*