molgenis_maven_plugin
=====================
The molgenis maven plugin allows you to use the molgenis generator as a plugin
inside a maven based project.

Goals overview
--------------

molgenis:clean deletes everything in the generated folder to ensure a clean generation process
molgenis:generate starts the molgenis generator using your configuration

Usage
-----

Add the following lines to your pom.xml

	<plugin>
		<groupId>org.molgenis</groupId>
		<artifactId>molgenis-maven-plugin</artifactId>
		<version>1.0</version>
		<configuration>
			<propertiesPath>path/to/my/configuration/file.properties</propertiesPath>
		</configuration>
	</plugin>

Upon changes in your model you can start the generator before compilation

	mvn clean molgenis:clean molgenis:generate compile

Tadaa!
