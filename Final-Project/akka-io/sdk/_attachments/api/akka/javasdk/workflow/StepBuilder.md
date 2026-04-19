---
description: 'declaration: package: akka.javasdk.workflow, class: StepBuilder, class:
  RunnableStepBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:51Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.RunnableStepBuilder.html
title: StepBuilder.RunnableStepBuilder
---

# StepBuilder.RunnableStepBuilder

> **Summary:** declaration: package: akka.javasdk.workflow, class: StepBuilder, class: RunnableStepBuilder

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Class StepBuilder.RunnableStepBuilder

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.workflow.StepBuilder.RunnableStepBuilder

Enclosing class:
`[StepBuilder](StepBuilder.html "class in akka.javasdk.workflow")`

---

public static class StepBuilder.RunnableStepBuilder
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

- ## Method Summary

Modifier and Type
Method
Description
`[Workflow.RunnableStep](Workflow.RunnableStep.html "class in akka.javasdk.workflow")`
`[andThen](#andThen(java.util.function.Supplier))([Supplier](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function")<[Workflow.Effect.TransitionalEffect](Workflow.Effect.TransitionalEffect.html "interface in akka.javasdk.workflow")<[Void](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Void.html "class or interface in java.lang")>> transitionFunc)`

Transition to the next step after the step call completes.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Method Details

	- ### andThen
	
	
	public [Workflow.RunnableStep](Workflow.RunnableStep.html "class in akka.javasdk.workflow") andThen([Supplier](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function")\<[Workflow.Effect.TransitionalEffect](Workflow.Effect.TransitionalEffect.html "interface in akka.javasdk.workflow")\<[Void](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Void.html "class or interface in java.lang")\>\> transitionFunc)
	Transition to the next step after the step call completes.
	
	 The [`Supplier`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function") passed to this method should return an [`Workflow.Effect.TransitionalEffect`](Workflow.Effect.TransitionalEffect.html "interface in akka.javasdk.workflow") describing the next step to transition to.
	
	 
	
	When defining the Effect, you can update the workflow state and indicate the next step to
	 transition to. This can be another step, or a pause or end of the workflow.
	
	 
	
	When transition to another step, you can also pass an input parameter to the next step.
	
	
	
	Parameters:
	`transitionFunc` \- Supplier of [`Workflow.Effect.TransitionalEffect`](Workflow.Effect.TransitionalEffect.html "interface in akka.javasdk.workflow")
	Returns:
	RunnableStep

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.TransitionalEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RunnableStep.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.RunnableStepBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.RunnableStepBuilder.html)*