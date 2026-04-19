---
description: 'declaration: package: akka.javasdk.testkit, class: TelemetryReader'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:20Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TelemetryReader.html
title: TelemetryReader
---

# TelemetryReader

> **Summary:** declaration: package: akka.javasdk.testkit, class: TelemetryReader

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class TelemetryReader

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.TelemetryReader

---

@ApiMayChange
public class TelemetryReader
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
A test utility for reading and inspecting telemetry data captured during test execution.

 TelemetryReader provides access to OpenTelemetry spans collected by the in\-memory span
 exporter during integration tests. This allows you to verify workflow execution, agent
 interactions, and other instrumented operations.

- ## Constructor Summary

Constructors

Constructor
Description
`[TelemetryReader](#%3Cinit%3E(kalix.runtime.telemetry.tracing.TracingSetup.AkkaInMemorySpanExporter))(kalix.runtime.telemetry.tracing.TracingSetup.AkkaInMemorySpanExporter inMemorySpanExporter)`
- ## Method Summary

Modifier and Type
Method
Description
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getAgents](#getAgents(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") debugId)`

Retrieves the list of agents that were invoked during an operation.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getAgentTools](#getAgentTools(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") debugId)`

Retrieves the list of tools used by agents during an operation.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getWorkflowSteps](#getWorkflowSteps(java.lang.Class,java.lang.String))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends akka.javasdk.workflow.Workflow<?>> workflow,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") workflowId)`

Retrieves the sequence of workflow steps executed for a specific workflow instance.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getWorkflowSteps](#getWorkflowSteps(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") debugId)`

Retrieves the sequence of workflow steps executed for an operation traced by a debug ID.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### TelemetryReader
	
	
	public TelemetryReader(kalix.runtime.telemetry.tracing.TracingSetup.AkkaInMemorySpanExporter inMemorySpanExporter)
- ## Method Details

	- ### getWorkflowSteps
	
	
	@ApiMayChange
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getWorkflowSteps([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends akka.javasdk.workflow.Workflow\<?\>\> workflow,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") workflowId)
	Retrieves the sequence of workflow steps executed for a specific workflow instance.
	
	 Returns a list of step names in the order they were executed, based on telemetry data
	 collected during the workflow execution. This is useful for verifying that workflows execute
	 the expected steps in the correct order.
	
	
	
	Parameters:
	`workflow` \- The workflow class to query
	`workflowId` \- The unique identifier of the workflow instance
	Returns:
	A list of step names in execution order, or an empty list if no steps were found
	- ### getAgents
	
	
	@ApiMayChange
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getAgents([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") debugId)
	Retrieves the list of agents that were invoked during an operation.
	
	 Returns a list of agent IDs in the order they were invoked, based on telemetry data
	 collected during test execution. This is useful for verifying that the expected agents were
	 called during a test scenario.
	
	
	
	Parameters:
	`debugId` \- The debug identifier used to trace the operation
	Returns:
	A list of agent IDs in invocation order, or an empty list if no agents were found
	- ### getAgentTools
	
	
	@ApiMayChange
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getAgentTools([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") debugId)
	Retrieves the list of tools used by agents during an operation.
	
	 Returns a list of tool names in the order they were invoked, based on telemetry data
	 collected during test execution. This is useful for verifying that agents used the expected
	 tools to accomplish their tasks.
	
	
	
	Parameters:
	`debugId` \- The debug identifier used to trace the operation
	Returns:
	A list of tool names in invocation order, or an empty list if no tools were found
	- ### getWorkflowSteps
	
	
	@ApiMayChange
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getWorkflowSteps([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") debugId)
	Retrieves the sequence of workflow steps executed for an operation traced by a debug ID.
	
	 Returns a list of step names in the order they were executed, based on telemetry data
	 collected during workflow execution. This method uses the debug ID to find all spans associated
	 with the traced operation, making it useful when you don't have direct access to the workflow
	 class or workflow ID.
	
	
	
	Parameters:
	`debugId` \- The debug identifier used to trace the workflow execution
	Returns:
	A list of step names in execution order, or an empty list if no steps were found

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TelemetryReader.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TelemetryReader.html)*