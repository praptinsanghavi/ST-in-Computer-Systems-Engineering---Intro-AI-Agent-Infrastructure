---
description: 'declaration: package: akka.javasdk.workflow, class: Workflow, record:
  RecoverStrategy, record: RecoveryInput'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:59Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.RecoveryInput.html
title: Workflow.RecoverStrategy.RecoveryInput
---

# Workflow.RecoverStrategy.RecoveryInput

> **Summary:** declaration: package: akka.javasdk.workflow, class: Workflow, record: RecoverStrategy, record: RecoveryInput

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Record Class Workflow.RecoverStrategy.RecoveryInput\<I\>

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.workflow.Workflow.RecoverStrategy.RecoveryInput\<I\>

All Implemented Interfaces:
`[Workflow.WithInput](Workflow.WithInput.html "interface in akka.javasdk.workflow")<I,[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<I>>`

Enclosing class:
`[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<[T](Workflow.RecoverStrategy.html "type parameter in Workflow.RecoverStrategy")>`

---

public static record Workflow.RecoverStrategy.RecoveryInput\<I\>(int maxRetries, [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") stepName, akka.japi.function.Function2\<?,[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput"),[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [Workflow.WithInput](Workflow.WithInput.html "interface in akka.javasdk.workflow")\<I,[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<I\>\>

- ## Constructor Summary

Constructors

Constructor
Description
`[RecoveryInput](#%3Cinit%3E(int,java.lang.String,akka.japi.function.Function2))(int maxRetries,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") stepName,
 akka.japi.function.Function2<?,[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput"),[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> lambda)`

Creates an instance of a `RecoveryInput` record class.
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

`akka.japi.function.Function2<?,[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput"),[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")>`
`[lambda](#lambda())()`

Returns the value of the `lambda` record component.

`int`
`[maxRetries](#maxRetries())()`

Returns the value of the `maxRetries` record component.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[stepName](#stepName())()`

Returns the value of the `stepName` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

`[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput")>`
`[withInput](#withInput(I))([I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput") input)`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### RecoveryInput
	
	
	public RecoveryInput(int maxRetries,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") stepName,
	 akka.japi.function.Function2\<?,[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput"),[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda)
	Creates an instance of a `RecoveryInput` record class.
	
	Parameters:
	`maxRetries` \- the value for the `maxRetries` record component
	`stepName` \- the value for the `stepName` record component
	`lambda` \- the value for the `lambda` record component
- ## Method Details

	- ### withInput
	
	
	public [Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput")\> withInput([I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput") input)
	
	Specified by:
	`[withInput](Workflow.WithInput.html#withInput(I))` in interface `[Workflow.WithInput](Workflow.WithInput.html "interface in akka.javasdk.workflow")<[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput"),[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput")>>`
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
	- ### maxRetries
	
	
	public int maxRetries()
	Returns the value of the `maxRetries` record component.
	
	Returns:
	the value of the `maxRetries` record component
	- ### stepName
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") stepName()
	Returns the value of the `stepName` record component.
	
	Returns:
	the value of the `stepName` record component
	- ### lambda
	
	
	public akka.japi.function.Function2\<?,[I](Workflow.RecoverStrategy.RecoveryInput.html "type parameter in Workflow.RecoverStrategy.RecoveryInput"),[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda()
	Returns the value of the `lambda` record component.
	
	Returns:
	the value of the `lambda` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.RecoveryInput.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WithInput.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.RecoveryInput.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.RecoveryInput.html)*