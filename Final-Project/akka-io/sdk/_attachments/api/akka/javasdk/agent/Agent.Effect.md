---
description: 'declaration: package: akka.javasdk.agent, class: Agent, interface: Effect,
  interface: OnSuccessBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:00Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.OnSuccessBuilder.html
title: Agent.Effect.OnSuccessBuilder
---

# Agent.Effect.OnSuccessBuilder

> **Summary:** declaration: package: akka.javasdk.agent, class: Agent, interface: Effect, interface: OnSuccessBuilder

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface Agent.Effect.OnSuccessBuilder

Enclosing interface:
`[Agent.Effect](Agent.Effect.html "interface in akka.javasdk.agent")<[T](Agent.Effect.html "type parameter in Agent.Effect")>`

---

public static interface Agent.Effect.OnSuccessBuilder

- ## Method Summary

Modifier and Type
Method
Description
`<T> [Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")<T>`
`[map](#map(java.util.function.Function))([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),T> mapper)`

Map the String response from the model into a different response type.

`[Agent.Effect.FailureBuilder](Agent.Effect.FailureBuilder.html "interface in akka.javasdk.agent")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[onFailure](#onFailure(java.util.function.Function))([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> exceptionHandler)`

Handle failures that occur during model processing.

`<T> [Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")<T>`
`[responseAs](#responseAs(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> responseType)`

Parse the response from the model into a structured response of a given responseType.

`<T> [Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")<T>`
`[responseConformsTo](#responseConformsTo(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> responseType)`

Parse the response from the model into a structured response of a given responseType.

`[Agent.Effect](Agent.Effect.html "interface in akka.javasdk.agent")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[thenReply](#thenReply())()`

Reply with the response from the model.

`[Agent.Effect](Agent.Effect.html "interface in akka.javasdk.agent")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[thenReply](#thenReply(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Reply with the response from the model.

- ## Method Details

	- ### thenReply
	
	
	[Agent.Effect](Agent.Effect.html "interface in akka.javasdk.agent")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> thenReply()
	Reply with the response from the model.
	
	Returns:
	A message reply.
	- ### thenReply
	
	
	[Agent.Effect](Agent.Effect.html "interface in akka.javasdk.agent")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> thenReply([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Reply with the response from the model.
	
	Parameters:
	`metadata` \- The metadata for the message.
	Returns:
	A message reply.
	- ### responseAs
	
	
	\<T\> [Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")\<T\> responseAs([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> responseType)
	Parse the response from the model into a structured response of a given responseType. The
	 system message must have instruction or example of how the JSON should be structured.
	 Alternatively, or as a compliment, the JSON schema of the `responseType` can be
	 included automatically in the request by using [`responseConformsTo(java.lang.Class<T>)`](#responseConformsTo(java.lang.Class)).
	
	Parameters:
	`responseType` \- The structured response type.
	See Also:
	
	
		- [`responseConformsTo(java.lang.Class<T>)`](#responseConformsTo(java.lang.Class))
	- ### responseConformsTo
	
	
	\<T\> [Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")\<T\> responseConformsTo([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> responseType)
	Parse the response from the model into a structured response of a given responseType. The
	 JSON schema of the `responseType` is included in the model request. At least OpenAI
	 and Google Gemini support this structured model output feature. For other models that don't
	 support it, you have to give more detailed instructions about the expected output format in
	 the system message.
	
	Parameters:
	`responseType` \- The structured response type.
	See Also:
	
	
		- [`responseAs(java.lang.Class<T>)`](#responseAs(java.lang.Class))
	- ### map
	
	
	\<T\> [Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")\<T\> map([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),T\> mapper)
	Map the String response from the model into a different response type.
	- ### onFailure
	
	
	[Agent.Effect.FailureBuilder](Agent.Effect.FailureBuilder.html "interface in akka.javasdk.agent")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> onFailure([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> exceptionHandler)
	Handle failures that occur during model processing. This method allows recovery from
	 various types of exceptions including:
	
	 
		- [`ModelException`](ModelException.html "class in akka.javasdk.agent") \- General model processing failures
		- [`RateLimitException`](RateLimitException.html "class in akka.javasdk.agent") \- API rate limiting exceeded
		- [`ModelTimeoutException`](ModelTimeoutException.html "class in akka.javasdk.agent") \- Model request timeout
		- [`UnsupportedFeatureException`](UnsupportedFeatureException.html "class in akka.javasdk.agent") \- Unsupported model features
		- [`InternalServerException`](InternalServerException.html "class in akka.javasdk.agent") \- Internal service errors
		- [`JsonParsingException`](JsonParsingException.html "class in akka.javasdk.agent") \- Response parsing failures
		- [`ToolCallLimitReachedException`](ToolCallLimitReachedException.html "class in akka.javasdk.agent") \- Tool call limit exceeded
		- [`ToolCallExecutionException`](ToolCallExecutionException.html "class in akka.javasdk.agent") \- Function tool execution errors
		- [`McpToolCallExecutionException`](McpToolCallExecutionException.html "class in akka.javasdk.agent") \- MCP tool execution errors
		- [`Guardrail.GuardrailException`](Guardrail.GuardrailException.html "class in akka.javasdk.agent") \- Guardrail violations

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.FailureBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.MappingResponseBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.GuardrailException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/InternalServerException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/JsonParsingException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/McpToolCallExecutionException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelTimeoutException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RateLimitException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ToolCallExecutionException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ToolCallLimitReachedException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UnsupportedFeatureException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.OnSuccessBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.OnSuccessBuilder.html)*