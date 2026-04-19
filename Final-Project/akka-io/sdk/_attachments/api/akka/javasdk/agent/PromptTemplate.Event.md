---
description: 'declaration: package: akka.javasdk.agent, class: PromptTemplate, interface:
  Event, record: Updated'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:21Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.Event.Updated.html
title: PromptTemplate.Event.Updated
---

# PromptTemplate.Event.Updated

> **Summary:** declaration: package: akka.javasdk.agent, class: PromptTemplate, interface: Event, record: Updated

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class PromptTemplate.Event.Updated

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.PromptTemplate.Event.Updated

All Implemented Interfaces:
`[PromptTemplate.Event](PromptTemplate.Event.html "interface in akka.javasdk.agent")`

Enclosing interface:
`[PromptTemplate.Event](PromptTemplate.Event.html "interface in akka.javasdk.agent")`

---

public static record PromptTemplate.Event.Updated([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prompt)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [PromptTemplate.Event](PromptTemplate.Event.html "interface in akka.javasdk.agent")

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[PromptTemplate.Event](PromptTemplate.Event.html "interface in akka.javasdk.agent")

`[PromptTemplate.Event.Deleted](PromptTemplate.Event.Deleted.html "class in akka.javasdk.agent"), [PromptTemplate.Event.Updated](PromptTemplate.Event.Updated.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[Updated](#%3Cinit%3E(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prompt)`

Creates an instance of a `Updated` record class.
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

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[prompt](#prompt())()`

Returns the value of the `prompt` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### Updated
	
	
	public Updated([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prompt)
	Creates an instance of a `Updated` record class.
	
	Parameters:
	`prompt` \- the value for the `prompt` record component
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
	- ### prompt
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prompt()
	Returns the value of the `prompt` record component.
	
	Returns:
	the value of the `prompt` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.Event.Deleted.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.Event.Updated.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.Event.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.Event.Updated.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.Event.Updated.html)*