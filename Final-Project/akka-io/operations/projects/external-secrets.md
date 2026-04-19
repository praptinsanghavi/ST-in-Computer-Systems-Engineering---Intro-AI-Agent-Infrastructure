---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:35Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/projects/external-secrets.html
title: 'Manage external secrets :: Akka Documentation'
---

# Manage external secrets :: Akka Documentation

## Content

# Manage external secrets

Akka allows integrating with various external secret managers. External secrets are provided to your services through filesystem mounts, however they will never be written to disk on your service.

Authentication with external secret managers is done using workload identity. When a service starts, the identity of that service is used to authentication with and be authorized by the secret manager, using OIDC.

## Managing external secrets in a project

### Listing external secrets

To list the external secrets in your Akka project, you can use the Akka CLI.

CLI

Use the `akka secret external list` command:

```
akka secret external list
```

### Removing external secrets

To remove an external secret from your Akka project, you can use the Akka CLI.

CLI

`akka secret external delete` command:

```
akka secret external delete <secret-name>
```

## Azure KeyVault

Akka services running on Azure can access external secrets from Azure KeyVault.

### Setting up

Before you setting up Azure KeyVault, you will need the following information:

- The name of the Azure KeyVault that you wish to access, which we will refer to in the scripts below using the environment variable `KEYVAULT_NAME`.
- The ID of the Akka project that you wish to access to the secrets, which we will refer to in the scripts below using the environment variable `AKKA_PROJECT_ID`. This is a UUID, and can be obtained using the `akka project get` command.
- The name of the service that you wish to access the secrets, which we will refer to in the scripts below using the environment variable `AKKA_SERVICE_NAME`.

The following script can set them:

```
export KEYVAULT_NAME=my-keyvault-name
export AKKA_PROJECT_ID=bc16cf0c-909f-402d-bbb0-88ea1d582854
export AKKA_SERVICE_NAME=my-service
```

Now, you will need to determine the OIDC issuer for your region. This can be determined by running:

```
akka secrets external info
```

Copy the issuer and place it in an environment variable called `AKKA_OIDC_ISSUER`, or if you only have a single region, you can do so using the following command:

```
export AKKA_OIDC_ISSUER=`akka secrets external info -o go-template='{{(index .Items 0).WorkloadIdentity.Azure.OidcIssuer}}'`
```

Now you need to create an application to access the secrets on behalf of your service. We’ll place the name of this application in an environment variable called `APPLICATION_NAME`, and then obtain the client ID for the application and place that in an environment variable called `APPLICATION_CLIENT_ID`:

```
export APPLICATION_NAME="my-akka-service-application"
az ad sp create-for-rbac --name "${APPLICATION_NAME}"
export APPLICATION_CLIENT_ID=$(az ad sp list --display-name ${APPLICATION_NAME} --query '[0].appId' -otsv)
```

Now we need to grant this application access to keys, secrets and certs in the KeyVault:

```
az keyvault set-policy -n $KEYVAULT_NAME --key-permissions get --spn ${APPLICATION_CLIENT_ID}
az keyvault set-policy -n $KEYVAULT_NAME --secret-permissions get --spn ${APPLICATION_CLIENT_ID}
az keyvault set-policy -n $KEYVAULT_NAME --certificate-permissions get --spn ${APPLICATION_CLIENT_ID}
```

Now to federate the credentials, we need the application object id of the application:

```
export APPLICATION_OBJECT_ID="$(az ad app show --id ${APPLICATION_CLIENT_ID} --query id -otsv)"
```

Now we’ll create a JSON parameters file for federating the credentials:

```
cat <<EOF > params.json
{
  "name": "akka-service-federated-credential",
  "issuer": "${AKKA_OIDC_ISSUER}",
  "subject": "system:serviceaccount:${AKKA_PROJECT_ID}:klx-${AKKA_SERVICE_NAME}",
  "description": "Akka service federated credential",
  "audiences": [
    "api://AzureADTokenExchange"
  ]
}
EOF
```

And finally federate the credentials:

```
az ad app federated-credential create --id "${APPLICATION_OBJECT_ID}" --parameters @params.json
```

### Managing Azure KeyVault secrets using the project descriptor

The best way to manage Azure KeyVault secrets is using the project descriptor. Please refer to [Project Descriptor reference](../../reference/descriptors/project-descriptor.html) for details.

### Adding Azure KeyVault secrets

To add secrets to your Akka project, you can use the Akka CLI. You will need the following information:

- The name of the KeyVault
- The Tenant ID for the KeyVault
- The Application Client ID of the application created above.

CLI

Use the `akka secret external azure create` command.

```
akka secret external azure create my-external-secret \ (1)
  --key-vault-name $KEYVAULT_NAME \
  --tenant-id $TENANT_ID \
  --client-id $APPLICATION_CLIENT_ID \
  --object-name some-secret \ (2)
  --object-type secret (3)
```

| **1** | External secret name |
| --- | --- |
| **2** | The name of the object (secret) in the key store |
| **3** | The type of the secret, either secret, key or cert |

Adding multiple objects can be done by updating the secret after initial creation.

### Updating Azure KeyVault secrets

CLI

Use the `akka secret external azure update` command.

```
akka secret external azure update my-external-secret \
  --object-name some-other-secret \
  --object-type secret
```

When updating, if the passed in object name exists, the object will be updated, otherwise a new object will be added to the secret.

## Mount secrets to the filesystem of your service

Mounting secrets

CLI

`akka service deploy` command with parameter `--secret-env`:

```
akka service deploy <service-name> <container-image>  \
    --secret-env MY_VAR1=db-secret/username,MY_VAR2=db-secret/pwd  (1)
```

| **1** | The value for an environment variable that refers to a secret is of the form `<secret-name>/<secret-key>` |
| --- | --- |

## Code Examples

### Example 1: Listing external secrets

```command
akka secret external list
```

### Example 2: Removing external secrets

```command
akka secret external delete <secret-name>
```

### Example 3: Setting up

```command
export KEYVAULT_NAME=my-keyvault-name
export AKKA_PROJECT_ID=bc16cf0c-909f-402d-bbb0-88ea1d582854
export AKKA_SERVICE_NAME=my-service
```

### Example 4: Setting up

```command
akka secrets external info
```

### Example 5: Setting up

```command
export AKKA_OIDC_ISSUER=`akka secrets external info -o go-template='{{(index .Items 0).WorkloadIdentity.Azure.OidcIssuer}}'`
```

### Example 6: Setting up

```command
export APPLICATION_NAME="my-akka-service-application"
az ad sp create-for-rbac --name "${APPLICATION_NAME}"
export APPLICATION_CLIENT_ID=$(az ad sp list --display-name ${APPLICATION_NAME} --query '[0].appId' -otsv)
```

### Example 7: Setting up

```command
az keyvault set-policy -n $KEYVAULT_NAME --key-permissions get --spn ${APPLICATION_CLIENT_ID}
az keyvault set-policy -n $KEYVAULT_NAME --secret-permissions get --spn ${APPLICATION_CLIENT_ID}
az keyvault set-policy -n $KEYVAULT_NAME --certificate-permissions get --spn ${APPLICATION_CLIENT_ID}
```

### Example 8: Setting up

```command
export APPLICATION_OBJECT_ID="$(az ad app show --id ${APPLICATION_CLIENT_ID} --query id -otsv)"
```

### Example 9: Setting up

```command
cat <<EOF > params.json
{
  "name": "akka-service-federated-credential",
  "issuer": "${AKKA_OIDC_ISSUER}",
  "subject": "system:serviceaccount:${AKKA_PROJECT_ID}:klx-${AKKA_SERVICE_NAME}",
  "description": "Akka service federated credential",
  "audiences": [
    "api://AzureADTokenExchange"
  ]
}
EOF
```

### Example 10: Setting up

```command
az ad app federated-credential create --id "${APPLICATION_OBJECT_ID}" --parameters @params.json
```

### Example 11: Adding Azure KeyVault secrets

```command
akka secret external azure create my-external-secret \ (1)
  --key-vault-name $KEYVAULT_NAME \
  --tenant-id $TENANT_ID \
  --client-id $APPLICATION_CLIENT_ID \
  --object-name some-secret \ (2)
  --object-type secret (3)
```

### Example 12: Updating Azure KeyVault secrets

```command
akka secret external azure update my-external-secret \
  --object-name some-other-secret \
  --object-type secret
```

### Example 13: Mount secrets to the filesystem of your service

```command
akka service deploy <service-name> <container-image>  \
    --secret-env MY_VAR1=db-secret/username,MY_VAR2=db-secret/pwd  (1)
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/descriptors/project-descriptor.html

---
*Source: [https://doc.akka.io/operations/projects/external-secrets.html](https://doc.akka.io/operations/projects/external-secrets.html)*