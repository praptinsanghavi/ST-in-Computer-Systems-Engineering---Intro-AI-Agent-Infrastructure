---
description: 'declaration: package: akka.javasdk.testkit, class: TestKit, class: Settings'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:22Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html
title: TestKit.Settings
---

# TestKit.Settings

> **Summary:** declaration: package: akka.javasdk.testkit, class: TestKit, class: Settings

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class TestKit.Settings

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.TestKit.Settings

Enclosing class:
`[TestKit](TestKit.html "class in akka.javasdk.testkit")`

---

public static class TestKit.Settings
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Settings for testkit.

- ## Nested Class Summary

Nested Classes

Modifier and Type
Class
Description
`static enum`
`[TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")`
- ## Field Summary

Fields

Modifier and Type
Field
Description
`final boolean`
`[aclEnabled](#aclEnabled)`

Whether ACL checking is enabled.

`final com.typesafe.config.Config`
`[additionalConfig](#additionalConfig)`
 
`static [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[DEFAULT](#DEFAULT)`

Default settings for testkit.

`final [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<akka.javasdk.DependencyProvider>`
`[dependencyProvider](#dependencyProvider)`
 
`final [Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<?>>`
`[disabledComponents](#disabledComponents)`
 
`final [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit")`
`[eventingSupport](#eventingSupport)`
 
`final [TestKit.MockedEventing](TestKit.MockedEventing.html "class in akka.javasdk.testkit")`
`[mockedEventing](#mockedEventing)`
 
`final [Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),akka.javasdk.agent.ModelProvider>`
`[modelProvidersByAgentId](#modelProvidersByAgentId)`
 
`final boolean`
`[overrideDisabledComponents](#overrideDisabledComponents)`

When true, the testkit disabled components override any disabled components from
 ServiceSetup, rather than being combined with them.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[serviceName](#serviceName)`

The name of this service when deployed.
- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`
 
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withAclDisabled](#withAclDisabled())()`

Disable ACL checking in this service.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withAclEnabled](#withAclEnabled())()`

Enable ACL checking in this service (this is the default).

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withAdditionalConfig](#withAdditionalConfig(com.typesafe.config.Config))(com.typesafe.config.Config additionalConfig)`

Specify additional config that will override the application\-test.conf or application.conf
 configuration in a particular test.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withAdditionalConfig](#withAdditionalConfig(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") additionalConfig)`

Specify additional config that will override the application\-test.conf or application.conf
 configuration in a particular test.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withAllComponentsEnabled](#withAllComponentsEnabled())()`

Enable all components to run, overriding any disabled components from `ServiceSetup.disabledComponents()`.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withDependencyProvider](#withDependencyProvider(akka.javasdk.DependencyProvider))(akka.javasdk.DependencyProvider dependencyProvider)`

Set a dependency provider that will be used for looking up arbitrary dependencies, useful to
 provide mocks for production dependencies in tests rather than calling the real thing.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withDisabledComponents](#withDisabledComponents(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<?>> disabledComponents)`

Disable components from running, useful for testing components in isolation.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withEventingSupport](#withEventingSupport(akka.javasdk.testkit.TestKit.Settings.EventingSupport))([TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") eventingSupport)`
 
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withEventSourcedEntityIncomingMessages](#withEventSourcedEntityIncomingMessages(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.eventsourcedentity.EventSourcedEntity<?,?>> eventSourcedEntityClass)`
 
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withEventSourcedEntityIncomingMessages](#withEventSourcedEntityIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)`

Deprecated, for removal: This API element is subject to removal in a future version.
use [`withEventSourcedEntityIncomingMessages(Class)`](#withEventSourcedEntityIncomingMessages(java.lang.Class)) instead.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withKeyValueEntityIncomingMessages](#withKeyValueEntityIncomingMessages(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.keyvalueentity.KeyValueEntity<?>> keyValueEntityClass)`
 
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withKeyValueEntityIncomingMessages](#withKeyValueEntityIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)`

Deprecated, for removal: This API element is subject to removal in a future version.
use [`withKeyValueEntityIncomingMessages(Class)`](#withKeyValueEntityIncomingMessages(java.lang.Class)) instead.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withModelProvider](#withModelProvider(java.lang.Class,akka.javasdk.agent.ModelProvider))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.agent.Agent> agentClass,
 akka.javasdk.agent.ModelProvider modelProvider)`
 
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withOverriddenDisabledComponents](#withOverriddenDisabledComponents(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<?>> disabledComponents)`

Disable components from running, useful for testing components in isolation.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withServiceName](#withServiceName(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serviceName)`

Set the name of this service.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withStreamIncomingMessages](#withStreamIncomingMessages(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") service,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") streamId)`

Mock the incoming messages flow from a Stream (eventing.in.direct in case of protobuf SDKs).

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withTopicIncomingMessages](#withTopicIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)`

Mock the incoming events flow from a Topic.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withTopicOutgoingMessages](#withTopicOutgoingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)`

Mock the outgoing events flow for a Topic.

`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withWorkflowIncomingMessages](#withWorkflowIncomingMessages(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.workflow.Workflow<?>> workflowClass)`
 
`[TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[withWorkflowIncomingMessages](#withWorkflowIncomingMessages(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)`

Deprecated, for removal: This API element is subject to removal in a future version.
use [`withWorkflowIncomingMessages(Class)`](#withWorkflowIncomingMessages(java.lang.Class)) instead.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Field Details

	- ### DEFAULT
	
	
	public static [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") DEFAULT
	Default settings for testkit.
	- ### serviceName
	
	
	public final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serviceName
	The name of this service when deployed.
	- ### aclEnabled
	
	
	public final boolean aclEnabled
	Whether ACL checking is enabled.
	- ### eventingSupport
	
	
	public final [TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") eventingSupport
	- ### mockedEventing
	
	
	public final [TestKit.MockedEventing](TestKit.MockedEventing.html "class in akka.javasdk.testkit") mockedEventing
	- ### additionalConfig
	
	
	public final com.typesafe.config.Config additionalConfig
	- ### dependencyProvider
	
	
	public final [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<akka.javasdk.DependencyProvider\> dependencyProvider
	- ### disabledComponents
	
	
	public final [Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<?\>\> disabledComponents
	- ### overrideDisabledComponents
	
	
	public final boolean overrideDisabledComponents
	When true, the testkit disabled components override any disabled components from
	 ServiceSetup, rather than being combined with them.
	- ### modelProvidersByAgentId
	
	
	public final [Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),akka.javasdk.agent.ModelProvider\> modelProvidersByAgentId
- ## Method Details

	- ### withServiceName
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withServiceName([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serviceName)
	Set the name of this service. This will be used by the service when making calls on other
	 services run by the testkit to authenticate itself, allowing those services to apply ACLs
	 based on that name. If not defined, the value from configuration key `akka.javasdk.dev-mode.service-name` will be used in the test.
	
	Parameters:
	`serviceName` \- The name of this service.
	Returns:
	The updated settings.
	- ### withAclDisabled
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withAclDisabled()
	Disable ACL checking in this service.
	
	Returns:
	The updated settings.
	- ### withAclEnabled
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withAclEnabled()
	Enable ACL checking in this service (this is the default).
	
	Returns:
	The updated settings.
	- ### withKeyValueEntityIncomingMessages
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.4\.2",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withKeyValueEntityIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)
	Deprecated, for removal: This API element is subject to removal in a future version.
	use [`withKeyValueEntityIncomingMessages(Class)`](#withKeyValueEntityIncomingMessages(java.lang.Class)) instead.
	
	Mock the incoming messages flow from a KeyValueEntity.
	- ### withKeyValueEntityIncomingMessages
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withKeyValueEntityIncomingMessages([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.keyvalueentity.KeyValueEntity\<?\>\> keyValueEntityClass)
	- ### withEventSourcedEntityIncomingMessages
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.4\.2",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withEventSourcedEntityIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)
	Deprecated, for removal: This API element is subject to removal in a future version.
	use [`withEventSourcedEntityIncomingMessages(Class)`](#withEventSourcedEntityIncomingMessages(java.lang.Class)) instead.
	
	Mock the incoming events flow from an EventSourcedEntity.
	- ### withEventSourcedEntityIncomingMessages
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withEventSourcedEntityIncomingMessages([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.eventsourcedentity.EventSourcedEntity\<?,?\>\> eventSourcedEntityClass)
	- ### withWorkflowIncomingMessages
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.4\.2",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withWorkflowIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") componentId)
	Deprecated, for removal: This API element is subject to removal in a future version.
	use [`withWorkflowIncomingMessages(Class)`](#withWorkflowIncomingMessages(java.lang.Class)) instead.
	
	Mock the incoming state updates flow from a Workflow.
	- ### withWorkflowIncomingMessages
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withWorkflowIncomingMessages([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.workflow.Workflow\<?\>\> workflowClass)
	- ### withStreamIncomingMessages
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withStreamIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") service,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") streamId)
	Mock the incoming messages flow from a Stream (eventing.in.direct in case of protobuf SDKs).
	- ### withTopicIncomingMessages
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withTopicIncomingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)
	Mock the incoming events flow from a Topic.
	- ### withTopicOutgoingMessages
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withTopicOutgoingMessages([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") topic)
	Mock the outgoing events flow for a Topic.
	- ### withEventingSupport
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withEventingSupport([TestKit.Settings.EventingSupport](TestKit.Settings.EventingSupport.html "enum class in akka.javasdk.testkit") eventingSupport)
	- ### withAdditionalConfig
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withAdditionalConfig(com.typesafe.config.Config additionalConfig)
	Specify additional config that will override the application\-test.conf or application.conf
	 configuration in a particular test.
	- ### withAdditionalConfig
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withAdditionalConfig([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") additionalConfig)
	Specify additional config that will override the application\-test.conf or application.conf
	 configuration in a particular test.
	- ### withDependencyProvider
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withDependencyProvider(akka.javasdk.DependencyProvider dependencyProvider)
	Set a dependency provider that will be used for looking up arbitrary dependencies, useful to
	 provide mocks for production dependencies in tests rather than calling the real thing.
	- ### withDisabledComponents
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withDisabledComponents([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<?\>\> disabledComponents)
	Disable components from running, useful for testing components in isolation. This set of
	 disabled components will be added to `ServiceSetup.disabledComponents()` if configured.
	- ### withOverriddenDisabledComponents
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withOverriddenDisabledComponents([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<?\>\> disabledComponents)
	Disable components from running, useful for testing components in isolation. This set of
	 disabled components will override the `ServiceSetup.disabledComponents()` if
	 configured.
	- ### withAllComponentsEnabled
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withAllComponentsEnabled()
	Enable all components to run, overriding any disabled components from `ServiceSetup.disabledComponents()`. This is useful for integration tests that need to test
	 all components even if some are disabled in the Bootstrap configuration.
	
	Returns:
	The updated settings with all components enabled.
	- ### withModelProvider
	
	
	public [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") withModelProvider([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.agent.Agent\> agentClass,
	 akka.javasdk.agent.ModelProvider modelProvider)
	- ### toString
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toString()
	
	Overrides:
	`[toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang")` in class `[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.MockedEventing.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.EventingSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html)*