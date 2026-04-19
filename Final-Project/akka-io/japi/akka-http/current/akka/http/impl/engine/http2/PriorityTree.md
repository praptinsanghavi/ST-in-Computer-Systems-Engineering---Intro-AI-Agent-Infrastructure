---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityTree.html
title: PriorityTree
---

# PriorityTree

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface PriorityTree

- ---

```
public interface PriorityTree
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[PriorityTree](PriorityTree.html "interface in akka.http.impl.engine.http2")` | `[insertOrUpdate](#insertOrUpdate(int,int,int,boolean))​(int streamId,  int streamDependency,  int weight,  boolean exclusive)` | Returns a new priority tree containing the new or existing and updated stream. |
	| `java.lang.String` | `[print](#print())()` | Gives an ASCII representation of the tree. |
	| `[PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2")` | `[rootNode](#rootNode())()` | Returns the root node of the tree. |

- - ### Method Detail
	
	
	
		- #### insertOrUpdate
		
		
		
		```
		[PriorityTree](PriorityTree.html "interface in akka.http.impl.engine.http2") insertOrUpdate​(int streamId,
		                            int streamDependency,
		                            int weight,
		                            boolean exclusive)
		```
		
		Returns a new priority tree containing the new or existing and updated stream.
		
		Parameters:
		`streamId` \- (undocumented)
		`streamDependency` \- (undocumented)
		`weight` \- (undocumented)
		`exclusive` \- (undocumented)
		Returns:
		(undocumented)
		- #### rootNode
		
		
		
		```
		[PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2") rootNode()
		```
		
		Returns the root node of the tree.
		
		Returns:
		(undocumented)
		- #### print
		
		
		
		```
		java.lang.String print()
		```
		
		Gives an ASCII representation of the tree.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityNode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityTree.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityTree.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PriorityTree.html)*