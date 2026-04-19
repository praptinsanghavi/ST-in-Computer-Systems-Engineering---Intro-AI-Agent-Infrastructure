---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:18:59Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/index.html
title: 'CLI command reference :: Akka Documentation'
---

# CLI command reference :: Akka Documentation

## Content

# CLI command reference

The `akka` command line tool enables you to interact with your Akka projects and services using the command line. See [Install the Akka CLI](../../../operations/cli/installation.html) for information on how to download `akka`. Use [`akka version`](akka_version.html) to check the version.

The following sections list [akka](akka.html) commands and their options.

## Log in to Akka

By default, `akka auth login` will launch your web browser and take you to the proper URL to enter your credentials. The command\-line client will print "Waiting for UI login…​" and pause while this happens, and then resume with a message once it receives the authorization token from the Akka server.

You can, optionally, provide the `--no-launch-browser` flag with the `akka auth` command (e.g. `akka auth login --no-launch-browser auth`), in which case
the command\-line client will simply display the URL you can use for the authorization. This option is helpful if, for some reason, the command\-line client is unable to launch your browser for you. The Akka CLI will wait until you complete the login before continuing.

The [akka auth](akka_auth.html) command offers these options:

- [akka auth container\-registry](akka_auth_container-registry.html)
- [akka auth container\-registry clear\-cached\-token](akka_auth_container-registry_clear-cached-token.html)
- [akka auth container\-registry configure](akka_auth_container-registry_configure.html)
- [akka auth container\-registry credentials](akka_auth_container-registry_credentials.html)
- [akka auth container\-registry install\-helper](akka_auth_container-registry_install-helper.html)
- [akka auth current\-login](akka_auth_current-login.html)
- [akka auth login](akka_auth_login.html)
- [akka auth logout](akka_auth_logout.html)
- [akka auth signup](akka_auth_signup.html)
- [akka auth tokens](akka_auth_tokens.html)
- [akka auth tokens create](akka_auth_tokens_create.html)
- [akka auth tokens list](akka_auth_tokens_list.html)
- [akka auth tokens revoke](akka_auth_tokens_revoke.html)
- [akka auth use\-token](akka_auth_use-token.html)

## Enable auto\-completion for your shell

The [akka completion](akka_completion.html) command generates auto\-completion configuration for common shells. See [Enable command completion](../../../operations/cli/command-completion.html) for more information.

## Use your AI assistant to implement an Akka Service from a specification

The 'akka specify' commands set up Akka projects for AI\-assisted development. Use 'akka specify init' to create a new project with all the resources needed for AI coding agents, including slash commands, templates, and MCP configuration.

- [akka specify init](akka_specify_init.html)

## Initialize a source code project

To start a source code project for a new Akka Service, the `akka code init` command offers an interactive experience to get you started.
Using it, you can select from the samples catalog or create an empty source code project including instructions for your favorite AI
assistant.

- [akka code check](akka_code_check.html)
- [akka code context\-update](akka_code_context-update.html)
- [akka code init](akka_code_init.html)
- [akka code token](akka_code_token.html)

## Manage local context

The `akka config` command is used to display and set configuration contexts and values that apply to subsequent commands. Configuration settings are stored in a file on your local system, by default at `.kalix/config.yaml` in your home directory.

A common use of `config set` command is to establish a specific project as the "current project" by using `akka config set project my-project`.

The following options are available for [akka config](akka_config.html):

- [akka config clear\-cache](akka_config_clear-cache.html)
- [akka config clear](akka_config_clear.html)
- [akka config current\-context](akka_config_current-context.html)
- [akka config delete\-context](akka_config_delete-context.html)
- [akka config get\-organization](akka_config_get-organization.html)
- [akka config get\-project](akka_config_get-project.html)
- [akka config get](akka_config_get.html)
- [akka config list\-contexts](akka_config_list-contexts.html)
- [akka config list](akka_config_list.html)
- [akka config rename\-context](akka_config_rename-context.html)
- [akka config set](akka_config_set.html)
- [akka config use\-context](akka_config_use-context.html)

## Manage the Akka Container Registry

The [akka container\-registry](akka_container-registry.html) commands allow you to manage the Container Registry for your Akka Project.

The [akka container\-registry](akka_container-registry.html) command includes the following options:

- [akka container\-registry delete\-image](akka_container-registry_delete-image.html)
- [akka container\-registry list\-images](akka_container-registry_list-images.html)
- [akka container\-registry list\-tags](akka_container-registry_list-tags.html)
- [akka container\-registry list](akka_container-registry_list.html)
- [akka container\-registry print](akka_container-registry_print.html)
- [akka container\-registry push](akka_container-registry_push.html)

## Manage Docker

The `akka docker` commands allow you to manage Docker credentials so that services can pull images from registries that require authentication.

The following options are available for [akka docker](akka_docker.html):

- [akka docker add\-credentials](akka_docker_add-credentials.html)
- [akka docker list\-credentials](akka_docker_list-credentials.html)
- [akka docker remove\-credentials](akka_docker_remove-credentials.html)

## Online docs

The `akka docs` command opens the Akka online documentation page.

## Display logs

The `akka logs` commands allow you to display the last few lines (default: 100\) of logs for a specific service. The detail are available in [akka logs](akka_logs.html).

## Organizations

The `akka organizations` commands allow you to manage the members within an organization. Projects can be created under an organization, and members of the organization can manage those projects.

The [akka organization](akka_organizations.html) command includes the following options:

- [akka organizations auth](akka_organizations_auth.html)
- [akka organizations auth add](akka_organizations_auth_add.html)
- [akka organizations auth add openid](akka_organizations_auth_add_openid.html)
- [akka organizations auth list](akka_organizations_auth_list.html)
- [akka organizations auth remove](akka_organizations_auth_remove.html)
- [akka organizations auth show](akka_organizations_auth_show.html)
- [akka organizations auth test](akka_organizations_auth_test.html)
- [akka organizations auth update](akka_organizations_auth_update.html)
- [akka organizations auth update openid](akka_organizations_auth_update_openid.html)
- [akka organizations get](akka_organizations_get.html)
- [akka organizations invitations](akka_organizations_invitations.html)
- [akka organizations invitations cancel](akka_organizations_invitations_cancel.html)
- [akka organizations invitations create](akka_organizations_invitations_create.html)
- [akka organizations invitations list](akka_organizations_invitations_list.html)
- [akka organizations list](akka_organizations_list.html)
- [akka organizations users](akka_organizations_users.html)
- [akka organizations users add\-binding](akka_organizations_users_add-binding.html)
- [akka organizations users delete\-binding](akka_organizations_users_delete-binding.html)
- [akka organizations users list\-bindings](akka_organizations_users_list-bindings.html)

## Projects

The `akka projects` commands manipulate the projects in your Akka account. A project contains a set of services.

See also the [akka roles](akka_roles.html#_see_also) commands.

The [akka projects](akka_projects.html) command includes the following options:

- [akka projects apply](akka_projects_apply.html)
- [akka projects config](akka_projects_config.html)
- [akka projects config get](akka_projects_config_get.html)
- [akka projects config get broker](akka_projects_config_get_broker.html)
- [akka projects config set](akka_projects_config_set.html)
- [akka projects config set broker](akka_projects_config_set_broker.html)
- [akka projects config unset](akka_projects_config_unset.html)
- [akka projects config unset broker](akka_projects_config_unset_broker.html)
- [akka projects delete](akka_projects_delete.html)
- [akka projects export](akka_projects_export.html)
- [akka projects get](akka_projects_get.html)
- [akka projects hostnames](akka_projects_hostnames.html)
- [akka projects hostnames add](akka_projects_hostnames_add.html)
- [akka projects hostnames list](akka_projects_hostnames_list.html)
- [akka projects hostnames remove](akka_projects_hostnames_remove.html)
- [akka projects hostnames update](akka_projects_hostnames_update.html)
- [akka projects list](akka_projects_list.html)
- [akka projects new](akka_projects_new.html)
- [akka projects observability](akka_projects_observability.html)
- [akka projects observability add](akka_projects_observability_add.html)
- [akka projects observability add default](akka_projects_observability_add_default.html)
- [akka projects observability add default azure\-monitor](akka_projects_observability_add_default_azure-monitor.html)
- [akka projects observability add default google\-cloud](akka_projects_observability_add_default_google-cloud.html)
- [akka projects observability add default otlp\-http](akka_projects_observability_add_default_otlp-http.html)
- [akka projects observability add default otlp](akka_projects_observability_add_default_otlp.html)
- [akka projects observability add default splunk\-hec](akka_projects_observability_add_default_splunk-hec.html)
- [akka projects observability add logs](akka_projects_observability_add_logs.html)
- [akka projects observability add logs azure\-monitor](akka_projects_observability_add_logs_azure-monitor.html)
- [akka projects observability add logs google\-cloud](akka_projects_observability_add_logs_google-cloud.html)
- [akka projects observability add logs otlp\-http](akka_projects_observability_add_logs_otlp-http.html)
- [akka projects observability add logs otlp](akka_projects_observability_add_logs_otlp.html)
- [akka projects observability add logs splunk\-hec](akka_projects_observability_add_logs_splunk-hec.html)
- [akka projects observability add metrics](akka_projects_observability_add_metrics.html)
- [akka projects observability add metrics azure\-monitor](akka_projects_observability_add_metrics_azure-monitor.html)
- [akka projects observability add metrics google\-cloud](akka_projects_observability_add_metrics_google-cloud.html)
- [akka projects observability add metrics otlp\-http](akka_projects_observability_add_metrics_otlp-http.html)
- [akka projects observability add metrics otlp](akka_projects_observability_add_metrics_otlp.html)
- [akka projects observability add metrics prometheus](akka_projects_observability_add_metrics_prometheus.html)
- [akka projects observability add metrics splunk\-hec](akka_projects_observability_add_metrics_splunk-hec.html)
- [akka projects observability add traces](akka_projects_observability_add_traces.html)
- [akka projects observability add traces azure\-monitor](akka_projects_observability_add_traces_azure-monitor.html)
- [akka projects observability add traces google\-cloud](akka_projects_observability_add_traces_google-cloud.html)
- [akka projects observability add traces otlp\-http](akka_projects_observability_add_traces_otlp-http.html)
- [akka projects observability add traces otlp](akka_projects_observability_add_traces_otlp.html)
- [akka projects observability apply](akka_projects_observability_apply.html)
- [akka projects observability config](akka_projects_observability_config.html)
- [akka projects observability config traces](akka_projects_observability_config_traces.html)
- [akka projects observability edit](akka_projects_observability_edit.html)
- [akka projects observability export](akka_projects_observability_export.html)
- [akka projects observability get](akka_projects_observability_get.html)
- [akka projects observability remove](akka_projects_observability_remove.html)
- [akka projects observability remove default](akka_projects_observability_remove_default.html)
- [akka projects observability remove default azure\-monitor](akka_projects_observability_remove_default_azure-monitor.html)
- [akka projects observability remove default google\-cloud](akka_projects_observability_remove_default_google-cloud.html)
- [akka projects observability remove default otlp\-http](akka_projects_observability_remove_default_otlp-http.html)
- [akka projects observability remove default otlp](akka_projects_observability_remove_default_otlp.html)
- [akka projects observability remove default splunk\-hec](akka_projects_observability_remove_default_splunk-hec.html)
- [akka projects observability remove logs](akka_projects_observability_remove_logs.html)
- [akka projects observability remove logs azure\-monitor](akka_projects_observability_remove_logs_azure-monitor.html)
- [akka projects observability remove logs google\-cloud](akka_projects_observability_remove_logs_google-cloud.html)
- [akka projects observability remove logs otlp\-http](akka_projects_observability_remove_logs_otlp-http.html)
- [akka projects observability remove logs otlp](akka_projects_observability_remove_logs_otlp.html)
- [akka projects observability remove logs splunk\-hec](akka_projects_observability_remove_logs_splunk-hec.html)
- [akka projects observability remove metrics](akka_projects_observability_remove_metrics.html)
- [akka projects observability remove metrics azure\-monitor](akka_projects_observability_remove_metrics_azure-monitor.html)
- [akka projects observability remove metrics google\-cloud](akka_projects_observability_remove_metrics_google-cloud.html)
- [akka projects observability remove metrics otlp\-http](akka_projects_observability_remove_metrics_otlp-http.html)
- [akka projects observability remove metrics otlp](akka_projects_observability_remove_metrics_otlp.html)
- [akka projects observability remove metrics prometheus](akka_projects_observability_remove_metrics_prometheus.html)
- [akka projects observability remove metrics splunk\-hec](akka_projects_observability_remove_metrics_splunk-hec.html)
- [akka projects observability remove traces](akka_projects_observability_remove_traces.html)
- [akka projects observability remove traces azure\-monitor](akka_projects_observability_remove_traces_azure-monitor.html)
- [akka projects observability remove traces google\-cloud](akka_projects_observability_remove_traces_google-cloud.html)
- [akka projects observability remove traces otlp\-http](akka_projects_observability_remove_traces_otlp-http.html)
- [akka projects observability remove traces otlp](akka_projects_observability_remove_traces_otlp.html)
- [akka projects observability set](akka_projects_observability_set.html)
- [akka projects observability set default](akka_projects_observability_set_default.html)
- [akka projects observability set default akka\-console](akka_projects_observability_set_default_akka-console.html)
- [akka projects observability set default azure\-monitor](akka_projects_observability_set_default_azure-monitor.html)
- [akka projects observability set default google\-cloud](akka_projects_observability_set_default_google-cloud.html)
- [akka projects observability set default otlp\-http](akka_projects_observability_set_default_otlp-http.html)
- [akka projects observability set default otlp](akka_projects_observability_set_default_otlp.html)
- [akka projects observability set default splunk\-hec](akka_projects_observability_set_default_splunk-hec.html)
- [akka projects observability set logs](akka_projects_observability_set_logs.html)
- [akka projects observability set logs azure\-monitor](akka_projects_observability_set_logs_azure-monitor.html)
- [akka projects observability set logs google\-cloud](akka_projects_observability_set_logs_google-cloud.html)
- [akka projects observability set logs otlp\-http](akka_projects_observability_set_logs_otlp-http.html)
- [akka projects observability set logs otlp](akka_projects_observability_set_logs_otlp.html)
- [akka projects observability set logs splunk\-hec](akka_projects_observability_set_logs_splunk-hec.html)
- [akka projects observability set metrics](akka_projects_observability_set_metrics.html)
- [akka projects observability set metrics azure\-monitor](akka_projects_observability_set_metrics_azure-monitor.html)
- [akka projects observability set metrics google\-cloud](akka_projects_observability_set_metrics_google-cloud.html)
- [akka projects observability set metrics otlp\-http](akka_projects_observability_set_metrics_otlp-http.html)
- [akka projects observability set metrics otlp](akka_projects_observability_set_metrics_otlp.html)
- [akka projects observability set metrics prometheus](akka_projects_observability_set_metrics_prometheus.html)
- [akka projects observability set metrics splunk\-hec](akka_projects_observability_set_metrics_splunk-hec.html)
- [akka projects observability set traces](akka_projects_observability_set_traces.html)
- [akka projects observability set traces azure\-monitor](akka_projects_observability_set_traces_azure-monitor.html)
- [akka projects observability set traces google\-cloud](akka_projects_observability_set_traces_google-cloud.html)
- [akka projects observability set traces otlp\-http](akka_projects_observability_set_traces_otlp-http.html)
- [akka projects observability set traces otlp](akka_projects_observability_set_traces_otlp.html)
- [akka projects observability unset](akka_projects_observability_unset.html)
- [akka projects observability unset default](akka_projects_observability_unset_default.html)
- [akka projects observability unset logs](akka_projects_observability_unset_logs.html)
- [akka projects observability unset metrics](akka_projects_observability_unset_metrics.html)
- [akka projects observability unset traces](akka_projects_observability_unset_traces.html)
- [akka projects open](akka_projects_open.html)
- [akka projects regions](akka_projects_regions.html)
- [akka projects regions add](akka_projects_regions_add.html)
- [akka projects regions list](akka_projects_regions_list.html)
- [akka projects regions remove](akka_projects_regions_remove.html)
- [akka projects regions set\-primary](akka_projects_regions_set-primary.html)
- [akka projects settings](akka_projects_settings.html)
- [akka projects settings bring\-up\-region](akka_projects_settings_bring-up-region.html)
- [akka projects settings down\-region](akka_projects_settings_down-region.html)
- [akka projects tokens](akka_projects_tokens.html)
- [akka projects tokens create](akka_projects_tokens_create.html)
- [akka projects tokens list](akka_projects_tokens_list.html)
- [akka projects tokens revoke](akka_projects_tokens_revoke.html)
- [akka projects update](akka_projects_update.html)

## Regions

The `akka regions` commands allow you to manage regions on Akka.

See also the [akka project regions](akka_projects_regions.html#_see_also) commands.

The [akka regions](akka_regions.html) command includes the following options:

- [akka regions list](akka_regions_list.html)

## Roles

The `akka roles` commands allow you to associate user roles (authorizations) with the current project.

The [akka roles](akka_roles.html) command provides the following options:

- [akka roles add\-binding](akka_roles_add-binding.html)
- [akka roles delete\-binding](akka_roles_delete-binding.html)
- [akka roles invitations](akka_roles_invitations.html)
- [akka roles invitations delete](akka_roles_invitations_delete.html)
- [akka roles invitations invite\-user](akka_roles_invitations_invite-user.html)
- [akka roles invitations list](akka_roles_invitations_list.html)
- [akka roles list\-bindings](akka_roles_list-bindings.html)
- [akka roles list](akka_roles_list.html)

## Routes

The `akka routes` commands manipulate the routes that can be used to expose services in your Akka Project to the internet.

The [akka routes](akka_routes.html) command includes the following options:

- [akka routes create](akka_routes_create.html)
- [akka routes delete](akka_routes_delete.html)
- [akka routes edit](akka_routes_edit.html)
- [akka routes export](akka_routes_export.html)
- [akka routes get](akka_routes_get.html)
- [akka routes list](akka_routes_list.html)
- [akka routes update](akka_routes_update.html)

## Manage secrets

The `akka secrets` commands manage secrets in your Akka project.

The [akka secret](akka_secrets.html) command includes the following options:

- [akka secrets create](akka_secrets_create.html)
- [akka secrets create asymmetric](akka_secrets_create_asymmetric.html)
- [akka secrets create generic](akka_secrets_create_generic.html)
- [akka secrets create symmetric](akka_secrets_create_symmetric.html)
- [akka secrets create tls\-ca](akka_secrets_create_tls-ca.html)
- [akka secrets create tls](akka_secrets_create_tls.html)
- [akka secrets delete](akka_secrets_delete.html)
- [akka secrets external](akka_secrets_external.html)
- [akka secrets external create](akka_secrets_external_create.html)
- [akka secrets external create aws](akka_secrets_external_create_aws.html)
- [akka secrets external create azure](akka_secrets_external_create_azure.html)
- [akka secrets external create gcp](akka_secrets_external_create_gcp.html)
- [akka secrets external delete](akka_secrets_external_delete.html)
- [akka secrets external get](akka_secrets_external_get.html)
- [akka secrets external info](akka_secrets_external_info.html)
- [akka secrets external list](akka_secrets_external_list.html)
- [akka secrets external update](akka_secrets_external_update.html)
- [akka secrets external update aws](akka_secrets_external_update_aws.html)
- [akka secrets external update azure](akka_secrets_external_update_azure.html)
- [akka secrets external update gcp](akka_secrets_external_update_gcp.html)
- [akka secrets get](akka_secrets_get.html)
- [akka secrets list](akka_secrets_list.html)

## Manage services

The `akka services` commands manipulate the services in your Akka Project.

The [akka services](akka_services.html) command includes the following options:

- [akka services apply](akka_services_apply.html)
- [akka services components](akka_services_components.html)
- [akka services components get\-state](akka_services_components_get-state.html)
- [akka services components get\-workflow](akka_services_components_get-workflow.html)
- [akka services components list\-events](akka_services_components_list-events.html)
- [akka services components list\-ids](akka_services_components_list-ids.html)
- [akka services components list\-interactions](akka_services_components_list-interactions.html)
- [akka services components list\-timers](akka_services_components_list-timers.html)
- [akka services components list](akka_services_components_list.html)
- [akka services connectivity](akka_services_connectivity.html)
- [akka services data](akka_services_data.html)
- [akka services data cancel\-task](akka_services_data_cancel-task.html)
- [akka services data export](akka_services_data_export.html)
- [akka services data get\-task](akka_services_data_get-task.html)
- [akka services data import](akka_services_data_import.html)
- [akka services data list\-tasks](akka_services_data_list-tasks.html)
- [akka services data watch\-task](akka_services_data_watch-task.html)
- [akka services delete](akka_services_delete.html)
- [akka services deploy](akka_services_deploy.html)
- [akka services edit](akka_services_edit.html)
- [akka services export](akka_services_export.html)
- [akka services expose](akka_services_expose.html)
- [akka services get](akka_services_get.html)
- [akka services jwts](akka_services_jwts.html)
- [akka services jwts add](akka_services_jwts_add.html)
- [akka services jwts generate](akka_services_jwts_generate.html)
- [akka services jwts list\-algorithms](akka_services_jwts_list-algorithms.html)
- [akka services jwts list](akka_services_jwts_list.html)
- [akka services jwts remove](akka_services_jwts_remove.html)
- [akka services jwts update](akka_services_jwts_update.html)
- [akka services list](akka_services_list.html)
- [akka services logging](akka_services_logging.html)
- [akka services logging list](akka_services_logging_list.html)
- [akka services logging set\-level](akka_services_logging_set-level.html)
- [akka services logging unset\-level](akka_services_logging_unset-level.html)
- [akka services pause](akka_services_pause.html)
- [akka services proxy](akka_services_proxy.html)
- [akka services remove\-config](akka_services_remove-config.html)
- [akka services restart](akka_services_restart.html)
- [akka services restore](akka_services_restore.html)
- [akka services resume](akka_services_resume.html)
- [akka services set\-config](akka_services_set-config.html)
- [akka services unexpose](akka_services_unexpose.html)
- [akka services views](akka_services_views.html)
- [akka services views describe](akka_services_views_describe.html)
- [akka services views drop](akka_services_views_drop.html)
- [akka services views get\-state](akka_services_views_get-state.html)
- [akka services views list](akka_services_views_list.html)
- [akka services views query](akka_services_views_query.html)

## Configure services

The `akka service-configs` commands allow configuring services.

The [akka service\-configs](akka_service-configs.html) command includes the following options:

- [akka service\-configs create](akka_service-configs_create.html)
- [akka service\-configs delete](akka_service-configs_delete.html)
- [akka service\-configs get](akka_service-configs_get.html)
- [akka service\-configs list](akka_service-configs_list.html)

## Run Akka services locally

The `akka local` commands allow you to run and manage locally running Akka services.

The [akka local](akka_local.html) command includes the following options:

- [akka local cluster](akka_local_cluster.html)
- [akka local console](akka_local_console.html)
- [akka local remote](akka_local_remote.html)
- [akka local remote add](akka_local_remote_add.html)
- [akka local remote list](akka_local_remote_list.html)
- [akka local remote remove](akka_local_remote_remove.html)
- [akka local services](akka_local_services.html)
- [akka local services components](akka_local_services_components.html)
- [akka local services components get\-state](akka_local_services_components_get-state.html)
- [akka local services components get\-workflow](akka_local_services_components_get-workflow.html)
- [akka local services components list\-events](akka_local_services_components_list-events.html)
- [akka local services components list\-ids](akka_local_services_components_list-ids.html)
- [akka local services components list\-interactions](akka_local_services_components_list-interactions.html)
- [akka local services components list\-timers](akka_local_services_components_list-timers.html)
- [akka local services components list](akka_local_services_components_list.html)
- [akka local services connectivity](akka_local_services_connectivity.html)
- [akka local services list](akka_local_services_list.html)
- [akka local services views](akka_local_services_views.html)
- [akka local services views describe](akka_local_services_views_describe.html)
- [akka local services views drop](akka_local_services_views_drop.html)
- [akka local services views get\-state](akka_local_services_views_get-state.html)
- [akka local services views list](akka_local_services_views_list.html)
- [akka local services views query](akka_local_services_views_query.html)
- [akka local start](akka_local_start.html)
- [akka local status](akka_local_status.html)
- [akka local stop](akka_local_stop.html)

## Display version

The `akka version` commands allow you to display the CLI version. The detail are available in [akka version](akka_version.html).

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/command-completion.html
- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_clear-cached-token.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_configure.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_credentials.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_install-helper.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_current-login.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_login.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_logout.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_signup.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens_create.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens_list.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens_revoke.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_use-token.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_check.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_context-update.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_init.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_token.html
- https://doc.akka.io/reference/cli/akka-cli/akka_completion.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_clear-cache.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_clear.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_current-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_delete-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_get-organization.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_get-project.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_get.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_list-contexts.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_list.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_rename-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_set.html
- https://doc.akka.io/reference/cli/akka-cli/akka_config_use-context.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_delete-image.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_list-images.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_list-tags.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_list.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_print.html
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_push.html
- https://doc.akka.io/reference/cli/akka-cli/akka_docker.html
- https://doc.akka.io/reference/cli/akka-cli/akka_docker_add-credentials.html
- https://doc.akka.io/reference/cli/akka-cli/akka_docker_list-credentials.html
- https://doc.akka.io/reference/cli/akka-cli/akka_docker_remove-credentials.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_cluster.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_console.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/index.html](https://doc.akka.io/reference/cli/akka-cli/index.html)*