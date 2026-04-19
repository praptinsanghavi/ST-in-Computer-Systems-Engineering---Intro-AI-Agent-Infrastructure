---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html
title: Kubernetes API • Akka Management
---

# Kubernetes API • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Kubernetes API

The Kubernetes API can be used to discover peers and form an Akka Cluster. The `kubernetes-api` mechanism queries the Kubernetes API server to find pods with a given label. A Kubernetes service isn’t required for the cluster bootstrap but may be used for external access to the application.

The following Kubernetes resources are created:

- Deployment: For creating the Akka pods
- Role and RoleBinding to give the pods access to the API server

An example deployment (used for integration testing):

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api/kubernetes/akka-cluster.yml#L2-L55 "Go to snippet source")apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: akka-bootstrap-demo
  name: akka-bootstrap-demo
spec:
  replicas: 3
  selector:
    matchLabels:
     app: akka-bootstrap-demo
  strategy:
    rollingUpdate:
      maxSurge: 1
      maxUnavailable: 0
    type: RollingUpdate

  template:
    metadata:
      labels:
        app: akka-bootstrap-demo
        actorSystemName: akka-bootstrap-demo
    spec:
      containers:
      - name: akka-bootstrap-demo
        image: integration-test-kubernetes-api:1.3.3.7
        # Remove for a real project, the image is picked up locally for the integratio test
        imagePullPolicy: Never
        livenessProbe:
          httpGet:
            path: /alive
            port: management
        readinessProbe:
          httpGet:
            path: /ready
            port: management
        ports:
        # akka-management bootstrap
        - containerPort: 8558
          protocol: TCP
          # when contact-point-discovery.port-name is set for cluster bootstrap,
          # the management port must be named accordingly:
          # name: management
        env:
        # The Kubernetes API discovery will use this service name to look for
        # nodes with this value in the 'app' label.
        # This can be customized with the 'pod-label-selector' setting.
        - name: AKKA_CLUSTER_BOOTSTRAP_SERVICE_NAME
          valueFrom:
            fieldRef:
              apiVersion: v1
              fieldPath: "metadata.labels['app']"
```

An example `Role` and `Rolebinding` to allow the nodes to query the Kubernetes API server:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api/kubernetes/akka-cluster.yml#L59-L87 "Go to snippet source")#
# Create a role, `pod-reader`, that can list pods and
# bind the default service account in the namespace
# that the binding is deployed to to that role.
#

kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
rules:
- apiGroups: [""] # "" indicates the core API group
  resources: ["pods"]
  verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
subjects:
  # Uses the default service account.
  # Consider creating a dedicated service account to run your
  # Akka Cluster services and binding the role to that one.
- kind: ServiceAccount
  name: default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

The User name includes the namespace, this will need updated for your namespace.

The following configuration is required:

- Set `akka.management.cluster.bootstrap.contact-point-discovery.discovery-method` to `kubernetes-api`
- Set `akka.discovery.kubernetes-api.pod-label-selector` to a label selector that will match the Akka pods e.g. `app=%s`

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api/src/main/resources/application.conf#L9-L22 "Go to snippet source")akka.discovery {
  kubernetes-api {
    # in fact, this is already the default:
    pod-label-selector = "app=%s"
  }
}

akka.management {
  cluster.bootstrap {
    contact-point-discovery {
      discovery-method = kubernetes-api
    }
  }
}
```

Note that `kubernetes-api` is unsuitable as the default `akka.discovery.method`. For most cases, the most reasonable (and most idiomatic in Kubernetes) choice for discovering other services to consume is to use DNS:

```
akka.discovery.method = akka-dns

```

In some cases, [`kubernetes-api-for-client`](../discovery/kubernetes.html#using-the-kubernetes-api-to-support-client-side-load-balancing) may be a more suitable default `akka.discovery.method`.

The lookup needs to know which namespace to look in. By default, this will be detected by reading the namespace from the service account secret, in `/var/run/secrets/kubernetes.io/serviceaccount/namespace`, but can be overridden by setting `akka.discovery.kubernetes-api.pod-namespace` or by providing `KUBERNETES_NAMESPACE` environment variable.

```
        env:
        - name: KUBERNETES_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace

```

For more details on how to configure the Kubernetes deployment see [recipes](recipes.html).

## Code Examples

### Example 1: Kubernetes API

```yml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: akka-bootstrap-demo
  name: akka-bootstrap-demo
spec:
  replicas: 3
  selector:
    matchLabels:
     app: akka-bootstrap-demo
  strategy:
    rollingUpdate:
      maxSurge: 1
      maxUnavailable: 0
    type: RollingUpdate

  template:
    metadata:
      labels:
        app: akka-bootstrap-demo
        actorSystemName: akka-bootstrap-demo
    spec:
      containers:
      - name: akka-bootstrap-demo
        image: integration-test-kubernetes-api:1.3.3.7
        # Remove for a real project, the image is picked up locally for the integratio test
        imagePullPolicy: Never
        livenessProbe:
          httpGet:
            path: /alive
            port: management
        readinessProbe:
          httpGet:
            path: /ready
            port: management
        ports:
        # akka-management bootstrap
        - containerPort: 8558
          protocol: TCP
          # when contact-point-discovery.port-name is set for cluster bootstrap,
          # the management port must be named accordingly:
          # name: management
        env:
        # The Kubernetes API discovery will use this service name to look for
        # nodes with this value in the 'app' label.
        # This can be customized with the 'pod-label-selector' setting.
        - name: AKKA_CLUSTER_BOOTSTRAP_SERVICE_NAME
          valueFrom:
            fieldRef:
              apiVersion: v1
              fieldPath: "metadata.labels['app']"
```

### Example 2: Kubernetes API

```yml
#
# Create a role, `pod-reader`, that can list pods and
# bind the default service account in the namespace
# that the binding is deployed to to that role.
#

kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
rules:
- apiGroups: [""] # "" indicates the core API group
  resources: ["pods"]
  verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
subjects:
  # Uses the default service account.
  # Consider creating a dedicated service account to run your
  # Akka Cluster services and binding the role to that one.
- kind: ServiceAccount
  name: default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

### Example 3: Kubernetes API

```conf
akka.discovery {
  kubernetes-api {
    # in fact, this is already the default:
    pod-label-selector = "app=%s"
  }
}

akka.management {
  cluster.bootstrap {
    contact-point-discovery {
      discovery-method = kubernetes-api
    }
  }
}
```

### Example 4: Kubernetes API

```text
akka.discovery.method = akka-dns
```

### Example 5: Kubernetes API

```yaml
env:
        - name: KUBERNETES_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-management/current/bootstrap/istio.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/recipes.html
- https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html](https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html)*