---
description: 'declaration: package: akka.javasdk.testkit, class: TestKitSupport'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:23Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKitSupport.html
title: TestKitSupport
---

# TestKitSupport

> **Summary:** declaration: package: akka.javasdk.testkit, class: TestKitSupport

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class TestKitSupport

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[akka.javasdk.testkit.AsyncCallsSupport](AsyncCallsSupport.html "class in akka.javasdk.testkit")
akka.javasdk.testkit.TestKitSupport

---

@TestInstance(PER\_CLASS)
public abstract class TestKitSupport
extends [AsyncCallsSupport](AsyncCallsSupport.html "class in akka.javasdk.testkit")
This class provided the necessary infrastructure to run integration test for projects built with
 the Java SDK. Users should let their test classes extend this class.

 This class wires\-up a local service using the user's defined components.

 

Users can interact with their components via their public endpoint via an HTTP client or
 internally through the {{componentClient}}.

 

On test teardown, the service and the runtime will be stopped.

- ## Field Summary

Fields

Modifier and Type
Field
Description
`protected akka.javasdk.client.ComponentClient`
`[componentClient](#componentClient)`
 
`protected akka.javasdk.http.HttpClient`
`[httpClient](#httpClient)`

A http client for interacting with the service under test, the client will not be authenticated
 and will appear to the service as a request with the internet principal.

`protected [TelemetryReader](TelemetryReader.html "class in akka.javasdk.testkit")`
`[telemetryReader](#telemetryReader)`
 
`protected [TestKit](TestKit.html "class in akka.javasdk.testkit")`
`[testKit](#testKit)`
 
`protected akka.javasdk.timer.TimerScheduler`
`[timerScheduler](#timerScheduler)`
- ## Constructor Summary

Constructors

Constructor
Description
`[TestKitSupport](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`void`
`[afterAll](#afterAll())()`
 
`void`
`[beforeAll](#beforeAll())()`
 
`<T> T`
`[getDependency](#getDependency(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> clazz)`

Lookup a specific object as provided by the service dependency provider

`<T extends akka.grpc.javadsl.AkkaGrpcClient>  
T`
`[getGrpcEndpointClient](#getGrpcEndpointClient(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> grpcClientClass)`

Get a gRPC client for an endpoint provided by this service.

`<T extends akka.grpc.javadsl.AkkaGrpcClient>  
T`
`[getGrpcEndpointClient](#getGrpcEndpointClient(java.lang.Class,akka.javasdk.Principal))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> grpcClientClass,
 akka.javasdk.Principal requestPrincipal)`

Get a gRPC client for an endpoint provided by this service but specify the client principal for
 the ACLs.

`akka.javasdk.Sanitizer`
`[getSanitizer](#getSanitizer())()`
 
`protected [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit")`
`[testKitSettings](#testKitSettings())()`

Override this to use custom settings for an integration test

### Methods inherited from class akka.javasdk.testkit.[AsyncCallsSupport](AsyncCallsSupport.html "class in akka.javasdk.testkit")

`[await](AsyncCallsSupport.html#await(java.util.concurrent.CompletionStage)), [await](AsyncCallsSupport.html#await(java.util.concurrent.CompletionStage,java.time.Duration)), [failed](AsyncCallsSupport.html#failed(java.util.concurrent.CompletionStage))`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Field Details

	- ### testKit
	
	
	protected [TestKit](TestKit.html "class in akka.javasdk.testkit") testKit
	- ### componentClient
	
	
	protected akka.javasdk.client.ComponentClient componentClient
	- ### timerScheduler
	
	
	protected akka.javasdk.timer.TimerScheduler timerScheduler
	- ### httpClient
	
	
	protected akka.javasdk.http.HttpClient httpClient
	A http client for interacting with the service under test, the client will not be authenticated
	 and will appear to the service as a request with the internet principal.
	- ### telemetryReader
	
	
	protected [TelemetryReader](TelemetryReader.html "class in akka.javasdk.testkit") telemetryReader
- ## Constructor Details

	- ### TestKitSupport
	
	
	public TestKitSupport()
- ## Method Details

	- ### testKitSettings
	
	
	protected [TestKit.Settings](TestKit.Settings.html "class in akka.javasdk.testkit") testKitSettings()
	Override this to use custom settings for an integration test
	- ### beforeAll
	
	
	@BeforeAll
	public void beforeAll()
	- ### afterAll
	
	
	@AfterAll
	public void afterAll()
	- ### getDependency
	
	
	public \<T\> T getDependency([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> clazz)
	Lookup a specific object as provided by the service dependency provider
	- ### getGrpcEndpointClient
	
	
	public \<T extends akka.grpc.javadsl.AkkaGrpcClient\>
	T getGrpcEndpointClient([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> grpcClientClass)
	Get a gRPC client for an endpoint provided by this service. Requests will appear as coming from
	 this service itself from an ACL perspective.
	
	Parameters:
	`grpcClientClass` \- The generated Akka gRPC client interface for a gRPC endpoint in this
	 service
	- ### getGrpcEndpointClient
	
	
	public \<T extends akka.grpc.javadsl.AkkaGrpcClient\>
	T getGrpcEndpointClient([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> grpcClientClass,
	 akka.javasdk.Principal requestPrincipal)
	Get a gRPC client for an endpoint provided by this service but specify the client principal for
	 the ACLs.
	
	Parameters:
	`grpcClientClass` \- The generated Akka gRPC client interface for a gRPC endpoint in this
	 service
	`requestPrincipal` \- A principal that any request from the returned service will have when
	 requests are handled in the endpoint.
	- ### getSanitizer
	
	
	public akka.javasdk.Sanitizer getSanitizer()
	
	Returns:
	The configured sanitizer for the service, for test assertions that the expected
	 anonymization is applied. Will always return an instance, if no sanitization rules are
	 configured, the returned sanitizer will return all text fed to it as is.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/AsyncCallsSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TelemetryReader.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.Settings.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKitSupport.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKitSupport.html)*