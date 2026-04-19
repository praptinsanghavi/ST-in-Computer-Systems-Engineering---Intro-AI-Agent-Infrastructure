---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:49:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ParameterDirectives.html
title: ParameterDirectives
---

# ParameterDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class ParameterDirectives

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
																- - akka.http.javadsl.server.directives.ParameterDirectives

- Direct Known Subclasses:
`[PathDirectives](PathDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class ParameterDirectives
extends [MiscDirectives](MiscDirectives.html "class in akka.http.javadsl.server.directives")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParameterDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameter](#parameter(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameter](#parameter(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterList](#parameterList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<java.util.List<T>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterList](#parameterList(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.List<java.lang.String>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterList](#parameterList(java.util.function.Function))​(java.util.function.Function<java.util.List<java.util.Map.Entry<java.lang.String,​java.lang.String>>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterMap](#parameterMap(java.util.function.Function))​(java.util.function.Function<java.util.Map<java.lang.String,​java.lang.String>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterMultiMap](#parameterMultiMap(java.util.function.Function))​(java.util.function.Function<java.util.Map<java.lang.String,​java.util.List<java.lang.String>>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterOptional](#parameterOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  java.lang.String name,  java.util.function.Function<java.util.Optional<T>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterOptional](#parameterOptional(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterOrDefault](#parameterOrDefault(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Function))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  T defaultValue,  java.lang.String name,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[parameterRequiredValue](#parameterRequiredValue(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Supplier))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,  T requiredValue,  java.lang.String name,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	
	
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
	
	
	
		- #### ParameterDirectives
		
		
		
		```
		public ParameterDirectives()
		```

	- ### Method Detail
	
	
	
		- #### parameter
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") parameter​(java.lang.String name,
		                       java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameter
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") parameter​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                           java.lang.String name,
		                           java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterList
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") parameterList​(java.lang.String name,
		                           java.util.function.Function<java.util.List<java.lang.String>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterList
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") parameterList​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                               java.lang.String name,
		                               java.util.function.Function<java.util.List<T>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterList
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") parameterList​(java.util.function.Function<java.util.List<java.util.Map.Entry<java.lang.String,​java.lang.String>>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterMap
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") parameterMap​(java.util.function.Function<java.util.Map<java.lang.String,​java.lang.String>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterMultiMap
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") parameterMultiMap​(java.util.function.Function<java.util.Map<java.lang.String,​java.util.List<java.lang.String>>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterOptional
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") parameterOptional​(java.lang.String name,
		                               java.util.function.Function<java.util.Optional<java.lang.String>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterOptional
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") parameterOptional​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                   java.lang.String name,
		                                   java.util.function.Function<java.util.Optional<T>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterOrDefault
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") parameterOrDefault​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                    T defaultValue,
		                                    java.lang.String name,
		                                    java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### parameterRequiredValue
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") parameterRequiredValue​([Unmarshaller](../../unmarshalling/Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​T> t,
		                                        T requiredValue,
		                                        java.lang.String name,
		                                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```

## Related Pages (Internal Links)

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
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/PathDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ParameterDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ParameterDirectives.html)*