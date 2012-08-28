package org.molgenis.maven.plugin;

import java.io.File;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.molgenis.Molgenis;

/**
 * MolgenisCleanMojo
 * @goal clean
 */
public class MolgenisCleanMojo extends AbstractMojo
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
			getLog().info("Cleaning generated directory...");
			File outputDir = new File(new Molgenis(propertiesPath).getMolgenisOptions().output_dir);
			Molgenis.deleteContentOfDirectory(outputDir);
		}
		catch (Exception e)
		{
			throw new MojoExecutionException(e.getMessage());
		}
	}
}
