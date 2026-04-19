---
description: 'declaration: package: akka.javasdk.workflow, class: Workflow, class:
  WorkflowSettingsBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:08Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettingsBuilder.html
title: Workflow.WorkflowSettingsBuilder
---

# Workflow.WorkflowSettingsBuilder

> **Summary:** declaration: package: akka.javasdk.workflow, class: Workflow, class: WorkflowSettingsBuilder

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Class Workflow.WorkflowSettingsBuilder

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.workflow.Workflow.WorkflowSettingsBuilder

Enclosing class:
`[Workflow](Workflow.html "class in akka.javasdk.workflow")<[S](Workflow.html "type parameter in Workflow")>`

---

public static class Workflow.WorkflowSettingsBuilder
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[WorkflowSettingsBuilder](#%3Cinit%3E(java.util.Optional,java.util.Optional,java.util.Map,java.util.Optional,java.util.Optional,java.util.Optional))([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time")> defaultStepTimeout,
 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<?>> defaultStepRecoverStrategy,
 [Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[Workflow.StepSettings](Workflow.StepSettings.html "class in akka.javasdk.workflow")> stepSettingsMap,
 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time")> passivationDelay,
 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time")> workflowTimeout,
 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<?>> workflowRecoveryStrategy)`
- ## Method Summary

Modifier and Type
Method
Description
`[Workflow.WorkflowSettings](Workflow.WorkflowSettings.html "interface in akka.javasdk.workflow")`
`[build](#build())()`

Creates the final workflow configuration from this builder.

`[Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[defaultStepRecovery](#defaultStepRecovery(akka.javasdk.workflow.Workflow.RecoverStrategy))([Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<?> recoverStrategy)`

Define a default recovery strategy for all steps.

`[Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[defaultStepTimeout](#defaultStepTimeout(java.time.Duration))([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`

Define a default timeout duration for all steps.

`static [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[newBuilder](#newBuilder())()`
 
`<W,
I> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[passivationDelay](#passivationDelay(java.time.Duration))([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay)`

A paused (or finished) workflow will be kept in memory for the given delay before being
 passivated.

`<W> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[stepRecovery](#stepRecovery(akka.japi.function.Function,akka.javasdk.workflow.Workflow.RecoverStrategy))(akka.japi.function.Function<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> lambda,
 [Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<?> recovery)`

Configure a specific step with a recovery strategy.

`<W,
I> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[stepRecovery](#stepRecovery(akka.japi.function.Function2,akka.javasdk.workflow.Workflow.RecoverStrategy))(akka.japi.function.Function2<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> lambda,
 [Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")<?> recovery)`

Configure a specific step with a recovery strategy.

`<W> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[stepTimeout](#stepTimeout(akka.japi.function.Function,java.time.Duration))(akka.japi.function.Function<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> lambda,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`

Configure a specific step with a timeout.

`<W,
I> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[stepTimeout](#stepTimeout(akka.japi.function.Function2,java.time.Duration))(akka.japi.function.Function2<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> lambda,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`

Configure a specific step with a timeout.

`[Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[timeout](#timeout(java.time.Duration))([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`

Define a timeout for the duration of the entire workflow.

`<W> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[timeout](#timeout(java.time.Duration,akka.japi.function.Function))([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout,
 akka.japi.function.Function<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> timeoutFailoverStep)`

Define a timeout for the duration of the entire workflow with a timeout handler step.

`<W,
I> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")`
`[timeout](#timeout(java.time.Duration,akka.japi.function.Function2,I))([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout,
 akka.japi.function.Function2<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")> timeoutFailoverStep,
 I input)`

Define a timeout for the duration of the entire workflow with a timeout handler step that
 accepts input.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### WorkflowSettingsBuilder
	
	
	public WorkflowSettingsBuilder([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time")\> defaultStepTimeout,
	 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<?\>\> defaultStepRecoverStrategy,
	 [Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[Workflow.StepSettings](Workflow.StepSettings.html "class in akka.javasdk.workflow")\> stepSettingsMap,
	 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time")\> passivationDelay,
	 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time")\> workflowTimeout,
	 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<?\>\> workflowRecoveryStrategy)
- ## Method Details

	- ### newBuilder
	
	
	public static [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") newBuilder()
	- ### timeout
	
	
	public [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") timeout([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	Define a timeout for the duration of the entire workflow. When the timeout expires, the
	 workflow is finished and no transitions are allowed.
	
	Parameters:
	`timeout` \- Timeout duration
	- ### timeout
	
	
	public \<W\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") timeout([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout,
	 akka.japi.function.Function\<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> timeoutFailoverStep)
	Define a timeout for the duration of the entire workflow with a timeout handler step. When
	 the timeout expires, the specified timeout handler step will be executed to handle the
	 timeout gracefully (e.g., cleanup, logging, or compensation). The timeout handler step must
	 end the workflow \- no further step transitions are allowed after a global timeout.
	
	Parameters:
	`timeout` \- Timeout duration
	`timeoutFailoverStep` \- Reference to the timeout handler step method
	- ### timeout
	
	
	public \<W,
	I\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") timeout([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout,
	 akka.japi.function.Function2\<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> timeoutFailoverStep,
	 I input)
	Define a timeout for the duration of the entire workflow with a timeout handler step that
	 accepts input. When the timeout expires, the specified timeout handler step will be executed
	 with the provided input to handle the timeout gracefully (e.g., cleanup, logging, or
	 compensation). The timeout handler step must end the workflow \- no further step transitions
	 are allowed after a global timeout.
	
	Parameters:
	`timeout` \- Timeout duration
	`timeoutFailoverStep` \- Reference to the timeout handler step method
	`input` \- Input parameter to pass to the timeout handler step
	- ### defaultStepTimeout
	
	
	public [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") defaultStepTimeout([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	Define a default timeout duration for all steps. Can be overridden per step.
	- ### defaultStepRecovery
	
	
	public [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") defaultStepRecovery([Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<?\> recoverStrategy)
	Define a default recovery strategy for all steps. Can be overridden per step.
	- ### stepTimeout
	
	
	public \<W\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") stepTimeout(akka.japi.function.Function\<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	Configure a specific step with a timeout.
	
	Parameters:
	`lambda` \- Reference to the step method
	`timeout` \- Timeout duration for this step
	- ### stepTimeout
	
	
	public \<W,
	I\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") stepTimeout(akka.japi.function.Function2\<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	Configure a specific step with a timeout.
	
	Parameters:
	`lambda` \- Reference to the step method
	`timeout` \- Timeout duration for this step
	- ### stepRecovery
	
	
	public \<W\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") stepRecovery(akka.japi.function.Function\<W,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda,
	 [Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<?\> recovery)
	Configure a specific step with a recovery strategy.
	
	Parameters:
	`lambda` \- Reference to the step method
	`recovery` \- Recovery strategy for this step
	- ### stepRecovery
	
	
	public \<W,
	I\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") stepRecovery(akka.japi.function.Function2\<W,I,[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")\> lambda,
	 [Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<?\> recovery)
	Configure a specific step with a recovery strategy.
	
	Parameters:
	`lambda` \- Reference to the step method
	`recovery` \- Recovery strategy for this step
	- ### passivationDelay
	
	
	public \<W,
	I\> [Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow") passivationDelay([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") delay)
	A paused (or finished) workflow will be kept in memory for the given delay before being
	 passivated. This improves the performance of resuming such a workflow because it doesn't have
	 to be recovered from the storage.
	- ### build
	
	
	public [Workflow.WorkflowSettings](Workflow.WorkflowSettings.html "interface in akka.javasdk.workflow") build()
	Creates the final workflow configuration from this builder.
	
	Returns:
	The complete workflow configuration

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepSettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettingsBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettingsBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettingsBuilder.html)*