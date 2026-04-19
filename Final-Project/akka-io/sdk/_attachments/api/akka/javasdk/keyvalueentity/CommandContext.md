---
description: 'declaration: package: akka.javasdk.keyvalueentity, interface: CommandContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:44Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html
title: CommandContext
---

# CommandContext

> **Summary:** declaration: package: akka.javasdk.keyvalueentity, interface: CommandContext

## Content

Package [akka.javasdk.keyvalueentity](package-summary.html)
# Interface CommandContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`

---

public interface CommandContext
extends [MetadataContext](../MetadataContext.html "interface in akka.javasdk")
Context information available to Key Value Entity command handlers during command processing.
 Provides access to command metadata, entity identification, and tracing capabilities.

 This context is automatically provided by the Akka runtime and can be accessed within command
 handlers using [`KeyValueEntity.commandContext()`](KeyValueEntity.html#commandContext()).

- ## Method Summary

Modifier and Type
Method
Description
`long`
`[commandId](#commandId())()`

Deprecated.
This method is no longer used and will be removed in a future version

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[commandName](#commandName())()`

Returns the name of the command currently being executed.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[entityId](#entityId())()`

Returns the unique identifier of the entity instance that this command is being executed on.

`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Provides access to tracing functionality for adding custom application\-specific tracing
 information to the current command processing.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[MetadataContext](../MetadataContext.html "interface in akka.javasdk")

`[metadata](../MetadataContext.html#metadata())`

- ## Method Details

	- ### commandName
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") commandName()
	Returns the name of the command currently being executed. This corresponds to the method name
	 of the command handler being invoked.
	
	Returns:
	the name of the command being processed
	- ### commandId
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	long commandId()
	Deprecated.
	This method is no longer used and will be removed in a future version
	
	Returns the command id for the current command.
	
	Returns:
	the command id
	- ### entityId
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") entityId()
	Returns the unique identifier of the entity instance that this command is being executed on.
	 This is the same id used when calling the entity through a component client.
	
	Returns:
	the unique entity id for this entity instance
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Provides access to tracing functionality for adding custom application\-specific tracing
	 information to the current command processing.
	
	Returns:
	the tracing context for custom tracing operations

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html)*