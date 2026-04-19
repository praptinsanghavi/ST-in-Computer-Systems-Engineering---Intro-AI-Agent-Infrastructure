---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:42Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/projects/manage-project-access.html
title: 'Managing project users :: Akka Documentation'
---

# Managing project users :: Akka Documentation

## Content

# Managing project users

Access to projects is controlled by assigning specific roles to users. The available roles are: **admin**, **developer**, **viewer** and **backoffice**.

| Permission: | admin | developer | viewer | backoffice |
| --- | --- | --- | --- | --- |
| View project | ✅ | ✅ | ✅ | ✅ |
| Admin project | ✅ | ❌ | ❌ | ❌ |
| View services | ✅ | ✅ | ✅ | ❌ |
| Deploy services | ✅ | ✅ | ❌ | ❌ |
| Update services | ✅ | ✅ | ❌ | ❌ |
| Delete services | ✅ | ✅ | ❌ | ❌ |
| View routes | ✅ | ✅ | ✅ | ❌ |
| Manage routes | ✅ | ✅ | ❌ | ❌ |
| View secrets | ✅ | ✅ | ✅ | ❌ |
| Manage secrets | ✅ | ✅ | ❌ | ❌ |
| Backoffice functions | ✅ | ❌ | ❌ | ✅ |

**Backoffice functions** include the ability to:

- View entity event logs and values directly
- Invoke methods on services, even if not exposed to the internet or protected by ACLs
- Manage projections

|  | Organization membership is managed separately, see [Managing organization users](../organizations/manage-users.html). |
| --- | --- |

## Listing role bindings

To list the role bindings in a project, use the following command:

```
akka roles list-bindings
```

Example output:

```
ROLE BINDING ID                        ROLE        PRINCIPAL                                MFA
f3e1ad17-d7be-4432-9ab6-edd475c3aa44   admin       John Smith <[[email protected]](/cdn-cgi/l/email-protection)>      true
311e3752-30f9-43f4-99ef-6cbb4c5f14f3   developer   Jane Citizen <[[email protected]](/cdn-cgi/l/email-protection)>  true
```

|  | The Akka CLI can keep a project as context, so you do not need to pass the `--project` flag.     ``` akka config set project <project name> ``` |
| --- | --- |

## Granting a role

|  | When using *OpenID Connect* (OIDC), see [OIDC setup](../../reference/security/oidc-setup.html#assigning_project_level_roles). |
| --- | --- |

You can grant a project role to a user in two ways:

### 1\. Invite a user to the project by e\-mail

Invite a user to join the project and assign them a role by using the following command:

```
akka roles invitations invite-user <email address> --role <role>
```

The user will receive an email inviting them to join the project. Upon acceptance, the role binding will be created.

### 2\. Add a role directly

If the user is already a member of the project, or the project is part of an organization and the user belongs to that organization, you can assign roles directly without sending an invitation.

- By e\-mail:

```
akka roles add-binding --email <email address> --role <role>
```
- By username:

```
akka roles add-binding --username <username> --role <role>
```

## Deleting a project role bindings

To delete a role binding, first list the role bindings to obtain the **role binding ID**.

```
akka roles list-bindings
```

Example output:

```
ROLE BINDING ID                        ROLE        PRINCIPAL                                MFA
f3e1ad17-d7be-4432-9ab6-edd475c3aa44   admin       John Smith <[[email protected]](/cdn-cgi/l/email-protection)>      true
311e3752-30f9-43f4-99ef-6cbb4c5f14f3   developer   Jane Citizen <[[email protected]](/cdn-cgi/l/email-protection)>  true
```

Pass the **role binding ID** to the following command:

```
akka roles delete-binding <role binding id>
```

## Managing invitations

To view outstanding invitations, use the following command:

```
akka roles invitations list
```

Example output:

```
EMAIL                      ROLE
[[email protected]](/cdn-cgi/l/email-protection)   admin
```

Invitations will automatically expire after 7 days. You can manually delete an invitation with the following command:

```
akka roles invitations delete <email address>
```

To resend an invitation, first delete the expired invitation and then issue a new one.

## See also

- [Managing organization users](../organizations/manage-users.html)
- [`akka roles` commands](../../reference/cli/akka-cli/akka_roles.html#_see_also)

## Code Examples

### Example 1: Listing role bindings

```command
akka roles list-bindings
```

### Example 2: Listing role bindings

```none
ROLE BINDING ID                        ROLE        PRINCIPAL                                MFA
f3e1ad17-d7be-4432-9ab6-edd475c3aa44   admin       John Smith <[email protected]>      true
311e3752-30f9-43f4-99ef-6cbb4c5f14f3   developer   Jane Citizen <[email protected]>  true
```

### Example 3: Listing role bindings

```command
akka config set project <project name>
```

### Example 4: 1. Invite a user to the project by e-mail

```command
akka roles invitations invite-user <email address> --role <role>
```

### Example 5: 2. Add a role directly

```command
akka roles add-binding --email <email address> --role <role>
```

### Example 6: 2. Add a role directly

```command
akka roles add-binding --username <username> --role <role>
```

### Example 7: Deleting a project role bindings

```command
akka roles list-bindings
```

### Example 8: Deleting a project role bindings

```none
ROLE BINDING ID                        ROLE        PRINCIPAL                                MFA
f3e1ad17-d7be-4432-9ab6-edd475c3aa44   admin       John Smith <[email protected]>      true
311e3752-30f9-43f4-99ef-6cbb4c5f14f3   developer   Jane Citizen <[email protected]>  true
```

### Example 9: Deleting a project role bindings

```command
akka roles delete-binding <role binding id>
```

### Example 10: Managing invitations

```command
akka roles invitations list
```

### Example 11: Managing invitations

```none
EMAIL                      ROLE
[email protected]   admin
```

### Example 12: Managing invitations

```command
akka roles invitations delete <email address>
```

## Related Pages (Internal Links)

- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/operations/organizations/manage-users.html
- https://doc.akka.io/reference/cli/akka-cli/akka_roles.html
- https://doc.akka.io/reference/security/oidc-setup.html

---
*Source: [https://doc.akka.io/operations/projects/manage-project-access.html](https://doc.akka.io/operations/projects/manage-project-access.html)*