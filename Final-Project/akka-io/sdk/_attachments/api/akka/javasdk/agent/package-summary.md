---
description: 'declaration: package: akka.javasdk.agent'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:23Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html
title: akka.javasdk.agent
---

# akka.javasdk.agent

> **Summary:** declaration: package: akka.javasdk.agent

## Content

# Package akka.javasdk.agent

---

package akka.javasdk.agent

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.

[akka.javasdk.agent.evaluator](evaluator/package-summary.html)
- Class
Description
[Agent](Agent.html "class in akka.javasdk.agent")

An AI agent component that interacts with an AI model, such as a large language model (LLM), to
 perform specific tasks.

[Agent.AgentReply](Agent.AgentReply.html "class in akka.javasdk.agent")\<T\>

A detailed reply from an agent component call, containing both the result and additional
 information, like token usage.

[Agent.Effect](Agent.Effect.html "interface in akka.javasdk.agent")\<T\>

An Effect is a description of what the runtime needs to do after the command is handled.

[Agent.Effect.Builder](Agent.Effect.Builder.html "interface in akka.javasdk.agent")

Construct the effect that is returned by the message handler.

[Agent.Effect.FailureBuilder](Agent.Effect.FailureBuilder.html "interface in akka.javasdk.agent")\<Result\>
 
[Agent.Effect.MappingFailureBuilder](Agent.Effect.MappingFailureBuilder.html "interface in akka.javasdk.agent")\<Result\>
 
[Agent.Effect.MappingResponseBuilder](Agent.Effect.MappingResponseBuilder.html "interface in akka.javasdk.agent")\<Result\>
 
[Agent.Effect.OnSuccessBuilder](Agent.Effect.OnSuccessBuilder.html "interface in akka.javasdk.agent")
 
[Agent.StreamEffect](Agent.StreamEffect.html "interface in akka.javasdk.agent")
 
[Agent.StreamEffect.Builder](Agent.StreamEffect.Builder.html "interface in akka.javasdk.agent")

Construct the effect for token streaming that is returned by the message handler.

[Agent.StreamEffect.OnSuccessBuilder](Agent.StreamEffect.OnSuccessBuilder.html "interface in akka.javasdk.agent")
 
[Agent.TokenUsage](Agent.TokenUsage.html "class in akka.javasdk.agent")
 
[AgentContext](AgentContext.html "interface in akka.javasdk.agent")

Context information available to an agent during command handling.

[AgentRegistry](AgentRegistry.html "interface in akka.javasdk.agent")

The registry contains information about all agents.

[AgentRegistry.AgentInfo](AgentRegistry.AgentInfo.html "class in akka.javasdk.agent")
 
[ContentLoader](ContentLoader.html "interface in akka.javasdk.agent")

Interface for loading content from URIs.

[ContentLoader.LoadedContent](ContentLoader.LoadedContent.html "class in akka.javasdk.agent")

Represents loaded content with its binary data and MIME type.

[EvaluationResult](EvaluationResult.html "interface in akka.javasdk.agent")

When an [`Agent`](Agent.html "class in akka.javasdk.agent") returns an `EvaluationResult` it is tracked in metrics and traces.

[Guardrail](Guardrail.html "interface in akka.javasdk.agent")

Guardrails can protect against harmful inputs and outputs to/from model and tool calls.

[Guardrail.GuardrailException](Guardrail.GuardrailException.html "class in akka.javasdk.agent")

Thrown when the text didn't pass the evaluation criteria, and `report-only` is true.

[Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent")

The result of the guardrail evaluation.

[GuardrailContext](GuardrailContext.html "interface in akka.javasdk.agent")

Context information available to a guardrail constructor.

[ImageLoader](ImageLoader.html "interface in akka.javasdk.agent")
Deprecated, for removal: This API element is subject to removal in a future version.
use [`ContentLoader`](ContentLoader.html "interface in akka.javasdk.agent")

[ImageLoader.LoadedImage](ImageLoader.LoadedImage.html "class in akka.javasdk.agent")

Represents a loaded image with its binary data and MIME type.

[InternalServerException](InternalServerException.html "class in akka.javasdk.agent")

Exception thrown when there is an internal failure within the agent system.

[JsonParsingException](JsonParsingException.html "class in akka.javasdk.agent")

Exception thrown when there is an error parsing JSON responses from the model.

[McpToolCallExecutionException](McpToolCallExecutionException.html "class in akka.javasdk.agent")

Exception thrown when an MCP (Model Context Protocol) tool call fails during execution.

[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")

Filters for controlling which messages are included when retrieving session history from memory.

[MemoryFilter.Exclude](MemoryFilter.Exclude.html "class in akka.javasdk.agent")

Filter that excludes messages from agents with the specified component IDs or roles.

[MemoryFilter.Include](MemoryFilter.Include.html "class in akka.javasdk.agent")

Filter that includes messages from agents with the specified component IDs or roles.

[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")

A fluent builder for composing multiple memory filters.

[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")

Interface for configuring memory management in agent systems.

[MemoryProvider.CustomMemoryProvider](MemoryProvider.CustomMemoryProvider.html "class in akka.javasdk.agent")

Memory provider that uses a custom SessionMemory implementation.

[MemoryProvider.Disabled](MemoryProvider.Disabled.html "class in akka.javasdk.agent")

Disabled memory provider, which does not store or retrieve contextual history.

[MemoryProvider.FromConfig](MemoryProvider.FromConfig.html "class in akka.javasdk.agent")

Configuration\-based memory provider that reads settings from the specified path.

[MemoryProvider.LimitedWindowMemoryProvider](MemoryProvider.LimitedWindowMemoryProvider.html "class in akka.javasdk.agent")

Memory provider that limits session history based on size or message count.

[MessageContent](MessageContent.html "interface in akka.javasdk.agent")

Represents a piece of content within a multimodal message to an AI model.

[MessageContent.ImageMessageContent](MessageContent.ImageMessageContent.html "class in akka.javasdk.agent")

Factory methods for creating image message content.

[MessageContent.ImageMessageContent.DetailLevel](MessageContent.ImageMessageContent.DetailLevel.html "enum class in akka.javasdk.agent")

Controls the level of detail used when processing images.

[MessageContent.ImageUrlMessageContent](MessageContent.ImageUrlMessageContent.html "class in akka.javasdk.agent")

Image content within a user message, referenced by URL.

[MessageContent.LoadableMessageContent](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent")
 
[MessageContent.PdfMessageContent](MessageContent.PdfMessageContent.html "class in akka.javasdk.agent")

Factory methods for creating PDF message content.

[MessageContent.PdfUrlMessageContent](MessageContent.PdfUrlMessageContent.html "class in akka.javasdk.agent")

PDF content within a user message, referenced by URL.

[MessageContent.TextMessageContent](MessageContent.TextMessageContent.html "class in akka.javasdk.agent")

Text content within a user message.

[ModelException](ModelException.html "class in akka.javasdk.agent")

Exception thrown when there is a failure with the AI model.

[ModelProvider](ModelProvider.html "interface in akka.javasdk.agent")

Configuration interface for AI model providers used by agents.

[ModelProvider.Anthropic](ModelProvider.Anthropic.html "class in akka.javasdk.agent")

Settings for the Anthropic Large Language Model provider.

[ModelProvider.Bedrock](ModelProvider.Bedrock.html "class in akka.javasdk.agent")
 
[ModelProvider.Custom](ModelProvider.Custom.html "interface in akka.javasdk.agent")

Custom models can be added by implementing this interface and, and the underlying
 implementations of `dev.langchain4j.model.chat.ChatModel` and (optionally) `dev.langchain4j.model.chat.StreamingChatModel`.

[ModelProvider.FromConfig](ModelProvider.FromConfig.html "class in akka.javasdk.agent")
 
[ModelProvider.GoogleAIGemini](ModelProvider.GoogleAIGemini.html "class in akka.javasdk.agent")

Settings for the Google AI Gemini Large Language Model provider.

[ModelProvider.HuggingFace](ModelProvider.HuggingFace.html "class in akka.javasdk.agent")
 
[ModelProvider.LocalAI](ModelProvider.LocalAI.html "class in akka.javasdk.agent")

Settings for the Local AI Large Language Model provider.

[ModelProvider.Ollama](ModelProvider.Ollama.html "class in akka.javasdk.agent")

Settings for the Ollama Large Language Model provider.

[ModelProvider.OpenAi](ModelProvider.OpenAi.html "class in akka.javasdk.agent")

Settings for the OpenAI Large Language Model provider.

[ModelProvider.VertexAi](ModelProvider.VertexAi.html "class in akka.javasdk.agent")

Settings for the Google Cloud Vertex AI Large Language Model provider.

[ModelTimeoutException](ModelTimeoutException.html "class in akka.javasdk.agent")

Exception thrown when a request to an AI model or external service times out.

[PromptTemplate](PromptTemplate.html "class in akka.javasdk.agent")

A built\-in Event Sourced Entity for managing dynamic prompt templates with change history.

[PromptTemplate.Event](PromptTemplate.Event.html "interface in akka.javasdk.agent")
 
[PromptTemplate.Event.Deleted](PromptTemplate.Event.Deleted.html "class in akka.javasdk.agent")
 
[PromptTemplate.Event.Updated](PromptTemplate.Event.Updated.html "class in akka.javasdk.agent")
 
[PromptTemplate.Prompt](PromptTemplate.Prompt.html "class in akka.javasdk.agent")
 
[RateLimitException](RateLimitException.html "class in akka.javasdk.agent")

Exception thrown when rate limits are exceeded when calling an AI model or external service.

[RemoteMcpTools](RemoteMcpTools.html "interface in akka.javasdk.agent")

Configuration for accessing tools from remote Model Context Protocol (MCP) servers.

[RemoteMcpTools.ToolInterceptor](RemoteMcpTools.ToolInterceptor.html "interface in akka.javasdk.agent")
 
[RemoteMcpTools.ToolInterceptorContext](RemoteMcpTools.ToolInterceptorContext.html "interface in akka.javasdk.agent")

Context details about the intercepted MCP tool call.

[SessionHistory](SessionHistory.html "class in akka.javasdk.agent")
 
[SessionMemory](SessionMemory.html "interface in akka.javasdk.agent")

Interface for managing contextual session history between users and AI models.

[SessionMemoryEntity](SessionMemoryEntity.html "class in akka.javasdk.agent")

Built\-in Event Sourced Entity that provides persistent session memory for agent interactions with
 the AI model.

[SessionMemoryEntity.AddInteractionCmd](SessionMemoryEntity.AddInteractionCmd.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.AddMultimodalInteractionCmd](SessionMemoryEntity.AddMultimodalInteractionCmd.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.CompactionCmd](SessionMemoryEntity.CompactionCmd.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event](SessionMemoryEntity.Event.html "interface in akka.javasdk.agent")

Sealed interface representing events that can occur in the SessionMemory entity.

[SessionMemoryEntity.Event.AiMessageAdded](SessionMemoryEntity.Event.AiMessageAdded.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event.Deleted](SessionMemoryEntity.Event.Deleted.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event.HistoryCleared](SessionMemoryEntity.Event.HistoryCleared.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event.LimitedWindowSet](SessionMemoryEntity.Event.LimitedWindowSet.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event.MultimodalUserMessageAdded](SessionMemoryEntity.Event.MultimodalUserMessageAdded.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event.ToolResponseMessageAdded](SessionMemoryEntity.Event.ToolResponseMessageAdded.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.Event.UserMessageAdded](SessionMemoryEntity.Event.UserMessageAdded.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.GetHistoryCmd](SessionMemoryEntity.GetHistoryCmd.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.LimitedWindow](SessionMemoryEntity.LimitedWindow.html "class in akka.javasdk.agent")
 
[SessionMemoryEntity.State](SessionMemoryEntity.State.html "class in akka.javasdk.agent")
 
[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")

Interface for message representation used inside the SessionMemoryEntity state.

[SessionMessage.AiMessage](SessionMessage.AiMessage.html "class in akka.javasdk.agent")
 
[SessionMessage.MessageContent](SessionMessage.MessageContent.html "interface in akka.javasdk.agent")
 
[SessionMessage.MessageContent.ImageUriMessageContent](SessionMessage.MessageContent.ImageUriMessageContent.html "class in akka.javasdk.agent")
 
[SessionMessage.MessageContent.PdfUriMessageContent](SessionMessage.MessageContent.PdfUriMessageContent.html "class in akka.javasdk.agent")
 
[SessionMessage.MessageContent.TextMessageContent](SessionMessage.MessageContent.TextMessageContent.html "class in akka.javasdk.agent")
 
[SessionMessage.MultimodalUserMessage](SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent")
 
[SessionMessage.TokenUsage](SessionMessage.TokenUsage.html "class in akka.javasdk.agent")
 
[SessionMessage.ToolCallRequest](SessionMessage.ToolCallRequest.html "class in akka.javasdk.agent")
 
[SessionMessage.ToolCallResponse](SessionMessage.ToolCallResponse.html "class in akka.javasdk.agent")
 
[SessionMessage.UserMessage](SessionMessage.UserMessage.html "class in akka.javasdk.agent")
 
[SimilarityGuard](SimilarityGuard.html "class in akka.javasdk.agent")

The SimilarityGuard evaluates the text by making a similarity search in a dataset of "bad
 examples".

[TextGuardrail](TextGuardrail.html "interface in akka.javasdk.agent")

Guardrails can protect against harmful inputs and outputs to/from model and tool calls.

[ToolCallExecutionException](ToolCallExecutionException.html "class in akka.javasdk.agent")

Exception thrown when there is a failure executing a tool call.

[ToolCallLimitReachedException](ToolCallLimitReachedException.html "class in akka.javasdk.agent")

Thrown when the maximum number of tool call steps has been reached.

[UnsupportedFeatureException](UnsupportedFeatureException.html "class in akka.javasdk.agent")

Exception thrown when an unsupported feature is requested from an AI model or service.

[UserMessage](UserMessage.html "class in akka.javasdk.agent")

Represents a user message that can contain multimodal content for interaction with AI models.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.AgentReply.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.FailureBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.MappingFailureBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.MappingResponseBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.TokenUsage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentRegistry.AgentInfo.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentRegistry.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.LoadedContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/EvaluationResult.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.GuardrailException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/GuardrailContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ImageLoader.LoadedImage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ImageLoader.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/InternalServerException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/JsonParsingException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/McpToolCallExecutionException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.Exclude.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.Include.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.MemoryFilterSupplier.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.CustomMemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.Disabled.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.FromConfig.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.LimitedWindowMemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.DetailLevel.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageUrlMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.LoadableMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfUrlMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.TextMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Anthropic.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Bedrock.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.Custom.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.FromConfig.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.GoogleAIGemini.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html)*