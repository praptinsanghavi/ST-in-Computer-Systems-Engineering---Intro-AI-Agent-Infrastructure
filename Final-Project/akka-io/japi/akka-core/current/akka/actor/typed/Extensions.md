---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extensions.html
title: Extensions
---

# Extensions

## Content

Package [akka.actor.typed](package-summary.html)
## Interface Extensions

- All Known Subinterfaces:
`[ExtensionsImpl](internal/ExtensionsImpl.html "interface in akka.actor.typed.internal")`

All Known Implementing Classes:
`[ActorSystem](ActorSystem.html "class in akka.actor.typed")`

---

```
public interface Extensions
```

API for registering and looking up extensions.
 
 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T extends [Extension](Extension.html "interface in akka.actor.typed")>T` | `[extension](#extension(akka.actor.typed.ExtensionId))​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<T> ext)` | Returns the payload that is associated with the provided extension  throws an IllegalStateException if it is not registered. |
	| `boolean` | `[hasExtension](#hasExtension(akka.actor.typed.ExtensionId))​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<? extends [Extension](Extension.html "interface in akka.actor.typed")> ext)` | Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization  of the payload, if is in the process of registration from another Thread of execution |
	| `<T extends [Extension](Extension.html "interface in akka.actor.typed")>T` | `[registerExtension](#registerExtension(akka.actor.typed.ExtensionId))​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<T> ext)` | Registers the provided extension and creates its payload, if this extension isn't already registered  This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization  of the payload, if is in the process of registration from another Thread of execution |

- - ### Method Detail
	
	
	
		- #### extension
		
		
		
		```
		<T extends [Extension](Extension.html "interface in akka.actor.typed")> T extension​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<T> ext)
		```
		
		Returns the payload that is associated with the provided extension
		 throws an IllegalStateException if it is not registered.
		 This method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		- #### hasExtension
		
		
		
		```
		boolean hasExtension​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<? extends [Extension](Extension.html "interface in akka.actor.typed")> ext)
		```
		
		Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		- #### registerExtension
		
		
		
		```
		<T extends [Extension](Extension.html "interface in akka.actor.typed")> T registerExtension​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<T> ext)
		```
		
		Registers the provided extension and creates its payload, if this extension isn't already registered
		 This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/internal/ExtensionsImpl.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extensions.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extensions.html)*