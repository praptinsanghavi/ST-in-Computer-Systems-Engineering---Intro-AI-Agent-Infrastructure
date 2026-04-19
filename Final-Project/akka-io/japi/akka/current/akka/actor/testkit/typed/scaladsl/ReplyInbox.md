---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
title: ReplyInbox
---

# ReplyInbox

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Interface ReplyInbox\<T\>

- ---

```
public interface ReplyInbox<T>
```

Similar to an [`TestInbox`](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl"), but can only ever give access to a single message (a reply).
 
 Not intended for user creation: the [`BehaviorTestKit`](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl") will provide these
 to denote that at most a single reply is expected.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[T](ReplyInbox.html "type parameter in ReplyInbox")>` | `[expectNoReply](#expectNoReply())()` | Assert that this inbox has \*never\* received a reply. |
	| `void` | `[expectReply](#expectReply(T))​([T](ReplyInbox.html "type parameter in ReplyInbox") expectedReply)` | Assert and remove the reply. |
	| `boolean` | `[hasReply](#hasReply())()` |  |
	| `[T](ReplyInbox.html "type parameter in ReplyInbox")` | `[receiveReply](#receiveReply())()` | Get and remove the reply. |

- - ### Method Detail
	
	
	
		- #### expectNoReply
		
		
		
		```
		[ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[T](ReplyInbox.html "type parameter in ReplyInbox")> expectNoReply()
		```
		
		Assert that this inbox has \*never\* received a reply.
		- #### expectReply
		
		
		
		```
		void expectReply​([T](ReplyInbox.html "type parameter in ReplyInbox") expectedReply)
		```
		
		Assert and remove the reply. Subsequent calls to `receiveReply`, `expectReply`, and `expectNoReply` will fail and `hasReply`
		 will be false after calling this method
		- #### hasReply
		
		
		
		```
		boolean hasReply()
		```
		- #### receiveReply
		
		
		
		```
		[T](ReplyInbox.html "type parameter in ReplyInbox") receiveReply()
		```
		
		Get and remove the reply. Subsequent calls to `receiveReply`, `expectReply`, and `expectNoReply` will fail and `hasReply`
		 will be false after calling this method

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html)*