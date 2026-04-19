---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.ParamSpec$.html
title: ParameterDirectives.ParamSpec$
---

# ParameterDirectives.ParamSpec$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class ParameterDirectives.ParamSpec$

- java.lang.Object
- - akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec$

- Enclosing interface:
[ParameterDirectives](ParameterDirectives.html "interface in akka.http.scaladsl.server.directives")

---

```
public static class ParameterDirectives.ParamSpec$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ParameterDirectives.ParamSpec$](ParameterDirectives.ParamSpec$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParamSpec$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[apply](#apply(akka.http.scaladsl.server.Directive))​([Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> directive)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forNDR](#forNDR(akka.http.scaladsl.common.NameDefaultReceptacle,akka.http.scaladsl.unmarshalling.Unmarshaller))​([NameDefaultReceptacle](../../common/NameDefaultReceptacle.html "class in akka.http.scaladsl.common")<T> ndr,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<java.lang.String>,​T> fsou)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forNDUR](#forNDUR(akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle))​([NameDefaultUnmarshallerReceptacle](../../common/NameDefaultUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> ndur)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forNOR](#forNOR(akka.http.scaladsl.common.NameOptionReceptacle,akka.http.scaladsl.unmarshalling.Unmarshaller))​([NameOptionReceptacle](../../common/NameOptionReceptacle.html "class in akka.http.scaladsl.common")<T> nor,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<java.lang.String>,​T> fsou)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forNOUR](#forNOUR(akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle))​([NameOptionUnmarshallerReceptacle](../../common/NameOptionUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> nour)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forNR](#forNR(akka.http.scaladsl.common.NameReceptacle,akka.http.scaladsl.unmarshalling.Unmarshaller))​([NameReceptacle](../../common/NameReceptacle.html "class in akka.http.scaladsl.common")<T> nr,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> fsu)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forNUR](#forNUR(akka.http.scaladsl.common.NameUnmarshallerReceptacle))​([NameUnmarshallerReceptacle](../../common/NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> nur)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forRepVR](#forRepVR(akka.http.scaladsl.common.RepeatedValueReceptacle,akka.http.scaladsl.unmarshalling.Unmarshaller))​([RepeatedValueReceptacle](../../common/RepeatedValueReceptacle.html "class in akka.http.scaladsl.common")<T> rvr,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> fsu)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forRepVUR](#forRepVUR(akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle))​([RepeatedValueUnmarshallerReceptacle](../../common/RepeatedValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> rvur)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forRVR](#forRVR(akka.http.scaladsl.common.RequiredValueReceptacle,akka.http.scaladsl.unmarshalling.Unmarshaller))​([RequiredValueReceptacle](../../common/RequiredValueReceptacle.html "class in akka.http.scaladsl.common")<T> rvr,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> fsu)` |  |
	| `<T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forRVUR](#forRVUR(akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle))​([RequiredValueUnmarshallerReceptacle](../../common/RequiredValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> rvur)` |  |
	| `[ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forString](#forString(java.lang.String,akka.http.scaladsl.unmarshalling.Unmarshaller))​(java.lang.String value,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.String> fsu)` |  |
	| `[ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives")` | `[forSymbol](#forSymbol(scala.Symbol,akka.http.scaladsl.unmarshalling.Unmarshaller))​(scala.Symbol symbol,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.String> fsu)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ParameterDirectives.ParamSpec$](ParameterDirectives.ParamSpec$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ParamSpec$
		
		
		
		```
		public ParamSpec$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") apply​([Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> directive)
		```
		- #### forString
		
		
		
		```
		public [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forString​(java.lang.String value,
		                                               [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.String> fsu)
		```
		- #### forSymbol
		
		
		
		```
		public [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forSymbol​(scala.Symbol symbol,
		                                               [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.String> fsu)
		```
		- #### forNR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forNR​([NameReceptacle](../../common/NameReceptacle.html "class in akka.http.scaladsl.common")<T> nr,
		                                               [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> fsu)
		```
		- #### forNUR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forNUR​([NameUnmarshallerReceptacle](../../common/NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> nur)
		```
		- #### forNOR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forNOR​([NameOptionReceptacle](../../common/NameOptionReceptacle.html "class in akka.http.scaladsl.common")<T> nor,
		                                                [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<java.lang.String>,​T> fsou)
		```
		- #### forNDR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forNDR​([NameDefaultReceptacle](../../common/NameDefaultReceptacle.html "class in akka.http.scaladsl.common")<T> ndr,
		                                                [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<java.lang.String>,​T> fsou)
		```
		- #### forNOUR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forNOUR​([NameOptionUnmarshallerReceptacle](../../common/NameOptionUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> nour)
		```
		- #### forNDUR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forNDUR​([NameDefaultUnmarshallerReceptacle](../../common/NameDefaultUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> ndur)
		```
		- #### forRepVR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forRepVR​([RepeatedValueReceptacle](../../common/RepeatedValueReceptacle.html "class in akka.http.scaladsl.common")<T> rvr,
		                                                  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> fsu)
		```
		- #### forRepVUR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forRepVUR​([RepeatedValueUnmarshallerReceptacle](../../common/RepeatedValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> rvur)
		```
		- #### forRVR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forRVR​([RequiredValueReceptacle](../../common/RequiredValueReceptacle.html "class in akka.http.scaladsl.common")<T> rvr,
		                                                [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​T> fsu)
		```
		- #### forRVUR
		
		
		
		```
		public <T> [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") forRVUR​([RequiredValueUnmarshallerReceptacle](../../common/RequiredValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<T> rvur)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.ParamSpec$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.ParamSpec.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.ParamSpec$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.ParamSpec$.html)*