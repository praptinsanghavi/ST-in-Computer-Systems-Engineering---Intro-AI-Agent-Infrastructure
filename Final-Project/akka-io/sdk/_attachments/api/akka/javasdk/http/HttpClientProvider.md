---
description: 'declaration: package: akka.javasdk.http, interface: HttpClientProvider'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:18Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
title: HttpClientProvider
---

# HttpClientProvider

> **Summary:** declaration: package: akka.javasdk.http, interface: HttpClientProvider

## Content

Package [akka.javasdk.http](package-summary.html)
# Interface HttpClientProvider

---

@DoNotInherit
public interface HttpClientProvider
Provider for HTTP clients to interact with other services over HTTP.

 HttpClientProvider enables HTTP endpoints and other components to make outbound HTTP calls to
 other services, both within the same Akka project and to external services on the internet.

 

**Service\-to\-Service Communication:** When calling other Akka services deployed
 in the same project, use the service name without protocol or domain. The runtime handles
 routing, encryption, and authentication automatically.

 

**External Service Communication:** For external services, provide full URLs with
 `http://` or `https://` protocols. These calls go over the public internet and
 require appropriate authentication.

 

**Usage in Endpoints:** Inject HttpClientProvider into endpoint constructors to
 access HTTP client functionality. The provider creates configured HTTP clients for specific
 services or URLs.

 

**Security:** Service\-to\-service calls within the same project are automatically
 secured with mutual TLS and service identity verification. External calls require manual
 authentication setup.

 

Not for user extension, instances provided by the SDK through dependency injection.

- ## Method Summary

Modifier and Type
Method
Description
`[HttpClient](HttpClient.html "interface in akka.javasdk.http")`
`[httpClientFor](#httpClientFor(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serviceName)`

Returns a [`HttpClient`](HttpClient.html "interface in akka.javasdk.http") to interact with the specified HTTP service.

- ## Method Details

	- ### httpClientFor
	
	
	[HttpClient](HttpClient.html "interface in akka.javasdk.http") httpClientFor([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serviceName)
	Returns a [`HttpClient`](HttpClient.html "interface in akka.javasdk.http") to interact with the specified HTTP service.
	
	 If the serviceName is a service name without protocol or domain the client will be
	 configured to connect to another service deployed with that name on the same Akka project. The
	 runtime will take care of routing requests to the service and keeping the data safe by
	 encrypting the connection between services and identifying the client as coming from this
	 service.
	
	 
	
	If it is a full dns name prefixed with "http://" or "https://" it will connect to services
	 available on the public internet.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html)*