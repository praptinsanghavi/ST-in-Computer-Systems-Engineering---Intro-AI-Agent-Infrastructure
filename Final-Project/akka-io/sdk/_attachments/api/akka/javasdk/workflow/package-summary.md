---
description: 'declaration: package: akka.javasdk.workflow'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:30Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html
title: akka.javasdk.workflow
---

# akka.javasdk.workflow

> **Summary:** declaration: package: akka.javasdk.workflow

## Content

# Package akka.javasdk.workflow

---

package akka.javasdk.workflow

[`Workflow`](Workflow.html "class in akka.javasdk.workflow") component.

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[CommandContext](CommandContext.html "interface in akka.javasdk.workflow")

A value based workflow command context.

[StepBuilder](StepBuilder.html "class in akka.javasdk.workflow")
 
[StepBuilder.AsyncCallStepBuilder](StepBuilder.AsyncCallStepBuilder.html "class in akka.javasdk.workflow")\<CallInput,CallOutput\>
 
[StepBuilder.CallStepBuilder](StepBuilder.CallStepBuilder.html "class in akka.javasdk.workflow")\<CallInput,CallOutput\>
 
[StepBuilder.RunnableStepBuilder](StepBuilder.RunnableStepBuilder.html "class in akka.javasdk.workflow")
 
[Workflow](Workflow.html "class in akka.javasdk.workflow")\<S\>

Workflows are stateful components and are defined by a set of steps and transitions between them.

[Workflow.AsyncCallStep](Workflow.AsyncCallStep.html "class in akka.javasdk.workflow")\<CallInput,CallOutput,FailoverInput\>
Deprecated.
use methods returning [`Workflow.StepEffect`](Workflow.StepEffect.html "interface in akka.javasdk.workflow") instead.

[Workflow.CallStep](Workflow.CallStep.html "class in akka.javasdk.workflow")\<CallInput,CallOutput,FailoverInput\>
Deprecated.
use methods returning [`Workflow.StepEffect`](Workflow.StepEffect.html "interface in akka.javasdk.workflow") instead.

[Workflow.CommandHandler](Workflow.CommandHandler.html "interface in akka.javasdk.workflow")
 
[Workflow.CommandHandler.NoArgCommandHandler](Workflow.CommandHandler.NoArgCommandHandler.html "class in akka.javasdk.workflow")
 
[Workflow.CommandHandler.OneArgCommandHandler](Workflow.CommandHandler.OneArgCommandHandler.html "class in akka.javasdk.workflow")
 
[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<T\>

An Effect is a description of what the runtime needs to do after the command is handled.

[Workflow.Effect.Builder](Workflow.Effect.Builder.html "interface in akka.javasdk.workflow")\<S\>

Construct the effect that is returned by the command handler or a step transition.

[Workflow.Effect.PersistenceEffectBuilder](Workflow.Effect.PersistenceEffectBuilder.html "interface in akka.javasdk.workflow")\<T\>
 
[Workflow.Effect.Transitional](Workflow.Effect.Transitional.html "interface in akka.javasdk.workflow")
 
[Workflow.Effect.TransitionalEffect](Workflow.Effect.TransitionalEffect.html "interface in akka.javasdk.workflow")\<T\>
Deprecated.
Use [`Workflow.Effect.Transitional`](Workflow.Effect.Transitional.html "interface in akka.javasdk.workflow") instead.

[Workflow.LegacyWorkflowTimeout](Workflow.LegacyWorkflowTimeout.html "interface in akka.javasdk.workflow")

INTERNAL API

[Workflow.PauseSettings](Workflow.PauseSettings.html "class in akka.javasdk.workflow")
 
[Workflow.PauseSettingsBuilder](Workflow.PauseSettingsBuilder.html "class in akka.javasdk.workflow")
 
[Workflow.ReadOnlyEffect](Workflow.ReadOnlyEffect.html "interface in akka.javasdk.workflow")\<T\>

An effect that is known to be read\-only and does not update the state of the entity.

[Workflow.RecoverStrategy](Workflow.RecoverStrategy.html "class in akka.javasdk.workflow")\<T\>
 
[Workflow.RecoverStrategy.MaxRetries](Workflow.RecoverStrategy.MaxRetries.html "class in akka.javasdk.workflow")

Retry strategy without failover configuration

[Workflow.RecoverStrategy.RecoveryInput](Workflow.RecoverStrategy.RecoveryInput.html "class in akka.javasdk.workflow")\<I\>
 
[Workflow.RunnableStep](Workflow.RunnableStep.html "class in akka.javasdk.workflow")
Deprecated.
use methods returning [`Workflow.StepEffect`](Workflow.StepEffect.html "interface in akka.javasdk.workflow") instead.

[Workflow.Step](Workflow.Step.html "interface in akka.javasdk.workflow")
Deprecated.
use methods returning [`Workflow.StepEffect`](Workflow.StepEffect.html "interface in akka.javasdk.workflow") instead.

[Workflow.StepEffect](Workflow.StepEffect.html "interface in akka.javasdk.workflow")
 
[Workflow.StepEffect.Builder](Workflow.StepEffect.Builder.html "interface in akka.javasdk.workflow")\<S\>

Construct the step effect that is returned by step method.

[Workflow.StepEffect.PersistenceEffectBuilder](Workflow.StepEffect.PersistenceEffectBuilder.html "interface in akka.javasdk.workflow")
 
[Workflow.StepHandler](Workflow.StepHandler.html "interface in akka.javasdk.workflow")
 
[Workflow.StepHandler.NoArgStepHandler](Workflow.StepHandler.NoArgStepHandler.html "class in akka.javasdk.workflow")
 
[Workflow.StepHandler.OneArgStepHandler](Workflow.StepHandler.OneArgStepHandler.html "class in akka.javasdk.workflow")
 
[Workflow.StepMethod](Workflow.StepMethod.html "class in akka.javasdk.workflow")
 
[Workflow.StepSettings](Workflow.StepSettings.html "class in akka.javasdk.workflow")
 
[Workflow.WithInput](Workflow.WithInput.html "interface in akka.javasdk.workflow")\<I,R\>

Represents an operation that accepts an input of type I and produces a result of type R.

[Workflow.WorkflowDef](Workflow.WorkflowDef.html "class in akka.javasdk.workflow")\<S\>
Deprecated.
use [`Workflow.WorkflowSettings`](Workflow.WorkflowSettings.html "interface in akka.javasdk.workflow") instead

[Workflow.WorkflowSettings](Workflow.WorkflowSettings.html "interface in akka.javasdk.workflow")
 
[Workflow.WorkflowSettingsBuilder](Workflow.WorkflowSettingsBuilder.html "class in akka.javasdk.workflow")
 
[WorkflowContext](WorkflowContext.html "interface in akka.javasdk.workflow")

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.AsyncCallStepBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.CallStepBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.RunnableStepBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/StepBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.AsyncCallStep.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CallStep.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.NoArgCommandHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.OneArgCommandHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.CommandHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.PersistenceEffectBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.Transitional.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.TransitionalEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.LegacyWorkflowTimeout.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.PauseSettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.PauseSettingsBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.ReadOnlyEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.MaxRetries.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.RecoveryInput.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RecoverStrategy.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.RunnableStep.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Step.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.PersistenceEffectBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepHandler.NoArgStepHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepHandler.OneArgStepHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepMethod.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepSettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WithInput.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowDef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.WorkflowSettingsBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/WorkflowContext.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html)*