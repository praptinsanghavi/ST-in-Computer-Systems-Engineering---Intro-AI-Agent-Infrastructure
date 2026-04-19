---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.SerializationSettings.html
title: EventSourcedBehaviorTestKit.SerializationSettings
---

# EventSourcedBehaviorTestKit.SerializationSettings

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class EventSourcedBehaviorTestKit.SerializationSettings

- java.lang.Object
- - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.SerializationSettings

- Enclosing class:
[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "class in akka.persistence.testkit.javadsl")\<[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")\>

---

```
public static final class EventSourcedBehaviorTestKit.SerializationSettings
extends java.lang.Object
```

Customization of which serialization checks that are performed.
 `equals` must be implemented (or using `case class`) when `verifyEquality` is enabled.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializationSettings](#%3Cinit%3E(boolean,boolean,boolean,boolean,boolean))​(boolean enabled,  boolean verifyEquality,  boolean verifyCommands,  boolean verifyEvents,  boolean verifyState)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[enabled](#enabled())()` |  |
	| `boolean` | `[verifyCommands](#verifyCommands())()` |  |
	| `boolean` | `[verifyEquality](#verifyEquality())()` |  |
	| `boolean` | `[verifyEvents](#verifyEvents())()` |  |
	| `boolean` | `[verifyState](#verifyState())()` |  |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[withEnabled](#withEnabled(boolean))​(boolean value)` |  |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[withVerifyCommands](#withVerifyCommands(boolean))​(boolean value)` |  |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[withVerifyEquality](#withVerifyEquality(boolean))​(boolean value)` |  |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[withVerifyEvents](#withVerifyEvents(boolean))​(boolean value)` |  |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[withVerifyState](#withVerifyState(boolean))​(boolean value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializationSettings
		
		
		
		```
		public SerializationSettings​(boolean enabled,
		                             boolean verifyEquality,
		                             boolean verifyCommands,
		                             boolean verifyEvents,
		                             boolean verifyState)
		```

	- ### Method Detail
	
	
	
		- #### enabled
		
		
		
		```
		public boolean enabled()
		```
		- #### verifyCommands
		
		
		
		```
		public boolean verifyCommands()
		```
		- #### verifyEquality
		
		
		
		```
		public boolean verifyEquality()
		```
		- #### verifyEvents
		
		
		
		```
		public boolean verifyEvents()
		```
		- #### verifyState
		
		
		
		```
		public boolean verifyState()
		```
		- #### withEnabled
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") withEnabled​(boolean value)
		```
		- #### withVerifyCommands
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") withVerifyCommands​(boolean value)
		```
		- #### withVerifyEquality
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") withVerifyEquality​(boolean value)
		```
		- #### withVerifyEvents
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") withVerifyEvents​(boolean value)
		```
		- #### withVerifyState
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") withVerifyState​(boolean value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.SerializationSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.SerializationSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.SerializationSettings.html)*