---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes.html
title: Kubernetes via DNS • Akka Management
---

# Kubernetes via DNS • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Kubernetes via DNS

An example project that can be deployed to kubernetes via `minikube` is in `integration-test/kubernetes-dns`.

The project shows how to:

- Use Akka Bootstrap with `akka-dns` with cluster formation via DNS SRV records
- Use a headless service for internal and Akka management/bootstrap so that readiness probes for prod traffic don’t interfere with bootstrap
	- Note that this requires the use of the `publishNotReadyAddresses`, which replaces the `service.alpha.kubernetes.io/tolerate-unready-endpoints: "true"` annotation , so bootstrap can see the pods before they are ready. Check your Kubernetes environment supports this feature
- If required use a separate service and/or ingress for user\-facing endpoints, for example [HTTP](https://doc.akka.io/libraries/akka-http/10.7/) or [gRPC](https://doc.akka.io/libraries/akka-grpc/current/)

### Internal headless service for bootstrap

For Akka Cluster / Management use a headless service. This allows the solution to not be coupled to k8s as well as there is no use case for load balancing across management/remoting ports. Set endpoints to be published before readiness checks pass as these endpoints are required to bootstrap the Cluster and make the application ready.

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-dns/kubernetes/akka-cluster.yml#L61-L82 "Go to snippet source")apiVersion: v1
kind: Service
metadata:
  labels:
    app: akka-bootstrap-demo
  annotations:
    service.alpha.kubernetes.io/tolerate-unready-endpoints: "true"
  name: "integration-test-kubernetes-dns-internal"
spec:
  ports:
  - name: management
    port: 8558
    protocol: TCP
    targetPort: 8558
  - name: remoting
    port: 2552
    protocol: TCP
    targetPort: 2552
  selector:
    app: akka-bootstrap-demo
  clusterIP: None
  publishNotReadyAddresses: true
```

Note there are currently two ways to specify that addresses should be published if not ready, the initial way via an annotation `service.alpha.kubernetes.io/tolerate-unready-endpoints` and via the new officially supported way as the property `publishNotReadyAddresses`. Set both as depending on your DNS solution it may have not migrated from the annotation to the property.

This will result in SRV records being published for the service that contain the nodes that are not ready. This allows bootstrap to find them and form the cluster thus making them ready.

Then to configure your application:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-dns/src/main/resources/application.conf#L14-L25 "Go to snippet source")akka.management {
  cluster.bootstrap {
    contact-point-discovery {
      discovery-method = akka-dns
    }
  }

  http {
    port = 8558
    bind-hostname = "0.0.0.0"
  }
}
```

The same configuration will work for any environment that has an SRV record for your Akka Clustered application.

For more details on how to configure the Kubernetes deployment see [recipes](recipes.html).

## Code Examples

### Example 1: Internal headless service for bootstrap

```yml
apiVersion: v1
kind: Service
metadata:
  labels:
    app: akka-bootstrap-demo
  annotations:
    service.alpha.kubernetes.io/tolerate-unready-endpoints: "true"
  name: "integration-test-kubernetes-dns-internal"
spec:
  ports:
  - name: management
    port: 8558
    protocol: TCP
    targetPort: 8558
  - name: remoting
    port: 2552
    protocol: TCP
    targetPort: 2552
  selector:
    app: akka-bootstrap-demo
  clusterIP: None
  publishNotReadyAddresses: true
```

### Example 2: Internal headless service for bootstrap

```conf
akka.management {
  cluster.bootstrap {
    contact-point-discovery {
      discovery-method = akka-dns
    }
  }

  http {
    port = 8558
    bind-hostname = "0.0.0.0"
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-http/10.7/
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/local-config.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/recipes.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes.html](https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes.html)*