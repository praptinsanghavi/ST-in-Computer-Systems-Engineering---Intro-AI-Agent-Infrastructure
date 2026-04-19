---
description: 'declaration: package: akka.javasdk.agent, interface: MessageContent,
  record: PdfUrlMessageContent'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:18Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfUrlMessageContent.html
title: MessageContent.PdfUrlMessageContent
---

# MessageContent.PdfUrlMessageContent

> **Summary:** declaration: package: akka.javasdk.agent, interface: MessageContent, record: PdfUrlMessageContent

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class MessageContent.PdfUrlMessageContent

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.MessageContent.PdfUrlMessageContent

Record Components:
`url` \- The URL pointing to the PDF

All Implemented Interfaces:
`[MessageContent](MessageContent.html "interface in akka.javasdk.agent")`, `[MessageContent.LoadableMessageContent](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent")`

Enclosing interface:
`[MessageContent](MessageContent.html "interface in akka.javasdk.agent")`

---

public static record MessageContent.PdfUrlMessageContent([URL](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URL.html "class or interface in java.net") url)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [MessageContent.LoadableMessageContent](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent")
PDF content within a user message, referenced by URL.

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[MessageContent](MessageContent.html "interface in akka.javasdk.agent")

`[MessageContent.ImageMessageContent](MessageContent.ImageMessageContent.html "class in akka.javasdk.agent"), [MessageContent.ImageUrlMessageContent](MessageContent.ImageUrlMessageContent.html "class in akka.javasdk.agent"), [MessageContent.LoadableMessageContent](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent"), [MessageContent.PdfMessageContent](MessageContent.PdfMessageContent.html "class in akka.javasdk.agent"), [MessageContent.PdfUrlMessageContent](MessageContent.PdfUrlMessageContent.html "class in akka.javasdk.agent"), [MessageContent.TextMessageContent](MessageContent.TextMessageContent.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[PdfUrlMessageContent](#%3Cinit%3E(java.net.URL))([URL](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URL.html "class or interface in java.net") url)`

Creates an instance of a `PdfUrlMessageContent` record class.
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

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

`[URL](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URL.html "class or interface in java.net")`
`[url](#url())()`

Returns the value of the [`url`](#param-url) record component.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### PdfUrlMessageContent
	
	
	public PdfUrlMessageContent([URL](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URL.html "class or interface in java.net") url)
	Creates an instance of a `PdfUrlMessageContent` record class.
	
	Parameters:
	`url` \- the value for the [`url`](#param-url) record component
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
	- ### url
	
	
	public [URL](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URL.html "class or interface in java.net") url()
	Returns the value of the [`url`](#param-url) record component.
	
	Returns:
	the value of the [`url`](#param-url) record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageUrlMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.LoadableMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfUrlMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.TextMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfUrlMessageContent.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfUrlMessageContent.html)*