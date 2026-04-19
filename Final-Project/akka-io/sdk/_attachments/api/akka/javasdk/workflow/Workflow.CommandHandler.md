---
description: 'declaration: package: akka.javasdk.workflow, class: Workflow, interface:
  CommandHandler, record: OneArgCommandHandler'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:52Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.OneArgCommandHandler.html
title: Workflow.CommandHandler.OneArgCommandHandler
---

# Workflow.CommandHandler.OneArgCommandHandler

> **Summary:** declaration: package: akka.javasdk.workflow, class: Workflow, interface: CommandHandler, record: OneArgCommandHandler

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Record Class Workflow.CommandHandler.OneArgCommandHandler

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.workflow.Workflow.CommandHandler.OneArgCommandHandler

All Implemented Interfaces:
`[Workflow.CommandHandler](Workflow.CommandHandler.html "interface in akka.javasdk.workflow")`

Enclosing interface:
`[Workflow.CommandHandler](Workflow.CommandHandler.html "interface in akka.javasdk.workflow")`

---

public static record Workflow.CommandHandler.OneArgCommandHandler(akka.japi.function.Function2\<?,?,[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<akka.Done\>\> handler, [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") input)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [Workflow.CommandHandler](Workflow.CommandHandler.html "interface in akka.javasdk.workflow")

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.workflow.[Workflow.CommandHandler](Workflow.CommandHandler.html "interface in akka.javasdk.workflow")

`[Workflow.CommandHandler.NoArgCommandHandler](Workflow.CommandHandler.NoArgCommandHandler.html "class in akka.javasdk.workflow"), [Workflow.CommandHandler.OneArgCommandHandler](Workflow.CommandHandler.OneArgCommandHandler.html "class in akka.javasdk.workflow")`
- ## Constructor Summary

Constructors

Constructor
Description
`[OneArgCommandHandler](#%3Cinit%3E(akka.japi.function.Function2,java.lang.Object))(akka.japi.function.Function2<?,?,[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")<akka.Done>> handler,
 [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") input)`

Creates an instance of a `OneArgCommandHandler` record class.
- ## Method Summary

Modifier and Type
Method
Description
`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`akka.japi.function.Function2<?,?,[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")<akka.Done>>`
`[handler](#handler())()`

Returns the value of the `handler` record component.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")`
`[input](#input())()`

Returns the value of the `input` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### OneArgCommandHandler
	
	
	public OneArgCommandHandler(akka.japi.function.Function2\<?,?,[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<akka.Done\>\> handler,
	 [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") input)
	Creates an instance of a `OneArgCommandHandler` record class.
	
	Parameters:
	`handler` \- the value for the `handler` record component
	`input` \- the value for the `input` record component
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
	- ### handler
	
	
	public akka.japi.function.Function2\<?,?,[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<akka.Done\>\> handler()
	Returns the value of the `handler` record component.
	
	Returns:
	the value of the `handler` record component
	- ### input
	
	
	public [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") input()
	Returns the value of the `input` record component.
	
	Returns:
	the value of the `input` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.NoArgCommandHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.OneArgCommandHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.OneArgCommandHandler.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.OneArgCommandHandler.html)*