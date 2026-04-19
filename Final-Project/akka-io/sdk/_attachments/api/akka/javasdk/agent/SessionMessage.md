---
description: 'declaration: package: akka.javasdk.agent, interface: SessionMessage,
  record: UserMessage'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:40Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.UserMessage.html
title: SessionMessage.UserMessage
---

# SessionMessage.UserMessage

> **Summary:** declaration: package: akka.javasdk.agent, interface: SessionMessage, record: UserMessage

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class SessionMessage.UserMessage

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.SessionMessage.UserMessage

All Implemented Interfaces:
`[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")`

Enclosing interface:
`[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")`

---

public static record SessionMessage.UserMessage([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp, [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text, [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")

`[SessionMessage.AiMessage](SessionMessage.AiMessage.html "class in akka.javasdk.agent"), [SessionMessage.MessageContent](SessionMessage.MessageContent.html "interface in akka.javasdk.agent"), [SessionMessage.MultimodalUserMessage](SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent"), [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent"), [SessionMessage.ToolCallRequest](SessionMessage.ToolCallRequest.html "class in akka.javasdk.agent"), [SessionMessage.ToolCallResponse](SessionMessage.ToolCallResponse.html "class in akka.javasdk.agent"), [SessionMessage.UserMessage](SessionMessage.UserMessage.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[UserMessage](#%3Cinit%3E(java.time.Instant,java.lang.String))([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") now,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`
 
`[UserMessage](#%3Cinit%3E(java.time.Instant,java.lang.String,java.lang.String))([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)`

Creates an instance of a `UserMessage` record class.
- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[componentId](#componentId())()`

Returns the value of the `componentId` record component.

`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`int`
`[size](#size())()`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[text](#text())()`

Returns the value of the `text` record component.

`[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")`
`[timestamp](#timestamp())()`

Returns the value of the `timestamp` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### UserMessage
	
	
	public UserMessage([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") now,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	- ### UserMessage
	
	
	public UserMessage([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)
	Creates an instance of a `UserMessage` record class.
	
	Parameters:
	`timestamp` \- the value for the `timestamp` record component
	`text` \- the value for the `text` record component
	`componentId` \- the value for the `componentId` record component
- ## Method Details

	- ### size
	
	
	public int size()
	
	Specified by:
	`[size](SessionMessage.html#size())` in interface `[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")`
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
	- ### timestamp
	
	
	public [Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp()
	Returns the value of the `timestamp` record component.
	
	Returns:
	the value of the `timestamp` record component
	- ### text
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text()
	Returns the value of the `text` record component.
	
	Returns:
	the value of the `text` record component
	- ### componentId
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId()
	Returns the value of the `componentId` record component.
	
	Specified by:
	`[componentId](SessionMessage.html#componentId())` in interface `[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")`
	Returns:
	the value of the `componentId` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.AiMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.MessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.MultimodalUserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.TokenUsage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.ToolCallRequest.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.ToolCallResponse.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.UserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.UserMessage.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.UserMessage.html)*