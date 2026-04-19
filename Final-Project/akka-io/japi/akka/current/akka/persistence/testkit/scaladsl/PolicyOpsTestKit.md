---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html
title: PolicyOpsTestKit
---

# PolicyOpsTestKit

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface PolicyOpsTestKit\<P\>

- All Known Subinterfaces:
`[CommonTestKitOps](CommonTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`, `[PersistenceTestKitOps](PersistenceTestKitOps.html "interface in akka.persistence.testkit.scaladsl")<S,​P>`

All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`, `[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface PolicyOpsTestKit<P>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[failNextNOps](#failNextNOps(int))​(int n)` | Fail n following journal operations regardless of their type. |
	| `void` | `[failNextNOps](#failNextNOps(int,java.lang.Throwable))​(int n,  java.lang.Throwable cause)` | Fail `n` following journal operations regardless of their type. |
	| `void` | `[failNextNOpsCond](#failNextNOpsCond(scala.Function2,int))​(scala.Function2<java.lang.String,​[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit"),​java.lang.Object> cond,  int n)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `void` | `[failNextNOpsCond](#failNextNOpsCond(scala.Function2,int,java.lang.Throwable))​(scala.Function2<java.lang.String,​[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit"),​java.lang.Object> cond,  int n,  java.lang.Throwable cause)` | Fail `n` following journal operations depending on the condition `cond`. |
	| `[ProcessingPolicy.DefaultPolicies](../ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit")>` | `[Policies](#Policies())()` |  |
	| `void` | `[resetPolicy](#resetPolicy())()` | Returns default policy if it was changed by {@link PolicyOpsTestKit.this.withPolicy()}. |
	| `[PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")<[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit")>` | `[withPolicy](#withPolicy(akka.persistence.testkit.ProcessingPolicy))​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit")> policy)` | Set new processing policy for journal operations. |

- - ### Method Detail
	
	
	
		- #### Policies
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies](../ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")<[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit")> Policies()
		```
		- #### failNextNOps
		
		
		
		```
		void failNextNOps​(int n)
		```
		
		Fail n following journal operations regardless of their type.
		 Fails operations with default `ExpectedFailure` exception.
		- #### failNextNOps
		
		
		
		```
		void failNextNOps​(int n,
		                  java.lang.Throwable cause)
		```
		
		Fail `n` following journal operations regardless of their type.
		 Fails operations with the `cause` exception.
		- #### failNextNOpsCond
		
		
		
		```
		void failNextNOpsCond​(scala.Function2<java.lang.String,​[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit"),​java.lang.Object> cond,
		                      int n)
		```
		
		Fail `n` following journal operations depending on the condition `cond`.
		 Failure triggers, when `cond` returns true.
		 Fails operations with default `ExpectedFailure` exception.
		- #### failNextNOpsCond
		
		
		
		```
		void failNextNOpsCond​(scala.Function2<java.lang.String,​[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit"),​java.lang.Object> cond,
		                      int n,
		                      java.lang.Throwable cause)
		```
		
		Fail `n` following journal operations depending on the condition `cond`.
		 Failure triggers, when `cond` returns true.
		 Fails operations with the `cause` exception.
		- #### resetPolicy
		
		
		
		```
		void resetPolicy()
		```
		
		Returns default policy if it was changed by {@link PolicyOpsTestKit.this.withPolicy()}.
		- #### withPolicy
		
		
		
		```
		[PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")<[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit")> withPolicy​([ProcessingPolicy](../ProcessingPolicy.html "interface in akka.persistence.testkit")<[P](PolicyOpsTestKit.html "type parameter in PolicyOpsTestKit")> policy)
		```
		
		Set new processing policy for journal operations.
		 NOTE! Overrides previously invoked `failNext...` or `rejectNext...`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/CommonTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html)*