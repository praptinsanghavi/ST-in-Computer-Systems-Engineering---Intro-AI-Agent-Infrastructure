---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:19Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/access-control.html
title: 'Access Control Lists (ACLs) :: Akka Documentation'
---

# Access Control Lists (ACLs) :: Akka Documentation

## Content

# Access Control Lists (ACLs)

The simplest access control that the Akka offers is through Access Control Lists (ACLs). ACLs allow you to
specify lists of what can access your services, at multiple granularity. For example, you can configure a method that
initiates a payment on a payment service to only accept requests from the shopping cart service. You can also control
whether services or methods can be invoked from the Internet.

For a conceptual introduction, see [Access control lists](../concepts/acls.html) in the **Concepts** section.

## Principals

A principal in Akka is an abstract concept that represents anything that can make or be the source of a request.
Principals that are currently supported by Akka include other services, and the internet. Services are identified
by the service name chosen when deployed. Akka uses mutual TLS (mTLS) to associate requests with one or more principals.

Note that requests that have the internet principal are requests that Akka has identified as coming through the Akka
ingress route. This is identified by mTLS, however it does not imply that mTLS has been
used to connect to the ingress from the client in the internet. These are separate hops. To configure mTLS from
internet clients, see [TLS certificates](../operations/tls-certificates.html).

## Configuring ACLs

Akka SDK ACLs consist of two lists of principal matchers. One to allow to invoke a method, and the other to deny to
invoke a method. For a request to be allowed, at least one principal associated with a request must be matched by at
least one principal matcher in the allow list, and no principals associated with the request may match any principal
matchers in the deny list.

An ACL can be configured at the class level, or at the method level. If an ACL is configured at the class level it
applies to all methods in the class. Unless it’s overridden by an ACL added at method level.

Here is an example of an ACL added at the class level on an HTTP Endpoint:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = @Acl.Matcher(service = "service-a"))
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
}
```

The above ACL only allows incoming traffic from `service-a`. Meaning that only a service named `service-a` deployed on that same project will be able to make calls to this endpoint. This rule is applied to all methods in this HTTP Endpoint.

This rule can be overridden by an ACL on a method level. Here is an example ACL on a method that overrides the class level ACL:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = @Acl.Matcher(service = "service-a"))
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
  @Post
  @Acl(allow = @Acl.Matcher(service = "service-b"))
  public Done createUser(CreateUser create) {
    //... create user logic
    return Done.getInstance();
  }

}
```

Note that an ACL defined on a method completely overrides an ACL defined at class level. It does not add to
it.

You can combine `allow` and `deny` rules. In the following example, access is open to all other services, except
`service-b`.

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = @Acl.Matcher(service = "*"), deny = @Acl.Matcher(service = "service-b"))
```

To allow all traffic:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
```

To allow only traffic from the internet:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.INTERNET))
```

To allow traffic from `service-a` and `service-b`:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = { @Acl.Matcher(service = "service-a"), @Acl.Matcher(service = "service-b") })
```

To block all traffic, an ACL with no allows can be configured:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = {})
```

## Default ACL

If no ACLs are defined at all, Akka will deny requests from both other services and the internet to all components of
an Akka service.

|  | The endpoint in the [getting started sample](../getting-started/author-your-first-service.html) has a very permissive ACL that opens access to public internet requests. This allows for easy try out and testing. For production usage, make sure to add appropriate ACL restrictions. |
| --- | --- |

### Customizing the deny code

When a request is denied, by default a 403 `Forbbiden`, is sent. The code that is returned when a request is denied can be customised using the `deny_code` property.

For example, to make Akka reply with 404, `Not Found`:

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Acl(allow = @Acl.Matcher(service = "service-a"),
     denyCode = 404)
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
}
```

Similar to allow and deny rules, deny codes defined at class level are applied to all methods in the component, but
can be overwritten on a per method base.

## Backoffice and self invocations

Invocations of methods from the same service, or from via the backoffice proxy that is available to developers, are always
permitted, regardless of what ACLs are defined on them.

|  | The `akka service proxy` command creates an HTTP proxy that forwards all traffic to a service. This allows you to interact with the service as if it was running locally. |
| --- | --- |

## Programmatically accessing principals

The current principal associated with a request can be accessed through the `RequestContext`.

|  | Endpoints are stateless and each request is served by a new Endpoint instance. Therefore, the `RequestContext` is always a new instance and is associated with the request currently being handled. |
| --- | --- |

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
    var principals = requestContext().getPrincipals();
}
```

| **1** | Let your endpoint extend [AbstractHttpEndpoint](_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html) to get access to the request specific `RequestContext` through `requestContext()`. |
| --- | --- |

You can access the current Principals through method `RequestContext.getPrincipals()`

If the request came from another service, the `Principals.getLocalService()` method will return a non\-empty
`Optional` containing the name of the service that made the request. Akka guarantees that this field will only be
present from an authenticated principal, it can’t be spoofed.

Further, you can use `Principals.isInternet`, `Principals.isSelf` or `Principals.isBackoffice` to verify if the request
was made from the Internet, from the current service or from the Backoffice API respectively. Backoffice requests are
those made using the `akka services proxy` command, they are authenticated and authorized to ensure only developers
of your project can make them.

[UserEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/UserEndpoint.java)

```
@Get
public String checkingPrincipals() {
  var principals = requestContext().getPrincipals();
  if (principals.isInternet()) {
    return "accessed from the Internet";
  } else if (principals.isSelf()) {
    return "accessed from Self (internal call from current service)";
  } else if (principals.isBackoffice()) {
    return "accessed from Backoffice API";
  } else {
    return "accessed from another service: " + principals.getLocalService();
  }
}
```

## Local development with ACLs

When running locally, ACLs are enabled by default. You can disable the local ACL checks by configuring the following settings in the `application.conf` file:

src/main/resources/application.conf

```
akka.javasdk.dev-mode.acl.enabled = false
```

Alternatively, start with:

```
mvn compile exec:java -Dakka.javasdk.dev-mode.acl.enabled=false
```

Note that the setting above does not apply to integration tests. See below for how to disable ACLs in integration tests.

### Service identification

If running multiple services in local development, you may want to run with ACLs enabled to verify that they work for
cross\-service communication.

Let’s consider the existence of two distinct services called `shopping-cart` and `payment`.

The payment service only accepts request from the shopping cart service and has an ACL defined as
such:

[PaymentEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/acl/PaymentEndpoint.java)

```
@Acl(allow = @Acl.Matcher(service = "shopping-cart"))
@HttpEndpoint("/payments")
public class PaymentEndpoint {

  //...
}
```

During development, if you want to make calls to the payment service from inside the shopping cart service, then the
shopping cart service needs to identify itself as `shopping-cart` (as per PaymentEndpoint’s ACL). When running
locally, the services identify themselves with the name used in the `artifactId` tag in its `pom.xml` file. This value can be
overwritten in the project’s `application.conf` file by defining a maven property named `akka.javasdk.dev-mode
.service-name`.

The `application.conf` needs to be located in the project’s main resources directory, i.e.: `src/main/resources`.

src/main/resources/application.conf

```
akka.javasdk.dev-mode.service-name=shopping-cart
```

|  | This property is only applicable when running the services on your local machine. When deployed, the service name is the one used to create the service and should also match the ACL definition, i.e.: `shopping-cart`. |
| --- | --- |

If you want to simulate calls to the payment endpoint and pretend that the calls are
coming from the shopping cart service, you can add the header `impersonate-service` to your requests, for example:

```
curl -i localhost:9000/payments/{cart-id}/check-transaction \
  --header "impersonate-service: shopping-cart"
```

Note that in local development, the services don’t actually authenticate with each other, they only pass their identity in a header. It is assumed in local development that a client can be trusted to set that header correctly.

### Running unit tests

In the generated unit test testkits, the ACLs are ignored.

### Running integration tests

ACLs are enabled by default when running integration tests.

ACL rules will be applied whenever a call is made using testkit’s `HttpClient`. Those calls are interpreted as
originating from the internet. You can disable the ACL checks by overriding the `testKitSettings()` method.

[UserEndpointIntegrationTest.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/test/java/com/example/acl/UserEndpointIntegrationTest.java)

```
public class UserEndpointIntegrationTest extends TestKitSupport {

  @Override
  protected TestKit.Settings testKitSettings() {
    return super.testKitSettings().withAclDisabled();
  }
}
```

Calls made through the `ComponentClient` are internal to the service and therefore no ACL rule is applied.

## Code Examples

### Example 1: Configuring ACLs

```java
@Acl(allow = @Acl.Matcher(service = "service-a"))
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
}
```

### Example 2: Configuring ACLs

```java
@Acl(allow = @Acl.Matcher(service = "service-a"))
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
  @Post
  @Acl(allow = @Acl.Matcher(service = "service-b"))
  public Done createUser(CreateUser create) {
    //... create user logic
    return Done.getInstance();
  }

}
```

### Example 3: Configuring ACLs

```java
@Acl(allow = @Acl.Matcher(service = "*"), deny = @Acl.Matcher(service = "service-b"))
```

### Example 4: Configuring ACLs

```java
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
```

### Example 5: Configuring ACLs

```java
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.INTERNET))
```

### Example 6: Configuring ACLs

```java
@Acl(allow = { @Acl.Matcher(service = "service-a"), @Acl.Matcher(service = "service-b") })
```

### Example 7: Configuring ACLs

```java
@Acl(allow = {})
```

### Example 8: Customizing the deny code

```java
@Acl(allow = @Acl.Matcher(service = "service-a"),
     denyCode = 404)
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
}
```

### Example 9: Programmatically accessing principals

```java
@HttpEndpoint("/user")
public class UserEndpoint extends AbstractHttpEndpoint { (1)

  // ...
    var principals = requestContext().getPrincipals();
}
```

### Example 10: Programmatically accessing principals

```java
@Get
public String checkingPrincipals() {
  var principals = requestContext().getPrincipals();
  if (principals.isInternet()) {
    return "accessed from the Internet";
  } else if (principals.isSelf()) {
    return "accessed from Self (internal call from current service)";
  } else if (principals.isBackoffice()) {
    return "accessed from Backoffice API";
  } else {
    return "accessed from another service: " + principals.getLocalService();
  }
}
```

### Example 11: Local development with ACLs

```conf
akka.javasdk.dev-mode.acl.enabled = false
```

### Example 12: Local development with ACLs

```shell
mvn compile exec:java -Dakka.javasdk.dev-mode.acl.enabled=false
```

### Example 13: Service identification

```java
@Acl(allow = @Acl.Matcher(service = "shopping-cart"))
@HttpEndpoint("/payments")
public class PaymentEndpoint {

  //...
}
```

### Example 14: Service identification

```conf
akka.javasdk.dev-mode.service-name=shopping-cart
```

### Example 15: Service identification

```bash
curl -i localhost:9000/payments/{cart-id}/check-transaction \
  --header "impersonate-service: shopping-cart"
```

### Example 16: Running integration tests

```java
public class UserEndpointIntegrationTest extends TestKitSupport {

  @Override
  protected TestKit.Settings testKitSettings() {
    return super.testKitSettings().withAclDisabled();
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/concepts/acls.html
- https://doc.akka.io/getting-started/author-your-first-service.html
- https://doc.akka.io/operations/tls-certificates.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html

---
*Source: [https://doc.akka.io/sdk/access-control.html](https://doc.akka.io/sdk/access-control.html)*