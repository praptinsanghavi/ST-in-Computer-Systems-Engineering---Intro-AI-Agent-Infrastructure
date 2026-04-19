---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/MailboxSelector.html
title: MailboxSelector
---

# MailboxSelector

## Content

Package [akka.actor.typed](package-summary.html)
## Class MailboxSelector

- java.lang.Object
- - [akka.actor.typed.Props](Props.html "class in akka.actor.typed")
	- - akka.actor.typed.MailboxSelector

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Direct Known Subclasses:
`[PropsImpl.BoundedMailboxSelector](internal/PropsImpl.BoundedMailboxSelector.html "class in akka.actor.typed.internal")`, `[PropsImpl.DefaultMailboxSelector](internal/PropsImpl.DefaultMailboxSelector.html "class in akka.actor.typed.internal")`, `[PropsImpl.MailboxFromConfigSelector](internal/PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")`

---

```
public abstract class MailboxSelector
extends [Props](Props.html "class in akka.actor.typed")
```

Not for user extension.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.MailboxSelector)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MailboxSelector](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MailboxSelector](MailboxSelector.html "class in akka.actor.typed")` | `[bounded](#bounded(int))​(int capacity)` | A mailbox with a max capacity after which new messages are dropped (passed to deadletters). |
	| `static [MailboxSelector](MailboxSelector.html "class in akka.actor.typed")` | `[defaultMailbox](#defaultMailbox())()` | Java API: The default mailbox is SingleConsumerOnlyUnboundedMailbox |
	| `static [MailboxSelector](MailboxSelector.html "class in akka.actor.typed")` | `[fromConfig](#fromConfig(java.lang.String))​(java.lang.String path)` | Select a mailbox from the config file using an absolute config path. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Props](Props.html "class in akka.actor.typed")
		
		
		`[empty](Props.html#empty()), [withDispatcherDefault](Props.html#withDispatcherDefault()), [withDispatcherFromConfig](Props.html#withDispatcherFromConfig(java.lang.String)), [withDispatcherSameAsParent](Props.html#withDispatcherSameAsParent()), [withMailboxFromConfig](Props.html#withMailboxFromConfig(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MailboxSelector
		
		
		
		```
		public MailboxSelector()
		```

	- ### Method Detail
	
	
	
		- #### defaultMailbox
		
		
		
		```
		public static [MailboxSelector](MailboxSelector.html "class in akka.actor.typed") defaultMailbox()
		```
		
		Java API: The default mailbox is SingleConsumerOnlyUnboundedMailbox
		- #### bounded
		
		
		
		```
		public static [MailboxSelector](MailboxSelector.html "class in akka.actor.typed") bounded​(int capacity)
		```
		
		A mailbox with a max capacity after which new messages are dropped (passed to deadletters).
		
		Parameters:
		`capacity` \- The maximum number of messages in the mailbox before new messages are dropped
		- #### fromConfig
		
		
		
		```
		public static [MailboxSelector](MailboxSelector.html "class in akka.actor.typed") fromConfig​(java.lang.String path)
		```
		
		Select a mailbox from the config file using an absolute config path.
		 
		 This is a power user settings default or bounded should be preferred unless you know what you are doing.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.BoundedMailboxSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.DefaultMailboxSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/MailboxSelector.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/MailboxSelector.html)*