---
description: 'declaration: package: akka.javasdk.agent, record: UserMessage'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:42Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UserMessage.html
title: UserMessage
---

# UserMessage

> **Summary:** declaration: package: akka.javasdk.agent, record: UserMessage

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class UserMessage

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.UserMessage

Record Components:
`contents` \- The list of message content elements (text, images, etc.)

---

public record UserMessage([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MessageContent](MessageContent.html "interface in akka.javasdk.agent")\> contents)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
Represents a user message that can contain multimodal content for interaction with AI models.

 A `UserMessage` encapsulates one or more [`MessageContent`](MessageContent.html "interface in akka.javasdk.agent") elements, allowing
 agents to send text, images, or both.

 

Multimodal message with text and image:

 

```

 UserMessage message = UserMessage.from(
     MessageContent.TextMessageContent.from("What's in this image?"),
     ImageMessageContent.from("https://example.com/photo.jpg")
 );
 
```

See Also:

- [`MessageContent`](MessageContent.html "interface in akka.javasdk.agent")
- [`Agent.Effect.Builder.userMessage(UserMessage)`](Agent.Effect.Builder.html#userMessage(akka.javasdk.agent.UserMessage))

- ## Constructor Summary

Constructors

Constructor
Description
`[UserMessage](#%3Cinit%3E(java.util.List))([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[MessageContent](MessageContent.html "interface in akka.javasdk.agent")> contents)`

Creates an instance of a `UserMessage` record class.
- ## Method Summary

Modifier and Type
Method
Description
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[MessageContent](MessageContent.html "interface in akka.javasdk.agent")>`
`[contents](#contents())()`

Returns the value of the [`contents`](#param-contents) record component.

`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`static [UserMessage](UserMessage.html "class in akka.javasdk.agent")`
`[from](#from(akka.javasdk.agent.MessageContent...))([MessageContent](MessageContent.html "interface in akka.javasdk.agent")... messageContent)`
 
`static [UserMessage](UserMessage.html "class in akka.javasdk.agent")`
`[from](#from(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`
 
`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`boolean`
`[isTextOnly](#isTextOnly())()`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[text](#text())()`
 
`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### UserMessage
	
	
	public UserMessage([List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MessageContent](MessageContent.html "interface in akka.javasdk.agent")\> contents)
	Creates an instance of a `UserMessage` record class.
	
	Parameters:
	`contents` \- the value for the [`contents`](#param-contents) record component
- ## Method Details

	- ### isTextOnly
	
	
	public boolean isTextOnly()
	- ### text
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text()
	- ### from
	
	
	public static [UserMessage](UserMessage.html "class in akka.javasdk.agent") from([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	- ### from
	
	
	public static [UserMessage](UserMessage.html "class in akka.javasdk.agent") from([MessageContent](MessageContent.html "interface in akka.javasdk.agent")... messageContent)
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
	- ### contents
	
	
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MessageContent](MessageContent.html "interface in akka.javasdk.agent")\> contents()
	Returns the value of the [`contents`](#param-contents) record component.
	
	Returns:
	the value of the [`contents`](#param-contents) record component

## Code Examples

### Example 1: Record Class UserMessage

```text
UserMessage message = UserMessage.from(
     MessageContent.TextMessageContent.from("What's in this image?"),
     ImageMessageContent.from("https://example.com/photo.jpg")
 );
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UserMessage.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UserMessage.html)*