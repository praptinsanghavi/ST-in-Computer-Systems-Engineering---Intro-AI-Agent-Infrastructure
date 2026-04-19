---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector$.html
title: MailboxSelector$
---

# MailboxSelector$

## Content

Package [akka.actor.typed](package-summary.html)
## Class MailboxSelector$

- java.lang.Object
- - akka.actor.typed.MailboxSelector$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MailboxSelector$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.MailboxSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MailboxSelector$](MailboxSelector$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MailboxSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MailboxSelector](MailboxSelector.html "class in akka.actor.typed")` | `[bounded](#bounded(int))​(int capacity)` | A mailbox with a max capacity after which new messages are dropped (passed to deadletters). |
	| `[MailboxSelector](MailboxSelector.html "class in akka.actor.typed")` | `[defaultMailbox](#defaultMailbox())()` | Java API: The default mailbox is SingleConsumerOnlyUnboundedMailbox |
	| `[MailboxSelector](MailboxSelector.html "class in akka.actor.typed")` | `[fromConfig](#fromConfig(java.lang.String))​(java.lang.String path)` | Select a mailbox from the config file using an absolute config path. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MailboxSelector$](MailboxSelector$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MailboxSelector$
		
		
		
		```
		public MailboxSelector$()
		```

	- ### Method Detail
	
	
	
		- #### defaultMailbox
		
		
		
		```
		public [MailboxSelector](MailboxSelector.html "class in akka.actor.typed") defaultMailbox()
		```
		
		Java API: The default mailbox is SingleConsumerOnlyUnboundedMailbox
		- #### bounded
		
		
		
		```
		public [MailboxSelector](MailboxSelector.html "class in akka.actor.typed") bounded​(int capacity)
		```
		
		A mailbox with a max capacity after which new messages are dropped (passed to deadletters).
		
		Parameters:
		`capacity` \- The maximum number of messages in the mailbox before new messages are dropped
		- #### fromConfig
		
		
		
		```
		public [MailboxSelector](MailboxSelector.html "class in akka.actor.typed") fromConfig​(java.lang.String path)
		```
		
		Select a mailbox from the config file using an absolute config path.
		 
		 This is a power user settings default or bounded should be preferred unless you know what you are doing.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector$.html)*