---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/RejectSupport.html
title: RejectSupport
---

# RejectSupport

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface RejectSupport\<U\>

- All Known Subinterfaces:
`[PersistenceTestKitOps](PersistenceTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`

All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface RejectSupport<U>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[rejectNextNOps](#rejectNextNOps(int))​(int n)` | Reject n following journal operations regardless of their type. |
	| `void` | `[rejectNextNOps](#rejectNextNOps(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Reject `n` following journal operations regardless of their type. |
	| `void` | `[rejectNextNOpsCond](#rejectNextNOpsCond(scala.Function2,int))​(scala.Function2<java.lang.String,​[U](RejectSupport.html "type parameter in RejectSupport"),​java.lang.Object> cond,  int n)` | Reject `n` following journal operations depending on the condition `cond`. |
	| `void` | `[rejectNextNOpsCond](#rejectNextNOpsCond(scala.Function2,int,java.lang.Throwable))​(scala.Function2<java.lang.String,​[U](RejectSupport.html "type parameter in RejectSupport"),​java.lang.Object> cond,  int n,  java.lang.Throwable cause)` | Reject `n` following journal operations depending on the condition `cond`. |

- - ### Method Detail
	
	
	
		- #### rejectNextNOps
		
		
		
		```
		void rejectNextNOps​(int n)
		```
		
		Reject n following journal operations regardless of their type.
		 Rejects operations with default `ExpectedRejection` exception.
		- #### rejectNextNOps
		
		
		
		```
		void rejectNextNOps​(int n,
		                    java.lang.Throwable cause)
		```
		
		Reject `n` following journal operations regardless of their type.
		 Rejects operations with the `cause` exception.
		- #### rejectNextNOpsCond
		
		
		
		```
		void rejectNextNOpsCond​(scala.Function2<java.lang.String,​[U](RejectSupport.html "type parameter in RejectSupport"),​java.lang.Object> cond,
		                        int n)
		```
		
		Reject `n` following journal operations depending on the condition `cond`.
		 Rejection triggers, when `cond` returns true.
		 Reject operations with default `ExpectedRejection` exception.
		- #### rejectNextNOpsCond
		
		
		
		```
		void rejectNextNOpsCond​(scala.Function2<java.lang.String,​[U](RejectSupport.html "type parameter in RejectSupport"),​java.lang.Object> cond,
		                        int n,
		                        java.lang.Throwable cause)
		```
		
		Reject `n` following journal operations depending on the condition `cond`.
		 Rejection triggers, when `cond` returns true.
		 Rejects operations with the `cause` exception.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/RejectSupport.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/RejectSupport.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/RejectSupport.html)*