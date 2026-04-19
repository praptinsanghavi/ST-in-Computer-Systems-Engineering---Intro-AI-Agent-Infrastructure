---
description: 'declaration: package: akka.javasdk.agent, interface: MemoryFilter, interface:
  MemoryFilterSupplier'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:11Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.MemoryFilterSupplier.html
title: MemoryFilter.MemoryFilterSupplier
---

# MemoryFilter.MemoryFilterSupplier

> **Summary:** declaration: package: akka.javasdk.agent, interface: MemoryFilter, interface: MemoryFilterSupplier

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface MemoryFilter.MemoryFilterSupplier

All Superinterfaces:
`[Supplier](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")>>`

Enclosing interface:
`[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")`

---

@DoNotInherit
public static interface MemoryFilter.MemoryFilterSupplier
extends [Supplier](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")\>\>
A fluent builder for composing multiple memory filters.

 This interface extends [`Supplier`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function") returning the accumulated list of filters. It also
 provides builder methods for chaining additional filter operations.

 

This supplier is designed to be used directly with [`MemoryProvider`](MemoryProvider.html "interface in akka.javasdk.agent") methods such as
 [`MemoryProvider.LimitedWindowMemoryProvider.readOnly(MemoryFilterSupplier)`](MemoryProvider.LimitedWindowMemoryProvider.html#readOnly(akka.javasdk.agent.MemoryFilter.MemoryFilterSupplier)) and [`MemoryProvider.LimitedWindowMemoryProvider.filtered(MemoryFilterSupplier)`](MemoryProvider.LimitedWindowMemoryProvider.html#filtered(akka.javasdk.agent.MemoryFilter.MemoryFilterSupplier)).

 

This is an internal API, and we do not recommend inheriting from it. To have access to an
 implementation, use the factory methods in [`MemoryFilter`](MemoryFilter.html "interface in akka.javasdk.agent")

See Also:

- [`for usage examples`](MemoryProvider.LimitedWindowMemoryProvider.html "class in akka.javasdk.agent")

- ## Method Summary

Modifier and Type
Method
Description
`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[excludeFromAgentId](#excludeFromAgentId(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id)`

Adds a filter to exclude messages from the specified agent component id.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[excludeFromAgentIds](#excludeFromAgentIds(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> ids)`

Adds a filter to exclude messages from the specified agent component ids.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[excludeFromAgentRole](#excludeFromAgentRole(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role)`

Adds a filter to exclude messages from agents with the specified role.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[excludeFromAgentRoles](#excludeFromAgentRoles(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> roles)`

Adds a filter to exclude messages from agents with the specified roles.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[includeFromAgentId](#includeFromAgentId(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id)`

Adds a filter to include only messages from the specified agent component id.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[includeFromAgentIds](#includeFromAgentIds(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> ids)`

Adds a filter to include only messages from the specified agent component ids.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[includeFromAgentRole](#includeFromAgentRole(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role)`

Adds a filter to include only messages from agents with the specified role.

`[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent")`
`[includeFromAgentRoles](#includeFromAgentRoles(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> roles)`

Adds a filter to include only messages from agents with the specified roles.

### Methods inherited from interface java.util.function.[Supplier](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html "class or interface in java.util.function")

`[get](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html#get() "class or interface in java.util.function")`

- ## Method Details

	- ### includeFromAgentId
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") includeFromAgentId([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id)
	Adds a filter to include only messages from the specified agent component id.
	
	Parameters:
	`id` \- the agent component id to include messages from
	Returns:
	this supplier with the additional filter
	- ### includeFromAgentIds
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") includeFromAgentIds([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> ids)
	Adds a filter to include only messages from the specified agent component ids.
	
	Parameters:
	`ids` \- the set of agent component ids to include messages from
	Returns:
	this supplier with the additional filter
	- ### excludeFromAgentId
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") excludeFromAgentId([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id)
	Adds a filter to exclude messages from the specified agent component id.
	
	Parameters:
	`id` \- the agent component id to exclude messages from
	Returns:
	this supplier with the additional filter
	- ### excludeFromAgentIds
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") excludeFromAgentIds([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> ids)
	Adds a filter to exclude messages from the specified agent component ids.
	
	Parameters:
	`ids` \- the set of agent component ids to exclude messages from
	Returns:
	this supplier with the additional filter
	- ### includeFromAgentRole
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") includeFromAgentRole([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role)
	Adds a filter to include only messages from agents with the specified role.
	
	Parameters:
	`role` \- the agent role to include messages from
	Returns:
	this supplier with the additional filter
	- ### includeFromAgentRoles
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") includeFromAgentRoles([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> roles)
	Adds a filter to include only messages from agents with the specified roles.
	
	Parameters:
	`roles` \- the set of agent roles to include messages from
	Returns:
	this supplier with the additional filter
	- ### excludeFromAgentRole
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") excludeFromAgentRole([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role)
	Adds a filter to exclude messages from agents with the specified role.
	
	Parameters:
	`role` \- the agent role to exclude messages from
	Returns:
	this supplier with the additional filter
	- ### excludeFromAgentRoles
	
	
	[MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") excludeFromAgentRoles([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> roles)
	Adds a filter to exclude messages from agents with the specified roles.
	
	Parameters:
	`roles` \- the set of agent roles to exclude messages from
	Returns:
	this supplier with the additional filter

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.MemoryFilterSupplier.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.LimitedWindowMemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.MemoryFilterSupplier.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.MemoryFilterSupplier.html)*