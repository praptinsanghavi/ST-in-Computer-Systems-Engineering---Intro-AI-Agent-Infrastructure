---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ExtensionsImpl.html
title: ExtensionsImpl
---

# ExtensionsImpl

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Interface ExtensionsImpl

- All Superinterfaces:
`[Extensions](../Extensions.html "interface in akka.actor.typed")`

---

```
public interface ExtensionsImpl
extends [Extensions](../Extensions.html "interface in akka.actor.typed")
```

INTERNAL API
 
 Actor system extensions registry

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T extends [Extension](../Extension.html "interface in akka.actor.typed")>T` | `[createExtensionInstance](#createExtensionInstance(akka.actor.typed.ExtensionId))​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)` |  |
	| `<T extends [Extension](../Extension.html "interface in akka.actor.typed")>T` | `[extension](#extension(akka.actor.typed.ExtensionId))​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)` | Returns the payload that is associated with the provided extension  throws an IllegalStateException if it is not registered. |
	| `<T extends [Extension](../Extension.html "interface in akka.actor.typed")>T` | `[findExtension](#findExtension(akka.actor.typed.ExtensionId))​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)` | Returns any extension registered to the specified Extension or returns null if not registered |
	| `boolean` | `[hasExtension](#hasExtension(akka.actor.typed.ExtensionId))​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<? extends [Extension](../Extension.html "interface in akka.actor.typed")> ext)` | Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization  of the payload, if is in the process of registration from another Thread of execution |
	| `void` | `[loadExtensions](#loadExtensions())()` | Hook for ActorSystem to load extensions on startup |
	| `<T extends [Extension](../Extension.html "interface in akka.actor.typed")>T` | `[registerExtension](#registerExtension(akka.actor.typed.ExtensionId))​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)` | Registers the provided extension and creates its payload, if this extension isn't already registered  This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization  of the payload, if is in the process of registration from another Thread of execution |

- - ### Method Detail
	
	
	
		- #### createExtensionInstance
		
		
		
		```
		<T extends [Extension](../Extension.html "interface in akka.actor.typed")> T createExtensionInstance​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)
		```
		- #### extension
		
		
		
		```
		<T extends [Extension](../Extension.html "interface in akka.actor.typed")> T extension​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)
		```
		
		Description copied from interface: `[Extensions](../Extensions.html#extension(akka.actor.typed.ExtensionId))`
		Returns the payload that is associated with the provided extension
		 throws an IllegalStateException if it is not registered.
		 This method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		
		Specified by:
		`[extension](../Extensions.html#extension(akka.actor.typed.ExtensionId))` in interface `[Extensions](../Extensions.html "interface in akka.actor.typed")`
		- #### findExtension
		
		
		
		```
		<T extends [Extension](../Extension.html "interface in akka.actor.typed")> T findExtension​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)
		```
		
		Returns any extension registered to the specified Extension or returns null if not registered
		- #### hasExtension
		
		
		
		```
		boolean hasExtension​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<? extends [Extension](../Extension.html "interface in akka.actor.typed")> ext)
		```
		
		Description copied from interface: `[Extensions](../Extensions.html#hasExtension(akka.actor.typed.ExtensionId))`
		Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		
		Specified by:
		`[hasExtension](../Extensions.html#hasExtension(akka.actor.typed.ExtensionId))` in interface `[Extensions](../Extensions.html "interface in akka.actor.typed")`
		- #### loadExtensions
		
		
		
		```
		void loadExtensions()
		```
		
		Hook for ActorSystem to load extensions on startup
		- #### registerExtension
		
		
		
		```
		<T extends [Extension](../Extension.html "interface in akka.actor.typed")> T registerExtension​([ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> ext)
		```
		
		Description copied from interface: `[Extensions](../Extensions.html#registerExtension(akka.actor.typed.ExtensionId))`
		Registers the provided extension and creates its payload, if this extension isn't already registered
		 This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
		 of the payload, if is in the process of registration from another Thread of execution
		
		Specified by:
		`[registerExtension](../Extensions.html#registerExtension(akka.actor.typed.ExtensionId))` in interface `[Extensions](../Extensions.html "interface in akka.actor.typed")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extensions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ExtensionsImpl.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ExtensionsImpl.html)*