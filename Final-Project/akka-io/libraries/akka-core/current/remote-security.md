---
description: Details about security aspects of the remoting module for Akka Cluster.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/remote-security.html
title: Remote Security • Akka core
---

# Remote Security • Akka core

> **Summary:** Details about security aspects of the remoting module for Akka Cluster.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Remote Security

An [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") should not be exposed via [Akka Cluster](typed/cluster.html) or [Akka Remote](remoting-artery.html) over plain Aeron/UDP or TCP to an untrusted network (e.g. Internet). It should be protected by network security, such as a firewall. If that is not considered as enough protection [TLS with mutual authentication](remote-security.html#remote-tls) should be enabled.

Best practice is that Akka remoting nodes should only be accessible from the adjacent network. Note that if TLS is enabled with mutual authentication there is still a risk that an attacker can gain access to a valid certificate by compromising any node with certificates issued by the same internal PKI tree.

By default, [Java serialization](serialization.html#java-serialization) is disabled in Akka. That is also security best\-practice because of its multiple [known attack surfaces](https://community.microfocus.com/cyberres/fortify/f/fortify-discussions/317555/the-perils-of-java-deserialization).

## Configuring SSL/TLS for Akka Remoting

In addition to what is described here, see also [mTLS with rotated certificates in Kubernetes](remote-security.html#mtls-with-rotated-certificates-in-kubernetes).

SSL can be used as the remote transport by using the `tls-tcp` transport:

```
akka.remote.artery {
  transport = tls-tcp
}

```

Next the actual SSL/TLS parameters have to be configured:

```
akka.remote.artery {
  transport = tls-tcp

  ssl.config-ssl-engine {
    key-store = "/example/path/to/mykeystore.jks"
    trust-store = "/example/path/to/mytruststore.jks"

    key-store-password = ${SSL_KEY_STORE_PASSWORD}
    key-password = ${SSL_KEY_PASSWORD}
    trust-store-password = ${SSL_TRUST_STORE_PASSWORD}

    protocol = "TLSv1.2"

    enabled-algorithms = [TLS_DHE_RSA_WITH_AES_128_GCM_SHA256]
  }
}

```

Always use [substitution from environment variables](https://github.com/lightbend/config#optional-system-or-env-variable-overrides) for passwords. Don’t define real passwords in config files.

According to [RFC 7525](https://www.rfc-editor.org/rfc/rfc7525.html) the recommended algorithms to use with TLS 1\.2 (as of writing this document) are:

- TLS\_DHE\_RSA\_WITH\_AES\_128\_GCM\_SHA256
- TLS\_ECDHE\_RSA\_WITH\_AES\_128\_GCM\_SHA256
- TLS\_DHE\_RSA\_WITH\_AES\_256\_GCM\_SHA384
- TLS\_ECDHE\_RSA\_WITH\_AES\_256\_GCM\_SHA384

You should always check the latest information about security and algorithm recommendations though before you configure your system.

Creating and working with keystores and certificates is well documented in the [Generating X.509 Certificates](https://lightbend.github.io/ssl-config/CertificateGeneration.html#using-keytool) section of Lightbend’s SSL\-Config library.

Since an Akka remoting is inherently [peer\-to\-peer](general/remoting.html#symmetric-communication) both the key\-store as well as trust\-store need to be configured on each remoting node participating in the cluster.

The official [Java Secure Socket Extension documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/security/jsse/JSSERefGuide.html) as well as the [Oracle documentation on creating KeyStore and TrustStores](https://docs.oracle.com/cd/E19509-01/820-3503/6nf1il6er/index.html) are both great resources to research when setting up security on the JVM. Please consult those resources when troubleshooting and configuring SSL.

Mutual authentication between TLS peers is enabled by default. Mutual authentication means that the passive side (the TLS server side) of a connection will also request and verify a certificate from the connecting peer. Without this mode only the client side is requesting and verifying certificates. While Akka is a peer\-to\-peer technology, each connection between nodes starts out from one side (the “client”) towards the other (the “server”).

Note that if TLS is enabled with mutual authentication there is still a risk that an attacker can gain access to a valid certificate by compromising any node with certificates issued by the same internal PKI tree.

It’s recommended that you enable hostname verification with `akka.remote.artery.ssl.config-ssl-engine.hostname-verification=on`. When enabled it will verify that the destination hostname matches the hostname in the peer’s certificate.

In deployments where hostnames are dynamic and not known up front it can make sense to leave the hostname verification off.

You have a few choices how to set up certificates and hostname verification:

- Have a single set of keys and a single certificate for all nodes and *disable* hostname checking
	- The single set of keys and the single certificate is distributed to all nodes. The certificate can be self\-signed as it is distributed both as a certificate for authentication but also as the trusted certificate.
	- If the keys/certificate are lost, someone else can connect to your cluster.
	- Adding nodes to the cluster is simple as the key material can be deployed / distributed to the new node.
- Have a single set of keys and a single certificate for all nodes that contains all of the host names and *enable* hostname checking.
	- This means that only the hosts mentioned in the certificate can connect to the cluster.
	- It cannot be checked, though, if the node you talk to is actually the node it is supposed to be (or if it is one of the other nodes). This seems like a minor restriction as you’ll have to trust all cluster nodes the same in an Akka cluster anyway.
	- The certificate can be self\-signed in which case the same single certificate is distributed and trusted on all nodes (but see the next bullet)
	- Adding a new node means that its host name needs to conform to the trusted host names in the certificate. That either means to foresee new hosts, use a wildcard certificate, or use a full CA in the first place, so you can later issue more certificates if more nodes are to be added (but then you already get into the territory of the next solution).
	- If a certificate is stolen, it can only be used to connect to the cluster from a node reachable via a hostname that is trusted in the certificate. It would require tampering with DNS to allow other nodes to get access to the cluster (however, tampering DNS might be easier in an internal setting than on internet scale).
- Have a CA and then keys/certificates, one for each node, and *enable* host name checking.
	- Basically like internet HTTPS but that you only trust the internal CA and then issue certificates for each new node.
	- Needs a PKI, the CA certificate is trusted on all nodes, the individual certificates are used for authentication.
	- Only the CA certificate and the key/certificate for a node is distributed.
	- If keys/certificates are stolen, only the same node can access the cluster (unless DNS is tampered with as well). You can revoke single certificates.

See also a description of the settings in the [Remote Configuration](remoting-artery.html#remote-configuration-artery) section.

Note
When using SHA1PRNG on Linux it’s recommended specify `-Djava.security.egd=file:/dev/urandom` as argument to the JVM to prevent blocking. It is NOT as secure because it reuses the seed.

## mTLS with rotated certificates in Kubernetes

Akka remoting’s has support for using mTLS certificates that are frequently rotated. This support is designed to work with cert\-manager and other Kubernetes based secret providers with a minimum of configuration. This feature is important for secure Akka deployments to prevent malicious hosts from joining the Akka Cluster or eavesdropping on your Akka Cluster communication, and therefore you need to use mTLS to secure the communication.

Service mesh
Encryption and authentication via a service mesh is not an option for Akka Cluster as described in [Service mesh](general/remoting.html#service-mesh). 

Provisioning of the certificates needed by Akka are using [cert\-manager](https://cert-manager.io/). The Kubernetes cluster should have a standard [cert\-manager installation](https://cert-manager.io/docs/installation/).

### Understanding the certificates

First off, a few concepts: cert\-manager has a concept of `Certificates` and `Issuers`. A Certificate is a Custom Resource Definition (CRD) that you deploy that cert\-manager will reconcile into a Kubernetes `Secret` containing a TLS certificate. The `Certificate` references an `Issuer`, and the `Issuer` describes how Certificates that reference it should be issued.

In order to support frequently rotated certificates, Akka can’t just use a self signed certificate, since self signed certificates need to be the same at both ends to authenticate each other properly, and during the time when the certificate is being rotated, two different Akka nodes may have different certificates. Instead, Akka needs certificates issued by a certificate authority (CA). The CA verifies whether a certificate should be trusted or not, so during rotation, both the old and the new certificate can work together, because both are signed by the same CA. So, when we issue our certificates, we’ll use cert\-managers CA `Issuer` type.

The CA Issuer itself needs a certificate to do its signing, and this certificate we’ll also provision using cert\-manager. That certificate we’re not going to rotate \- its private key never gets shared with anything outside of cert\-manager, and so rotating it is not as necessary. Because of this, it will use a self signed certificate, and provisioning that certificate can be done by using a cert\-manager self signed `Issuer` type.

So, in total, we’re going to have two issuers, a self signed issuer that issues certificates for the CA issuer, and then that CA issuer will issue certificates that are frequently rotated for our Akka service to use. The self signed issuer, certificate, and CA issuer can be reused across different Akka deployments.

### Kubernetes resources

First we deploy the self signed issuer:

```
apiVersion: cert-manager.io/v1
kind: ClusterIssuer
metadata:
  name: self-signed-issuer
spec:
  selfSigned: {}

```

We’re creating this for the whole cluster, self signed issuers don’t have any state or configuration, there’s no reason to have more than one for your entire cluster.

Next we create a self signed certificate for our CA issuer to use that references this issuer:

```
apiVersion: cert-manager.io/v1
kind: Certificate
metadata:
  name: akka-tls-ca-certificate
  namespace: default
spec:
  issuerRef:
    name: self-signed-issuer
    kind: ClusterIssuer
  secretName: akka-tls-ca-certificate
  commonName: default.akka.cluster.local
  # 100 years
  duration: 876000h
  # 99 years
  renewBefore: 867240h
  isCA: true
  privateKey:
    rotationPolicy: Always

```

We’ve created this in the default namespace, which will be the same namespace that our Akka service is deployed to. If you’re using a different namespace, you’ll need to update accordingly.

The `commonName` isn’t very important, it’s not actually used anywhere, though may be useful for debugging purposes if you’re ever looking into why a particular certificate isn’t trusted by a service. We use a naming convention for common names and DNS names that follows the pattern `<service-name>.<namespace>.akka.cluster.local`. The CA uses the same convention without the service name. This convention doesn’t need to be followed, but it makes it easy to reason about the purpose of any given certificate.

Now we create the CA issuer:

```
apiVersion: cert-manager.io/v1
kind: Issuer
metadata:
  name: akka-tls-ca-issuer
  namespace: default
spec:
  ca:
    secretName: akka-tls-ca-certificate

```

This uses the secret that we configured to be provisioned in the certificate above. Finally, we provision the certificate that our Akka service is going to use \- we’re assuming that the name of the service in this case is `my-service`:

```
apiVersion: cert-manager.io/v1
kind: Certificate
metadata:
  name: my-service-akka-tls-certificate
  namespace: default
spec:
  issuerRef:
    name: akka-tls-ca-issuer
  secretName: my-service-akka-tls-certificate
  dnsNames:
  - my-service.default.akka.cluster.local
  duration: 24h
  renewBefore: 16h
  privateKey:
    rotationPolicy: Always

```

The actual `dnsName` configured isn’t important, since Akka cluster does not actually use these names for looking up the service, as long as it’s unique to the service within the issuer. Akka’s mTLS support will verify that the DNS name supplied by an incoming connection matches the DNS name supplied in its own secret, and reject it otherwise. Again, we’re using the naming convention for the `dnsName` mentioned above.

This certificate is configured to last for 24 hours, and rotate every 16 hours.

If you have more Akka services that you wish to deploy in the same namespace, you can reuse the same CA Issuer, you only need to deploy an additional Certificate for each service.

### Enable TLS with RotatingKeysSSLEngineProvider

Add the following Akka configuration:

```
akka.remote.artery {
  transport = tls-tcp
  ssl.ssl-engine-provider = "akka.remote.artery.tcp.ssl.RotatingKeysSSLEngineProvider"
}

```

This instructs Akka to use TLS, with the `RotatingKeysSSLEngineProvider`, an SSL engine provider that is designed to pick up Kubernetes TLS secrets, and poll the file system for when they get rotated. It also applies authorization by matching the incoming DNS name with the DNS name of its own certificate.

### Configuring the Kubernetes deployment

In the Kubernetes `Deployment` for the Akka application you need to mount the certificate at the path `/var/run/secrets/akka-tls/rotating-keys-engine`. This is the default path that the `RotatingKeysSSLEngineProvider` uses to pick up its certificates. So, add the following volume to your pod:

```
      volumes:
      - name: akka-tls
        secret:
          secretName: my-service-akka-tls-certificate

```

And then you can mount that in your container:

```
        volumeMounts:
        - name: akka-tls
          mountPath: /var/run/secrets/akka-tls/rotating-keys-engine

```

The complete deployment YAML when adding those to the Deployment Spec from [Deploying Akka Cluster to Kubernetes](https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/preparing-for-production.html#deployment-spec):

```
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: appka
  name: appka
  namespace: appka-1
spec:
  replicas: 2
  selector:
    matchLabels:
      app: appka
  template:
    metadata:
      labels:
        app: appka
    spec:
      containers:
      - name: appka
        image: akka-sample-cluster-kubernetes-scala:latest
        readinessProbe:
          httpGet:
            path: /ready
            port: management
        livenessProbe:
          httpGet:
            path: /alive
            port: management
        ports:
        - name: management
          containerPort: 8558
          protocol: TCP
        - name: http
          containerPort: 8080
          protocol: TCP
        resources:
          limits:
            memory: 1024Mi
          requests:
            cpu: 2
            memory: 1024Mi
        volumeMounts:
        - name: akka-tls
          mountPath: /var/run/secrets/akka-tls/rotating-keys-engine
      volumes:
      - name: akka-tls
        secret:
          secretName: my-service-akka-tls-certificate

```

## Untrusted Mode

As soon as an actor system can connect to another remotely, it may in principle send any possible message to any actor contained within that remote system. One example may be sending a [`PoisonPill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill")[`PoisonPill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill") to the system guardian, shutting that system down. This is not always desired, and it can be disabled with the following setting:

```
akka.remote.artery.untrusted-mode = on

```

This disallows sending of system messages (actor life\-cycle commands, DeathWatch, etc.) and any message extending [`PossiblyHarmful`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PossiblyHarmful.html "akka.actor.PossiblyHarmful")[`PossiblyHarmful`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html "akka.actor.PossiblyHarmful") to the system on which this flag is set. Should a client send them nonetheless they are dropped and logged (at DEBUG level in order to reduce the possibilities for a denial of service attack). `PossiblyHarmful` covers the predefined messages like [`PoisonPill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill")[`PoisonPill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill") and [`Kill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Kill.html "akka.actor.Kill")[`Kill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill.html "akka.actor.Kill"), but it can also be added as a marker trait to user\-defined messages.

Warning
Untrusted mode does not give full protection against attacks by itself. It makes it slightly harder to perform malicious or unintended actions but it should be noted that [Java serialization](serialization.html#java-serialization) should still not be enabled. Additional protection can be achieved when running in an untrusted network by network security (e.g. firewalls) and/or enabling [TLS with mutual authentication](remote-security.html#remote-tls).

Messages sent with actor selection are by default discarded in untrusted mode, but permission to receive actor selection messages can be granted to specific actors defined in configuration:

```
akka.remote.artery.trusted-selection-paths = ["/user/receptionist", "/user/namingService"]

```

The actual message must still not be of type `PossiblyHarmful`.

In summary, the following operations are ignored by a system configured in untrusted mode when incoming via the remoting layer:

- remote deployment (which also means no remote supervision)
- remote DeathWatch
- [`system.stop()`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html#stop(actor:akka.actor.ActorRef):Unit "akka.actor.ActorRefFactory")[`system.stop()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html#stop(akka.actor.ActorRef) "akka.actor.ActorRefFactory"), [`PoisonPill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill")[`PoisonPill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill"), [`Kill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Kill.html "akka.actor.Kill")[`Kill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill.html "akka.actor.Kill")
- sending any message which extends from the [`PossiblyHarmful`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PossiblyHarmful.html "akka.actor.PossiblyHarmful")[`PossiblyHarmful`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html "akka.actor.PossiblyHarmful") marker interface, which includes [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html "akka.actor.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Terminated.html "akka.actor.Terminated")
- messages sent with actor selection, unless destination defined in `trusted-selection-paths`.

Note
Enabling the untrusted mode does not remove the capability of the client to freely choose the target of its message sends, which means that messages not prohibited by the above rules can be sent to any actor in the remote system. It is good practice for a client\-facing system to only contain a well\-defined set of entry point actors, which then forward requests (possibly after performing validation) to another actor system containing the actual worker actors. If messaging between these two server\-side systems is done using local [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") (they can be exchanged safely between actor systems within the same JVM), you can restrict the messages on this interface by marking them [`PossiblyHarmful`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PossiblyHarmful.html "akka.actor.PossiblyHarmful")[`PossiblyHarmful`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html "akka.actor.PossiblyHarmful") so that a client cannot forge them.

## Code Examples

### Example 1: Configuring SSL/TLS for Akka Remoting

```text
akka.remote.artery {
  transport = tls-tcp
}
```

### Example 2: Configuring SSL/TLS for Akka Remoting

```text
akka.remote.artery {
  transport = tls-tcp

  ssl.config-ssl-engine {
    key-store = "/example/path/to/mykeystore.jks"
    trust-store = "/example/path/to/mytruststore.jks"

    key-store-password = ${SSL_KEY_STORE_PASSWORD}
    key-password = ${SSL_KEY_PASSWORD}
    trust-store-password = ${SSL_TRUST_STORE_PASSWORD}

    protocol = "TLSv1.2"

    enabled-algorithms = [TLS_DHE_RSA_WITH_AES_128_GCM_SHA256]
  }
}
```

### Example 3: Kubernetes resources

```text
apiVersion: cert-manager.io/v1
kind: ClusterIssuer
metadata:
  name: self-signed-issuer
spec:
  selfSigned: {}
```

### Example 4: Kubernetes resources

```text
apiVersion: cert-manager.io/v1
kind: Certificate
metadata:
  name: akka-tls-ca-certificate
  namespace: default
spec:
  issuerRef:
    name: self-signed-issuer
    kind: ClusterIssuer
  secretName: akka-tls-ca-certificate
  commonName: default.akka.cluster.local
  # 100 years
  duration: 876000h
  # 99 years
  renewBefore: 867240h
  isCA: true
  privateKey:
    rotationPolicy: Always
```

### Example 5: Kubernetes resources

```text
apiVersion: cert-manager.io/v1
kind: Issuer
metadata:
  name: akka-tls-ca-issuer
  namespace: default
spec:
  ca:
    secretName: akka-tls-ca-certificate
```

### Example 6: Kubernetes resources

```text
apiVersion: cert-manager.io/v1
kind: Certificate
metadata:
  name: my-service-akka-tls-certificate
  namespace: default
spec:
  issuerRef:
    name: akka-tls-ca-issuer
  secretName: my-service-akka-tls-certificate
  dnsNames:
  - my-service.default.akka.cluster.local
  duration: 24h
  renewBefore: 16h
  privateKey:
    rotationPolicy: Always
```

### Example 7: Enable TLS with RotatingKeysSSLEngineProvider

```text
akka.remote.artery {
  transport = tls-tcp
  ssl.ssl-engine-provider = "akka.remote.artery.tcp.ssl.RotatingKeysSSLEngineProvider"
}
```

### Example 8: Configuring the Kubernetes deployment

```text
volumes:
      - name: akka-tls
        secret:
          secretName: my-service-akka-tls-certificate
```

### Example 9: Configuring the Kubernetes deployment

```text
volumeMounts:
        - name: akka-tls
          mountPath: /var/run/secrets/akka-tls/rotating-keys-engine
```

### Example 10: Configuring the Kubernetes deployment

```text
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: appka
  name: appka
  namespace: appka-1
spec:
  replicas: 2
  selector:
    matchLabels:
      app: appka
  template:
    metadata:
      labels:
        app: appka
    spec:
      containers:
      - name: appka
        image: akka-sample-cluster-kubernetes-scala:latest
        readinessProbe:
          httpGet:
            path: /ready
            port: management
        livenessProbe:
          httpGet:
            path: /alive
            port: management
        ports:
        - name: management
          containerPort: 8558
          protocol: TCP
        - name: http
          containerPort: 8080
          protocol: TCP
        resources:
          limits:
            memory: 1024Mi
          requests:
            cpu: 2
            memory: 1024Mi
        volumeMounts:
        - name: akka-tls
          mountPath: /var/run/secrets/akka-tls/rotating-keys-engine
      volumes:
      - name: akka-tls
        secret:
          secretName: my-service-akka-tls-certificate
```

### Example 11: Untrusted Mode

```text
akka.remote.artery.untrusted-mode = on
```

### Example 12: Untrusted Mode

```text
akka.remote.artery.trusted-selection-paths = ["/user/receptionist", "/user/namingService"]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Kill.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/libraries/akka-core/current/general/remoting.html
- https://doc.akka.io/libraries/akka-core/current/remote-security.html
- https://doc.akka.io/libraries/akka-core/current/remoting-artery.html
- https://doc.akka.io/libraries/akka-core/current/serialization.html
- https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/preparing-for-production.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/remote-security.html](https://doc.akka.io/libraries/akka-core/current/remote-security.html)*