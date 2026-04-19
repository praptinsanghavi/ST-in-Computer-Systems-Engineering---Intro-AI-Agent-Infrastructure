---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:40Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_roles_delete-binding.html
title: 'akka roles delete-binding :: Akka Documentation'
---

# akka roles delete-binding :: Akka Documentation

## Content

# akka roles delete\-binding

Delete a role binding.

## Synopsis

The command `akka role delete-binding role_binding_id` removes the role binding.

```
akka roles delete-binding ROLE_BINDING_ID [flags]
```

## Options

```
  -h, --help   help for delete-binding
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --owner string        the owner of the project to use, needed if you have two projects with the same name from different owners
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
      --project string      project to use if not using the default configured project
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka roles](akka_roles.html) \- Manage the user roles for an Akka project.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_roles.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_roles_delete-binding.html](https://doc.akka.io/reference/cli/akka-cli/akka_roles_delete-binding.html)*