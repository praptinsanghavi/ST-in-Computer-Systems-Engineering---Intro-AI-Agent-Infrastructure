---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:11:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html
title: Scope
---

# Scope

## Content

Package [akka.actor](package-summary.html)
## Interface Scope

- All Known Implementing Classes:
`[ClusterScope](../cluster/ClusterScope.html "class in akka.cluster")`, `[ClusterScope$](../cluster/ClusterScope$.html "class in akka.cluster")`, `[LocalScope](LocalScope.html "class in akka.actor")`, `[LocalScope$](LocalScope$.html "class in akka.actor")`, `[NoScopeGiven](NoScopeGiven.html "class in akka.actor")`, `[NoScopeGiven$](NoScopeGiven$.html "class in akka.actor")`, `[RemoteScope](../remote/RemoteScope.html "class in akka.remote")`

---

```
public interface Scope
```

The scope of a [`Deploy`](Deploy.html "class in akka.actor") serves two purposes: as a marker for
 pattern matching the \&ldquo;scope\&rdquo; (i.e. local/remote/cluster) as well as for
 extending the information carried by the final Deploy class. Scopes can be
 used in conjunction with a custom [`ActorRefProvider`](ActorRefProvider.html "interface in akka.actor"), making
 Akka actors fully extensible.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Scope](Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](Scope.html "interface in akka.actor") other)` | When merging [`Deploy`](Deploy.html "class in akka.actor") instances using withFallback() on  the left one, this is propagated to \&ldquo;merging\&rdquo; scopes in the same way. |

- - ### Method Detail
	
	
	
		- #### withFallback
		
		
		
		```
		[Scope](Scope.html "interface in akka.actor") withFallback​([Scope](Scope.html "interface in akka.actor") other)
		```
		
		When merging [`Deploy`](Deploy.html "class in akka.actor") instances using withFallback() on
		 the left one, this is propagated to \&ldquo;merging\&rdquo; scopes in the same way.
		 The setup is biased towards preferring the callee over the argument, i.e.
		 a.withFallback(b) is called expecting that a should in general take
		 precedence.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/LocalScope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoScopeGiven.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterScope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterScope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteScope.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scope.html)*