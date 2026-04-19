---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/security/zero-trust.html
title: 'Implementing Zero Trust with Akka :: Akka Guide'
---

# Implementing Zero Trust with Akka :: Akka Guide

## Content

# Implementing Zero Trust with Akka

Below we describe some Akka features that support establishing a Zero Trust architecture:

1. [mTLS with Akka cluster remoting](#mtls-cluster-remoting)
2. [mTLS with Akka HTTP and Akka gRPC](#mtls-http-grpc)
3. [TLS identity based assertions](#tls-itendity-based-assertions)
4. [Rotating credentials](#rotating-credentials)
5. [Verifying resource access with Akka HTTP using JWTs](#jwt)

## Why zero trust?

As the systems we deploy get more and more complex, protecting them from being breached requires multiple layers of security. Attackers attempting to infiltrate these systems are becoming increasingly sophisticated.

Traditionally, systems have been protected at their perimeter, using firewalls to protect the network, and with internal systems having no means to be accessed from the outside world. Security in these setups relies on perimeter security. Inside the perimeter, trust is placed on various factors, including requests between services, the integrity of long\-lived credentials, and ensuring internal services access only necessary data.

In modern systems with complex cloud\-based Virtual Private Server (VPS) configurations comprised of hundreds or thousands of services, the traditional trust model falls short under scrutiny. Understanding the entire attack surface for the system can be challenging. Relying solely on perimeter security leaves the system vulnerable to various types of attacks, such as exploiting configuration errors or escalating attacks on specific system components.

To combat this, an alternative approach to security architecture, called Zero Trust, is necessary. Zero trust systems assume that perimeter security measures have been breached. Note that this does not mean they have no perimeter security. Rather, services in the system use additional layers of security to ensure that in the event that perimeter security is breached, the breach can be contained.

## What does zero trust look like?

In a nutshell, zero trust means verifying all communication, rather than trusting it, and only granting the least privilege necessary when any data or other resource is accessed. This is a broad reaching principle that plays out in many different ways in a zero trust architecture, but the most common applications of this approach include:

- Using mutual TLS (mTLS) authentication for all network communication.
- Validating the identity of connections.
- Rotating credentials often, and where possible, use credentials that expire when no longer needed.
- Applying the principle of least privilege to all data and API access, rather than blanket allowing access to data and APIs.
- Verifying access to resources at a fine\-grained level, rather than just blanket trusting all requests from an internal system.

### Using mTLS for all network communication

When making network connections within the perimeter network, it is important to encrypt and authenticate those connections both ways.

When using TLS, connections are encrypted, preventing eavesdroppers from accessing confidential data sent over the connection. Additionally, the server will supply a certificate to the client, allowing the client to verify that it is connecting to the server it expects to connect to. This ensures that an attacker cannot intercept a connection between the client and the server, and obtain confidential information from the client.

Mutual TLS (mTLS) adds an additional level of authentication, where the client authenticates with the server, so the connection has been authenticated in both directions. Using mTLS ensures the highest level of security on all network communication. Servers and clients require identity verification in both directions and maintain connection security through encryption.

Zero trust architectures leverage mTLS to ensure that the network is never trusted. A system that uses mTLS for all internal communication can have its perimeter firewall breached, and still be guaranteed that all network communication is secure.

### Validating the identity of connections

Having mTLS clients and servers authenticate in both directions, however, is not enough to ensure zero trust. In addition to authenticating in both directions, communication should be authorized in both directions. Once a request is authenticated the service receiving the request should validate that the principal that authenticated is one that is allowed to access it. This ensures that if a service in the system is compromised, the damage an attacker can do is limited to the capabilities of that service.

### Rotating credentials often

There is a temporal aspect to zero trust. Just because a service could be trusted yesterday, doesn’t mean it should still be trusted today. In that time, it may have been breached, and the credentials it’s using may be compromised.

Frequent rotation of credentials helps mitigate against breaches in time. It ensures that if a service is breached today, its credentials can’t still be used tomorrow. It also puts a time limit on how long things such as exports and backups that may inadvertently expose credentials can be a possible source of breach for.

### Principle of least privilege

In addition to validating the identity of connections, identities should only be allowed to access the resources they need access. This is done by inspecting the identity of the request, and validating it before each HTTP or gRPC call.

### Verifying resource access

When possible, services shouldn’t just trust that another service is allowed to perform requests on every resource in a blanket fashion. This is particularly the case for services that make requests on behalf of users. In such cases, protocols like OAuth and JWTs can grant access to resources at a very fine\-grained level. These protocols tie each request back to a specific user’s request for updating a resource.

## How does Akka help implementing zero trust?

### mTLS

There are multiple places in which Akka makes and receives connections to other services. Each one of these should have mTLS applied. We recommend using a product such as Kubernetes cert\-manager to provision certificates for mTLS. We also recommend using a different CA for each different type of communication. Kubernetes cert\-manager is capable of provisioning client and server certificates that are frequently rotated, for example, every 8 hours.

#### Akka cluster remoting

In a typical clustered Akka deployment, a single Akka service will consist of multiple nodes that form a cluster. These nodes need to establish connections with each other, in order to share and shard state between each other, and to track the overall status of the cluster.

Note that Akka cluster remoting communication only ever happens between nodes of the same service. It’s not suitable for communication between nodes of different services because Akka’s remoting protocols assume equal permissions among cluster members. Since only nodes of the same service connect to each other, after authentication and authorization using mTLS, no further permissions are needed as the nodes are peers within the service.

A single certificate should be provisioned per Akka cluster. Each node of a given Akka cluster should use the same certificate to authenticate with other nodes in the cluster. Akka can consume frequently rotated client certificates. It also verifies that only clients with matching Common Name or Subject Alternative Name can connect to it.

For more details on how to configure Akka cluster remoting to use certificates provisioned by Kubernetes cert\-manager, see [mTLS with rotated certificates in kubernetes](https://doc.akka.io/libraries/akka-core/current/remote-security.html#mtls-with-rotated-certificates-in-kubernetes) in the Akka documentation.

#### Akka HTTP and Akka gRPC

Akka HTTP and Akka gRPC can also be configured to use frequently rotated certificates for both client and server connections. Unlike Akka cluster remoting, HTTP and gRPC connections are expected to occur between nodes of different services. They also connect to and from services not implemented using Akka. For this reason, it is recommended a single CA is shared between many services, and that each service has its own client and server certificates provisioned.

By taking this approach, when Akka HTTP services make and receive requests, there is always an identity associated with those requests that can be validated. It ensures that an Akka HTTP service only trusts authorized connections. This applies even if perimeter network protections have been breached.

For an example of how to configure Akka HTTP and Akka gRPC to use client and server certificates, see [the Akka gRPC mTLS documentation](https://doc.akka.io/libraries/akka-grpc/current/mtls.html).

#### Databases

All of Akka’s database connectors support configuring a client certificate and server CAs for authenticating database connections using mTLS.

### Identity based assertions

Akka HTTP provides directives for extracting and running assertions on the Common Name and Subject Alternative Name in client certificates. This can be used when building APIs to ensure that only services that need to access a particular API call in Akka HTTP are able to access it.

This ensures that, even in the event that a service is breached, that breach is limited just to that service and what that service is capable of doing. The rest of the system is still secure.

To protect Akka HTTP services by making TLS identity based assertions, use [the `requireClientCertificateIdentity` directive in Akka HTTP](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html).

### Rotating credentials

Both of Akka cluster remoting’s and akka\-http’s TLS support are capable of polling for updated keys and certificates. When used in combination with Kubernetes cert\-manager’s certificate rotation, mounting the provisioned certificate secrets as volume mounts, this allows Akka to use frequently rotated certificates.

This ensures that if the certificate keys are leaked, there’s only a limited time window for exploitation. Once the certificates are rotated, the system becomes secure again.

For an example of how to configure this, the see [Akka HTTP certificate rotation documentation](https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html#rotating-certificates).

### Verifying resource access with Akka HTTP

Akka HTTP provides directives for extracting JSON Web Token (JWT) claims and making JWT assertions. This can be used to validate, on a per resource basis, that a given service is allowed to perform a given action on the resource. When used with JWTs provisioned through an OAuth flow or other means, it can validate whether a service is authorized to make a request on behalf of a user.

This ensures that even if a client accessing an Akka HTTP service is breached, it won’t be able to access anything beyond what the current user session has authorized.

To validate JWT claims in HTTP requests, use [the `jwt` directive in Akka HTTP](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/jwt.html).

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/remote-security.html
- https://doc.akka.io/libraries/akka-grpc/current/mtls.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/jwt.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html
- https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/guide/security/zero-trust.html](https://doc.akka.io/libraries/guide/security/zero-trust.html)*