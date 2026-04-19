---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.LowLevelJoinImplicits.html
title: TupleOps.LowLevelJoinImplicits
---

# TupleOps.LowLevelJoinImplicits

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Class TupleOps.LowLevelJoinImplicits

- java.lang.Object
- - akka.http.scaladsl.server.util.TupleOps.LowLevelJoinImplicits

- Direct Known Subclasses:
`[TupleOps.Join$](TupleOps.Join$.html "class in akka.http.scaladsl.server.util")`

Enclosing class:
[TupleOps](TupleOps.html "class in akka.http.scaladsl.server.util")\<[T](TupleOps.html "type parameter in TupleOps")\>

---

```
public abstract static class TupleOps.LowLevelJoinImplicits
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LowLevelJoinImplicits](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<P,​S>[TupleOps.Join](TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<P,​S>` | `[join](#join(akka.http.scaladsl.server.util.TupleOps.FoldLeft))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<P,​S,​akka.http.scaladsl.server.util.TupleOps.Join.Fold$> fold)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LowLevelJoinImplicits
		
		
		
		```
		public LowLevelJoinImplicits()
		```

	- ### Method Detail
	
	
	
		- #### join
		
		
		
		```
		public <P,​S> [TupleOps.Join](TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<P,​S> join​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<P,​S,​akka.http.scaladsl.server.util.TupleOps.Join.Fold$> fold)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.FoldLeft.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.LowLevelJoinImplicits.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.LowLevelJoinImplicits.html)*