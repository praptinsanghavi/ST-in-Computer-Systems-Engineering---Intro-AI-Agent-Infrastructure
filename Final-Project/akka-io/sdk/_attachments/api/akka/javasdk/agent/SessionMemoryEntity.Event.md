---
description: 'declaration: package: akka.javasdk.agent, class: SessionMemoryEntity,
  interface: Event, record: UserMessageAdded'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:31Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.UserMessageAdded.html
title: SessionMemoryEntity.Event.UserMessageAdded
---

# SessionMemoryEntity.Event.UserMessageAdded

> **Summary:** declaration: package: akka.javasdk.agent, class: SessionMemoryEntity, interface: Event, record: UserMessageAdded

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class SessionMemoryEntity.Event.UserMessageAdded

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.SessionMemoryEntity.Event.UserMessageAdded

All Implemented Interfaces:
`[SessionMemoryEntity.Event](SessionMemoryEntity.Event.html "interface in akka.javasdk.agent")`

Enclosing interface:
`[SessionMemoryEntity.Event](SessionMemoryEntity.Event.html "interface in akka.javasdk.agent")`

---

public static record SessionMemoryEntity.Event.UserMessageAdded([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp, [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId, [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message, int sizeInBytes)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [SessionMemoryEntity.Event](SessionMemoryEntity.Event.html "interface in akka.javasdk.agent")

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[SessionMemoryEntity.Event](SessionMemoryEntity.Event.html "interface in akka.javasdk.agent")

`[SessionMemoryEntity.Event.AiMessageAdded](SessionMemoryEntity.Event.AiMessageAdded.html "class in akka.javasdk.agent"), [SessionMemoryEntity.Event.Deleted](SessionMemoryEntity.Event.Deleted.html "class in akka.javasdk.agent"), [SessionMemoryEntity.Event.HistoryCleared](SessionMemoryEntity.Event.HistoryCleared.html "class in akka.javasdk.agent"), [SessionMemoryEntity.Event.LimitedWindowSet](SessionMemoryEntity.Event.LimitedWindowSet.html "class in akka.javasdk.agent"), [SessionMemoryEntity.Event.MultimodalUserMessageAdded](SessionMemoryEntity.Event.MultimodalUserMessageAdded.html "class in akka.javasdk.agent"), [SessionMemoryEntity.Event.ToolResponseMessageAdded](SessionMemoryEntity.Event.ToolResponseMessageAdded.html "class in akka.javasdk.agent"), [SessionMemoryEntity.Event.UserMessageAdded](SessionMemoryEntity.Event.UserMessageAdded.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[UserMessageAdded](#%3Cinit%3E(java.time.Instant,java.lang.String,java.lang.String,int))([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message,
 int sizeInBytes)`

Creates an instance of a `UserMessageAdded` record class.
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

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[message](#message())()`

Returns the value of the `message` record component.

`int`
`[sizeInBytes](#sizeInBytes())()`

Returns the value of the `sizeInBytes` record component.

`[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")`
`[timestamp](#timestamp())()`

Returns the value of the `timestamp` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### UserMessageAdded
	
	
	public UserMessageAdded([Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") timestamp,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message,
	 int sizeInBytes)
	Creates an instance of a `UserMessageAdded` record class.
	
	Parameters:
	`timestamp` \- the value for the `timestamp` record component
	`componentId` \- the value for the `componentId` record component
	`message` \- the value for the `message` record component
	`sizeInBytes` \- the value for the `sizeInBytes` record component
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
	Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object) "class or interface in java.util"); primitive components are compared with '\=\='.
	
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
	- ### componentId
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId()
	Returns the value of the `componentId` record component.
	
	Returns:
	the value of the `componentId` record component
	- ### message
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message()
	Returns the value of the `message` record component.
	
	Returns:
	the value of the `message` record component
	- ### sizeInBytes
	
	
	public int sizeInBytes()
	Returns the value of the `sizeInBytes` record component.
	
	Returns:
	the value of the `sizeInBytes` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.AiMessageAdded.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.Deleted.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.HistoryCleared.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.LimitedWindowSet.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.MultimodalUserMessageAdded.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.ToolResponseMessageAdded.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.UserMessageAdded.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.UserMessageAdded.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.Event.UserMessageAdded.html)*