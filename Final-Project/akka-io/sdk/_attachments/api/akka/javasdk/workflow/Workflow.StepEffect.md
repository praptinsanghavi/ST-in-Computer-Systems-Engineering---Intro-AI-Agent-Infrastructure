---
description: 'declaration: package: akka.javasdk.workflow, class: Workflow, interface:
  StepEffect, interface: PersistenceEffectBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:02Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.PersistenceEffectBuilder.html
title: Workflow.StepEffect.PersistenceEffectBuilder
---

# Workflow.StepEffect.PersistenceEffectBuilder

> **Summary:** declaration: package: akka.javasdk.workflow, class: Workflow, interface: StepEffect, interface: PersistenceEffectBuilder

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Interface Workflow.StepEffect.PersistenceEffectBuilder

Enclosing interface:
`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`

---

public static interface Workflow.StepEffect.PersistenceEffectBuilder

- ## Method Summary

Modifier and Type
Method
Description
`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenDelete](#thenDelete())()`

Finish and delete the workflow execution.

`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenDelete](#thenDelete(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") reason)`

Finish and delete the workflow execution with a reason description.

`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenEnd](#thenEnd())()`

Finish the workflow execution.

`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenEnd](#thenEnd(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") reason)`

Finish the workflow execution with a reason description.

`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenPause](#thenPause())()`

Pause the workflow execution and wait for an external input, e.g.

`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenPause](#thenPause(akka.javasdk.workflow.Workflow.PauseSettings))([Workflow.PauseSettings](Workflow.PauseSettings.html "class in akka.javasdk.workflow") pauseSettings)`

Pause the workflow execution with advanced configuration options.

`[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenPause](#thenPause(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") reason)`

Pause the workflow execution with a reason description and wait for an external input, e.g.

`<W> [Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")`
`[thenTransitionTo](#thenTransitionTo(akka.japi.function.Function))(akka.japi.function.Function<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> methodRef)`

Defines the next step to which the workflow should transition to.

`<W,
I> [Workflow.WithInput](Workflow.WithInput.html "interface in akka.javasdk.workflow")<I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")>`
`[thenTransitionTo](#thenTransitionTo(akka.japi.function.Function2))(akka.japi.function.Function2<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> methodRef)`

Defines the next step to which the workflow should transition to.

- ## Method Details

	- ### thenPause
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenPause()
	Pause the workflow execution and wait for an external input, e.g. via command handler.
	- ### thenPause
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenPause([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") reason)
	Pause the workflow execution with a reason description and wait for an external input, e.g.
	 via command handler.
	- ### thenPause
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenPause([Workflow.PauseSettings](Workflow.PauseSettings.html "class in akka.javasdk.workflow") pauseSettings)
	Pause the workflow execution with advanced configuration options.
	
	 This method allows pausing the workflow with a timeout and a handler that will be
	 invoked when the timeout expires. The pause can also include an optional reason
	 description.
	
	 
	
	Use the [`Workflow.pauseSetting(Duration)`](Workflow.html#pauseSetting(java.time.Duration)) method to start building the [`Workflow.PauseSettings`](Workflow.PauseSettings.html "class in akka.javasdk.workflow").
	
	
	
	Parameters:
	`pauseSettings` \- Configuration for the pause including timeout duration and handler
	- ### thenTransitionTo
	
	
	\<W\> [Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenTransitionTo(akka.japi.function.Function\<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> methodRef)
	Defines the next step to which the workflow should transition to.
	
	 The step is identified by a method reference that accepts no input parameters.
	
	
	
	Type Parameters:
	`W` \- The workflow type containing the step method
	Parameters:
	`methodRef` \- Reference to the step method
	Returns:
	A step effect
	- ### thenTransitionTo
	
	
	\<W,
	I\> [Workflow.WithInput](Workflow.WithInput.html "interface in akka.javasdk.workflow")\<I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> thenTransitionTo(akka.japi.function.Function2\<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> methodRef)
	Defines the next step to which the workflow should transition to.
	
	 The step is identified by a method reference that accepts an input parameter.
	
	
	
	Type Parameters:
	`W` \- The workflow type containing the step method
	`I` \- The input parameter type for the step
	Parameters:
	`methodRef` \- Reference to the step method
	Returns:
	A builder to provide the input parameter
	- ### thenEnd
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenEnd()
	Finish the workflow execution. After transition to `end`, no more transitions are
	 allowed.
	- ### thenEnd
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenEnd([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") reason)
	Finish the workflow execution with a reason description. After transition to `end`,
	 no more transitions are allowed.
	- ### thenDelete
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenDelete()
	Finish and delete the workflow execution. After transition to `delete`, no more
	 transitions are allowed. The actual workflow state deletion is done with a configurable
	 delay to allow downstream consumers to observe that fact.
	- ### thenDelete
	
	
	[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow") thenDelete([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") reason)
	Finish and delete the workflow execution with a reason description. After transition to
	 `delete`, no more transitions are allowed. The actual workflow state deletion is done
	 with a configurable delay to allow downstream consumers to observe that fact.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.PauseSettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WithInput.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.PersistenceEffectBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.PersistenceEffectBuilder.html)*