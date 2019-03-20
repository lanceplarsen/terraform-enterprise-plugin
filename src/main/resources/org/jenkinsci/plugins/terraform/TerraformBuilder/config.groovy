package org.jenkinsci.plugins.terraform.TerraformBuilder;

f = namespace('/lib/form')


f.entry(field: 'task', title: 'Apply Plan') {
    f.checkbox();
}
