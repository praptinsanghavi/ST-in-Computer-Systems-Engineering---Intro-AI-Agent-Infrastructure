---
description: 'declaration: package: akka.javasdk, interface: ServiceSetup'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:54Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html
title: ServiceSetup
---

# ServiceSetup

> **Summary:** declaration: package: akka.javasdk, interface: ServiceSetup

## Content

Package [akka.javasdk](package-summary.html)
# Interface ServiceSetup

---

public interface ServiceSetup
Implement this on a single class per deployable service annotated with {[`Setup`](annotations/Setup.html "annotation interface in akka.javasdk.annotations")} and
 override one or more of the default methods to provide objects for dependency injection or act on
 service lifecycle events.

 Concrete classes can accept the following types to the constructor:

 

- [`ComponentClient`](client/ComponentClient.html "interface in akka.javasdk.client")
- [`HttpClientProvider`](http/HttpClientProvider.html "interface in akka.javasdk.http")
- [`TimerScheduler`](timer/TimerScheduler.html "interface in akka.javasdk.timer")
- `Materializer`
- `Config`
- [`AgentRegistry`](agent/AgentRegistry.html "interface in akka.javasdk.agent")
- [`Sanitizer`](Sanitizer.html "interface in akka.javasdk")

- ## Method Summary

Modifier and Type
Method
Description
`default [DependencyProvider](DependencyProvider.html "interface in akka.javasdk")`
`[createDependencyProvider](#createDependencyProvider())()`

Invoked once before the service is started, to create a dependency provider.

`default [Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<?>>`
`[disabledComponents](#disabledComponents())()`

Provides a set of components that should be disabled from running.

`default void`
`[onStartup](#onStartup())()`

The on startup hook is called every time a service instance boots up.

- ## Method Details

	- ### onStartup
	
	
	default void onStartup()
	The on startup hook is called every time a service instance boots up. This can happen for very
	 different reasons: restarting / redeploying the service, scaling up to more instances or even
	 without any user\-driven action (e.g.: Runtime versions being rolled out, infrastructure\-related
	 incidents, etc.). Therefore, one should carefully consider how to use this hook and its
	 implementation.
	
	 This hook is called after [`createDependencyProvider()`](#createDependencyProvider()).
	- ### createDependencyProvider
	
	
	default [DependencyProvider](DependencyProvider.html "interface in akka.javasdk") createDependencyProvider()
	Invoked once before the service is started, to create a dependency provider. It is not possible
	 to interact with components in this method.
	
	 This hook is called before [`onStartup()`](#onStartup()).
	- ### disabledComponents
	
	
	default [Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<?\>\> disabledComponents()
	Provides a set of components that should be disabled from running.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentRegistry.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Setup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html)*