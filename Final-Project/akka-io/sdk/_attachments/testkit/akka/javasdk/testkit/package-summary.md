---
description: 'declaration: package: akka.javasdk.testkit'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:32Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html
title: akka.javasdk.testkit
---

# akka.javasdk.testkit

> **Summary:** declaration: package: akka.javasdk.testkit

## Content

# Package akka.javasdk.testkit

---

package akka.javasdk.testkit

- Class
Description
[AsyncCallsSupport](AsyncCallsSupport.html "class in akka.javasdk.testkit")
 
[DeferredCallDetails](DeferredCallDetails.html "interface in akka.javasdk.testkit")\<I,O\>
 
[EventingTestKit](EventingTestKit.html "interface in akka.javasdk.testkit")
 
[EventingTestKit.IncomingMessages](EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")

Allows to simulate publishing messages for the purposes of testing incoming message flow.

[EventingTestKit.Message](EventingTestKit.Message.html "interface in akka.javasdk.testkit")\<P\>
 
[EventingTestKit.MessageBuilder](EventingTestKit.MessageBuilder.html "class in akka.javasdk.testkit")
 
[EventingTestKit.OutgoingMessages](EventingTestKit.OutgoingMessages.html "interface in akka.javasdk.testkit")

Allows to assert published messages for the purposes of testing outgoing message flow.

[EventSourcedResult](EventSourcedResult.html "interface in akka.javasdk.testkit")\<R\>

Represents the result of an EventSourcedEntity handling a command when run in through the
 testkit.

[EventSourcedTestKit](EventSourcedTestKit.html "class in akka.javasdk.testkit")\<S,E,ES extends akka.javasdk.eventsourcedentity.EventSourcedEntity\<S,E\>\>

EventSourced Testkit for use in unit tests for EventSourced entities.

[KeyValueEntityResult](KeyValueEntityResult.html "interface in akka.javasdk.testkit")\<R\>

Represents the result of a KeyValueEntity handling a command when run in through the testkit.

[KeyValueEntityTestKit](KeyValueEntityTestKit.html "class in akka.javasdk.testkit")\<S,E extends akka.javasdk.keyvalueentity.KeyValueEntity\<S\>\>

KeyValueEntity Testkit for use in unit tests for Value entities.

[MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit")

This trait is meant to allow for unit testing when a service has cross\-component or cross\-service
 calls.

[SerializationTestkit](SerializationTestkit.html "class in akka.javasdk.testkit")

Helper class for serializing and deserializing objects for testing schema migration.

[SseRouteTester](SseRouteTester.html "interface in akka.javasdk.testkit")
 
[TelemetryReader](TelemetryReader.html "class in akka.javasdk.testkit")

A test utility for reading and inspecting telemetry data captured during test execution.

[TestKit](TestKit.html "class in akka.javasdk.testkit")

Testkit for running services locally.

[TestKit.MockedEventing](TestKit.MockedEventing.html "class in akka.javasdk.testkit")
 
[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")

Settings for testkit.

[TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")
 
[TestKitSupport](TestKitSupport.html "class in akka.javasdk.testkit")

This class provided the necessary infrastructure to run integration test for projects built with
 the Java SDK.

[TestModelProvider](TestModelProvider.html "class in akka.javasdk.testkit")

A `ModelProvider` implementation for testing purposes that does not use a real AI model.

[TestModelProvider.AiResponse](TestModelProvider.AiResponse.html "class in akka.javasdk.testkit")

Represents an AI response, which can include a message and/or list of tool invocation requests.

[TestModelProvider.InputMessage](TestModelProvider.InputMessage.html "interface in akka.javasdk.testkit")

Represents an input message.

[TestModelProvider.MissingModelResponseException](TestModelProvider.MissingModelResponseException.html "class in akka.javasdk.testkit")
 
[TestModelProvider.ToolInvocationRequest](TestModelProvider.ToolInvocationRequest.html "class in akka.javasdk.testkit")

Represents a tool invocation request with a name and arguments.

[TestModelProvider.ToolResult](TestModelProvider.ToolResult.html "class in akka.javasdk.testkit")

Represents a tool result.

[TestModelProvider.UserMessage](TestModelProvider.UserMessage.html "class in akka.javasdk.testkit")

Represents a user message.

[TestModelProvider.WhenClause](TestModelProvider.WhenClause.html "class in akka.javasdk.testkit")

Base class for building reply configurations for specific input predicates.

[TestModelProvider.WhenToolReplyClause](TestModelProvider.WhenToolReplyClause.html "class in akka.javasdk.testkit")

Specialized reply builder for handling tool result messages.

[TimedActionResult](TimedActionResult.html "interface in akka.javasdk.testkit")

Represents the result of an Action handling a command when run in through the testkit.

[TimedActionTestkit](TimedActionTestkit.html "class in akka.javasdk.testkit")\<A extends akka.javasdk.timedaction.TimedAction\>

TimedAction Testkit for use in unit tests for TimedActions.

[WebSocketRouteTester](WebSocketRouteTester.html "interface in akka.javasdk.testkit")
 
[WebSocketRouteTester.WsConnection](WebSocketRouteTester.WsConnection.html "class in akka.javasdk.testkit")\<T\>

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/AsyncCallsSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/DeferredCallDetails.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedTestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.IncomingMessages.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.Message.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.MessageBuilder.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.OutgoingMessages.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityTestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/MockRegistry.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SerializationTestkit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SseRouteTester.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TelemetryReader.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.MockedEventing.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.EventingSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKitSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.AiResponse.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.InputMessage.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.MissingModelResponseException.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.ToolInvocationRequest.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.ToolResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.UserMessage.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.WhenClause.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.WhenToolReplyClause.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestModelProvider.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TimedActionResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TimedActionTestkit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.WsConnection.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html)*