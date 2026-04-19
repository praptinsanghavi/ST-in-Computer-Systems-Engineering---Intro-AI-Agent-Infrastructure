---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-edge/current/guide/6-deploying-the-services.html
title: Deploying the Restaurant Delivery Service • Akka Edge
---

# Deploying the Restaurant Delivery Service • Akka Edge

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Deploying the Restaurant Delivery Service

In this part we will deploy [Restaurant Deliveries Service](3-restaurant-deliveries-service.html) to Kubernetes.

## Setup Kubernetes cluster

Use instructions from your preferred cloud provider of how to start two Kubernetes clusters in two separate regions.

As an example, we use Amazon EKS in regions `us-east-2`:

```
eksctl create cluster \
  --name eks-akka-edge-us-east-2 \
  --version 1.24 \
  --region us-east-2 \
  --nodegroup-name linux-nodes \
  --node-type m5.xlarge \
  --nodes 3 \
  --nodes-min 1 \
  --nodes-max 4 \
  --with-oidc \
  --managed

```

## Setup database

Use instructions from your preferred cloud provider of how to run a PostgreSQL database in each of the two regions.

As an example, we use [Amazon RDS Postgres](https://console.aws.amazon.com/rds/home). For a trial PostgreSQL you can select the following aside from defaults:

- Standard create
- PostgreSQL
- Free tier (some regions don’t offer free tier)
- DB instance identifier: `restaurant-drone-deliveries-db`
- Master password: `<a password>`
- Turn off storage autoscaling
- VPC: Use the same as your EKS cluster is running in
- Create new VPC security group: `restaurant-drone-deliveries-sg`
- Turn off Automatic Backups in the Additional Configuration section.

To allow the nodes in the EKS cluster to connect to the database you have to add a rule in the security group.

Go to the [VPC console](https://console.aws.amazon.com/vpc/home). Select “Security Groups”.

There are 3 security groups for the EKS cluster, you should select the one with description “EKS created security group …”. The one that has a name that doesn’t contain `ControlPlaneSecurityGroup` and doesn’t contain `ClusterSharedNodeSecurityGroup` . Make a note of this security group id for the EKS cluster.

Go back to the [Amazon RDS console](https://console.aws.amazon.com/rds/home#databases). Select the database that you created. Click on the “VPC security groups” in the tab “Connectivity \& security”.

Edit inbound rules \> add rule \> Custom TCP \> Port 5432 \> Source custom. Add the security group for the EKS cluster. Save rules.

More details in [A DB instance in a VPC accessed by an EC2 instance in the same VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Scenarios.html#USER_VPC.Scenario1)

## Namespace

Define a Kubernetes namespace with a `namespace.json` file:

JSON

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/kubernetes/namespace.json "Go to snippet source"){
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "restaurant-drone-deliveries-namespace",
    "labels": {
      "name": "restaurant-drone-deliveries-namespace"
    }
  }
}

```

Create the namespace with:

```
kubectl apply -f kubernetes/namespace.json

```

For convenience, you can use this namespace by default:

```
kubectl config set-context --current --namespace=restaurant-drone-deliveries-namespace

```

## Role based access control

For Akka Cluster bootstrap we need to define access control with a `rbac.yml` file:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/kubernetes/rbac.yml "Go to snippet source")kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: restaurant-drone-deliveries-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
  namespace: restaurant-drone-deliveries-namespace
subjects:
  # Note the `name` line below. The first default refers to the namespace. The second refers to the service account name.
  # For instance, `name: system:serviceaccount:myns:default` would refer to the default service account in namespace `myns`
  - kind: User
    name: system:serviceaccount:restaurant-drone-deliveries-namespace:default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

Apply the access control with:

```
kubectl apply -f kubernetes/rbac.yml

```

## Database secret

Create a Kubernetes secret with the connection details and credentials to the database:

```
kubectl create secret generic \
    db-secret \
    --from-literal=DB_HOST=restaurant-drone-deliveries-db.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com \
    --from-literal=DB_USER=postgres \
    --from-literal=DB_PASSWORD=<the password>

```

## Database schema

You can run `psql` from the Kubernetes cluster with

```
kubectl run -i --tty db-mgmt --image=postgres --restart=Never --rm \
  --env=PGPASSWORD=<the password> -- \
  psql -h restaurant-drone-deliveries-db.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com -U postgres

```

Paste the DDL statements from the `ddl-scripts/create-tables.sql` to the `psql` prompt:

SQL

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/ddl-scripts/create_tables.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- // #queryableColumn
CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  -- additional column
  location VARCHAR(255),

  PRIMARY KEY(persistence_id)
);
-- // #queryableColumn

-- to query drones by location
CREATE INDEX IF NOT EXISTS durable_state_drone_location_idx ON durable_state(location);

-- Timestamp based offsets are stored in this table.
CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

## Deploy the Restaurant Drone Deliveries Service

We are now going to deploy the `restaurant-drone-deliveries-service` to the created kubernetes cluster in `us-east-2`.

This step is for deploying the restaurant\-deliveries\-service project, full sources can be downloaded from:

- Scala [drone\-scala.zip](../attachments/drone-scala.zip)
- Java [drone\-java.zip](../attachments/drone-java.zip)

Build and publish the docker image to docker.io:

Scala

```
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish

```

Java

```
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push

```

The Kubernetes `Deployment` in `deployment.yml` file:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/kubernetes/deployment.yml "Go to snippet source")apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: restaurant-drone-deliveries-service
  name: restaurant-drone-deliveries-service
  namespace: restaurant-drone-deliveries-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: restaurant-drone-deliveries-service
  template:
    metadata:
      labels:
        app: restaurant-drone-deliveries-service
        actorSystemName: restaurant-drone-deliveries
    spec:
      containers:
        - name: restaurant-drone-deliveries-service
          # use specific image version from docker publish
          image: restaurant-drone-deliveries-service:latest
          # these will need to be increased/tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
            - name: DB_USER
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_USER
                  optional: true
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_PASSWORD
                  optional: true
```

Update the `image:` in the `deployment.yml` with the specific image version and location you published.

```
kubectl apply -f kubernetes/deployment.yml

```

### Port forward

Create a Kubernetes `Service` and port forward to simplify access to the pods from your local machine:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/kubernetes/service.yml "Go to snippet source")apiVersion: v1
kind: Service
metadata:
  name: restaurant-drone-deliveries-service-svc
spec:
  selector:
    app: restaurant-drone-deliveries-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

```
kubectl apply -f kubernetes/service.yml

```

Start port forward with:

```
kubectl port-forward svc/restaurant-drone-deliveries-service-svc 8101:8101

```

### Exercise the service

Use [grpcurl](https://github.com/fullstorydev/grpcurl) to exercise the service.

Set up two restaurants: 

```
grpcurl -d '{"restaurant_id":"restaurant1","coordinates":{"latitude": 59.330324, "longitude": 18.039568}, "local_control_location_id": "sweden/stockholm/kungsholmen" }' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.SetUpRestaurant
grpcurl -d '{"restaurant_id":"restaurant2","coordinates":{"latitude": 59.342046, "longitude": 18.059095}, "local_control_location_id": "sweden/stockholm/norrmalm" }' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.SetUpRestaurant

```

Register a delivery for each restaurant:

```
grpcurl -d '{"restaurant_id":"restaurant1","delivery_id": "order1","coordinates":{"latitude": 59.330841, "longitude": 18.038885}}' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.RegisterDelivery
grpcurl -d '{"restaurant_id":"restaurant2","delivery_id": "order2","coordinates":{"latitude": 59.340128, "longitude": 18.056303}}' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.RegisterDelivery

```

We have not set up any local drone delivery services yet so there are no drones to actually pick up the orders.

## Load balancer

To access the `restaurant-drone-deliveries-service` from `local-drone-control` services running in other regions or on the edge we need an Internet facing load balancer.

There are many alternatives for secure access with a load balancer. An incomplete list of options:

- Network load balancer such as [AWS Load Balancer Controller](https://docs.aws.amazon.com/eks/latest/userguide/network-load-balancing.html) with TLS all the way between the services.
- Application load balancer such as [AWS Load Balancer Controller](https://docs.aws.amazon.com/prescriptive-guidance/latest/patterns/deploy-a-grpc-based-application-on-an-amazon-eks-cluster-and-access-it-with-an-application-load-balancer.html), which terminates TLS.
- [NGINX Ingress Controller](https://docs.nginx.com/nginx-ingress-controller/)
- [Contour](https://projectcontour.io)
- [Linkerd multi\-cluster](https://linkerd.io/2.13/features/multicluster/)

Mutual authentication with TLS (mTLS) can be very useful where only other known services are allowed to interact with a service, and public access should be denied. See [Akka gRPC documentation](https://doc.akka.io/libraries/akka-grpc/current/mtls.html).

We are going to use a network load balancer for simplicity of this example, and we are not using TLS. Real applications would of course require TLS.

Follow the instructions of how to [install the AWS Load Balancer Controller add\-on](https://docs.aws.amazon.com/eks/latest/userguide/aws-load-balancer-controller.html).

Create a Kubernetes `Service` that is configured for the load balancer:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/kubernetes/service-nlb.yml "Go to snippet source")# Network load balancer https://docs.aws.amazon.com/eks/latest/userguide/network-load-balancing.html
apiVersion: v1
kind: Service
metadata:
  name: restaurant-drone-deliveries-service-nlb
  annotations:
    service.beta.kubernetes.io/aws-load-balancer-type: external
    service.beta.kubernetes.io/aws-load-balancer-nlb-target-type: ip
    service.beta.kubernetes.io/aws-load-balancer-scheme: internet-facing
spec:
  selector:
    app: restaurant-drone-deliveries-service
  type: LoadBalancer
  ports:
    - protocol: TCP
      port: 80
      targetPort: 8101
```

The external DNS name is shown by:

```
kubectl get services

```

## Deploy local drone control instances

This step is for deploying the local\-drone\-control project, full sources can be downloaded from:

- Scala [drone\-scala.zip](../attachments/drone-scala.zip)
- Java [drone\-java.zip](../attachments/drone-java.zip)

### Local Drone Control Namespace

Define a Kubernetes namespace with a `namespace.json` file:

JSON

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/kubernetes/namespace.json "Go to snippet source"){
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "local-drone-control-namespace",
    "labels": {
      "name": "local-drone-control-namespace"
    }
  }
}

```

Create the namespace with:

```
kubectl apply -f kubernetes/namespace.json

```

For convenience, you can use this namespace by default:

```
kubectl config set-context --current --namespace=local-drone-control-namespace

```

### Deploy the service

In the edge k8 clusters, update the environment variables in deployment.yaml for `LOCATION_ID`, selecting one of the predefined locations known to the restaurant\-drone\-deliveries service: `sweden/stockholm/kungsholmen`, `sweden/stockholm/södermalm`, `sweden/stockholm/norrmalm` or `sweden/stockholm/östermalm`.

Set `CENTRAL_DRONE_CONTROL_HOST` to the public DNS hostname of your load balancer for the `restaurant-drone-deliveries-service`.

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/kubernetes/deployment.yml "Go to snippet source")apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: local-drone-control-service
  name: local-drone-control-service
  namespace: local-drone-control-namespace
spec:
  # note: the default image cannot scale out as it uses a local database
  replicas: 1
  selector:
    matchLabels:
      app: local-drone-control-service
  template:
    metadata:
      labels:
        app: local-drone-control-service
        actorSystemName: local-drone-control-service
    spec:
      containers:
        - name: local-drone-control-service
          # use specific image version from docker publish
          image: local-drone-control:latest
          # these will need to be increased/tuned for production environments!
          resources:
            limits:
              memory: "512Mi"
            requests:
              memory: "512Mi"
              cpu: "1000m"
          ports:
            - name: grpc
              containerPort: 8080
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75"
            - name: LOCATION_ID
              # one of the location ids supported by the restaurant-drone-deliveries service
              value: "sweden/stockholm/kungsholmen"
            - name: CENTRAL_DRONE_CONTROL_HOST
              # update with public endpoint for restaurant-drone-deliveries
              value: k8s-restaura-restaura-5bd7dc845f-48570e637882db8c.elb.us-east-2.amazonaws.com
            - name: CENTRAL_DRONE_CONTROL_PORT
              value: "80"
            - name: H2_DATABASE_PATH
              # for state to survive restarts this would need to be a volume
              # right now a restarted node will replay all orders from central
              # and only report new drone updates
              value: /tmp/drone-db
```

Build the image and deploy in the same way as described previously.

Scala

```
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io Docker/publish

```

Java

```
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push

```

Update the `image:` in the `deployment.yml` with the specific image version and location you published.

```
kubectl apply -f kubernetes/debployment.yml

```

### Port forwards

Create a Kubernetes `Service` and port forward to simplify access to the pods from your local machine:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/kubernetes/service.yml "Go to snippet source")apiVersion: v1
kind: Service
metadata:
  name: local-drone-control-service-svc
spec:
  selector:
    app: local-drone-control-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8080
      targetPort: 8080
```

```
kubectl -f apply kubernetes/service.yml

```

Start port forward with:

```
kubectl port-forward svc/local-drone-control-service-svc 8080:8080

```

### Exercise the local drone control service instance

Use [grpcurl](https://github.com/fullstorydev/grpcurl) to exercise the service.

```
grpcurl -d '{"drone_id":"drone3", "coordinates": {"longitude": 19.70125, "latitude": 59.51834}, "altitude": 5}' -plaintext 127.0.0.1:8080 local.drones.DroneService.ReportLocation

```

Check that the coarse grained location of the drone was propagated to the cloud service:

```
grpcurl -d '{"drone_id":"drone3"}' -plaintext <public-cloud-service-dns-name>:80 central.drones.DroneOverviewService.GetDroneOverview

```

List the orders that was propagated to the local control service, you should see an order we added an order when verifying that the restaurant\-drone\-deliveries service was functional earlier.

```
grpcurl -plaintext 127.0.0.1:8080 local.drones.DeliveriesQueueService.GetCurrentQueue

```

## Code Examples

### Example 1: Setup Kubernetes cluster

```text
eksctl create cluster \
  --name eks-akka-edge-us-east-2 \
  --version 1.24 \
  --region us-east-2 \
  --nodegroup-name linux-nodes \
  --node-type m5.xlarge \
  --nodes 3 \
  --nodes-min 1 \
  --nodes-max 4 \
  --with-oidc \
  --managed
```

### Example 2: Namespace

```json
{
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "restaurant-drone-deliveries-namespace",
    "labels": {
      "name": "restaurant-drone-deliveries-namespace"
    }
  }
}
```

### Example 3: Namespace

```text
kubectl apply -f kubernetes/namespace.json
```

### Example 4: Namespace

```text
kubectl config set-context --current --namespace=restaurant-drone-deliveries-namespace
```

### Example 5: Role based access control

```yml
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: restaurant-drone-deliveries-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
  namespace: restaurant-drone-deliveries-namespace
subjects:
  # Note the `name` line below. The first default refers to the namespace. The second refers to the service account name.
  # For instance, `name: system:serviceaccount:myns:default` would refer to the default service account in namespace `myns`
  - kind: User
    name: system:serviceaccount:restaurant-drone-deliveries-namespace:default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

### Example 6: Role based access control

```text
kubectl apply -f kubernetes/rbac.yml
```

### Example 7: Database secret

```text
kubectl create secret generic \
    db-secret \
    --from-literal=DB_HOST=restaurant-drone-deliveries-db.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com \
    --from-literal=DB_USER=postgres \
    --from-literal=DB_PASSWORD=<the password>
```

### Example 8: Database schema

```text
kubectl run -i --tty db-mgmt --image=postgres --restart=Never --rm \
  --env=PGPASSWORD=<the password> -- \
  psql -h restaurant-drone-deliveries-db.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com -U postgres
```

### Example 9: Database schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- // #queryableColumn
CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  -- additional column
  location VARCHAR(255),

  PRIMARY KEY(persistence_id)
);
-- // #queryableColumn

-- to query drones by location
CREATE INDEX IF NOT EXISTS durable_state_drone_location_idx ON durable_state(location);


-- Timestamp based offsets are stored in this table.
CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 10: Deploy the Restaurant Drone Deliveries Service

```text
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish
```

### Example 11: Deploy the Restaurant Drone Deliveries Service

```text
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push
```

### Example 12: Deploy the Restaurant Drone Deliveries Service

```yml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: restaurant-drone-deliveries-service
  name: restaurant-drone-deliveries-service
  namespace: restaurant-drone-deliveries-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: restaurant-drone-deliveries-service
  template:
    metadata:
      labels:
        app: restaurant-drone-deliveries-service
        actorSystemName: restaurant-drone-deliveries
    spec:
      containers:
        - name: restaurant-drone-deliveries-service
          # use specific image version from docker publish
          image: restaurant-drone-deliveries-service:latest
          # these will need to be increased/tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
            - name: DB_USER
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_USER
                  optional: true
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_PASSWORD
                  optional: true
```

### Example 13: Deploy the Restaurant Drone Deliveries Service

```text
kubectl apply -f kubernetes/deployment.yml
```

### Example 14: Port forward

```yml
apiVersion: v1
kind: Service
metadata:
  name: restaurant-drone-deliveries-service-svc
spec:
  selector:
    app: restaurant-drone-deliveries-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

### Example 15: Port forward

```text
kubectl apply -f kubernetes/service.yml
```

### Example 16: Port forward

```text
kubectl port-forward svc/restaurant-drone-deliveries-service-svc 8101:8101
```

### Example 17: Exercise the service

```shell
grpcurl -d '{"restaurant_id":"restaurant1","coordinates":{"latitude": 59.330324, "longitude": 18.039568}, "local_control_location_id": "sweden/stockholm/kungsholmen" }' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.SetUpRestaurant
grpcurl -d '{"restaurant_id":"restaurant2","coordinates":{"latitude": 59.342046, "longitude": 18.059095}, "local_control_location_id": "sweden/stockholm/norrmalm" }' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.SetUpRestaurant
```

### Example 18: Exercise the service

```shell
grpcurl -d '{"restaurant_id":"restaurant1","delivery_id": "order1","coordinates":{"latitude": 59.330841, "longitude": 18.038885}}' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.RegisterDelivery
grpcurl -d '{"restaurant_id":"restaurant2","delivery_id": "order2","coordinates":{"latitude": 59.340128, "longitude": 18.056303}}' -plaintext localhost:8101 central.deliveries.RestaurantDeliveriesService.RegisterDelivery
```

### Example 19: Load balancer

```yml
# Network load balancer https://docs.aws.amazon.com/eks/latest/userguide/network-load-balancing.html
apiVersion: v1
kind: Service
metadata:
  name: restaurant-drone-deliveries-service-nlb
  annotations:
    service.beta.kubernetes.io/aws-load-balancer-type: external
    service.beta.kubernetes.io/aws-load-balancer-nlb-target-type: ip
    service.beta.kubernetes.io/aws-load-balancer-scheme: internet-facing
spec:
  selector:
    app: restaurant-drone-deliveries-service
  type: LoadBalancer
  ports:
    - protocol: TCP
      port: 80
      targetPort: 8101
```

### Example 20: Load balancer

```text
kubectl get services
```

### Example 21: Local Drone Control Namespace

```json
{
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "local-drone-control-namespace",
    "labels": {
      "name": "local-drone-control-namespace"
    }
  }
}
```

### Example 22: Local Drone Control Namespace

```text
kubectl apply -f kubernetes/namespace.json
```

### Example 23: Local Drone Control Namespace

```text
kubectl config set-context --current --namespace=local-drone-control-namespace
```

### Example 24: Deploy the service

```yml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: local-drone-control-service
  name: local-drone-control-service
  namespace: local-drone-control-namespace
spec:
  # note: the default image cannot scale out as it uses a local database
  replicas: 1
  selector:
    matchLabels:
      app: local-drone-control-service
  template:
    metadata:
      labels:
        app: local-drone-control-service
        actorSystemName: local-drone-control-service
    spec:
      containers:
        - name: local-drone-control-service
          # use specific image version from docker publish
          image: local-drone-control:latest
          # these will need to be increased/tuned for production environments!
          resources:
            limits:
              memory: "512Mi"
            requests:
              memory: "512Mi"
              cpu: "1000m"
          ports:
            - name: grpc
              containerPort: 8080
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75"
            - name: LOCATION_ID
              # one of the location ids supported by the restaurant-drone-deliveries service
              value: "sweden/stockholm/kungsholmen"
            - name: CENTRAL_DRONE_CONTROL_HOST
              # update with public endpoint for restaurant-drone-deliveries
              value: k8s-restaura-restaura-5bd7dc845f-48570e637882db8c.elb.us-east-2.amazonaws.com
            - name: CENTRAL_DRONE_CONTROL_PORT
              value: "80"
            - name: H2_DATABASE_PATH
              # for state to survive restarts this would need to be a volume
              # right now a restarted node will replay all orders from central
              # and only report new drone updates
              value: /tmp/drone-db
```

### Example 25: Deploy the service

```text
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io Docker/publish
```

### Example 26: Deploy the service

```text
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push
```

### Example 27: Deploy the service

```text
kubectl apply -f kubernetes/debployment.yml
```

### Example 28: Port forwards

```yml
apiVersion: v1
kind: Service
metadata:
  name: local-drone-control-service-svc
spec:
  selector:
    app: local-drone-control-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8080
      targetPort: 8080
```

### Example 29: Port forwards

```text
kubectl -f apply kubernetes/service.yml
```

### Example 30: Port forwards

```text
kubectl port-forward svc/local-drone-control-service-svc 8080:8080
```

### Example 31: Exercise the local drone control service instance

```text
grpcurl -d '{"drone_id":"drone3", "coordinates": {"longitude": 19.70125, "latitude": 59.51834}, "altitude": 5}' -plaintext 127.0.0.1:8080 local.drones.DroneService.ReportLocation
```

### Example 32: Exercise the local drone control service instance

```text
grpcurl -d '{"drone_id":"drone3"}' -plaintext <public-cloud-service-dns-name>:80 central.drones.DroneOverviewService.GetDroneOverview
```

### Example 33: Exercise the local drone control service instance

```text
grpcurl -plaintext 127.0.0.1:8080 local.drones.DeliveriesQueueService.GetCurrentQueue
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-edge/current/attachments/drone-java.zip
- https://doc.akka.io/libraries/akka-edge/current/attachments/drone-scala.zip
- https://doc.akka.io/libraries/akka-edge/current/guide-rs.html
- https://doc.akka.io/libraries/akka-edge/current/guide/3-restaurant-deliveries-service.html
- https://doc.akka.io/libraries/akka-edge/current/guide/5-charging-station.html
- https://doc.akka.io/libraries/akka-grpc/current/mtls.html

---
*Source: [https://doc.akka.io/libraries/akka-edge/current/guide/6-deploying-the-services.html](https://doc.akka.io/libraries/akka-edge/current/guide/6-deploying-the-services.html)*