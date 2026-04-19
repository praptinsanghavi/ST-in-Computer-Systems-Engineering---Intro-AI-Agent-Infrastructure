---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:49:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/PathDirectives.html
title: PathDirectives
---

# PathDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class PathDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - [akka.http.javadsl.server.directives.CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		- - [akka.http.javadsl.server.directives.CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
			- - [akka.http.javadsl.server.directives.CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
				- - [akka.http.javadsl.server.directives.DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")
					- - [akka.http.javadsl.server.directives.ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
						- - [akka.http.javadsl.server.directives.FileAndResourceDirectives](FileAndResourceDirectives.html "class in akka.http.javadsl.server.directives")
							- - [akka.http.javadsl.server.directives.FileUploadDirectives](FileUploadDirectives.html "class in akka.http.javadsl.server.directives")
								- - [akka.http.javadsl.server.directives.FormFieldDirectives](FormFieldDirectives.html "class in akka.http.javadsl.server.directives")
									- - [akka.http.javadsl.server.directives.FutureDirectives](FutureDirectives.html "class in akka.http.javadsl.server.directives")
										- - [akka.http.javadsl.server.directives.HeaderDirectives](HeaderDirectives.html "class in akka.http.javadsl.server.directives")
											- - [akka.http.javadsl.server.directives.AttributeDirectives](AttributeDirectives.html "class in akka.http.javadsl.server.directives")
												- - [akka.http.javadsl.server.directives.HostDirectives](HostDirectives.html "class in akka.http.javadsl.server.directives")
													- - [akka.http.javadsl.server.directives.MarshallingDirectives](MarshallingDirectives.html "class in akka.http.javadsl.server.directives")
														- - [akka.http.javadsl.server.directives.MethodDirectives](MethodDirectives.html "class in akka.http.javadsl.server.directives")
															- - [akka.http.javadsl.server.directives.MiscDirectives](MiscDirectives.html "class in akka.http.javadsl.server.directives")
																- - [akka.http.javadsl.server.directives.ParameterDirectives](ParameterDirectives.html "class in akka.http.javadsl.server.directives")
																	- - akka.http.javadsl.server.directives.PathDirectives

- Direct Known Subclasses:
`[RangeDirectives](RangeDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class PathDirectives
extends [ParameterDirectives](ParameterDirectives.html "class in akka.http.javadsl.server.directives")
```

Only path prefixes are matched by these methods, since any kind of chaining path extractions
 in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.
 
 Just nest path() directives with the required types, ending in pathEnd() if you want to fail
 further paths.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[ignoreTrailingSlash](#ignoreTrailingSlash(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Tries to match the inner route and if it fails with an empty rejection, it tries it again  adding (or removing) the trailing slash on the given path. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") p,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Applies the given `PathMatcher0` to the remaining unmatched path after consuming a leading slash. |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T> p,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[path](#path(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function,  expecting the full path to have been consumed then. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[path](#path(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Matches a prefix to the remaining unmatched path after consuming a leading slash. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[path](#path(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathEnd](#pathEnd(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Rejects the request if the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") is non\-empty,  or said differently: only passes on the request to its inner route if the request path  has been matched completely. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathEndOrSingleSlash](#pathEndOrSingleSlash(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Only passes on the request to its inner route if the request path has been matched  completely or only consists of exactly one remaining slash. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") p,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Applies the given `PathMatcher0` to the remaining unmatched path after consuming a leading slash. |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T> p,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Matches a prefix to the remaining unmatched path after consuming a leading slash. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefix](#pathPrefix(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathPrefixTest](#pathPrefixTest(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Checks whether the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") has a prefix matched by the  given PathMatcher. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSingleSlash](#pathSingleSlash(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Only passes on the request to its inner route if the request path  consists of exactly one remaining slash. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffix](#pathSuffix(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Applies the given [`PathMatcher`](../../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server") to a suffix of the remaining unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server"). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pathSuffixTest](#pathSuffixTest(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Checks whether the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") has a suffix matched by the  given PathMatcher. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefix](#rawPathPrefix(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Applies the given matcher directly to a prefix of the unmatched path of the  [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") (i.e. without implicitly consuming a leading slash). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier))​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function))​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,  java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T1,​T2>[Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction))​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,  java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[rawPathPrefixTest](#rawPathPrefixTest(java.lang.String,java.util.function.Supplier))​(java.lang.String segment,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Checks whether the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") has a prefix matched by the  given PathMatcher. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[redirectToNoTrailingSlashIfPresent](#redirectToNoTrailingSlashIfPresent(akka.http.javadsl.model.StatusCode,java.util.function.Supplier))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | If the request path ends with a slash, redirect to the same uri without trailing slash in the path. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[redirectToTrailingSlashIfMissing](#redirectToTrailingSlashIfMissing(akka.http.javadsl.model.StatusCode,java.util.function.Supplier))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path. |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[ParameterDirectives](ParameterDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[parameter](ParameterDirectives.html#parameter(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [parameter](ParameterDirectives.html#parameter(java.lang.String,java.util.function.Function)), [parameterList](ParameterDirectives.html#parameterList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [parameterList](ParameterDirectives.html#parameterList(java.lang.String,java.util.function.Function)), [parameterList](ParameterDirectives.html#parameterList(java.util.function.Function)), [parameterMap](ParameterDirectives.html#parameterMap(java.util.function.Function)), [parameterMultiMap](ParameterDirectives.html#parameterMultiMap(java.util.function.Function)), [parameterOptional](ParameterDirectives.html#parameterOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [parameterOptional](ParameterDirectives.html#parameterOptional(java.lang.String,java.util.function.Function)), [parameterOrDefault](ParameterDirectives.html#parameterOrDefault(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Function)), [parameterRequiredValue](ParameterDirectives.html#parameterRequiredValue(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[MiscDirectives](MiscDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[extractClientIP](MiscDirectives.html#extractClientIP(java.util.function.Function)), [rejectEmptyResponse](MiscDirectives.html#rejectEmptyResponse(java.util.function.Supplier)), [requestEntityEmpty](MiscDirectives.html#requestEntityEmpty(java.util.function.Supplier)), [requestEntityPresent](MiscDirectives.html#requestEntityPresent(java.util.function.Supplier)), [selectPreferredLanguage](MiscDirectives.html#selectPreferredLanguage(java.lang.Iterable,java.util.function.Function)), [validate](MiscDirectives.html#validate(java.util.function.BooleanSupplier,java.lang.String,java.util.function.Supplier)), [withoutSizeLimit](MiscDirectives.html#withoutSizeLimit(java.util.function.Supplier)), [withSizeLimit](MiscDirectives.html#withSizeLimit(long,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[MethodDirectives](MethodDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[delete](MethodDirectives.html#delete(java.util.function.Supplier)), [extractMethod](MethodDirectives.html#extractMethod(java.util.function.Function)), [get](MethodDirectives.html#get(java.util.function.Supplier)), [head](MethodDirectives.html#head(java.util.function.Supplier)), [method](MethodDirectives.html#method(akka.http.javadsl.model.HttpMethod,java.util.function.Supplier)), [options](MethodDirectives.html#options(java.util.function.Supplier)), [overrideMethodWithParameter](MethodDirectives.html#overrideMethodWithParameter(java.lang.String,java.util.function.Supplier)), [patch](MethodDirectives.html#patch(java.util.function.Supplier)), [post](MethodDirectives.html#post(java.util.function.Supplier)), [put](MethodDirectives.html#put(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[MarshallingDirectives](MarshallingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[completeWith](MarshallingDirectives.html#completeWith(akka.http.javadsl.marshalling.Marshaller,java.util.function.Consumer)), [entity](MarshallingDirectives.html#entity(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function)), [handleWith](MarshallingDirectives.html#handleWith(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.marshalling.Marshaller,java.util.function.Function)), [request](MarshallingDirectives.html#request(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[HostDirectives](HostDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[extractHost](HostDirectives.html#extractHost(java.util.function.Function)), [host](HostDirectives.html#host(java.lang.Iterable,java.util.function.Supplier)), [host](HostDirectives.html#host(java.lang.String,java.util.function.Supplier)), [host](HostDirectives.html#host(java.util.function.Predicate,java.util.function.Supplier)), [host](HostDirectives.html#host(java.util.regex.Pattern,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[AttributeDirectives](AttributeDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[attribute](AttributeDirectives.html#attribute(akka.http.javadsl.model.AttributeKey,java.util.function.Function)), [optionalAttribute](AttributeDirectives.html#optionalAttribute(akka.http.javadsl.model.AttributeKey,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[HeaderDirectives](HeaderDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[checkSameOrigin](HeaderDirectives.html#checkSameOrigin(akka.http.javadsl.model.headers.HttpOriginRange,java.util.function.Supplier)), [headerValue](HeaderDirectives.html#headerValue(java.util.function.Function,java.util.function.Function)), [headerValueByName](HeaderDirectives.html#headerValueByName(java.lang.String,java.util.function.Function)), [headerValueByType](HeaderDirectives.html#headerValueByType(java.lang.Class,java.util.function.Function)), [headerValuePF](HeaderDirectives.html#headerValuePF(scala.PartialFunction,java.util.function.Function)), [optionalHeaderValue](HeaderDirectives.html#optionalHeaderValue(java.util.function.Function,java.util.function.Function)), [optionalHeaderValueByName](HeaderDirectives.html#optionalHeaderValueByName(java.lang.String,java.util.function.Function)), [optionalHeaderValueByType](HeaderDirectives.html#optionalHeaderValueByType(java.lang.Class,java.util.function.Function)), [optionalHeaderValuePF](HeaderDirectives.html#optionalHeaderValuePF(scala.PartialFunction,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FutureDirectives](FutureDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[completeOrRecoverWith](FutureDirectives.html#completeOrRecoverWith(java.util.function.Supplier,akka.http.javadsl.marshalling.Marshaller,java.util.function.Function)), [onComplete](FutureDirectives.html#onComplete(java.util.concurrent.CompletionStage,java.util.function.Function)), [onComplete](FutureDirectives.html#onComplete(java.util.function.Supplier,java.util.function.Function)), [onCompleteWithBreaker](FutureDirectives.html#onCompleteWithBreaker(akka.pattern.CircuitBreaker,java.util.function.Supplier,java.util.function.Function)), [onSuccess](FutureDirectives.html#onSuccess(java.util.concurrent.CompletionStage,java.util.function.Function)), [onSuccess](FutureDirectives.html#onSuccess(java.util.function.Supplier,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FormFieldDirectives](FormFieldDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[formField](FormFieldDirectives.html#formField(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [formField](FormFieldDirectives.html#formField(java.lang.String,java.util.function.Function)), [formFieldList](FormFieldDirectives.html#formFieldList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [formFieldList](FormFieldDirectives.html#formFieldList(java.lang.String,java.util.function.Function)), [formFieldList](FormFieldDirectives.html#formFieldList(java.util.function.Function)), [formFieldMap](FormFieldDirectives.html#formFieldMap(java.util.function.Function)), [formFieldMultiMap](FormFieldDirectives.html#formFieldMultiMap(java.util.function.Function)), [formFieldOptional](FormFieldDirectives.html#formFieldOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [formFieldOptional](FormFieldDirectives.html#formFieldOptional(java.lang.String,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FileUploadDirectives](FileUploadDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[fileUpload](FileUploadDirectives.html#fileUpload(java.lang.String,java.util.function.BiFunction)), [fileUploadAll](FileUploadDirectives.html#fileUploadAll(java.lang.String,java.util.function.Function)), [storeUploadedFile](FileUploadDirectives.html#storeUploadedFile(java.lang.String,java.util.function.Function,java.util.function.BiFunction)), [storeUploadedFiles](FileUploadDirectives.html#storeUploadedFiles(java.lang.String,java.util.function.Function,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FileAndResourceDirectives](FileAndResourceDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[defaultContentTypeResolver](FileAndResourceDirectives.html#defaultContentTypeResolver()), [defaultDirectoryRenderer](FileAndResourceDirectives.html#defaultDirectoryRenderer()), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.DirectoryRenderer)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.String...)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(scala.collection.immutable.Seq)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromDirectory](FileAndResourceDirectives.html#getFromDirectory(java.lang.String)), [getFromDirectory](FileAndResourceDirectives.html#getFromDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.io.File)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.io.File,akka.http.javadsl.model.ContentType)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.io.File,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.lang.String)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType,java.lang.ClassLoader)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver,java.lang.ClassLoader)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,java.lang.ClassLoader)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,java.lang.String...)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,scala.collection.immutable.Seq)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(java.lang.String...)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(scala.collection.immutable.Seq))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[handleExceptions](ExecutionDirectives.html#handleExceptions(akka.http.javadsl.server.ExceptionHandler,java.util.function.Supplier)), [handleRejections](ExecutionDirectives.html#handleRejections(akka.http.javadsl.server.RejectionHandler,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[logRequest](DebuggingDirectives.html#logRequest(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier)), [logRequest](DebuggingDirectives.html#logRequest(java.lang.String,java.util.function.Supplier)), [logRequest](DebuggingDirectives.html#logRequest(java.util.function.Function,java.util.function.Supplier)), [logRequestResult](DebuggingDirectives.html#logRequestResult(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier)), [logRequestResultOptional](DebuggingDirectives.html#logRequestResultOptional(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.lang.String,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cookie](CookieDirectives.html#cookie(java.lang.String,java.util.function.Function)), [deleteCookie](CookieDirectives.html#deleteCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.Iterable,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.lang.String,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.util.function.Supplier)), [optionalCookie](CookieDirectives.html#optionalCookie(java.lang.String,java.util.function.Function)), [setCookie](CookieDirectives.html#setCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier)), [setCookie](CookieDirectives.html#setCookie(java.lang.Iterable,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[decodeRequest](CodingDirectives.html#decodeRequest(java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(akka.http.javadsl.coding.Coder,java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(java.lang.Iterable,java.util.function.Supplier)), [encodeResponse](CodingDirectives.html#encodeResponse(java.util.function.Supplier)), [encodeResponseWith](CodingDirectives.html#encodeResponseWith(java.lang.Iterable,java.util.function.Supplier)), [requestEncodedWith](CodingDirectives.html#requestEncodedWith(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [responseEncodingAccepted](CodingDirectives.html#responseEncodingAccepted(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [withPrecompressedMediaTypeSupport](CodingDirectives.html#withPrecompressedMediaTypeSupport(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cancelRejection](BasicDirectives.html#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.lang.Iterable,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.util.function.Predicate,java.util.function.Supplier)), [extract](BasicDirectives.html#extract(java.util.function.Function,java.util.function.Function)), [extractActorSystem](BasicDirectives.html#extractActorSystem(java.util.function.Function)), [extractDataBytes](BasicDirectives.html#extractDataBytes(java.util.function.Function)), [extractEntity](BasicDirectives.html#extractEntity(java.util.function.Function)), [extractExecutionContext](BasicDirectives.html#extractExecutionContext(java.util.function.Function)), [extractLog](BasicDirectives.html#extractLog(java.util.function.Function)), [extractMatchedPath](BasicDirectives.html#extractMatchedPath(java.util.function.Function)), [extractMaterializer](BasicDirectives.html#extractMaterializer(java.util.function.Function)), [extractParserSettings](BasicDirectives.html#extractParserSettings(java.util.function.Function)), [extractRequest](BasicDirectives.html#extractRequest(java.util.function.Function)), [extractRequestContext](BasicDirectives.html#extractRequestContext(java.util.function.Function)), [extractRequestEntity](BasicDirectives.html#extractRequestEntity(java.util.function.Function)), [extractSettings](BasicDirectives.html#extractSettings(java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function)), [extractUnmatchedPath](BasicDirectives.html#extractUnmatchedPath(java.util.function.Function)), [extractUri](BasicDirectives.html#extractUri(java.util.function.Function)), [mapInnerRoute](BasicDirectives.html#mapInnerRoute(java.util.function.Function,java.util.function.Supplier)), [mapRejections](BasicDirectives.html#mapRejections(java.util.function.Function,java.util.function.Supplier)), [mapRequest](BasicDirectives.html#mapRequest(java.util.function.Function,java.util.function.Supplier)), [mapRequestContext](BasicDirectives.html#mapRequestContext(java.util.function.Function,java.util.function.Supplier)), [mapResponse](BasicDirectives.html#mapResponse(java.util.function.Function,java.util.function.Supplier)), [mapResponseEntity](BasicDirectives.html#mapResponseEntity(java.util.function.Function,java.util.function.Supplier)), [mapResponseHeaders](BasicDirectives.html#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier)), [mapRouteResult](BasicDirectives.html#mapRouteResult(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultFuture](BasicDirectives.html#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultPF](BasicDirectives.html#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier)), [mapRouteResultWith](BasicDirectives.html#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultWithPF](BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier)), [mapSettings](BasicDirectives.html#mapSettings(java.util.function.Function,java.util.function.Supplier)), [mapUnmatchedPath](BasicDirectives.html#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier)), [pass](BasicDirectives.html#pass(java.util.function.Supplier)), [provide](BasicDirectives.html#provide(T,java.util.function.Function)), [recoverRejections](BasicDirectives.html#recoverRejections(java.util.function.Function,java.util.function.Supplier)), [recoverRejectionsWith](BasicDirectives.html#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier)), [withExecutionContext](BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier)), [withLog](BasicDirectives.html#withLog(akka.event.LoggingAdapter,java.util.function.Supplier)), [withMaterializer](BasicDirectives.html#withMaterializer(akka.stream.Materializer,java.util.function.Supplier)), [withSettings](BasicDirectives.html#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathDirectives
		
		
		
		```
		public PathDirectives()
		```

	- ### Method Detail
	
	
	
		- #### ignoreTrailingSlash
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") ignoreTrailingSlash​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Tries to match the inner route and if it fails with an empty rejection, it tries it again
		 adding (or removing) the trailing slash on the given path.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### path
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") path​(java.lang.String segment,
		                  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Matches a prefix to the remaining unmatched path after consuming a leading slash.
		 The matcher has to match the remaining path completely.
		 If matched the value matching the prefix is extracted on the directive level.
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### path
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") path​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") path​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") p,
		                  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Applies the given `PathMatcher0` to the remaining unmatched path after consuming a leading slash.
		 The matcher has to match the remaining path completely.
		 If matched the value extracted by the `PathMatcher0` is extracted on the directive level.
		
		Parameters:
		`p` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### path
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") path​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T> p,
		                      java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") path​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,
		                                java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### path
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") path​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                      java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function,
		 expecting the full path to have been consumed then.
		
		Parameters:
		`t` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathEnd
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathEnd​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Rejects the request if the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") is non\-empty,
		 or said differently: only passes on the request to its inner route if the request path
		 has been matched completely.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathEndOrSingleSlash
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathEndOrSingleSlash​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Only passes on the request to its inner route if the request path has been matched
		 completely or only consists of exactly one remaining slash.
		 
		 Note that trailing slash and non\-trailing slash URLs are '''not''' the same, although they often serve
		 the same content. It is recommended to serve only one URL version and make the other redirect to it using
		 [`redirectToTrailingSlashIfMissing(akka.http.javadsl.model.StatusCode, java.util.function.Supplier<akka.http.javadsl.server.Route>)`](#redirectToTrailingSlashIfMissing(akka.http.javadsl.model.StatusCode,java.util.function.Supplier)) or [`redirectToNoTrailingSlashIfPresent(akka.http.javadsl.model.StatusCode, java.util.function.Supplier<akka.http.javadsl.server.Route>)`](#redirectToNoTrailingSlashIfPresent(akka.http.javadsl.model.StatusCode,java.util.function.Supplier)) directive.
		 
		
		
		 For example:
		 
		
		
		```
		
		 def route = {
		   // redirect '/users/' to '/users', '/users/:userId/' to '/users/:userId'
		   redirectToNoTrailingSlashIfPresent(Found) {
		     pathPrefix("users") {
		       concat(
		         pathEnd {
		           // user list ...
		         },
		         path(UUID) { userId =>
		           // user profile ...
		         }
		       )
		     }
		   }
		 }
		 
		```
		
		
		 For further information, refer to: http://googlewebmastercentral.blogspot.de/2010/04/to\-slash\-or\-not\-to\-slash.html
		
		
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathPrefix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefix​(java.lang.String segment,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Matches a prefix to the remaining unmatched path after consuming a leading slash.
		 The matcher has to match a prefix of the remaining path.
		 If matched the value matching the prefix is extracted on the directive level.
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathPrefix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefix​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefix​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") p,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Applies the given `PathMatcher0` to the remaining unmatched path after consuming a leading slash.
		 The matcher has to match a prefix of the remaining path.
		 If matched the value extracted by the PathMatcher is extracted on the directive level.
		
		Parameters:
		`p` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathPrefix
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefix​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T> p,
		                            java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefix​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> p,
		                                      java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefix
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefix​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                            java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Consumes a leading slash and extracts the next path segment, unmarshalling it and passing the result to the inner function.
		
		Parameters:
		`t` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathPrefixTest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefixTest​(java.lang.String segment,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Checks whether the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") has a prefix matched by the
		 given PathMatcher. In analogy to the `pathPrefix` directive a leading slash is implied.
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathPrefixTest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefixTest​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefixTest
		
		
		
		```
		public <T1> [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefixTest​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                 java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathPrefixTest
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") pathPrefixTest​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                          java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSingleSlash
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathSingleSlash​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Only passes on the request to its inner route if the request path
		 consists of exactly one remaining slash.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathSuffix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffix​(java.lang.String segment,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Applies the given [`PathMatcher`](../../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server") to a suffix of the remaining unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server").
		 If matched the value extracted by the [`PathMatcher0`](../PathMatcher0.html "class in akka.http.javadsl.server") is extracted and the matched parts of the path are consumed.
		 Note that, for efficiency reasons, the given [`PathMatcher0`](../PathMatcher0.html "class in akka.http.javadsl.server") must match the desired suffix in reversed\-segment
		 order, i.e. `pathSuffix("baz" / "bar")` would match `/foo/bar/baz`!
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathSuffix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffix​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffix
		
		
		
		```
		public <T1> [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffix​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                             java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffix
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffix​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                      java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffixTest​(java.lang.String segment,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Checks whether the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") has a suffix matched by the
		 given PathMatcher. However, as opposed to the pathSuffix directive the matched path is not
		 actually "consumed".
		 Note that, for efficiency reasons, the given PathMatcher must match the desired suffix in reversed\-segment
		 order, i.e. `pathSuffixTest("baz" / "bar")` would match `/foo/bar/baz`!
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pathSuffixTest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffixTest​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public <T1> [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffixTest​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                 java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### pathSuffixTest
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") pathSuffixTest​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                          java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefix​(java.lang.String segment,
		                           java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Applies the given matcher directly to a prefix of the unmatched path of the
		 [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") (i.e. without implicitly consuming a leading slash).
		 The matcher has to match a prefix of the remaining path.
		 If matched the value extracted by the PathMatcher is extracted on the directive level.
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### rawPathPrefix
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefix​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                           java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public <T1> [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefix​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefix
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefix​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                         java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​(java.lang.String segment,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Checks whether the unmatchedPath of the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") has a prefix matched by the
		 given PathMatcher. However, as opposed to the `pathPrefix` directive the matched path is not
		 actually "consumed".
		
		Parameters:
		`segment` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### rawPathPrefixTest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​([PathMatcher0](../PathMatcher0.html "class in akka.http.javadsl.server") pm,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public <T1> [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​([PathMatcher1](../PathMatcher1.html "class in akka.http.javadsl.server")<T1> pm,
		                                    java.util.function.Function<T1,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### rawPathPrefixTest
		
		
		
		```
		public <T1,​T2> [Route](../Route.html "interface in akka.http.javadsl.server") rawPathPrefixTest​([PathMatcher2](../PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> pm,
		                                             java.util.function.BiFunction<T1,​T2,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### redirectToNoTrailingSlashIfPresent
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") redirectToNoTrailingSlashIfPresent​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,
		                                                java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		If the request path ends with a slash, redirect to the same uri without trailing slash in the path.
		 
		 '''Caveat''': [`pathSingleSlash(java.util.function.Supplier<akka.http.javadsl.server.Route>)`](#pathSingleSlash(java.util.function.Supplier)) directive will not match inside of this directive.
		 
		
		
		
		Parameters:
		`redirectionType` \- A status code from StatusCodes, which must be a redirection type.
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### redirectToTrailingSlashIfMissing
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") redirectToTrailingSlashIfMissing​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType,
		                                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.
		 
		 '''Caveat''': [`path(java.lang.String, java.util.function.Supplier<akka.http.javadsl.server.Route>)`](#path(java.lang.String,java.util.function.Supplier)) without trailing slash and [`pathEnd(java.util.function.Supplier<akka.http.javadsl.server.Route>)`](#pathEnd(java.util.function.Supplier)) directives will not match inside of this directive.
		 
		
		
		
		Parameters:
		`redirectionType` \- A status code from StatusCodes, which must be a redirection type.
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Code Examples

### Example 1: pathEndOrSingleSlash

```text
def route = {
   // redirect '/users/' to '/users', '/users/:userId/' to '/users/:userId'
   redirectToNoTrailingSlashIfPresent(Found) {
     pathPrefix("users") {
       concat(
         pathEnd {
           // user list ...
         },
         path(UUID) { userId =>
           // user profile ...
         }
       )
     }
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FutureDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/HostDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/MethodDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/MiscDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RangeDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/PathDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/PathDirectives.html)*