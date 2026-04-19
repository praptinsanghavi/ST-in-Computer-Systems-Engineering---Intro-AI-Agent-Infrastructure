---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/AbstractProps.html
title: AbstractProps
---

# AbstractProps

## Content

Package [akka.actor](package-summary.html)
## Interface AbstractProps

- All Known Implementing Classes:
`[Props$](Props$.html "class in akka.actor")`

---

```
public interface AbstractProps
```

Java API: Factory for Props instances.
 
 INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[checkCreatorClosingOver](#checkCreatorClosingOver(java.lang.Class))​(java.lang.Class<?> clazz)` |  |
	| `<T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[create](#create(akka.japi.Creator))​([Creator](../japi/Creator.html "interface in akka.japi")<T> creator)` | Deprecated. Use Props.create(actorClass, creator) instead, since this can't be used with Java 8 lambda. |
	| `[Props](Props.html "class in akka.actor")` | `[create](#create(java.lang.Class,java.lang.Object...))​(java.lang.Class<?> clazz,  java.lang.Object... args)` | Java API: create a Props given a class and its constructor arguments. |
	| `[Props](Props.html "class in akka.actor")` | `[create](#create(java.lang.Class,scala.collection.immutable.Seq))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` | Java API: create a Props given a class and its constructor arguments. |
	| `<T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[create](#create(java.lang.Class,akka.japi.Creator))​(java.lang.Class<T> actorClass,  [Creator](../japi/Creator.html "interface in akka.japi")<T> creator)` | Create new Props from the given [`Creator`](../japi/Creator.html "interface in akka.japi") with the type set to the given actorClass. |
	| `void` | `[validate](#validate(java.lang.Class))​(java.lang.Class<?> clazz)` | INTERNAL API |

- - ### Method Detail
	
	
	
		- #### checkCreatorClosingOver
		
		
		
		```
		void checkCreatorClosingOver​(java.lang.Class<?> clazz)
		```
		- #### create
		
		
		
		```
		[Props](Props.html "class in akka.actor") create​(java.lang.Class<?> clazz,
		             java.lang.Object... args)
		```
		
		Java API: create a Props given a class and its constructor arguments.
		- #### create
		
		
		
		```
		[Props](Props.html "class in akka.actor") create​(java.lang.Class<?> clazz,
		             scala.collection.immutable.Seq<java.lang.Object> args)
		```
		
		Java API: create a Props given a class and its constructor arguments.
		- #### create
		
		
		
		```
		<T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") create​([Creator](../japi/Creator.html "interface in akka.japi")<T> creator)
		```
		
		Deprecated.
		Use Props.create(actorClass, creator) instead, since this can't be used with Java 8 lambda. Since 2\.5\.18\.
		
		Create new Props from the given [`Creator`](../japi/Creator.html "interface in akka.japi").
		 
		 You can not use a Java 8 lambda with this method since the generated classes
		 don't carry enough type information.
		 
		
		
		 Use the Props.create(actorClass, creator) instead.
		- #### create
		
		
		
		```
		<T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") create​(java.lang.Class<T> actorClass,
		                               [Creator](../japi/Creator.html "interface in akka.japi")<T> creator)
		```
		
		Create new Props from the given [`Creator`](../japi/Creator.html "interface in akka.japi") with the type set to the given actorClass.
		- #### validate
		
		
		
		```
		void validate​(java.lang.Class<?> clazz)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/japi/Creator.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/AbstractProps.html](https://doc.akka.io/japi/akka/current/akka/actor/AbstractProps.html)*