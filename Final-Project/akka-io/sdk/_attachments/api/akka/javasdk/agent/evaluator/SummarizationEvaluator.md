---
description: 'declaration: package: akka.javasdk.agent.evaluator, class: SummarizationEvaluator'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:54Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/SummarizationEvaluator.html
title: SummarizationEvaluator
---

# SummarizationEvaluator

> **Summary:** declaration: package: akka.javasdk.agent.evaluator, class: SummarizationEvaluator

## Content

Package [akka.javasdk.agent.evaluator](package-summary.html)
# Class SummarizationEvaluator

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[akka.javasdk.agent.Agent](../Agent.html "class in akka.javasdk.agent")
akka.javasdk.agent.evaluator.SummarizationEvaluator

---

[@Component](../../annotations/Component.html "annotation interface in akka.javasdk.annotations")([id](../../annotations/Component.html#id())\="summarization\-evaluator",
 [name](../../annotations/Component.html#name())\="Summarization Evaluator Agent",
 [description](../../annotations/Component.html#description())\="An agent that acts as an LLM judge to evaluate a summarization task.\\n")
public class SummarizationEvaluator
extends [Agent](../Agent.html "class in akka.javasdk.agent")
An agent that acts as an LLM judge to evaluate a summarization task.

 Model provider is defined in configuration `akka.javasdk.agent.evaluators.summarization-evaluator.model-provider`, which by default is the
 same as the default model provider.

 

The system and user message prompts are loaded from [`PromptTemplate`](../PromptTemplate.html "class in akka.javasdk.agent") with id `summarization-evaluator.system` and `summarization-evaluator.user` respectively. Default
 prompts are used if these are not defined. The prompts can be initialized or updated with the
 [`PromptTemplate`](../PromptTemplate.html "class in akka.javasdk.agent") entity.

- ## Nested Class Summary

Nested Classes

Modifier and Type
Class
Description
`static final record`
`[SummarizationEvaluator.EvaluationRequest](SummarizationEvaluator.EvaluationRequest.html "class in akka.javasdk.agent.evaluator")`
 
`static final record`
`[SummarizationEvaluator.Result](SummarizationEvaluator.Result.html "class in akka.javasdk.agent.evaluator")`
 

## Nested classes/interfaces inherited from class akka.javasdk.agent.[Agent](../Agent.html "class in akka.javasdk.agent")

`[Agent.AgentReply](../Agent.AgentReply.html "class in akka.javasdk.agent")<[T](../Agent.AgentReply.html "type parameter in Agent.AgentReply")>, [Agent.Effect](../Agent.Effect.html "interface in akka.javasdk.agent")<[T](../Agent.Effect.html "type parameter in Agent.Effect")>, [Agent.StreamEffect](../Agent.StreamEffect.html "interface in akka.javasdk.agent"), [Agent.TokenUsage](../Agent.TokenUsage.html "class in akka.javasdk.agent")`
- ## Field Summary

Fields

Modifier and Type
Field
Description
`protected final [ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client")`
`[componentClient](#componentClient)`
 
`protected final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[componentId](#componentId)`
 
`protected final com.typesafe.config.Config`
`[config](#config)`
- ## Constructor Summary

Constructors

Constructor
Description
`[SummarizationEvaluator](#%3Cinit%3E(akka.javasdk.client.ComponentClient,com.typesafe.config.Config))([ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient,
 com.typesafe.config.Config config)`
- ## Method Summary

Modifier and Type
Method
Description
`[Agent.Effect](../Agent.Effect.html "interface in akka.javasdk.agent")<[SummarizationEvaluator.Result](SummarizationEvaluator.Result.html "class in akka.javasdk.agent.evaluator")>`
`[evaluate](#evaluate(akka.javasdk.agent.evaluator.SummarizationEvaluator.EvaluationRequest))([SummarizationEvaluator.EvaluationRequest](SummarizationEvaluator.EvaluationRequest.html "class in akka.javasdk.agent.evaluator") req)`
 
`protected [ModelProvider](../ModelProvider.html "interface in akka.javasdk.agent")`
`[modelProvider](#modelProvider())()`
 
`protected [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[prompt](#prompt(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") promptId,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") defaultPrompt)`
 

### Methods inherited from class akka.javasdk.agent.[Agent](../Agent.html "class in akka.javasdk.agent")

`[context](../Agent.html#context()), [effects](../Agent.html#effects()), [streamEffects](../Agent.html#streamEffects())`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Field Details

	- ### componentId
	
	
	protected final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId
	- ### componentClient
	
	
	protected final [ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient
	- ### config
	
	
	protected final com.typesafe.config.Config config
- ## Constructor Details

	- ### SummarizationEvaluator
	
	
	public SummarizationEvaluator([ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient,
	 com.typesafe.config.Config config)
- ## Method Details

	- ### evaluate
	
	
	public [Agent.Effect](../Agent.Effect.html "interface in akka.javasdk.agent")\<[SummarizationEvaluator.Result](SummarizationEvaluator.Result.html "class in akka.javasdk.agent.evaluator")\> evaluate([SummarizationEvaluator.EvaluationRequest](SummarizationEvaluator.EvaluationRequest.html "class in akka.javasdk.agent.evaluator") req)
	- ### modelProvider
	
	
	protected [ModelProvider](../ModelProvider.html "interface in akka.javasdk.agent") modelProvider()
	- ### prompt
	
	
	protected [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prompt([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") promptId,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") defaultPrompt)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.AgentReply.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.TokenUsage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/PromptTemplate.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/SummarizationEvaluator.EvaluationRequest.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/SummarizationEvaluator.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/SummarizationEvaluator.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/SummarizationEvaluator.html)*