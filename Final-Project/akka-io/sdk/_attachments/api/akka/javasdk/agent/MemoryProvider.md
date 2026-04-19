---
description: 'declaration: package: akka.javasdk.agent, interface: MemoryProvider,
  record: LimitedWindowMemoryProvider'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:13Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.LimitedWindowMemoryProvider.html
title: MemoryProvider.LimitedWindowMemoryProvider
---

# MemoryProvider.LimitedWindowMemoryProvider

> **Summary:** declaration: package: akka.javasdk.agent, interface: MemoryProvider, record: LimitedWindowMemoryProvider

## Content

Package [akka.javasdk.agent](package-summary.html)
# Record Class MemoryProvider.LimitedWindowMemoryProvider

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.agent.MemoryProvider.LimitedWindowMemoryProvider

All Implemented Interfaces:
`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`

Enclosing interface:
`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`

---

public static record MemoryProvider.LimitedWindowMemoryProvider([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")\> readLastN, boolean read, boolean write, [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")\> filters)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
implements [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")
Memory provider that limits session history based on size or message count.

 This provider allows fine\-grained control over memory usage by limiting:

 

- Use only last N messages from the history
- Whether reading from memory is enabled
- Whether writing to memory is enabled
- Applies memory filters [`MemoryFilter`](MemoryFilter.html "interface in akka.javasdk.agent")

**Filter Ordering:** When multiple filters are specified, filters of the same
 type are automatically merged. The merged filters are then applied in the order that each
 filter type first appears. Each filter type operates on the result of the previous filter type.

 

Example usage with filters:

 

```

 // Single filter - include only messages from a specific agent
 MemoryProvider.limitedWindow()
     .readOnly(MemoryFilter.includeFromAgentId("agent-1"));

 // Multiple filters - include messages from agent-1 but exclude internal role
 // includeFromAgentId is applied first, then excludeFromAgentRole
 MemoryProvider.limitedWindow()
     .readOnly(MemoryFilter.includeFromAgentId("agent-1")
                           .excludeFromAgentRole("internal"));

 // Combined with readLast - last 10 messages from specific agents
 // The two includeFromAgentId calls are merged, then filters applied, then limit to last 10
 MemoryProvider.limitedWindow()
     .readLast(10, MemoryFilter.includeFromAgentId("agent-1")
                               .includeFromAgentId("agent-2"));

 // Using filtered() for read-write with filters
 // The two excludeFromAgentRole calls are merged into a single filter
 MemoryProvider.limitedWindow()
     .filtered(MemoryFilter.excludeFromAgentRole("internal")
                           .excludeFromAgentRole("debug"));
 
```

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")

`[MemoryProvider.CustomMemoryProvider](MemoryProvider.CustomMemoryProvider.html "class in akka.javasdk.agent"), [MemoryProvider.Disabled](MemoryProvider.Disabled.html "class in akka.javasdk.agent"), [MemoryProvider.FromConfig](MemoryProvider.FromConfig.html "class in akka.javasdk.agent"), [MemoryProvider.LimitedWindowMemoryProvider](MemoryProvider.LimitedWindowMemoryProvider.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[LimitedWindowMemoryProvider](#%3Cinit%3E(java.util.Optional,boolean,boolean,java.util.List))([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")> readLastN,
 boolean read,
 boolean write,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")> filters)`

Creates an instance of a `LimitedWindowMemoryProvider` record class.
- ## Method Summary

Modifier and Type
Method
Description
`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`
`[filtered](#filtered(akka.javasdk.agent.MemoryFilter.MemoryFilterSupplier))([MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") filtersSupplier)`

Creates a new memory provider with multiple filters applied.

`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")>`
`[filters](#filters())()`

Returns the value of the `filters` record component.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`boolean`
`[read](#read())()`

Returns the value of the `read` record component.

`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`
`[readLast](#readLast(int))(int onlyLastN)`

Creates a new memory provider with an updated history limit.

`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`
`[readLast](#readLast(int,akka.javasdk.agent.MemoryFilter.MemoryFilterSupplier))(int onlyLastN,
 [MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") filtersSupplier)`

Creates a new memory provider with an updated history limit and multiple filters applied.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")>`
`[readLastN](#readLastN())()`

Returns the value of the `readLastN` record component.

`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`
`[readOnly](#readOnly())()`

Creates a read\-only version of this memory provider.

`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`
`[readOnly](#readOnly(akka.javasdk.agent.MemoryFilter.MemoryFilterSupplier))([MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") filtersSupplier)`

Creates a read\-only version of this memory provider with multiple filters applied.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

`boolean`
`[write](#write())()`

Returns the value of the `write` record component.

`[MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent")`
`[writeOnly](#writeOnly())()`

Creates a write\-only version of this memory provider.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### LimitedWindowMemoryProvider
	
	
	public LimitedWindowMemoryProvider([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")\> readLastN,
	 boolean read,
	 boolean write,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")\> filters)
	Creates an instance of a `LimitedWindowMemoryProvider` record class.
	
	Parameters:
	`readLastN` \- the value for the `readLastN` record component
	`read` \- the value for the `read` record component
	`write` \- the value for the `write` record component
	`filters` \- the value for the `filters` record component
- ## Method Details

	- ### readOnly
	
	
	public [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent") readOnly()
	Creates a read\-only version of this memory provider.
	
	 The returned provider will allow reading from memory but disable writing.
	
	
	
	Returns:
	A new memory provider with writing disabled
	- ### readOnly
	
	
	public [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent") readOnly([MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") filtersSupplier)
	Creates a read\-only version of this memory provider with multiple filters applied.
	
	 The returned provider will allow reading from memory but disable writing. The specified
	 filters control which messages are included when reading from memory.
	
	 
	
	Filters of the same type are automatically merged. The merged filters are then applied in
	 the order that each filter type first appears. Each filter type operates on the result of the
	 previous filter type.
	
	 
	
	Example usage:
	
	 
	
	
	```
	
	 // Single filter
	 MemoryProvider.limitedWindow()
	     .readOnly(MemoryFilter.includeFromAgentId("agent-1"));
	
	 // Multiple chained filters - same types are merged
	 MemoryProvider.limitedWindow()
	     .readOnly(MemoryFilter.includeFromAgentId("agent-1")
	                           .excludeFromAgentRole("internal"));
	 
	```
	
	
	Parameters:
	`filtersSupplier` \- a supplier that provides the list of filters to apply
	Returns:
	A new memory provider with writing disabled and the specified filters
	- ### writeOnly
	
	
	public [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent") writeOnly()
	Creates a write\-only version of this memory provider.
	
	 The returned provider will allow writing to memory but disable reading.
	
	
	
	Returns:
	A new memory provider with reading disabled
	- ### readLast
	
	
	public [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent") readLast(int onlyLastN)
	Creates a new memory provider with an updated history limit.
	
	 The history limit controls the maximum number of messages to retain in memory.
	
	
	
	Parameters:
	`onlyLastN` \- parameter controls the maximum number of most recent messages to read from
	 memory.
	Returns:
	A new memory provider with the specified history limit
	- ### readLast
	
	
	public [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent") readLast(int onlyLastN,
	 [MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") filtersSupplier)
	Creates a new memory provider with an updated history limit and multiple filters applied.
	
	 The history limit controls the maximum number of messages to read from memory. Filters of
	 the same type are automatically merged, then applied in the order that each filter type first
	 appears, and finally, the limit is enforced on the filtered results.
	
	 
	
	Example usage:
	
	 
	
	
	```
	
	 // Last 10 messages from a specific agent
	 MemoryProvider.limitedWindow()
	     .readLast(10, MemoryFilter.includeFromAgentId("agent-1"));
	
	 // Last 5 messages excluding internal agents
	 // Both excludeFromAgentRole calls are merged, applied, then limit to last 5
	 MemoryProvider.limitedWindow()
	     .readLast(5, MemoryFilter.excludeFromAgentRole("internal")
	                              .excludeFromAgentRole("debug"));
	 
	```
	
	
	Parameters:
	`onlyLastN` \- the maximum number of most recent messages to read from memory
	`filtersSupplier` \- a supplier that provides the list of filters to apply
	Returns:
	A new memory provider with the specified history limit and filters
	- ### filtered
	
	
	public [MemoryProvider](MemoryProvider.html "interface in akka.javasdk.agent") filtered([MemoryFilter.MemoryFilterSupplier](MemoryFilter.MemoryFilterSupplier.html "interface in akka.javasdk.agent") filtersSupplier)
	Creates a new memory provider with multiple filters applied.
	
	 The specified filters control which messages are included when reading from memory.
	
	 
	
	Filters of the same type are automatically merged. The merged filters are then applied in
	 the order that each filter type first appears. Each filter type operates on the result of the
	 previous filter type.
	
	 
	
	Example usage:
	
	 
	
	
	```
	
	 // Filter to exclude internal messages while maintaining read-write
	 MemoryProvider.limitedWindow()
	     .filtered(MemoryFilter.excludeFromAgentRole("internal"));
	
	 // Multiple filters - same types are merged
	 // Both includeFromAgentId calls are merged, then excludeFromAgentRole applied
	 MemoryProvider.limitedWindow()
	     .filtered(MemoryFilter.includeFromAgentId("agent-1")
	                           .includeFromAgentId("agent-2")
	                           .excludeFromAgentRole("debug"));
	 
	```
	
	
	Parameters:
	`filtersSupplier` \- a supplier that provides the list of filters to apply
	Returns:
	A new memory provider with the specified filters
	- ### toString
	
	
	public final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toString()
	Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.
	
	Specified by:
	`[toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#toString() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a string representation of this object
	- ### hashCode
	
	
	public final int hashCode()
	Returns a hash code value for this object. The value is derived from the hash code of each of the record components.
	
	Specified by:
	`[hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#hashCode() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a hash code value for this object
	- ### equals
	
	
	public final boolean equals([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)
	Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object) "class or interface in java.util"); primitive components are compared with '\=\='.
	
	Specified by:
	`[equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#equals(java.lang.Object) "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Parameters:
	`o` \- the object with which to compare
	Returns:
	`true` if this object is the same as the `o` argument; `false` otherwise.
	- ### readLastN
	
	
	public [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")\> readLastN()
	Returns the value of the `readLastN` record component.
	
	Returns:
	the value of the `readLastN` record component
	- ### read
	
	
	public boolean read()
	Returns the value of the `read` record component.
	
	Returns:
	the value of the `read` record component
	- ### write
	
	
	public boolean write()
	Returns the value of the `write` record component.
	
	Returns:
	the value of the `write` record component
	- ### filters
	
	
	public [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[MemoryFilter](MemoryFilter.html "interface in akka.javasdk.agent")\> filters()
	Returns the value of the `filters` record component.
	
	Returns:
	the value of the `filters` record component

## Code Examples

### Example 1: Record Class MemoryProvider.LimitedWindowMemoryProvider

```text
// Single filter - include only messages from a specific agent
 MemoryProvider.limitedWindow()
     .readOnly(MemoryFilter.includeFromAgentId("agent-1"));

 // Multiple filters - include messages from agent-1 but exclude internal role
 // includeFromAgentId is applied first, then excludeFromAgentRole
 MemoryProvider.limitedWindow()
     .readOnly(MemoryFilter.includeFromAgentId("agent-1")
                           .excludeFromAgentRole("internal"));

 // Combined with readLast - last 10 messages from specific agents
 // The two includeFromAgentId calls are merged, then filters applied, then limit to last 10
 MemoryProvider.limitedWindow()
     .readLast(10, MemoryFilter.includeFromAgentId("agent-1")
                               .includeFromAgentId("agent-2"));

 // Using filtered() for read-write with filters
 // The two excludeFromAgentRole calls are merged into a single filter
 MemoryProvider.limitedWindow()
     .filtered(MemoryFilter.excludeFromAgentRole("internal")
                           .excludeFromAgentRole("debug"));
```

### Example 2: readOnly

```text
// Single filter
 MemoryProvider.limitedWindow()
     .readOnly(MemoryFilter.includeFromAgentId("agent-1"));

 // Multiple chained filters - same types are merged
 MemoryProvider.limitedWindow()
     .readOnly(MemoryFilter.includeFromAgentId("agent-1")
                           .excludeFromAgentRole("internal"));
```

### Example 3: readLast

```text
// Last 10 messages from a specific agent
 MemoryProvider.limitedWindow()
     .readLast(10, MemoryFilter.includeFromAgentId("agent-1"));

 // Last 5 messages excluding internal agents
 // Both excludeFromAgentRole calls are merged, applied, then limit to last 5
 MemoryProvider.limitedWindow()
     .readLast(5, MemoryFilter.excludeFromAgentRole("internal")
                              .excludeFromAgentRole("debug"));
```

### Example 4: filtered

```text
// Filter to exclude internal messages while maintaining read-write
 MemoryProvider.limitedWindow()
     .filtered(MemoryFilter.excludeFromAgentRole("internal"));

 // Multiple filters - same types are merged
 // Both includeFromAgentId calls are merged, then excludeFromAgentRole applied
 MemoryProvider.limitedWindow()
     .filtered(MemoryFilter.includeFromAgentId("agent-1")
                           .includeFromAgentId("agent-2")
                           .excludeFromAgentRole("debug"));
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.MemoryFilterSupplier.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.CustomMemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.Disabled.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.FromConfig.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.LimitedWindowMemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.LimitedWindowMemoryProvider.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.LimitedWindowMemoryProvider.html)*