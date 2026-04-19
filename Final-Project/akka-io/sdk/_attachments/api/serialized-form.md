---
description: serialized forms
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:15Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/serialized-form.html
title: Serialized Form
---

# Serialized Form

> **Summary:** serialized forms

## Content

# Serialized Form

- ## Package [akka.javasdk](akka/javasdk/package-summary.html)

	- ### Class akka.javasdk.BuildInfo$
	
	
	class BuildInfo$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Exception Class [akka.javasdk.CommandException](akka/javasdk/CommandException.html "class in akka.javasdk")
	
	
	class CommandException extends [IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
- ## Package [akka.javasdk.agent](akka/javasdk/agent/package-summary.html)

	- ### Exception Class [akka.javasdk.agent.Guardrail.GuardrailException](akka/javasdk/agent/Guardrail.GuardrailException.html "class in akka.javasdk.agent")
	
	
	class GuardrailException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	- ### Exception Class [akka.javasdk.agent.InternalServerException](akka/javasdk/agent/InternalServerException.html "class in akka.javasdk.agent")
	
	
	class InternalServerException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	- ### Exception Class [akka.javasdk.agent.JsonParsingException](akka/javasdk/agent/JsonParsingException.html "class in akka.javasdk.agent")
	
	
	class JsonParsingException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### rawJson
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") rawJson
			```
	- ### Exception Class [akka.javasdk.agent.McpToolCallExecutionException](akka/javasdk/agent/McpToolCallExecutionException.html "class in akka.javasdk.agent")
	
	
	class McpToolCallExecutionException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### endpoint
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") endpoint
			```
			- ##### toolName
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toolName
			```
	- ### Exception Class [akka.javasdk.agent.ModelException](akka/javasdk/agent/ModelException.html "class in akka.javasdk.agent")
	
	
	class ModelException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	- ### Exception Class [akka.javasdk.agent.ModelTimeoutException](akka/javasdk/agent/ModelTimeoutException.html "class in akka.javasdk.agent")
	
	
	class ModelTimeoutException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	- ### Exception Class [akka.javasdk.agent.RateLimitException](akka/javasdk/agent/RateLimitException.html "class in akka.javasdk.agent")
	
	
	class RateLimitException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	- ### Exception Class [akka.javasdk.agent.ToolCallExecutionException](akka/javasdk/agent/ToolCallExecutionException.html "class in akka.javasdk.agent")
	
	
	class ToolCallExecutionException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### toolName
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toolName
			```
	- ### Exception Class [akka.javasdk.agent.ToolCallLimitReachedException](akka/javasdk/agent/ToolCallLimitReachedException.html "class in akka.javasdk.agent")
	
	
	class ToolCallLimitReachedException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	- ### Exception Class [akka.javasdk.agent.UnsupportedFeatureException](akka/javasdk/agent/UnsupportedFeatureException.html "class in akka.javasdk.agent")
	
	
	class UnsupportedFeatureException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
- ## Package [akka.javasdk.client](akka/javasdk/client/package-summary.html)

	- ### Exception Class [akka.javasdk.client.NoEntryFoundException](akka/javasdk/client/NoEntryFoundException.html "class in akka.javasdk.client")
	
	
	class NoEntryFoundException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
- ## Package [akka.javasdk.impl.agent](akka/javasdk/impl/agent/package-summary.html)

	- ### Exception Class akka.javasdk.impl.agent.AgentException
	
	
	class AgentException extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### cause
			
			
			
			```
			scala.Option<[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")> cause
			```
			- ##### commandName
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") commandName
			```
			- ##### message
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message
			```
	- ### Class akka.javasdk.impl.agent.AgentException$
	
	
	class AgentException$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.AgentRegistryImpl.AgentDetails
	
	
	class AgentDetails extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### agentClass
			
			
			
			```
			[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<[Agent](akka/javasdk/agent/Agent.html "class in akka.javasdk.agent")> agentClass
			```
			- ##### description
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description
			```
			- ##### id
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id
			```
			- ##### name
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
			```
			- ##### role
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role
			```
	- ### Class akka.javasdk.impl.agent.AgentRegistryImpl.AgentDetails$
	
	
	class AgentDetails$ extends scala.runtime.AbstractFunction5\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<[Agent](akka/javasdk/agent/Agent.html "class in akka.javasdk.agent")\>,akka.javasdk.impl.agent.AgentRegistryImpl.AgentDetails\> implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.ConstantSystemMessage
	
	
	class ConstantSystemMessage extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### message
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message
			```
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.ConstantSystemMessage$
	
	
	class ConstantSystemMessage$ extends scala.runtime.AbstractFunction1\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),akka.javasdk.impl.agent.BaseAgentEffectBuilder.ConstantSystemMessage\> implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.NoPrimaryEffect$
	
	
	class NoPrimaryEffect$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.RequestModel
	
	
	class RequestModel extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### contentLoader
			
			
			
			```
			scala.Option<[ContentLoader](akka/javasdk/agent/ContentLoader.html "interface in akka.javasdk.agent")> contentLoader
			```
			- ##### failureMapping
			
			
			
			```
			scala.Option<scala.Function1<[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang"),[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")>> failureMapping
			```
			- ##### includeJsonSchema
			
			
			
			```
			boolean includeJsonSchema
			```
			- ##### mcpTools
			
			
			
			```
			scala.collection.immutable.Seq<[RemoteMcpTools](akka/javasdk/agent/RemoteMcpTools.html "interface in akka.javasdk.agent")> mcpTools
			```
			- ##### memoryProvider
			
			
			
			```
			[MemoryProvider](akka/javasdk/agent/MemoryProvider.html "interface in akka.javasdk.agent") memoryProvider
			```
			- ##### modelProvider
			
			
			
			```
			[ModelProvider](akka/javasdk/agent/ModelProvider.html "interface in akka.javasdk.agent") modelProvider
			```
			- ##### replyMetadata
			
			
			
			```
			[Metadata](akka/javasdk/Metadata.html "interface in akka.javasdk") replyMetadata
			```
			- ##### responseMapping
			
			
			
			```
			scala.Option<scala.Function1<[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang"),[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")>> responseMapping
			```
			- ##### responseType
			
			
			
			```
			[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<?> responseType
			```
			- ##### systemMessage
			
			
			
			```
			akka.javasdk.impl.agent.BaseAgentEffectBuilder.SystemMessage systemMessage
			```
			- ##### toolInstancesOrClasses
			
			
			
			```
			scala.collection.immutable.Seq<[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")> toolInstancesOrClasses
			```
			- ##### userMessage
			
			
			
			```
			[UserMessage](akka/javasdk/agent/UserMessage.html "class in akka.javasdk.agent") userMessage
			```
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.RequestModel$
	
	
	class RequestModel$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.TemplateSystemMessage
	
	
	class TemplateSystemMessage extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### args
			
			
			
			```
			scala.collection.immutable.Seq<[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")> args
			```
			- ##### templateId
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") templateId
			```
	- ### Class akka.javasdk.impl.agent.BaseAgentEffectBuilder.TemplateSystemMessage$
	
	
	class TemplateSystemMessage$ extends scala.runtime.AbstractFunction2\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),scala.collection.immutable.Seq\<[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")\>,akka.javasdk.impl.agent.BaseAgentEffectBuilder.TemplateSystemMessage\> implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.ConfiguredGuardrail
	
	
	class ConfiguredGuardrail extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### agentRoles
			
			
			
			```
			scala.collection.immutable.Set<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> agentRoles
			```
			- ##### agents
			
			
			
			```
			scala.collection.immutable.Set<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> agents
			```
			- ##### category
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") category
			```
			- ##### config
			
			
			
			```
			com.typesafe.config.Config config
			```
			- ##### implementationClass
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") implementationClass
			```
			- ##### name
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
			```
			- ##### reportOnly
			
			
			
			```
			boolean reportOnly
			```
			- ##### useFor
			
			
			
			```
			scala.collection.immutable.Set<akka.javasdk.impl.agent.ConfiguredGuardrail.UseFor> useFor
			```
	- ### Class akka.javasdk.impl.agent.ConfiguredGuardrail$
	
	
	class ConfiguredGuardrail$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.ConfiguredGuardrail$UseFor$McpToolRequest$
	
	
	class ConfiguredGuardrail$UseFor$McpToolRequest$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.ConfiguredGuardrail$UseFor$McpToolResponse$
	
	
	class ConfiguredGuardrail$UseFor$McpToolResponse$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.ConfiguredGuardrail$UseFor$ModelRequest$
	
	
	class ConfiguredGuardrail$UseFor$ModelRequest$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.ConfiguredGuardrail$UseFor$ModelResponse$
	
	
	class ConfiguredGuardrail$UseFor$ModelResponse$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.GuardrailProvider.AgentGuardrails
	
	
	class AgentGuardrails extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### entries
			
			
			
			```
			scala.collection.immutable.Seq<akka.javasdk.impl.agent.GuardrailProvider.GuardrailEntry> entries
			```
			- ##### mcpToolRequestGuardrails
			
			
			
			```
			scala.collection.immutable.Seq<akka.runtime.sdk.spi.SpiAgent.Guardrail> mcpToolRequestGuardrails
			```
			- ##### mcpToolResponseGuardrails
			
			
			
			```
			scala.collection.immutable.Seq<akka.runtime.sdk.spi.SpiAgent.Guardrail> mcpToolResponseGuardrails
			```
			- ##### modelRequestGuardrails
			
			
			
			```
			scala.collection.immutable.Seq<akka.runtime.sdk.spi.SpiAgent.Guardrail> modelRequestGuardrails
			```
			- ##### modelResponseGuardrails
			
			
			
			```
			scala.collection.immutable.Seq<akka.runtime.sdk.spi.SpiAgent.Guardrail> modelResponseGuardrails
			```
	- ### Class akka.javasdk.impl.agent.GuardrailProvider.AgentGuardrails$
	
	
	class AgentGuardrails$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<akka.javasdk.impl.agent.GuardrailProvider.GuardrailEntry\>,akka.javasdk.impl.agent.GuardrailProvider.AgentGuardrails\> implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.GuardrailProvider.GuardrailEntry
	
	
	class GuardrailEntry extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### configuredGuardrail
			
			
			
			```
			akka.javasdk.impl.agent.ConfiguredGuardrail configuredGuardrail
			```
			- ##### guardrail
			
			
			
			```
			[Guardrail](akka/javasdk/agent/Guardrail.html "interface in akka.javasdk.agent") guardrail
			```
	- ### Class akka.javasdk.impl.agent.GuardrailProvider.GuardrailEntry$
	
	
	class GuardrailEntry$ extends scala.runtime.AbstractFunction2\<akka.javasdk.impl.agent.ConfiguredGuardrail,[Guardrail](akka/javasdk/agent/Guardrail.html "interface in akka.javasdk.agent"),akka.javasdk.impl.agent.GuardrailProvider.GuardrailEntry\> implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.GuardrailSettings
	
	
	class GuardrailSettings extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### configuredGuardrails
			
			
			
			```
			scala.collection.immutable.Seq<akka.javasdk.impl.agent.ConfiguredGuardrail> configuredGuardrails
			```
	- ### Class akka.javasdk.impl.agent.GuardrailSettings$
	
	
	class GuardrailSettings$ extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()
	- ### Class akka.javasdk.impl.agent.RemoteMcpToolsImpl
	
	
	class RemoteMcpToolsImpl extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialized Fields
		
		
		
			- ##### additionalClientHeaders
			
			
			
			```
			scala.collection.immutable.Seq<akka.http.javadsl.model.HttpHeader> additionalClientHeaders
			```
			- ##### interceptor
			
			
			
			```
			scala.Option<[RemoteMcpTools.ToolInterceptor](akka/javasdk/agent/RemoteMcpTools.ToolInterceptor.html "interface in akka.javasdk.agent")> interceptor
			```
			- ##### serverUri
			
			
			
			```
			[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serverUri
			```
			- ##### timeout
			
			
			
			```
			scala.concurrent.duration.FiniteDuration timeout
			```
			- ##### toolNameFilter
			
			
			
			```
			scala.Option<[Predicate](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Predicate.html "class or interface in java.util.function")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>> toolNameFilter
			```
	- ### Class akka.javasdk.impl.agent.RemoteMcpToolsImpl$
	
	
	class RemoteMcpToolsImpl$ extends scala.runtime.AbstractFunction5\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),scala.Option\<[Predicate](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Predicate.html "class or interface in java.util.function")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\>\>,scala.Option\<[RemoteMcpTools.ToolInterceptor](akka/javasdk/agent/RemoteMcpTools.ToolInterceptor.html "interface in akka.javasdk.agent")\>,scala.collection.immutable.Seq\<akka.http.javadsl.model.HttpHeader\>,scala.concurrent.duration.FiniteDuration,akka.javasdk.impl.agent.RemoteMcpToolsImpl\> implements [Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")
	
		- #### Serialization Methods
		
		
		
			- ##### writeReplace
			
			
			private [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") writeReplace()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CommandException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.GuardrailException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/InternalServerException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/JsonParsingException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/McpToolCallExecutionException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ModelTimeoutException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RateLimitException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.ToolInterceptor.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ToolCallExecutionException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ToolCallLimitReachedException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UnsupportedFeatureException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/UserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/NoEntryFoundException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/serialized-form.html](https://doc.akka.io/sdk/_attachments/api/serialized-form.html)*