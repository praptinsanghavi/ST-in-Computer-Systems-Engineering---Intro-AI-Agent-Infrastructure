---
description: 'declaration: package: akka.javasdk.testkit.junit.jupiter, class: TestkitExtension'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:31Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/junit/jupiter/TestkitExtension.html
title: TestkitExtension
---

# TestkitExtension

> **Summary:** declaration: package: akka.javasdk.testkit.junit.jupiter, class: TestkitExtension

## Content

Package [akka.javasdk.testkit.junit.jupiter](package-summary.html)
# Class TestkitExtension

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.junit.jupiter.TestkitExtension

All Implemented Interfaces:
`org.junit.jupiter.api.extension.AfterAllCallback`, `org.junit.jupiter.api.extension.BeforeAllCallback`, `org.junit.jupiter.api.extension.Extension`

---

public final class TestkitExtension
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
implements org.junit.jupiter.api.extension.BeforeAllCallback, org.junit.jupiter.api.extension.AfterAllCallback
A JUnit 5 "Jupiter" Extension for [`TestKit`](../../TestKit.html "class in akka.javasdk.testkit"), which automatically manages the lifecycle of
 the testkit. The testkit will be automatically stopped when the test completes or fails.

- ## Constructor Summary

Constructors

Constructor
Description
`[TestkitExtension](#%3Cinit%3E())()`
 
`[TestkitExtension](#%3Cinit%3E(akka.javasdk.testkit.TestKit.Settings))([TestKit.Settings](../../TestKit.Settings.html "class in akka.javasdk.testkit") settings)`
- ## Method Summary

Modifier and Type
Method
Description
`void`
`[afterAll](#afterAll(org.junit.jupiter.api.extension.ExtensionContext))(org.junit.jupiter.api.extension.ExtensionContext extensionContext)`

JUnit5 support \- extension based

`void`
`[beforeAll](#beforeAll(org.junit.jupiter.api.extension.ExtensionContext))(org.junit.jupiter.api.extension.ExtensionContext extensionContext)`

JUnit5 support \- extension based

`akka.actor.typed.ActorSystem<?>`
`[getActorSystem](#getActorSystem())()`

Get an `ActorSystem` for creating Akka HTTP clients.

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getEventSourcedEntityIncomingMessages](#getEventSourcedEntityIncomingMessages(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.eventsourcedentity.EventSourcedEntity<?,?>> eventSourcedEntityClass)`

Get incoming messages for EventSourcedEntity.

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getEventSourcedEntityIncomingMessages](#getEventSourcedEntityIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") typeId)`

Deprecated, for removal: This API element is subject to removal in a future version.
Use [`getEventSourcedEntityIncomingMessages(Class)`](#getEventSourcedEntityIncomingMessages(java.lang.Class)) instead.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getHost](#getHost())()`

Get the host name/IP address where the service is available.

`akka.stream.Materializer`
`[getMaterializer](#getMaterializer())()`

An Akka Stream materializer to use for running streams.

`[EventingTestKit.MessageBuilder](../../EventingTestKit.MessageBuilder.html "class in akka.javasdk.testkit")`
`[getMessageBuilder](#getMessageBuilder())()`

Returns [`EventingTestKit.MessageBuilder`](../../EventingTestKit.MessageBuilder.html "class in akka.javasdk.testkit") utility to create [`EventingTestKit.Message`](../../EventingTestKit.Message.html "interface in akka.javasdk.testkit")s for the eventing testkit.

`int`
`[getPort](#getPort())()`

Get the local port where the Kalix service is available.

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getStreamIncomingMessages](#getStreamIncomingMessages(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") service,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") streamId)`

Get incoming messages for Stream (eventing.in.direct in case of protobuf SDKs).

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getTopicIncomingMessages](#getTopicIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)`

Get incoming messages for Topic.

`[EventingTestKit.OutgoingMessages](../../EventingTestKit.OutgoingMessages.html "interface in akka.javasdk.testkit")`
`[getTopicOutgoingMessages](#getTopicOutgoingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)`

Get mocked topic destination.

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getValueEntityIncomingMessages](#getValueEntityIncomingMessages(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.keyvalueentity.KeyValueEntity<?>> keyValueEntityClass)`

Get incoming messages for ValueEntity.

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getValueEntityIncomingMessages](#getValueEntityIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") typeId)`

Deprecated, for removal: This API element is subject to removal in a future version.
Use [`getValueEntityIncomingMessages(Class)`](#getValueEntityIncomingMessages(java.lang.Class)) instead.

`[EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit")`
`[getWorkflowIncomingMessages](#getWorkflowIncomingMessages(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.workflow.Workflow<?>> workflowClass)`

Get incoming messages for Workflow.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### TestkitExtension
	
	
	public TestkitExtension()
	- ### TestkitExtension
	
	
	public TestkitExtension([TestKit.Settings](../../TestKit.Settings.html "class in akka.javasdk.testkit") settings)
- ## Method Details

	- ### afterAll
	
	
	public void afterAll(org.junit.jupiter.api.extension.ExtensionContext extensionContext)
	 throws [Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")
	JUnit5 support \- extension based
	
	Specified by:
	`afterAll` in interface `org.junit.jupiter.api.extension.AfterAllCallback`
	Throws:
	`[Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")`
	- ### beforeAll
	
	
	public void beforeAll(org.junit.jupiter.api.extension.ExtensionContext extensionContext)
	 throws [Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")
	JUnit5 support \- extension based
	
	Specified by:
	`beforeAll` in interface `org.junit.jupiter.api.extension.BeforeAllCallback`
	Throws:
	`[Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")`
	- ### getValueEntityIncomingMessages
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.4\.2",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getValueEntityIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") typeId)
	Deprecated, for removal: This API element is subject to removal in a future version.
	Use [`getValueEntityIncomingMessages(Class)`](#getValueEntityIncomingMessages(java.lang.Class)) instead.
	
	Get incoming messages for ValueEntity.
	
	Parameters:
	`typeId` \- @TypeId or entity\_type of the ValueEntity (depending on the used SDK)
	- ### getValueEntityIncomingMessages
	
	
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getValueEntityIncomingMessages([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.keyvalueentity.KeyValueEntity\<?\>\> keyValueEntityClass)
	Get incoming messages for ValueEntity.
	
	Parameters:
	`keyValueEntityClass` \- class of the KeyValueEntity
	- ### getEventSourcedEntityIncomingMessages
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.4\.2",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getEventSourcedEntityIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") typeId)
	Deprecated, for removal: This API element is subject to removal in a future version.
	Use [`getEventSourcedEntityIncomingMessages(Class)`](#getEventSourcedEntityIncomingMessages(java.lang.Class)) instead.
	
	Get incoming messages for EventSourcedEntity.
	
	Parameters:
	`typeId` \- @TypeId or entity\_type of the EventSourcedEntity (depending on the used SDK)
	- ### getEventSourcedEntityIncomingMessages
	
	
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getEventSourcedEntityIncomingMessages([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.eventsourcedentity.EventSourcedEntity\<?,?\>\> eventSourcedEntityClass)
	Get incoming messages for EventSourcedEntity.
	
	Parameters:
	`eventSourcedEntityClass` \- class of the EventSourcedEntity
	- ### getWorkflowIncomingMessages
	
	
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getWorkflowIncomingMessages([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.workflow.Workflow\<?\>\> workflowClass)
	Get incoming messages for Workflow.
	
	Parameters:
	`workflowClass` \- class of the Workflow
	- ### getStreamIncomingMessages
	
	
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getStreamIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") service,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") streamId)
	Get incoming messages for Stream (eventing.in.direct in case of protobuf SDKs).
	
	Parameters:
	`service` \- service name
	`streamId` \- service stream id
	- ### getTopicIncomingMessages
	
	
	public [EventingTestKit.IncomingMessages](../../EventingTestKit.IncomingMessages.html "interface in akka.javasdk.testkit") getTopicIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)
	Get incoming messages for Topic.
	
	Parameters:
	`topic` \- topic name
	- ### getTopicOutgoingMessages
	
	
	public [EventingTestKit.OutgoingMessages](../../EventingTestKit.OutgoingMessages.html "interface in akka.javasdk.testkit") getTopicOutgoingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)
	Get mocked topic destination.
	
	Parameters:
	`topic` \- topic name
	- ### getMessageBuilder
	
	
	public [EventingTestKit.MessageBuilder](../../EventingTestKit.MessageBuilder.html "class in akka.javasdk.testkit") getMessageBuilder()
	Returns [`EventingTestKit.MessageBuilder`](../../EventingTestKit.MessageBuilder.html "class in akka.javasdk.testkit") utility to create [`EventingTestKit.Message`](../../EventingTestKit.Message.html "interface in akka.javasdk.testkit")s for the eventing testkit.
	- ### getHost
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getHost()
	Get the host name/IP address where the service is available. This is relevant in certain
	 Continuous Integration environments.
	- ### getPort
	
	
	public int getPort()
	Get the local port where the Kalix service is available.
	- ### getMaterializer
	
	
	public akka.stream.Materializer getMaterializer()
	An Akka Stream materializer to use for running streams. Needed for example in a command handler
	 which accepts streaming elements but returns a single async reply once all streamed elements
	 has been consumed.
	- ### getActorSystem
	
	
	public akka.actor.typed.ActorSystem\<?\> getActorSystem()
	Get an `ActorSystem` for creating Akka HTTP clients.
	
	Returns:
	test actor system

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.IncomingMessages.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.Message.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.MessageBuilder.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.OutgoingMessages.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/junit/jupiter/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/junit/jupiter/TestkitExtension.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/junit/jupiter/TestkitExtension.html)*