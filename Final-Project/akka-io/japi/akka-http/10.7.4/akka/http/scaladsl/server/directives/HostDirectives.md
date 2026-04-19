---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives.html
title: HostDirectives
---

# HostDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface HostDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HostDirectives$](HostDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface HostDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[extractHost](#extractHost())()` | Extracts the hostname part of the Host request header value. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[host](#host(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> hostNames)` | Rejects all requests with a host name different from the given ones. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[host](#host(scala.Function1))​(scala.Function1<java.lang.String,​java.lang.Object> predicate)` | Rejects all requests for whose host name the given predicate function returns false. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[host](#host(scala.util.matching.Regex))​(scala.util.matching.Regex regex)` | Rejects all requests with a host name that doesn't have a prefix matching the given regular expression. |

- - ### Method Detail
	
	
	
		- #### extractHost
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> extractHost()
		```
		
		Extracts the hostname part of the Host request header value.
		 
		
		Returns:
		(undocumented)
		- #### host
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> host​(scala.collection.immutable.Seq<java.lang.String> hostNames)
		```
		
		Rejects all requests with a host name different from the given ones.
		 
		
		Parameters:
		`hostNames` \- (undocumented)
		Returns:
		(undocumented)
		- #### host
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> host​(scala.Function1<java.lang.String,​java.lang.Object> predicate)
		```
		
		Rejects all requests for whose host name the given predicate function returns false.
		 
		
		Parameters:
		`predicate` \- (undocumented)
		Returns:
		(undocumented)
		- #### host
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> host​(scala.util.matching.Regex regex)
		```
		
		Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.
		 For all matching requests the prefix string matching the regex is extracted and passed to the inner route.
		 If the regex contains a capturing group only the string matched by this group is extracted.
		 If the regex contains more than one capturing group an IllegalArgumentException is thrown.
		 
		
		Parameters:
		`regex` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives.html)*