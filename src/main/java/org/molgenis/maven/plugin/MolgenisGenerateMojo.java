package org.molgenis.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.molgenis.Molgenis;

/**
 * MolgenisGenerateMojo
 * @goal generate
 */
public class MolgenisGenerateMojo extends AbstractMojo
{
	/**
	 * The path to the properties file
	 * @parameter
	 */
	private String propertiesPath = "empty";

	public void execute() throws MojoExecutionException
	{
		try
		{
			getLog().info("Starting Molgenis generator...");
			new Molgenis(propertiesPath).generate();
		}
		catch (Exception e)
		{
			throw new MojoExecutionException(e.getMessage());
		}
	}
}
