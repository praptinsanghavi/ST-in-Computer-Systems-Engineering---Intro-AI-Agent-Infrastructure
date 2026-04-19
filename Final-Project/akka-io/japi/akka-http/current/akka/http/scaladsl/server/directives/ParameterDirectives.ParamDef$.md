---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html
title: ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$
---

# ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$

- java.lang.Object
- - akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$

- All Implemented Interfaces:
`[BinaryPolyFunc](../util/BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")`

Enclosing class:
[ParameterDirectives.ParamDef$](ParameterDirectives.ParamDef$.html "class in akka.http.scaladsl.server.directives")

---

```
public static class ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$
extends java.lang.Object
implements [BinaryPolyFunc](../util/BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.util.[BinaryPolyFunc](../util/BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")
		
		
		`[BinaryPolyFunc.Case](../util/BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<[A](../util/BinaryPolyFunc.Case.html "type parameter in BinaryPolyFunc.Case"),​[B](../util/BinaryPolyFunc.Case.html "type parameter in BinaryPolyFunc.Case"),​[Op](../util/BinaryPolyFunc.Case.html "type parameter in BinaryPolyFunc.Case")>, [BinaryPolyFunc.CaseBuilder](../util/BinaryPolyFunc.CaseBuilder.html "class in akka.http.scaladsl.server.util")<[A](../util/BinaryPolyFunc.CaseBuilder.html "type parameter in BinaryPolyFunc.CaseBuilder"),​[B](../util/BinaryPolyFunc.CaseBuilder.html "type parameter in BinaryPolyFunc.CaseBuilder")>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$](ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConvertParamDefAndConcatenate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<P,​TA,​TB>[BinaryPolyFunc.Case](../util/BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<[Directive](../Directive.html "class in akka.http.scaladsl.server")<TA>,​P,​akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef.ConvertParamDefAndConcatenate$>` | `[from](#from(akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef,akka.http.scaladsl.server.util.TupleOps.Join))​([ParameterDirectives.ParamDef](ParameterDirectives.ParamDef.html "interface in akka.http.scaladsl.server.directives")<P> pdef,  [TupleOps.Join](../util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<TA,​TB> ev)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.util.[BinaryPolyFunc](../util/BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util")
		
		
		`[at](../util/BinaryPolyFunc.html#at())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$](ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConvertParamDefAndConcatenate$
		
		
		
		```
		public ConvertParamDefAndConcatenate$()
		```

	- ### Method Detail
	
	
	
		- #### from
		
		
		
		```
		public <P,​TA,​TB> [BinaryPolyFunc.Case](../util/BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<[Directive](../Directive.html "class in akka.http.scaladsl.server")<TA>,​P,​akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef.ConvertParamDefAndConcatenate$> from​([ParameterDirectives.ParamDef](ParameterDirectives.ParamDef.html "interface in akka.http.scaladsl.server.directives")<P> pdef,
		                                                                                                                                                                                    [TupleOps.Join](../util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<TA,​TB> ev)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives.ParamDef$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives.ParamDef.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.Case.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.CaseBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html)*