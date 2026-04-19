---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
title: StatusReplyInbox
---

# StatusReplyInbox

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Interface StatusReplyInbox\<T\>

- ---

```
public interface StatusReplyInbox<T>
```

A [`ReplyInbox`](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl") which specially handles [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern").
 
 Note that there is no provided ability to expect a specific `Throwable`, as it's recommended to prefer
 a string error message or to enumerate failures with specific types.
 

 Not intended for user creation: the [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl") will provide these to
 denote that at most a single reply is expected.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[expectErrorMessage](#expectErrorMessage(java.lang.String))​(java.lang.String errorMessage)` | Assert that the status reply is a failure with this error message and remove the status reply. |
	| `[StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<[T](StatusReplyInbox.html "type parameter in StatusReplyInbox")>` | `[expectNoReply](#expectNoReply())()` | Assert that this inbox has \*never\* received a reply. |
	| `void` | `[expectValue](#expectValue(T))​([T](StatusReplyInbox.html "type parameter in StatusReplyInbox") expectedValue)` | Assert that the status reply is a success with this value and remove the status reply. |
	| `boolean` | `[hasReply](#hasReply())()` |  |
	| `java.lang.Throwable` | `[receiveError](#receiveError())()` | Get and remove the error value of the status reply. |
	| `[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<[T](StatusReplyInbox.html "type parameter in StatusReplyInbox")>` | `[receiveStatusReply](#receiveStatusReply())()` | Get and remove the status reply. |
	| `[T](StatusReplyInbox.html "type parameter in StatusReplyInbox")` | `[receiveValue](#receiveValue())()` | Get and remove the successful value of the status reply. |

- - ### Method Detail
	
	
	
		- #### expectErrorMessage
		
		
		
		```
		void expectErrorMessage​(java.lang.String errorMessage)
		```
		
		Assert that the status reply is a failure with this error message and remove the status reply. Subsequent
		 calls to any `receive` or `expect` method will fail and `hasReply` will be false after calling this method.
		- #### expectNoReply
		
		
		
		```
		[StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<[T](StatusReplyInbox.html "type parameter in StatusReplyInbox")> expectNoReply()
		```
		
		Assert that this inbox has \*never\* received a reply.
		- #### expectValue
		
		
		
		```
		void expectValue​([T](StatusReplyInbox.html "type parameter in StatusReplyInbox") expectedValue)
		```
		
		Assert that the status reply is a success with this value and remove the status reply. Subsequent calls to any
		 `receive` or `expect` method will fail and `hasReply` will be false after calling this method.
		- #### hasReply
		
		
		
		```
		boolean hasReply()
		```
		- #### receiveError
		
		
		
		```
		java.lang.Throwable receiveError()
		```
		
		Get and remove the error value of the status reply. This will fail if the status reply is a success.
		 Subsequent calls to any `receive` or `expect` method will fail and `hasReply` will be false after calling this
		 method.
		- #### receiveStatusReply
		
		
		
		```
		[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<[T](StatusReplyInbox.html "type parameter in StatusReplyInbox")> receiveStatusReply()
		```
		
		Get and remove the status reply. Subsequent calls to any `receive` or `expect` method will fail and `hasReply`
		 will be false after calling this method.
		- #### receiveValue
		
		
		
		```
		[T](StatusReplyInbox.html "type parameter in StatusReplyInbox") receiveValue()
		```
		
		Get and remove the successful value of the status reply. This will fail if the status reply is an error.
		 Subsequent calls to any `receive` or `expect` method will fail and `hasReply` will be false after calling this
		 method.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html)*