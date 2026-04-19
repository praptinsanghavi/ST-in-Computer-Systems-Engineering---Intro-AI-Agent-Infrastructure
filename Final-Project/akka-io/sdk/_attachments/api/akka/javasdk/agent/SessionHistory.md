---
description: 'declaration: package: akka.javasdk.agent, record: SessionHistory'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:23Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionHistory.html
title: SessionHistory
---

# SessionHistory

> **Summary:** declaration: package: akka.javasdk.agent, record: SessionHistory

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class SessionHistory

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.SessionHistory

---

public record SessionHistory([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages, long sequenceNumber, [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")

- ## Field Summary

Fields

Modifier and Type
Field
Description
`static final [SessionHistory](SessionHistory.html "class in akka.javasdk.agent")`
`[EMPTY](#EMPTY)`
- ## Constructor Summary

Constructors

Constructor
Description
`[SessionHistory](#%3Cinit%3E(java.util.List,long))([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")> messages,
 long sequenceNumber)`
 
`[SessionHistory](#%3Cinit%3E(java.util.List,long,akka.javasdk.agent.SessionMessage.TokenUsage))([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")> messages,
 long sequenceNumber,
 [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage)`

Creates an instance of a `SessionHistory` record class.
- ## Method Summary

Modifier and Type
Method
Description
`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")>`
`[messages](#messages())()`

Returns the value of the `messages` record component.

`long`
`[sequenceNumber](#sequenceNumber())()`

Returns the value of the `sequenceNumber` record component.

`[SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent")`
`[tokenUsage](#tokenUsage())()`

Returns the value of the `tokenUsage` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Field Details

	- ### EMPTY
	
	
	public static final [SessionHistory](SessionHistory.html "class in akka.javasdk.agent") EMPTY
- ## Constructor Details

	- ### SessionHistory
	
	
	public SessionHistory([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages,
	 long sequenceNumber)
	- ### SessionHistory
	
	
	public SessionHistory([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages,
	 long sequenceNumber,
	 [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage)
	Creates an instance of a `SessionHistory` record class.
	
	Parameters:
	`messages` \- the value for the `messages` record component
	`sequenceNumber` \- the value for the `sequenceNumber` record component
	`tokenUsage` \- the value for the `tokenUsage` record component
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
	- ### messages
	
	
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages()
	Returns the value of the `messages` record component.
	
	Returns:
	the value of the `messages` record component
	- ### sequenceNumber
	
	
	public long sequenceNumber()
	Returns the value of the `sequenceNumber` record component.
	
	Returns:
	the value of the `sequenceNumber` record component
	- ### tokenUsage
	
	
	public [SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent") tokenUsage()
	Returns the value of the `tokenUsage` record component.
	
	Returns:
	the value of the `tokenUsage` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionHistory.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.TokenUsage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionHistory.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionHistory.html)*