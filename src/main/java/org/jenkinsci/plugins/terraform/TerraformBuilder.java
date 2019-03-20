package org.jenkinsci.plugins.terraform;

import java.io.IOException;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.FreeStyleProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import jenkins.tasks.SimpleBuildStep;

public class TerraformBuilder extends Builder implements SimpleBuildStep {
	
    private final String task;
    
    @DataBoundConstructor
    public TerraformBuilder(String task) {
        this.task = task;
    }
 
    public String getTask() {
		return task;
    	
    }
    
    @Override
    public void perform(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws InterruptedException, IOException {
     listener.getLogger().println("Running terraform apply");

    }  
    
    @Extension
    public static class Descriptor extends BuildStepDescriptor<Builder> {
 
        @Override
        public boolean isApplicable(Class<? extends AbstractProject> jobType) {
        	return true;
        }
 
        @Override
        public String getDisplayName() {
            return "Terraform";
        }

    }
    


}
