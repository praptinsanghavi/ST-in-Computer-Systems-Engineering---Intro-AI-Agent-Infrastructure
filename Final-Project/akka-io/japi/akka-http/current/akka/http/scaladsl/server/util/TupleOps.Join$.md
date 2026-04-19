---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.Fold$.html
title: TupleOps.Join$.Fold$
---

# TupleOps.Join$.Fold$

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Class TupleOps.Join$.Fold$

- java.lang.Object
- - akka.http.scaladsl.server.util.TupleOps.Join$.Fold$

- All Implemented Interfaces:
`[BinaryPolyFunc](BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")`

Enclosing class:
[TupleOps.Join$](TupleOps.Join$.html "class in akka.http.scaladsl.server.util")

---

```
public static class TupleOps.Join$.Fold$
extends java.lang.Object
implements [BinaryPolyFunc](BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.util.[BinaryPolyFunc](BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")
		
		
		`[BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<[A](BinaryPolyFunc.Case.html "type parameter in BinaryPolyFunc.Case"),​[B](BinaryPolyFunc.Case.html "type parameter in BinaryPolyFunc.Case"),​[Op](BinaryPolyFunc.Case.html "type parameter in BinaryPolyFunc.Case")>, [BinaryPolyFunc.CaseBuilder](BinaryPolyFunc.CaseBuilder.html "class in akka.http.scaladsl.server.util")<[A](BinaryPolyFunc.CaseBuilder.html "type parameter in BinaryPolyFunc.CaseBuilder"),​[B](BinaryPolyFunc.CaseBuilder.html "type parameter in BinaryPolyFunc.CaseBuilder")>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TupleOps.Join$.Fold$](TupleOps.Join$.Fold$.html "class in akka.http.scaladsl.server.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Fold$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​A>[BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<T,​A,​akka.http.scaladsl.server.util.TupleOps.Join.Fold$>` | `[step](#step(akka.http.scaladsl.server.util.TupleOps.AppendOne))​([TupleOps.AppendOne](TupleOps.AppendOne.html "interface in akka.http.scaladsl.server.util")<T,​A> append)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.util.[BinaryPolyFunc](BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")
		
		
		`[at](BinaryPolyFunc.html#at())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TupleOps.Join$.Fold$](TupleOps.Join$.Fold$.html "class in akka.http.scaladsl.server.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Fold$
		
		
		
		```
		public Fold$()
		```

	- ### Method Detail
	
	
	
		- #### step
		
		
		
		```
		public <T,​A> [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<T,​A,​akka.http.scaladsl.server.util.TupleOps.Join.Fold$> step​([TupleOps.AppendOne](TupleOps.AppendOne.html "interface in akka.http.scaladsl.server.util")<T,​A> append)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.Case.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.CaseBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.AppendOne.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.Fold$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.Fold$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.Fold$.html)*