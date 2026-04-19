---
description: 'declaration: package: akka.javasdk.agent.evaluator, class: HallucinationEvaluator,
  record: Result'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:53Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/HallucinationEvaluator.Result.html
title: HallucinationEvaluator.Result
---

# HallucinationEvaluator.Result

> **Summary:** declaration: package: akka.javasdk.agent.evaluator, class: HallucinationEvaluator, record: Result

## Content

Package [akka.javasdk.agent.evaluator](package-summary.html)
# Record Class HallucinationEvaluator.Result

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.evaluator.HallucinationEvaluator.Result

All Implemented Interfaces:
`[EvaluationResult](../EvaluationResult.html "interface in akka.javasdk.agent")`

Enclosing class:
`[HallucinationEvaluator](HallucinationEvaluator.html "class in akka.javasdk.agent.evaluator")`

---

public static record HallucinationEvaluator.Result([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") explanation, boolean passed)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [EvaluationResult](../EvaluationResult.html "interface in akka.javasdk.agent")

- ## Constructor Summary

Constructors

Constructor
Description
`[Result](#%3Cinit%3E(java.lang.String,boolean))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") explanation,
 boolean passed)`

Creates an instance of a `Result` record class.
- ## Method Summary

Modifier and Type
Method
Description
`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[explanation](#explanation())()`

Returns the value of the `explanation` record component.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`boolean`
`[passed](#passed())()`

Returns the value of the `passed` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### Result
	
	
	public Result([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") explanation,
	 boolean passed)
	Creates an instance of a `Result` record class.
	
	Parameters:
	`explanation` \- the value for the `explanation` record component
	`passed` \- the value for the `passed` record component
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
	- ### explanation
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") explanation()
	Returns the value of the `explanation` record component.
	
	Specified by:
	`[explanation](../EvaluationResult.html#explanation())` in interface `[EvaluationResult](../EvaluationResult.html "interface in akka.javasdk.agent")`
	Returns:
	the value of the `explanation` record component
	- ### passed
	
	
	public boolean passed()
	Returns the value of the `passed` record component.
	
	Specified by:
	`[passed](../EvaluationResult.html#passed())` in interface `[EvaluationResult](../EvaluationResult.html "interface in akka.javasdk.agent")`
	Returns:
	the value of the `passed` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/EvaluationResult.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/HallucinationEvaluator.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/HallucinationEvaluator.Result.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/HallucinationEvaluator.Result.html)*