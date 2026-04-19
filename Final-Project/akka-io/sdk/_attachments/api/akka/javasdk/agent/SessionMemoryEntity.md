---
description: 'declaration: package: akka.javasdk.agent, class: SessionMemoryEntity,
  record: State'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:33Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.State.html
title: SessionMemoryEntity.State
---

# SessionMemoryEntity.State

> **Summary:** declaration: package: akka.javasdk.agent, class: SessionMemoryEntity, record: State

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class SessionMemoryEntity.State

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.SessionMemoryEntity.State

Enclosing class:
`[SessionMemoryEntity](SessionMemoryEntity.html "class in akka.javasdk.agent")`

---

public static record SessionMemoryEntity.State([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId, long maxSizeInBytes, long currentSizeInBytes, [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages, [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[State](#%3Cinit%3E(java.lang.String,long,long,java.util.List))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
 long maxSizeInBytes,
 long currentSizeInBytes,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")> messages)`
 
`[State](#%3Cinit%3E(java.lang.String,long,long,java.util.List,akka.javasdk.agent.SessionMessage.TokenUsage))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
 long maxSizeInBytes,
 long currentSizeInBytes,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")> messages,
 [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage)`

Creates an instance of a `State` record class.
- ## Method Summary

Modifier and Type
Method
Description
`[SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent")`
`[addMessage](#addMessage(akka.javasdk.agent.SessionMessage))([SessionMessage](SessionMessage.html "interface in akka.javasdk.agent") message)`
 
`[SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent")`
`[clear](#clear())()`
 
`long`
`[currentSizeInBytes](#currentSizeInBytes())()`

Returns the value of the `currentSizeInBytes` record component.

`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`boolean`
`[isEmpty](#isEmpty())()`
 
`long`
`[maxSizeInBytes](#maxSizeInBytes())()`

Returns the value of the `maxSizeInBytes` record component.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")>`
`[messages](#messages())()`

Returns the value of the `messages` record component.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[sessionId](#sessionId())()`

Returns the value of the `sessionId` record component.

`[SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent")`
`[tokenUsage](#tokenUsage())()`

Returns the value of the `tokenUsage` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

`[SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent")`
`[withMaxSize](#withMaxSize(int))(int newMaxSize)`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### State
	
	
	public State([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
	 long maxSizeInBytes,
	 long currentSizeInBytes,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages)
	- ### State
	
	
	public State([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
	 long maxSizeInBytes,
	 long currentSizeInBytes,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages,
	 [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage)
	Creates an instance of a `State` record class.
	
	Parameters:
	`sessionId` \- the value for the `sessionId` record component
	`maxSizeInBytes` \- the value for the `maxSizeInBytes` record component
	`currentSizeInBytes` \- the value for the `currentSizeInBytes` record component
	`messages` \- the value for the `messages` record component
	`tokenUsage` \- the value for the `tokenUsage` record component
- ## Method Details

	- ### isEmpty
	
	
	public boolean isEmpty()
	- ### withMaxSize
	
	
	public [SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent") withMaxSize(int newMaxSize)
	- ### addMessage
	
	
	public [SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent") addMessage([SessionMessage](SessionMessage.html "interface in akka.javasdk.agent") message)
	- ### clear
	
	
	public [SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent") clear()
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
	- ### sessionId
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId()
	Returns the value of the `sessionId` record component.
	
	Returns:
	the value of the `sessionId` record component
	- ### maxSizeInBytes
	
	
	public long maxSizeInBytes()
	Returns the value of the `maxSizeInBytes` record component.
	
	Returns:
	the value of the `maxSizeInBytes` record component
	- ### currentSizeInBytes
	
	
	public long currentSizeInBytes()
	Returns the value of the `currentSizeInBytes` record component.
	
	Returns:
	the value of the `currentSizeInBytes` record component
	- ### messages
	
	
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages()
	Returns the value of the `messages` record component.
	
	Returns:
	the value of the `messages` record component
	- ### tokenUsage
	
	
	public [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage()
	Returns the value of the `tokenUsage` record component.
	
	Returns:
	the value of the `tokenUsage` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.State.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.TokenUsage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.State.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.State.html)*